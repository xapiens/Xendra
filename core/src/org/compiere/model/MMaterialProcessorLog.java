package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.persistence.X_M_MaterialProcessorLog;

public class MMaterialProcessorLog extends X_M_MaterialProcessorLog {
	public MMaterialProcessorLog (Properties ctx, int M_MaterialProcessorLog_ID, String trxName)
	{
		super (ctx, M_MaterialProcessorLog_ID, trxName);
		if (M_MaterialProcessorLog_ID == 0)
		{
			setIsError (false);
		}	
	}	//	MMaterialProcessorLog

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 */
	public MMaterialProcessorLog (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MMaterialProcessorLog

	/**
	 * 	Parent Constructor
	 *	@param parent parent
	 *	@param summary summary
	 */
	public MMaterialProcessorLog (MMaterialProcessor parent, String summary)
	{
		this (parent.getCtx(), 0, parent.get_TrxName());
		setClientOrg(parent);
		setM_MaterialProcessor_ID(parent.getM_MaterialProcessor_ID());
		setSummary(summary);
	}	//	MRequestProcessorLog

}
