import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webApp';
  parentData: String = "HI this is Parent data";
  childDataReceived = "";

  getChildData(data:any){
    console.log(data);
    this.childDataReceived = data;

  }
}
