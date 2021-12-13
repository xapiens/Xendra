package org.xendra.pos.model;

public class Product {
	private int price;
	private int qty;
	private double discount;
	private String desc;
	private String value;	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Product(String desc, int price) {
		this.desc = desc;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDesc() {
		return desc;
	}
	public String toString() {
		return "product: " + desc + ", price" + price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}	
}
