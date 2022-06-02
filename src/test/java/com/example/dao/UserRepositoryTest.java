package com.example.dao;

import com.example.Application;
import com.example.dao.entity.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import utils.TestUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ContextConfiguration(classes = Application.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    private List<User> userList;
    private User user;

    @BeforeEach
    void setUp() {
        userList = TestUtils.getUsers();
        user = userList.get(0);
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }
}