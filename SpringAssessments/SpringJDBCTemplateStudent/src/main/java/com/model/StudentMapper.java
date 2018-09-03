package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet resultSet, int i) throws SQLException {

		Student student = new Student();
		student.setId(resultSet.getLong("id"));
		student.setFirstName(resultSet.getString("first_name"));
		student.setLastName(resultSet.getString("last_name"));
		student.setAge(resultSet.getInt("age"));
		return student;
	}
}
