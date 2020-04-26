import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-emart-login',
  templateUrl: './emart-login.component.html',
  styleUrls: ['./emart-login.component.css']
})
export class EmartLoginComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router) {
   }

  ngOnInit() {
  }
  
  gotoSignup() {
    // Pass along the hero id if available
    // so that the HeroList component can select that hero.
    // Include a junk 'foo' property for fun.
    this.router.navigate(['/singup/customer', {}]);
  }
}
