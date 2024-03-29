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

import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_ProjectIssue;
import org.compiere.util.*;

/**
 * 	Project Issue Model
 *
 *	@author Jorg Janke
 *	@version $Id: MProjectIssue.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MProjectIssue extends X_C_ProjectIssue
{

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_ProjectIssue_ID id
	 *	@param trxName transaction
	 */
	public MProjectIssue (Properties ctx, int C_ProjectIssue_ID, String trxName)
	{
		super (ctx, C_ProjectIssue_ID, trxName);
		if (C_ProjectIssue_ID == 0)
		{
		//	setC_Project_ID (0);
		//	setLine (0);
		//	setM_Locator_ID (0);
		//	setM_Product_ID (0);
		//	setMovementDate (new Timestamp(System.currentTimeMillis()));
			setMovementQty (Env.ZERO);
			setPosted (false);
			setProcessed (false);
		}
	}	//	MProjectIssue

	/**
	 * 	Load Constructor
	 * 	@param ctx context
	 * 	@param rs result set
	 *	@param trxName transaction
	 */
	public MProjectIssue (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MProjectIssue

	/**
	 * 	New Parent Constructor
	 *	@param project parent
	 */
	public MProjectIssue (MProject project)
	{
		this (project.getCtx(), 0, project.get_TrxName());
		setClientOrg(project.getAD_Client_ID(), project.getAD_Org_ID());
		setC_Project_ID (project.getC_Project_ID());	//	Parent
		setLine (getNextLine());
		m_parent = project;
		//
	//	setM_Locator_ID (0);
	//	setM_Product_ID (0);
		//
		setMovementDate (new Timestamp(System.currentTimeMillis()));
		setMovementQty (Env.ZERO);
		setPosted (false);
		setProcessed (false);
	}	//	MProjectIssue

	/**	Parent				*/
	private MProject	m_parent = null;
	
	/**
	 *	Get the next Line No
	 * 	@return next line no
	 */
	private int getNextLine()
	{
		return DB.getSQLValue(get_TrxName(), 
			"SELECT COALESCE(MAX(Line),0)+10 FROM C_ProjectIssue WHERE C_Project_ID=?", getC_Project_ID());
	}	//	getLineFromProject

	/**
	 * 	Set Mandatory Values
	 *	@param M_Locator_ID locator
	 *	@param M_Product_ID product
	 *	@param MovementQty qty
	 */
	public void setMandatory (int M_Locator_ID, int M_Product_ID, BigDecimal MovementQty)
	{
		setM_Locator_ID (M_Locator_ID);
		setM_Product_ID (M_Product_ID);
		setMovementQty (MovementQty);
	}	//	setMandatory

	/**
	 * 	Get Parent
	 *	@return project
	 */
	public MProject getParent()
	{
		if (m_parent == null && getC_Project_ID() != 0)
			m_parent = new MProject (getCtx(), getC_Project_ID(), get_TrxName());
		return m_parent;
	}	//	getParent
	
	/**************************************************************************
	 * 	Process Issue
	 *	@return true if processed
	 */
	public boolean process()
	{
		if (!save())
			return false;
		if (getM_Product_ID() == 0)
		{
			log.log(Level.SEVERE, "No Product");
			return false;
		}

		MProduct product = MProduct.get (getCtx(), getM_Product_ID(), get_TrxName());

		//	If not a stocked Item nothing to do
		if (!product.isStocked())
		{
			setProcessed(true);
			return save();
		}

		/** @todo Transaction */
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();
		//	**	Create Material Transactions **
		// 10/09/07 el_man
		MLocator loc = MLocator.get(getCtx(), getM_Locator_ID());
		BigDecimal BalanceQty = MStorage.getQtyAvailable(loc.getM_Warehouse_ID(),getM_Product_ID(), 0 ,get_TrxName() );
//		MTransaction mTrx = new MTransaction (getCtx(), getAD_Org_ID(), 
//			REF_MovementType.WorkOrderPlus,
//			getM_Locator_ID(), getM_Product_ID(), getM_AttributeSetInstance_ID(),
//			getMovementQty().negate(), getMovementDate(), get_TrxName());
//		mTrx.setC_ProjectIssue_ID(getC_ProjectIssue_ID());
//		mTrx.setMovementQtyBalance(BalanceQty);
		//		
		String error = MStorage.add(getCtx(), loc.getM_Warehouse_ID(), getM_Locator_ID(), 
				getM_Product_ID(), getM_AttributeSetInstance_ID(), getM_AttributeSetInstance_ID(),
				getMovementQty().negate(), null, null, false,C_Period_ID,
				"MProjectIssue.process",
				get_TrxName());
		if (error.length() == 0)
		{
			//if (mTrx.save(get_TrxName()))
			//{
				setProcessed (true);
				if (save())
					return true;
				else
					log.log(Level.SEVERE, "Issue not saved");		//	requires trx !!
			//}
			//else
			//	log.log(Level.SEVERE, "Transaction not saved");	//	requires trx !!
		}
		else
			log.log(Level.SEVERE, error);			//	OK
		//
		return false;
	}	//	process

}	//	MProjectIssue
