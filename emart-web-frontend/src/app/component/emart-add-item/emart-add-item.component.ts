import { Component, OnInit } from '@angular/core';
import { SellerService } from 'src/app/services/seller.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Item } from 'src/app/models/item';

@Component({
  selector: 'app-emart-add-item',
  templateUrl: './emart-add-item.component.html',
  styleUrls: ['./emart-add-item.component.css']
})
export class EmartAddItemComponent implements OnInit {

  public imagePath;
  public item:Item =  new Item();
  imgURLs:Array<string> = [];
  imgUrl: any;
  public message: string;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private sellerService:SellerService) { }

  ngOnInit() {
  }

  fileChange(files) {
    if (files.length === 0) {
      return;
    }

    const reader = new FileReader();
    this.imagePath = files;
    for (var i=0; i<files.length;i++) {
      reader.readAsDataURL(files[i]);
      reader.onload = () => {
        this.imgUrl = reader.result;
        this.imgURLs.push(this.imgUrl);
      };
      

    }
  }

  addItem(){
    this.sellerService.addItem(this.item);
  }
}
