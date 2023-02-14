package org.xendra.util;

import java.awt.EventQueue;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Optional;

import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;

public class SelectPO {
	String tablename = "";
	String alias = "";
	String where = "";
	Integer field = 0;
	HashMap<Integer, String> fields = new HashMap<Integer, String>();
	HashMap<Integer, Object> fieldsexpr = new HashMap<Integer, Object>();
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public String getTablename() {
		return tablename;
	}	
	public void setField(String name) {		
		fields.put(field, name);
		field++;
	}
	public void setFieldExpr(Object expr) {
		fieldsexpr.put(field, expr);
		field++;
	}		
	public int getLength() {
		return field;
	}
	public void setAlias(String alias) {
		this.alias = alias;	
	}	
	public String getAlias() {
		return alias;
	}
	public String getField(int i) {
		String name = "";
		if (fields.containsKey(i))
			name = fields.get(i);
		else if (fieldsexpr.containsKey(i)) {
			Object var = fieldsexpr.get(i);
			if (var instanceof String)
				name = String.format("'%s'", var);
			else if (var instanceof Integer){
				name = String.valueOf(var);				
			} else {
				System.out.println("X");
			}
		}
		return name;
	}
	public void setWhere(String where) {
		this.where = where;		
	}	
	public String getWhere() {
		return where;
	}
	
	private String getfieldsinsert() {		
		String sqlstatement = "";
		for (int i = 0; i < field; i ++) {
			if (sqlstatement.length() > 0) {
				sqlstatement += ",";
			}			
		}
		return sqlstatement;
	}
	public Object getselectinsert() {
		String sqlstatement = "";
		int length = getLength();
		for (int i = 0; i < length; i ++) {
			if (sqlstatement.length() > 0) {
				sqlstatement += ",";
			}			
			sqlstatement += getField(i);
		}
		return sqlstatement;		
	}	
	public Object getselectfrom() {
		String sqlfrom = "";
		if (getAlias().length() > 0)
			sqlfrom = String.format("%s %s", getTablename(), getAlias());
		else
			sqlfrom = String.format("%s", getTablename());
		if (getWhere().length() > 0) {
			sqlfrom = String.format("%s WHERE %s", sqlfrom, getWhere());
		}
		return sqlfrom;	
	}
	public String getQuery() {
		String sqlfields = "";
		int length = getLength();
		for (int i = 0; i < length; i ++) {
			if (sqlfields.length() > 0) {
				sqlfields += ",";
			}			
			sqlfields += getField(i);
		}
		String sqlfrom = "";
		if (getAlias().length() > 0)
			sqlfrom = String.format("%s %s", getTablename(), getAlias());
		else
			sqlfrom = String.format("%s", getTablename());
		if (getWhere().length() > 0) {
			sqlfrom = String.format("%s WHERE %s", sqlfrom, getWhere());
		}
		String query = String.format("SELECT %s FROM %s", sqlfields, sqlfrom);
		return query;
	}
	
    public static void main(String[] args) {
		if (!org.compiere.Xendra.startup(false))
		{					
			return;
		}
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		Optional<String> langName = Optional.ofNullable(Ini.getProperty(Ini.P_LANGUAGE));
		Language language = Language.getLanguage(langName.isPresent()?langName.get():"");
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());

		SelectPO po = new SelectPO();
		po.setField("invoiced");
		po.setField("afected");
		po.setField("declared");
		po.setTablename("tax_invoice_year");
		System.out.println(po.getQuery());
    }
}
