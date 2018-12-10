package com.valuelabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee extends KeyClass{
	

	@Id
	private String fName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	

}
