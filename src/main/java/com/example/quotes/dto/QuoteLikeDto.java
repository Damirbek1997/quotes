package com.example.quotes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuoteLikeDto {
    private String quotes;
    private Integer userId;
    private Integer score;

    public QuoteLikeDto(String quotes, Integer userId, Integer score) {
        this.quotes = quotes;
        this.userId = userId;
        this.score = score;
    }

    public QuoteLikeDto() {
    }

    @Override
    public String toString() {
        return "QuoteLikesDto{" +
                ", quotes='" + quotes + '\'' +
                ", userId=" + userId +
                ", score=" + score +
                '}';
    }
}
