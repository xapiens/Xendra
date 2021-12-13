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

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_POSLine;
import org.compiere.util.*;

/**
 *	POS Terminal definition
 *	
 *  @author Jorg Janke
 *  @version $Id: MPOS.java 6465 2018-05-25 19:23:54Z xapiens $
 */
public class MPOS extends X_C_POS
{
	public MPOSLine[] getLines()
	{
		List<MPOSLine> list = new Query(Env.getCtx(), X_C_POSLine.Table_Name, "C_POS_ID=? AND IsVisible='Y'", get_TrxName())
		.setParameters(getC_POS_ID()).setOrderBy("Line").list();
		MPOSLine[] lines = new MPOSLine[list.size ()];
		list.toArray (lines);
		return lines;		
	}

	public Boolean getbool(String name)
	{		
		Boolean var = false;
		if (Env.getMachine().getProperties().get(name) != null)
			var = Boolean.valueOf(Env.getMachine().getProperties().get(name).toString());
		return var;

	}	
	public int getint(String name)
	{
		Integer value = 0;
		if (Env.getMachine().getProperties().get(name) != null)
			value = Integer.valueOf(Env.getMachine().getProperties().get(name).toString());
		return value;
	}
	/**
	 * 	Get POS from Cache
	 *	@param ctx context
	 *	@param C_POS_ID id
	 *	@return MPOS
	 */
	public static MPOS get (Properties ctx, int C_POS_ID)
	{
		Integer key = new Integer (C_POS_ID);
		MPOS retValue = (MPOS) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MPOS (ctx, C_POS_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	} //	get

	/**
	 * 	Get POS for Value
	 *	@param ctx context
	 *	@param Value value
	 *	@return POS Config
	 */
	public static MPOS get (Properties ctx, String Value)
	{
		//	Try from cache
		Iterator it = s_cache.values().iterator();
		while (it.hasNext())
		{
			MPOS pos = (MPOS)it.next();
			if (pos.getValue() == Value)
				return pos;
		}

		//	Get from DB
		MPOS retValue = null;
		String sql = "SELECT * FROM C_POS "
				+ "WHERE Value=? ";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setString(1, Value);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				retValue = new MPOS (ctx, rs, null);
				Integer key = new Integer (retValue.getC_POS_ID());
				s_cache.put (key, retValue);
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, "get", e);
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
		return retValue;
	}	//	get


	public static MPOS getByMachineSerial (Properties ctx, int AD_User_ID, String MachineSerial)
	{
		int C_Pos_ID = DB.getSQLValue(null, "SELECT C_Pos_ID FROM C_Pos WHERE MachineSerial='" + MachineSerial +"' AND IsActive='Y'");
		if (C_Pos_ID == -1) return null;

		return get(ctx, C_Pos_ID);
	}

	public static MPOS getByUser (Properties ctx, int AD_User_ID)
	{
		int C_Pos_ID = DB.getSQLValue(null, "SELECT C_Pos_ID FROM C_Pos WHERE Salesrep_ID=" + AD_User_ID + " AND IsActive='Y'");
		if (C_Pos_ID == -1) return null;

		return get(ctx, C_Pos_ID);
	}

	/**	Cache						*/
	private static CCache<Integer,MPOS> s_cache = new CCache<Integer,MPOS>("C_POS", 20);
	private static CLogger	s_log	= CLogger.getCLogger (MPOS.class);
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_POS_ID id
	 *	@param trxName transaction
	 */
	public MPOS (Properties ctx, int C_POS_ID, String trxName)
	{
		super (ctx, C_POS_ID, trxName);
		if (C_POS_ID == 0)
		{
			//	setName (null);
			//	setSalesRep_ID (0);
			//	setC_CashBook_ID (0);
			//	setM_PriceList_ID (0);
			//	setM_Warehouse_ID (0);
		}	
	}	//	MPOS

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MPOS (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MPOS

	/**	Cash Business Partner			*/
	private MBPartner	m_template = null;



	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Org Consistency
		if (newRecord 
				|| is_ValueChanged("C_CashBook_ID") || is_ValueChanged("M_Warehouse_ID"))
		{
			MCashBook cb = MCashBook.get(getCtx(), getC_CashBook_ID());
			if (cb.getAD_Org_ID() != getAD_Org_ID())
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@AD_Org_ID@: @C_CashBook_ID@"));
				return false;
			}
			MWarehouse wh = MWarehouse.get(getCtx(), getM_Warehouse_ID());
			if (wh.getAD_Org_ID() != getAD_Org_ID())
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@AD_Org_ID@: @M_Warehouse_ID@"));
				return false;
			}
		}
		return true;
	}	//	beforeSave

	public String toString ()
	{
		MWarehouse wh = MWarehouse.get(Env.getCtx(), getM_Warehouse_ID());
		StringBuffer sb = new StringBuffer(wh.getName()).append("-").append(getName());
		return sb.toString();
	}
}	//	MPOS
