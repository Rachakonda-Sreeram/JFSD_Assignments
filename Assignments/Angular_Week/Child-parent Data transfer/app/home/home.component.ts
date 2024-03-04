import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
bill:number = 5000;
  constructor(private router: Router){

  }

  doPayment(){
    console.log('Navigating home page to payment');
    this.router.navigate(['/payment/'+this.bill]);
  }

}
