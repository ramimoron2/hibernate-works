package com.example.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.model.Answer;


@Repository
public interface answer_repo extends JpaRepository<Answer, String> {

}
