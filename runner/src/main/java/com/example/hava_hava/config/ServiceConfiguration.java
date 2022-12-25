package com.example.hava_hava.config;

import com.example.hava_hava.mapper.UserMapper;
import com.example.hava_hava.mapper.UserMapperImpl;
import com.example.hava_hava.repository.UserRepository;
import com.example.hava_hava.service.UserService;
import com.example.hava_hava.service.impl.UserServiceImpl;
import org.apache.catalina.mapper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServiceConfiguration {

    @Bean
    public UserMapper userMapper() {
        return new UserMapperImpl();
    }

    @Bean
    public UserService userService(
            UserMapper userMapper,
            UserRepository userRepository
    ) {
        return new UserServiceImpl(userMapper, userRepository);
    }
}
