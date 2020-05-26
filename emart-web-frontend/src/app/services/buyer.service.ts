import { Injectable } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { ResponseData } from '../models/ResponseData';

@Injectable({
  providedIn: 'root'
})
export class BuyerService {
  private serviceUrl = 'http://127.0.0.1:9000/api/';
  private searchUrl = '/buyer/search';  // URL to web api

constructor(
  private route: ActivatedRoute,
  private router: Router,
  private httpClient: HttpClient) { }

  search(keyword) {
    const params = new HttpParams().set('keyword', keyword);
    const findhttpOptions = {
      headers: new HttpHeaders({ 'content-Type': 'application/json' }),
      params: params
    }
    return this.httpClient.get<ResponseData>(this.searchUrl, findhttpOptions)
      .subscribe(
        data => {
          if (data.code === 200) {
            console.log("data", data);;
          } else {
            alert(data.data.errors[0]);
          }
        },
        error => {
          console.log("Error", error);;
        }
      );
  }

  
  filter(filterCondition) {
    debugger
    const params = new HttpParams().set('filterCondition', JSON.stringify(filterCondition));
    const findhttpOptions = {
      headers: new HttpHeaders({ 'content-Type': 'application/json' }),
      params: params
    }
    return this.httpClient.get<ResponseData>(this.searchUrl, findhttpOptions)
      .subscribe(
        data => {
          if (data.code === 200) {
            console.log("data", data);;
          } else {
            alert(data.data.errors[0]);
          }
        },
        error => {
          console.log("Error", error);;
        }
      );
  }
}
