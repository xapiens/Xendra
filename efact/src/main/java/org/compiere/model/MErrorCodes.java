package org.compiere.model;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import org.compiere.model.persistence.X_S_Error_Codes;
import org.compiere.util.Env;

public class MErrorCodes extends X_S_Error_Codes {
	public MErrorCodes(Properties ctx, int S_Error_Codes_ID, String trxName) {
		super(ctx, S_Error_Codes_ID, trxName);
	}
	
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MErrorCodes(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	

	public static String getCode(String key) {
		String errormsg = "";
		MErrorCodes code = new Query(Env.getCtx(), MErrorCodes.Table_Name, "value = ?", null)
					.setParameters(key).first();
		if (code == null) {
			Integer ikey = Integer.valueOf(key);
			code = new Query(Env.getCtx(), MErrorCodes.Table_Name, "value = ?", null)
					.setParameters(String.valueOf(ikey)).first();			
		}
		errormsg = code.getErrorMsg();
		return errormsg;
	}

}
