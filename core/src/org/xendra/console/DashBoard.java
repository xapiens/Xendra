package org.xendra.console;

import java.io.File;
import java.util.Arrays;

import org.compiere.db.CConnection;
import org.compiere.model.MStore;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.Constants;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.DirectoryDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.menu.Menu;
import com.googlecode.lanterna.gui2.menu.MenuBar;
import com.googlecode.lanterna.screen.Screen;

public class DashBoard {
	Screen screen;
	MenuBar menubar;
	MultiWindowTextGUI gui = null;
	BasicWindow window = new BasicWindow();
	private Label labelwebserver = new Label("");	
	private Label lblwsresult = new Label("");
	public DashBoard(Screen screen) {
		this.screen = screen;
		gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		MainMenu();
		refresh();
		setup();		
	}
	private void MainMenu() {		
		menubar = new MenuBar();
		Menu menuFile = new Menu("System");
		menubar.addMenu(menuFile);
		menuFile.addMenuItem("Download plugin", new Runnable() {
			public void run() {
				if (ServerKeyStore.getInstance().keystore(screen)) {					
					ServerKeyStore.getInstance().loadplugins(screen);
				} else {
					MessageDialogButton answer = new MessageDialogBuilder()
					.setTitle("Error")
					.setText("error to initialize keystore")
					.addButton(MessageDialogButton.OK)			
					.build()
					.showDialog(gui);													
				}
			}
		});
		menuFile.addMenuItem("install local plugin ", new Runnable() {
			public void run() {
				ServerKeyStore.getInstance().loadplugin(screen);
			}
		});
		menuFile.addMenuItem("Directories", new Runnable() {
			public void run()  {
				new ActionListDialogBuilder()
				.setTitle("Directories")
				.setDescription("Choose a directory")
				.addAction("Web", new Runnable() {
					public void run() {				
						setFolder(Constants.WEB);
					}
				})
				.addAction("KeyStore", new Runnable() {
					public void run() {
						setFolder(Constants.KEYSTORE);
					}
				})
				.addAction("Reports", new Runnable() {
					public void run()  {
						setFolder(Constants.REPORTS);
					}
				})
				.addAction("Trash", new Runnable() {
					public void run() {
						setFolder(Constants.TRASH);
					}
				})
				.addAction("Plugin", new Runnable() {
					public void run() {
						setFolder(Constants.PLUGINS);
					}
				})
				.addAction("Replication", new Runnable() {
					public void run() {
						setFolder(Constants.REPLICATION);
					}
				})
				.addAction("Download", new Runnable() {
					public void run() {
						setFolder(Constants.DOWNLOAD);
					}
				})
				.addAction("Installed", new Runnable() {
					public void run() {
						setFolder(Constants.INSTALLED);
					}
				})
				.addAction("Store", new Runnable() {
					public void run() {
						setFolder(Constants.STORE);
					}
				})
				.build()
				.showDialog(gui);					
			}
		});

		menuFile.addMenuItem("synchronized", new Runnable() {
			public void run() {
				MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Confirm")
						.setText("sincroniza estructuras del diccionario con el codigo\nuna vez iniciado no debe ser interrumpido\nDesea continuar?")
						.addButton(MessageDialogButton.Yes)				
						.addButton(MessageDialogButton.No)
						.build()
						.showDialog(gui);								
						if (answer.equals(MessageDialogButton.Yes)) {
							Xendrian.getInstance().synchro(screen, "synchronized");
						}																				
			}
		});
		menuFile.addMenuItem("synchronized reset", new Runnable() {
			public void run() {
				MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Confirm")
						.setText("resetea estampados de tiempo para sincronizar estructuras del diccionario\n"
								+ "con el codigo\nuna vez iniciado no debe ser interrumpido\nDesea continuar?")
						.addButton(MessageDialogButton.Yes)				
						.addButton(MessageDialogButton.No)
						.build()
						.showDialog(gui);								
						if (answer.equals(MessageDialogButton.Yes)) {
							Xendrian.getInstance().synchroreset(screen, "synchronized reset");
						}																																	
			}
		});	
		menuFile.addMenuItem("Proxy", new Runnable() {
			public void run() {
				new ProxyStore(screen);
			}
		});
		menuFile.addMenuItem("Exit", new Runnable() {
			public void run() {
				System.exit(0);
			}
		});
		Menu menuProcess = new Menu("Process");
		menubar.addMenu(menuProcess);
		menuProcess.addMenuItem("Account", new Runnable() {
			public void run() {
				new MachineAccount(screen);
			}
		});
		menuProcess.addMenuItem("Machines", new Runnable() {
			public void run() {
				new Machines(screen);				
			}
		});
		menuProcess.addMenuItem("BI", new Runnable() {
			public void run() {
				if (ServerKeyStore.getInstance().keystore(screen)) {					
					ServerBI.getInstance().loadQuerys(screen);
				} else {
					MessageDialogButton answer = new MessageDialogBuilder()
					.setTitle("Error")
					.setText("error to initialize keystore")
					.addButton(MessageDialogButton.OK)			
					.build()
					.showDialog(gui);													
				}
			}
		});		
		menuProcess.addMenuItem("Scheduler", new Runnable() {
			public void run() {
				new MachineScheduler(screen);
			}
		});
		menuProcess.addMenuItem("Server", new Runnable() {
			public void run() {
				new MachineServer(screen);
				refresh();
			}
		});			
		// plugins installed
		menuProcess.addMenuItem("Plugins", new Runnable() {
			public void run() {
				new MachinePlugins(screen);
			}
		});
		menuProcess.addMenuItem("Store Repositories", new Runnable() {
			public void run() {
				new MachineStore(screen);
			}
		});
		Menu menuDatabase = new Menu("Database");
		menubar.addMenu(menuDatabase);
		menuDatabase.addMenuItem("info", new Runnable() {
			public void run() {
				DBInfo info = new DBInfo(screen);
			}
		});			
		menuDatabase.addMenuItem("graphs", new Runnable() {
			public void run() {
				DBGraphs graph = new DBGraphs(screen);					
			}				
		});
		menuDatabase.addMenuItem("misc", new Runnable() {
			public void run() {
				DBMisc misc = new DBMisc(screen);					
			}				
		});			
		menuDatabase.addMenuItem("Top 20", new Runnable() {
			public void run() {
				DBTop20 top20 = new DBTop20(screen);
			}
		});
		menuDatabase.addMenuItem("Statements", new Runnable() {
			public void run() {
				DBStatStatements statements = new DBStatStatements(screen);
			}
		});
		menuDatabase.addMenuItem("Replication", new Runnable() {
			public void run() {
				DBReplication replication = new DBReplication(screen);
			}
		});
		menuDatabase.addMenuItem("Messages", new Runnable() {
			public void run() {
				DBMessage message = new DBMessage(screen);
			}
		});
		menuDatabase.addMenuItem("Issues", new Runnable() {
			public void run() {
				DBIssues dbissues = new DBIssues(screen);
			}
		});
	}

