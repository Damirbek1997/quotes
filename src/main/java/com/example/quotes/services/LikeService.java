package com.example.quotes.services;

import com.example.quotes.entities.Like;
import com.example.quotes.repositories.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;

    // Method to get all likes
    public List getAllLikes() {
        return likeRepository.findAll();
    }

    // Method to handle like or dislike
    public void handleLike(Like likeEntity, Boolean like) {
        if (like) {
            likeQuote(likeEntity);
        } else {
            dislikeQuote(likeEntity);
        }
    }

    // Method to give like to quote
    public void likeQuote(Like like) {
        List<Like> check = likeRepository.findByQuoteId(like.getQuote().getId());
        Boolean checkIfUserLiked = false;

        for (Like as : check) {
            if (as.getUserId() == like.getUserId()) {
                checkIfUserLiked = true;
            }
        }

        if (!checkIfUserLiked) {
            int score = like.getScore();
            score++;
            like.setScore(score);

            likeRepository.save(like);
        }
    }

    // Method to remove a like from quote
    public void dislikeQuote(Like like) {
        List<Like> check = likeRepository.findByQuoteId(like.getQuote().getId());
        Boolean checkIfUserLiked = false;

        for (Like as : check) {
            if (as.getUserId() == like.getUserId()) {
                checkIfUserLiked = true;
            }
        }

        if (checkIfUserLiked) {
            int score = like.getScore();
            score--;
            like.setScore(score);

            likeRepository.save(like);
        }
    }
}