package org.xendra.ruleeditor.wizard.exportsession;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import javax.swing.tree.TreePath;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Table_Access;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.gui.propertysheet.KieBaseBean;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class ExportSessionCreator  implements WizardModelListener {
	private static CLogger 		log = CLogger.getCLogger(ExportSessionCreator.class);
	private AbstractFolder f;
	private DataModel data;
	private List<X_AD_Rule> kiebases;
	private String filedir;
	private List<X_AD_Rule> groups;
	public ExportSessionCreator(AbstractFolder f, DataModel data) {
		this.f = f;
		this.data = data;
	}
	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void wizardFinished(WizardModelEvent e) {
		//List<X_AD_Rule> models = new ArrayList<X_AD_Rule>();
		List<X_AD_Rule> alonerules = new ArrayList<X_AD_Rule>();
		groups = new ArrayList<X_AD_Rule>();
		kiebases = new ArrayList<X_AD_Rule>();
		X_AD_Plugin plugin = null; 
		filedir = (String) data.getData(X_AD_Table_Access.COLUMNNAME_IsCanExport);
		TreePath[] paths = (TreePath[]) data.getData(X_AD_Rule.COLUMNNAME_Lockout);
		for (TreePath path:paths) {
			AbstractFolder node = (AbstractFolder) path.getLastPathComponent();			
			String m_type = node.getElement().getName();
			if (m_type == "kiebase") {
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(Integer.valueOf(node.getElement().getAttributeValue("uid"))).first();
				if (rule != null) {
					kiebases.add(rule);
				}							
			} else if (m_type == "rule") {
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(Integer.valueOf(node.getElement().getAttributeValue("uid"))).first();
				if (rule != null) {
					alonerules.add(rule);
				}											
			} else if (m_type == "group") {
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(Integer.valueOf(node.getElement().getAttributeValue("uid"))).first();
				if (rule != null) {
					groups.add(rule);
				}				
			} else if (m_type == "plugin") {
				plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
				.setParameters(Integer.valueOf(node.getElement().getAttributeValue("uid"))).first();
			} 
			//			else if (m_type.equals("model")) {
			//				X_AD_Rule model = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
			//				.setParameters(Integer.valueOf(item.get("uid"))).first();
			//				models.add(model);				
			//			} 			
		}
		if (plugin != null) {
			scangroups();
			//			for (X_AD_Rule model:models) {
			//				StringBuilder parent = new StringBuilder();
			//				parent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			//				if (model.getSynchronized() == null) {
			//					model.setSynchronized(new Timestamp(System.currentTimeMillis()));
			//					model.save();
			//				}				
			//				HashMap props = model.getProperties();
			//				String tableid = (String) props.get(X_AD_Table.COLUMNNAME_AD_Table_ID);
			//				X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
			//				.setParameters(Integer.valueOf(tableid)).first();
			//				parent.append(String.format("<model %s=\"%s\" ", Constants.XML_ATTRIBUTE_NAME, model.getName()));
			//				parent.append(String.format("%s=\"%s\" ",X_AD_Table.COLUMNNAME_AD_Table_ID, t.getIdentifier()));
			//				parent.append(String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Classname, props.get(X_AD_Process.COLUMNNAME_Classname)));
			//				parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_IDENTIFIER, model.getIdentifier()));
			//				parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SYNCHRONIZED, model.getSynchronized()));
			//				parent.append(String.format("/>\n"));
			//				String newfile = String.format("%s%s%s", filedir, File.separator, String.format("%s.model", model.getName()));
			//				File fileout = new File(newfile);
			//				if (fileout.exists()) {
			//					fileout.delete();
			//				}
			//				try {
			//					Writer fw = new OutputStreamWriter(new FileOutputStream(fileout, false), "UTF-8");
			//					fw.write(parent.toString());
			//					fw.flush();
			//					fw.close();
			//					float size = fileout.length();
			//					size /= 1024;
			//					log.log(Level.WARNING, String.format("%s - %s kB", fileout.getAbsolutePath(), size));					
			//				} catch (Exception ex) {
			//					ex.printStackTrace();
			//				}
			//			}
			scankiebases();
		} else if (kiebases.size() > 0) {
			scangroups();
			scankiebases();
		}		
	}

	private void scangroups() {
		if (groups.size() > 0) {
			StringBuilder parent = new StringBuilder();
			parent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			parent.append(String.format("<groups>\n"));			
			for (X_AD_Rule group:groups) {
				if (group.getSynchronized() == null) {
					group.setSynchronized(new Timestamp(System.currentTimeMillis()));
					group.save();
				}
				HashMap props = group.getProperties();				
				parent.append(String.format("<group %s=\"%s\" ",Constants.XML_ATTRIBUTE_NAME,group.getName()));
				parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_IDENTIFIER, group.getIdentifier()));
				parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SYNCHRONIZED,group.getSynchronized()));
				parent.append(String.format("/>\n"));
			}
			parent.append(String.format("</groups>\n"));
			String newfile = String.format("%s%s%s", filedir, File.separator ,"groups.xml");
			File fileout = new File(newfile);
			if (fileout.exists()) {
				fileout.delete();
			}
			try {
				Writer fw = new OutputStreamWriter(new FileOutputStream(fileout, false), "UTF-8");
				fw.write(parent.toString());
				fw.flush ();
				fw.close ();
				float size = fileout.length();
				size /= 1024;
				log.log(Level.WARNING, String.format("%s - %s kB", fileout.getAbsolutePath(), size));
			} catch (Exception ex) {
				ex.printStackTrace();
			}				
		}						
	}

	private void scankiebases() {
		for (X_AD_Rule kiebase:kiebases) {
			HashMap props = kiebase.getProperties();
			if (!props.containsKey(Constants.XML_ATTRIBUTE_NAME)) {				
				log.warning(String.format("%s (skip) name is mandatory", kiebase.getName()));
				continue;
			} else {
				String name = (String) props.get(Constants.XML_ATTRIBUTE_NAME);
				if (name == null) {
					log.warning(String.format("%s (skip) name is mandatory", kiebase.getName()));
					continue;
				}
			}
			KieBaseBean k = new KieBaseBean();
			k.setAgenda((String) props.get(Constants.XML_ATTRIBUTE_AGENDA));
			k.setCategory((String) props.get(Constants.XML_ATTRIBUTE_CATEGORY));
			String isdefault = (String) props.get(Constants.XML_ATTRIBUTE_DEFAULT);
			if (isdefault == null)
				isdefault = "false";		
			k.setIsdefault(isdefault.equals("Yes"));
			k.setPackagename((String) props.get(Constants.XML_ATTRIBUTE_PACKAGE));
			k.setName((String) props.get(Constants.XML_ATTRIBUTE_NAME));
			k.setSessionname((String) props.get(Constants.XML_ATTRIBUTE_SESSIONNAME));
			k.setQueuename((String) props.get(Constants.XML_ATTRIBUTE_QUEUENAME));
			MColumn adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Rule.Table_Name, X_AD_Rule.COLUMNNAME_RuleType, null));
			Lookup lruletype = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
			String rt = (String) props.get(Constants.XML_ATTRIBUTE_RULETYPE);
			k.setRuleType(lruletype.get(rt));
			adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_DocBaseType, null));
			Lookup lookupentity = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
			String dbt = (String) props.get(Constants.XML_ATTRIBUTE_DOCBASETYPE);
			k.setDocbasetype(lookupentity.get(dbt));
			adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_DocSubType, null));
			Lookup lookupsubtype = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
			String dst = (String) props.get(Constants.XML_ATTRIBUTE_DOCSUBTYPE);
			k.setDocsubtype(lookupsubtype.get(dst));
			k.setEntrypoint((String) props.get(Constants.XML_ATTRIBUTE_ENTRYPOINT));
			k.setEqualsBehavior((String) props.get(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR));
			k.setQueuelistenerclass((String) props.get(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS));
			k.setEventProcessingMode((String) props.get(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE));
			Timestamp  kiebasesync = new Timestamp(System.currentTimeMillis());					
			k.setSynchronize(kiebasesync);				
			String filename2 = "";
			StringBuilder parent = new StringBuilder();
			parent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			parent.append(String.format("<kiebase "));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_AGENDA,k.getAgenda()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_CATEGORY,k.getCategory()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_DEFAULT,k.isIsdefault()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_PACKAGE,k.getPackagename()));
			parent.append(String.format("%s=\"%s\" \n",Constants.XML_ATTRIBUTE_NAME,k.getName()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SESSIONNAME,k.getSessionname()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_QUEUENAME,k.getQueuename()));
			ValueNamePair vp = (ValueNamePair) k.getDocbasetype();
			String kdocbasetype = "";
			if (vp != null)
				kdocbasetype = vp.getValue();
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_DOCBASETYPE,kdocbasetype));
			//
			vp = (ValueNamePair) k.getDocsubtype();
			String kdocsubtype = "";
			if (vp != null)
				kdocsubtype = vp.getValue();								
			parent.append(String.format("%s=\"%s\" \n",Constants.XML_ATTRIBUTE_DOCSUBTYPE,kdocsubtype));				
			//
			vp = (ValueNamePair) k.getRuleType();
			String kruletype = "";
			if (vp != null)
				kruletype = vp.getValue();
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_RULETYPE,kruletype));

			String groupid = (String) props.get(Constants.XML_ATTRIBUTE_GROUP);
			if (groupid != null) {
				X_AD_Rule group = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(Integer.valueOf(groupid)).first();
				if (group != null) {
					parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_GROUP,group.getIdentifier()));
				}					
			}				
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_ENTRYPOINT,k.getEntrypoint()));
			parent.append(String.format("%s=\"%s\" \n",Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR,k.getEqualsBehavior()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS,k.getQueuelistenerclass()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE,k.getEventProcessingMode()));
			parent.append(String.format("%s=\"%s\" ",X_AD_Rule.COLUMNNAME_Identifier,kiebase.getIdentifier()));
			parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SYNCHRONIZED,k.getSynchronize()));				
			parent.append(String.format("%s=\"%s\" >\n",Constants.XML_ATTRIBUTE_DOC_TYPE,"kiebase"));
			// Columns
			List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(kiebase.getAD_Rule_ID()).list();
			for (X_AD_Column column:columns) {
				MTable table = MTable.get(Env.getCtx(), column.getAD_Table_ID());
				parent.append(String.format("<field TableName=\"%s\" ColumnName=\"%s\" Agenda=\"%s\"/>\n",table.getTableName(), column.getColumnName(), column.getAgenda()));
			}			
			// DocType
			List<X_C_DocType> doctypes = new Query(Env.getCtx(), X_C_DocType.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(kiebase.getAD_Rule_ID()).list();

			HashMap<String,List<String>> docbasetypes = new HashMap<String,List<String>>();
			//boolean found = false;
			for (X_C_DocType doctype:doctypes) {
				if (docbasetypes.containsKey(doctype.getDocBaseType())) {
					List<String > subtypes = docbasetypes.get(doctype.getDocBaseType());						
					String subtype = doctype.getDocSubType();
					if (subtype == null)
						subtype = "";
					if (!subtypes.contains(subtype)) {							
						subtypes.add(subtype);
					}
				} else {
					List<String> subtypes = new ArrayList<String>();
					String subtype = doctype.getDocSubType();
					if (subtype == null)
						subtype = "";												
					subtypes.add(subtype);
					docbasetypes.put(doctype.getDocBaseType(), subtypes);
				}
			}
			Iterator it = docbasetypes.keySet().iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				List<String> subtypes = docbasetypes.get(key);
				for (String st:subtypes) {						
					parent.append(String.format("<doctype docbasetype=\"%s\" docsubtype=\"%s\"/>\n", key, st));
				}
			}				
			String whererule = "Parent_ID = ?";
			List<X_AD_Rule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name,whererule,null)
			.setParameters(kiebase.getAD_Rule_ID()).setOrderBy("AD_Rule_ID").list();
			for (X_AD_Rule rule:rules)
			{
				Timestamp syncronize = new Timestamp(System.currentTimeMillis());
				String sessionname = (String) rule.getProperties().get(Constants.XML_ATTRIBUTE_SESSIONNAME);
				String ruletype = (String) rule.getProperties().get(Constants.XML_ATTRIBUTE_TYPE);
				if (ruletype.equals(Constants.DROOLS_MODEL)) {
					HashMap modelprops = rule.getProperties();
					String clazzname = (String) modelprops.get(X_AD_Process.COLUMNNAME_Classname);
					try {
						Class<?> clazz = (Class<?>) Class.forName(clazzname);							
						Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
						PO po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, null});						
						X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
						.setParameters(Integer.valueOf(po.get_Table_ID())).first();						
						parent.append(String.format("<model %s=\"%s\" ", Constants.XML_ATTRIBUTE_NAME, rule.getName()));
						parent.append(String.format("%s=\"%s\" ",X_AD_Table.COLUMNNAME_AD_Table_ID, t.getIdentifier()));
						parent.append(String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Classname, modelprops.get(X_AD_Process.COLUMNNAME_Classname)));
						parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_IDENTIFIER, rule.getIdentifier()));
						parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SYNCHRONIZED, rule.getSynchronized()));
						parent.append(String.format("/>\n"));
					}  catch (Exception exception) {

					}
				}
				else if (ruletype.equals(Constants.DROOLS_CHANNEL)) {
					//{SessionName=null, AD_MessageFormat_ID=1000018, name=message, type=channel}					
					HashMap p = rule.getProperties();
					String name = (String) p.get("name");					
					parent.append(String.format("<channel %s=\"%s\" ", Constants.XML_ATTRIBUTE_NAME, name));
					if (p.containsKey(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID)) {
						Integer messageformatid = Integer.valueOf(p.get(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID).toString());
						X_AD_MessageFormat mf = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
						.setParameters(messageformatid).first();
						if (mf != null) {
							parent.append(String.format("%s=\"%s\" ",X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID, mf.getIdentifier()));
						}
					}
					parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SESSIONNAME,sessionname));
					parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_IDENTIFIER, rule.getIdentifier()));
					parent.append(String.format("%s=\"%s\"/>\n",Constants.XML_ATTRIBUTE_SYNCHRONIZED, syncronize));					
				}
				else if (ruletype.equals(Constants.DROOLS_RULE)) {										
					String name = (String) rule.getProperties().get("name");
					String filename = name;
					if (filename.lastIndexOf("/") > 0 && filename.length() > filename.lastIndexOf("/")) {
						filename = filename.substring(filename.lastIndexOf("/")+1);
					}
					if (filename2.length() == 0) 
						filename2 = filename.replace(".drl", ".in.xml");
					parent.append(String.format("<rule %s=\"%s\" ",Constants.XML_ATTRIBUTE_NAME, name));
					parent.append(String.format("%s=\"%s\" ", Constants.XML_ATTRIBUTE_TYPE, ruletype));
					parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SESSIONNAME,sessionname));
					parent.append(String.format("%s=\"%s\" ", Constants.XML_ATTRIBUTE_FILE, filename));
					parent.append(String.format("%s=\"%s\" ", Constants.XML_ATTRIBUTE_IDENTIFIER, rule.getIdentifier()));
					parent.append(String.format("%s=\"%s\"/>\n",Constants.XML_ATTRIBUTE_SYNCHRONIZED, syncronize));
					String newfile = String.format("%s%s%s", filedir, File.separator ,filename);

					File fileout = new File(newfile);
					if (fileout.exists()) {
						fileout.delete();
					}
					try {
						Writer fw = new OutputStreamWriter(new FileOutputStream(fileout, false), "UTF-8");
						fw.write(rule.getScript());
						fw.flush ();
						fw.close ();
						float size = fileout.length();
						size /= 1024;
						log.log(Level.WARNING, String.format("%s - %s kB", fileout.getAbsolutePath(), size));

					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
			parent.append("</kiebase>");
			try {
				String newfile2 = String.format("%s%s%s", filedir, File.separator, filename2);
				File fileout2 = new File(newfile2);
				if (fileout2.exists()) {
					fileout2.delete();
				}					
				Writer fw = new OutputStreamWriter(new FileOutputStream(fileout2, false), "UTF-8");
				fw.write(parent.toString());
				fw.flush ();
				fw.close ();
				float size = fileout2.length();
				size /= 1024;
				log.log(Level.WARNING, String.format("%s - %s kB", fileout2.getAbsolutePath(), size));

			} catch (Exception ex) {
				ex.printStackTrace();
			}									
		}		
	}
	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}
}
