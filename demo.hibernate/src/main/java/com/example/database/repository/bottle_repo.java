package com.example.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.model.bottle;


@Repository
public interface bottle_repo extends JpaRepository<bottle, String> {

	
	
}
