package org.xendra.console;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import org.compiere.model.MStore;
import org.xendra.newclient.wizard.StoreXMLParser;

import com.googlecode.lanterna.TerminalSize;
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
import com.googlecode.lanterna.gui2.dialogs.TextInputDialogBuilder;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class MachineStore {
	Screen screen;
	List<String> urls = new ArrayList<String>();
	final Table<String> table = new Table<String>("url");
	public MachineStore(Screen screen) {
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));		
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));		
		MStore store = MStore.getInstance();
		String repository = store.getRepository();		
		if (repository.length() == 0) {
			try {
				InputStream in = getClass().getResourceAsStream("/org/xendra/resource/store.xml");;		
				urls = new StoreXMLParser().parseFormat(in);
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
			saveUrls();
		} else {
			//MStore store = MStore.getInstance();
			repository = store.getRepository();			
			StringTokenizer stringTokenizer = new StringTokenizer(repository, "\n");								
			while (stringTokenizer.hasMoreTokens()) {
				urls.add(stringTokenizer.nextToken().trim());					
			}							
		}
		refreshUrls();
		Panel panelaccount = new Panel();
		panelaccount.addComponent(table);
		Panel panelabc = new Panel();
		panelabc.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
		Button delete = new Button("Delete", new Runnable() {			
			@Override
			public void run() {
				List<String> row = table.getTableModel().getRow(table.getSelectedRow());
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Error")
				.setText(String.format("delete %s ?", row.get(0)))
				.addButton(MessageDialogButton.Yes)				
				.addButton(MessageDialogButton.No)
				.build()
				.showDialog(gui);
				if (answer.equals(MessageDialogButton.Yes)) {
					int selectedrow = table.getSelectedRow();
					List<String> value = table.getTableModel().getRow(selectedrow);
					String urltodel = value.get(0);
					for (String url:urls) {
						if (url.equals(urltodel)) {
							urls.remove(urltodel);
							break;
						}
					}
					saveUrls();
					refreshUrls();
				} 
			}
		});				
		Button add = new Button("Add", new Runnable() {
			@Override
			public void run() {
				String result = new TextInputDialogBuilder()
				.setTitle("add Store")
				.setTextBoxSize(new TerminalSize(35, 5))
				.build()
				.showDialog(gui);
				StringTokenizer stringTokenizer = new StringTokenizer(result, "\n");								
				while (stringTokenizer.hasMoreTokens()) {
					urls.add(stringTokenizer.nextToken().trim());					
				}											
				String var = "";
				for (String url:urls)
				{
					if (var.length()  > 0)
						var += "\n";
					var += url;
				}							
				MStore store = MStore.getInstance();
				//String repos = store.getRepository();
				//repos += result;
				MStore.getInstance().setRepository(var);
				MStore.getInstance().save();
				refreshUrls();				
			}
		});
		panelabc.addComponent(add);
		panelabc.addComponent(delete);
		panelaccount.addComponent(panelabc);
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});		
		mainPanel.addComponent(panelaccount.withBorder(Borders.singleLine("	Repositories")));
		mainPanel.addComponent(accept);
		window.setComponent(mainPanel.withBorder(Borders.singleLine("Xendra")));
		gui.addWindowAndWait(window);		
	}
	private void refreshUrls() {
		table.getTableModel().clear();
		for (String url:urls) {			
			table.getTableModel().addRow(url);
		}
		
	}
	private void saveUrls() {
		String repos = "";
		for (String url:urls) {
			repos += String.format("%s\n", url);
		}
		MStore.getInstance().setRepository(repos);
		MStore.getInstance().save();
	}

}
