import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent {
  name:any =[];

  constructor(private route:ActivatedRoute){

    route.params.subscribe(params => this.name = params['username']);


  }

}
