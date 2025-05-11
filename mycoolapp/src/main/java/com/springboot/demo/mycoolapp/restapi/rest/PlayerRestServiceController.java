package com.springboot.demo.mycoolapp.restapi.rest;

import java.util.List;
import java.util.Map;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.springboot.demo.mycoolapp.restapi.entity.Player;
import com.springboot.demo.mycoolapp.restapi.service.PlayerService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/footballService")
public class PlayerRestServiceController {
	
	public PlayerService playerService;
	
	private ObjectMapper objectMapper;
	
	

	/**
	 * @param playerService
	 * @param objectMapper
	 */
	public PlayerRestServiceController(PlayerService playerService, ObjectMapper objectMapper) {
		super();
		this.playerService = playerService;
		this.objectMapper = objectMapper;
	}

	@GetMapping("/playersService")
	public List<Player> getAllPlayer(){
		return playerService.findAll();
	}
	
	@GetMapping("/playersService/{playerId}")
	public Player getSinglePlayer(@PathVariable int playerId){
		Player player = playerService.findById(playerId);
		if(player == null) {
			throw new RuntimeException("Player not found.");
		}
		return player;
	}
	
	@PostMapping("/playersService")
	
	public Player addPlayer(@RequestBody Player player) {
		player.setId(0);
		return playerService.save(player);
	}
	
	@PutMapping("/playersService")
	public Player updatePlayer(@RequestBody Player player){
		return playerService.save(player);
	}
	
	@PatchMapping("/playersService/{playerId}")
	public Player partialUpdatePlayer(@PathVariable int playerId, @RequestBody Map<String,Object> patchPayload){
		Player tempPlayer = playerService.findById(playerId);
		if(tempPlayer == null)
		{
			throw new RuntimeException("Player not found.");
		}
		if(patchPayload.containsKey("id")) {
			throw new RuntimeException("Player id not allowed in request body. "+playerId);
		}
		Player patchedPlayer = apply(patchPayload, tempPlayer);
		return playerService.save(patchedPlayer);
	}

	private Player apply(Map<String, Object> patchPayload, Player tempPlayer) {
		ObjectNode tempPlayerNode = objectMapper.convertValue(tempPlayer, ObjectNode.class);
		ObjectNode patchPayPayloadNode = objectMapper.convertValue(patchPayload, ObjectNode.class);
		tempPlayerNode.setAll(patchPayPayloadNode);
		return objectMapper.convertValue(tempPlayerNode, Player.class);
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
}
