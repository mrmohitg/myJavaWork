package com.example.ec.explorecali.repository;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.explorecali.domain.Difficulty;
import com.example.ec.explorecali.domain.Region;
import com.example.ec.explorecali.domain.Tour;

public interface TourRepository extends PagingAndSortingRepository<Tour, Integer>{
	
	public List<Tour> findByPrice(Integer price);
	
	public Collection<Tour> findByDifficulty(Difficulty difficulty);
	
	public List<Tour> findByRegion(Region region); 
	
	public List<Tour> findByTourPackageCodeAndRegion(String code, Region region);
	
	public List<Tour> findByRegionIn(List<Region> regions);
	
	public List<Tour> findByPriceLessThan(Integer maxPrice);
	
	public List<Tour> findByKeywordsContains(String keywords);
	
	public List<Tour> findByTourPackageCodeAndBulletsLike(String code, String searchString);
	
	public List<Tour> findByTourPackageCodeAndDifficultyAndRegionAndPriceLessThan(String code, Difficulty difficulty, Region region,Integer maxPrice);
	
	public Page<Tour> findByTourPackageCode(@Param("code")String code, Pageable pageable);

	/*@Override
	@RestResource(exported=false)
	default void delete(Tour arg0) {
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll() {
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll(Iterable<? extends Tour> arg0) {
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteById(Integer arg0) {
		
	}

	@Override
	@RestResource(exported=false)
	default <S extends Tour> S save(S arg0) {
		return null;
	}

	@Override
	@RestResource(exported=false)
	default <S extends Tour> Iterable<S> saveAll(Iterable<S> arg0) {
		return null;
	}*/
	
	
	
}
