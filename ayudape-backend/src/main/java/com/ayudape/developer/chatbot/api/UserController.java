package com.ayudape.developer.chatbot.api;

import com.ayudape.developer.chatbot.model.User;
import com.ayudape.developer.chatbot.service.UserService;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void create(User user) {
        userService.create(user);
    }
}
