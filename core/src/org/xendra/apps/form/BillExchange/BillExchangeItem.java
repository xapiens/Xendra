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
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.xendra.apps.form.BillExchange;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.util.Env;

public class BillExchangeItem {

	private Timestamp DueDate = new Timestamp(System.currentTimeMillis());
	private Timestamp BOEDate = new Timestamp(System.currentTimeMillis());
	private String DocumentNo = "";
	private BigDecimal Total = Env.ZERO;
	private BigDecimal m_WithholdingAmt = Env.ZERO;
	private Integer m_C_Withholding_ID = 0;
	private String ISOCode;
	
	public Timestamp getDueDate() {
		return DueDate;
	}
	public void setDueDate(Timestamp dueDate) {
		DueDate = dueDate;
	}
	public Timestamp getBOEDate() {
		return BOEDate;
	}
	public void setBOEDate(Timestamp bOEDate) {
		BOEDate = bOEDate;
	}
	public String getDocumentNo() {
		return DocumentNo;
	}
	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}
	public BigDecimal getTotal() {
		return Total;
	}
	public void setTotal(BigDecimal total) {
		Total = total;
	}
	
	public void setWithholdingAmt(BigDecimal WithholdingAmt) {
		m_WithholdingAmt = WithholdingAmt;
	}
	
	public BigDecimal getWithholdingAmt()
	{
		return m_WithholdingAmt;
	}
	
	public void setC_Withholding_ID(Integer C_Withholding_ID)
	{
		m_C_Withholding_ID = C_Withholding_ID; 
	}
	public Integer getC_Withholding_ID()
	{
		return m_C_Withholding_ID;
	}
	
	public String getISOCode() {
		return ISOCode;
	}
	public void setISOCode(String iSOCode) {
		ISOCode = iSOCode;
	}
//	public int compareToDate(InvoiceItem dos) {
//	        return this.getDateInvoice().compareTo(dos.getDateInvoice());
//	}
//	public int compareDocTo(InvoiceItem dos) {
//        return this.getDocumentNo().compareTo(dos.getDocumentNo());
//	}
//	public int compareAmount(InvoiceItem dos) {
//		return this.getTotal().compareTo(dos.getTotal());
//	}	
//	public int compareDays(InvoiceItem dos) {
//		return this.getdaysbetween().compareTo(dos.getdaysbetween());
//	}
}
