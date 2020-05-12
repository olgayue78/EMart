package com.iibm.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iibm.emart.entity.User;
import com.iibm.emart.service.UserService;
import com.iibm.emart.utils.JWT;
import com.iibm.emart.utils.ResponseData;

@RestController
public class AuthController {
	
	@Autowired
    private UserService userService;
    
    @GetMapping("/login")
    @ResponseBody
	public ResponseData login( @RequestParam(value="username",required =false ) String username,@RequestParam(value="password",required =false ) String password,@RequestParam(value="userRole",required =false ) String userRole) {
        try {
    		if (userService.login(username, password, userRole)) {
    			ResponseData responseData = ResponseData.ok();
    			responseData.putDataValue("username", username);
    			String token = JWT.sign(username, 30L * 24L * 3600L * 1000L);
    			if (token != null) {
    				responseData.putDataValue("token", token);
    			}
    			return responseData;
    		}
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
        } catch(Exception e) {
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
        }
    } 
    
    @PostMapping("/signup")
    @ResponseBody
	public ResponseData signup( @RequestBody User user) {
    	try {
        	if (userService.signup(user)) {
        		ResponseData responseData = ResponseData.ok();
    			responseData.putDataValue("user", user);
    			return responseData;
        	} else {
        		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "error in create user" });
        	}
    		
    	}catch(Exception e) {
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "error in create user" });
    	}
    }
}