package com.iibm.emart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iibm.emart.entity.Item;
import com.iibm.emart.model.ItemDetail;
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

}
