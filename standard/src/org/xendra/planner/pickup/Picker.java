package org.xendra.planner.pickup;

import java.util.ArrayList;
import java.util.List;


import org.compiere.model.persistence.X_AD_User;

public class Picker {
	private X_AD_User user;	
	
	private List<Integer> locators = new ArrayList<Integer>();
	private List<Integer> brands = new ArrayList<Integer>();
	private List<Integer> warehouses = new ArrayList<Integer>();
	
	public X_AD_User getUser() {
		return user;
	}
	public void setUser(X_AD_User user) {
		this.user = user;
	}
	public String getName() {
		return user.getName();
	}	

	public List<Integer> getProductbrandList() {
		return brands;
	}
	public void addLocator(int M_Locator_ID) {		
		if (M_Locator_ID > 0 && !locators.contains(M_Locator_ID))
			locators.add(M_Locator_ID);
	}
	public void addProductBrand(int M_Product_Brand_ID) {
		if (M_Product_Brand_ID > 0 && !brands.contains(M_Product_Brand_ID))
			brands.add(M_Product_Brand_ID);	
	}
	public void addWarehouse(int M_Warehouse_ID) {
		if (M_Warehouse_ID > 0 && !warehouses.contains(M_Warehouse_ID))
			warehouses.add(M_Warehouse_ID);		
	}	
}
