package com.example.dao;

import com.example.dao.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Репозиторий для работы с пользователями
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
