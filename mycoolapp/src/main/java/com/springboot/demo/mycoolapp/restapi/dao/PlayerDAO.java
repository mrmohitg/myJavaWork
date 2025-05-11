package com.springboot.demo.mycoolapp.restapi.dao;

import java.util.List;

import com.springboot.demo.mycoolapp.restapi.entity.Player;

public interface PlayerDAO {
	
	public List<Player> findAll();
	
	public Player findById(int id);
	
	public Player save(Player player);
	
	public void deleteById(int id);

}
