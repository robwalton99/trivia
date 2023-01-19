package com.example.trivia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.trivia.models.Answers;
import com.example.trivia.models.Questions;
import com.example.trivia.services.TriviaService;


@RestController
@RequestMapping("/api/trivia")
public class TriviaController {
    
    @Autowired
    private TriviaService triviaService;
    
    @GetMapping("/questions")
    public ResponseEntity<List<Questions>> getAllQuestions() {
        return ResponseEntity.ok(triviaService.getAllQuestions());
    }
    
    @PostMapping("/answers")
    public ResponseEntity<Void> submitAnswers(@RequestBody List<Answers> answers) {
        triviaService.sumbitAnswers(answers);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/score")
    public ResponseEntity<Integer> getScore() {
        return ResponseEntity.ok(triviaService.getScore());
    }
}
