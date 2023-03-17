package org.xendra.mfe.gui.propertysheet;

import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.PropertySheet;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import java.beans.BeanInfo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.jdom.Element;
import org.xendra.mfe.gui.tree.TreeView;
import org.xendra.mfe.model.FieldBean;
import org.xendra.mfe.model.MessageBean;
import org.xendra.mfe.model.PluginBean;
import org.xendra.mfe.model.ProcessBean;
import org.xendra.mfe.model.SectionBean;
import org.xendra.model.AbstractFolder;

public class PropertySheetPage extends JPanel implements TreeSelectionListener, PropertyChangeListener {
	private PropertySheetPanel sheet;
	private String m_type;
	private boolean m_render;
	private FieldBean fielddata;
	private SectionBean sectiondata;
	private MessageBean messagedata;
	private PluginBean plugindata;
	private ProcessBean processdata;
	private AbstractFolder node;
	public PropertySheetPage() {
		setLayout(LookAndFeelTweaks.createVerticalPercentLayout());
		sheet = new PropertySheetPanel();
		sheet.setMode(PropertySheet.VIEW_AS_CATEGORIES);
		sheet.setDescriptionVisible(true);
		sheet.setSortingCategories(true);
		add(sheet, "");
		sheet.addPropertySheetChangeListener(this);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			node = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();
			Element item = node.getNode();
			m_render = true;
			m_type = item.getName();
			if (m_type.equals("plugin")) {				
				setPlugin(item);
			} else if (m_type.equals("field")) {
				setField(item);
			} else if (m_type.equals("process")) {
				setProcess(item);
			} else if (m_type.equals("section")) {
				setSection(item);
			} else if  (m_type.equals("message")) {
				setMessage(item);
			}
			m_render = false;
		}
	}
	public void setPlugin(Element item) {
		plugindata = new PluginBean();
		plugindata.setName(item.getAttributeValue("name"));
		DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
		BeanInfo beanInfo = resolver.getBeanInfo(plugindata);
		sheet.setProperties(beanInfo.getPropertyDescriptors());
		sheet.readFromObject(plugindata);		
	}
	public void setProcess(Element item) {
		processdata = new ProcessBean();
		//<process value="Sales Listener" accesslevel="4" frequencytype="O" frequency="1" keeplogdays="7" name="Sales Listener" 
		//queuename="/queue/pos" Identifier="8dfdc6f0-c851-7986-0b03-711e561d6d2b"/>
		processdata.setValue(item.getAttributeValue(X_AD_Process.COLUMNNAME_Value));
		processdata.setAccessLevel(item.getAttributeValue(X_AD_Process.COLUMNNAME_AccessLevel));

		MColumn adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Scheduler.Table_Name, X_AD_Scheduler.COLUMNNAME_FrequencyType, null));
		Lookup lookupentity = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());							
		processdata.setFrequencyType(lookupentity.get(item.getAttributeValue(X_AD_Scheduler.COLUMNNAME_FrequencyType)));
		Integer frequency = 1;
		Integer keeplogdays = 7;
		try {
			frequency = Integer.valueOf(item.getAttributeValue(X_AD_Scheduler.COLUMNNAME_Frequency));
			keeplogdays = Integer.valueOf(item.getAttributeValue(X_AD_Scheduler.COLUMNNAME_KeepLogDays));
		} catch (Exception e) {

		}
		processdata.setFrequency(frequency);
		processdata.setKeepLogDays(keeplogdays);		
		processdata.setName(item.getAttributeValue(X_AD_Process.COLUMNNAME_Name));
		processdata.setQueueName(item.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_QueueName));

		adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Process.Table_Name, X_AD_Process.COLUMNNAME_AD_Rule_ID, null));
		Lookup lkrule = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());							
		String ruleid = item.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_AD_Rule_ID);
		if (ruleid != null) {
			X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
			.setParameters(ruleid).first();
			processdata.setAD_Rule_ID(lkrule.get(rule.getAD_Rule_ID()));
		}
		processdata.setIdentifier(item.getAttributeValue(X_AD_Process.COLUMNNAME_Identifier));		
		DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
		BeanInfo beanInfo = resolver.getBeanInfo(processdata);
		sheet.setProperties(beanInfo.getPropertyDescriptors());
		sheet.readFromObject(processdata);
	}
	public void setField(Element item) {
		fielddata = new FieldBean();
		fielddata.setName(item.getAttributeValue(("name")));
		fielddata.setArea(item.getAttributeValue("area"));
		fielddata.setColumnid(item.getAttributeValue("columnid"));
		fielddata.setTableid(item.getAttributeValue("tableid"));
		String key = item.getAttributeValue("key");
		if (key == null) 
			key = "false";		
		fielddata.setKey(key.equals("true"));
		String mandatory = item.getAttributeValue("mandatory");
		if (mandatory == null)
			mandatory = "false";						
		fielddata.setMandatory(mandatory.equals("true"));				
		fielddata.setSequence(Integer.valueOf(item.getAttributeValue("sequence")));
		DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
		BeanInfo beanInfo = resolver.getBeanInfo(fielddata);		
		sheet.setProperties(beanInfo.getPropertyDescriptors());
		sheet.readFromObject(fielddata);
	}
	public void setSection(Element item) {
		sectiondata = new SectionBean();
		sectiondata.setName(item.getAttributeValue("name"));
		sectiondata.setParent(item.getAttributeValue("parent"));				
		sectiondata.setSequence(Integer.valueOf(item.getAttributeValue("sequence")));
		DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
		BeanInfo beanInfo = resolver.getBeanInfo(sectiondata);
		sheet.setProperties(beanInfo.getPropertyDescriptors());
		sheet.readFromObject(sectiondata);						
	}
	public void setMessage(Element item) {
		String name = item.getAttributeValue("name");
		String queuename = item.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_QueueName);
		Boolean lockout = item.getAttributeValue("lockout").equals("Y");
		messagedata = new MessageBean();
		messagedata.setLockout(lockout);
		messagedata.setName(name);
		messagedata.setQueueName(queuename);
		DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
		BeanInfo beanInfo = resolver.getBeanInfo(messagedata);
		sheet.setProperties(beanInfo.getPropertyDescriptors());
		sheet.readFromObject(messagedata);						
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		try {			
			if (m_render)
				return;
			if (m_type == null) {
				return;
			} else if (m_type.equals("process")) {
				ProcessBean p = new ProcessBean();
				sheet.writeToObject(p);
				Element item = node.getNode();
				item.setAttribute(X_AD_Process.COLUMNNAME_Value, p.getValue());
				item.setAttribute(X_AD_Process.COLUMNNAME_AccessLevel, p.getAccessLevel());
				item.setAttribute(X_AD_Scheduler.COLUMNNAME_FrequencyType, p.getFrequencyType().getID());
				item.setAttribute(X_AD_Scheduler.COLUMNNAME_Frequency, p.getFrequency().toString());
				item.setAttribute(X_AD_Scheduler.COLUMNNAME_KeepLogDays, p.getKeepLogDays().toString());
				item.setAttribute(X_AD_Process.COLUMNNAME_Name, p.getName());
				item.setAttribute(X_AD_MessageFormat.COLUMNNAME_QueueName, p.getQueueName());				
				KeyNamePair kp = (KeyNamePair) p.getAD_Rule_ID();
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
					.setParameters(kp.getKey()).first();
				item.setAttribute(X_AD_Process.COLUMNNAME_AD_Rule_ID, rule.getIdentifier());
				item.setAttribute(X_AD_Process.COLUMNNAME_Identifier, p.getIdentifier());											
			} else if (m_type.equals("field")) {
				FieldBean f = new FieldBean();
				sheet.writeToObject(f);
				Element item = node.getNode();
				item.setAttribute("name", f.getName());
				item.setAttribute("area", f.getArea());
				item.setAttribute("mandatory", f.getMandatory().toString());
				item.setAttribute("key", f.getKey().toString());
				item.setAttribute("sequence", f.getSequence().toString());
				item.setAttribute("columnid", f.getColumnid());
				item.setAttribute("tableid", f.getTableid());
			} else if (m_type.equals("format")) {

			} else if (m_type.equals("section")) {
				SectionBean s = new SectionBean();
				sheet.writeToObject(s);
				Element item = node.getNode();
				String id = item.getAttributeValue("AD_MessageFormat_ID");
				item.setAttribute("name", s.getName());
				item.setAttribute("parent", s.getParent());
				item.setAttribute("sequence", s.getSequence().toString());
			} else if (m_type.equals("message")) {
				MessageBean m = new MessageBean();
				sheet.writeToObject(m);
				Element item = node.getNode();
				item.setAttribute(X_AD_MessageFormat.COLUMNNAME_QueueName, m.getQueueName());
				item.setAttribute("name", m.getName());
				item.setAttribute("lockout", m.isLockout() ? "Y" : "N");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
