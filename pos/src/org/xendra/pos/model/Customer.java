package org.xendra.pos.model;


public class Customer {
	private Cart cart;
	private boolean isnew;
	public static Customer newCustomer() {
		Customer customer = new Customer();
		customer.isnew = true;
		return customer;
	}
	public boolean getIsNew() {
		return isnew;
	}
	public void addItem(Product p, int qty) {
		if ( cart == null) {
			cart = new Cart(this);
		}
		cart.addItem(p, qty);
	}
	public Cart getCart() {
		return cart;
	}
}
