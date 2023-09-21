package com.training.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	private String studName;
	private int age;
	
	private String grade;
	
	public Student(String studName,int age, String grade){
		this.studName=studName;
		this.age=age;
		this.grade=grade;
	}

}
