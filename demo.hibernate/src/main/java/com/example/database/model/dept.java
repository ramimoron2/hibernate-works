package com.example.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dept {

	@Id
	private String DEPTNO;
	
	private String DNAME;
	
	private String LOC;

	public String getDEPTNO() {
		return DEPTNO;
	}

	public void setDEPTNO(String dEPTNO) {
		DEPTNO = dEPTNO;
	}

	public String getDNAME() {
		return DNAME;
	}

	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}

	public String getLOC() {
		return LOC;
	}

	public void setLOC(String lOC) {
		LOC = lOC;
	}
	
	
		
		
	
}
