package com.marlabs.rest_demo.service;

import com.marlabs.rest_demo.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUser();
}
