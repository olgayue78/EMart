import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-emart-seller-signup',
  templateUrl: './emart-seller-signup.component.html',
  styleUrls: ['./emart-seller-signup.component.css']
})
export class EmartSellerSignupComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
  }

  nextClick(){
    this.router.navigate(['/signup-seller-detail']);
  }
}
