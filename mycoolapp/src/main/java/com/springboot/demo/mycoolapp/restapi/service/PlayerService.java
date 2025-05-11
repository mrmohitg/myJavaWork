package com.springboot.demo.mycoolapp.restapi.service;

import java.util.List;

import com.springboot.demo.mycoolapp.restapi.entity.Player;

public interface PlayerService {
	
	public List<Player> findAll();
	
	public Player findById(int id);
	
	public Player save(Player player);
	
	public void deleteById(int id);

}
