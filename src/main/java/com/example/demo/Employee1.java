package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Employee1 {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private long salary;
	
	@ManyToOne
	private Department department;
	
	Employee1() {
		
	}
	
	public Employee1(String name) {
		this.name = name;
	}

}
