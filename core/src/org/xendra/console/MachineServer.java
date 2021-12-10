package org.xendra.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.util.Env;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class MachineServer {
	private Screen screen;
	private List<X_A_Machine> machines;
	private List<Integer> machineserverids = new ArrayList<Integer>();
	public MachineServer(Screen screen) {
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();			
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));				
		final Table<String> tablemachines = new Table<String>("machine","mac address","type","default");
		String where = "array_length(akeys(properties), 1) > 0";
		List<X_A_MachineServer> servers = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
		.setOrderBy("servertype").list();
		for (X_A_MachineServer server:servers) {
			if (server.getProperties().containsKey("A_Machine_ID")) {
				String isdefault = "false";
				if (server.getProperties().containsKey("IsDefault")) {
					isdefault = (String) server.getProperties().get("IsDefault");
				}
				String A_Machine_ID = (String) server.getProperties().get("A_Machine_ID");
				X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
				.setParameters(Integer.valueOf(A_Machine_ID)).first();
				if (machine != null) {
					tablemachines.getTableModel().addRow(machine.getName(), machine.getMac_Address(), server.getServerType(), isdefault);
					machineserverids.add(server.getA_MachineServer_ID());
				}
			} 
		}		
		Panel panelaccount = new Panel();
		panelaccount.addComponent(tablemachines);
		Panel panelabc = new Panel();
		panelabc.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
		Button delete = new Button("Delete", new Runnable() {			
			@Override
			public void run() {
				List<String> row = tablemachines.getTableModel().getRow(tablemachines.getSelectedRow());
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Error")
				.setText(String.format("delete %s %s %s?", row.get(0),row.get(1),row.get(2)))
				.addButton(MessageDialogButton.Yes)				
				.addButton(MessageDialogButton.No)
				.build()
				.showDialog(gui);
				if (answer.equals(MessageDialogButton.Yes)) {
					int selectedrow = tablemachines.getSelectedRow();
					int machineserverid = machineserverids.get(selectedrow);
					X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
						.setParameters(machineserverid).first();
					if (ms != null) {
						ms.delete(true);
						tablemachines.getTableModel().removeRow(selectedrow );
					}					
				} 
			}
		});				
		Button add = new Button("Add", new Runnable() {
			@Override
			public void run() {
				String where = "array_length(akeys(properties), 1) > 0";
				machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
				.setOrderBy("name")
				.list();		
				ActionListDialogBuilder db = new ActionListDialogBuilder();
				db.setTitle("Action List");
				db.setListBoxSize(new TerminalSize(40, 10));
				db.setDescription("add");				
				for (X_A_Machine machine:machines) {
					db.addAction(String.format("%s %s", machine.getName(), machine.getMac_Address()), new AddMachineType( machine.getA_Machine_ID(), "server", gui)); 
				}
				db.build().showDialog(gui);												
				window.close();
			}
		});
		panelabc.addComponent(add);
		panelabc.addComponent(delete);
		panelaccount.addComponent(panelabc);
		tablemachines.setSelectAction(new EditMachine(tablemachines, gui, "server",machineserverids));
		mainPanel.addComponent(panelaccount.withBorder(Borders.singleLine("Server")));
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		mainPanel.addComponent(accept);
		window.setComponent(mainPanel.withBorder(Borders.singleLine("Machines")));
		gui.addWindowAndWait(window);		
	}
}