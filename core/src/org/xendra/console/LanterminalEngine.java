package org.xendra.console;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.columba.api.plugin.PluginMetadata;
import org.compiere.model.MRole;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.SecureEngine;
import org.jdom.Element;
import org.xendra.api.Connection;
import org.xendra.model.AbstractFolder;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.gui2.dialogs.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;


// activar el web server e indicar si esta maquina sirve para ello
// si no no dejar instalar plugins
public class LanterminalEngine {

	private Connection connection;
	private Screen screen;
	private TextColor foreC, backC;	
	private int retrys = 3;
	private boolean isConnected;
	private boolean login;
	private String[] locationDescriptions;
	private AbstractFolder root;	
	private Map categories = new HashMap();
	private Map sources = new HashMap();	

	private PrintStream old;
	private ByteArrayOutputStream baos;

	public LanterminalEngine(Connection some) {
		try {
			this.connection = some;
			this.initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void initialize() throws IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		//screen = new DefaultTerminalFactory().createScreen();
		screen = new TerminalScreen(terminal);
		TextGraphics tGraphics = screen.newTextGraphics();
		screen.startScreen();
		screen.clear();
	}

	private boolean login() {		
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));		
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(2));
		final TextBox user = new TextBox(new TerminalSize(30, 1));
		final TextBox userpwd = new TextBox(new TerminalSize(30, 1));
		userpwd.setMask('*');
		panel.addComponent(new Label("Usuario"));
		panel.addComponent(user);
		panel.addComponent(new EmptySpace());
		panel.addComponent(new EmptySpace());		
		panel.addComponent(new Label("Password"));
		panel.addComponent(userpwd);		
		Button accept = new Button("Login", new Runnable() {			
			@Override
			public void run() {
				login = false; 
				String app_user = user.getText();
				String app_pwd = userpwd.getText();
				StringBuffer sql = new StringBuffer("SELECT u.AD_User_ID, r.AD_Role_ID,r.Name,")
				.append(" u.ConnectionProfile, u.IsChangePassword ")
				.append("FROM AD_User u")
				.append(" INNER JOIN AD_User_Roles ur ON (u.AD_User_ID=ur.AD_User_ID AND ur.IsActive='Y')")
				.append(" INNER JOIN AD_Role r ON (ur.AD_Role_ID=r.AD_Role_ID AND r.IsActive='Y') ")
				.append("WHERE COALESCE(u.LDAPUser,u.Name)=?")		//	#1
				.append(" AND u.IsActive='Y'")
				.append(" AND EXISTS (SELECT * FROM AD_Client c WHERE u.AD_Client_ID=c.AD_Client_ID AND c.IsActive='Y')");
				if (app_pwd != null)
					sql.append(" AND (u.Password=? OR u.Password=?)");	//  #2/3
				sql.append(" ORDER BY r.Name");
				PreparedStatement pstmt = null;
				try
				{
					pstmt = DB.prepareStatement(sql.toString(), null);
					pstmt.setString(1, app_user);
					if (app_pwd != null)
					{
						pstmt.setString(2, app_pwd);
						pstmt.setString(3, SecureEngine.encrypt(app_pwd));
					}
					//	execute a query
					ResultSet rs = pstmt.executeQuery();

					if (!rs.next())		//	no record found
					{
						MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Error")
						.setText("usuario o password equivocado")
						.addButton(MessageDialogButton.OK)				
						.build()
						.showDialog(gui);
						retrys--;
					} else {
						MRole role = MRole.getDefault();
						if (role != null && role.isSuperUser()) { 
							login = true;
							Env.setContext(Env.getCtx(), "#AD_User_Name", app_user);
							Env.setContext(Env.getCtx(), "#AD_User_ID", rs.getInt(1));
							Env.setContext(Env.getCtx(), "#SalesRep_ID", rs.getInt(1));
							Env.setContext(Env.getCtx(), "#IsChangePassword", rs.getString(5));
						} else {
							MessageDialogButton answer = new MessageDialogBuilder()
							.setTitle("Error")
							.setText("el usuario no es superuser")
							.addButton(MessageDialogButton.OK)				
							.build()
							.showDialog(gui);
							retrys--;
						}
					}
					rs.close();
					pstmt.close();
					if (retrys == 0 || login) {
						window.close();
					} else {
						user.setText("");
						userpwd.setText("");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		panel.addComponent(accept);
		window.setComponent(panel.withBorder(Borders.singleLine("Conect")));		
		gui.addWindowAndWait(window);										
		return login;
	}

	//private boolean keystore() {		
	//}


	private String execute(String command) throws IOException, InterruptedException {
		List<String> commands = new ArrayList<String>();
		commands.add("/bin/sh");
		commands.add("-c");
		commands.add(command);

		// execute the command
		SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
		int result = commandExecutor.executeCommand();

		// get the stdout and stderr from the command that was run
		StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
		//StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
		String var = "";
		if (stdout != null) {
			var = stdout.toString().trim();
		}
		return var;
	}
	private void updateserver() {
	}

	private void webserver() {
	}

	private void synchro() {
	}


	private void setup() throws IOException {
		cursorWait(0, 0, 1111);
		int line = 4;  
		typeln(">_ checking parameters....................................................", 0, 0);
		//typeln(">_ ....................................................", 0, line++);
		cursorWait(0, 0, 999);
		if (connection.getServer().length() == 0) {
			typeln("NOSERVER", 0, line++);
		} else {
			typeln(String.format("SERVER %s", connection.getServer()), 0, line++);
		}		
		if (connection.getDatabase().length() == 0) {
			typeln("NODATABASE", 0, line++);
		} else {
			typeln(String.format("DATABASE %s", connection.getDatabase()), 0, line++);
		}				
		if (connection.getPort().length() == 0) {
			typeln("NOPORT", 0, line++);
		} else {
			typeln(String.format("PORT %s", connection.getPort()), 0, line++);
		}
		cursorWait(0, 0, 888);
	}


	public void addPlugin(PluginMetadata metadata) {
		// plugin wasn't correctly loaded
		if (metadata == null) {
			return;
		}

		String source = metadata.getSource();
		if (source == null) {
			return;
		}		

		String category = metadata.getCategory();

		if (category == null) {
			// this plugin doesn't define a category to which it belongs
			category = "Uncategorized";
		}

		Element p = new Element("plugin");		
		p.setAttribute("id", metadata.getId());
		p.setAttribute("tooltip", metadata.getDescription());
		p.setAttribute("version", metadata.getVersion());
		p.setAttribute("source", source);
		HashMap props = metadata.getProperties();
		Iterator it = props.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) props.get(key);
			p.setAttribute(key, value);
		}
		AbstractFolder childNode = new AbstractFolder(p);
		childNode.setName(metadata.getName());

		AbstractFolder nodesource = (AbstractFolder) sources.get(source);
		if (nodesource == null) {
			Element e = new Element("source");
			nodesource = new AbstractFolder(e);
			nodesource.setName(source);
			nodesource.setAllowsChildren(true);
			root.add(nodesource);
			sources.put(source, nodesource);
		}

		AbstractFolder node = (AbstractFolder) categories.get(category);

		if (node == null) {
			Element e = new Element("category");			
			node = new AbstractFolder(e);
			node.setName(category);
			node.setAllowsChildren(true);
			nodesource.add(node);
			categories.put(category, node);					
		}
		// add node
		node.add(childNode);
	}

	public void cursorWait(int col, int row, int millis) {
		screen.setCursorPosition(null);
		try {
			screen.refresh();
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	// Remember MOTHER? This is fun!
	public void typeln(String msg, int col, int row) {
		TextColor defC = foreC;
		foreC = TextColor.ANSI.GREEN;
		int interval = 11;

		for (int i = 0; i < msg.length(); i++) {
			screen.setCursorPosition(new TerminalPosition(col+i, row));
			screen.setCharacter( (col+i), row, new TextCharacter(msg.charAt(i), foreC, backC));

			try {
				screen.refresh();
				Thread.sleep(ThreadLocalRandom.current().nextInt(interval*3));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		foreC = defC;
	}

	public String[] getLocationDescriptions() {
		return locationDescriptions;
	}

	public void setLocationDescriptions(String[] locationDescriptions) {
		this.locationDescriptions = locationDescriptions;
	}


	public void turnOn() throws IOException {
		screen.startScreen();
		//config();		
		try {
			new DBConfig(screen, connection);			
//			if (ServerKeyStore.getInstance().keystore(screen)) {
//				ServerBI.getInstance().loadQuerys(screen);
//			}
			if (login()) {
				new DashBoard(screen);	
			}
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
	public void turnOff() throws IOException {
		//isOn = false;
		//screen.stopScreen();
	}
}

