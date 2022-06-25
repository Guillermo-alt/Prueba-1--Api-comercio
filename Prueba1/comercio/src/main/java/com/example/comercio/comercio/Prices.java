package com.example.comercio.comercio;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

//incia con valores por default de data.sql

@Entity
public class Prices {
	
	@Id
	private int brandId;
	private Date startDate;
	private Date endDate;
	private int priceList;
	private int productId;
	private int priority;
	private double price;
	private String curr;
	
	public Prices() {}
	
	public Prices(int brand_id, Date start_date, Date end_date, int price_list, int product_id, int priority,
			double price, String curr) {
		super();
		this.brandId = brand_id;
		this.startDate = start_date;
		this.endDate = end_date;
		this.priceList = price_list;
		this.productId = product_id;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}

	public int getBrand_id() {
		return brandId;
	}

	public void setBrand_id(int brand_id) {
		this.brandId = brand_id;
	}

	public Date getStart_date() {
		return startDate;
	}

	public void setStart_date(Date start_date) {
		this.startDate = start_date;
	}

	public Date getEnd_date() {
		return endDate;
	}

	public void setEnd_date(Date end_date) {
		this.endDate = end_date;
	}

	public int getPrice_list() {
		return priceList;
	}

	public void setPrice_list(int price_list) {
		this.priceList = price_list;
	}

	public int getProduct_id() {
		return productId;
	}

	public void setProduct_id(int product_id) {
		this.productId = product_id;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}
	
	
	
}
