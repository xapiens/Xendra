package org.xendra.pop;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Vector;

import org.compiere.model.MAttributeSet;
import org.compiere.model.MPriceList;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPricing;
import org.compiere.model.MTax;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.model.Tax;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_ProductPrice;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.objectview.RowBase;
import org.xendra.pop.RowData;

/**
 * Define a row
 * @author xapiens
 */
public class Row  extends RowBase { 
	private Integer RowID = 0;
	//private Integer M_Product_ID = 0;
	//private String mValue = "";
	private Vector ASIExceptions;
	private MProduct m_Product;
	private PopPanel m_POPPanel;
	//private String mName = "";
	private Boolean Pack = false;
	private Boolean isStocked = false;
	private int M_AttributeSet_ID = 0;
	private Boolean IsAttributeMandatory = false;
	//public  Integer M_AttributeSetInstance_ID = 0;
	public  Integer M_PriceList_ID = 0;
	//public  Integer M_Warehouse_ID = 0;
	public  Integer M_Locator_ID = 0;
	public  Integer C_UOM_Buy_ID = 0;	
	public  Integer C_UOM_ID = 0;
	public  Integer C_UOMBonus_ID = 0;
	public  String mGroup = "";
	public  String mProductBrand = "";
	public  String mProductBrandValue = "";
	private Timestamp DateOrdered = new Timestamp(System.currentTimeMillis());
	private MProduct m_product;
	private MTax  m_tax;
	private Integer C_Currency_ID = 0;
	private int m_WindowNo;
	private Timestamp  LastdateInvoiced;
	private BigDecimal PriceBase = Env.ZERO;     
	private HashMap<String, Object> oldvalues = new HashMap();
	//private String identifier = Util.getUUID(); 
	private RowData m_rowdata = new RowData();
	private String m_FieldName = "";
	private BigDecimal m_FieldValue = BigDecimal.ZERO;
	private Integer m_FieldIntValue = 0;
	private boolean m_new;

	public Row(){
		super();
	}
	public Row(Boolean Enabled) {
		super(Enabled);
	}
//	public String getIdentifier()
//	{
//		return identifier;
//	}
	public RowData getRowData()
	{
		return m_rowdata;
	}	
	public BigDecimal getPriceBase() {
		return PriceBase;
	}
	public void setPriceBase(BigDecimal priceBase) {
		PriceBase = priceBase;
	}
	public BigDecimal getPriceEnteredWithoutTax() {
		return m_rowdata.getPriceEnteredWithoutTax();	
	}
	public void setPriceEnteredWithoutTax(BigDecimal value) {
		setField("PriceEnteredWithoutTax", value);
	}
	//  public BigDecimal getPriceEnteredWithoutTax() {
	//	  //return PriceEnteredWithoutTax;
	//	  return m_rowdata.getPriceEnteredWithoutTax();
	//  }
	//  public void setPriceEnteredWithoutTax(BigDecimal priceEnteredWithoutTax) {
	//	  if (priceEnteredWithoutTax == null)
	//		  priceEnteredWithoutTax = Env.ZERO;
	//	  priceEnteredWithoutTax = priceEnteredWithoutTax.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//	  if ( PriceEnteredWithoutTax.compareTo(priceEnteredWithoutTax) != 0 )
	//	  {		  
	//		  BigDecimal oPriceEnteredWithoutTax = PriceEnteredWithoutTax;
	//		  if (amt("PriceEnteredWithoutTax", priceEnteredWithoutTax))
	//			  changed = true;
	//		  else
	//			  PriceEnteredWithoutTax = oPriceEnteredWithoutTax;
	//	  }
	//  }

	//	public BigDecimal getDiscountAmt() {
	//		return m_rowdata.getDiscountAmt();
	//	}
	public void setDiscountAmt(BigDecimal value) {
		m_rowdata.setDiscountAmt(value);
		//		// este es el bonus, no deberia tocarse
		//		setField("DiscountAmt",value);	  
	}

