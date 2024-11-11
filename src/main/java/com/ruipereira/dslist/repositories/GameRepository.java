package com.ruipereira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruipereira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
   
}
