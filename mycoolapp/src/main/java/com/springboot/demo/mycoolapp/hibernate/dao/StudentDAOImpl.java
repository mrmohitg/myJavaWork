package com.springboot.demo.mycoolapp.hibernate.dao;

import org.springframework.stereotype.Repository;

import com.springboot.demo.mycoolapp.hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	//defines field for entity manager
	private EntityManager entityManager;
	
	/**
	 * @param entityManager
	 */
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void save(Student student) {
		this.entityManager.persist(student);
 }

}
