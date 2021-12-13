package org.xendra.invoice.wizard;

import java.math.BigDecimal;

public class InvoiceLine {	
	private Integer C_UOM_ID = 0;
	private Integer M_Product_ID = 0;
	//private Integer line;
	private String ID = "";
	private BigDecimal Qty = BigDecimal.ZERO;
	private BigDecimal PriceEntered = BigDecimal.ZERO;
	private String description = "";
	private String VendorProductNo = "";	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	//public void setLine(Integer line) {
	//	this.line = line;
	//}
	//public Integer getLine() {
	//	return this.line;
	//}
	public void setQty(BigDecimal qty) {
		this.Qty = qty;		
	}
	public BigDecimal getQty() {
		return this.Qty;
	}
	public void setM_Product_ID(Integer M_Product_ID, Integer C_UOM_ID) {
		if (M_Product_ID == null)
			M_Product_ID = 0;
		if (C_UOM_ID == null)
			C_UOM_ID = 0;
		this.M_Product_ID = M_Product_ID;
		this.C_UOM_ID = C_UOM_ID;
	}
	public Integer getM_Product_ID() {		
		return M_Product_ID;		
	}
	public Integer getC_UOM_ID() {
		return C_UOM_ID;
	}
	public void setC_UOM_ID(Integer C_UOM_ID) {
		if (C_UOM_ID != null)
			this.C_UOM_ID = C_UOM_ID;
	}
	public void setPriceEntered(BigDecimal amt) {
		this.PriceEntered = amt;
	}
	public BigDecimal getPriceEntered()  {
		return this.PriceEntered;
	}
	public void setM_Product_ID(Integer var) {	
		M_Product_ID = var;
	}
	public void setDescription(String var) {
		description = var;
	}
	public String getDescription() {
		return description;
	}
	public void setVendorProductNo(String var) {
		this.VendorProductNo = var;				
	}
	public String getVendorProductNo() {
		return this.VendorProductNo;
	}
}
