package com.example.ec.explorecali.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.ec.explorecali.domain.Tour;
import com.example.ec.explorecali.domain.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String>{

	public TourPackage findByName(@Param("name") String name);
	
	public List<Tour> findByCode(String code);
	
}
