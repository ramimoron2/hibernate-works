package com.example.database.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students {

	
	public List<Hobbies> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobbies> hobbies) {
		this.hobbies = hobbies;
	}

	@Id
	
	@Column(name="student_id")
	private int  id;
	
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id" , referencedColumnName ="student_id")
	private List<Hobbies> hobbies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	
}
