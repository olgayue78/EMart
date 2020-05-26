import { Injectable } from '@angular/core';
import { ResponseData } from '../models/ResponseData';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SellerService {
  private serviceUrl = 'http://127.0.0.1:9000/api';
  private addUrl = '/seller/Item';  // URL to web api
  private searchUrl = '/seller/Items';  // URL to web api
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private httpClient: HttpClient) { }
  
  addItem(item) {
    const params = new HttpParams().set('item', JSON.stringify(item))
    const findhttpOptions = {
     headers: new HttpHeaders({ 'content-Type': 'application/json' }),
     params: params
   }
     return this.httpClient.put<ResponseData>(this.serviceUrl + this.addUrl, JSON.stringify(item), findhttpOptions)
     .subscribe(
       data => {
         if (data.code === 200) {
             this.router.navigate(['/emart-view-stock']);
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
