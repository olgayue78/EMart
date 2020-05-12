package com.iibm.emart.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iibm.emart.entity.Item;
import com.iibm.emart.repository.BuyerRepository;

@Service
public class BuyerService {
	
	@Autowired
	BuyerRepository buyerRepository;
	public  List<Item> searchItemsByKeyword(String keyword) {
		return buyerRepository.searchItemsByKeyword(keyword);
	}

}
