package com.spring.marketblog.service;

import com.spring.marketblog.model.Post;

import java.util.List;

public interface CodemarketService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}

