package org.xendra.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.compiere.util.DB;

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
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class DBStatStatements {
	Screen screen;
	List<String> sqls = new ArrayList<String>();
	public DBStatStatements(Screen screen) {
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		final Table<String> statements = new Table<String>("total","avg", "query");
		statements.setSelectAction(new showStatementSQL(gui, statements, sqls));
		StringBuilder sql = new StringBuilder("SELECT ") 
		.append("  (total_time / 1000 / 60) as total,") 
		.append("  (total_time/calls) as avg,") 
		.append("  query") 
		.append(" FROM pg_stat_statements") 
		.append(" ORDER BY 2 DESC") 
		.append(" LIMIT 100;");		
		PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
		try {				
			ResultSet rs = pstmt.executeQuery();			
			while (rs.next())
			{
				String total = rs.getBigDecimal(1).toString();
				String avg = rs.getBigDecimal(2).toString();
				String query = rs.getString(3);
				sqls.add(query);
				if (query.length() > 30) {
					query = query.substring(0, 30);
				}
				statements.getTableModel().addRow(total, avg, query);				
			}
		} catch (Exception e) {
			MessageDialogButton answer = new MessageDialogBuilder()
			.setTitle("Error")
			.setText(String.format("%s \n install extension pg_stat_statements?",e.getMessage()))
			.addButton(MessageDialogButton.Yes)			
			.addButton(MessageDialogButton.No)
			.build()
			.showDialog(gui);
			if (answer.ordinal() == MessageDialogButton.Yes.ordinal()) {
				DB.executeUpdate("CREATE EXTENSION PG_STAT_STATEMENTS", null);				
			}
		}
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		Panel panelinfo = new Panel();		
		panelinfo.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		panelinfo.addComponent(statements);		
		panelinfo.addComponent(accept);
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		window.setComponent(panelinfo.withBorder(Borders.singleLine("statements")));
		gui.addWindowAndWait(window);
	}
}
