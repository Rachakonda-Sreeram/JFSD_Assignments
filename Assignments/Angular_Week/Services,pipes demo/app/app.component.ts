import { Component } from '@angular/core';
import { UserService } from './user.service';
import {User} from  './user';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})



export class AppComponent {
  title = 'webApp';
  userList:User[] = [];
  constructor(private userService:UserService){


  }

  getAll(){

    this.userList = this.userService.getAllUsers();
  }




}
