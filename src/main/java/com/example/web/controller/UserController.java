package com.example.web.controller;

import com.example.dao.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * Добавить нового пользователя
     * @param user
     * @return id
     */
    @PostMapping(value = "/users/add")
    public @ResponseBody
    Long createUser(@RequestBody User user) {
        return userService.create(user);
    }
}