	//	public BigDecimal getDiscount1Amt() {
	//		return m_rowdata.getDiscount1Amt();
	//	}
	//	public void setDiscount1Amt(BigDecimal value) {
	//		// este es el bonus, no deberia tocarse
	//		setField("Discount1Amt",value);	  
	//	}
	public void setDiscount1(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_Discount1, value);
		//	  if (discount1 == null)
		//		  	discount1 = Env.ZERO;
		//	  discount1 = discount1.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
		//	  if (discount1.compareTo(Discount1) != 0)
		//	  {		 	
		//		if (amt("Discount1", discount1))
		//			changed = true;		
		//	  }
	}
	//	public BigDecimal getDiscount2Amt() {
	//		return m_rowdata.getDiscount2Amt();
	//	}
	//	public void setDiscount2Amt(BigDecimal value) {
	//		setField("Discount2Amt", value);
	//		//	  BigDecimal discount2 = Env.ZERO;
	//		//	  if (discount2Amt != null)
	//		//	  {
	//		//		  BigDecimal PriceList1 = PriceActual;
	//		//	
	//		//		  if (Discount1.compareTo(Env.ZERO) != 0)
	//		//		  {
	//		//			  Discount1Amt = new BigDecimal ((100.0 - Discount1.doubleValue()) / 100.0 * PriceList1.doubleValue())
	//		//			  .setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//		//	
	//		//			  PriceList1 = Discount1Amt;
	//		//		  }
	//		//	
	//		//		  discount2 = Env.ONEHUNDRED.subtract(discount2Amt.divide(PriceList1, this.StdPrecision, BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED));		  
	//		//	  }
	//		//	  amt("Discount2", discount2);
	//	}
	//	public BigDecimal getDiscount3Amt() {
	//		return m_rowdata.getDiscount3Amt();
	//		//return Discount3Amt;
	//	}
	//	public void setDiscount3Amt(BigDecimal value) {
	//		setField("Discount3Amt", value);
	//		//	  BigDecimal discount3 = Env.ZERO;
	//		//	  if (discount3Amt != null)
	//		//	  {
	//		//		  BigDecimal PriceList1 = PriceActual;
	//		//		  if (Discount1.compareTo(Env.ZERO) != 0)
	//		//		  {
	//		//			  Discount1Amt = new BigDecimal ((100.0 - Discount1.doubleValue()) / 100.0 * PriceList1.doubleValue())
	//		//			  .setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//		//	
	//		//			  PriceList1 = Discount1Amt;
	//		//		  }
	//		//		  if (Discount2.compareTo(Env.ZERO) != 0)
	//		//		  {
	//		//			  Discount2Amt = new BigDecimal ((100.0 - Discount2.doubleValue()) / 100.0 * PriceList1.doubleValue())
	//		//			  .setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//		//	
	//		//			  PriceList1 = Discount2Amt;
	//		//		  }	  
	//		//		  discount3 = Env.ONEHUNDRED.subtract(discount3Amt.divide(PriceList1, this.StdPrecision, BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED));		  
	//		//	  }
	//		//	  amt("Discount3", discount3);
	//	}
	//	public void setDiscount4Amt(BigDecimal value) {
	//		setField("Discount4Amt", value);
	//		//	  BigDecimal discount4 = Env.ZERO;
	//		//	  if (discount4Amt != null)
	//		//	  {
	//		//		  BigDecimal PriceList1 = PriceActual;
	//		//		  if (Discount1.compareTo(Env.ZERO) != 0)
	//		//		  {
	//		//			  Discount1Amt = new BigDecimal ((100.0 - Discount1.doubleValue()) / 100.0 * PriceList1.doubleValue())
	//		//			  .setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//		//	
	//		//			  PriceList1 = Discount1Amt;
	//		//		  }
	//		//		  if (Discount2.compareTo(Env.ZERO) != 0)
	//		//		  {
	//		//			  Discount2Amt = new BigDecimal ((100.0 - Discount2.doubleValue()) / 100.0 * PriceList1.doubleValue())
	//		//			  .setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//		//	
	//		//			  PriceList1 = Discount2Amt;
	//		//		  }
	//		//		  if (Discount3.compareTo(Env.ZERO) != 0)
	//		//		  {
	//		//			  Discount3Amt = new BigDecimal ((100.0 - Discount3.doubleValue()) / 100.0 * PriceList1.doubleValue())
	//		//			  .setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//		//	
	//		//			  PriceList1 = Discount3Amt;
	//		//		  }	  		  
	//		//		  discount4 = Env.ONEHUNDRED.subtract(discount4Amt.divide(PriceList1, this.StdPrecision, BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED));		  
	//		//	  }
	//		//	  amt("Discount4", discount4);
	//	} 
	public int getStdPrecision()
	{
		return m_rowdata.getStdPrecision();
	}  
	public void setStdPrecision(int stdPrecision) {
		setField(X_C_Currency.COLUMNNAME_StdPrecision, stdPrecision);
	}
	public boolean getUpdatePrice()
	{
		return m_rowdata.IsUpdatePrice();
	}
	public void setUpdatePrice(Boolean value)
	{
		m_rowdata.setIsUpdatePrice(value);
	}
	public Timestamp  getLastDateInvoiced()				{   return LastdateInvoiced; }
	//public BigDecimal getLastPriceActual()				{   return LastPriceActual;  }  
	public Integer getRowID() 							{	return RowID;  }
	public void setRowID(Integer pRowID) 					{	RowID = pRowID;  }  
	public BigDecimal getQtyOrdered()  					{	return m_rowdata.getQtyOrdered();  }
	public void setValue(String value) 					
	{	
		// el value no debe ser modificado por este medio
	}
	public String getValue() 								
	{   
		if (m_Product == null)
			return "";
		return m_Product.getValue();  
	}

	public Integer getC_Tax_ID() 							{	return m_rowdata.getC_Tax_ID();  }
	public void setC_Tax_ID(Integer cTaxID) 				
	{	
		if (cTaxID == null)
			return;
		m_rowdata.setC_Tax_ID(cTaxID); 
	}
	public String getTaxName() {
		String taxname = "";
		if (m_tax != null)
			taxname  = m_tax.getName();
		return taxname; 
	}  
	public Integer getM_Product_ID() 	
	{   
		return m_rowdata.getM_Product_ID();   
	}
	public void setM_Product_ID(Integer value) 	
	{   
		m_rowdata.setM_Product_ID(value);		
	}
	public String getName() 								
	{   
		if (m_Product == null)
			return "";
		return m_Product.getName(); 
	}  
	//	public String getName() 								{   return mName;  }
	//	  public void setName(String pName) 					
	//	  {   
	//		  if (pName == null)
	//			  return;
	//	  }
	// precios actuales de venta para comparativa.
	public BigDecimal getSalesPriceList() {
		return m_rowdata.getSalesPriceList();
	}
	public BigDecimal getSalesPriceLimit() {
		return m_rowdata.getSalesPriceLimit();
	}
	public BigDecimal getDiscountAcquire1() {
			return m_rowdata.getDiscountAcquire1();
	}
	public void setDiscountAcquire1(BigDecimal value) {
		setField("DiscountAcquire1", value);
	}
	public BigDecimal getDiscount() {
		return m_rowdata.getDiscount();
	}

	public void setDiscount(BigDecimal value) {
		if (value == null)
			value = BigDecimal.ZERO;
		setField(X_C_OrderLine.COLUMNNAME_Discount, value);
	}

	public BigDecimal getDiscount1() {
		return m_rowdata.getDiscount1();
	}

	public void setDiscount2(BigDecimal value) {
		if (value == null)
			value = BigDecimal.ZERO;
		setField(X_C_OrderLine.COLUMNNAME_Discount2, value);
	}

	public BigDecimal getDiscount2() {
		return m_rowdata.getDiscount2();		
	}

	public void setDiscount3(BigDecimal value) {
		if (value == null)
			value = BigDecimal.ZERO;		
		setField(X_C_OrderLine.COLUMNNAME_Discount3, value);
	}

	public BigDecimal getDiscount3() {
		return m_rowdata.getDiscount3();
	}

	public void setDiscount4(BigDecimal value) {
		if (value == null)
			value = BigDecimal.ZERO;		
		setField(X_C_OrderLine.COLUMNNAME_Discount4, value);
	}

	public BigDecimal getDiscount4() {
		return m_rowdata.getDiscount4();
	}

	public BigDecimal getFreight() {
		return m_rowdata.getFreight();
	}
	public void setFreight(BigDecimal value) {
		if (value == null)
			value = BigDecimal.ZERO;		
		setField(X_C_OrderLine.COLUMNNAME_FreightAmt, value);
	}
	public BigDecimal getSalesPriceStd() {
		return m_rowdata.getSalesPriceStd();
	}  
	public void setSalesPriceStd(BigDecimal value) {
		setField(X_M_ProductPrice.COLUMNNAME_PriceStd, value);
	}
	public void setSalesPriceLimit(BigDecimal value)
	{
		setField(X_M_ProductPrice.COLUMNNAME_PriceLimit, value);
	}
	public BigDecimal getMargin()
	{
		return m_rowdata.getMargin();
	}
	public void setMargin(BigDecimal value)
	{		
		if (value == null)
			value = BigDecimal.ZERO;
		setField(X_C_OrderLine.COLUMNNAME_Margin, value);
	}

	//  public void setSalesMargin(BigDecimal margin)
	//  {
	//	  if (margin == null)
	//		  margin = Env.ZERO;
	//	  amt("SalesMargin", margin);
	//	  changed = true;
	//  }

	public void setSalesPriceList(BigDecimal value)
	{
		//m_rowdata.setSalesPriceList(value);
		setField("SalesPriceList", value);		
	}

	public BigDecimal getPriceStd()
	{
		return m_rowdata.getPriceStd();
	}
	
	public BigDecimal getPriceList() 						
	{   
		return m_rowdata.getPriceList();  
	}
	public BigDecimal getQtyEntered() 					
	{   
		return m_rowdata.getQtyEntered();  
	}
	//  public void setQty (BigDecimal Qty)  					
	//  {   
	//	  if (Qty == null)
	//		  return;
	//	  qty("Qty",Qty); 
	//  }  
	//
	//  public BigDecimal getQty ()    						{  	  return QtyEntered;    }

	public void setQtyOrdered(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_QtyOrdered, value);
		//	  if (qtyordered == null)
		//		  return;
		//	  if ( QtyOrdered.compareTo(qtyordered) != 0 )
		//	  {
		//		  BigDecimal oQtyOrdered = QtyOrdered;	  
		//		  if ( qty("QtyOrdered", qtyordered) && amt("QtyOrdered", qtyordered) )
		//			  changed = true;			  
		//		  else
		//			  QtyOrdered = oQtyOrdered;
		//	  }	  
	}

	public void setQtyEntered(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_QtyEntered, value);
		//	  if (qtyentered == null)
		//		  return;
		//	  if ( QtyEntered.compareTo(qtyentered) != 0 )
		//	  {
		//		  BigDecimal oQtyEntered = QtyEntered;
		//		  BigDecimal oQtyOrdered = QtyOrdered;
		//	      if ( qty("QtyEntered", qtyentered) && amt("QtyEntered", qtyentered) )	    	
		//	    	  changed = true;
		//	      else
		//	      {
		//	    	  QtyEntered = oQtyEntered;
		//	    	  QtyOrdered = oQtyOrdered;
		//	      }
		//	      	
		//	  }
	}

	public void setPriceList(BigDecimal value) 	{
		setField(X_C_OrderLine.COLUMNNAME_PriceList, value);
		//	  if (priceList == null)
		//		  return;
		//	  PriceList = priceList;
		//	  amt("PriceList", priceList);
	}

	public void setPriceEntered(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_PriceEntered, value);
		//	  if (priceentered == null)
		//		  priceentered = Env.ZERO;
		//	  priceentered = priceentered.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
		//	  if ( PriceEntered.compareTo(priceentered) != 0 )
		//	  {		  
		//		  BigDecimal oPriceEntered = PriceEntered;
		//		  if (amt("PriceEntered", priceentered))
		//		  {
		//			  changed = true;
		//			  PriceBase = priceentered;
		//		  }		  	
		//		  else
		//			  PriceEntered = oPriceEntered;
		//	  }		  
	}

	public Integer getC_UOMSales_ID()
	{
		return m_rowdata.getC_UOMSales_ID();
	}
	
	public void setC_UOMSales_ID(Integer value)
	{
		setField("C_UOMSales_ID", value);
	}
	
	public Integer getC_UOMBonus_ID()
	{
		return m_rowdata.getC_UOMBonus_ID();
	}

	public void setC_UOMBonus_ID(Integer value)
	{
		setField("C_UOMBonus_ID", value);
		//	  if (pC_UOMBonus_ID == null)
		//		  return;
		//	  if (C_UOMBonus_ID.compareTo(pC_UOMBonus_ID) != 0)
		//	  {
		//		  Integer oC_UOMBonus_ID = C_UOMBonus_ID;
		//		  C_UOMBonus_ID = pC_UOMBonus_ID;
		//	      if (qty("C_UOMBonus_ID", Env.ZERO) && amt("C_UOMBonus_ID", Env.ZERO))
		//	    	  changed = true;
		//	      else
		//	      {
		//	    	  C_UOMBonus_ID = oC_UOMBonus_ID;
		//	      }
		//	  }
	}

	public BigDecimal getQtyBonusOrdered()
	{
		return m_rowdata.getQtyBonusOrdered();
	}
	
	public Integer getC_UOM_ID()
	{
		return m_rowdata.getC_UOM_ID();
	}

	public void setC_UOM_ID(Integer value)
	{
		setField(X_C_OrderLine.COLUMNNAME_C_UOM_ID, value);
		//	  if (pC_UOM_ID == null)
		//		  return;
		//	  if (C_UOM_ID.compareTo(pC_UOM_ID) != 0)
		//	  {
		//		  Integer oC_UOM_ID = C_UOM_ID;
		//		  C_UOM_ID = pC_UOM_ID;
		//	      if (qty("C_UOM_ID", Env.ZERO) && amt("C_UOM_ID", Env.ZERO))
		//	    	  changed = true;
		//	      else
		//	      {
		//	    	  C_UOM_ID = oC_UOM_ID;
		//	    	  QtyEntered = Env.ZERO;
		//	      	  QtyOrdered = Env.ZERO;
		//	      }
		//	  }
	}

	public void  setPriceActual (BigDecimal value)  
	{	  
		setField(X_C_OrderLine.COLUMNNAME_PriceActual, value);
		//	  if (priceactual == null)
		//		  return;
		//	  priceactual = priceactual.setScale(getStdPrecision(), BigDecimal.ROUND_HALF_UP);
		//	  if ( PriceActual.compareTo(priceactual) != 0 )
		//	  {
		//		  BigDecimal oPriceActual = PriceActual;
		//		  if (amt("PriceActual", priceactual))
		//			  changed = true;
		//		  else
		//			  PriceActual = oPriceActual;
		//	  }
	}	//	setPriceActual

	public void setM_AttributeSetInstance_ID(Integer value) {
		setField(X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID, value);
		//	  if (pM_AttributeSetInstance_ID == null)
		//		  return;
		//	  if (M_AttributeSetInstance_ID.compareTo(pM_AttributeSetInstance_ID) != 0)
		//	  {
		//		  M_AttributeSetInstance_ID = pM_AttributeSetInstance_ID;
		//		  qty("M_AttributeSetInstance_ID", BigDecimal.valueOf(pM_AttributeSetInstance_ID));
		//	  }
	}   


	public BigDecimal getNet() {
		return m_rowdata.getNet();
	}

	public void setNet(BigDecimal value) {
		setField("Net", value);
		//		if (pNet == null)
		//			return;
		//		if (Net.compareTo(pNet) != 0)
		//		{
		//			BigDecimal PriceList1 = pNet;
		//			
		//			PriceList1 = PriceList1.divide(QtyEntered, Env.divideprecision, BigDecimal.ROUND_HALF_UP);
		//
		//			if (Freight.compareTo(Env.ZERO) != 0 )
		//			{
		//				PriceList1 = PriceList1.subtract(Freight);
		//			}
		//			if (Discount4.compareTo(Env.ZERO) != 0)
		//			{
		//				PriceList1 = PriceList1.multiply (Env.ONEHUNDRED .divide(	 Env.ONEHUNDRED.subtract(Discount4) , Env.divideprecision, BigDecimal.ROUND_HALF_UP));				 				 			
		//				Discount4Amt = new BigDecimal ((100.0 - Discount4.doubleValue()) / 100.0 * PriceList1.doubleValue())
		//				.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);				 
		//			}			
		//			if (Discount3.compareTo(Env.ZERO) != 0)
		//			{
		//				PriceList1 = PriceList1.multiply (Env.ONEHUNDRED .divide(	 Env.ONEHUNDRED.subtract(Discount3) , Env.divideprecision, BigDecimal.ROUND_HALF_UP));				 				 			
		//				Discount3Amt = new BigDecimal ((100.0 - Discount3.doubleValue()) / 100.0 * PriceList1.doubleValue())
		//				.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);				 
		//			}
		//			if (Discount2.compareTo(Env.ZERO) != 0)
		//			{
		//				PriceList1 = PriceList1.multiply (Env.ONEHUNDRED .divide(	 Env.ONEHUNDRED.subtract(Discount2) , Env.divideprecision, BigDecimal.ROUND_HALF_UP));				 
		//				Discount2Amt = new BigDecimal ((100.0 - Discount2.doubleValue()) / 100.0 * PriceList1.doubleValue())
		//				.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);				 			 
		//			}
		//			amt("PriceEntered", PriceList1);
		//			changed = true;			
		//		}
	}		    



	public BigDecimal getTotal() {
		return m_rowdata.getTotal();
	}

	public void setTotal(BigDecimal value) {		
//		float d  = getDiscount().floatValue();
//		float d1 = getDiscount1().floatValue();
//		float d2 = getDiscount2().floatValue();
//		float d3 = getDiscount3().floatValue();
//		float d4 = getDiscount4().floatValue();
//		float discount = (1-(d / 100)) * (1-(d1 / 100)) * (1-(d2 / 100)) * (1-(d3 / 100)) * (1-(d4 / 100));
//		
//		float pa = getPriceActual().floatValue();
//		float tot = value.floatValue();
//		float np = tot / pa;
//		float pa2 = (np / discount) * pa;
//		//this.getRowData().setPriceActual(pa2);
		setField("Total", value);
	}		    

	//  public boolean amt(String name, Object amt) {
	//
	//	  if (name.equals("PriceEnteredWithoutTax"))
	//	  {
	//		  PriceEnteredWithoutTax = (BigDecimal) amt;
	//		  BigDecimal tax = m_tax.calculateTax(PriceEnteredWithoutTax, false, StdPrecision);
	//		  amt  = PriceEnteredWithoutTax.add(tax);   		 
	//		  name = "PriceEntered";
	//	  }
	//
	//	  if ((name.equals("QtyOrdered") 
	//		|| name.equals("QtyEntered")
	//		|| name.equals("M_Product_ID")) 
	//		&& !"N".equals(Env.getContext(Env.getCtx(), getWindowNo(), "DiscountSchema")))
	//	 {
	//		if (name.equals("QtyEntered"))
	//				QtyOrdered = MUOMConversion.convertProductTo (Env.getCtx(), M_Product_ID, 
	//					C_UOM_ID, QtyEntered);
	//		if (QtyOrdered == null)
	//			QtyOrdered = QtyEntered;
	//		
	//		MProductPricing pp = new MProductPricing (M_Product_ID, C_BPartner_ID, QtyOrdered, true);
	//		pp.setM_PriceList_ID(M_PriceList_ID);
	//		// globalqss - fix reported bug [ 1643489 ] PriceListVersion misfunctionality
	//		int M_PriceList_Version_ID;
	//		// try to get the price list version from info product tab
	//		M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID");
	//		// if not found try to get from the context of window
	//		if (M_PriceList_Version_ID == 0)
	//			M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "M_PriceList_Version_ID");
	//		// end globalqss 
	//		pp.setM_PriceList_Version_ID(M_PriceList_Version_ID);
	//		Timestamp date = getDateOrdered();
	//		pp.setPriceDate(date);
	//		//
	//		PriceEntered = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
	//			C_UOM_ID, pp.getPriceStd());
	//		if (PriceEntered == null)
	//			PriceEntered = pp.getPriceStd();
	//	    PriceActual = pp.getPriceStd();
	//		Discount1 =    pp.getDiscount();
	//		Env.setContext(Env.getCtx(), getWindowNo(), "DiscountSchema", pp.isDiscountSchema() ? "Y" : "N");
	//		
	//	 }
	//	 else if (name.equals("PriceActual"))
	//	 {
	//			PriceActual = (BigDecimal) amt;
	//			PriceEntered = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
	//				C_UOM_ID, PriceActual);
	//			if (PriceEntered == null)
	//				PriceEntered = PriceActual;
	//		 
	//	 }	  
	//   	 else if (name.equals("PriceEntered"))
	// 	 {
	//			PriceEntered = (BigDecimal) amt;
	//			PriceActual = MUOMConversion.convertProductTo (Env.getCtx(), M_Product_ID, 
	//				C_UOM_ID, PriceEntered);
	//			if (PriceActual == null)
	//				PriceActual = PriceEntered;
	//	 }
	//   	 else if (name.equals("SalesMargin"))
	//   	 {
	//   		 SalesMargin = (BigDecimal) amt;
	//   		 if (SalesMargin == null)
	//   			 SalesMargin = Env.ZERO;
	//   		 PriceAcquisition2 = PriceAcquisition1.add(PriceAcquisition1.multiply(SalesMargin.divide(Env.ONEHUNDRED, Env.divideprecision, BigDecimal.ROUND_HALF_UP)));
	//   		 PriceAcquisition2 = PriceAcquisition2.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//   	 }
	//	 
	//	 if (name.equals("Discount1") || 
	//	     name.equals("Discount2") ||
	//	     name.equals("Discount3") ||
	//	     name.equals("Discount4") ||
	//	     name.equals("Freight") ||
	//	     name.equals("Bonus") ||
	//	     name.equals("C_UOMBonus_ID"))
	//	 {
	//		 //BigDecimal discount = Env.ZERO;
	//		 if (name.equals("Bonus") || name.equals("C_UOMBonus_ID"))
	//		 {
	//			 QtyBonus = (BigDecimal) amt;
	//			 if (QtyBonus == null)
	//				 QtyBonus = Env.ZERO;
	//
	//			 if (QtyBonus.compareTo(Env.ZERO) == 0)
	//			 {
	//				 Discount1 = Env.ZERO;
	//				 Discount1Amt = Env.ZERO;
	//			 }
	//			 else
	//			 {
	//				 // Qty Bonus debe ser convertido a la unidad de la compra
	//
	//				 BigDecimal QtyOrderedBonus1 = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
	//						 C_UOMBonus_ID, QtyBonus);
	//
	//				 BigDecimal QtyOrdered1 = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
	//						 C_UOM_ID, QtyEntered);
	//				 
	//				 {			 
	//					 QtyOrdered1 = QtyOrdered1.add(QtyOrderedBonus1); 
	//
	//					 if (QtyOrdered.compareTo(Env.ZERO) > 0 && QtyOrdered1.compareTo(Env.ZERO) > 0)
	//					 {
	//						 BigDecimal pricewithBonus    = PriceList.divide(QtyOrdered1,10,BigDecimal.ROUND_HALF_UP);
	//						 BigDecimal pricewithoutBonus = PriceList.divide(QtyOrdered,10,BigDecimal.ROUND_HALF_UP);				 				 
	//						 BigDecimal newPrice = pricewithoutBonus.subtract(pricewithBonus);
	//
	//						 Discount1 = newPrice.multiply(Env.ONEHUNDRED).divide(pricewithoutBonus, 10, BigDecimal.ROUND_HALF_UP);
	//						 Discount1 = Discount1.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//					 }
	//					 else
	//					 {
	//						 Discount1 = Env.ZERO;
	//						 Discount1Amt = Env.ZERO;					 
	//					 }
	//				 }
	//			 }
	//		 }
	//		 if (name.equals("Discount1"))
	//		 {
	//			 Discount1 = (BigDecimal) amt;
	//			 if (Discount1 == null)
	//				 Discount1 = Env.ZERO;
	//			 if (Discount1.compareTo(Env.ZERO) == 0)
	//				 Discount1Amt = Env.ZERO;
	//		 }
	//		 else if (name.equals("Discount2"))
	//		 {
	//			 Discount2 = (BigDecimal) amt;
	//			 if (Discount2 == null)
	//				 Discount2 = Env.ZERO;
	//			 if (Discount2.compareTo(Env.ZERO) == 0)
	//				 Discount2Amt = Env.ZERO;			 
	//			 
	//		 }
	//		 else if (name.equals("Discount3"))
	//		 {
	//			 Discount3 = (BigDecimal) amt;
	//			 if (Discount3 == null)
	//				 Discount3 = Env.ZERO;
	//			 if (Discount3.compareTo(Env.ZERO) == 0)
	//				 Discount3Amt = Env.ZERO;			 
	//		 }
	//		 else if (name.equals("Discount4"))
	//		 {
	//			 Discount4 = (BigDecimal) amt;
	//			 if (Discount4 == null)
	//				 Discount4 = Env.ZERO;
	//			 if (Discount4.compareTo(Env.ZERO) == 0)
	//				 Discount4Amt = Env.ZERO;			 
	//		 }		 
	//		 else
	//			 //discount = discount.add(Discount1).add(Discount2).add(Discount3);
	//				 
	//		 if (name.equals("Freight"))
	//		 {
	//			 Freight = (BigDecimal) amt;
	//			 if (Freight == null)
	//				 Freight = Env.ZERO;			 
	//		 }	 
	//		 
	//  	  }
	//	 
	//	 if (name.equals("PriceAcquisition2"))
	//	 {
	//		 PriceAcquisition2 = (BigDecimal) amt;
	//		 if (PriceAcquisition2 == null)
	//			 PriceAcquisition2 = Env.ZERO;
	//		 SalesMargin = Env.ZERO;
	//	 }	 
	//	 	 
	//	 if (name.equals("Bonus")) 
	//		 QtyBonus = (BigDecimal) amt;		 		 
	//	 
	//	 if (name.equals("DiscountAcquire1"))
	//		 DiscountAcquire1 = (BigDecimal) amt;
	//	 
	//	 if (name.equals("newSalesPriceList"))
	//	 {
	//		 // do nothing :)
	//	 }
	//	 
	//	 BigDecimal PriceList1 = PriceEntered;	 
	//
	//	 if (Discount2.compareTo(Env.ZERO) != 0)
	//	 {
	//		 Discount2Amt = new BigDecimal ((100.0 - Discount2.doubleValue()) / 100.0 * PriceList1.doubleValue());		 
	//		 PriceList1 = Discount2Amt;
	//	 }
	//	 
	//	 if (Discount3.compareTo(Env.ZERO) != 0)
	//	 {
	//		 Discount3Amt = new BigDecimal ((100.0 - Discount3.doubleValue()) / 100.0 * PriceList1.doubleValue());		 
	//		 PriceList1 = Discount3Amt;
	//	 }
	//
	//	 if (Discount4.compareTo(Env.ZERO) != 0)
	//	 {
	//		 Discount4Amt = new BigDecimal ((100.0 - Discount4.doubleValue()) / 100.0 * PriceList1.doubleValue());		 
	//		 PriceList1 = Discount4Amt;
	//	 }
	//	 
	//	 //PriceList1 = PriceList1.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//
	//	 Gross = PriceList.multiply(QtyEntered).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//	 Net = PriceList1.multiply(QtyEntered).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//	 
	//	 calculatetax();
	//	 
	//	 Total = Net;
	//	 
	//	 if (!IsTaxIncluded())
	//		 Total = Total.add(TaxAmount);	 
	//	 
	//	 Total = Total.setScale(2, BigDecimal.ROUND_HALF_UP);
	//	 	 
	//	 PriceAcquisition1 = Env.ZERO;
	//	 		 
	//	 BigDecimal Qty = QtyEntered;
	//
	//	 if (QtyBonus.compareTo(Env.ZERO) != 0)
	//		 Qty = Qty.add(QtyBonus);
	//	 
	//	 if (Qty.compareTo(Env.ZERO) > 0)
	//	 {
	//		 PriceAcquisition1 = Total.divide(Qty, Env.divideprecision, BigDecimal.ROUND_HALF_UP);
	//
	//		 if ( DiscountAcquire1.compareTo(Env.ZERO) != 0 )
	//		 {
	//			 SalesMargin = Env.ZERO;
	//			 PriceAcquisition1 = PriceAcquisition1.subtract
	//			 (PriceAcquisition1.multiply (DiscountAcquire1 
	//					 .divide(	 
	//							 Env.ONEHUNDRED , 
	//							 Env.divideprecision, 
	//							 BigDecimal.ROUND_HALF_UP))
	//			 );				 
	//		 }
	//
	//		 PriceAcquisition1 = PriceAcquisition1.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	//
	//		 if (Freight.compareTo(Env.ZERO) != 0 && QtyOrdered.compareTo(Env.ZERO) != 0)
	//		 {
	//			 PriceAcquisition1 = PriceAcquisition1.add(Freight);
	//		 }
	//
	//		 if (PriceAcquisition2.compareTo(Env.ZERO) == 0 && !name.equals("PriceAcquisition2"))
	//			 PriceAcquisition2 = PriceAcquisition1;
	//
	////		 if (SalesMargin.compareTo(Env.ZERO) != 0)
	////		 {		 
	////			 PriceAcquisition2 = PriceAcquisition1.add(PriceAcquisition1.multiply(SalesMargin.divide(Env.ONEHUNDRED, Env.divideprecision, BigDecimal.ROUND_HALF_UP)));
	////			 PriceAcquisition2 = PriceAcquisition2.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
	////		 }
	////		 else
	////		 {
	//			 this.setSalesMargin();
	//		 //}
	//	 }
	//	 
	//	 return true;	 
	//  }

	//private void calculatetax() {
	//	 if (m_tax != null)
	//	 {
	//		 TaxAmount = m_tax.calculateTax(Net, IsTaxIncluded(), StdPrecision);
	//		 Total = Net.add(TaxAmount);
	//	 }	
	//}

	//public boolean qty(String name, BigDecimal qty) {
	//	  if ( getM_Product_ID() == 0 && name.equals("M_AttributeSetInstance_ID"))
	//		  return true;
	//	  else if (name == "C_UOM_ID")
	//	  {
	//		  	int C_UOM_To_ID = C_UOM_ID;
	//			BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
	//			if (QtyEntered.compareTo(QtyEntered1) != 0)
	//			{
	//				QtyEntered = QtyEntered1;
	//			}
	//			QtyOrdered = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
	//				C_UOM_To_ID, QtyEntered);
	//			if (QtyOrdered == null)
	//				QtyOrdered = QtyEntered;
	//			boolean conversion = QtyEntered.compareTo(QtyOrdered) != 0;
	//			PriceEntered = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
	//				C_UOM_To_ID, PriceActual);
	//			if (PriceEntered == null)
	//				PriceEntered = PriceActual; 
	//			UOMConversion  = conversion ? "Y" : "N";
	//		  
	//	  }
	//      //	QtyEntered changed - calculate QtyOrdered
	//	  else if (name == "QtyEntered")
	//	  {
	//		  int C_UOM_To_ID = C_UOM_ID; 
	//		  QtyEntered = qty;
	//		  BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
	//		  if (QtyEntered.compareTo(QtyEntered1) != 0)
	//		  {
	//				QtyEntered = QtyEntered1;
	//		  }
	//		  QtyOrdered = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
	//				C_UOM_To_ID, QtyEntered);
	//		  if (QtyOrdered == null)
	//			QtyOrdered = QtyEntered;
	//	      boolean conversion = QtyEntered.compareTo(QtyOrdered) != 0;
	//	      UOMConversion  = conversion ? "Y" : "N";
	//	  }
	//	  //return checkAvailable();
	//	  return true;
	//}


	/*************************************************************************
	 *	Order Line - Product.
	 *		- reset C_Charge_ID / M_AttributeSetInstance_ID
	 *		- PriceList, PriceStd, PriceLimit, C_Currency_ID, EnforcePriceLimit
	 *		- UOM
	 *	Calls Tax
	 *
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public Boolean product (MProduct product)
	{
		if (product == null)
			return false;
		if (product.getM_Product_ID() == 0)
			return false;
		m_Product = product;								
		setField(X_C_OrderLine.COLUMNNAME_M_Product_ID, product.getM_Product_ID());
		return true;
		//	
		//	M_Product_ID = (Integer)value;
		//	if (M_Product_ID == null || M_Product_ID.intValue() == 0)
		//		return false;
		//		
		//	/*****	Price Calculation see also qty	****/
		//	BigDecimal Qty = QtyOrdered;
		//    //IsSOTrx = true; // Env.getContext(Env.getCtx(), getWindowNo(), "IsSOTrx").equals("Y");
		//	MProductPricing pp = new MProductPricing (M_Product_ID.intValue(), C_BPartner_ID, Qty, IsSOTrx);
		//	pp.setM_PriceList_ID(M_PriceList_ID);
		//	/** PLV is only accurate if PL selected in header */
		//	// globalqss - fix reported bug [ 1643489 ] PriceListVersion misfunctionality
		//	int M_PriceList_Version_ID;
		//	// try to get the price list version from info product tab
		//	M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID");
		//	// if not found try to get from the context of window
		//	if (M_PriceList_Version_ID == 0)
		//		M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "M_PriceList_Version_ID");
		//	// end globalqss 
		//	pp.setM_PriceList_Version_ID(M_PriceList_Version_ID); 
		//	pp.setPriceDate(getDateOrdered());
		//	//		
		//	C_Currency_ID = pp.getC_Currency_ID();
		//	Discount1 = pp.getDiscount();
		//	Env.setContext(Env.getCtx(), getWindowNo(), "EnforcePriceLimit", pp.isEnforcePriceLimit() ? "Y" : "N");
		//	Env.setContext(Env.getCtx(), getWindowNo(), "DiscountSchema", pp.isDiscountSchema() ? "Y" : "N");
		//	Env.setContext(Env.getCtx(), getWindowNo(), "M_Product_ID", M_Product_ID);
		//	MProduct product = MProduct.get (Env.getCtx(), M_Product_ID.intValue());
		//	//C_UOM_ID = product.getC_UOM_Order_ID();
		//	C_UOM_ID = pp.getC_UOM_ID();
		//	if (C_UOM_ID > 0 && C_UOMBonus_ID == 0)
		//		C_UOMBonus_ID = C_UOM_ID;
		//	
		//	PriceList = MUOMConversion.convertProductFrom (Env.getCtx(), product.getM_Product_ID(), 
		//			C_UOM_ID, pp.getPriceList());
		//	
		//	if (PriceList == null)
		//		PriceList = Env.ZERO;
		//	
		//	PriceLimit = MUOMConversion.convertProductFrom (Env.getCtx(), product.getM_Product_ID(), 
		//			C_UOM_ID, pp.getPriceLimit());
		//	
		//	if (PriceLimit == null)
		//		PriceLimit = Env.ZERO;
		//	
		//	PriceActual = MUOMConversion.convertProductFrom (Env.getCtx(), product.getM_Product_ID(), 
		//			C_UOM_ID, pp.getPriceStd());
		//	
		//	if (PriceActual == null)
		//		PriceActual = Env.ZERO;
		//	
		//	PriceEntered = MUOMConversion.convertProductFrom (Env.getCtx(), product.getM_Product_ID(), 
		//			C_UOM_ID, pp.getPriceStd());
		//
		//	if (PriceEntered == null)
		//		PriceEntered = Env.ZERO;
		//	
		//	
		//	mValue = product.getValue();
		//	mName = product.getName();
		//	mProductBrand = product.getBrand();
		//	mProductBrandValue = product.getBrandValue();
		//	C_TaxCategory_ID = product.getC_TaxCategory_ID();
		//	isStocked = product.isStocked();
		//	M_AttributeSet_ID = product.getM_AttributeSet_ID();
		//	if (M_AttributeSet_ID != 0) {
		//		MAttributeSet mas = MAttributeSet.get(Env.getCtx(),
		//				M_AttributeSet_ID);
		//		if (mas != null	&& mas.isMandatory())  {
		//			IsAttributeMandatory = true;
		//		}
		//	}
		//	if (isStocked)
		//	{
		////		if (M_AttributeSetInstance_ID == 0)
		////		{
		////			Integer new_AttributeSetInstance_ID;			
		////			if (ASIExceptions.size() > 0)
		////			{
		////				String ASIArray = "";
		////				Enumeration en = ASIExceptions.elements();
		////				while (en.hasMoreElements())
		////				{
		////					if (ASIArray.length() > 0)
		////						ASIArray = ASIArray.concat(",");
		////					Integer it = (Integer) en.nextElement();
		////					ASIArray = ASIArray.concat(it.toString());
		////				}				
		////				new_AttributeSetInstance_ID = DB.getSQLValue(null, "SELECT * FROM getancientattributesetinstance(?, ?, ?, ?, ARRAY["+ASIArray+"])", M_Warehouse_ID, M_Product_ID, Qty, Env.getAD_Org_ID(Env.getCtx()));
		////			}
		////			else
		////				new_AttributeSetInstance_ID = DB.getSQLValue(null, "SELECT * FROM getancientattributesetinstance(?, ?, ?, ?)", M_Warehouse_ID, M_Product_ID, Qty, Env.getAD_Org_ID(Env.getCtx()));
		////			
		////			if (new_AttributeSetInstance_ID > 0 )
		////				M_AttributeSetInstance_ID = new_AttributeSetInstance_ID;
		////		}
		//		//if (!checkAvailable())
		//		//	return false;
		//		
		//		
		//	}
		//	//
		//	return tax( name, value);
		//	//return true;
	}	//	product

	public boolean IsAttributeOK()
	{
		//		this.IsAttributeMandatory
		//		row.setIsAttributeMandatory(true);
		//		if (this.getM_AttributeSetInstance_ID() == 0)
		if (IsAttributeMandatory && this.getM_AttributeSetInstance_ID() == 0)
			return false;
		else
			return true;
	}
	//public void UpdateLastBuy() {
	//	String sql = " SELECT i.dateinvoiced, l.PriceActual,l.C_UOM_ID FROM C_InvoiceLine l JOIN C_invoice i ON l.C_Invoice_ID = i.C_Invoice_ID ";
	//	sql = sql.concat( " WHERE l.M_Product_ID=? AND i.IsSOTrx='N' ORDER BY i.dateinvoiced DESC ");
	//	PreparedStatement pstmt = DB.prepareStatement(sql, null);
	//	try {		
	//		pstmt.setInt(1, M_Product_ID );
	//		ResultSet rs = pstmt.executeQuery();
	//		
	//		if (rs.next())
	//		{
	//			LastdateInvoiced = rs.getTimestamp(1);
	//			LastPriceActual = rs.getBigDecimal(2);
	//		}
	//		rs.close();
	//		pstmt.close();
	//		pstmt = null;			
	//	} catch (SQLException e) {	
	//		e.printStackTrace();
	//	}	
	//}

	public void setWithholdingType(String WithholdingType)
	{
		m_rowdata.setM_WithholdingType(WithholdingType);
	}

	public String getWithholdingType()
	{
		return m_rowdata.getM_WithholdingType();
	}

	public BigDecimal getQtyAvailable() {
		BigDecimal CurrentQty = Env.ZERO;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT bomQtyAvailable(p.M_Product_ID,?,0)");
		sb.append(" FROM m_product p where p.M_Product_ID = ?");
		PreparedStatement pstmt = DB.prepareStatement(sb.toString(), null);
		try {		
			pstmt.setInt(1, m_rowdata.getM_Warehouse_ID());
			pstmt.setInt(2, m_rowdata.getM_Product_ID() );
			ResultSet rs = pstmt.executeQuery();

			if (rs.next())
			{
				CurrentQty = rs.getBigDecimal(1);
			}
			rs.close();
			pstmt.close();
			pstmt = null;			
		} catch (SQLException e) {	
			e.printStackTrace();
		}	
		return CurrentQty;
	}

	public static Boolean tax (Row row)
	{
		//	Check Partner Location				
		//int shipC_BPartner_Location_ID = Env.getContextAsInt(Env.getCtx(), row.getWindowNo(), "C_BPartner_Location_ID");
		int shipC_BPartner_Location_ID = row.getPOPPanel().getOrder().getC_BPartner_Location_ID();
		if (shipC_BPartner_Location_ID == 0)
			return true;		

		Timestamp billDate = row.getDateOrdered();
		Timestamp shipDate = row.getDatePromised();

		int AD_Org_ID = Env.getContextAsInt(Env.getCtx(), row.getWindowNo(), "AD_Org_ID");

		//int billC_BPartner_Location_ID = Env.getContextAsInt(Env.getCtx(), row.getWindowNo(), "Bill_Location_ID");
		int billC_BPartner_Location_ID = row.getPOPPanel().getOrder().getBill_Location_ID();
		if (billC_BPartner_Location_ID == 0)
			billC_BPartner_Location_ID = shipC_BPartner_Location_ID;

		//
		int TaxID = Tax.get (Env.getCtx(), row.getM_Product_ID(), 0 /* Charge */, billDate, shipDate,
				AD_Org_ID, row.getRowData().getM_Warehouse_ID(), billC_BPartner_Location_ID, shipC_BPartner_Location_ID,
				true);
		//
		if (TaxID == 0) {
			return false;
		}	
		//mTab.fireDataStatusEEvent(CLogger.retrieveError());
		//else
		row.setC_Tax_ID(TaxID);
		if (row.getTax() == null)
		{
			MTax tax = new MTax(Env.getCtx(), TaxID, null);
			row.setTax(tax);
		}
		row.setTaxAmount(row.getTax().calculateTax(row.getNet(), row.IsTaxIncluded(), row.getStdPrecision()));
		//
		return true;
	}	//	tax

	public MTax getTax() {
		return m_tax;
	}
	private void setTax(MTax tax) {
		m_tax = tax;
	}
	private PopPanel getPOPPanel() {
		return m_POPPanel;		
	}
	/**
	 * Gets the creation date
	 * @return Date the creation date
	 */
	private int getC_Currency_ID() {
		return C_Currency_ID;
	}

	void setC_Currency_ID(int pC_Currency_ID) {
		C_Currency_ID = pC_Currency_ID;
	}

	/**
	 * 	Get Product
	 *	@return product or null
	 */
	public MProduct getProduct()
	{
		if (m_product == null && getM_Product_ID() != 0)
			m_product =  MProduct.get (Env.getCtx(), getM_Product_ID(), null);
		return m_product;
	}	//	getProduct
	public Integer getM_AttributeSetInstance_ID() {
		return m_rowdata.getM_AttributeSetInstance_ID();
	}
	public Integer getM_PriceList_ID() { 
		return m_rowdata.getM_PriceList_ID();
	}
	public void setM_PriceList_ID(Integer value) {
		m_rowdata.setM_PriceList_ID(value);
		//StdPrecision = MPriceList.getPricePrecision(Env.getCtx(), M_PriceList_ID);
	}
	public String getGroup() { 
		return mGroup; 
	}
	public void setGroup(String pGroup) {
		mGroup = pGroup;
	}
	public String getProductBrand() { 
		return mProductBrand; 
	}
	public void setProductBrand(String pProductBrand) {
		mProductBrand = pProductBrand;
	}
	public String getProductBrandValue() { 
		return mProductBrandValue; 
	}
	public void setProductBrandValue(String pProductBrandValue) {
		mProductBrandValue = pProductBrandValue;
	}  
	public BigDecimal getGross() {
		return m_rowdata.getGross();
	}
	public void setGross(BigDecimal value) {	  
		setField("Gross", value);
	}
	//  public BigDecimal getQtyAvailable() {	  	  		   
	//		return mQtyAvailable;
	//  }
	//  public void setQtyAvailable(BigDecimal available) {
	//		//mAvailable = available;
	//  }
	public Integer getM_Warehouse_ID() {
		return m_rowdata.getM_Warehouse_ID();
	}
	public void setM_Warehouse_ID(Integer value) {
		m_rowdata.setM_Warehouse_ID(value);
	}
	public Integer getC_TaxCategory_ID() {
		return m_rowdata.getC_TaxCategory_ID();
	}
	public void setC_TaxCategory_ID(Integer value) {
		setField(X_M_Product.COLUMNNAME_C_TaxCategory_ID, value);
	}

	public void setC_BPartner_ID(Integer value)
	{
		//setField(X_C_OrderLine.COLUMNNAME_C_BPartner_ID, value);
		m_rowdata.setC_BPartner_ID(value);
	}
	public Integer getC_BPartner_ID()
	{
		return m_rowdata.getC_BPartner_ID();
	}
	public Timestamp getDateOrdered()
	{
		return m_rowdata.getDateOrdered();
	}
	public void setDateOrdered(Timestamp pDateOrdered)
	{
		if (DateOrdered.compareTo(pDateOrdered) != 0)
		{ 
			DateOrdered = pDateOrdered;
			changed = true;	
		}

	}
	//
	public Timestamp  getDatePromised() {	
		return m_rowdata.getDatePromised(); 
	}
	public void setDatePromised(Timestamp value) {	
		m_rowdata.setDatePromised(value);}
	//
	public void setPriceLimit(BigDecimal value) {  
		m_rowdata.setPriceLimit(value);  
	}
	public BigDecimal getPriceLimit() {	  
		return m_rowdata.getPriceLimit(); 
	}
	public BigDecimal getPriceActual()  {	  
		return m_rowdata.getPriceActual();  
	}  
	public Boolean getPack() {		return Pack;	}
	public void setM_PriceListVersion_ID(Integer value) 
	{			  
		m_rowdata.setM_PriceListVersion_ID(value);
	}
	public Integer getM_PriceListVersion_ID() {		
		return m_rowdata.getM_PriceListVersion_ID();	
	}
	public BigDecimal getPriceEntered() {		
		return m_rowdata.getPriceEntered();	
	}
	public void setTaxIncluded(boolean value) {
		m_rowdata.setM_TaxIncluded(value);	 
	}
	public boolean IsTaxIncluded() {
		return m_rowdata.isM_TaxIncluded();
	}
	public void setWindowNo(int mWindowNo) {
		m_WindowNo = mWindowNo;
	}
	public Integer getWindowNo() {
		return m_WindowNo;
	} 	
	public String getLot()
	{
		return m_rowdata.getM_Lot();
	}
	public void setLot(String value)
	{
		m_rowdata.setM_Lot(value);
	}
	public Timestamp getGuaranteeDate()
	{
		return m_rowdata.getM_GuaranteeDate();
	}
	public void setGuaranteeDate(Timestamp value)
	{
		m_rowdata.setM_GuaranteeDate(value);
	}
	public void setC_OrderLine_ID(Integer value) {
		m_rowdata.setC_OrderLine_ID(value);	
	}
	public Integer getC_OrderLine_ID() {
		return m_rowdata.getC_OrderLine_ID();	
	}  
	public Integer getM_InOutLine_ID() {
		return m_rowdata.getM_InOutLine_ID();
	}    
	public void setM_InOutLine_ID(int value) {
		m_rowdata.setM_InOutLine_ID(value);
	}
	public void setTaxAmount(BigDecimal value) {
		m_rowdata.setTaxAmount(value);
	}
	public BigDecimal getTaxAmount() {
		return m_rowdata.getTaxAmount();
	}
	public BigDecimal getPriceAcquisition() {
		return m_rowdata.getPriceAcquisition();
	}
	public void setPriceAcquisition(BigDecimal value) {
		m_rowdata.setPriceAcquisition(value);
	}  
	//	public BigDecimal getPriceAcquisition2() {
	//		return m_rowdata.getPriceAcquisition2();
	//	}
	//	public void setPriceAcquisition2(BigDecimal value) {
	//		m_rowdata.setPriceAcquisition2(value);
	//	}

	public void setParent(PopPanel popPanel) {
		m_POPPanel = popPanel;
	}	

	public BigDecimal getQtyBonus() {
		return m_rowdata.getQtyBonus();
	}
	public void setQtyBonus(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_QtyBonus, value);		
	}
	public String getUOMConversion() {
		return m_rowdata.getUOMConversion();
	}
	public void setUOMConversion(String value) {
		m_rowdata.setUOMConversion(value);
	}
	public void addASIExceptions(Vector v) {
		ASIExceptions = v;
	}  
