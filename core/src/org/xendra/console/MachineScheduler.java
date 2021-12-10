package org.xendra.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.DB;
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

public class MachineScheduler {
	private Screen screen;
	private List<X_A_Machine> machines;	 
	private List<Integer> processmachineids = new ArrayList<Integer>();
	public MachineScheduler(Screen screen) {
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();			
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		final Table<String> schedulers = new Table<String>("machine","mac_address","type","lastrun","nextrun","name");
		String where = "array_length(akeys(properties), 1) > 0";
		machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
		.setOrderBy("name")
		.list();
		for (X_A_Machine machine:machines) {
			StringBuilder sql = new StringBuilder("SELECT pm.AD_Process_Machine_ID, frequencytype, datelastrun, datenextrun, s.name FROM AD_Scheduler s ") 
			 .append(" LEFT OUTER JOIN AD_Process p ON s.AD_Process_ID = p.AD_Process_ID ") 
			 .append("JOIN AD_Process_Machine pm ON p.AD_Process_ID = pm.AD_Process_ID AND pm.A_Machine_ID = ? ")
			 .append("WHERE pm.IsActive='Y' AND s.IsActive = 'Y' ");
			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement (sql.toString(), null);
				pstmt.setInt(1, machine.getA_Machine_ID());
				//pstmt.setInt(2, machine.getA_Machine_ID());
				ResultSet rs = pstmt.executeQuery ();
				while (rs.next ())
				{
					SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy");
					int processmachineid = rs.getInt("AD_Process_Machine_ID");
					Timestamp t = rs.getTimestamp("datelastrun");
					String datelastrun = "";
					if (t != null)
						datelastrun = df.format(t);
					t = rs.getTimestamp("datenextrun");
					String datenextrun = "";
					if (t != null) 
						datenextrun = df.format(t);
					String frequencytype = rs.getString("frequencytype");
					String name = rs.getString("name");					
					schedulers.getTableModel().addRow(machine.getName(), machine.getMac_Address(), frequencytype,  datelastrun, datenextrun, name);
					processmachineids.add(processmachineid );
				}
				rs.close ();
				pstmt.close ();
				pstmt = null;
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				if (pstmt != null)
					pstmt.close ();
				pstmt = null;
			}
			catch (Exception e)
			{
				pstmt = null;
			}			
		}
		Panel panelscheduler = new Panel();
		panelscheduler.addComponent(schedulers);
		Panel paneldef = new Panel();
		paneldef.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
		paneldef.addComponent(new Button("Add"));
		paneldef.addComponent(new Button("Delete"));
		panelscheduler.addComponent(paneldef);
		schedulers.setSelectAction(new PickMachine(schedulers, gui,"Scheduler","scheduler",processmachineids));
		mainPanel.addComponent(panelscheduler).withBorder(Borders.singleLine("Scheduler"));
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
