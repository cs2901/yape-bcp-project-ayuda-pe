package com.ayudape.developer.chatbot.dao;

import com.ayudape.developer.chatbot.model.Feedback;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class FeedbackDao implements Dao<Feedback> {
    @Autowired
    private SessionFactory sessionFactory;

    public FeedbackDao() {
        //default constructor
    }

    @Override
    public Optional<Feedback> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Feedback> getAll() {
        return Collections.emptyList();
    }

    @Override
    public boolean save(Feedback feedback) {
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.persist(feedback);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Feedback feedback, String[] params) {
        return false;
    }

    @Override
    public boolean delete(Feedback feedback) {
        return false;
    }
}
