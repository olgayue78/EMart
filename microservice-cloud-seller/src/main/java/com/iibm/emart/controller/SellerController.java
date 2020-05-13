package com.iibm.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iibm.emart.repository.SellerRepository;
import com.iibm.emart.service.SellerService;
import com.iibm.emart.utils.ResponseData;
import com.iibm.emart.entity.Item;

@RestController
public class SellerController {

	@Autowired
	SellerService sellerService;
	
	@PutMapping("/Item")
	@ResponseBody
	public ResponseData Item(@RequestBody Item item) {
		try {
			sellerService.addItem(item);
			ResponseData responseData = ResponseData.ok();
			responseData.putDataValue("Item", item);
			return responseData;
		} catch (Exception e) {
			return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, e);
		}

	}

	@GetMapping("/Items")
	@ResponseBody
	public ResponseData Item(@RequestBody int sellerId) {
		try {
			List<Item> items = sellerService.getItems(sellerId);
			ResponseData responseData = ResponseData.ok();
			responseData.putDataValue("Item", items);
			return responseData;
		} catch (Exception e) {
			return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, e);
		}

	}
}
