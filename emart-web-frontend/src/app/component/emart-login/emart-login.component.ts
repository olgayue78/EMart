import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

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
    private router: Router) {
   }

  ngOnInit() {
    this.email="";
    this.password="";
    this.role="1";
  }
  
  signIn(){
    if(this.role === "1"){
      this.router.navigate(['/emart-customer-index']);
    } else {
      this.router.navigate(['/emart-view-stock']);
    }
  }
}
