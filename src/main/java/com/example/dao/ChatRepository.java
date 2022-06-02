package com.example.dao;

import com.example.dao.entity.Chat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с чатом
 */
@Repository
public interface ChatRepository extends CrudRepository<Chat, Long> {
}
