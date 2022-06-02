package com.example.service.impl;

import com.example.dao.ChatRepository;
import com.example.dao.UserRepository;
import com.example.dao.entity.Chat;
import com.example.dao.entity.User;
import com.example.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Long create(Chat chat) {
        chat.setCreated_at(new Date());
        return chatRepository.save(chat).getId();
    }

    @Override
    public Set<Chat> getChats(User user) {
        return new TreeSet<Chat>(userRepository.findById(user.getId())
                .get().getChats());
    }
}
