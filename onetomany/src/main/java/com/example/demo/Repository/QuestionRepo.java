package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
