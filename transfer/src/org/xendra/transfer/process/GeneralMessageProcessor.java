package org.xendra.transfer.process;

import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.POInfo;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_M_Locator;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendrian.rules.messages.IMessageProcessor;

public class GeneralMessageProcessor implements IMessageProcessor {

	private String message;
	private HashMap Entities = new HashMap<String, String>();
	private HashMap EntityProperties = new HashMap();
	private HashMap Tables = new HashMap<String, PO>();
	private String error = "";
	private X_A_Xendrian_Message xmessage;
	@Override
	public String setMessage(String m) {
		if (m != null)
		{
			try {
				message = m;
				org.jdom.input.SAXBuilder saxBuilder = new SAXBuilder();
				org.jdom.Document doc = saxBuilder.build(new StringReader(m));
				Element pos = doc.getRootElement();			
				error = processDocument(pos);	
				System.out.println(error);
			}
			catch (Exception e)
			{
				e.printStackTrace();
				error = e.getMessage();
			}
		}
		return error;
	}

	public String getMessage() {
		return message;
	}
	
	public PO getTable(String tablename) {
		PO po = null;
		if (Tables.containsKey(tablename))
			po = (PO) Tables.get(tablename);
		return po;
	}

	public Object getPropertyValue(String name, String propname)
	{
		Object ret = null;
		HashMap properties = null;
		if (EntityProperties.containsKey(name))
		{
			properties = (HashMap) EntityProperties.get(name);
			if (properties.containsKey(propname))
			{
				ret = properties.get(propname);
			}
		}
		return ret;
	}
	public String processDocument(Element pos) {
		try {
			getEntities(pos);
			if (Entities.size() > 0)
			{
				for (Object key:Entities.keySet())
				{
					String entity = (String) Entities.get(key);	
					getEntity((String) key, entity, pos);
				}
				PO po = getHeader(); 
				if (po != null)
				{
					Tables.put(po.get_TableName(), po);
					String lines = (String) getPropertyValue("Lines","count");
					Integer noLines = Integer.valueOf(lines);
					for (int i=0; i < noLines; i++)
					{
						PO poline = getLine(i);
						if (poline == null)
							throw new Exception(error);
						else
							Tables.put(poline.get_TableName(), poline);
					}
				}
			}
		}
		catch (Exception e)
		{
			error = e.getMessage();
		}
		return error;
	}	

	private PO getLine(int lineno)
	{
		String tabletype = String.format("Line%s",lineno);
		String table = (String) Entities.get(tabletype);
		String identifier = (String) getPropertyValue(tabletype, X_AD_Table.COLUMNNAME_Identifier);
		return CreateUpdate(tabletype, table, identifier);
	}
	
	private PO getHeader() {
		String table = (String) Entities.get("Header");
		String identifier = (String) getPropertyValue("Header", X_AD_Table.COLUMNNAME_Identifier);
		return CreateUpdate("Header", table, identifier);
	}
	
