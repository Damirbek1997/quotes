package com.example.quotes.repositories;

import com.example.quotes.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Integer> {
    List<Like> findByQuoteId(Integer quoteId);
}
