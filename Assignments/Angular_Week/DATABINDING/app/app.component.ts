import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'First angular Session.';
  id:number = 101;
  name:String = "Employee 1";
  hello(){

    alert('This is Hello method.')
  }
}
