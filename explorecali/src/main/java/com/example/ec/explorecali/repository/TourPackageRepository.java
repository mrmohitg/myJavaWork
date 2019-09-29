package com.example.ec.explorecali.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.explorecali.domain.Tour;
import com.example.ec.explorecali.domain.TourPackage;

@RepositoryRestResource(collectionResourceRel = "packages", path="packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String>{

	public TourPackage findByName(@Param("name") String name);
	
	public List<Tour> findByCode(String code);

	/*@Override
	@RestResource(exported=false)
	default void delete(TourPackage arg0) {
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll() {
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll(Iterable<? extends TourPackage> arg0) {
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteById(String arg0) {
		
	}

	@Override
	@RestResource(exported=false)
	default <S extends TourPackage> S save(S arg0) {
		return null;
	}

	@Override
	@RestResource(exported=false)
	default <S extends TourPackage> Iterable<S> saveAll(Iterable<S> arg0) {
		return null;
	}*/
	
}
