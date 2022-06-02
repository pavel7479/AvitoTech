package com.example.web.controller;

import com.example.dao.entity.Chat;
import com.example.dao.entity.User;
import com.example.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class ChatController {
    @Autowired
    ChatService chatService;

    /**
     * Добавить новый чат
     * @param chat
     * @return id
     */
    @PostMapping(value = "/chats/add")
    public @ResponseBody
    Long createChat(@RequestBody Chat chat) {
        return chatService.create(chat);
    }

    /**
     * Все поля сущности-чата, отсортированные по дате создания
     * @param user
     * @return
     */
    @PostMapping(value = "/chats/get")
    public @ResponseBody
    Set<Chat> getChats(@RequestBody User user) {
        return chatService.getChats(user);
    }
}
