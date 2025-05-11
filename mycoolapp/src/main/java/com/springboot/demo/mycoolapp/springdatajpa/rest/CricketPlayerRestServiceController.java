package com.springboot.demo.mycoolapp.springdatajpa.rest;

import java.util.List;
import java.util.Map;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.springboot.demo.mycoolapp.springdatajpa.entity.CricketPlayer;
import com.springboot.demo.mycoolapp.springdatajpa.service.CricketPlayerService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cricketService")
public class CricketPlayerRestServiceController {

	public CricketPlayerService cricketPlayerService;

	private ObjectMapper objectMapper;

	/**
	 * @param cricketPlayerService
	 * @param objectMapper
	 */
	public CricketPlayerRestServiceController(CricketPlayerService cricketPlayerService, ObjectMapper objectMapper) {
		super();
		this.cricketPlayerService = cricketPlayerService;
		this.objectMapper = objectMapper;
	}

	@GetMapping("/playersService")
	public List<CricketPlayer> getAllPlayer() {
		return cricketPlayerService.findAll();
	}

	@GetMapping("/playersService/{playerId}")
	public CricketPlayer getSinglePlayer(@PathVariable int playerId) {
		CricketPlayer player = cricketPlayerService.findById(playerId);
		if (player == null) {
			throw new RuntimeException("Player not found.");
		}
		return player;
	}

	@PostMapping("/playersService")
	public CricketPlayer addPlayer(@RequestBody CricketPlayer player) {
		player.setId(0);
		return cricketPlayerService.save(player);
	}

	@PutMapping("/playersService")
	public CricketPlayer updatePlayer(@RequestBody CricketPlayer player) {
		return cricketPlayerService.save(player);
	}

	@PatchMapping("/playersService/{playerId}")
	public CricketPlayer partialUpdatePlayer(@PathVariable int playerId, @RequestBody Map<String, Object> patchPayload) {
		CricketPlayer tempPlayer = cricketPlayerService.findById(playerId);
		if (tempPlayer == null) {
			throw new RuntimeException("Player not found.");
		}
		if (patchPayload.containsKey("id")) {
			throw new RuntimeException("Player id not allowed in request body. " + playerId);
		}
		CricketPlayer patchedPlayer = apply(patchPayload, tempPlayer);
		return cricketPlayerService.save(patchedPlayer);
	}

	private CricketPlayer apply(Map<String, Object> patchPayload, CricketPlayer tempPlayer) {
		ObjectNode tempPlayerNode = objectMapper.convertValue(tempPlayer, ObjectNode.class);
		ObjectNode patchPayPayloadNode = objectMapper.convertValue(patchPayload, ObjectNode.class);
		tempPlayerNode.setAll(patchPayPayloadNode);
		return objectMapper.convertValue(tempPlayerNode, CricketPlayer.class);
	}

	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

	@DeleteMapping("/playersService/{playerId}")
	public String deletePlayer(@PathVariable int playerId) {
		CricketPlayer player = cricketPlayerService.findById(playerId);
		if (player == null) {
			throw new RuntimeException("Player id not found. " +playerId);
		}
		cricketPlayerService.deleteById(playerId);
		return "Player "+player.getName()+" is deleted from the table.";
	}
}
