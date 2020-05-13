package com.iibm.emart.microservicecloudauth;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iibm.emart.entity.User;
import com.iibm.emart.repository.UserRepository;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class MicroserviceCloudAuthApplicationTests {

    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void test() throws Exception {
    	int userCount = userRepository.getAllUsers().intValue();
    	User user = new User();
    	user.setUsername("test");
    	user.setPassword("2123");
    	user.setUserRole("1");
        userRepository.create(user);
        Assert.assertEquals(userCount+1, userRepository.getAllUsers().intValue());
    }

}
