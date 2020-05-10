import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-emart-login',
  templateUrl: './emart-login.component.html',
  styleUrls: ['./emart-login.component.css']
})
export class EmartLoginComponent implements OnInit {
  public email:any;
  public password:any;
  public role:any;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private loginService:LoginService) {
   }

  ngOnInit() {
    this.email="";
    this.password="";
    this.role="1";
  }
  
  signIn(){
    let user:User;
    this.loginService.login(user);
    // if(this.role === "1"){
    //   this.router.navigate(['/emart-customer-index']);
    // } else {
    //   this.router.navigate(['/emart-view-stock']);
    // }
  }
}
