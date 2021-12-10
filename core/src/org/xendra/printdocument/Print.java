package org.xendra.printdocument;

import java.util.regex.Pattern;

import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;

public class Print {
	public static String Value(String tablename, String var) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "UPPER(TableName) = ?", null)
		.setParameters(tablename.toUpperCase()).first();
		if (t != null) {
			X_AD_Column c = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND isidentifier = 'Y'", null)
			.setParameters(t.getAD_Table_ID()).first();
			if (c != null) {
				PO po = new Query(Env.getCtx(), tablename, "Value = ?", null).setParameters(var).first();
				if (po != null)
					var = po.get_ValueAsString(c.getColumnName());					
			}
		}
		return var;
	}
	public static String Value(String tablename, String columnname, String var) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "UPPER(TableName) = ?", null)
		.setParameters(tablename.toUpperCase()).first();
		if (t != null) {
			PO po = new Query(Env.getCtx(), tablename, "Value = ?", null).setParameters(var).first();
			if (po != null)
				var = po.get_ValueAsString(columnname);					
		}
		return var;
	}	
	public static String ID(String tablename, String var) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "UPPER(TableName) = ?", null)
		.setParameters(tablename.toUpperCase()).first();
		if (t != null) {
			X_AD_Column c = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND isidentifier = 'Y'", null)
			.setParameters(t.getAD_Table_ID()).first();
			if (c != null) {
				PO po = new Query(Env.getCtx(), tablename, "Identifier = ?", null).setParameters(var).first();
				if (po != null)
					var = po.get_ValueAsString(c.getColumnName());					
			}
		}
		return var;
	}
	public static String ID(String tablename, String columnname, String var) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "UPPER(TableName) = ?", null)
		.setParameters(tablename.toUpperCase()).first();
		if (t != null) {
			PO po = new Query(Env.getCtx(), tablename, "Identifier = ?", null).setParameters(var).first();
			if (po != null)
				var = po.get_ValueAsString(columnname);					
		}
		return var;	
	}
}
