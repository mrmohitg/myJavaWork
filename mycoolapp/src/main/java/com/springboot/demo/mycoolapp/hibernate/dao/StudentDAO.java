package com.springboot.demo.mycoolapp.hibernate.dao;

import java.util.List;

import com.springboot.demo.mycoolapp.hibernate.entity.Student;

public interface StudentDAO {
	void save(Student student);
	
	Student findById(Integer id);
	
	List<Student> findAll();
	
	List<Student> findByFirstName(String firstName);
	
	void update(Student student);
	
	void delete(Integer id);
	
	int deleteAll();
}
