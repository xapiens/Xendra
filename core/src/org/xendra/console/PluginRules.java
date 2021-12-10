package org.xendra.console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.kie.api.KieBase;
import org.kie.api.builder.Message;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.ProgressBar;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class PluginRules {
	private Screen screen;
	private X_AD_Plugin p;
	private List<Integer> rulesids = new ArrayList<Integer>();
	public PluginRules(Screen screen, X_AD_Plugin p) {
		this.screen = screen;
		this.p = p;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));		
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		ProgressBar pbar = new ProgressBar(0,100,100);
		pbar.setValue(0);
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(1));
		panel.addComponent(pbar);
		panel.addComponent(new Label(String.format("checking rules")));
		window.setComponent(panel.withBorder(Borders.singleLine("checking...")));
		gui.addWindow(window);
		try {
			gui.updateScreen();
		} catch (Exception e1) {
			e1.printStackTrace();
		}		
		final Table<String> table = new Table<String>("name","status");
		String where = "AD_Plugin_ID = ? and properties->'type'='kiebase'";
		List<X_AD_Rule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name, where, null)
		.setParameters(p.getAD_Plugin_ID())
		.list();
		int currentpos = 0;
		Double currentsize = 0d;
		for (X_AD_Rule rule:rules) {
			currentsize++;
			String status = "";
			Double advance = (currentsize / rules.size()) * 100;
			if (advance.intValue() > currentpos) {
				currentpos = advance.intValue();
				pbar.setValue(currentpos);				
			}
			try {
				gui.updateScreen();
			} catch (IOException e2) {
				e2.printStackTrace();
			}														
			KieBase kb = Env.initializeRule(rule.getAD_Rule_ID());
			if (kb == null) {
				status = "failed";				
				//List<Message> msgs = Env.getKieErrorMsgs(rule.getAD_Rule_ID());
				//for (Message msg:msgs)
				//{							
				//System.out.println(msg.getText());
				//}								
			} else {
				status = "correct";
			}
			table.getTableModel().addRow(rule.getName(), status);
			rulesids.add(rule.getAD_Rule_ID());
		}
		Panel panelaccount = new Panel();
		panelaccount.addComponent(table);
		Button check = new Button("Check", new Runnable() {			
			@Override
			public void run() {
				int selectedrow = table.getSelectedRow();
				int ruleid = rulesids.get(selectedrow);
				List<Message> msgs = Env.getKieErrorMsgs(ruleid);
				if (msgs != null) {
					String message = "";
					for (Message msg:msgs)
					{							
						if (message.length() > 0) {
							message += "\n";
						}
						message += msg.getText();
					}
					MessageDialogButton answer = new MessageDialogBuilder()
					.setTitle("Errors")
					.setText(message)
					.addButton(MessageDialogButton.OK)				
					.build()
					.showDialog(gui);	
				}
			}																			
		});		
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});		
		mainPanel.addComponent(panelaccount.withBorder(Borders.singleLine("Plugins")));
		panelaccount.addComponent(check);
		mainPanel.addComponent(accept);
		window.setComponent(mainPanel.withBorder(Borders.singleLine("Plugins")));
		gui.addWindowAndWait(window);		
	}
}
