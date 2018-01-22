package org.xendra.apps.form;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Vector;

import org.compiere.model.MCurrency;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.IObjetViewColumn;

public class CPortafolioRow extends RowBase {

	Timestamp DueDate = new Timestamp(System.currentTimeMillis());
	String DocumentNo = "";
	String ISOCode = "";
	Integer C_Currency_ID = 0;
	Integer C_BOE_ID = 0;
	Timestamp DateBOE = new Timestamp(System.currentTimeMillis());
	BigDecimal OpenAmt = Env.ZERO;
	
	public Integer getC_BOE_ID() {
		return C_BOE_ID;
	}
	public void setC_BOE_ID(Integer cBOEID) {
		C_BOE_ID = cBOEID;
	}
	public Timestamp getDueDate() {
		return DueDate;
	}
	public void setDueDate(Timestamp dueDate) {
		DueDate = dueDate;
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
		ISOCode = MCurrency.getISO_Code(Env.getCtx(), cCurrencyID);
	}
	public String getISOCode() {
		return ISOCode;
	}
	public void setISOCode(String iSOCode) {
		ISOCode = iSOCode;
	}
	public Timestamp getDateBOE() {
		return DateBOE;
	}
	public void setDateBOE(Timestamp dateBOE) {
		DateBOE = dateBOE;
	}
	public BigDecimal getOpenAmt() {
		return OpenAmt;
	}
	public void setOpenAmt(BigDecimal openAmt) {
		OpenAmt = openAmt;
	}
	
	public static IObjetViewColumn[] getColumns() {
		Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter = null;
		try {
			getter = CPortafolioRow.class.getDeclaredMethod("getDueDate", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "DueDate")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    		    
			getter = CPortafolioRow.class.getDeclaredMethod("getDocumentNo", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = CPortafolioRow.class.getDeclaredMethod("getISOCode", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "ISO_Code")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    		    
			getter = CPortafolioRow.class.getDeclaredMethod("getDateBOE", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "DateBOE")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    		    		    
			getter = CPortafolioRow.class.getDeclaredMethod("getOpenAmt", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "OpenAmount")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    		    
		    //
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	    IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
        newcolumns.toArray(columns);
        return columns;		  
	}
	
}
