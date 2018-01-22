package org.xendra.apps.form;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Vector;

import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.IObjetViewColumn;

public class HistoryRow extends RowBase {
	public String getDocumentNo() {
		return DocumentNo;
	}
	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}
	public Integer getC_AllocationHdr_ID() {
		return C_AllocationHdr_ID;
	}
	public void setC_AllocationHdr_ID(Integer cAllocationHdrID) {
		C_AllocationHdr_ID = cAllocationHdrID;
	}
	public Timestamp getTrxDate() {
		return TrxDate;
	}
	public void setTrxDate(Timestamp trxDate) {
		TrxDate = trxDate;
	}
	public Timestamp getDateAcct() {
		return DateAcct;
	}	
	public void setDateAcct(Timestamp dateAcct) {
		DateAcct = dateAcct;
	}
	public Integer getC_GroupDoc() {
		return C_GroupDoc;
	}
	public void setC_GroupDoc(Integer cGroupDoc) {
		C_GroupDoc = cGroupDoc;
	}
	
	String DocumentNo = "";
	Integer C_AllocationHdr_ID = 0;
	Integer C_GroupDoc = 0;
	Timestamp TrxDate = new Timestamp(System.currentTimeMillis());
	Timestamp DateAcct = new Timestamp(System.currentTimeMillis());
		
	public static IObjetViewColumn[] getColumns() {
		Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter = null;
		try {
			getter = HistoryRow.class.getDeclaredMethod("getDocumentNo", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
			getter = HistoryRow.class.getDeclaredMethod("getC_AllocationHdr_ID", null);
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "C_AllocationHdr_ID"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = HistoryRow.class.getDeclaredMethod("getTrxDate", null);
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "TrxDate"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = HistoryRow.class.getDeclaredMethod("getDateAcct", null);
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "DateAcct"), 
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
