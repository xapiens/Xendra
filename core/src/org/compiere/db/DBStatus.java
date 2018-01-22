package org.compiere.db;

import java.sql.Timestamp;

import javax.jms.TextMessage;

import org.compiere.interfaces.*;
import org.compiere.model.MOrg;
import org.compiere.util.Env;
import org.compiere.util.Ini;

public class DBStatus implements Status {

	private String dbHost;
	private String dbBackupHost;
	private int dbPort;
	private int dbBackupPort;
	private String dbName;
	private String dbUid;
	private String dbPwd;
	private String poolClient;
	private String dateversion;
	
	public DBStatus(TextMessage reply) {
		if (reply != null)
		{
			try {
				dbHost = reply.getStringProperty(Status.dbhost);
				dbBackupHost = reply.getStringProperty(Status.dbbackuphost);
				dbPort = reply.getIntProperty(Status.dbport);
				dbBackupPort = reply.getIntProperty(Status.dbbackupport);
				dbName = reply.getStringProperty(Status.dbName);
				dbUid  = reply.getStringProperty(Status.dbuid);
				dbPwd  = reply.getStringProperty(Status.dbpwd);
				poolClient = reply.getStringProperty(Status.poolclient);
				Integer pc = Integer.valueOf(Ini.getProperty(Ini.P_POOLCLIENT));
				if (Integer.valueOf(poolClient).compareTo(pc) < 0)
					poolClient = String.valueOf(pc);
				dateversion = reply.getStringProperty(Status.date_version);
//				String ms = reply.getStringProperty(Status.machineserial);
//				if ( ms !=null && ms.length() > 0)
//					Ini.setProperty(Ini.P_MACHINESERIAL, ms);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
	
	@Override
	public String getDateVersion() {
		return dateversion;
	}

	@Override
	public String getMainVersion() {
		return null;
	}

	@Override
	public String getPoolServer() {
		return "1";
	}

	@Override
	public String getPoolClient() {
		return poolClient;
	}

	@Override
	public String getDbHost() {
		return dbHost;
	}
	
	@Override
	public String getBackupDbHost() {
		return dbBackupHost;
	}

	@Override
	public int getDbPort() {
		return dbPort;
	}

	@Override
	public int getBackupDbPort() {
		return dbBackupPort;
	}
	
	@Override
	public String getDbName() {
		return dbName;
	}

	@Override
	public String getConnectionURL() {
		return null;
	}

	@Override
	public String getDbUid() {
		return dbUid;
	}

	@Override
	public String getDbPwd() {
		return dbPwd;
	}

	@Override
	public int getVersionCount() {
		return 0;
	}

	@Override
	public int getDatabaseCount() {
		return 0;
	}

	@Override
	public String getStatus() {
		return null;
	}
}
