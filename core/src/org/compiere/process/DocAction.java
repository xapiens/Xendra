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
package org.compiere.process;

import java.util.*;
import java.io.*;
import java.math.*;
import org.compiere.util.*;

/**
 *	Document Action Interface
 *	
 *  @author Jorg Janke
 *  @version $Id: DocAction.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public interface DocAction
{
	/** Restored = RT */
	public static final String ACTION_Restore = "RR";
	/** Placed = PL */
	public static final String ACTION_Placed = "PL";
	/** Returned = RT */
	public static final String ACTION_Returned = "RT";
	/** Complete = CO */
	public static final String ACTION_Complete = "CO";
	/** Wait Complete = WC */
	public static final String ACTION_WaitComplete = "WC";
	/** Approve = AP */
	public static final String ACTION_Approve = "AP";
	/** Reject = RJ */
	public static final String ACTION_Reject = "RJ";
	/** Post = PO */
	public static final String ACTION_Post = "PO";
	/** Void = VO */
	public static final String ACTION_Void = "VO";
	/** Close = CL */
	public static final String ACTION_Close = "CL";
	/** Reverse - Correct = RC */
	public static final String ACTION_Reverse_Correct = "RC";
	/** Reverse - Accrual = RA */
	public static final String ACTION_Reverse_Accrual = "RA";
	/** ReActivate = RE */
	public static final String ACTION_ReActivate = "RE";
	/** <None> = -- */
	public static final String ACTION_None = "--";
	/** Prepare = PR */
	public static final String ACTION_Prepare = "PR";
	/** Unlock = XL */
	public static final String ACTION_Unlock = "XL";
	/** Invalidate = IN */
	public static final String ACTION_Invalidate = "IN";
	/** ReOpen = OP */
	public static final String ACTION_ReOpen = "OP";
	/** BOE - Discount */ 
	public static final String ACTION_Discount = "DS";
	/** BOE - Portfolio */
	public static final String ACTION_Portfolio = "PT";	
	/** Retention - Por Recoger */ 
	public static final String ACTION_ToCollect = "TC";
	/** Retention - Recogidas */ 
	public static final String ACTION_Collect = "CT";
	/** Retention - Aplicadas */ 
	public static final String ACTION_Apply = "AY";	
	/** BOE - Warranty */
	public static final String ACTION_Warranty = "WR";
	/** BOE - Receivables */
	public static final String ACTION_Receivables = "RV";
	/** BOE - Protested */
	public static final String ACTION_Protested = "PD";		
	/** Drafted = DR */
	public static final String STATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String STATUS_Completed = "CO";
	/** Approved = AP */
	public static final String STATUS_Approved = "AP";
	/** Invalid = IN */
	public static final String STATUS_Invalid = "IN";
	/** Not Approved = NA */
	public static final String STATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String STATUS_Voided = "VO";
	/** Reversed = RE */
	public static final String STATUS_Reversed = "RE";
	/** Closed = CL */	
	public static final String STATUS_Closed = "CL";
	/** Placed = PL */
	public static final String STATUS_Placed = "PL";	
	/** Returned = RT */
	public static final String STATUS_Returned = "RT";
	/** Unknown = ?? */
	public static final String STATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String STATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String STATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String STATUS_WaitingConfirmation = "WC";
	/** BOE - Portfolio */
	public static final String STATUS_Portfolio = "PT";
	/** BOE - Warranty */ 
	public static final String STATUS_Warranty = "WR";
	/** BOE -Receivables */
	public static final String STATUS_Receivables = "RV";
	/** BOE -Discount */
	public static final String STATUS_Discount = "DS";
	/** BOE - Protested */ 
	public static final String STATUS_Protested = "PD";
	/** Retention - Por Recoger */ 
	public static final String STATUS_ToCollect = "TC";
	/** Retention - Recogidas */ 
	public static final String STATUS_Collect = "CT";
	/** Retention - Aplicadas */ 
	public static final String STATUS_Apply = "AY";
	/** 	 */
	public static final String STATUS_Restored = "RR";
	/** DocAction Ref_List values **/
	public static final int AD_REFERENCE_ID = 135;
	


	/**
	 * 	Set Doc Status
	 *	@param newStatus new Status
	 */
	public void setDocStatus (String newStatus);

	/**
	 * 	Get Doc Status
	 *	@return Document Status
	 */
	public String getDocStatus();
	
	
	/*************************************************************************
	 * 	Process document
	 *	@param action document action
	 *	@return true if performed
	 *	@throws Exception
	 */
	public boolean processIt (String action) throws Exception;
	
	/**
	 * 	Unlock Document.
	 * 	@return true if success 
	 */
	public boolean unlockIt();
	/**
	 * 	Invalidate Document
	 * 	@return true if success 
	 */
	public boolean invalidateIt();
	/**
	 *	Prepare Document
	 * 	@return new status (In Progress or Invalid) 
	 */
	public String prepareIt();
	/**
	 * 	Approve Document
	 * 	@return true if success 
	 */
	public boolean  approveIt();
	/**
	 * 	Reject Approval
	 * 	@return true if success 
	 */
	public boolean rejectIt();
	/**
	 * 	Complete Document
	 * 	@return new status (Complete, In Progress, Invalid, Waiting ..)
	 */
	public String completeIt();
	/**
	 * 	Void Document
	 * 	@return true if success 
	 */
	public boolean voidIt();
	/**
	 * 	Placed Document
	 * 	@return true if success 
	 */
	public String placedIt();
	/**
	 * Returned Document
	 * @return true if sucess
	 */
	public String returnedIt();
	/**
	 * 	Close Document
	 * 	@return true if success 
	 */
	public boolean closeIt();
	/**
	 * 	Reverse Correction
	 * 	@return true if success 
	 */
	public boolean reverseCorrectIt();
	/**
	 * 	Reverse Accrual
	 * 	@return true if success 
	 */
	public boolean reverseAccrualIt();
	/** 
	 * 	Re-activate
	 * 	@return true if success 
	 */
	public boolean reActivateIt();
	
	/** 
	 * 	Restore
	 * 	@return true if success 
	 */
	public boolean RestoreIt();

	/**************************************************************************
	 * 	Get Summary
	 *	@return Summary of Document
	 */
	public String getSummary();

	/**
	 * 	Get Document No
	 *	@return Document No
	 */
	public String getDocumentNo();

	/**
	 * 	Get Document Info
	 *	@return Type and Document No
	 */
	public String getDocumentInfo();

	/**
	 * 	Create PDF
	 *	@return file
	 */
	public File createPDF ();
	
	/**
	 * 	Get Process Message
	 *	@return clear text message
	 */
	public String getProcessMsg ();
	
	/**
	 * 	Get Document Owner
	 *	@return AD_User_ID
	 */
	public int getDoc_User_ID();
	
	/**
	 * 	Get Document Currency
	 *	@return C_Currency_ID
	 */
	public int getC_Currency_ID();

	/**
	 * 	Get Document Approval Amount
	 *	@return amount
	 */
	public BigDecimal getApprovalAmt();

	/**
	 * 	Get Document Client
	 *	@return AD_Client_ID
	 */
	public int getAD_Client_ID();

	/**
	 * 	Get Document Organization
	 *	@return AD_Org_ID
	 */
	public int getAD_Org_ID();

	/**
	 * 	Get Doc Action
	 *	@return Document Action
	 */
	public String getDocAction();

	/**
	 * 	Save Document
	 *	@return true if saved
	 */
	public boolean save();
	
	/**
	 * 	Get Context
	 *	@return context
	 */
	public Properties getCtx();
	
	/**
	 * 	Get ID of record
	 *	@return ID
	 */
	public int get_ID();
	
	/**
	 * 	Get AD_Table_ID
	 *	@return AD_Table_ID
	 */
	public int get_Table_ID();
	
	/**
	 * 	Get Logger
	 *	@return logger
	 */
	public CLogger get_Logger();

	/**
	 * 	Get Transaction
	 *	@return trx name
	 */
	public String get_TrxName();
	
	public void setProcessMsg(String msg);

}	//	DocAction
