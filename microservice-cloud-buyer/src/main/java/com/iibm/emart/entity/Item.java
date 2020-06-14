package com.iibm.emart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="item",catalog="testdb")
@DynamicUpdate
public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	int id;
    @Column(name="item_name")
	String itemName;
    @Column(name="category")
	String category;
    @Column(name="subcategory")
	String subcategory;
    @Column(name="price")
	float price;
    @Column(name="stock_nmuber")
	int stockNmuber;
    @Column(name="description", columnDefinition="text")
	String description;
    @Column(name="seller_id")
	int sellerid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStockNmuber() {
		return stockNmuber;
	}
	public void setStockNmuber(int stockNmuber) {
		this.stockNmuber = stockNmuber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	
}
