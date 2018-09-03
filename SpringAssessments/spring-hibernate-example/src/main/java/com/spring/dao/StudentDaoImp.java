package com.spring.dao;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.Student;

@Repository
public class StudentDaoImp implements StudentDao {

	@Autowired
    private HibernateTemplate hibernateTemplate;

   @Override
   public void add(Student student) {
	   
	   hibernateTemplate.save(student);
      
   }
   
   @Override
   public Student getStudent(int id) {
	   
	  Student s = hibernateTemplate.get(Student.class, id);
	  
	  return s;
   }
   
   @Override
   public void update(Student student) {
	  
	  hibernateTemplate.update(student); 
	   
   }

   @Override
   public void delete(Student student) {
	   
	   hibernateTemplate.delete(student);
	   
	   
   }

   @Override
   public List<Student> listStudents() {
     
      return hibernateTemplate.loadAll(Student.class);

   }

}
