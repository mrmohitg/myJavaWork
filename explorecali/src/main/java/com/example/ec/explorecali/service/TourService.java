package com.example.ec.explorecali.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ec.explorecali.domain.Difficulty;
import com.example.ec.explorecali.domain.Region;
import com.example.ec.explorecali.domain.Tour;
import com.example.ec.explorecali.domain.TourPackage;
import com.example.ec.explorecali.repository.TourPackageRepository;
import com.example.ec.explorecali.repository.TourRepository;

@Service
public class TourService {

	private TourRepository tourRepository;
	private TourPackageRepository tourPackageRepository;

	@Autowired
	public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
		super();
		this.tourRepository = tourRepository;
		this.tourPackageRepository = tourPackageRepository;
	}

	public Tour createTour(String title, String description, String blurb, Integer price, String duration,
			String bullets, String keywords, String tourPackageName, Difficulty difficulty, Region region) {
		TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName);
		if (tourPackage == null) {
			throw new RuntimeException("Tour package does not exist " + tourPackageName);
		} else {
			return tourRepository.save(new Tour(title, description, blurb, price, duration, bullets, keywords,
					tourPackage, difficulty, region));
		}
	}

	public Iterable<Tour> findAllTour() {
		return tourRepository.findAll();
	}

	public Long totalTour() {
		return tourRepository.count();
	}

}
