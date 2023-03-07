package org.xendra.xendrian;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;

import net.sf.extcos.ComponentQuery;
import net.sf.extcos.ComponentScanner;
import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.compiere.model.MColumn;
import org.compiere.model.MFunction;
import org.compiere.model.MIndex;
import org.compiere.model.MProcess;
import org.compiere.model.MProcessPara;
import org.compiere.model.MSystem;
import org.compiere.model.MTable;
import org.compiere.model.M_Element;
import org.compiere.model.PO;
import org.compiere.model.POInfo;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_Field;
import org.compiere.model.persistence.X_AD_FieldGroup;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_Index;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_Operator;
import org.compiere.model.persistence.X_AD_Package;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Role;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_TreeNodeMM;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.model.persistence.X_AD_View;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.model.persistence.X_AD_Window_Access;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Location;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_InvoiceLine;
import org.compiere.model.persistence.X_C_PaymentTerm;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_InOutLine;
import org.compiere.model.persistence.X_M_InventoryLine;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_ProductionLine;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.model.reference.REF_AD_SchedulerType;
import org.compiere.model.reference.REF__EntityType;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.annotations.XendraColumn;
import org.xendra.annotations.XendraElement;
import org.xendra.annotations.XendraField;
import org.xendra.annotations.XendraFunction;
import org.xendra.annotations.XendraIndex;
import org.xendra.annotations.XendraOperator;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.annotations.XendraRef;
import org.xendra.annotations.XendraRefItem;
import org.xendra.annotations.XendraRefTable;
import org.xendra.annotations.XendraScheduler;
import org.xendra.annotations.XendraTab;
import org.xendra.annotations.XendraTable;
import org.xendra.annotations.XendraTrl;
import org.xendra.annotations.XendraValRule;
import org.xendra.annotations.XendraView;
import org.xendra.api.XendrianServer;
import org.xendra.console.ThreadRotDash;
import org.xendra.db.Querys;
import org.xendra.process.update.storeprocedurestoxml;
import org.xendra.replication.ReplicationEngine;
import org.xendra.util.UpdatePO;
import org.xendra.utils.ElementProperties;
//import org.xendra.utils.Rotdash;
import org.xendra.utils.Rotdash;

import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.ProgressBar;
import com.googlecode.lanterna.gui2.TextBox;


public class SyncModel {
	private static CLogger log = CLogger.getCLogger(SyncModel.class);
	private static SyncModel m_syncmodel;
	private DatabaseMetaData md;
	private String schema = null;
	private String catalog = null;
	private static Hashtable elements = new Hashtable();
	private static Hashtable menus = new Hashtable();
	private static Hashtable forms = new Hashtable();
	private static Hashtable trl = new Hashtable();
	private static Hashtable functionsToTry = new Hashtable();
	private static Hashtable references = new Hashtable();
	private static Hashtable valrules = new Hashtable();
	private static Set<Class<?>> listvalrules = null;
	private static Set<Class<?>> listreferences = null;
	private List<String> columnpendings = new ArrayList<String>();
	private List<String> ClazzProcessed = new ArrayList<String>();
	private Set<Class<? extends PO>> serializables = null; 
	private Set<Class<?>> operators;
	private Set<Class<?>> views;
	private Set<Class<?>> functions;
	private Set<Class<?>> processes;
	private Boolean m_checkReferences = false;
	private Label label;
	private Label checklabel;
	private TextBox logs;
	private ProgressBar bar;
	private ProgressBar pbar;
	private boolean server = false;
	private MultiWindowTextGUI gui;
	private List<String> errors = new ArrayList<String>();


	public static SyncModel getInstance() 
	{
		if (m_syncmodel == null)
		{
			m_syncmodel = new SyncModel();
		}
		return m_syncmodel;
	}
	public SyncModel() {
		Initialize();		
	}

