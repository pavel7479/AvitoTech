package com.example.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 *   Класс-сущность для работы с сообщениями
 */
@Entity
public class Message implements Comparable<Message>{
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Ссылка на идентификатор чата, в который было отправлено сообщение
     */
    @OneToOne
    @JoinColumn(name = "CHAT_ID", referencedColumnName = "id")
    private Chat chat;

    /**
     * Ссылка на идентификатор отправителя сообщения, отношение многие-к-одному
     */
    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    @JsonIgnore
    private User author;

    /**
     * Текст отправленного сообщения
     */
    private String text;

    /**
     * Дата создания
     */
    private Date created_at;

    public Message() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", chat=" + chat +
                ", author=" + author +
                ", text='" + text + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(chat, message.chat) &&
                Objects.equals(author, message.author) &&
                Objects.equals(text, message.text) &&
                Objects.equals(created_at, message.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chat, author, text, created_at);
    }

    @Override
    public int compareTo(Message o) {
        return (int) (this.getCreated_at().getTime() - o.getCreated_at().getTime());
    }
}
