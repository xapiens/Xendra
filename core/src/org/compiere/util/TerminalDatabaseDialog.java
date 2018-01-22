package org.compiere.util;

import java.util.Arrays;

import org.compiere.db.CConnection;

import com.googlecode.lanterna.TerminalSize;
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
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class TerminalDatabaseDialog {
	private BasicWindow window;
	private Screen screen;
	private boolean m_accept = false;
	private TextBox hosttext = new TextBox(new TerminalSize(30, 1));
	private TextBox porttext = new TextBox(new TerminalSize(10, 1));
	private TextBox dbnametext = new TextBox(new TerminalSize(30, 1));
	private TextBox usertext = new TextBox(new TerminalSize(30, 1));
	private TextBox pwdtext = new TextBox(new TerminalSize(30, 1));
	private Button confirm;
	public TerminalDatabaseDialog() {
		try {
			Terminal terminal = new DefaultTerminalFactory().createTerminal();
			screen = new TerminalScreen(terminal);
			screen.startScreen();
			window = new BasicWindow();
			
			Panel hostPanel = new Panel();
			// host
			hostPanel.setLayoutManager(new GridLayout(4));
			Label hostlabel = new Label("Host de la base de datos:");			
			Label portlabel = new Label("Port:");		
			hostPanel.addComponent(hostlabel);
			hostPanel.addComponent(hosttext);
			hostPanel.addComponent(portlabel);
			hostPanel.addComponent(porttext);
			// database name
			Panel namePanel = new Panel();
			namePanel.setLayoutManager(new GridLayout(2));
			Label namelabel = new Label("Nombre de la base de datos");
			
			namePanel.addComponent(namelabel);
			namePanel.addComponent(dbnametext);
			// user
			Panel userPanel = new Panel();
			userPanel.setLayoutManager(new GridLayout(2));
			Label userlabel = new Label("Usuario");			 
			userPanel.addComponent(userlabel);
			userPanel.addComponent(usertext);
			// password
			pwdtext.setMask('*');
			Panel pwdPanel = new Panel();
			pwdPanel.setLayoutManager(new GridLayout(2));
			Label pwdlabel = new Label("Password");			
			pwdPanel.addComponent(pwdlabel);
			pwdPanel.addComponent(pwdtext);
			// Test
			Panel testPanel = new Panel();
			testPanel.setLayoutManager(new GridLayout(2));
			Button accept = new Button("Test", new Runnable() {
				@Override
				public void run() {
					CConnection cc = CConnection.get(null);
					cc.setDbHost(getDbHost());
					cc.setDbPort(getDbPort());
					cc.setDbName(getDbName());
					cc.setDbUid(getDbUid());
					cc.setDbPwd(getDbPwd());
					Exception e = cc.testDatabase(true);
					if (e == null)
					{
						confirm.setEnabled(true);
					}
				}
			});		
			// ConfirmPanel
			Panel confirmPanel = new Panel();
			confirmPanel.setLayoutManager(new GridLayout(2));
			confirm = new Button("Ok", new Runnable() {
				@Override
				public void run() {
					CConnection cc = CConnection.get(null);
					if (cc.isDatabaseOK())
					{
						Ini.setProperty(Ini.P_CONNECTION, cc.toStringLong());
						window.close();
					}					
					m_accept = true;
				}
			});
			confirm.setEnabled(false);
			Button cancel = new Button("Cancel", new Runnable() {
				@Override
				public void run() {
					window.close();
				}
			});		
			confirmPanel.addComponent(confirm);
			confirmPanel.addComponent(cancel);
			
			testPanel.addComponent(accept);
			Panel panel = new Panel();
			panel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
			panel.addComponent(hostPanel);
			panel.addComponent(namePanel);
			panel.addComponent(userPanel);
			panel.addComponent(pwdPanel);
			panel.addComponent(testPanel);
			panel.addComponent(confirmPanel);
			window.setComponent(panel.withBorder(Borders.singleLine("Conect")));		
			window.setHints(Arrays.asList(Window.Hint.CENTERED));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static boolean accept() {
		
		TerminalDatabaseDialog id = new TerminalDatabaseDialog();
		CConnection cc = CConnection.get(null);
		id.setDbHost(cc.getDbHost());		
		id.setDbPort(cc.getDbPort());
		id.setDbName(cc.getDbName());		
		id.setDbUid(cc.getDbUid());
		id.setDbPwd(cc.getDbPwd());
		id.show();
		if (id.isAccepted())
		{
			return true;
		}
		System.exit(10);
		return false;       //  never executed.	}
	}

	private void show() {
		MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		gui.addWindowAndWait(window);							
	}
	public void setDbHost(String value) {
		hosttext.setText(value);
	}
	public String getDbHost()
	{
		return hosttext.getText().trim();
	}
	public void setDbPort(int value) {
		porttext.setText(String.valueOf(value));
	}
	public String getDbPort() {
		return porttext.getText().trim();
	}
	public void setDbUid(String value) {
		usertext.setText(value);		
	}
	public String getDbUid() {
		return usertext.getText().trim();
	}
	public void setDbPwd(String value) {
		pwdtext.setText(value);
	}
	public String getDbPwd() {
		return pwdtext.getText().trim();
	}
	public void setDbName(String value) {
		dbnametext.setText(value);
	}
	public String getDbName() {
		return dbnametext.getText().trim();
	}
	private boolean isAccepted() {
		return m_accept;
	}	
}
