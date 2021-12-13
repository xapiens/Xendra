package org.xendra.pos;

import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import org.compiere.model.MAttributeSet;
import org.compiere.model.MCampaignBonus;
import org.compiere.model.MCampaignDiscount;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPriceList;
import org.compiere.model.MProduct;
import org.compiere.model.MProductBOM;
import org.compiere.model.MProductPricing;
import org.compiere.model.MRole;
import org.compiere.model.MStorage;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.model.MWithholding;
import org.compiere.model.Tax;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.util.CCache;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.objectview.RowBase;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Define a row
 * @author xapiens
 */
public class Row extends RowBase {
	private static CCache<Integer,BigDecimal>	s_qtyavailable = new CCache<Integer,BigDecimal>("QtyAvailable", 1, 1);	//	2h

	public Row(){
		super();
	}
	public Row(Boolean Enabled) {
		super(Enabled);
	}
	
	public void addfunction(String namefunc) {
		if (callstack.length() == 0) 
			callstack += String.format("%s",namefunc);
		 else
			callstack += String.format(",%s",namefunc);
	}
	public String getCallStack() {
		return callstack;
	}
	
	public String getIdentifier()
	{
		return identifier;
	}
	private HashMap<String, Object> oldvalues = new HashMap();
	private String identifier = Util.getUUID(); 
	private RowData m_rowdata = new RowData();
	public RowData getRowData()
	{
		return m_rowdata;
	}	
	private boolean isVoidTransaction;
	//private Integer Withholding_ID = 0;

	//private MProduct m_product;
	private ArrayList<Row> campaigns = new ArrayList<Row>();
	private MProduct m_Product;      
	private PosPanel m_POSPanel;
	private ArrayList<Vector> campaignbonus = new ArrayList<Vector>();
	private ArrayList<Integer> campaigndiscount = new ArrayList<Integer>();
	private ArrayList<Row>  BonusRow = new ArrayList<Row>();
	private ArrayList<Object[]> displayobject = new ArrayList<Object[]>();
	private Row m_SelectedChild = null;
	private MProductBOM[] boms;
	private String m_FieldName = "";
	private BigDecimal m_FieldValue = BigDecimal.ZERO;
	private Integer m_FieldIntValue = 0;
	private BigDecimal m_Error = new BigDecimal("-1");
	private String callstack = "";
		
	public BigDecimal getAncientAttributeSetInstanceQtyAvailable() {
		return m_rowdata.getAncientAttributeSetInstanceQtyAvailable();
	}
	public void setAncientAttributeSetInstanceQtyAvailable(BigDecimal ancientAttributeSetInstanceQtyAvailable) {
		m_rowdata.setAncientAttributeSetInstanceQtyAvailable(ancientAttributeSetInstanceQtyAvailable);
	}
	
	public Integer getAncientAttributeSetInstance_ID() {
		return m_rowdata.getAncientAttributeSetInstance_ID();
	}
	public void setAncientAttributeSetInstance_ID(Integer ancientAttributeSetInstanceID) {
		m_rowdata.setAncientAttributeSetInstance_ID(ancientAttributeSetInstanceID);
	}
	public BigDecimal getPriceBase() {
		return m_rowdata.getPriceBase();
	}
	public void setPriceBase(BigDecimal priceBase) {
		m_rowdata.setPriceBase(priceBase);
	}
	
	public BigDecimal getDiscount1() {
		return m_rowdata.getDiscount1();
	}
	public void setDiscount1(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_Discount1,value);		
	}
//	public void setDiscount1(BigDecimal discount1) {
//		if (discount1 == null)
//			discount1 = Env.ZERO;
//		discount1 = discount1.setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
//		if (discount1.compareTo(m_rowdata.getDiscount1()) != 0)
//		{		 	
//			if (amt("Discount1", discount1))
//				changed = true;		
//		}
//	}
	public BigDecimal getDiscount1Amt() {
		return m_rowdata.getDiscount1Amt();
	}
	public void setDiscount1Amt(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_Discount1,value);				
	}
//	public void setDiscount1Amt(BigDecimal discount1Amt) {
//		  BigDecimal discount1 = Env.ZERO;
//		  if (discount1Amt != null)
//		  {		
//			  BigDecimal PriceList1 = m_rowdata.getPriceActual();
//			  discount1 = Env.ONEHUNDRED.subtract(discount1Amt.divide(PriceList1, m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED));		  
//		  }
//		  amt("Discount1", discount1);
//	}
	public BigDecimal getDiscount2() {
		return m_rowdata.getDiscount2();
	}
	public void setDiscount2(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_Discount2,value, true);						
	}
	public BigDecimal getDiscount2Amt() {
		return m_rowdata.getDiscount2Amt();
	}
	public void setDiscount2Amt(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_Discount2,value);						
//		  BigDecimal discount2 = Env.ZERO;
//		  if (discount2Amt != null)
//		  {
//			  BigDecimal PriceList1 = m_rowdata.getPriceActual();
//		
//			  if (m_rowdata.getDiscount1().compareTo(Env.ZERO) != 0)
//			  {
//				  m_rowdata.setDiscount1Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount1().doubleValue()) / 100.0 * PriceList1.doubleValue())
//				  .setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
//		
//				  PriceList1 = m_rowdata.getDiscount1Amt();
//			  }			  
//			  m_rowdata.setDiscount2(Env.ONEHUNDRED.subtract(discount2Amt.divide(PriceList1, m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED)));		  
//		  }
//		  amt("Discount2", m_rowdata.getDiscount2());
	  }	
	public BigDecimal getDiscount3() {
		return m_rowdata.getDiscount3();
	}
	public void setDiscount3(BigDecimal value) {
		//m_rowdata.setDiscount3(discount3);
		setField(X_C_OrderLine.COLUMNNAME_Discount3,value);						
	}
	public BigDecimal getDiscount3Amt() {
		return m_rowdata.getDiscount3Amt();
	}
	public void setDiscount3Amt(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_Discount3,value);						
