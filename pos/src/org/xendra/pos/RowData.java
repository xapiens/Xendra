package org.xendra.pos;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.apps.ADialog;
import org.compiere.model.MTaxCategory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_TaxCategory;
import org.compiere.util.Env;

public class RowData {
	private Integer RowID = 0;
	private Integer M_Product_ID = 0;
	private String m_WithholdingType = "N";
	private Boolean Bonus = false;
	private Boolean Pack = false;
	private Boolean isStocked = false;
	private Boolean overWritePriceList = false;
	private Boolean EnforcePriceLimit = false;
	private Boolean IsReadOnlyPriceList = false;
	private int M_AttributeSet_ID = 0;
	private Boolean IsAttributeMandatory = false;
	public  Integer M_AttributeSetInstance_ID = 0;
	public  Integer Ref_AttributeSetInstance_ID = 0;
	private Integer AncientAttributeSetInstance_ID = 0;		
	public  Integer M_PriceList_ID = 0;
	public  Integer M_Warehouse_ID = 0;
	public  Integer M_Locator_ID = 0;
	public  Integer C_TaxCategory_ID = 0;
	public  Integer C_BPartner_ID = 0;
	public  Integer C_UOM_ID = 0;
	public  String mGroup = "";
	public  String mProductBrand = "";
	public  String mProductBrandValue = "";
	private Timestamp DateOrdered;
	private Timestamp DatePromised;
	private BigDecimal PriceList = Env.ZERO;
	private BigDecimal PriceActual = Env.ZERO;
	private BigDecimal PriceEntered = Env.ZERO;
	private BigDecimal PriceBase = Env.ZERO;
	private BigDecimal PriceLimit = Env.ZERO;
	private BigDecimal Gross = Env.ZERO;
	private BigDecimal QtyEntered = Env.ZERO; //Env.ZERO;
	private BigDecimal Total = Env.ZERO;
	private BigDecimal AncientAttributeSetInstanceQtyAvailable = Env.ZERO;
	private BigDecimal QtyOrdered = Env.ZERO;
	private Integer C_Currency_ID = 0;
	private Integer C_Tax_ID = 0;
	private Integer M_PriceListVersion_ID;
	private String m_processMsg = null;
	private boolean m_TaxIncluded;
	private String UOMConversion = "N";
	private String m_DeliveryRule = "";
	private int m_WindowNo;
	private  boolean changed = false;
	private Integer C_OrderLine_ID = 0;
	private boolean IsSOTrx = true;
	Integer M_InOutLine_ID = 0;
	private Integer C_CampaignBonus_ID = 0;
	private Integer C_CampaignDiscount_ID = 0;	
	private BigDecimal Discount = Env.ZERO;
	private BigDecimal DiscountAmt = Env.ZERO;	
	private BigDecimal Discount1 = Env.ZERO;
	private BigDecimal Discount1Amt = Env.ZERO;
	private BigDecimal Discount2 = Env.ZERO;
	private BigDecimal Discount2Amt = Env.ZERO;
	private BigDecimal Discount3 = Env.ZERO;
	private BigDecimal Discount3Amt = Env.ZERO;
	private BigDecimal Discount4 = Env.ZERO;
	private BigDecimal Discount4Amt = Env.ZERO;
	private int StdPrecision = 2;
	private BigDecimal m_QtyLostSales = Env.ZERO;
	private boolean isInvoicePrintDetails = false;
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
	public String getM_WithholdingType() {
		return m_WithholdingType;
	}
	public void setM_WithholdingType(String m_WithholdingType) {
		this.m_WithholdingType = m_WithholdingType;
	}
	public Boolean getBonus() {
		return Bonus;
	}
	public void setBonus(Boolean bonus) {
		Bonus = bonus;
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
	public Boolean getOverWritePriceList() {
		return overWritePriceList;
	}
	public void setOverWritePriceList(Boolean overWritePriceList) {
		this.overWritePriceList = overWritePriceList;
	}
	public Boolean getEnforcePriceLimit() {
		return EnforcePriceLimit;
	}
	public void setEnforcePriceLimit(Boolean enforcePriceLimit) {
		EnforcePriceLimit = enforcePriceLimit;
	}
	public Boolean getIsReadOnlyPriceList() {
		return IsReadOnlyPriceList;
	}
	public void setIsReadOnlyPriceList(Boolean isReadOnlyPriceList) {
		IsReadOnlyPriceList = isReadOnlyPriceList;
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
	public Integer getRef_AttributeSetInstance_ID() {
		return Ref_AttributeSetInstance_ID;
	}
	public void setRef_AttributeSetInstance_ID(Integer ref_AttributeSetInstance_ID) {
		Ref_AttributeSetInstance_ID = ref_AttributeSetInstance_ID;
	}
	public Integer getAncientAttributeSetInstance_ID() {
		return AncientAttributeSetInstance_ID;
	}
	public void setAncientAttributeSetInstance_ID(
			Integer ancientAttributeSetInstance_ID) {
		AncientAttributeSetInstance_ID = ancientAttributeSetInstance_ID;
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
	public Timestamp getDatePromised() {
		return DatePromised;
	}
	public void setDatePromised(Timestamp datePromised) {
		DatePromised = datePromised;
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
	public BigDecimal getPriceBase() {
		return PriceBase;
	}
	public void setPriceBase(BigDecimal priceBase) {
		PriceBase = priceBase;
	}
	public BigDecimal getPriceLimit() {
		return PriceLimit;
	}
	public void setPriceLimit(BigDecimal priceLimit) {
		PriceLimit = priceLimit;
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
	public BigDecimal getAncientAttributeSetInstanceQtyAvailable() {
		return AncientAttributeSetInstanceQtyAvailable;
	}
	public void setAncientAttributeSetInstanceQtyAvailable(
			BigDecimal ancientAttributeSetInstanceQtyAvailable) {
		AncientAttributeSetInstanceQtyAvailable = ancientAttributeSetInstanceQtyAvailable;
	}
	public BigDecimal getQtyOrdered() {
		return QtyOrdered;
	}
	public void setQtyOrdered(BigDecimal qtyOrdered) {
		QtyOrdered = qtyOrdered;
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
	public String getM_processMsg() {
		return m_processMsg;
	}
	public void setM_processMsg(String m_processMsg) {
		this.m_processMsg = m_processMsg;
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
	public String getM_DeliveryRule() {
		return m_DeliveryRule;
	}
	public void setM_DeliveryRule(String m_DeliveryRule) {
		this.m_DeliveryRule = m_DeliveryRule;
	}
	public int getM_WindowNo() {
		return m_WindowNo;
	}
	public void setM_WindowNo(int m_WindowNo) {
		this.m_WindowNo = m_WindowNo;
	}
	public boolean isChanged() {
		return changed;
	}
	public void setChanged(boolean changed) {
		this.changed = changed;
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
	public Integer getM_InOutLine_ID() {
		return M_InOutLine_ID;
	}
	public void setM_InOutLine_ID(Integer m_InOutLine_ID) {
		M_InOutLine_ID = m_InOutLine_ID;
	}
	public Integer getC_CampaignBonus_ID() {
		return C_CampaignBonus_ID;
	}
	public void setC_CampaignBonus_ID(Integer c_CampaignBonus_ID) {
		C_CampaignBonus_ID = c_CampaignBonus_ID;
	}
	public Integer getC_CampaignDiscount_ID() {
		return C_CampaignDiscount_ID;
	}
	public void setC_CampaignDiscount_ID(Integer c_CampaignDiscount_ID) {
		C_CampaignDiscount_ID = c_CampaignDiscount_ID;
	}
	public BigDecimal getDiscount() {
		return Discount;
	}
	public void setDiscount(BigDecimal discount) {
		Discount = discount;
	}
	public BigDecimal getDiscountAmt() {
		return DiscountAmt;
	}
	public void setDiscountAmt(BigDecimal discountAmt) {
		DiscountAmt = discountAmt;
	}
	public BigDecimal getDiscount1() {
		return Discount1;
	}
	public void setDiscount1(BigDecimal discount1) {
		Discount1 = discount1;
	}
	public BigDecimal getDiscount1Amt() {
		return Discount1Amt;
	}
	public void setDiscount1Amt(BigDecimal discount1Amt) {
		Discount1Amt = discount1Amt;
	}
	public BigDecimal getDiscount2() {
		return Discount2;
	}
	public void setDiscount2(BigDecimal discount2) {
		Discount2 = discount2;
	}
	public BigDecimal getDiscount2Amt() {
		return Discount2Amt;
	}
	public void setDiscount2Amt(BigDecimal discount2Amt) {
		Discount2Amt = discount2Amt;
	}
	public BigDecimal getDiscount3() {
		return Discount3;
	}
	public void setDiscount3(BigDecimal discount3) {
		Discount3 = discount3;
	}
	public BigDecimal getDiscount3Amt() {
		return Discount3Amt;
	}
	public void setDiscount3Amt(BigDecimal discount3Amt) {
		Discount3Amt = discount3Amt;
	}
	public BigDecimal getDiscount4() {
		return Discount4;
	}
	public void setDiscount4(BigDecimal discount4) {
		Discount4 = discount4;
	}
	public BigDecimal getDiscount4Amt() {
		return Discount4Amt;
	}
	public void setDiscount4Amt(BigDecimal discount4Amt) {
		Discount4Amt = discount4Amt;
	}
	public int getStdPrecision() {
		return StdPrecision;
	}
	public void setStdPrecision(int stdPrecision) {
		StdPrecision = stdPrecision;
	}
	public BigDecimal getM_QtyLostSales() {
		return m_QtyLostSales;
	}
	public void setM_QtyLostSales(BigDecimal m_QtyLostSales) {
		this.m_QtyLostSales = m_QtyLostSales;
	}
	public boolean isInvoicePrintDetails() {
		return isInvoicePrintDetails;
	}
	public void setInvoicePrintDetails(boolean isInvoicePrintDetails) {
		this.isInvoicePrintDetails = isInvoicePrintDetails;
	}	
}
