package org.xendra.transfer;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.compiere.model.MLocator;
import org.compiere.model.MProduct;
import org.compiere.model.persistence.X_M_MovementLine;
import org.compiere.util.CCache;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.objectview.RowBase;

public class Row extends RowBase  {
	private static CCache<Integer,BigDecimal>	s_qtyavailable = new CCache<Integer,BigDecimal>("QtyAvailable", 1, 1);	//	2h
	private String Value;
	private String Name;
	//private Integer M_Locator_ID = 0;
	//private Integer M_LocatorTo_ID = 0;
	private Integer m_WindowNo;
	private Integer RowID = 0;
	//private Integer M_Product_ID = 0;
	//private Integer M_Warehouse_ID = 0;
	//private Integer M_WarehouseTo_ID = 0;
	//private int M_AttributeSet_ID = 0;
	//private Boolean isStocked = false;
	//private String UOMConversion = "N";
	//private BigDecimal MovementQty = Env.ZERO;
	//private BigDecimal QtyEntered = Env.ZERO;
	//private Integer C_UOM_ID = 0;
	//private Boolean IsAttributeMandatory = false;
	//public  Integer M_AttributeSetInstance_ID = 0;
	//public  Integer Ref_AttributeSetInstance_ID = 0;	
	private RowData m_rowdata = new RowData();
	private MProduct m_Product;
	private CTransferWarehouse m_TransferPanel;
	
	
	public void setM_AttributeSetInstance_ID(Integer pM_AttributeSetInstance_ID) {
		setField(X_M_MovementLine.COLUMNNAME_M_AttributeSetInstance_ID, pM_AttributeSetInstance_ID);
//		if (pM_AttributeSetInstance_ID == null)
//			return;
//		if (M_AttributeSetInstance_ID.compareTo(pM_AttributeSetInstance_ID) != 0)
//		{
//			M_AttributeSetInstance_ID = pM_AttributeSetInstance_ID;
//			Ref_AttributeSetInstance_ID = DB.getSQLValue(null, "SELECT Ref_AttributeSetInstance_ID FROM M_AttributeSetInstance WHERE M_AttributeSetInstance_ID = ? ", pM_AttributeSetInstance_ID);
//			//qty("M_AttributeSetInstance_ID", BigDecimal.valueOf(pM_AttributeSetInstance_ID));
//		}
	}   
	
