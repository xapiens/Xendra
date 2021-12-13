package org.xendra.pos.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private Customer customer;
	private List<CartItem> cartItems = new ArrayList<CartItem>();
	private double discount;
	
	public Cart(Customer customer) {
		this.customer = customer;
	}
	public void addItem(Product p, int qty) {
		CartItem cartItem = new CartItem(this, p, qty);
		cartItems.add(cartItem);
	}
	public double getDiscount() {
		return discount;
	}
	public void addDiscount(double discount) {
		this.discount = discount;
	}
	public int getTotalPrice() {
		int total = 0;
		for (CartItem item : cartItems) {
			total += item.getProduct().getPrice() * item.getQty();
		}
		return total;
	}
}
