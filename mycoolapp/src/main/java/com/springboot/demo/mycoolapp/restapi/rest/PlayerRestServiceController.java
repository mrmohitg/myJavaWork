package com.springboot.demo.mycoolapp.restapi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.restapi.dao.PlayerDAO;
import com.springboot.demo.mycoolapp.restapi.entity.Player;
import com.springboot.demo.mycoolapp.restapi.service.PlayerService;

@RestController
@RequestMapping("/footballService")
public class PlayerRestServiceController {
	
	public PlayerService playerService;
	
	/**
	 * @param playerService
	 */
	public PlayerRestServiceController(PlayerService playerService) {
		super();
		this.playerService = playerService;
	}

	@GetMapping("/playersService")
	public List<Player> getAllPlayer(){
		return playerService.findAll();
	}
	
	@GetMapping("/playersService/{playerId}")
	public Player getSinglePlayer(@PathVariable int playerId){
		Player player = playerService.findById(playerId);
		if(player == null) {
			throw new RuntimeException("Player id not found.");
		}
		return player;
	}
	
}
