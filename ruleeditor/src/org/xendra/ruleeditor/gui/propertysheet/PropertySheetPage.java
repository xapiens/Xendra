package org.xendra.ruleeditor.gui.propertysheet;

import com.l2fprod.common.beans.editor.ComboBoxPropertyEditor;
import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.PropertySheet;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import com.l2fprod.common.swing.LookAndFeelTweaks;

import java.beans.BeanInfo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MQuery;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Session;
import org.compiere.model.persistence.X_AD_UserQuery;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.Env;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.controls.LookupEditor;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.gui.tree.TreeView;
import org.compiere.util.KeyNamePair;

public class PropertySheetPage extends JPanel implements TreeSelectionListener, PropertyChangeListener {
	private PropertySheetPanel sheet;
	private Bean data;
	private AbstractFolder node;
	private String m_type;
	private boolean m_render;
	public PropertySheetPage() {
		setLayout(LookAndFeelTweaks.createVerticalPercentLayout());
		sheet = new PropertySheetPanel();
		sheet.setMode(PropertySheet.VIEW_AS_CATEGORIES);
		sheet.setDescriptionVisible(true);
		sheet.setSortingCategories(true);
		sheet.setSortingProperties(true);
		add(sheet, "");
		// everytime a property change, update the button with it
		//		PropertyChangeListener listener = new PropertyChangeListener() {
		//			public void propertyChange(PropertyChangeEvent evt) {
		//				if (evt instanceof Property)
		//				{
		//					Property prop = (Property) evt.getSource();
		//					prop.writeToObject(data);
		//					System.out.println("Update object to " + data);
		//				}
		//			}
		//		};
		//sheet.addPropertyChangeListener(this);
		sheet.addPropertySheetChangeListener(this);
	}