//		  BigDecimal discount3 = Env.ZERO;
//		  if (discount3Amt != null)
//		  {
//			  BigDecimal PriceList1 = m_rowdata.getPriceActual();
//			  if (m_rowdata.getDiscount1().compareTo(Env.ZERO) != 0)
//			  {
//				  m_rowdata.setDiscount1Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount1().doubleValue()) / 100.0 * PriceList1.doubleValue())
//				  .setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
//		
//				  PriceList1 = m_rowdata.getDiscount1Amt();
//			  }
//			  if (m_rowdata.getDiscount2().compareTo(Env.ZERO) != 0)
//			  {
//				  m_rowdata.setDiscount2Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount2().doubleValue()) / 100.0 * PriceList1.doubleValue())
//				  .setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
//		
//				  PriceList1 = m_rowdata.getDiscount2Amt();
//			  }	  
//			  m_rowdata.setDiscount3(Env.ONEHUNDRED.subtract(discount3Amt.divide(PriceList1, m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED)));		  
//		  }
//		  amt("Discount3", m_rowdata.getDiscount3());
	  }
	public BigDecimal getDiscount4() {
		return m_rowdata.getDiscount4();
	}
	public void setDiscount4(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_Discount4,value);						
		//m_rowdata.setDiscount4(discount4);
	}
	public BigDecimal getDiscount4Amt() {
		return m_rowdata.getDiscount4Amt();
	}
	  public void setDiscount4Amt(BigDecimal value) {
			setField(X_C_OrderLine.COLUMNNAME_Discount4,value);						  
//		  BigDecimal discount4 = Env.ZERO;
//		  if (discount4Amt != null)
//		  {
//			  BigDecimal PriceList1 = m_rowdata.getPriceActual();
//			  if (m_rowdata.getDiscount().compareTo(Env.ZERO) != 0)
//			  {
//				  m_rowdata.setDiscountAmt( new BigDecimal ((100.0 - m_rowdata.getDiscount().doubleValue()) / 100.0 * PriceList1.doubleValue())
//				  .setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
//		
//				  PriceList1 = m_rowdata.getDiscountAmt();
//			  }
//			  if (m_rowdata.getDiscount1().compareTo(Env.ZERO) != 0)
//			  {
//				  m_rowdata.setDiscount1Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount1().doubleValue()) / 100.0 * PriceList1.doubleValue())
//				  .setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
//		
//				  PriceList1 = m_rowdata.getDiscount1Amt();
//			  }
//			  if (m_rowdata.getDiscount2().compareTo(Env.ZERO) != 0)
//			  {
//				  m_rowdata.setDiscount2Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount2().doubleValue()) / 100.0 * PriceList1.doubleValue())
//				  .setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
//		
//				  PriceList1 = m_rowdata.getDiscount2Amt();
//			  }
//			  if (m_rowdata.getDiscount3().compareTo(Env.ZERO) != 0)
//			  {
//				  m_rowdata.setDiscount3Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount3().doubleValue()) / 100.0 * PriceList1.doubleValue())
//				  .setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
//		
//				  PriceList1 = m_rowdata.getDiscount3Amt();
//			  }	  		  
//			  m_rowdata.setDiscount4(Env.ONEHUNDRED.subtract(discount4Amt.divide(PriceList1, m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED)));		  
//		  }
//		  return amt("Discount4", m_rowdata.getDiscount4());
	  } 
	public Boolean IsBonus() {
		return m_rowdata.getBonus();
	}
	public void setIsBonus(Boolean bonus) {
		m_rowdata.setBonus(bonus);
	}
	public void setDeliveryRule(String deliveryRule) {m_rowdata.setM_DeliveryRule(deliveryRule); }     

	public String getDeliveryRule() { return m_rowdata.getM_DeliveryRule(); }

	public Boolean IsChanged() 							
	{	
		System.out.println("ischanged->"+changed);
		return changed;  
	}
	public void setIsChanged(boolean Changed) 	{	
		changed = Changed;  
//		if (changed)
//		{
//			m_POSPanel.updateRow(this);
//			m_POSPanel.executerules(null, "row");
//		}
	}  
	public String getorderid()
	{
		return m_orderid;
	}
	public void setorderid(String orderid)
	{
		m_orderid = orderid;
	}
	public Integer getRowID() 							{	return RowID;  }
	public void setRowID(Integer pRowID) 					{	RowID = pRowID;  }  
	public BigDecimal getQtyOrdered()  					{	return m_rowdata.getQtyOrdered();  }
	public void setQtyOrdered(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_QtyOrdered,value);						
	}	
	public void setValue(String value) 					
	{	
		if (value == null)
			return;
		//mValue = value;	  
	}
	public String getValue() 								
	{   
		if (m_Product == null)
			return "";
		return m_Product.getValue().trim();  
	}
	public Integer getC_Tax_ID() 							{	return m_rowdata.getC_Tax_ID();  }
	public void setC_Tax_ID(Integer cTaxID) 				
	{	
		if (cTaxID == null)
			return;
		m_rowdata.setC_Tax_ID(cTaxID);  
	}
	public Integer getM_Product_ID() 						{   return m_rowdata.getM_Product_ID();   }
	public void setM_Product_ID(Integer pM_Product_ID) 	
	{   
		if (pM_Product_ID == null)
			return;
		m_rowdata.setM_Product_ID(pM_Product_ID);   
	}
	public String getName() 								
	{   
		if (m_Product == null)
			return "";
		return m_Product.getName(); 
	}
	public void setName(String pName) 					
	{   
		if (pName == null)
			return;
		//mName = pName;
	}
	public BigDecimal getPriceList() 						{   return m_rowdata.getPriceList();  }
	public BigDecimal getQtyEntered() 					{   
		return m_rowdata.getQtyEntered();  
	}

	public void setQtyEntered(BigDecimal value) {
		setField(X_C_OrderLine.COLUMNNAME_QtyEntered,value);								
//		if (qtyentered == null)
//			return;
//		else if ( m_rowdata.getQtyEntered().compareTo(qtyentered) != 0 )
//		{
//			BigDecimal oQtyEntered = m_rowdata.getQtyEntered();
//			BigDecimal oQtyOrdered = m_rowdata.getQtyOrdered();	
//			setFieldName(X_C_OrderLine.COLUMNNAME_QtyEntered);
//			setFieldValue(qtyentered);
//			if ( qty("QtyEntered", qtyentered) && amt("QtyEntered", qtyentered) )
//			{
//				setIsChanged(true);
////				if (!IsAttributeOK() && !isVoidTransaction)
////					createAttribute();				
//			}
//			else
//			{
//				m_rowdata.setQtyEntered(oQtyEntered);
//				m_rowdata.setQtyOrdered(oQtyOrdered);			
//			}      	
//		}		
	}