	private void setFolder(String key) {
		File input = new DirectoryDialogBuilder()
		.setTitle("Open File")
		.setDescription(String.format("%s Choose a directory", key))
		.setSelectedDirectory(Env.getMachine().getFolder(key))								
		.setActionLabel("Open")
		.build()
		.showDialog(gui);
		if (input != null) {
			MessageDialogButton answer = new MessageDialogBuilder()
			.setTitle("Confirm")
			.setText(String.format("%s->%s", key, input.getAbsolutePath()))
			.addButton(MessageDialogButton.Yes)				
			.addButton(MessageDialogButton.No)
			.build()
			.showDialog(gui);								
			if (answer.equals(MessageDialogButton.Yes)) {
				Env.getMachine().setFolder(key, input);
			}								
		}							
	}
	
	public void refresh() {
		Env.resetServerWeb();
		X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
		if (webserver != null) {
			labelwebserver.setText(String.format("%s[%s]", webserver.getName(),webserver.getMac_Address()));
		} else {
			labelwebserver.setText("Not Defined");
		}
		String result = common.PingToServer();
		if (result.length() == 0) //  no errors
		{
			result = common.getInfo();
		}	
		lblwsresult.setText(String.format("<%s>",result));
	}

	
	public void setup() {
		Panel panel = new Panel();
		//panel.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));
		panel.addComponent(menubar);
		Panel panelinfo = new Panel();
		panelinfo.setLayoutManager(new GridLayout(6));
		panelinfo.addComponent(new Label("Machine"));
		//panelinfo.addComponent(new Label(Env.getMachine().getName()));
		panelinfo.addComponent(new Label(String.format("%s[%s]", Env.getMachine().getName(),Env.getMachine().getMac_Address())));
		//panelinfo.addComponent(new Label("Mac Addr"));
		//panelinfo.addComponent(new Label(Env.getMachine().getMac_Address()));
		panelinfo.addComponent(new Label("System"));
		panelinfo.addComponent(new Label(Util.getLocalMacAddress()));
		panel.addComponent(panelinfo.withBorder(Borders.singleLine("Equipment")));
		//		
		//
		Panel web = new Panel();
		web.setLayoutManager(new GridLayout(2));		
		
			//web.addComponent(new Label(String.format("%s[%s]", webserver.getName(),webserver.getMac_Address())));			
		web.addComponent(labelwebserver);
		//} else {
		//	web.addComponent(new Label("Not Defined"));
		//}
		//String result = common.PingToServer();
		//web.addComponent(new Label(String.format("<%s>",result)));
		web.addComponent(lblwsresult);
		panel.addComponent(web.withBorder(Borders.singleLine("Web Server")));
		String proxyserver = "";
		String proxyport  = "";
		if (MStore.getInstance().getProperties().containsKey("proxyserver")) {
			proxyserver = (String) MStore.getInstance().getProperties().get("proxyserver");
		}
		if (MStore.getInstance().getProperties().containsKey("proxyport")) {
			proxyport = (String) MStore.getInstance().getProperties().get("proxyport");
		}
		Panel proxyinfo = new Panel();
		proxyinfo.setLayoutManager(new GridLayout(4));
		proxyinfo.addComponent(new Label("Server"));
		proxyinfo.addComponent(new Label(proxyserver));
		proxyinfo.addComponent(new Label("port"));
		proxyinfo.addComponent(new Label(proxyport));
		panel.addComponent(proxyinfo.withBorder(Borders.singleLine("Proxy")));
		//
		Panel dbinfo = new Panel();
		dbinfo.setLayoutManager(new GridLayout(4));
		dbinfo.addComponent(new Label("Server"));
		dbinfo.addComponent(new Label(CConnection.get().getDbHost()));
		dbinfo.addComponent(new Label("Name"));
		dbinfo.addComponent(new Label(CConnection.get().getDbName()));
		panel.addComponent(dbinfo.withBorder(Borders.singleLine("Database")));
		Panel dirinfo = new Panel();
		dirinfo.setLayoutManager(new GridLayout(2));
		dirinfo.addComponent(new Label("Web"));
		dirinfo.addComponent(new Label(Env.getMachine().getWebFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("KeyStore"));
		dirinfo.addComponent(new Label(Env.getMachine().getKeyStoreFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("Reports"));
		dirinfo.addComponent(new Label(Env.getMachine().getReportsFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("Trash"));
		dirinfo.addComponent(new Label(Env.getMachine().getTrashFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("Plugin"));
		dirinfo.addComponent(new Label(Env.getMachine().getPluginsFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("Replication"));
		dirinfo.addComponent(new Label(Env.getMachine().getReplicationFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("Download"));
		dirinfo.addComponent(new Label(Env.getMachine().getDownloadFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("Installed"));
		dirinfo.addComponent(new Label(Env.getMachine().getInstalledFolder().getAbsolutePath()));
		dirinfo.addComponent(new Label("Store"));
		dirinfo.addComponent(new Label(Env.getMachine().getStoreFolder().getAbsolutePath()));
		panel.addComponent(dirinfo.withBorder(Borders.singleLine("Directories")));
		window.setComponent(panel.withBorder(Borders.singleLine("Dashboard")));
		gui.addWindowAndWait(window);							
	}
}
