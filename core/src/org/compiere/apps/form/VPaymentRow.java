package org.compiere.apps.form;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

import org.compiere.apps.ADialog;
import org.compiere.model.MConversionRate;
import org.compiere.model.MCurrency;
import org.compiere.model.MPayment;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.IObjetViewColumn;

public class VPaymentRow extends RowBase{
	Timestamp TrxDate = new Timestamp(System.currentTimeMillis());
	Boolean Select = false;
	String DocumentNo = "";
	String ISOCode = "";
	Integer C_Payment_ID = 0;
	Integer C_Currency_ID = 0;
	Integer C_ConversionType_ID = 0;
	Boolean MultiCurrency = false;
	BigDecimal Amount = Env.ZERO;
	BigDecimal ConvertedAmount = Env.ZERO;
	BigDecimal OpenAmt = Env.ZERO;
	BigDecimal AppliedAmt = Env.ZERO;
	private int StdPrecision = 4;
	private MPayment m_payment;			
	
	public Integer getC_ConversionType_ID() {
		return C_ConversionType_ID;
	}
	public void setC_ConversionType_ID(Integer cConversionTypeID) {
		C_ConversionType_ID = cConversionTypeID;
	}
	public String getISOCode() {
		return ISOCode;
	}
	public void setISOCode(String iSOCode) {
		ISOCode = iSOCode;
	}
	public MPayment getPayment() {
		if (C_Payment_ID == 0)
			return null;
		else
		{
			if (m_payment == null)
			{
				m_payment = new MPayment(Env.getCtx(), C_Payment_ID, null);
			}
			return m_payment;
		}
	}
	
	public Integer getC_Payment_ID() {
		return C_Payment_ID;
	}
	public void setC_Payment_ID(Integer cPaymentID) {
		if (cPaymentID == null)
			return;
		MPayment payment = new MPayment(Env.getCtx(), cPaymentID, null);
		DocumentNo = payment.getDocumentNo();
		ISOCode = MCurrency.getISO_Code(Env.getCtx(),payment.getC_Currency_ID());
		C_Payment_ID = cPaymentID;
	}
	public Timestamp getTrxDate() {
		return TrxDate;
	}
	public void setTrxDate(Timestamp trxDate) {
		TrxDate = trxDate;
	}
	public Boolean getSelect() {
		return Select;
	}
	public void setSelect(Boolean select) {
		if (Select != select)
		{
			if (select)
				setAppliedAmt(this.getOpenAmt());
			else
				setAppliedAmt(Env.ZERO);
			setIsChanged(true);		
			Select = select;
		}
	}
	public String getDocumentNo() {
		return DocumentNo;
	}
	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}
	public Integer getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_Currency_ID(Integer cCurrencyID) {
		C_Currency_ID = cCurrencyID;
	}
	public Boolean getMultiCurrency() {
		return MultiCurrency;
	}
	public void setMultiCurrency(Boolean multiCurrency) {
		MultiCurrency = multiCurrency;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	public BigDecimal getConvertedAmount() {
		return ConvertedAmount;
	}
	public void setConvertedAmount(BigDecimal convertedAmount) {
		ConvertedAmount = convertedAmount;
	}
	public BigDecimal getOpenAmt() {
		return OpenAmt;
	}
	public void setOpenAmt(BigDecimal openAmt) {
		if (openAmt == null)
			openAmt = Env.ZERO;
		openAmt = openAmt.setScale(StdPrecision , BigDecimal.ROUND_HALF_UP);
		OpenAmt = openAmt;
	}
	public BigDecimal getAppliedAmt() {
		return AppliedAmt;
	}
	public void setAppliedAmt(BigDecimal appliedAmt) {
		if (appliedAmt == null)
		{
			if (Select)
				setAppliedAmt(this.getOpenAmt());
			else
				setAppliedAmt(Env.ZERO);
		}
		appliedAmt = appliedAmt.setScale(StdPrecision , BigDecimal.ROUND_HALF_UP);
		AppliedAmt = appliedAmt;
	}
	
	public static IObjetViewColumn[] getColumns() {
		Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {						
			getter = VPaymentRow.class.getDeclaredMethod("getSelect", null);
		    setter = VPaymentRow.class.getDeclaredMethod("setSelect", new Class[] {Boolean.class});
		    newcolumns.add(new DefaultTableViewColumn ( Msg.getMsg(Env.getCtx(), "Select"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		false /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VPaymentRow.class.getDeclaredMethod("getTrxDate", null);
			setter = null;
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "Date"), 		    		
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VPaymentRow.class.getDeclaredMethod("getDocumentNo", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VPaymentRow.class.getDeclaredMethod("getISOCode", null);
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "C_Currency_ID"),
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));

		    //
			getter = VPaymentRow.class.getDeclaredMethod("getAmount", null);
		    newcolumns.add(new DefaultTableViewColumn ( Msg.getMsg(Env.getCtx(), "Amount"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));			    		    
			getter = VPaymentRow.class.getDeclaredMethod("getConvertedAmount", null);
		    newcolumns.add(new DefaultTableViewColumn(Msg.getMsg(Env.getCtx(), "ConvertedAmount"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VPaymentRow.class.getDeclaredMethod("getOpenAmt", null);
			setter = VPaymentRow.class.getDeclaredMethod("setOpenAmt", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn(
		    		Msg.getMsg(Env.getCtx(), "Open"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true  /* visible */,
		    		null  /* format  */ ,
		    		true /* sortable */,
		    		false /* searchable */, 
		    		false, 0, 0));
			getter = VPaymentRow.class.getDeclaredMethod("getAppliedAmt", null);
			setter = VPaymentRow.class.getDeclaredMethod("setAppliedAmt", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn(
		    		Msg.getMsg(Env.getCtx(), "AppliedAmt"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true  /* visible */,
		    		null  /* format  */ ,
		    		true /* sortable */,
		    		false /* searchable */, 
		    		false, 0, 0));
		    
		    //
		} catch (Exception e) {
			e.printStackTrace();
		}
	    IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
        newcolumns.toArray(columns);
        return columns;		  
	}
	
	
}
