package com.iibm.emart.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.Item;
import com.iibm.emart.repository.SellerRepository;

@Repository
public class SellerRepositoryImpl implements SellerRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Item> getItems(int sellerId) {
		RowMapper<Item> rm = BeanPropertyRowMapper.newInstance(Item.class);
		return jdbcTemplate.query("select item.* from item where item.seller_id = ?",
				new Object[]{sellerId}, rm);
	}

	@Override
	public int addItem(Item item) {
		String sql = "INSERT INTO item (item_name, category, subcategory, price, stock_nmuber, description, seller_id, picture_id) VALUES(?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,new Object[] {item.getItemName(),item.getCategory(), item.getSubcategory(),item.getPrice(), item.getStockNmuber(),item.getDescription(),item.getSellerid(),item.getPictureid()});
	}

}
