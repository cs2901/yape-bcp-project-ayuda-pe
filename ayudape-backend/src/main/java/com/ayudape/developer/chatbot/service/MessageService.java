package com.ayudape.developer.chatbot.service;

import com.ayudape.developer.chatbot.dao.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageDao messageDao;

    @Autowired
    private MessageService(MessageDao messageDao) { this.messageDao = messageDao; }
}
