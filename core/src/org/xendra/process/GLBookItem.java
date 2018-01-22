package org.xendra.process;

import java.awt.EventQueue;
import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;


import javax.swing.JFileChooser;

import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.MClient;
import org.compiere.model.MClientInfo;
import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.MYear;
import org.compiere.model.MRefTable;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_GL_Book;
import org.compiere.model.persistence.X_GL_BookFile;
import org.compiere.model.persistence.X_GL_BookLine;
import org.compiere.model.persistence.X_GL_BookItem;
import org.compiere.model.MDocType;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Splash;

public class GLBookItem extends SvrProcess {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin())		//	no automatic login
					{
						//	Center the window
						try
						{
							AEnv.showCenterScreen(login);	//	HTML load errors
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}					
					GLBookItem bi = new GLBookItem();					
					bi.p_GL_Book_ID = 1000098; // "3.3 - I&B Cta 12 y 13"
					bi.p_C_Period_ID = 1000652; // ene 16
					bi.p_C_PeriodTo_ID = 1000653; // feb 16					
					bi.p_AD_Client_ID = 1000037;
					bi.p_AD_Org_ID    = 0;
					bi.p_C_AcctSchema_ID = 1000037;
					//bi.prepare();
					bi.doIt();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	

	private int p_C_Period_ID = 0;	
	private int p_C_PeriodTo_ID = 0;
	private Integer p_GL_Book_ID = 0;
	private Integer p_AD_Client_ID = 0;
	private Integer p_AD_Org_ID = 0;
	private Integer p_C_AcctSchema_ID = 0;
	private String sql = "";
	private String sqlFrom;
	private X_C_Period periodFrom;
	private X_C_Period periodTo;
	private String line = "";
	private List<String> lines = new ArrayList<String>();
	private X_GL_Book book; 
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			if (name.equals("C_Period_ID")) {
				p_C_Period_ID = para[i].getParameterAsInt();
				p_C_PeriodTo_ID = para[i].getParameter_ToAsInt();
			}
			else if (name.equals("AD_Client_ID")) {
				p_AD_Client_ID = para[i].getParameterAsInt();
			}
			else if (name.equals("AD_Org_ID")) {
				p_AD_Org_ID = para[i].getParameterAsInt();
			}
			else if (name.equals("GL_Book_ID")) {
				p_GL_Book_ID = para[i].getParameterAsInt();				
			}
		}		
	}

	protected String doIt () throws Exception
	{		
		String error = null;
		List<X_GL_BookLine> booklines = null;
		List<X_GL_BookItem> bookitems = null;
		List<X_GL_BookFile> bookfile  = null;
		List<Integer> fields = null;
		String sqlDocType = "";
		try {
			periodFrom = new Query(Env.getCtx(), X_C_Period.Table_Name, "C_Period_ID = ?", null).setParameters(p_C_Period_ID).first();
			periodTo = new Query(Env.getCtx(), X_C_Period.Table_Name, "C_Period_ID = ?", null).setParameters(p_C_PeriodTo_ID).first();

			if (periodFrom == null || periodTo == null)
				throw new Exception("el rango de Periodo debe ser especificado");

			int C_Year_ID = periodFrom.getC_Year_ID();
			MYear year = new MYear(Env.getCtx(), C_Year_ID, null);						

			int C_YearTo_ID = periodTo.getC_Year_ID();
			MYear yearTo = new MYear(Env.getCtx(), C_YearTo_ID, null);
			if (year.getFiscalYear().compareTo(yearTo.getFiscalYear()) != 0)
				throw new Exception("el rango de Periodo debe pertenecer al mismo año");

			book = new Query(Env.getCtx(), X_GL_Book.Table_Name, "GL_Book_ID = ?", null).setParameters(p_GL_Book_ID).first();
			if (book == null)
				throw new Exception("Libro inexistente");
			if (book.getProcessingDate().length() == 0)		
				throw new Exception("el nombre del campo de la fecha de la tabla (ProcessingDate) del libro es obligatoria");
			String where = "GL_Book_ID = ? AND IsActive = 'Y' ";

			booklines = new Query(Env.getCtx(), X_GL_BookLine.Table_Name, where, null)
			.setParameters(p_GL_Book_ID).list();

			bookitems = new Query(Env.getCtx(), X_GL_BookItem.Table_Name, where, null)
			.setParameters(p_GL_Book_ID).setOrderBy("seqno").list();

			bookfile = new Query(Env.getCtx(), X_GL_BookFile.Table_Name, where, null)
			.setParameters(p_GL_Book_ID).setOrderBy("seqno").list();

			sqlFrom = "";			
			Hashtable tables = new Hashtable();			
			Hashtable doctypes = new Hashtable();
			fields = new ArrayList<Integer>();		
			for (X_GL_BookLine bookline:booklines)
			{
				if (bookline.getAD_Table_ID() > 0 && tables.get(bookline.getAD_Table_ID()) == null)
				{
					MTable table = MTable.get(Env.getCtx(), bookline.getAD_Table_ID());
					tables.put(bookline.getAD_Table_ID(), table);					
					if (sqlFrom.length() > 0)
						sqlFrom += ",";
					sqlFrom += table.getTableName();
					if (bookline.getAlias() != null)
					{
						sqlFrom += " "+bookline.getAlias()+" ";
					}
				}
				if (bookline.getC_DocType_ID() > 0 && doctypes.get(bookline.getC_DocType_ID()) == null)
				{
					MDocType dt = MDocType.get(Env.getCtx(), bookline.getC_DocType_ID());
					doctypes.put(bookline.getC_DocType_ID(), dt);
					if (sqlDocType.length() > 0)
						sqlDocType += ",";
					sqlDocType += dt.getC_DocType_ID();
				}
			}
			if (tables.size() == 0)
			{
				throw new Exception("el libro requiere definicion de tabla(s) en GL_BookLine");
			}
			for (X_GL_BookItem bookitem:bookitems)
			{			
				int seqno = bookitem.getSeqNo();
				if (fields.contains(seqno))
				{
					continue;
				}
				fields.add(seqno);
				if (getSQL().length() > 0)			
					addSQL(",");
				else
					addSQL("SELECT ");


				String ColumnSQL = "";
				boolean isUseDocType = false;
				//isUseDocType = true;
				List<Vector> condition = new ArrayList<Vector>();
				for (X_GL_BookItem bookitemgroup:bookitems)
				{						
					if (bookitemgroup.getSeqNo() == seqno)
					{
						Vector big = new Vector();
						big.add(bookitemgroup.getColumnSQL());
						big.add(bookitemgroup.getC_DocType_ID());
						condition.add(big);
					}				
				}							
				if (condition.size() > 1)
				{
					for (Vector vector:condition)
					{
						String columnSQL = (String) vector.get(0);
						int C_DocType_ID = (Integer) vector.get(1);
						if (C_DocType_ID > 0)
						{
							if (isUseDocType)
								ColumnSQL += " WHEN ";
							else
								ColumnSQL += " CASE WHEN ";
							ColumnSQL += "C_DocType_ID = "+C_DocType_ID+" THEN ";
							ColumnSQL += columnSQL;
							isUseDocType = true;

						}
					}
					for (Vector vector:condition)
					{
						String columnSQL = (String) vector.get(0);
						int C_DocType_ID = (Integer) vector.get(1);
						if (C_DocType_ID == 0)
						{
							ColumnSQL += " ELSE ";
							ColumnSQL += columnSQL;
						}
					}				
				}
				if (ColumnSQL.length() > 0)
				{
					if (isUseDocType)
						ColumnSQL += " END ";
					addSQL(ColumnSQL);
				}
				else if (bookitem.getColumnSQL() != null)
				{
					addSQL(bookitem.getColumnSQL());
				}
				else if (bookitem.getColumnName() != null)
				{
					if (bookitem.getAD_Reference_ID() == DisplayType.TableDir)
					{					
						String sqltable = "(SELECT ";
						String TableName = bookitem.getColumnName()
								.substring(0, bookitem.getColumnName().toUpperCase().indexOf("_ID")); 
						MTable table = MTable.get(Env.getCtx(), TableName);
						X_AD_Column colkey = null;
						X_AD_Column coldisplay = null;		
						if (table  == null)
						{
							throw new Exception("la tabla definida "+TableName+" en " +bookitem.getSeqNo()+" no existe ");
						}
						MColumn[] columns = table.getColumns(true);
						for (MColumn col:columns)
						{
							if (col.isKey())
								colkey = col;
							if (col.isIdentifier())
								coldisplay = col;
						}
						sqltable += "zz."+coldisplay.getColumnName();
						sqltable += " FROM " + table.getTableName() + " zz ";
						if (bookitem.isParent())
							sqltable += " WHERE zz." + colkey.getColumnName()+"="+p_GL_Book_ID;
						else
							sqltable += " WHERE zz." + colkey.getColumnName()+"="+sqlFrom+"."+bookitem.getColumnName();
						sqltable += ") AS "+bookitem.getName();					
						addSQL(sqltable);
					}
					else if (bookitem.getAD_Reference_ID() == DisplayType.Table)
					{
						String sqltable = "(SELECT ";
						int AD_Reference_ID = bookitem.getAD_Reference_Value_ID();		
						MRefTable refTable = new Query(Env.getCtx(), MRefTable.Table_Name, "AD_Reference_ID = ?", null)
						.setParameters(AD_Reference_ID).first();
						//X_AD_Ref_Table refTable = new X_AD_Ref_Table(Env.getCtx(), AD_Reference_ID, null);					
						X_AD_Table table = new X_AD_Table(Env.getCtx(), refTable.getAD_Table().getAD_Table_ID(), null);
						X_AD_Column colkey = new X_AD_Column(Env.getCtx(), refTable.getAD_Key(), null);
						X_AD_Column coldisplay = new X_AD_Column(Env.getCtx(), refTable.getAD_Display(), null);
						//
						sqltable += "zz."+coldisplay.getColumnName();
						sqltable += " FROM "+ table.getTableName()+ " zz ";
						if (bookitem.isParent())
							sqltable += " WHERE zz." + colkey.getColumnName()+"="+p_GL_Book_ID;
						else					
							sqltable += " WHERE zz."+colkey.getColumnName()+"="+sqlFrom+"."+bookitem.getColumnName();
						sqltable += ") AS "+bookitem.getName();					
						addSQL(sqltable);
					}
					else
					{					
						addSQL(bookitem.getColumnName());
					}
				}
			}		
			addSQL(" FROM " + sqlFrom + " WHERE ");
			if (book.getWhereClause().length() > 0)
			{
				addSQL(book.getWhereClause());
				addSQL(" AND ");
			}
			addSQL(" ad_client_id = " + p_AD_Client_ID);
			addSQL(" AND (CASE WHEN COALESCE("+p_AD_Org_ID+", 0)  = 0");
			addSQL(" THEN true");
			addSQL(" ELSE (CASE WHEN COALESCE("+p_AD_Org_ID+", 0)  = 0");
			addSQL(" THEN true");
			addSQL(" ELSE ad_org_id = "+p_AD_Org_ID+" END) END)");
			if (sqlDocType.length() > 0)
			{
				addSQL(" AND C_DocType_ID IN ("+sqlDocType+") ");
			}	
			//if period
			Timestamp start = null;
			Timestamp end = null;
			if (periodFrom.getStartDate().compareTo(periodTo.getStartDate()) < 0)
				start = periodFrom.getStartDate();
			else
				start = periodTo.getStartDate();
			if (periodTo.getEndDate().compareTo(periodFrom.getEndDate()) > 0)
				end = periodTo.getEndDate();
			else
				end = periodFrom.getEndDate();
			addSQL(" AND "+book.getProcessingDate()+" BETWEEN '"+new SimpleDateFormat("yyyy/MM/dd").format(start)+"'::timestamp");
			addSQL(" AND '"+new SimpleDateFormat("yyyy/MM/dd").format(end)+"'::timestamp");
			if (book.getGroupByClause().length() > 0)
			{
				addSQL(" GROUP BY ");
				addSQL(book.getGroupByClause());
			}
			if (book.getHavingClause().length() > 0)
			{
				addSQL(" HAVING ");
				addSQL(book.getHavingClause());
			}
			Statement stmt = null;
			ResultSet rs = null;
			stmt = DB.createStatement();
			System.out.println(sql);
			stmt.execute(sql);
			rs = stmt.executeQuery(sql);
			//try {
			int records = 0;
			while (rs.next())
			{
				int colcount = rs.getMetaData().getColumnCount();
				for (int i=0; i  < colcount ; i ++)
				{
					String classname = rs.getMetaData().getColumnClassName(i+1);
					if (classname.equals("java.lang.String"))
					{
						addfield(rs.getString(i+1));
					}
					else if (classname.equals("java.lang.Double"))
					{
						addfield(String.valueOf(rs.getDouble(i+1)));
					}
					else if (classname.equals("java.lang.Integer"))
					{
						addfield(String.valueOf(rs.getInt(i+1)));
					}
					else if (classname.equals("java.math.BigDecimal"))
					{
						BigDecimal result = rs.getBigDecimal(i + 1);
						if (result == null)
							result = BigDecimal.ZERO;
						addfield(result.toString());
					}
					else
					{
						System.out.println(classname);
					}
				}
				endline();
				records++;
			}
			stmt.close();
			rs.close();

			String bookfilename = "";
			for (X_GL_BookFile bookfilefield:bookfile)
			{						
				if (bookfilefield.getName().contains("$P{"))
				{
					String stringtoParse = bookfilefield.getName();
					while (stringtoParse.contains("$P{"))
					{
						String token = stringtoParse.substring(stringtoParse.indexOf("$P{")+3,stringtoParse.indexOf("}"));
						if (token.equals("VALUE"))
						{						
							stringtoParse = stringtoParse.replace("$P{VALUE}", book.getValue());
						}
						else if (token.equals("YEAR"))
						{
							int tkC_Year_ID = periodTo.getC_Year_ID();
							MYear tkyear = new MYear(Env.getCtx(), tkC_Year_ID, null);						
							stringtoParse = stringtoParse.replace("$P{YEAR}", tkyear.getFiscalYear());
						}
						else if (token.equals("MONTH"))
						{
							stringtoParse = stringtoParse.replace("$P{MONTH}", String.format("%02d", periodTo.getPeriodNo()));
						}
						else if (token.equals("TAXID"))
						{
							MClient client = MClient.get(Env.getCtx(), Env.getAD_Client_ID(Env.getCtx()));
							MClientInfo cliinfo = client.getInfo();
							stringtoParse = stringtoParse.replace("$P{TAXID}", cliinfo.getTaxID());
						}
						else if (token.equals("CONTENT"))
						{
							if (records == 0)
								stringtoParse = "0";
							else
								stringtoParse = "1";
						}
					}
					bookfilename += stringtoParse;
				}
				else
				{
					bookfilename += bookfilefield.getName();
				}
			}
			
			
			if (Ini.isClient())
			{
				JFileChooser fileChooser = new JFileChooser();			
				fileChooser.setSelectedFile(new File(System.getProperty ("user.dir") + File.separator + bookfilename +".txt"));
				if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					PrintWriter writer = new PrintWriter(file.getAbsolutePath(), "UTF-8");
					for (String s : lines)
					{
						writer.println(s);
					}						
					writer.close();
				}					
			}
		}
		catch (Exception e)
		{
			error = e.getMessage();
		}
		return error;
	}

	private void addfield(String field) {
		line  += field;
		line += "|";
	}

	private void endline()
	{
		lines .add(line);
		line = "";
	}

	private void addSQL(String sqlstring) throws Exception {
		if (sqlstring.indexOf("$P{") > 0)
		{
			while (sqlstring.indexOf("$P{") > 0)
			{
				if (sqlstring.indexOf("}") == -1)
					throw new Exception(String.format("la expresion %s utiliza {} pero falta un } para completar la expresion",sqlstring));				
				String token = sqlstring.substring(sqlstring.indexOf("$P{")+3,sqlstring.indexOf("}"));
				if (token.equals("TABLE"))
				{
					sqlstring = sqlstring.replace("$P{TABLE}", sqlFrom);
				}
				if (token.equals("PERIOD"))
				{
					SimpleDateFormat dt = new SimpleDateFormat("yyyyMM");		
					String periodString = dt.format(periodTo.getStartDate());
					sqlstring = sqlstring.replace("$P{PERIOD}", periodString);
				}
			}
		}
		sql += sqlstring+"\n";		
	}

	private String getSQL() {
		return sql;
	}

}
