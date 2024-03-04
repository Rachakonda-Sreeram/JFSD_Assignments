package com.hexaware.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricket.dto.PlayerDTO;
import com.hexaware.cricket.entity.Player;
import com.hexaware.cricket.exception.PlayerNotFound;
import com.hexaware.cricket.service.IPlayerService;

import jakarta.validation.Valid;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayerController {

	
	@Autowired
	IPlayerService playerService;
	
	@PostMapping("/add")
	public Player addPlayer(@RequestBody @Valid PlayerDTO playerDTO) {
		
		return playerService.addPlayer(playerDTO);
	}
	
	@GetMapping("/getAll")
	public List<Player> getAllPlayers(){
		
		return playerService.getAllPlayers();
	}
	
	@PutMapping("/update")
	public Player updatePlayer(@RequestBody @Valid PlayerDTO playerDTO) throws PlayerNotFound{
		
		return playerService.updatePlayer(playerDTO);
	}
	
	@DeleteMapping("/delete/{playerId}")
	public String deletePlayerbyId(@PathVariable int playerId)throws PlayerNotFound {
		
		return playerService.deletePlayerbyId(playerId);
	}
	
	@GetMapping("/playerId/{playerId}")
	public PlayerDTO getPlayerById(@PathVariable int playerId) throws PlayerNotFound {
		
		return playerService.getPlayerById(playerId);
	}
	
	@GetMapping("/get-Players-Whose-Team-Members-Played-Maximum-Matches")
	public List<Player> getPlayersWhoseTeamPlayedMaximumMatches(){
		return playerService.getPlayersWhoseTeamPlayedMaximumMatches();
	}
	
	
}
