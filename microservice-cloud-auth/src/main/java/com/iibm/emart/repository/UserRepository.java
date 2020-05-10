package com.iibm.emart.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    void create(String name, Integer age);
    void deleteByName(String name);
    Integer getAllUsers();
    void deleteAllUsers();
    Integer getUserByName(String userName, String password, String userRole);
}