package com.example.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.model.Students;

@Repository
public interface Student_repo extends JpaRepository<Students, Integer> {

}
