/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2012 Francisco Morosini, Inc. All Rights Reserve             *
 * This program is free software;											  *
 you can redistribute it and/or modify it    								  *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.xendra.process.update;

import org.compiere.model.MColumn;
import org.compiere.model.MField;
import org.compiere.model.MProcess;
import org.compiere.model.MTab;
import org.compiere.model.MTable;
import org.compiere.model.MWindow;
import org.compiere.model.M_Element;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_FieldGroup;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xendra.model.sql;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.*;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DBtoxml extends SvrProcess {
	private int m_AD_Table_ID;
	private String mFileName;
	private MTable table = null;
	private DocumentBuilder builder = null;
	//private String path = "C:\\Users\\xapiens\\activedictionary\\";
	private String path = "/home/katniss/activedictionary/";
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Table_ID"))
				m_AD_Table_ID = para[i].getParameterAsInt();			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}
	private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	private static Timestamp now = new Timestamp(System.currentTimeMillis());
	
	protected String process(MTable ptable) throws Exception
	{
		builder = factory.newDocumentBuilder();		
		//table = new MTable(Env.getCtx(), m_AD_Table_ID, null);
		table = ptable;		
		//writetable();
		Timestamp lupdated = ptable.getSynchronized();
		if (lupdated == null)
			lupdated = now;
		MColumn[] columns = table.getColumns(true);
		for (MColumn column:columns)
		{
			try {				
				System.out.println(column.getName());
				mFileName = path+table.getTableName()+"_"+column.getColumnName()+".xml";
				builder = factory.newDocumentBuilder();
				Document doc = builder.newDocument();
				Element xroot = doc.createElement("xml");
				doc.appendChild(xroot);

				Element xelement = buildelement(doc, column);
				xroot.appendChild(xelement);
				Element xcolumn = doc.createElement("column");
				xroot.appendChild(xcolumn);
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_Name);
				xcolumn.setAttribute("IsActive", column.isActive() ? "Y":"N");
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_IsMandatory);
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_FieldLength);
				buildreference(path, xcolumn, X_AD_Column.COLUMNNAME_AD_Reference_ID, column.getAD_Reference_ID());
				buildreference(path, xcolumn, X_AD_Column.COLUMNNAME_AD_Reference_Value_ID,column.getAD_Reference_Value_ID());
				buildvalidation(path, xcolumn, X_AD_Column.COLUMNNAME_AD_Val_Rule_ID,column.getAD_Val_Rule_ID());
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_IsUpdateable);
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_IsParent);
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_IsIdentifier);
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_IsKey);
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_Callout);
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_DefaultValue);
				if (column.getIdentifier() == null || column.getIdentifier().length() == 0)
				{
					column.setIdentifier(Util.getUUID());
					column.save();
				}
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_Identifier);
				if (column.getSynchronized() == null)
				{					
					column.setSynchronized(now);
					column.save();
				}
				else if (column.getUpdated().compareTo(column.getSynchronized()) > 0)
				{
					column.setSynchronized(column.getUpdated());
					column.save();
				}
				if (column.getSynchronized().compareTo(lupdated) > 0)
					lupdated = column.getSynchronized();
				Util.setattrToElem(xcolumn, column, X_AD_Column.COLUMNNAME_Synchronized);

				// demas campos
				if (column.getAD_Process_ID() > 0)
				{
					MProcess proc = MProcess.get(Env.getCtx(), column.getAD_Process_ID());
					if (proc != null)
					{
						String idprocess = proc.getIdentifier();
						if (idprocess == null || idprocess.length() == 0)
						{
							proc.setIdentifier(Util.getUUID());
							proc.save();
							idprocess = proc.getIdentifier();
						}
						xcolumn.setAttribute("process", idprocess);
					}
				}
				//save the document
				System.out.println(mFileName.toString());
				Util.writeXmlToFile(mFileName, doc);
			}
			catch (ParserConfigurationException e) {
				e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.	        
			}
		} 		
		writetable(lupdated);
		return null;		
	}
	protected String doIt () throws Exception 
	{
		if (m_AD_Table_ID == 0)
		{
			List<MTable> m_tables = new Query(Env.getCtx(), X_AD_Table.Table_Name , "IsActive='Y'", null).list();
			for (MTable table:m_tables)
			{
				process(table);
			}
		}
		else
		{
			MTable table = new MTable(Env.getCtx(), m_AD_Table_ID, null);
			if (table != null)
				process(table);
		}
		return null;
	}
	
	public static void buildvalidation(String path, Element xcolumn,String namevalidation, Integer valID) {
		if (valID == 0)
			return;
		
		X_AD_Val_Rule valrule = new X_AD_Val_Rule(Env.getCtx(), valID, null);
		
		if (valrule.getAD_Val_Rule_ID() == 0)
			return;
		
		String refId = valrule.getIdentifier();
		if (refId == null)
		{
			refId = Util.getUUID();
			valrule.setIdentifier(refId);
			valrule.save();
		}
		if (valrule.getSynchronized() == null)
		{
			valrule.setSynchronized(now);
			valrule.save();
		}
		xcolumn.setAttribute(namevalidation, refId);
		
		String refFileName = path+refId+".xml";
		System.out.println(refFileName);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}		
		Document doc = builder.newDocument();
		Element root = doc.createElement("xml");
		doc.appendChild(root);
		Element rule = doc.createElement("rule");
		Util.setattrToElem(rule, valrule, X_AD_Val_Rule.COLUMNNAME_Name);
		Util.setattrToElem(rule, valrule, X_AD_Val_Rule.COLUMNNAME_Description);
		Util.setattrToElem(rule, valrule, X_AD_Val_Rule.COLUMNNAME_Type);
		Util.setattrToElem(rule, valrule, X_AD_Val_Rule.COLUMNNAME_Code);
		Util.setattrToElem(rule, valrule, X_AD_Val_Rule.COLUMNNAME_EntityType);
		Util.setattrToElem(rule, valrule, X_AD_Val_Rule.COLUMNNAME_Synchronized);
		root.appendChild(rule);		
		Util.writeXmlToFile(refFileName, doc);
		
	}
	public static void buildreference(String path, Element xcolumn, String name, Integer referenceID){
		if (referenceID == 0)
		{
			xcolumn.setAttribute(name, "");
			return;
		}
		X_AD_Reference reference = new X_AD_Reference(Env.getCtx(), referenceID, null);
		
		if (reference.getAD_Reference_ID() == 0)
			return;
										
		if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.DataType))
		{
			xcolumn.setAttribute(name, referenceID.toString());
			return;
		}
		
		String refId = reference.getIdentifier();
		if (refId == null)
		{		
			refId = Util.getUUID();
			reference.setIdentifier(refId);
			reference.save();
		}

		xcolumn.setAttribute(name, refId);
		
		String refFileName = path+refId+".xml";
		System.out.println("reference->"+refFileName);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}
		Document doc = builder.newDocument();
		Element root = doc.createElement("xml");
		doc.appendChild(root);
		Element xreference = doc.createElement("reference");
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_Name);
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_Description);
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_Help);
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_ValidationType);
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_VFormat);
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_EntityType);
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_IsOrderByValue);
		Timestamp modified = reference.getSynchronized();
		if (modified == null)
			modified = now;

		if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
		{
			String m_keyColumnName = null;
			String m_tableName = null;			
			String displayColumnName = null;
			String whereClause = null; 
			String orderbyClause = null;
			String isValueDisplayed = null;
			String entitytype = null;
			String identifier = null;
			Timestamp syncroTableRef = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try
			{
				pstmt = DB.prepareStatement(sql.VALIDATIONTYPE_TableValidation, null);
				pstmt.setInt(1, reference.getAD_Reference_ID());
				rs = pstmt.executeQuery();
				if (rs.next())
				{									
					m_keyColumnName = Util.getvalue(rs, "kcolumnname");
					displayColumnName = Util.getvalue(rs,"dcolumnName");
					m_tableName = Util.getvalue(rs, "tablename");
					whereClause = Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_WhereClause);
					orderbyClause = Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_OrderByClause);
					isValueDisplayed = Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed);
					entitytype = Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_EntityType);
					identifier = Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_Identifier);
					syncroTableRef = rs.getTimestamp(X_AD_Ref_Table.COLUMNNAME_Synchronized);
					if (syncroTableRef != null && syncroTableRef.compareTo(modified) > 0)
						modified = syncroTableRef;
					if (syncroTableRef == null)
						syncroTableRef = now;					
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				DB.close(rs, pstmt);
				rs = null; pstmt = null;
			}
			if (!m_keyColumnName.isEmpty())
			{
				Element xtablereference = doc.createElement("tablereference");
				xtablereference.setAttribute("tablename", m_tableName);				
				xtablereference.setAttribute("pkey", m_keyColumnName);				
				xtablereference.setAttribute("display", displayColumnName);
				xtablereference.setAttribute(X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed, isValueDisplayed);
				xtablereference.setAttribute(X_AD_Ref_Table.COLUMNNAME_WhereClause, whereClause);
				xtablereference.setAttribute(X_AD_Ref_Table.COLUMNNAME_OrderByClause, orderbyClause);
				xtablereference.setAttribute(X_AD_Ref_Table.COLUMNNAME_EntityType, entitytype);
				xtablereference.setAttribute(X_AD_Ref_Table.COLUMNNAME_Identifier, identifier);
				xtablereference.setAttribute(X_AD_Ref_Table.COLUMNNAME_Synchronized, syncroTableRef.toString());
				root.appendChild(xtablereference);
			}
		}
		else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
		{
			String sql = "SELECT * FROM AD_Ref_List WHERE AD_Reference_ID=?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try
			{
				pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, reference.getAD_Reference_ID());
				rs = pstmt.executeQuery();
				while (rs.next())
				{
					X_AD_Ref_List rl = new X_AD_Ref_List(Env.getCtx(), rs, null);
					if (rl.getIdentifier() == null)
					{
						rl.setIdentifier(Util.getUUID());
						rl.save();
					}

					if (rl.getSynchronized() == null)
					{
						rl.setSynchronized(now);
						rl.save();
					}				
					Timestamp syncroTableRef = rl.getSynchronized(); 
					if (syncroTableRef != null && syncroTableRef.compareTo(modified) > 0)
						modified = syncroTableRef;					
					Element listreference = doc.createElement("listreference");
					Util.setattrToElem(listreference, rl, X_AD_Ref_List.COLUMNNAME_Value);
					Util.setattrToElem(listreference, rl, X_AD_Ref_List.COLUMNNAME_Name);
					Util.setattrToElem(listreference, rl, X_AD_Ref_List.COLUMNNAME_Identifier);
					Util.setattrToElem(listreference, rl, X_AD_Ref_List.COLUMNNAME_Synchronized);
					root.appendChild(listreference);
					
				}
				rs.close();
				pstmt.close();
				pstmt = null;
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				DB.close(rs, pstmt);
				rs = null; pstmt = null;
			}			
		}	
		
		if (reference.getSynchronized() == null)
		{
			reference.setSynchronized(now);
			reference.save();
		}
		if (modified.compareTo(reference.getSynchronized()) > 0)
		{
			reference.setSynchronized(modified);
			reference.save();
		}
		Util.setattrToElem(xreference, reference, X_AD_Reference.COLUMNNAME_Synchronized);
		root.appendChild(xreference);

		Util.writeXmlToFile(refFileName, doc);
	}
	


	private void writetable(Timestamp lupdated) {
			mFileName = path+"t_"+table.getTableName()+".xml";			
			Document doc = builder.newDocument();
			Element xroot = doc.createElement("xml");
			doc.appendChild(xroot);
			Element xtable = doc.createElement("table");
			if (table.getIdentifier() == null)
			{
				table.setIdentifier(Util.getUUID());
				table.save();
			}
			if (table.getSynchronized() == null)
			{
				table.setSynchronized(lupdated);
				table.save();
			}
			else if (table.getSynchronized().compareTo(lupdated) < 0)
			{
				table.setSynchronized(lupdated);
				table.save();
			}
			Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_Name);
			Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_AccessLevel);
			Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_IsDeleteable);
			Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_IsHighVolume);
			//Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_IsReplicated);
			Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_Identifier);
			Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_IsView);
			table.setSynchronized(now);
			table.save();
			Util.setattrToElem(xtable, table, X_AD_Table.COLUMNNAME_Synchronized);
			if (table.getAD_Window_ID() > 0)
			{				
				xtable.setAttribute("window", Windowtoxml.writeform(table.getAD_Window_ID(),path, get_TrxName()));
				//Util.addattr(xtable, table, X_AD_Table.COLUMNNAME_AD_Window_ID);
			}
			xroot.appendChild(xtable);
			Util.writeXmlToFile(mFileName, doc);				
	}
	
	public static Element buildelement(Document doc, MColumn column) throws ParserConfigurationException {
		Element xelement = doc.createElement("element");
		M_Element element = new M_Element(Env.getCtx(), column.getAD_Element_ID(), null);			
		Util.setattrToElem(xelement, element, X_AD_Element.COLUMNNAME_Name);
		Util.setattrToElem(xelement, element, X_AD_Element.COLUMNNAME_Description);
		if (element.getIdentifier() == null || element.getIdentifier().length() == 0)
		{
			element.setIdentifier(Util.getUUID());
			element.save();
		}
		Util.setattrToElem(xelement, element, X_AD_Element.COLUMNNAME_Identifier);
		Util.setattrToElem(xelement, element, X_AD_Element.COLUMNNAME_Help);
		Util.setattrToElem(xelement, element, X_AD_Element.COLUMNNAME_ColumnName);
		Util.setattrToElem(xelement, element, X_AD_Element.COLUMNNAME_PrintName);
		if (element.getSynchronized() == null)
		{
			element.setSynchronized(now);
			element.save();
		}
		Util.setattrToElem(xelement, element, X_AD_Element.COLUMNNAME_Synchronized);
		return xelement;
	}

	public String getFileName()
    {
        if (mFileName == null) {
            mFileName = JOptionPane.showInputDialog(null, "input", 
                    "header", JOptionPane.QUESTION_MESSAGE);
        }    	
        if (mFileName != null && mFileName.length() > 0) {
        	return mFileName;
        }
        return "";
    }	
}
