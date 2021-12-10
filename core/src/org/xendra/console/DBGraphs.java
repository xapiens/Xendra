package org.xendra.console;

import java.io.IOException;
import java.util.Arrays;

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
import com.googlecode.lanterna.gui2.ProgressBar;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.screen.Screen;

public class DBGraphs {
	Screen screen;
	public DBGraphs(Screen screen) {
		this.screen = screen;
		setup();
	}
	public void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();
		if (DBmonitor.get().isRoot(gui)) {		 
			mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));		
			ProgressBar pbar = new ProgressBar(0,100,100);		
			pbar.setValue((int) DBmonitor.get().getPercent_postgresql_max_memory());			
			ProgressBar pbar2 = new ProgressBar(0,100,100);
			pbar2.setValue((int) (DBmonitor.get().getPercent_mem_usage()-DBmonitor.get().getPercent_postgresql_max_memory()));			
			ProgressBar pbar3 = new ProgressBar(0,100,100);
			pbar3.setValue((int) DBmonitor.get().getPercent_mem_usage());
			ProgressBar pbar0 = new ProgressBar(0,100,100);		
			pbar0.setValue((int) DBmonitor.get().getCurrent_connections_percent());			
			ProgressBar pbarsu = new ProgressBar(0,100,100);		
			pbarsu.setValue(DBmonitor.get().getSuperuser_reserved_connections_ratio());						
			mainPanel.addComponent(pbarsu.withBorder(Borders.singleLine("SuperUser reserved connections")));
			mainPanel.addComponent(pbar0.withBorder(Borders.singleLine("current connections")));
			mainPanel.addComponent(pbar.withBorder(Borders.singleLine("PostgreSQL Total Memory")));
			mainPanel.addComponent(pbar2.withBorder(Borders.singleLine("effective_cache_size")));
			mainPanel.addComponent(pbar3.withBorder(Borders.singleLine("Memory Use")));
			Button accept = new Button("Ok", new Runnable() {
				@Override
				public void run() {
					window.close();
				}
			});
			mainPanel.addComponent(accept);
			window.setComponent(mainPanel.withBorder(Borders.singleLine("database status")));
			gui.addWindowAndWait(window);
		}
	}
}
