package com.spring.service;

import java.util.List;

import com.spring.entity.Student;

public interface StudentService {
	public void add(Student student);
	   
	public Student getStudent(int id);
	   
	public void update(Student student);

	public void delete(Student student);
	   
	public List<Student> listStudents();
}
