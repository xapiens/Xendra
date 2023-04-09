package org.xendra.modeleditor.gui.propertysheet;

import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheet;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import java.beans.BeanInfo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MFunction;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_View;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.ValueNamePair;
import org.xendra.controls.LookupEditor;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.gui.tree.TreeView;
import org.xendra.modeleditor.model.ColumnBean;
import org.xendra.modeleditor.model.PackageBean;
import org.xendra.modeleditor.model.PluginBean;
import org.xendra.modeleditor.model.ProcedureBean;
import org.xendra.modeleditor.model.TabBean;
import org.xendra.modeleditor.model.TableBean;
import org.xendra.modeleditor.model.ViewBean;

public class PropertySheetPage extends JPanel implements TreeSelectionListener, PropertyChangeListener {
	private AbstractFolder selectedFolder;	
	private PropertySheetPanel sheet;
	private ColumnBean columndata;
	private TableBean tabledata;
	private ProcedureBean procedure;
	private ViewBean view;
	public PropertySheetPage() {
		setLayout(LookAndFeelTweaks.createVerticalPercentLayout());
		sheet = new PropertySheetPanel();
		sheet.setMode(PropertySheet.VIEW_AS_CATEGORIES);
		sheet.setDescriptionVisible(true);
		sheet.setSortingCategories(true);
		add(sheet, "");
		sheet.addPropertySheetChangeListener(this);
	}


	public static class EntityTypeEditor extends LookupEditor {
		public EntityTypeEditor() {
			super(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_EntityType);
		}
	}

	public static class ReplicationEditor extends LookupEditor {
		public ReplicationEditor() {
			super(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_ReplicationType);
		}
	}

	public static class AccessLevelEditor extends LookupEditor {
		public AccessLevelEditor() {
			super(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AccessLevel);
		}
	}

	public static class ReferenceEditor extends LookupEditor {
		public ReferenceEditor() {
			super(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Reference_ID);
		}		
	}

	public static class ReferenceValueEditor extends LookupEditor {
		public ReferenceValueEditor() {
			super(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Reference_Value_ID);
		}		
	}	

	public static class ProcessEditor extends LookupEditor {
		public ProcessEditor() {
			super(X_AD_Table.Table_Name, X_AD_Column.COLUMNNAME_AD_Process_ID);
		}
	}

	public static class WindowEditor extends LookupEditor {
		public WindowEditor() {
			super(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AD_Window_ID);
		}
	}

