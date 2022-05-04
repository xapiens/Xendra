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
package org.xendra.process;

import java.sql.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_M_Product;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.*;

import org.xendra.Constants;
import org.xendra.annotations.*;

/**
 *	Load Transaction
 *	
 *  @author xapiens
 *  @version $Id: LoadTransaction.java 1109 2009-12-24 13:41:29Z xapiens $
 */
@XendraProcess(value="LoadTransaction",
name="LoadTransaction", 				   
description="Load Transaction", 
help="Load Transaction",
Identifier="76bd5c50-fde0-6501-0191-58acd0841805",
classname="org.xendra.process.LoadTransaction",
updated="2017-10-02 11:51:12")
public class LoadTransaction extends SvrProcess
{
	/**	Client	*/
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
	Identifier="15a0b81c-422c-cf66-abf6-e7feb46930da")	
	private int  p_AD_Client_ID = 0;	

	/**	Cost Element		*/
	@XendraProcessParameter(Name="Cost Element",
	ColumnName="M_CostElement_ID",
	Description="Product Cost Element",
	Help="",
	AD_Reference_ID=DisplayType.TableDir,
	SeqNo=20,
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
	Identifier="5589e65c-38b9-0bf7-0e14-b01d4ced5222")	
	private int	p_M_CostElement_ID = 0;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				p_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("M_CostElement_ID"))
				p_M_CostElement_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	public String doIt () throws Exception
	{
		log.info("AD_Client_ID=" + p_AD_Client_ID + ", M_CostElement_ID=" + p_M_CostElement_ID);
		CallableStatement stmt = null;
		try {
			String function = "{call xendra.loadmaterial(?,?)}";
			stmt = DB.prepareCall(function, ResultSet.CONCUR_READ_ONLY, null);
			stmt.setInt(1, p_AD_Client_ID);
			stmt.setInt(2, p_M_CostElement_ID);
			stmt.execute();
			stmt.close();
		}
		catch (Exception e)
		{
			if (stmt != null)
				stmt.close();				
			throw new Exception();
		}		
		return null;
	}	//	doIt
	
}	//	LoadTransaction
