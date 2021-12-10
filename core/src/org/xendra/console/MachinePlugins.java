package org.xendra.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Env;
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
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;
/* 
 * List the plugins installed
 * 
 * */
public class MachinePlugins {
	private Screen screen;
	private List<Integer> pluginsids = new ArrayList<Integer>();
	public MachinePlugins(Screen screen) {
		this.screen = screen;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		final Table<String> table = new Table<String>("name","filename","installed");
		List<X_AD_Plugin> plugins = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "IsActive = 'Y'", null)
			.list();
		for (X_AD_Plugin plugin:plugins) {			
			table.getTableModel().addRow(plugin.getName(), plugin.getFileName(), plugin.isInstalled() ? "Y":"N");
			pluginsids.add(plugin.getAD_Plugin_ID());
		}
		Panel panelaccount = new Panel();
		panelaccount.addComponent(table);
		Panel panelabc = new Panel();
		panelabc.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
		Button check = new Button("Check", new Runnable() {			
			@Override
			public void run() {
				List<String> row = table.getTableModel().getRow(table.getSelectedRow());
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Check")
				.setText(String.format("verify %s %s %s?", row.get(0),row.get(1),row.get(2)))
				.addButton(MessageDialogButton.Yes)				
				.addButton(MessageDialogButton.No)
				.build()
				.showDialog(gui);
				if (answer.equals(MessageDialogButton.Yes)) {
					int selectedrow = table.getSelectedRow();
					int pluginid = pluginsids.get(selectedrow);
					X_AD_Plugin p = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
						.setParameters(pluginid).first();
					if (p != null) {
						new PluginRules(screen, p);
						//ms.delete(true);
						//tablemachines.getTableModel().removeRow(selectedrow );
					}					
				} 				
			}
		});
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});		
		panelabc.addComponent(check);
		panelaccount.addComponent(panelabc);
		mainPanel.addComponent(panelaccount.withBorder(Borders.singleLine("Plugins")));
		mainPanel.addComponent(accept);
		window.setComponent(mainPanel.withBorder(Borders.singleLine("Plugins")));
		gui.addWindowAndWait(window);		
	}
}
