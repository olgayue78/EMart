import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient, HttpParams } from '@angular/common/http';
import { User } from '../models/user';
import { catchError } from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'my-auth-token'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private serviceUrl = 'http://127.0.0.1:7900';
  private loginUrl = '/login';  // URL to web api

  constructor(private httpClient: HttpClient) {
  }

  login (user){
    debugger
    const params = new HttpParams({
      fromString: 'user'+user
    });
    const findhttpOptions = {
      headers: new HttpHeaders({'content-Type': 'application/json'}),
      params: params
    }
    return this.httpClient.get<User>(this.serviceUrl + this.loginUrl,findhttpOptions)
    .subscribe(
    data => {
    console.log("PUT Request is successful ", data);
    },
    error => {
    console.log("Error", error);
    }
    );
  }

}

