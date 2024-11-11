package com.ruipereira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruipereira.dslist.dto.GameMinDTO.GameMinDTO;
import com.ruipereira.dslist.entities.Game;
import com.ruipereira.dslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDTO> findAll()
	{
		List<Game> result =  gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
