package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.persistence.X_AD_Index;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MIndex  extends X_AD_Index {
	
	private static CLogger s_log = CLogger.getCLogger(MIndex.class);

	public MIndex(Properties ctx, int AD_Index_ID, String trxName) {
		super(ctx, AD_Index_ID, trxName);
	}
	
	public MIndex(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	
	public static MIndex getbyIdentifier(String identifier) {
		MIndex index = new Query(Env.getCtx(), X_AD_Index.Table_Name, "identifier = ?", null).setParameters(identifier).first();
		return index;
	}

	public static Boolean exist(String viewname) {
		String sql = "SELECT COUNT(*) FROM AD_View WHERE name = ?";
		int no = DB.getSQLValue(null, sql, viewname);
		return no == 1;
	}
}
