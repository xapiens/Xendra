/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.Xendra;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_InOutLine;
import org.compiere.model.persistence.X_M_Storage;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

/**
 * 	Inventory Storage Model
 *
 *	@author Jorg Janke
 *	@version $Id: MStorage.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MStorage extends X_M_Storage
{
	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 9086223702645715061L;
	//private static ExecutorService executor = Executors.newFixedThreadPool(200); // creating 200 threads
	/**
	 * 	Get Storage Info
	 *	@param ctx context
	 *	@param M_Locator_ID locator
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID instance
	 *	@param trxName transaction
	 *	@return existing or null
	 */
	public static MStorage get (Properties ctx, int M_Locator_ID, int M_Product_ID, int M_AttributeSetInstance_ID, String trxName)
	{
		String where = "M_Locator_ID = ? AND M_Product_ID = ? AND ";
		
		if (M_AttributeSetInstance_ID == 0)
			where += "(M_AttributeSetInstance_ID=? OR M_AttributeSetInstance_ID IS NULL)";
		else
			where += "M_AttributeSetInstance_ID=?";

		MStorage retValue = new Query(Env.getCtx(), X_M_Storage.Table_Name, where, trxName)
			.setParameters(M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID).first();
		
		if (retValue == null)
			s_log.fine("Not Found - M_Locator_ID=" + M_Locator_ID 
				+ ", M_Product_ID=" + M_Product_ID + ", M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID);
		else
			s_log.fine("M_Locator_ID=" + M_Locator_ID 
				+ ", M_Product_ID=" + M_Product_ID + ", M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID);
		return retValue;
	}	//	get

	/**
	 * 	Get all Storages for Product with ASI (Attribute Set Instance ) and QtyOnHand <> 0
	 *	@param ctx context
	 *	@param M_Product_ID product
	 *	@param M_Locator_ID locator
	 *	@param FiFo first in-first-out
	 *	@param trxName transaction
	 *	@return existing or null
	 */
	public static MStorage[] getAllWithASI (Properties ctx, int M_Product_ID, int M_Locator_ID, 
		boolean FiFo, String trxName)
	{
		ArrayList<MStorage> list = new ArrayList<MStorage>();
		String sql = "SELECT * FROM M_Storage "
			+ "WHERE M_Product_ID=? AND M_Locator_ID=?"
			+ " AND M_AttributeSetInstance_ID > 0 "
			+ " AND QtyOnHand <> 0 "			
			+ "ORDER BY M_AttributeSetInstance_ID";
		if (!FiFo)
			sql += " DESC";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, M_Product_ID);
			pstmt.setInt (2, M_Locator_ID);
			rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add(new MStorage (ctx, rs, trxName));
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, sql, ex);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		MStorage[] retValue = new MStorage[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getAllWithASI

	/**
	 * 	Get all Storages for Product where QtyOnHand <> 0
	 *	@param ctx context
	 *	@param M_Product_ID product
	 *	@param M_Locator_ID locator
	 *	@param trxName transaction
	 *	@return existing or null
	 */
	public static MStorage[] getAll (Properties ctx, 
		int M_Product_ID, int M_Locator_ID, String trxName)
	{
		ArrayList<MStorage> list = new ArrayList<MStorage>();
		String sql = "SELECT * FROM M_Storage "
			+ "WHERE M_Product_ID=? AND M_Locator_ID=?"
			+ " AND QtyOnHand <> 0 "
			+ "ORDER BY M_AttributeSetInstance_ID";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, M_Product_ID);
			pstmt.setInt (2, M_Locator_ID);
			rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add(new MStorage (ctx, rs, trxName));
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, sql, ex);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		MStorage[] retValue = new MStorage[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getAll

	
	/**
	 * 	Get Storage Info for Product across warehouses
	 *	@param ctx context
	 *	@param M_Product_ID product
	 *	@param trxName transaction
	 *	@return existing or null
	 */
	public static MStorage[] getOfProduct (Properties ctx, int M_Product_ID, String trxName)
	{
		ArrayList<MStorage> list = new ArrayList<MStorage>();
		String sql = "SELECT * FROM M_Storage "
			+ "WHERE M_Product_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, M_Product_ID);
			rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add(new MStorage (ctx, rs, trxName));
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, sql, ex);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		MStorage[] retValue = new MStorage[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getOfProduct
	
	/**
	 * 	Get Storage Info for Warehouse
	 *	@param ctx context
	 *	@param M_Warehouse_ID 
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID instance
	 *	@param M_AttributeSet_ID attribute set
	 *	@param allAttributeInstances if true, all attribute set instances
	 *	@param minGuaranteeDate optional minimum guarantee date if all attribute instances
	 *	@param FiFo first in-first-out
	 *	@param trxName transaction
	 *	@return existing - ordered by location priority (desc) and/or guarantee date
	 *
	 *  @deprecated
	 */
	public static MStorage[] getWarehouse (Properties ctx, int M_Warehouse_ID, 
		int M_Product_ID, int M_AttributeSetInstance_ID, int M_AttributeSet_ID,
		boolean allAttributeInstances, Timestamp minGuaranteeDate,
		boolean FiFo, String trxName)
	{
		return getWarehouse(ctx, M_Warehouse_ID, M_Product_ID, M_AttributeSetInstance_ID, 
				minGuaranteeDate, FiFo, false, 0, trxName);
	}
	
	/**
	 * 	Get Storage Info for Warehouse or locator
	 *	@param ctx context
	 *	@param M_Warehouse_ID ignore if M_Locator_ID > 0
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID instance id, 0 to retrieve all instance
	 *	@param minGuaranteeDate optional minimum guarantee date if all attribute instances
	 *	@param FiFo first in-first-out
	 *  @param positiveOnly if true, only return storage records with qtyOnHand > 0
	 *  @param M_Locator_ID optional locator id
	 *	@param trxName transaction
	 *	@return existing - ordered by location priority (desc) and/or guarantee date
	 */
	public static MStorage[] getWarehouse (Properties ctx, int M_Warehouse_ID, 
		int M_Product_ID, int M_AttributeSetInstance_ID, Timestamp minGuaranteeDate,
		boolean FiFo, boolean positiveOnly, int M_Locator_ID, String trxName)
	{
		if ((M_Warehouse_ID == 0 && M_Locator_ID == 0) || M_Product_ID == 0)
			return new MStorage[0];
		
		boolean allAttributeInstances = false;
		if (M_AttributeSetInstance_ID == 0)
			allAttributeInstances = true;		
		
		ArrayList<MStorage> list = new ArrayList<MStorage>();
		//	Specific Attribute Set Instance
		String sql = "SELECT s.M_Storage_ID, s.M_Product_ID,s.M_Locator_ID,s.M_AttributeSetInstance_ID,"
			+ "s.AD_Client_ID,s.AD_Org_ID,s.IsActive,s.Created,s.CreatedBy,s.Updated,s.UpdatedBy,"
			+ "s.QtyOnHand,s.QtyReserved,s.QtyOrdered,s.DateLastInventory, DateLastRun, s.Identifier "
			+ " FROM M_Storage s"
			+ " INNER JOIN M_Locator l ON (l.M_Locator_ID=s.M_Locator_ID) ";
		if (M_Locator_ID > 0)
			sql += "WHERE l.M_Locator_ID = ?";
		else
			sql += "WHERE l.M_Warehouse_ID=?";
		sql += " AND s.M_Product_ID=?"
			 + " AND COALESCE(s.M_AttributeSetInstance_ID,0)=? ";
		if (positiveOnly)
		{
			sql += " AND s.QtyOnHand > 0 ";
		}
		else
		{
			sql += " AND s.QtyOnHand <> 0 ";
		}
		sql += "ORDER BY l.PriorityNo DESC, M_AttributeSetInstance_ID";
		if (!FiFo)
			sql += " DESC";
		//	All Attribute Set Instances
		if (allAttributeInstances)
		{
			sql = "SELECT s.M_Storage_ID, s.M_Product_ID,s.M_Locator_ID,s.M_AttributeSetInstance_ID,"
				+ "s.AD_Client_ID,s.AD_Org_ID,s.IsActive,s.Created,s.CreatedBy,s.Updated,s.UpdatedBy,"
				+ "s.QtyOnHand,s.QtyReserved,s.QtyOrdered,s.DateLastInventory, DateLastRun, s.Identifier "
				+ "FROM M_Storage s"
				+ " INNER JOIN M_Locator l ON (l.M_Locator_ID=s.M_Locator_ID)"
				+ " LEFT OUTER JOIN M_AttributeSetInstance asi ON (s.M_AttributeSetInstance_ID=asi.M_AttributeSetInstance_ID) ";
			if (M_Locator_ID > 0)
				sql += "WHERE l.M_Locator_ID = ?";
			else
				sql += "WHERE l.M_Warehouse_ID=?";
			sql += " AND s.M_Product_ID=? ";
			if (positiveOnly)
			{
				sql += " AND s.QtyOnHand > 0 ";
			}
			else
			{
				sql += " AND s.QtyOnHand <> 0 ";
			}
			if (minGuaranteeDate != null)
			{
				sql += "AND (asi.GuaranteeDate IS NULL OR asi.GuaranteeDate>?) ";
				sql += "ORDER BY l.PriorityNo DESC, " +
					   "asi.GuaranteeDate, M_AttributeSetInstance_ID";
				if (!FiFo)
					sql += " DESC";
				sql += ", s.QtyOnHand DESC";
			}
			else
			{
				sql += "ORDER BY l.PriorityNo DESC, l.M_Locator_ID, s.M_AttributeSetInstance_ID";
				if (!FiFo)
					sql += " DESC";
				sql += ", s.QtyOnHand DESC";
			}
		} 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, trxName);
			pstmt.setInt(1, M_Locator_ID > 0 ? M_Locator_ID : M_Warehouse_ID);
			pstmt.setInt(2, M_Product_ID);
			if (!allAttributeInstances)
			{
				pstmt.setInt(3, M_AttributeSetInstance_ID);
			}
			else if (minGuaranteeDate != null)
			{
				pstmt.setTimestamp(3, minGuaranteeDate);
			}
			rs = pstmt.executeQuery();
			while (rs.next())
			{	
				if(rs.getBigDecimal("QtyOnHand").signum() != 0)
				list.add (new MStorage (ctx, rs, trxName));
			}	
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		MStorage[] retValue = new MStorage[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getWarehouse

	
	/**
	 * 	Create or Get Storage Info
	 *	@param ctx context
	 *	@param M_Locator_ID locator
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID instance
	 *	@param trxName transaction
	 *	@return existing/new or null
	 */
	public static MStorage getCreate (Properties ctx,  
			int M_Locator_ID, int M_Product_ID, int M_AttributeSetInstance_ID, String trxName)
	{
		if (M_Locator_ID == 0)
			throw new IllegalArgumentException("M_Locator_ID=0");
		if (M_Product_ID == 0)
			throw new IllegalArgumentException("M_Product_ID=0");
		MStorage retValue = get(ctx, M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID, trxName);
		if (retValue != null)
			return retValue;
		
		//	Insert row based on locator
		MLocator locator = new MLocator (ctx, M_Locator_ID, trxName);
		if (locator.get_ID() != M_Locator_ID)
			throw new IllegalArgumentException("Not found M_Locator_ID=" + M_Locator_ID);
		//
		retValue = new MStorage (locator, M_Product_ID, M_AttributeSetInstance_ID);
		retValue.save(trxName);
		s_log.fine("New " + retValue);
		return retValue;
	}	//	getCreate

//	public static void addStockWorker(StockWorker sw)
//	{
//		Runnable runcommand = getRunnable(sw);
//		//new Thread(runcommand).start();		
//		executor.execute(runcommand);
//	}
//	
//	private static Runnable getRunnable(final StockWorker sw) {
//		return new Runnable() {
//			@Override
//			public void run() {
//				try {
//					MStorageThread.getinstance().add(sw);
//				}
//				catch (Exception e)
//				{
//					e.printStackTrace();
//				}
//			}
//		};
//	}
	
//	public static void CheckPeriod(int C_Period_ID)
//	{
//		if (C_Period_ID > 0)
//		{
//			StockWorker sw = new StockWorker();
//			sw.addProperty(X_M_Transaction.COLUMNNAME_C_Period_ID, C_Period_ID);
//			sw.setCommand(StockWorker.UpdateStorage);
//			//sw.Pull();						
//			//concept.add(sw);
//		}
//	}
	/**
	 * 	Update Storage Info add.
	 * 	Called from MProjectIssue
	 *	@param ctx context
	 *	@param M_Warehouse_ID warehouse
	 *	@param M_Locator_ID locator
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID AS Instance
	 *	@param reservationAttributeSetInstance_ID reservation AS Instance
	 *	@param diffQtyOnHand add on hand
	 *	@param diffQtyReserved add reserved
	 *	@param diffQtyOrdered add order
	 *	@param trxName transaction
	 *	@return true if updated
	 */
	public static String add (Properties ctx, int M_Warehouse_ID, 
											  int M_Locator_ID, 
											  int M_Product_ID, 
											  int M_AttributeSetInstance_ID, 
											  int reservationAttributeSetInstance_ID,
		BigDecimal diffQtyOnHand, 
		BigDecimal diffQtyReserved, 
		BigDecimal diffQtyOrdered, 
		Boolean IsRealtimePOS,		
		final Integer C_Period_ID,
		String ProcedureName,
		String trxName)
	{
		String error = "";		
		try 
		{
			MStorage storage = null;
			StringBuffer diffText = new StringBuffer("( Locator ID :"+M_Locator_ID+"-");

			//	Get Storage
			if (storage == null)
				storage = getCreate (ctx, M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID, trxName);
			
			//	Verify
			if ( storage.getM_Locator_ID() != M_Locator_ID 
					&& storage.getM_Product_ID() != M_Product_ID
					&& storage.getM_AttributeSetInstance_ID() != M_AttributeSetInstance_ID)
			{
				throw new Exception ( "No Storage found - M_Locator_ID=" + M_Locator_ID 
						+ ",M_Product_ID=" + M_Product_ID + ",ASI=" + M_AttributeSetInstance_ID); 
			}

			// CarlosRuiz - globalqss - Fix [ 1725383 ] QtyOrdered wrongly updated
			MProduct prd = new MProduct(ctx, M_Product_ID, trxName);
			if (prd.getM_AttributeSet_ID() == 0) {
				// Product doesn't manage attribute set, always reserved with 0
				reservationAttributeSetInstance_ID = 0;
			}
			//		

			MStorage storage0 = null;

			if (M_AttributeSetInstance_ID != reservationAttributeSetInstance_ID && reservationAttributeSetInstance_ID > 0)
			{
				storage0 = get(ctx, M_Locator_ID, 
						M_Product_ID, reservationAttributeSetInstance_ID, trxName);
				if (storage0 == null)	//	create if not existing - should not happen
				{
					MWarehouse wh = MWarehouse.get(ctx, M_Warehouse_ID);
					int xM_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
					storage0 = getCreate (ctx, xM_Locator_ID, 
							M_Product_ID, reservationAttributeSetInstance_ID, trxName);
				}
			}					
			
			boolean changed = false;
			if (diffQtyOnHand != null && diffQtyOnHand.signum() != 0)
			{
//				if (storage.getQtyOnHand().compareTo(Env.ZERO) > 0)
//				{
//					BigDecimal newQtyOnHand = storage.getQtyOnHand().add (diffQtyOnHand);
//					if ( newQtyOnHand.compareTo(Env.ZERO) < 0 && !IsRealtimePOS && M_AttributeSetInstance_ID != 0)
//					{						
//						throw new Exception (getProductName( M_Product_ID , trxName ) + ",ASI=" + M_AttributeSetInstance_ID + " QtyOnHand = " + newQtyOnHand );
//					}
//				}
				
				storage.setQtyOnHand (storage.getQtyOnHand().add (diffQtyOnHand));							
				diffText.append("OnHand=").append(diffQtyOnHand);
				changed = true;
			}
			if (diffQtyReserved != null && diffQtyReserved.signum() != 0)
			{
				BigDecimal newQtyReserved;
				if (storage0 == null)
				{
//					newQtyReserved = storage.getQtyReserved().add(diffQtyReserved);					
//					if (newQtyReserved.compareTo(Env.ZERO) < 0)
//						storage.setQtyReserved (Env.ZERO);
//					else
//						storage.setQtyReserved (storage.getQtyReserved().add (diffQtyReserved));					
				}
				else
				{
//					newQtyReserved = storage0.getQtyReserved().add(diffQtyReserved);
//					if (newQtyReserved.compareTo(Env.ZERO) < 0)
//						storage0.setQtyReserved(Env.ZERO);
//					else
//						storage0.setQtyReserved (storage0.getQtyReserved().add (diffQtyReserved));
				}				
				diffText.append(" Reserved=").append(diffQtyReserved);
				changed = true;
			}
			if (diffQtyOrdered != null && diffQtyOrdered.signum() != 0)
			{
				BigDecimal newQtyOrdered;
				if (storage0 == null)
				{
						newQtyOrdered = storage.getQtyOrdered().add(diffQtyOrdered); 
						if (newQtyOrdered.compareTo(Env.ZERO) < 0)
							storage.setQtyOrdered (Env.ZERO);
						else
							storage.setQtyOrdered (storage.getQtyOrdered().add (diffQtyOrdered));
				}
				else
				{
						newQtyOrdered = storage0.getQtyOrdered().add(diffQtyOrdered); 
						if (newQtyOrdered.compareTo(Env.ZERO) < 0 )
							storage0.setQtyOrdered (Env.ZERO);
						else
							storage0.setQtyOrdered (storage0.getQtyOrdered().add (diffQtyOrdered));
				}
				diffText.append(" Ordered=").append(diffQtyOrdered);
				changed = true;
			}
			if (changed)
			{
				//diffText.append(") -> ").append(storage.toString());								
				s_log.fine(diffText.toString());
				if (storage0 != null)
				{
					storage0.setIsCosted(false);
					storage0.save(trxName);		//	No AttributeSetInstance (reserved/ordered)
				} else if (storage != null) {
					storage.setIsCosted(false);
				}
				if (!storage.save (trxName))
					throw new Exception ("MStorage can't be saved");
			}
		}
		catch (Exception e)
		{
			error = "@Error@ "+e.getMessage();
			e.printStackTrace();
		}
		finally {

		}
		return error;
	}	//	add

	
	public static String getProductName(int M_Product_ID, String trxName) {
		String ProductName = null;
		ProductName = DB.getSQLValueString(trxName, "SELECT name from M_Product WHERE M_Product_ID = ?", M_Product_ID);		
		return ProductName;
	}

	/**************************************************************************
	 * 	Get Location with highest Locator Priority and a sufficient OnHand Qty
	 * 	@param M_Warehouse_ID warehouse
	 * 	@param M_Product_ID product
	 * 	@param M_AttributeSetInstance_ID asi
	 * 	@param Qty qty
	 *	@param trxName transaction
	 * 	@return id
	 */
	public static int getM_Locator_ID (int M_Warehouse_ID, 
		int M_Product_ID, int M_AttributeSetInstance_ID, BigDecimal Qty,
		String trxName)
	{
		int M_Locator_ID = 0;
		int firstM_Locator_ID = 0;
		StringBuilder sql = new StringBuilder("SELECT s.M_Locator_ID, s.QtyOnHand ")
			.append("FROM M_Storage s")
			.append(" INNER JOIN M_Locator l ON (s.M_Locator_ID=l.M_Locator_ID)")
			.append(" INNER JOIN M_Product p ON (s.M_Product_ID=p.M_Product_ID)")
			.append(" LEFT OUTER JOIN M_AttributeSet mas ON (p.M_AttributeSet_ID=mas.M_AttributeSet_ID) ")
			.append("WHERE l.M_Warehouse_ID=?")
			.append(" AND s.M_Product_ID=?");					
			if (M_AttributeSetInstance_ID > 0)
				sql.append(" AND (mas.IsInstanceAttribute IS NULL OR mas.IsInstanceAttribute='N' OR s.M_AttributeSetInstance_ID=?)");
			//else
			//	sql.append(" AND (mas.IsInstanceAttribute IS NULL OR mas.IsInstanceAttribute='N')");
			sql.append(" AND l.IsActive='Y' ")
			   .append("ORDER BY l.PriorityNo DESC, s.QtyOnHand DESC");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), trxName);
			pstmt.setInt(1, M_Warehouse_ID);
			pstmt.setInt(2, M_Product_ID);
			if (M_AttributeSetInstance_ID > 0)
				pstmt.setInt(3, M_AttributeSetInstance_ID);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				BigDecimal QtyOnHand = rs.getBigDecimal(2);
				if (QtyOnHand != null && Qty.compareTo(QtyOnHand) <= 0)
				{
					M_Locator_ID = rs.getInt(1);
					break;
				}
				if (firstM_Locator_ID == 0)
					firstM_Locator_ID = rs.getInt(1);
			}
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, sql.toString(), ex);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		if (M_Locator_ID != 0)
			return M_Locator_ID;
		return firstM_Locator_ID;
	}	//	getM_Locator_ID

	/**
	 * 	Get Available Qty.
	 * 	The call is accurate only if there is a storage record 
	 * 	and assumes that the product is stocked 
	 *	@param M_Warehouse_ID wh
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID masi
	 *	@param trxName transaction
	 *	@return qty available (QtyOnHand-QtyReserved) or null
	 * @deprecated Since 331b. Please use {@link #getQtyAvailable(int, int, int, int, String)}.
	 */
	public static BigDecimal getQtyAvailable (int M_Warehouse_ID, 
		int M_Product_ID, int M_AttributeSetInstance_ID, String trxName)
	{
		return getQtyAvailable(M_Warehouse_ID, 0, M_Product_ID, M_AttributeSetInstance_ID, trxName);
	}

	public static BigDecimal getQtyAvailable (int M_Warehouse_ID, int M_Locator_ID, 
			int M_Product_ID, int M_AttributeSetInstance_ID, int Ref_AttributeSetInstance_ID,String trxName)
	{
		System.out.println("warehouse->"+M_Warehouse_ID);
		System.out.println("Locator->"+M_Locator_ID);
		System.out.println("M_Product-ID->"+M_Product_ID);
		System.out.println("M_AttributeSetInstance_ID->"+M_AttributeSetInstance_ID);
		System.out.println("Ref_AttributeSetInstance_ID"+Ref_AttributeSetInstance_ID);		
		BigDecimal retValue = null;
		if (Ref_AttributeSetInstance_ID > 0)
			retValue = getQtyAvailable (M_Warehouse_ID, M_Locator_ID, M_Product_ID, Ref_AttributeSetInstance_ID,trxName);
		else
			retValue = getQtyAvailable (M_Warehouse_ID, M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID,trxName);
		return retValue;
	}	
	
	/**
	 * Get Warehouse/Locator Available Qty.
	 * The call is accurate only if there is a storage record 
	 * and assumes that the product is stocked 
	 * @param M_Warehouse_ID wh (if the M_Locator_ID!=0 then M_Warehouse_ID is ignored)
	 * @param M_Locator_ID locator (if 0, the whole warehouse will be evaluated)
	 * @param M_Product_ID product
	 * @param M_AttributeSetInstance_ID masi
	 * @param trxName transaction
	 * @return qty available (QtyOnHand-QtyReserved) or null if error
	 */
	public static BigDecimal getQtyAvailable (int M_Warehouse_ID, int M_Locator_ID, 
		int M_Product_ID, int M_AttributeSetInstance_ID, String trxName)
	{
		if (M_Product_ID == 2008096) {
			System.out.println("X");
		}
		ArrayList<Object> params = new ArrayList<Object>();
		StringBuffer sql = new StringBuffer("SELECT SUM(COALESCE(s.QtyOnHand,0)-COALESCE(s.QtyReserved,0))")
								.append(" FROM M_Storage s")
								.append(" WHERE s.M_Product_ID=?");
		params.add(M_Product_ID);
		// Warehouse level
		if (M_Locator_ID == 0) {
			sql.append(" AND EXISTS (SELECT 1 FROM M_Locator l WHERE s.M_Locator_ID=l.M_Locator_ID AND l.M_Warehouse_ID=?)");
			params.add(M_Warehouse_ID);
		}
		// Locator level
		else {
			sql.append(" AND s.M_Locator_ID=?");
			params.add(M_Locator_ID);
		}
		// With ASI
		if (M_AttributeSetInstance_ID != 0) {
			sql.append(" AND s.M_AttributeSetInstance_ID=?");
			
			params.add(M_AttributeSetInstance_ID);
		}
		//
		BigDecimal retValue = DB.getSQLValueBD(trxName, sql.toString(), params);
		if (retValue == null)
			retValue = BigDecimal.ZERO;
		if (CLogMgt.isLevelFine())
			s_log.fine("M_Warehouse_ID=" + M_Warehouse_ID + ", M_Locator_ID=" + M_Locator_ID 
				+ ",M_Product_ID=" + M_Product_ID + " = " + retValue);
		return retValue;
	}	//	getQtyAvailable
	
	
	/**************************************************************************
	 * 	Persistency Constructor
	 *	@param ctx context
	 *	@param ignored ignored
	 *	@param trxName transaction
	 */
	public MStorage (Properties ctx, int ignored, String trxName)
	{
		super(ctx, 0, trxName);
		if (ignored != 0)
			throw new IllegalArgumentException("Multi-Key");
		//
		setQtyOnHand (Env.ZERO);
		setQtyOrdered (Env.ZERO);
		setQtyReserved (Env.ZERO);
	}	//	MStorage

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MStorage (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MStorage

	/**
	 * 	Full NEW Constructor
	 *	@param locator (parent) locator
	 *	@param M_Product_ID product
	 *	@param M_AttributeSetInstance_ID attribute
	 */
	private MStorage (MLocator locator, int M_Product_ID, int M_AttributeSetInstance_ID)
	{
		this (locator.getCtx(), 0, locator.get_TrxName());
		setClientOrg(locator);
		setM_Locator_ID (locator.getM_Locator_ID());
		setM_Product_ID (M_Product_ID);
		setM_AttributeSetInstance_ID (M_AttributeSetInstance_ID);
	}	//	MStorage

	/** Log								*/
	private static CLogger		s_log = CLogger.getCLogger (MStorage.class);
	/** Warehouse						*/
	private int		m_M_Warehouse_ID = 0;
	
	/**
	 * 	Change Qty OnHand
	 *	@param qty quantity
	 *	@param add add if true 
	 */
	public void changeQtyOnHand (BigDecimal qty, boolean add)
	{
		if (qty == null || qty.signum() == 0)
			return;
		if (add)
			setQtyOnHand(getQtyOnHand().add(qty));
		else
			setQtyOnHand(getQtyOnHand().subtract(qty));
	}	//	changeQtyOnHand

	/**
	 * 	Get M_Warehouse_ID of Locator
	 *	@return warehouse
	 */
	public int getM_Warehouse_ID()
	{
		if (m_M_Warehouse_ID == 0)
		{
			MLocator loc = MLocator.get(getCtx(), getM_Locator_ID());
			m_M_Warehouse_ID = loc.getM_Warehouse_ID();
		}
		return m_M_Warehouse_ID;
	}	//	getM_Warehouse_ID
	
	/**
	 *	String Representation
	 * 	@return info
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer("MStorage[")
			.append("M_Locator_ID=").append(getM_Locator_ID())
				.append(",M_Product_ID=").append(getM_Product_ID())
				.append(",M_AttributeSetInstance_ID=").append(getM_AttributeSetInstance_ID())
			.append(": OnHand=").append(getQtyOnHand())
			.append(",Reserved=").append(getQtyReserved())
			.append(",Ordered=").append(getQtyOrdered())
			.append("]");
		return sb.toString();
	}	//	toString

	public static void deleteForAll(int AD_Client_ID, int AD_Org_ID, int M_Product_ID, String trxName) {
		String where = " WHERE AD_Client_ID =" +  AD_Client_ID ;	
		//	"AND AD_Org_ID = " + AD_Org_ID; 
		if (M_Product_ID > 0)
			where += " AND M_Product_ID = " +  M_Product_ID;
		DB.executeUpdate("DELETE FROM M_Storage " + where, trxName);
	}

	public static BigDecimal bomqtyavailable(int M_Product_ID, int M_AttributeSetInstance_ID, int M_Warehouse_ID, int M_Locator_ID) {
		BigDecimal CurrentQty = BigDecimal.ZERO;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT bomqtyonhandasi(?,?,?,?)");
		PreparedStatement pstmt = DB.prepareStatement(sb.toString(), null);
		try {		
			pstmt.setInt(1, M_Product_ID);
			pstmt.setInt(2, M_AttributeSetInstance_ID);
			pstmt.setInt(3, M_Warehouse_ID);
			pstmt.setInt(4, M_Locator_ID);
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
}	//	MStorage