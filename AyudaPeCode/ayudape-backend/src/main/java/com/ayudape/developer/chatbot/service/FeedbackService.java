package com.ayudape.developer.chatbot.service;

import com.ayudape.developer.chatbot.dao.FeedbackDao;
import com.ayudape.developer.chatbot.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FeedbackService {
    private final FeedbackDao feedbackDao;

    @Autowired
    private FeedbackService(FeedbackDao feedbackDao) { this.feedbackDao = feedbackDao; }

    public boolean save(Feedback feedback) {
        return feedbackDao.save(feedback);
    }

    public List<Feedback> getAll() { return feedbackDao.getAll(); }

}
