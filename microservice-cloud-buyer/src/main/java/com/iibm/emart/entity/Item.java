package com.iibm.emart.entity;

public class Item {
	long id;
	String itemName;
	String sellerName;
	long categoryId;
	long subcategoryId;
	float price;
	int stockNmuber;
	float discount;
	String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public long getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(long subcategoryId) {
		this.subcategoryId = subcategoryId;
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
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
