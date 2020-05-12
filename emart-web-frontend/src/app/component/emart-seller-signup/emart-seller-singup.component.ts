import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-emart-seller-signup',
  templateUrl: './emart-seller-signup.component.html',
  styleUrls: ['./emart-seller-signup.component.css']
})
export class EmartSellerSignupComponent implements OnInit {
  public user:User = new User();
  constructor(
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
  }

  nextClick(){
    this.router.navigate(['/signup-seller-detail'],{queryParams:{user:JSON.stringify(this.user)}});
  }
}
