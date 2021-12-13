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
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MStorage;
import org.compiere.model.persistence.X_M_Locator;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Storage;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

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
@XendraProcess(value="StorageValidate",
name="Storage Validate",
description="Storage Validate Process",
help="The Storage Validate is the process to calculate only the final stock",
Identifier="b48e05d9-876b-2f82-d19a-5cc022de4754",				   
classname="org.xendra.process.StorageValidate",
updated="2018-08-23 21:21:12")				
public class StorageValidate extends SvrProcess {
	@XendraProcessParameter(Name="Product",
            ColumnName="M_Product_ID",
            Description="Product, Service, Item",
            Help="Identifies an item which is either purchased or sold in this organization.",
            AD_Reference_ID=DisplayType.Search,
            SeqNo=10,
            ReferenceValueID="",
            ValRuleID="",
            FieldLength=0,
            IsMandatory=false,
            IsRange=false,
            DefaultValue="",
            DefaultValue2="",
            vFormat="",
            valueMin="",
            valueMax="",
            DisplayLogic="",
            ReadOnlyLogic="",
            Identifier="642bde83-14d2-01d6-310d-33c475d004a9")					
	private Integer m_M_Product_ID = 0;
	@XendraProcessParameter(Name="Locator",
            ColumnName="M_Locator_ID",
            Description="Locator",
            Help="Locator",
            AD_Reference_ID=DisplayType.Search,
            SeqNo=20,
            ReferenceValueID="",
            ValRuleID="",
            FieldLength=10,
            IsMandatory=false,
            IsRange=false,
            DefaultValue="",
            DefaultValue2="",
            vFormat="",
            valueMin="",
            valueMax="",
            DisplayLogic="",
            ReadOnlyLogic="",
            Identifier="60168bb9-90b0-9ab0-960f-06ce793a13fc")
	private Integer M_Locator_ID = 0;
	
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals(X_M_Storage.COLUMNNAME_M_Product_ID))
				m_M_Product_ID = para[i].getParameterAsInt();
			else if (name.equals(X_M_Storage.COLUMNNAME_M_Locator_ID))
				M_Locator_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	@Override
	protected String doIt() throws Exception {
		int no = 0;
		try {						
			String where = "";
			String sql = "DELETE FROM M_Storage ";
			if (M_Locator_ID > 0) {
				where += String.format("M_Locator_ID = %s", M_Locator_ID);
			} 
			if (m_M_Product_ID > 0) {
				where += String.format("M_Product_ID = %s", m_M_Product_ID);
			}
			if (where.length() > 0) {
				sql += " WHERE " + where;
			}
			DB.executeUpdate(sql,get_TrxName());
			sql =  " SELECT m.ad_client_id,";
			sql += " m.ad_org_id,";
			sql += " (select name from ad_org o where o.ad_org_id = m.ad_org_id),";
			sql += " m.m_attributesetinstance_id,";
			sql += " m.m_locator_id as locator,";
			sql += " (select m_warehouse_id from m_locator loc where loc.m_locator_id = m.m_locator_id) as M_Warehouse_ID,";
			sql += " m.m_product_id,";
			sql += " COALESCE(sum(m.movementqty),sum(m.movementqty),0) as qtyonhand,";
			sql += " MAX(movementdate) AS datelastrun ";
			sql += " from m_transaction m ";
			if (where.length() > 0) {
				sql += " WHERE " + where;
			}			
			sql += " GROUP BY m.ad_client_id, ";
			sql += " m.ad_org_id,";
			sql += " m.m_locator_id, ";
			sql += " M_Warehouse_ID, ";
			sql += " m.m_attributesetinstance_id, ";
			sql += " m.m_product_id ";  	
			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BigDecimal qtyonhand = rs.getBigDecimal("qtyonhand");
				int M_Product_ID = rs.getInt("M_Product_ID");
				int M_Locator_ID = rs.getInt("locator");
				int M_AttributeSetInstance_ID = rs.getInt("M_AttributeSetInstance_ID");				
				Timestamp datelastrun = rs.getTimestamp("dateLastrun");
				if (M_Locator_ID > 0 && M_Product_ID > 0)
				{
					MStorage storage = MStorage.getCreate (Env.getCtx(), M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID,  get_TrxName());					
					storage.setQtyOnHand(storage.getQtyOnHand().add(qtyonhand));
					storage.setDateLastRun(datelastrun);
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
			ProcessInfo pi = new ProcessInfo ("StorageValidate", 0 /* Process ID */, /* Table_ID*/ 0, 0 /* record_ID */);
			pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
			pi.setAD_Client_ID (Env.getAD_Client_ID(Env.getCtx()));			
			Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
			//
			ProcessInfoParameter pip;
			pip = new ProcessInfoParameter(X_M_Locator.COLUMNNAME_M_Locator_ID, 1000163 , null, null, null);
			tabParams.add(pip);					
			//			
			pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));			
			rr.startProcess(Env.getCtx(), pi, null);								
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}	
}
