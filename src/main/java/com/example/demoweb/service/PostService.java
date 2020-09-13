package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private ArrayList<Post> posts;

    public PostService(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }

    public List<Post> listAllPosts(){
        return posts;
    }
}
