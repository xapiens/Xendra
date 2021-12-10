package org.xendra.console;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.compiere.util.DB;
import org.xendra.explain.DBExplain;

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
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.table.Table;

public class showStatementSQL implements Runnable {
	MultiWindowTextGUI gui;
	Table<String> table;
	List<String> sqls;
	private TextBox textBox;
	public showStatementSQL(MultiWindowTextGUI gui, Table<String> table, List<String> sqls) {
		this.gui = gui;
		this.table = table;
		this.sqls = sqls;
	}

	@Override
	public void run() {
		final BasicWindow window = new BasicWindow();		
		String sql = sqls.get(table.getSelectedRow());
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));		
		textBox = new TextBox(new TerminalSize(gui.getScreen().getTerminalSize().getColumns(), gui.getScreen().getTerminalSize().getRows()-10));
		textBox.setText(sql);
		Panel p = new Panel();
		p.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		p.addComponent(textBox);
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		Button analyze = new Button("Analyze", new Runnable() {
			@Override
			public void run() {
				String sql = textBox.getText();
				DBExplain analyze = new DBExplain(gui, sql);
				String error = analyze.sanitazeSQL();
				if (error.length() > 0) {
					MessageDialogButton answer = new MessageDialogBuilder()
					.setTitle("Error")
					.setText(error)
					.addButton(MessageDialogButton.OK)			
					.build()
					.showDialog(gui);
				} else {
					List<String> commands = analyze.explain();
					if (commands.size() > 0) {
						StringBuilder sqlanalyze = new StringBuilder();					
						for (String command:commands) {
							sqlanalyze.append(command).append("\n");	
						}
						MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Analyze")					
						.setText(sqlanalyze.toString())
						.addButton(MessageDialogButton.Yes)			
						.addButton(MessageDialogButton.No)
						.build()
						.showDialog(gui);
						if (answer.ordinal() == MessageDialogButton.Yes.ordinal()) {
							for (String command:commands) {
								int no = DB.executeUpdate(command, null);
								if (no == -1) {
									MessageDialogButton execute = new MessageDialogBuilder()
									.setTitle("Analyze")					
									.setText(String.format("fallo al ejecutar\n %s ", command))
									.addButton(MessageDialogButton.OK)			
									.build()
									.showDialog(gui);															
								}
							}
						}							
					} else {
						MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Analyze")					
						.setText("NO se encontro optimizacion recomendada")
						.addButton(MessageDialogButton.OK)			
						.build()
						.showDialog(gui);						
					}
				}
			}
		});		
		p.addComponent(accept);		
		p.addComponent(analyze);
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		window.setComponent(p.withBorder(Borders.singleLine("statements")));
		gui.addWindowAndWait(window);
	}

}
