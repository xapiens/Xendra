package org.xendra.messages;

import java.io.StringReader;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.compiere.model.PO;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.exceptions.DBException;


public class MessageProcessor {
	private HashMap<String, MessageExpression> expresions = new HashMap();
	private static MessageProcessor instance;
	MessageExpression me = null;
	private X_A_Xendrian_Message m_message;
	private String trxName = null;
	public String setMessage(String identifier, X_A_Xendrian_Message msg, String trx) throws Exception {
		String error = "";
		trxName = trx;
		if (msg == null) {
			throw new Exception ("message is null");			
		}						
		try {
			m_message = msg;			
			SAXBuilder saxBuilder = new SAXBuilder();				
			Document doc = saxBuilder.build(new StringReader(msg.getMessage()));
			Element message = doc.getRootElement();			
			if (identifier == null)
				identifier = "";
			if (identifier.length() > 0) {				
				if (expresions.containsKey(identifier)) {
					me = expresions.get(identifier);
				} else {
					me = MessageExpression.get(identifier);
					if (me != null) {
						expresions.put(identifier, me);
					}					
				}
				if (me != null) {					
					error = me.read(message, get_TrxName());
					if (error.length() > 0)
						throw new Exception(error);
				}				
			}	
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		return error;
	}
	
	public static MessageProcessor getInstance() {
		if (instance == null) {
			instance = new MessageProcessor();
		}
		return instance;
	}
	public HashMap<String, HashMap<String, PO>> getTables() {
		return me.getTables();		
	}
	public <T extends PO> T getFirstRecord(String tableName) throws DBException {
		return me.getFirstRecord(tableName);
	}
	public int getFieldInt(String tableName, String columnname) {
		Integer var = (Integer) get(tableName, columnname);
		return var;
	}
	public Object get(String tableName, String columnname) {
		PO po = getFirstRecord(tableName);
		Object var = po.get_Value(columnname);
		return var;
	}
	public <T extends PO> List<T> getRecords(String tableName) throws DBException {
		List<T> list = new ArrayList<T>();
		list = me.getRecords(tableName);
		return list;
	}
	public BigDecimal getVarBD(String var) {
		return me.getVarBD(var);
	}
	public String getVar(String var) {
		return me.getVar(var);
	}
	public BigDecimal getVarDB(String id, String var) {
		return me.getVarBD(id, var);
	}
	public Boolean getVarBoolean(String id, String var) {
		return me.getVarBoolean(id, var);
	}
	public Integer getVarInteger(String id, String var) {
		return me.getVarInteger(id, var);
	}
	public String getVar(String id, String var) {
		return me.getVar(id, var);
	}
	public void setProcessed(boolean var) {
		if (m_message != null) {
			m_message.setProcessed(var);
		}		
	}
	public void setErrorMsg(String error) {
		if (m_message != null) {
			m_message.setErrorMsg(error);
		}						
	}
	public void saveMessage() {
		if (m_message != null) {
			m_message.save();
		}								
	}
	public String commit() {
		return me.commit();		
	}
	public String get_TrxName()
	{
		return trxName;
	}	//	get_TrxName		
}