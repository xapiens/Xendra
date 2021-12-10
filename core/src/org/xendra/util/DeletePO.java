package org.xendra.util;

import org.compiere.util.DB;

public class DeletePO {
	String tablename = "";
	String alias = "";
	String where = "";
	private int m_AD_Client_ID = 0;
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public String getTablename() {
		return tablename;
	}	
	public void setAlias(String alias) {
		this.alias = alias;	
	}	
	public String getAlias() {
		return alias;
	}
	public int getClient() {
		return m_AD_Client_ID;
	}
	public void setClient(int AD_Client_ID) {
		m_AD_Client_ID  = AD_Client_ID;		
	}	
	public void setWhere(String where) {
		this.where = where;		
	}	
	public String getWhere() {
		return where;
	}
	public int delete(String trxName) {
		if (getClient() > 0)  {
			if (getAlias().length() > 0) 
				where = String.format("%s %s%s%s%s", where, "AND ",getAlias(),".AD_Client_ID=", getClient());
			else
				where = String.format("%s %s%s", where, "AND AD_Client_ID=", getClient());
		}
		String sqldelete = String.format("DELETE FROM %s WHERE %s", this.getTablename(), where);
		int no = DB.executeUpdate(sqldelete, trxName);
		return no;
	}
}
