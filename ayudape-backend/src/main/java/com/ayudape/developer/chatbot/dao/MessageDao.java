package com.ayudape.developer.chatbot.dao;

import com.ayudape.developer.chatbot.model.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MessageDao implements Dao<Message> {

    @Autowired
    private SessionFactory sessionFactory;

    public MessageDao() {}

    @Override
    public Optional<Message> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Message> getAll() {
        return null;
    }

    @Override
    public boolean save(Message message) {
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.persist(message);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Message message, String[] params) {
        return false;
    }

    @Override
    public boolean delete(Message message) {
        return false;
    }

}
