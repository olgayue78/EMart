import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-emart-customer-signup',
  templateUrl: './emart-customer-signup.component.html',
  styleUrls: ['./emart-customer-signup.component.css']
})
export class EmartCustomerSignupComponent implements OnInit {
  public user:User = new User();
  constructor(
    private loginService:LoginService) { }

  ngOnInit() {
    this.user.userRole="1";
  }

  signUp(){
    this.loginService.signUp(this.user);
  }
}
