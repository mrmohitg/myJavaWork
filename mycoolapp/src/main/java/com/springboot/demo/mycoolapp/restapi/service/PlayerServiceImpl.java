package com.springboot.demo.mycoolapp.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.demo.mycoolapp.restapi.dao.PlayerDAO;
import com.springboot.demo.mycoolapp.restapi.entity.Player;

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
}
