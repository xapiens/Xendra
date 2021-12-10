package org.columba.core.gui.processmanager;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import org.columba.core.gui.frame.FrameManager;
import org.columba.core.gui.processmanager.folder.HostNode;
import org.columba.core.gui.processmanager.folder.MachineServerNode;
import org.columba.core.gui.processmanager.folder.MaterialPolicyNode;
import org.columba.core.gui.processmanager.folder.MaterialProcessorNode;
import org.columba.core.gui.processmanager.folder.ProcessNode;
import org.columba.core.gui.processmanager.folder.RootNode;
import org.columba.core.gui.processmanager.folder.SchedulerNode;
import org.columba.core.gui.processmanager.folder.SchedulerParaNode;
import org.columba.core.gui.processmanager.folder.ServerProcessNode;
import org.columba.core.gui.processmanager.wizard.ProcessWizardLauncher;
import org.compiere.model.MClient;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_AD_SchedulerMachine;
import org.compiere.model.persistence.X_AD_Scheduler_Para;
import org.compiere.model.persistence.X_AD_WorkflowProcessor;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.model.persistence.X_C_CashFlowProcessor;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.persistence.X_R_RequestProcessor;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.frapuccino.treetable.TreeTable;
import org.xendra.cost.MaterialPolicyWizardLauncher;
import org.xendra.util.UpdatePO;

public class TableMouseListener extends MouseAdapter implements ActionListener {
	private static final String ADDMATERIALSERVER = "AMTS";
	private static final String ADDMATERIALPROCESSOR = "AMP";
	private static final String ADDREPLICATIONSERVER = "ARS";
	private static final String ADDMATERIALPOLICY = "AMPOL";
	private static final String ADDWEBSERVER = "AWS";
	private static final String ADDPROCESS = "APRC";
	private static final String ADDMESSAGESERVER = "AMSS";
	//private static final String ADDUPDATESERVER = "AUPDS";
	private static final String ADDSCHEDULER = "ASCHE";	
	private TreeTable table;
	private ProcessManagerDialog m_pmd;
	protected JPopupMenu menu;
	//protected JPopupMenu schedulermenu;
	/**
	 * true, if the messagelist table selection event was triggered by a popup
	 * event. False, otherwise.
	 */
	public boolean isTablePopupEvent;

	public TableMouseListener(ProcessManagerDialog pmd, TreeTable treeTable) {
		m_pmd = pmd;
		table = treeTable;
		createPopupMenu();
		//createSchedulerMenu();
	}

	/**
	 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent event) {
		if (event.isPopupTrigger()) {
			processPopup(event);
		}
	}

	/**
	 * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
	 */
	public void mouseReleased(MouseEvent event) {
		if (event.isPopupTrigger()) {
			processPopup(event);
		}
	}

	public void mouseClicked(MouseEvent e) {

	}

