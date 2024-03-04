package com.hexaware.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricket.dto.PlayerDTO;
import com.hexaware.cricket.entity.Player;
import com.hexaware.cricket.exception.PlayerNotFound;
import com.hexaware.cricket.repository.PlayerRepository;


@Service
public class PlayerServiceImpl implements IPlayerService {
	
	
	@Autowired
	PlayerRepository playerRepository;
	

	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		
		Player player = new Player();
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountryName(playerDTO.getCountryName());
		player.setDescription(playerDTO.getDescription());
		
		return playerRepository.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		
		return playerRepository.findAll();
	}

	@Override
	public Player updatePlayer(PlayerDTO playerDTO) throws PlayerNotFound {
		
		Player player = playerRepository.findById(playerDTO.getPlayerId()).orElse(null);
		if(player == null) {
			 throw new PlayerNotFound("Player with playerId " + playerDTO.getPlayerId() + " not found");
		}else {
		
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountryName(playerDTO.getCountryName());
		player.setDescription(playerDTO.getDescription());
		
		return playerRepository.save(player);
	}
	}
	@Override
	public PlayerDTO getPlayerById(int playerId) throws PlayerNotFound{
		
		Player player = playerRepository.findById(playerId).orElse(null);
		 if (player == null) {
		        throw new PlayerNotFound("Player with playerId " + playerId + " not found");
		    }
		PlayerDTO playerDTO = new PlayerDTO();
		playerDTO.setPlayerId(player.getPlayerId());
		playerDTO.setPlayerName(player.getPlayerName());
		playerDTO.setJerseyNumber(player.getJerseyNumber());
		playerDTO.setRole(player.getRole());
		playerDTO.setTotalMatches(player.getTotalMatches());
		playerDTO.setTeamName(player.getTeamName());
		playerDTO.setCountryName(player.getCountryName());
		playerDTO.setDescription(player.getDescription());
		return playerDTO;
	}

	@Override
	public String deletePlayerbyId(int playerId) throws PlayerNotFound {
		
		Player player = playerRepository.findById(playerId).orElse(null);
		 if (player == null) {
		        throw new PlayerNotFound("Player with playerId " + playerId + " not found");
		    }
		
		playerRepository.deleteById(playerId);
		
		return "Player with playerId: "+playerId+" got deleted.";
	}

	@Override
	public List<Player> getPlayersWhoseTeamPlayedMaximumMatches() {
		// TODO Auto-generated method stub
		return playerRepository.getPlayersWhoseTeamPlayedMaximumMatches();
	}

	


}
