package org.xendra.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.compiere.model.MMaterialPolicy;
import org.compiere.model.MMaterialProcessor;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_M_CostElement;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.persistence.X_M_MaterialProcessorLog;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.CheckBoxList;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;
import com.googlecode.lanterna.gui2.table.Table;


public class EditMachine implements Runnable {
	Table<String> table;
	String type;
	List<Integer> ids;
	MultiWindowTextGUI gui;
	public EditMachine(Table<String> table, MultiWindowTextGUI gui,
			String type, List<Integer> ids) {
		this.table = table;
		this.gui = gui;		
		this.type = type;
		this.ids = ids;		
	}

	@Override
	public void run() {
		final BasicWindow window = new BasicWindow();
		final TextBox porthttp = new TextBox();
		final TextBox porthttps = new TextBox();
		final CheckBoxList<String> checkBoxList = new CheckBoxList<String>();		
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel panel = new Panel();		
		if (type.equals("server")) {
			int id = ids.get(table.getSelectedRow()); 
			X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
			.setParameters(id).first();
			String machineid = (String) ms.getProperties().get("A_Machine_ID");
			X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(Integer.valueOf(machineid)).first();
			panel.addComponent(new Label(m.getName()));
			if (ms.getServerType().equals(REF_ServerType.WebServer)) {				
				String port = "";
				String secureport = "";
				Boolean state = false;
				if (ms.getProperties().containsKey("IsDefault")) {
					state = ms.getProperties().get("IsDefault").equals("true");
				}
				checkBoxList.addItem("Default", state);
				if (ms.getProperties().containsKey("port"))
					port = (String) ms.getProperties().get("port");				
				if (ms.getProperties().containsKey("secureport"))
					secureport = (String) ms.getProperties().get("secureport");
				porthttp.setText(port);
				porthttps.setText(secureport);
				Panel props = new Panel();
				props.setLayoutManager(new GridLayout(2));
				props.addComponent(new Label("port http"));
				props.addComponent(porthttp);
				props.addComponent(new Label("port https"));
				props.addComponent(porthttps);
				props.addComponent(checkBoxList);
				X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
				if (webserver != null) {
					if (Env.getMachine().getMac_Address().equals(webserver.getMac_Address())) {
						props.addComponent(new Button("Start server", new Runnable() {
							@Override
							public void run() {
								try {
									String serverclazz = "org.xendra.xendrian.server";
									Thread.currentThread().getContextClassLoader().loadClass(serverclazz);
									//Class<?> s = Class.forName(serverclazz);		
									//Runnable x = new Runnable() {
										
									//}
									//Thread t = new Thread(s);
									//t.start();
								} catch (Exception e) {
									e.printStackTrace();
								} 
								
							}
						}));
					}
				}				
				panel.addComponent(props);
			} else if (ms.getServerType().equals(REF_ServerType.MaterialServer)) {
				String port = "";
				if (ms.getProperties().containsKey("port"))
					port = (String) ms.getProperties().get("port");
				porthttp.setText(port);
				Panel props = new Panel();
				props.setLayoutManager(new GridLayout(2));
				props.addComponent(new Label("port"));
				props.addComponent(porthttp);
				panel.addComponent(props);
				panel.addComponent(new Button("Logs", new Runnable() {
					@Override
					public void run() {				
						final BasicWindow windowlog = new BasicWindow();
						String where = "M_MaterialProcessor_ID = ?";						
						List<String> obj = table.getTableModel().getRow(table.getSelectedRow());
						X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "mac_address = ?", null)
						.setParameters(obj.get(1)).first();
						final Table<String> tableevent = new Table<String>("event","description");
						X_M_MaterialProcessor mp = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "A_Machine_ID = ?", null)
						.setParameters(m.getA_Machine_ID()).first();
						if (mp != null) {
							List<X_M_MaterialProcessorLog> serverslogs = new Query(Env.getCtx(), X_M_MaterialProcessorLog.Table_Name, where, null)
							.setParameters(mp.getM_MaterialProcessor_ID()).list();							
							for (X_M_MaterialProcessorLog serverlog:serverslogs) {
								tableevent.getTableModel().addRow(serverlog.getCreated().toString(), serverlog.getSummary());
							}		
						}
						Panel mainPanel = new Panel();
						mainPanel.addComponent(tableevent);
						//
						Button accept = new Button("Ok", new Runnable() {
							@Override
							public void run() {
								windowlog.close();
							}
						});
						mainPanel.addComponent(accept);						
						windowlog.setComponent(mainPanel.withBorder(Borders.singleLine("Events")));
						gui.addWindowAndWait(windowlog);		
					}
				}));
				panel.addComponent(new Button("Processor", new Runnable() {
					@Override
					public void run() {
						final BasicWindow windowprocessor = new BasicWindow();
						final Table<String> tableprocessor = new Table<String>("Name");
						final List<Integer> processorids = new ArrayList<Integer>();
						List<String> obj = table.getTableModel().getRow(table.getSelectedRow());
						X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "mac_address = ?", null)
						.setParameters(obj.get(1)).first();
						List<MMaterialProcessor> list = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "IsActive='Y' AND A_Machine_ID = ?", null)
						.setParameters(m.getA_Machine_ID())
						.list();
						for (MMaterialProcessor m_model:list) {
							tableprocessor.getTableModel().addRow(m_model.getName());
							processorids.add(m_model.getM_MaterialProcessor_ID());
						}
						Panel mainPanel = new Panel();
						mainPanel.addComponent(tableprocessor);
						Panel panelabc = new Panel();
						panelabc.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
						panelabc.addComponent(new Button("Add"));
						panelabc.addComponent(new Button("Delete"));
						panelabc.addComponent(new Button("Policies", new Runnable() {
							@Override
							public void run() {					
								final BasicWindow windowpolicies = new BasicWindow();
								final Table<String> tablepolicies = new Table<String>("Name","CostElement");
								List<Integer> policiesids = new ArrayList<Integer>();
								tablepolicies.setSelectAction(new EditPolicy(tablepolicies, gui, policiesids));
									List<MMaterialPolicy> policies = new Query(Env.getCtx(), MMaterialPolicy.Table_Name, "M_MaterialProcessor_ID = ?", null)
									.setParameters(processorids.get(tableprocessor.getSelectedRow())).list();
									for (MMaterialPolicy police:policies) {
										String cename = "N/A";
										X_M_CostElement ce = new Query(Env.getCtx(), X_M_CostElement.Table_Name, "M_CostElement_ID = ?", null)
										.setParameters(police.getM_CostElement_ID()).first();
										if (ce != null) {
											cename = ce.getName();
										}
										tablepolicies.getTableModel().addRow(police.getName(), cename);
										policiesids.add(police.getM_MaterialPolicy_ID());
									}
								//}						
								Panel mainPanel = new Panel();
								mainPanel.addComponent(tablepolicies);
								Panel panelabc = new Panel();
								panelabc.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
								Button add = new Button("Add", new Runnable() {
									@Override
									public void run() {
										//AddMachine pm = new AddMachine("server", gui);							
//										String where = "array_length(akeys(properties), 1) > 0";
//										machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
//										.setOrderBy("name")
//										.list();		
//										ActionListDialogBuilder db = new ActionListDialogBuilder();
//										db.setTitle("Action List");
//										db.setListBoxSize(new TerminalSize(40, 10));
//										db.setDescription("add");				
//										for (X_A_Machine machine:machines) {
//											db.addAction(String.format("%s %s", machine.getName(), machine.getMac_Address()), new AddMachineType( machine.getA_Machine_ID(), "server", gui)); 
//										}
//										db.build().showDialog(gui);												
//										window.close();
									}
								});
								panelabc.addComponent(add);
								panelabc.addComponent(new Button("Delete"));
								mainPanel.addComponent(panelabc);
								//
								Button accept = new Button("Ok", new Runnable() {
									@Override
									public void run() {
										windowpolicies.close();
									}
								});
								mainPanel.addComponent(accept);						
								windowpolicies.setComponent(mainPanel.withBorder(Borders.singleLine("Policies")));
								gui.addWindowAndWait(windowpolicies);		
							}
						}));						
						mainPanel.addComponent(panelabc);
						mainPanel.addComponent(new Button("Change equipment", new Runnable() {
							@Override
							public void run() {				
								String where = "array_length(akeys(properties), 1) > 0";
								ActionListDialogBuilder db = new ActionListDialogBuilder();
								db.setTitle("Action List");
								db.setListBoxSize(new TerminalSize(40, 10));
								db.setDescription("");				
								List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
								.setOrderBy("name")
								.list();		
								for (X_A_Machine machine:machines) {
									db.addAction(String.format("%s %s", machine.getName(), machine.getMac_Address()),new ChangeMaterialProcessor(processorids.get(tableprocessor.getSelectedRow()), machine.getA_Machine_ID(), tableprocessor)); 
								}
								db.build().showDialog(gui);												
							}			
						}));
						//
						Button accept = new Button("Ok", new Runnable() {
							@Override
							public void run() {
								windowprocessor.close();
							}
						});
						mainPanel.addComponent(accept);						
						windowprocessor.setComponent(mainPanel.withBorder(Borders.singleLine("Processor")));
						gui.addWindowAndWait(windowprocessor);		
					}					
				}));
			}
		}
		panel.addComponent(new Button("Change equipment", new Runnable() {
			@Override
			public void run() {				
				String where = "array_length(akeys(properties), 1) > 0";
				ActionListDialogBuilder db = new ActionListDialogBuilder();
				db.setTitle("Action List");
				db.setListBoxSize(new TerminalSize(40, 10));
				db.setDescription("");				
				List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
				.setOrderBy("name")
				.list();		
				for (X_A_Machine machine:machines) {
					db.addAction(String.format("%s %s", machine.getName(), machine.getMac_Address()),new ChangeMachine(ids.get(table.getSelectedRow()), machine.getA_Machine_ID(), table, type)); 
				}
				db.build().showDialog(gui);				
				//window.close();
			}			
		}));
		panel.addComponent(new Button("Ok", new Runnable() {
			@Override
			public void run() {
				if (type.equals("server")) {
					int id = ids.get(table.getSelectedRow()); 
					X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
					.setParameters(id).first();
					HashMap p = ms.getProperties();			
					if (ms.getServerType().equals(REF_ServerType.WebServer)) {
						p.put("port", porthttp.getText());
						p.put("secureport", porthttps.getText());
						Boolean isdefault = checkBoxList.isChecked("Default");						
						if (ms.getProperties().containsKey("IsDefault") || isdefault) {
							p.put("IsDefault", isdefault ? "true" : "false");
						}												
					} else if (ms.getServerType().equals(REF_ServerType.MaterialServer)) {
						p.put("port", porthttp.getText());
					}
					ms.setProperties(p);
					ms.save();
					window.close();
				}
			}						
		}));		
		window.setComponent(panel.withBorder(Borders.singleLine("Edit")));
		gui.addWindowAndWait(window);
	}

}
