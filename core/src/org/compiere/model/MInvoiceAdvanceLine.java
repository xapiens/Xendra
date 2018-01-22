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

import org.compiere.model.persistence.X_C_InvoiceAdvanceLine;
import org.compiere.process.DocAction;
import org.compiere.util.*;

/**
 *	Invoice Advance Line
 *	
 *  @author xapiens
 *  @version $Id
 */
public class MInvoiceAdvanceLine extends X_C_InvoiceAdvanceLine
{
			
	/** Static Logger					*/
	private static CLogger 	s_log = CLogger.getCLogger(MInvoiceAdvanceLine.class);
	/** Cache of Price Lists			*/
	private static CCache<Integer,MInvoiceAdvanceLine> s_cache = new CCache<Integer,MInvoiceAdvanceLine>("C_InvoiceAdvanceLine", 5);
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_InvoiceAdvanceLine_ID id
	 *	@param trxName transaction
	 */
	public MInvoiceAdvanceLine(Properties ctx, int C_InvoiceAdvanceLine_ID, String trxName)
	{
		super(ctx, C_InvoiceAdvanceLine_ID, trxName);
		if (C_InvoiceAdvanceLine_ID == 0)
		{
			
		}
	}	//	MInvoiceAdvanceLine

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MInvoiceAdvanceLine (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MInvoiceAdvanceLine
	
	public boolean beforeDelete()
	{
		int C_Invoice_ID = 0;
		C_Invoice_ID = DB.getSQLValue(null,"SELECT C_invoice_id from c_invoiceline where c_invoiceline_id = ? ", getC_InvoiceLine_ID());
		if ( C_Invoice_ID > 0 )
		{
			MInvoice invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID);
			if  ( invoice.getDocStatus().equals(DocAction.STATUS_Completed) || 
				  invoice.getDocStatus().equals(DocAction.STATUS_Closed) )
			{
				return false;
			}
			else
			{
				int no = DB.executeUpdate("DELETE FROM C_InvoiceLine WHERE C_InvoiceLine_ID = ? ", getC_InvoiceLine_ID(),  get_TrxName());
				if ( no < 0 )
					return false;
			}
		}
		return true;
	}

	public MInvoiceAdvance getParent() {
		MInvoiceAdvance ia = MInvoiceAdvance.get(Env.getCtx(),getC_InvoiceAdvance_ID(), null);
		return ia;
	}	
}	//	MInvoiceAdvanceLine
