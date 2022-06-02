package com.example.web.controller;

import com.example.dao.entity.Chat;
import com.example.dao.entity.Message;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class MessageController {
    @Autowired
    MessageService messageService;

    /**
     * Добаавить новое сообщение
     * @param message
     * @return id сообщения
     */
    @PostMapping(value = "/messages/add")
    public @ResponseBody
    Long create(@RequestBody Message message) {
        return messageService.create(message);
    }


    @PostMapping(value = "/messages/get")
    public @ResponseBody
    Set<Message> getMessages(@RequestBody Chat chat) {
        return messageService.getMessages(chat);
    }
}
