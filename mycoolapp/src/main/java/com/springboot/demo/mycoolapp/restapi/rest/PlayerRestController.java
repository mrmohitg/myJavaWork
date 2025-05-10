package com.springboot.demo.mycoolapp.restapi.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.restapi.entity.Player;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/player")
public class PlayerRestController {
	
	private List<Player> players;
	
	@PostConstruct
	public void loadData() {
		players = new ArrayList<>();
		players.add(new Player("Ronaldinho",""));
		players.add(new Player("Ronaldo",""));
		players.add(new Player("Kaka",""));
		players.add(new Player("Rivaldo",""));
		players.add(new Player("Roberto","Carlos"));
		players.add(new Player("Robinho",""));
		players.add(new Player("Pele",""));
		players.add(new Player("Zico",""));
		players.add(new Player("Garrincha",""));
		players.add(new Player("Romario",""));
		players.add(new Player("Neymar",""));
		players.add(new Player("Didi",""));
		players.add(new Player("Jairzinho",""));
		players.add(new Player("Socrates",""));
		players.add(new Player("Cafu",""));
		players.add(new Player("Falcao",""));
		players.add(new Player("Rivelino",""));
		players.add(new Player("Gerson",""));
		players.add(new Player("Marcelo",""));
		players.add(new Player("Taffarel",""));
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/footballers")
	public List<Player> getPlayers() {
		return players;
	}
	
	@GetMapping("/footballers/{playerId}")
	public Player getPlayer(@PathVariable  int playerId) {
		if(playerId<0 || playerId >=players.size()) {
			throw(new PlayerNotFoundException("Player id "+ playerId+" not found "));
		}
		return players.get(playerId);
	}	
}
