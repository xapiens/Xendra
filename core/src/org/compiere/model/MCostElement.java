/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_M_CostElement;
import org.compiere.model.reference.REF_M_CostElementType;
import org.compiere.model.reference.REF_C_AcctSchemaCostingMethod;
import org.compiere.util.*;

/**
 * 	Cost Element Model
 *  @author Jorg Janke
 *  redesigned by xapiens
 *  @version $Id: MCostElement.java 5721 2016-01-02 23:13:51Z xapiens $
 */
public class MCostElement extends X_M_CostElement
{
	/**
	 * 	Get Material Cost Element or create it
	 *	@param po parent
	 *	@param CostingMethod method
	 *	@return cost element
	 */
	public static MCostElement getMaterialCostElement (PO po, String CostingMethod)
	{
		if (CostingMethod == null || CostingMethod.length() == 0)
		{
			s_log.severe("No CostingMethod");
			return null;
		}
		//
		MCostElement retValue = null;
		String sql = "SELECT * FROM M_CostElement WHERE AD_Client_ID=? AND CostingMethod=? ORDER BY AD_Org_ID";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, po.get_TrxName());
			pstmt.setInt (1, po.getAD_Client_ID());
			pstmt.setString(2, CostingMethod);
			ResultSet rs = pstmt.executeQuery ();
			boolean n = rs.next(); //jz to fix DB2 resultSet closed problem
			if (n)
				retValue = new MCostElement (po.getCtx(), rs, po.get_TrxName());
			if (n && rs.next())
				s_log.warning("More then one Material Cost Element for CostingMethod=" + CostingMethod);
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		if (retValue != null)
			return retValue;
		
