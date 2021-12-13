package org.xendra.pop;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.Vector;

import org.compiere.apps.ADialog;
import org.compiere.model.MAttributeSet;
import org.compiere.model.MPriceList;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPricing;
import org.compiere.model.MTax;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.model.Tax;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.objectview.RowBase;


public class RowData  extends RowBase { 
	private Integer RowID = 0;
	private Integer M_Product_ID = 0;
	private String mValue = "";
	private String mName = "";
	private Boolean Pack = false;
	private Boolean isStocked = false;
	private int M_AttributeSet_ID = 0;
	private Boolean IsAttributeMandatory = false;
	public  Integer M_AttributeSetInstance_ID = 0;
	public  Integer M_PriceList_ID = 0;
	public  Integer M_Warehouse_ID = 0;
	public  Integer M_Locator_ID = 0;
	public  Integer C_TaxCategory_ID = 0;
	public  Integer C_BPartner_ID = 0;
	public  Integer C_UOM_ID = 0;
	public  Integer C_UOMBonus_ID = 0;
	public  Integer C_UOMSales_ID = 0;
	public  String mGroup = "";
	public  String mProductBrand = "";
	public  String mProductBrandValue = "";
	private Timestamp DateOrdered = new Timestamp(System.currentTimeMillis());
	private Timestamp DateAcct = new Timestamp(System.currentTimeMillis());
	private Timestamp DatePromised = new Timestamp(System.currentTimeMillis());;
	private BigDecimal PriceEnteredWithoutTax = Env.ZERO;
	private BigDecimal PriceList = Env.ZERO;
	private BigDecimal PriceStd = BigDecimal.ZERO;
	private BigDecimal PriceActual = Env.ZERO;
	private BigDecimal PriceEntered = Env.ZERO;
	private BigDecimal PriceLimit = Env.ZERO;
	private BigDecimal PriceAcquisition = Env.ZERO;
	//private BigDecimal PriceAcquisition2 = Env.ZERO;
	private BigDecimal SalesPriceList = Env.ZERO;
	private BigDecimal SalesPriceStd = Env.ZERO;
	private BigDecimal SalesPriceLimit = Env.ZERO;
	private BigDecimal Margin = Env.ZERO;
	private BigDecimal Gross = Env.ZERO;
	private BigDecimal QtyEntered = Env.ZERO; //Env.ZERO;
	private BigDecimal Total = Env.ZERO;
	private BigDecimal Net = Env.ZERO;
	private BigDecimal TaxAmount = Env.ZERO;
	private BigDecimal QtyOrdered = Env.ZERO;
	private Integer C_Currency_ID = 0;
	private Integer C_Tax_ID = 0;
	private Integer M_PriceListVersion_ID;
	private boolean m_TaxIncluded;
	private String UOMConversion = "N";
	private int m_WindowNo;
	private Integer C_OrderLine_ID = 0;
	private Integer M_InOutLine_ID = 0;
	private boolean IsSOTrx = true;
	private String m_Lot;
	private Timestamp m_GuaranteeDate;
	private Timestamp  LastdateInvoiced;
	// Bonus al comprar
	private BigDecimal QtyBonus = Env.ZERO;
	private BigDecimal QtyBonusOrdered = BigDecimal.ZERO;
	
	private BigDecimal Discount = Env.ZERO;
	private BigDecimal DiscountAmt = BigDecimal.ZERO;
	private BigDecimal Discount1 = Env.ZERO;
	//private BigDecimal Discount1Amt = Env.ZERO;
	private BigDecimal Discount2 = Env.ZERO;
	//private BigDecimal Discount2Amt = Env.ZERO;
	private BigDecimal Discount3 = Env.ZERO;
	//private BigDecimal Discount3Amt = Env.ZERO;
	private BigDecimal Discount4 = Env.ZERO;
	//private BigDecimal Discount4Amt = Env.ZERO;
	private BigDecimal DiscountAcquire1 = Env.ZERO;	
	private BigDecimal Freight = Env.ZERO;
	private BigDecimal PriceBase = Env.ZERO;
	private int StdPrecision = 2;
	private String m_WithholdingType = "N";
	private boolean m_updatePrice = false;

