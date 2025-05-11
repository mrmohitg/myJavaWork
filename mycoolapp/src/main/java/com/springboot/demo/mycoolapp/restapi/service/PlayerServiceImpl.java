package com.springboot.demo.mycoolapp.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.demo.mycoolapp.restapi.dao.PlayerDAO;
import com.springboot.demo.mycoolapp.restapi.entity.Player;

import jakarta.transaction.Transactional;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	private PlayerDAO playerDao;

	/**
	 * @param playerDao
	 */
	public PlayerServiceImpl(PlayerDAO playerDao) {
		super();
		this.playerDao = playerDao;
	}

	@Override
	public List<Player> findAll() {
		return playerDao.findAll();
	}

	@Override
	public Player findById(int id) {
		return playerDao.findById(id);
	}

	@Override
	@Transactional
	public Player save(Player player) {
		return playerDao.save(player);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		playerDao.deleteById(id);
	}
}
