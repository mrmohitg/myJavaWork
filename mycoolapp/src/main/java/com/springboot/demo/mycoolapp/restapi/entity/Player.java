package com.springboot.demo.mycoolapp.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

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
	
	@Column(name = "goals")
	private int goals;

	public Player() {
		super();
	}

	/**
	 * @param name
	 * @param country
	 * @param caps
	 * @param goals
	 */
	public Player(String name, String country, int caps, int goals) {
		super();
		this.name = name;
		this.country = country;
		this.caps = caps;
		this.goals = goals;
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
	 * @return the goals
	 */
	public int getGoals() {
		return goals;
	}

	/**
	 * @param goals the goals to set
	 */
	public void setGoals(int goals) {
		this.goals = goals;
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

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", country=" + country + ", caps=" + caps + ", goals=" + goals
				+ "]";
	}

	
}
