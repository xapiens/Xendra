package org.xendra.apps.form;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import org.compiere.model.MAttributeSet;
import org.compiere.model.MCurrency;
import org.compiere.model.MInvoice;
import org.compiere.model.MPriceList;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPricing;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.objectview.RowBase;

public class CreditRow extends RowBase {
	private Boolean Select = false;
	private String Value;
	private String Name;
	private String ProductBrand;
	private String ProductBrandValue;
	private Integer M_AttributeSetInstance_ID;
	private BigDecimal QtyInvoiced = Env.ZERO;
	private BigDecimal QtyEntered = Env.ZERO;
	//private BigDecimal QtyOrdered  = Env.ZERO;
	private BigDecimal PriceActual = Env.ZERO;
	private BigDecimal LineNet;
	private Integer C_UOM_ID;
	private String CURSymbol;
	private Integer C_Invoice_ID;
	private Integer C_InvoiceLine_ID;
	private Integer Line;
	private Integer RowID;
	private Integer M_Product_ID = 0;
	private Boolean isStocked;
	private Integer M_AttributeSet_ID;
	private Integer C_TaxCategory_ID;
	private Boolean IsAttributeMandatory;
	private String UOMConversion = "N";
	private BigDecimal Discount = Env.ZERO;
	private BigDecimal Discount1 = Env.ZERO;
	private BigDecimal Discount2 = Env.ZERO;
	private BigDecimal Discount3 = Env.ZERO;
	private BigDecimal Discount4 = Env.ZERO;			
	
	public BigDecimal getDiscount() {
		return Discount;
	}
	
	public void setDiscount(BigDecimal discount)
	{
		Discount = discount;
	}
	
	public BigDecimal getDiscount1() {
		return Discount1;
	}

	public void setDiscount1(BigDecimal discount1) {
		Discount1 = discount1;
	}
	public BigDecimal getDiscount2() {
		return Discount2;
	}
	public void setDiscount2(BigDecimal discount2) {
		Discount2 = discount2;
	}
	public BigDecimal getDiscount3() {
		return Discount3;
	}
	public void setDiscount3(BigDecimal discount3) {
		Discount3 = discount3;
	}
	public BigDecimal getDiscount4() {
		return Discount4;
	}
	public void setDiscount4(BigDecimal discount4) {
		Discount4 = discount4;
	}
	public BigDecimal getPriceActual() {
		return PriceActual;
	}
	public void setPriceActual(BigDecimal priceActual) {
		if (priceActual == null)
			priceActual = Env.ZERO;
		PriceActual = priceActual;
	}
	public Integer getM_Product_ID() {
		return M_Product_ID;
	}
	public void setM_Product_ID(Integer mProductID) {
		MProduct product = MProduct.get (Env.getCtx(), mProductID, null);
		Value = product.getValue();
		Name = product.getName();
		ProductBrand = product.getBrand();
		ProductBrandValue = product.getBrandValue();
		C_TaxCategory_ID = product.getC_TaxCategory_ID();
		isStocked = product.isStocked();
		M_AttributeSet_ID = product.getM_AttributeSet_ID();
		if (M_AttributeSet_ID != 0) {
			MAttributeSet mas = MAttributeSet.get(Env.getCtx(),	M_AttributeSet_ID, null);
			if (mas != null	&& mas.isMandatory())  {
				IsAttributeMandatory = true;
			}
		}
		M_Product_ID = mProductID;
	}
	public Integer getC_InvoiceLine_ID() {
		return C_InvoiceLine_ID;
	}
	public void setC_InvoiceLine_ID(Integer cInvoiceLineID) {
		C_InvoiceLine_ID = cInvoiceLineID;
	}
	
	public BigDecimal getQtyEntered() {
		return QtyEntered;
	}
	public Boolean getSelect() {
		return Select;
	}
	public void setSelect(Boolean select) {
		Select = select;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public BigDecimal getQtyInvoiced() {
		return QtyInvoiced;
	}
	public void setQtyEntered(BigDecimal qtyEntered) {
		if (qtyEntered == null)
			qtyEntered = Env.ZERO;
		else
			qtyEntered = qtyEntered.setScale(2, BigDecimal.ROUND_HALF_UP);
		if (qty("QtyEntered",qtyEntered))
		{
			changed = true;
			amt();
		}
	}
	
	public boolean qty(String name, BigDecimal qty) {
		  if ( getM_Product_ID() == 0 && name.equals("M_AttributeSetInstance_ID"))
			  return true;
		  else if (name == "C_UOM_ID")
		  {
			  	int C_UOM_To_ID = C_UOM_ID;
				BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
				if (QtyEntered.compareTo(QtyEntered1) != 0)
				{
					QtyEntered = QtyEntered1;
				}
				QtyInvoiced = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
					C_UOM_To_ID, QtyEntered);
				if (QtyInvoiced == null)
					QtyInvoiced = QtyEntered;
				boolean conversion = QtyEntered.compareTo(QtyInvoiced) != 0;
//				PriceEntered = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
//					C_UOM_To_ID, PriceActual);
//				if (PriceEntered == null)
//					PriceEntered = PriceActual; 
				UOMConversion  = conversion ? "Y" : "N";
			  
		  }
	      //	QtyInvoiced changed - calculate QtyOrdered
		  else if (name == "QtyEntered")
		  {
			  int C_UOM_To_ID = C_UOM_ID; 
			  QtyEntered = qty;
			  BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
			  if (QtyEntered.compareTo(QtyEntered1) != 0)
			  {
				  QtyEntered = QtyEntered1;
			  }
			  QtyInvoiced = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
					C_UOM_To_ID, QtyEntered);
			  if (QtyInvoiced == null)
				  QtyInvoiced = QtyEntered;
		      boolean conversion = QtyEntered.compareTo(QtyInvoiced) != 0;
		      UOMConversion  = conversion ? "Y" : "N";
		  }
		  return true;
	}
	
	  public boolean amt() {
			LineNet = PriceActual.multiply(QtyInvoiced);
			LineNet = LineNet.setScale(2, BigDecimal.ROUND_HALF_UP);
			return true;
		  }
	
	
	public int getC_Invoice_ID() {
		return C_Invoice_ID;
	}
	public void setC_Invoice_ID(int cInvoiceID) {
		C_Invoice_ID = cInvoiceID;
	}
	public Integer getM_AttributeSetInstance_ID() {
		return M_AttributeSetInstance_ID;
	}
	public void setM_AttributeSetInstance_ID(Integer mAttributeSetInstanceID) {
		M_AttributeSetInstance_ID = mAttributeSetInstanceID;
	}
	public BigDecimal getLineNet() {
		return LineNet;
	}
	public void setLineNet(BigDecimal lineNet) {
		LineNet = lineNet;
	}
	public Integer getC_UOM_ID() {
		return C_UOM_ID;
	}
	public void setC_UOM_ID(Integer cUOMID) {
		C_UOM_ID = cUOMID;
		if (qty("C_UOM_ID",Env.ZERO))
		{
			changed = true;
			amt();
		}
		//C_UOM_ID = cUOMID;
	}
	public String getCURSymbol() {
		return CURSymbol;
	}
	public void setCURSymbol(String cURSymbol) {
		CURSymbol = cURSymbol;
	}
	public Integer getRowID() 							{	return RowID;  }
	public void setRowID(Integer pRowID) 					
	{	
		RowID = pRowID;
	}  
	  	
}
