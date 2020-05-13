package com.iibm.emart.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.CartItem;
import com.iibm.emart.model.ItemDetail;
import com.iibm.emart.repository.BuyerRepository;

@Repository
public class BuyerRepositoryImpl implements BuyerRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ItemDetail> searchItemsByKeyword(String keyword) {
		RowMapper<ItemDetail> rm = BeanPropertyRowMapper.newInstance(ItemDetail.class);
		return jdbcTemplate.query("select item.*, user.bussiness_name, picture.url from item,user,picture where item.seller_id = user.id and item.picture_id = picture.id and item_name LIKE CONCAT('%',?,'%') or category LIKE CONCAT('%',?,'%') or description LIKE CONCAT('%',?,'%')",
				 new String[]{keyword, keyword, keyword}, rm);
	}

	@Override
	public List<ItemDetail> filterItems(List<String> companyNames, String priceFrom, String priceTo) {
		RowMapper<ItemDetail> rm = BeanPropertyRowMapper.newInstance(ItemDetail.class);
		String sql = "select item.*, user.bussiness_name, picture.url from item,user,picture where item.seller_id = user.id and item.picture_id = picture.id";
		String companyNamesStr = "[";
		if(companyNames.size() > 0) {
			for(String companyName : companyNames){
				companyNamesStr = companyNamesStr + companyName;
			}
			companyNamesStr = companyNamesStr + "]";
			sql = sql + " and user.bussiness_name IN "+ companyNamesStr;
		}
		if(priceFrom != "") {
			sql = sql + " and item.price >= " + Float.parseFloat(priceFrom);
		}
		if(priceTo != "") {
			sql = sql + " and item.price <= " + Float.parseFloat(priceTo);
		}
		return jdbcTemplate.query(sql, new String[]{}, rm);
	}

	@Override
	public int addCartItem(CartItem cartItem) {
		String sql = "INSERT INTO emart.cartitem (item_id, qty, tax, seller_id, buyer_id, discount) VALUES(?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,new Object[] {cartItem.getItemId(),cartItem.getQty(),cartItem.getTax(),cartItem.getSellerId(),cartItem.getBuyerId(),cartItem.getDiscount()});
	}

}
