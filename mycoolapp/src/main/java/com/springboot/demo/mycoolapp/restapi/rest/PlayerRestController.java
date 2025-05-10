package com.springboot.demo.mycoolapp.restapi.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.restapi.entity.Player;

@RestController
@RequestMapping("/player")
public class PlayerRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/footballers")
	public List<Player> getPlayers() {
		List<Player> players = new ArrayList<>();
		players.add(new Player("Ronaldinho",""));
		players.add(new Player("Ronaldo",""));
		players.add(new Player("Kaka",""));
		players.add(new Player("Rivaldo",""));
		players.add(new Player("Roberto","Carlos"));
		players.add(new Player("Robinho",""));
		players.add(new Player("Pele",""));
		players.add(new Player("Zico",""));
		return players;
	}
	
	@GetMapping("/footballers/{playerId}")
	public Player getPlayer(@PathVariable  int playerId) {
		List<Player> players = new ArrayList<>();
		players.add(new Player("Ronaldinho",""));
		players.add(new Player("Ronaldo",""));
		players.add(new Player("Kaka",""));
		players.add(new Player("Rivaldo",""));
		players.add(new Player("Roberto","Carlos"));
		players.add(new Player("Robinho",""));
		players.add(new Player("Pele",""));
		players.add(new Player("Zico",""));
		return players.get(playerId);
	}
	
}
