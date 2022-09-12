package org.xendra.efact.gui.propertysheet;

import java.beans.BeanInfo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.JTextComponent;

import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.util.Env;
import org.xendra.efact.EFactConstants;
import org.xendra.efact.folder.EFactTreeNode;
import org.xendra.efact.gui.tree.TreeView;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.ComboBoxPropertyEditor;
import com.l2fprod.common.demo.PropertySheetPage.Bean;
import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheet;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import com.l2fprod.common.swing.LookAndFeelTweaks;

public class PropertySheetPage extends JPanel implements TreeSelectionListener, PropertyChangeListener {
	private PropertySheetPanel sheet;
	private Bean data;
	private EFactTreeNode node;
	private String m_type;
	private boolean m_render;
	private PartnerBean partnerbean;
	public PropertySheetPage() {
		setLayout(LookAndFeelTweaks.createVerticalPercentLayout());
		sheet = new PropertySheetPanel();
		sheet.setMode(PropertySheet.VIEW_AS_CATEGORIES);
		sheet.setDescriptionVisible(true);
		sheet.setSortingCategories(true);
		sheet.setSortingProperties(true);
		add(sheet, "");
		sheet.addPropertySheetChangeListener(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {		
		try {
			if (m_render)
				return;
			if (m_type == null) 
				return;											
			if (evt == null)
				return;
			if (m_type.equals("Partner")) {		
				Property prop = (Property)evt.getSource();				
				Integer uid = Integer.valueOf(node.getNode().getAttributeValue("uid"));
				X_C_BPartner_Certificate pc = new X_C_BPartner_Certificate(Env.getCtx(), uid, null);
				HashMap p = pc.getProperties();
				p.put(prop.getDisplayName(), evt.getNewValue());
				pc.setProperties(p);
				pc.save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object getCurrentBean() {
		Object bean = null;
		if (m_type.equals("Partner")) {
			bean = new PartnerBean();
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
			node = (EFactTreeNode) treeview.getSelectionPath().getLastPathComponent();
			Integer id = Integer.valueOf(node.getNode().getAttributeValue("uid"));
			m_render = true;
			m_type = node.getNode().getName();
			if (m_type.equals("Partner")) {
				if (id > 0) {
					MBPartnerCertificate pc = new MBPartnerCertificate(Env.getCtx(), id, null);
					partnerbean = new PartnerBean();
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(partnerbean);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					partnerbean.setCacertsfile(pc.get(EFactConstants.CACERTSFILE));
					partnerbean.setCacertspassword(pc.get(EFactConstants.CACERTSPASSWORD));
					partnerbean.setPassword(pc.get(EFactConstants.PASSWORD));
					partnerbean.setAliaskey(pc.get(EFactConstants.ALIASKEY));
					partnerbean.setFilename(pc.get(EFactConstants.FILENAME));
					partnerbean.setPrivatepass(pc.get(EFactConstants.PRIVATEPASS));
					partnerbean.setKeystoretype( pc.get(EFactConstants.KEYSTORETYPE));
					partnerbean.setSendfilespath( pc.get(EFactConstants.SENDFILESPATH));
					partnerbean.setReceivefilespath(pc.get(EFactConstants.RECEIVEFILESPATH));
					partnerbean.setPrivatealias( pc.get(EFactConstants.PRIVATEALIAS));
					partnerbean.setProvider(pc.get(EFactConstants.PROVIDER));
					partnerbean.setSendEmail(pc.getBoolean(EFactConstants.SENDEMAIL));
					partnerbean.setSendFTP(pc.getBoolean(EFactConstants.SENDFTP));
					partnerbean.setSendPDF(pc.getBoolean(EFactConstants.SENDPDF));
					partnerbean.setSendOSE(pc.getBoolean(EFactConstants.SENDOSE));
					partnerbean.setSendXML(pc.getBoolean(EFactConstants.SENDXML));
					partnerbean.setFtpBase(pc.get(EFactConstants.FTPBASE));
					partnerbean.setFtpUser(pc.get(EFactConstants.FTPUSER));
					partnerbean.setFtpPassword(pc.get(EFactConstants.FTPPASSWORD));
					partnerbean.setFtpPort(pc.get(EFactConstants.FTPPORT));
					partnerbean.setFtpServer(pc.get(EFactConstants.FTPSERVER));
					partnerbean.setAmbiente(pc.get(EFactConstants.AMBIENTE));
					partnerbean.setPDFReportPath(pc.get(EFactConstants.PDFREPORT));
					partnerbean.setPDFReportLogo(pc.get(EFactConstants.PDFREPORTLOGO));					
					partnerbean.setMailHost(pc.get(EFactConstants.MAILHOST));
					partnerbean.setMailPort(pc.get(EFactConstants.MAILPORT));
					partnerbean.setMailSSL(pc.getBoolean(EFactConstants.MAILSSL));
					partnerbean.setMailAuth(pc.getBoolean(EFactConstants.MAILAUTH));
					partnerbean.setMailUser(pc.get(EFactConstants.MAILUSER));
					partnerbean.setMailPassword(pc.get(EFactConstants.MAILPASSWORD));
					partnerbean.setOSEUser(pc.get(EFactConstants.OSEUSER));
					partnerbean.setOSEPassword(pc.get(EFactConstants.OSEPASSWORD));
					partnerbean.setOSEToken(pc.get(EFactConstants.OSE_TOKEN));
					partnerbean.setCheckStatus(pc.getBoolean(EFactConstants.CHECKSTATUS));
					sheet.readFromObject(partnerbean);
				}				
			}
			m_render = false;
		}		
	}
	public static class AmbientEditor extends ComboBoxPropertyEditor {
		public AmbientEditor() {
			super();	    
			setAvailableValues(new String[]{EFactConstants.BETA,EFactConstants.QA,EFactConstants.PRODUCTION});
			Icon[] icons = new Icon[3];
			Arrays.fill(icons, UIManager.getIcon("Tree.openIcon"));
			setAvailableIcons(icons);
		}	
	}

	public static class OSEEditor extends ComboBoxPropertyEditor {
		public OSEEditor() {
			super();
			setAvailableValues(new String[]{EFactConstants.OSE_EFACT, EFactConstants.OSE_SUNAT});
			Icon[] icons = new Icon[2];
			Arrays.fill(icons, UIManager.getIcon("Tree.openIcon"));
			setAvailableIcons(icons);
		}
	}
	
	public static class PasswordPropertyEditor extends AbstractPropertyEditor {

		  public PasswordPropertyEditor() {
		    editor = new JPasswordField();
		    ((JPasswordField)editor).setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		  }
		  
		  public Object getValue() {
		    return ((JTextComponent)editor).getText();
		  }
		  
		  public void setValue(Object value) {
		    if (value == null) {
		      ((JTextComponent)editor).setText("");
		    } else {
		      ((JTextComponent)editor).setText(String.valueOf(value));
		    }
		  }
		  
		}

}