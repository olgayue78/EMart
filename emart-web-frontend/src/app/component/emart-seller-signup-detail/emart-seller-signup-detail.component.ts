import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { ActivatedRoute } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-emart-seller-signup-detail',
  templateUrl: './emart-seller-signup-detail.component.html',
  styleUrls: ['./emart-seller-signup-detail.component.css']
})
export class EmartSellerSignupDetailComponent implements OnInit {

  public userDetail:User = new User();
  public user:User = new User();
  constructor(public activeRouter: ActivatedRoute,
    private loginService:LoginService) { }
  
  ngOnInit() {
    this.user=JSON.parse(this.activeRouter.snapshot.queryParams["user"]);
  }

  signup(){
    debugger
    this.userDetail.email = this.user.email;
    this.userDetail.username = this.user.username;
    this.userDetail.password = this.user.password;
    this.userDetail.userRole = "2";
    this.loginService.signUp(this.userDetail);
  }
}
