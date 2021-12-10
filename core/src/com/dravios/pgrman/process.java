package com.dravios.pgrman;

import java.io.IOException;

import okhttp3.Response;

import org.compiere.util.Ini;
import org.xendra.api.Connection;
import org.xendra.api.Session;
import org.xendra.api.XendrianServer;

public class process {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// tenemos un backup?
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
		t.setUser("xendra");
		t.setPwd("xendra");
		Session s = new Session(t);
		if (s != null) {
			//String show = new XendrianServer("backup").setType("show").getTextResponse();
			//System.out.println(show);
			String backup = new XendrianServer("backup").setType("backup").getTextResponse();
			System.out.println(backup);
		}
	}
	
}
