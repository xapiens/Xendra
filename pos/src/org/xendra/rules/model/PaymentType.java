package org.xendra.rules.model;

import org.xendra.Constants;

public class PaymentType implements SimpleRule {

	private String name;
	private String value = "NONE";
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getValue() {
		return value;
	}
	@Override
	public void setValue(String value) {
		this.value = value;		
	}
	public boolean isCreditCard() 
	{
		return getValue().equals(Constants.A_PAY);
	}	
	public boolean isCash()
	{
		return getValue().equals(Constants.A_CASH); 
	}	
	public boolean isCredit()
	{
		return getValue().equals(Constants.A_CREDIT);
	}
	public boolean isCoupon()
	{
		return getValue().equals(Constants.A_COUPON);
	}	
}