//	private void setField(String name, Object value) {
//		if (value == null)
//			return;
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
//		m_POSPanel.updateRow(this);
//		m_POSPanel.executerules(null, "row");
//		setIsChanged(true);
//	}
	public void updateRow() {
		m_POSPanel.updateRow(this);
		m_POSPanel.executerules(null, "row");
	}
	
	public void setPriceList(BigDecimal value) 	{
		//if (priceList == null)
		//	return;
		//m_rowdata.setPriceList(priceList);
		//amt("PriceList", priceList);
		setField(X_C_OrderLine.COLUMNNAME_PriceList,value);
	}

	public void setPriceEntered(BigDecimal value) { 		  
		setField(X_C_OrderLine.COLUMNNAME_PriceEntered,value);								
//		if (priceentered == null)
//			return;
//		if (m_rowdata.getIsReadOnlyPriceList())
//			return;
//		if ( m_rowdata.getPriceEntered().compareTo(priceentered) != 0 )
//		{		  
//			//boolean lContinue = true;
//			if (isOverwritePriceList() || m_POSPanel.requestAuthorization())
//				//lContinue = this.;
//			//if (lContinue)
//			{
//				BigDecimal oPriceEntered = m_rowdata.getPriceEntered();
//				if (amt("PriceEntered", priceentered))
//					setIsChanged(true);
//				else
//					m_rowdata.setPriceEntered(oPriceEntered);
//			}
//		}
	}

	public void setC_UOM_ID(Integer value)
	{
		setField(X_C_OrderLine.COLUMNNAME_C_UOM_ID, value);								
//		if (pC_UOM_ID == null)
//			return;
//		if (m_rowdata.getC_UOM_ID().compareTo(pC_UOM_ID) != 0)
//		{
//			Integer oC_UOM_ID = m_rowdata.getC_UOM_ID();
//			m_rowdata.setC_UOM_ID(pC_UOM_ID);
//			if (qty("C_UOM_ID", Env.ZERO) && amt("C_UOM_ID", Env.ZERO))
//				setIsChanged(true);
//			else
//			{
//				m_rowdata.setC_UOM_ID(oC_UOM_ID);
//				m_rowdata.setQtyEntered(Env.ZERO);
//				m_rowdata.setQtyOrdered(Env.ZERO);
//			}
//		}
	}

	public void  setPriceActual (BigDecimal priceactual)  
	{	  
		setField(X_C_OrderLine.COLUMNNAME_PriceActual, priceactual);		
//		if (priceactual == null)
//			return;
//		if ( m_rowdata.getPriceActual().compareTo(priceactual) != 0 )
//		{
//			BigDecimal oPriceActual = m_rowdata.getPriceActual();
//			if (amt("PriceActual", priceactual))
//				setIsChanged(true);
//			else
//				m_rowdata.setPriceActual(oPriceActual);
//		}
	}	//	setPriceActual

	public void setM_AttributeSetInstance_ID(Integer pM_AttributeSetInstance_ID) {
		setField(X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID, pM_AttributeSetInstance_ID);
//		if (pM_AttributeSetInstance_ID == null)
//			return;
//		if (m_rowdata.getM_AttributeSetInstance_ID().compareTo(pM_AttributeSetInstance_ID) != 0)
//		{
//			m_rowdata.setM_AttributeSetInstance_ID(pM_AttributeSetInstance_ID);
//			m_rowdata.setRef_AttributeSetInstance_ID(DB.getSQLValue(null, "SELECT Ref_AtributeSetInstance_ID FROM M_AttributeSetInstance WHERE M_AttributeSetInstance_ID = ? ", pM_AttributeSetInstance_ID));
//			qty("M_AttributeSetInstance_ID", BigDecimal.valueOf(pM_AttributeSetInstance_ID));
//		}
	}   

	public void setDiscount(BigDecimal discount) {
		setField(X_C_OrderLine.COLUMNNAME_Discount, discount);
//		if (discount == null)
//			return;
//		if (discount.compareTo(m_rowdata.getDiscount()) != 0)
//		{		 	
//			BigDecimal odiscount = m_rowdata.getDiscount();
//			if (amt("Discount", discount))
//				setIsChanged(true);		
//			//else
//			//	Discount = odiscount; 
//		}
	}  

	public BigDecimal getTotal() {
		System.out.println("gettotal"+m_rowdata.getTotal());
		return m_rowdata.getTotal();
	}

	public void setTotal(BigDecimal pTotal) {
		if (pTotal == null)
			return;
		int StdPrecision = MPriceList.getStandardPrecision(Env.getCtx(), m_rowdata.getM_PriceList_ID());
		pTotal = pTotal.setScale(StdPrecision, BigDecimal.ROUND_HALF_UP);
		if (m_rowdata.getTotal().compareTo(pTotal) != 0)
		{
			BigDecimal oPriceEntered = m_rowdata.getPriceEntered();
			BigDecimal oPriceActual = m_rowdata.getPriceActual();
			m_rowdata.setPriceEntered(new BigDecimal(pTotal.doubleValue() / m_rowdata.getQtyOrdered().doubleValue())); //.setScale(StdPrecision,BigDecimal.ROUND_HALF_UP));
			m_rowdata.setPriceActual(MUOMConversion.convertProductTo (Env.getCtx(), m_rowdata.getM_Product_ID(), 
					m_rowdata.getC_UOM_ID(), m_rowdata.getPriceEntered()));
			if (m_rowdata.getPriceActual() == null)
				m_rowdata.setPriceActual(m_rowdata.getPriceEntered());

			boolean conversion = m_rowdata.getQtyEntered().compareTo(m_rowdata.getQtyOrdered()) != 0;

			m_rowdata.setUOMConversion(conversion ? "Y" : "N");			
			if (CheckPriceLimit())
			{
				//m_rowdata.setGross(m_rowdata.getPriceList().multiply(m_rowdata.getQtyOrdered()).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP));
				m_rowdata.setGross(m_rowdata.getPriceActual().multiply(m_rowdata.getQtyOrdered()).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP));
				m_rowdata.setTotal(m_rowdata.getPriceActual().multiply(m_rowdata.getQtyOrdered()).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP));
				setIsChanged(true);
			}		
			else
			{
				m_rowdata.setPriceEntered(oPriceEntered);
				m_rowdata.setPriceActual(oPriceActual);
			}
		}
	}		    


	public boolean amt(String name, Object amt) {

		BigDecimal oPriceActual 	= m_rowdata.getPriceActual();
		BigDecimal oPriceEntered 	= m_rowdata.getPriceEntered();
		BigDecimal oPriceList 		= m_rowdata.getPriceList();
		BigDecimal oDiscount 		= m_rowdata.getDiscount();
		
		Boolean ResetPriceList = false;
		if ((name.equals("QtyOrdered") 
				|| name.equals("QtyEntered")
				|| name.equals("M_Product_ID") ) )
			//&& !"N".equals(Env.getContext(Env.getCtx(), getWindowNo(), "DiscountSchema")))
		{
			if (name.equals("QtyEntered"))
				m_rowdata.setQtyOrdered(MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(),m_rowdata.getC_UOM_ID(), m_rowdata.getQtyEntered()));
			if (m_rowdata.getQtyOrdered() == null)
				m_rowdata.setQtyOrdered(m_rowdata.getQtyEntered());

			MProductPricing pp = new MProductPricing (m_rowdata.getM_Product_ID(), m_rowdata.getC_BPartner_ID(), m_rowdata.getQtyOrdered(), true);
			pp.setM_PriceList_ID(m_rowdata.getM_PriceList_ID());
			// globalqss - fix reported bug [ 1643489 ] PriceListVersion misfunctionality
			//int M_PriceList_Version_ID;
			// try to get the price list version from info product tab
			//M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID");
			// if not found try to get from the context of window
			//if (M_PriceList_Version_ID == 0)
			//	M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "M_PriceList_Version_ID");
			// end globalqss 
			pp.setM_PriceList_Version_ID(m_rowdata.getM_PriceListVersion_ID());
			Timestamp date = getDateOrdered();
			pp.setPriceDate(date);
			//
			m_rowdata.setPriceEntered( MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(), 
					m_rowdata.getC_UOM_ID(), pp.getPriceStd()));
			if (m_rowdata.getPriceEntered() == null)
				m_rowdata.setPriceEntered(pp.getPriceStd());
			m_rowdata.setPriceEntered(m_rowdata.getPriceEntered().setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
			m_rowdata.setPriceActual(pp.getPriceStd());
			m_rowdata.setDiscount(pp.getDiscount());
			//Env.setContext(Env.getCtx(), getWindowNo(), "DiscountSchema", pp.isDiscountSchema() ? "Y" : "N");			
		}
		else if (name.equals("PriceActual"))
		{
			m_rowdata.setPriceActual((BigDecimal) amt);
			m_rowdata.setPriceEntered(MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(), m_rowdata.getC_UOM_ID(), m_rowdata.getPriceActual()));
			if (m_rowdata.getPriceEntered() == null)
				m_rowdata.setPriceEntered(m_rowdata.getPriceActual());
			
			//PriceBase = PriceEntered;

		}
		else if (name.equals("PriceEntered"))
		{
			m_rowdata.setPriceEntered( (BigDecimal) amt);
			//PriceBase = (BigDecimal) amt;
			m_rowdata.setPriceActual( MUOMConversion.convertProductTo (Env.getCtx(), m_rowdata.getM_Product_ID(), m_rowdata.getC_UOM_ID(), m_rowdata.getPriceEntered()));
			m_rowdata.setDiscount(BigDecimal.ZERO);
			m_rowdata.setDiscount1(BigDecimal.ZERO);
			m_rowdata.setDiscount2(BigDecimal.ZERO);
			m_rowdata.setDiscount3(BigDecimal.ZERO);
			m_rowdata.setDiscount4(BigDecimal.ZERO);
			if (m_rowdata.getPriceActual() == null)
				m_rowdata.setPriceActual(m_rowdata.getPriceEntered());
			
			if ((m_rowdata.getPriceList().compareTo(Env.ZERO) > 0 || m_rowdata.getPriceEntered().compareTo(Env.ZERO) > 0) && 
					m_rowdata.getDiscount().equals(Env.ZERO) && 
					m_rowdata.getDiscount1().equals(Env.ZERO) && 
					m_rowdata.getDiscount2().equals(Env.ZERO) &&
					m_rowdata.getDiscount3().equals(Env.ZERO) &&
					m_rowdata.getDiscount4().equals(Env.ZERO))
			{
				if (m_rowdata.getPriceList().compareTo(Env.ZERO) > 0)
				{
					m_rowdata.setDiscount(new BigDecimal ((m_rowdata.getPriceList().doubleValue() - m_rowdata.getPriceActual().doubleValue()) / m_rowdata.getPriceList().doubleValue() * 100.0));				
					m_rowdata.setDiscountAmt(new BigDecimal ((100.0 - m_rowdata.getDiscount().doubleValue()) / 100.0 * m_rowdata.getPriceList().doubleValue()));
				}
				else
				{
					m_rowdata.setPriceList(m_rowdata.getPriceActual());
				}
			}						
		}
		//  Discount entered - Calculate Actual/Entered
		int StdPrecision = MPriceList.getStandardPrecision(Env.getCtx(), m_rowdata.getM_PriceList_ID()); // jala la precision de la moneda
		int PricePrecision = MPriceList.getPricePrecision(Env.getCtx(), m_rowdata.getM_PriceList_ID());

		if (name.equals("Discount"))
		{
			m_rowdata.setDiscount((BigDecimal) amt);
			if (m_rowdata.getDiscount() == null)
				m_rowdata.setDiscount(Env.ZERO);
			if (m_rowdata.getDiscount().compareTo(Env.ZERO) == 0)
				m_rowdata.setDiscountAmt(Env.ZERO);
		}
		if (name.equals("Discount1"))
		{
			m_rowdata.setDiscount1((BigDecimal) amt);
			if (m_rowdata.getDiscount1() == null)
				m_rowdata.setDiscount1(Env.ZERO);
			if (m_rowdata.getDiscount1().compareTo(Env.ZERO) == 0)
				m_rowdata.setDiscount1Amt(Env.ZERO);
		}
		else if (name.equals("Discount2"))
		{
			m_rowdata.setDiscount2((BigDecimal) amt);
			if (m_rowdata.getDiscount2() == null)
				m_rowdata.setDiscount2(Env.ZERO);
			if (m_rowdata.getDiscount2().compareTo(Env.ZERO) == 0)
				m_rowdata.setDiscount2Amt(Env.ZERO);			 
		}
		else if (name.equals("Discount3"))
		{
			m_rowdata.setDiscount3((BigDecimal) amt);
			if (m_rowdata.getDiscount3() == null)
				m_rowdata.setDiscount3(Env.ZERO);
			if (m_rowdata.getDiscount3().compareTo(Env.ZERO) == 0)
				m_rowdata.setDiscount3Amt(Env.ZERO);			 
		}
		else if (name.equals("Discount4"))
		{
			m_rowdata.setDiscount4((BigDecimal) amt);
			if (m_rowdata.getDiscount4() == null)
				m_rowdata.setDiscount4(Env.ZERO);
			if (m_rowdata.getDiscount4().compareTo(Env.ZERO) == 0)
				m_rowdata.setDiscount4Amt(Env.ZERO);			 
		}		 
		//System.out.println("X");
		//BigDecimal PriceList1 = PriceActual;
		BigDecimal PriceList1 = m_rowdata.getPriceList();

		if (m_rowdata.getDiscount().compareTo(Env.ZERO) != 0)
		{
			m_rowdata.setDiscountAmt(new BigDecimal ((100.0 - m_rowdata.getDiscount().doubleValue()) / 100.0 * PriceList1.doubleValue()));		 
			PriceList1 = m_rowdata.getDiscountAmt();
			if (m_rowdata.getDiscount().scale() > 2)				
				m_rowdata.setDiscount(m_rowdata.getDiscount().setScale(2, BigDecimal.ROUND_HALF_UP));			
		}
				
		if (m_rowdata.getDiscount1().compareTo(Env.ZERO) != 0)
		{
			m_rowdata.setDiscount1Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount1().doubleValue()) / 100.0 * PriceList1.doubleValue()));			
			PriceList1 = m_rowdata.getDiscount1Amt();
		}

		if (m_rowdata.getDiscount2().compareTo(Env.ZERO) != 0)
		{
			m_rowdata.setDiscount2Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount2().doubleValue()) / 100.0 * PriceList1.doubleValue()));		 
			PriceList1 = m_rowdata.getDiscount2Amt();
		}

		if (m_rowdata.getDiscount3().compareTo(Env.ZERO) != 0)
		{
			m_rowdata.setDiscount3Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount3().doubleValue()) / 100.0 * PriceList1.doubleValue()));		 
			PriceList1 = m_rowdata.getDiscount3Amt();
		}

		if (m_rowdata.getDiscount4().compareTo(Env.ZERO) != 0)
		{
			m_rowdata.setDiscount4Amt(new BigDecimal ((100.0 - m_rowdata.getDiscount4().doubleValue()) / 100.0 * PriceList1.doubleValue()));		 
			PriceList1 = m_rowdata.getDiscount4Amt();
		}
		
		m_rowdata.setPriceActual( PriceList1.setScale(PricePrecision, BigDecimal.ROUND_HALF_UP));
		
		m_rowdata.setPriceEntered(MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(), m_rowdata.getC_UOM_ID(), m_rowdata.getPriceActual()));
		
		if (m_rowdata.getPriceEntered() == null)
			m_rowdata.setPriceEntered(m_rowdata.getPriceActual());
		else
			m_rowdata.setPriceEntered(m_rowdata.getPriceEntered().setScale(PricePrecision, BigDecimal.ROUND_HALF_UP));
		
		//	Check PriceLimit
		if (!CheckPriceLimit())
		{
			m_rowdata.setPriceActual(oPriceActual);
			m_rowdata.setPriceEntered(oPriceEntered);
			m_rowdata.setPriceList(oPriceList);
			m_rowdata.setDiscount(oDiscount);
			if (name.equals("Discount4"))
			{
				m_rowdata.setDiscount4(Env.ZERO);
				m_rowdata.setDiscount4Amt(Env.ZERO);
			}
			return false;
		}

		m_rowdata.setGross(m_rowdata.getPriceList().multiply(m_rowdata.getQtyOrdered()).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP));
		m_rowdata.setTotal(m_rowdata.getPriceActual().multiply(m_rowdata.getQtyOrdered()).setScale(StdPrecision, BigDecimal.ROUND_HALF_UP));
				
		if (ResetPriceList)
			m_rowdata.setPriceList(Env.ZERO);
		return true;
	}

	private boolean CheckPriceLimit() {
		//String epl = Env.getContext(Env.getCtx(), getWindowNo(), "EnforcePriceLimit");
		//boolean enforce = IsSOTrx && epl != null && epl.equals("Y");
		boolean enforce = m_rowdata.isIsSOTrx() && m_rowdata.getEnforcePriceLimit();
		if (enforce && MRole.getDefault().isOverwritePriceLimit())
			enforce = false;
		//	Check Price Limit?
		if (enforce && m_rowdata.getPriceLimit().doubleValue() != 0.0
				&& m_rowdata.getPriceActual().compareTo(m_rowdata.getPriceLimit()) < 0)
		{
			m_rowdata.setPriceActual(m_rowdata.getPriceLimit());
			m_rowdata.setPriceEntered( MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(), m_rowdata.getC_UOM_ID(), m_rowdata.getPriceLimit()));
			if (m_rowdata.getPriceEntered() == null)
				m_rowdata.setPriceEntered(m_rowdata.getPriceLimit());
			//ADialog.info.fine("(under) PriceEntered=" + PriceEntered + ", Actual" + PriceLimit);
			//ADialog.error(m_WindowNo, null, "PosError", Msg.getMsg(Env.getCtx(), "UnderLimitPrice"));
			setM_processMsg("UnderLimitPrice");
			m_rowdata.setPriceActual(m_rowdata.getPriceLimit());
			//PriceEntered = PriceEntered;
			//mTab.fireDataStatusEEvent ("UnderLimitPrice", "", false);
			//	Repeat Discount calc
			try {
				m_rowdata.setDiscount( new BigDecimal ((m_rowdata.getPriceList().doubleValue() - m_rowdata.getPriceActual().doubleValue()) / m_rowdata.getPriceList().doubleValue() * 100.0));
				if (m_rowdata.getDiscount().scale() > 2)				
					m_rowdata.setDiscount(m_rowdata.getDiscount().setScale(2, BigDecimal.ROUND_HALF_UP));
			}
			catch (NumberFormatException e) {
				m_rowdata.setDiscount(Env.ZERO);
			}			
			return false;
		}
		return true;
	}

	public boolean qty(String name, BigDecimal qty) {
		if ( getM_Product_ID() == 0 && name.equals("M_AttributeSetInstance_ID"))
			return true;
		else if (name == "C_UOM_ID")
		{
			int C_UOM_To_ID = m_rowdata.getC_UOM_ID();
			BigDecimal QtyEntered1 = m_rowdata.getQtyEntered().setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
			if (m_rowdata.getQtyEntered().compareTo(QtyEntered1) != 0)
			{
				m_rowdata.setQtyEntered(QtyEntered1);
			}
			m_rowdata.setQtyOrdered(MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(), C_UOM_To_ID, m_rowdata.getQtyEntered()));
			if (m_rowdata.getQtyOrdered() == null)
				m_rowdata.setQtyOrdered(m_rowdata.getQtyEntered());
			boolean conversion = m_rowdata.getQtyEntered().compareTo(m_rowdata.getQtyOrdered()) != 0;
			m_rowdata.setPriceEntered(MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(), C_UOM_To_ID, m_rowdata.getPriceActual()));
			if (m_rowdata.getPriceEntered() == null)
				m_rowdata.setPriceEntered(m_rowdata.getPriceActual()); 
			m_rowdata.setUOMConversion(conversion ? "Y" : "N");
		}
		//	QtyEntered changed - calculate QtyOrdered
		else if (name == "QtyEntered")
		{
			int C_UOM_To_ID = m_rowdata.getC_UOM_ID(); 			
			MUOM uom = MUOM.get(Env.getCtx(), m_rowdata.getC_UOM_ID());
			if (qty.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) > 0 && !uom.isSplit())
			{
				setM_processMsg("Producto no acepta fraccion");
				return false;
			}
			m_rowdata.setQtyEntered(qty);
			//BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
			BigDecimal QtyEntered1 = m_rowdata.getQtyEntered().setScale(uom.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
			if (m_rowdata.getQtyEntered().compareTo(QtyEntered1) != 0)
			{
				m_rowdata.setQtyEntered(QtyEntered1);
			}
			m_rowdata.setQtyOrdered(MUOMConversion.convertProductFrom (Env.getCtx(), m_rowdata.getM_Product_ID(),	C_UOM_To_ID, m_rowdata.getQtyEntered()));
			if (m_rowdata.getQtyOrdered() == null)
				m_rowdata.setQtyOrdered(m_rowdata.getQtyEntered());
			boolean conversion = m_rowdata.getQtyEntered().compareTo(m_rowdata.getQtyOrdered()) != 0;
			m_rowdata.setUOMConversion(conversion ? "Y" : "N");
		}
		else if (name == "QtyOrdered")
		{
			int c_UOM_From_ID = m_rowdata.getC_UOM_ID();
			m_rowdata.setQtyOrdered(qty);
			m_rowdata.setQtyEntered(MUOMConversion.convertProductFrom(Env.getCtx(), m_rowdata.getM_Product_ID(),	c_UOM_From_ID, m_rowdata.getQtyOrdered()));
			if (m_rowdata.getQtyEntered() == null)
				m_rowdata.setQtyEntered(m_rowdata.getQtyOrdered());
			boolean conversion = m_rowdata.getQtyOrdered().compareTo(m_rowdata.getQtyEntered()) != 0;
			m_rowdata.setUOMConversion(conversion ? "Y" : "N");	
		}
		if (!m_rowdata.getIsStocked())
			return true;
		else
			return checkAvailable();
	}


	public MProductBOM[] getBOMLines()
	{
		return boms;
	}

	public void setBOMLines(MProductBOM[] p_boms)
	{
		boms = p_boms;
	}
	
	public Boolean getEnforcePriceLimit() {
		return m_rowdata.getEnforcePriceLimit();
	}
	public void setEnforcePriceLimit(Boolean enforcePriceLimit) {
		m_rowdata.setEnforcePriceLimit(enforcePriceLimit);
	}
	
	public Boolean product(Integer M_Product_ID)
	{
		MProduct product = new MProduct(Env.getCtx(), M_Product_ID, null);
		return product(product);
	}

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
		//m_rowdata.setM_Product_ID(m_Product.getM_Product_ID());
		//if (m_rowdata.getM_Product_ID() == null || m_rowdata.getM_Product_ID().intValue() == 0)
		//	return false;

