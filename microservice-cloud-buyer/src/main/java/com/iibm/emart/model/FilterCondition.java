package com.iibm.emart.model;

import java.util.List;

public class FilterCondition {
	List<String> companyNames;
	String priceFrom;
	String priceTo;
	public List<String> getCompanyNames() {
		return companyNames;
	}
	public void setCompanyNames(List<String> companyNames) {
		this.companyNames = companyNames;
	}
	public String getPriceFrom() {
		return priceFrom;
	}
	public void setPriceFrom(String priceFrom) {
		this.priceFrom = priceFrom;
	}
	public String getPriceTo() {
		return priceTo;
	}
	public void setPriceTo(String priceTo) {
		this.priceTo = priceTo;
	}
}
