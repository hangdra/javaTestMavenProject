package com.hangdra.lombok;


//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import org.junit.Test;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author hang.liu
 * @date Created in 2021.5.11
 */
//    @SpringBootApplication

public class MainClass {
    public static void main(String[] a){
        UserTest();
    }
    @Test
    public static void UserTest() {
        String salt = IdUtil.fastSimpleUUID();
        User testSave3 = User.builder().name("testSave3").password(SecureUtil.md5("123456" + salt)).salt(salt).email("testSave3@xkcoding.com").phoneNumber("17300000003").status(1).build();
        System.out.println(testSave3);

    }
}
