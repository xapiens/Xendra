package org.xendra.console;

import java.util.Arrays;
import java.util.Timer;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.menu.Menu;
import com.googlecode.lanterna.gui2.menu.MenuBar;
import com.googlecode.lanterna.screen.Screen;

public class TuningDashBoard {
	Screen screen;
	MenuBar menubar;
	public static Timer timer = null;
	MultiWindowTextGUI gui = null;
	BasicWindow window = new BasicWindow();
	public TuningDashBoard(Screen screen) {
		this.screen = screen;
		gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		MainMenu();		
		setup();		
	}
	private void setup() {
		Panel panel = new Panel();
		panel.addComponent(menubar);
		Panel panelinfo = new Panel();
		panelinfo.setLayoutManager(new GridLayout(6));		
		window.setComponent(panel.withBorder(Borders.singleLine("Tuning Dashboard")));
		gui.addWindowAndWait(window);		
	}
	private void MainMenu() {
		menubar = new MenuBar();
		Menu menuFile = new Menu("Tuning");		
		menuFile.addMenuItem("Info", new Runnable() {
			public void run() {
				DBTuning tuning = new DBTuning(screen);
			}
		});	
		menuFile.addMenuItem("Exit", new Runnable() {
			public void run() {
				System.exit(0);
			}
		});
		menubar.addMenu(menuFile);
	}
}
