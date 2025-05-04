package com.springboot.demo.mycoolapp.hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.demo.mycoolapp.hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

	@Override
	public Student findById(Integer id) {
		return this.entityManager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by firstName", Student.class);
		return theQuery.getResultList();
	}

	@Override
	public List<Student> findByFirstName(String firstName) {
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE firstName=:theData", Student.class);
		theQuery.setParameter("theData", firstName);
		return theQuery.getResultList();
	}

	@Override
	@Transactional
	public void update(Student student) {
		this.entityManager.merge(student);
	}

}
