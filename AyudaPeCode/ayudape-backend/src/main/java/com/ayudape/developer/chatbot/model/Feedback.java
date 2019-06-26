package com.ayudape.developer.chatbot.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="feedback")
public class Feedback {
    @Id
    @GeneratedValue
    private UUID uuid;

    @Column(name = "question", nullable=false)
    private String question;
    @Column(name = "tag", nullable=false)
    private String tag;
    @Column(name = "type", nullable=false)
    private String type; // not enough information or wrong answer
    @Column(name = "comment")
    private String comment;

    public Feedback(String question, String tag, String type, String comment)
    {
        this.question = question;
        this.tag = tag;
        this.type = type;
        this.comment = comment;
    }

    public String getQuestion(){return question;}

    public String getTag(){return tag;}

    public String getType(){return type;}

    public String getComment(){return comment;}
}
