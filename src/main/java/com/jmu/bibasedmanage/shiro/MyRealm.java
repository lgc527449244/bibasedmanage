package com.jmu.bibasedmanage.shiro;

import com.jmu.bibasedmanage.pojo.BmOperation;
import com.jmu.bibasedmanage.pojo.BmRole;
import com.jmu.bibasedmanage.pojo.BmUser;
import com.jmu.bibasedmanage.service.OperationService;
import com.jmu.bibasedmanage.service.RoleService;
import com.jmu.bibasedmanage.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created by ljc on 2017/12/25.
 */
public class MyRealm extends AuthorizingRealm{

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private OperationService operationService;

    /**
     * 授权:
     *
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Object principal = principalCollection.getPrimaryPrincipal();//获取登录的用户名
        //TODO 待改进 将user和role组成一个vo
        BmUser user = userService.selectByLoginName((String) principal);
        BmRole role = roleService.selectById(user.getRoleId());
        info.addRole(role.getName());
        List<BmOperation> bmOperations = operationService.getOperationByRoleId(user.getRoleId());
        for (BmOperation operation : bmOperations) {
            info.addStringPermission(operation.getName());
        }
        return info;
    }

    /**
     * 用户验证
     *
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String password = "";
        //1. token 中获取登录的 username! 注意不需要获取password.
        Object principal = token.getPrincipal();
        //2. 利用 username 查询数据库得到用户的信息.
        BmUser user = userService.selectByLoginName((String) principal);
        //3.设置盐值 ，（加密的调料，让加密出来的东西更具安全性，一般是通过数据库查询出来的。
        // 简单的说，就是把密码根据特定的东西而进行动态加密，如果别人不知道你的盐值，就解不出你的密码）
        String source = user.getSalt();
        ByteSource credentialsSalt = new Md5Hash(source);

        //当前 Realm 的name
        String realmName = getName();

        if(user != null){
            password = user.getLoginPassword();
        }
        String credentials = password;
        //返回值实例化
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                principal, credentials, credentialsSalt, realmName);

        return info;
    }
    //init-method 配置.
    public void setCredentialMatcher(){
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("MD5");//MD5算法加密
        credentialsMatcher.setHashIterations(1024);//1024次循环加密
        setCredentialsMatcher(credentialsMatcher);
    }
    //用来测试的算出密码password盐值加密后的结果，下面方法用于新增用户添加到数据库操作的，我这里就直接用main获得，直接数据库添加了，省时间
    public static void main(String[] args) {
        String saltSource = "abcdef";
        String hashAlgorithmName = "MD5";
        String credentials = "password";
        Object salt = new Md5Hash(saltSource);
        int hashIterations = 1024;
        Object result = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
        System.out.println(result);
    }
}
