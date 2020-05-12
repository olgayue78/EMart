package com.iibm.emart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iibm.emart.entity.User;
import com.iibm.emart.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    
    public boolean login(String username,String password,String userRole) {
    	int userCount = userRepository.getUserByName(username,password, userRole);
    	if(userCount>0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean signup(User user) {
    	if(userRepository.create(user)>0) {
    		return true;
    	} else {
    		return false;
    	}
    	
    }
}
