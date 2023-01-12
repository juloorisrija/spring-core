package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
     private String firstname;
     private String lastname;
     private int age;
     
   @Autowired
     private Car car;
	public Person() {
	}
	public Person(int a) {
		age=a;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String personDetail() {
		return firstname+":"+car.getCarDetails();
	}
     
}
