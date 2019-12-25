package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.entity.ReservationEntity;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long>{

	
}