	private void Initialize() {
		try {					
			logs = new TextBox();
			fillHashtable();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{

		}
	}
	public void setGUI(MultiWindowTextGUI gui) {
		this.gui = gui;
	}
	public void setLabel(Label label) {
		this.label = label;
	}	
	public void setBar(ProgressBar pbar) {
		bar = pbar;
	}
	public void setLabelChecking(Label label) {
		this.checklabel = label;
	}
	public void setBarChecking(ProgressBar pbar) {
		this.pbar = pbar;
	}
	public void setModeServer() {
		if (!server)
			server = true;		
	}
	public boolean IsModeServer() {
		return server;
	}
	public void setTextBox(TextBox textbox) {
		logs = textbox;
	}

	public void setLine(String line) {
		String previous = logs.getText();
		String newline = System.getProperty("line.separator");
		if (previous.indexOf(newline) != previous.lastIndexOf(newline)) {
			previous = previous.substring(0, previous.lastIndexOf(newline));
			previous = String.format("%s\n%s\n", previous, line);						
		} else {
			previous = String.format("%s\n%s\n", previous, line);					
		}
		logs.setText(previous);
	}

	public void addLine(String line) {
		logs.addLine(line);
		logs.setReadOnly(false);
		logs.takeFocus();
		logs.setCaretPosition(Integer.MAX_VALUE, Integer.MAX_VALUE);

		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		logs.setReadOnly(true);	    
	}
	public String memoryavailable() {
		String error = "";
		try {
			long memory  = (Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory());
			int unit = 1024;
			if (memory < unit )
			{			
				throw new Exception("Insuficient Memory to Update");
			}
			else
			{
				int exp = (int) (Math.log(memory) / Math.log(unit));
				String pre = "KMGTPE".charAt(exp-1) + "i";
				String info = String.format("%.1f %sB RAM Available", memory / Math.pow(unit, exp), pre);
				//System.out.println(info);				
				if (IsModeServer()) {
					log.log(Level.WARNING,info);	
				} else {
					addLine(info);
				}
			}
			if (memory < 700000)		
			{			
				throw new Exception(String.format("%s is insuficient Memory to Update", memory));
			}	
		} catch (Exception e) {
			error = e.getMessage();
			if (IsModeServer()) {
				log.log(Level.WARNING,error);
			} else {
				addLine(error);
			}			
		}
		return error;
	}	
	public String checkModelFull() {
		//boolean isok = true;
		String error = "";
		if (IsModeServer()) {
			log.log(Level.WARNING,"Checking model...");
			//rotdash = Rotdash.getInstance();
			Rotdash.getInstance().start();		
		} else {
			addLine("Checking model...");
		}

		try {			
			//TODO verificar integridad de datos para trabajar en el pos			
			//TODO verificar uuid
			//TODO verificar seq
			checkReferences();
			checkvalrule();
			checkIdentifiers();
			checksequences();
			//
			// tables from xendra must be matching
			md = DB.getConnectionRO().getMetaData();
			//
			serializables = new HashSet<Class<? extends PO>>();
			ComponentScanner scanner = new ComponentScanner();
			scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.persistence").andStore(thoseExtending(PO.class).into(serializables));
				}
			}		
					);					
			Iterator it = serializables.iterator();
			float i = 0;
			float rows = serializables.size();
			while (it.hasNext())
			{			
				Class<?> clazz = (Class<?>) it.next();
				if (bar != null) {
					label.setText(String.format("checking %s", clazz.getName()));
					float p = (i / rows) * 100;
					bar.setValue((int) p);
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}													
				}
				for (Field f:clazz.getDeclaredFields())
				{
					for (Annotation ap:f.getAnnotations()) {
						if (ap.annotationType() == XendraTable.class) {					
							XendraTable table = (XendraTable) ap;
							if (table.TableName().startsWith("T_"))
								continue;
							if (!table.IsView())
							{
								ResultSet rs = md.getTables(catalog, schema, table.TableName().toLowerCase(), new String[] {"TABLE"});
								if (!rs.next())
								{
									throw new Exception(String.format("table %s not found", table.TableName()));
								}								
								X_AD_Table dbtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "tablename = ?", null)
										.setParameters(table.TableName()).first();
								if (dbtable == null || dbtable.getSynchronized() == null)
								{
									throw new Exception(String.format("table %s out of sync", table.TableName()));									
								}
								Timestamp synchro = Timestamp.valueOf(table.Synchronized());
								if (synchro.compareTo(dbtable.getSynchronized()) > 0)
								{
									throw new Exception(String.format("table %s out of sync", table.TableName()));
								}
								if (dbtable.getAD_Plugin_ID() == 0) {
									if (IsModeServer())
										System.out.println(String.format("table %s plugin out of sync", table.TableName()));
									else
										this.addLine(String.format("table %s plugin out of sync (NO Plugin ID)", table.TableName()));
								}
							} else {
								X_AD_Table dbtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "tablename = ?", null)
										.setParameters(table.TableName()).first();
								if (dbtable == null || dbtable.getSynchronized() == null)
								{
									throw new Exception(String.format("view %s out of sync", table.TableName()));									
								}
								Timestamp synchro = Timestamp.valueOf(table.Synchronized());
								if (synchro.compareTo(dbtable.getSynchronized()) > 0)
								{
									throw new Exception(String.format("view %s out of sync", table.TableName()));
								}								
							}
							table = null;
						}						
					}
				}
				i++;
			}
			serializables.clear();
			serializables = null;
			Hashtable srcoperators = new Hashtable();
			PreparedStatement pstmt = DB.prepareStatement(Querys.GETOPERATORS, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Hashtable props = Util.getProperties(rs.getString(X_AD_Operator.COLUMNNAME_Description));
				Iterator keys = props.keySet().iterator();
				String id = "";
				Timestamp sync = null;
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (key.equals(X_AD_Function.COLUMNNAME_Identifier))
						id = (String) value;
					else if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
						sync = (Timestamp) value;
				}
				if (id != null && sync != null)
				{
					if (!srcoperators.containsKey(id))
						srcoperators.put(id, sync);
				}
			}
			int opercnt = 0;
			//operators = new HashSet<Class<?>>();
			operators = scanner.getClasses(	new ComponentQuery()
			{
				protected void query() {
					select().from("org.compiere.model.operator").returning(all());
				}
			});	
			i = 1;
			rows = operators.size();
			it = operators.iterator();
			while (it.hasNext())
			{			
				Object viewclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) viewclass).getName());
				if (bar != null) {
					label.setText(clazzref.getName());
					float p = (i / rows) * 100;
					bar.setValue((int) p);
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}													
				}								
				XendraOperator ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraOperator.class);
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
				if (srcoperators.containsKey(ref.Identifier()))
				{
					if (srcoperators.get(ref.Identifier()).equals(srcsynchro))
						opercnt++;
				}
			}
			if (opercnt != operators.size())
			{
				throw new Exception(String.format("numbers of operators don't match %d != %d", opercnt, operators.size()));
			}
			//
			Hashtable srcviews = new Hashtable();
			pstmt = DB.prepareStatement(Querys.GETVIEWS, null);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				Hashtable props = Util.getProperties(rs.getString("comment"));
				Iterator keys = props.keySet().iterator();
				String id = "";
				Timestamp sync = null;
				while (keys.hasNext())
				{
					String key = (String) keys.next();
					Object value = props.get(key);
					if (key.equals(X_AD_View.COLUMNNAME_Identifier))
						id = (String) value;
					else if (key.equals(X_AD_View.COLUMNNAME_Synchronized))
						sync = (Timestamp) value;
				}
				if (id != null && sync != null)
				{
					if (!srcviews.containsKey(id))
						srcviews.put(id, sync);
				}
			}
			int  viewcnt = 0;

			//views = new HashSet<Class<?>>();
			views = scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.view").returning(all());
				}
			});					
			it = views.iterator();
			while (it.hasNext())
			{			
				Object viewclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) viewclass).getName());				
				XendraView ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraView.class);
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
				if (srcviews.containsKey(ref.Identifier()))
				{
					if (srcviews.get(ref.Identifier()).equals(srcsynchro))
						viewcnt++;
					else {
						throw new Exception(String.format("view %s no sync ", ref.Name()));
					}

				}				
				else {
					throw new Exception(String.format("view %s not found ", ref.Name()));
				}
			}
			if (viewcnt != views.size())
				throw new Exception();
			views = null;
			Hashtable srcfunctions = new Hashtable();
			pstmt = DB.prepareStatement(Querys.GETFUNCTIONS, null);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				Hashtable props = Util.getProperties(rs.getString("comments"));
				Iterator keys = props.keySet().iterator();
				String id = "";
				Timestamp sync = null;
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (key.equals(X_AD_Function.COLUMNNAME_Identifier))
					{
						id = (String) value;
					}
					else if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
						sync = (Timestamp) value;
				}
				if (id != null && sync != null)
				{
					if (!srcfunctions.containsKey(id))
						srcfunctions.put(id, sync);
				}
			}
			int funccnt = 0;

			//functions = new HashSet<Class<?>>();
			functions = scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.function").returning(all());
				}
			});					
			it = functions.iterator();
			while (it.hasNext())
			{
				Object processclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) processclass).getName());
				XendraFunction ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraFunction.class);
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
				if (srcfunctions.containsKey(ref.Identifier()))
				{
					if (srcfunctions.get(ref.Identifier()).equals(srcsynchro))
						funccnt++;
					else						
						throw new Exception(String.format("function %s no sync ", ref.Name()));
				}
				else {
					throw new Exception(String.format("function %s not found ", ref.Name()));
				}
			}					
			if (funccnt != functions.size())
				throw new Exception();
			functions = null;
			//			Class<?> clazzref = Class.forName("org.compiere.model.window.X_AD_WindowList");
			//			int formcnt = 0;
			//			for (Object key:forms.keySet()) {
			//				String id = (String) forms.get(key);
			//				XendraForm formref = clazzref.getField(id).getAnnotation(XendraForm.class);
			//				String classname = formref.Classname();				
			//				X_AD_Form form = new Query(Env.getCtx(), X_AD_Form.Table_Name, "classname = ?", null)
			//				.setParameters(classname).first();
			//				if (form != null)
			//					formcnt++;
			//				else {
			//					//log.log(Level.WARNING, String.format("form %s no sync ", formref.Name()));
			//					throw new Exception(String.format("form %s no sync ", formref.Name()));
			//				}
			//			}
			//			if (formcnt != forms.size())
			//				throw new Exception();
			// processes
			//processes = new HashSet<Class<?>>();
			processes = scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.xendra.process").returning(all());
				}
			});					
			it = processes.iterator();
			while (it.hasNext()) {
				Class<?> clazz = (Class<?>) it.next();
				String classname = clazz.getName();				
				XendraProcess proc = null;
				boolean goahead = true;
				Annotation[] annots = clazz.getAnnotations();
				if (annots.length == 0) {
					goahead = false;
				} else {				
					for (Annotation annot:annots) {
						if (annot instanceof Deprecated) {
							goahead = false;
							break;
						} else if (annot.annotationType() == XendraProcess.class) {
							proc = (XendraProcess) annot;
						}
					}
				}
				if (goahead && proc != null) {
					if (proc.updated() == null) {
						//System.out.println("X");
					}
					Timestamp srcsynchro = null;
					try {
						srcsynchro = Timestamp.valueOf(proc.updated());
					} catch (Exception e) {
						e.printStackTrace();
					}
					MProcess process = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
							.setParameters(classname).first();
					if (process == null) 
						throw new Exception(String.format("process %s not found", classname));					
					else if (process.getSynchronized() == null) {
						//throw new Exception();
						throw new Exception(String.format("process %s no sync", classname));
					} else if (process.getSynchronized().compareTo(srcsynchro) != 0) {
						//throw new Exception();
						throw new Exception(String.format("process %s no sync", classname));
					}
				}
			}
			processes = null;
			//	Migration
			MSystem system = MSystem.get(Env.getCtx());
			if (system != null && system.isJustMigrated())
			{
				log.log(Level.WARNING, "System is Just migrated ");
				//statusBar.setStatusLine("Running: After Migration ....", true);
				//ADialog.info (m_WindowNo, this, "AfterMigration");
				if (!DB.afterMigration(Env.getCtx()))
					throw new Exception();
			}

		}
		catch (Exception e)
		{
			error = e.getMessage();
			if (this.IsModeServer())
				log.log(Level.WARNING, error);
			else
				addLine(error);
			//e.printStackTrace();			
			//serializables.clear();
			//serializables = null;			
			//isok = false;			
		}
		//rotdash.stop();
		if (IsModeServer()) {
			log.log(Level.WARNING,"Checking model finished...");			
			Rotdash.getInstance().stop();
		}		
		return error;
	}
	public String SyncronizeLight() {
		String error = "";
		error = memoryavailable();
		if (error.length() > 0)
			return error;
		schema = DB.getDatabase().getSchema();
		catalog = DB.getDatabase().getCatalog();	
		try {
			error = checkModelLight();
			if (error.length() > 0)
			{
				error = checkModelLight();
			}
			MSystem system = MSystem.get(Env.getCtx());	//	Initializes Base Context too
			if (system == null) {
				system = new MSystem(Env.getCtx(), 0, null);								
			}	
			if (system.getVersion().compareTo(Xendra.DB_VERSION) != 0) {
				system.setVersion(Xendra.DB_VERSION);
				system.save();					
			}			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return error;	
	}

	public void AddError(String error) {
		if (!errors.contains(error) && error.length() > 0) {
			errors.add(error);
		}
	}

	public String SyncronizeFull(String error)
	{		
		AddError(error);
		error = memoryavailable();
		if (error.length() > 0)
			return error;
		schema = DB.getDatabase().getSchema();
		catalog = DB.getDatabase().getCatalog();	
		try {			
			error = checkModelFull();
			if (error.length() > 0)
			{
				if (this.IsModeServer())
					log.log(Level.WARNING, "update model");
				else
					addLine("update model");
				md = DB.getConnectionRO().getMetaData();				
				//checksequences();
				UpdateTable();
				UpdateFunctions();
				UpdateOperators();
				UpdateViews();
				UpdateProcess();
				//UpdateForms();
				Iterator keys = functionsToTry.keySet().iterator();
				while (keys.hasNext())
				{
					int no = 0;
					String key = (String)keys.next();
					StringBuilder[] sqllist = (StringBuilder[]) functionsToTry.get(key);
					for (StringBuilder sql:sqllist)
					{
						System.out.println(sql);
						no = executesql(sql.toString());
						if (no == -1)
							break;
					}
					if (no == 0)
					{
						functionsToTry.remove(key);
						keys = functionsToTry.keySet().iterator();
						continue;
					}
				}
				error = checkModelFull();
			}
			MSystem system = MSystem.get(Env.getCtx());	//	Initializes Base Context too
			if (system == null) {
				system = new MSystem(Env.getCtx(), 0, null);								
			}	
			if (system.getVersion().compareTo(Xendra.DB_VERSION) != 0) {
				system.setVersion(Xendra.DB_VERSION);
				system.save();					
			}			
		} catch (Exception e)
		{
			error = e.getMessage();
			if (!this.IsModeServer()) {
				addLine(error);
				AddError(error);
			}
			//e.printStackTrace();
		}
		return error;
	}

	public String SyncronizeReset(ThreadRotDash dash, String error) {
		if (this.IsModeServer())
			log.log(Level.WARNING, "reseteando sincronizacion...");
		else
			addLine("reseteando sincronizacion...");
		List<X_AD_Table> tables = new Query(Env.getCtx(), X_AD_Table.Table_Name, "IsView = 'N'", null).list();
		float i = 0;
 		for (X_AD_Table table:tables) {
			if (table.getTableName().toLowerCase().endsWith("_trl"))
				continue;
			table.setSynchronized(null);
			if (table.save()) {
				if (this.IsModeServer())
					log.log(Level.WARNING, table.getTableName());
				else {
					setLine(table.getTableName());
					float p = (i / tables.size()) * 100;
					setbar(p);
				}
				//dash.setMessage(String.format("%s %s", table.getName(), table.getTableName()));
				List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ?", null)
						.setParameters(table.getAD_Table_ID()).list();
				for (X_AD_Column column:columns) {
					column.setSynchronized(null);
					column.save();
				}
			}
			i++;			
		}		
 		setbar(100);
		return SyncronizeFull(error);
	}

	private void setbar(float p) {
		pbar.setValue((int) p);
		try {
			gui.updateScreen();
		} catch (IOException e2) {
			e2.printStackTrace();
		}				
	}

	//	public static void fillHashtable(Class<?> clazzlist, Hashtable classlist) {
	//		fillHashtable(clazzlist, classlist, "");
	//	}

	public static void fillHashtable() {
		try {
			List<X_AD_Plugin> plugins = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "IsActive = 'Y'", null)
					.list();
			for (X_AD_Plugin plugin:plugins) {
				String content = plugin.getplugin();
				InputStream stream;
				stream = new ByteArrayInputStream(content.getBytes("UTF-8"));
				SAXBuilder builder = new SAXBuilder();
				Document doc = builder.build(stream);
				Element pluginElement = doc.getRootElement();
				Iterator it = pluginElement.getChildren().listIterator();
				while (it.hasNext() ) {
					Element extensionListXmlElement = (Element) it.next();
					if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_GUI)) {
						int level = 1;					
						Iterator it2 = extensionListXmlElement.getChildren().listIterator();
						while (it2.hasNext()) {
							Element guicomponent = (Element) it2.next();
							if (guicomponent.getName().equals("menu")) {
								List<Element> mchildren = guicomponent.getChildren();
								for (int j=0; j < mchildren.size(); j ++) {
									Element menu = mchildren.get(j);
									deploymenu(plugin, menu);
								}								
							} else if (guicomponent.getName().equals("window")) {
								List<Element> wchildren = guicomponent.getChildren();
								for (int j=0; j < wchildren.size(); j++) {
									Element window = wchildren.get(j);
									deploywindow(plugin, window);
								}
							} if (guicomponent.getName().equals("form")) {
								List<Element> fchildren = guicomponent.getChildren();
								for (int j=0; j < fchildren.size(); j++) {
									Element form = fchildren.get(j);
									deployform(plugin, form);
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static Comparator<Element> elementSeqNo = new Comparator<Element>() {
		public int compare(Element e1, Element e2) {
			int compare = 0;
			if (e1.getName().equals("menu")) {
				Object x = e1.getAttributeValue(X_AD_TreeNodeMM.COLUMNNAME_SeqNo);
				Integer val1 = Integer.valueOf(e1.getAttributeValue(X_AD_TreeNodeMM.COLUMNNAME_SeqNo));
				Integer val2 = Integer.valueOf(e2.getAttributeValue(X_AD_TreeNodeMM.COLUMNNAME_SeqNo));				
				compare = val1.compareTo(val2);
			}
			return compare;
		}
	};			

	public static void deploymenu(X_AD_Plugin plugin, Element menu) {
		boolean goahead = false;		
		String AD_Menu_ID = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_AD_Menu_ID);
		String Name = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_Name);
		String Identifier = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_Identifier);
		String sync = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_Synchronized);
		Timestamp Synchronized = Timestamp.valueOf(sync);		
		X_AD_Menu m = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "Identifier = ?", null)
				.setParameters(Identifier).first();
		if (m != null) {
			if (m.getSynchronized() == null || m.getSynchronized().compareTo(Synchronized) < 0) {
				goahead = true;
			}
		}
		else if (m == null) {
			// try by name
			m = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "Name = ?", null)	
					.setParameters(Name).first();
			if (m == null)
				goahead = true;
			else if (m != null) {
				if (m.getAD_Menu_ID() == Integer.valueOf(AD_Menu_ID)) {
					m.setIdentifier(Identifier);
					m.save();
				}
				if (m.getSynchronized() == null || m.getSynchronized().compareTo(Synchronized) < 0) {
					goahead = true;
				}				
			}			
		}
		if (goahead) {
			if (m == null) 
				m = new X_AD_Menu(Env.getCtx(), 0, null);						
			String Description = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_Description);
			Boolean IsSummary = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSummary).equals("Y");
			Boolean IsSOTrx = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSOTrx).equals("Y");
			Boolean IsReadOnly = menu.getAttributeValue(X_AD_Menu.COLUMNNAME_IsReadOnly).equals("Y");
			String seqno = menu.getAttributeValue(X_AD_TreeNodeMM.COLUMNNAME_SeqNo);
			m.setName(Name);
			m.setDescription(Description);
			m.setIsSummary(IsSummary.equals("Y"));
			m.setIsSOTrx(IsSOTrx.equals("Y"));
			m.setIsReadOnly(IsReadOnly.equals("Y"));
			m.setIdentifier(Identifier);
			m.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
			m.setSynchronized(Synchronized);			
			if (m.save()) {
				List<Element> wchildren = menu.getChildren();
				for (int j=0; j < wchildren.size(); j ++) {
					Element wchild = wchildren.get(j);
					if (wchild.getName().equals("translate")) {
						String wlang = wchild.getAttributeValue("lang");
						String wname = wchild.getAttributeValue("name");
						String wvalue = wchild.getAttributeValue("value");
						String sqlupdate = String.format("UPDATE AD_Menu_trl set %s='%s' WHERE AD_Menu_ID=%s AND ad_language='%s'",wname,wvalue,m.getAD_Menu_ID(), wlang);
						int no = DB.executeUpdate(sqlupdate, null);														
						if (no == 0) {
							UpdatePO p = new UpdatePO();
							p.setTablename("AD_Menu_Trl");
							p.setField(wname, wvalue);
							p.setField(X_AD_Menu.COLUMNNAME_AD_Menu_ID, m.getAD_Menu_ID());
							p.insert(null);
						}													
					}
				}				
			}
		}
		List<Element> children = menu.getChildren();
		List<Element> childs = new ArrayList<Element>();
		for (int i=0; i < children.size(); i ++) {			
			Element child = children.get(i);
			childs.add(child);
		}					
		Collections.sort(childs, elementSeqNo);
		for (Element child:childs) {
			if (child.getName().equals("menu")) {
				deploymenu(plugin, child);
			} else if (child.getName().equals("form")) {
				deployform(plugin, child);
			} else if (child.getName().equals("window")) {
				deploywindow(plugin, child);
			}
		}
	}

	//	public static void fillHashtable(Class<?> clazzlist, Hashtable classlist, String startwith) {
	//		try {
	//			Class<?> clazz = Class.forName(clazzlist.getName());
	//			for (Field f:clazz.getDeclaredFields())
	//			{
	//				if (startwith != null && startwith.length() > 0)
	//				{
	//					if (f.getName().startsWith(startwith))
	//					{
	//						String identifier = (String) f.get(clazz);
	//						if (!classlist.containsKey(identifier))
	//							classlist.put(identifier, f.getName());											
	//					}
	//				}
	//				else
	//				{
	//					String identifier = (String) f.get(clazz);
	//					if (!classlist.containsKey(identifier))
	//						classlist.put(identifier, f.getName());					
	//				}
	//			}	
	//		}
	//		catch (Exception e)
	//		{
	//			e.printStackTrace();
	//		}
	//	}
	private static void deployform(X_AD_Plugin plugin, Element child) {
		String Identifier = child.getAttributeValue(X_AD_Form.COLUMNNAME_Identifier);									
		String sync = child.getAttributeValue(X_AD_Form.COLUMNNAME_Synchronized);
		Timestamp syncform = Timestamp.valueOf(sync);
		Calendar calref = Calendar.getInstance();
		calref.setTime(syncform);
		calref.set(Calendar.MILLISECOND, 0);
		syncform = new Timestamp(calref.getTime().getTime());		
		String name = child.getAttributeValue(X_AD_Form.COLUMNNAME_Name);
		X_AD_Form dbform = new Query(Env.getCtx(), X_AD_Form.Table_Name, "Identifier = ?", null)
				.setParameters(Identifier).first();
		if (dbform == null) {
			dbform = new Query(Env.getCtx(), X_AD_Form.Table_Name, "name = ?", null)
					.setParameters(name).first();
			if (dbform != null) {
				dbform.setIdentifier(Identifier);
				dbform.save();
			}
		}
		Boolean goahead = false;
		if (dbform != null) {										
			if (dbform.getSynchronized() == null || dbform.getSynchronized().compareTo(syncform) < 0) {
				goahead = true;
			}
		} else {
			goahead = true;
		}
		if (goahead) {
			if (dbform == null) {
				dbform = new X_AD_Form(Env.getCtx(), 0, null);
				dbform.setIdentifier(Identifier);
				dbform.setSynchronized(syncform);
			}
			String description = child.getAttributeValue(X_AD_Form.COLUMNNAME_Description);
			String help = child.getAttributeValue(X_AD_Form.COLUMNNAME_Help);
			String accesslevel = child.getAttributeValue(X_AD_Form.COLUMNNAME_AccessLevel);
			String classname = child.getAttributeValue(X_AD_Form.COLUMNNAME_Classname);
			String EntityType = child.getAttributeValue(X_AD_Form.COLUMNNAME_EntityType);
			Boolean IsBetaFunctionality = child.getAttributeValue(X_AD_Form.COLUMNNAME_IsBetaFunctionality).equals(Constants.YES);
			Boolean IsMenu = child.getAttributeValue(X_AD_Form.COLUMNNAME_IsMenu).equals(Constants.YES);
			dbform.setName(name);
			dbform.setDescription(description);
			dbform.setHelp(help);
			dbform.setAccessLevel(accesslevel);
			dbform.setClassname(classname);
			dbform.setEntityType(EntityType);
			dbform.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
			dbform.setIsBetaFunctionality(IsBetaFunctionality);
			dbform.setIsMenu(IsMenu);
			if (dbform.save()) {
				List<Element> wchildren = child.getChildren();
				for (int j=0; j < wchildren.size(); j ++) {
					Element wchild = wchildren.get(j);
					if (wchild.getName().equals("translate")) {
						String wlang = wchild.getAttributeValue("lang");
						String wname = wchild.getAttributeValue("name");
						String wvalue = wchild.getAttributeValue("value");
						String sqlupdate = String.format("UPDATE AD_Form_trl set %s='%s' WHERE AD_Form_ID=%s AND ad_language='%s'",wname,wvalue,dbform.getAD_Form_ID(), wlang);
						int no = DB.executeUpdate(sqlupdate, null);														
						if (no == 0) {
							UpdatePO p = new UpdatePO();
							p.setTablename("AD_Form_Trl");
							p.setField(wname, wvalue);
							p.setField(X_AD_Form.COLUMNNAME_AD_Form_ID, dbform.getAD_Form_ID());
							p.insert(null);
						}													
					}
				}
			}
		}													
	}
	private static void deploywindow(X_AD_Plugin plugin, Element child) {		
		String Identifier = child.getAttributeValue(X_AD_Window.COLUMNNAME_Identifier);									
		String sync = child.getAttributeValue(X_AD_Window.COLUMNNAME_Synchronized);
		Timestamp syncwindow = Timestamp.valueOf(sync);
		Calendar calref = Calendar.getInstance();
		calref.setTime(syncwindow);
		calref.set(Calendar.MILLISECOND, 0);
		syncwindow = new Timestamp(calref.getTime().getTime());		
		String name = child.getAttributeValue(X_AD_Window.COLUMNNAME_Name);
		X_AD_Window dbwindow = new Query(Env.getCtx(), X_AD_Window.Table_Name, "Identifier = ?", null)
				.setParameters(Identifier).first();
		if (dbwindow == null) {
			dbwindow = new Query(Env.getCtx(), X_AD_Window.Table_Name, "name = ?", null)
					.setParameters(name).first();
			if (dbwindow != null) {
				dbwindow.setIdentifier(Identifier);
				dbwindow.save();
			}
		}
		Boolean goahead = false;
		if (dbwindow != null) {										
			if (dbwindow.getSynchronized() == null || dbwindow.getSynchronized().compareTo(syncwindow) < 0) {
				goahead = true;
			}
		} else {
			goahead = true;
		}
		if (goahead) {
			if (dbwindow == null) {
				dbwindow = new X_AD_Window(Env.getCtx(), 0, null);
				dbwindow.setIdentifier(Identifier);
				dbwindow.setSynchronized(syncwindow);
			}
			String description = child.getAttributeValue(X_AD_Window.COLUMNNAME_Description);
			String help = child.getAttributeValue(X_AD_Window.COLUMNNAME_Help);
			String WindowType = child.getAttributeValue(X_AD_Window.COLUMNNAME_WindowType);
			Boolean IsSOTrx = child.getAttributeValue(X_AD_Window.COLUMNNAME_IsSOTrx).equals("Y");
			Boolean IsBetaFunctionality = child.getAttribute(X_AD_Window.COLUMNNAME_IsBetaFunctionality).equals("Y");											
			dbwindow.setName(name);
			dbwindow.setDescription(description);
			dbwindow.setHelp(help);
			dbwindow.setWindowType(WindowType);
			dbwindow.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
			dbwindow.setIsSOTrx(IsSOTrx);
			dbwindow.setIsBetaFunctionality(IsBetaFunctionality);
			if (dbwindow.save()) {
				List<X_AD_Client> clients = new Query(Env.getCtx(), X_AD_Client.Table_Name, "AD_Client_ID > 0 AND IsActive = 'Y'", null)
						.list();
				for (X_AD_Client client:clients) {
					List<X_AD_Role> roles = new Query(Env.getCtx(), X_AD_Role.Table_Name, "AD_Client_ID = ?", null)
							.setParameters(client.getAD_Client_ID())
							.list();					
					for (X_AD_Role role:roles) {
						X_AD_Window_Access wc = new Query(Env.getCtx(), X_AD_Window_Access.Table_Name, "AD_Window_ID = ? AND AD_Role_ID = ?", null)
								.setParameters(dbwindow.getAD_Window_ID(), role.getAD_Role_ID()).first();
						if (wc == null) {
							wc = new X_AD_Window_Access(Env.getCtx(), 0, null);
							wc.setAD_Role_ID(role.getAD_Role_ID());
							wc.set_CustomColumn("AD_Client_ID", client.getAD_Client_ID());						
							wc.setAD_Window_ID(dbwindow.getAD_Window_ID());
							wc.save();
						}
					}					
				}				
				List<Element> wchildren = child.getChildren();
				for (int j=0; j < wchildren.size(); j ++) {
					Element wchild = wchildren.get(j);
					if (wchild.getName().equals("translate")) {
						String wlang = wchild.getAttributeValue("lang");
						String wname = wchild.getAttributeValue("name");
						String wvalue = wchild.getAttributeValue("value");
						String sqlupdate = String.format("UPDATE AD_Window_trl set %s='%s' WHERE AD_Window_ID=%s AND ad_language='%s'",wname,wvalue,dbwindow.getAD_Window_ID(), wlang);
						int no = DB.executeUpdate(sqlupdate, null);														
						if (no == 0) {
							UpdatePO p = new UpdatePO();
							p.setTablename("AD_Window_Trl");
							p.setField(wname, wvalue);
							p.setField(X_AD_Window.COLUMNNAME_AD_Window_ID, dbwindow.getAD_Window_ID());
							p.insert(null);
						}													
					}
				}
			}
		}											
	}
	public String checkModelLight() {
		String error = "";
		log.log(Level.WARNING,"Checking model...");
		//Rotdash rotdash = Rotdash.getInstance();
		//rotdash.start();		
		try {			
			checkReferences();
			checkvalrule();
			//
			// tables from xendra must be matching
			md = DB.getConnectionRO().getMetaData();
			//
			serializables = new HashSet<Class<? extends PO>>();
			ComponentScanner scanner = new ComponentScanner();
			scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.persistence").andStore(thoseExtending(PO.class).into(serializables));
				}
			}		
					);					
			Iterator it = serializables.iterator();
			int i = 0;
			while (it.hasNext())
			{			
				Class<?> clazz = (Class<?>) it.next();		
				for (Field f:clazz.getDeclaredFields())
				{
					for (Annotation ap:f.getAnnotations()) {
						if (ap.annotationType() == XendraTable.class) {					
							XendraTable table = (XendraTable) ap;
							if (table.TableName().startsWith("T_"))
								continue;
							if (!table.IsView())
							{
								ResultSet rs = md.getTables(catalog, schema, table.TableName().toLowerCase(), new String[] {"TABLE"});
								if (!rs.next())
								{
									throw new Exception(String.format("table %s not found", table.TableName()));
								}								
								X_AD_Table dbtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "tablename = ?", null)
										.setParameters(table.TableName()).first();
								if (dbtable == null || dbtable.getSynchronized() == null)
								{
									throw new Exception(String.format("table %s out of sync", table.TableName()));									
								}
								Timestamp synchro = Timestamp.valueOf(table.Synchronized());
								if (synchro.compareTo(dbtable.getSynchronized()) > 0)
								{
									throw new Exception(String.format("TABLE %s", table.TableName()));
								}
							}
							table = null;
						}						
					}
				}
			}
			serializables.clear();
			serializables = null;
			Hashtable srcoperators = new Hashtable();
			PreparedStatement pstmt = DB.prepareStatement(Querys.GETOPERATORS, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Hashtable props = Util.getProperties(rs.getString(X_AD_Operator.COLUMNNAME_Description));
				Iterator keys = props.keySet().iterator();
				String id = "";
				Timestamp sync = null;
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (key.equals(X_AD_Function.COLUMNNAME_Identifier))
						id = (String) value;
					else if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
						sync = (Timestamp) value;
				}
				if (id != null && sync != null)
				{
					if (!srcoperators.containsKey(id))
						srcoperators.put(id, sync);
				}
			}
			int opercnt = 0;
			operators = new HashSet<Class<?>>();
			scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.operator").andStore(
							thoseAnnotatedWith(XendraOperator.class).into(operators));
				}
			});					
			it = operators.iterator();
			while (it.hasNext())
			{			
				Object viewclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) viewclass).getName());				
				XendraOperator ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraOperator.class);
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
				if (srcoperators.containsKey(ref.Identifier()))
				{
					if (srcoperators.get(ref.Identifier()).equals(srcsynchro))
						opercnt++;
				}
			}
			if (opercnt != operators.size())
			{
				//log.log(Level.WARNING, String.format("numbers of operators don't match %d != %d", opercnt, operators.size()));
				//throw new Exception(String.format("numbers of operators don't match %d != %d", opercnt, operators.size()));
				throw new Exception("operator");
			}
			//
			Hashtable srcviews = new Hashtable();
			pstmt = DB.prepareStatement(Querys.GETVIEWS, null);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				Hashtable props = Util.getProperties(rs.getString("comment"));
				Iterator keys = props.keySet().iterator();
				String id = "";
				Timestamp sync = null;
				while (keys.hasNext())
				{
					String key = (String) keys.next();
					Object value = props.get(key);
					if (key.equals(X_AD_View.COLUMNNAME_Identifier))
						id = (String) value;
					else if (key.equals(X_AD_View.COLUMNNAME_Synchronized))
						sync = (Timestamp) value;
				}
				if (id != null && sync != null)
				{
					if (!srcviews.containsKey(id))
						srcviews.put(id, sync);
				}
			}
			int  viewcnt = 0;

			views = new HashSet<Class<?>>();
			scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.view").andStore(
							thoseAnnotatedWith(XendraView.class).into(views));
				}
			});					
			it = views.iterator();
			while (it.hasNext())
			{			
				Object viewclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) viewclass).getName());				
				XendraView ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraView.class);
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
				if (srcviews.containsKey(ref.Identifier()))
				{
					if (srcviews.get(ref.Identifier()).equals(srcsynchro))
						viewcnt++;
					else {
						throw new Exception(String.format("VIEW %s", ref.Name()));
					}

				}				
				else {
					throw new Exception(String.format("VIEW %s", ref.Name()));
				}
			}
			if (viewcnt != views.size())
				throw new Exception();
			views = null;
			Hashtable srcfunctions = new Hashtable();
			pstmt = DB.prepareStatement(Querys.GETFUNCTIONS, null);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				Hashtable props = Util.getProperties(rs.getString("comments"));
				Iterator keys = props.keySet().iterator();
				String id = "";
				Timestamp sync = null;
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (key.equals(X_AD_Function.COLUMNNAME_Identifier))
					{
						id = (String) value;
					}
					else if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
						sync = (Timestamp) value;
				}
				if (id != null && sync != null)
				{
					if (!srcfunctions.containsKey(id))
						srcfunctions.put(id, sync);
				}
			}
			int funccnt = 0;

			functions = new HashSet<Class<?>>();
			scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.function").andStore(
							thoseAnnotatedWith(XendraFunction.class).into(functions));
				}
			});					
			it = functions.iterator();
			while (it.hasNext())
			{
				Object processclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) processclass).getName());
				XendraFunction ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraFunction.class);
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
				if (srcfunctions.containsKey(ref.Identifier()))
				{
					if (srcfunctions.get(ref.Identifier()).equals(srcsynchro))
						funccnt++;
					else						
						throw new Exception(String.format("FUNCTION %s", ref.Name()));
				}
				else {
					throw new Exception(String.format("FUNCTION %s", ref.Name()));
				}
			}					
			if (funccnt != functions.size())
				throw new Exception();
			functions = null;

			// processes
			processes = new HashSet<Class<?>>();
			scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.xendra.process").andStore(thoseAnnotatedWith(XendraProcess.class).into(processes));
				}
			});					
			it = processes.iterator();
			while (it.hasNext()) {
				Class<?> clazz = (Class<?>) it.next();
				String classname = clazz.getName();				
				XendraProcess proc = null;
				boolean goahead = true;
				Annotation[] annots = clazz.getAnnotations();
				if (annots.length == 0) {
					goahead = false;
				} else {				
					for (Annotation annot:annots) {
						if (annot instanceof Deprecated) {
							goahead = false;
							break;
						} else if (annot.annotationType() == XendraProcess.class) {
							proc = (XendraProcess) annot;
						}
					}
				}
				if (goahead && proc != null) {
					Timestamp srcsynchro = Timestamp.valueOf(proc.updated());
					MProcess process = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
							.setParameters(classname).first();
					if (process == null) 
						throw new Exception(String.format("PROCESS %s", classname));
					else if (process.getSynchronized() == null) {						
						throw new Exception(String.format("PROCESS %s", classname));
					} else if (process.getSynchronized().compareTo(srcsynchro) != 0) {
						throw new Exception(String.format("PROCESS %s", classname));
					}
				}
			}
			processes = null;
			//	Migration
			MSystem system = MSystem.get(Env.getCtx());
			if (system != null && system.isJustMigrated())
			{
				log.log(Level.WARNING, "System is Just migrated ");
				if (!DB.afterMigration(Env.getCtx()))
					throw new Exception();
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
			log.log(Level.WARNING, e.getMessage());
			error = e.getMessage();
		}
		//rotdash.stop();
		return error;
	}

	public void checkReferences() {
		if (m_checkReferences) {
			DB.executeUpdate("Update AD_Reference set synchronized = null", null);
		}
		ComponentScanner scanner = new ComponentScanner();	
		listreferences = scanner.getClasses(	new ComponentQuery() 
		{
			protected void query() {
				select().from("org.compiere.model.reference").returning(all());
			}
		});				
		scanner = null;
		Iterator it = listreferences.iterator();
		float i = 1;
		float rows = listreferences.size(); 
		while (it.hasNext())
		{	
			try {
				Class<?> clazzref = Class.forName(((Class) it.next()).getName());
				if (bar != null) {
					label.setText(clazzref.getName());
					float p = (i / rows) * 100;
					bar.setValue((int) p);
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}																		
				}
				XendraRef ref = null;
				ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraRef.class);
				references.put(ref.Identifier(), clazzref.getSimpleName());
				Integer referenceid = Integer.valueOf(ref.AD_Reference_ID());
				if (ref.ValidationType().equals(REF_AD_ReferenceValidationTypes.DataType))
				{
					AddExtension(ref.Extension());
					X_AD_Reference adref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, " AD_Reference_ID = ? ", null)
							.setParameters(referenceid).first();
					if (adref == null)
					{					
						adref = new X_AD_Reference(Env.getCtx(), 0, null);
						adref.setAD_Reference_ID(referenceid);
						UpdateReference(adref, ref);
						adref.save();
					}
				}
				else 
				{
					boolean updatetable = false;
					X_AD_Reference adref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier = ? ", null)
							.setParameters(ref.Identifier()).first();
					if (adref == null) {
						updatetable = true;				
					} else {
						Timestamp synchref = null;
						try {
							if (adref.getSynchronized() == null)
								updatetable = true;
							else
							{
								synchref = Timestamp.valueOf(ref.Synchronized());						
								Calendar calref = Calendar.getInstance();
								calref.setTime(synchref);
								calref.set(Calendar.MILLISECOND, 0);																		
								if (calref.getTime().compareTo(adref.getSynchronized()) > 0)
									updatetable = true;
							}
						}
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
					if (updatetable)
					{
						UpdateReference(ref.Identifier());
					}	
					adref = null;
				}
			}
			catch (Exception e) {
				continue;
			}
			finally {
				i++;
			}
		} 	
		listreferences.clear();		
		listreferences = null;
	}

	public void checksequences() {
		if (!IsModeServer()) {
			label.setText(String.format("checking sequences..."));
		}
		serializables = new HashSet<Class<? extends PO>>();
		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(	new ComponentQuery() 
		{
			protected void query() {
				select().from("org.compiere.model.persistence").andStore(thoseExtending(PO.class).into(serializables));
			}
		}		
				);					
		Iterator it = serializables.iterator();
		float i = 0;
		float rows = serializables.size();
		while (it.hasNext())
		{	
			Class<?> clazz = (Class<?>) it.next();
			for (Field f:clazz.getDeclaredFields()) {
				for (Annotation ap: f.getAnnotations()) {					
					if (ap.annotationType() == XendraTable.class) {
						XendraTable table = (XendraTable) ap;						
						MColumn column = new Query(Env.getCtx(),X_AD_Column.Table_Name, "IsKey = 'Y' AND AD_Table_ID = (Select AD_Table_ID from AD_Table where Tablename = ? )", null)
								.setParameters(table.TableName()).first();
						if (column != null && column.getColumnName().startsWith(table.TableName())) {
							if (bar != null) {							
								label.setText(String.format("validando secuencia de %s (%s)", table.TableName(), table.Name()));
								float p = (i / rows) * 100;								
								bar.setValue((int) p);
								try {
									gui.updateScreen();
								} catch (IOException e2) {
									e2.printStackTrace();
								}													
							}																								
							CConnection.get().getDatabase().checkSequence(table.TableName(), null);	
						}
					}	
				}
			}
			i++;
		}		
	}

	public void checkIdentifiers() {
		List<String> listMasters = new ArrayList<String>();
		listMasters.add(X_M_InOutLine.Table_Name);
		listMasters.add(X_M_InventoryLine.Table_Name);
		listMasters.add(X_C_InvoiceLine.Table_Name);
		listMasters.add(X_M_ProductionLine.Table_Name);
		listMasters.add(X_AD_User.Table_Name);
		listMasters.add(X_AD_Role.Table_Name);
		listMasters.add(X_C_BPartner.Table_Name);
		listMasters.add(X_M_Product.Table_Name);
		listMasters.add(X_AD_User.Table_Name);
		listMasters.add(X_M_AttributeSetInstance.Table_Name);
		listMasters.add(X_C_UOM.Table_Name);
		listMasters.add(X_C_Tax.Table_Name);
		listMasters.add(X_C_DocType.Table_Name);
		listMasters.add(X_C_PaymentTerm.Table_Name);
		listMasters.add(X_C_Currency.Table_Name);
		listMasters.add(X_C_BPartner_Location.Table_Name);
		float i = 1;
		float rows = listMasters.size();
		for (String master:listMasters) {
			if (bar != null) {
				label.setText(String.format("check identifier %s",master));
				float p = (i / rows) * 100;
				bar.setValue((int) p);
				try {
					gui.updateScreen();
				} catch (IOException e2) {
					e2.printStackTrace();
				}																		
			}							
			int no = DB.getSQLValue(null, String.format("SELECT COUNT(*) FROM %s GROUP BY IDENTIFIER ORDER BY 1 DESC LIMIT 1", master));
			while (no > 1) {
				String id = DB.getSQLValueString(null, String.format("SELECT IDENTIFIER,count(*) from %s GROUP BY IDENTIFIER ORDER BY 2 DESC LIMIT 1", master));
				DB.executeUpdate(String.format("UPDATE %s set identifier = getuuid() where identifier = '%s'", master, id), null);
				no = DB.getSQLValue(null, String.format("SELECT COUNT(*) FROM %s GROUP BY IDENTIFIER ORDER BY 1 DESC LIMIT 1", master));
			}
			i++;
		}
	}
	public void checkvalrule() {
		ComponentScanner scanner = new ComponentScanner();	
		listvalrules = scanner.getClasses(	new ComponentQuery() 
		{
			protected void query() {
				select().from("org.compiere.model.valrule").returning(all());
			}
		});		
		scanner = null;
		float i = 1;
		float rows = listvalrules.size(); 				
		Iterator it = listvalrules.iterator();
		while (it.hasNext())
		{
			try {				
				Object processclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) processclass).getName());
				if (bar != null) {
					label.setText(clazzref.getName());
					float p = (i / rows) * 100;
					bar.setValue((int) p);
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}																		
				}				
				XendraValRule ref = null;
				ref = clazzref.getField(X_AD_Val_Rule.COLUMNNAME_Identifier).getAnnotation(XendraValRule.class);
				valrules.put(ref.Identifier(), clazzref.getSimpleName());
				Integer valruleid = Integer.valueOf(ref.AD_Val_Rule_ID());
				String valrulerefid = ref.Identifier();
				X_AD_Val_Rule adref = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, " Identifier = ? ", null)
						.setParameters(valrulerefid).first();
				if (adref == null)
				{
					adref = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, " AD_Val_Rule_ID = ? ", null)
							.setParameters(valruleid).first();
					if (adref != null)
					{
						adref.setIdentifier(valrulerefid);
						adref.save();
					}
				}
				if (adref == null)
				{					
					adref = new X_AD_Val_Rule(Env.getCtx(), 0, null);
					adref.setAD_Val_Rule_ID(valruleid);
					adref.setDescription(ref.Description());
					adref.setType(ref.Type());
					adref.setEntityType(ref.EntityType());
					adref.setIdentifier(ref.Identifier());
					Method getCode = clazzref.getMethod("getCode", null);
					String code = (String) getCode.invoke(null, null);								
					adref.setCode(code);
					adref.setName(ref.Name());
					adref.save();
				}
			}
			catch (Exception e) {
				continue;
			}			
			finally {
				i++;
			}
		}
		listvalrules.clear();
		listvalrules = null;
	}


	public void UpdateTable() throws Exception {
		boolean ok = false;
		Class<?> clazz = null;
		while (!ok)
		{
			try {				
				POInfo.remove(X_AD_Package.Table_ID);
				clazz = Class.forName(X_AD_Package.class.getName());
				UpdateStructure(clazz);

				POInfo.remove(X_AD_Index.Table_ID);
				clazz = Class.forName(X_AD_Index.class.getName());
				UpdateStructure(clazz);
				//
				POInfo.remove(X_AD_Element.Table_ID);
				clazz = Class.forName(X_AD_Element.class.getName());
				UpdateStructure(clazz);				
				//
				POInfo.remove(X_AD_Reference.Table_ID);
				clazz = Class.forName(X_AD_Reference.class.getName());
				UpdateStructure(clazz);
				//
				POInfo.remove(X_AD_Menu.Table_ID);
				clazz = Class.forName(X_AD_Menu.class.getName());
				UpdateStructure(clazz);
				//
				POInfo.remove(X_AD_TreeNodeMM.Table_ID);
				clazz = Class.forName(X_AD_TreeNodeMM.class.getName());				
				UpdateStructure(clazz);
				//
				POInfo.remove(X_AD_Ref_Table.Table_ID);
				clazz = Class.forName(X_AD_Ref_Table.class.getName());
				UpdateStructure(clazz);
				//
				POInfo.remove(X_AD_Ref_List.Table_ID);
				clazz = Class.forName(X_AD_Ref_List.class.getName());
				UpdateStructure(clazz);
				//
				POInfo.remove(X_AD_Table.Table_ID);
				clazz = Class.forName(X_AD_Table.class.getName());
				UpdateStructure(clazz);
				//
				POInfo.remove(X_AD_Column.Table_ID);
				clazz = Class.forName(X_AD_Column.class.getName());
				UpdateStructure(clazz);	

				POInfo.remove(X_AD_Process.Table_ID);
				clazz = Class.forName(X_AD_Process.class.getName());
				UpdateStructure(clazz);

				POInfo.remove(X_AD_Val_Rule.Table_ID);
				clazz = Class.forName(X_AD_Val_Rule.class.getName());
				UpdateStructure(clazz);				
				ok = true;
			}
			catch (Exception e)
			{
				e.printStackTrace();
				ok = false;
			}
		}
		serializables = new HashSet<Class<? extends PO>>();
		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(	new ComponentQuery() 
		{
			protected void query() {
				select().from("org.compiere.model.persistence").andStore(thoseExtending(PO.class).into(serializables))
				.returning(all());
			}
		}		
				);					
		Iterator it = serializables.iterator();
		List<String> objects = new ArrayList<String>();
		while (it.hasNext())
		{			
    			Object processclass = it.next();								
 			objects.add(((Class) processclass).getName());			
		}	
		ClazzProcessed.clear();
		serializables.clear();
		serializables = null;
		Collections.sort(objects);
		float i = 1f;
		float rows = objects.size();
		for (String classname:objects)
		{
			clazz = Class.forName(classname);
			if (!ClazzProcessed.contains(clazz.getSimpleName()))
			{
				if (pbar != null) {
					float p = (i / rows) * 100;
					System.out.println(p);
					checklabel.setText(clazz.getName());					
					pbar.setValue((int) p);					
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}													
				}				
				if (CheckAndUpdate(clazz))
				{
					ClazzProcessed.add(clazz.getSimpleName());
				}
			}
			i++;
		}		
		if (IsModeServer()) 
			log.log(Level.WARNING, String.format("%d PO Objects", objects.size()));
		else 
			addLine(String.format("%d PO Objects", objects.size()));		
	}

	void UpdateStructure(Class<?> clazz) throws Exception {
		boolean updatetable = false;
		XendraTable table = null;
		List<XendraColumn> columns = null;
		String tblname = (String) clazz.getField("Table_Name").get(clazz);		
		MTable dbtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "tablename = ?", null).setParameters(tblname).first();
		if (dbtable == null)
		{
			updatetable = true;
		}
		else if (dbtable.get_ColumnIndex(X_AD_Table.COLUMNNAME_Identifier) < 0)
		{
			updatetable = true;
		}
		if (!updatetable)
		{
			// exist the table in the database?
			String tableexists = String.format("SELECT count(*) FROM information_schema.tables WHERE  table_schema = 'xendra' AND table_name = '%s'", tblname.toLowerCase());
			int no = DB.getSQLValue(null, tableexists);
			if (no == 0)
			{
				updatetable = true;
			}
		}		
		for (Field f:clazz.getDeclaredFields())
		{
			for (Annotation ap: f.getAnnotations()) {					
				if (ap.annotationType() == XendraTable.class) {					
					table = (XendraTable) ap;					
					if (!updatetable)
					{
						if (dbtable.getSynchronized() == null)
							updatetable = true;
						if (dbtable.getIdentifier().compareTo(table.Identifier()) != 0)
							updatetable = true;
						if (dbtable.getSynchronized() != null)
						{
							Timestamp adsynchro = null;
							try {
								adsynchro = Timestamp.valueOf(table.Synchronized());
								if (adsynchro.compareTo(dbtable.getSynchronized()) > 0)
									updatetable = true;
							}
							catch (Exception e)
							{
								e.printStackTrace();
							}
						}
					}
					if (!updatetable) {
						String pkgid = "";
						String pluginid = "";
						try {
							pkgid = table.AD_Package_ID();
							pluginid = table.AD_Plugin_ID();;
						} catch (Exception e) {
							throw new Exception (String.format("%s error pe", table.TableName()));
						}
						int AD_Package_ID = 0;
						int AD_Plugin_ID = 0;
						X_AD_Plugin plg = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "Identifier = ?", null)
								.setParameters(pluginid).first();
						if (plg != null) 
							AD_Plugin_ID = plg.getAD_Plugin_ID();
						X_AD_Package pkg = new Query(Env.getCtx(), X_AD_Package.Table_Name, "Identifier = ?", null)
								.setParameters(pkgid).first();
						if (pkg != null)
							AD_Package_ID = pkg.getAD_Package_ID();
						if (AD_Plugin_ID > 0 && dbtable.getAD_Plugin_ID() != AD_Plugin_ID) {
							updatetable = true;
						}
						if (AD_Package_ID > 0 && dbtable.getAD_Package_ID() != AD_Package_ID) {
							updatetable = true;
						}		
					}					
				}
				else if (ap.annotationType() == XendraColumn.class) {
					XendraColumn column = (XendraColumn) ap;
					if (columns == null)
						columns = new ArrayList<XendraColumn>();
					columns.add(column);
				}
			}
		}
		if (updatetable)
		{
			if (IsModeServer()) 
				log.log(Level.WARNING, String.format("Create/Update %s ",table.Name()));
			else
				addLine(String.format("Create/Update %s ",table.Name()));
			if (dbtable == null)
				dbtable = new MTable(Env.getCtx(), 0, null);
			dbtable.setName(table.Name());
			dbtable.setTableName(table.TableName());
			dbtable.setDescription(table.Description());
			dbtable.setID(table.ID());
			dbtable.setHelp(table.Help());
			dbtable.setAccessLevel(table.AccessLevel());
			X_AD_Val_Rule TableValRuleID = UpdateValRule(table.AD_Val_Rule_ID());
			if (TableValRuleID != null)
				dbtable.setAD_Val_Rule_ID(TableValRuleID.getAD_Val_Rule_ID());
			dbtable.setLoadSeq(table.LoadSeq());
			dbtable.setIsSecurityEnabled(table.IsSecurityEnabled());
			dbtable.setIsDeleteable(table.IsDeleteable());
			dbtable.setIsHighVolume(table.IsHighVolume());
			dbtable.setIsView(table.IsView());
			dbtable.setIsChangeLog(table.IsChangeLog());
			dbtable.setIdentifier(table.Identifier());
			dbtable.setIsReplicated(false);
			dbtable.setSynchronized(Timestamp.valueOf(table.Synchronized()));
			if (dbtable.save())
			{
				dbtable.checkdefaults(table.IsKey());
				if (columns == null)
				{				
					if (IsModeServer())
						log.log(Level.WARNING, String.format("%s don't have defined columns",table.Name()));
					else
						addLine(String.format("%s don't have defined columns",table.Name()));
				}
				else
				{
					for (XendraColumn column:columns)
					{
						Boolean update = true;
						X_AD_Element element = UpdateElement(column.AD_Element_ID(), column.ColumnName());
						X_AD_Reference referenceValueID = UpdateReference(column.AD_Reference_Value_ID());
						X_AD_Val_Rule ValRuleID = UpdateValRule(column.AD_Val_Rule_ID());									
						Timestamp srcsynchro = Timestamp.valueOf(column.Synchronized());
						int AD_Process_ID = 0;
						X_AD_Column dbcolumn = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
								.setParameters(column.Identifier()).first();
						if (dbcolumn == null && dbtable != null)
						{
							try {
								dbcolumn = new Query(Env.getCtx(), X_AD_Column.Table_Name, "ColumnName = ? AND AD_Table_ID = ? ", null)
										.setParameters(element.getColumnName(), dbtable.getAD_Table_ID()).first();
								if (dbcolumn != null)
								{
									dbcolumn.setIdentifier(column.Identifier());
									dbcolumn.setSynchronized(null);
									dbcolumn.save();
								}
							}
							catch (Exception e)
							{
								e.printStackTrace();
							}
						}
						if (dbcolumn != null && dbcolumn.getSynchronized() != null)
						{
							if (dbcolumn.getSynchronized().compareTo(srcsynchro) >= 0)
								update = false;
						}
						if (update)
						{
							if (dbcolumn == null)
							{
								dbcolumn = new X_AD_Column(Env.getCtx(), 0, null);						
							}			
							if (column.AD_Process_ID().length() > 0)
							{
								X_AD_Process dbprocess = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
										.setParameters(column.AD_Process_ID()).first();
								if (dbprocess != null)
									AD_Process_ID = dbprocess.getAD_Process_ID();
								else
								{
									columnpendings.add(element.getColumnName());
								}
							}			
							dbcolumn.setAD_Table_ID(dbtable.getAD_Table_ID());
							dbcolumn.setName(element.getName());
							dbcolumn.setColumnName(element.getColumnName());
							dbcolumn.setDescription(element.getDescription());
							dbcolumn.setHelp(element.getHelp());
							dbcolumn.setEntityType(element.getEntityType());
							dbcolumn.setIdentifier(column.Identifier());					
							dbcolumn.setAD_Element_ID(element.getAD_Element_ID());
							dbcolumn.setAD_Reference_ID(column.AD_Reference_ID());
							if (referenceValueID != null)
								dbcolumn.setAD_Reference_Value_ID(referenceValueID.getAD_Reference_ID());
							if (ValRuleID != null)
								dbcolumn.setAD_Val_Rule_ID(ValRuleID.getAD_Val_Rule_ID());
							dbcolumn.setFieldLength(column.FieldLength());
							dbcolumn.setDefaultValue(column.DefaultValue());
							dbcolumn.setIsKey(column.IsKey());							
							dbcolumn.setIsParent(column.IsParent());
							dbcolumn.setIsInternal(column.IsInternal());
							dbcolumn.setIsMandatory(column.IsMandatory());
							dbcolumn.setIsUpdateable(column.IsUpdateable());
							dbcolumn.setReadOnlyLogic(column.ReadOnlyLogic());
							dbcolumn.setIsIdentifier(column.IsIdentifier());
							dbcolumn.setSeqNo(column.SeqNo());
							dbcolumn.setIsTranslated(column.IsTranslated());
							dbcolumn.setCallout(column.Callout());
							dbcolumn.setVFormat(column.VFormat());
							dbcolumn.setValueMin(column.ValueMin());
							dbcolumn.setValueMax(column.ValueMax());
							dbcolumn.setVersion(new BigDecimal(column.Version()));
							dbcolumn.setIsSelectionColumn(column.IsSelectionColumn());
							if (AD_Process_ID > 0)
							{
								dbcolumn.setAD_Process_ID(AD_Process_ID);
							}
							dbcolumn.setIsAlwaysUpdateable(column.IsAlwaysUpdateable());
							dbcolumn.setColumnSQL(column.ColumnSQL());
							dbcolumn.setIsAllowLogging(column.IsAllowLogging());
							dbcolumn.setIdentifier(column.Identifier());
							dbcolumn.setSynchronized(srcsynchro);
							dbcolumn.save();
						}
					}
				}
				MColumn[] tablecolumns = dbtable.getColumns(true);
				for (MColumn column:tablecolumns)
				{
					List<String> sqlcommands = new ArrayList<String>();
					Boolean existcolumn = false;
					int noColumns = 0;				
					String sql = null;
					ResultSet rs = md.getColumns(catalog, schema, dbtable.getTableName().toLowerCase(), null);
					while (rs.next())
					{
						noColumns++;
						String columnName = rs.getString("COLUMN_NAME");
						if (!columnName.equalsIgnoreCase(column.getColumnName()))
						{
							continue;
						}
						existcolumn = true;
						break;
					}
					rs.close();
					rs = null;
					if (!existcolumn || noColumns == 0)
					{
						if (noColumns == 0)
						{
							rs = md.getTables(catalog, schema, dbtable.getTableName().toLowerCase(), new String[] {"TABLE"});
							if (!rs.next())
							{
								sql = dbtable.getSQLCreate();
								if (sql != null)
									sqlcommands.add(sql);
							}
							else
							{
								sql = column.getSQLAdd(dbtable);
								if (sql != null)
									sqlcommands.add(sql);
							}	
						}
						else 
						{
							sql = column.getSQLAdd(dbtable);
							if (sql != null)
								sqlcommands.add(sql);	
						}
					}
					if (sqlcommands.size() > 0)
					{
						try {
							while (sqlcommands.size() > 0)
							{
								String sqlcommand = sqlcommands.get(0);
								if (sqlcommand.indexOf(DB.SQLSTATEMENT_SEPARATOR) == -1)
								{
									AddPoint();
									String error = Util.processSQL(sqlcommand);
									if (error.length() > 0) {
										if (IsModeServer())											
											System.out.println(error);
										else
											addLine(error);
									}
								}
								else
								{
									String statements[] = sqlcommand.split(DB.SQLSTATEMENT_SEPARATOR);
									for (String statement:statements)
									{
										AddPoint();
										String error = Util.processSQL(statement);
										if (error.length() > 0)
											if (IsModeServer())
												System.out.println(error);
											else
												addLine(error);

									}
								}
								sqlcommands.remove(0);
							}
						}
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
				POInfo.remove(dbtable.Table_ID);
			}
		}		
	}

	private void AddPoint() {
		if (IsModeServer())
			System.out.print(".");
		else {
			String currenttext = logs.getText();
			currenttext += ".";
			logs.setText(currenttext);																				
		}		
	}

	public X_AD_Element UpdateElement(String Identifier, String ColumnName) {
		if (Identifier == null)
			return null;
		if (Identifier.length() == 0)
			return null;
		X_AD_Element adelement = null;
		try {
			boolean update = true;
			if (elements.size() == 0)
			{				
				ComponentScanner scanner = new ComponentScanner();	
				Set<Class<?>>  listelements = scanner.getClasses(	new ComponentQuery()
				{
					protected void query() {
						select().from("org.compiere.model.element").returning(all());
					}
				});	
				Iterator it = listelements.iterator();
				while (it.hasNext())					
				{
					Class<?> clazzref = null;
					try {
						Object processclass = it.next();					
						clazzref = Class.forName(((Class) processclass).getName());
						XendraElement ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraElement.class);
						elements.put(ref.Identifier(), clazzref.getSimpleName());
					} catch (Exception e) {								
						continue;
					}
				}								
			}
			if (ColumnName != null)
			{
				try {
					adelement = new Query(Env.getCtx(), X_AD_Element.Table_Name, "ColumnName = ?", null).setParameters(ColumnName).first();
				} catch (Exception e) {}
			}			
			if (adelement == null && elements.get(Identifier) != null)
			{
				Class<?> clazzele = Class.forName(String.format("org.compiere.model.element.%s",(String) elements.get(Identifier)));
				XendraElement element = clazzele.getField(X_AD_Element.COLUMNNAME_Identifier).getAnnotation(XendraElement.class);
				Timestamp srcsynchro = Timestamp.valueOf(element.Synchronized());
				adelement = new Query(Env.getCtx(), X_AD_Element.Table_Name, "Identifier = ?", null)
						.setParameters(Identifier).first();
				if (adelement == null)
				{
					adelement = new Query(Env.getCtx(), X_AD_Element.Table_Name, "ColumnName = ? AND Name = ?", null)
							.setParameters(element.ColumnName(), element.Name()).first();
					if (adelement == null)
					{
						adelement = new Query(Env.getCtx(), X_AD_Element.Table_Name, "ColumnName = ?", null)
								.setParameters(element.ColumnName()).first();	
						if (adelement != null)
						{
							adelement.setName(element.Name());
							adelement.setSynchronized(null);
							adelement.save();
						}
					}
					if (adelement != null)
					{
						adelement.setIdentifier(Identifier);
						adelement.setSynchronized(null);
						adelement.save();
					}
				}
				if (adelement != null && adelement.getSynchronized() != null)
				{				
					if (srcsynchro.compareTo(adelement.getSynchronized()) <= 0)
						update = false;						
				}
				if (update)
				{
					if (adelement == null)
					{
						adelement = new X_AD_Element(Env.getCtx(), 0, null);
						adelement.setIdentifier(element.Identifier());
					}	
					adelement.setName(element.Name());
					adelement.setColumnName(element.ColumnName());
					adelement.setEntityType(element.EntityType());
					adelement.setPrintName(element.PrintName());
					adelement.setDescription(element.Description());
					adelement.setHelp(element.Help());
					adelement.setPO_Name(element.PO_Name());
					adelement.setPO_Description(element.PO_Description());
					adelement.setPO_Help(element.PO_Help());
					adelement.setPO_PrintName(element.PO_PrintName());
					adelement.setSynchronized(srcsynchro);
					adelement.save();
				}
			}
			else if (adelement == null)
			{
				adelement = new M_Element(Env.getCtx(), 0, null);		
				adelement.setName(ColumnName);
				adelement.setDescription(ColumnName);
				adelement.setHelp(ColumnName);
				adelement.setColumnName (ColumnName);
				adelement.setPrintName(ColumnName);
				adelement.save();				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return adelement;
	}

	public static void UpdateReference(X_AD_Reference adreference, XendraRef ref) {
		Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
		adreference.setName(ref.Name());
		adreference.setValidationType(ref.ValidationType());
		adreference.setDescription(ref.Description());
		adreference.setHelp(ref.Help());
		adreference.setVFormat(ref.VFormat());
		adreference.setEntityType(ref.EntityType());
		adreference.setSynchronized(srcsynchro);
		adreference.setExtension(ref.Extension());
		adreference.setIsOrderByValue(ref.IsOrderByValue());
		adreference.setIdentifier(ref.Identifier());
	}

	public X_AD_Reference UpdateReference(String Identifier) {
		if (Identifier == null)
			return null;
		if (Identifier.length() == 0)
			return null;
		X_AD_Reference adreference = null;
		try {
			boolean update = true;
			Class<?> clazzref  = null;
			try {
				clazzref = Class.forName(String.format("org.compiere.model.reference.%s",(String) references.get(Identifier)));
			} catch (Exception e) {
				if (IsModeServer()) 
					log.log(Level.SEVERE, String.format("reference search by identifier %s not found",Identifier));
				//e.printStackTrace();					
				else
					this.addLine(String.format("reference search by identifier %s not found",Identifier));
			}
			XendraRef ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraRef.class);
			Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
			try {
				adreference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier = ?", null)
						.setParameters(Identifier).first();
			}
			catch (Exception e) {};
			if (adreference == null)
			{
				try {
					adreference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Name = ?", null)
							.setParameters(ref.Name()).first();
				}
				catch (Exception e) {};
				if (adreference != null)
				{
					adreference.setIdentifier(Identifier);
					adreference.setSynchronized(null);
					adreference.save();
				}
			}
			if (adreference != null && adreference.getSynchronized() != null)
			{
				if (srcsynchro.compareTo(adreference.getSynchronized()) <= 0)
					update = false;
			}
			if (update)
			{
				if (adreference == null)
				{
					adreference = new X_AD_Reference(Env.getCtx(), 0, null);					
				}
				UpdateReference(adreference, ref);
				if (adreference.save())
				{
					if (adreference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
					{
						for (Field f:clazzref.getDeclaredFields())
						{
							for (Annotation ap: f.getAnnotations()) {					
								if (ap.annotationType() == XendraRefItem.class) {
									XendraRefItem ri = (XendraRefItem) ap;									
									X_AD_Ref_List reflist = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "Identifier = ? ", null)
											.setParameters(ri.Identifier()).first();									
									if (reflist == null)
									{
										reflist = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "Value = ? AND AD_Reference_ID = ?", null)
												.setParameters(ri.Value(), adreference.getAD_Reference_ID()).first();
									}
									if (reflist == null)
									{
										reflist = new X_AD_Ref_List(Env.getCtx(), 0, null);										
									}
									if (IsModeServer()) 
										System.out.println(reflist.getName());
									else 
										addLine(reflist.getName());
									reflist.setAD_Reference_ID(adreference.getAD_Reference_ID());
									reflist.setValue(ri.Value());
									reflist.setName(ri.Name());
									reflist.setDescription(ri.Description());
									reflist.setIdentifier(ri.Identifier());
									reflist.save();	
									reflist = null;
								}
							}
						}
					}
					else if (adreference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
					{
						for (Field f:clazzref.getDeclaredFields())
						{
							for (Annotation ap: f.getAnnotations()) {
								if (ap.annotationType().equals(XendraRefTable.class)) {
									XendraRefTable ri = (XendraRefTable) ap;
									MTable table = MTable.get(Env.getCtx(), ri.TableRef());
									if (table == null) 
										continue;									
									int columnkey = MColumn.getColumn_ID(table.getTableName(), ri.KeyRef(), null);
									if (columnkey <= 0) 
										continue;									
									int columndisplay = MColumn.getColumn_ID(table.getTableName(), ri.DisplayRef(), null);
									if (columnkey <= 0) 
										continue;									
									X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
											.setParameters(adreference.getAD_Reference_ID()).first();
									if (reftable != null) {
										if (columnkey != reftable.getAD_Key() || 
												columndisplay != reftable.getAD_Display() || 
												reftable.getAD_Table_ID() != table.getAD_Table_ID()) {
											reftable = null;
										} 
									}
									if (reftable == null) {
										reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "Identifier = ?", null)
												.setParameters(ri.Identifier()).first();
										if (reftable == null)
										{
											//if (table != null && columnkey > 0) {
											reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Table_ID = ? AND AD_Key = ?", null)
													.setParameters(table.getAD_Table_ID(), columnkey).first();
											//}
											if (reftable != null && reftable.getAD_Reference_ID() != adreference.getAD_Reference_ID())
											{
												X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
														.setParameters(reftable.getAD_Reference_ID()).first();
												if (reference != null) {
													if (!reference.getName().equals(adreference.getName())) {
														reftable = null;
													}
												}
												else {
													reftable = null;
												}											
											}
										}
									}
									if (reftable == null)
									{
										reftable = new X_AD_Ref_Table (Env.getCtx(), 0, null);											
									}										
									reftable.setAD_Reference_ID(adreference.getAD_Reference_ID());
									reftable.setAD_Table_ID(table.getAD_Table_ID());
									reftable.setAD_Key(columnkey);
									reftable.setAD_Display(columndisplay);
									reftable.setIsValueDisplayed(ri.IsValueDisplayed());
									reftable.setWhereClause(ri.WhereClause());
									reftable.setOrderByClause(ri.OrderByClause());
									reftable.setIdentifier(ri.Identifier());
									if (!reftable.save()) {
										//System.out.println("X");
									}
								}
							}
						}
					}
				}
			}
			return adreference;
		}
		catch (Exception e)
		{
			if (!IsModeServer()) {
				addLine(e.getMessage());
			}
			//e.printStackTrace();
		}
		return null;
	}

	private X_AD_Val_Rule UpdateValRule(String Identifier) {
		if (Identifier == null)
			return null;
		if (Identifier.length() == 0)
			return null;
		X_AD_Val_Rule rule = null;
		try {
			boolean update = true;
			Class<?> clazzvalref = Class.forName(String.format("org.compiere.model.valrule.%s",(String) valrules.get(Identifier)));
			XendraValRule valref = clazzvalref.getField(X_AD_Val_Rule.COLUMNNAME_Identifier).getAnnotation(XendraValRule.class);
			Method getCode = clazzvalref.getMethod("getCode", null);
			String code = (String) getCode.invoke(null, null);
			Timestamp srcsynchro = Timestamp.valueOf(valref.Synchronized());
			rule = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "Identifier = ?", null)
					.setParameters(Identifier).first();
			if (rule != null && rule.getSynchronized() != null)
			{
				if (srcsynchro.compareTo(rule.getSynchronized()) <= 0)
					update = false;
			}
			if (update)
			{
				if (rule == null)
				{
					rule = new X_AD_Val_Rule(Env.getCtx(), 0, null);
				}
				rule.setName(valref.Name());
				rule.setDescription(valref.Description());
				rule.setType(valref.Type());
				rule.setEntityType(valref.EntityType());
				rule.setIdentifier(valref.Identifier());
				rule.setSynchronized(srcsynchro);
				rule.setCode(code);
				rule.save();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return rule;
	}

	private boolean CheckAndUpdate(Class<?> clazz) throws Exception {
		boolean updatetable = false;
		boolean updatetabs = false;
		boolean updateindex = false;
		boolean isnew = false;
		XendraTable table = null;
		List<XendraTab> tabs = null;
		List<XendraIndex> indexes = null;
		List<Vector> newtranslations = new ArrayList<Vector>();
		List<Vector> adindexes = new ArrayList<Vector>();
		String tblname = (String) clazz.getField("Table_Name").get(clazz);
		MTable dbtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "tablename = ?", null).setParameters(tblname).first();
		if (dbtable == null)
		{
			isnew = true;
			updatetable = true;
			updatetabs = true;
			updateindex = true;
		}
		else if (dbtable.get_ColumnIndex(X_AD_Table.COLUMNNAME_Identifier) < 0)
		{
			updatetable = true;
			updatetabs = true;
			updateindex = true;
		}
		if (!updatetable)
		{
			// exist the table in the database?
			String tableexists = String.format("SELECT count(*) FROM information_schema.tables WHERE  table_schema = 'xendra' AND table_name = '%s'", tblname.toLowerCase());
			int no = DB.getSQLValue(null, tableexists);
			if (no == 0)
			{
				updatetable = true;
				updatetabs = true;
				updateindex = true;
				isnew = true;
			}
		}
		if (!updateindex) // significa que la tabla existe y tiene identifier, asi que cargamos los indices que posea para compararlos.
		{
			PreparedStatement pstmt = null;
			ResultSet rs = null;				
			pstmt = DB.prepareStatement(Querys.GETINDEXBYTABLE, null);
			pstmt.setString(1, tblname.toLowerCase());
			rs = pstmt.executeQuery();
			String where = "";
			while (rs.next())
			{
				String name = rs.getString(X_AD_Index.COLUMNNAME_Name);					
				String column_names = rs.getString(X_AD_Index.COLUMNNAME_Column_Names);
				String comments = rs.getString(X_AD_Index.COLUMNNAME_Comments);
				Vector index = new Vector();
				index.add(name);
				index.add(column_names);
				index.add(comments);
				adindexes.add(index);
			}				
			rs.close();
			pstmt.close();
			rs = null;
			pstmt = null;
		}

		for (Field f:clazz.getDeclaredFields())
		{
			for (Annotation ap: f.getAnnotations()) {					
				if (ap.annotationType() == XendraTable.class) {					
					table = (XendraTable) ap;
					if (!updatetable)
					{
						if (dbtable.getSynchronized() == null)
							updatetable = true;
						if (dbtable.getIdentifier().compareTo(table.Identifier()) != 0)
							updatetable = true;
						String pkgid = table.AD_Package_ID();
						String pluginid = table.AD_Plugin_ID();;
						int AD_Package_ID = 0;
						int AD_Plugin_ID = 0;
						X_AD_Plugin plg = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "Identifier = ?", null)
								.setParameters(pluginid).first();
						if (plg != null) 
							AD_Plugin_ID = plg.getAD_Plugin_ID();
						X_AD_Package pkg = new Query(Env.getCtx(), X_AD_Package.Table_Name, "Identifier = ?", null)
								.setParameters(pkgid).first();
						if (pkg != null)
							AD_Package_ID = pkg.getAD_Package_ID();
						if (AD_Plugin_ID > 0 && dbtable.getAD_Plugin_ID() != AD_Plugin_ID) {
							updatetable = true;
						}
						if (AD_Package_ID > 0 && dbtable.getAD_Package_ID() != AD_Package_ID) {
							updatetable = true;
						}
						if (dbtable.getSynchronized() != null)
						{
							Timestamp adsynchro = null;
							try {
								adsynchro = Timestamp.valueOf(table.Synchronized());
								if (adsynchro.compareTo(dbtable.getSynchronized()) > 0)
									updatetable = true;
							}
							catch (Exception e)
							{
								e.printStackTrace();
							}
						}
					}
				}
				else if (ap.annotationType() == XendraColumn.class) {
					//					XendraColumn column = (XendraColumn) ap;
					//					if (columns == null)
					//						columns = new ArrayList<XendraColumn>();
					//					columns.add(column);
				}
				else if (ap.annotationType() == XendraTab.class) {
					if (tabs == null)
						tabs = new ArrayList<XendraTab>();
					XendraTab tab = (XendraTab) ap;
					tabs.add(tab);
				}
				else if (ap.annotationType() == XendraField.class) {
					//					XendraField field = (XendraField) ap;
					//					if (fields == null)
					//						fields = new ArrayList<XendraField>();
					//					fields.add(field);
				}
				else if (ap.annotationType() == XendraIndex.class) {
					XendraIndex index = (XendraIndex) ap;
					if (indexes == null)
						indexes = new ArrayList<XendraIndex>();
					indexes.add(index);
					if (!updateindex)
					{
						boolean found = false;
						String column_names = index.Column_Names();
						for (Vector idx:adindexes)
						{					
							String name = (String) idx.get(0);
							String col_names = (String) idx.get(1);
							String comments = (String) idx.get(2);
							if (col_names.equals(column_names))
							{
								Hashtable props = Util.getProperties(comments);
								if (props.containsKey(X_AD_Index.COLUMNNAME_Identifier))
								{
									found = true;
									break;
								}
							}
						}
						if (!found)
							updateindex = true;
					}
				}
				else if (ap.annotationType() == XendraTrl.class)
				{		
					XendraTrl trl = (XendraTrl) ap;				
					List<String> def = new ArrayList<String>();
					String var = f.getName();
					StringTokenizer st = new StringTokenizer(var, "_", false);
					while (st.hasMoreTokens())
					{
						String xx = st.nextToken().trim();
						def.add(xx);
					}	
					String lang = String.format("%s_%s", def.get(0),def.get(1));
					String type = def.get(2);
					String name = "";
					for (int i=3; i < def.size()-1; i++)
					{
						if (name.length() > 0)
							name += "_";
						name += def.get(i);
					}
					String subname = def.get(def.size()-1);
					String translate = (String) f.get(f.getName());
					String tablename  = "";
					String identifier = trl.Identifier();
					if (type.equals("TAB"))
						tablename = X_AD_Tab.Table_Name;
					else if (type.equals("COLUMN"))
						tablename = X_AD_Column.Table_Name;
					else if (type.equals("FIELD"))
						tablename = X_AD_Field.Table_Name;
					else if (type.equals("TABLE"))
						tablename = X_AD_Table.Table_Name;
					if (translate == null)
						continue;
					PO potrl = new Query(Env.getCtx(), tablename, "identifier = ?", null)
							.setParameters(identifier).first();
					if (potrl != null)
					{
						String key = String.format("%s_ID", tablename);
						String sqlcount = String.format("SELECT %s FROM %s_trl WHERE %s=%s AND ad_language='%s'",subname, tablename,key, potrl.get_ID(), lang);
						String dbtranslate = DB.getSQLValueString(null, sqlcount);
						if (dbtranslate == null)
							dbtranslate = "";
						if (dbtranslate.compareTo(translate) != 0)
						{
							if (translate.contains("'"))							
								translate = translate.replace("'", "''");
							String sqlupdate = String.format("UPDATE %s_trl set %s='%s' WHERE %s=%s AND ad_language='%s'",tablename,subname,translate,key, potrl.get_ID(),lang);
							int no = DB.executeUpdate(sqlupdate, null);														
							{
								if (no == 0)
								{
									Vector vector = new Vector();					
									vector.add(lang);			
									vector.add(name);
									vector.add(subname);
									vector.add(translate);					
									vector.add(trl.Identifier());
									vector.add(tablename);
									newtranslations.add(vector);
								}
							}
							if (no < 0) {
								//System.out.println("X");
							}
						}
					}
					else
					{

					}					
				}
			}
		}
		// buscamos otra vez para evitar llenar la ram de columns y fields
		if (tabs != null) {
			for (Field f:clazz.getDeclaredFields())
			{
				for (Annotation ap: f.getAnnotations()) {					
					if (ap.annotationType() == XendraField.class) {
						XendraField field = (XendraField) ap;
						X_AD_Field dbfield = new Query(Env.getCtx(), X_AD_Field.Table_Name, "identifier = ?", null)
								.setParameters(field.Identifier()).first();
						if (dbfield == null)
						{					
							X_AD_Tab dbtab = null;
							for (XendraTab tab:tabs)
							{
								if (tab.Identifier().equals(field.AD_Tab_ID()))
								{
									dbtab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "identifier = ? ", null)
											.setParameters(field.AD_Tab_ID()).first();
									break;
								}								
							}
							X_AD_Column dbcolumn = null;
							for (Field sf:clazz.getDeclaredFields())
							{
								for (Annotation sap: sf.getAnnotations()) {					
									if (sap.annotationType() == XendraColumn.class) {
										XendraColumn column = (XendraColumn) sap;
										if (column.Identifier().equals(field.AD_Column_ID()))
										{
											dbcolumn = new Query(Env.getCtx(), X_AD_Column.Table_Name, "identifier = ?", null)
													.setParameters(field.AD_Column_ID()).first();
											break;
										}										
									}
								}
							}
							if (dbtab != null && dbcolumn != null)					
							{
								dbfield = new Query(Env.getCtx(), X_AD_Field.Table_Name, "AD_Tab_ID = ? AND AD_Column_ID = ?", null)
										.setParameters(dbtab.getAD_Tab_ID(), dbcolumn.getAD_Column_ID()).first();						
							}							
						}
						//
						Timestamp fieldsync = Timestamp.valueOf(field.Synchronized());
						Timestamp dbfieldsync = null;
						if (dbfield != null)
							dbfieldsync = dbfield.getSynchronized();
						if (dbfieldsync != null) {
							Calendar calref = Calendar.getInstance();
							calref.setTime(dbfield.getSynchronized());					
							calref.set(Calendar.MILLISECOND, 0);
							dbfieldsync = new Timestamp(calref.getTimeInMillis()); 
						}

						if (dbfield == null || dbfield.getSynchronized() == null || fieldsync.compareTo(dbfieldsync) != 0)
						{
							updatetabs = true;
						}										
					}
				}
			}
		}
		if (tabs != null)
		{
			for (XendraTab tab:tabs)
			{
				X_AD_Tab dbtab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "identifier = ?", null)
						.setParameters(tab.Identifier()).first();
				if (dbtab == null && dbtable != null)
				{
					dbtab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "Name = ? AND AD_Table_ID = ?", null)
							.setParameters(tab.Name(), dbtable.getAD_Table_ID()).first();
				}
				if (dbtab == null || dbtab.getSynchronized() == null)
					updatetabs = true;
				else
				{
					if (dbtab.isLockout()) {
						continue;
					}
					Timestamp tabsync = Timestamp.valueOf(tab.Synchronized());
					Calendar caltab = Calendar.getInstance();
					caltab.setTime(tabsync);
					caltab.set(Calendar.MILLISECOND, 0);					
					if (caltab.getTime().compareTo(dbtab.getSynchronized()) != 0)
						updatetabs = true;										
				}					
			}
		}
		if (updatetable)
		{
			if (IsModeServer()) 
				log.log(Level.WARNING, String.format("Create/Update %s ",table.Name()));
			else
				addLine(String.format("Create/Update %s ",table.Name()));
			if (dbtable == null)
				dbtable = new MTable(Env.getCtx(), 0, null);
			// add package plugin
			String pkgid = table.AD_Package_ID();
			String pluginid = table.AD_Plugin_ID();;			
			int AD_Package_ID = 0;
			int AD_Plugin_ID = 0;
			X_AD_Plugin plg = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "Identifier = ?", null)
					.setParameters(pluginid).first();
			if (plg != null) 
				AD_Plugin_ID = plg.getAD_Plugin_ID();
			X_AD_Package pkg = new Query(Env.getCtx(), X_AD_Package.Table_Name, "Identifier = ?", null)
					.setParameters(pkgid).first();
			if (pkg != null)
				AD_Package_ID = pkg.getAD_Package_ID();
			dbtable.setName(table.Name());
			dbtable.setAD_Plugin_ID(AD_Plugin_ID);
			dbtable.setAD_Package_ID(AD_Package_ID);
			dbtable.setTableName(table.TableName());
			dbtable.setDescription(table.Description());
			dbtable.setHelp(table.Help());
			dbtable.setAccessLevel(table.AccessLevel());
			X_AD_Val_Rule TableValRuleID = UpdateValRule(table.AD_Val_Rule_ID());
			if (TableValRuleID != null)
				dbtable.setAD_Val_Rule_ID(TableValRuleID.getAD_Val_Rule_ID());
			dbtable.setLoadSeq(table.LoadSeq());
			dbtable.setIsSecurityEnabled(table.IsSecurityEnabled());
			dbtable.setIsDeleteable(table.IsDeleteable());
			dbtable.setIsHighVolume(table.IsHighVolume());
			dbtable.setIsView(table.IsView());
			dbtable.setID(table.ID());
			dbtable.setIsChangeLog(table.IsChangeLog());
			dbtable.setIdentifier(table.Identifier());
			dbtable.setIsReplicated(false);
			dbtable.setSynchronized(Timestamp.valueOf(table.Synchronized()));
			if (dbtable.save())
			{
				//if (isnew)
				//	dbtable.createDefaults(table.IsKey());
				if (!table.IsView())
					dbtable.checkdefaults(table.IsKey());
				//if (columns == null)
				//{				
				//	log.log(Level.WARNING, String.format("%s don't have defined columns",table.Name()));
				//return;
				//}
				//else
				//{
				for (Field f:clazz.getDeclaredFields())
				{
					for (Annotation ap: f.getAnnotations()) {					
						if (ap.annotationType() == XendraColumn.class) {
							XendraColumn column = (XendraColumn) ap;		
							Boolean update = true;
							X_AD_Element element = UpdateElement(column.AD_Element_ID(), column.ColumnName());
							X_AD_Reference referenceValueID = UpdateReference(column.AD_Reference_Value_ID());
							X_AD_Val_Rule ValRuleID = UpdateValRule(column.AD_Val_Rule_ID());									
							Timestamp srcsynchro = Timestamp.valueOf(column.Synchronized());
							int AD_Process_ID = 0;
							X_AD_Column dbcolumn = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
									.setParameters(column.Identifier()).first();
							if (dbcolumn == null && dbtable != null)
							{
								try {
									dbcolumn = new Query(Env.getCtx(), X_AD_Column.Table_Name, "ColumnName = ? AND AD_Table_ID = ? ", null)
											.setParameters(element.getColumnName(), dbtable.getAD_Table_ID()).first();
									if (dbcolumn != null)
									{
										dbcolumn.setIdentifier(column.Identifier());
										dbcolumn.setSynchronized(null);
										dbcolumn.save();
									}
								}
								catch (Exception e)
								{
									e.printStackTrace();
								}
							}
							if (dbcolumn != null && dbcolumn.getSynchronized() != null)
							{
								String columnexists = String.format("SELECT count(*) FROM information_schema.columns WHERE  table_schema = 'xendra' AND table_name = '%s' AND column_name = '%s'", tblname.toLowerCase(), column.ColumnName().toLowerCase());
								int no = DB.getSQLValue(null, columnexists);
								if (no > 0 && dbcolumn.getSynchronized().compareTo(srcsynchro) >= 0)
									update = false;
							}
							if (update)
							{
								if (dbcolumn == null)
								{
									dbcolumn = new X_AD_Column(Env.getCtx(), 0, null);						
								}			
								if (column.AD_Process_ID().length() > 0)
								{
									X_AD_Process dbprocess = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
											.setParameters(column.AD_Process_ID()).first();
									if (dbprocess != null)
										AD_Process_ID = dbprocess.getAD_Process_ID();
									else
									{
										columnpendings.add(element.getColumnName());
									}
								}			
								dbcolumn.setAD_Table_ID(dbtable.getAD_Table_ID());
								dbcolumn.setName(element.getName());
								dbcolumn.setColumnName(element.getColumnName());
								dbcolumn.setDescription(element.getDescription());
								dbcolumn.setHelp(element.getHelp());
								dbcolumn.setEntityType(element.getEntityType());
								dbcolumn.setIdentifier(column.Identifier());					
								dbcolumn.setAD_Element_ID(element.getAD_Element_ID());
								dbcolumn.setAD_Reference_ID(column.AD_Reference_ID());
								if (referenceValueID != null)
									dbcolumn.setAD_Reference_Value_ID(referenceValueID.getAD_Reference_ID());
								if (ValRuleID != null)
									dbcolumn.setAD_Val_Rule_ID(ValRuleID.getAD_Val_Rule_ID());
								dbcolumn.setFieldLength(column.FieldLength());
								dbcolumn.setDefaultValue(column.DefaultValue());
								dbcolumn.setIsKey(column.IsKey());
								dbcolumn.setIsParent(column.IsParent());
								dbcolumn.setIsInternal(column.IsInternal());
								dbcolumn.setIsMandatory(column.IsMandatory());
								dbcolumn.setIsUpdateable(column.IsUpdateable());
								dbcolumn.setReadOnlyLogic(column.ReadOnlyLogic());
								dbcolumn.setIsIdentifier(column.IsIdentifier());
								dbcolumn.setSeqNo(column.SeqNo());
								dbcolumn.setIsTranslated(column.IsTranslated());
								dbcolumn.setCallout(column.Callout());
								dbcolumn.setVFormat(column.VFormat());
								dbcolumn.setValueMin(column.ValueMin());
								dbcolumn.setValueMax(column.ValueMax());
								dbcolumn.setVersion(new BigDecimal(column.Version()));
								dbcolumn.setIsSelectionColumn(column.IsSelectionColumn());
								if (AD_Process_ID > 0)
								{
									dbcolumn.setAD_Process_ID(AD_Process_ID);
								}
								dbcolumn.setIsAlwaysUpdateable(column.IsAlwaysUpdateable());
								dbcolumn.setColumnSQL(column.ColumnSQL());
								dbcolumn.setIsAllowLogging(column.IsAllowLogging());
								dbcolumn.setIdentifier(column.Identifier());
								dbcolumn.setSynchronized(srcsynchro);
								dbcolumn.save();
							}

						}
					}
				}
				//for (XendraColumn column:columns)
				//{
				//}
				//}
				if (!dbtable.isView())
				{
					MColumn[] tablecolumns = dbtable.getColumns(true);
					for (MColumn column:tablecolumns)
					{
						List<String> sqlcommands = new ArrayList<String>();
						Boolean existcolumn = false;
						int noColumns = 0;				
						String sql = null;
						ResultSet rs = md.getColumns(catalog, schema, dbtable.getTableName().toLowerCase(), null);
						while (rs.next())
						{
							noColumns++;
							String columnName = rs.getString("COLUMN_NAME");
							if (!columnName.equalsIgnoreCase(column.getColumnName()))
							{
								continue;
							}
							existcolumn = true;
							break;
						}
						rs.close();
						rs = null;
						if (!existcolumn || noColumns == 0)
						{
							if (noColumns == 0)
							{
								rs = md.getTables(catalog, schema, dbtable.getTableName().toLowerCase(), new String[] {"TABLE"});
								if (!rs.next())
								{
									sql = dbtable.getSQLCreate();
									if (sql != null)
										sqlcommands.add(sql);
								}
								else
								{
									sql = column.getSQLAdd(dbtable);
									if (sql != null)
										sqlcommands.add(sql);
								}	
							}
							else 
							{
								sql = column.getSQLAdd(dbtable);
								if (sql != null)
									sqlcommands.add(sql);	
							}
						}
						if (sqlcommands.size() > 0)
						{
							try {
								while (sqlcommands.size() > 0)
								{
									String sqlcommand = sqlcommands.get(0);
									if (sqlcommand.indexOf(DB.SQLSTATEMENT_SEPARATOR) == -1)
									{
										AddPoint();
										//System.out.print(".");
										String error = Util.processSQL(sqlcommand);
										if (error.length() > 0) {
											if (IsModeServer())
												System.out.println(error);
											else 
												addLine(error);
										}
									}
									else
									{
										String statements[] = sqlcommand.split(DB.SQLSTATEMENT_SEPARATOR);
										for (String statement:statements)
										{
											//System.out.print(".");
											AddPoint();
											String error = Util.processSQL(statement);
											if (error.length() > 0) {
												if (IsModeServer())
													System.out.println(error);
												else
													addLine(error);
											}
										}
									}
									sqlcommands.remove(0);
								}
							}
							catch (Exception e)
							{
								e.printStackTrace();
							}
						}
					}
					POInfo.remove(dbtable.Table_ID);
				}
			}
		}
		if (updatetabs && tabs != null)
		{
			for (XendraTab tab:tabs)
			{
				X_AD_Tab dbtab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "identifier = ?", null)
						.setParameters(tab.Identifier()).first();
				// update window and menu options
				int tabwindowid = 0;
				String windowid = tab.AD_Window_ID();
				X_AD_Window dbwindow = new Query(Env.getCtx(), X_AD_Window.Table_Name, "Identifier = ?" , null)
						.setParameters(windowid).first();
				if (dbwindow != null) {
					tabwindowid = dbwindow.getAD_Window_ID();
				} else {
					continue;
				}
				Timestamp tabsync = Timestamp.valueOf(tab.Synchronized());
				Calendar caltab = Calendar.getInstance();								
				caltab.setTime(tabsync);
				caltab.set(Calendar.MILLISECOND, 0);
				if (dbtab == null)
				{
					dbtab = new X_AD_Tab(Env.getCtx(), 0 , null);	
					dbtab.setAD_Table_ID(dbtable.getAD_Table_ID());
					dbtab.setIdentifier(tab.Identifier());
				}							
				if (dbtab.getSynchronized() == null || caltab.getTime().compareTo(dbtab.getSynchronized()) != 0)
				{
					dbtab.setName(tab.Name());
					dbtab.setDescription(tab.Description());
					dbtab.setHelp(tab.Help());
					if (tabwindowid < 1) {
						String taberror = String.format("window/tab %s dependence broken, maybe a plugin is not update",tab.Name());
						if (!errors.contains(taberror)) {
							throw new Exception(taberror);
						} else {
							continue;
						}
					}
					dbtab.setAD_Window_ID(tabwindowid);
					dbtab.setSeqNo(tab.SeqNo());
					dbtab.setTabLevel(tab.TabLevel());
					dbtab.setIsSingleRow(tab.IsSingleRow());
					dbtab.setIsInfoTab(tab.IsInfoTab());
					dbtab.setIsTranslationTab(tab.IsTranslationTab());
					dbtab.setIsReadOnly(tab.IsReadOnly());
					if (tab.AD_Column_ID().length() > 0)
					{
						X_AD_Column col = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ? ", null)
								.setParameters(tab.AD_Column_ID()).first();
						if (col != null)
						{
							dbtab.setAD_Column_ID(col.getAD_Column_ID());
						}
					}
					dbtab.setHasTree(tab.HasTree());
					dbtab.setWhereClause(tab.WhereClause());
					dbtab.setOrderByClause(tab.OrderByClause());
					dbtab.setCommitWarning(tab.CommitWarning());
					if (tab.AD_Process_ID().length() > 0)
					{
						X_AD_Process proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
								.setParameters(tab.AD_Process_ID()).first();
						if (proc != null)
						{
							dbtab.setAD_Process_ID(proc.getAD_Process_ID());
						}							
					}
					// falta ad_image_id					
					if (tab.AD_ColumnSortOrder_ID().length() > 0)
					{
						X_AD_Column col = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ? ", null)
								.setParameters(tab.AD_ColumnSortOrder_ID()).first();
						if (col != null)
							dbtab.setAD_ColumnSortOrder_ID(col.getAD_Column_ID());
					}
					if (tab.AD_ColumnSortYesNo_ID().length() > 0)
					{
						X_AD_Column col = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
								.setParameters(tab.AD_ColumnSortYesNo_ID()).first();
						if (col != null)							
							dbtab.setAD_ColumnSortYesNo_ID(col.getAD_Column_ID());													
					}						
					dbtab.setIsSortTab(tab.IsSortTab());
					dbtab.setEntityType(REF__EntityType.Dictionary);
					if (tab.Included_Tab_ID().length() > 0)
					{
						X_AD_Tab tabincl = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "Identifier = ?", null)
								.setParameters(tab.Included_Tab_ID()).first();
						if (tabincl != null)
							dbtab.setIncluded_Tab_ID(tabincl.getAD_Tab_ID());
					}
					dbtab.setReadOnlyLogic(tab.ReadOnlyLogic());
					dbtab.setDisplayLogic(tab.DisplayLogic());
					dbtab.setIsInsertRecord(tab.IsInsertRecord());
					dbtab.setIsAdvancedTab(tab.IsAdvancedTab());
					if (tab.Parent_Column_ID().length() > 0)
					{
						X_AD_Column col = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
								.setParameters(tab.AD_ColumnSortYesNo_ID()).first();
						if (col != null)							
							dbtab.setParent_Column_ID(col.getAD_Column_ID());																				
					}
					dbtab.setSynchronized(tabsync);
					dbtab.save();
				}
				int seqno = 0;
				for (Field f:clazz.getDeclaredFields())
				{
					for (Annotation ap: f.getAnnotations()) {					
						if (ap.annotationType() == XendraField.class) {
							XendraField field = (XendraField) ap;
							if (field.AD_Tab_ID().compareTo(tab.Identifier()) == 0)
							{
								// sometimes, because the generator is used for all field, the field <table>_id is generated too
								// but because is a ID do nothing.
								//X_AD_Column column = new Query (Env.getCtx(), X_AD_Column.Table_Name, "Identifier  = ? ", null)
								//.setParameters(field.AD_Column_ID()).first();
								X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "ColumnName = ? AND AD_Table_ID = ?", null)
										.setParameters(field.AD_Column_ID(), dbtable.getAD_Table_ID()).first();
								if (column != null)
								{
									X_AD_Field dbfield = new Query(Env.getCtx(), X_AD_Field.Table_Name, "identifier = ? ", null)
											.setParameters(field.Identifier()).first();
									if (dbfield == null)
									{
										dbfield = new Query(Env.getCtx(), X_AD_Field.Table_Name, "AD_Tab_ID = ? AND AD_Column_ID = ?", null)
												.setParameters(dbtab.getAD_Tab_ID(), column.getAD_Column_ID()).first();
										if (dbfield != null)
											dbfield.setIdentifier(field.Identifier());
									}
									if (dbfield == null)
									{
										dbfield = new X_AD_Field(Env.getCtx(), 0, null);
										dbfield.setIdentifier(field.Identifier());
										dbfield.setAD_Tab_ID(dbtab.getAD_Tab_ID());
										dbfield.setAD_Column_ID(column.getAD_Column_ID());
									}
									Timestamp fieldsync = Timestamp.valueOf(field.Synchronized());
									Calendar cal = null;
									if (dbfield.getSynchronized() != null)
									{
										cal = Calendar.getInstance();								
										cal.setTime(dbfield.getSynchronized());
										cal.set(Calendar.MILLISECOND, 0);
									}
									if (dbfield.getSynchronized() == null || fieldsync.compareTo(cal.getTime()) != 0)
									{
										dbfield.setName(column.getName());
										dbfield.setDescription(column.getDescription());
										dbfield.setHelp(column.getHelp());
										dbfield.setIsCentrallyMaintained(field.IsCentrallyMaintained());
										if (field.AD_FieldGroup_ID().length() > 0)
										{
											X_AD_FieldGroup fg = new Query(Env.getCtx(), X_AD_FieldGroup.Table_Name, "name = ?", null)
													.setParameters(field.AD_FieldGroup_ID()).first();
											if (fg != null)
											{
												dbfield.setAD_FieldGroup_ID(fg.getAD_FieldGroup_ID());
											}
											else
											{
												//System.out.println("X");
											}
										}								
										dbfield.setIsDisplayed(field.IsDisplayed());
										dbfield.setDisplayLogic(field.DisplayLogic());
										dbfield.setDisplayLength(field.DisplayLength());
										dbfield.setIsReadOnly(field.IsReadOnly());
										dbfield.setSeqNo(field.SeqNo());
										if (field.SortNo() > 0)
											dbfield.setSortNo(BigDecimal.valueOf(field.SortNo()));
										dbfield.setIsSameLine(field.IsSameLine());
										dbfield.setIsHeading(field.IsHeading());
										dbfield.setIsFieldOnly(field.IsFieldOnly());
										//dbfield.setIsEncrypted(field.)
										dbfield.setEntityType(REF__EntityType.Dictionary);
										if (field.Included_Tab_ID().length() > 0)
										{
											X_AD_Tab tabincl = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "Identifier = ?", null)
													.setParameters(tab.Included_Tab_ID()).first();
											if (tabincl != null)
												dbfield.setIncluded_Tab_ID(tabincl.getAD_Tab_ID());
										}										
										dbfield.setSynchronized(fieldsync);
										dbfield.save();										
									}	
									if (dbfield.getSeqNo() > seqno)
										seqno = dbfield.getSeqNo();
								}
							}							
						}
					}
				}
				//				if (fields != null && fields.size() > 0)
				//				{
				//					for (XendraField field:fields)
				//					{
				//
				//					}
				//				}				
				X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "ColumnName = ? AND AD_Table_ID = ?", null)
						.setParameters(Constants.COLUMNNAME_IsActive, dbtable.getAD_Table_ID()).first();
				if (column != null)
				{
					X_AD_Field dbfield = new Query(Env.getCtx(), X_AD_Field.Table_Name, "AD_Tab_ID = ? AND AD_Column_ID = ?", null)
							.setParameters(dbtab.getAD_Tab_ID(), column.getAD_Column_ID()).first();
					if (dbfield == null)
					{
						dbfield = new X_AD_Field(Env.getCtx(), 0, null);
						dbfield.setIdentifier(Util.getUUID());
						dbfield.setAD_Tab_ID(dbtab.getAD_Tab_ID());
						dbfield.setAD_Column_ID(column.getAD_Column_ID());
						dbfield.setName(column.getName());
						dbfield.setDescription(column.getDescription());
						dbfield.setHelp(column.getHelp());
						dbfield.setIsCentrallyMaintained(false);
						dbfield.setIsDisplayed(true);
						dbfield.setDisplayLength(1);
						dbfield.setIsReadOnly(false);
						dbfield.setSeqNo(seqno + 10);
						dbfield.setIsSameLine(false);
						dbfield.setIsHeading(false);
						dbfield.setIsFieldOnly(false);
						dbfield.setHideInListView(false);
						dbfield.setEntityType(REF__EntityType.Dictionary);
						dbfield.setSynchronized(new Timestamp(System.currentTimeMillis()));
						dbfield.save();							
					}
				}				
			}
			if (newtranslations.size() > 0)
			{
				List<String> identifiers = new ArrayList<String>();
				for (Vector tabtrl:newtranslations)
				{
					Vector vector = (Vector) newtranslations.get(0);
					String identifier = (String) vector.get(4);
					String tablename = (String) vector.get(5);
					PO potrl = new Query(Env.getCtx(), tablename, "identifier = ?", null)
							.setParameters(identifier).first();
					if (potrl != null)
					{
						if (!identifiers.contains(identifier))
							identifiers.add(identifier);
					}
				}					
				for (String identifier:identifiers)
				{
					String lang = null;
					String name = null;
					String tablename = null;
					Hashtable hashfields = new Hashtable();
					for (Vector vector:newtranslations)
					{							
						String id = (String) vector.get(4);
						if (id.equals(identifier))
						{
							if (lang == null)
								lang = (String) vector.get(0);
							if (name == null)
								name = (String) vector.get(1);
							String subname = (String) vector.get(2);						
							String translate = (String) vector.get(3);							
							if (tablename == null)
								tablename = (String) vector.get(5);																						
							hashfields.put(subname, translate);
						}
					}						
					if (hashfields.size() > 0)
					{
						PO potrl = new Query(Env.getCtx(), tablename, "identifier = ?", null)
								.setParameters(identifier).first();							
						String trlfields = "";
						String values = "";
						for (Iterator it = hashfields.entrySet().iterator(); it.hasNext();)
						{
							Map.Entry entry = (Map.Entry) it.next();
							String id = (String) entry.getKey();
							String value = (String) entry.getValue();
							if (value.contains("'"))							
								value = value.replace("'", "''");
							if (trlfields.length() > 0)
								trlfields += ",";
							value = String.format("\'%s\'",value);
							trlfields += id;
							if (values.length() > 0)
								values += ",";
							values += value;								
						}
						String sqlinsert = String.format("INSERT INTO %s_trl (%s_ID,AD_Client_ID, AD_Org_ID, createdby,created, updatedby, updated,%s,ad_language) values (%s,0,0,0,now(),0,now(),%s,'%s')",tablename,tablename,trlfields,potrl.get_ID(),values,lang);
						int no = DB.executeUpdate(sqlinsert, null);
						if (no < 0)
						{
							//System.out.println("X");
						}
					}
				}
			}
		}
		if (updateindex && indexes != null)
		{
			for (XendraIndex index:indexes)
			{
				boolean isnewindex = false;
				Hashtable props= null;
				String indexname = "";
				//String comments = "";
				for (Vector idx:adindexes)
				{					
					indexname = (String) idx.get(0);
					String col_names = (String) idx.get(1);
					String comments = (String) idx.get(2);
					if (col_names.equals(index.Column_Names()))
					{
						props = Util.getProperties(comments);
						break;
					}						
				}			
				if (props == null)
				{
					//isnew = true;
					props = new Hashtable();
				}
				if (props.size() == 0)
				{
					props.put(X_AD_Function.COLUMNNAME_Identifier, index.Identifier());
					Timestamp sync = Timestamp.valueOf(index.Synchronized());
					props.put(X_AD_Function.COLUMNNAME_Synchronized, sync);
				}					
				String Identifier = (String) props.get(MFunction.COLUMNNAME_Identifier);
				if (Identifier == null || Identifier.length() == 0)
					Identifier = Util.getUUID();				
				MIndex oindex = MIndex.getbyIdentifier(Identifier);
				if (oindex == null)
				{					
					oindex = new MIndex(Env.getCtx(), 0 , null);
					oindex.setIdentifier(Identifier);
				}									
				oindex.setColumn_Names(index.Column_Names());
				oindex.setName(index.Name());
				Iterator keys = props.keySet().iterator();
				String comments = "";
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (oindex.get_ColumnIndex(key) >= 0)
					{
						if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
							oindex.setSynchronized((Timestamp) value);
						else	
							oindex.set_ValueOfColumn(key, value);
					}
					comments += String.format("@%s=%s\n", key, value);
				}
				oindex.setComments(comments);
				Timestamp sync = Timestamp.valueOf(index.Synchronized());
				oindex.setSynchronized(sync);
				if (oindex.save())
				{
					String indexexists = String.format("SELECT COUNT(*) FROM pg_class c JOIN pg_namespace n ON n.oid = c.relnamespace WHERE c.relname = '%s' AND n.nspname = 'xendra'",oindex.getName());
					int no = DB.getSQLValue(null, indexexists);
					isnewindex = no == 1 ? false : true;
					if (isnewindex)
					{
						StringBuilder dropindex = new StringBuilder("DROP INDEX  IF EXISTS ");
						dropindex.append(oindex.getName()).append("  CASCADE ");
						no = DB.executeUpdate(dropindex.toString(), null);
						StringBuilder createindex = new StringBuilder("CREATE ");
						if (oindex.isUnique())
							createindex.append("UNIQUE");
						createindex.append(" INDEX ").append(oindex.getName()).append(" ON ")
						.append(tblname.toLowerCase()).append("(").append(oindex.getColumn_Names()).append(")");
						no = DB.executeUpdate(createindex.toString(), null);																					
					}
					if (no != -1) // the index exists but not with the same name
					{						
						StringBuilder sql = new StringBuilder("COMMENT ON INDEX xendra.")
								.append(oindex.getName()).append(" IS '").append(comments).append("'");
						no = DB.executeUpdate(sql.toString(), null);
						if (no != 0)
						{
							//System.out.println("X");
						}
					}
				}
			}
		}
		return true;
	}

	private String ExtractTypesfromArgument(String arguments) {
		String type = "";
		String[] args = arguments.split(",");
		for (String arg:args)
		{
			arg = arg.trim();
			if (arg.startsWith("OUT "))
				continue;
			if (type.length() > 0)
				type = type.concat(",");
			int pos = arg.indexOf(" ");
			if (pos > 0 && arg.contains("timestamp"))
				type = type.concat(arg.substring(arg.indexOf("timestamp")).trim());
			else if (pos > 0 && arg.contains("character varying"))
				type = type.concat(arg.substring(arg.indexOf("character varying")).trim());
			else if (pos > 0)
				type = type.concat(arg.substring(pos).trim());
			else 
				type = type.concat(arg);
		}
		return type;
	}


	public static void setsearchpath(String trxName) {
		String search_path = DB.getSQLValueString(trxName, "SELECT setting FROM pg_settings where name = 'search_path'");
		if (!search_path.toLowerCase().contains("xendra") || !search_path.toLowerCase().contains("public"))
		{			
			int no = DB.executeUpdate("set search_path to public,xendra;", trxName);
			if (no < 0)
				System.out.println("err");
		}
	}	

	private int executesql(String sql) {
		int no = 0;
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();
		try {
			no = DB.executeUpdate(sql.toString(), trx.getTrxName());
			if (no == -1)
			{
				System.out.println(sql.toString());
				trx.rollback();
			}
			else
				trx.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			trx.rollback();
		}
		finally
		{
			trx.close();
		}	
		return no;
	}
	private int executesql(StringBuilder[] sqllist, String identifier) {
		int no = 0;
		for (StringBuilder sql:sqllist)
		{
			no = executesql(sql.toString());
			if (no < 0)
			{
				break;
			}
		}
		if (no == -1)
		{
			if (!functionsToTry.contains(identifier))
				functionsToTry.put(identifier, sqllist);			
		}
		return no;
	}

	private void deleteFunction(String name, String arguments) {				
		String type = ExtractTypesfromArgument(arguments);
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();
		try
		{
			String trxName = trx.getTrxName();
			String sql = "DROP FUNCTION IF EXISTS xendra."+ name + "(" + type + ") CASCADE; ";
			int no = DB.executeUpdate(sql, trxName);
			trx.commit();
		}
		catch (Exception e)
		{
			trx.rollback();
		}
		finally {
			trx.close();
		}
	}
	private void delete(String type, String command) {
		String sqlcmd = "";
		if (type.equals(Querys.OPERATOR))
			sqlcmd = String.format(Querys.DROPOPERATOR, command);
		else if (type.equals(Querys.VIEW))
			sqlcmd = String.format(Querys.DROPVIEW, command);
		if (sqlcmd.length() == 0)
			return;

		Trx trx = Trx.get(Trx.createTrxName(), true);
		String trxName = trx.getTrxName();
		trx.start();
		try {				
			int candelete = DB.executeUpdate(sqlcmd, trxName);
			if (candelete == -1)
				throw new Exception("");
			trx.commit();
		}
		catch (Exception e)
		{
			trx.rollback();
		}
		finally 
		{
			trx.close();
		}		
	}

	public void UpdateViews() {
		try {
			List<ElementProperties> previews = new ArrayList<ElementProperties>();			
			PreparedStatement pstmt = DB.prepareStatement(Querys.GETVIEWS, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				ElementProperties pp = new ElementProperties();
				Hashtable props = Util.getProperties(rs.getString("comment"));
				pp.addval(X_AD_View.COLUMNNAME_Name, rs.getString("viewname"));
				pp.addval(X_AD_View.COLUMNNAME_Comments, rs.getString("comment"));
				pp.addval(X_AD_View.COLUMNNAME_Owner, rs.getString("viewowner"));
				pp.addval(X_AD_View.COLUMNNAME_Definition, rs.getString("definition"));
				//pp.addval(X_AD_View.COLUMNNAME_Identifier, propertyValue)
				Iterator keys = props.keySet().iterator();
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					pp.addval(key, value);
				}
				previews.add(pp);				
			}
			rs.close();
			pstmt.close();
			ComponentScanner scanner = new ComponentScanner();	
			Set<Class<?>> views  = scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.compiere.model.view").returning(all());
				}
			});				
			float i = 1;
			float rows = views.size();
			Iterator it = views.iterator();
			while (it.hasNext())
			{
				Object processclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) processclass).getName());
				if (pbar != null) {
					float p = (i / rows) * 100;
					checklabel.setText(clazzref.getName());					
					pbar.setValue((int) p);					
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}													
				}																
				XendraView ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraView.class);
				String key = ref.Identifier();
				Timestamp refsynchro = Timestamp.valueOf(ref.Synchronized());
				boolean goahead = true;
				for (ElementProperties pp:previews)
				{
					if ( ref.Name().equals(pp.getval(X_AD_View.COLUMNNAME_Name)))
						pp.setval(X_AD_Function.COLUMNNAME_Identifier, ref.Identifier());
					if (ref.Identifier().equals(pp.getval(X_AD_View.COLUMNNAME_Identifier))) 
					{
						pp.setProcessed(true);
						Timestamp sync  = (Timestamp) pp.getval(X_AD_View.COLUMNNAME_Synchronized);
						if (sync != null)
						{
							if (refsynchro.compareTo(sync) == 0)
							{
								goahead = false;
							}
						}
						break;
					}
				}
				if (goahead)
				{
					delete(Querys.VIEW, ref.Name());	
					AddExtension(ref.Extension());
					Method getComments = clazzref.getMethod("getComments", null);
					String comments = (String) getComments.invoke(null, null);
					Method getDefinition = clazzref.getMethod("getDefinition", null);
					String definition = (String) getDefinition.invoke(null, null);
					StringBuilder[] sqllist = {
							new StringBuilder("CREATE OR REPLACE VIEW xendra.")
							.append((String) ref.Name())
							.append(" AS ").append(definition),
							new StringBuilder("ALTER TABLE xendra.")
							.append(ref.Name())			
							.append(" OWNER TO ").append(ref.Owner()).append(";"),
							new StringBuilder("COMMENT ON VIEW xendra.")
							.append(ref.Name())
							.append(" IS '").append(comments).append("'") };
					int no = executesql(sqllist, (String) key);
					if ( no == -1 ) // the view can't be created because the table don't exists, check if update table is activated
					{
						MSystem system = MSystem.get(Env.getCtx());
						if (system != null && !system.isJustMigrated())
						{
							system.setIsJustMigrated(true);
							system.save();
						}
					}
					else
					{
						boolean updatetable = false;
						XendraTable table = null;
						X_AD_Table dbtable = null;
						List<XendraColumn> columns = new ArrayList<XendraColumn>();
						for (Field f:clazzref.getDeclaredFields())
						{							
							for (Annotation ap:f.getAnnotations()) {
								if (ap.annotationType() == XendraTable.class) {					
									table = (XendraTable) ap;
									dbtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "tablename = ?", null)
											.setParameters(table.TableName()).first();
									Timestamp synchro = Timestamp.valueOf(table.Synchronized());
									if (dbtable == null)
									{
										updatetable = true;
									}
									else if (dbtable.getSynchronized() == null)
									{
										updatetable = true;
									}									
									else if (synchro.compareTo(dbtable.getSynchronized()) > 0)
									{
										updatetable = true;
									}									
								}
								else if (ap.annotationType() == XendraColumn.class) {
									XendraColumn column = (XendraColumn) ap;
									columns.add(column);
								}
							}
						}
						if (updatetable)
						{
							if (this.IsModeServer())
								log.log(Level.WARNING, String.format("Create/Update %s ",table.Name()));
							else
								addLine(String.format("Create/Update %s ",table.Name()));
							if (dbtable == null)
								dbtable = new MTable(Env.getCtx(), 0, null);
							dbtable.setName(table.Name());
							dbtable.setTableName(table.TableName());
							dbtable.setDescription(table.Description());
							dbtable.setHelp(table.Help());
							dbtable.setAccessLevel(table.AccessLevel());
							X_AD_Val_Rule TableValRuleID = UpdateValRule(table.AD_Val_Rule_ID());
							if (TableValRuleID != null)
								dbtable.setAD_Val_Rule_ID(TableValRuleID.getAD_Val_Rule_ID());
							dbtable.setLoadSeq(table.LoadSeq());
							dbtable.setIsSecurityEnabled(table.IsSecurityEnabled());
							dbtable.setIsDeleteable(table.IsDeleteable());
							dbtable.setID(table.ID());
							dbtable.setIsHighVolume(table.IsHighVolume());
							dbtable.setIsView(table.IsView());
							dbtable.setIsChangeLog(table.IsChangeLog());
							dbtable.setIdentifier(table.Identifier());
							dbtable.setIsReplicated(false);
							dbtable.setSynchronized(Timestamp.valueOf(table.Synchronized()));
							if (dbtable.save())
							{
								for (XendraColumn column:columns)
								{
									Boolean update = true;
									X_AD_Element element = UpdateElement(column.AD_Element_ID(), column.ColumnName());
									X_AD_Reference referenceValueID = UpdateReference(column.AD_Reference_Value_ID());
									X_AD_Val_Rule ValRuleID = UpdateValRule(column.AD_Val_Rule_ID());									
									Timestamp srcsynchro = Timestamp.valueOf(column.Synchronized());
									int AD_Process_ID = 0;
									X_AD_Column dbcolumn = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
											.setParameters(column.Identifier()).first();
									if (dbcolumn == null && dbtable != null)
									{
										try {
											dbcolumn = new Query(Env.getCtx(), X_AD_Column.Table_Name, "ColumnName = ? AND AD_Table_ID = ? ", null)
													.setParameters(element.getColumnName(), dbtable.getAD_Table_ID()).first();
											if (dbcolumn != null)
											{
												dbcolumn.setIdentifier(column.Identifier());
												dbcolumn.setSynchronized(null);
												dbcolumn.save();
											}
										}
										catch (Exception e)
										{
											e.printStackTrace();
										}
									}
									if (dbcolumn != null && dbcolumn.getSynchronized() != null)
									{
										if (dbcolumn.getSynchronized().compareTo(srcsynchro) >= 0)
											update = false;
									}
									if (update)
									{
										if (dbcolumn == null)
										{
											dbcolumn = new X_AD_Column(Env.getCtx(), 0, null);						
										}			
										if (column.AD_Process_ID().length() > 0)
										{
											X_AD_Process dbprocess = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
													.setParameters(column.AD_Process_ID()).first();
											if (dbprocess != null)
												AD_Process_ID = dbprocess.getAD_Process_ID();
											else
											{
												columnpendings.add(element.getColumnName());
											}
										}			
										dbcolumn.setAD_Table_ID(dbtable.getAD_Table_ID());
										dbcolumn.setName(element.getName());
										dbcolumn.setColumnName(element.getColumnName());
										dbcolumn.setDescription(element.getDescription());
										dbcolumn.setHelp(element.getHelp());
										dbcolumn.setEntityType(element.getEntityType());
										dbcolumn.setIdentifier(column.Identifier());					
										dbcolumn.setAD_Element_ID(element.getAD_Element_ID());
										dbcolumn.setAD_Reference_ID(column.AD_Reference_ID());
										if (referenceValueID != null)
											dbcolumn.setAD_Reference_Value_ID(referenceValueID.getAD_Reference_ID());
										if (ValRuleID != null)
											dbcolumn.setAD_Val_Rule_ID(ValRuleID.getAD_Val_Rule_ID());
										dbcolumn.setFieldLength(column.FieldLength());
										dbcolumn.setDefaultValue(column.DefaultValue());
										dbcolumn.setIsKey(column.IsKey());
										dbcolumn.setIsParent(column.IsParent());
										dbcolumn.setIsMandatory(column.IsMandatory());
										dbcolumn.setIsUpdateable(column.IsUpdateable());
										dbcolumn.setReadOnlyLogic(column.ReadOnlyLogic());
										dbcolumn.setIsIdentifier(column.IsIdentifier());
										dbcolumn.setSeqNo(column.SeqNo());
										dbcolumn.setIsTranslated(column.IsTranslated());
										dbcolumn.setCallout(column.Callout());
										dbcolumn.setVFormat(column.VFormat());
										dbcolumn.setValueMin(column.ValueMin());
										dbcolumn.setValueMax(column.ValueMax());
										dbcolumn.setVersion(new BigDecimal(column.Version()));
										dbcolumn.setIsSelectionColumn(column.IsSelectionColumn());
										if (AD_Process_ID > 0)
										{
											dbcolumn.setAD_Process_ID(AD_Process_ID);
										}
										dbcolumn.setIsAlwaysUpdateable(column.IsAlwaysUpdateable());
										dbcolumn.setColumnSQL(column.ColumnSQL());
										dbcolumn.setIsAllowLogging(column.IsAllowLogging());
										dbcolumn.setIdentifier(column.Identifier());
										dbcolumn.setSynchronized(srcsynchro);
										dbcolumn.save();
									}
								}									
							}
						}						
					}
				}	
				i++;
			}
			for (ElementProperties pp:previews)
			{
				if (pp.isProcessed())
					continue;
				AddExtension( (String) pp.getval(X_AD_View.COLUMNNAME_Extension));
				String comments = (String) pp.getval(X_AD_View.COLUMNNAME_Comments);
				String definition = (String) pp.getval(X_AD_View.COLUMNNAME_Definition);
				StringBuilder[] sqllist = {
						new StringBuilder("CREATE OR REPLACE VIEW xendra.")
						.append(pp.getval(X_AD_View.COLUMNNAME_Name))
						.append(" AS ").append(definition),
						new StringBuilder("ALTER TABLE xendra.")
						.append(pp.getval(X_AD_View.COLUMNNAME_Name))			
						.append(" OWNER TO ").append(pp.getval(X_AD_View.COLUMNNAME_Owner)).append(";"),
						new StringBuilder("COMMENT ON VIEW xendra.")
						.append(pp.getval(X_AD_View.COLUMNNAME_Name))
						.append(" IS '").append(comments).append("'") };
				executesql(sqllist, (String) pp.getval(X_AD_View.COLUMNNAME_Identifier));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void AddExtension(String extension) {
		if (extension != null && extension.length() > 0)
		{		
			int no = DB.getSQLValue(null, String.format("SELECT count(*) from pg_extension where extname = '%s'",extension));
			if (no == 0)
			{
				CConnection m_cc = CConnection.get();			
				setDatabaseSystem(m_cc);		
				no = DB.executeUpdate(String.format(Querys.CREATEEXTENSION,extension), null);			
				if (no == -1)
					no = DB.executeUpdate(String.format(Querys.CREATEEXTENSIONUNPACKED, extension), null);
				setDBTarget(m_cc);				
			}
		}
	}

	private static void setDBTarget(CConnection m_cc) {
		DB.setDBTarget(m_cc);		
		setsearchpath(null);
	}
	public static void setDatabaseSystem(CConnection cc) {
		CConnection m_cc = CConnection.get(cc.getDbHost(), cc.getDbPort(), cc.getDbName(), DB.getDatabase().getSystemUser(), "postgres");
		setDBTarget(m_cc);		
	}	
	public void UpdateFunctions() {
		CConnection m_cc = CConnection.get();			
		setDatabaseSystem(m_cc);		
		try {
			List<ElementProperties> prevstorproc = new ArrayList<ElementProperties>();
			PreparedStatement pstmt = DB.prepareStatement(storeprocedurestoxml.getSQLAllStoreProcedures("", ""), null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				ElementProperties ep = new ElementProperties();
				Hashtable props = Util.getProperties(rs.getString(X_AD_Function.COLUMNNAME_Comments));
				ep.addval(X_AD_Function.COLUMNNAME_Name, rs.getString("functionname"));
				ep.addval(X_AD_Function.COLUMNNAME_Comments, rs.getString(X_AD_Function.COLUMNNAME_Comments));
				ep.addval(X_AD_Function.COLUMNNAME_Output, rs.getString(X_AD_Function.COLUMNNAME_Output));
				ep.addval(X_AD_Function.COLUMNNAME_Owner, rs.getString(X_AD_Function.COLUMNNAME_Owner));
				ep.addval(X_AD_Function.COLUMNNAME_Language, rs.getString("language"));
				ep.addval(X_AD_Function.COLUMNNAME_Arguments,  rs.getString("arguments"));
				ep.addval(X_AD_Function.COLUMNNAME_Code, rs.getString("sourcecode"));
				Iterator keys = props.keySet().iterator();
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					ep.addval(key, value);
				}
				prevstorproc.add(ep);
			}
			pstmt.close();
			rs.close();
			Set<Class<?>> functions = null;
			ComponentScanner scanner = new ComponentScanner();
			functions = scanner.getClasses(	new ComponentQuery()
			{
				protected void query() {
					select().from("org.compiere.model.function").returning(all());
				}
			});	

			float i = 1;
			float rows = functions.size();
			Iterator it = functions.iterator();
			while (it.hasNext())
			{
				Object processclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) processclass).getName());
				if (pbar != null) {
					float p = (i / rows) * 100;
					checklabel.setText(clazzref.getName());					
					pbar.setValue((int) p);					
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}													
				}												
				XendraFunction ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraFunction.class);				
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());				
				String key = ref.Identifier();
				boolean goahead = true;
				for (ElementProperties pp:prevstorproc)
				{
					if ( ref.Name().equals(pp.getval(X_AD_Function.COLUMNNAME_Name)))
					{
						if (ref.Arguments().equals(pp.getval(X_AD_Function.COLUMNNAME_Arguments)))
							pp.setval(X_AD_Function.COLUMNNAME_Identifier, ref.Identifier());
					}
					if (ref.Identifier().equals(pp.getval(X_AD_Function.COLUMNNAME_Identifier))) 
					{
						pp.setProcessed(true);
						Timestamp sync  = (Timestamp) pp.getval(X_AD_Function.COLUMNNAME_Synchronized);
						if (sync != null)
						{
							if (srcsynchro.compareTo(sync) == 0)
							{
								goahead = false;
							}
						}
						break;
					}
				}
				if (goahead)
				{
					deleteFunction((String) ref.Name(), ref.Arguments());
					// ahora creamos
					// aca se crean los sp del core
					try {
						if (ref.Extension().length() > 0)
						{
							int no = DB.executeUpdate("CREATE EXTENSION IF NOT EXISTS "+ref.Extension()+" SCHEMA xendra", null);
							if (no == -1)
							{
								no = DB.executeUpdate("CREATE EXTENSION "+ref.Extension()+" SCHEMA xendra FROM unpackaged;", null);
							}
						}
						Method getComments = clazzref.getMethod("getComments", null);
						String comments = (String) getComments.invoke(null, null);
						Method getCode = clazzref.getMethod("getCode", null);
						String code = (String) getCode.invoke(null, null);
						StringBuilder[] sqllist = {
								new StringBuilder("CREATE OR REPLACE FUNCTION xendra.")
								.append((String) ref.Name())
								.append("(").append(ref.Arguments()).append(")\n")
								.append("RETURNS ").append(ref.Output()).append(" AS ")
								.append("$BODY$")
								.append(code)
								.append("$BODY$\n")
								.append("LANGUAGE ").append(ref.Language()).append(" VOLATILE\n")
								.append("COST 100;\n"),
								new StringBuilder("ALTER FUNCTION xendra.")
								.append(ref.Name())
								.append("(").append(ref.Arguments()).append(")")
								.append(" OWNER TO ").append(ref.Owner()).append(";"),
								new StringBuilder("COMMENT ON FUNCTION xendra.")
								.append(ref.Name()).append("(").append(ref.Arguments()).append(")")
								.append(" IS '").append(comments).append("'") };
						executesql(sqllist, (String) key);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					finally
					{

					}
				}
				i++;
			}
			//
			for (ElementProperties pp:prevstorproc)
			{
				if (!pp.isProcessed())
				{
					String name = (String) pp.getval(X_AD_Function.COLUMNNAME_Name);
					String arguments = ExtractTypesfromArgument((String) pp.getval(X_AD_Function.COLUMNNAME_Arguments));
					pstmt = DB.prepareStatement(storeprocedurestoxml.getSQLAllStoreProcedures(name, arguments), null);
					rs = pstmt.executeQuery();
					if  (!rs.next())
					{
						String identifier = (String) pp.getval(X_AD_Function.COLUMNNAME_Identifier);
						if (identifier == null)
						{
							pp.setval(X_AD_Function.COLUMNNAME_Identifier, Util.getUUID());
						}
						StringBuilder[] sqllist = {
								new StringBuilder("CREATE OR REPLACE FUNCTION xendra.")
								.append((String) pp.getval(X_AD_Function.COLUMNNAME_Name))
								.append("(").append(pp.getval(X_AD_Function.COLUMNNAME_Arguments)).append(")\n")
								.append("RETURNS ").append(pp.getval(X_AD_Function.COLUMNNAME_Output)).append(" AS ")
								.append("$BODY$")
								.append(pp.getval(X_AD_Function.COLUMNNAME_Code))
								.append("$BODY$\n")
								.append("LANGUAGE ").append(pp.getval(X_AD_Function.COLUMNNAME_Language)).append(" VOLATILE\n")
								.append("COST 100;\n"),
								new StringBuilder("ALTER FUNCTION xendra.")
								.append(pp.getval(X_AD_Function.COLUMNNAME_Name))
								.append("(").append(pp.getval(X_AD_Function.COLUMNNAME_Arguments)).append(")")
								.append(" OWNER TO ").append(pp.getval(X_AD_Function.COLUMNNAME_Owner)).append(";"),
								new StringBuilder("COMMENT ON FUNCTION xendra.")
								.append(pp.getval(X_AD_Function.COLUMNNAME_Name))
								.append("(").append(pp.getval(X_AD_Function.COLUMNNAME_Arguments)).append(")")
								.append(" IS '").append(pp.getval(X_AD_Function.COLUMNNAME_Comments)).append("'") };
						executesql(sqllist, (String) pp.getval(X_AD_Function.COLUMNNAME_Identifier));
					}
					pstmt.close();
					rs.close();
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			setDBTarget(m_cc);
		}
	}	

	public void UpdateOperators() {
		CConnection m_cc = CConnection.get();			
		setDatabaseSystem(m_cc);		
		try {

			List<ElementProperties> prevoperators = new ArrayList<ElementProperties>();
			Trx trx = Trx.get(Trx.createTrxName(), true);
			String trxName = trx.getTrxName();
			trx.start();					
			PreparedStatement pstmt = DB.prepareStatement(Querys.GETOPERATORS, trxName);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				ElementProperties ep = new ElementProperties();
				Hashtable props = Util.getProperties(rs.getString(X_AD_Operator.COLUMNNAME_Description));
				String opername = "";
				int funcstart = rs.getString("operproc").indexOf(".");
				if (funcstart > 0)
					opername = rs.getString("operproc").substring(funcstart+1);
				else
					opername = rs.getString("operproc");
				opername = Util.getStringclean(opername);
				String funcname = Util.getStringclean(String.format("%s_%s", opername,rs.getString("lefttype")));	
				ep.addval(X_AD_Function.COLUMNNAME_Name, funcname);
				ep.addval(X_AD_Operator.COLUMNNAME_OprName,		rs.getString("oprname"));
				ep.addval(X_AD_Operator.COLUMNNAME_OprProc,		rs.getString("operproc"));
				ep.addval(X_AD_Operator.COLUMNNAME_LeftType, 	rs.getString("lefttype"));
				ep.addval(X_AD_Operator.COLUMNNAME_RightType,	rs.getString("righttype"));
				ep.addval(X_AD_Operator.COLUMNNAME_CompOp, 		rs.getString("compop"));
				ep.addval(X_AD_Operator.COLUMNNAME_Owner, 		rs.getString("owner"));
				ep.addval(X_AD_Operator.COLUMNNAME_Description, 	rs.getString("description"));
				Iterator keys = props.keySet().iterator();
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					ep.addval(key, value);
				}
				prevoperators.add(ep);
			}
			trx.commit();
			trx.close();
			ComponentScanner scanner = new ComponentScanner();
			operators = scanner.getClasses(	new ComponentQuery()
			{
				protected void query() {
					select().from("org.compiere.model.operator").returning(all());
				}
			});				
			float i = 1;
			float rows = operators.size();
			Iterator it = operators.iterator();
			while (it.hasNext())
			{			
				Object processclass = it.next();					
				Class<?> clazzref = Class.forName(((Class) processclass).getName());			
				if (pbar != null) {
					float p = (i / rows) * 100;
					checklabel.setText(clazzref.getName());					
					pbar.setValue((int) p);					
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}													
				}												
				XendraOperator ref = clazzref.getField(X_AD_Reference.COLUMNNAME_Identifier).getAnnotation(XendraOperator.class);
				String key = ref.Identifier();
				Timestamp srcsynchro = Timestamp.valueOf(ref.Synchronized());
				boolean goahead = true;
				for (ElementProperties pp:prevoperators)
				{
					String opername = "";

					int funcstart = ref.OprProc().indexOf(".");
					if (funcstart > 0)
						opername = ref.OprProc().substring(funcstart+1);
					else
						opername = ref.OprProc();
					String funcname = Util.getStringclean(String.format("%s_%s",opername,ref.LeftType()));						
					if ( funcname.equals(pp.getval(X_AD_Function.COLUMNNAME_Name)))
					{
						Timestamp sync  = (Timestamp) pp.getval(X_AD_Function.COLUMNNAME_Synchronized);
						if (sync != null)
						{
							if (srcsynchro.compareTo(sync) == 0)
							{
								goahead = false;
							}
						}
						if (!goahead)
						{
							goahead = true;
							Hashtable props = Util.getProperties((String) pp.getval(X_AD_Operator.COLUMNNAME_Description));
							Iterator keys = props.keySet().iterator();
							while (keys.hasNext())
							{
								String keyid = (String)keys.next();
								if (keyid.equals(X_AD_Reference.COLUMNNAME_Identifier))
									goahead = false;
							}							
						}
						break;						
					}
				}
				if (goahead)
				{					
					delete(Querys.OPERATOR,String.format("xendra.%s(%s,%s)", ref.OprName(),ref.LeftType(), ref.RightType()));
					Method getComments = clazzref.getMethod("getComments", null);
					String comments = (String) getComments.invoke(null, null);					
					int no = 0;
					StringBuilder[] sqllist = { new StringBuilder("CREATE OPERATOR xendra."+ref.OprName()+"(")
							.append("PROCEDURE = ").append( ref.OprProc()).append(",")
							.append("LEFTARG = ").append(ref.LeftType()).append(",")
							.append("RIGHTARG = ").append(ref.RightType()).append(",")
							.append("COMMUTATOR = ").append(ref.CompOp()).append(");"),
							new StringBuilder("ALTER OPERATOR xendra.").append(ref.OprName())
							.append("(").append(ref.LeftType()).append(",").append(ref.RightType()).append(")")
							.append(" OWNER TO ").append(ref.Owner()),
							new StringBuilder("COMMENT ON OPERATOR xendra.").append(ref.OprName())
							.append("(").append(ref.LeftType()).append(",").append(ref.RightType()).append(")")
							.append(" IS '").append(comments).append("'") };
					executesql(sqllist, (String) key);
				}
				i++;
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();			
		}
		finally
		{
			setDBTarget(m_cc);
		}
	}

	private void createtable(XendraTable table) {
		// realmente no existe la tabla o solo no esta en el AD?
		try {
			ResultSet rs = md.getColumns(catalog, schema, table.TableName().toLowerCase(), null);
			if (!rs.next())
			{
				//sql = table.get
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//	public void UpdateForms() throws Exception {
	//		Class<?> clazzref = Class.forName("org.compiere.model.window.X_AD_WindowList");
	//		for (Object key:forms.keySet()) {
	//			String id = (String) forms.get(key);
	//			XendraForm formref = clazzref.getField(id).getAnnotation(XendraForm.class);
	//			String classname = formref.Classname();				
	//			X_AD_Form form = new Query(Env.getCtx(), X_AD_Form.Table_Name, "classname = ?", null)
	//			.setParameters(classname).first();
	//			if (form == null)
	//			{
	//				form = new X_AD_Form(Env.getCtx(), 0, null);			
	//			}
	//			Timestamp syncform = new Timestamp(System.currentTimeMillis());
	//			String synctext = formref.Synchronized();
	//			if (synctext.length() > 0)
	//				syncform = Timestamp.valueOf(synctext); 
	//			if (form.getSynchronized() == null || form.getSynchronized().compareTo(syncform) <= 0)
	//			{
	//				form.setName(formref.Name());
	//				form.setDescription(formref.Description());
	//				form.setHelp(formref.Help());
	//				form.setIdentifier(formref.Identifier());				
	//				form.setSynchronized(syncform);
	//				form.setAccessLevel(formref.AccessLevel());
	//				form.setEntityType(formref.EntityType());
	//				form.setIsBetaFunctionality(formref.IsBetaFunctionality());
	//				form.setIsMenu(formref.IsMenu());
	//				form.setClassname(formref.Classname());
	//				form.save();
	//				String menuid = formref.AD_Menu_ID();
	//				if (menuid != null && menuid.length() > 0)
	//				{
	//					X_AD_TreeNodeMM mm = null;
	//					List<ExtensionMenuItem> items = new ArrayList<ExtensionMenuItem>();
	//					while (menuid.length() > 0)
	//					{
	//						String valuemenu = (String) menus.get(menuid);
	//						XendraMenu menu = null;
	//						// xapiens
	//						//Field fm = X_AD_WindowList.class.getDeclaredField(valuemenu);
	//						Field fm = X_AD_Window.class.getDeclaredField(valuemenu);
	//						for (Annotation apm: fm.getAnnotations()) {
	//							if (apm.annotationType() == XendraMenu.class) {
	//								menu = (XendraMenu) apm;
	//								ExtensionMenuItem emi = new ExtensionMenuItem();
	//								emi.setName(menu.Name());
	//								emi.setDescription(menu.Description());
	//								emi.setIsSummary(menu.IsSummary());
	//								emi.setIsSOTrx(menu.IsSOTrx());
	//								emi.setIsReadOnly(menu.IsReadOnly());
	//								emi.setParent_ID(menu.Parent_ID());
	//								emi.setIdentifier(menu.Identifier());
	//								emi.setID(Integer.valueOf(menu.AD_Menu_ID()));
	//								if (menu.Identifier().equals(formref.AD_Menu_ID()))
	//								{
	//									emi.setAction(REF_AD_MenuAction.Form);		
	//									emi.setAD_Form_ID(form.getIdentifier());
	//								}
	//								emi.setLevel(Integer.valueOf(menu.level()));
	//								emi.setEntityType(REF__EntityType.Dictionary);
	//								String tstamp = menu.Synchronized();
	//								Timestamp sync = Timestamp.valueOf(tstamp);
	//								emi.setSynchronized(sync);
	//								items.add(emi);
	//								menuid = menu.Parent_ID();
	//								//
	//								//								for (Field ftrl:X_AD_WindowList.class.getDeclaredFields())
	//								//								{
	//								//									for (Annotation trlanno: ftrl.getAnnotations()) {
	//								//										if (trlanno.annotationType() == XendraTrl.class) {
	//								//											XendraTrl trlannotation  = (XendraTrl) trlanno;
	//								//											if (trlannotation.Identifier().equals(emi.getIdentifier()))
	//								//											{
	//								//												List<String> def = new ArrayList<String>();
	//								//												String var = ftrl.getName();
	//								//												StringTokenizer st = new StringTokenizer(var, "_", false);
	//								//												while (st.hasMoreTokens())
	//								//												{
	//								//													String xx = st.nextToken().trim();
	//								//													def.add(xx);
	//								//												}	
	//								//												String lang = String.format("%s_%s", def.get(0),def.get(1));
	//								//												String type = def.get(2);
	//								//												String name = "";
	//								//												for (int i=3; i < def.size()-1; i++)
	//								//												{
	//								//													if (name.length() > 0)
	//								//														name += "_";
	//								//													name += def.get(i);
	//								//												}
	//								//												String subname = def.get(def.size()-1);
	//								//												//var.indexOf("_TAB_");
	//								//												String translate = (String) ftrl.get(ftrl.getName());
	//								//												Vector vector = new Vector();					
	//								//												vector.add(lang);			
	//								//												vector.add(name);
	//								//												vector.add(subname);
	//								//												vector.add(translate);					
	//								//												vector.add(trlannotation.Identifier());						
	//								//												if (type.equals("TAB"))							
	//								//													vector.add(X_AD_Tab.Table_Name);
	//								//												else if (type.equals("COLUMN"))
	//								//													vector.add(X_AD_Column.Table_Name);
	//								//												else if (type.equals("FIELD"))
	//								//													vector.add(X_AD_Field.Table_Name);
	//								//												else if (type.equals("TABLE"))
	//								//													vector.add(X_AD_Table.Table_Name);		
	//								//												else if (type.equals("MENU"))
	//								//													vector.add(X_AD_Menu.Table_Name);
	//								//												else
	//								//													System.out.println("X");
	//								//												translations.add(vector);																
	//								//											}
	//								//										}
	//								//									}
	//								//								}
	//							}
	//						}								
	//					}
	//					//
	//					boolean goahead = true;
	//					for (int i = 1; i < 10; i ++)
	//					{
	//						if (goahead)
	//						{
	//							for (ExtensionMenuItem item:items)
	//							{
	//								if (item.getLevel() == i)
	//								{
	//									X_AD_Menu dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
	//									.setParameters(item.getIdentifier()).first();
	//									if (dbmenu == null)
	//									{
	//										dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
	//										.setParameters(item.getID()).first();
	//										if (dbmenu != null)
	//										{
	//											if (item.getName().toLowerCase().equals(dbmenu.getName().toLowerCase()))
	//											{
	//												dbmenu.setIdentifier(item.getIdentifier());
	//												dbmenu.setSynchronized(null);
	//											}
	//											else
	//											{
	//												dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "Name = ?", null)
	//												.setParameters(item.getName()).first();
	//												if (dbmenu != null)
	//												{
	//													StringBuilder sb = new StringBuilder("WITH RECURSIVE fulltree(node_id, parent_id) as (");
	//													sb.append("SELECT node_id, parent_id FROM AD_TreeNodeMM WHERE node_id = ? ")
	//													.append("	UNION ALL ")
	//													.append(" SELECT t.node_id,t.parent_id from AD_TreeNodeMM t, fulltree ft where t.node_id = ft.parent_id ) ")
	//													.append("SELECT count(*) from fulltree");
	//													int level = DB.getSQLValue(null, sb.toString(), dbmenu.getAD_Menu_ID());
	//													if (level == item.getLevel())
	//													{
	//														dbmenu.setIdentifier(item.getIdentifier());
	//														dbmenu.setSynchronized(null);
	//													}
	//													else
	//													{
	//														dbmenu = null;
	//													}
	//												}
	//											}
	//										}											
	//										if (dbmenu == null)
	//										{
	//											dbmenu = new X_AD_Menu(Env.getCtx(), 0 , null);
	//											dbmenu.setIdentifier(item.getIdentifier());
	//										}
	//										//
	//									}
	//									Timestamp menusync = item.getSynchronized();
	//									if (dbmenu.getSynchronized() == null || menusync.compareTo(dbmenu.getSynchronized()) != 0)
	//									{
	//										dbmenu.setName(item.getName());
	//										dbmenu.setDescription(item.getDescription());
	//										dbmenu.setIsSummary(item.getIsSummary());
	//										dbmenu.setIsSOTrx(item.getIsSOTrx());
	//										dbmenu.setIsReadOnly(item.getIsReadOnly());			
	//										if (item.getAction().length() > 0)
	//											dbmenu.setAction(item.getAction());
	//										if (item.getAD_Window_ID() > 0)
	//										{
	//											dbmenu.setAD_Window_ID(item.getAD_Window_ID());
	//										}
	//										//										if (item.getAD_Process_ID().length() > 0)
	//										//										{
	//										//											X_AD_Process process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
	//										//											.setParameters(item.getAD_Process_ID()).first();
	//										//											if (process != null)
	//										//											{
	//										//												dbmenu.setAD_Process_ID(process.getAD_Process_ID());		
	//										//											}
	//										//										}					
	//										dbmenu.setEntityType(item.getEntityType());															
	//										dbmenu.setSynchronized(menusync);
	//										if (!dbmenu.save())
	//											goahead = false;
	//									}											
	//									if (goahead)
	//									{
	//										boolean isnewmm = false;
	//										mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
	//										.setParameters(dbmenu.getAD_Menu_ID()).first();
	//										if (mm == null)
	//										{																				
	//											if (MTree_Base.addNode(Env.getCtx(), REF_AD_TreeTypeType.Menu, dbmenu.getAD_Menu_ID(), null))
	//											{
	//												mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
	//												.setParameters(dbmenu.getAD_Menu_ID()).first();
	//												isnewmm = true;
	//											}
	//										}	
	//										int parent = 0;
	//										if (item.getParent_ID().length() > 0)
	//										{
	//											X_AD_Menu parentitem = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
	//											.setParameters(item.getParent_ID()).first();
	//											if (parentitem != null)
	//											{
	//												parent = parentitem.getAD_Menu_ID();
	//												mm.setParent_ID(parentitem.getAD_Menu_ID());
	//											}												
	//											else
	//											{
	//												System.out.println("aca hay una excepcion");
	//											}
	//										}
	//										if (isnewmm)
	//										{
	//											int no = 0;
	//											int count = DB.getSQLValue(null, "SELECT count(*) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", parent);
	//											if (count > 0)
	//											{
	//												no = DB.getSQLValue(null, "SELECT MAX(seqno) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", parent);
	//												no++;
	//											}											
	//											mm.setSeqNo(no);
	//										}
	//										mm.save();
	//									}
	//								}
	//							}
	//						}
	//					}
	//				}				
	//			}
	//		}
	//	}
	public Set<Class<?extends SvrProcess>> getProcess(final String domain) {
		final Set<Class<? extends SvrProcess>> processes2 = new HashSet<Class<? extends SvrProcess>>();
		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(	new ComponentQuery() 
		{
			protected void query() {
				select().from(domain).andStore(thoseExtending(SvrProcess.class).into(processes2));					
			}
		});							
		return processes2;
	}

	public void UpdateProcess() {
		try {
			// processes
			final Set<Class<? extends SvrProcess>> compiereprocesses = getProcess("org.compiere.process");
			processprocess(compiereprocesses);
			final Set<Class<? extends SvrProcess>> xendraprocesses = getProcess("org.xendra.process");
			processprocess(xendraprocesses);
			//final Set<Class<? extends SvrProcess>> processes = new HashSet<Class<? extends SvrProcess>>();
			//ComponentScanner scanner = new ComponentScanner();
			//scanner.getClasses(	new ComponentQuery() 
			//{
			//	protected void query() {
			//		select().from("org.xendra.process").andStore(thoseExtending(SvrProcess.class).into(processes));					
			//	}
			//});					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void processprocess(Set<Class<? extends SvrProcess>> processes) {
		try {
			Iterator it = processes.iterator();
			float i = 1;
			float rows = processes.size();
			while (it.hasNext()) {			
				boolean goahead = true;			
				Object processclass = it.next();					
				Class<?> clazz = null;
				clazz = Class.forName(((Class) processclass).getName());
				String classname = clazz.getName();
				if (pbar != null) {
					float p = (i / rows) * 100;
					checklabel.setText(classname);					
					pbar.setValue((int) p);					
					try {
						gui.updateScreen();
					} catch (IOException e2) {
						e2.printStackTrace();
					}													
				}
				if (this.IsModeServer())
					System.out.println(classname);
				else
					addLine(classname);
				XendraProcess proc = null;
				XendraScheduler scheduler = null;
				Annotation[] annots = clazz.getAnnotations();
				if (annots.length == 0) {
					goahead = false;
				} else {				
					for (Annotation annot:annots) {
						if (annot instanceof Deprecated) {
							goahead = false;
							break;
						} else if (annot.annotationType() == XendraProcess.class) {
							proc = (XendraProcess) annot;
						} else if (annot.annotationType() == XendraScheduler.class) {
							scheduler = (XendraScheduler) annot;
						}			
					}
				}
				if (goahead && proc != null) {												
					String Identifier = proc.Identifier();					
					String updated = proc.updated();
					Timestamp t = null;
					try {
						t = Timestamp.valueOf(updated);						
					} catch (Exception e) {} 										
					if (Identifier == null || updated == null)
						continue;					
					MProcess process = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
							.setParameters(classname).first();
					if (process != null) {
						if (process.getIdentifier().compareTo(Identifier)!= 0) {
							process.setIdentifier(Identifier);
							process.save();
						}
					} 
					else if (process == null)
					{						
						process = new MProcess(Env.getCtx(), 0, null);
						process.setIdentifier(Identifier);
						process.setValue(proc.value());
						process.setName(proc.name());
						process.setEntityType(REF__EntityType.Dictionary);
						process.setDescription(proc.description());
						process.setHelp(proc.help());
						process.setIdentifier(Identifier);
						process.setClassname(proc.classname());
						process.setSynchronized(t);
						if (!process.save())
						{
							throw new Exception("no se pudo grabar proceso nuevo");
						}
						else
						{

						}
					}		
					if (scheduler != null) {
						X_AD_Process_Machine pm = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "A_Machine_ID = ? AND AD_Process_ID = ?" , null)
								.setParameters(Env.getMachine().getA_Machine_ID(), process.getAD_Process_ID()).first();
						if (pm == null)
						{
							pm = new X_AD_Process_Machine(Env.getCtx(), 0, null);
							pm.setA_Machine_ID(Env.getMachine().getA_Machine_ID());
							pm.setAD_Process_ID(process.getAD_Process_ID());
							pm.save();
						}					
						//
						X_AD_Scheduler dbscheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Process_ID = ?", null)
								.setParameters(process.getAD_Process_ID()).first();
						if (dbscheduler == null) {
							dbscheduler = new X_AD_Scheduler(Env.getCtx(), 0, null);
						}
						if (dbscheduler.getSynchronized() == null || 
								dbscheduler.getSynchronized().compareTo(t) != 0)
						{						
							dbscheduler.setName(scheduler.name());
							dbscheduler.setAD_Process_ID(process.getAD_Process_ID());
							dbscheduler.setFrequencyType(scheduler.frequencytype());
							dbscheduler.setFrequency(Integer.valueOf(scheduler.frequency()));
							String freqstartat = scheduler.frequencystartat();
							if (freqstartat != null && freqstartat.length() > 0) {
								Integer startat = Integer.valueOf(freqstartat);
								dbscheduler.setFrequencyStartAt(startat);
							}
							dbscheduler.setSupervisor_ID(100);
							dbscheduler.setKeepLogDays(Integer.valueOf(scheduler.keeplogdays()));
							dbscheduler.setScheduleType(REF_AD_SchedulerType.Frequency);						
							dbscheduler.setTag(scheduler.tag());
							dbscheduler.setSynchronized(t);
							dbscheduler.save();
						}						
					}
					Timestamp Synchronized = Timestamp.valueOf(proc.updated());
					if ( process.getSynchronized() == null || Synchronized.compareTo(process.getSynchronized()) != 0)
					{								
						// eliminamos los parametros existentes
						if (!process.is_new())
						{						
							if (this.IsModeServer())
								log.log(Level.WARNING, String.format("Update Process %s", process.getName()));
							else								
								addLine(String.format("Update Process %s", process.getName()));
							List<X_AD_Process_Para> paramlist = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ?", null)
									.setParameters(process.getAD_Process_ID()).list();
							for (X_AD_Process_Para param:paramlist)
							{
								param.delete(true);
							}
						}
						else
						{														
							if (IsModeServer())
								log.log(Level.WARNING, String.format("Adding process %s", process.getName()));
							else
								addLine(String.format("Adding process %s", process.getName()));
						}
					}					
					for (Field f:clazz.getDeclaredFields()) {						
						for (Annotation ap: f.getAnnotations()) {
							if (ap.annotationType() == XendraProcessParameter.class) {
								XendraProcessParameter pp = (XendraProcessParameter) ap;
								X_AD_Element element = new Query(Env.getCtx(), X_AD_Element.Table_Name, "ColumnName=?", null)
										.setParameters(pp.ColumnName()).first();
								if (element == null)
								{
									element = new X_AD_Element(Env.getCtx(), 0, null);
									element.setName(pp.Name());
									element.setPrintName(pp.Name());
									element.setColumnName(pp.ColumnName());
									element.setDescription(pp.Description());
									element.setHelp(pp.Help());
									element.save();
								}
								MProcessPara mpp = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ? AND ColumnName = ?", null)
										.setParameters(process.getAD_Process_ID(), element.getColumnName()).first();
								if (mpp == null)
									mpp = new MProcessPara(Env.getCtx(),0 , null);
								mpp.setAD_Process_ID(process.getAD_Process_ID());
								mpp.setAD_Element_ID(element.getAD_Element_ID());
								mpp.setName(element.getName());
								mpp.setEntityType(REF__EntityType.Dictionary);
								mpp.setColumnName(element.getColumnName());
								mpp.setDescription(element.getDescription());
								mpp.setHelp(element.getHelp());

								mpp.setSeqNo(pp.SeqNo());
								mpp.setAD_Reference_ID(pp.AD_Reference_ID());
								String ReferenceID = pp.ReferenceValueID();
								if (ReferenceID != null && ReferenceID.length() > 0)
								{
									X_AD_Reference ref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier =  ?", null)
											.setParameters(ReferenceID).first();
									if (ref != null)
									{
										mpp.setAD_Reference_Value_ID(ref.getAD_Reference_ID());
									}												
								}

								String ValRuleID = pp.ValRuleID();
								if (ValRuleID != null && ValRuleID.length() > 0)
								{																								
									X_AD_Val_Rule valrule = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "identifier=?", null)
											.setParameters(ValRuleID).first();
									if (valrule != null)
									{
										mpp.setAD_Val_Rule_ID(valrule.getAD_Val_Rule_ID());
									}
								}
								Integer FieldLength = Integer.valueOf(pp.FieldLength());
								mpp.setFieldLength(FieldLength);
								mpp.setIsMandatory(pp.IsMandatory());
								mpp.setIsRange(pp.IsRange());
								mpp.setDefaultValue(pp.DefaultValue());
								mpp.setDefaultValue2(pp.DefaultValue2());
								mpp.setVFormat(pp.vFormat());
								mpp.setValueMin(pp.valueMin());
								mpp.setValueMax(pp.valueMax());
								mpp.setDisplayLogic(pp.DisplayLogic());
								mpp.setReadOnlyLogic(pp.ReadOnlyLogic());											
								mpp.setIdentifier(pp.Identifier());
								mpp.save();							
							}
						}
					}
					process.setSynchronized(Synchronized);
					process.save();
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void Replication() throws Exception {		
		//String corereplication = (String) Env.getMachine().getProperties().get(Constants.REPLICATION);
		List<X_AD_Plugin> plugins = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "IsInstalled = 'N' AND IsActive='Y' ", null).list();
		for (X_AD_Plugin plugin:plugins)
		{
			String id = plugin.getID();
			//File replicationFile = new File(String.format("%s%s%s",corereplication,File.separator,id));
			File replicationFile = new File(String.format("%s%s%s",Env.getMachine().getReplicationFolder(),File.separator,id));
			int errors = 0;
			if (replicationFile.exists()) {
				for (final File file : replicationFile.listFiles()) {
					if (file.isFile()) {
						String error = parsereplicatefile(plugin.getFileName(), file);
						if (error.length() > 0)
							errors++;
					}
				}		
				if (errors == 0)
				{					
					plugin.setIsInstalled(true);
					plugin.save();
				}
			}				
		}		
	}
	public String parsereplicatefile(String pluginfilename, File file) {
		String error = "";
		//String result = new XendrianServer().setServlet("store").setType("client").setFileName(pluginfilename).start();
		//InputStream stream = new ByteArrayInputStream(result.getBytes());
		//Document doc = XMLCoreParser.retrieveDocument(stream);
		//Element clientElement = doc.getRootElement();
		//String instanceid = clientElement.getAttributeValue("id");
		//X_AD_Plugin_Instance pi = new Query(Env.getCtx(), X_AD_Plugin_Instance.Table_Name, "AD_Plugin_Instance_ID = ?", null)
		//.setParameters(Integer.valueOf(instanceid)).first();		
		String clientid = new XendrianServer().setServlet("store").getProperty("client");
		if (clientid.length() == 0) 
			error = "SyncModel instance plugin reference not found";
		else {
			X_AD_Client client = new Query(Env.getCtx(), X_AD_Client.Table_Name, "AD_Client_ID = ?", null)
					.setParameters(Integer.valueOf(clientid)).first();
			if (client != null) {
				ReplicationEngine replication = new ReplicationEngine(client);
				try {
					error = replication.encode(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (error == null) {
					//System.out.println("X");
				}
				if (error.length() > 0)
				{				

					if (IsModeServer()) 
						System.out.println(String.format("%s %s",file,error));
					else
						addLine(String.format("%s %s",file,error));

				}							
				file.delete();		
			}			
		}
		//		if (pi == null) {
		//			error = "SyncModel instance plugin reference not found";
		//		} else {
		//			String clientid = (String) pi.getProperties().get("client");
		//			X_AD_Client client = new Query(Env.getCtx(), X_AD_Client.Table_Name, "AD_Client_ID = ?", null)
		//			.setParameters(Integer.valueOf(clientid)).first();
		//			if (client != null) {
		//				ReplicationEngine replication = new ReplicationEngine(client);
		//				try {
		//					error = replication.encode(file);
		//				} catch (Exception e) {
		//					e.printStackTrace();
		//				}
		//				if (error == null) {
		//					System.out.println("X");
		//				}
		//				if (error.length() > 0)
		//				{				
		//					System.out.println(String.format("%s %s",file,error));
		//				}							
		//				file.delete();		
		//			}
		//		}
		return error;
	}

	public void setCheckReferences(Boolean checkReferences) {
		m_checkReferences = checkReferences;		
	}
}