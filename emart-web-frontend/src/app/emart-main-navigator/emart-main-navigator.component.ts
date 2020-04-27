import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-emart-main-navigator',
  templateUrl: './emart-main-navigator.component.html',
  styleUrls: ['./emart-main-navigator.component.css']
})
export class EmartMainNavigatorComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
  }

  search(){
    this.router.navigate(['/emart-search-results']);
  }
}
