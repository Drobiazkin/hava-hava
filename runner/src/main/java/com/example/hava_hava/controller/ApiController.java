package com.example.hava_hava.controller;

import com.example.hava_hava.service.UserService;
import io.swagger.annotations.Api;
import org.openapi.example.api.UserApi;
import org.openapi.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@Api(value = "Hava-hava")
public class ApiController implements UserApi {
    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<User> getByUser(String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(id));
    }
}
