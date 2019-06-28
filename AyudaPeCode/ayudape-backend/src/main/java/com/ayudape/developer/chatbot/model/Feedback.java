package com.ayudape.developer.chatbot.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="nonAnsweredQuestions")
public class Feedback {
    @Id
    @GeneratedValue
    private UUID uuid;

    @Column(name = "question", nullable=false)
    private String question;

    public Feedback(String question)
    {
        this.question = question;
    }

    public String getQuestion(){return question;}
}
