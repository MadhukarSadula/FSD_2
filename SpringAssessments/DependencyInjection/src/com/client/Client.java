package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Client {

	public static void main(String[] args) {
	  
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		Student s1 = (Student) context.getBean("student1");
		
		Student s2 = (Student) context.getBean("student2");
		
		s1.displayStudentdetails();
		
		s2.displayStudentdetails();

	}

}
