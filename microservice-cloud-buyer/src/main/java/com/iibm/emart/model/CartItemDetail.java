package com.iibm.emart.model;

public class CartItemDetail {
	int itemId;
	String itemName;
	float price;
	int qty;
    float tax;
	String bussinessName;
	int buyerId;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public String getBussinessName() {
		return bussinessName;
	}
	public void setBussinessName(String bussinessName) {
		this.bussinessName = bussinessName;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

}
