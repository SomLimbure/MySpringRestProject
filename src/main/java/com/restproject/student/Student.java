package com.restproject.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String adhaar;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(String adhaar) {
		this.adhaar = adhaar;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adhaar=" + adhaar + "]";
	}
	
	public Student(long id, String name, String adhaar) {
		super();
		this.id = id;
		this.name = name;
		this.adhaar = adhaar;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
