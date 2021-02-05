package com.example.quotes.services;

import com.example.quotes.dto.QuoteLikeDto;
import com.example.quotes.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ser {
    @Autowired
    private QuoteRepository quoteRepository;

    public List<QuoteLikeDto> getTopLikes() {
        return quoteRepository.fetchQuoteLikeDataLeftJoin();
    }
}
