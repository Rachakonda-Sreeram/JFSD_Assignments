import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input()
  myInput:String = '';


myOutput:String = "Hello parent I am Child";
  @Output()
  myEventEmitter:EventEmitter<String>= new EventEmitter();

  ngOnInit(){

    console.log("child received the data, "+this.myInput);
  }

  sendChildData(){
    this.myEventEmitter.emit(this.myOutput);
  }
}
