package org.xendra.pfe.gui.propertysheet;

import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheet;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import java.beans.BeanInfo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.compiere.apps.ADialog;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.model.reference.REF_C_PrinterFormatType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.ValueNamePair;
import org.jdom.Element;
import org.xendra.controls.LookupEditor;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.tree.TreeView;
import org.xendra.printdocument.ParseFormat;

public class PropertySheetPage extends JPanel implements TreeSelectionListener, PropertyChangeListener {
	private Object selectedFolder;
	private PropertySheetPanel sheet;
	private HeaderBean headerdata;
	private FieldBean fielddata;
	private FormatBean formatdata;
	private String m_type;
	//private X_C_PrinterDocumentFormat m_pdf;
	private boolean m_render;
	private AbstractFolder folder;
	//private FieldBean columndata;
	//                           private FormatBean tabledata;
	public PropertySheetPage() {
		setLayout(LookAndFeelTweaks.createVerticalPercentLayout());
		sheet = new PropertySheetPanel();
		sheet.setMode(PropertySheet.VIEW_AS_CATEGORIES);
		sheet.setDescriptionVisible(true);
		sheet.setSortingCategories(true);
		add(sheet, "");
		sheet.addPropertySheetChangeListener(this);
	}

	public String getType() {
		return m_type;
	}
	public void setType(String type) {
		m_type = type;	
	}	
	public void setfield(int PDF_ID) {
		X_C_PrinterDocumentFormat pdf = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
		.setParameters(PDF_ID).first();
		if (pdf != null) {
			HashMap properties = pdf.getProperties();
			Iterator it = properties.keySet().iterator();
			while (it.hasNext()) {
				String value = (String) properties.get(it.next());

			}
			fielddata = new FieldBean();
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(fielddata);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
		} 		
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			folder = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();			
			Element item= (Element) folder.getNode();			
			setType(item.getName());
			String name = item.getAttributeValue("name");
			String value = item.getAttributeValue("value");
			if (getType().equals("field")) {
				m_render = true;
				if (name.equals(ParseFormat.HEADER)) {
					headerdata = new HeaderBean();
					headerdata.setName(name);
					headerdata.setValue(value);
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(headerdata);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(headerdata);
				} else {				
					fielddata = new FieldBean();
					fielddata.setName(name);
					fielddata.setValue(value);									
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(fielddata);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(fielddata);
				}
				m_render = false;
			} else if (getType().equals("table")) {
				m_render = true;
				TableBean t = new TableBean();
				t.setName(name);
				t.setValue(value);
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(t);
				sheet.setProperties(beanInfo.getPropertyDescriptors());
				sheet.readFromObject(t);
				m_render = false;
			} else if  (getType().equals("format")) {
				m_render = true;
				FormatFolder format = (FormatFolder) folder;
				if (format.getPrinterDocumentFormat().getC_PrinterFormatType() != null && 
					format.getPrinterDocumentFormat().getC_PrinterFormatType().equals(REF_C_PrinterFormatType.HeaderLines)) {
					formatdata = new FormatInvBean();
					formatdata.setName(name);
					formatdata.setLockout(format.getPrinterDocumentFormat().isLockout());
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(formatdata);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(formatdata);					
				} else {
					formatdata = new FormatBean();
					formatdata.setName(name);				
					MColumn adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(MPrinterDocumentFormat.Table_Name, X_C_PrinterDocumentFormat.COLUMNNAME_C_PrinterFormatType, null));					
					Lookup lookupdocumentformattype = MLookupFactory.get(Env.getCtx(), 0, 0,  adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
					formatdata.setC_PrinterFormatType(lookupdocumentformattype.get(format.getPrinterDocumentFormat().getC_PrinterFormatType()));
					//
					adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(MPrinterDocumentFormat.Table_Name,  X_C_PrinterDocumentFormat.COLUMNNAME_A_PrinterDriver_ID, null));
					Lookup lookupprinterdriver = MLookupFactory.get(Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
					formatdata.setA_PrinterDriver_ID(lookupprinterdriver.get(format.getPrinterDocumentFormat().getA_PrinterDriver_ID()));
					//
					adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(MPrinterDocumentFormat.Table_Name, X_C_PrinterDocumentFormat.COLUMNNAME_EntityType, null));
					Lookup lookupentitytype = MLookupFactory.get(Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
					formatdata.setEntityType(lookupentitytype.get(format.getPrinterDocumentFormat().getEntityType()));
					//
					formatdata.setLockout(format.getPrinterDocumentFormat().isLockout());
					HashMap map = format.getPrinterDocumentFormat().getParameters();
					String slines = (String) map.get("Lines");
					try {
						Integer lines = Integer.valueOf(slines);
					} catch (Exception ex) {
						slines = "26";
						map.put("Lines", slines);
						format.getPrinterDocumentFormat().setParameters(map);
					}
					String scolumns = (String) map.get("Columns");
					try {
						Integer columns = Integer.valueOf(scolumns);
					} catch (Exception ex) {
						scolumns = "80";
						map.put("Columns", scolumns);
						format.getPrinterDocumentFormat().setParameters(map);
					}
					formatdata.setLines(slines);
					formatdata.setColumns(scolumns);
					DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
					BeanInfo beanInfo = resolver.getBeanInfo(formatdata);
					sheet.setProperties(beanInfo.getPropertyDescriptors());
					sheet.readFromObject(formatdata);
				}
				m_render = false;
			}
		}
	}
	
	public Property[] getProperties() {
		return sheet.getProperties();
	}
	
	public Property getProperty(String name) {
		Property property = null;
		Property[] props = sheet.getProperties();
		for (Property p:props) {
			if (p.getName().equals(X_C_PrinterDocumentFormat.COLUMNNAME_C_PrinterFormatType)) {
				property = p;
				break;
			}
		}
		return property;
	}


	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		try {			
			if (m_render)
				return;
			if (getType().equals("format")) {
				FormatFolder format = (FormatFolder) folder;
				Property[] props = sheet.getProperties();
				for (Property p:props) {
					if (p.getName().equals(X_C_PrinterDocumentFormat.COLUMNNAME_C_PrinterFormatType)) {
						ValueNamePair vp = (ValueNamePair) p.getValue();
						if (vp != null) {
							format.getPrinterDocumentFormat().setC_PrinterFormatType(vp.getValue());
							//m_pdf.save();
						}
					} else if (p.getName().equals(X_C_PrinterDocumentFormat.COLUMNNAME_Name)) {
						String name = (String) p.getValue();
						format.getPrinterDocumentFormat().setName(name);
						folder.setName(name);
						Element item= (Element) folder.getNode();			
						item.setAttribute("name", name);
						folder.setNode(item);						
						//m_pdf.save();
					} else if (p.getName().equals(X_C_PrinterDocumentFormat.COLUMNNAME_EntityType)) {
						ValueNamePair vp = (ValueNamePair) p.getValue();
						if (vp != null) {
							format.getPrinterDocumentFormat().setEntityType(vp.getValue());
							//m_pdf.save();	
						}
					} else if (p.getName().equals(X_C_PrinterDocumentFormat.COLUMNNAME_Lockout)) {
						format.getPrinterDocumentFormat().setLockout((Boolean) p.getValue());
						//m_pdf.save();
					} else if (p.getName().equals(X_C_PrinterDocumentFormat.COLUMNNAME_A_PrinterDriver_ID)) {
						KeyNamePair vp = (KeyNamePair) p.getValue();
						if (vp != null) {						
							format.getPrinterDocumentFormat().setA_PrinterDriver_ID(vp.getKey());
							//m_pdf.save();
						}
					} else if (p.getName().equals("Lines")) {							
						Integer lines = Integer.valueOf(p.getValue().toString());
						if (lines == 0)
							lines = 26;						
						HashMap map = format.getPrinterDocumentFormat().getParameters();
						map.put("Lines", String.valueOf(lines));
						format.getPrinterDocumentFormat().setParameters(map);
						//m_pdf.save();
					} else if (p.getName().equals("Columns")) {						
						Integer columns = Integer.valueOf(p.getValue().toString());
						if (columns == 0)
							columns = 80;
						HashMap map = format.getPrinterDocumentFormat().getParameters();
						map.put("Columns", String.valueOf(columns));
						format.getPrinterDocumentFormat().setParameters(map);
						//m_pdf.save();
					}
					//EntityType
					//Lockout
					//Lines
					//Columns
					//A_PrinterDriver_ID
				}
			} else if (getType().equals("table")) {
				//TableFolder table = (TableFolder) folder;
				String value = (String) evt.getNewValue();
				String name = folder.getNode().getAttributeValue("name");
				AbstractFolder f = (AbstractFolder) folder.getParent();
				while (!(f instanceof FormatFolder)) {
					f = (AbstractFolder) f.getParent();
				}
				if (f instanceof FormatFolder) {
					folder.getNode().setAttribute("name", name);
					folder.getNode().setAttribute("value", value);
					((FormatFolder) f).setParameter(name, value);					
				}
			} else if (getType().equals("field")) {
				String value = (String) evt.getNewValue();
				String name = folder.getNode().getAttributeValue("name");				
				AbstractFolder f = (AbstractFolder) folder.getParent();
				while (!(f instanceof FormatFolder)) {
					f = (AbstractFolder) f.getParent();
				}
				if (f instanceof FormatFolder) {
					((FormatFolder) f).setProperty(name, value);
				} else {
					System.out.println("ZX");
				}
				//String value = (String) evt.getNewValue();
				//HashMap map = m_pdf.getProperties();
				//String name = folder.getNode().getAttributeValue("name");
				//map.put(name, value);
				//m_pdf.setProperties(map);
				//m_pdf.save();
				folder.getNode().setAttribute("value", value);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public static class FormatTypeEditor extends LookupEditor {
		public FormatTypeEditor() {
			super(X_C_PrinterDocumentFormat.Table_Name, X_C_PrinterDocumentFormat.COLUMNNAME_C_PrinterFormatType);
		}
	}
	public static class PrinterDriverEditor extends LookupEditor {
		public PrinterDriverEditor() {
			super(X_C_PrinterDocumentFormat.Table_Name, X_C_PrinterDocumentFormat.COLUMNNAME_A_PrinterDriver_ID);
		}
	}
	public static class EntityTypeEditor extends LookupEditor {
		public EntityTypeEditor() {
			super(X_C_PrinterDocumentFormat.Table_Name, X_C_PrinterDocumentFormat.COLUMNNAME_EntityType);
		}
	}
}