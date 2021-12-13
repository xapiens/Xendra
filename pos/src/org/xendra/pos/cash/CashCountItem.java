package org.xendra.pos.cash;

import java.math.BigDecimal;

import org.compiere.util.Env;

public class CashCountItem 
{
	String ID;
	String description;
	BigDecimal amount = Env.ZERO;
	BigDecimal amountInSystem = Env.ZERO;
	BigDecimal diff = Env.ZERO;
	
	public BigDecimal getDiff() {
		return diff;
	}
	public void setDiff(BigDecimal diff) {
		this.diff = diff;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		if (amount == null)
			amount = Env.ZERO;
		this.amount = amount;		
		this.diff = this.amount.subtract(this.amountInSystem);
	}
	public BigDecimal getAmountInSystem() {
		return amountInSystem;
	}
	public void setAmountInSystem(BigDecimal amountInSystem) {
		this.amountInSystem = amountInSystem;
		this.diff = this.amount.subtract(this.amountInSystem);
	}
	public CashCountItem(String _ID,  String _description, BigDecimal _amount, BigDecimal _amountInSystem )
	{
		ID = _ID;
		description = _description;
		amount = _amount;
		amountInSystem = _amountInSystem;
		
	}
//	public CashCountItem(String _ID,  String _description, BigDecimal _amountInSystem )
//	{
//		ID = _ID;
//		description = _description;
//		//amount = Env.ZERO;
//		amountInSystem = _amountInSystem;
//	}	
}
