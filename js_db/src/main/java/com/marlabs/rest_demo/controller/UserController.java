package com.marlabs.rest_demo.controller;

import com.marlabs.rest_demo.entity.User;
import com.marlabs.rest_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        User newUser = userService.saveUser(user);
        return newUser;
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        List<User> users = userService.getAllUser();
        return users;
    }
}
