package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.persistence.X_S_DocLog;
import org.compiere.util.Env;

public class MDocLog extends X_S_DocLog  {
	public MDocLog(Properties ctx, int S_DogLog_ID, String trxName) {
		super(ctx, S_DogLog_ID, trxName);
	}
	
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MDocLog(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	
	
	
	public static void setStatus(int S_DocHeader_ID, String process, String cdr1, String cdr2) {
		X_S_DocLog log = new Query(Env.getCtx(), X_S_DocLog.Table_Name, "S_DocHeader_ID = ?", null)
				.setParameters(S_DocHeader_ID).first();
		if (log == null) {
			log = new X_S_DocLog(Env.getCtx(), 0, null);
			log.setS_DocHeader_ID(S_DocHeader_ID);
		}				
		log.setTaskStatus(process);
		log.setcdr_code(cdr1);
		log.setCDR_Nota(cdr2);
		log.save();
	} 
	
}
