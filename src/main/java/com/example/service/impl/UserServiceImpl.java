package com.example.service.impl;

import com.example.dao.UserRepository;
import com.example.dao.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Long create(User user) {
        user.setCreated_at(new Date());
        return userRepository.save(user).getId();
    }
}
