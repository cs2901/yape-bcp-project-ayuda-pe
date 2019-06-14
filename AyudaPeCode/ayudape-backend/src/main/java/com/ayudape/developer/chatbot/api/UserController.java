package com.ayudape.developer.chatbot.api;

import com.ayudape.developer.chatbot.model.User;
import com.ayudape.developer.chatbot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    private UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public boolean save() {
        User user = new User("Reynaldo", "Rojas","999999999");
        return userService.save(user);
    }

    @RequestMapping(value = "/phoneTest",method = RequestMethod.GET)
    public User phoneTest() {
        User user = userService.getFromPhone("999999999");
        System.out.println("User :");
        System.out.println(user.getPhone());
        System.out.println(user.getFirstName());
        return user;
    }


    @PostMapping(
            value = "/phone",
            consumes = "application/json",
            produces = "application/json")
    public User find(@RequestBody User user) {
        return userService.getFromPhone(user.getPhone());
    }


    @PostMapping(
            value = "/users",
            consumes = "application/json",
            produces = "application/json")
    public User create(@RequestBody User user) {
        this.userService.save(user);
        return user;
    }
}
