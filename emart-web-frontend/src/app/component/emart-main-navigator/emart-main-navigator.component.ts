import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BuyerService } from 'src/app/services/buyer.service';

@Component({
  selector: 'app-emart-main-navigator',
  templateUrl: './emart-main-navigator.component.html',
  styleUrls: ['./emart-main-navigator.component.css']
})
export class EmartMainNavigatorComponent implements OnInit {
  public keyword:string;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private buyerService:BuyerService) { }

  ngOnInit() {
  }

  search(){
    this.router.navigate(['/emart-search-results']);
    this.buyerService.search(this.keyword);
  }
}
