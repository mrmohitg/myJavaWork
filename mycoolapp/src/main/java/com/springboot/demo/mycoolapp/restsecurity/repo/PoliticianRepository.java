/**
 * 
 */
package com.springboot.demo.mycoolapp.restsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.mycoolapp.restsecurity.entity.Politician;

/**
 * 
 */
public interface PoliticianRepository extends JpaRepository<Politician, Integer>{
	
}
