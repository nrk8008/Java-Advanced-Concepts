package com.ecommarce.productservice.controllers;

import com.ecommarce.productservice.dtos.CreateUserDto;
import com.ecommarce.productservice.models.User;
import com.ecommarce.productservice.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User createUser(@RequestBody CreateUserDto createUserDto) {
        return userService.createUser(createUserDto.getName(), createUserDto.getEmail());
    }

}
