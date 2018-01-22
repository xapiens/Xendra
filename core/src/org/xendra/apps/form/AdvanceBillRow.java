package org.xendra.apps.form;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import org.compiere.model.MCurrency;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.objectview.RowBase;

public class AdvanceBillRow extends RowBase {
	Boolean Select;
	Timestamp date;
	String C_DocTypeName;
	String DocumentNo;
	String Serial;
	String ISOCode;
	Integer C_Invoice_ID;
	Integer C_Charge_ID;
	Integer C_Currency_ID;
	Integer C_InvoiceAdvance_ID;
	BigDecimal Amount;
	BigDecimal MaxAmount;
	BigDecimal ConvertedAmount;		
	BigDecimal AmountUsed;
	BigDecimal Total;
	
	public Integer getC_Charge_ID() {
		return C_Charge_ID;
	}
	public void setC_Charge_ID(Integer c_Charge_ID) {
		C_Charge_ID = c_Charge_ID;
	}
	public Integer getC_InvoiceAdvance_ID() {
		if (C_InvoiceAdvance_ID == 0)
			return 0;
		return C_InvoiceAdvance_ID;
	}
	public void setC_InvoiceAdvance_ID(Integer c_InvoiceAdvance_ID) {
		C_InvoiceAdvance_ID = c_InvoiceAdvance_ID;
	}
	public BigDecimal getAmountUsed() {
		return AmountUsed;
	}
	public void setAmountUsed(BigDecimal amountUsed) {
		AmountUsed = amountUsed;
	}
	public BigDecimal getMaxAmount() {
		return MaxAmount;
	}
	public void setMaxAmount(BigDecimal maxAmount) {
		MaxAmount = maxAmount;
	}
	public String getISOCode() {
		return ISOCode;
	}
	public void setISOCode(String iSOCode) {
		ISOCode = iSOCode;
	}
	public Integer getC_Invoice_ID() {
		return C_Invoice_ID;
	}
	public void setC_Invoice_ID(Integer cInvoiceID) {
		C_Invoice_ID = cInvoiceID;
	}
	public String getC_DocTypeName() {
		return C_DocTypeName;
	}
	public void setC_DocTypeName(String cDocTypeName) {
		C_DocTypeName = cDocTypeName;
	}
	public Boolean getSelect() {
		return Select;
	}
	public void setSelect(Boolean select) {
		Select = select;
	}
	public Timestamp getDateInvoiced() {
		return date;
	}
	public void setDateInvoiced(Timestamp date) {
		this.date = date;
	}
	public String getDocumentNo() {
		return DocumentNo;
	}
	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}
	public String getSerial() {
		return Serial;
	}
	public void setSerial(String serial) {
		Serial = serial;
	}
	public Integer getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_Currency_ID(Integer cCurrencyID) {
		if (cCurrencyID == null)
		{
			ISOCode = "";
			C_Currency_ID = 0;
			return;
		}		
		C_Currency_ID = cCurrencyID;
		MCurrency currency = MCurrency.get(Env.getCtx(), cCurrencyID);
		ISOCode = currency.getISO_Code();
		
	}	
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		if (amount == null)
			amount = Env.ZERO;		
		if (amount.compareTo(MaxAmount) > 0)
			amount = MaxAmount;
		Amount = amount;
		String sql =  "SELECT currencyConvert(?,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as ConvertedAmount from C_Invoice i where C_Invoice_ID = ? "; //  6   #1  Converted
		Collection<Object> params = new ArrayList<Object>();
		params.add(amount);
		params.add(C_Currency_ID);
		params.add(C_Invoice_ID);
		ConvertedAmount = DB.getSQLValueBD(null, sql, params);
	}
	public BigDecimal getConvertedAmount() {
		return ConvertedAmount;
	}
	public void setConvertedAmount(BigDecimal convertedAmount) {
		ConvertedAmount = convertedAmount;
	}
	public BigDecimal getTotal() {
		return Total;
	}
	public void setTotal(BigDecimal total) {
		Total = total;
	}		
}
