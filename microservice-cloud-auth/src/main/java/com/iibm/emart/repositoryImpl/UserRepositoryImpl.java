package com.iibm.emart.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iibm.emart.entity.User;
import com.iibm.emart.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer create(User user) {
		return jdbcTemplate.update("INSERT INTO emart.`USER`"
				+ "(id, username, psw, userRole, bussiness_address, gtsin, bussiness_name, websit_url, telephone, bank_name, bank_number, company_brief,email)"
				+ "VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);",
				new Object[] { user.getUsername(), user.getPassword(), user.getUserRole(), user.getBussinessAddress(),
						user.getGtsin(), user.getBussinessName(), user.getWebsitUrl(), user.getTelephone(),
						user.getBankName(), user.getBankNumber(), user.getCompanyBrief(), user.getEmail() });
	}

	@Override
	public Integer getAllUsers() {
		return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
	}

	@Override
	public Integer getUserByName(String email, String password, String userRole) {
		return jdbcTemplate.queryForObject("select count(1) from USER where email=? and password=? and userRole=?",
				Integer.class, email, password, userRole);
	}
}