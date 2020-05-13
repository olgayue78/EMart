package com.iibm.emart.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.Item;

@Repository
public interface SellerRepository {
	public List<Item> getItems(int sellerId);
	public int addItem(Item item);
}
