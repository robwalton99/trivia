package com.example.trivia.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.trivia.models.Questions;


public interface QuestionRepository extends CrudRepository<Questions, Long> {
    
    public List<Questions> findAll();
}

