/**
 * 
 */
package com.springboot.demo.mycoolapp.springdatajparest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.mycoolapp.springdatajparest.entity.Employee;

/**
 * 
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
