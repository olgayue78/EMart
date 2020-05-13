package com.iibm.emart.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iibm.emart.entity.Item;
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
    
    @GetMapping("/purchaseHistory/{keyword}")
    @ResponseBody
	public ResponseData purchaseHistory(@PathVariable String keyword) {
		if ("imjack".equals(keyword)) {
			ResponseData responseData = ResponseData.ok();
			Item item = new Item();
			responseData.putDataValue("item", item);
			return responseData;
		}
		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
    }

    @DeleteMapping("/purchaseHistoryCarItem/{keyword}")
    @ResponseBody
	public ResponseData purchaseHistoryCarItem(@PathVariable String keyword) {
		if ("imjack".equals(keyword)) {
			ResponseData responseData = ResponseData.ok();
			Item item = new Item();
			responseData.putDataValue("item", item);
			return responseData;
		}
		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
    }

    @PutMapping("/cartItem/{keyword}")
    @ResponseBody
	public ResponseData cartItem(@PathVariable String keyword) {
		if ("imjack".equals(keyword)) {
			ResponseData responseData = ResponseData.ok();
			Item item = new Item();
			responseData.putDataValue("item", item);
			return responseData;
		}
		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
    }

    @DeleteMapping("/carItem/{keyword}")
    @ResponseBody
	public ResponseData carItem(@PathVariable String keyword) {
		if ("imjack".equals(keyword)) {
			ResponseData responseData = ResponseData.ok();
			Item item = new Item();
			responseData.putDataValue("item", item);
			return responseData;
		}
		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
    }

    @GetMapping("/checkout/{keyword}")
    @ResponseBody
	public ResponseData checkout(@PathVariable String keyword) {
		if ("imjack".equals(keyword)) {
			ResponseData responseData = ResponseData.ok();
			Item item = new Item();
			responseData.putDataValue("item", item);
			return responseData;
		}
		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
    }
}
