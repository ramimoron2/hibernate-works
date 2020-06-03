package com.example.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.model.Question;
import com.example.database.model.Questions;
import com.example.database.model.dept;



@Repository
public interface second_repo extends JpaRepository<Question, Integer>  {

}
