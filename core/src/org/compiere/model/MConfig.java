package org.compiere.model;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.model.persistence.X_AD_Config;
import org.compiere.model.persistence.X_AD_Plugin;
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

	public static MConfig getbyIdentifier(String pluginname, String Identifier) {
		int AD_User_ID = Env.getContextAsInt(Env.getCtx(), "#AD_User_ID");
		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ?", null)
		.setParameters(pluginname).first();
		String where = "";
		MConfig config = null;
		if (plugin == null) {			
			where = " modulename = ? AND Identifier = ? AND AD_User_ID = ?";
			config = new Query(Env.getCtx(), X_AD_Config.Table_Name, where, null)
			.setParameters(pluginname, Identifier, AD_User_ID)
			.first();						
		} else {
			where = "AD_Plugin_ID = ? AND Identifier = ? AND AD_User_ID = ?";
			config = new Query(Env.getCtx(), X_AD_Config.Table_Name, where, null)
			.setParameters(plugin.getAD_Plugin_ID(), Identifier,AD_User_ID)
			.first();			
		}		
		if (config == null || config.getContent().length() == 0)
		{	
			if (config == null) {
				config = new MConfig(Env.getCtx(), 0, null);
				config.setIdentifier(Identifier);
				config.setAD_User_ID(AD_User_ID);
				if (plugin == null)
					config.setModuleName(pluginname);
				else 				
					config.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
				
			}
			String resource = Env.getResource(pluginname, String.format("%s.xml", Identifier));
			try {
				BufferedInputStream resourcestream = null;
				File resourcefile = new File(resource);
				if (resourcefile.exists())
				{					
					resourcestream = new BufferedInputStream(new FileInputStream(resourcefile));						
				}
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