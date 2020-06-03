package com.example.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.database.model.dept;

@Repository
public interface repo extends JpaRepository<dept, String>{

}
