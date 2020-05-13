package com.iibm.emart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iibm.emart.entity.CartItem;
import com.iibm.emart.entity.PurchaseItem;
import com.iibm.emart.model.CartItemDetail;
import com.iibm.emart.model.ItemDetail;
import com.iibm.emart.model.PurchaseItemDetail;
import com.iibm.emart.repository.BuyerRepository;

@Service
public class BuyerService {
	
	@Autowired
	BuyerRepository buyerRepository;
	
	public  List<ItemDetail> searchItemsByKeyword(String keyword) {
		return buyerRepository.searchItemsByKeyword(keyword);
	}
	
	public  List<ItemDetail> filterItems(List<String> companyNames, String priceFrom, String priceTo) {
		return buyerRepository.filterItems(companyNames, priceFrom, priceTo);
	}
	
	public int addCartItem(CartItem cartItem) {
		return buyerRepository.addCartItem(cartItem);
	}
	
	public List<CartItemDetail> getCartItems(int buyerId){
		return buyerRepository.getCartItems(buyerId);
	}
	
	public int deleteCartItem(int itemId, int buyerId) {
		return buyerRepository.deleteCartItem(itemId, buyerId);
	}
	
	public int addPurchaseItem(PurchaseItem purchaseItem) {
		return buyerRepository.addPurchaseItem(purchaseItem);
	}
	
	public List<PurchaseItemDetail> getPurchaseItems(int buyerId){
		return buyerRepository.getPurchaseItems(buyerId);
	}
	
	public int deletePurchaseItem(int purchaseItem, int buyerId) {
		return buyerRepository.deletePurchaseItem(purchaseItem, buyerId);
	}
}
