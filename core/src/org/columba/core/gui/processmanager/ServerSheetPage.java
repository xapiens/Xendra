package org.columba.core.gui.processmanager;

import java.beans.BeanInfo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JPanel;

import org.columba.core.gui.processmanager.folder.HostNode;
import org.columba.core.gui.processmanager.folder.MachineServerNode;
import org.columba.core.gui.processmanager.folder.MaterialPolicyNode;
import org.columba.core.gui.processmanager.folder.MaterialProcessorNode;
import org.columba.core.gui.processmanager.folder.ProcessNode;
import org.columba.core.gui.processmanager.folder.SchedulerNode;
import org.columba.core.gui.processmanager.folder.SchedulerParaNode;
import org.columba.core.gui.processmanager.folder.ServerProcessNode;
import org.compiere.apps.ADialog;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_AD_Scheduler_Para;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.controls.LookupEditor;

import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheet;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import com.l2fprod.common.swing.LookAndFeelTweaks;

public class ServerSheetPage extends JPanel implements PropertyChangeListener {

	private static final String Alias = "Alias";
	private static final String IsDefault = "IsDefault";
	private static final String port = "port";
	private PropertySheetPanel sheet;
	private WebServerBean webserverdata;
	private Object selectedNode;
	private ProcessNode m_node;
	private ProcessManagerDialog m_pmd;

	public ServerSheetPage(ProcessManagerDialog pmd) {
		setLayout(LookAndFeelTweaks.createVerticalPercentLayout());
		sheet = new PropertySheetPanel();
		sheet.setMode(PropertySheet.VIEW_AS_CATEGORIES);
		sheet.setDescriptionVisible(true);
		add(sheet, "");
		sheet.addPropertySheetChangeListener(this);
		m_pmd = pmd;
	}

