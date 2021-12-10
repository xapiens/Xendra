package org.xendra.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_A_Xendrian_Replication;
import org.compiere.util.DB;
import org.compiere.util.Env;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class DBReplication {
	Screen screen;
	public DBReplication(Screen screen) {
		this.screen = screen;
		setup();
	}
	public void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		final Table<String> tablereplica = new Table<String>("id","created","error");
		tablereplica.setSelectAction(new showReplica(gui, tablereplica));
		StringBuilder sql = new StringBuilder("select a_xendrian_replication_id, created, left(errormsg,20) from a_xendrian_replication where coalesce(errormsg,'e') != 'e' order by created desc  limit 20");
		PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
		try {				
			ResultSet rs = pstmt.executeQuery();			
			while (rs.next())
			{
				String id = rs.getString(1);
				String created = rs.getString(2);
				String errormsg = rs.getString(3);
				tablereplica.getTableModel().addRow(id, created, errormsg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		Button pack = new Button("Pack", new Runnable() {
			@Override
			public void run() {
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Confirm")
				.setText(String.format("pack Replication?"))
				.addButton(MessageDialogButton.Yes)				
				.addButton(MessageDialogButton.No)
				.build()
				.showDialog(gui);
				if (answer.equals(MessageDialogButton.Yes)) {
					new DashProcess(screen,"delete replication processed without errors","DELETEPROCESSEDWITHOUTERROS",X_A_Xendrian_Replication.Table_Name);
				}				
			}
		});				
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});		
		Button delete = new Button("Delete", new Runnable() {
			@Override
			public void run() {
				int index = tablereplica.getSelectedRow();
				List<String> row = tablereplica.getTableModel().getRow(index);
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Error")
				.setText(String.format("delete %s %s %s?", row.get(0),row.get(1),row.get(2)))
				.addButton(MessageDialogButton.Yes)				
				.addButton(MessageDialogButton.No)
				.build()
				.showDialog(gui);
				if (answer.equals(MessageDialogButton.Yes)) {				
					X_A_Xendrian_Replication repl = new Query(Env.getCtx(), X_A_Xendrian_Replication.Table_Name, "X_A_Xendrian_Replication_ID = ?", null)
						.setParameters(Integer.valueOf(row.get(0))).first();
					if (repl != null) {
						repl.delete(true);
						tablereplica.getTableModel().removeRow(index);
					}					
				} 
			}
		});		
		Panel panelinfo = new Panel();
		panelinfo.addComponent(tablereplica);
		panelinfo.addComponent(accept);
		panelinfo.addComponent(pack);
		panelinfo.addComponent(delete);
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		window.setComponent(panelinfo.withBorder(Borders.singleLine("Replication")));
		gui.addWindowAndWait(window);												
	}
}
