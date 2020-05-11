import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

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
    private loginService:LoginService) {
   }

  ngOnInit() {
    this.email="";
    this.password="";
    this.role="1";
  }
  
  signIn(){
    this.loginService.login(this.email, this.password, this.role);
  }
}