	public Integer getM_AttributeSetInstance_ID() {
		return m_rowdata.getM_AttributeSetInstance_ID();
	}
	
//	public Boolean product (String name, Object value)
//	{
//		M_Product_ID = (Integer)value;
//		if (M_Product_ID == null || M_Product_ID.intValue() == 0)
//			return false;
//			
//		/*****	Price Calculation see also qty	****/
//		BigDecimal Qty = this.MovementQty;
//		Env.setContext(Env.getCtx(), getWindowNo(), "M_Product_ID", M_Product_ID);
//		MProduct product = MProduct.get (Env.getCtx(), M_Product_ID.intValue());
//		Value = product.getValue();
//		Name = product.getName();
//		C_UOM_ID = product.getC_UOM_Order_ID();
//		isStocked = product.isStocked();
//		M_AttributeSet_ID = product.getM_AttributeSet_ID();
//		if (M_AttributeSet_ID != 0) {
//			MAttributeSet mas = MAttributeSet.get(Env.getCtx(),	M_AttributeSet_ID);
//			if (mas != null	&& mas.isMandatory())  {
//				IsAttributeMandatory = true;
//			}
//		}
//		if (isStocked)
//		{
//			createAttribute();
//		}
//		//
//		return true;
//	}
	
//	public void createAttribute() {
//		if (M_AttributeSetInstance_ID == 0 && MovementQty.compareTo(Env.ZERO) > 0 && IsAttributeMandatory)
//		{
//			Integer new_AttributeSetInstance_ID = DB.getSQLValue(null, "SELECT * FROM getancientattributesetinstance(?, ?, ?, ?)", M_Warehouse_ID, M_Product_ID, MovementQty, Env.getAD_Org_ID(Env.getCtx()));
//			if (new_AttributeSetInstance_ID > 0 )
//				M_AttributeSetInstance_ID = new_AttributeSetInstance_ID;
//		}
//	}
	public Integer getM_Warehouse_ID() {
		return m_rowdata.getM_Warehouse_ID();
		//return M_Warehouse_ID;
	}
	public void setM_Warehouse_ID(Integer value) {
		m_rowdata.setM_Warehouse_ID(value);
	    //M_Warehouse_ID = value;
	}	
	public Integer getM_WarehouseTo_ID() {
		return m_rowdata.getM_WarehouseTo_ID();
		//return M_WarehouseTo_ID;
	}
	public void setM_WarehouseTo_ID(Integer value) {
		m_rowdata.setM_WarehouseTo_ID(value);
		//M_WarehouseTo_ID = value;
	}	
	public void setWindowNo(int mWindowNo) {
		  m_WindowNo = mWindowNo;
	}
	public Integer getWindowNo() {
		return m_WindowNo;
	}
	
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}	
	public String getName() {
		if (m_Product == null)
			return "";
		return m_Product.getName(); 
	}
	public void setName(String name) {
		//Name = name;
	}
	public Integer getM_Locator_ID() {
		return m_rowdata.getM_Locator_ID();
		//return M_Locator_ID;
	}
	public void setM_Locator_ID(Integer value) {
		if (value == null)
			return;
		m_rowdata.setM_Locator_ID(value);
		MLocator locator = MLocator.get(Env.getCtx(), value);
		//M_Locator_ID = mLocatorID;
		//M_Warehouse_ID = MLocator.get(Env.getCtx(), M_Locator_ID).getM_Warehouse_ID();
		m_rowdata.setM_Warehouse_ID(locator.getM_Warehouse_ID());
	}
	public Integer getM_LocatorTo_ID() {
		return m_rowdata.getM_LocatorTo_ID();
	}
	public void setM_LocatorTo_ID(Integer value) {
		m_rowdata.setM_LocatorTo_ID(value);
	}
	public Integer getM_Product_ID() {
		return m_rowdata.getM_Product_ID();
	}
	public void setM_Product_ID(Integer mProductID) {
		if (mProductID == null)
			return;
		m_rowdata.setM_Product_ID(mProductID);   		
		//M_Product_ID = mProductID;
	}
	public BigDecimal getMovementQty() {
		return m_rowdata.getMovementQty();
	}
	public void setMovementQty(BigDecimal value) {
		m_rowdata.setMovementQty(value);
	}	
	public BigDecimal getQtyEntered() {
		return m_rowdata.getQtyEntered();
	}
	public void setQtyEntered(BigDecimal value) {
		setField(X_M_MovementLine.COLUMNNAME_QtyEntered,value);
//		if (qtyEntered == null)
//			return;
//		if ( QtyEntered.compareTo(qtyEntered) != 0)
//		{
//			BigDecimal oQtyEntered = QtyEntered;
//			BigDecimal oMovementQty = MovementQty;
//			if ( qty ("QtyEntered", qtyEntered))
//			{
//				if (!IsAttributeOK())
//					createAttribute();
//				changed = true;
//			}
//			else
//			{
//				QtyEntered = oQtyEntered;
//				MovementQty = oMovementQty;
//			}			
//		}		
	}
	public Integer getC_UOM_ID() {
		return m_rowdata.getC_UOM_ID();	
		//return C_UOM_ID;
	}
	public void setC_UOM_ID(Integer value) {
		setField(X_M_MovementLine.COLUMNNAME_C_UOM_ID, value);
//		if (cUOMID == null)
//			return;
//		if (C_UOM_ID.compareTo(cUOMID) != 0)
//		{
//			Integer oC_UOM_ID = C_UOM_ID;
//			C_UOM_ID = cUOMID;
//			if (qty("C_UOM_ID", Env.ZERO) )
//				changed = true;
//			else
//			{
//				C_UOM_ID = oC_UOM_ID;
//				QtyEntered = Env.ZERO;
//				MovementQty = Env.ZERO;
//			}
//		}
//		C_UOM_ID = cUOMID;
//		;
	}
	
