package com.ruipereira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruipereira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
   
}
