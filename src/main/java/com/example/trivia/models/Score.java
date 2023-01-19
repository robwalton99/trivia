package com.example.trivia.models;

import jakarta.persistence.*;


@Entity
public class Score {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "userid")
    private Long userId;
    
    @Column(name = "score")
    private int score;
    
    public Score(){}
    
    public Score( Long userId, int score){
        
        this.userId = userId;
        this.score = score;
        
    }
    
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    
}
