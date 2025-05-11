package com.springboot.demo.mycoolapp.springdatajpa.service;

import java.util.List;

import com.springboot.demo.mycoolapp.springdatajpa.entity.CricketPlayer;

public interface CricketPlayerService {
	
	public List<CricketPlayer> findAll();
	
	public CricketPlayer findById(int id);
	
	public CricketPlayer save(CricketPlayer player);
	
	public void deleteById(int id);

}
