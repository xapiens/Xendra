package org.xendra.pos;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.compiere.model.MBPartner;
import org.compiere.model.MCurrency;
import org.compiere.model.MUOM;
import org.compiere.model.persistence.X_C_Coupon;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;

public class CouponItem {
	private X_C_Coupon coupon;
	private String BPartner;
	private String Currency;
	DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
	public void setCoupon(X_C_Coupon coupon)
	{
		this.coupon = coupon;
		MBPartner partner = MBPartner.get(Env.getCtx(), coupon.getC_BPartner_ID());
		MCurrency currency = MCurrency.get(Env.getCtx(), coupon.getC_Currency_ID());
		if (partner != null)
			BPartner = partner.getName();
		if (currency != null)
			Currency = currency.getDescription();
		
	}
	public String getDocumentNo() {
		return coupon.getDocumentNo();		
	}
	public X_C_Coupon getCoupon() {
		return this.coupon;
	}
	public String getBPartner() {
		return BPartner;
	}
	public BigDecimal getAmount() {
		return coupon.getGrandTotal();
	}
	public String getCurrency()  {
		return Currency;
	}	
	public String toString() { 	
		
		return BPartner.concat(" ").concat(format.format(getCoupon().getGrandTotal()).concat(" ").concat(Currency));				
	}
}
