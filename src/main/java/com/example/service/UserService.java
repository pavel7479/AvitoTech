package com.example.service;

import com.example.dao.entity.User;

/**
 * Сервис для работы с пользователем
 */
public interface UserService {

    /**
     * Создать нового польователя
     * @param user
     * @return id
     */
    Long create(User user);
}