	private PO CreateUpdate(String tabletype, String table, String identifier) {
		PO po = null;
		POInfo poi = null;
		try {
			po = new Query(Env.getCtx(), table, "Identifier = ?", null).setParameters(identifier).first();
			if (po != null)
				poi = POInfo.getPOInfo (Env.getCtx(), po.get_Table_ID());
		}
		catch (Exception e)
		{	
			error = e.getCause().getMessage();
			if (error == null)
				error = e.getMessage();
			if (error != null)
				error = table +" "+error;
			else
				error = table + " error ";
		}
		if (po == null)		
		{
			try {
				Class<?> clazz = Class.forName("org.compiere.model.persistence.X_"+table);			
				Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});							
				po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, null});
				poi = POInfo.getPOInfo (Env.getCtx(), po.get_Table_ID());
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		HashMap properties = (HashMap) EntityProperties.get(tabletype);		
		for (Iterator col= properties.keySet().iterator(); col.hasNext();)
		{
			String column = (String) col.next();
			String value = (String) properties.get(column);
			int index = po.get_ColumnIndex(column); 
			if ( index >= 0)
			{
				Object typeclazz = poi.getColumnClass(index);
				if (typeclazz.equals(String.class))
				{
					po.set_ValueOfColumn(column, value);
				}
				else if (typeclazz.equals(BigDecimal.class))
				{
					po.set_ValueOfColumn(column, new BigDecimal(value));
				}
				else if (typeclazz.equals(Integer.class))
				{            	
					if (poi.isColumnParent(index))
					{
						String header = (String) Entities.get("Header");
						PO parent = (PO) Tables.get(header);
						int id = parent.get_ID();
						po.set_ValueOfColumn(column, id);
					}
					else if (poi.getColumnDisplayType(index) == DisplayType.ID)
						continue;
					else if (poi.getColumnDisplayType(index) == DisplayType.TableDir || 
							poi.getColumnDisplayType(index) == DisplayType.Search ||
							poi.getColumnDisplayType(index) == DisplayType.Locator)
					{
						String tableref = column.substring(0, column.indexOf("_ID"));
						if (poi.getColumnDisplayType(index) == DisplayType.Locator)
							tableref = X_M_Locator.Table_Name;
						int id = 0;
						PO poref = new Query(Env.getCtx(), tableref , "Identifier = ?", null).setParameters(value).first();
						if (poref != null)
						{
							id = poref.get_ValueAsInt(tableref+"_ID");
							po.set_ValueOfColumn(column, id);
						}            			
						else
						{
							error = String.format("table reference %s - id = %s", tableref, value);
							return null;
						}
					}
					else if (poi.getColumnDisplayType(index) == DisplayType.Table)
					{
						int id = 0;
						int columnid = poi.getAD_Column_ID(column);
						MColumn colu = MColumn.get(Env.getCtx(), columnid);
						if (colu != null)            				
						{
							int ad_ref = colu.getAD_Reference_Value_ID();
							X_AD_Reference ref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
							.setParameters(ad_ref).first();
							if (ref.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
							{
								X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name,"AD_Reference_ID = ?", null)
								.setParameters(ad_ref).first();
								if (reftable != null)
								{
									MTable tableref = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
									PO poref = new Query(Env.getCtx(), tableref.getTableName(), "Identifier = ?", null).setParameters(value).first();
									if (poref != null)
									{
										id = poref.get_ValueAsInt(column);
										po.set_ValueOfColumn(column, id);
									}            						
								}

							}
						}
					}
					else
					{
						po.set_ValueOfColumn(column, Integer.valueOf(value));
					}
				}
				else if (typeclazz.equals(Boolean.class))
				{
					po.set_ValueOfColumn(column, value.equals("Y"));
				}
				else if (typeclazz.equals(Timestamp.class))
				{
					Timestamp stamp = Timestamp.valueOf(value);
					po.set_ValueOfColumn(column, stamp);
				}
				else 
				{
					System.out.println(String.format("%s %s %s",typeclazz, column, value));
				}
			}
			else
			{
				error = String.format("%s no existe y contiene value %s", column, value);
				return null;
			}
		}
		if (po != null)
		{
			po.setAD_Org_ID(1000091);
			po.set_ValueOfColumn("AD_Client_ID", 1000039);
			po.save();
		}
		return po;
	}

	private void getEntity(String key, String value, Element pos) {
		Element entity = pos.getChild(key);
		List list = entity.getAttributes();		
		HashMap entityfields = new HashMap();
	    for (int i = 0; i < list.size(); i++) {
	    	Attribute a = (Attribute) list.get(i);
	    	entityfields.put(a.getName(), a.getValue());	    	
	    }
	    EntityProperties.put(key, entityfields);
	}

	private void getEntities(Element pos) {
		List list = pos.getAttributes();		
	    for (int i = 0; i < list.size(); i++) {
	    	Attribute a = (Attribute) list.get(i);	 
	    	if (!Entities.containsKey(a.getName()))
	    		Entities.put(a.getName(), a.getValue());
	    }		
	}

	public void setXendrianMessage(X_A_Xendrian_Message m) {
		xmessage = m;
	}

	@Override
	public X_A_Xendrian_Message getXendrianMessage() {
		return xmessage;
	}
}
