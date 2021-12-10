/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
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
 * Contributor(s): Carlos Ruiz - globalqss                                    *
 *                 Teo Sarca
 *****************************************************************************/
package org.xendra.developer;

import java.io.*;
import java.lang.reflect.Field;
import java.math.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.*;

import net.sf.extcos.ComponentQuery;
import net.sf.extcos.ComponentScanner;

import org.compiere.*;
import org.compiere.model.MIndex;
import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.model.Reference;
import org.compiere.model.ValRule;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_Field;
import org.compiere.model.persistence.X_AD_FieldGroup;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_Index;
import org.compiere.model.persistence.X_AD_Package;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.annotations.XendraRefItem;
import org.xendra.annotations.XendraValRule;
import org.xendra.db.Querys;

/**
 *  Generate Model Classes extending PO.
 *  Base class for CMP interface - 
 *
 *  @author Jorg Janke
 *  @version $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $
 *  
 *  globalqss - Grant independence to GenerateModel from AD_Table_ID
 *  globalqss - Filter by table (LIKE)
 *  
 *  globalqss - integrate Teo Sarca hint [ 1617928 ] Ineficient use of Boolean ctor for gen. model
 *  teo_sarca - bug fix [ 1651801 ] GenerateModel: duplicate "getKeyNamePair" methods
 *  teo_sarca - feature request [ 1662447 ] Add column names in model classes
 *  xapiens - added XML, HStore and using the constant column for
 *  xapiens - added annotations for automatically updating screens and validations   		  
 */
public class GenerateModelView
{
	//private HashMap fieldname;
	private int keycnt;

	public GenerateModelView()
	{
		configvalrules();
		configReferences();		
	}
	/**
	 * 	Generate PO Class
	 * 	@param AD_Table_ID table id
	 * 	@param directory directory with \ or / at the end.
	 * 	@param packageName package name
	 */
	public GenerateModelView (int AD_Table_ID, String directory, String packageName)
	{		
//		this.references = references;
//		this.valrule = valrule;		
		//fieldname = new HashMap();
		keycnt = 0;
		//	create column access methods
		StringBuffer mandatory = new StringBuffer();
		StringBuffer sb = createColumns(AD_Table_ID, mandatory);
		// add header stuff
		String tableName = createHeader(AD_Table_ID, sb, mandatory, packageName);
		//	Save it
		writeToFile (sb, directory + tableName + ".java");
	}	//	GenerateModel

	/** File Header			*/
	public static final String COPY = 
			"/******************************************************************************\n"
					+" * Product: Xendra ERP & CRM Smart Business Solution                          *\n"
					+" * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *\n"
					+" * This program is free software. you can redistribute it and/or modify it    *\n"
					+" * under the terms version 2 of the GNU General Public License as published   *\n"
					+" * by the Free Software Foundation. This program is distributed in the hope   *\n"
					+" * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *\n"
					+" * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *\n"
					+" * See the GNU General Public License for more details.                       *\n"
					+" * You should have received a copy of the GNU General Public License along    *\n"
					+" * with this program, if not, write to the Free Software Foundation, Inc.,    *\n"
					+" * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *\n"
					+" * For the text or an alternative of this public license, you may reach us    *\n"
					+" * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *\n"
					+" * or via info@compiere.org or http://www.compiere.org/license.html           *\n"
					+" *****************************************************************************/\n";

	/**	Generated on					*/
	private Timestamp 		s_run = new Timestamp(System.currentTimeMillis());

	private static HashMap references = new HashMap();
	private static HashMap valrule = new HashMap();
	private List<String> referenceheaders = new ArrayList<String>();	

	/**	Logger			*/
	private static CLogger	log	= CLogger.getCLogger (GenerateModelView.class);

