package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(){

    }

    public Post(Long id, String text, Date date){
        this.id = id;
        this.text = text;
        likes = 0;
        creationDate=date;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public void setLikes(Integer likes){
        this.likes = likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public Long getId(){
        return id;
    }

}
