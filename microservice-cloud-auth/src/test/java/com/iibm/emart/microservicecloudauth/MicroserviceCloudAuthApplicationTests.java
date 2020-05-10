package com.iibm.emart.microservicecloudauth;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iibm.emart.repository.UserRepository;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class MicroserviceCloudAuthApplicationTests {

    @Autowired
    private UserRepository userRepository;
    
//
//    @Before(value = "")
//    public void setUp() {
//        userRepository.deleteAllUsers();
//        System.out.println("清空user表");
//    }

    @Test
    public void test() throws Exception {
//        System.out.println("插入5个用户");
//        userRepository.create("a", 1);
//        userRepository.create("b", 2);
//        userRepository.create("c", 3);
//        userRepository.create("d", 4);
//        userRepository.create("e", 5);
        // 查数据库，应该有5个用户
        Assert.assertEquals(3, userRepository.getAllUsers().intValue());
//        // 删除两个用户
//        userRepository.deleteByName("a");
//        userRepository.deleteByName("e");
//        // 查数据库，应该有5个用户
//        Assert.assertEquals(3, userRepository.getAllUsers().intValue());
    }

}
