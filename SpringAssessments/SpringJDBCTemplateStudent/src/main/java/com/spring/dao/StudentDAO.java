package com.spring.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {
	Student getStudentById(Long id);

	List<Student> getAllStudents();

	boolean deleteStudent(Student student);

	boolean updateStudent(Student student);

	boolean createStudent(Student student);
}
