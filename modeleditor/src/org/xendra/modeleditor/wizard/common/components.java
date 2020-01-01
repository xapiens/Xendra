package org.xendra.modeleditor.wizard.common;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.apache.commons.lang3.StringUtils;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.apps.ADialog;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.compiere.util.Msg;

public class components implements ActionListener {
	public static components INSTANCE;
	public DataModel m_data;
	//private HashMap elementvalues = new HashMap();
	private HashMap m_controls = new HashMap(); 
	public static components getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new components();
		}
		return INSTANCE;
	}
	public void setControls(HashMap controls) {
		m_controls = controls;
	}
	public HashMap getControls() {
		return m_controls;
	}
	public void setData(DataModel data) {
		m_data = data; 
	}
	
	public CTextField createId(JComponent component, DataModel data, String Id) {
		WizardTextField textfield = new WizardTextField();
		CTextField name = new CTextField();
		try {
			Method method = name.getClass().getMethod("getValue", null);
			if (Id != null)
				name.setValue(Id);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_ID,  new DefaultDataLookup(name, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_ID)));
			textfield.addTextField(name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally  {
			component.add(textfield);
		}
		return name;
	}
	
	public CTextField createName(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		CTextField name = new CTextField();
		try {
			Method method = name.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_Name, new DefaultDataLookup(name, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_Name)));
			textfield.addTextField(name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}		
		return name;
	}
	
	public VLookup createPlugin(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup plugin = null;
		try {
			plugin = VLookup.create(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AD_Plugin_ID, 0);
			Method method = plugin.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_AD_Plugin_ID, new DefaultDataLookup(plugin, method, null));			
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_AD_Plugin_ID)));
			textfield.addTextField(plugin);
			textfield.addExample(new JLabel("explication"));						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return plugin;
	}
	
	public CTextField createTableName(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		CTextField tablename = new CTextField();
		try {
			Method method = tablename.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_TableName, new DefaultDataLookup(tablename, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_TableName)));
			textfield.addTextField(tablename);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}		
		return tablename;				
	}
	
	public CTextField createDescription(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		CTextField descrip = new CTextField();
		try {
			Method method = descrip.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_Description, new DefaultDataLookup(descrip, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_Description)));
			textfield.addTextField(descrip);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return descrip;
	}
	
	public CTextField createCategoryName(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		CTextField categoryname = new CTextField();
		try {
			Method method = categoryname.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Plugin.COLUMNNAME_CategoryName, new DefaultDataLookup(categoryname, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Plugin.COLUMNNAME_CategoryName)));
			textfield.addTextField(categoryname);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return categoryname;
	}
	
	public CTextField createFolder(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		CTextField folder = new CTextField();
		try {
			Method method = folder.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Plugin.COLUMNNAME_Folder, new DefaultDataLookup(folder, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Plugin.COLUMNNAME_Folder)));
			textfield.addTextField(folder);
			textfield.addExample(new JLabel("org.xendra.packagename"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return folder;
	}
	
	
	public CTextField createHelp(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		CTextField help = new CTextField();
		try {
			Method method = help.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_Help, new DefaultDataLookup(help, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_Help)));
			textfield.addTextField(help);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return help;
	}
	
	public VLookup createElement(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup elementname = null;
		try {
			Integer cc = (Integer) data.getData(X_AD_Column.COLUMNNAME_AD_Table_ID);
			MTable table = MTable.get(Env.getCtx(), cc);			
			elementname = VLookup.create(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Element_ID, 0);
			elementname.addActionListener(this);
			Method method = elementname.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Element.COLUMNNAME_AD_Element_ID, new DefaultDataLookup(elementname, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_AD_Element_ID)));
			textfield.addTextField(elementname);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}		
		return elementname;
	}

	public VLookup createAccessLevel(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup accesslevel = null;
		try {
			accesslevel = VLookup.create(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AccessLevel, 0);
			Method method = accesslevel.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_AccessLevel, new DefaultDataLookup(accesslevel, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_AccessLevel)));
			textfield.addTextField(accesslevel);
			textfield.addExample(new JLabel("explication"));						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return accesslevel;
	}
	
	public VLookup createValRule(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup valrule = null;
		try {
			valrule = VLookup.create(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AD_Val_Rule_ID, 0);
			Method method = valrule.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_AD_Val_Rule_ID, new DefaultDataLookup(valrule, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_AD_Val_Rule_ID)));
			textfield.addTextField(valrule);
			textfield.addExample(new JLabel("explication"));						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return valrule;
	}
	
	public JCheckBox createSecurityEnabled(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		JCheckBox secenabled = null;
		try {
			secenabled = new JCheckBox(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_IsSecurityEnabled));			
			Method method = secenabled.getClass().getMethod("isSelected", null);
			data.registerDataLookup(X_AD_Table.COLUMNNAME_IsSecurityEnabled, new DefaultDataLookup(secenabled, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Table.COLUMNNAME_IsSecurityEnabled)));
			textfield.addTextField(secenabled);
			textfield.addExample(new JLabel("explication"));									
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return secenabled;
	}
	
	public VLookup createTable(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup table = null;
		try {
			table = VLookup.create(X_AD_Tab.Table_Name, X_AD_Tab.COLUMNNAME_AD_Table_ID, 0);
			Method method = table.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Tab.COLUMNNAME_AD_Table_ID, new DefaultDataLookup(table, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Tab.COLUMNNAME_AD_Table_ID)));
			textfield.addTextField(table);
			textfield.addExample(new JLabel("explication"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return table;
	}
	
	public VLookup createEntityType(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup entitytype = null;
		try {
			entitytype = VLookup.create(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_EntityType, 0);
			Method method = entitytype.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Column.COLUMNNAME_EntityType, new DefaultDataLookup(entitytype, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_EntityType)));
			textfield.addTextField(entitytype);
			textfield.addExample(new JLabel("explication"));			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}
		return entitytype;
	}
	
	public VLookup createReference(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup reference = null;
		try {
			reference = VLookup.create(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Reference_ID, 0);
			Method method = reference.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Column.COLUMNNAME_AD_Reference_ID, new DefaultDataLookup(reference, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_AD_Reference_ID)));
			textfield.addTextField(reference);			
			textfield.addExample(new JLabel("explication"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}		
		return reference;
	}
	
	public VLookup createReferenceValue(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		VLookup referencevalue = null;
		try {
			referencevalue = VLookup.create(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, 0);
			Method method = referencevalue.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, new DefaultDataLookup(referencevalue, method, null));
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_AD_Reference_Value_ID)));
			textfield.addTextField(referencevalue);			
			textfield.addExample(new JLabel("explication"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}		
		return referencevalue;
	}
	
	public spnfield createFieldLength(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		spnfield fieldlength = new spnfield(X_AD_Column.COLUMNNAME_FieldLength,0,0,2000);
		try {			
			Method method = fieldlength.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Column.COLUMNNAME_FieldLength, new DefaultDataLookup(fieldlength, method, null));			
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_FieldLength)));
			textfield.addTextField(fieldlength);
			textfield.addExample(new JLabel("explication"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}				
		return fieldlength;
	}
	
	public spnfield createVersion(JComponent component, DataModel data) {
		WizardTextField textfield = new WizardTextField();
		spnfield fieldversion = new spnfield(X_AD_Column.COLUMNNAME_Version, 1, 1, 5);
		try {				
			Method method = fieldversion.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Column.COLUMNNAME_Version, new DefaultDataLookup(fieldversion, method, null));			
			textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_Version)));
			textfield.addTextField(fieldversion);
			textfield.addExample(new JLabel("explication"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}		
		return fieldversion;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof CTextField) {
			CTextField field = (CTextField) e.getSource();			
			String fieldname = (String) field.getValue();
			if (fieldname != null) {
				try {
					Method method = field.getClass().getMethod("getValue", null);
					m_data.registerDataLookup(X_AD_Column.COLUMNNAME_Name, new DefaultDataLookup(field, method, null));
					
					X_AD_Element element = new Query(Env.getCtx(), X_AD_Element.Table_Name, "UPPER(columnname) = ?", null)
					.setParameters(fieldname.toUpperCase()).first();					
					if (element == null) {
						if (ADialog.ask(0, null, "Create New Element?")) {
							fieldname = StringUtils.capitalize(fieldname); 
							element = new X_AD_Element(Env.getCtx(), 0, null);
							element.setName(fieldname);
							element.setColumnName(fieldname);
							element.setPrintName(fieldname);
							element.setDescription(fieldname);
							element.setHelp(fieldname);
							element.save();
						}
					}
					if (element != null) {
						//Integer AD_Element_ID = (Integer) data.getData(X_AD_Column.COLUMNNAME_AD_Element_ID);
						MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Element_ID = ?", null)
						.setParameters(element.getAD_Element_ID()).first();
						if (column != null) {
							//reference.setValue(column.getAD_Reference_ID());
							//referencevalue.setValue(column.getAD_Reference_Value_ID());
							//fieldlength.setValue(column.getFieldLength());
							//entitytype.setValue(column.getEntityType());
							
							//elementvalues.put(X_AD_Column.COLUMNNAME_AD_Reference_ID, column.getAD_Reference_ID());
							//elementvalues.put(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, column.getAD_Reference_Value_ID());
							//elementvalues.put(X_AD_Column.COLUMNNAME_FieldLength, column.getFieldLength());
							//elementvalues.put(X_AD_Column.COLUMNNAME_EntityType, column.getEntityType());
							VLookup reference = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_AD_Reference_ID);
							reference.setValue(column.getAD_Reference_ID());
							VLookup referencevalue = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID);
							referencevalue.setValue(column.getAD_Reference_Value_ID());
							VLookup entitytype = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_EntityType);
							entitytype.setValue(column.getEntityType());
							spnfield fieldlength = (spnfield) m_controls.get(X_AD_Column.COLUMNNAME_FieldLength);
							fieldlength.setValue(column.getFieldLength());
							spnfield fieldversion = (spnfield) m_controls.get(X_AD_Column.COLUMNNAME_Version);
							fieldversion.setValue(column.getVersion().intValue());
							
						} else {
							VLookup reference = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_AD_Reference_ID);
							reference.setValue(null);
							VLookup referencevalue = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID);
							referencevalue.setValue(null);
							VLookup entitytype = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_EntityType);
							entitytype.setValue(null);
							spnfield fieldlength = (spnfield) m_controls.get(X_AD_Column.COLUMNNAME_FieldLength);
							fieldlength.setValue(null);
							spnfield fieldversion = (spnfield) m_controls.get(X_AD_Column.COLUMNNAME_Version);
							fieldversion.setValue(null);							
							//reference.setValue(null);
							//referencevalue.setValue(null);
							//fieldlength.setValue(null);
							//entitytype.setValue(null);
							//elementvalues.put(X_AD_Column.COLUMNNAME_AD_Reference_ID, null);							
							//elementvalues.put(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, null);
							//elementvalues.put(X_AD_Column.COLUMNNAME_FieldLength, null);
							//elementvalues.put(X_AD_Column.COLUMNNAME_EntityType, null);							
						}						
					} else {
						VLookup reference = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_AD_Reference_ID);
						reference.setValue(null);
						VLookup referencevalue = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID);
						referencevalue.setValue(null);
						VLookup entitytype = (VLookup) m_controls.get(X_AD_Column.COLUMNNAME_EntityType);
						entitytype.setValue(null);
						spnfield fieldlength = (spnfield) m_controls.get(X_AD_Column.COLUMNNAME_FieldLength);
						fieldlength.setValue(null);
						spnfield fieldversion = (spnfield) m_controls.get(X_AD_Column.COLUMNNAME_Version);
						fieldversion.setValue(null);													
						//reference.setValue(null);		
						///referencevalue.setValue(null);
						//fieldlength.setValue(0);
						//entitytype.setValue(null);
						
						//elementvalues.put(X_AD_Column.COLUMNNAME_AD_Reference_ID, null);							
						//elementvalues.put(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, null);
						//elementvalues.put(X_AD_Column.COLUMNNAME_FieldLength, null);
						//elementvalues.put(X_AD_Column.COLUMNNAME_EntityType, null);													
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}		
	}
}
