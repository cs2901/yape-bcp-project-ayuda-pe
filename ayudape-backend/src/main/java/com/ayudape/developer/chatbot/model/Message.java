package com.ayudape.developer.chatbot.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="messages")
public class Message {
    @Id
    @GeneratedValue
    private UUID uuid;

    @Column(name = "text", nullable=false)
    private String text;
    @Column(name = "sender", nullable=false)
    private Boolean sender;
    @Column(name = "image")
    private String image;

    public Message(){}

    public Message(String text, Boolean sender, String image) {
        this.text = text;
        this.sender = sender;
        this.image = image;
    }

    public String getText() {
        return this.text;
    }
}
