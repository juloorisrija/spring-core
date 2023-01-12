package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String employeName;
	private int salary;
	@Autowired
	private Manager manager;



	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		
	}

	public String employeedetails() {
		return employeName + " salary is:" + salary + ";" + manager.managerdetails();
	}

}
