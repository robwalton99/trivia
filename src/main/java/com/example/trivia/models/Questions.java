package com.example.trivia.models;


import java.util.List;

import jakarta.persistence.*;

@Entity
public class Questions {
   
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        
        @Column(name = "triviaType")
        private String triviaType;
        
        @Column(name = "text")
        private String text;
        
       
       @ElementCollection
       @Column(name = "options")
        private List<String> options;
        
        @Column(name = "correctoption")
        private int correctOption;
        
        public Questions(){}
        
        public Questions( String triviaType, String text, List<String> options, int correctOption){
            
            this.triviaType = triviaType;
            this.text = text;
            this.options = options;
            this.correctOption = correctOption;
            
        }
        
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        
        public String getTriviaType() {
            return triviaType;
        }
        public void setTriviaType(String triviaType) {
            this.triviaType = triviaType;
        }
        public String getText() {
            return text;
        }
        public void setText(String text) {
            this.text = text;
        }
    
    public int getCorrectOption() {
            return correctOption;
        }
        public void setCorrectOption(int correctOption) {
            this.correctOption = correctOption;
        }
    }
    
    
    

