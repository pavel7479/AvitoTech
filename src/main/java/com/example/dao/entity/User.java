package com.example.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Класс-сущность пользователя
 */

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    /**
     * ФИО пользователя
     */
    @Column(unique = true)
    private String username;

    /**
     * Дата создания
     */
    private Date created_at;

    @ManyToMany(mappedBy = "users", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Chat> chats = new HashSet<>();

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private Set<Message> messages = new HashSet<>();

    public User() { }

    public User(String id) { this.id = Long.valueOf(id); }

    public User(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Set<Chat> getChats() {
        return chats;
    }

    public void setChats(Set<Chat> chats) {
        this.chats = chats;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", created_at=" + created_at +
                '}';
    }

}
