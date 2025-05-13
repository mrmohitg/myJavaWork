/**
 * 
 */
package com.springboot.demo.mycoolapp.springdatajparest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.demo.mycoolapp.springdatajparest.entity.Employee;

/**
 * 
 */
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
