package com.iibm.emart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="user",catalog="testdb")
@DynamicUpdate
public class User implements Serializable {
    /**
	 * User entity
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
    
    @Column(name="username")
	private String username;
    
    @Column(name="email")
	private String email;

	@Column(name="password")
	private String password;
    
    @Column(name="user_role")
	private String userRole;
    
    @Column(name="bussiness_address")
	private String bussinessAddress;

	@Column(name="gtsin")
	private String gtsin;

	@Column(name="bussiness_name")
	private String bussinessName;
    
    @Column(name="websit_url")
	private String websitUrl;
    
    @Column(name="telephone")
	private String telephone;
    
    @Column(name="bank_name")
	private String bankName;

	@Column(name="bank_number")
	private String bankNumber;
    
    @Column(name="company_brief")
	private String companyBrief;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getBussinessAddress() {
		return bussinessAddress;
	}

	public void setBussinessAddress(String bussinessAddress) {
		this.bussinessAddress = bussinessAddress;
	}

	public String getGtsin() {
		return gtsin;
	}

	public void setGtsin(String gtsin) {
		this.gtsin = gtsin;
	}

	public String getBussinessName() {
		return bussinessName;
	}

	public void setBussinessName(String bussinessName) {
		this.bussinessName = bussinessName;
	}

	public String getWebsitUrl() {
		return websitUrl;
	}

	public void setWebsitUrl(String websitUrl) {
		this.websitUrl = websitUrl;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getCompanyBrief() {
		return companyBrief;
	}

	public void setCompanyBrief(String companyBrief) {
		this.companyBrief = companyBrief;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}