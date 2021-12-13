package org.compiere.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;

import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.util.Env;

public class MMaterialProcessor extends X_M_MaterialProcessor implements XendraProcessor {

	public MMaterialProcessor (Properties ctx, int X_M_MaterialProcessor_ID, String trxName)
	{
		super (ctx, X_M_MaterialProcessor_ID, trxName);
	}

	public MMaterialProcessor (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}
	
	/**
	 * 	Get Active
	 *	@param ctx context
	 *	@return active processors
	 */
	public static MMaterialProcessor[] getActive (Properties ctx)
	{
		List<MMaterialProcessor> list = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "IsActive='Y' AND A_Machine_ID = ?", null)
			.setParameters(Env.getMachine().getA_Machine_ID())
			.list();
		MMaterialProcessor[] retValue = new MMaterialProcessor[list.size ()];
		list.toArray (retValue);		
		return retValue;
	}	//	getActive


	@Override
	public String getServerID() {
		return "M_MaterialProcessor" + get_ID();
	}

	@Override
	public XendraProcessorLog[] getLogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timestamp getDateNextRun(boolean requery) {
		if (requery)
			load(get_TrxName());
		return getDateNextRun();
	}
		
}
