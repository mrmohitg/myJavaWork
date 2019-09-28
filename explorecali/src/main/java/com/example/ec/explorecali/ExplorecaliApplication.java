package com.example.ec.explorecali;

import java.io.IOException;
import java.util.List;

import com.example.ec.explorecali.domain.Difficulty;
import com.example.ec.explorecali.domain.Region;
import com.example.ec.explorecali.domain.TourPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ec.explorecali.service.TourPackageService;
import com.example.ec.explorecali.service.TourService;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@SpringBootApplication
public class ExplorecaliApplication implements CommandLineRunner {

	@Autowired
	private TourPackageService tourPackageService;

	@Autowired
	private TourService tourService;

	public static void main(String[] args) {
		SpringApplication.run(ExplorecaliApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Create the default tour packages
		tourPackageService.createTourPackage("BC", "Backpack Cal");
		tourPackageService.createTourPackage("CC", "California Calm");
		tourPackageService.createTourPackage("CH", "California Hot springs");
		tourPackageService.createTourPackage("CY", "Cycle California");
		tourPackageService.createTourPackage("DS", "From Desert to Sea");
		tourPackageService.createTourPackage("KC", "Kids California");
		tourPackageService.createTourPackage("NW", "Nature Watch");
		tourPackageService.createTourPackage("SC", "Snowboard Cali");
		tourPackageService.createTourPackage("TC", "Taste of California");
		System.out.println("Number of tours packages =" + tourPackageService.total());

		// Persist the Tours to the database
		/*TourFromFile.importTours().forEach(t -> tourService.createTour(t.title, t.description, t.blurb, Integer.parseInt(t.price),
				t.length, t.bullets, t.keywords, t.packageType., Difficulty.valueOf(t.difficulty),Region.findByLabel(t.region)));
		System.out.println("Number of tours =" + tourService.totalTour());
*/
	}

/*	static class TourFromFile
	{

		private String packageType, title, description, blurb, price, length, bullets, keywords,  difficulty, region;
	static List<TourFromFile> importTours() throws IOException {
		return new ObjectMapper().setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY).
				readValue(TourFromFile.class.getResourceAsStream("/ExploreCalifornia.json"),new TypeReference<List<TourFromFile>>(){});
	}*/
}
