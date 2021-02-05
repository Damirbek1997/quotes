package com.example.quotes.services.impl;

import com.example.quotes.entities.Quote;
import com.example.quotes.repositories.QuoteRepository;
import com.example.quotes.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class QuoteServiceImpl implements QuoteService {
    @Autowired
    private QuoteRepository quoteRepository;

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @Override
    public List<Quote> getTopQuotes() {
//        TypedQuery<Quote> query = em.createQuery("select q from quotes q", Quote.class);
//        List<Quote> results = query.getResultList();
//        return results;
        return null;
    }
}