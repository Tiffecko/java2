package com.example.demo.model;

import java.sql.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Integer likes, Date creationDate) {
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public Integer getLikes() {
        return this.likes;
    }
    public String getText() {
        return this.text;
    }
    public Date getCreationDate() {
        return this.creationDate;
    }
}