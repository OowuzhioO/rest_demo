package com.marlabs.rest_demo.serviceImp;

import com.marlabs.rest_demo.entity.User;
import com.marlabs.rest_demo.repo.UserRepo;
import com.marlabs.rest_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
