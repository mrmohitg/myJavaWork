package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	
	//RoomEntity findById(Long id);
	
	RoomEntity findOne(Long id);
	
}
