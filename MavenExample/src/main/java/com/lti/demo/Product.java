package com.lti.demo;

public class Product {
	private int prdId;
	private String prdName;
	private double prdCost;
	private String companyName = "Dmart";
	
	public Product() {
		prdId = 0;
		prdName = "";
		prdCost = 0;
	}
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	public String getCompanyName() {
		return companyName;
	}
	
}