//		/*****	Price Calculation see also qty	****/
//		BigDecimal Qty = m_rowdata.getQtyOrdered();
//		/** PLV is only accurate if PL selected in header */
//		MProductPricing pp = new MProductPricing (m_rowdata.getM_Product_ID().intValue(), m_rowdata.getC_BPartner_ID(), Qty, m_rowdata.isIsSOTrx());
//		pp.setM_PriceList_ID(m_rowdata.getM_PriceList_ID());
//		pp.setM_PriceList_Version_ID(m_rowdata.getM_PriceListVersion_ID());
//		pp.setPriceDate(getDateOrdered());
//		//		
//		m_rowdata.setPriceList(pp.getPriceList());
//		m_rowdata.setPriceLimit(pp.getPriceLimit());
//		m_rowdata.setPriceActual(pp.getPriceStd());
//		m_rowdata.setPriceEntered(pp.getPriceStd());
//		m_rowdata.setPriceBase(pp.getPriceStd());
//		m_rowdata.setC_Currency_ID(pp.getC_Currency_ID());
//		m_rowdata.setDiscount(pp.getDiscount());
//		m_rowdata.setC_UOM_ID(pp.getC_UOM_ID());
//		m_rowdata.setEnforcePriceLimit(pp.isEnforcePriceLimit());
//		m_rowdata.setIsReadOnlyPriceList(pp.isReadOnly());
//		
//		//Env.setContext(Env.getCtx(), getWindowNo(), "EnforcePriceLimit", pp.isEnforcePriceLimit() ? "Y" : "N");
//		Env.setContext(Env.getCtx(), getWindowNo(), "DiscountSchema", pp.isDiscountSchema() ? "Y" : "N");
//		Env.setContext(Env.getCtx(), getWindowNo(), "M_Product_ID", m_rowdata.getM_Product_ID());
//		//product = MProduct.get (Env.getCtx(), m_rowdata.getM_Product_ID().intValue());
//		//boms = MProductBOM.getBOMLines (m_Product);
//		setBOMLines( MProductBOM.getBOMLines (Env.getCtx(), m_Product.getM_Product_ID(), null) );
//		m_rowdata.setInvoicePrintDetails(m_Product.isInvoicePrintDetails());		
//		//for (int j = 0; j < boms.length; j++)
//		//mValue = product.getValue();
//		//mName = product.getName();
//		m_rowdata.setmProductBrand(m_Product.getBrand());
//		m_rowdata.setmProductBrandValue(m_Product.getBrandValue());
//		m_rowdata.setC_TaxCategory_ID(m_Product.getC_TaxCategory_ID());
//		setIsStocked(product.isStocked());
//		m_rowdata.setM_AttributeSet_ID(m_Product.getM_AttributeSet_ID());
//
//		if (m_rowdata.getM_AttributeSet_ID() != 0) {
//			MAttributeSet mas = MAttributeSet.get(Env.getCtx(),	m_rowdata.getM_AttributeSet_ID());
//			if (mas != null	&& mas.isMandatory())  {
//				m_rowdata.setIsAttributeMandatory(true);
//			}
//		}
////		if (m_rowdata.getIsStocked())
////		{
////			createAttribute();	
////			//if (!checkAvailable())
////			//	return false;
////		}
//		//
//		return tax(X_M_Product.COLUMNNAME_M_Product_ID, product.getM_Product_ID());
		return true;
	}	//	product

	public void setWithholdingType(String WithholdingType)
	{
		m_rowdata.setM_WithholdingType(WithholdingType);
	}
	
	public String getWithholdingType()
	{
		return m_rowdata.getM_WithholdingType();
	}
