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
 *****************************************************************************/
package org.xendra.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

import org.compiere.model.MStorage;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;

/**
 *  Update of storage
 * <p>
 * Change log:
 * <ul>
 * <li>2010-12-19 - xapiens
 * </ul>
 *
 *  @author     xapiens
 *  @version    $Id:
 */
public class StorageValidate extends SvrProcess {
	private Integer m_M_Product_ID = 0;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("M_Product_ID"))
				m_M_Product_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	@Override
	protected String doIt() throws Exception {
		int no = 0;
		try {						
			String sql = "DELETE FROM M_Storage ";
			DB.executeUpdate(sql,get_TrxName());
			sql =  " SELECT * FROM (";
			sql += " SELECT ad_client_id, " ;
			sql += "		ad_org_id, ";
			//sql += "      C_Period_ID, ";
			sql += "		locator, ";
			sql += " 		m_warehouse_id, ";
			sql += " 		m_attributesetinstance_id, ";
			sql += " 		m_product_id,";
			//sql += "		lastcosted,";
			sql += "		datelastrun,";
			sql += "		SUM(qtysource) over (order by locator, m_product_id, m_attributesetinstance_id)  as finallot, ";
			sql += " 		CASE WHEN sum(qtysource) over (order by locator, m_product_id,m_attributesetinstance_id) < qtysource then SUM(qtysource) over (order by locator, m_product_id,m_attributesetinstance_id) else qtysource end as qtyonhand ";
			sql += " FROM (";
			sql += " SELECT m.ad_client_id,";
			sql += " m.ad_org_id,";
			//sql += " MAX(m.c_period_id) as C_Period_ID, ";
			sql += " m.m_attributesetinstance_id,";
			sql += " m.m_locator_id as locator,";
			sql += " (select m_warehouse_id from m_locator loc where loc.m_locator_id = m.m_locator_id) as M_Warehouse_ID,";
			sql += " m.m_product_id,";
			sql += " COALESCE(sum(m.movementqty),sum(m.movementqty),0) as qtysource,";
			sql += " MAX(movementdate) AS datelastrun";
			sql += " from m_transaction m ";
			sql += "GROUP BY m.ad_client_id,"; 
			sql += "m.ad_org_id,";
			sql += "m.m_locator_id,";
			sql += "M_Warehouse_ID,";
			sql += "m.m_attributesetinstance_id,";
			sql += "m.m_product_id  ) as xx"; 
			sql += ") as yy where finallot > 0 "; 
			
			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BigDecimal qtyonhand = rs.getBigDecimal("qtyonhand");
				int M_Product_ID = rs.getInt("M_Product_ID");
				int M_Locator_ID = rs.getInt("locator");
				int M_AttributeSetInstance_ID = rs.getInt("M_AttributeSetInstance_ID");				
				int C_Period_ID = rs.getInt("C_Period_ID");
				Timestamp datelastrun = rs.getTimestamp("dateLastrun");
				if (M_Locator_ID > 0 && M_Product_ID > 0)
				{
					MStorage storage = MStorage.getCreate (Env.getCtx(), M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID,  get_TrxName());					
					storage.setQtyOnHand(storage.getQtyOnHand().add(qtyonhand));
					storage.setDateLastRun(datelastrun);
					//storage.setDateLastRun(new Timestamp(System.currentTimeMillis()));
					storage.save();
					no++;
				}
			}
			pstmt.close();
			rs.close();
		}
		catch (SQLException e) {
			return "@Error@".concat(e.getMessage());
		}				
		return "#" + no;
	}
	
	public static void main(String[] args)
	{
		try 
		{
			org.compiere.Xendra.startupEnvironment(true);
			CLogMgt.setLevel(Level.FINE);
			StorageValidate rr = new StorageValidate();
			rr.doIt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}	
}
