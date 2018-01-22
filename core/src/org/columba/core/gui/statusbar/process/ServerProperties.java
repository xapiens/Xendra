package org.columba.core.gui.statusbar.process;

import java.beans.BeanInfo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JPanel;

import org.compiere.apps.ADialog;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;
import org.xendra.Constants;
import org.xendra.controls.LookupEditor;
import org.xendra.rules.ProcessNode;

import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheet;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import com.l2fprod.common.swing.LookAndFeelTweaks;

public class ServerProperties extends JPanel implements PropertyChangeListener {

	private PropertySheetPanel sheet;
	private WebServerBean webserverdata;
	private Object selectedNode;
	private ProcessNode m_node;

	public ServerProperties() {
		setLayout(LookAndFeelTweaks.createVerticalPercentLayout());
		sheet = new PropertySheetPanel();
		sheet.setMode(PropertySheet.VIEW_AS_CATEGORIES);
		sheet.setDescriptionVisible(true);
		add(sheet, "");
		sheet.addPropertySheetChangeListener(this);
	}

	public void setServerProperties(ProcessNode node) {
		m_node = node;
		if (m_node.getType().equals(ProcessNode.Host)) {
			try {
				X_A_Machine machine = new X_A_Machine(Env.getCtx(), m_node.getA_Machine_ID(), null);
				HashMap props = machine.getProperties();				
				props.put(X_A_Machine.COLUMNNAME_Name, machine.getName());
				props.put(X_A_Machine.COLUMNNAME_Lockout, machine.isLockout());
				DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
				MachineBean machinebean = new MachineBean();
				BeanInfo beanInfo = resolver.getBeanInfo(machinebean);
				sheet.setProperties(beanInfo.getPropertyDescriptors());
				sheet.setEnabled(false);
				Field[] fields = machinebean.getClass().getDeclaredFields();
				for (Field field:fields) {
					Object value = props.get(field.getName());
					if (value != null) {
						if (field.getType().equals(Integer.class)) {
							Integer intvalue = Integer.valueOf((String)props.get(field.getName()));
							field.set(machinebean, intvalue);
						} else if (field.getType().equals(String.class)) {
							String strvalue = (String)props.get(field.getName());
							field.set(machinebean, strvalue);
						} else if (field.getType().equals(Boolean.class)) {
							Boolean val = (Boolean) props.get(field.getName());
							field.set(machinebean, val);
						} 																	
					}
				}
				sheet.readFromObject(machinebean);
				sheet.setEnabled(true);						
			} catch (Exception e) {
				e.printStackTrace();
			}						
		}					
		else if (m_node.getType().equals(ProcessNode.Process)) {
			System.out.println("process");			
		}			
		else if (m_node.getType().equals(ProcessNode.ServerProcess)) {
			System.out.println("serverprocess");			
		}			
		else if (m_node.getType().equals(ProcessNode.MachineServer)) {
			try {
				//X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), m_node.getA_MachineServer_ID(), null);
				//HashMap props = ms.getProperties();
				//DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();				
				if (m_node.getServerType().equals(REF_ServerType.WebServer)) {
					WebServerBean webbean = new WebServerBean();
					renderproperties(webbean);
//					BeanInfo beanInfo = resolver.getBeanInfo(webbean);
//					sheet.setProperties(beanInfo.getPropertyDescriptors());
//					sheet.setEnabled(false);
//					Field[] fields = webbean.getClass().getDeclaredFields();					
//					for (Field field:fields) {
//						Object value = props.get(field.getName());
//						if (value != null) {					
//							if (field.getType().equals(Integer.class)) {
//								Integer intvalue = Integer.valueOf((String)props.get(field.getName()));
//								field.set(webbean, intvalue);
//							} else if (field.getType().equals(String.class)) {
//								String strvalue = (String)props.get(field.getName());
//								field.set(webbean, strvalue);
//							} else if (field.getType().equals(NamePair.class)) {
//								if (field.getName().equals(Constants.COLUMNNAME_AD_Client_ID)) {									
//									int AD_Column_ID = MColumn.getColumn_ID(X_AD_Org.Table_Name, Constants.COLUMNNAME_AD_Client_ID, null);
//									MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
//									Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, column.getAD_Reference_ID());
//									Object[] values = lookup.getData(false, false, true, false).toArray();
//									for (Object val:values) {
//										KeyNamePair kp = (KeyNamePair) val;
//										Integer id = Integer.valueOf((String) props.get(field.getName()));
//										if (kp.getKey() == id) {
//											field.set(webbean, val);
//											break;
//										}										
//									}
//								}
//							}												
//						}
//					}
//					sheet.readFromObject(webbean);
//					sheet.setEnabled(true);						
				} else if (m_node.getServerType().equals(REF_ServerType.MaterialServer)) {
					MMServerBean mmbean = new MMServerBean();
					renderproperties(mmbean);
				} else if (m_node.getServerType().equals(REF_ServerType.TransferenceServer)) {
					TRServerBean trbean = new TRServerBean();
					renderproperties(trbean);
//					BeanInfo beanInfo = resolver.getBeanInfo(trbean);
//					sheet.setProperties(beanInfo.getPropertyDescriptors());
//					sheet.setEnabled(false);
//					Field[] fields = trbean.getClass().getDeclaredFields();
//					fields = trbean.getClass().getDeclaredFields();
//					for (Field field:fields) {
//						Object value = props.get(field.getName());
//						if (value != null) {
//							if (field.getType().equals(Integer.class)) {
//								Integer intvalue = Integer.valueOf((String) props.get(field.getName()));
//								field.set(trbean, intvalue);								
//							} else if (field.getType().equals(String.class)) {
//								String strvalue = (String) props.get(field.getName());
//								field.set(trbean, strvalue);
//							}
//						}
//					}
//					sheet.readFromObject(trbean);
//					sheet.setEnabled(true);
				} else if (m_node.getServerType().equals(REF_ServerType.XendrianServer)) {
					XSServerBean xsbean = new XSServerBean();
					renderproperties(xsbean);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
	private void renderproperties(ServerBean mmbean) {
		try {
			X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), m_node.getA_MachineServer_ID(), null);
			HashMap props = ms.getProperties();		
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(mmbean);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);
			Field[] fields = mmbean.getClass().getDeclaredFields();
			fields = mmbean.getClass().getDeclaredFields();
			for (Field field:fields) {
				Object value = props.get(field.getName());
				if (value != null) {					
					if (field.getType().equals(Integer.class)) {
						Integer intvalue = Integer.valueOf((String)props.get(field.getName()));
						field.set(mmbean, intvalue);
					} else if (field.getType().equals(String.class)) {
						String strvalue = (String)props.get(field.getName());
						field.set(mmbean, strvalue);
					} else if (field.getType().equals(Boolean.class)) {
						Boolean val = props.get(field.getName()).equals("true");
						field.set(mmbean,  val);
					} else if (field.getType().equals(NamePair.class)) {
						if (field.getName().equals(Constants.COLUMNNAME_AD_Client_ID)) {									
							int AD_Column_ID = MColumn.getColumn_ID(X_AD_Org.Table_Name, Constants.COLUMNNAME_AD_Client_ID, null);
							MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
							Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, column.getAD_Reference_ID());
							Object[] values = lookup.getData(false, false, true, false).toArray();
							for (Object val:values) {
								KeyNamePair kp = (KeyNamePair) val;
								Integer id = Integer.valueOf((String) props.get(field.getName()));
								if (kp.getKey() == id) {
									field.set(mmbean, val);
									break;
								}										
							}
						}
					}												
				}
			}
			sheet.readFromObject(mmbean);
			sheet.setEnabled(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {		
		try {
			if (sheet.isEnabled()) {
				if (m_node.getType().equals(ProcessNode.MachineServer)) {
					X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), m_node.getA_MachineServer_ID(), null);					
					HashMap props = ms.getProperties();										
					Iterator iter = sheet.propertyIterator();
					while (iter.hasNext()) {
						Property p = (Property) iter.next();						
						if (p.getValue() != null) {
							if (p.getValue() instanceof NamePair) {
								NamePair np = (NamePair) p.getValue();
								props.put(p.getName(), np.getID());		
							} else if (p.getValue() instanceof Number) {								
								props.put(p.getName(), String.valueOf((Integer) p.getValue()));
							} else if (p.getValue() instanceof String) {
								props.put(p.getName(), p.getValue());
							} else if (p.getValue() instanceof Boolean) {
								props.put(p.getName(), p.getValue());
							}
						} 					
					}
					ms.setProperties(props);
					ms.save();					
				} else if (m_node.getType().equals(ProcessNode.Host)) {
					X_A_Machine m = new X_A_Machine(Env.getCtx(), m_node.getA_Machine_ID(), null);
					HashMap props = m.getProperties();
					Iterator iter = sheet.propertyIterator();
					while (iter.hasNext()) {
						Property p = (Property) iter.next();
						if (p.getValue() != null) {
							if (p.getName().equals(X_A_Machine.COLUMNNAME_Name)) {
								m.setName((String) p.getValue());
							} else if(p.getName().equals(X_A_Machine.COLUMNNAME_Lockout)) {								
								m.setLockout((Boolean)p.getValue());
							} else if(p.getValue() instanceof NamePair) {
								NamePair np = (NamePair) p.getValue();
								props.put(p.getName(),  np.getID());
							} else if (p.getValue() instanceof Number) {
								props.put(p.getName(), String.valueOf((Integer) p.getValue()));
							} else if (p.getValue() instanceof String) {
								props.put(p.getName(),  p.getValue());
							}
						}
					}
					m.setProperties(props);
					m.save();
				}
			}
		} catch (Exception e) {

		}
	}
	public static class ClientEditor extends LookupEditor {
		public ClientEditor() {
			super(X_AD_Org.Table_Name, Constants.COLUMNNAME_AD_Client_ID);
		}
	}	
}
