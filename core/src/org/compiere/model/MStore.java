package org.compiere.model;

import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.compiere.model.persistence.X_AD_Store;
import org.compiere.util.Env;


public class MStore extends X_AD_Store {
	public static MStore store = null;
	public MStore(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public MStore(Properties ctx, int AD_Store_ID, String trxName) {
		super(ctx, AD_Store_ID, trxName);
	}

	public String getCertificate() {
		HashMap props = getProperties();
		String certificate = "";
		String filename = (String) props.get("CERTIFICATE");
		File certfile = new File(filename);
		if (certfile.exists()) {
			try {
			certificate = FileUtils.readFileToString(certfile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return certificate;
	}

	public static MStore getInstance() {
		if (store == null) {
			store = new Query(Env.getCtx(), MStore.Table_Name, null, null).first();
			if (store == null) {
				store = new MStore(Env.getCtx(), 0, null);
			}
		}
		return store;
	}

	public void reload() {
		store = new Query(Env.getCtx(), MStore.Table_Name, null, null).first();
		if (store == null) {
			store = new MStore(Env.getCtx(), 0, null);
		}		
	}		
}
