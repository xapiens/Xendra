package org.xendra.rules.model;

import java.sql.Timestamp;

public class Demand {
	Timestamp dateordered;
	private double price;
	private int M_Product_ID;	
	private int factor = 0;		
	
	public int getFactor() {
		return factor;
	}

	public void setFactor(int factor) {
		this.factor = factor;
	}

	public int getM_Product_ID() {
		return M_Product_ID;
	}

	public void setM_Product_ID(int m_Product_ID) {
		M_Product_ID = m_Product_ID;
	}

	public Timestamp getDateordered() {
		return dateordered;
	}

	public void setDateordered(Timestamp dateordered) {
		this.dateordered = dateordered;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
