package com.spring;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.service.StudentService;

import com.spring.entity.Student;


public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      StudentService studentService = context.getBean(StudentService.class);

      // Add Students
      studentService.add(new Student("Sunil", "Bora", "suni.bora@example.com"));
      studentService.add(new Student("David", "Miller", "david.miller@example.com"));
      studentService.add(new Student("Sameer", "Singh", "sameer.singh@example.com"));
      studentService.add(new Student("Paul", "Smith", "paul.smith@example.com"));

      // Get Students
      List<Student> students = studentService.listStudents();
Consumer<Student> std1 = (Student s) -> System.out.println("ID:"+s.getId() +" and First Name:"+s.getFirstName() +" and Last Name:"+s.getLastName() +" and Address:"+s.getEmail());
      
students.forEach(std1);
      
      //Update student
      Student s1= studentService.getStudent(1);
      
      s1.setFirstName("Madhu");
      
      studentService.update(s1);
      
      //Delete Student
      studentService.delete(s1);
      
      //Get Students
      List<Student> student = studentService.listStudents();
      Consumer<Student> std = (Student s) -> System.out.println("ID:"+s.getId() +" and First Name:"+s.getFirstName() +" and Last Name:"+s.getLastName() +" and Address:"+s.getEmail());
      
      student.forEach(std);
      context.close();
   }
}
