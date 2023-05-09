package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoanApplictionModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplictionModel, Integer> {

}