//		
//	public boolean IsAttributeOK()
//	{
//		if (getIsAttributeMandatory() && m_rowdata.getM_AttributeSetInstance_ID() == 0)
//			return false;
//		else
//			return true;
//	}

	public boolean getIsAttributeMandatory() {		
		return m_rowdata.getIsAttributeMandatory();
	}
	
	private boolean checkAvailable() {
		if (isVoidTransaction())
			return true;
		if (m_rowdata.getM_DeliveryRule().equals(REF_C_OrderDeliveryRule.Force)) // Forzed
			return true;

		BigDecimal available = MStorage.getQtyAvailable	(m_rowdata.getM_Warehouse_ID(), 
								0,
								m_rowdata.getM_Product_ID().intValue(), 
								m_rowdata.getM_AttributeSetInstance_ID(), 
								m_rowdata.getRef_AttributeSetInstance_ID(), null);
		if (available == null)
			available = Env.ZERO;
		if (available.signum() == 0) 
		{
			setM_processMsg("NoQtyAvailable");
			setQtyLostSales(m_rowdata.getQtyOrdered());			
			return false;
		}
		else if (available.compareTo(m_rowdata.getQtyOrdered()) < 0) 
		{	
			setM_processMsg("InsufficientQtyAvailable");
			setQtyLostSales(m_rowdata.getQtyOrdered());
			return false;
		}
		//	else
		//	{
		//		BigDecimal notReserved = MOrderLine.getNotReserved(Env.getCtx(), 
		//				M_Warehouse_ID, M_Product_ID, M_AttributeSetInstance_ID,0);
		//		if (notReserved == null)
		//			notReserved = Env.ZERO;
		//		BigDecimal total = available.subtract(notReserved);
		//		if (total.compareTo(QtyOrdered) < 0)
		//		{
		//			String info = Msg.parseTranslation(Env.getCtx(), "@QtyAvailable@=" + available 
		//					+ " - @QtyNotReserved@=" + notReserved + " = " + total);
		//			m_processMsg = info;
		//			return false;
		//		}
		//	}
		return true;
	}

	public void setQtyLostSales(BigDecimal QtyLostSales) {
		m_rowdata.setM_QtyLostSales(QtyLostSales);	
	}
	
	public BigDecimal getQtyLostSales() {
		return m_rowdata.getM_QtyLostSales();
	}
	
	public BigDecimal getQtyAvailable() {
		BigDecimal CurrentQty = Env.ZERO;
		if  (m_rowdata.getM_Product_ID() == 0)
			return CurrentQty;
		else if (s_qtyavailable.containsKey(m_rowdata.getM_Product_ID()))
			CurrentQty = s_qtyavailable.get(m_rowdata.getM_Product_ID());
		else
		{
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
					s_qtyavailable.put(m_rowdata.getM_Product_ID(), CurrentQty);
				}
				rs.close();
				pstmt.close();
				pstmt = null;			
			} catch (SQLException e) {	
				e.printStackTrace();
			}
		}
		CurrentQty = CurrentQty.subtract(this.getQtyOrdered());
