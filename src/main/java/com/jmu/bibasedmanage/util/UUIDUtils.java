package com.jmu.bibasedmanage.util;

import java.util.UUID;

/**
 * 生成唯一id的工具类
 * Created by ljc on 2017/12/19.
 */
public class UUIDUtils {
    public UUIDUtils() {
    }

    /**
     * 获得一个UUID
     * @return
     */
    public static String generator(){
        String s = UUID.randomUUID().toString();
        //去掉“-”符号
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
    public static String[] generator(int number){
        if(number < 1){
            return null;
        }
        String[] ss = new String[number];
        for(int i=0;i<number;i++){
            ss[i] = generator();
        }
        return ss;
    }
}