//	public boolean qty(String name, BigDecimal qty) {
//		if (name == "C_UOM_ID")
//		{
//			int C_UOM_To_ID = C_UOM_ID;
//			BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
//			if (QtyEntered.compareTo(QtyEntered1) != 0)
//			{
//				QtyEntered = QtyEntered1;
//			}
//			MovementQty = MUOMConversion.convertProductFrom (Env.getCtx(), M_Product_ID, 
//					C_UOM_To_ID, QtyEntered);
//			if (MovementQty == null)
//				MovementQty = QtyEntered;
//			boolean conversion = QtyEntered.compareTo(MovementQty) != 0;
//		}
//		else if (name == "QtyEntered")
//		{
//			int C_UOM_To_ID = C_UOM_ID;
//			QtyEntered = qty;
//			BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(Env.getCtx(), C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
//			if (QtyEntered.compareTo(QtyEntered1) != 0)
//			{
//				QtyEntered = QtyEntered1;
//			}
//			MovementQty = MUOMConversion.convertProductFrom(Env.getCtx(), M_Product_ID, C_UOM_To_ID, QtyEntered);
//			if (MovementQty == null)
//				MovementQty = QtyEntered;
//			boolean conversion = QtyEntered.compareTo(MovementQty) != 0;
//			UOMConversion = conversion ? "Y" : "N";
//		}
//		return checkAvailable();
//	}
//	
//	private boolean checkAvailable() {
//		
//		BigDecimal available = MStorage.getQtyAvailable	(M_Warehouse_ID, 0,M_Product_ID.intValue(), M_AttributeSetInstance_ID, Ref_AttributeSetInstance_ID, null);
//		if (available == null)
//			available = Env.ZERO;
//		if (available.signum() == 0) 
//		{
//			m_processMsg = "NoQtyAvailable";
//			return false;
//		}
//		else if (available.compareTo(MovementQty) < 0) 
//		{	
//			m_processMsg = "InsufficientQtyAvailable";
//			return false;
//		}
//		return true;
//	}
//	
//	public BigDecimal getQtyAvailable() {
//		BigDecimal CurrentQty = Env.ZERO;
//		StringBuffer sb = new StringBuffer();
//		sb.append("SELECT bomQtyAvailable(p.M_Product_ID,?,0)");
//		sb.append(" FROM m_product p where p.M_Product_ID = ?");
//		PreparedStatement pstmt = DB.prepareStatement(sb.toString(), null);
//		try {		
//			pstmt.setInt(1, M_Warehouse_ID);
//			pstmt.setInt(2, M_Product_ID );
//			ResultSet rs = pstmt.executeQuery();
//			
//			if (rs.next())
//			{
//				CurrentQty = rs.getBigDecimal(1);
//			}
//			rs.close();
//			pstmt.close();
//			pstmt = null;			
//		} catch (SQLException e) {	
//			e.printStackTrace();
//		}	
//		return CurrentQty;
//	}
	
//	public boolean IsAttributeOK()
//	{
//		if (IsAttributeMandatory && this.M_AttributeSetInstance_ID == 0)
//			return false;
//		else
//			return true;
//	}
	
	public Integer getRowID() 							{	return RowID;  }
	public void setRowID(Integer pRowID) 				{	RowID = pRowID;  }
//	public Integer getRef_AttributeSetInstance_ID() {
//		return Ref_AttributeSetInstance_ID;
//	}
	public void updateRow() {
		m_TransferPanel.updateRow(this);
		m_TransferPanel.executerules(null, "row");
	}
	public void setTransferPanel(CTransferWarehouse transferPanel) {
		m_TransferPanel = transferPanel;
	}
	public RowData getRowData()
	{
		return m_rowdata;
	}		

	public MProduct getProduct()
	{
		if (m_Product == null && getM_Product_ID() != 0)
			m_Product =  MProduct.get (Env.getCtx(), getM_Product_ID(), null);
		return m_Product;
	}	//	getProduct

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
		CurrentQty = CurrentQty.subtract(this.getMovementQty());
		return CurrentQty;
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
		setField(X_M_MovementLine.COLUMNNAME_M_Product_ID, product.getM_Product_ID());
		return true;
	}	//	product
}
