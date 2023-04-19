package org.xendra.console;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import org.compiere.model.MRole;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.SecureEngine;
import org.xendra.api.Connection;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class TuningEngine {
	private Connection connection;
	private Screen screen;
	public TuningEngine(Connection some) {
		try {
			this.connection = some;
			this.initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initialize() throws IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();	
		screen = new TerminalScreen(terminal);
		TextGraphics tGraphics = screen.newTextGraphics();
		screen.startScreen();
		screen.clear();
	}

	public void bootstrap() {		
		try {
			screen.startScreen();
			new DBConfig(screen, connection);
			new TuningDashBoard(screen);			
			screen.stopScreen();
		} catch (Exception e) {
			final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
			MessageDialogButton answer = new MessageDialogBuilder()
			.setTitle("Error")
			.setText(e.getMessage())
			.addButton(MessageDialogButton.OK)				
			.build()
			.showDialog(gui);								
		}
	}
}
