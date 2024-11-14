package com.ruipereira.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruipereira.dslist.dto.GameMinDTO.GameListDto;
import com.ruipereira.dslist.dto.GameMinDTO.GameMinDTO;
import com.ruipereira.dslist.dto.GameMinDTO.ReplacementDto;
import com.ruipereira.dslist.services.GameListService;
import com.ruipereira.dslist.services.GameService;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {
   
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDto> findAll()
	{
		List<GameListDto> result = gameListService.findAll();
		return result;
	}
	@GetMapping(value = "/{listid}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listid)
	{
		List<GameMinDTO> result = gameService.findbyList(listid);
		return result;
	}
	@PostMapping(value = "/{listid}/replacement")
	public void move(@PathVariable Long listid, @RequestBody ReplacementDto body)
	{
		gameListService.move(listid, body.getSourceIndex(), body.getDestinationIndex());
	}

}
