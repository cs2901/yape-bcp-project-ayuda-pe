package com.ayudape.developer.chatbot.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;

    @GeneratedValue
    private final UUID uuid;

    private final String firstName;
    private final String lastName;


    private final String account;

    public User(){

    }

    public User(String firstName, String lastName, String account) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public UUID getId() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
