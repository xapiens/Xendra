package org.compiere.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

import org.columba.core.io.DiskIO;
import org.compiere.model.persistence.X_AD_Config;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class MConfig extends X_AD_Config {

	public String getContent()
	{
		String content = super.getContent();
		if (content == null)
			content = "";
		return content;
	}
	
	public MConfig(Properties ctx, int AD_Config_ID, String trxName) {
		super(ctx, AD_Config_ID, trxName);
	}

	public MConfig(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	/**
	 * 
	 */	
	private static CLogger 	log = CLogger.getCLogger (MConfig.class);

	public static void reset(String modulename, String Identifier) {
		int AD_User_ID = Env.getContextAsInt(Env.getCtx(), "#AD_User_ID");
		String where = " ModuleName = ? AND Identifier = ? AND AD_User_ID = ?";
		MConfig config = new Query(Env.getCtx(), X_AD_Config.Table_Name, where, null)
			.setParameters(modulename, Identifier,AD_User_ID).first();
		if (config != null)
		{
			if (config.delete(true))
				config = getbyIdentifier(modulename, Identifier);
		}
	}

	public static MConfig getbyIdentifier(String modulename, String Identifier) {
		return getbyIdentifier("columba", modulename, Identifier);
	}
	public static MConfig getbyIdentifier(String container, String modulename, String Identifier) {
		
		int AD_User_ID = Env.getContextAsInt(Env.getCtx(), "#AD_User_ID");
		String where = " ModuleName = ? AND Identifier = ? AND AD_User_ID = ?";
		MConfig config = new Query(Env.getCtx(), X_AD_Config.Table_Name, where, null)
		.setParameters(modulename, Identifier,AD_User_ID)
		.first();
		if (config == null)
		{						
			config = new MConfig(Env.getCtx(), 0, null);
			config.setModuleName(modulename);
			config.setIdentifier(Identifier);
			config.setAD_User_ID(AD_User_ID);					
			final String resource = "org/"+container+"/" + modulename + "/config/" + Identifier + ".xml"; //$NON-NLS-1$
			try {
				InputStream resourcestream = DiskIO.getResourceStream(resource);
				if (resourcestream != null)
				{
					String line;
					StringBuffer sb = new StringBuffer();					
					BufferedReader br = new BufferedReader(new InputStreamReader(resourcestream));
					while ((line = br.readLine()) != null) {
						sb.append(line);
					}
					config.setContent(sb.toString());					
				}
				else
				{
					log.log(Level.WARNING, String.format("resource no encontrado %s", resource));
				}
			} catch (final IOException e) {
				e.printStackTrace();
			}						
			config.save();
		}
		return config;
	}
}