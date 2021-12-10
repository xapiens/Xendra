package org.xendra.console;

import java.util.Arrays;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class DBMisc {
	Screen screen;
	public DBMisc(Screen screen) {
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();		
		final Table<String> tableuser = new Table<String>("name");
		final Table<String> tableext = new Table<String>("name");
		for (String user:DBmonitor.get().getUsers()) {
			tableuser.getTableModel().addRow(user);
		}			
		for (String extname:DBmonitor.get().getExtensions()) {
			tableext.getTableModel().addRow(extname);	
		}
		Panel panelinfo = new Panel();
		panelinfo.setLayoutManager(new GridLayout(1));			
		panelinfo.addComponent(tableuser.withBorder(Borders.singleLine("User")));
		panelinfo.addComponent(tableext.withBorder(Borders.singleLine("extensions")));	
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));		
		panelinfo.addComponent(accept);
		window.setComponent(panelinfo.withBorder(Borders.singleLine("info")));
		gui.addWindowAndWait(window);				
	}
}
