package com.spring.marketblog.repository;

import com.spring.marketblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketblogRepository extends JpaRepository<Post, Long> {
}
