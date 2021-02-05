package com.example.quotes.controllers;

import com.example.quotes.entities.Like;
import com.example.quotes.services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    private LikeService likeService;

    // API to get all likes
    @GetMapping("/getAll")
    public List<Like> getAllLikes() {
        return likeService.getAllLikes();
    }

    // API to handle like
    @PostMapping("/add/{flag}")
    public void removeOrAddLike(@RequestBody Like like, @PathVariable("flag") Boolean flag) {
        likeService.handleLike(like, flag);
    }
}
