package com.example.trivia.models;
import jakarta.persistence.*;

@Entity
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "questionid")
    private Long questionId;
    
    @Column(name = "userid")
    private Long userId;
    
    @Column(name = "option")
    private int optionSelected;
    
    public Answers(){}
    
    public Answers( Long questionId, Long userId, int optionSelected){
        
        this.questionId =  questionId;
        this.userId = userId;
        this.optionSelected = optionSelected;
        
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
  
    public Long getQuestionId() {
        return questionId;
    }
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public int getOptionSelected() {
        return optionSelected;
    }
    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }
    
}
