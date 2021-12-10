package org.xendra.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import org.compiere.util.DB;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.table.Table;

public class showIssue implements Runnable {
	MultiWindowTextGUI gui;
	Table<String> table;
	public showIssue(MultiWindowTextGUI gui, Table<String> table) {
		this.gui = gui;
		this.table = table;		
	}
	@Override
	public void run() {
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		TextBox textBox = new TextBox(new TerminalSize(gui.getScreen().getTerminalSize().getColumns(), gui.getScreen().getTerminalSize().getRows()-10));
		List<String> row = table.getTableModel().getRow(table.getSelectedRow());
		String id = row.get(0);
		String sql = "Select issuesummary from ad_issue where ad_issue_id = ?";
		try {
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, Integer.valueOf(id));			
			ResultSet rs = pstmt.executeQuery();			
			if (rs.next())
			{
				String msg = rs.getString(1);
				textBox.setText(msg);				
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		Panel p = new Panel();
		p.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		p.addComponent(textBox);
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		p.addComponent(accept);		
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		window.setComponent(p.withBorder(Borders.singleLine("Issue")));
		gui.addWindowAndWait(window);				
	}

}
