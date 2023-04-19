package org.xendra.console;

import java.io.IOException;

import org.compiere.util.Ini;
import org.xendra.api.Connection;

public class Tuning {
	public Tuning() {
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
		t.setServer(server);
		t.setDatabase(database);
		t.setPort(port);
		TuningEngine te = new TuningEngine(t);
		try {
			te.bootstrap();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
	public static void main(String[] args) {
		Tuning c = new Tuning();
	}
}
