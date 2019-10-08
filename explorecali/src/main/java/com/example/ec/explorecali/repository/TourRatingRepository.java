package com.example.ec.explorecali.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.ec.explorecali.domain.TourRating;
import com.example.ec.explorecali.domain.TourRatingPk;

@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPk>{

	public List<TourRating> findByTourRatingPkTourId(Integer tourId);
	
	public TourRating findByTourRatingPkTourIdAndTourRatingPkCustomerId(Integer tourId, Integer customerId);
	
}
