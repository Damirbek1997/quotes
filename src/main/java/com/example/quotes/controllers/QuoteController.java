package com.example.quotes.controllers;

import com.example.quotes.dto.QuoteLikeDto;
import com.example.quotes.entities.Quote;
import com.example.quotes.repositories.QuoteRepository;
import com.example.quotes.services.QuoteService;
import com.example.quotes.services.Ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quote")
public class QuoteController {
    @Autowired
    private QuoteService service;

    @Autowired
    private Ser ser;

    // API to get all quotes
    @GetMapping("/getAll")
    public List<Quote> getAllQuotes() {
        return service.getAllQuotes();
    }

    // API to get top quotes
    @GetMapping("/getPopular")
    public List<QuoteLikeDto> getTopQuotes() {
        return ser.getTopLikes();
    }
}
