package com.dravios.pgrman;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Backup;
import org.compiere.util.Env;

public class Manager {
	private Runtime runtimeEnv  = Runtime.getRuntime ();
	private Process process;
	private InputStream in;
	private OutputStream out;
	private boolean errStatus;
	private String errMessage = "";
	private X_AD_Backup backup;
	public Manager() {
		backup = new Query(Env.getCtx(), X_AD_Backup.Table_Name, "AD_Client_ID = 0", null)
		.setParameters().first();
		if (backup == null) {
			backup = new X_AD_Backup(Env.getCtx(), 0, null);
			backup.setProperties(getBackupDefaults());
			backup.save();
		}
	}
    public boolean getErrorStatus () {
        return errStatus;
    }
    public String getErrorMessage() {
    	return errMessage;
    }
	private HashMap getBackupDefaults() {
		HashMap p = new HashMap();
		p.put("destination", "/home/americas/projects/backup");
		p.put("location","pg_rman");
		return p;
	}

	public void show() {
		try {
			String backup_path = getbackup_path();
			String location = getLocation();	        	
			String command = String.format("%s show --backup-path=%s", location, backup_path);
			process = runtimeEnv.exec (command);
			in = process.getInputStream ();
			out = process.getOutputStream ();
			errStatus = false;			
		} catch (Exception e) {
			errStatus = true;
			errMessage = e.getMessage ();			
		}								
	}
	
	public void backup() {
		try {
			String backup_path = getbackup_path();
			String location = getLocation();
			String pgdata = getpgdata();
			String command = String.format("%s backup --backup-path=%s --pgdata=%s", location, backup_path, pgdata);
			process = runtimeEnv.exec (command);
			System.out.println(command);
			in = process.getInputStream ();
			out = process.getOutputStream ();
			errStatus = false;			
		} catch (Exception e) {
			errStatus = true; 			
			errMessage = e.getMessage ();			
		}
	}
	
//	public void connect () {
//		try {
//			String backup_path = getbackup_path();
//			String location = getLocation();	        	
//			String command = String.format("%slocation show --backup-path=%s", location, backup_path);
//			process = runtimeEnv.exec (command);
//			in = process.getInputStream ();
//			out = process.getOutputStream ();
//			errStatus = false;
//		} catch (Exception e) {
//			errStatus = true; 
//			e.printStackTrace ();
//			e.getMessage ();
//		}						
//	}
	
	
	private String getLocation() {
		String var = backup.getProperties().get("location").toString();
		return var;
	}
	private String getbackup_path() {
		String var = backup.getProperties().get("backup_path").toString();
		return var;
	}
	private String getpgdata() {
		String var = backup.getProperties().get("pgdata").toString();
		return var;
	}
	public InputStream getInputStream() {
		return in;
	}
	public OutputStream getOutputStream() {
		return out;
	}
}
