package com.example.ec.explorecali.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class TourRatingPk implements Serializable{
	
	@ManyToOne
	private Tour tour;
	
	@Column(insertable = false, updatable = false, nullable = false)
	private Integer customerId;

	public TourRatingPk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TourRatingPk(Tour tour, Integer customerId) {
		super();
		this.tour = tour;
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "TourRatingPk [tour=" + tour + ", customerId=" + customerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((tour == null) ? 0 : tour.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TourRatingPk other = (TourRatingPk) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (tour == null) {
			if (other.tour != null)
				return false;
		} else if (!tour.equals(other.tour))
			return false;
		return true;
	}

	public Tour getTour() {
		return tour;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	
	

	
}