//		for (StackTraceElement ste: Thread.currentThread().getStackTrace()) {
//			System.out.println(ste);
//		}		
		return CurrentQty;
	}

	public Boolean tax (String name, Object value)
	{
		if (value == null)
			return false;

		//	Check Product
		int M_Product_ID = 0;
		if (name.equals("M_Product_ID"))
			M_Product_ID = ((Integer)value).intValue();
		else
			M_Product_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "M_Product_ID");
		int C_Charge_ID = 0;
		if (name.equals("C_Charge_ID"))
			C_Charge_ID = ((Integer)value).intValue();
		else
			C_Charge_ID = Env.getContextAsInt(Env.getCtx(),  getWindowNo(), "C_Charge_ID");
		//log.fine("Product=" + M_Product_ID + ", C_Charge_ID=" + C_Charge_ID);
		if (M_Product_ID == 0 && C_Charge_ID == 0)
			return amt(name, value);		//

		//	Check Partner Location
		int shipC_BPartner_Location_ID = 0;
		if (name.equals("C_BPartner_Location_ID"))
			shipC_BPartner_Location_ID = ((Integer)value).intValue();
		else
			shipC_BPartner_Location_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "C_BPartner_Location_ID");
		if (shipC_BPartner_Location_ID == 0)
			return amt(name, value);		//
		//log.fine("Ship BP_Location=" + shipC_BPartner_Location_ID);

		//
		Timestamp billDate = getDateOrdered();
		//log.fine("Bill Date=" + billDate);

		Timestamp shipDate = getDatePromised();
		//log.fine("Ship Date=" + shipDate);

		int AD_Org_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "AD_Org_ID");
		//log.fine("Org=" + AD_Org_ID);

		int billC_BPartner_Location_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "Bill_Location_ID");
		if (billC_BPartner_Location_ID == 0)
			billC_BPartner_Location_ID = shipC_BPartner_Location_ID;
		//log.fine("Bill BP_Location=" + billC_BPartner_Location_ID);

		//
		int C_Tax_ID = Tax.get (Env.getCtx(), M_Product_ID, C_Charge_ID, billDate, shipDate,
				AD_Org_ID, m_rowdata.getM_Warehouse_ID(), billC_BPartner_Location_ID, shipC_BPartner_Location_ID,
				true);
		//log.info("Tax ID=" + C_Tax_ID);
		//
		if (C_Tax_ID == 0) {}
		//mTab.fireDataStatusEEvent(CLogger.retrieveError());
		else
			setC_Tax_ID(new Integer(C_Tax_ID));
		//
		//if (steps) log.warning("fini");
		return amt(name , value);
	}	//	tax
	/**
	 * Gets the creation date
	 * @return Date the creation date
	 */
	private int getC_Currency_ID() {
		return m_rowdata.getC_Currency_ID();
	}

	public void setC_Currency_ID(int C_Currency_ID) {
		m_rowdata.setC_Currency_ID(C_Currency_ID);
	}

	/**
	 * 	Get Product
	 *	@return product or null
	 */
	public MProduct getProduct()
	{
		if (m_Product == null && getM_Product_ID() != 0)
			m_Product =  MProduct.get (Env.getCtx(), getM_Product_ID(), null);
		return m_Product;
	}	//	getProduct
	public Integer getM_AttributeSetInstance_ID() {
		return m_rowdata.getM_AttributeSetInstance_ID();
	}
	public Integer getRef_AttributeSetInstance_ID() {
		return m_rowdata.getRef_AttributeSetInstance_ID();
	}	
	public BigDecimal getDiscount() { 
		return m_rowdata.getDiscount();
	}
	public Integer getM_PriceList_ID() { 
		return m_rowdata.getM_PriceList_ID();
	}
	public void setM_PriceList_ID(Integer PriceList_ID) {
		m_rowdata.setM_PriceList_ID(PriceList_ID);
	}
	public String getGroup() { 
		return m_rowdata.getmGroup(); 
	}
	public void setGroup(String pGroup) {
		m_rowdata.setmGroup(pGroup);
	}
	public String getProductBrand() { 
		return m_rowdata.getmProductBrand(); 
	}
	public void setProductBrand(String pProductBrand) {
		m_rowdata.setmProductBrand(pProductBrand);
	}
	public String getProductBrandValue() { 
		return m_rowdata.getmProductBrandValue(); 
	}
	public void setProductBrandValue(String pProductBrandValue) {
		m_rowdata.setmProductBrandValue(pProductBrandValue);
	}  
	public BigDecimal getGross() {
		return m_rowdata.getGross();
	}
	public void setGross(BigDecimal pgross) {	  
		m_rowdata.setGross(pgross);
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
	public void setM_Warehouse_ID(Integer warehouse_ID) {
		m_rowdata.setM_Warehouse_ID(warehouse_ID);
	}
	public Integer getC_TaxCategory_ID() {
		return m_rowdata.getC_TaxCategory_ID();
	}
	public void setC_TaxCategory_ID(Integer taxCategory_ID) {
		m_rowdata.setC_TaxCategory_ID(taxCategory_ID);
	}
	public Integer getC_UOM_ID()
	{
		return m_rowdata.getC_UOM_ID();
	}
	public MUOM getUOM() {
		MUOM uom = MUOM.get(Env.getCtx(), m_rowdata.getC_UOM_ID());
		return uom;
	}
	public void setC_BPartner_ID(Integer pC_BPartner_ID)
	{
		m_rowdata.setC_BPartner_ID(pC_BPartner_ID);
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
		m_rowdata.setDateOrdered(pDateOrdered);
	}
	public Timestamp  getDatePromised() {	return m_rowdata.getDatePromised(); }
	public void 	    setDatePromised(Timestamp datePromised) {	m_rowdata.setDatePromised(datePromised);}
	//
	public void 	    setPriceLimit(BigDecimal pPriceLimit)  {  m_rowdata.setPriceLimit(pPriceLimit);  }
	public BigDecimal getPriceLimit()  {	  return m_rowdata.getPriceLimit();  }
	//
	public BigDecimal getPriceActual()  {	  return m_rowdata.getPriceActual();  }  

	public Boolean getPack() {		return m_rowdata.getPack();	}
	public void setM_PriceListVersion_ID(Integer priceListVersion_ID) {		m_rowdata.setM_PriceListVersion_ID(priceListVersion_ID);	}
	public Integer getM_PriceListVersion_ID() {		return m_rowdata.getM_PriceListVersion_ID();	}
	public BigDecimal getPriceEntered() {		
		return m_rowdata.getPriceEntered();	
		}
//	public String getM_processMsg() {		return m_processMsg;	}
//	public void setM_processMsg(String mProcessMsg) 
//	{		
//		m_processMsg = mProcessMsg;	
//	}
	public void setTaxIncluded(boolean isTaxIncluded) {
		m_rowdata.setM_TaxIncluded(isTaxIncluded);		
	}	
	public boolean IsTaxIncluded() {
		return m_rowdata.isM_TaxIncluded();
	}
	public void setWindowNo(int mWindowNo) {
		m_rowdata.setM_WindowNo(mWindowNo);
	}
	public Integer getWindowNo() {
		return m_rowdata.getM_WindowNo();
	}
	public void setC_OrderLine_ID(Integer cOrderLineID) {
		m_rowdata.setC_OrderLine_ID(cOrderLineID);	
	}
	public Integer getC_OrderLine_ID() {
		return m_rowdata.getC_OrderLine_ID();	
	}
	public Integer getM_InOutLine_ID() {
		return m_rowdata.getM_InOutLine_ID();
	}    
	public void setM_InOutLine_ID(int mInOutLineID) {
		m_rowdata.setM_InOutLine_ID(mInOutLineID);
	}
	public void setisVoidTransaction(boolean b) {
		if (b != isVoidTransaction)
			isVoidTransaction = b;	
	}
	public boolean  isVoidTransaction() {
		return isVoidTransaction;	
	}
//	public Boolean createAttribute() {
//		Boolean isCreated = false;
//		if (m_rowdata.getM_AttributeSetInstance_ID() == 0 && m_rowdata.getQtyOrdered().compareTo(Env.ZERO) > 0 && getIsAttributeMandatory())
//		{
//			Integer OldAttributeSetInstance_ID = -1; // DB.getSQLValue(null, "SELECT * FROM getancientasi(?, ?, ?)",M_Warehouse_ID, M_Product_ID, Env.getAD_Org_ID(Env.getCtx()));
//			Integer new_AttributeSetInstance_ID = DB.getSQLValue(null, "SELECT * FROM getancientattributesetinstance(?, ?, ?, ?)", m_rowdata.getM_Warehouse_ID(), m_rowdata.getM_Product_ID(), m_rowdata.getQtyOrdered(), Env.getAD_Org_ID(Env.getCtx()));
//			if (OldAttributeSetInstance_ID < 0)
//				OldAttributeSetInstance_ID = new_AttributeSetInstance_ID;
//			if (OldAttributeSetInstance_ID.compareTo(new_AttributeSetInstance_ID) != 0)
//			{
//				BigDecimal oQtyEntered = m_rowdata.getQtyEntered();
//				BigDecimal oQtyOrdered = m_rowdata.getQtyOrdered();
//				BigDecimal AncientQty  = MStorage.getQtyAvailable(m_rowdata.getM_Warehouse_ID(), m_rowdata.getM_Product_ID(), OldAttributeSetInstance_ID, null);
//				BigDecimal Qty = m_rowdata.getQtyOrdered().subtract(AncientQty);
//				if (Qty.compareTo(Env.ZERO)  < 0)
//				{
//					m_rowdata.setQtyEntered(oQtyEntered);
//					m_rowdata.setQtyOrdered(oQtyOrdered);					
//				}
//				else if (Qty.compareTo(Env.ZERO) == 0)
//				{
//					// el mas antiguo es igual a la cantidad solicitada
//					// asi que simplemente lo reemplazamos y no agregamos nada.
//					new_AttributeSetInstance_ID = OldAttributeSetInstance_ID;
//				}
//				else
//				{
//					m_rowdata.setAncientAttributeSetInstanceQtyAvailable(AncientQty);
//					if ( qty("QtyOrdered", Qty) && amt("QtyOrdered", Qty) )
//					{
//						m_rowdata.setAncientAttributeSetInstance_ID(OldAttributeSetInstance_ID);
//					}					
//				}
//			}
//			if (new_AttributeSetInstance_ID > 0 )
//			{
//				m_rowdata.setM_AttributeSetInstance_ID(new_AttributeSetInstance_ID);
//				isCreated = true;
//			}
//		}
//		else
//		{
//			isCreated = true;
//		}
//		return isCreated;
//	}

	
	
	public boolean isOverwritePriceList()	{
		return m_rowdata.getOverWritePriceList();
	}
	public void setOverwritePriceLimit(boolean overwritePriceList) {
		m_rowdata.setOverWritePriceList(overwritePriceList);
	}

	public void setPOSPanel(PosPanel posPanel) {
		m_POSPanel = posPanel;
	}

	public boolean isCanChangePrice()
	{
		return m_POSPanel.isCanChangePrice();
	}
	public void ToOrderLine(MOrderLine line) {
		line.setM_Warehouse_ID(getM_Warehouse_ID());
		line.setM_Product_ID(getM_Product_ID(), true);														
		line.setPriceActual(getPriceActual());
		line.setPriceList(getPriceList());
		line.setPriceLimit(getPriceLimit());
		line.setPriceEntered(getPriceEntered());
		line.setPriceBase(getPriceBase());
		line.setQtyOrdered(getQtyOrdered());
		line.setQtyEntered(getQtyEntered());
		line.setM_AttributeSetInstance_ID(getM_AttributeSetInstance_ID());
		line.setRef_AttributeSetInstance_ID(getRef_AttributeSetInstance_ID());
		//line.setTax();
		line.setC_Tax_ID(this.getC_Tax_ID());
		line.setC_UOM_ID(getC_UOM_ID());
		line.setLineNetAmt(getTotal());
		line.setDiscount(getDiscount());
		line.setDiscount1(getDiscount1());
		line.setDiscount2(getDiscount2());
		line.setDiscount3(getDiscount3());
		line.setDiscount4(getDiscount4());
		line.setIsBonus(IsBonus());
		line.setC_CampaignBonus_ID(getC_CampaignBonus_ID());
		line.setC_CampaignDiscount_ID(getC_CampaignDiscount_ID());
	}
	public void FromOrderLine(MOrderLine line) {
		setC_BPartner_ID(line.getC_BPartner_ID());
		setC_Currency_ID(line.getC_Currency_ID());
		setDateOrdered(line.getDateOrdered());
		setDatePromised(line.getDateOrdered());
		
		setM_Warehouse_ID(line.getM_Warehouse_ID());
		
		//
		m_rowdata.setM_Product_ID(line.getM_Product_ID());
		m_Product = MProduct.get (Env.getCtx(), m_rowdata.getM_Product_ID(), null);		
		m_rowdata.setmProductBrand(m_Product.getBrand());		
		m_rowdata.setmProductBrandValue(m_Product.getBrandValue());
		m_rowdata.setC_TaxCategory_ID(m_Product.getC_TaxCategory_ID());
		setIsStocked(m_Product.isStocked());
		m_rowdata.setM_AttributeSet_ID(m_Product.getM_AttributeSet_ID());
		
		m_rowdata.setPriceBase(line.getPriceBase());
		m_rowdata.setPriceList(line.getPriceList());
		m_rowdata.setPriceLimit(line.getPriceLimit());
		m_rowdata.setPriceActual(line.getPriceActual());
		m_rowdata.setPriceEntered(line.getPriceEntered());

		m_rowdata.setDiscount(line.getDiscount());
		m_rowdata.setDiscount1(line.getDiscount1());
		m_rowdata.setDiscount2(line.getDiscount2());
		m_rowdata.setDiscount3(line.getDiscount3());
		m_rowdata.setDiscount4(line.getDiscount4());				
		//											
		m_rowdata.setQtyOrdered(line.getQtyOrdered());
		m_rowdata.setQtyEntered(line.getQtyEntered());
		m_rowdata.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
		m_rowdata.setRef_AttributeSetInstance_ID(line.getRef_AttributeSetInstance_ID());
		m_rowdata.setC_Tax_ID(line.getC_Tax_ID());
		m_rowdata.setC_UOM_ID(line.getC_UOM_ID());
		m_rowdata.setTotal(line.getLineNetAmt());
		m_rowdata.setC_CampaignBonus_ID(line.getC_CampaignBonus_ID());
		m_rowdata.setC_CampaignDiscount_ID(line.getC_CampaignDiscount_ID());
	}	
	
	public void addC_CampaignDiscount_ID(int C_CampaignDiscount_ID) {
		campaigndiscount.add(C_CampaignDiscount_ID);
	}	
	public Boolean hasCampaignDiscount(Integer C_CampaignDiscount_ID)
	{
		return campaigndiscount.contains(C_CampaignDiscount_ID);
	}
	public boolean hasCampaignDiscount() {
		return campaigndiscount.size() > 0;
	}
	
	public Integer getC_CampaignDiscount_ID() {
		return m_rowdata.getC_CampaignDiscount_ID();
	}
	public void setC_CampaignDiscount_ID(Integer cCampaignDiscountID) {
		m_rowdata.setC_CampaignDiscount_ID(cCampaignDiscountID);
	}
	
	public void setDisplayColumn(Integer col, Object value, Object CurrentDisplayvalue)
	{
		if (displayobject.size() < col)
		{
			while (displayobject.size() <= col)
			{
				//displayobject.add(null);
				displayobject.add(new Object[2]);								
			}		
		}
		//displayobject.set(col, value);
		Object[] objects = displayobject.get(col);
		objects[0] = value;
		objects[1] = CurrentDisplayvalue;
		displayobject.set(col, objects);
		//displayobject.set(col, element)
	}
	public Object getDisplayColumn(Integer col, Object value)
	{
		Object Result = null;
		if (displayobject.size() < col)
		{
			while (displayobject.size() <= col)
			{
				//displayobject.add(null);
				displayobject.add(new Object[2]);
			}		
		}
		//Result = displayobject.get(col);
		Object[] objects = displayobject.get(col);
		if (value != null && objects[0] != null && value.equals(objects[0]))
			Result = objects[1];
		return Result;
	}
	
	public MCampaignBonus[] getCampaignBonus()
	{
		ArrayList<MCampaignBonus> list = new ArrayList<MCampaignBonus>();
		for (Vector cp:campaignbonus)
			list.add((MCampaignBonus) cp.firstElement());
		
		MCampaignBonus[] lines = new MCampaignBonus[list.size ()];
		list.toArray (lines);
		return lines;
	}

	public Integer[] getCampaignDiscount()
	{
		Integer[] lines = null;
		campaigndiscount.toArray(lines);
		return lines;
	}
	
	public void addC_CampaignBonus_ID(MCampaignBonus cbonus) {
		Vector<Object> campaign = new Vector();
		campaign.add(cbonus);
		campaign.add(false);
		campaignbonus.add(campaign);
	}	
	public Boolean hasCampaignBonus(MCampaignBonus cbonus)
	{
		boolean found = false;
		for (Vector cp:campaignbonus)
		{
			if (cp.firstElement().equals(cbonus))
			{
				found = true;
				break;
			}
			
		}
		return found;
	}
	public boolean hasCampaignBonus() {
		return campaignbonus.size() > 0;
	}
	
	public void AddBonusRow(Row bonus) {
		BonusRow.add(bonus);
	}
	public Row[] getChilds() {
		Row[] rows = new Row[BonusRow.size()];
		BonusRow.toArray(rows);
		return rows;
	}
	public void setFirstChild(RowBase row)
	{
		//if (m_SelectedChild != null && !row.equals(m_SelectedChild) )
		//	regenerateChild = true;
		m_SelectedChild = (Row) row;
	}
	public Row getFirstChild() {	
		Boolean lfound = false;
		if (m_SelectedChild != null)
		{
			for (Row row:BonusRow)
			{
			
				if (row.equals(m_SelectedChild) || 
					( row.getM_Product_ID().equals(m_SelectedChild.getM_Product_ID()) && 
					  row.getC_UOM_ID().equals(m_SelectedChild.getC_UOM_ID()) )
					)
				{
					if (!row.equals(m_SelectedChild))
						m_SelectedChild = row;
					lfound = true;
					break;
				}
			}
		}
		if (!lfound)
		{
			if (BonusRow.size() > 0)
			{
				m_SelectedChild = BonusRow.get(0);
			}
			else if (m_SelectedChild != null)
				m_SelectedChild = null; // el objeto debe ser puesto a null pues pertenece a un objeto que es obsoleto.
		}
		return m_SelectedChild;
	}
	public int getSizeOfChilds() {
		return BonusRow.size();
	}
	public void killBonusChilds() {
		BonusRow = new ArrayList<Row>(); 
	}
	public void setC_CampaignBonus_ID(Integer cCampaignBonusID) {
		if (!cCampaignBonusID.equals(m_rowdata.getC_CampaignBonus_ID()))
		{
			if (m_rowdata.getC_CampaignBonus_ID() > 0)
				setIsChanged(true);			
			m_rowdata.setC_CampaignBonus_ID(cCampaignBonusID);
		}
	}
	public Integer getC_CampaignBonus_ID() {
		return m_rowdata.getC_CampaignBonus_ID();
	}
	public Object getPropertyValue(String property) {
		Object value = null;
		if (property.equals("C_CampaignBonus_ID"))
		{
			value = getC_CampaignBonus_ID();
		}
		return value;
	}
	
	public Boolean getIsStocked() {
		return m_rowdata.getIsStocked();
	}
	public void setIsStocked(Boolean isStocked) {
		m_rowdata.setIsStocked(isStocked);
	}
	
	public int getM_AttributeSet_ID() {
		return m_rowdata.getM_AttributeSet_ID();
	}
	public void setM_AttributeSet_ID(int m_AttributeSet_ID) {
		m_rowdata.setM_AttributeSet_ID( m_AttributeSet_ID);
	}
	
	public Row Clone()
	{
		Row newrow = new Row();
		
		newrow.setM_Product_ID(m_rowdata.getM_Product_ID());
		newrow.setM_Warehouse_ID(m_rowdata.getM_Warehouse_ID());
		newrow.m_Product = getProduct();		
		newrow.setProductBrand(m_rowdata.getmProductBrand());		
		newrow.setProductBrandValue(m_rowdata.getmProductBrandValue());
		newrow.setC_TaxCategory_ID(m_rowdata.getC_TaxCategory_ID());
		newrow.setIsStocked(m_rowdata.getIsStocked());				
		newrow.setM_AttributeSet_ID(m_rowdata.getM_AttributeSet_ID());		
		
		newrow.setPriceBase(m_rowdata.getPriceBase());
		newrow.setPriceList(m_rowdata.getPriceList());
		newrow.setPriceLimit(m_rowdata.getPriceLimit());
		newrow.setPriceActual(m_rowdata.getPriceActual());
		newrow.setPriceEntered(m_rowdata.getPriceEntered());

		newrow.setDiscount(m_rowdata.getDiscount());
		//newrow.setDiscount1(m_rowdata.getDiscount1());
		//newrow.set(X_C_OrderLine.COLUMNNAME_Discount1, m_rowdata.getBD(X_C_OrderLine.COLUMNNAME_Discount1));
		newrow.setDiscount2(m_rowdata.getDiscount2());
		newrow.setDiscount3(m_rowdata.getDiscount3());
		newrow.setDiscount4(m_rowdata.getDiscount4());				
		//											
		newrow.setQtyOrdered(m_rowdata.getQtyOrdered());
		newrow.setQtyEntered(m_rowdata.getQtyEntered());
		newrow.setM_AttributeSetInstance_ID(m_rowdata.getM_AttributeSetInstance_ID());
		newrow.setC_Tax_ID(m_rowdata.getC_Tax_ID());
		newrow.setC_UOM_ID(m_rowdata.getC_UOM_ID());
		newrow.setTotal(m_rowdata.getTotal());
		newrow.setC_CampaignBonus_ID(m_rowdata.getC_CampaignBonus_ID());
		newrow.setC_CampaignDiscount_ID(m_rowdata.getC_CampaignDiscount_ID());
		
		return newrow;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer("");
		if (m_Product != null)
		{
			sb.append("Product: ");
			sb.append(m_Product.getName());
		}
		sb.append("UOM:");
		sb.append(MUOM.get(Env.getCtx(), m_rowdata.getC_UOM_ID()).getName());
		sb.append("Qty Entered:");
		sb.append(m_rowdata.getQtyEntered());
		sb.append("Qty Ordered:");
		sb.append(m_rowdata.getQtyOrdered());
		return sb.toString();
	}
	public void setOrderLine(MOrderLine line, Boolean IsVoid) {
		isVoidTransaction = IsVoid;		
		m_rowdata.setC_OrderLine_ID(line.getC_OrderLine_ID());
		if (!IsVoid)
			m_rowdata.setBonus(line.isBonus());		
		m_rowdata.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());
		//product("M_Product_ID",line.getM_Product_ID()));
		m_rowdata.setPriceBase(line.getPriceBase());
		m_rowdata.setPriceList(line.getPriceList());
		m_rowdata.setPriceLimit(line.getPriceLimit());
		m_rowdata.setPriceActual(line.getPriceActual());
		m_rowdata.setPriceEntered(line.getPriceEntered());
		m_rowdata.setC_Currency_ID(line.getC_Currency_ID());
		m_rowdata.setDiscount(line.getDiscount());
		m_rowdata.setDiscount1(line.getDiscount1());
		m_rowdata.setDiscount2(line.getDiscount2());
		m_rowdata.setDiscount3(line.getDiscount3());
		m_rowdata.setDiscount4(line.getDiscount4());
		m_rowdata.setC_UOM_ID(line.getC_UOM_ID());
		m_rowdata.setC_Tax_ID(line.getC_Tax_ID());			
		//MProductPricing pp = new MProductPricing (line.getM_Product_ID(), line.getC_BPartner_ID(), line.getQtyOrdered(), true);
		//pp.setM_PriceList_ID(m_order.getM_PriceList_ID());
		//int M_PriceList_Version_ID = this.m_DefaultPriceListVersion_ID;
		//pp.setM_PriceList_Version_ID(M_PriceList_Version_ID);		
		m_Product = MProduct.get (Env.getCtx(), line.getM_Product_ID(), null);
		MProductPricing pp = new MProductPricing (m_rowdata.getM_Product_ID().intValue(), m_rowdata.getC_BPartner_ID(), m_rowdata.getQtyOrdered(), m_rowdata.isIsSOTrx());
		pp.setM_PriceList_ID(m_rowdata.getM_PriceList_ID());
		pp.setM_PriceList_Version_ID(m_rowdata.getM_PriceListVersion_ID());
		pp.setPriceDate(getDateOrdered());
		m_rowdata.setPriceLimit(pp.getPriceLimit());
		m_rowdata.setEnforcePriceLimit(pp.isEnforcePriceLimit());
		m_rowdata.setIsReadOnlyPriceList(pp.isReadOnly());
		m_rowdata.setM_AttributeSet_ID(m_Product.getM_AttributeSet_ID());

		setWithholdingType(m_Product.getWithholdingType());		
		
		if (m_rowdata.getM_AttributeSet_ID() != 0) {
			MAttributeSet mas = MAttributeSet.get(Env.getCtx(), m_rowdata.getM_AttributeSet_ID(), line.get_TrxName());
			if (mas != null	&& mas.isMandatory())  {
				m_rowdata.setIsAttributeMandatory(true);
			}
		}
		
		m_rowdata.setM_Product_ID(line.getM_Product_ID());
		m_rowdata.setmProductBrand(m_Product.getBrand());
		m_rowdata.setmProductBrandValue(m_Product.getBrandValue());
		m_rowdata.setC_TaxCategory_ID(m_Product.getC_TaxCategory_ID());	
		m_rowdata.setQtyEntered(line.getQtyEntered());
		m_rowdata.setQtyEntered(line.getQtyEntered());
		m_rowdata.setQtyOrdered(line.getQtyOrdered());
		BigDecimal available = MStorage.getQtyAvailable	(m_rowdata.getM_Warehouse_ID(), 0,m_rowdata.getM_Product_ID().intValue(), m_rowdata.getM_AttributeSetInstance_ID(), m_rowdata.getRef_AttributeSetInstance_ID(), null);
		if (available == null)
			available = Env.ZERO;
//		if (available.compareTo(m_rowdata.getQtyOrdered()) < 0 && getM_AttributeSetInstance_ID() != 0) 
//		{
//			setM_AttributeSetInstance_ID(0);
//			if (!IsAttributeOK() && !isVoidTransaction)
//			{
//				if (!createAttribute())
//				{
//					m_rowdata.setQtyEntered(Env.ZERO);
//					m_rowdata.setQtyOrdered(Env.ZERO);
//				}
//			}
//		}		
		m_rowdata.setPriceEntered(line.getPriceEntered());
		m_rowdata.setPriceActual(line.getPriceActual());
		m_rowdata.setGross(m_rowdata.getPriceList().multiply(m_rowdata.getQtyOrdered()).setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
		m_rowdata.setTotal(m_rowdata.getPriceActual().multiply(m_rowdata.getQtyOrdered()).setScale(m_rowdata.getStdPrecision(), BigDecimal.ROUND_HALF_UP));
		//if (!getQtyEntered().equals(line.getQtyEntered()) && getM_AttributeSetInstance_ID() != 0)			
		//{
			//setM_AttributeSetInstance_ID(0);
			//setQtyEntered(line.getQtyEntered());
			// significa que no hay stock con ese 
		//}
	}
	public boolean isInvoicePrintDetails() {
		return m_rowdata.isInvoicePrintDetails();
	}
	public String getMessage() {		
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("row", this.m_rowdata.getClass());
		String xml = xstream.toXML(this.m_rowdata);
		return xml;
	}
}