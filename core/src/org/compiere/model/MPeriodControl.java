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

import org.compiere.model.persistence.X_C_PeriodControl;
import org.compiere.model.reference.REF_C_PeriodControlAction;
import org.compiere.model.reference.REF_C_PeriodControlStatus;

/**
 *	Period Control Model	
 *	
 *  @author Jorg Janke
 *  @version $Id: MPeriodControl.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MPeriodControl extends X_C_PeriodControl
{
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_PeriodControl_ID 0
	 *	@param trxName transaction
	 */
	public MPeriodControl (Properties ctx, int C_PeriodControl_ID, String trxName)
	{
		super(ctx, C_PeriodControl_ID, trxName);
		if (C_PeriodControl_ID == 0)
		{
		//	setC_Period_ID (0);
		//	setDocBaseType (null);
			setPeriodAction (REF_C_PeriodControlAction.NoAction);
			setPeriodStatus (REF_C_PeriodControlStatus.NeverOpened);
		}
	}	//	MPeriodControl

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MPeriodControl (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MPeriodControl

	/**
	 * 	Parent Constructor
	 *	@param period parent
	 *	@param DocBaseType doc base type
	 */
	public MPeriodControl (MPeriod period, String DocBaseType)
	{
		this (period.getCtx(), period.getAD_Client_ID(), period.getC_Period_ID(),  
			DocBaseType, period.get_TrxName());
	}	//	MPeriodControl

	/**
	 * 	New Constructor
	 *	@param ctx context
	 *	@param AD_Client_ID client
	 *	@param C_Period_ID period
	 *	@param DocBaseType doc base type
	 *	@param trxName transaction
	 */
	public MPeriodControl (Properties ctx, int AD_Client_ID, int C_Period_ID, 
		String DocBaseType, String trxName)
	{
		this (ctx, 0, trxName);
		setClientOrg(AD_Client_ID, 0);
		setC_Period_ID (C_Period_ID);
		setDocBaseType (DocBaseType);
	}	//	MPeriodControl

	/**
	 * 	Is Period Open
	 *	@return true if open
	 */
	public boolean isOpen()
	{
		return REF_C_PeriodControlStatus.Open.equals(getPeriodStatus());
	}	//	isOpen

	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MPeriodControl[");
		sb.append(get_ID()).append(",").append(getDocBaseType())
			.append(",Status=").append(getPeriodStatus())
			.append ("]");
		return sb.toString ();
	}	//	toString
	
}	//	MPeriodControl

