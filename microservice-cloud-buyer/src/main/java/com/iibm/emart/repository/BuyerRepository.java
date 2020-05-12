package com.iibm.emart.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.Item;

@Repository
public interface BuyerRepository {
	 List<Item> searchItemsByKeyword(String keyword);
}
