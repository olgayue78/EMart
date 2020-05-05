import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-emart-seller-navigator',
  templateUrl: './emart-seller-navigator.component.html',
  styleUrls: ['./emart-seller-navigator.component.css']
})
export class EmartSellerNavigatorComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router
    ) { }

  ngOnInit() {
  }

  signOut(){
    this.router.navigate(['/signin']);
  }
}
