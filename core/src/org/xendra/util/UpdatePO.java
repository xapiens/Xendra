package org.xendra.util;

import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;

import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.Constants;

public class UpdatePO {
	String tablename = "";
	String alias = "";
	HashMap<String, Object> fields = new HashMap<String, Object>();
	HashMap<Integer, String> fieldsinsert = new HashMap<Integer, String>();
	HashMap<String, String> fieldsexpr = new HashMap<String, String>();
	private int m_AD_Client_ID = 0;
	private int field = 0;
	private SelectPO m_SelectPO;
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public void setAlias(String alias) {
		this.alias = alias;	
	}	
	public String getAlias() {
		return alias;
	}
	public void setField(String name, Object value) {		
		fields.put(name, value);
	}
	public void setFieldExpr(String name, String expr) {
		fieldsexpr.put(name, expr);
	}
	public void setFieldInsert(String name) {		
		fieldsinsert.put(field, name);
		field++;		
	}	
	public String getFieldInsert(Integer i) {
		String name = fieldsinsert.get(i);
		return name;
	}
	private Object getupdatefields() {
		String sqlstatement = "";
		Iterator<String> it = fields.keySet().iterator();
		while (it.hasNext()) {				
			String key = it.next();
			Object value = (Object) fields.get(key);
			if (sqlstatement.length() > 0) {
				sqlstatement  += ",";
			}
			if (value instanceof String)
				value = String.format("'%s'", value);				
			sqlstatement += String.format("%s=%s", key, value);			
		}
		it = fieldsexpr.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = fieldsexpr.get(key);
			if (sqlstatement.length() > 0) {
				sqlstatement += ",";
			}
			sqlstatement +=  String.format("%s=%s", key, value);
		}
		return sqlstatement;
	}
	
	private String getfieldsinsert() {		
		String sqlstatement = "";
		for (int i = 0; i < field; i ++) {
			if (sqlstatement.length() > 0) {
				sqlstatement += ",";
			}			
			sqlstatement += fieldsinsert.get(i);
		}
		return sqlstatement;
	}

	public String getfields() {
		String sqlstatement = "(%s) values (%s)";
		String sqlfields = "";
		String sqlvalues = "";
		Iterator<String> it = fields.keySet().iterator();
		while (it.hasNext()) {				
			String key = it.next();
			Object value = (Object) fields.get(key);
			if (sqlfields.length() > 0) {
				sqlfields += ",";
			}
			sqlfields += key;

			if (sqlvalues.length() > 0) {
				sqlvalues += ",";
			}
			if (value instanceof String) {
				if (!((String) value).startsWith("'")) {
					value = String.format("'%s'", value);				
				}
			}
			else if (value instanceof Timestamp) {
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				value = sdf.format(value);
				value = String.format("'%s'::Timestamp", value);
			}
			sqlvalues += value;			
		}
		// fieldseval always contains expresions to evaluate in Strings
		it = fieldsexpr.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = fieldsexpr.get(key);
			if (sqlfields.length() > 0) {
				sqlfields += ",";
			}
			sqlfields += key;
			if (sqlvalues.length() > 0) {
				sqlvalues += ",";
			}
			sqlvalues += value;
		}
		sqlstatement = String.format("(%s) values (%s);", sqlfields, sqlvalues);
		return sqlstatement;
	}
	public int update(String where, String trxName) {
		if (getClient() > 0)  {
			if (getAlias().length() > 0) 
				where = String.format("%s %s%s%s%s", where, "AND ",getAlias(),".AD_Client_ID=", getClient());
			else
				where = String.format("%s %s%s", where, "AND AD_Client_ID=", getClient());
		}
		String sqlupdate = null;
		if (!where.toLowerCase().contains("where"))
			where = String.format("WHERE %s", where);
		else if (where.indexOf("(") >= 0 && where.toLowerCase().indexOf("where") > where.indexOf("("))
			where = String.format("WHERE %s", where);
		if (getAlias().length() > 0)
			sqlupdate = String.format("UPDATE %s %s set %s %s",this.getTablename(), getAlias(), getupdatefields(), where);
		else
			sqlupdate = String.format("UPDATE %s set %s %s",this.getTablename(),getupdatefields(), where);
		System.out.println(sqlupdate);
		//int no = DB.executeUpdate(sqlupdate, trxName);
		Trx localTrx = null;
		Trx trx = null;
		Savepoint savepoint = null;
		if (trxName == null)
		{
			trxName = Trx.createTrxName("UpdatePO");
			localTrx = Trx.get(trxName, true);
		}
		else 
		{
			trx = Trx.get(trxName, false);
			if (trx == null) {
				trx = Trx.get(trxName, true);
			}
		}
		int no = 0;
		try {
			if (localTrx == null)
				savepoint = trx.setSavepoint(null);
			no = DB.executeUpdate(sqlupdate, trxName);
			if (no < 0) { 
				System.out.println(sqlupdate);
				if (localTrx != null)
				{
					localTrx.rollback();
					localTrx.close();
					trxName = null;
				}
				else
				{
					trx.rollback(savepoint);
					savepoint = null;
				}
			} else {
				if (localTrx != null)
					localTrx.commit();
			}
		} catch (Exception e) {

		} finally {
			if (localTrx != null)
			{
				localTrx.close();
				trxName = null;
			}
			else
			{
				if (savepoint != null)
				{
					try {
						trx.releaseSavepoint(savepoint);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				savepoint = null;
				trx = null;
			}
		}		
		return no;
	}
	public int delete(String where, String trxName) {
		if (getClient() > 0) 
			where = String.format("%s %s%s", where, "AND AD_Client_ID=", getClient());
		String sqldelete = String.format("DELETE FROM %s WHERE %s", this.getTablename(), where);
		int no = DB.executeUpdate(sqldelete, trxName);
		return no;
	}

	public int insert(String trxName) {		
		if (!fields.containsKey(Constants.COLUMNNAME_AD_Client_ID))
			setField(Constants.COLUMNNAME_AD_Client_ID, getClient());
		if (!fields.containsKey(Constants.COLUMNNAME_AD_Org_ID))
			setField(Constants.COLUMNNAME_AD_Org_ID, getOrg());
		if (!fields.containsKey(Constants.COLUMNNAME_Created))
			setField(Constants.COLUMNNAME_Created, new Timestamp(System.currentTimeMillis()));
		if (!fields.containsKey(Constants.COLUMNNAME_CreatedBy))
			setField(Constants.COLUMNNAME_CreatedBy, 0);
		if (!fields.containsKey(Constants.COLUMNNAME_Updated))
			setField(Constants.COLUMNNAME_Updated, new Timestamp(System.currentTimeMillis()));
		if (!fields.containsKey(Constants.COLUMNNAME_UpdatedBy))
			setField(Constants.COLUMNNAME_UpdatedBy, 0);
		String sqlinsert = null;
		if (alias.length() > 0)
			sqlinsert = String.format("INSERT INTO %s %s", getTablename(), getfields());
		else
			sqlinsert = String.format("INSERT INTO %s %s %s", getTablename(), getAlias(), getfields());
		System.out.println(sqlinsert);
		Trx localTrx = null;
		Trx trx = null;
		Savepoint savepoint = null;
		if (trxName == null)
		{
			trxName = Trx.createTrxName("UpdatePO");
			localTrx = Trx.get(trxName, true);
		}
		else 
		{
			trx = Trx.get(trxName, false);
			if (trx == null) {
				trx = Trx.get(trxName, true);
			}
		}
		int no = 0;
		try {
			if (localTrx == null)
				savepoint = trx.setSavepoint(null);
			no = DB.executeUpdate(sqlinsert, trxName);
			if (no < 0) { 
				System.out.println(sqlinsert);
				if (localTrx != null)
				{
					localTrx.rollback();
					localTrx.close();
					trxName = null;
				}
				else
				{
					trx.rollback(savepoint);
					savepoint = null;
				}
			} else {
				if (localTrx != null)
					localTrx.commit();
			}
		} catch (Exception e) {

		} finally {
			if (localTrx != null)
			{
				localTrx.close();
				trxName = null;
			}
			else
			{
				if (savepoint != null)
				{
					try {
						trx.releaseSavepoint(savepoint);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				savepoint = null;
				trx = null;
			}
		}
		return no;		
	}
	public int getClient() {
		return m_AD_Client_ID;
	}
	public void setClient(int AD_Client_ID) {
		m_AD_Client_ID  = AD_Client_ID;		
	}
	public int getOrg() {
		int AD_Org_ID = Env.getContextAsInt(Env.getCtx(), "#AD_Org_ID");
		return AD_Org_ID;
	}
	public int insertfromSelect(SelectPO s, String trxName) {
		m_SelectPO = s;
		String sqlinsert = null;
		sqlinsert = String.format("INSERT INTO %s (%s) SELECT %s FROM %s", getTablename(), getfieldsinsert(), getselectinsert(), getselectfrom());
		System.out.println(sqlinsert);
		Trx localTrx = null;
		Trx trx = null;
		Savepoint savepoint = null;
		if (trxName == null)
		{
			trxName = Trx.createTrxName("UpdatePO");
			localTrx = Trx.get(trxName, true);
		}
		else 
		{
			trx = Trx.get(trxName, false);
			if (trx == null) {
				trx = Trx.get(trxName, true);
			}
		}
		int no = 0;
		try {
			if (localTrx == null)
				savepoint = trx.setSavepoint(null);
			no = DB.executeUpdate(sqlinsert, trxName);
			if (no < 0) { 
				System.out.println(sqlinsert);
				if (localTrx != null)
				{
					localTrx.rollback();
					localTrx.close();
					trxName = null;
				}
				else
				{
					trx.rollback(savepoint);
					savepoint = null;
				}
			} else {
				if (localTrx != null)
					localTrx.commit();
			}
		} catch (Exception e) {

		} finally {
			if (localTrx != null)
			{
				localTrx.close();
				trxName = null;
			}
			else
			{
				if (savepoint != null)
				{
					try {
						trx.releaseSavepoint(savepoint);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				savepoint = null;
				trx = null;
			}
		}
		return no;
	}
	
	public Object getselectinsert() {
		String sqlstatement = "";
		int length = m_SelectPO.getLength();
		for (int i = 0; i < length; i ++) {
			if (sqlstatement.length() > 0) {
				sqlstatement += ",";
			}			
			sqlstatement += m_SelectPO.getField(i);
		}
		return sqlstatement;		
	}
	public Object getselectfrom() {
		String sqlfrom = "";
		if (m_SelectPO.getAlias().length() > 0)
			sqlfrom = String.format("%s %s", m_SelectPO.getTablename(), m_SelectPO.getAlias());
		else
			sqlfrom = String.format("%s", m_SelectPO.getTablename());
		if (m_SelectPO.getWhere().length() > 0) {
			sqlfrom = String.format("%s WHERE %s", sqlfrom, m_SelectPO.getWhere());
		}
		return sqlfrom;
	}
}