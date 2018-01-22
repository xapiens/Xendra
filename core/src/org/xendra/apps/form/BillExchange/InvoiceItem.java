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

public class InvoiceItem {

	private Timestamp m_DateInvoice;
	private String m_Serial;
	private String m_DocumentNo;
	private String m_TaxID;
	private Integer m_DaysBetween;
	private Integer m_C_Invoice_ID;
	private Boolean m_IsInvoice = false;
	private BigDecimal m_Total = Env.ZERO;
	private BigDecimal m_Open = Env.ZERO;
	private BigDecimal m_Retention = Env.ZERO;
	private BigDecimal m_WithholdingAmt = Env.ZERO;
	private Integer m_C_Withholding_ID = 0;

	public void setDateInvoice(Timestamp dateInvoice) {
		m_DateInvoice = dateInvoice;		
	}

	public Timestamp getDateInvoice() {
		return m_DateInvoice;		
	}

	public void setSerial(String serial) {			
		if (serial == null)
			serial = "";
		if (serial.length() > 0)
			serial = serial + "-";
		m_Serial = serial;
	}

	public String getSerial() {		
		return m_Serial;		
	}

	public void setDocumentNo(String documentNo) {
		m_DocumentNo = documentNo;		
	}

	public String getDocumentNo() {
		return m_DocumentNo;		
	}
	
	public void setTaxID(String TaxID) {
		m_TaxID = TaxID;
	}
	
	public String getTaxID() {
		return m_TaxID;
	}
	
	public void setTotal(BigDecimal total) {
		m_Total = total;		
	}
	
	public BigDecimal getTotal()
	{
		return m_Total;
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
	
	public void setOpen(BigDecimal open) {
		m_Open = open;
	}
	
	public BigDecimal getOpen() {
		return m_Open;
	}

	public void setRetention(BigDecimal retention) {
		m_Retention = retention;
	}
	public BigDecimal getRetention() {		
		return m_Retention;
	}

	public void setdaysbetween(Integer daysbetween) {
		m_DaysBetween = daysbetween;		
	}
	public Integer getdaysbetween()
	{
		return m_DaysBetween;
	}

	public void setIsInvoice(boolean IsInvoice) {
		m_IsInvoice = IsInvoice;		
	}
	
	public Boolean IsInvoice() {
		return m_IsInvoice;
	}

	public int compareToDate(InvoiceItem dos) {
	        return this.getDateInvoice().compareTo(dos.getDateInvoice());
	}
	public int compareDocTo(InvoiceItem dos) {
        return this.getDocumentNo().compareTo(dos.getDocumentNo());
	}
	public int compareAmount(InvoiceItem dos) {
		return this.getTotal().compareTo(dos.getTotal());
	}	
	public int compareDays(InvoiceItem dos) {
		return this.getdaysbetween().compareTo(dos.getdaysbetween());
	}

	public int getC_Invoice_ID() {
		return m_C_Invoice_ID;
	}
	public void setC_Invoice_ID(int C_Invoice_ID) {
		m_C_Invoice_ID = C_Invoice_ID;
	}
}
