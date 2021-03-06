package com.ayudape.developer.chatbot.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="messages")
public class Message {
    
    @Id
    @GeneratedValue
    private UUID uuid;

    @Column(name = "user_uuid", nullable=false)
    private UUID userUuid;
    @Column(name = "sender", nullable=false)
    private Boolean sender;
    @Column(name = "text", nullable=false)
    private String text;
    @Column(name = "image")
    private String image;

    public Message(){}

    public Message(UUID userUuid,String text, Boolean sender, String image) {
        this.userUuid = userUuid;
        this.text = text;
        this.sender = sender;
        this.image = image;
    }

    public UUID getUuid() {
        return uuid;
    }

    public UUID getUserUuid() {
        return userUuid;
    }

    public String getText() {
        return this.text;
    }

    public Boolean getSender() {
        return this.sender;
    }

    public String getImage() {
        return this.image;
    }
}
