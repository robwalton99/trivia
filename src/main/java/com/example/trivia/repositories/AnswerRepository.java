package com.example.trivia.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.trivia.models.Answers;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


public interface AnswerRepository extends CrudRepository<Answers, Long> {
    
   public void submit(List<Answers> answersList);
}

