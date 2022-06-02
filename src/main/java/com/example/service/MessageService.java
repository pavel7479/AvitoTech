package com.example.service;

import com.example.dao.entity.Chat;
import com.example.dao.entity.Message;

import java.util.Set;

/**
 * Сервис для работы с сообщениями
 */
public interface MessageService {
    /**
     * Создает новое сообщение пользователя
     * @param message
     * @return id
     */
    Long create(Message message);

    /**
     * Получение списка сообщений в чате
     * @param chat
     * @return сообщения
     */
    Set<Message> getMessages(Chat chat);
}
