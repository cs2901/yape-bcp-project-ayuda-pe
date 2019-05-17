package com.ayudape.developer.chatbot.api;

import com.ayudape.developer.chatbot.model.User;
import com.ayudape.developer.chatbot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping("/save")
    public boolean save() {
        User user = new User("Reynaldo", "Rojas");
        return userService.save(user);
    }
}
