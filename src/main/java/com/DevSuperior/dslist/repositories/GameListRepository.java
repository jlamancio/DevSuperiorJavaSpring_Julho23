package com.DevSuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