	protected void processPopup(final MouseEvent event) {
		boolean showPupupMenu = true;
		int row = -1;
		if (table.getSelectedRowCount() <= 1) {
			// select node
			row = table.rowAtPoint(new Point(event.getX(), event.getY()));
			if (row != -1) {
				isTablePopupEvent = true;
				table.setRowSelectionInterval(row, row);								
			} else {
				showPupupMenu = false;
			}
			if (showPupupMenu) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {											
						Object node = table.getTree().getPathForRow(table.getSelectedRow()).getLastPathComponent();
						if (node != null) {
							if (node instanceof HostNode) {
								getHostPopupMenu((HostNode) node).show(event.getComponent(), event.getX(), event.getY());
							} else if(node instanceof MachineServerNode) {
								MachineServerNode mn = (MachineServerNode) node;
								getMachineServerMenu().show(event.getComponent(), event.getX(), event.getY());
							} else if(node instanceof RootNode) {
								
							} else if(node instanceof ServerProcessNode) {
								
							} else if(node instanceof SchedulerNode) {
								getPopupMenu().show(event.getComponent(), event.getX(), event.getY());
							} else if(node instanceof MaterialProcessorNode) {
								getMaterialProcessorMenu().show(event.getComponent(), event.getX(), event.getY());
							} else if(node instanceof MaterialPolicyNode) {
								getMaterialPolicyMenu().show(event.getComponent(), event.getX(), event.getY());
							} else if(node instanceof SchedulerParaNode) {
								
							} else if(node instanceof ProcessNode) {
								getProcessPopupMenu((ProcessNode) node).show(event.getComponent(), event.getX(), event.getY());
							}
						}										
					}
				});
			}			
		}
	}

	/** ************************ actions ******************************* */
	/**
	 * create the PopupMenu
	 */
	public void createPopupMenu() {
		try {
			menu = new JPopupMenu("Edit");
			ImageIcon localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			JMenuItem cut = new JMenuItem("Delete",localIcon);
			cut.setActionCommand("DELETE");
			cut.addActionListener(this);			
			menu.add(cut);	      
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Get popup menu
	 * 
	 * @return popup menu
	 */
	public JPopupMenu getPopupMenu() {		
		return menu;
	}
	public JPopupMenu getMachineServerMenu() {
		JPopupMenu msmenu = new JPopupMenu("Edit");
		try {
			ImageIcon deleteIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			JMenuItem del = new JMenuItem("Delete",deleteIcon);
			del.setActionCommand("DELETE");
			del.addActionListener(this);						
			msmenu.add(del);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msmenu;
	}
	public JPopupMenu getMaterialPolicyMenu() {
		JPopupMenu mpmenu = new JPopupMenu("Edit");
		try {
			ImageIcon deleteIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			ImageIcon scheduleIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "schedule.png"))));
			JMenuItem del = new JMenuItem("Delete",deleteIcon);
			del.setActionCommand("DELETE");
			del.addActionListener(this);			
			mpmenu.add(del);
			JMenuItem scheduler = new JMenuItem("Add Scheduler",scheduleIcon);
			scheduler.setActionCommand(ADDSCHEDULER);
			scheduler.addActionListener(this);
			mpmenu.add(scheduler);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mpmenu;
	}
	public JPopupMenu getMaterialProcessorMenu() {
		JPopupMenu mpmenu = new JPopupMenu("Edit");
		try {
			ImageIcon localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "warehouse.png"))));
			ImageIcon deleteIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			JMenuItem policy = new JMenuItem("Add Policy", localIcon);
			policy.setActionCommand(ADDMATERIALPOLICY);
			policy.addActionListener(this);
			//
			JMenuItem del = new JMenuItem("Delete",deleteIcon);
			del.setActionCommand("DELETE");
			del.addActionListener(this);			
			mpmenu.add(policy);
			mpmenu.add(del);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mpmenu;
	}
	public JPopupMenu getProcessPopupMenu(ProcessNode p) {
		JPopupMenu processmenu = new JPopupMenu("Edit");
		try {			
			KeyNamePair kp = (KeyNamePair) p.getAD_Process_ID();
			ImageIcon localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "applications-system.png"))));
			ImageIcon delIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			//
			JMenuItem exe = new JMenuItem("Execute",localIcon);
			exe.setActionCommand("EXECUTE");
			exe.addActionListener(this);
			processmenu.add(exe);
			//
			int count = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Process_ID = ?" , null)
			.setParameters(kp.getKey()).count();
			if (count == 0) {
				ImageIcon addIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "add.png"))));
				JMenuItem add = new JMenuItem("Add Scheduler",addIcon);
				add.setActionCommand(ADDSCHEDULER);
				add.addActionListener(this);
				processmenu.add(add);
			}
			JMenuItem del = new JMenuItem("Delete",delIcon);
			del.setActionCommand("DELETE");
			del.addActionListener(this);			
			processmenu.add(del);	      
		} catch (Exception e) {
			e.printStackTrace();
		}
		return processmenu;
	}

	public JPopupMenu getMaterialPopupMenu() {
		JPopupMenu matmenu = new JPopupMenu("Edit");
		try {
			String where  = "";
			int count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where , null)
			.setParameters(REF_ServerType.MaterialServer).count();
			if (count == 0) {										
				ImageIcon delIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
				JMenuItem del = new JMenuItem("Delete",delIcon);
				del.setActionCommand("DELETEMATERIALPROCESSOR");
				del.addActionListener(this);			
				matmenu.add(del);	      			
			}
		} catch (Exception e) {

		}
		return matmenu;
	}

	public JPopupMenu getHostPopupMenu(HostNode node) {
		JPopupMenu hostmenu = new JPopupMenu("Edit");
		try {			
			String machineid = String.valueOf(node.getA_Machine_ID());
			ImageIcon localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "applications-system.png"))));
			ImageIcon delIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			String where = "properties->'A_Machine_ID'  = ? AND servertype = ?";
			int count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where , null)
			.setParameters(machineid,REF_ServerType.MaterialServer).count();
			if (count == 0) {							
				JMenuItem mat = new JMenuItem("add MaterialServer",localIcon);
				mat.setActionCommand(ADDMATERIALSERVER);
				mat.addActionListener(this);			
				hostmenu.add(mat);	      
			}			
			count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
			.setParameters(machineid, REF_ServerType.MessageServer).setClient_ID().count();
			if (count == 0) {
				JMenuItem msg = new JMenuItem("add Message Server", localIcon);
				msg.setActionCommand(ADDMESSAGESERVER);
				msg.addActionListener(this);
				hostmenu.add(msg);
			}			
			count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where , null)
			.setParameters(machineid, REF_ServerType.WebServer).count();
			if (count == 0) {							
				JMenuItem web = new JMenuItem("add Web Server",localIcon);
				web.setActionCommand(ADDWEBSERVER);
				web.addActionListener(this);			
				hostmenu.add(web);	      
			}												
			count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
			.setParameters(machineid, REF_ServerType.ReplicationServer).count();
			if (count == 0) {
				JMenuItem replication = new JMenuItem("add Replication Server", localIcon);
				replication.setActionCommand(ADDREPLICATIONSERVER);
				replication.addActionListener(this);
				hostmenu.add(replication);
			}
			//count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where , null)
			//.setParameters(machineid, REF_ServerType.UpdateServer).count();
			//if (count == 0) {							
			//	JMenuItem update = new JMenuItem("add Update Server",localIcon);
			//	update.setActionCommand(ADDUPDATESERVER);
			//	update.addActionListener(this);			
			//	hostmenu.add(update);	      
			//}											
			JMenuItem proc = new JMenuItem("add Process", localIcon);
			proc.setActionCommand(ADDPROCESS);
			proc.addActionListener(this);
			hostmenu.add(proc);
			//
			MClient client = MClient.get(Env.getCtx());
			where = "AD_Client_ID = ?";
			count = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, where , null)
			.setParameters(client.getAD_Client_ID()).count();
			if (count == 0) {
				JMenuItem mat = new JMenuItem(String.format("add Material Processor for %s",client.getName()),localIcon);
				mat.setActionCommand(ADDMATERIALPROCESSOR);
				mat.addActionListener(this);			
				hostmenu.add(mat);	      				
			}						
			JMenuItem del = new JMenuItem("Delete",delIcon);
			del.setActionCommand("DELETE");
			del.addActionListener(this);
			hostmenu.add(del);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hostmenu;
	}

	public void addServer(Integer A_Machine_ID, String ServerType, HashMap defaultprops)  {
		String machineid = A_Machine_ID.toString();
		X_A_MachineServer machineserver = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ? AND properties->'A_Machine_ID'  = ?", null)
		.setParameters(ServerType, machineid).first();
		if (machineserver == null)
		{
			machineserver = new X_A_MachineServer(Env.getCtx(), 0, null);
			machineserver.setServerType(ServerType);
		}			
		HashMap props = machineserver.getProperties();
		props.put(X_A_Machine.COLUMNNAME_A_Machine_ID, A_Machine_ID);
		Iterator it = defaultprops.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			if (!props.containsKey(key))
				props.put(key, defaultprops.get(key));
		}
		machineserver.setProperties(props);
		machineserver.setIsActive(true);
		machineserver.save();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object node = table.getTree().getPathForRow(table.getSelectedRow()).getLastPathComponent();
		HashMap props = new HashMap();
		if (e.getActionCommand().equals(ADDMATERIALSERVER)) {
			HostNode n = (HostNode) node;
			int A_Machine_ID = n.getA_Machine_ID();
			addServer(A_Machine_ID, REF_ServerType.MaterialServer, props);
		}
		else if (e.getActionCommand().equals(ADDMATERIALPOLICY)) {
			MaterialPolicyWizardLauncher nn = new MaterialPolicyWizardLauncher();
			MaterialProcessorNode mp = (MaterialProcessorNode) node;
			nn.launchWizard(mp.getName(), mp.getM_MaterialProcessor_ID());
		}
		else if (e.getActionCommand().equals(ADDWEBSERVER)) {
			HostNode n = (HostNode) node;
			int A_Machine_ID = n.getA_Machine_ID();			
			props.put("port", 8080);
			props.put("secureport", 8888);
			addServer(A_Machine_ID, REF_ServerType.WebServer, props);
		}
		else if (e.getActionCommand().equals(ADDMESSAGESERVER)) {
			HostNode n = (HostNode) node;
			int A_Machine_ID = n.getA_Machine_ID();
			addServer(A_Machine_ID, REF_ServerType.MessageServer, props);
		}
		//else if (e.getActionCommand().equals(ADDUPDATESERVER)) {
		//	HostNode n = (HostNode) node;
		//	int A_Machine_ID = n.getA_Machine_ID();
		//	addServer(A_Machine_ID, REF_ServerType.UpdateServer, props);
		//}
		else if (e.getActionCommand().equals(ADDREPLICATIONSERVER)) {
			HostNode n = (HostNode) node;
			int A_Machine_ID = n.getA_Machine_ID();
			addServer(A_Machine_ID, REF_ServerType.ReplicationServer, props);
		}
		else if (e.getActionCommand().equals(ADDMATERIALPROCESSOR)) {
			HostNode n = (HostNode) node;
			MClient client = MClient.get(Env.getCtx());
			X_M_MaterialProcessor proc = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "A_Machine_ID = ?", null)			
			.setParameters(n.getA_Machine_ID()).first();
			if (proc == null) {
				proc = new X_M_MaterialProcessor(Env.getCtx(), 0, null);
			}
			proc.setA_Machine_ID(n.getA_Machine_ID());
			proc.setSupervisor_ID(Env.getAD_User_ID(Env.getCtx()));
			proc.setName(client.getName());
			proc.setKeepLogDays(7);
			proc.setFrequency(1);
			proc.setFrequencyType(REF__FrequencyType.Day);
			proc.save();
		}
		else if (e.getActionCommand().equals(ADDSCHEDULER)) {
			if (node instanceof MaterialPolicyNode) {
				MaterialPolicyNode p = (MaterialPolicyNode) node;
				X_AD_Scheduler scheduler = new X_AD_Scheduler(Env.getCtx(), 0, null);			
				KeyNamePair kp = (KeyNamePair) p.getAD_Process_ID();
				scheduler.setAD_Process_ID(kp.getKey());
				scheduler.setName(kp.getName());
				scheduler.setFrequency(1);
				scheduler.setSupervisor_ID(Env.getAD_User_ID(Env.getCtx()));
				scheduler.setFrequencyType(REF__FrequencyType.Day);
				scheduler.setKeepLogDays(7);			
				scheduler.setIsActive(true);
				if (scheduler.save()) {
					X_M_MaterialPolicy policy = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
					.setParameters(p.getM_MaterialPolicy_ID()).first();
					if (policy != null) {
						X_M_MaterialProcessor mp = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "M_MaterialProcessor_ID = ?", null)
						.setParameters(policy.getM_MaterialProcessor_ID()).first();
						X_AD_SchedulerMachine sm = new X_AD_SchedulerMachine(Env.getCtx(), 0, null);
						sm.setAD_Scheduler_ID(scheduler.getAD_Scheduler_ID());						
						sm.setA_Machine_ID(mp.getA_Machine_ID());				
						sm.save();
						List<X_AD_Process_Para> params = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ?", null)
							.setParameters(kp.getKey()).list();  
						for (X_AD_Process_Para param:params) {
							X_AD_Scheduler_Para sp = new X_AD_Scheduler_Para(Env.getCtx(), 0, null);
							sp.setAD_Process_Para_ID(param.getAD_Process_Para_ID());
							sp.setAD_Scheduler_ID(scheduler.getAD_Scheduler_ID());
							sp.setParameterDefault(String.valueOf(policy.getAD_Client_ID()));
							sp.save();
						}					
					}					
				}							
			} else if (node instanceof ProcessNode) {
				ProcessNode p = (ProcessNode) node;
				X_AD_Scheduler scheduler = new X_AD_Scheduler(Env.getCtx(), 0, null);			
				KeyNamePair kp = (KeyNamePair) p.getAD_Process_ID();
				scheduler.setAD_Process_ID(kp.getKey());
				scheduler.setName(kp.getName());
				scheduler.setFrequency(1);
				scheduler.setSupervisor_ID(Env.getAD_User_ID(Env.getCtx()));
				scheduler.setFrequencyType(REF__FrequencyType.Day);
				scheduler.setKeepLogDays(7);			
				scheduler.setIsActive(true);
				if (scheduler.save()) {
					KeyNamePair prockp = (KeyNamePair) p.getAD_Process_ID();
					List<X_AD_Process_Para> params = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ?", null)
						.setParameters(prockp.getKey()).list();
					for (X_AD_Process_Para para:params) {
						X_AD_Scheduler_Para spa = new Query(Env.getCtx(), X_AD_Scheduler_Para.Table_Name,"AD_Scheduler_ID = ? AND AD_Process_Para_ID = ?", null)
							.setParameters(scheduler.getAD_Scheduler_ID(), para.getAD_Process_Para_ID()).first();
						if (spa == null) {
							spa = new X_AD_Scheduler_Para(Env.getCtx(), 0, null);
							spa.setAD_Scheduler_ID(scheduler.getAD_Scheduler_ID());
							spa.setAD_Process_Para_ID(para.getAD_Process_Para_ID());
							spa.save();
						}
					}
				}			
			}
		}
		else if (e.getActionCommand().equals(ADDPROCESS)) {
			if (node instanceof HostNode) {
				HostNode h = (HostNode) node;
				ProcessWizardLauncher nn = new ProcessWizardLauncher();
				nn.launchWizard(h.getA_Machine_ID());				
			}			
		}
		else if (e.getActionCommand().equals("DELETE")) {			
			int confirm = JOptionPane.showConfirmDialog(FrameManager.getInstance().getActiveFrame(), 
					String.format("Esta seguro de eliminar %s ?",node),"Xendra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (confirm == JOptionPane.YES_OPTION) {
				if (node instanceof MaterialProcessorNode) {
					MaterialProcessorNode mp = (MaterialProcessorNode) node;
					X_M_MaterialProcessor m = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "M_MaterialProcessor_ID = ?", null)
					.setParameters(mp.getM_MaterialProcessor_ID()).first();
					if (m != null) 
						m.delete(true);
				} else if (node instanceof MaterialPolicyNode) {
					MaterialPolicyNode mp = (MaterialPolicyNode) node;
					X_M_MaterialPolicy m = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
					.setParameters(mp.getM_MaterialPolicy_ID()).first();
					if (m != null) 
						m.delete(true);					
				} else if (node instanceof MachineServerNode) {
					MachineServerNode m = (MachineServerNode) node;
					X_A_MachineServer s = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
					.setParameters(m.getA_MachineServer_ID()).first();
					if (s != null) 
						s.delete(true);							
				} else if (node instanceof SchedulerNode) {
					SchedulerNode sn = (SchedulerNode) node;
					X_AD_Scheduler s = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Scheduler_ID = ?", null)
					.setParameters(sn.getAD_Scheduler_ID()).first();
					if (s != null) {
						List<X_AD_Scheduler_Para> sparams = new Query(Env.getCtx(), X_AD_Scheduler_Para.Table_Name, "AD_Scheduler_ID = ?", null)
							.setParameters(s.getAD_Scheduler_ID()).list();
						for (X_AD_Scheduler_Para sparam:sparams) {
							sparam.delete(true);
						}
						s.delete(true);
					}
				} else if (node instanceof HostNode) {
					HostNode h = (HostNode) node;
					X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
					.setParameters(h.getA_Machine_ID()).first();
					if (m != null) {
						String where = "properties->'A_Machine_ID'  = ?";
						List<X_A_MachineServer> servers = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where , null)
						.setParameters(String.valueOf(h.getA_Machine_ID())).list();
						for (X_A_MachineServer server:servers) {
							server.delete(true);
						}
						where = "A_Machine_ID = ?";
						List<X_AD_Process_Machine> processes = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, where , null)
						.setParameters(h.getA_Machine_ID()).list();		
						//
						for (X_AD_Process_Machine process:processes) {
							process.delete(true);
						}						
						X_M_MaterialProcessor proc = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, where , null)			
						.setParameters(h.getA_Machine_ID()).first();
						if (proc != null) {
							proc.delete(true);
						}
						List<X_R_RequestProcessor> r = new Query(Env.getCtx(), X_R_RequestProcessor.Table_Name, where , null)
						.setParameters(h.getA_Machine_ID()).list();
						for (X_R_RequestProcessor p:r) {
							p.delete(true);
						}
						List<X_AD_WorkflowProcessor> w = new Query(Env.getCtx(), X_AD_WorkflowProcessor.Table_Name, where , null)
						.setParameters(h.getA_Machine_ID()).list();		
						for (X_AD_WorkflowProcessor p:w) {
							p.delete(true);
						}
						List<X_C_AcctProcessor> a = new Query(Env.getCtx(), X_C_AcctProcessor.Table_Name, where , null)
						.setParameters(h.getA_Machine_ID()).list();
						for (X_C_AcctProcessor p:a) {
							p.delete(true);
						}
						List<X_C_CashFlowProcessor> c = new Query(Env.getCtx(), X_C_CashFlowProcessor.Table_Name, where, null)
						.setParameters(h.getA_Machine_ID()).list();		
						for (X_C_CashFlowProcessor p:c)	{
							p.delete(true);
						}						
						m.delete(true);
					}
				} else if (node instanceof ProcessNode) {
					ProcessNode n = (ProcessNode) node;						
					UpdatePO o = new UpdatePO();
					o.setTablename(X_AD_Process_Machine.Table_Name);
					int no = o.delete(String.format("AD_Process_Machine_ID = %s", n.getAD_Process_Machine_ID()), null);
					if (no > 0)
						m_pmd.updateModel();
				} else if (node instanceof SchedulerNode) {

				} 
			}			
		}
		m_pmd.updateModel();
	}
}