package org.xendra.process.update;

import org.compiere.model.MWindow;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.model.MColumn;
import org.compiere.model.MField;
import org.compiere.model.MProcess;
import org.compiere.model.MTab;
import org.compiere.model.MTable;
import org.compiere.model.MWindow;
import org.compiere.model.M_Element;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Field;
import org.compiere.model.persistence.X_AD_FieldGroup;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
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


public class Windowtoxml extends SvrProcess {

	//private String path = "C:\\Users\\xapiens\\activedictionary\\";
	private String path = "/home/katniss/activedictionary/";
	private int m_AD_Window_ID;
	//private DocumentBuilderFactory factory;
	private static Timestamp now = new Timestamp(System.currentTimeMillis()); 
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Window_ID"))
				m_AD_Window_ID = para[i].getParameterAsInt();			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	protected String doIt() throws Exception {
		//factory = DocumentBuilderFactory.newInstance();
		//DocumentBuilder builder = factory.newDocumentBuilder();
		StringBuffer sb = new StringBuffer();
		List<MWindow> windows = new Query(Env.getCtx(), X_AD_Window.Table_Name, "IsActive = 'Y' AND IsBetaFunctionality = 'N'", get_TrxName()).setOrderBy(X_AD_Window.COLUMNNAME_AD_Window_ID).list();
		for (MWindow window:windows)
		{
			if (window.getIdentifier() == null)
			{
				window.setIdentifier(Util.getUUID());
				window.save();
			}
			sb = sb.append("public static final String WINDOWNAME_").append(window.getAD_Window_ID()).append(" = \"").append(window.getIdentifier()).append("\";").append("\n");
			writeform(window, path, get_TrxName());
		}
		createWindowList(sb);
		return null;
	}

	private void createWindowList(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.window;\n\n");
		header = header.append("public class X_AD_WindowList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_WindowList.java");
	}
	

