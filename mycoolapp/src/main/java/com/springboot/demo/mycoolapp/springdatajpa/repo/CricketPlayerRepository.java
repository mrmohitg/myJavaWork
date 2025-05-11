package com.springboot.demo.mycoolapp.springdatajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.mycoolapp.springdatajpa.entity.CricketPlayer;

public interface CricketPlayerRepository extends JpaRepository<CricketPlayer, Integer>{

}
