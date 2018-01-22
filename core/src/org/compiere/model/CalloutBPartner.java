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

import java.util.*;

import org.compiere.model.reference.REF_C_BP_DocTypeI;
import org.xendra.utils.Sunat;


/**
 *	BPartner Callouts	
 *	
 *  @author xapiens
 *  @version $Id: 
 */
public class CalloutBPartner extends CalloutEngine
{


	/**
	 *	Partner - Ruc es valido
	 *	@param ctx
	 *	@param WindowNo
	 *	@param mTab
	 *	@param mField
	 *	@param value
	 *	@return error message or ""
	 */
	public String sunat (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		String BP_DocTypeI = (String)mTab.getValue("C_BP_DocTypeI");
		
		if (!Sunat.isValidRUC((String) value) && BP_DocTypeI.compareTo(REF_C_BP_DocTypeI.RUC) == 0 )
		{
			mTab.fireDataStatusEEvent ("RUC Invalido",  value.toString(), false);
		}
		return "";
	}	//	sunat

}	//	CalloutBPartner