		//	Create New
		retValue = new MCostElement (po.getCtx(), 0, po.get_TrxName());
		retValue.setClientOrg(po.getAD_Client_ID(), 0);
		String name = MRefList.getListName(po.getCtx(), REF_C_AcctSchemaCostingMethod.Identifier, CostingMethod); // ERROR: column reference "name" is ambiguous
		if (name == null || name.length() == 0)
			name = CostingMethod;
		retValue.setName(name);
		retValue.setCostElementType(REF_M_CostElementType.Material);
		retValue.setCostingMethod(CostingMethod);
		retValue.save();
		//
		return retValue;
	}	//	getMaterialCostElement

	/**
	 * 	Get first Material Cost Element
	 *	@param ctx context
	 *	@param CostingMethod costing method
	 *	@return Cost Element or null
	 */
	public static Integer getCostElementID(Properties ctx, String CostingMethod)
	{
		Integer ID = 0;
		MCostElement costelement = null;
		String whereClause = "AD_Client_ID=? AND CostingMethod=?   ";
		try {
			costelement = new Query(Env.getCtx(), MCostElement.Table_Name, whereClause, null)
			.setParameters(Env.getAD_Client_ID(ctx), CostingMethod )
			.firstOnly();				
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, "MCostElement.getMaterialCostElement" , e);
		}
		if (costelement != null)
		{
			ID = costelement.getM_CostElement_ID();
		}
		return ID;
	}	//	getMaterialCostElement
	
	
	/**
	 * 	Get active Material Cost Element for client 
	 *	@param po parent
	 *	@return cost element array
	 */
	public static MCostElement[] getCostingMethods (Properties ctx, Integer AD_Client_ID, String trxName)
	{
		ArrayList<MCostElement> list = new ArrayList<MCostElement>();
		String sql = "SELECT * FROM M_CostElement "
			+ "WHERE AD_Client_ID=?"
			+ " AND IsActive='Y' AND CostElementType='M' AND CostingMethod IS NOT NULL";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, AD_Client_ID);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add(new MCostElement (ctx, rs, trxName));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		//
		MCostElement[] retValue = new MCostElement[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	getMaterialCostElement

	// MZ Goodwill
	/**
	 * 	Get active non Material Cost Element for client 
	 *	@param po parent
	 *	@return cost element array
	 */
	public static MCostElement[] getNonCostingMethods (PO po)
	{
		ArrayList<MCostElement> list = new ArrayList<MCostElement>();
		String sql = "SELECT * FROM M_CostElement "
			+ "WHERE AD_Client_ID=?"
			+ " AND IsActive='Y' AND CostingMethod IS NULL";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, po.get_TrxName());
			pstmt.setInt (1, po.getAD_Client_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add(new MCostElement (po.getCtx(), rs, po.get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		//
		MCostElement[] retValue = new MCostElement[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	getMaterialCostElement
	// end MZ
	
	/**
	 * 	Get Cost Element from Cache
	 *	@param ctx context
	 *	@param M_CostElement_ID id
	 *	@return Cost Element
	 */
	public static MCostElement get (Properties ctx, int M_CostElement_ID)
	{
		Integer key = new Integer (M_CostElement_ID);
		MCostElement retValue = (MCostElement) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MCostElement (ctx, M_CostElement_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	} //	get

	/**	Cache						*/
	private static CCache<Integer,MCostElement>	s_cache	= new CCache<Integer,MCostElement>("M_CostElement", 20);
	
	/**	Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MCostElement.class);
	

	public Integer m_AD_Table_ID = 0;
	public Integer m_Record_ID = 0;

	private String m_error;
	
	private SimpleDateFormat m_dateFormat = DisplayType.getDateFormat(DisplayType.Date, Env.getLanguage(Env.getCtx()),"yyyy-MM-dd");
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_CostElement_ID id
	 *	@param trxName trx
	 */
	public MCostElement (Properties ctx, int M_CostElement_ID, String trxName)
	{
		super (ctx, M_CostElement_ID, trxName);
		if (M_CostElement_ID == 0)
		{
		//	setName (null);
			setCostElementType (REF_M_CostElementType.Material);
			setIsCalculated (false);
		}
	}	//	MCostElement

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName trx
	 */
	public MCostElement (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MCostElement
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Check Unique Costing Method
		if (REF_M_CostElementType.Material.equals(getCostElementType())
			&& (newRecord || is_ValueChanged("CostingMethod")))
		{
			String sql = "SELECT  COALESCE(MAX(M_CostElement_ID),0) FROM M_CostElement "
				+ "WHERE AD_Client_ID=? AND CostingMethod=?";
			int id = DB.getSQLValue(get_TrxName(), sql, getAD_Client_ID(), getCostingMethod());
			if (id > 0 && id != get_ID())
			{
				log.saveError("AlreadyExists", Msg.getElement(getCtx(), "CostingMethod"));
				return false;
			}
		}

		//	Maintain Calclated
		if (REF_M_CostElementType.Material.equals(getCostElementType()))
		{
			String cm = getCostingMethod();
			if (cm == null || cm.length() == 0
				|| REF_C_AcctSchemaCostingMethod.StandardCosting.equals(cm))
				setIsCalculated(false);
			else
				setIsCalculated(true);
		}
		else
		{
			if (isCalculated())
				setIsCalculated(false);
			if (getCostingMethod() != null)
				setCostingMethod(null);
		}
		
		if (getAD_Org_ID() != 0)
			setAD_Org_ID(0);
		return true;
	}	//	beforeSave
	
	/**
	 * 	Before Delete
	 *	@return true if can be deleted
	 */
	protected boolean beforeDelete ()
	{
		String cm = getCostingMethod();
		if (cm == null
			|| !REF_M_CostElementType.Material.equals(getCostElementType()))
			return true;
		
		//	Costing Methods on AS level
		MAcctSchema[] ass = MAcctSchema.getClientAcctSchema(getCtx(), getAD_Client_ID());
		for (int i = 0; i < ass.length; i++)
		{
			if (ass[i].getCostingMethod().equals(getCostingMethod()))
			{
				log.saveError("CannotDeleteUsed", Msg.getElement(getCtx(), "C_AcctSchema_ID") 
					+ " - " + ass[i].getName());
				return false;
			}
		}
		
		//	Costing Methods on PC level
		String sql = "SELECT M_Product_Category_ID FROM M_Product_Category_Acct WHERE AD_Client_ID=? AND CostingMethod=?";
		int M_Product_Category_ID = 0;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, getAD_Client_ID());
			pstmt.setString (2, getCostingMethod());
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				M_Product_Category_ID = rs.getInt(1);
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		if (M_Product_Category_ID != 0)
		{
			log.saveError("CannotDeleteUsed", Msg.getElement(getCtx(), "M_Product_Category_ID") 
				+ " (ID=" + M_Product_Category_ID + ")");
			return false;
		}
		return true;
	}	//	beforeDelete
	
	/**
	 * 	Is this a Costing Method
	 *	@return true if not Material cost or no costing method.
	 */
	public boolean isCostingMethod()
	{
		return REF_M_CostElementType.Material.equals(getCostElementType())
			&& getCostingMethod() != null;
	}	//	isCostingMethod
	
	/**
	 * 	Is Avg Invoice Costing Method
	 *	@return true if AverageInvoice
	 */
	public boolean isAverageInvoice()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.AverageInvoice)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isAverageInvoice
	
	/**
	 * 	Is Avg PO Costing Method
	 *	@return true if AveragePO
	 */
	public boolean isAveragePO()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.AveragePO)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isAveragePO
	
	/**
	 * 	Is Avg Warehouse Costing Method
	 *	@return true if AverageWarehouse
	 */
	public boolean isAverageWarehouse()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.AverageWarehouse)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isAverageWarehouse
	
	/**
	 * 	Is FiFo Costing Method
	 *	@return true if Fifo
	 */
	public boolean isFifo()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.Fifo)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isFifo
	/**
	 * 	Is Last Invoice Costing Method
	 *	@return true if LastInvoice
	 */
	public boolean isLastInvoice()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.LastInvoice)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isLastInvoice
	/**
	 * 	Is Last PO Costing Method
	 *	@return true if LastPOPrice
	 */
	public boolean isLastPOPrice()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.LastPOPrice)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isLastPOPrice
	/**
	 * 	Is LiFo Costing Method
	 *	@return true if Lifo
	 */
	public boolean isLifo()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.Lifo)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isLiFo
	/**
	 * 	Is Std Costing Method
	 *	@return true if StandardCosting
	 */
	public boolean isStandardCosting()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.StandardCosting)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isStandardCosting
	/**
	 * 	Is User Costing Method
	 *	@return true if User Defined
	 */
	public boolean isUserDefined()
	{
		String cm = getCostingMethod();
		return cm != null 
			&& cm.equals(REF_C_AcctSchemaCostingMethod.UserDefined)
			&& REF_M_CostElementType.Material.equals(getCostElementType());
	}	//	isAveragePO
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MCostElement[");
		sb.append (get_ID ())
			.append ("-").append (getName())
			.append(",Type=").append(getCostElementType())
			.append(",Method=").append(getCostingMethod())
			.append ("]");
		return sb.toString ();
	} //	toString

	// 
	public final BigDecimal getCostForProduct(int client_id, int org_id,
			int product_id, final Timestamp movementdate,
			boolean allwaysReturnLast, boolean inputCost, boolean isReturn, String trxName) {
		return getCostForProduct(client_id, org_id,
				product_id, movementdate,
				allwaysReturnLast, inputCost, isReturn, 0, trxName);
	}
	
	/**
	 * Get the current cost for the product on an specified date for an specific
	 * costing method.
	 * 
	 * @param client_id
	 *            the client id
	 * @param product_id
	 *            the product id
	 * @param org_id
	 *            The organization id
	 * @param movementdate
	 *            the movement date to check
	 * @param allwaysReturnLast
	 *            usually for reports only , if its true , the method allways
	 *            return the last calculated cost for movements which date are
	 *            greater than the last calculated.
	 * @param inputCost
	 * 			  is an Input Cost
	 * @param isReturn
	 * 			  is a return
	 * @param Line
	 * 			  line
	 * @param trxName
	 *            transaction name if null out of global transaction.
	 * 
	 * @return a BigDecimal with : -1 If the product is not costable -2 Exist
	 *         invalid costs previos to the required date -3 Existing pending
	 *         movements to calculate after the required date or the treuired
	 *         date is out of the claculated range. -4 No costs generated -5 No
	 *         cost element defined for average cost. 0 No se han calculado cost
	 *         for the required date and product , by example the required date
	 *         is lesser than min calculated date. Or the real cost is zero > 0
	 *         The cost for the specified date and product..
	 * 
	 * @throws InvalidArgumentException
	 *             if no costing method defined or costing method not supported.
	 */
	public final BigDecimal getCostForProduct(int client_id, int org_id,
			int product_id, final Timestamp movementdate,
			boolean allwaysReturnLast, boolean inputCost, boolean isReturn,int line, String trxName) {
		BigDecimal cost = Env.ZERO;
		m_error = "";
		if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.AveragePO)) {
			// for inputs is used the real input cost , not the average cost.			
			if (inputCost) {
				cost = getavgCostForProductInput(client_id, org_id, product_id, line, trxName);	
			} else {
				cost = getAverageCostForProduct(client_id, org_id, product_id, movementdate, allwaysReturnLast, trxName);
			}
			if (cost == null)
				cost = Env.ZERO;
			if (isReturn && cost.compareTo(Env.ZERO) <= 0)
			{
				// busquemos entre fechas 
				cost = getAverageCostReferencial(client_id, product_id, movementdate, trxName);
			}
			if (isReturn && cost.compareTo(Env.ZERO) <= 0)
			{
				MProduct p = MProduct.get(Env.getCtx(), product_id, trxName);
				m_error = product_id+"-"+p.getValue();
				m_error += "-" + p.getName();
				m_error += " es un retorno con fecha " + m_dateFormat.format(movementdate);
				m_error += " y no existe su costo en el sistema.";
			}
		}
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.StandardCosting)) 
			m_error = "costo Standard no disponible";
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.Lifo)) 
			m_error = "costo Lifo no disponible";
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.Lifo)) 
			m_error = "costo Lifo no disponible";
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.Fifo))
			m_error = "costo Fifo no disponible";
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.AverageInvoice))
			m_error = "costo Average Invoice no disponible";
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.LastInvoice))
			m_error = "costo Last Invoice no disponible";
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.UserDefined))
			m_error = "costo User Defined no disponible";
		else if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.AverageWarehouse))
			m_error = "costo Average Almacen no disponible";
		return cost;
	}
	
	private BigDecimal getAverageCostReferencial(int client_id, int product_id, Timestamp movementdate, String trxName) {
		BigDecimal cost = DB.getSQLValueBD(trxName, "SELECT getaveragecostreference(?,?,?,?)",client_id, getM_CostElement_ID(),  product_id, movementdate );
		return cost;
	}

	public String getLastCostError()
	{
		return m_error;
	}

	/**
	 * Get the current  cost for the product on an specified date, in case
	 * the movement is an input movement.
	 * The aerage cost is for sell products not for buyed products.
	 * 
	 * @param client_id
	 *            the client id
	 * @param org_id
	 *            the org id
	 * @param product_id
	 *            the product id
	 * @param movementdate
	 *            the movement date to check
	 * @param trxName
	 *            transaction name if null out of global transaction.
	 * 
	 * @return a BigDecimal with : -1 If the product is not costable -2 Exist
	 *         invalid costs previos to the required date -3 Existing pending
	 *         movements to calculate after the required date or the treuired
	 *         date is out of the claculated range. -4 No costs generated -5 No
	 *         cost element defined for average cost. 0 No se han calculado cost
	 *         for the required date and product , by example the required date
	 *         is lesser than min calculated date. Or the real cost is zero > 0
	 *         The cost for the specified date and product..
	 * 
	 */
	private final BigDecimal getavgCostForProductInput(int client_id, int org_id,  int product_id, int line, String trxName) {
		// solo hace un select incost from m_costcalc con los parametros.
		// Identifier=1257af5b-e8bd-bf89-4fad-1dcd4ea23592
		BigDecimal cost = DB.getSQLValueBD(trxName, "SELECT getavgcostforProductInput(?,?,?,?,?,?,?)",client_id, org_id, getM_CostElement_ID(),  product_id, line, getAD_Table_ID(), getRecord_ID());
		return cost;
	}
	
	/**
	 * Get the current AVERAGE cost for the product on an specified date.
	 * 
	 * @param client_id
	 *            the client id
	 * @param org_id
	 *            the org id
	 * @param product_id
	 *            the product id
	 * @param movementdate
	 *            the movement date to check
	 * @param allwaysReturnLast
	 *            usually for reports only , if its true , the method allways
	 *            return the last calculated cost for movements which date are
	 *            greater than the last calculated.
	 * @param trxName
	 *            transaction name if null out of global transaction.
	 * 
	 * @return a BigDecimal with : -1 If the product is not costable -2 Exist
	 *         invalid costs previos to the required date -3 Existing pending
	 *         movements to calculate after the required date or the treuired
	 *         date is out of the claculated range. -4 No costs generated -5 No
	 *         cost element defined for average cost. 0 No se han calculado cost
	 *         for the required date and product , by example the required date
	 *         is lesser than min calculated date. Or the real cost is zero > 0
	 *         The cost for the specified date and product..
	 * @throws SQLException 
	 * 
	 */
	private  BigDecimal getAverageCostForProduct(int client_id,
			int org_id, int product_id, final Timestamp movementdate,
			boolean alwaysReturnLast, String trxName) {
		BigDecimal cost = BigDecimal.ZERO;
		CallableStatement stmt = null;
		try {
			stmt = DB.prepareCall("{ ?= call getAverageCost(?,?,?,?,?) }", ResultSet.CONCUR_READ_ONLY, trxName);
			stmt.setInt(2, client_id);
			stmt.setInt(3, getM_CostElement_ID());
			stmt.setInt(4, product_id);
			stmt.setTimestamp(5, movementdate);
			stmt.setBoolean(6, alwaysReturnLast);
			stmt.registerOutParameter(1, java.sql.Types.NUMERIC);
			stmt.execute();
			cost = stmt.getBigDecimal(1); 
			if (cost.compareTo(BigDecimal.ZERO) == 0)
			{
				stmt = DB.prepareCall("{ ?= call getcostmsg(?,?,?,?,?) }", ResultSet.CONCUR_READ_ONLY, trxName);
				stmt.registerOutParameter(1, java.sql.Types.CHAR);
				stmt.setInt(2, client_id);
				stmt.setInt(3, getM_CostElement_ID());
				stmt.setInt(4, product_id);
				stmt.setTimestamp(5, movementdate);
				stmt.setBoolean(6, alwaysReturnLast);
				stmt.execute();				
				String error =  stmt.getString(1);
				if (error.length() > 0)
				{
					MProduct product = MProduct.get(Env.getCtx(), product_id, null);
					m_error = String.format("%s %s", error, product);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return cost;
	}

	/**
	 * Invalidate the calculated cost for a product that involve the movements
	 * by the date required.
	 * 
	 * 
	 * @param table_id
	 * @param record_id
	 * 
	 * @return an int with the current cost calc id invalidated or 0 if doesnt
	 *         exist nothing to invalidate or -5 if no exist costing method
	 *         defined for average cost.
	 */
//	public final int invalidateCostForProduct(int table_id, int record_id,int product_id, String trxName) {
//
//		int calc_id = invalidateAverageCostForProduct(table_id, record_id , product_id, trxName);
//		return calc_id;
//	}

	/**
	 * Invalidate the calculated average cost for a product that involve the
	 * movements by the date required.
	 * 
	 * @param AD_Table_ID
	 * @param Record_ID
	 * @param product_id
	 * 
	 * @return an int with the current cost calc id invalidated or 0 if doesnt
	 *         exist nothing to invalidate or -2 if no exist costing method
	 *         defined for average cost.
	 */
//	private final int invalidateAverageCostForProduct(int AD_Table_ID,int Record_ID, int product_id, String trxName) {
//		String sql = null;
//		try
//		{
//				if (AD_Table_ID > 0)
//				{
//					MTable table = MTable.get(Env.getCtx(), AD_Table_ID);
//					if (table.getAD_Table_ID() > 0)
//					{
//						sql = " UPDATE "+table.getTableName()+" SET IsCosted = 'N' where "+table.getTableName()+"_ID = "+Record_ID;
//					    int no = DB.executeUpdate(sql, trxName);
//					    System.out.println(no);
//					}
//				}
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}		
//		sql = "DELETE FROM M_CostCalc WHERE AD_Table_ID = "+AD_Table_ID+" AND Record_ID ="+Record_ID;    
//	    int no = DB.executeUpdate(sql, trxName);
//	    return 0;		
//	}
	
	
	/**
	 * Invalidate the calculated cost for a product that involve the movements
	 * by the date required.
	 * 
	 * 
	 * @param client_id
	 *            the client id
	 * @param product_id
	 *            the product id
	 * @param org_id
	 *            The organization id
	 * @param costingMethod
	 *            The costing method to get the cost
	 * @param movementdate
	 *            the movement date to check
	 * @param checkInput
	 *            see remarks.
	 * @param trxName
	 *            transaction name if null out of global transaction.
	 * 
	 * @return an int with the current cost calc id invalidated or 0 if doesnt
	 *         exist nothing to invalidate or -5 if no exist costing method
	 *         defined for average cost.
	 */
//	public final int invalidateCostForProduct(int client_id, int org_id,
//			int product_id, final Timestamp movementdate,  String trxName) {
//
//		int calc_id = 0;
//				
//		if (getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.AveragePO)) {
//			calc_id = invalidateAverageCostForProduct(client_id,
//					product_id, movementdate ,trxName);
//		}
//		return calc_id;
//	}

//	/**
//	 * Invalidate the calculated average cost for a product that involve the
//	 * movements by the date required.
//	 * 
//	 * @param client_id
//	 *            the client id
//	 * @param product_id
//	 *            the product id
//	 * @param movementdate
//	 *            the movement date to check
//	 * @param trxName
//	 *            transaction name if null out of global transaction.
//	 * 
//	 * @return an int with the current cost calc id invalidated or 0 if doesnt
//	 *         exist nothing to invalidate or -2 if no exist costing method
//	 *         defined for average cost.
//	 */
//	private final int invalidateAverageCostForProduct(int client_id,
//			int product_id, final Timestamp movementdate, String trxName) {
//
//		String sql = "SELECT AD_Table_ID , Record_ID from  M_Carding where AD_Client_ID = " + client_id + " AND M_Product_ID = " + product_id + " AND date_trunc('day',MovementDate) >= date_trunc('day','"+movementdate.toString()+"'::timestamp)";
//		PreparedStatement pstmt = null;		
//		try
//		{
//			MTable table = null;
//			String tablename = "";
//			pstmt = DB.prepareStatement (sql, null);
//			ResultSet rs = pstmt.executeQuery ();
//			while (rs.next ())
//			{
//				int Record_ID = rs.getInt("Record_ID");
//				int AD_Table_ID = rs.getInt("AD_Table_ID");
//				if (AD_Table_ID > 0)
//				{
//					table = MTable.get(Env.getCtx(), AD_Table_ID);
//					if (table.getAD_Table_ID() > 0)
//					{
//						tablename = table.getTableName();
//						sql = " UPDATE "+tablename+" SET IsCosted = 'N' where "+tablename+"_ID = "+Record_ID;
//					    DB.executeUpdate(sql, trxName);
//					}
//				}
//			}
//			rs.close ();
//			pstmt.close ();
//			pstmt = null;
//		}
//		catch (Exception e)
//		{
//			log.log (Level.SEVERE, sql, e);
//		}
//		
//		sql = "DELETE FROM M_CostCalc WHERE IsManual='N' AND AD_Client_ID = " + client_id + " AND M_Product_ID = " + product_id + " AND date_trunc('day',MovementDate) >= date_trunc('day','"+movementdate.toString()+"'::timestamp)";   
//	    int no = DB.executeUpdate(sql, trxName);
//	    if (no > 0)
//	    {
//			CostAverageCalc ac = new CostAverageCalc(Env.getCtx(), 0, product_id, getM_CostElement_ID() ,2);
//			m_error = ac.processCosts(product_id);	    	
//	    }
//		return 0;
//		
//	}
	
	/**
	 * Get the date cost for and orderline taht cames from a inout
	 * based o the in out date and movement type.
	 * Basically is useful for returns,
	 * 
	 * @param client_id
	 *            the client id
	 * @param org_id
	 *            the org id
	 * @param orderline
	 *            the order line that have the ionut movement of a product
	 * @param movementdate
	 *            the movement of the inout movement
	 * @param movementtype
	 *            the movement type , like 'R+' , 'V+','R-' , etc
	 * @param trxName
	 *            transaction name if null out of global transaction.
	 * 
	 * @return The date that will be used for take the cost for the movement.
	 */
//	public Timestamp getCostDate(int client_id, 
//								 int org_id, 
//								 int orderline, 
//								 String movementtype,
//								 final Timestamp movementdate,
//								 boolean isReturn,
//								 String trxName) {
	public Timestamp getCostDate(int inout_id,
								 int orderline_id, 
								 String movementtype,
								 String trxName) {
		Timestamp costdate=null;
		String sql = "{?=call getCostDate(?,?,?)}";

		CallableStatement stmnt = null;
		try {
			stmnt = DB.prepareCall(sql, ResultSet.CONCUR_READ_ONLY, trxName);
			stmnt.registerOutParameter(1, java.sql.Types.TIMESTAMP );
			stmnt.setInt(2, inout_id);
			stmnt.setInt(3, orderline_id);
			stmnt.setString(4, movementtype);
	
			stmnt.execute();
			costdate = stmnt.getTimestamp(1);
	
		} catch (Exception ex) {
			s_log.log(Level.SEVERE, sql, ex);
		} finally {
			DB.close(null, stmnt);
			stmnt = null;
			sql = null;
		}
		return costdate ;
		
	}

	public Integer getAD_Table_ID() {
		return m_AD_Table_ID;
	}

	public void setAD_Table_ID(Integer aD_Table_ID) {
		m_AD_Table_ID = aD_Table_ID;
	}

	public Integer getRecord_ID() {
		return m_Record_ID;
	}

	public void setRecord_ID(Integer record_ID) {
		m_Record_ID = record_ID;
	}

//	public static void cost(Properties ctx, int M_Product_ID, int i, String trxName) {
//
//		MCostElement[] costMethods = MCostElement.getCostingMethods(ctx, Env.getAD_Client_ID(ctx), trxName);		
//		for (MCostElement ce:costMethods)
//		{
//			if (ce.getCostingMethod().equals(REF_C_AcctSchemaCostingMethod.AveragePO)) {
//				try {
//					CostAverageCalc cc = new CostAverageCalc(Env.getCtx(), 0, M_Product_ID, ce.getM_CostElement_ID() ,2, null, false, trxName);
//					cc.setCalculateCost(true);
//					//cc.setForcePeriod(false);
//					String m_error = cc.Initialize();
//					if (m_error.length() == 0)
//					{
//						//cc.setCalculateCost(true);
//						//cc.setCalculateStock(calculateStock);				
//						//MCostCalc.deleteCostsForAll(getAD_Client_ID(), getAD_Org_ID(), getM_CostElement_ID(), product_id, trxName);
//						m_error = cc.processCosts(M_Product_ID, true);					
//					}												
//				}
//				catch (Exception e)
//				{
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	
}	//	MCostElement
