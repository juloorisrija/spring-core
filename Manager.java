package com.training.spring;

public class Manager {
 
	private  String managerName;
	private int msalary;
	
	
	public Manager() {
		super();
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getMsalary() {
		return msalary;
	}
	public void setMsalary(int msalary) {
		this.msalary = msalary;
	}
	public String managerdetails() {
		return managerName+"manager salary is:"+msalary;
	}
}