	public void setServerProperties(ProcessNode node) {
		m_node = node;
		if (m_node instanceof HostNode) {
			try {
				X_A_Machine machine = new X_A_Machine(Env.getCtx(), m_node.getA_Machine_ID(), null);
				HashMap props = machine.getProperties();				
				props.put(X_A_Machine.COLUMNNAME_Name, machine.getName());
				props.put(X_A_Machine.COLUMNNAME_Lockout, machine.isLockout());
				props.put(X_A_Machine.COLUMNNAME_Mac_Address, machine.getMac_Address());
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
		else if (m_node instanceof SchedulerNode) {
			SchedulerNode schedulernode = (SchedulerNode) m_node;
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(schedulernode);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);
			sheet.readFromObject(schedulernode);
			sheet.setEnabled(true);
		}
		else if (m_node instanceof SchedulerParaNode) {
			SchedulerParaNode schedulerparanode = (SchedulerParaNode) m_node;
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(schedulerparanode);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);
			sheet.readFromObject(schedulerparanode);
			sheet.setEnabled(true);			
		}
		else if (m_node instanceof MachineServerNode) {
			MachineServerNode msnode = (MachineServerNode) m_node;
			try {
				if (msnode.getServerType().equals(REF_ServerType.WebServer)) {
					WebServerBean webbean = new WebServerBean();
					renderproperties(webbean);
				//} else if (msnode.getServerType().equals(REF_ServerType.UpdateServer)) {
				//	UpdateServerBean upbean = new UpdateServerBean();
				//	renderproperties(upbean);
				} else if (msnode.getServerType().equals(REF_ServerType.MaterialServer)) {
					MMServerBean mmbean = new MMServerBean();
					renderproperties(mmbean);
				} else if (msnode.getServerType().equals(REF_ServerType.MessageServer)) {
					MSServerBean msbean = new MSServerBean();
					renderMessageServerBean(msbean);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}		
		else if (m_node instanceof ServerProcessNode) {
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(m_node);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);
			sheet.readFromObject(m_node);
			sheet.setEnabled(true);
		}
		else if (m_node instanceof MaterialProcessorNode) {
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(m_node);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);			
			sheet.readFromObject(m_node);
			sheet.setEnabled(true);												
		}
		else if (m_node instanceof MaterialPolicyNode) {
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(m_node);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);			
			sheet.readFromObject(m_node);
			sheet.setEnabled(true);															
		}
		else if (m_node instanceof ProcessNode) {
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(m_node);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);			
			sheet.readFromObject(m_node);
			sheet.setEnabled(true);									
		}				
	}
	private void renderMessageServerBean(MSServerBean msbean) {
		try {
			X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), ((MachineServerNode) m_node).getA_MachineServer_ID(), null);
			HashMap props = ms.getProperties();
			Integer A_Machine_ID = Integer.valueOf(props.get(X_A_Machine.COLUMNNAME_A_Machine_ID).toString());
			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
				.setParameters(A_Machine_ID).first();
			DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
			BeanInfo beanInfo = resolver.getBeanInfo(msbean);
			sheet.setProperties(beanInfo.getPropertyDescriptors());
			sheet.setEnabled(false);		
			msbean.setA_Machine_ID(A_Machine_ID);
			int port = 1099;
			if (props.containsKey(port)) 
				port = Integer.valueOf(props.get(port).toString());
			msbean.setPort(port);			
			String alias = "";
			if (props.containsKey(Alias))
				alias = props.get(Alias).toString();
			msbean.setAlias(alias);			
			Boolean isDefault = false;
			if (props.containsKey(IsDefault))
				isDefault = props.get(IsDefault).toString().equals("true");			
			msbean.setIsDefault(isDefault);
			KeyNamePair vp = new KeyNamePair(msbean.getA_Machine_ID(), machine.getName());			
			msbean.setIdentifier(vp);
			sheet.readFromObject(msbean);
			sheet.setEnabled(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void renderproperties(ServerBean mmbean) {
		try {
			X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), ((MachineServerNode) m_node).getA_MachineServer_ID(), null);
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
					} else if (field.getType().equals(int.class)) {
						int intvalue = Integer.valueOf((String)props.get(field.getName()));
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
	// save the properties
	@Override
	public void propertyChange(PropertyChangeEvent evt) {		
		try {
			if (sheet.isEnabled()) {
				if (m_node instanceof SchedulerNode) {
					SchedulerNode s = (SchedulerNode) m_node;
					X_AD_Scheduler scheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Scheduler_ID = ?", null)
					.setParameters(s.getAD_Scheduler_ID()).first();
					if (scheduler != null) {
						Property prop = (Property) evt.getSource();
						if (prop.getName().equals(X_AD_Scheduler.COLUMNNAME_Tag)) {
							scheduler.setTag((String) prop.getValue());

						} else if (prop.getName().equals(X_AD_Scheduler.COLUMNNAME_FrequencyType)) {
							ValueNamePair vp = (ValueNamePair) prop.getValue();
							scheduler.setFrequencyType(vp.getValue());							
						} else if (prop.getName().equals(X_AD_Scheduler.COLUMNNAME_Frequency)) {
							scheduler.setFrequency((Integer) prop.getValue());							
						} else if (prop.getName().equals(X_AD_Scheduler.COLUMNNAME_FrequencyStartAt)) {
							scheduler.setFrequencyStartAt((Integer) prop.getValue());
						}							
						scheduler.save();
						m_pmd.updateModel();
					}
				}
				//private Integer AD_Scheduler_ID;
				//private HashMap AD_Process_Para_ID;
				//private Integer AD_Scheduler_Para_ID;				
				//private String Name;
				//private String Description;
				else if (m_node instanceof SchedulerParaNode) {
					SchedulerParaNode s = (SchedulerParaNode) m_node;
					X_AD_Scheduler_Para spara = new Query(Env.getCtx(), X_AD_Scheduler_Para.Table_Name, "AD_Scheduler_Para_ID = ?", null)
					.setParameters(s.getAD_Scheduler_Para_ID()).first();
					if (spara != null) {					
						Property p = (Property) evt.getSource();
						if (p.getName().equals(X_AD_Scheduler_Para.COLUMNNAME_ParameterDefault)) {
							HashMap map = (HashMap) p.getValue();
							String vardisplay = (String) map.get(X_AD_Scheduler_Para.COLUMNNAME_ParameterDisplay);
							Object var = (Object) map.get(X_AD_Scheduler_Para.COLUMNNAME_ParameterDefault);
							String varvalue = "";
							if (var instanceof Integer) {
								varvalue = String.valueOf((Integer) var);
							}							
							spara.setParameterDisplay(vardisplay);
							spara.setParameterDefault(varvalue);
							spara.save();
							m_pmd.updateModel();
						}
					}
				}
				else if (m_node instanceof MaterialProcessorNode) {
					X_M_MaterialProcessor mp = new X_M_MaterialProcessor(Env.getCtx(), ((MaterialProcessorNode) m_node).getM_MaterialProcessor_ID(), null);
					if (mp != null) {						
						Property[] props = sheet.getProperties();
						for (Property p:props) {
							if (p.getName().equals(X_M_MaterialProcessor.COLUMNNAME_A_Machine_ID)) {
								mp.setA_Machine_ID((Integer)p.getValue());
							} else if (p.getName().equals(X_M_MaterialProcessor.COLUMNNAME_DateNextRun)) {
								mp.setDateNextRun((Timestamp) p.getValue());
							} else if (p.getName().equals(X_M_MaterialProcessor.COLUMNNAME_DateLastRun)) {
								mp.setDateLastRun((Timestamp) p.getValue());
							}
						}
						mp.save();
						m_pmd.updateModel();
					}
				}
				else if (m_node instanceof MaterialPolicyNode) {
					X_M_MaterialPolicy mp = new X_M_MaterialPolicy(Env.getCtx(), ((MaterialPolicyNode) m_node).getM_MaterialPolicy_ID(), null);
					if (mp != null) {
						Property[] props = sheet.getProperties();
						for (Property p:props) {
							if (p.getName().equals(X_M_MaterialPolicy.COLUMNNAME_StartDate)) {
								Date c = (Date) p.getValue();
								if (c != null) {
									mp.setStartDate(new Timestamp(c.getTime()));
								}
							} else if (p.getName().equals(X_M_MaterialPolicy.COLUMNNAME_Synchronized)) {
								Boolean sync = (Boolean) p.getValue();
								mp.setSynchronized(sync);
							} else if (p.getName().equals(X_M_MaterialPolicy.COLUMNNAME_M_CostElement_ID)) {								
								KeyNamePair vp = (KeyNamePair) p.getValue();
								if (vp != null)
									mp.setM_CostElement_ID(vp.getKey());
							} else if (p.getName().equals(X_M_MaterialPolicy.COLUMNNAME_Name)) {
								String name = (String) p.getValue();
								mp.setName(name);
							}
						}
						mp.save();
						m_pmd.updateModel();
					}
				}
				else if (m_node instanceof MachineServerNode) {
					X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), ((MachineServerNode)m_node).getA_MachineServer_ID(), null);
					if (ms != null) {
						//Property prop = (Property) evt.getSource();
						//if (prop.getName().equals(X_A_MachineServer.COLUMNNAME_A_Machine_ID)) {
						//	ms.setA_Machine_ID((Integer) prop.getValue());
						//} else {
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
						//}
					ms.save();
					m_pmd.updateModel();
					}
				} else if (m_node instanceof HostNode) {
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
							} else if(p.getName().equals(X_A_Machine.COLUMNNAME_Mac_Address)) {
								m.setMac_Address((String) p.getValue());
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
				} else if (m_node instanceof ProcessNode) {
					X_AD_Process_Machine pm = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "AD_Process_Machine_ID = ?", null)
					.setParameters(m_node.getAD_Process_Machine_ID()).first();
					if (pm != null) {
						Property prop = (Property) evt.getSource();
						if (prop.getName().equals(X_A_Machine.COLUMNNAME_A_Machine_ID)) {
							pm.setA_Machine_ID((int) prop.getValue());
							pm.save();
							m_pmd.updateModel();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static class ClientEditor extends LookupEditor {
		public ClientEditor() {
			super(X_AD_Org.Table_Name, Constants.COLUMNNAME_AD_Client_ID);
		}
	}
	public static class RuleEditor extends LookupEditor {
		public RuleEditor() {
			super(X_AD_Process.Table_Name, X_AD_Process.COLUMNNAME_AD_Rule_ID);
		}
	}
	public static class ProcessEditor extends LookupEditor {
		public ProcessEditor() {
			super(X_AD_Column.Table_Name, X_AD_Column.COLUMNNAME_AD_Process_ID);
		}
	}
	public static class FrequencyTypeEditor extends LookupEditor {
		public FrequencyTypeEditor() {
			super(X_AD_Scheduler.Table_Name, X_AD_Scheduler.COLUMNNAME_FrequencyType);
		}
	}
	public static class CostElementEditor extends LookupEditor {
		public CostElementEditor() {
			super(X_M_MaterialPolicy.Table_Name, X_M_MaterialPolicy.COLUMNNAME_M_CostElement_ID);
		}		
	}	
}
