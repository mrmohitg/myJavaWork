package com.springboot.demo.mycoolapp.restapi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.restapi.dao.PlayerDAO;
import com.springboot.demo.mycoolapp.restapi.entity.Player;

@RestController
@RequestMapping("/football")
public class PlayerRestController {
	
	public PlayerDAO playerDAO;

	/**
	 * @param playerDAO
	 */
	public PlayerRestController(PlayerDAO playerDAO) {
		super();
		this.playerDAO = playerDAO;
	}
	
	@GetMapping("/players")
	public List<Player> findAllPlayer(){
		return playerDAO.findAll();
	}
	

}
