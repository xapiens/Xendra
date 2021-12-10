package org.xendra.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Logger;
import org.columba.core.io.DiskIO;
import org.compiere.util.CLogger;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class TerminalLicenseDialog {
	
	private static CLogger log	= CLogger.getCLogger(TerminalLicenseDialog.class.getName());
	private boolean m_accept = false;
	private BasicWindow window;
	private Screen screen;
	
	public TerminalLicenseDialog() {
		try {			
			Terminal terminal = new DefaultTerminalFactory().createTerminal();
			//Terminal terminal = Text.getTerminal();
			screen = new TerminalScreen(terminal);
			screen.startScreen();
			window = new BasicWindow();
			StringBuffer sb = new StringBuffer();
			String where = "org/compiere/license.html";
			String ls = System.getProperty("line.separator");
			InputStream resourcestream = DiskIO.getResourceStream(where);
			if (resourcestream != null)
			{
				String line;								
				BufferedReader br = new BufferedReader(new InputStreamReader(resourcestream));
				while ((line = br.readLine()) != null) {
					sb.append(line);
					sb.append(ls);
				}
			}			
			TextBox textbox = new TextBox(new TerminalSize(60,20), sb.toString());
			textbox.setReadOnly(true);
			textbox.withBorder(Borders.singleLine("Heading"));		
			Button accept = new Button("I Accept", new Runnable() {
				@Override
				public void run() {
					m_accept = true;					
					window.close();
					try {
						screen.stopScreen();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
			Button decline = new Button("decline", new Runnable() {
				@Override
				public void run() {
					m_accept = false;
					window.close();
					try {
						screen.stopScreen();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
			Panel panel = new Panel();
			panel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
			panel.addComponent(textbox);
			Panel confirmPanel = new Panel();
			confirmPanel.setLayoutManager(new GridLayout(2));
			confirmPanel.addComponent(accept);
			confirmPanel.addComponent(decline);
			panel.addComponent(confirmPanel);			
			window.setComponent(panel.withBorder(Borders.singleLine("License")));
			window.setHints(Arrays.asList(Window.Hint.CENTERED));
			MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
			gui.addWindowAndWait(window);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}				
	}

	public static boolean accept() {
		TerminalLicenseDialog id = new TerminalLicenseDialog();
		if (id.isAccepted())
		{
			log.info("License Accepted");
			return true;
		}
		System.exit(10);
		return false;       //  never executed.	}
	}

	private boolean isAccepted() {
		return m_accept;
	}
}