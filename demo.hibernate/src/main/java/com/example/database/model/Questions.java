package com.example.database.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity  
@Table(name="questions")  
public class Questions {    
  
@Id   
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;    
private String qname;    
  
@ManyToMany(cascade = CascadeType.ALL )  
@JoinTable(
name = "Question_answer", 
joinColumns = { @JoinColumn(name = "id") }, 
inverseJoinColumns = { @JoinColumn(name = "qid") 
})
  
private List<Answers> answers;  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getQname() {  
    return qname;  
}  
public void setQname(String qname) {  
    this.qname = qname;  
}
public List<Answers> getAnswers() {
	return answers;
}
public void setAnswers(List<Answers> answers) {
	this.answers = answers;
}  
    
}  