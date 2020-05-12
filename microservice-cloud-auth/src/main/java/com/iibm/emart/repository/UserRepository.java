package com.iibm.emart.repository;

import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.User;

@Repository
public interface UserRepository {
	Integer create(User user);
    Integer getAllUsers();
    Integer getUserByName(String email, String password, String userRole);
}