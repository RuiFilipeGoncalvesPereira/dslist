package com.ruipereira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruipereira.dslist.dto.GameMinDTO.GameDTO;
import com.ruipereira.dslist.dto.GameMinDTO.GameMinDTO;
import com.ruipereira.dslist.entities.Game;
import com.ruipereira.dslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll()
	{
		List<Game> result =  gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long Id)
	{
		Game result = gameRepository.findById(Id).get();
		return new GameDTO(result);
	}
	
	

}
