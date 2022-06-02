package com.example.service.impl;

import com.example.dao.ChatRepository;
import com.example.dao.MessageRepository;
import com.example.dao.entity.Chat;
import com.example.dao.entity.Message;
import com.example.dao.entity.User;
import com.example.dao.exception.DaoException;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    @Autowired
    ChatRepository chatRepository;

    @Override
    public Long create(Message message) {
        Chat chat = chatRepository.findById(message.getChat().getId()).get();

        Set<User> userSet = chat.getUsers();

        long count = userSet.stream()
                .filter(x -> x.getId().equals(message.getAuthor().getId()))
                .count();

        if (count > 0) {
            message.setCreated_at(new Date());
            return messageRepository.save(message).getId();
        }
        else
            throw new DaoException();
    }

    @Override
    public Set<Message> getMessages(Chat chat) {
        Set<Message> messages = new TreeSet<>();
        messageRepository.findAll().forEach((x) -> {
            if (x.getChat().getId() == chat.getId()) {
                messages.add(x);
            }
        });
        return messages;
    }
}
