package com.example.trivia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivia.models.Answers;
import com.example.trivia.models.Questions;
import com.example.trivia.repositories.AnswerRepository;
import com.example.trivia.repositories.QuestionRepository;


@Service
public class TriviaService {
    
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;
    private int score = 0;
    
    
    public List<Questions> getAllQuestions() {
        return questionRepository.findAll();
    }
    
    public void sumbitAnswers(List <Answers> answers) {
    
    }
    
    public int getScore() {
        return score;
    }
    
}
