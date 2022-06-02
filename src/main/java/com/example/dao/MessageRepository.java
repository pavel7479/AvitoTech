package com.example.dao;

import com.example.dao.entity.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с сообщениями
 */
@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
}
