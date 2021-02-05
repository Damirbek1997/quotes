package com.example.quotes.repositories;

import com.example.quotes.dto.QuoteLikeDto;
import com.example.quotes.entities.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
//    @Query("select q, sum(l.score) as score from q left join l on q.id = l.quote_id group by q.id order by score desc limit 10")
    @Query("SELECT new Quote(q.quote, q.likeSet) "
        + "FROM Quote q LEFT JOIN q.likeSet l")
    List<QuoteLikeDto> fetchQuoteLikeDataLeftJoin();
}
