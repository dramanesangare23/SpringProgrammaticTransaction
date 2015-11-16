package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks>{

	@Override
	public StudentMarks mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		StudentMarks studentMarks = new StudentMarks();
		
		studentMarks.setAge(resultSet.getInt("age"));
		studentMarks.setName(resultSet.getString("name"));
		studentMarks.setId(resultSet.getInt("id"));
		studentMarks.setMarks(resultSet.getInt("marks"));
		studentMarks.setYear(resultSet.getInt("year"));
		studentMarks.setSid(resultSet.getInt("sid"));
		
		return studentMarks;
	}
	
}
