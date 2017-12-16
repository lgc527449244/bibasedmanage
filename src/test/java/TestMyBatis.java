import com.alibaba.fastjson.JSON;
import com.jmu.bibasedmanage.pojo.User;
import com.jmu.bibasedmanage.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ljc on 2017/12/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    Logger logger = LogManager.getLogger("mylog");
    @Autowired
    private UserService userService;
    @Test
    public void test1() {
        User user = userService.getById(1);
        logger.info(JSON.toJSONString(user));
    }
}
