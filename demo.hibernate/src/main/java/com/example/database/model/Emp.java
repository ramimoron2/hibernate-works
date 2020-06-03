package com.example.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="emp")
public class Emp {

	@Id
	private Integer EMPNO;
	
	private String ENAME;
	private String JOB;
	private Integer MGR;
	private String HIREDATE;
	public Integer getEMPNO() {
		return EMPNO;
	}
	public void setEMPNO(Integer eMPNO) {
		EMPNO = eMPNO;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public Integer getMGR() {
		return MGR;
	}
	public void setMGR(Integer mGR) {
		MGR = mGR;
	}
	public String getHIREDATE() {
		return HIREDATE;
	}
	public void setHIREDATE(String hIREDATE) {
		HIREDATE = hIREDATE;
	}
	public Float getSAL() {
		return SAL;
	}
	public void setSAL(Float sAL) {
		SAL = sAL;
	}
	public Float getCOMM() {
		return COMM;
	}
	public void setCOMM(Float cOMM) {
		COMM = cOMM;
	}
	public Integer getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(Integer dEPTNO) {
		DEPTNO = dEPTNO;
	}
	private Float SAL;
	private Float COMM;
	private Integer DEPTNO;
	
	
	
	
	
	
}
