package com.example.hava_hava.mapper;

import com.example.hava_hava.repository.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.openapi.example.model.User;

@Mapper
public interface UserMapper {
    @Mapping(target = "id", expression = "java(userEntity.getId() == null ? null : userEntity.getId().toString())")
    User toUser(UserEntity userEntity);
}
