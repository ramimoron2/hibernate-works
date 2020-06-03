package com.example.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="hobbies")
public class Hobbies {

	
	

	public int getHobbieid() {
		return hobbieid;
	}

	public void setHobbieid(int hobbieid) {
		this.hobbieid = hobbieid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int hobbieid;
	
	private String name;
	
	@Column(name="student_id")
	private int student_id;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	
	
	
	
}
