package org.xendra.newclient.wizard;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.Timer;

import org.columba.core.base.SwingWorker;
import org.columba.core.gui.util.ProgressCircle;
import org.compiere.db.CConnection;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.util.DB;
import org.postgresql.PGConnection;
import org.postgresql.copy.CopyManager;
import org.xendra.newclient.i18n.ResourceLoader;

import com.l2fprod.common.swing.JTipOfTheDay;
import com.l2fprod.common.swing.plaf.basic.BasicTipOfTheDayUI;
import com.l2fprod.common.swing.tips.DefaultTip;
import com.l2fprod.common.swing.tips.DefaultTipModel;
import com.mchange.v2.c3p0.C3P0ProxyConnection;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

public class NewDatabase extends AbstractStep implements ActionListener {
	protected DataModel data;
	private JButton button;
	private CConnection m_cc;
	private ProgressCircle progress;
	private Timer timer;
	private boolean inprocess;
	private String m_dbname;
	private ArrayList<String> fillfiles;		
	public NewDatabase(DataModel data, String dbname, CConnection m_cc) {
		super(ResourceLoader.getString("dialog", "newclient", "databasename"),
				ResourceLoader.getString("dialog", "newclient",   "databasename_description"));		
		this.data = data;
		m_dbname = dbname;
		this.m_cc = m_cc;
		this.setCanGoNext(false);		
		this.inprocess = false;
	}

	protected JComponent createComponent() {
		timer = new Timer(1000, this);
		timer.start();
		JComponent component = new JPanel();
		progress = new ProgressCircle(200,200);
		progress.setPreferredSize(new Dimension(300, 200));
		JPanel panel = new JPanel();
		panel.add(progress);
		JPanel p = new JPanel(new MigLayout());
		p.add(panel, "wrap");
		component.add(p);
		return component; 
	}

	private String getFile(String key) {
		String filename = "";
		for (String file:fillfiles) {
			if (file.contains(key)) {
				filename = file;
				break;
			}						
		}
		return filename;
	}

	public void update(int percent) {
		progress.setProgress(percent);
	}

    final JTipOfTheDay.ShowOnStartupChoice fake = new JTipOfTheDay.ShowOnStartupChoice() {
        private boolean value = true;

        public boolean isShowingOnStartup() {
          return value;
        }
        public void setShowingOnStartup(boolean showOnStartup) {
          value = showOnStartup;
        }
    };
    
	class Task extends SwingWorker {
		private String m_dbuser;
		private String m_dbpwd;
		private String filedst;

		public Task(String dbuser, String dbpwd) {
			m_dbuser = dbuser;
			m_dbpwd = dbpwd;
		}

