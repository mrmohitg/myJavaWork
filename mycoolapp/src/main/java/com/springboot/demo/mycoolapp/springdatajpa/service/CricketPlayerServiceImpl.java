package com.springboot.demo.mycoolapp.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.demo.mycoolapp.springdatajpa.entity.CricketPlayer;
import com.springboot.demo.mycoolapp.springdatajpa.repo.CricketPlayerRepository;

@Service
public class CricketPlayerServiceImpl implements CricketPlayerService{
	
	private CricketPlayerRepository cricketPlayerRepository;
	
	
	/**
	 * @param playerRepository
	 */
	public CricketPlayerServiceImpl(CricketPlayerRepository cricketPlayerRepository) {
		super();
		this.cricketPlayerRepository = cricketPlayerRepository;
	}

	@Override
	public List<CricketPlayer> findAll() {
		return cricketPlayerRepository.findAll();
	}

	@Override
	public CricketPlayer findById(int id) {
		Optional<CricketPlayer> result = cricketPlayerRepository.findById(id);
		CricketPlayer cricketPlayer = null;
		if(result.isPresent()) {
			cricketPlayer = result.get();
		} else {
			throw new RuntimeException("Did not find cricketer with id : "+id);
		}
		return cricketPlayer;
	}

	@Override
	public CricketPlayer save(CricketPlayer player) {
		return cricketPlayerRepository.save(player);
	}

	@Override
	public void deleteById(int id) {
		cricketPlayerRepository.deleteById(id);
	}
}
