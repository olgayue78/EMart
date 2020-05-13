package com.iibm.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iibm.emart.entity.CartItem;
import com.iibm.emart.model.CartItemDetail;
import com.iibm.emart.model.FilterCondition;
import com.iibm.emart.model.ItemDetail;
import com.iibm.emart.service.BuyerService;
import com.iibm.emart.utils.ResponseData;

@RestController
public class BuyerController {
	@Autowired
	private BuyerService buyerService;

    @GetMapping("/search")
    @ResponseBody
	public ResponseData search(@RequestParam(value="keyword",required =false ) String keyword) {
    	try {
    		List<ItemDetail> items = buyerService.searchItemsByKeyword(keyword);
			ResponseData responseData = ResponseData.ok();
			responseData.putDataValue("item", items);
    		return responseData;
    	} catch(Exception e) {
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, e);
    	}
		
    }

    @GetMapping("/filter")
    @ResponseBody
	public ResponseData search(@RequestBody FilterCondition filterCondition) {
    	try {
    		List<ItemDetail> items = buyerService.filterItems(filterCondition.getCompanyNames(),filterCondition.getPriceFrom(),filterCondition.getPriceTo());
			ResponseData responseData = ResponseData.ok();
			responseData.putDataValue("item", items);
    		return responseData;
    	} catch(Exception e) {
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, e);
    	}
		
    }
    

    @PutMapping("/cartItem")
    @ResponseBody
	public ResponseData cartItem(@RequestBody CartItem cartItem) {
    	try {
    		buyerService.addCartItem(cartItem);
			ResponseData responseData = ResponseData.ok();
			responseData.putDataValue("cartItem", cartItem);
    		return responseData;
    	} catch(Exception e) {
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, e);
    	}
		
    }
    

    @GetMapping("/cartItems")
    @ResponseBody
	public ResponseData cartItem(@RequestBody int buyerId) {
    	try {
    		List<CartItemDetail> cartItemDetails = buyerService.getCartItems(buyerId);
			ResponseData responseData = ResponseData.ok();
			responseData.putDataValue("cartItem", cartItemDetails);
    		return responseData;
    	} catch(Exception e) {
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, e);
    	}
		
    }
    
    @DeleteMapping("/cartItem}")
    @ResponseBody
	public ResponseData cartItem(@RequestParam(value="itemId",required =false ) int itemId, @RequestParam(value="buyerId",required =true ) int buyerId) {
    	try {
    		buyerService.deleteCartItem(itemId,buyerId);
			ResponseData responseData = ResponseData.ok();
			responseData.putDataValue("cartItem", itemId);
    		return responseData;
    	} catch(Exception e) {
    		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, e);
    	}
		
    }
}
