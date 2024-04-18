package com.ecommarce.productservice.service;

import com.ecommarce.productservice.models.User;
import com.ecommarce.productservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public User createUser(String name, String email) {

        User user = new User();
        user.setName(name);
        user.setEmail(email);

        userRepository.save(user);
        return user;

    }
}
