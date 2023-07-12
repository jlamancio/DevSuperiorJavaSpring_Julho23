package com.DevSuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
