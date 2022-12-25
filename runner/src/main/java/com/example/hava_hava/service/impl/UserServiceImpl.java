package com.example.hava_hava.service.impl;

import com.example.hava_hava.mapper.UserMapper;
import com.example.hava_hava.repository.UserRepository;
import com.example.hava_hava.service.UserService;
import org.openapi.example.model.User;
import org.openapi.example.model.UserCreate;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserCreate user) {
        return null;
    }

    @Override
    public User getUser(String id) {
        var user = userRepository.findById(UUID.fromString(id)).orElseThrow(RuntimeException::new);
        return userMapper.toUser(user);
    }
}
