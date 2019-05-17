package com.ayudape.developer.chatbot.service;

import com.ayudape.developer.chatbot.dao.UserDao;
import com.ayudape.developer.chatbot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean save(User user) {
        return userDao.save(user);
    }

}
