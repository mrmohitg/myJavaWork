package com.springboot.demo.mycoolapp.restapi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.demo.mycoolapp.restapi.entity.Player;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class PlayerDAOJpaImpl implements PlayerDAO{
	
	private EntityManager entityManager;
	
	public PlayerDAOJpaImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Player> findAll() {
		TypedQuery<Player> theQuery = entityManager.createQuery("SELECT p FROM Player p",Player.class);
		return theQuery.getResultList();
	}

	@Override
	public Player findById(int id) {
		return entityManager.find(Player.class, id);
	}

	@Override
	public Player save(Player player) {
		return entityManager.merge(player);
	}

	@Override
	public void deleteById(int id) {
		Player player = entityManager.find(Player.class, id);
		entityManager.remove(player);
	}
}
