package com.ayudape.developer.chatbot.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDao {

    @Autowired
    private SessionFactory sessionFactory;

    public MessageDao() {}

}