	public void setcolumn(Integer columnid) {
		X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
		.setParameters(columnid).first();
		if (column != null) {
			columndata = new ColumnBean();
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(columndata);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			columndata.setName(column.getName());
			columndata.setDescription(column.getDescription());
			columndata.setHelp(column.getHelp());
			columndata.setColumnName(column.getColumnName());
			//
			MColumn adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_EntityType, null));
			Lookup lookupentity = MLookupFactory.get (Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
			columndata.setEntityType(lookupentity.get(column.getEntityType()));						
			//
			adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Reference_ID, null));
			Lookup lookupreference = MLookupFactory.get(Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
			columndata.setAD_Reference_ID(lookupreference.get(column.getAD_Reference_ID()));
			//
			adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, null));
			Lookup lookuprefval = MLookupFactory.get(Env.getCtx(), 0, 0, adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
			columndata.setAD_Reference_Value_ID(lookuprefval.get(column.getAD_Reference_Value_ID()));			
			//
			adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Val_Rule_ID, null));
			Lookup lookupvalrule = MLookupFactory.get(Env.getCtx(),0 ,0 , adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());			
			columndata.setAD_Val_Rule_ID(lookupvalrule.get(column.getAD_Val_Rule_ID()));
			//
			columndata.setFieldLength(column.getFieldLength());
			columndata.setDefaultValue(column.getDefaultValue());
			columndata.setIsKey(column.isKey());
			columndata.setIsParent(column.isParent());
			columndata.setIsMandatory(column.isMandatory());
			columndata.setIsUpdateable(column.isUpdateable());
			columndata.setReadOnlyLogic(column.getReadOnlyLogic());
			columndata.setIsIdentifier(column.isIdentifier());
			columndata.setSeqNo(column.getSeqNo());		
			columndata.setIsTranslated(column.isTranslated());		
			columndata.setCallout(column.getCallout());
			columndata.setVFormat(column.getVFormat());
			if (column.getValueMin().length() > 0)
				columndata.setValueMin(Integer.valueOf(column.getValueMin()));
			if (column.getValueMax().length() > 0)
				columndata.setValueMax(Integer.valueOf(column.getValueMax()));		
			columndata.setIsSelectionColumn(column.isSelectionColumn());
			//
			adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Process_ID, null));
			Lookup lookupprocess = MLookupFactory.get(Env.getCtx(),0 ,0 , adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());						
			columndata.setAD_Process_ID(lookupprocess.get(column.getAD_Process_ID()));
			//
			columndata.setIsAlwaysUpdateable(column.isAlwaysUpdateable());
			columndata.setColumnSQL(column.getColumnSQL());
			columndata.setFormatPattern(column.getFormatPattern());
			columndata.setIsAllowLogging(column.isAllowLogging());
			columndata.setMandatoryLogic(column.getMandatoryLogic());
			columndata.setInfoFactoryClass(column.getInfoFactoryClass());
			columndata.setSynchronized(column.getSynchronized());
			columndata.setAD_Column_ID(column.getAD_Column_ID());
			sheet.readFromObject(columndata);
			// everytime a property change, update the button with it
			PropertyChangeListener listener = new PropertyChangeListener() {
				public void propertyChange(PropertyChangeEvent evt) {
					if (evt instanceof Property)
					{
						Property prop = (Property) evt.getSource();
						prop.writeToObject(columndata);
						System.out.println("Update object to " + columndata);
					}
				}
			};
		} 
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreeView treeview = (TreeView) e.getSource();
		TreePath p = treeview.getSelectionPath(); 
		if (p != null) {
			selectedFolder = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();
			String m_type = selectedFolder.getElement().getName();
			if (m_type.equals("view")) {
				view = new ViewBean();
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(view);
				sheet.setProperties(beanInfo.getPropertyDescriptors());
				view.setName(selectedFolder.getElement().getAttributeValue(X_AD_View.COLUMNNAME_Name));
				view.setComments(selectedFolder.getElement().getAttributeValue(X_AD_View.COLUMNNAME_Comments));
				view.setOwner(selectedFolder.getElement().getAttributeValue(X_AD_View.COLUMNNAME_Owner));
				view.setDefinition(selectedFolder.getElement().getAttributeValue(X_AD_View.COLUMNNAME_Definition));
				view.setSynchronized(selectedFolder.getElement().getAttributeValue(X_AD_View.COLUMNNAME_Synchronized));
				view.setIdentifier(selectedFolder.getElement().getAttributeValue(X_AD_View.COLUMNNAME_Identifier));
				sheet.readFromObject(view);
			}
			if (m_type.equals("procedure")) {
				procedure = new ProcedureBean();
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(procedure);
				sheet.setProperties(beanInfo.getPropertyDescriptors());
				procedure.setName(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Name));
				procedure.setComments(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Comments));
				procedure.setOutput(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Output));
				procedure.setOwner(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Owner));
				procedure.setLanguage(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Language));
				procedure.setArguments(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Arguments));
				procedure.setCode(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Code));				
				procedure.setSynchronized(selectedFolder.getElement().getAttributeValue(X_AD_Function.COLUMNNAME_Synchronized));
				procedure.setIdentifier(selectedFolder.getElement().getAttributeValue(MFunction.COLUMNNAME_Identifier));
				sheet.readFromObject(procedure);
			}
			else if (m_type.equals("table")) {
				Integer id = Integer.valueOf(selectedFolder.getElement().getAttributeValue("uid"));
				if (id > 0)
				{
					X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(id).first();				
					if (table != null) {
						tabledata = new TableBean();
						DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
						BeanInfo beanInfo = resolver.getBeanInfo(tabledata);
						sheet.setProperties(beanInfo.getPropertyDescriptors());
						tabledata.setName(table.getName());
						tabledata.setDescription(table.getDescription());
						tabledata.setHelp(table.getHelp());			
						//
						MColumn column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_EntityType, null));
						Lookup lookupentity = MLookupFactory.get (Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
						tabledata.setEntityType(lookupentity.get(table.getEntityType()));
						//
						tabledata.setTableName(table.getTableName());
						//
						column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AccessLevel, null));
						Lookup lookupaccess = MLookupFactory.get (Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
						tabledata.setAccessLevel(lookupaccess.get(table.getAccessLevel()));
						//
						column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AD_Window_ID, null));
						Lookup lookupwindow = MLookupFactory.get (Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());					
						tabledata.setAD_Window_ID(lookupwindow.get(table.getAD_Window_ID()));
						//
						column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AD_Val_Rule_ID, null));
						Lookup lookupvalrule = MLookupFactory.get(Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
						tabledata.setAD_Val_Rule_ID(lookupvalrule.get(table.getAD_Rule_ID()));
						//
						tabledata.setLoadSeq(table.getLoadSeq());
						tabledata.setIsSecurityEnabled(table.isSecurityEnabled());
						tabledata.setIsDeleteable(table.isDeleteable());
						tabledata.setIsHighVolume(table.isHighVolume());
						tabledata.setIsChangeLog(table.isChangeLog());
						//
						column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_ReplicationType, null));
						Lookup lookuprepl = MLookupFactory.get(Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
						tabledata.setReplicationType(lookuprepl.get(table.getReplicationType()));
						//
						column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_PO_Window_ID, null));
						Lookup lookupwindowpo = MLookupFactory.get(Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
						tabledata.setPO_Window_ID(lookupwindowpo.get(table.getPO_Window_ID()));					
						tabledata.setID(table.getID());
						tabledata.setAD_Table_ID(table.getAD_Table_ID());
						tabledata.setSynchronized(table.getSynchronized());
						sheet.readFromObject(tabledata);
					}
				}
			} else if (m_type.equals("column")) {
				Integer id = Integer.valueOf(selectedFolder.getElement().getAttributeValue("uid"));
				if (id > 0) {
					setcolumn(id);
				}
			} else if (m_type.equals("tab")) {
				TabBean tb = new TabBean();
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(tb);
				sheet.setProperties(beanInfo.getPropertyDescriptors());		
				Integer id = Integer.valueOf(selectedFolder.getElement().getAttributeValue("uid"));
				X_AD_Tab tab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "AD_Tab_ID = ?", null)
				.setParameters(id).first();
				if (tab != null) {
					String name = selectedFolder.getElement().getAttributeValue("name");
					tb.setName(name);
					X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(tab.getAD_Table_ID()).first();
					TablePick tp = new TablePick();
					tp.setAD_Table_ID(t.getAD_Table_ID());
					tp.setName(t.getTableName());
					tp.setTree(treeview);					
					tb.setAD_Table_ID(tp);
					sheet.readFromObject(tb);
				}
			} else if (m_type.equals("package")) {
				PackageBean pb = new PackageBean();
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(pb);
				sheet.setProperties(beanInfo.getPropertyDescriptors());				
				String name = selectedFolder.getElement().getAttributeValue("ID");
				pb.setName(name);
				sheet.readFromObject(pb);
			} else if (m_type.equals("plugin")) {
				PluginBean pb = new PluginBean();
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				BeanInfo beanInfo = resolver.getBeanInfo(pb);
				sheet.setProperties(beanInfo.getPropertyDescriptors());
				String uid = selectedFolder.getElement().getAttributeValue("uid");
				String name = selectedFolder.getElement().getAttributeValue("name");
				pb.setName(name);
				sheet.readFromObject(pb);
			}
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		try {			
			String m_type = selectedFolder.getElement().getName();
			if (m_type.equals("table")) {
				Integer tablekey = 0;			
				Iterator it = sheet.propertyIterator();
				while (it.hasNext()) {
					Property p = (Property) it.next();			
					if (p.getName().equals(X_AD_Table.COLUMNNAME_AD_Table_ID)) {
						if (p.getValue() != null) {
							tablekey = (Integer) p.getValue();
							break;
						}
					}
				}	
				if (tablekey > 0) {
					TableBean tabledata = new TableBean();
					sheet.writeToObject(tabledata);			
					Property prop = (Property) evt.getSource();
					X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(tablekey).first();
					if (prop.getValue() instanceof ValueNamePair) {
						ValueNamePair vp =  (ValueNamePair) prop.getValue();
						table.set_ValueOfColumn(prop.getName(), vp.getValue());
					} else {
						table.set_ValueOfColumn(prop.getName(), prop.getValue());
					}								
					table.save();
				}				
			} else if (m_type.equals("column")) {
				Integer columnkey = 0;
				Iterator it = sheet.propertyIterator();
				while (it.hasNext()) {
					Property p = (Property) it.next();
					if (p.getName().equals(X_AD_Column.COLUMNNAME_AD_Column_ID) ) {
						if (p.getValue() != null) {
							columnkey = (Integer) p.getValue();
							break;
						}					
					}
				}
				if (columnkey > 0) {
					ColumnBean columndata = new ColumnBean();
					sheet.writeToObject(columndata);
					Property prop = (Property) evt.getSource();
					X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
					.setParameters(columnkey).first();
					if (prop.getValue() instanceof ValueNamePair) {
						ValueNamePair vp = (ValueNamePair) prop.getValue();
						column.set_ValueOfColumn(prop.getName(), vp.getValue());
					} else if (prop.getValue() instanceof KeyNamePair) {
						KeyNamePair kp = (KeyNamePair) prop.getValue();
						column.set_ValueOfColumn(prop.getName(), kp.getKey());
					} else {
						column.set_ValueOfColumn(prop.getName(), prop.getValue());
					}
					column.save();				
				}					
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}