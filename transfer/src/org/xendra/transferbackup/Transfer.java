package org.xendra.transferbackup;

import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Xendrian_Message;
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
import org.xendra.Constants;
import org.xendra.db.Querys;

public class Transfer extends SvrProcess {

	private int AD_Process_ID;
	@Override
	protected void prepare() {
		AD_Process_ID = getProcessInfo().getAD_Process_ID();
		
	}

	@Override
	protected String doIt() throws Exception {
		System.out.println("ejecutando transfer");
		String query = "AD_Process_ID = ? AND Processed = 'N'";		
		List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, query,  get_TrxName()).setParameters(AD_Process_ID).list();
		for (X_A_Xendrian_Message message:messages)
		{

			SAXBuilder builder = new SAXBuilder();

			//		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>";
			//		xml += "<doc Header=\"M_Movement\" Line0=\"M_MovementLine\" Line1=\"M_MovementLine\" Lines=\"\">";
			//		xml += "<Line1 C_UOM_ID=\"05cc1a31-a158-d9fe-704e-011203ead6a0\" ConfirmedQty=\"0\" Identifier=\"d2e859ba-0fc3-43b2-aa1a-91a21383d0ac\" IsCosted=\"N\" Line=\"20\" M_LocatorTo_ID=\"cf2b7771-060e-2b68-3b13-7228274e1e68\" M_Locator_ID=\"45e194bf-5c2e-6da7-d78d-f19c8bceb548\" M_Movement_ID=\"fedb32f9-ee70-4798-9ab9-5d42e1b8d83b\" M_Product_ID=\"1bb8f4c2-4bab-2f4b-db02-b7d372c5cc09\" MovementQty=\"12.00\" Processed=\"N\" QtyEntered=\"0\" ScrappedQty=\"0\" TargetQty=\"0\"/>";
			//		xml += "<Line0 C_UOM_ID=\"05cc1a31-a158-d9fe-704e-011203ead6a0\" ConfirmedQty=\"0\" Identifier=\"a9f2baac-f0e3-4794-95dd-3f5f24716e5e\" IsCosted=\"N\" Line=\"10\" M_LocatorTo_ID=\"cf2b7771-060e-2b68-3b13-7228274e1e68\" M_Locator_ID=\"45e194bf-5c2e-6da7-d78d-f19c8bceb548\" M_Movement_ID=\"fedb32f9-ee70-4798-9ab9-5d42e1b8d83b\" M_Product_ID=\"761a2517-3be1-9289-cd1b-dbefdae77c54\" MovementQty=\"24.00\" Processed=\"N\" QtyEntered=\"0\" ScrappedQty=\"0\" TargetQty=\"0\"/>";
			//		xml += "<Lines count=\"2\"/>";
			//		xml += "<Header ApprovalAmt=\"0\" C_DocType_ID=\"0bbecd09-77df-09a8-068d-d7ee2c96a716\" DeliveryRule=\"F\" DeliveryViaRule=\"D\" DocAction=\"CO\" DocStatus=\"IP\" DocumentNo=\"001-04132-PRUEBAS\" Identifier=\"fedb32f9-ee70-4798-9ab9-5d42e1b8d83b\" IsApproved=\"N\" IsInTransit=\"Y\" MovementDate=\"2015-04-04 11:11:27.0\" NoPackages=\"0\" Posted=\"N\" Processed=\"N\" Processing=\"N\"/>";
			//		xml += "</doc>";						
			//		Document document = (Document) builder.build(new StringReader(xml));

			Document document = (Document) builder.build(new StringReader(message.getMessage()));

			Element node = document.getRootElement();
			List nodes = node.getAttributes();

			query = "identifier = ?";

			for (int i=0; i < nodes.size(); i++)
			{
				Attribute attr = (Attribute) nodes.get(i);					
				String tablename = attr.getValue();
				if (tablename.length() > 0)
				{					
					Element docpart = (Element) node.getChild(attr.getName());
					String identifier = docpart.getAttribute(X_AD_Table.COLUMNNAME_Identifier).getValue();
					PO po = new Query(Env.getCtx(), tablename, query, null)
					.setParameters(identifier)
					.first();
					if (po == null)
					{
						List columns = docpart.getAttributes();
						for (int j=0; j < columns.size(); j++)
						{
							Attribute column = (Attribute) columns.get(j);
							String columnName = column.getName();
							String columnvalue = column.getValue();
							if (columnName.endsWith("_ID"))
							{							
								String tablenameref = columnName.substring(0, columnName.indexOf("_ID"));
								MTable table = MTable.get(Env.getCtx(), tablenameref);
								if (table == null) // no es table ID sino referencia, buscar su referencia en el AD
								{
									int MColumnID = MColumn.getColumn_ID(po.get_TableName(), columnName, null);
									MColumn columnref = new MColumn(Env.getCtx(), MColumnID, null);
									X_AD_Reference ref = new X_AD_Reference(Env.getCtx(), columnref.getAD_Reference_Value_ID(), null);
									if (ref.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
									{
										X_AD_Ref_Table refTable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID  = ?", null)
										.setParameters(ref.getAD_Reference_ID()).first();
										table = new MTable(Env.getCtx(), refTable.getAD_Table_ID(), null);
										tablenameref = table.getTableName();
										table = MTable.get(Env.getCtx(), tablenameref);
										if (table == null)
										{
											System.out.println("WTF!"); 
										}
									}																								
								}
								PO poref = new Query(Env.getCtx(), tablenameref , "identifier = ?", null)
								.setParameters(columnvalue).first();
								if (poref != null)
								{
									columnvalue = String.valueOf(poref.get_ID());
								}							
							}
							po.setForceValueOfColumn(columnName, columnvalue);

						}
						po.save();
					}			
				}									
			}
		}
		return null;
	}

	public static void main(String args[]) {
		try {
			org.compiere.Xendra.startup(false);
			Transfer transfer = new Transfer();
			transfer.doIt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}