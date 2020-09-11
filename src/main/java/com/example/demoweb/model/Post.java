package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text){
        this.text = text;
    }

    public Post(String text, Date date){
        this.text = text;
        creationDate=date;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }
}
