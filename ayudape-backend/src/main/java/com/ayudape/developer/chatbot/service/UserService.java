package com.ayudape.developer.chatbot.service;

import com.ayudape.developer.chatbot.dao.UserDao;
import com.ayudape.developer.chatbot.model.User;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int create(User user) {
        return userDao.create(user);
    }

}
