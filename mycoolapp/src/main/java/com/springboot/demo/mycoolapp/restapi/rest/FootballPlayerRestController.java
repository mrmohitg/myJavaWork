package com.springboot.demo.mycoolapp.restapi.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.restapi.entity.FootballPlayer;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/player")
public class FootballPlayerRestController {
	
	private List<FootballPlayer> players;
	
	@PostConstruct
	public void loadData() {
		players = new ArrayList<>();
		players.add(new FootballPlayer("Ronaldinho",""));
		players.add(new FootballPlayer("Ronaldo",""));
		players.add(new FootballPlayer("Kaka",""));
		players.add(new FootballPlayer("Rivaldo",""));
		players.add(new FootballPlayer("Roberto","Carlos"));
		players.add(new FootballPlayer("Robinho",""));
		players.add(new FootballPlayer("Pele",""));
		players.add(new FootballPlayer("Zico",""));
		players.add(new FootballPlayer("Garrincha",""));
		players.add(new FootballPlayer("Romario",""));
		players.add(new FootballPlayer("Neymar",""));
		players.add(new FootballPlayer("Didi",""));
		players.add(new FootballPlayer("Jairzinho",""));
		players.add(new FootballPlayer("Socrates",""));
		players.add(new FootballPlayer("Cafu",""));
		players.add(new FootballPlayer("Falcao",""));
		players.add(new FootballPlayer("Rivelino",""));
		players.add(new FootballPlayer("Gerson",""));
		players.add(new FootballPlayer("Marcelo",""));
		players.add(new FootballPlayer("Taffarel",""));
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/footballers")
	public List<FootballPlayer> getPlayers() {
		return players;
	}
	
	@GetMapping("/footballers/{playerId}")
	public FootballPlayer getPlayer(@PathVariable  int playerId) {
		if(playerId<0 || playerId >=players.size()) {
			throw(new FootballPlayerNotFoundException("Player id "+ playerId+" not found "));
		}
		return players.get(playerId);
	}	
}
