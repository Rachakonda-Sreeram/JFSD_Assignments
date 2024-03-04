package com.hexaware.cricket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cricket.entity.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
	
	@Query(value = "select player_id,player_name,jersey_number, role,total_matches,team_name,country_name,description from player where team_name =(select team_name from player group by team_name order by sum(total_matches) desc limit 1)"
			,nativeQuery=true)
	List<Player> getPlayersWhoseTeamPlayedMaximumMatches();
	
}
// select * from player where team_name =(select team_name,sum(total_matches) as tm
// from player group by team_name having sum(total_matches)=select max(tm) from
//select(total_matches)from player group by team_name)


// get players from team whose members played maximum number of matches