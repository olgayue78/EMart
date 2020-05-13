package com.iibm.emart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iibm.emart.entity.Item;
import com.iibm.emart.repository.SellerRepository;

@Service
public class SellerService {
	@Autowired
	SellerRepository sellerRepository;
	
	public List<Item> getItems(int sellerId){
		return sellerRepository.getItems(sellerId);
		
	};
	public int addItem(Item item) {
		return sellerRepository.addItem(item);
		
	};

}
