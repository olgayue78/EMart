import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/models/user';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-emart-seller-signup',
  templateUrl: './emart-seller-signup.component.html',
  styleUrls: ['./emart-seller-signup.component.css']
})
export class EmartSellerSignupComponent implements OnInit {
  public user:User = new User();
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private loginService:LoginService) { }

  ngOnInit() {
  }

  nextClick(){
    this.router.navigate(['/signup-seller-detail'],{queryParams:{user:JSON.stringify(this.user)}});
  }

  signUp(){
    this.loginService.signUp(this.user);
  }
}
