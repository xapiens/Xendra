package org.xendra.console;

import java.util.Arrays;

import org.compiere.db.CConnection;
import org.compiere.util.DB;
import org.compiere.util.Ini;
import org.xendra.api.Connection;

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
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.screen.Screen;

public class DBConfig {
	Screen screen;
	private Connection connection;
	public DBConfig(Screen screen, Connection connection) {
		this.screen = screen;
		this.connection = connection;
		setup();
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));		
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(2));
		final TextBox hosttext = new TextBox(new TerminalSize(30, 1));
		final TextBox porttext = new TextBox(new TerminalSize(10, 1));
		final TextBox dbnametext = new TextBox(new TerminalSize(30, 1));
		final TextBox usertext = new TextBox(new TerminalSize(30, 1));
		final TextBox pwdtext = new TextBox(new TerminalSize(30, 1));
		hosttext.setText(connection.getServer());
		porttext.setText(connection.getPort());
		dbnametext.setText(connection.getDatabase());		
		final Label test = new Label("");
		pwdtext.setMask('*');
		panel.addComponent(new Label("Host de la base de datos:"));
		panel.addComponent(hosttext);
		panel.addComponent(new EmptySpace());
		panel.addComponent(new EmptySpace());
		panel.addComponent(new Label("Port:"));
		panel.addComponent(porttext);
		panel.addComponent(new EmptySpace());
		panel.addComponent(new EmptySpace());
		panel.addComponent(new Label("Nombre de la base de datos"));
		panel.addComponent(dbnametext);
		panel.addComponent(new EmptySpace());
		panel.addComponent(new EmptySpace());
		panel.addComponent(new Label("Usuario"));
		panel.addComponent(usertext);
		panel.addComponent(new EmptySpace());
		panel.addComponent(new EmptySpace());
		panel.addComponent(new Label("Password"));
		panel.addComponent(pwdtext);
		panel.addComponent(new EmptySpace());
		panel.addComponent(new EmptySpace());
		Button accept = new Button("Test", new Runnable() {
			@Override
			public void run() {
				connection.setServer(hosttext.getText());
				connection.setPort(porttext.getText());
				connection.setDatabase(dbnametext.getText());
				connection.setUser(usertext.getText());
				connection.setPwd(pwdtext.getText());
				CConnection cc = CConnection.get(null);
				cc.setDbHost(connection.getServer());
				cc.setDbPort(connection.getPort());
				cc.setDbName(connection.getDatabase());
				cc.setDbUid(connection.getUser());
				cc.setDbPwd(connection.getPwd());
				Exception e = cc.testDatabase(true);
				if (e == null)
				{
					window.close();
					//drawUI(" SSI TERMINAL v.1.0", "F10: QUIT");
					DB.setDBTarget(CConnection.get2(connection));
					//test.setText("conectado");
					
					Ini.setProperty(Ini.P_DatabaseServer, connection.getServer());
					Ini.setProperty(Ini.P_DatabaseName, connection.getDatabase());
					Ini.setProperty(Ini.P_DatabasePort, connection.getPort());
					Ini.setProperty(Ini.P_DatabaseUser, connection.getUser());
					Ini.setProperty(Ini.P_DatabasePassword, connection.getPwd());
					Ini.saveProperties(true);
				} else {
					MessageDialogButton answer = new MessageDialogBuilder()
					.setTitle("Error")
					.setText("no se conecto a la base de datos")
					.addButton(MessageDialogButton.OK)				
					.build()
					.showDialog(gui);																			
				}
			}
		});
		panel.addComponent(accept);
		panel.addComponent(test);
		panel.addComponent(new EmptySpace());
		panel.addComponent(new EmptySpace());
		window.setComponent(panel.withBorder(Borders.singleLine("Conect")));		
		gui.addWindowAndWait(window);										
	}
}
