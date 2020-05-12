package com.iibm.emart.repositoryImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.Item;
import com.iibm.emart.repository.BuyerRepository;

@Repository
public class BuyerRepositoryImpl implements BuyerRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Item> searchItemsByKeyword(String keyword) {
		RowMapper<Item> rm = BeanPropertyRowMapper.newInstance(Item.class);;
		return jdbcTemplate.query("select * from item where item_name LIKE CONCAT('%',?,'%') or category LIKE CONCAT('%',?,'%') or description LIKE CONCAT('%',?,'%')",
				 new String[]{keyword, keyword, keyword}, rm);
	}

}
