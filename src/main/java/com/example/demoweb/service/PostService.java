package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        Post[] posts = new Post[]{new Post("Скандалы"),new Post("Интриги"),new Post("Расследования")};
        return Arrays.asList(posts);
    }
}
