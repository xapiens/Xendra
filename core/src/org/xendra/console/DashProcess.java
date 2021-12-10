package org.xendra.console;

import java.util.Arrays;

import org.compiere.util.DB;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.screen.Screen;

public class DashProcess {
	public DashProcess(Screen screen, String title, String command, String tablename) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		final Label status = new Label("/");
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(1));		
		panel.addComponent(new Label(title));
		panel.addComponent(status);
		window.setComponent(panel.withBorder(Borders.singleLine(title)));
		gui.addWindow(window);
		ThreadRotDash dash = new ThreadRotDash(gui, status);
		dash.start();
		Thread thread = new Thread(dash);
		thread.start();
		if (command.equals("DELETE")) {
			DB.executeUpdate(String.format("DELETE FROM %s", tablename), null);
		} else if (command.equals("DELETEPROCESSED")) {
			DB.executeUpdate(String.format("DELETE FROM %s WHERE Processed = 'Y'", tablename), null);
		} else if (command.equals("DELETEPROCESSEDWITHOUTERROS")) {
			DB.executeUpdate(String.format("DELETE FROM %s WHERE Processed = 'Y' AND COALESCE(errormsg,'nil') = 'nil'", tablename), null);
		}
		dash.stop();
		window.close();		
	}
}
