package com.crud.dao;

import java.util.List;

import com.crud.model.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int updateDetail(Student student);
	
	public int deleteById(int id);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudent();

}
