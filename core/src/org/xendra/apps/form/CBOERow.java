package org.xendra.apps.form;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import org.compiere.apps.form.VInvoiceRow;
import org.compiere.model.MAttributeSet;
import org.compiere.model.MCurrency;
import org.compiere.model.MInvoice;
import org.compiere.model.MPriceList;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPricing;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.IObjetViewColumn;

public class CBOERow extends RowBase {
	Boolean Select = false;
	Timestamp TrxDate = new Timestamp(System.currentTimeMillis());
	String DocumentNo = "";
	BigDecimal Amount = Env.ZERO;
	Integer DueDays = 0;
	Timestamp DueDate = new Timestamp(System.currentTimeMillis());
	public Boolean getSelect() {
		return Select;
	}
	public void setSelect(Boolean select) {
		Select = select;
	}
	public Timestamp getTrxDate() {
		return TrxDate;
	}
	public void setTrxDate(Timestamp trxDate) {
		TrxDate = trxDate;
	}
	public String getDocumentNo() {
		return DocumentNo;
	}
	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		if (amount == null)
			amount = Env.ZERO;
		amount = amount.setScale(2, BigDecimal.ROUND_HALF_UP);
		Amount = amount;
	}
	public Integer getDueDays() {
		return DueDays;
	}
	public void setDueDays(Integer dueDays) {
		DueDays = dueDays;
	}
	public Timestamp getDueDate() {
		return DueDate;
	}
	public void setDueDate(Timestamp dueDate) {
		DueDate = dueDate;
	}
	
	public static IObjetViewColumn[] getColumns() {
		Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {
			getter = CBOERow.class.getDeclaredMethod("getSelect", null);
		    setter = CBOERow.class.getDeclaredMethod("setSelect", new Class[] {Boolean.class});
		    newcolumns.add(new DefaultTableViewColumn ( 
		    		Msg.getMsg(Env.getCtx(), "Select"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = CBOERow.class.getDeclaredMethod("getTrxDate", null);
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
			getter = CBOERow.class.getDeclaredMethod("getDocumentNo", null);
			setter = CBOERow.class.getDeclaredMethod("setDocumentNo", new Class[] {String.class});
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
			getter = CBOERow.class.getDeclaredMethod("getAmount", null);
			setter = CBOERow.class.getDeclaredMethod("setAmount", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "Amount"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = CBOERow.class.getDeclaredMethod("getDueDays", null);
			setter = CBOERow.class.getDeclaredMethod("setDueDays", new Class[] {Integer.class});
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "DueDays"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
			getter = CBOERow.class.getDeclaredMethod("getDueDate", null);
			setter = CBOERow.class.getDeclaredMethod("setDueDate", new Class[] {Timestamp.class});
		    newcolumns.add(new DefaultTableViewColumn(Msg.getMsg(Env.getCtx(), "DueDate"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		false /* sortable */,
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
