package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.StudentDao;

import com.spring.entity.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Transactional
	@Override
	public void add(Student student) {
		studentDao.add(student);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Student> listStudents() {
		return studentDao.listStudents();
	}

	@Override
	@Transactional(readOnly = true)
	public Student getStudent(int id) {
		
		return studentDao.getStudent(id);
	}
    
	@Transactional
	@Override
	public void update(Student student) {
		
		studentDao.update(student);

	}
    
	@Transactional
	@Override
	public void delete(Student student) {
		studentDao.delete(student);

	}

}
