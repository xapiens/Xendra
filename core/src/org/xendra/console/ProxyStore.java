package org.xendra.console;

import java.util.Arrays;
import java.util.HashMap;
import org.compiere.model.MStore;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
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
import com.googlecode.lanterna.screen.Screen;

public class ProxyStore {
	Screen screen;
	public ProxyStore(Screen screen) { 
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));		
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		MStore store = MStore.getInstance();
		final HashMap p = store.getProperties();
		String proxyserver = (String) p.get("proxyserver");
		if (proxyserver == null) {
			proxyserver = "";
		}
		String proxyport = (String) p.get("proxyport");
		if (proxyport == null) {
			proxyport = "";
		}	
		Panel mainPanel = new Panel();
		final TextBox txtproxyserver = new TextBox(new TerminalSize(30, 1));		
		final TextBox txtproxyport = new TextBox(new TerminalSize(10, 1));
		txtproxyserver.setText(proxyserver);
		txtproxyport.setText(proxyport);
		mainPanel.setLayoutManager(new GridLayout(2));
		mainPanel.addComponent(new Label("Server"));
		mainPanel.addComponent(txtproxyserver);
		mainPanel.addComponent(new Label("Port"));
		mainPanel.addComponent(txtproxyport);
		Button path = new Button("Save", new Runnable() {
			@Override
			public void run() {
				MStore store = MStore.getInstance();					
				p.put("proxyserver", txtproxyserver.getText());
				p.put("proxyport", txtproxyport.getText());
				store.setProperties(p);
				if (store.save()) {
					window.close();
				}
			}
		});
		mainPanel.addComponent(path);
		window.setComponent(mainPanel.withBorder(Borders.singleLine("Proxy")));
		gui.addWindowAndWait(window);
	}
}