	/**
	 * 	Add Header info to buffer
	 * 	@param AD_Table_ID table
	 * 	@param sb buffer
	 * 	@param mandatory init call for mandatory columns
	 * 	@param packageName package name
	 * 	@return class name
	 */
	private String createHeader (int AD_Table_ID, StringBuffer sb, StringBuffer mandatory, String packageName)
	{
		X_AD_Table table = new X_AD_Table(Env.getCtx(), AD_Table_ID, null);
		int accessLevel = 0;
		if (table == null || table.getTableName() == null)
			throw new RuntimeException ("TableName not found for ID=" + AD_Table_ID);
		if (table.getIdentifier().length() == 0)
		{
			table.setIdentifier(Util.getUUID());
			table.save();
		}
		Calendar cal = Calendar.getInstance(); // locale-specific
		cal.setTime(new Timestamp(System.currentTimeMillis()));
		cal.set(Calendar.MILLISECOND, 0);		
		table.setSynchronized(new Timestamp(cal.getTimeInMillis()));
		table.save();
		//
		String windowID = getWindowID(table.getAD_Window_ID());
		String POWindowID = getWindowID(table.getPO_Window_ID());
		String valRuleID = getvalRuleID(table.getAD_Val_Rule_ID());
		accessLevel = Integer.valueOf(table.getAccessLevel());
		String accessLevelInfo = table.getAccessLevel() + " ";
		if (accessLevel >= 4 )
			accessLevelInfo += "- System ";
		if (accessLevel == 2 || accessLevel == 3 || accessLevel == 6 || accessLevel == 7)
			accessLevelInfo += "- Client ";
		if (accessLevel == 1 || accessLevel == 3 || accessLevel == 5 || accessLevel == 7)
			accessLevelInfo += "- Org ";
		String keyColumn = table.getTableName() + "_ID";
		String className = "X_" + table.getTableName();
		//
		StringBuffer start = new StringBuffer ()
		.append (COPY)
		.append ("package " + packageName + ";\n"
				+ "/** Generated Model - DO NOT CHANGE */\n");
		if (!packageName.equals("org.compiere.model"))
			start.append("import org.compiere.model.*;");	
		start.append("import java.util.*;"
				+ "import java.sql.*;"
				+ "import java.math.*;"
				+ "import org.xendra.annotations.*;"
				+ "import org.compiere.util.*;");
		if (referenceheaders.size() > 0)
		{
			for (String referenceheader:referenceheaders)
			{
				start.append("import ").append(referenceheader).append(";");
			}
		}
		start.append(	
				//	Class
				"/** Generated Model for ").append(table.getTableName()).append("\n"
						+ " *  @author Xendra (generated) \n"
						+ " *  @version ").append(Xendra.MAIN_VERSION).append(" - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $")
						//	.append(s_run)	//	Timestamp
						.append(" */\n"
								+ "public class ").append(className).append(" extends PO"
										+ "{"
										//	Standard Constructor
										+ "/** Standard Constructor\n@param ctx context\n@param " 
										+ keyColumn + " id\n@param trxName transaction\n*/\n"
										+ "public ").append(className).append(" (Properties ctx, int ").append(keyColumn)
										.append(", String trxName)"
												+ "{"
												+ "super (ctx, ").append(keyColumn).append(", trxName);"
														+ "/** if (").append(keyColumn).append(" == 0)"
																+ "{").append(mandatory).append("} */\n"
																		+ "}"	//	Constructor End
																		//	Short Constructor
																		//			+ "/** Short Constructor */\n"
																		//			+ "public ").append(className).append(" (Properties ctx, int ").append(keyColumn).append(")"
																		//			+ "{"
																		//			+ "this (ctx, ").append(keyColumn).append(", null);"
																		//			+ "}"	//	Constructor End

			//	Load Constructor
			+ "/** Load Constructor \n@param ctx context\n@param rs result set \n@param trxName transaction\n*/\n"
			+ "public ").append(className).append(" (Properties ctx, ResultSet rs, String trxName)"
					+ "{"
					+ "super (ctx, rs, trxName);"
					+ "}"	//	Load Constructor End
					//
					+ "/** AD_Table_ID=").append(AD_Table_ID).append(" */\n"
							// globalqss - Grant independence to GenerateModel from AD_Table_ID
							// + "public static final int Table_ID=").append(AD_Table_ID).append(";\n"
							//+ "public static final int Table_ID=MTable.getTable_ID(\"").append(table.getTableName()).append("\");\n");
							+ "public static int Table_ID=MTable.getTable_ID(\"").append(table.getTableName()).append("\");\n");
		//			
		List<X_AD_Tab> tabs = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(table.getAD_Table_ID()).list();

		HashMap tabname = new HashMap();
		for (X_AD_Tab tab:tabs)
		{
			Vector TabTranslate = new Vector();
			List<X_AD_Column> tabstrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
			.setParameters(X_AD_Tab.Table_ID).list();		
			for (X_AD_Column columntrl:tabstrl)
			{
				try {						
					StringBuilder sqltranslate = new StringBuilder();
					sqltranslate.append("SELECT AD_LANGUAGE,")
					.append(columntrl.getColumnName())
					.append(" FROM ")
					.append(X_AD_Tab.Table_Name).append("_trl ")
					.append(" WHERE ").append(X_AD_Tab.COLUMNNAME_AD_Tab_ID).append("=").append(tab.getAD_Tab_ID());
					PreparedStatement pstmt = DB.prepareStatement (sqltranslate.toString(), null);
					ResultSet rs = pstmt.executeQuery();			
					while (rs.next ())
					{
						String tablang = rs.getString(1);
						String tabnam = columntrl.getColumnName();
						//String tabnam = columntrl.getIdentifier();
						String tabtrl = rs.getString(2);
						if (tabtrl != null)
						{
							Vector vector = new Vector();
							vector.add(tablang);
							vector.add(tabnam);
							vector.add(tabtrl);
							TabTranslate.add(vector);
						}
					}
					pstmt.close();
					rs.close();						
				} catch (Exception e) {	e.printStackTrace(); }									
			}											
			X_AD_Window window = new Query(Env.getCtx(), X_AD_Window.Table_Name, "AD_Window_ID = ?", null)
			.setParameters(tab.getAD_Window_ID()).first();
			String columnid = "";
			String columnorderid = "";
			String columnsortid = "";
			String processid = "";
			String tname = Util.getStringclean(tab.getName());
			String tabincluded = "";
			String parentcolid = "";
			if (tab.getSynchronized() == null)
			{
				tab.setSynchronized(new Timestamp(System.currentTimeMillis()));
				tab.save();
			}
			if (tab.getIdentifier().length() == 0)
			{
				tab.setIdentifier(Util.getUUID());
				tab.save();
			}
			if (tab.getAD_Column_ID() > 0)
			{
				X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
				.setParameters(tab.getAD_Column_ID()).first();
				if (column != null)
					columnid = column.getIdentifier();
			}
			if (tab.getAD_ColumnSortOrder_ID() > 0)
			{
				X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
				.setParameters(tab.getAD_ColumnSortOrder_ID()).first();
				if (column != null)
					columnorderid = column.getIdentifier();					
			}
			if (tab.getAD_ColumnSortYesNo_ID() > 0)
			{
				X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
				.setParameters(tab.getAD_ColumnSortYesNo_ID()).first();
				if (column != null)
					columnsortid = column.getIdentifier();					
			}
			if (tab.getAD_Process_ID() > 0)
			{
				X_AD_Process process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
				.setParameters(tab.getAD_Process_ID()).first();
				if (process != null)
					processid = process.getIdentifier();
			}
			if (tab.getIncluded_Tab_ID() > 0)
			{
				X_AD_Tab tabincl = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
				.setParameters(tab.getAD_Process_ID()).first();
				if (tabincl != null)
					tabincluded = tabincl.getIdentifier();
			}
			if (tab.getParent_Column_ID() > 0)
			{
				X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
				.setParameters(tab.getParent_Column_ID()).first();
				if (column != null)
					parentcolid = column.getIdentifier();
			}
			if (!tabname.containsKey(tname))
				tabname.put(tname, 1);
			else
			{
				Integer sequence = (Integer) tabname.get(tname);
				sequence ++;
				tabname.put(tname, sequence);
				tname += String.valueOf(sequence);
			}							
			if (TabTranslate.size() > 0)
			{					
				//start.append("\n");
				for (Iterator it = TabTranslate.iterator(); it.hasNext();)
				{
					Vector vector = (Vector) it.next();
					String tablang = (String) vector.firstElement();
					String tabnam = (String) vector.get(1);
					String tabtrl = (String) vector.lastElement();
					if (tabtrl == null)
						continue;
					if (tabtrl.contains(";"))
						tabtrl = tabtrl.replaceAll(";", ";;");
					if (tabtrl.contains("\""))
						tabtrl = tabtrl.replace("\"", "\\\"");
					if (tabtrl.contains("\n"))
						tabtrl = tabtrl.replace("\n", "");
					Util.append(start, String.format("@XendraTrl(%s=\"%s\")",X_AD_Tab.COLUMNNAME_Identifier,tab.getIdentifier()));
					Util.append(start, String.format("\npublic static String %s_TAB_%s_%s=\"%s\";", tablang, tname,tabnam,tabtrl));
				}										
			}							
			//start.append("@XendraTab(");
			Util.append(start, String.format("@XendraTab(%s=\"%s\",",X_AD_Tab.COLUMNNAME_Name,tab.getName()));				
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_Description,tab.getDescription()));				
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_Help,tab.getHelp()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_AD_Window_ID,window.getIdentifier()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_SeqNo,tab.getSeqNo()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_TabLevel,tab.getTabLevel()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_IsSingleRow,tab.isSingleRow()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_IsInfoTab,tab.isInfoTab()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_IsTranslationTab,tab.isTranslationTab()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_IsReadOnly,tab.isReadOnly()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_AD_Column_ID,columnid));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_HasTree,tab.isHasTree()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_WhereClause,tab.getWhereClause()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_OrderByClause,tab.getOrderByClause()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_CommitWarning,tab.getCommitWarning()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_AD_Process_ID,processid));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_AD_ColumnSortOrder_ID,columnorderid));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_AD_ColumnSortYesNo_ID,columnsortid));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_IsSortTab,tab.isSortTab()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_Included_Tab_ID,tabincluded));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_ReadOnlyLogic,tab.getReadOnlyLogic()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_DisplayLogic,tab.getDisplayLogic()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_IsInsertRecord,tab.isInsertRecord()));
			Util.append(start, String.format("%s=%s,",X_AD_Tab.COLUMNNAME_IsAdvancedTab,tab.isAdvancedTab()));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_Parent_Column_ID,parentcolid));
			Util.append(start, String.format("%s=\"%s\",",X_AD_Tab.COLUMNNAME_Identifier,tab.getIdentifier()));
			Util.append(start, String.format("%s=\"%s\")\n",X_AD_Tab.COLUMNNAME_Synchronized,tab.getSynchronized()));
			start.append("public static final String TABNAME_").append(tname).append(String.format("=\"%s\";",tab.getIdentifier()));
		}
		List<X_AD_Column> columnstrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
		.setParameters(X_AD_Table.Table_ID).list();		
		Vector TableTranslate = new Vector();
		for (X_AD_Column columntrl:columnstrl)
		{
			try {						
				StringBuilder sqltranslate = new StringBuilder();
				sqltranslate.append("SELECT AD_LANGUAGE,")
				.append(columntrl.getColumnName())
				.append(" FROM ")
				.append(X_AD_Table.Table_Name).append("_trl ")
				.append(" WHERE ").append(X_AD_Table.COLUMNNAME_AD_Table_ID).append("=").append(table.getAD_Table_ID());
				PreparedStatement pstmt = DB.prepareStatement (sqltranslate.toString(), null);
				ResultSet rs = pstmt.executeQuery();			
				while (rs.next ())
				{
					String tablelang = rs.getString(1);
					String tablename = columntrl.getColumnName();
					String tabletrl = rs.getString(2);
					Vector vector = new Vector();
					vector.add(tablelang);
					vector.add(tablename);
					vector.add(tabletrl);
					TableTranslate.add(vector);
				}
				pstmt.close();
				rs.close();						
			} catch (Exception e) {	e.printStackTrace(); }									
		}		
		if (TableTranslate.size() > 0)
		{					
			for (Iterator it = TableTranslate.iterator(); it.hasNext();)
			{
				Vector vector = (Vector) it.next();
				String tablelang = (String) vector.firstElement();
				String tablename = (String) vector.get(1);
				String tabletrl = (String) vector.lastElement();
				if (tabletrl == null)
					continue;
				if (tabletrl.contains(";"))
					tabletrl = tabletrl.replaceAll(";", ";;");
				if (tabletrl.contains("\""))
					tabletrl = tabletrl.replace("\"", "\\\"");
				if (tabletrl.contains("\n"))
					tabletrl = tabletrl.replace("\n", "");				
				//Util.append(start, String.format("public static final String TABLE_%s_TRL_%s_%s=\"%s\";", tablelang,table.getTableName(),tablename,tabletrl));
				Util.append(start, String.format("@XendraTrl(%s=\"%s\")",X_AD_Tab.COLUMNNAME_Identifier,table.getIdentifier()));
				Util.append(start, String.format("\npublic static String %s_TABLE_%s_%s=\"%s\";", tablelang, table.getTableName(),tablename,tabletrl));
			}										
		}																	
		Util.append(start, "\n@XendraTable(");
		String pkgid = "";
		String pluginid = "";
		X_AD_Package pkg = new Query(Env.getCtx(),X_AD_Package.Table_Name, "AD_Package_ID = ?", null)
			.setParameters(table.getAD_Package_ID()).first();
		if (pkg != null) {
			pkgid = pkg.getIdentifier();
		}
		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
			.setParameters(table.getAD_Plugin_ID()).first();
		if (plugin != null) {
			pluginid = plugin.getIdentifier();
		}
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Name,table.getName()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Package_ID,pkgid));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Plugin_ID,pluginid));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Description,table.getDescription()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Help,table.getHelp()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_TableName,table.getTableName()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AccessLevel,table.getAccessLevel()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Window_ID,windowID));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Val_Rule_ID,valRuleID));
		Util.append(start, String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsKey,keycnt));
		Util.append(start, String.format("%s=%s,",X_AD_Table.COLUMNNAME_LoadSeq,table.getLoadSeq()));
		Util.append(start, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsSecurityEnabled,table.isSecurityEnabled()));
		Util.append(start, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsDeleteable,table.isDeleteable()));
		Util.append(start, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsHighVolume,table.isHighVolume()));
		Util.append(start, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsChangeLog,table.isChangeLog()));
		Util.append(start, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsView,table.isView()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_PO_Window_ID,POWindowID));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_ID, table.getID()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Identifier,table.getIdentifier()));
		Util.append(start, String.format("%s=\"%s\")\n",X_AD_Table.COLUMNNAME_Synchronized,table.getSynchronized()));

		start.append( "/** TableName=").append(table.getTableName()).append(" */\n"
				+ "public static final String Table_Name=\"").append(table.getTableName()).append("\";\n");
		try
		{
			PreparedStatement pstmt = DB.prepareStatement (Querys.GETINDEXBYTABLE, null);
			pstmt.setString(1, table.getTableName().toLowerCase());
			ResultSet rs = pstmt.executeQuery ();			
			String index_name = null;
			String Column_Names = null;
			String comments = null;
			Boolean IsUnique = false;
			while (rs.next ())
			{
				index_name = "";
				Column_Names = "";
				comments = "";
				IsUnique = false;

				index_name = Util.getvalue(rs, X_AD_Index.COLUMNNAME_Name);
				IsUnique   = rs.getBoolean(X_AD_Index.COLUMNNAME_IsUnique);
				Column_Names  = Util.getvalue (rs, X_AD_Index.COLUMNNAME_Column_Names);
				comments = Util.getvalue (rs, X_AD_Index.COLUMNNAME_Comments);				
				Timestamp currentSynchro = null;
				String Identifier = null;

				MIndex oindex = null;

				Hashtable props = Util.getProperties(comments);
				if (props.size() == 0)
				{
					props.put(X_AD_Function.COLUMNNAME_Identifier, Util.getUUID());
					props.put(X_AD_Function.COLUMNNAME_Synchronized, new Timestamp(System.currentTimeMillis()));
					comments = String.format("@%s=%s\n", X_AD_Function.COLUMNNAME_Identifier,  props.get(X_AD_Function.COLUMNNAME_Identifier));
					comments += String.format("@%s=%s\n",X_AD_Function.COLUMNNAME_Synchronized, props.get(X_AD_Function.COLUMNNAME_Synchronized));
					StringBuilder sql = new StringBuilder("COMMENT ON INDEX xendra.")
					.append(index_name).append(" IS '").append(comments).append("'");
					int no = DB.executeUpdate(sql.toString(), null);
				}		
				Identifier = (String) props.get(MIndex.COLUMNNAME_Identifier);
				currentSynchro = (Timestamp) props.get(MIndex.COLUMNNAME_Synchronized);

				oindex = MIndex.getbyIdentifier(Identifier);
				if (oindex == null)
				{						
					oindex = new MIndex(Env.getCtx(),0, null);												
					oindex.setIdentifier(Identifier);
				}
				oindex.setIsUnique(IsUnique);
				oindex.setSynchronized(currentSynchro);
				oindex.setComments(comments);						
				oindex.setColumn_Names(Column_Names);
				oindex.setName(index_name);	
				oindex.setIsUnique(IsUnique);
				oindex.setTableIdentifier(table.getIdentifier());
				oindex.save();						
				Util.append(start, "\n@XendraIndex(");
				Util.append(start, String.format("%s=\"%s\",",X_AD_Index.COLUMNNAME_Name,oindex.getName()));				
				Util.append(start, String.format("%s=\"%s\",",X_AD_Index.COLUMNNAME_Identifier,oindex.getIdentifier()));
				Util.append(start, String.format("%s=\"%s\",",X_AD_Index.COLUMNNAME_Column_Names,oindex.getColumn_Names()));
				Util.append(start, String.format("%s=\"%s\",",X_AD_Index.COLUMNNAME_IsUnique, oindex.isUnique()));
				Util.append(start, String.format("%s=\"%s\",",X_AD_Index.COLUMNNAME_TableIdentifier, oindex.getIdentifier()));
				Util.append(start, String.format("%s=\"%s\")",X_AD_Index.COLUMNNAME_Synchronized, oindex.getSynchronized()));
				start = start.append("\npublic static final String INDEXNAME_").append(index_name).append(" = \"").append(Identifier).append("\";").append("\n");
			}
			rs.close();
			pstmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		// globalqss
		// + "protected static KeyNamePair Model = new KeyNamePair(").append(AD_Table_ID).append(",\"").append(tableName).append("\");\n"
		start.append( "protected static KeyNamePair Model = new KeyNamePair(Table_ID,\"").append(table.getTableName()).append("\");\n" 
				//	
				+ "protected BigDecimal accessLevel = BigDecimal.valueOf(").append(accessLevel).append(");"
						+ "/** AccessLevel\n@return ").append(accessLevelInfo).append("\n*/\n"
								+ "protected int get_AccessLevel()"
								+ "{"
								+ "return accessLevel.intValue();"
								+ "}"
								//
								+ "/** Load Meta Data\n@param ctx context\n@return PO Info\n*/\n"
								+ "protected POInfo initPO (Properties ctx)"
								+ "{"
								+ "  if (Table_ID == 0)\n"
								+ "    Table_ID = MTable.getTable_ID(\""+table.getTableName()+"\");"
								+ "POInfo poi = POInfo.getPOInfo (ctx, Table_ID);"
								+ "return poi;"
								+ "}"		//	initPO
								//
								+ "/** Info\n@return info\n*/\n"
								+ "public String toString()"
								+ "{"
								+ "StringBuffer sb = new StringBuffer (\"").append(className).append("[\")"
										+ ".append(get_ID()).append(\"]\");"
										+ "return sb.toString();"
										+ "}");

		StringBuffer end = new StringBuffer ("}");
		//
		sb.insert(0, start);
		sb.append(end);

		return className;
	}	//	createHeader

	/**
	 * 	Create Column access methods
	 * 	@param AD_Table_ID table
	 * 	@param mandatory init call for mandatory columns
	 * 	@return set/get method
	 */
	public StringBuffer createColumns (int AD_Table_ID, StringBuffer mandatory)
	{				
		X_AD_Table table = new X_AD_Table(Env.getCtx(), AD_Table_ID, null);
		boolean isView = table.isView();
		boolean isKeyNamePairCreated = false; // true if the method "getKeyNamePair" is already generated
		StringBuffer sb = new StringBuffer();
		StringBuffer where = new StringBuffer();
		where.append(" AD_Table_ID=? AND IsActive='Y'")
		.append(" AND ColumnName <> '%s'")		
		.append(" AND ColumnName <> '%s'")		
		.append(" AND ColumnName <> '%s'")		
		.append(" AND ColumnName NOT LIKE '%s'")		
		.append(" AND ColumnName NOT LIKE '%s'");	
		List<X_AD_Column> columnstrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
		.setParameters(X_AD_Column.Table_ID).list();
		List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, String.format(where.toString(),Constants.COLUMNNAME_AD_Client_ID, Constants.COLUMNNAME_AD_Org_ID,Constants.COLUMNNAME_IsActive,"Created%","Updated%"), null)
		.setParameters(table.getAD_Table_ID()).setOrderBy(X_AD_Column.COLUMNNAME_ColumnName).list();
		HashMap fieldname = new HashMap();
		for (X_AD_Column column:columns)
		{
			Vector ColumnTranslate = new Vector();
			if (column.getSynchronized() == null || column.getSynchronized().compareTo(column.getUpdated()) != 0)
			{
				column.setSynchronized(column.getUpdated());
				column.save();
			}
			if (column.getIdentifier().length() == 0)
			{
				column.setIdentifier(Util.getUUID());
				column.save();
			}			
			String refID = "";			
			X_AD_Element element = new Query(Env.getCtx(), X_AD_Element.Table_Name, "AD_Element_ID = ?", null)
			.setParameters(column.getAD_Element_ID()).first();							
			boolean virtualColumn = column.getColumnSQL() != null && column.getColumnSQL().length() > 0;			
			boolean IsEncrypted = "Y".equals(column.getIsEncrypted());
			if (column.getAD_Reference_Value_ID() > 0)
			{
				X_AD_Reference dt = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?",null)
				.setParameters(column.getAD_Reference_Value_ID()).first();
				if (dt != null)
					refID = dt.getIdentifier();
			}
			String valRuleID = getvalRuleID(column.getAD_Val_Rule_ID());				
			String processID = getProcessID(column.getAD_Process_ID());
			if (!isView)
			{
				sb.append(createColumnMethods (mandatory,
						column.getColumnName(), column.isUpdateable(), column.isMandatory(), 
						column.getAD_Reference_ID(), column.getAD_Reference_Value_ID(), column.getFieldLength(), 
						column.getDefaultValue(), column.getValueMin(), column.getValueMax(), column.getVFormat(),
						column.getCallout(), column.getName(), column.getDescription(), virtualColumn, IsEncrypted));
			//				
			}
			if (column.getSeqNo() == 1 && column.isIdentifier()) {
				if (!isKeyNamePairCreated) {
					sb.append(createKeyNamePair(column.getColumnName(), column.getAD_Reference_ID()));
					isKeyNamePairCreated = true;
				}
				else {
					throw new RuntimeException("More than one primary identifier found "
							+ " (AD_Table_ID=" + AD_Table_ID + ", ColumnName=" + column.getColumnName() + ")");
				}
			}		
			for (X_AD_Column columntrl:columnstrl)
			{
				try {						
					StringBuilder sqltranslate = new StringBuilder();
					sqltranslate.append("SELECT AD_LANGUAGE,")
					.append(columntrl.getColumnName())
					.append(" FROM ")
					.append(X_AD_Column.Table_Name).append("_trl ")
					.append(" WHERE ").append(X_AD_Field.COLUMNNAME_AD_Column_ID).append("=").append(column.getAD_Column_ID());
					PreparedStatement pstmt = DB.prepareStatement (sqltranslate.toString(), null);
					ResultSet rs = pstmt.executeQuery();			
					while (rs.next ())
					{
						String fieldlang = rs.getString(1);
						String fieldnm = columntrl.getColumnName();
						String fieldtrl = rs.getString(2);
						Vector vector = new Vector();
						vector.add(fieldlang);
						vector.add(fieldnm);
						vector.add(fieldtrl);
						ColumnTranslate.add(vector);
					}
					pstmt.close();
					rs.close();						
				} catch (Exception e) {	e.printStackTrace(); }									
			}						
			// Create COLUMNNAME_ property (teo_sarca, [ 1662447 ])
			List<X_AD_Column> fieldstrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
			.setParameters(X_AD_Field.Table_ID).list();			
			List<X_AD_Field> fields = new Query(Env.getCtx(), X_AD_Field.Table_Name, "AD_Column_ID = ?", null)
			.setParameters(column.getAD_Column_ID()).list();			
			for (X_AD_Field field:fields)
			{				
				Vector FieldTranslate = new Vector();
				if (field.getSynchronized() == null)
				{
					field.setSynchronized(new Timestamp(System.currentTimeMillis()));
					field.save();					
				}
				for (X_AD_Column fieltrl:fieldstrl)
				{
					try {						
						StringBuilder sqltranslate = new StringBuilder();
						sqltranslate.append("SELECT AD_LANGUAGE,")
						.append(fieltrl.getColumnName())
						.append(" FROM ")
						.append(X_AD_Field.Table_Name).append("_trl ")
						.append(" WHERE ").append(X_AD_Field.COLUMNNAME_AD_Field_ID).append("=").append(field.getAD_Field_ID());
						PreparedStatement pstmt = DB.prepareStatement (sqltranslate.toString(), null);
						ResultSet rs = pstmt.executeQuery();			
						while (rs.next ())
						{
							String fieldlang = rs.getString(1);
							String fname = fieltrl.getColumnName();
							String fieldtrl = rs.getString(2);
							Vector vector = new Vector();
							vector.add(fieldlang);
							vector.add(fname);
							vector.add(fieldtrl);
							FieldTranslate.add(vector);
						}
						pstmt.close();
						rs.close();						
					} catch (Exception e) {	e.printStackTrace(); }									
				}										
				String tabid = "";
				String fieldgroupname = "";
				String tabincludeid = "";
				String tabname = "";
				//String windowname = "";
				X_AD_Tab tab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "AD_Tab_ID = ? ", null)
				.setParameters(field.getAD_Tab_ID()).first();					
				if (tab != null)
				{
					tabid = tab.getIdentifier();
					tabname = Util.getStringclean(tab.getName());

				}
				if (field.getAD_FieldGroup_ID() > 0)
				{
					X_AD_FieldGroup fieldgroup = new Query(Env.getCtx(), X_AD_FieldGroup.Table_Name, "AD_FieldGroup_ID = ?", null)
					.setParameters(field.getAD_FieldGroup_ID()).first();
					if (fieldgroup != null)
					{
						fieldgroupname = fieldgroup.getName();
					}
				}

				if (field.getIncluded_Tab_ID() > 0)
				{
					X_AD_Tab tabinclude = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "AD_Tab_ID = ?", null)
					.setParameters(field.getIncluded_Tab_ID()).first();
					if (tabinclude != null)
						tabincludeid = tabinclude.getIdentifier();
				}
				String fname = String.format("%s_%s", tabname,Util.getStringclean(field.getName()));
				String addenda = "";
				if (Character.isDigit(fname.charAt(fname.length()-1)))
				{
					addenda = fname.substring(fname.length()-1);
					fname = fname.substring(0,fname.length()-1);					
				}				
				if (!fieldname.containsKey(fname))
					fieldname.put(fname, 1);
				else
				{
					Integer sequence = (Integer) fieldname.get(fname);
					sequence ++;
					fieldname.put(fname, sequence);
					fname += addenda;
					fname += String.valueOf(sequence);					
				}				
				if (FieldTranslate.size() > 0)
				{					
					//sb.append("\n");
					for (Iterator it = FieldTranslate.iterator(); it.hasNext();)
					{
						Vector vector = (Vector) it.next();
						String fieldlang = (String) vector.firstElement();
						String fieldnam = (String) vector.get(1);
						String fieldtrl = (String) vector.lastElement();
						if (fieldtrl == null)
							continue;
						if (fieldtrl.contains(";"))
							fieldtrl = fieldtrl.replaceAll(";", ";;");
						if (fieldtrl.contains("\""))
							fieldtrl = fieldtrl.replace("\"", "\\\"");
						if (fieldtrl.contains("\n"))
							fieldtrl = fieldtrl.replace("\n", "");
						//Util.append(sb, String.format("public static String FIELD_%s_TRL_%s_%s=\"%s\";", fieldlang,fname,fieldnam,fieldtrl));
						Util.append(sb, String.format("@XendraTrl(%s=\"%s\")",X_AD_Tab.COLUMNNAME_Identifier,field.getIdentifier()));
						Util.append(sb, String.format("\npublic static String %s_FIELD_%s_%s=\"%s\";", fieldlang, fname,fieldnam,fieldtrl));
					}										
				}															
				//Util.append(sb,String.format("@XendraField(%s=\"%s\",",X_AD_Column.COLUMNNAME_AD_Column_ID,column.getIdentifier()));
				Util.append(sb,String.format("@XendraField(%s=\"%s\",",X_AD_Column.COLUMNNAME_AD_Column_ID,column.getColumnName()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_IsCentrallyMaintained,field.isCentrallyMaintained()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Field.COLUMNNAME_AD_Tab_ID,tabid));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Field.COLUMNNAME_AD_FieldGroup_ID,fieldgroupname));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_IsDisplayed,field.isDisplayed()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Field.COLUMNNAME_DisplayLogic,field.getDisplayLogic()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_DisplayLength,field.getDisplayLength()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_IsReadOnly,field.isReadOnly()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_SeqNo,field.getSeqNo()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_SortNo,field.getSortNo()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_IsSameLine,field.isSameLine()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_IsHeading,field.isHeading()));
				Util.append(sb,String.format("%s=%s,",X_AD_Field.COLUMNNAME_IsFieldOnly,field.isFieldOnly()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Field.COLUMNNAME_Included_Tab_ID,tabincludeid));
				Calendar cal = Calendar.getInstance();
				cal.setTime(field.getSynchronized());
				cal.set(Calendar.MILLISECOND, 0);
				long time = cal.getTimeInMillis();
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_Synchronized, new Timestamp(time)));
				Util.append(sb,String.format("%s=\"%s\")\n",X_AD_Field.COLUMNNAME_Identifier,field.getIdentifier()));				
				sb.append("public static final String FIELDNAME_").append(String.format("%s=\"%s\";", fname, field.getIdentifier()));					 
			}
			if (!column.isKey())
			{
				if (ColumnTranslate.size() > 0)
				{					
					for (Iterator it = ColumnTranslate.iterator(); it.hasNext();)
					{
						Vector vector = (Vector) it.next();
						String collang = (String) vector.firstElement();
						String colname = (String) vector.get(1);
						String coltrl = (String) vector.lastElement();
						if (coltrl == null)
							continue;
						if (coltrl.contains(";"))
							coltrl = coltrl.replaceAll(";", ";;");
						if (coltrl.contains("\""))
							coltrl = coltrl.replace("\"", "\\\"");
						if (coltrl.contains("\n"))
							coltrl = coltrl.replace("\n", "");
						//Util.append(sb, String.format("public static String COLUMN_%s_TRL_%s_%s=\"%s\";", collang,column.getColumnName(),colname,coltrl));
						Util.append(sb, String.format("@XendraTrl(%s=\"%s\")",X_AD_Tab.COLUMNNAME_Identifier,column.getIdentifier()));
						Util.append(sb, String.format("\npublic static String %s_COLUMN_%s_%s=\"%s\";", collang, column.getColumnName(),colname,coltrl));

					}										
				}																			
				Util.append(sb,String.format("@XendraColumn(%s=\"%s\",",X_AD_Column.COLUMNNAME_AD_Element_ID,element.getIdentifier()));	
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_ColumnName,element.getColumnName()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_AD_Reference_ID,column.getAD_Reference_ID()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_AD_Reference_Value_ID,refID));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_AD_Val_Rule_ID,valRuleID));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_FieldLength,column.getFieldLength()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_DefaultValue,column.getDefaultValue()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsKey,column.isKey()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsInternal,column.isInternal()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsParent,column.isParent()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsMandatory,column.isMandatory()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsUpdateable,column.isUpdateable()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_ReadOnlyLogic,column.getReadOnlyLogic()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsIdentifier,column.isIdentifier()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_SeqNo,column.getSeqNo()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsTranslated,column.isTranslated()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_Callout,column.getCallout()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_VFormat,column.getVFormat()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_ValueMin,column.getValueMin()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_ValueMax,column.getValueMax()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_Version, column.getVersion()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsSelectionColumn, column.isSelectionColumn()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_AD_Process_ID, processID));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsAlwaysUpdateable, column.isAlwaysUpdateable()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_ColumnSQL, column.getColumnSQL()));
				Util.append(sb,String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsAllowLogging,column.isAllowLogging()));
				Util.append(sb,String.format("%s=\"%s\",",X_AD_Column.COLUMNNAME_Identifier, column.getIdentifier()));				
				Calendar cal = Calendar.getInstance();
				cal.setTime(column.getSynchronized());
				cal.set(Calendar.MILLISECOND, 0);
				long time = cal.getTimeInMillis();
				Util.append(sb,String.format("%s=\"%s\")\n",X_AD_Column.COLUMNNAME_Synchronized, new Timestamp(time)));
			}
			else
			{
				keycnt ++;
			}
			sb.append("/** Column name ").append(column.getColumnName()).append(" */\n")
			.append("public static final String COLUMNNAME_").append(column.getColumnName())
			.append(" = \"").append(column.getColumnName()).append("\";");			
		}
		return sb;
	}	//	createColumns

	private String getProcessID(int AD_Process_ID) {
		String procid = "";
		if (AD_Process_ID > 0)
		{
			MProcess proc = new MProcess(Env.getCtx(), AD_Process_ID, null);
			if (proc != null)
			{
				if (proc.getIdentifier() == null)
				{
					proc.setIdentifier(Util.getUUID());
					proc.save();
				}			
				procid = proc.getIdentifier();
			}
		}
		return procid;
	}

	private String getWindowID(int AD_Window_ID) {
		String windowid = "";
		if (AD_Window_ID > 0)
		{			
			X_AD_Window window = new Query(Env.getCtx(), X_AD_Window.Table_Name, "AD_Window_ID = ?", null).setParameters(AD_Window_ID).first();
			if (window != null)
				windowid = window.getIdentifier();
		}
		return windowid;
	}
	private String getvalRuleID(int AD_Val_Rule_ID) {		
		String valruleid = "";
		if (AD_Val_Rule_ID > 0)
		{
			X_AD_Val_Rule rule = new X_AD_Val_Rule(Env.getCtx(),AD_Val_Rule_ID, null);
			Class<?> clazz = (Class<?>) valrule.get(rule.getIdentifier());
			if (clazz != null)
			{
				Field[] fields = clazz.getFields();			
				for (Field field:fields)
				{
					if (field.isAnnotationPresent(XendraValRule.class)) {
						try {
							valruleid = (String) field.get(clazz); 
						} catch (Exception e) {
							e.printStackTrace();
						}					
					}	
				}
			}
			else
				log.warning(String.format("%s NOT FOUND in Val Rule",rule.getName()));
		}
		return valruleid;
	}


	/**
	 *	Create set/get methods for column
	 * 	@param mandatory init call for mandatory columns
	 * 	@param columnName column name
	 * 	@param isUpdateable updateable
	 * 	@param isMandatory mandatory
	 * 	@param displayType display type
	 * 	@param AD_Reference_ID validation reference
	 * 	@param fieldLength int
	 *	@param defaultValue default value
	 * 	@param ValueMin String
	 *	@param ValueMax String
	 *	@param VFormat String
	 *	@param Callout String
	 *	@param Name String
	 *	@param Description String
	 * 	@param virtualColumn virtual column
	 * 	@param IsEncrypted stored encrypted
	@return set/get method
	 */
	private String createColumnMethods (StringBuffer mandatory,
			String columnName, boolean isUpdateable, boolean isMandatory,
			int displayType, int AD_Reference_ID, int fieldLength, 
			String defaultValue, String ValueMin, String ValueMax, String VFormat,
			String Callout, String Name, String Description, 
			boolean virtualColumn, boolean IsEncrypted)
	{		
		boolean isSimpleText = false;
		//	Clazz
		Class clazz = DisplayType.getClass(displayType, true);
		if (defaultValue == null)
			defaultValue = "";
		if (DisplayType.isLOB(displayType))		//	No length check for LOBs
			fieldLength = 0;
		if (DisplayType.XML == displayType)
			fieldLength = 0;
		if (DisplayType.Text == displayType)
			fieldLength = 0;
		else if  (DisplayType.TextLong == displayType)
			fieldLength = 0;
		if (DisplayType.HStore == displayType)
		{
			clazz = HashMap.class;
			fieldLength = 0;
		}
		if (columnName.equalsIgnoreCase(X_AD_Table.COLUMNNAME_Help) || 
				columnName.equalsIgnoreCase(X_AD_Tab.COLUMNNAME_CommitWarning))
		{
			isSimpleText = true;
		}
		else if (columnName.equalsIgnoreCase(X_AD_Table.COLUMNNAME_Description))
		{
			isSimpleText = true;
		}		
		//	Handle Posted
		else if (columnName.equalsIgnoreCase("Posted") 
				|| columnName.equalsIgnoreCase("Processed")
				|| columnName.equalsIgnoreCase("Processing"))
		{
			clazz = Boolean.class;
			AD_Reference_ID = 0;
		}
		//	Record_ID
		else if (columnName.equalsIgnoreCase("Record_ID"))
		{
			clazz = Integer.class;
			AD_Reference_ID = 0;
		}
		//	String Key
		else if (columnName.equalsIgnoreCase("AD_Language")
				|| columnName.equalsIgnoreCase("EntityType"))
		{
			clazz = String.class;
		}	
		//	Data Type
		String dataType = clazz.getName();
		dataType = dataType.substring(dataType.lastIndexOf('.')+1);
		if (dataType.equals("Boolean"))
			dataType = "boolean";
		else if (dataType.equals("Integer"))
			dataType = "int";
		else if (displayType == DisplayType.Binary)
			dataType = "byte[]";


		StringBuffer sb = new StringBuffer();
		//	****** Set Comment ******
		sb.append("/** Set ").append(Name);
		sb.append(".\n@param ").append(columnName).append(" ");
		if (Description != null && Description.length() > 0)
			sb.append(Description);
		else
			sb.append(Name);
		sb.append(" */\n");

		//	Set	********
		String setValue = "set_Value";
		if (IsEncrypted)
			setValue = "set_ValueE";
		//	public void setColumn (xxx variable)
		sb.append("public ");
		if (!isUpdateable)
		{
			setValue = "set_ValueNoCheck";
			if (IsEncrypted)
				setValue = "set_ValueNoCheckE";
		}
		//	List Validation
		sb.append("void set").append(columnName).append(" (").append(dataType).append(" ").append(columnName).append(")"
				+ "{");					
		if (AD_Reference_ID != 0)
		{
			// is not necesary , because in case the list is modified in the AD is not possible use the new value
			//String staticVar = addListValidation (sb, AD_Reference_ID, columnName, !isMandatory);
			//sb.insert(0, staticVar);	//	first check
		}
		//	setValue ("ColumnName", xx);
		if (virtualColumn)
		{
			sb.append ("throw new IllegalArgumentException (\"").append(columnName).append(" is virtual column\");");
		}
		//	Integer
		else if (clazz.equals(Integer.class))
		{
			if (columnName.endsWith("_ID"))
			{
				if (isMandatory)	//	check mandatory ID
				{
					int firstOK = 1;	//	Valid ID 0
					if (columnName.equals("AD_Client_ID") || columnName.equals("AD_Org_ID") 
							|| columnName.equals("Record_ID") || columnName.equals("C_DocType_ID")
							|| columnName.equals("Node_ID") || columnName.equals("AD_Role_ID")
							|| columnName.equals("M_AttributeSet_ID") || columnName.equals("M_AttributeSetInstance_ID"))
						firstOK = 0;
					sb.append("if (").append (columnName)
					.append (" < ").append(firstOK).append(") throw new IllegalArgumentException (\"")
					.append(columnName).append(" is mandatory.\");");
				}
				else				//	set optional _ID to null if 0
					sb.append("if (").append (columnName).append (" <= 0) ")
					.append(setValue).append(" (COLUMNNAME_").append(columnName).append(", null); else \n");
			}
			sb.append(setValue).append(" (COLUMNNAME_").append(columnName).append(", Integer.valueOf(").append(columnName).append("));");
		}
		//	Boolean
		else if (clazz.equals(Boolean.class))
			sb.append(setValue).append(" (COLUMNNAME_").append(columnName).append(", Boolean.valueOf(").append(columnName).append("));");
		else
		{
			if (isMandatory && AD_Reference_ID == 0)	//	does not apply to int/boolean
			{
				sb.append("if (")
				.append (columnName).append (" == null)"
						+ " throw new IllegalArgumentException (\"")
						.append(columnName).append(" is mandatory.\");");
			}
			// String length check
			if (clazz.equals(String.class) && fieldLength > 0)
			{
				sb.append ("if (");
				if (!isMandatory)
					sb.append(columnName).append(" != null && ");
				sb.append(columnName).append(".length() > ").append(fieldLength)
				.append("){log.warning(\"Length > ")
				.append(fieldLength).append(" - truncated\");")
				.append(columnName).append(" = ")
				.append(columnName).append(".substring(0,").append(fieldLength-1).append(");}");
			}

			//
			sb.append (setValue).append(" (COLUMNNAME_").append (columnName).append (", ")
			.append (columnName).append (");");
		}
		sb.append("}");

		//	Mandatory call in constructor
		if (isMandatory)
		{
			mandatory.append("set").append(columnName).append(" (");
			if (clazz.equals(Integer.class))
				mandatory.append("0");
			else if (clazz.equals(Boolean.class))
			{
				if (defaultValue.indexOf('Y') != -1)
					mandatory.append(true);
				else
					mandatory.append("false");
			}
			else if (clazz.equals(BigDecimal.class))
				mandatory.append("Env.ZERO");
			else if (clazz.equals(Timestamp.class))
				mandatory.append("new Timestamp(System.currentTimeMillis())");
			else
				mandatory.append("null");
			mandatory.append(");");
			if (defaultValue.length() > 0)
				mandatory.append("// ").append(defaultValue).append(Env.NL);
		}


		//	****** Get Comment ****** 
		sb.append("/** Get ").append(Name);
		if (Description != null && Description.length() > 0)
			sb.append(".\n@return ").append(Description);
		else
			sb.append(".\n@return ").append(Name);
		sb.append(" */\n");

		//	Get	********
		String getValue = "get_Value";
		if (IsEncrypted)
			getValue = "get_ValueE";
		sb.append("public ").append(dataType);
		if (clazz.equals(Boolean.class))
		{
			sb.append(" is");
			if (columnName.toLowerCase().startsWith("is"))
				sb.append(columnName.substring(2));
			else
				sb.append(columnName);
		}
		else
			sb.append(" get").append(columnName);
		sb.append("() {");
		if (clazz.equals(Integer.class))
			sb.append("Integer ii = (Integer)")
			.append(getValue).append("(COLUMNNAME_").append(columnName).append(");"
					+ "if (ii == null)"
					+ " return 0;"
					+ "return ii.intValue();");
		else if (clazz.equals(HashMap.class))
		{
			sb.append("HashMap propsrc = (HashMap)").append(getValue).append("(COLUMNNAME_").append(columnName).append(");"
					+ "if (propsrc == null)"
					+ " return new HashMap();"
					+ " HashMap propdst = (HashMap) propsrc.clone();"
					+ "return propdst;");
		}
		else if (clazz.equals(BigDecimal.class))
			sb.append("BigDecimal bd = (BigDecimal)").append(getValue)
			.append("(COLUMNNAME_").append(columnName).append(");"
					+ "if (bd == null)"
					+ " return Env.ZERO;"
					+ "return bd;");
		else if (clazz.equals(Boolean.class))
			sb.append("Object oo = ").append(getValue)
			.append("(COLUMNNAME_").append(columnName).append(");"
					+ "if (oo != null) { if (oo instanceof Boolean) return ((Boolean)oo).booleanValue(); return \"Y\".equals(oo);}"
					+ "return false;");
		else if (dataType.equals("Object"))
			sb.append("return ").append(getValue)
			.append("(COLUMNNAME_").append(columnName).append(");");
		else
		{
			if (isSimpleText)
			{				
				//String x = new String();
				//x.replaceAll(regex, replacement)
				sb.append("String value = (").append(dataType).append(")").append(getValue)
				.append("(COLUMNNAME_").append(columnName).append(");")
				.append("if (value == null)\n")
				.append("  return \"\";")
				.append("if (value.contains(\"\\\"\"))\n")
				.append("  value = value.replaceAll(\"\\\"\",\"'\");")
				.append("if (value.contains(\"\\n\"))\n")
				.append("  value = value.replaceAll(\"\\n\",\" \");")
				.append("if (value.contains(\";;\"))\n")
				.append("  value = value.replaceAll(\";;\",\":\");")								
				.append("return value;");

				//sb.append("return (").append(dataType).append(")").append(getValue)
				//.append("(COLUMNNAME_").append(columnName).append(");");
			}
			else
			{				
				if (DisplayType.isText(displayType))
				{
					sb.append(dataType).append(" value = (").append(dataType).append(")").append(getValue)
					.append("(COLUMNNAME_").append(columnName).append(");")					
					.append("if (value == null)\n")
					.append("  return \"\";")
					.append("return value;");		
				}
				else
				{
					sb.append("return (").append(dataType).append(")").append(getValue)
					.append("(COLUMNNAME_").append(columnName).append(");");
				}
			}
		}
		sb.append("}");
		//
		return sb.toString();
	}	//	createColumnMethods

	/**
	 * 	Add List Validation
	 * 	@param sb buffer - example:
		if (NextAction.equals("N") || NextAction.equals("F"));
		else throw new IllegalArgumentException ("NextAction Invalid value - Reference_ID=219 - N - F");
	 * 	@param AD_Reference_ID reference
	 * 	@param columnName column
	 * 	@param nullable the validation must allow null values
	 * 	@return static parameter - Example:
		public static final int NEXTACTION_AD_Reference_ID=219;
		public static final String NEXTACTION_None = "N";
		public static final String NEXTACTION_FollowUp = "F";
	 */
	private String addListValidation (StringBuffer sb, int AD_Reference_ID, 
			String columnName, boolean nullable)
	{
		X_AD_Reference ref = new X_AD_Reference(Env.getCtx(), AD_Reference_ID, null);
		StringBuffer retValue = new StringBuffer();
		retValue.append("\n/** ").append(columnName).append(" AD_Reference=").append(ref.getIdentifier()) .append(" */\n")
		.append("public static final int ").append(columnName.toUpperCase())
		.append("_AD_Reference_ID=").append(AD_Reference_ID).append(";");		
		//		
		boolean found = false;
		StringBuffer values = new StringBuffer("Reference_ID=")
		.append(AD_Reference_ID);
		StringBuffer statement = new StringBuffer();
		if (nullable)
			statement.append("if (").append(columnName).append(" == null");
		//
		if (ref.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
		{
			Class<?> clazz = (Class<?>) references.get(ref.getIdentifier());
			if (clazz != null)
			{				
				if (!referenceheaders.contains(clazz.getName()))
					referenceheaders.add(clazz.getName());

				Field[] fields = clazz.getFields();			
				for (Field field:fields)
				{
					if (field.isAnnotationPresent(XendraRefItem.class)) {
						XendraRefItem item = field.getAnnotation(XendraRefItem.class);
						String value = "";
						try {
							value = (String) field.get(clazz);
						} catch (Exception e) {
							e.printStackTrace();
						}
						values.append(" - ").append(item.Value());
						if (statement.length() == 0)
							statement.append("if (").append(columnName)
							.append(".equals(").append(clazz.getSimpleName()).append(".").append(field.getName()).append(")");
						else
							statement.append(" || ").append(columnName)
							.append(".equals(").append(clazz.getSimpleName()).append(".").append(field.getName()).append(")");
						if (!found)
						{
							found = true;
							if (!nullable)
								sb.append("if (")
								.append (columnName).append (" == null)"
										+ " throw new IllegalArgumentException (\"")
										.append(columnName).append(" is mandatory\");");
						}				
					}
				}				
			}
		}
		statement.append(")"
				+ "; "
				+ "else "
				+ "throw new IllegalArgumentException (\"").append(columnName)
				.append(" Invalid value - \" + ").append(columnName)
				.append(" + \" - ").append(values).append("\");");
		//
		if (found && !columnName.equals("EntityType"))
			sb.append (statement);
		return retValue.toString();
	}	//	addListValidation

	/**
	 * 	Create getKeyNamePair() method with first identifier
	 *	@param columnName name
	 *	 * @param displayType int
	@return method code
	 */
	private StringBuffer createKeyNamePair (String columnName, int displayType)
	{
		String method = "get" + columnName + "()";
		if (displayType != DisplayType.String)
			method = "String.valueOf(" + method + ")";
		StringBuffer sb = new StringBuffer("/** Get Record ID/ColumnName\n@return ID/ColumnName pair\n*/"
				+ "public KeyNamePair getKeyNamePair() "
				+ "{return new KeyNamePair(get_ID(), ").append(method).append(");}");
		return sb;
	}	//	createKeyNamePair


	/**************************************************************************
	 * 	Write to file
	 * 	@param sb string buffer
	 * 	@param fileName file name
	 */
	private void writeToFile (StringBuffer sb, String fileName)
	{
		try
		{
			File out = new File (fileName);
			// FileWriter fw = new FileWriter (out);
			// http://sourceforge.net/tracker/index.php?func=detail&aid=1629947&group_id=176962&atid=879332
			boolean ignore = false;
			Writer fw = new OutputStreamWriter(new FileOutputStream(out, false), "UTF-8");
			for (int i = 0; i < sb.length(); i++)
			{
				char c = sb.charAt(i);
				//	after
				if (c == ';' || c == '}')
				{
					if (sb.substring(i+1).startsWith(";"))
					{
						ignore = true;
						continue;
					}
					//					else if (c == ';' && sb.substring(i+1).startsWith("@"))
					//					{
					//						ignore = true;
					//						//continue;
					//					}					
					fw.write (c);
					if (sb.substring(i+1).startsWith("//"))
					{
						fw.write('\t');							
					}
					if (!ignore)
						fw.write(Env.NL);					
					else
						ignore = false;
					//else
					//	ignore = false;
					//if (!ignore)
					//	fw.write(Env.NL);
					//else
					//	ignore = false;
				}
				//	before & after
				else if (c == '{')
				{
					fw.write(Env.NL);
					fw.write (c);
					fw.write(Env.NL);
				}
				else
					fw.write (c);
			}
			fw.flush ();
			fw.close ();
			float size = out.length();
			size /= 1024;
			log.warning(out.getAbsolutePath() + " - " + size + " kB");
		}
		catch (Exception ex)
		{
			log.log(Level.SEVERE, fileName, ex);
		}
	}	//	writeToFile

	/**
	 * 	String representation
	 * 	@return string representation
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer ("GenerateModel[")
		.append("]");
		return sb.toString();
	}	//	toString



	/**************************************************************************
	 * 	Generate PO Model Class.
	 * 	<pre>
	 * 	Example: java GenerateModel.class mydirectory myPackage 'U','A'
	 * 	would generate entity type User and Application classes into mydirectory.
	 * 	Without parameters, the default is used:
	 * 	C:\Adempiere\adempiere-all\extend\src\adempiere\model\ adempiere.model 'U','A'
	 * 	</pre>
	 * 	@param args directory package entityType 
	 * 	- directory where to save the generated file
	 * 	- package of the classes to be generated
	 * 	- entityType to be generated
	 */
	public static void main (String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.WARNING);		
		log.warning("Generate Model   $Revision: 1.1 $");
		log.warning("----------------------------------");
		//	first parameter
		String directory = System.getProperty("user.home").concat("/model/");
		//String directory = "/root/xendra_dev/extend/src/compiere/model/";

		if (args.length > 0)
			directory = args[0];
		if (directory == null || directory.length() == 0)
		{
			System.err.println("No Directory");
			System.exit(1);
		}
		log.warning("Directory: " + directory);

		//	second parameter
		String packageName = "org.compiere.model.persistence";
		if (args.length > 1)
			packageName = args[1]; 
		if (packageName == null || packageName.length() == 0)
		{
			System.err.println("No package");
			System.exit(1);
		}
		log.warning("Package:   " + packageName);

		//	third parameter
		String entityType = "'U','A','D'";	//	User, Application
		if (args.length > 2)
			entityType = args[2]; 
		if (entityType == null || entityType.length() == 0)
		{
			System.err.println("No EntityType");
			System.exit(1);
		}
		StringBuffer sql = new StringBuffer("EntityType IN (")
		.append(entityType).append(")");
		log.warning(sql.toString());
		log.warning("----------------------------------");

		// globalqss - add filter LIKE table
		String tableLike = "'%'";	//	All tables
		//String tableLike = "'PA_ReportSource'";
		//String tableLike = "'AD_Rule'";
		//String tableLike = "'C_POP'";
		//String tableLike = "'C_InvoiceLine'";
		//String tableLike = "'HR_PayrollConcept'";
		//String tableLike = "'HR_Movement'";
		//String tableLike = "'M_CostCalc'";
		//String tableLike = "'AD_Tab'";
		//String tableLike = "'M_StockTakingLine'";
		//String tableLike = "'C_Location'";
		//String tableLike = "'C_Region'";
		//String tableLike = "'A_Xendrian_Replication'";
		//String tableLike = "'M_MaterialPolicy'";
		//String tableLike = "'M_Movement'";
		//String tableLike = "'C_DocType'";
		//String tableLike = "'M_CostCalc'";
		//String tableLike = "'C_ContactCategory'";		
		//String tableLike = "'C_ContactAddress'";
		//String tableLike = "'C_ContactEmail'";
		//String tableLike = "'M_Transaction'";
		//String tableLike = "'AD_Column'";
		//String tableLike = "'AD_System'";
		//String tableLike = "'AD_ChangeLog'";
		//String tableLike = "'Test'";
		//String tableLike = "'A_MachineServer'";
		//String tableLike = "'C_PrinterDocumentFormat'";
		//String tableLike = "'C_AcctSchema_Default'";
		if (args.length > 3)
			tableLike = args[3];
		log.warning("Table Like: " + tableLike);

		//	complete sql11
		sql.insert(0, " SELECT AD_Table_ID "
				+ " FROM AD_Table "
				+ " WHERE "
				//+ " (TableName IN ('RV_WarehousePrice','RV_BPartner')"	//	special views
				//+ " OR IsView='N')"
				+ " TableName NOT LIKE '%_Trl' AND ");
		// globalqss
		sql.append(" AND TableName LIKE ").append(tableLike);
		// 
		sql.append(" ORDER BY TableName");

		//
//		HashMap valrule = new HashMap();
//		HashMap references = new HashMap();		
//		if (valrule.size() == 0)
//		{
//			try {
//				final Set<Class<? extends ValRule>> serializables = new HashSet<Class<? extends ValRule>>();
//				ComponentScanner scanner = new ComponentScanner();
//
//				Set<Class<?>> classes = scanner.getClasses(	new ComponentQuery() 
//				{
//					protected void query() {
//						select().from("org.compiere.model.valrule").andStore(
//								thoseImplementing(ValRule.class).into(serializables));
//					}
//				}		
//						);
//				Iterator it = serializables.iterator();
//				int x = 0;
//				while (it.hasNext())
//				{	
//					Class<?> clazz = (Class<?>) it.next();
//					Field[] fields = clazz.getFields();
//					//Vector properties = new Vector();
//					String Identifier = "";
//					for (Field field:fields)
//					{
//						if (field.getName().equals(X_AD_Reference.COLUMNNAME_Identifier))
//						{
//							Identifier = (String) field.get(clazz);
//							break;
//						}
//					}					
//					if (!valrule.containsKey(Identifier))						
//						valrule.put(Identifier, clazz);					
//				}	
//			}
//			catch (Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//		if (references.size() == 0)
//		{
//			try {
//				final Set<Class<? extends Reference>> serializables = new HashSet<Class<? extends Reference>>();
//				ComponentScanner scanner = new ComponentScanner();
//
//				Set<Class<?>> classes = scanner.getClasses(	new ComponentQuery() 
//				{
//					protected void query() {
//						select().from("org.compiere.model.reference").andStore(
//								thoseImplementing(Reference.class).into(serializables));
//					}
//				}		
//						);
//				Iterator it = serializables.iterator();
//				int x = 0;
//				while (it.hasNext())
//				{	
//					Class<?> clazz = (Class<?>) it.next();
//					Field[] fields = clazz.getFields();
//					//Vector properties = new Vector();
//					String Identifier = "";
//					for (Field field:fields)
//					{
//						if (field.getName().equals(X_AD_Reference.COLUMNNAME_Identifier))
//						{
//							Identifier = (String) field.get(clazz);
//							break;
//						}
//					}
//					if (!references.containsKey(Identifier))						
//						references.put(Identifier, clazz);					
//				}	
//			}
//			catch (Exception e)
//			{
//				e.printStackTrace();
//			}
//		}		
		//
		configvalrules();
		configReferences();
		int count = 0;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				new GenerateModelView(rs.getInt(1), directory, packageName);
				count++;
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//log.severe("main - " + e);
		}
		finally
		{
			try
			{
				if (pstmt != null)
					pstmt.close ();
			}
			catch (Exception e)
			{}
			pstmt = null;
		}
		log.warning("Generated = " + count);
	}	//	main
	public static void configvalrules()
	{
		//HashMap valrule = new HashMap();
		if (valrule.size() == 0)
		{
			try {
				final Set<Class<? extends ValRule>> serializables = new HashSet<Class<? extends ValRule>>();
				ComponentScanner scanner = new ComponentScanner();

				Set<Class<?>> classes = scanner.getClasses(	new ComponentQuery() 
				{
					protected void query() {
						select().from("org.compiere.model.valrule").andStore(
								thoseImplementing(ValRule.class).into(serializables));
					}
				}		
						);
				Iterator it = serializables.iterator();
				int x = 0;
				while (it.hasNext())
				{	
					Class<?> clazz = (Class<?>) it.next();
					Field[] fields = clazz.getFields();
					//Vector properties = new Vector();
					String Identifier = "";
					for (Field field:fields)
					{
						if (field.getName().equals(X_AD_Reference.COLUMNNAME_Identifier))
						{
							Identifier = (String) field.get(clazz);
							break;
						}
					}					
					if (!valrule.containsKey(Identifier))						
						valrule.put(Identifier, clazz);					
				}	
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}		
	}
	public static void configReferences()
	{
		if (references.size() == 0)
		{
			try {
				final Set<Class<? extends Reference>> serializables = new HashSet<Class<? extends Reference>>();
				ComponentScanner scanner = new ComponentScanner();

				Set<Class<?>> classes = scanner.getClasses(	new ComponentQuery() 
				{
					protected void query() {
						select().from("org.compiere.model.reference").andStore(
								thoseImplementing(Reference.class).into(serializables));
					}
				}		
						);
				Iterator it = serializables.iterator();
				int x = 0;
				while (it.hasNext())
				{	
					Class<?> clazz = (Class<?>) it.next();
					Field[] fields = clazz.getFields();
					//Vector properties = new Vector();
					String Identifier = "";
					for (Field field:fields)
					{
						if (field.getName().equals(X_AD_Reference.COLUMNNAME_Identifier))
						{
							Identifier = (String) field.get(clazz);
							break;
						}
					}
					if (!references.containsKey(Identifier))						
						references.put(Identifier, clazz);					
				}	
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}		
	}
}	//	GenerateModel
