package com.example.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.model.Questions;


public interface questions_repo extends JpaRepository<Questions, Integer> {

}