//	public void setField(String name, Object value) {
//		if (oldvalues.containsKey(name))
//		{
//			if (oldvalues.get(name) != null)
//				if (oldvalues.get(name).equals(value))
//					return;							
//		}		
//		if (value instanceof BigDecimal)
//		{
//			m_FieldValue = (BigDecimal) value;
//		}
//		else if (value instanceof Integer)
//		{
//			m_FieldIntValue = (Integer) value;
//		}
//		oldvalues.put(name, value);
//		m_FieldName = name;
//		m_POPPanel.updateRow(this);
//		m_POPPanel.executerules(null, "row");
//		setIsChanged(true);
//	}
	public void updateRow() {
		m_POPPanel.updateRow(this);
		m_POPPanel.executerules(null, "row");		
	}
//	public String getFieldName()
//	{
//		return m_FieldName;
//	}
//	public BigDecimal getFieldValue()
//	{
//		return m_FieldValue;
//	}
//	public int getFieldIntValue()
//	{
//		return m_FieldIntValue;
//	}

	public static MProductPricing getProductPricing(Row row) {
		MProductPricing pp = new MProductPricing (row.getM_Product_ID(), row.getC_BPartner_ID(), row.getQtyOrdered(), false);
		pp.setM_PriceList_ID(row.getM_PriceList_ID());
		pp.setM_PriceList_Version_ID(row.getM_PriceListVersion_ID());
		Timestamp date = row.getDateOrdered();
		pp.setPriceDate(date);
		Env.setContext(Env.getCtx(), row.getWindowNo(), "EnforcePriceLimit", pp.isEnforcePriceLimit() ? "Y" : "N");
		Env.setContext(Env.getCtx(), row.getWindowNo(), "DiscountSchema", pp.isDiscountSchema() ? "Y" : "N");
		return pp;
	}

	public static boolean price(Row row, String field)
	{
		int M_Product_ID = row.getM_Product_ID();
		if (field.equals(X_M_Product.COLUMNNAME_M_Product_ID))
		{
			M_Product_ID =row.getFieldIntValue();
		}
		/*****	Price Calculation see also qty	****/
		BigDecimal Qty = row.getQtyOrdered();

		Env.setContext(Env.getCtx(), row.getWindowNo(), "M_Product_ID", M_Product_ID);
		MProduct product = MProduct.get (Env.getCtx(), M_Product_ID, null);			
		row.getRowData().setM_Product_ID(M_Product_ID);
		//		MProductPricing pp = new MProductPricing (M_Product_ID, row.getC_BPartner_ID(), Qty, false);
		//		pp.setM_PriceList_ID(row.getM_PriceList_ID());			
		//		pp.setM_PriceList_Version_ID(row.getM_PriceListVersion_ID()); 
		//		pp.setPriceDate(row.getDateOrdered());
		MProductPricing pp = getProductPricing(row);
		//		
		row.setC_Currency_ID(pp.getC_Currency_ID());
		row.getRowData().setDiscount1(pp.getDiscount());
		row.getRowData().setC_UOM_ID(pp.getC_UOM_ID());
		//row.getRowData().setC_UOM_ID(product.getC_UOM_Order_ID());
		//if (row.getC_UOM_ID() > 0 && row.getC_UOMBonus_ID() == 0)
		row.getRowData().setC_UOMBonus_ID(row.getC_UOM_ID());
		//row.setC_UOM_Buy_ID(product.getC_UOM_Order_ID());
//		int C_UOM_ID = product.getC_UOM_Order_ID();
//		if (C_UOM_ID == 0)
//			C_UOM_ID = row.getC_UOM_ID();
//		if (row.getC_UOM_ID() == 0)
//			row.getRowData().setC_UOM_ID(C_UOM_ID);

		row.getRowData().setPriceList(MUOMConversion.convertProductFrom (Env.getCtx(), 
				product.getM_Product_ID(),
				row.getRowData().getC_UOM_ID(),
				//C_UOM_ID, 
				pp.getPriceList()));		
		if (row.getPriceList() == null)
			row.getRowData().setPriceList(BigDecimal.ZERO);

		row.getRowData().setPriceLimit(MUOMConversion.convertProductFrom (Env.getCtx(), 
				product.getM_Product_ID(), 
				//C_UOM_ID,
				row.getRowData().getC_UOM_ID(),
				pp.getPriceLimit()));
		if (row.getPriceLimit() == null)
			row.setPriceLimit(BigDecimal.ZERO);

		row.getRowData().setPriceActual(MUOMConversion.convertProductFrom (Env.getCtx(), 
				product.getM_Product_ID(), 
				//C_UOM_ID,
				row.getRowData().getC_UOM_ID(),
				pp.getPriceStd()));
		if (row.getPriceActual() == null)
			row.getRowData().setPriceActual(BigDecimal.ZERO);

		row.getRowData().setPriceEntered(MUOMConversion.convertProductFrom (Env.getCtx(), 
				product.getM_Product_ID(), 
				//C_UOM_ID,
				row.getRowData().getC_UOM_ID(),
				pp.getPriceStd()));
		if (row.getPriceEntered() == null)
			row.getRowData().setPriceEntered(BigDecimal.ZERO);

		row.setProductBrand(product.getBrand());
		row.setProductBrandValue(product.getBrandValue());
		row.getRowData().setC_TaxCategory_ID(product.getC_TaxCategory_ID());
		//isStocked = product.isStocked();
		row.setM_AttributeSet_ID(product.getM_AttributeSet_ID());		
		return true;
	}

