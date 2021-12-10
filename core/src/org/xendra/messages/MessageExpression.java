package org.xendra.messages;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.model.GenericPO;
import org.compiere.model.MMessageFormat;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Locator;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.exceptions.DBException;

public class MessageExpression {
	protected CLogger			log = CLogger.getCLogger (getClass());
	private HashMap<String, HashMap> sections = new HashMap<String, HashMap>();	
	private HashMap<String, MMessageFormat> formats = new HashMap<String, MMessageFormat>();
	private HashMap<String, String> pks = new HashMap<String, String>();
	private HashMap<String, List<String>> parentpks = new HashMap<String, List<String>>();
	// records are the register of data from message passes to PO
	private HashMap<String, HashMap<String, HashMap>> records = new HashMap<String, HashMap<String, HashMap>>();
	//private HashMap<String, String> vars = new HashMap<String, String>();
	private HashMap<String, HashMap> vars = new HashMap<String, HashMap>();
	private HashMap<String, HashMap<String, PO>> tables = new HashMap<String, HashMap<String, PO>>();
	private String trxName = null;
	public MMessageFormat getMessageFormat(String id) {
		if (!formats.containsKey(id)) {
			MMessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "Identifier = ?", null)
			.setParameters(id).first();
			if (format != null) {				
				formats.put(id, format); 						
			}									
		}
		MMessageFormat format = formats.get(id);
		return format;		
	}
	public static MessageExpression get(String identifier) throws Exception {
		MessageExpression me = null;
		me = new MessageExpression();
		me.prepare(identifier);
		return me;
	}
	public void prepare(String identifier) throws Exception {
		MMessageFormat f = getMessageFormat(identifier);
		if (f == null) {
			throw new Exception("MessageExpression: no existe format message");
		}				
		Document doc = f.getDocument();
		if (doc != null && f.getMD5().isEmpty()) {			
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.reset();
			m.update(f.getFormat().getBytes());
			byte[] digest = m.digest();
			BigInteger bigInt = new BigInteger(1,digest);
			String hashtext = bigInt.toString(16);
			// Now we need to zero pad it if you actually want the full 32 chars.
			while(hashtext.length() < 32 ){
				hashtext = "0"+hashtext;
			}			
			f.setMD5(hashtext);
			f.save();
		}		
		Element root = doc.getRootElement();
		Iterator iterator = root.getChildren().listIterator();
		while (iterator.hasNext()) {
			Element e = (Element) iterator.next();
			prepare(e);						
		}
		Iterator ittables = tables.keySet().iterator();
		while (ittables.hasNext()) {
			String key = (String) ittables.next();
			if (!pks.containsKey(key)) {
				throw new Exception(String.format("MessageExpression: table %s not contain key", key));
			}
		}		
	}
	public void prepare(Element e) {
		if (e.getName().equals("section")) {
			preparesection(e);
		}
	}	
	public void preparesection(Element s) {
		Iterator iterator = s.getChildren().listIterator();
		while (iterator.hasNext()) {
			Element f = (Element) iterator.next();
			if (f.getName().equals("field")) {
				preparefield(s, f);
			} else if (f.getName().equals("section")) {
				preparesection(f);
			}
		}		
	}
	public void preparefield(Element s, Element f) {
		String columnid = f.getAttributeValue("columnid");
		if (columnid == null) {
			columnid = "";
		}
		if (columnid.length() == 0) { 
			String sectionname = s.getAttributeValue("name");
			if (!sections.containsKey(sectionname)) {
				sections.put(sectionname, new HashMap());
			}
			MessageField mf = new MessageField();
			mf.setName(f.getAttributeValue("name"));
			mf.setArea(f.getAttributeValue("area"));
			mf.setMandatory(f.getAttributeValue("mandatory").equals("true"));
			String tableid = f.getAttributeValue("tableid");
			if (tableid == null) {
				tableid = "";
			}
			if (tableid.length() > 0) {
				X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "Identifier = ?", null)
				.setParameters(tableid).first();
				mf.setTable(table);
			}			
			HashMap<String, MessageField> map = sections.get(sectionname);
			if (!map.containsKey(mf.getName())) {
				map.put(mf.getName(), mf);
			}
			sections.put(sectionname, map);			
		} else {
			X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
			.setParameters(columnid).first();
			List<X_AD_Column> parents = new Query(Env.getCtx(), X_AD_Column.Table_Name, "IsParent = 'Y' AND AD_Table_ID = ?", null)
			.setParameters(column.getAD_Table_ID())
			.list();
			if (parents != null && parents.size() > 0) {
				MTable t = new Query(Env.getCtx(), MTable.Table_Name, "AD_Table_ID = ?", null)
				.setParameters(column.getAD_Table_ID()).first();
				if (!parentpks.containsKey(t.getTableName())) {
					List<String> pks = new ArrayList<String>();
					for (X_AD_Column parent:parents) {					
						pks.add(parent.getColumnName());										
					}				
					parentpks.put(t.getTableName(), pks);					
				}
			}
			MessageField mf = new MessageField();
			mf.setName(f.getAttributeValue("name"));
			mf.setArea(f.getAttributeValue("area"));
			mf.setMandatory(f.getAttributeValue("mandatory").equals("true"));
			String key = f.getAttributeValue("key");
			if (key == null) 
				key = "false";					
			mf.setKey(key.equals("true"));
			mf.setColumn(column);
			MTable t = MTable.get(Env.getCtx(), column.getAD_Table_ID());
			if (!tables.containsKey(t.getTableName())) 
				tables.put(t.getTableName(), new HashMap<String, PO>());
			if (mf.getKey()) {				
				if (!pks.containsKey(t.getTableName()))
					pks.put(t.getTableName(), column.getColumnName());
			}
			String sectionname = s.getAttributeValue("name");
			if (!sections.containsKey(sectionname)) {
				sections.put(sectionname, new HashMap());
			}
			HashMap<String, MessageField> map = sections.get(sectionname);
			if (!map.containsKey(mf.getName())) {
				map.put(mf.getName(), mf);
			}
			sections.put(sectionname, map);
		}
	}
	public void cleardata() {		
		records.clear();		
		Iterator ittables = tables.keySet().iterator();
		while (ittables.hasNext()) {
			String key = (String) ittables.next();
			tables.put(key, new HashMap<String, PO>()); 
		}
		vars.clear();		
	}
	public String read(Element message, String trx) throws Exception {
		this.trxName = trx;
		String error = "";
		try {
			cleardata();
			Iterator iterator = message.getChildren().listIterator();
			while (iterator.hasNext()) {
				Element e = (Element) iterator.next();
				searchkey(e);
			}
			iterator = message.getChildren().listIterator();
			while (iterator.hasNext()) {
				Element e = (Element) iterator.next();
				error = readelement(e);
				if (error.length() > 0) {
					throw new Exception(error);
				}
			}
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	} 

	public void searchkey(Element e) {
		if (IsSection(e.getName())) {
			searchkeyelement(e);
		} else {
			Iterator iterator = e.getChildren().listIterator();
			while (iterator.hasNext()) {
				Element f = (Element) iterator.next();
				if (IsSection(f.getName())) {
					searchkeyelement(f);
				}
			}
		}		
	}

	public String readelement(Element e) {
		String error = "";
		try {
			if (IsSection(e.getName())) {
				error = readsection(e);
				if (error.length() > 0) 
					throw new Exception(error);
			} else {
				Iterator iterator = e.getChildren().listIterator();
				while (iterator.hasNext()) {
					Element f = (Element) iterator.next();
					if (IsSection(f.getName())) {
						readsection(f);
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			error = ex.getMessage();
		}
		return error;
	}

	public boolean IsSection(String name) {
		return sections.containsKey(name);
	}	

	public void searchkeyelement(Element s) {
		Iterator iterator = s.getChildren().listIterator();
		while (iterator.hasNext()) {
			Element f = (Element) iterator.next();
			if (IsSection(f.getName())) {
				searchkeyelement(f);
			}
		}				
		HashMap sectionfield = sections.get(s.getName());
		Iterator itsecfield = sectionfield.keySet().iterator();
		while (itsecfield.hasNext()) {
			String fieldname = (String) itsecfield.next();
			MessageField mf = (MessageField) sectionfield.get(fieldname);
			X_AD_Column c = mf.getColumn();
			if (c != null && mf.getKey()) {
				try {
					String keyvalue = s.getAttributeValue(fieldname);
					//					if (keyvalue == null) {
					//						keyvalue = s.getAttributeValue(X_AD_Table.COLUMNNAME_Identifier);
					//					}
					//					if (keyvalue == null) {
					//						keyvalue = Util.getUUID();
					//					}
					if (!records.containsKey(s.getName())) {						
						records.put(s.getName(), new HashMap());
					}
					HashMap record = records.get(s.getName());
					if (!record.containsKey(keyvalue)) {
						record.put(keyvalue, new HashMap());
						records.put(s.getName(), record);
					}
					//
					MTable t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", get_TrxName())
					.setParameters(c.getAD_Table_ID()).first();
					//
					//pks.put(t.getTableName(), fieldname);					
					PO po = new Query(Env.getCtx(), t.getTableName(), "Identifier = ?", get_TrxName())
					.setParameters(keyvalue).first();
					if (po == null) {
						X_AD_Column columnvalue = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ? AND coalesce(columnsql,'empty') = 'empty'", get_TrxName())
						.setParameters(t.getAD_Table_ID(), X_AD_Client.COLUMNNAME_Value).first();						
						if (columnvalue != null) {
							po = new Query(Env.getCtx(), t.getTableName(), "Value = ?", get_TrxName())
							.setParameters(keyvalue).first();
						}
					}
					if (po == null) {
						po = getPOClass(t);
					}
					if (po != null) { 
						//if (!tables.containsKey(t.getTableName())) {
						//	tables.put(t.getTableName(), new HashMap<String, PO>());
						//}
						HashMap<String, PO> fields = tables.get(t.getTableName());
						if (!fields.containsKey(keyvalue)) {
							fields.put(keyvalue, po);
							po.set_ValueOfColumn(X_AD_Table.COLUMNNAME_Identifier, keyvalue);
						}						
						tables.put(t.getTableName(), fields);
						break;
					}					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}			
		}		
	}

	private PO getPOClass(MTable t) {
		Class<?> clazz = t.getClass(t.getTableName());							
		if (clazz == null)
		{
			GenericPO po = new GenericPO(t.getTableName(), Env.getCtx(), new Integer(0), get_TrxName());
			return po;
		}
		try
		{
			Constructor<?> constructor = null;
			try
			{
				constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}						
			PO po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), new Integer(0), get_TrxName()});
			//if (po != null && po.get_ID() != Record_ID && Record_ID > 0)
			//	return null;
			return po;
		} catch (Exception e) {
			e.printStackTrace();
		}					
		return null;
	}

	public String readsection(Element s) {
		String error = "";
		try {
			Iterator iterator = s.getChildren().listIterator();
			while (iterator.hasNext()) {
				Element f = (Element) iterator.next();
				if (IsSection(f.getName())) {
					error = readsection(f);
					if (error.length() > 0) {
						throw new Exception(error);
					}
				}
			}				
			HashMap sectionfield = sections.get(s.getName());
			Iterator itsecfield = sectionfield.keySet().iterator();
			while (itsecfield.hasNext()) {
				PO po = null;
				Boolean isanothersection = false;
				String key = "";
				String keyvalue = "";
				String fieldname = (String) itsecfield.next();
				log.log(Level.FINE, String.format("%s-%s",s.getName(),fieldname));
				String value = s.getAttributeValue(fieldname);
				MessageField mf = (MessageField) sectionfield.get(fieldname);
				X_AD_Column c = mf.getColumn();
				if (c != null) {
					X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(c.getAD_Table_ID()).first();
					if (tables.containsKey(t.getTableName())) {
						//po = tables.get(t.getTableName());
						HashMap <String, PO> xx = tables.get(t.getTableName());
						key = pks.get(t.getTableName());
						keyvalue =  s.getAttributeValue(key);
						// esto ocurre cuando el campo en la seccion hace referencia a una tabla que esta definida en otra seccion
						// solo deberia funcionar si la tabla a la que referencia es de 1 solo registro, pues no existe manera de 
						// determinar a que registro perteneceria en caso de ser mas de uno.
						if (keyvalue == null) { 
							if (xx.size() == 1) {
								Iterator it = xx.keySet().iterator();
								keyvalue = (String) it.next();
								isanothersection = true;							
							}
						} 
						po = xx.get(keyvalue);
					}
					if (!records.containsKey(s.getName())) {
						HashMap<String, HashMap> rmap = new HashMap<String, HashMap>();
						records.put(s.getName(), rmap);
					}			
					if (isanothersection) {
						HashMap record = new HashMap<String, HashMap<String, String>>();
						Iterator anothersection = records.keySet().iterator();
						Boolean found = false;
						while (anothersection.hasNext() && !found) {
							String askey  = (String) anothersection.next();
							HashMap<String, HashMap> asrecords = records.get(askey);
							Iterator itasrecord = asrecords.keySet().iterator();
							while (itasrecord.hasNext() && !found) {
								String asrecordkey = (String) itasrecord.next();
								if (asrecordkey != null && asrecordkey.equals(keyvalue)) {
									record = asrecords.get(keyvalue);
									record.put(fieldname, value);
									found = true;
									break;
								}
							}
						}
						if (po != null) {
							error = saverecord(fieldname, c, mf.isMandatory(), record, po);
							if (error.length() > 0) {
								throw new Exception(error);
							}
						}							
					} else {
						HashMap<String, HashMap> r = records.get(s.getName());
						if (!r.containsKey(keyvalue)) {
							r.put(keyvalue, new HashMap());
						}				
						HashMap record = r.get(keyvalue);
						record.put(fieldname, value);
						if (po != null) {
							error = saverecord(fieldname, c, mf.isMandatory(), record, po);
							if (error.length() > 0) {
								throw new Exception(error);
							}							
						}			
						r.put(keyvalue, record);
						//r.put(fieldname, value);
						records.put(s.getName(), r);				
					}				
				} else  {
					if (!vars.containsKey(fieldname)) {
						vars.put(fieldname, new HashMap());
					}
					HashMap <String, String> qq = vars.get(fieldname);
					X_AD_Table t = mf.getTable();
					if (t != null) {
						HashMap <String, PO> xx = tables.get(t.getTableName());
						Iterator it = xx.keySet().iterator();
						while (it.hasNext()) {
							String tablekey = (String) it.next();						
							if (!qq.containsKey(tablekey)) {
								qq.put(tablekey, value);
								vars.put(fieldname, qq);
								break;
							}
						}
					} else {					
						qq.put(Util.getUUID(), value);
						vars.put(fieldname, qq);
					}				 
				}						
			}
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}
	public String saverecord(String name, X_AD_Column col, Boolean isMandatory, HashMap<String, String> record, PO po) {
		String error = "";
		try {
			if (record.get(name) == null) {
				return error;
			}			
			if (record.get(name) == null && isMandatory) 				
				throw new Exception(String.format("%s es mandatorio y no tiene referencia", name));
			if (col.getAD_Reference_ID() == DisplayType.TableDir ||
					col.getAD_Reference_ID() == DisplayType.Location ||
					col.getAD_Reference_ID() == DisplayType.Search )
			{
				String tableName = col.getColumnName().substring(0, col.getColumnName().indexOf("_ID"));								
				PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", null)
				.setParameters(record.get(name)).first();
				if (poref != null) {
					Integer IDref = poref.get_ID();
					po.set_ValueOfColumn(name, IDref);
				} else {
					MTable t = new Query(Env.getCtx(), MTable.Table_Name, "TableName = ?", null).setParameters(tableName).first();
					X_AD_Column c = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
					.setParameters(t.getAD_Table_ID(), X_AD_Client.COLUMNNAME_Value).first();
					if (c != null) {
						poref = (PO) new Query(Env.getCtx(), tableName, "Value = ?", null)
						.setParameters(record.get(name)).first();
						if (poref != null) {
							Integer IDref = poref.get_ID();
							po.set_ValueOfColumn(name, IDref);
						} else { // no encontrado dar error
							if (isMandatory)
								throw new Exception(String.format("%s es mandatorio y %s no tiene referencia", name, record.get(name)));
						}
					}				
				}	
			} else if (col.getAD_Reference_Value_ID() > 0) {						
				X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
				.setParameters(col.getAD_Reference_Value_ID()).first();
				if (reference != null)
				{
					if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
					{
						X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
						.setParameters(reference.getAD_Reference_ID()).first();
						if (reftable != null)
						{
							MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
							PO poref = new Query(Env.getCtx(), adreftable.getTableName(), "identifier = ?", null)
							.setParameters(record.get(name).toString()).first();
							if (poref != null)
							{																			
								po.set_ValueOfColumn(name, poref.get_ID());
							} else {
								System.out.println(String.format("%s not found", name));
							}	
							
						}
					}
					else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
					{
						po.set_ValueOfColumn(col.getColumnName(), record.get(name));
					}
				}															
			} else if (col.getAD_Reference_ID() == DisplayType.Integer) {
				Integer var = Integer.valueOf(record.get(name).toString());
				po.set_ValueOfColumn(name, var);
			} else if (col.getAD_Reference_ID() == DisplayType.CostPrice || 
					col.getAD_Reference_ID() == DisplayType.Amount || 
					col.getAD_Reference_ID() == DisplayType.Number ||
					col.getAD_Reference_ID() == DisplayType.Quantity) {
				Object var = record.get(name);
				if (var != null) {
					BigDecimal bdvar = new BigDecimal(var.toString());
					po.set_ValueOfColumn(name, bdvar);
				} else if (isMandatory)
					throw new Exception(String.format("%s es mandatorio y no tiene referencia", name));
			} else if (col.getAD_Reference_ID() == DisplayType.YesNo) {
				Boolean yesno = record.get(name).equals("Y");
				po.set_ValueOfColumn(name, yesno);
			} else if (col.getAD_Reference_ID() == DisplayType.ID) {
			} else if (col.getAD_Reference_ID() == DisplayType.String || col.getAD_Reference_ID() == DisplayType.Text) {				
				String var = record.get(name).toString();
				if (var != null)
					po.set_ValueOfColumn(name, var);				
			} else if (col.getAD_Reference_ID() == DisplayType.Date) {
				Timestamp var = Timestamp.valueOf(record.get(name).toString());
				po.set_ValueOfColumn(name, var);				
			} else if (col.getAD_Reference_ID() == DisplayType.DateTime) {
				Timestamp var = Timestamp.valueOf(record.get(name).toString());
				po.set_ValueOfColumn(name, var);
			} else if (col.getAD_Reference_ID() == DisplayType.Locator) {
				String id = record.get(name).toString();
				if (id != null) {
					X_M_Locator loc = new Query(Env.getCtx(), X_M_Locator.Table_Name, "Identifier = ?", null)
						.setParameters(id).first();
					if (loc != null) {
						po.set_ValueOfColumn(name, loc.getM_Locator_ID());
					}
				}
			} else if (col.getAD_Reference_ID() == DisplayType.PAttribute) {
				String id = record.get(name).toString();
				if (id != null) {
					X_M_AttributeSetInstance asi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, "Identifier = ?", null)
					.setParameters(id).first();
					if (asi != null) {
						po.set_ValueOfColumn(name, asi.getM_AttributeSetInstance_ID());
					}
				}				
			} else {
				throw new Exception(String.format("Reference %s not defined",col.getAD_Reference_ID()));
			}
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}
	public HashMap<String, HashMap<String, PO>> getTables() {
		return tables;
	}

	public <T extends PO> T getFirstRecord(String tablename) throws DBException {
		T po = null;
		if (tables.containsKey(tablename)) {
			HashMap<String, PO> table = tables.get(tablename);
			Iterator it = table.keySet().iterator();		
			if (it.hasNext())
				po = (T) table.get(it.next());
		}		
		return po;
	}

	public <T extends PO> List<T> getRecords(String tableName) {
		List<T> list = new ArrayList<T>();
		HashMap<String, PO> t = tables.get(tableName);
		Iterator it = t.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			list.add((T) t.get(key));
		}
		return list;
	}
	public String getVar(String var) {
		return getVar("", var);
	}
	public BigDecimal getVarBD(String var) {
		return getVarBD("", var);
	}
	public BigDecimal getVarBD(String id, String var) {
		BigDecimal bdvar = null;
		if (vars.containsKey(var)) {
			HashMap m = vars.get(var);
			if (id.length() == 0) {				
				if (m.size() == 1) {
					Iterator it = m.keySet().iterator();
					String k = (String) it.next();
					String s = (String) m.get(k);
					try {
						bdvar = new BigDecimal(s);
					} 
					catch (Exception e) {
						e.printStackTrace();
					}
				} else {			
					String s = (String) m.get(id);
					bdvar = new BigDecimal(s);
				}
			}			
		}
		return bdvar;
	}
	public String getVar(String id, String var) {
		String svar = "";
		if (vars.containsKey(var)) {
			HashMap m = vars.get(var);
			if (id.length() == 0) {
				if (m.size() == 1) {
					Iterator it  = m.keySet().iterator();
					String k = (String) it.next();
					String s = (String) m.get(k);
					svar = s;
				}
			} else {
				String s = (String) m.get(id);
				svar = s;
			}			
		}
		return svar;
	}

	public Integer getVarInteger(String id, String var) {
		Integer v = 0;
		if (vars.containsKey(var)) {
			HashMap m = vars.get(var);
			if (id.length() == 0) {
				if (m.size() == 1) {
					Iterator it = m.keySet().iterator();
					String k = (String) it.next();
					String s = (String) m.get(k);
					v = Integer.valueOf(s);
				}
			} else {
				String s = (String) m.get(id);
				v = Integer.valueOf(s);
			}
		}
		return v;
	}
	public Boolean getVarBoolean(String id, String var) {
		Boolean b = false;
		if (vars.containsKey(var)) {
			HashMap m = vars.get(var);
			if (id.length() == 0) {
				if (m.size() == 1) {
					Iterator it = m.keySet().iterator();
					String k = (String) it.next();
					String s = (String) m.get(k);
					b = s.equals("Y");
				}
			} else {
				String s = (String) m.get(id);
				b = s.equals("Y");
			}
		}
		return b;
	}
	public String commit() {
		// primero grabamos los que no tienen parentkeys
		//Iterator ittables = tables.keySet().iterator();
		//while (ittables.hasNext()) {
		// primero ad_client
		String error = "";
		try {
			PO client = getFirstRecord(X_AD_Client.Table_Name);
			Env.setContext(Env.getCtx(), "#AD_Client_ID", client.getAD_Client_ID());
			PO org = getFirstRecord(X_AD_Org.Table_Name);
			// ad_org
			for (Iterator ittables = tables.keySet().iterator(); ittables.hasNext(); ) {
				String tablekey = (String) ittables.next();
				if (tablekey.equals(X_AD_Client.Table_Name))
					continue;
				if (tablekey.equals(X_AD_Org.Table_Name)) 
					continue;
				if (!parentpks.containsKey(tablekey)) {
					HashMap<String, PO> records = tables.get(tablekey);
					for (Iterator itrecords = records.keySet().iterator(); itrecords.hasNext(); ) {
						PO po = records.get(itrecords.next());
						po.set_ValueOfColumn(Constants.COLUMNNAME_AD_Client_ID, client.getAD_Client_ID());
						po.set_ValueOfColumn(Constants.COLUMNNAME_AD_Org_ID, org.getAD_Org_ID());
						po.save();
					}				
				} 
			}
			// luego grabamos los que tienen parent
			for (Iterator ittables = tables.keySet().iterator(); ittables.hasNext(); ) {
				String tablekey = (String) ittables.next();
				if (parentpks.containsKey(tablekey)) {				
					HashMap<String, PO> records = tables.get(tablekey);				
					List<String> qwe = parentpks.get(tablekey);
					for (String qw:qwe) {
						for (Iterator itpks = pks.keySet().iterator(); itpks.hasNext(); ) {
							String tname = (String) itpks.next();
							if (pks.get(tname).equals(qw)) {			
								PO parent = getFirstRecord(tname);
								if (parent != null) {
									for (Iterator itrecords = records.keySet().iterator(); itrecords.hasNext(); ) {
										PO po = records.get(itrecords.next());
										po.set_ValueOfColumn(Constants.COLUMNNAME_AD_Client_ID, client.getAD_Client_ID());
										po.set_ValueOfColumn(Constants.COLUMNNAME_AD_Org_ID, org.getAD_Org_ID());
										po.set_ValueOfColumn(pks.get(tname), parent.get_ID());
										if (!po.save()) {
											throw new Exception(DB.getLastError());											
										}
									}
								}
							}

						}
					}				
				}
			}
		} catch (Exception e) {
			if (e.getMessage() == null)
				error = "Exception de nulo en variable";
			else
				error = e.getMessage();
		}
		return error;
	}

	protected String get_TrxName()
	{
		return trxName;
	}	//	get_TrxName	
}
