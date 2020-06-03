package com.example.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name="answers")

public class Answers {   
@Id  

@GeneratedValue(strategy = GenerationType.AUTO) 
private int id;    
private String answername;    
private String postedBy;  
	/*
	 * @Column(name="qid") private int qid;
	 */



public int getId() {  
    return id;  
}  

	/*
	 * public int getQ_id() { return qid; } public void setQ_id(int q_id) { this.qid
	 * = q_id; }
	 */
public void setId(int id) {  
    this.id = id;  
}  
public String getAnswername() {  
    return answername;  
}  



public void setAnswername(String answername) {  
    this.answername = answername;  
}  
public String getPostedBy() {  
    return postedBy;  
}  
public void setPostedBy(String postedBy) {  
    this.postedBy = postedBy;  
}      
}    