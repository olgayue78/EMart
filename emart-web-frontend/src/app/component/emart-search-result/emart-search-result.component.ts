import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BuyerService } from 'src/app/services/buyer.service';

@Component({
  selector: 'app-emart-search-result',
  templateUrl: './emart-search-result.component.html',
  styleUrls: ['./emart-search-result.component.css']
})
export class EmartSearchResultComponent implements OnInit {
  public filterCondition:any = {companyNames:[],priceForm:'',priceTo:''}
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private buyerService:BuyerService) { }

  ngOnInit() {
  }

  filter(){
    this.buyerService.filter(this.filterCondition);
  }
}