	public static class BehaviorEditor extends ComboBoxPropertyEditor {
		public BehaviorEditor() {
			super();	    
			setAvailableValues(new String[]{"EQUALITY","IDENTITY",});
			Icon[] icons = new Icon[2];
			Arrays.fill(icons, UIManager.getIcon("Tree.openIcon"));
			setAvailableIcons(icons);
		}	
	}
	public static class ProcessingMode extends ComboBoxPropertyEditor {
		public ProcessingMode() {
			super();
			setAvailableValues(new String[]{"CLOUD","STREAM",});
			Icon[] icons = new Icon[2];
			Arrays.fill(icons, UIManager.getIcon("Tree.openIcon"));
			setAvailableIcons(icons);			
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {		
		try {

			if (m_render)
				return;
			if (m_type == null) {
				return;						
			}
			if (m_type.equals("plugin")) {
				PluginBean p = new PluginBean();
				sheet.writeToObject(p);				
				Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
				.setParameters(uid).first();
				if (plugin != null) {
					plugin.setName(p.getName());
				}
			} else if (m_type.equals("group")) {
				GroupBean g = new GroupBean();
				sheet.writeToObject(g);				
				Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(uid).first();
				if (rule != null) {
					rule.setName(g.getName());
					HashMap props = new HashMap();
					props.put(Constants.XML_ATTRIBUTE_DOC_TYPE, "group");
				}
			} else if (m_type.equals("kiebase")) {				
				KieBaseBean k = new KieBaseBean();
				sheet.writeToObject(k);				
				Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(uid).first();
				if (rule != null) {
					HashMap props = new HashMap();
					props.put(Constants.XML_ATTRIBUTE_AGENDA, k.getAgenda());
					props.put(Constants.XML_ATTRIBUTE_CATEGORY, k.getCategory());
					props.put(Constants.XML_ATTRIBUTE_DEFAULT, k.isIsdefault());
					props.put(Constants.XML_ATTRIBUTE_PACKAGE, k.getPackagename());
					props.put(Constants.XML_ATTRIBUTE_NAME, k.getName());
					props.put(Constants.XML_ATTRIBUTE_SESSIONNAME, k.getSessionname());
					props.put(Constants.XML_ATTRIBUTE_QUEUENAME, k.getQueuename());
					ValueNamePair vp = (ValueNamePair) k.getDocbasetype();
					if (vp != null)
						props.put(Constants.XML_ATTRIBUTE_DOCBASETYPE, vp.getValue());
					vp = (ValueNamePair) k.getDocsubtype();
					if (vp != null)
						props.put(Constants.XML_ATTRIBUTE_DOCSUBTYPE, vp.getValue());
					vp = (ValueNamePair) k.getRuleType();
					if (vp != null)
						props.put(Constants.XML_ATTRIBUTE_RULETYPE, vp.getValue());
					props.put(Constants.XML_ATTRIBUTE_ENTRYPOINT, k.getEntrypoint());
					KeyNamePair kp = (KeyNamePair) k.getGroup();
					if (kp != null)
						props.put(Constants.XML_ATTRIBUTE_GROUP, kp.getKey());
					props.put(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR, k.getEqualsBehavior());
					props.put(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS, k.getQueuelistenerclass());
					props.put(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE, k.getEventProcessingMode());
					props.put(Constants.XML_ATTRIBUTE_SYNCHRONIZED, k.getSynchronize().toString());
					props.put(Constants.XML_ATTRIBUTE_TYPE, Constants.DROOLS_KIEBASE);
					rule.setLockout(k.getLockout());
					rule.setProperties(props);
					rule.save();
				}
			} else if (m_type.equals("rule")) {
				RuleBean r = new RuleBean();
				sheet.writeToObject(r);				
				Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(uid).first();
				if (rule != null) {
					HashMap props = new HashMap();
					props.put(Constants.XML_ATTRIBUTE_NAME, r.getName());		
					props.put(Constants.XML_ATTRIBUTE_TYPE, Constants.DROOLS_RULE);
					props.put(Constants.XML_ATTRIBUTE_SESSIONNAME, r.getSessionname());
					//props.put(X_AD_Rule.COLUMNNAME_Lockout, r.getLockout());
					rule.setName(r.getName());
					rule.setLockout(r.getLockout());
					rule.setProperties(props);
					rule.save();
				}
			} else if (m_type.equals("model")) {
				ModelBean b = new ModelBean();
				sheet.writeToObject(b);				
				Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(uid).first();
				if (rule != null) {
					HashMap props = new HashMap();					
					props.put(Constants.XML_ATTRIBUTE_NAME, b.getName());
					props.put(Constants.XML_ATTRIBUTE_TYPE, Constants.DROOLS_MODEL);
					props.put(X_AD_Process.COLUMNNAME_Classname, b.getClassname());
					rule.setName(b.getName());
					rule.setProperties(props);
					rule.save();
				}
			} else if (m_type.equals("channel")) {
				ChannelBean c = new ChannelBean();
				sheet.writeToObject(c);
				Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(uid).first();
				if (rule != null) {
					HashMap props = rule.getProperties();
					props.put(Constants.XML_ATTRIBUTE_NAME, c.getName());
					if (c.getAD_MessageFormat_ID() != null) {
						KeyNamePair kp = (KeyNamePair) c.getAD_MessageFormat_ID();
						props.put(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID, kp.getKey());
						props.put(Constants.XML_ATTRIBUTE_SESSIONNAME, c.getSessionname());
					}					
					rule.setName(c.getName());
					rule.setProperties(props);
					rule.save();
				}
			} else if (m_type.equals("fact")) {
				FactBean f = new FactBean();
				sheet.writeToObject(f);				
				Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(uid).first();
				if (rule != null) {
					HashMap props = new HashMap();
					props.put(Constants.XML_ATTRIBUTE_NAME, f.getName());
					props.put(Constants.XML_ATTRIBUTE_TYPE, REF_RuleType.Fact);
					rule.setName(f.getName());
					rule.setProperties(props);
					rule.save();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public Object getCurrentBean() {
		Object bean = null;
		if (m_type.equals("plugin")) {
			bean = new PluginBean();
			sheet.writeToObject(bean);	
		} else if (m_type.equals("group")) {
			bean = new GroupBean();
			sheet.writeToObject(bean);
		} else if (m_type.equals("channel")) {
			bean = new ChannelBean();
			sheet.writeToObject(bean);
		} else if (m_type.equals("model")) {
			bean = new ModelBean();
			sheet.writeToObject(bean);
		}
		return bean;
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			node = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();						
			Integer id = Integer.valueOf(node.getElement().getAttributeValue("uid"));
			Integer uid = Integer.valueOf(node.getElement().getAttributeValue("uid"));
			m_render = true;
			m_type = node.getElement().getName();
			if (m_type.equals("plugin")) {
				PluginBean p = new PluginBean();
				p.setName(node.getElement().getAttributeValue("name"));
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(p);
				sheet.setProperties(beanInfo.getPropertyDescriptors());
				sheet.readFromObject(p);
			} else if (m_type.equals("group")) {
				GroupBean g  = new GroupBean();
				g.setName(node.getElement().getAttributeValue("name"));
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(g);
				sheet.setProperties(beanInfo.getPropertyDescriptors());
				sheet.readFromObject(g);							
			} else if (m_type.equals("kiebase")) {							
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(id).first();
				if (rule != null) {
					HashMap props = rule.getProperties();
					KieBaseBean k = new KieBaseBean();
					k.setAgenda((String) props.get(Constants.XML_ATTRIBUTE_AGENDA));
					k.setCategory((String) props.get(Constants.XML_ATTRIBUTE_CATEGORY));
					String isdefault = (String) props.get(Constants.XML_ATTRIBUTE_DEFAULT);
					if (isdefault == null)
						isdefault = "false";		
					k.setIsdefault(isdefault.equals("Yes"));
					k.setPackagename((String) props.get(Constants.XML_ATTRIBUTE_PACKAGE));
					k.setName((String) props.get(Constants.XML_ATTRIBUTE_NAME));
					k.setQueuename((String) props.get(Constants.XML_ATTRIBUTE_QUEUENAME));
					MColumn adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Rule.Table_Name, X_AD_Rule.COLUMNNAME_RuleType, null));
					Lookup lruletype = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
					String ruletype = (String) props.get(Constants.XML_ATTRIBUTE_RULETYPE);
					k.setRuleType(lruletype.get(ruletype));
					adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_DocBaseType, null));
					Lookup lookupentity = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
					String DocBaseType = (String) props.get(Constants.XML_ATTRIBUTE_DOCBASETYPE);
					k.setDocbasetype(lookupentity.get(DocBaseType));
					adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_DocSubType, null));
					Lookup lookupsubtype = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
					String docsubtype = (String) props.get(Constants.XML_ATTRIBUTE_DOCSUBTYPE);					
					String groupid = (String) props.get(Constants.XML_ATTRIBUTE_GROUP);
					if (groupid != null && groupid.length() > 0) {
						List<X_AD_Rule> groups = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "properties->'type' = 'group' AND  IsActive = 'Y'", null)
						.list();						
						for (X_AD_Rule group:groups) {
							Integer igroupid = Integer.valueOf(groupid); 
							if (group.getAD_Rule_ID() == igroupid) {
								KeyNamePair kp = new KeyNamePair(group.getAD_Rule_ID(), group.getName());
								k.setGroup(kp);
								break;
							}						
						}
					}
					k.setDocsubtype(lookupsubtype.get(docsubtype));
					k.setEntrypoint((String) props.get(Constants.XML_ATTRIBUTE_ENTRYPOINT));
					k.setEqualsBehavior((String) props.get(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR));
					k.setSessionname((String) props.get(Constants.XML_ATTRIBUTE_SESSIONNAME));
					k.setQueuelistenerclass((String) props.get(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS));
					k.setEventProcessingMode((String) props.get(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE));
					k.setLockout(rule.isLockout());
					Timestamp kiebasesync = rule.getSynchronized();
					if (kiebasesync == null)
						kiebasesync = new Timestamp(System.currentTimeMillis());					
					k.setSynchronize(kiebasesync);
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(k);
					sheet.setProperties(beanInfo.getPropertyDescriptors());				
					sheet.readFromObject(k);
				}
			}  else if (m_type.equals("rule")) {
				RuleBean r = new RuleBean();
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(id).first();
				if (rule != null) {				
					HashMap props = rule.getProperties();
					r.setName(rule.getName());
					r.setSessionname((String) props.get(Constants.XML_ATTRIBUTE_SESSIONNAME));
					r.setLockout(rule.isLockout());					
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(r);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(r);
				}
			} else if (m_type.equals("fact")) {
				FactBean f = new FactBean();
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(id).first();
				if (rule != null) {
					HashMap props = rule.getProperties();
					f.setName(rule.getName());
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(f);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(f);
				}
			} else if (m_type.equals("channel")) {
				ChannelBean c = new ChannelBean();
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(id).first();
				if (rule != null) {
					HashMap props = rule.getProperties();
					c.setName(rule.getName());
					if (props.containsKey(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID)) {
						Integer AD_MessageFormat_ID = Integer.valueOf(props.get(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID).toString());
						X_AD_MessageFormat mf = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
							.setParameters(AD_MessageFormat_ID).first();
						if (mf != null) {
							KeyNamePair kp = new KeyNamePair(mf.getAD_MessageFormat_ID(), mf.getName());
							c.setAD_MessageFormat_ID(kp);
						}												
					}
					if (props.containsKey(Constants.XML_ATTRIBUTE_SESSIONNAME)) {
						String sessionname = props.get(Constants.XML_ATTRIBUTE_SESSIONNAME).toString();
						if (sessionname == null)
							sessionname = "";
						c.setSessionname(sessionname);
					}
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(c);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(c);
				}
			} else if (m_type.equals("model")) {
				ModelBean m = new ModelBean();
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(id).first();
				if (rule != null) {
					HashMap props = rule.getProperties();
					m.setName(rule.getName());
					if (props.containsKey(X_AD_Process.COLUMNNAME_Classname)) {
						try { 
							Boolean POclass = false;
							String classname = props.get(X_AD_Process.COLUMNNAME_Classname).toString(); 
							m.setClassname(classname);						
							Class<?> clazz = (Class<?>) Class.forName(classname);
							Class<?> superClazz = clazz.getSuperclass();
							while (superClazz != null)
							{
								if (superClazz == PO.class)
								{				
									POclass = true;						
								}
								superClazz = superClazz.getSuperclass();
							}				
							if (POclass) {
								Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});							
								PO po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, null});
								//intable_id = po.get_Table_ID();
								MQuery query = new MQuery();
								query.setTableName(po.get_TableName());
								m.setFilter(query);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(m);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(m);
				}				
			}
			m_render = false;
		}
	}
	public static class DocBaseTypeEditor extends LookupEditor {
		public DocBaseTypeEditor() {
			super(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_DocBaseType);
		}
	}
	public static class DocSubTypeEditor extends LookupEditor {
		public DocSubTypeEditor() {
			super(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_DocSubType);
		}
	}
	public static class RuleTypeEditor extends LookupEditor {
		public RuleTypeEditor() {
			super(X_AD_Rule.Table_Name, X_AD_Rule.COLUMNNAME_RuleType);
		}
	}
	public static class MessageFormatEditor extends LookupEditor {
		public MessageFormatEditor() {
			super(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_AD_MessageFormat_ID);
		}
	}
	public static class MenuActionEditor extends LookupEditor {
		public MenuActionEditor() {
			super(X_AD_Menu.Table_Name, X_AD_Menu.COLUMNNAME_Action);
		}
	}
	public static class GroupEditor extends ComboBoxPropertyEditor {
		public GroupEditor() {
			super();
			List<KeyNamePair> list = new ArrayList<KeyNamePair>();
			List<X_AD_Rule> groups = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "properties->'type' = 'group' AND  IsActive = 'Y'", null)
			.list();
			for (X_AD_Rule group:groups) {
				list.add(new KeyNamePair(group.getAD_Rule_ID(), group.getName()));
			}			
			Object[] l = new KeyNamePair[list.size()];
			l = list.toArray();
			setAvailableValues(l);
		}
	}
	public static class TableEditor extends LookupEditor {
		public TableEditor() {
			super(X_AD_UserQuery.Table_Name, X_AD_Column.COLUMNNAME_AD_Table_ID);
		}
	}					
	public static class RoleEditor extends LookupEditor {
		public RoleEditor() {
			super(X_AD_Session.Table_Name, X_AD_Session.COLUMNNAME_AD_Role_ID);
		}
	}
}