	private String getvalue(ResultSet rs, String namecolumn) {
		String value = null;
		try {
			value = rs.getString(namecolumn);
			if (value == null)
				value = "";		
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return value;
	}
	public static String writeform(int C_Window_ID, String path,  String trxName) {
		MWindow window = new MWindow(Env.getCtx(), C_Window_ID, trxName);		
		return writeform(window, path, trxName);
	}
	public static String writeform(MWindow window, String path,  String trxName) {		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (window.getIdentifier() == null)
		{			
			window.setIdentifier(Util.getUUID());
			window.save();
		}
		
		Timestamp LastSyncro = window.getSynchronized();
		
		if (LastSyncro == null)
			LastSyncro = now;
		
		for (MTab tab:window.getTabs(false, trxName))
		{
			if (tab.getIdentifier() == null)
			{
				tab.setIdentifier(Util.getUUID());
				tab.save();				
			}
			if (tab.getSynchronized() == null)
			{
				tab.setSynchronized(now);
				tab.save();
			}
			if (LastSyncro.compareTo(tab.getSynchronized()) < 0)
				LastSyncro = tab.getSynchronized();
		}
		
		if (window.getSynchronized() == null || window.getSynchronized().compareTo(LastSyncro) != 0)
		{
			window.setSynchronized(LastSyncro);
			window.save();
		}
		
		String FileName = path+window.getIdentifier()+".xml";
		Document doc = builder.newDocument();
		Element xroot = doc.createElement("xml");
		doc.appendChild(xroot);
		Element xwindow = doc.createElement("window");
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_Identifier);
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_Synchronized);
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_Name);
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_Description);
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_Help);
		
		xwindow.setAttribute("isactive", window.isActive() ? "Y" : "N");
		
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_IsBetaFunctionality);
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_WindowType);
		// color
		//xwindow.setAttribute("image", window.getAD_Image_ID()) // afinar
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_IsSOTrx);
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_WinHeight);
		Util.setattrToElem(xwindow, window, X_AD_Window.COLUMNNAME_WinWidth);
		//
		for (MTab tab:window.getTabs(false, trxName))
		{
			Element xtab = doc.createElement("tab");
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_Identifier);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_Synchronized);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_Name);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_Description);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_Help);
			
			MTable table = MTable.get(Env.getCtx(), tab.getAD_Table_ID());
			String tableIdentifier = table.getIdentifier();
			if (tableIdentifier == null && !table.getName().endsWith("Trl"))
			{
				System.out.println("Table <"+table.getName()+"> no tiene Identifier, error critico");
				System.exit(1);
			}
			xtab.setAttribute("table", table.getIdentifier());
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_EntityType);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_SeqNo);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_TabLevel);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_IsSingleRow);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_IsAdvancedTab);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_HasTree);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_IsInfoTab);			
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_IsSortTab);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_IsTranslationTab);

			if (tab.getAD_Column_ID() > 0)
			{
				MColumn column = MColumn.get(Env.getCtx(), tab.getAD_Column_ID());
				if (column.getIdentifier() == null)
				{
					String columnIdentifier = Util.getUUID();
					column.setIdentifier(columnIdentifier);
					column.save();
				}
				xtab.setAttribute("AD_Column_ID", column.getIdentifier());
			}
			if (tab.getParent_Column_ID() > 0)
			{
				MColumn column = MColumn.get(Env.getCtx(), tab.getParent_Column_ID());
				if (column.getIdentifier() == null)
				{
					String columnIdentifier = Util.getUUID();
					column.setIdentifier(columnIdentifier);
					column.save();					
				}
				xtab.setAttribute("Parent_Column_ID", column.getIdentifier());
			}
			if (tab.getAD_Process_ID() > 0 )
			{
				MProcess process = MProcess.get(Env.getCtx(), tab.getAD_Process_ID());
				if (process.getIdentifier() == null)
				{
					String processIdentifier = Util.getUUID();
					process.setIdentifier(processIdentifier);
					process.save();
				}
				xtab.setAttribute("AD_Process_ID", process.getIdentifier());
			}
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_DisplayLogic);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_IsReadOnly);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_IsInsertRecord);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_ReadOnlyLogic);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_CommitWarning);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_WhereClause);
			Util.setattrToElem(xtab, tab, X_AD_Tab.COLUMNNAME_OrderByClause);
			for (MField field:tab.getFields(false, trxName))
			{
				Element xfield = doc.createElement("field");
				if (field.getIdentifier() == null)
				{
					field.setIdentifier(Util.getUUID());
					field.save();
				}
				if (field.getSynchronized() == null)
				{
					field.setSynchronized(now);
					field.save();
				}
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_Identifier);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_Synchronized);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_Name);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_Description);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_Help);
				//xfield.setAttribute("isactive", field.isActive() ? "Y" : "N");
				
				if ( field.getIncluded_Tab_ID() > 0 )
				{
					MTab includedtab = new MTab(Env.getCtx(), field.getIncluded_Tab_ID(), trxName);
					xfield.setAttribute("includedtab", includedtab.getIdentifier());
				}
				MColumn column = MColumn.get(Env.getCtx(), field.getAD_Column_ID());
				xfield.setAttribute("column", column.getIdentifier());
				if (field.getAD_FieldGroup_ID() > 0)
				{
					X_AD_FieldGroup fieldgroup = new X_AD_FieldGroup(Env.getCtx(), field.getAD_FieldGroup_ID(), trxName);
					xfield.setAttribute("fieldgroup", fieldgroup.getName());
				}
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_IsCentrallyMaintained);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_IsDisplayed);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_IsReadOnly);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_DisplayLogic);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_DisplayLength);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_IsEncrypted);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_SeqNo);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_IsSameLine);
				Util.setattrToElem(xfield, field, X_AD_Field.COLUMNNAME_SortNo);
				xtab.appendChild(xfield);
			}
			xwindow.appendChild(xtab);
		} //
		xroot.appendChild(xwindow);
		Util.writeXmlToFile(FileName, doc);
		return window.getIdentifier();
		
	}
	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		Windowtoxml sp = new Windowtoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}
