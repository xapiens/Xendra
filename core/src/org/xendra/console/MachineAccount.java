package org.xendra.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.util.Env;

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
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class MachineAccount {
	private Screen screen;
	private List<X_A_Machine> machines;
	private List<Integer> accountids = new ArrayList<Integer>();
	public MachineAccount(Screen screen) {
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();			
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));

		final Table<String> acctprocessors = new Table<String>("machine","mac_address","name");
		
		String where = "array_length(akeys(properties), 1) > 0";
		machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
		.setOrderBy("name")
		.list();
		for (X_A_Machine machine:machines) {
			List<X_C_AcctProcessor> accounts = new Query(Env.getCtx(), X_C_AcctProcessor.Table_Name, "IsActive='Y' AND A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID())
			.list();
			for (X_C_AcctProcessor account:accounts) {
				acctprocessors.getTableModel().addRow(machine.getName(), machine.getMac_Address(), account.getName());
				accountids.add(account.getC_AcctProcessor_ID());
			}		
		}
		Panel panelaccount = new Panel();
		panelaccount.addComponent(acctprocessors);
		Panel panelabc = new Panel();
		panelabc.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
		panelabc.addComponent(new Button("Add"));
		panelabc.addComponent(new Button("Delete"));
		panelaccount.addComponent(panelabc);
		acctprocessors.setSelectAction(new PickMachine(acctprocessors, gui,"contable","account",accountids));
		mainPanel.addComponent(panelaccount.withBorder(Borders.singleLine("Account")));
		//
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
