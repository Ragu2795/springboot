package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}