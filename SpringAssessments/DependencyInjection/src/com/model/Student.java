package com.model;

import java.util.List;

public class Student {
	
	private String StudentId;
	
	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public List<Test> getTestdetails() {
		return testdetails;
	}

	public void setTestdetails(List<Test> testdetails) {
		this.testdetails = testdetails;
	}

	private String StudentName;
	
	private List <Test> testdetails;
	
	public void displayStudentdetails() {
		
		System.out.println("Student [StudentId ="+ StudentId+", StudentName ="+StudentName+", testdetails ="+ testdetails+"]");
	}

}
