package com.spring.marketblog.service.serviceImp;

import com.spring.marketblog.model.Post;
import com.spring.marketblog.repository.MarketblogRepository;
import com.spring.marketblog.service.CodemarketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CodeMarketServiceImp implements CodemarketService {

    @Autowired
    MarketblogRepository marketblogRepository;

    @Override
    public List<Post> findAll() {
        return marketblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return marketblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return marketblogRepository.save(post);
    }
}
