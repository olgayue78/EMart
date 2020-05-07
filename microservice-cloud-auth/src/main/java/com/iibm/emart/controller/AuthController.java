package com.iibm.emart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iibm.emart.models.User;
import com.iibm.emart.utils.JWT;
import com.iibm.emart.utils.ResponseData;

@RestController
public class AuthController {

    @GetMapping("/login/{username}")
    @ResponseBody
	public ResponseData login(@PathVariable String username, @PathVariable String password) {
		if ("imjack".equals(username)) {
			ResponseData responseData = ResponseData.ok();;
			User user = new User();
			user.setId(1);
			user.setUsername(username);
			user.setPassword(password);
			responseData.putDataValue("user", user);
			String token = JWT.sign(user, 30L * 24L * 3600L * 1000L);
			if (token != null) {
				responseData.putDataValue("token", token);
			}
			return responseData;
		}
		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
    }
}