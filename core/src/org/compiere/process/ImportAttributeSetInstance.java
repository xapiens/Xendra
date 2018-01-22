/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
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
 * Contributor: Carlos Ruiz - globalqss                                       *
 *****************************************************************************/
package org.compiere.process;

import java.math.*;
import java.sql.*;
import java.util.logging.*;

import org.compiere.model.MAttributeSetInstance;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProduct;
import org.compiere.model.persistence.X_I_AttributeSetInstance;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Import Lot from Order, InOut
 *
 * 	@author 	xapiens
 * 	@version 	$Id: ImportBPartner.java 1176 2010-04-01 04:11:40Z xapiens $
 */
@XendraProcess(value="Import_Lot",
name="Import Lot",
description="Import Lot",
help="",
Identifier="ca633a0f-2f08-0210-97ca-4be40bbc1ea4",
classname="org.compiere.process.ImportAttributeSetInstance",
updated="2015-06-20 10:10:12")	
public class ImportAttributeSetInstance extends SvrProcess
{
	/**	Client to be imported to		*/
	@XendraProcessParameter(Name="AD_Client_ID",
			                ColumnName="AD_Client_ID",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=10,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="69403535-7596-fae2-d45c-0b47385e82b2")	
	private int				m_AD_Client_ID = 0;
	/**	Delete old Imported				*/
	private boolean			m_deleteOldImported = false;

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("DeleteOldImported"))
				m_deleteOldImported = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare


	/**
	 *  Perrform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{		
		StringBuffer sql = null;
		int no = 0;
		String clientCheck = " AND AD_Client_ID=" + m_AD_Client_ID;

		//	****	Prepare	****

		//	Delete Old Imported
		if (m_deleteOldImported)
		{
			sql = new StringBuffer ("DELETE FROM I_AttributeSetInstance "
				+ "WHERE I_IsImported='Y'").append(clientCheck);
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("Delete Old Impored =" + no);
		}

		//	Set Client, Org, IsActive, Created/Updated
		sql = new StringBuffer ("UPDATE I_AttributeSetInstance "
			+ "SET AD_Client_ID = COALESCE (AD_Client_ID, ").append(m_AD_Client_ID).append("),"
			+ " AD_Org_ID = COALESCE (AD_Org_ID, 0),"
			+ " IsActive = COALESCE (IsActive, 'Y'),"
			+ " Created = COALESCE (Created, CURRENT_TIMESTAMP),"
			+ " CreatedBy = COALESCE (CreatedBy, 0),"
			+ " Updated = COALESCE (Updated, CURRENT_TIMESTAMP),"
			+ " UpdatedBy = COALESCE (UpdatedBy, 0),"
			+ " I_ErrorMsg = ' ',"
			+ " I_IsImported = 'N' "
			+ "WHERE I_IsImported<>'Y' OR I_IsImported IS NULL");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Reset=" + no);

		//	Value
		sql = new StringBuffer ("UPDATE I_AttributeSetInstance i "
			+ "SET M_Product_ID=(SELECT p.M_Product_ID FROM M_Product p"
			+ " WHERE i.ProductValue = p.Value  AND i.AD_Client_ID = p.AD_Client_ID) "
			+ " WHERE i.M_Product_ID IS NULL"
			+ " AND I_IsImported='N' ").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Product Existing Value=" + no);
		
		sql = new StringBuffer ("UPDATE I_AttributeSetInstance "
				  + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Invalid Product, ' "
				  + "WHERE M_Product_ID IS NULL AND ProductValue IS NOT NULL"
				  + " AND I_IsImported<>'Y'").append (clientCheck);
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			if (no != 0)
				log.warning ("Invalid Product=" + no);
		
		commit();
		//	-------------------------------------------------------------------
		int noInsert = 0;
		int noUpdate = 0;

		//	Go through Records
		sql = new StringBuffer ("SELECT * FROM I_AttributeSetInstance "
			+ "WHERE I_IsImported='N'").append(clientCheck);
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			MInOut inout = null;
			MInOutLine[] inoutlines = null;
			MOrder order = null;
			MOrderLine[] orderlines = null;
			while (rs.next())
			{
				X_I_AttributeSetInstance impASI = new X_I_AttributeSetInstance (getCtx(), rs, get_TrxName());
								
				log.fine("C_Order_ID=" + impASI.getC_Order_ID()
					+ ", M_InOut_ID=" + impASI.getM_InOut_ID()
					+ ", M_Product_ID=" + impASI.getM_Product_ID());

				
				
				//	****	Create/Update Document	****

				if (impASI.getM_InOut_ID() != 0 && inout == null)
				{
					inout = new MInOut(Env.getCtx(), impASI.getM_InOut_ID(), get_TrxName());
					if (inout.getM_InOut_ID() != 0)
					{
						inoutlines = inout.getLines();
					}
					else
						return "no se pudo cargar la guia";
				}
				else if (impASI.getC_Order_ID() != 0 && order == null )
				{
					order = new MOrder(Env.getCtx(), impASI.getC_Order_ID(), get_TrxName());
					if (order.getC_Order_ID() != 0)
					{
						orderlines = order.getLines();
					}
					else
						return "No se pudo cargar la orden ";
				}				
				if (impASI.getM_InOut_ID() != 0 && inout != null && inoutlines != null)
				{
					for (int i = 0; i < inoutlines.length; i++)
					{
						MInOutLine ioline = inoutlines[i];
						if (ioline.getM_Product_ID() == impASI.getM_Product_ID())
						{
							MProduct product = MProduct.get(Env.getCtx(), impASI.getM_Product_ID(), get_TrxName());
							if (product.getM_AttributeSet_ID() == 0)
								continue;
							MAttributeSetInstance masi = MAttributeSetInstance.create(Env.getCtx(), product,  get_TrxName());
							masi.setLot(impASI.getLot());
							if (impASI.getGuaranteeDate() != null)
								masi.setGuaranteeDate(impASI.getGuaranteeDate());
							masi.setDescription();
							masi.save();
							ioline.setM_AttributeSetInstance_ID(masi.getM_AttributeSetInstance_ID());
							ioline.save();	
							noInsert++;
							break;
						}
					}
				}
				else if (impASI.getC_Order_ID() != 0 && order != null && orderlines != null )
				{
					for (int i = 0; i < orderlines.length; i++)
					{
						MOrderLine oline = orderlines[i];
						if (oline.getM_Product_ID() == impASI.getM_Product_ID())
						{
							MProduct product = MProduct.get(Env.getCtx(), impASI.getM_Product_ID(), get_TrxName());
							if (product.getM_AttributeSet_ID() == 0)
								continue;							
							MAttributeSetInstance masi = MAttributeSetInstance.create(Env.getCtx(), product,  get_TrxName());
							masi.setLot(impASI.getLot());
							if (impASI.getGuaranteeDate() != null)
								masi.setGuaranteeDate(impASI.getGuaranteeDate());
							masi.setDescription();
							masi.save();
							oline.setM_AttributeSetInstance_ID(masi.getM_AttributeSetInstance_ID());
							oline.save();
							noInsert++;
							break;
						}
					}					
				}
				//
				impASI.setI_IsImported(true);
				impASI.setProcessed(true);
				impASI.setProcessing(false);
				impASI.save();
				commit();
			}	//	for all I_AttributeSetInstance
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "", e);
			rollback();
		}

		//	Set Error to indicator to not imported
		sql = new StringBuffer ("UPDATE I_AttributeSetInstance "
			+ "SET I_IsImported='N', Updated=CURRENT_TIMESTAMP "
			+ "WHERE I_IsImported<>'Y'").append(clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@M_AttributeSetInstance_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdate), "@M_AttributeSetInstance_ID@: @Updated@");
		return "";
	}	//	doIt

}	//	ImportAttributeSetInstance
