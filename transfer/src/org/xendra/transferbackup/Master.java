package org.xendra.transferbackup;

import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import org.compiere.model.MColumn;
import org.compiere.model.MRefTable;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.xendra.exceptions.XendraException;

public class Master extends SvrProcess {

	private List<Vector> items = new ArrayList<Vector>();
	private int m_level = 0;
	private Document doc;
	private Element master;
	//	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	//	@Override
	protected String doIt() {
		try {	
			org.compiere.Xendra.startup(false);
			int Record_ID = 2049765;
			Class<?> clazz;
			X_AD_Table poinfo = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
			.setParameters(X_C_BPartner.Table_Name).first();

			clazz = Class.forName("org.compiere.model.persistence.X_"+poinfo.getTableName());

			Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
			PO po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), Record_ID, null});			
			processtable(clazz, po, 0);
			System.out.println(m_level);
			master = new Element("master");
			doc = new Document(master);					
			doc.setRootElement(master);					
			master.setAttribute(new Attribute("level", String.valueOf(m_level)));
			for (int level = m_level; level >= 0; level--)
			{							
				Element table = null;
				for (Vector itemtable:items)
				{
					int vlevel = (int) itemtable.get(2);														
					if (vlevel == level)				
					{
						if (((String) itemtable.get(3)).equals(X_AD_Table.COLUMNNAME_AD_Table_ID))
						{							
							String tablename = (String) itemtable.get(1);
							table = new Element("table");
							table.setAttribute(new Attribute("name", (String) itemtable.get(1)));
							table.setAttribute(new Attribute("level", String.valueOf(level)));
							table.setAttribute(new Attribute(X_AD_Table.COLUMNNAME_Identifier, (String) itemtable.get(4)));
							doc.getRootElement().addContent(table);
							for (Vector item:items)
							{
								int clevel = (int) item.get(2);
								if (clevel == level)
								{
									if (((String) item.get(3)).equals(X_AD_Column.COLUMNNAME_AD_Column_ID) && tablename.equals((String) item.get(4)))
									{
										String name  = (String) item.get(0);
										Object value = item.get(1);
										Element column = new Element("column");
										column.setAttribute(new Attribute("name", name));			
										if (value instanceof Boolean)
											column.setAttribute(new Attribute("value", (Boolean) value ? "Y":"N"));
										else if (value instanceof BigDecimal)
											column.setAttribute(new Attribute("value", ((BigDecimal) value).toString()));
										else if (value instanceof String)
											column.setAttribute(new Attribute("value", (String) value));
										else if (value instanceof Integer)
											column.setAttribute(new Attribute("value", String.valueOf(value)));
										else
											System.out.println("X");
										//else if (value instanceof Integer)
										//	column.setAttribute(new Attribute("value", )										
										table.addContent(column);
									}									
								}
							}
						}
					}							
				}
			}
			///
			XMLOutputter xmOut=new XMLOutputter();
			String xml = xmOut.outputString(doc);
			//
			//String 
			xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><master level=\"3\"><table name=\"AD_PrintColor\" level=\"3\" Identifier=\"2c0f415b-4b87-6721-41a2-c418838d8682\"><column name=\"AD_PrintColor_ID\" value=\"100\" /><column name=\"Code\" value=\".\" /><column name=\"IsDefault\" value=\"Y\" /><column name=\"Name\" value=\"Black\" /><column name=\"Identifier\" value=\"2c0f415b-4b87-6721-41a2-c418838d8682\" /></table><table name=\"C_BP_DocType\" level=\"2\" Identifier=\"7c3c0dac-de77-321d-2e16-e92437e2ec60\"><column name=\"C_BP_DocType_ID\" value=\"2\" /><column name=\"Name\" value=\"01 - DNI\" /><column name=\"TaxID\" value=\"01\" /><column name=\"Value\" value=\"D\" /><column name=\"Identifier\" value=\"7c3c0dac-de77-321d-2e16-e92437e2ec60\" /></table><table name=\"C_BP_Group\" level=\"2\" Identifier=\"722b2af5-3539-9dc0-5a25-fadf921821d3\"><column name=\"C_BP_Group_ID\" value=\"1000253\" /><column name=\"CreditWatchPercent\" value=\"0\" /><column name=\"IsConfidentialInfo\" value=\"N\" /><column name=\"IsDefault\" value=\"N\" /><column name=\"Name\" value=\"General\" /><column name=\"PriceMatchTolerance\" value=\"0\" /><column name=\"PriorityBase\" value=\"S\" /><column name=\"Value\" value=\"1000201\" /><column name=\"Identifier\" value=\"722b2af5-3539-9dc0-5a25-fadf921821d3\" /></table><table name=\"C_BPartner\" level=\"1\" Identifier=\"390545e4-38ca-035b-5ae6-04cab3ecb268\"><column name=\"AcqusitionCost\" value=\"0\" /><column name=\"ActualLifeTimeValue\" value=\"0\" /><column name=\"C_BP_DocTypeI\" value=\"D\" /><column name=\"C_BPartner_ID\" value=\"2049765\" /><column name=\"IsCustomer\" value=\"Y\" /><column name=\"IsDiscountPrinted\" value=\"N\" /><column name=\"IsEmployee\" value=\"Y\" /><column name=\"IsOneTime\" value=\"N\" /><column name=\"IsProspect\" value=\"N\" /><column name=\"IsRetention\" value=\"N\" /><column name=\"IsSalesRep\" value=\"Y\" /><column name=\"IsSummary\" value=\"N\" /><column name=\"IsTaxExempt\" value=\"N\" /><column name=\"IsVendor\" value=\"N\" /><column name=\"Name\" value=\"FIESTAS PURIZACA ELENA MARGOT\" /><column name=\"PotentialLifeTimeValue\" value=\"0\" /><column name=\"SOCreditStatus\" value=\"X\" /><column name=\"SO_CreditLimit\" value=\"0\" /><column name=\"SO_CreditUsed\" value=\"0\" /><column name=\"SalesVolume\" value=\"0\" /><column name=\"SendEMail\" value=\"N\" /><column name=\"ShareOfCustomer\" value=\"0\" /><column name=\"TaxID\" value=\"03676428\" /><column name=\"TotalOpenBalance\" value=\"0\" /><column name=\"Value\" value=\"03676428\" /><column name=\"Points\" value=\"32\" /><column name=\"SO_CreditOverLimit\" value=\"0\" /><column name=\"Identifier\" value=\"390545e4-38ca-035b-5ae6-04cab3ecb268\" /></table></master>";
			SAXBuilder builder = new SAXBuilder();
			Document document = (Document) builder.build(new StringReader(xml));
			Element node = document.getRootElement();
			int maxlevel = node.getAttribute("level").getIntValue();
			List<Element> tables = node.getChildren("table");
			for (int i=maxlevel; i > 0; i--)
			{
				for (Element table:tables)
				{
					System.out.println(table.getAttribute("name"));
					String tn = table.getAttribute("name").getValue();
					Attribute attr = table.getAttribute("level");
					int level = attr.getIntValue();
					String identifier = table.getAttribute( X_AD_Table.COLUMNNAME_Identifier).getValue();					 
					//
					//clazz = Class.forName("org.compiere.model.persistence.X_"+tn);
					PO poi = new Query(Env.getCtx(), tn, "Identifier = ?", null)
					.setParameters(identifier).first();
					if (poi == null)
					{
						//tn
						System.out.println(level);
						List<Element> columns = table.getChildren("column");
						for (Element column:columns) 
						{
							System.out.println(column.getAttribute("name"));
						}						
					}
					
				}
			}
		}
		catch (Exception e)
		{					
			e.printStackTrace();		
		}
		return null;
	}

	public static void main(String[] params) {
		Master master = new Master();
		master.doIt();
	}

	private void processtable(Class<?> clazz, PO po, int level) throws Exception {
		level ++;		
		m_level = level;
		Vector vector = new Vector();
		vector.add(X_AD_Table.COLUMNNAME_TableName);
		vector.add(po.get_TableName());
		vector.add(level);					
		vector.add(X_AD_Table.COLUMNNAME_AD_Table_ID);
		//
		String Identifier = "";
		int Identifier_ID = MColumn.getColumn_ID(po.get_TableName(),  X_AD_Table.COLUMNNAME_Identifier, po.get_TrxName());
		if (Identifier_ID == 0)
			System.out.println(po.get_TableName()+" no tiene columna identifier");		
		else
		{
			Identifier = (String) po.get_Value( X_AD_Table.COLUMNNAME_Identifier);			
		}
		vector.add(Identifier);	
		items.add(vector);			
		Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
		String[] KeyColumn = po.get_KeyColumns();			
		if ( KeyColumn.length > 0 )
		{
			String ColumnKeyName =  KeyColumn[0];
			Field[] fields = clazz.getDeclaredFields();
			for (int i = 0; i < fields.length; i++)
			{
				String field = fields[i].getName();
				if (field.startsWith("COLUMNNAME_"))
				{
					String columnName = field.substring("COLUMNNAME_".length());
					Object ii = po.get_Value(columnName);
					if (columnName.endsWith("_ID"))
					{						
						if (ii != null && ii instanceof Integer) 
						{							
							if ((Integer) ii == 0)
								continue;							
							int AD_Column_ID = MColumn.getColumn_ID(po.get_TableName(), columnName, po.get_TrxName());
							MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
							if (column.getAD_Reference_ID() == DisplayType.ID)
							{
								vector = new Vector();
								vector.add(columnName);
								vector.add(ii);
								vector.add(level);					
								vector.add(X_AD_Column.COLUMNNAME_AD_Column_ID);
								vector.add(po.get_TableName());
								items.add(vector);	
								//
								//int Identifier_ID = MColumn.getColumn_ID(po.get_TableName(),  X_AD_Table.COLUMNNAME_Identifier, po.get_TrxName());
								//if (Identifier_ID == 0)
								//	System.out.println(po.get_TableName()+" no tiene columna identifier");
							}
							if (column.getAD_Reference_Value_ID() > 0 )
							{
								String wheretableref = "AD_Reference_ID='"+column.getAD_Reference_Value_ID()+"'";
								X_AD_Reference reference = new Query(Env.getCtx(), "AD_Reference", wheretableref, po.get_TrxName()).first();
								if (reference != null)
								{
									if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
									{
										MRefTable reftable = new Query(Env.getCtx(), "AD_Ref_Table", wheretableref, po.get_TrxName()).first();
										if (reftable != null)
										{
											MTable table = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());											
											Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());
											//Constructor<?> constructor = null;											
											constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
											PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});		
											processtable(subclazz, pox, level);
										}										
									}
								}

							}
							else if (column.getAD_Reference_ID() == DisplayType.TableDir || 
									column.getAD_Reference_ID() == DisplayType.Location ||
									column.getAD_Reference_ID() == DisplayType.Search ||
									column.getAD_Reference_ID() == DisplayType.Locator )
							{
								String tableName = columnName.substring(0, columnName.indexOf("_ID"));
								MTable table = MTable.get(Env.getCtx(), tableName);
								if (table == null)
									throw new XendraException (" table "+tableName+ " no encontrado llamado por "+po.toString());
								Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());								
								constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
								PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
								if (pox.get_ID() > 0)
								{
									processtable(subclazz, pox, level);
								}
							}							
						}
					}
					else if (ii != null) // un value plano
					{
						vector = new Vector();
						vector.add(columnName);
						vector.add(ii);
						vector.add(level);
						vector.add(X_AD_Column.COLUMNNAME_AD_Column_ID);
						vector.add(po.get_TableName());
						items.add(vector);
					}
				}
			}						
		}					
	}
}
