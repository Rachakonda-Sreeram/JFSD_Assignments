package com.hexaware.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public class Player {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "playerId sequence")
    @SequenceGenerator(name = "playerId sequence", sequenceName = "PlayerId_Sequence_Generator",initialValue = 108, allocationSize = 1)
   
	private int playerId;
	@NotBlank
	private String playerName;
	@Positive
	@Column(unique=true)
	private int jerseyNumber;
	@NotBlank
    @Pattern(regexp = "^(Batsman|Bowler|Keeper|All Rounder)$")
	private String role;
	@PositiveOrZero
	private int totalMatches;
	@NotBlank
	private String teamName;
	@NotBlank
	private String countryName;
	@NotBlank
	private String description;
	
	
	public Player() {
		super();
	}
	
	
	public Player(int playerId, @NotBlank String playerName, @Positive int jerseyNumber,
			@NotBlank @Pattern(regexp = "^(Batsman|Bowler|Keeper|All Rounder)$") String role,
			@PositiveOrZero int totalMatches, @NotBlank String teamName, @NotBlank String countryName,
			@NotBlank String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}
	
	
	public int getPlayerId() {
		return playerId;
	}
	
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	
	public String getRole() {
		return role;
	}
	
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public int getTotalMatches() {
		return totalMatches;
	}
	
	
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	
	
	public String getTeamName() {
		return teamName;
	}
	
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	public String getCountryName() {
		return countryName;
	}
	
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", countryName="
				+ countryName + ", description=" + description + "]";
	}

}
