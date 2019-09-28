package com.example.ec.explorecali.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ec.explorecali.domain.Difficulty;
import com.example.ec.explorecali.domain.Region;
import com.example.ec.explorecali.domain.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer>{

	public List<Tour> findByPrice(int price);
	
	public Collection<Tour> findByDifficulty(Difficulty difficulty);
	
	public List<Tour> findByRegion(Region region); 
	
	public List<Tour> findByTourPackageCodeAndRegion(String code, Region region);
	
	public List<Tour> findByRegionIn(List<Region> regions);
	
	public List<Tour> findByPriceLessThan(Integer maxPrice);
	
	public List<Tour> findByKeywordsContains(String keywords);
	
	public List<Tour> findByTourPackageCodeAndBulletsLike(String code, String searchString);
	
	public List<Tour> findByTourPackageCodeAndDifficultyAndRegionAndPriceLessThan(String code, Difficulty difficulty, Region region,Integer maxPrice);
	
}
