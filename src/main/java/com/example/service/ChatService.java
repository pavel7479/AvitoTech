package com.example.service;

import com.example.dao.entity.Chat;
import com.example.dao.entity.User;

import java.util.Set;

/**
 * Сервис для работы с чатом
 */
public interface ChatService {

    /**
     * Создает новый чат между пользователями
     * @param chat
     * @return id
     */
    Long create(Chat chat);

    /**
     * Получение всех чатов польователя
     * @param user
     * @return список часто со всеми параметрами
     */
    Set<Chat> getChats(User user);
}
