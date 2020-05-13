package com.iibm.emart.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.CartItem;
import com.iibm.emart.model.ItemDetail;

@Repository
public interface BuyerRepository {
	List<ItemDetail> searchItemsByKeyword(String keyword);
	List<ItemDetail> filterItems(List<String> companyNames, String priceFrom, String priceTo);
	int addCartItem(CartItem cartItem);
}
