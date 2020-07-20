package com.example.ec.explorecali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ec.explorecali.domain.TourPackage;
import com.example.ec.explorecali.repository.TourPackageRepository;

@Service
public class TourPackageService {

	private TourPackageRepository tourPackageRepository;

	@Autowired
	public TourPackageService(TourPackageRepository tourPackageRepository) {
		super();
		this.tourPackageRepository = tourPackageRepository;
	}

	public TourPackage createTourPackage(String code, String name) {
		if (!tourPackageRepository.existsById(code)) {
			return tourPackageRepository.save(new TourPackage(code, name));
		}
		return null;
	}

	public Iterable<TourPackage> lookUp()
	{
		return tourPackageRepository.findAll();
	}
	
	public Long total()
	{
		return tourPackageRepository.count();
	}
	
}
