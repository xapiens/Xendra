package org.xendra.transfer;

import java.math.BigDecimal;

import org.compiere.util.Env;

public class RowData {
	private Integer RowID = 0;
	private Integer M_Product_ID = 0;
	private int M_AttributeSet_ID = 0;
	private Boolean IsAttributeMandatory = false;
	private Boolean isStocked = false;
	public  Integer M_AttributeSetInstance_ID = 0;
	public  Integer M_Warehouse_ID = 0;
	public 	Integer M_WarehouseTo_ID = 0;
	public  Integer M_Locator_ID = 0;
	public  Integer M_LocatorTo_ID = 0;
	public  Integer C_UOM_ID = 0;
	public  String mProductBrand = "";
	public  String mProductBrandValue = "";
	private BigDecimal QtyEntered = BigDecimal.ZERO;
	private BigDecimal MovementQty = BigDecimal.ZERO;
	private Integer C_Currency_ID = 0;
	private String m_processMsg = null;
	private String m_DeliveryRule = "";
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
	public Integer getM_Warehouse_ID() {
		return M_Warehouse_ID;
	}
	public void setM_Warehouse_ID(Integer value) {
		M_Warehouse_ID = value;
	}
	public Integer getM_WarehouseTo_ID() {
		return M_WarehouseTo_ID;
	}
	public void setM_WarehouseTo_ID(Integer value) {
		M_WarehouseTo_ID = value;
	}
	public Integer getM_Locator_ID() {
		return M_Locator_ID;
	}
	public void setM_Locator_ID(Integer m_Locator_ID) {
		M_Locator_ID = m_Locator_ID;
	}
	public void setM_LocatorTo_ID(Integer value) {
		M_LocatorTo_ID = value;
	}
	public Integer getM_LocatorTo_ID() {
		return M_LocatorTo_ID;
	}
	public Integer getC_UOM_ID() {
		return C_UOM_ID;
	}
	public void setC_UOM_ID(Integer c_UOM_ID) {
		C_UOM_ID = c_UOM_ID;
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
	public BigDecimal getQtyEntered() {
		return QtyEntered;
	}
	public void setQtyEntered(BigDecimal qtyEntered) {
		QtyEntered = qtyEntered;
	}	
	public BigDecimal getMovementQty() {
		return MovementQty;
	}
	public void setMovementQty(BigDecimal movementQty) {
		MovementQty = movementQty;
	}
	public Integer getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_Currency_ID(Integer c_Currency_ID) {
		C_Currency_ID = c_Currency_ID;
	}
	public String getM_processMsg() {
		return m_processMsg;
	}
	public void setM_processMsg(String m_processMsg) {
		this.m_processMsg = m_processMsg;
	}
	public Boolean getIsStocked() {
		return isStocked;
	}
	public void setIsStocked(Boolean isStocked) {
		this.isStocked = isStocked;
	}
	public String getM_DeliveryRule() {
		return m_DeliveryRule;
	}
	public void setM_DeliveryRule(String m_DeliveryRule) {
		this.m_DeliveryRule = m_DeliveryRule;
	}
}