	public BigDecimal getQtyBonus() {
		return QtyBonus;
	}
	public void setQtyBonus(BigDecimal qtyBonus) {
		QtyBonus = qtyBonus;
	}
	public Integer getC_UOMBonus_ID() {
		return C_UOMBonus_ID;
	}
	public void setC_UOMBonus_ID(Integer c_UOMBonus_ID) {
		C_UOMBonus_ID = c_UOMBonus_ID;
	}		
	public BigDecimal getQtyBonusOrdered() {
		return QtyBonusOrdered;
	}
	public void setQtyBonusOrdered(BigDecimal qtyBonusOrdered) {
		QtyBonusOrdered = qtyBonusOrdered;
	}
	public Integer getRowID() {
		return RowID;
	}
	public void setRowID(Integer rowID) {
		RowID = rowID;
	}
	public Integer getM_Product_ID() {
		return M_Product_ID;
	}
	public void setM_Product_ID(Integer m_Product_ID) {
		M_Product_ID = m_Product_ID;
	}
	public String getmValue() {
		return mValue;
	}
	public void setmValue(String mValue) {
		this.mValue = mValue;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public Boolean getPack() {
		return Pack;
	}
	public void setPack(Boolean pack) {
		Pack = pack;
	}
	public Boolean getIsStocked() {
		return isStocked;
	}
	public void setIsStocked(Boolean isStocked) {
		this.isStocked = isStocked;
	}
	public int getM_AttributeSet_ID() {
		return M_AttributeSet_ID;
	}
	public void setM_AttributeSet_ID(int m_AttributeSet_ID) {
		M_AttributeSet_ID = m_AttributeSet_ID;
	}
	public Boolean getIsAttributeMandatory() {
		return IsAttributeMandatory;
	}
	public void setIsAttributeMandatory(Boolean isAttributeMandatory) {
		IsAttributeMandatory = isAttributeMandatory;
	}
	public Integer getM_AttributeSetInstance_ID() {
		return M_AttributeSetInstance_ID;
	}
	public void setM_AttributeSetInstance_ID(Integer m_AttributeSetInstance_ID) {
		M_AttributeSetInstance_ID = m_AttributeSetInstance_ID;
	}
	public Integer getM_PriceList_ID() {
		return M_PriceList_ID;
	}
	public void setM_PriceList_ID(Integer m_PriceList_ID) {
		M_PriceList_ID = m_PriceList_ID;
	}
	public Integer getM_Warehouse_ID() {
		return M_Warehouse_ID;
	}
	public void setM_Warehouse_ID(Integer m_Warehouse_ID) {
		M_Warehouse_ID = m_Warehouse_ID;
	}
	public Integer getM_Locator_ID() {
		return M_Locator_ID;
	}
	public void setM_Locator_ID(Integer m_Locator_ID) {
		M_Locator_ID = m_Locator_ID;
	}
	public Integer getC_TaxCategory_ID() {
		return C_TaxCategory_ID;
	}
	public void setC_TaxCategory_ID(Integer c_TaxCategory_ID) {
		C_TaxCategory_ID = c_TaxCategory_ID;
	}
	public Integer getC_BPartner_ID() {
		return C_BPartner_ID;
	}
	public void setC_BPartner_ID(Integer c_BPartner_ID) {
		C_BPartner_ID = c_BPartner_ID;
	}
	public Integer getC_UOM_ID() {
		return C_UOM_ID;
	}
	public void setC_UOM_ID(Integer c_UOM_ID) {
		C_UOM_ID = c_UOM_ID;	
	}
	public Integer getC_UOMSales_ID() {
		return C_UOMSales_ID;
	}
	public void setC_UOMSales_ID(Integer value) {
		C_UOMSales_ID = value;
	}
	
	public String getmGroup() {
		return mGroup;
	}
	public void setmGroup(String mGroup) {
		this.mGroup = mGroup;
	}
	public String getmProductBrand() {
		return mProductBrand;
	}
	public void setmProductBrand(String mProductBrand) {
		this.mProductBrand = mProductBrand;
	}
	public String getmProductBrandValue() {
		return mProductBrandValue;
	}
	public void setmProductBrandValue(String mProductBrandValue) {
		this.mProductBrandValue = mProductBrandValue;
	}
	public Timestamp getDateOrdered() {
		return DateOrdered;
	}
	public void setDateOrdered(Timestamp dateOrdered) {
		DateOrdered = dateOrdered;
	}
	public Timestamp getDateAcct() {
		return DateAcct;
	}
	public void setDateAcct(Timestamp dateAcct) {
		DateAcct = dateAcct;
	}
	public Timestamp getDatePromised() {
		return DatePromised;
	}
	public void setDatePromised(Timestamp datePromised) {
		DatePromised = datePromised;
	}
	public BigDecimal getPriceEnteredWithoutTax() {
		return PriceEnteredWithoutTax;
	}
	public void setPriceEnteredWithoutTax(BigDecimal priceEnteredWithoutTax) {
		PriceEnteredWithoutTax = priceEnteredWithoutTax;
	}
	public BigDecimal getPriceStd() {
		return PriceStd;
	}
	public void setPriceStd(BigDecimal priceStd) {
		PriceStd = priceStd;
	}
	public BigDecimal getPriceList() {
		return PriceList;
	}
	public void setPriceList(BigDecimal priceList) {
		PriceList = priceList;
	}
	public BigDecimal getPriceActual() {
		return PriceActual;
	}
	public void setPriceActual(BigDecimal priceActual) {
		PriceActual = priceActual;
	}
	public BigDecimal getPriceEntered() {
		return PriceEntered;
	}
	public void setPriceEntered(BigDecimal priceEntered) {
		PriceEntered = priceEntered;
	}
	public BigDecimal getPriceLimit() {
		return PriceLimit;
	}
	public void setPriceLimit(BigDecimal priceLimit) {
		PriceLimit = priceLimit;
	}
	public BigDecimal getPriceAcquisition() {
		return PriceAcquisition;
	}
	public void setPriceAcquisition(BigDecimal priceAcquisition) {
		PriceAcquisition = priceAcquisition;
	}
//	public BigDecimal getPriceAcquisition2() {
//		return PriceAcquisition2;
//	}
//	public void setPriceAcquisition2(BigDecimal priceAcquisition2) {
//		PriceAcquisition2 = priceAcquisition2;
//	}
	public BigDecimal getSalesPriceList() {
		return SalesPriceList;
	}
	public void setSalesPriceList(BigDecimal salesPriceList) {
		SalesPriceList = salesPriceList;
	}
	public BigDecimal getSalesPriceStd() {
		return SalesPriceStd;
	}
	public void setSalesPriceStd(BigDecimal salesPriceStd) {
		SalesPriceStd = salesPriceStd;
	}
	public BigDecimal getSalesPriceLimit() {
		return SalesPriceLimit;
	}
	public void setSalesPriceLimit(BigDecimal salesPriceLimit) {
		SalesPriceLimit = salesPriceLimit;
	}
	public BigDecimal getMargin() {
		return Margin;
	}
	public void setMargin(BigDecimal var) {
		Margin = var;
	}
	public BigDecimal getGross() {
		return Gross;
	}
	public void setGross(BigDecimal gross) {
		Gross = gross;
	}
	public BigDecimal getQtyEntered() {
		return QtyEntered;
	}
	public void setQtyEntered(BigDecimal qtyEntered) {
		QtyEntered = qtyEntered;
	}
	public BigDecimal getTotal() {
		return Total;
	}
	public void setTotal(BigDecimal total) {
		Total = total;
	}
	public BigDecimal getNet() {
		return Net;
	}
	public void setNet(BigDecimal net) {
		Net = net;
	}
	public BigDecimal getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		TaxAmount = taxAmount;
	}
	public BigDecimal getQtyOrdered() {
		return QtyOrdered;
	}
	public void setQtyOrdered(BigDecimal qtyOrdered) {
		QtyOrdered = qtyOrdered;
		System.out.println(QtyOrdered);
	}
	public Integer getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_Currency_ID(Integer c_Currency_ID) {
		C_Currency_ID = c_Currency_ID;
	}
	public Integer getC_Tax_ID() {
		return C_Tax_ID;
	}
	public void setC_Tax_ID(Integer c_Tax_ID) {
		C_Tax_ID = c_Tax_ID;
	}
	public Integer getM_PriceListVersion_ID() {
		return M_PriceListVersion_ID;
	}
	public void setM_PriceListVersion_ID(Integer m_PriceListVersion_ID) {
		M_PriceListVersion_ID = m_PriceListVersion_ID;
	}
	public boolean isM_TaxIncluded() {
		return m_TaxIncluded;
	}
	public void setM_TaxIncluded(boolean m_TaxIncluded) {
		this.m_TaxIncluded = m_TaxIncluded;
	}
	public String getUOMConversion() {
		return UOMConversion;
	}
	public void setUOMConversion(String uOMConversion) {
		UOMConversion = uOMConversion;
	}
	public int getM_WindowNo() {
		return m_WindowNo;
	}
	public void setM_WindowNo(int m_WindowNo) {
		this.m_WindowNo = m_WindowNo;
	}
	public Integer getC_OrderLine_ID() {
		return C_OrderLine_ID;
	}
	public void setC_OrderLine_ID(Integer c_OrderLine_ID) {
		C_OrderLine_ID = c_OrderLine_ID;
	}
	public boolean isIsSOTrx() {
		return IsSOTrx;
	}
	public void setIsSOTrx(boolean isSOTrx) {
		IsSOTrx = isSOTrx;
	}
	public String getM_Lot() {
		return m_Lot;
	}
	public void setM_Lot(String m_Lot) {
		this.m_Lot = m_Lot;
	}
	public Timestamp getM_GuaranteeDate() {
		return m_GuaranteeDate;
	}
	public void setM_GuaranteeDate(Timestamp m_GuaranteeDate) {
		this.m_GuaranteeDate = m_GuaranteeDate;
	}
	public Timestamp getLastdateInvoiced() {
		return LastdateInvoiced;
	}
	public void setLastdateInvoiced(Timestamp lastdateInvoiced) {
		LastdateInvoiced = lastdateInvoiced;
	}
	public BigDecimal getDiscount() {
		return Discount;
	}
	public void setDiscount(BigDecimal discount) {
		Discount = discount;
	}
	public void setDiscountAmt(BigDecimal value) {
		if (value == null)
			value = BigDecimal.ZERO;
		DiscountAmt = value;
	}
	public BigDecimal getDiscountAmt() {
		return DiscountAmt;
	}
	public BigDecimal getDiscount1() {
		return Discount1;
	}
	public void setDiscount1(BigDecimal discount1) {
		if (discount1 == null)
			discount1 = BigDecimal.ZERO;
		Discount1 = discount1;
	}
//	public BigDecimal getDiscount1Amt() {
//		return Discount1Amt;
//	}
//	public void setDiscount1Amt(BigDecimal discount1Amt) {
//		Discount1Amt = discount1Amt;
//	}
	public BigDecimal getDiscount2() {
		return Discount2;
	}
	public void setDiscount2(BigDecimal discount2) {
		if (discount2 == null)
			discount2 = BigDecimal.ZERO;
		Discount2 = discount2;
	}
//	public BigDecimal getDiscount2Amt() {
//		return Discount2Amt;
//	}
//	public void setDiscount2Amt(BigDecimal discount2Amt) {
//		Discount2Amt = discount2Amt;
//	}
	public BigDecimal getDiscount3() {
		return Discount3;
	}
	public void setDiscount3(BigDecimal discount3) {
		if (discount3 == null)
			discount3 = BigDecimal.ZERO;
		Discount3 = discount3;
	}
//	public BigDecimal getDiscount3Amt() {
//		return Discount3Amt;
//	}
//	public void setDiscount3Amt(BigDecimal discount3Amt) {
//		Discount3Amt = discount3Amt;
//	}
	public BigDecimal getDiscount4() {
		return Discount4;
	}
	public void setDiscount4(BigDecimal discount4) {
		if (discount4 == null)
			discount4 = BigDecimal.ZERO;
		Discount4 = discount4;
	}
//	public BigDecimal getDiscount4Amt() {
//		return Discount4Amt;
//	}
//	public void setDiscount4Amt(BigDecimal discount4Amt) {
//		Discount4Amt = discount4Amt;
//	}
	public BigDecimal getDiscountAcquire1() {
		return DiscountAcquire1;
	}
	public void setDiscountAcquire1(BigDecimal discountAcquire) {
		DiscountAcquire1 = discountAcquire;
	}
	public BigDecimal getFreight() {
		return Freight;
	}
	public void setFreight(BigDecimal freight) {
		Freight = freight;
	}
	public BigDecimal getPriceBase() {
		return PriceBase;
	}
	public void setPriceBase(BigDecimal priceBase) {
		PriceBase = priceBase;
	}
	public int getStdPrecision() {
		return StdPrecision;
	}
	public void setStdPrecision(int stdPrecision) {
		StdPrecision = stdPrecision;
	}
	public Integer getM_InOutLine_ID() {
		return M_InOutLine_ID;
	}
	public void setM_InOutLine_ID(Integer m_InOutLine_ID) {
		M_InOutLine_ID = m_InOutLine_ID;
	}   
	public String getM_WithholdingType() {
		return m_WithholdingType;
	}
	public void setM_WithholdingType(String m_WithholdingType) {
		this.m_WithholdingType = m_WithholdingType;
	}
	public boolean IsUpdatePrice() {
		return m_updatePrice; 
	}
	public void setIsUpdatePrice(boolean value) {
		m_updatePrice = value;
	}
}