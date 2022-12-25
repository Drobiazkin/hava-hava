package com.example.hava_hava.service;

import org.openapi.example.model.User;
import org.openapi.example.model.UserCreate;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    /**
     * Получение user по id
     *
     * @param user модель юзера
     * @return USER
     */

    User createUser(UserCreate user);

    User getUser(String id);

}
