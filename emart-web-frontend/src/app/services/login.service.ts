import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient, HttpParams } from '@angular/common/http';
import { catchError } from 'rxjs/operators';
import { ActivatedRoute, Router } from '@angular/router';
import { ResponseData } from '../models/ResponseData';
import { User } from '../models/user';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Authorization': 'my-auth-token'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private serviceUrl = 'http://127.0.0.1:7900';
  private loginUrl = '/login';  // URL to web api
  private signupUrl = '/signup';  // URL to web api

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private httpClient: HttpClient) {
  }

  login(email, password, userRole) {
    const params = new HttpParams().set('email', email).set('password', password).set('userRole', userRole);
    const findhttpOptions = {
      headers: new HttpHeaders({ 'content-Type': 'application/json' }),
      params: params
    }
    return this.httpClient.get<ResponseData>(this.serviceUrl + this.loginUrl, findhttpOptions)
      .subscribe(
        data => {
          if (data.code === 200) {
            if (userRole === "1") {
              this.router.navigate(['/emart-customer-index']);
            } else {
              this.router.navigate(['/emart-view-stock']);
            }
          } else {
            alert(data.data.errors[0]);
          }
        },
        error => {
          console.log("Error", error);;
        }
      );
  }
  signUp(user:User){
   const params = new HttpParams().set('user', JSON.stringify(user))
   const findhttpOptions = {
    headers: new HttpHeaders({ 'content-Type': 'application/json' }),
  }
    return this.httpClient.post<ResponseData>(this.serviceUrl + this.signupUrl, JSON.stringify(user), findhttpOptions)
    .subscribe(
      data => {
        if (data.code === 200) {
            this.router.navigate(['/signin']);
        } else {
          alert(data.data.errors[0]);
        }
      },
      error => {
        console.log("Error", error);
      }
    );
  }
}