		public Object construct() {
			String directives = "";
			try {
				m_cc = CConnection.get();
				try {
					InputStream in = getClass().getResourceAsStream("createtables.zip");					
					ZipInputStream zin = new ZipInputStream(in);
					ZipEntry ze = null; 
					while ((ze = zin.getNextEntry()) != null) {
						System.out.println(String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),ze.getName()));
						filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),ze.getName());
						OutputStream out = new FileOutputStream(filedst);
						FileOutputStream fos = new FileOutputStream(filedst);
						byte[] buffer = new byte[8192];
						int len;
						while ((len = zin.read(buffer)) >  0) { 
							out.write(buffer, 0, len);
						}
						out.close();							
					}
					//}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,
						    ex.getMessage(),
						    "warning",
						    JOptionPane.WARNING_MESSAGE);					
				}				
				//
				JOptionPane.showMessageDialog(null,String.format("archivo de carga %s",filedst));									
				File test = new File(filedst);
				InputStream in = new FileInputStream(test);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));			
				String line;
				List<String> linecommands = new ArrayList<String>();
				List<String> commands = new ArrayList<String>();
				boolean breaksegment = true;
				while ((line = reader.readLine()) != null) {
					if (line.contains("TOC entry") && linecommands.size() > 0) {
						StringBuilder sb = new StringBuilder();
						for (String linecommand:linecommands) {
							if (linecommand.length() > 0) {
								sb.append(linecommand);
								sb.append(System.getProperty("line.separator"));
							}
						}
						if (sb.toString().contains("SET check_function_bodies"))
							directives = sb.toString();
						else
							commands.add(sb.toString());
						linecommands.clear();
					} else {
						if (line.length() > 0) {
							linecommands.add(line);
						}
					}				
				}				
				int percent = 0;
				float current = 0;
				float total = commands.size();
				reader.close();			
				for (String command:commands) {
					int no = DB.executeUpdate(directives+command,null);
					if (no == -1) {
						JOptionPane.showMessageDialog(null,String.format("error %s",directives+command));
					}				
					current++;
					percent = (int) (( current / total ) * 100);
					update(percent);				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// filldatabase
			try {
				fillfiles = new ArrayList<String>();
				InputStream in = getClass().getResourceAsStream("filltables.zip");
				ZipInputStream zin = new ZipInputStream(in);
				ZipEntry ze = null; 
				while ((ze = zin.getNextEntry()) != null) {
					System.out.println(String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),ze.getName()));
					String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),ze.getName());
					OutputStream out = new FileOutputStream(filedst);
					FileOutputStream fos = new FileOutputStream(filedst);
					byte[] buffer = new byte[8192];
					int len;
					while ((len = zin.read(buffer)) >  0) { 
						out.write(buffer, 0, len);
					}
					out.close();
					fillfiles.add(filedst);											
				}							
				JOptionPane.showMessageDialog(null,String.format("cargando %s",fillfiles.toString()));
				//populatedatabase();
				C3P0ProxyConnection proxycon = (C3P0ProxyConnection) DB.getConnectionRW();
				Method m = PGConnection.class.getMethod("getCopyAPI", new Class[]{});
				Object[] arg = new Object[] {};
				CopyManager copyManager = (CopyManager) proxycon.rawConnectionOperation(m, 
						C3P0ProxyConnection.RAW_CONNECTION, arg);
				long records;
				String cpcommand = "COPY %s FROM STDIN WITH (FORMAT csv, header false, delimiter '|')";
				List<String> tables = new ArrayList<String>();
				tables.add("ad_client");
				tables.add("ad_org");
				tables.add("ad_role");
				tables.add("ad_role_orgaccess");					
				tables.add("ad_element");					
				tables.add("ad_reference");
				tables.add("ad_language");  // all translations MUST BE below ad_language for foreign key constraints					
				tables.add("ad_element_trl");
				tables.add("ad_reference_trl");
				tables.add("ad_ref_list");					
				tables.add("ad_ref_list_trl");					
				tables.add("ad_image");
				tables.add("ad_window");	
				// sin esta tabla no se accede a las ventanas en idioma diferente al default
				tables.add("ad_window_trl");
				tables.add("ad_val_rule");
				tables.add("ad_printfont");
				tables.add("ad_printcolor");
				tables.add("ad_printtableformat");
				tables.add("ad_printpaper");			
				tables.add("ad_table");
				tables.add("ad_table_trl");
				tables.add("ad_reportview");
				tables.add("ad_printformat");			
				// ad_process depends of reportview			
				// ad_process depends of ad_printformat
				tables.add("ad_process");
				tables.add("ad_process_trl");
				// ad_column depends of ad_table
				tables.add("ad_column");
				tables.add("ad_column_trl");
				tables.add("ad_tab");
				tables.add("ad_tab_trl");
				tables.add("ad_entitytype");
				tables.add("ad_fieldgroup");
				tables.add("ad_fieldgroup_trl");
				tables.add("ad_field");					
				tables.add("ad_field_trl");
				tables.add("ad_ref_table");
				// ad_reportview depends of ad_column
				tables.add("ad_message");
				tables.add("ad_message_trl"); // <-- used by Env.verifyLanguage to determine the language
				tables.add("ad_system");					
				tables.add("ad_user");
				tables.add("ad_user_roles");					
				// currency
				tables.add("c_currency");
				tables.add("c_country");
				tables.add("c_region");
				tables.add("c_city");					
				tables.add("c_subject");					
				tables.add("ad_preference");
				tables.add("ad_impformat");
				tables.add("ad_impformat_row");
				// needed by ad_workflow
				tables.add("ad_wf_responsible");
				// ad_form ad_workflow ad_task ad_window before ad_menu
				tables.add("ad_form");		 			
				tables.add("ad_form_trl");
				tables.add("ad_workbench");
				tables.add("ad_task");
				tables.add("ad_workflow");
				tables.add("ad_menu");
				tables.add("ad_menu_trl");
				tables.add("ad_tree");
				// depends of tree sin el no hay menu principal en system
				tables.add("ad_clientinfo");
				tables.add("ad_treenode");
				tables.add("ad_treenodebp");
				tables.add("ad_treenodemm");					
				tables.add("ad_task_access");
				tables.add("ad_form_access");
				tables.add("ad_tool_access");
				tables.add("ad_private_access");
				tables.add("ad_column_access");
				tables.add("ad_plugin_access");
				tables.add("ad_process_access");
				tables.add("ad_record_access");
				tables.add("ad_window_access");
				tables.add("ad_table_access");					
				//
				//tables.add("c_bp_group");
				tables.add("c_bp_doctype");
				tables.add("m_product_category");
				tables.add("m_attributeset");
				tables.add("m_attributesetinstance");
				tables.add("ad_plugin");
				tables.add("ad_package");
				tables.add("a_printerdriver");
				tables.add("c_taxcategory");
				tables.add("c_taxcategory_trl");
				tables.add("c_tax");
				tables.add("c_tax_trl");
				tables.add("c_uom");
				tables.add("c_uom_trl");
				tables.add("ad_process_para");
				tables.add("ad_process_para_trl");
				// depends of ad_user									
				tables.add("ad_workflow_access");
				tables.add("ad_wf_node");
				tables.add("ad_wf_node_trl");
				tables.add("ad_wf_nodenext");
				tables.add("c_conversiontype");
				tables.add("c_documenttax");
				for (String table:tables) {
					try {
						records = copyManager.copyIn(String.format(cpcommand, table), new FileReader(getFile(String.format("%s.csv", table))));
						System.out.println(String.format("copy %s:%s record(s)", table, records));
					} catch (Exception e) {
						System.out.println(String.format("Table with error %s", table));
						e.printStackTrace();
					}
				}					
				//}	
			} catch (Exception e) {
				e.printStackTrace();
			}			
			return directives;		        
		}

		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			setCanGoNext(true);
		}

	}	
	public void prepareRendering() {
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource().equals(timer)) {
			timer.stop();
			String dbuser = (String) data.getData(X_AD_User.COLUMNNAME_AD_User_ID);
			char[] password = (char[]) data.getData(X_AD_User.COLUMNNAME_Password);
			String dbpwd = String.valueOf(password);			
			CConnection new_cc = CConnection.get(m_cc.getDbHost(), m_cc.getDbPort(), m_cc.getDbName(), dbuser, dbpwd);
			DB.setDBTarget(new_cc);									
			int no = DB.executeUpdate(String.format("CREATE DATABASE %S WITH OWNER = %s ENCODING = 'UTF8'",m_dbname,m_cc.getDbUid()),null);
			m_cc.setDbName(m_dbname);
			m_cc.setDbUid(dbuser);
			m_cc.setDbPwd(dbpwd);
			DB.setDBTarget(m_cc);
			Exception e = m_cc.testDatabase(true);
			if (e == null) {
				Task tsk = new Task(dbuser, dbpwd);
				tsk.start();
			}			
		}		
	}
}
