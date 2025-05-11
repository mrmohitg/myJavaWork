package com.springboot.demo.mycoolapp.springdatajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cricket_player")
public class CricketPlayer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "caps")
	private int caps;
	
	@Column(name = "centuries")
	private int centuries;

	public CricketPlayer() {
		super();
	}

	/**
	 * @param name
	 * @param country
	 * @param caps
	 * @param centuries
	 */
	public CricketPlayer(String name, String country, int caps, int centuries) {
		super();
		this.name = name;
		this.country = country;
		this.caps = caps;
		this.centuries = centuries;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the caps
	 */
	public int getCaps() {
		return caps;
	}

	/**
	 * @param caps the caps to set
	 */
	public void setCaps(int caps) {
		this.caps = caps;
	}

	/**
	 * @return the centuries
	 */
	public int getCenturies() {
		return centuries;
	}

	/**
	 * @param centuries the centuries to set
	 */
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	@Override
	public String toString() {
		return "CricketPlayer [id=" + id + ", name=" + name + ", country=" + country + ", caps=" + caps + ", centuries="
				+ centuries + "]";
	}
	
	
}
