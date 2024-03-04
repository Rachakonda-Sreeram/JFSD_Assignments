import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Player } from '../Model/Player';
@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  baseURL:String = "http://localhost:8080/api/players";
  

  constructor(private http:HttpClient) { }

  getPlayersWithMaxMatches(): Observable<Player[]>{
    return this.http.get<Player[]>(this.baseURL+"/get-Players-Whose-Team-Members-Played-Maximum-Matches");
  }

  getPlayers(): Observable<Player[]>{
    return this.http.get<Player[]>(this.baseURL+"/getAll");
  }

  updatePlayer(Player: Player): Observable<Player>{
    return this.http.put<Player>(this.baseURL+"/update", Player);
  }



}
