package com.hexaware.cricket.service;

import java.util.List;

import com.hexaware.cricket.dto.PlayerDTO;
import com.hexaware.cricket.entity.Player;
import com.hexaware.cricket.exception.PlayerNotFound;

public interface IPlayerService {
	
	public Player addPlayer(PlayerDTO playerDTO);
	public List<Player> getAllPlayers();
	public Player updatePlayer(PlayerDTO playerDTO)throws PlayerNotFound;
	public PlayerDTO getPlayerById(int playerId) throws PlayerNotFound;
	public String deletePlayerbyId(int playerId) throws PlayerNotFound;
	public List<Player> getPlayersWhoseTeamPlayedMaximumMatches();
}
