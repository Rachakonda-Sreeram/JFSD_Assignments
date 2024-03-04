import { Component, OnInit } from '@angular/core';
import { Player } from '../../Model/Player';
import { PlayerService } from '../../Service/player.service';

@Component({
  selector: 'app-players-max-matches',
  templateUrl: './players-max-matches.component.html',
  styleUrls: ['./players-max-matches.component.css']
})
export class PlayersMaxMatchesComponent implements OnInit {
  players:Player[] = [];
  constructor(private playerService:PlayerService) {}

  ngOnInit(): void {
    this.getPlayersWithMaxMatches();
    
  }

getPlayersWithMaxMatches(){

  this.playerService.getPlayersWithMaxMatches().subscribe(res => {
    console.log(res);
    this.players = res;
  });
  
}


}
