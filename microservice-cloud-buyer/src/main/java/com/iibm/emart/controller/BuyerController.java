package com.iibm.emart.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iibm.emart.entity.Item;
import com.iibm.emart.utils.ResponseData;

@RestController
public class BuyerController {

    @GetMapping("/search/{keyword}")
    @ResponseBody
	public ResponseData login(@PathVariable String keyword) {
		if ("imjack".equals(keyword)) {
			ResponseData responseData = ResponseData.ok();
			Item item = new Item();
			responseData.putDataValue("item", item);
			return responseData;
		}
		return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "username or password is incorrect" });
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