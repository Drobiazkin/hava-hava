package com.example.hava_hava.repository;

import com.example.hava_hava.repository.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, UUID> {
}
