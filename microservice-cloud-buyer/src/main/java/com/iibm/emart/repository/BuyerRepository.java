package com.iibm.emart.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.CartItem;
import com.iibm.emart.entity.PurchaseItem;
import com.iibm.emart.model.ItemDetail;
import com.iibm.emart.model.PurchaseItemDetail;
import com.iibm.emart.model.CartItemDetail;

@Repository
public interface BuyerRepository {
	List<ItemDetail> searchItemsByKeyword(String keyword);
	List<ItemDetail> filterItems(List<String> companyNames, String priceFrom, String priceTo);
	int addCartItem(CartItem cartItem);
	int deleteCartItem(int id, int buyerId);
	List<CartItemDetail> getCartItems(int buyerId);
	int addPurchaseItem(PurchaseItem purchaseItem);
	int deletePurchaseItem(int id, int buyerId);
	List<PurchaseItemDetail> getPurchaseItems(int buyerId);
}