//	private void setC_UOM_Buy_ID(int value) {
//		C_UOM_Buy_ID = value;		
//	}
	
	public static boolean product(Row row)
	{		
		if (row.getFieldIntValue() == 0)
			return false;				
		//IsSOTrx = true; // Env.getContext(Env.getCtx(), getWindowNo(), "IsSOTrx").equals("Y");
		price(row, X_M_Product.COLUMNNAME_M_Product_ID);
		if (row.getRowData().getM_AttributeSet_ID() != 0) {
			MAttributeSet mas = MAttributeSet.get(Env.getCtx(),	row.getM_AttributeSet_ID(), null);
			if (mas != null	&& mas.isMandatory())  {
				row.setIsAttributeMandatory(true);
			}
		}
		//
		//return tax( name, value);		
		return tax(row);
	}
	public void setM_AttributeSet_ID(int value) {
		m_rowdata.setM_AttributeSet_ID(value);		
	}
	public int getM_AttributeSet_ID() {
		return m_rowdata.getM_AttributeSet_ID();
	}
	public void setIsAttributeMandatory(boolean value) {
		IsAttributeMandatory = value;		
	}
	public boolean IsAttributeMandatory()
	{
		return IsAttributeMandatory;
	}
	//	public static void qty(Row row)
	//	{
	//		if ( row.getM_Product_ID() == 0)
	//			return;
	//		else if (row.getFieldName() == "C_UOM_ID")
	//		{
	//		}
	//		else if (row.getFieldName() == "QtyEntered")
	//		{
	//		  convertToOrderer(row);
	//		}		
	//	}
	public static void convertToOrderer(Row row, BigDecimal QtyEntered) {
		int C_UOM_To_ID = row.getRowData().getC_UOM_ID(); 	  
		BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
		if (QtyEntered.compareTo(QtyEntered1) != 0)
		{
			QtyEntered = QtyEntered1;
		}
		BigDecimal QtyOrdered = MUOMConversion.convertProductFrom (Env.getCtx(), row.getM_Product_ID(), C_UOM_To_ID, QtyEntered);
		if (QtyOrdered == null)
			QtyOrdered = QtyEntered;
		boolean conversion = QtyEntered.compareTo(QtyOrdered) != 0;
		row.getRowData().setQtyEntered(QtyEntered);
		row.getRowData().setQtyOrdered(QtyOrdered);
		row.getRowData().setUOMConversion(conversion ? "Y" : "N");		
	}

	public static void qtyamt(Row row)
	{
		int StdPrecision = MPriceList.getStandardPrecision(Env.getCtx(), row.getM_PriceList_ID()); // jala la precision de la moneda
		//		int PricePrecision = MPriceList.getPricePrecision(Env.getCtx(), row.getM_PriceList_ID());
		//		if ((row.getFieldName().equals("QtyOrdered") || 
		//				row.getFieldName().equals("QtyEntered") || 
		//				row.getFieldName().equals("M_Product_ID")) 
		//				&& !"N".equals(Env.getContext(Env.getCtx(), row.getWindowNo(), "DiscountSchema"))
		//				)
		//		{
		if (row.getFieldName().equals("PriceEnteredWithoutTax"))
		{
			BigDecimal PriceEnteredWithoutTax = (BigDecimal) row.getFieldValue();
			if (PriceEnteredWithoutTax== null)
				PriceEnteredWithoutTax = BigDecimal.ZERO;
			BigDecimal tax = row.getTax().calculateTax(PriceEnteredWithoutTax, false, StdPrecision);
			BigDecimal amt  = PriceEnteredWithoutTax.add(tax);  
			row.getRowData().setPriceEnteredWithoutTax(PriceEnteredWithoutTax);
			row.setField("PriceEntered", amt);
		}			
		if (row.getFieldName().equals("QtyEntered"))
		{
			BigDecimal QtyEntered = row.getFieldValue();
			convertToOrderer(row, QtyEntered);
			MProductPricing pp = getProductPricing(row);
			//
			row.getRowData().setPriceEntered(MUOMConversion.convertProductFrom (Env.getCtx(), 
					row.getRowData().getM_Product_ID(), 
					row.getRowData().getC_UOM_ID(), 
					pp.getPriceStd()));
			if (row.getRowData().getPriceEntered() == null)
				row.getRowData().setPriceEntered(pp.getPriceStd());

			row.getRowData().setPriceEntered(row.getPriceEntered()
					.setScale(row.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
			row.getRowData().setPriceActual(row.getRowData().getPriceEntered());
			row.getRowData().setDiscount(pp.getDiscount());
		} 
		else if (row.getFieldName().equals("PriceActual"))
		{
			// convierto a la unidad de medida minima para guardar a priceEntered
			// cuando es from debe dividir
			row.getRowData().setPriceActual((BigDecimal) row.getFieldValue());
			row.getRowData().setPriceEntered(MUOMConversion.convertProductFrom (Env.getCtx(), 
					row.getRowData().getM_Product_ID(), 
					row.getRowData().getC_UOM_ID(), 
					row.getRowData().getPriceActual()));
			if (row.getRowData().getPriceEntered() == null)
				row.getRowData().setPriceEntered(row.getPriceActual());
		}
		else if (row.getFieldName().equals("PriceEntered"))
		{
			BigDecimal value = row.getFieldValue();
			row.getRowData().setPriceEntered( value );
			BigDecimal tax = row.getTax().calculateTax(value, true, StdPrecision);
			row.getRowData().setPriceEnteredWithoutTax(value.subtract(tax));
			//
			row.getRowData().setPriceActual( MUOMConversion.convertProductTo (Env.getCtx(), 
					row.getRowData().getM_Product_ID(), 
					row.getRowData().getC_UOM_ID(), 
					row.getRowData().getPriceEntered()));
			if (row.getPriceActual() == null)
				row.getRowData().setPriceActual(row.getPriceEntered());
			if (row.getPriceList().compareTo(Env.ZERO) > 0 || row.getPriceEntered().compareTo(Env.ZERO) > 0) 
			{
				if (row.getPriceList().compareTo(Env.ZERO) > 0)
				{
				}
				else
				{
					row.getRowData().setPriceList(row.getPriceActual());
				}
			}						
		}
		else if (row.getFieldName().equals("SalesMargin"))
		{
			BigDecimal margin = row.getFieldValue();
			row.getRowData().setMargin(margin);
		}
		if (row.getFieldName().equals("QtyBonus"))
		{
			BigDecimal QtyBonus = row.getFieldValue();
			row.getRowData().setQtyBonus(QtyBonus);
			if (QtyBonus.compareTo(Env.ZERO) == 0)
			{
				row.setDiscount1(BigDecimal.ZERO);
			}
			else
			{
				// Qty Bonus debe ser convertido a la unidad de la compra
				BigDecimal QtyOrderedBonus1 = MUOMConversion
						.convertProductFrom(Env.getCtx(), row.getM_Product_ID(), row.getC_UOMBonus_ID(), QtyBonus);
				if (QtyOrderedBonus1 == null)
				{
					QtyOrderedBonus1 = QtyBonus;
				}
				BigDecimal QtyOrdered1 = row.getQtyOrdered();
				//							.convertProductFrom (Env.getCtx(), row.getM_Product_ID(), row.getC_UOM_ID(), row.getQtyEntered());

				QtyOrdered1 = QtyOrdered1.add(QtyOrderedBonus1); 

				if (row.getQtyOrdered().compareTo(BigDecimal.ZERO) > 0 && QtyOrdered1.compareTo(Env.ZERO) > 0)
				{
					BigDecimal newprice    = row.getPriceActual().divide(QtyOrdered1,10,BigDecimal.ROUND_HALF_UP);
					BigDecimal price = row.getPriceActual().divide(row.getQtyOrdered(),10,BigDecimal.ROUND_HALF_UP);
					BigDecimal discount = BigDecimal.ONE.subtract(newprice.divide(price,10,BigDecimal.ROUND_HALF_UP));
					discount = discount.multiply(Env.ONEHUNDRED);
					discount = discount.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
					row.setDiscount1(discount);
				}
				else
				{
					row.setDiscount(BigDecimal.ZERO);
				}				
			}
		}
		if (row.getFieldName().equals("C_UOMBonus_ID"))
		{

		}
		if (row.getFieldName().equals("Discount"))
		{
			row.getRowData().setDiscount((BigDecimal) row.getFieldValue());
			//				if (row.getDiscount() == null)
			//					row.getRowData().setDiscount(Env.ZERO);
			//				if (row.getDiscount().compareTo(Env.ZERO) == 0)
			//					row.getRowData().setDiscountAmt(Env.ZERO);
		}
		if (row.getFieldName().equals("Discount1"))
		{
			row.getRowData().setDiscount1((BigDecimal) row.getFieldValue());
			//				if (row.getDiscount1() == null)
			//					row.getRowData().setDiscount1(Env.ZERO);
			//				if (row.getDiscount1().compareTo(Env.ZERO) == 0)
			//					row.getRowData().setDiscount1Amt(Env.ZERO);
		}
		else if (row.getFieldName().equals("Discount2"))
		{
			row.getRowData().setDiscount2((BigDecimal) row.getFieldValue());
			//				if (row.getDiscount2() == null)
			//					row.getRowData().setDiscount2(Env.ZERO);
			//				if (row.getDiscount2().compareTo(Env.ZERO) == 0)
			//					row.getRowData().setDiscount2Amt(Env.ZERO);			 
		}
		else if (row.getFieldName().equals("Discount3"))
		{
			row.getRowData().setDiscount3((BigDecimal) row.getFieldValue());
			//				if (row.getDiscount3() == null)
			//					row.getRowData().setDiscount3(Env.ZERO);
			//				if (row.getDiscount3().compareTo(Env.ZERO) == 0)
			//					row.getRowData().setDiscount3Amt(Env.ZERO);			 
		}
		else if (row.getFieldName().equals("Discount4"))
		{
			row.getRowData().setDiscount4((BigDecimal) row.getFieldValue());
			//				if (row.getDiscount4() == null)
			//					row.getRowData().setDiscount4(Env.ZERO);
			//				if (row.getDiscount4().compareTo(Env.ZERO) == 0)
			//					row.getRowData().setDiscount4Amt(Env.ZERO);			 
		}		 			
		else if (row.getFieldName().equals("Total"))
		{
			BigDecimal discountAmt = row.getRowData().getDiscountAmt();
			if ( discountAmt.compareTo(BigDecimal.ZERO) == 0)
			{
				BigDecimal QtyEntered = row.getQtyEntered();
				if (QtyEntered.compareTo(BigDecimal.ZERO) > 0)
				{
					BigDecimal newPrice = row.getFieldValue().divide(QtyEntered,20, BigDecimal.ROUND_HALF_UP);
					newPrice = newPrice.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
					row.setPriceActual(newPrice);
				}
			}
		}
		//}
		if (row.getRowData().getMargin().compareTo(BigDecimal.ZERO) > 0)
		{
			BigDecimal buyprice = row.getPrice();
			BigDecimal margin = row.getFieldValue();
			row.getRowData().setMargin(margin);
			BigDecimal SalesPriceList = buyprice.add(
					buyprice.multiply(
							margin.divide(Env.ONEHUNDRED, Env.divideprecision, BigDecimal.ROUND_HALF_UP)
							)
					);
			row.getRowData().setSalesPriceList(SalesPriceList);				
		}
		row.getRowData().setGross(row.getPrice().multiply(row.getQtyEntered()).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP));
		BigDecimal Net = row.getPrice().multiply(row.getQtyEntered()).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
		row.getRowData().setNet(Net);
		tax(row);
		BigDecimal Total = Net;
		if (!row.IsTaxIncluded())
		{
			Total = Total.add(row.getTaxAmount());		 
		}	 
		Total = Total.setScale(2, BigDecimal.ROUND_HALF_UP);
		row.getRowData().setTotal(Total);
	}
	public BigDecimal getPrice() {
		BigDecimal price = BigDecimal.ZERO;
		BigDecimal discountAmt = getRowData().getDiscountAmt();
		if (discountAmt.compareTo(BigDecimal.ZERO) > 0)
		{
			price = getPriceActual().multiply(discountAmt);
		}
		else
		{
			price = getPriceActual();
		}
		return price;
	}
	public void setIsNew(boolean value) {
		m_new = value;		
	}
	public boolean IsNew(String value) {		
		return m_new;
	}
	//	public BigDecimal getPrice() {
	//		BigDecimal price = getPriceEntered();
	//		//System.out.println("X");
	//		if (getDiscount().compareTo(Env.ZERO) != 0)
	//		{
	//			price = price.multiply(getDiscount().divide(Env.ONEHUNDRED));
	//		}		
	//		if (getDiscount1().compareTo(Env.ZERO) != 0)
	//		{
	//			price = price.subtract(price.multiply(getDiscount1().divide(Env.ONEHUNDRED)));
	//		}		
	//		if (getDiscount2().compareTo(Env.ZERO) != 0)
	//		{
	//			price = price.multiply(getDiscount2().divide(Env.ONEHUNDRED));
	//		}		
	//		if (getDiscount3().compareTo(Env.ZERO) != 0)
	//		{
	//			price = price.multiply(getDiscount3().divide(Env.ONEHUNDRED));
	//		}				
	//		if (getDiscount4().compareTo(Env.ZERO) != 0)
	//		{
	//			price = price.multiply(getDiscount4().divide(Env.ONEHUNDRED));
	//		}				
	//		return price;
	//	}

}