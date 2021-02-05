package com.example.quotes.services;

import com.example.quotes.entities.Quote;

import java.util.List;

public interface QuoteService {
    // Method to get all quotes
    List<Quote> getAllQuotes();

    // Method to get 10 most popular quotes
    List<Quote> getTopQuotes();
}
