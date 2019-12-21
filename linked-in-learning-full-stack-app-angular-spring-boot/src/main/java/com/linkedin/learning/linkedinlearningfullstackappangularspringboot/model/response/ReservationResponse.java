package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.model.response;

import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.model.Links;

public class ReservationResponse {

	private Long id;
	private Integer roomNumber;
	private Integer price;
	private Links links;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public ReservationResponse(Integer roomNumber, Integer price) {
		super();
		this.roomNumber = roomNumber;
		this.price = price;
	}

	public ReservationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
