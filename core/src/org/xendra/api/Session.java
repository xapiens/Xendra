package org.xendra.api;

import org.compiere.db.CConnection;
import org.compiere.util.DB;
import org.compiere.util.Ini;

public class Session {
	
	public Session(Connection connection) {
		CConnection cc = CConnection.get(null);
		cc.setDbHost(connection.getServer());
		cc.setDbPort(connection.getPort());
		cc.setDbName(connection.getDatabase());
		cc.setDbUid(connection.getUser());
		cc.setDbPwd(connection.getPwd());
		Exception e = cc.testDatabase(true);
		if (e == null) {
			DB.setDBTarget(CConnection.get2(connection));
			Ini.setProperty(Ini.P_DatabaseServer, connection.getServer());
			Ini.setProperty(Ini.P_DatabaseName, connection.getDatabase());
			Ini.setProperty(Ini.P_DatabasePort, connection.getPort());
			Ini.setProperty(Ini.P_DatabaseUser, connection.getUser());
			Ini.setProperty(Ini.P_DatabasePassword, connection.getPwd());
			Ini.saveProperties(true);
		} else {
			throw new IllegalArgumentException (e.getMessage());
		}
	}
}
