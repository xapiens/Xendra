package org.xendra.printdocument;

import java.lang.reflect.Constructor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;

import org.apache.log4j.Logger;
import org.compiere.model.MColumn;
import org.compiere.model.MDocType;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MQuery;
import org.compiere.model.MRole;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.print.PrintData;
import org.compiere.print.PrintDataColumn;
import org.compiere.print.TableReference;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Util;

/**
 * This class maintains all of the Print queues and contains all of the logic
 * for performing operations on them.     
 *
 */
public class Formats {
	static Logger log = Logger.getLogger(Formats.class);

	private final static Formats INSTANCE = new Formats();
	private final Hashtable formats = new Hashtable(); 	
	/**
	 * Constructor for LPD.
	 */
	private Formats() {
		super();
		log.debug("formats(): STARTED");
		String where = "";
		List<X_C_PrinterDocumentFormat> printdocumentformats = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, where, null)		
		.list();		
		for (X_C_PrinterDocumentFormat format:printdocumentformats)
		{
			if (!formats.containsKey(format.getC_PrinterDocumentFormat_ID()))
			{
				formats.put(format.getC_PrinterDocumentFormat_ID(), format);
			}
		}
	}
	
	public static List<KeyNamePair> getFormat(int AD_Table_ID, MQuery query)
	{
		List<KeyNamePair> pflist = new ArrayList<KeyNamePair>();
		String m_trxName = null;
		MTable entity = new MTable(Env.getCtx(), AD_Table_ID, null);
		if (entity == null)
			return null;

		MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
			.setParameters(AD_Table_ID, X_C_DocType.COLUMNNAME_C_DocType_ID).first();
		
		if (column == null)
			return null;

		String sql = String.format("SELECT C_DocType_ID from %s WHERE %s", entity.getTableName(), query.getWhereClause());
		int C_DocType_ID = DB.getSQLValue(null,  sql);
		if (C_DocType_ID <= 0)
		{
			column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
			.setParameters(AD_Table_ID, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID).first();
			
			if (column == null)
				return null;
			
			sql = String.format("SELECT C_DocTypeTarget_ID from %s WHERE %s", entity.getTableName(), query.getWhereClause());
			C_DocType_ID = DB.getSQLValue(null,  sql);
			if (C_DocType_ID <= 0)
				return null;
		}
		
		MDocType dt = MDocType.get(Env.getCtx(), C_DocType_ID);
		if (dt.getC_PrinterDocumentFormat_ID() > 0)
		{
			MPrinterDocumentFormat df = new MPrinterDocumentFormat(Env.getCtx(), dt.getC_PrinterDocumentFormat_ID(), null);
			KeyNamePair kp = new KeyNamePair(df.getC_PrinterDocumentFormat_ID(), df.getName());
			pflist.add(kp);
		}		
		return pflist;
	}	
	
	public String getFormat(Integer key)
	{
		String format = "";
		if (formats.containsKey(key))
		{
			 X_C_PrinterDocumentFormat pdf = (X_C_PrinterDocumentFormat) formats.get(key);
			 format = pdf.getFormat();
		}
		return format;
	}
	
	public String getDestination(Integer key)
	{
		String destination = "";
		if (formats.containsKey(key))
		{
			X_C_PrinterDocumentFormat pdf = (X_C_PrinterDocumentFormat) formats.get(key);
			destination = pdf.getDestination();
		}
		return destination;
	}
	
	/**
	 * This class is a singleton.  
	 * @return the only instance of Queues.
	 */
	public static Formats getInstance() {
		return INSTANCE;
	}
	
}