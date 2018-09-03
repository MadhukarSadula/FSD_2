package com.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.model.Student;
import com.spring.config.AppConfig;
import com.spring.dao.StudentDAO;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDAO studentDAO = context.getBean(StudentDAO.class);

		System.out.println("List of student is:");

		for (Student s : studentDAO.getAllStudents()) {
			System.out.println(s);
		}

		System.out.println("\nGet person with ID 2");

		Student studentById = studentDAO.getStudentById(2L);
		System.out.println(studentById);

		System.out.println("\nCreating student: ");
		Student student = new Student(4L, 36, "Sergey", "Emets");
		System.out.println(student);
		studentDAO.createStudent(student);
		System.out.println("\nList of student is:");

		for (Student s : studentDAO.getAllStudents()) {
			System.out.println(s);
		}

		System.out.println("\nDeleting student with ID 2");
		studentDAO.deleteStudent(studentById);

		System.out.println("\nUpdate student with ID 4");

		Student sstudent = studentDAO.getStudentById(4L);
		sstudent.setLastName("CHANGED");
		studentDAO.updateStudent(sstudent);

		System.out.println("\nList of student is:");
		for (Student s : studentDAO.getAllStudents()) {
			System.out.println(s);
		}

		context.close();
	}
}
