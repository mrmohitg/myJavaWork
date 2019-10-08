package com.example.ec.explorecali.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class TourRating {

	@EmbeddedId
	private TourRatingPk tourRatingPk;
	
	@Column(nullable=false)
	private Integer score;
	
	@Column
	private String comment;

	public TourRating(TourRatingPk tourRatingPk, Integer score, String comment) {
		super();
		this.tourRatingPk = tourRatingPk;
		this.score = score;
		this.comment = comment;
	}

	protected TourRating() {
		super();
	}

	@Override
	public String toString() {
		return "TourRating [tourRatingPk=" + tourRatingPk + ", score=" + score + ", comment=" + comment + "]";
	}
	
	

	
	
}
