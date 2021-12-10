package org.xendra.console;

import java.io.IOException;
import org.compiere.util.Ini;
import org.xendra.api.Connection;

public class App {

	public App() {
		Ini.loadProperties(true);
		String server = Ini.getProperty(Ini.P_DatabaseServer);
		if (server == null)
			server = "";
		String database = Ini.getProperty(Ini.P_DatabaseName);
		if (database == null)
			database = "";
		String port = Ini.getProperty(Ini.P_DatabasePort);
		if (port == null)
			port = "";
		Connection t = new Connection();
		//server = "localhost";
		//database = "qfarma";
		//port = "5433";
		t.setServer(server);
		t.setDatabase(database);
		t.setPort(port);
		LanterminalEngine lE = new LanterminalEngine(t);
		try {
			lE.turnOn();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//String attributes = Ini.getProperty (Ini.P_CONNECTION);		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		App c = new App();
	}

}
