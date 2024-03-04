import { Component, OnInit } from '@angular/core';
import { Player } from '../../Model/Player';
import { PlayerService } from '../../Service/player.service';

@Component({
  selector: 'app-update-matches',
  templateUrl: './update-matches.component.html',
  styleUrls: ['./update-matches.component.css']
})
export class UpdateMatchesComponent implements OnInit {

  players:Player[] = [];
  constructor(private playerService:PlayerService){}
  ngOnInit() {
    this.getAllPlayers();
    
  }
  getAllPlayers(){
    this.playerService.getPlayers().subscribe(res => {
      console.log(res);
      this.players = res;
    });
  }
  updatePlayer(player: Player){
    if (player.totalMatches < 0) {
      alert("Matches played should be minimum zero.");
    } else {
    this.playerService.updatePlayer(player).subscribe(res => {
      console.log(res);
      alert('Total Matches updated')
      this.getAllPlayers();
    });
  }
  }




}
