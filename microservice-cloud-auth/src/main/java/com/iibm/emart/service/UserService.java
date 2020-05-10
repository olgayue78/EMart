package com.iibm.emart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iibm.emart.entity.User;
import com.iibm.emart.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    
    public boolean login(User user) {
    	int userCount = userRepository.getUserByName(user.getUsername(),user.getPassword(), user.getUserRole());
    	if(userCount>0) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
