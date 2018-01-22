package org.xendra.apps.form;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Vector;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.IObjetViewColumn;

public class CGroupRow extends RowBase {
	Boolean Select = false;
	String DocumentNo = "";
	String Name = "";
	Integer C_GroupDoc_ID  = 0;
	
	public Integer getC_GroupDoc_ID() {
		return C_GroupDoc_ID;
	}

	public void setC_GroupDoc_ID(Integer cGroupDocID) {
		C_GroupDoc_ID = cGroupDocID;
	}

	public Boolean getSelect() {
		return Select;
	}

	public void setSelect(Boolean select) {
		Select = select;
	}

	public String getDocumentNo() {
		return DocumentNo;
	}

	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static IObjetViewColumn[] getColumns() {
		Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {
			getter = CGroupRow.class.getDeclaredMethod("getSelect", null);
		    setter = CGroupRow.class.getDeclaredMethod("setSelect", new Class[] {Boolean.class});
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
			getter = CGroupRow.class.getDeclaredMethod("getDocumentNo", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
			getter = CGroupRow.class.getDeclaredMethod("getName", null);
			setter = CGroupRow.class.getDeclaredMethod("setName", new Class[] {String.class});
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "Name"), 
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
