package org.compiere.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.persistence.X_M_Product_Acct;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class MProductAcct extends X_M_Product_Acct {

	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_Product_ID id
	 *	@param trxName transaction
	 */
	public MProductAcct (Properties ctx, int M_Product_ID, String trxName)
	{
		super (ctx, M_Product_ID, trxName);
		if (M_Product_ID == 0)
		{
			/* TODO: Put default values here */
		}
	}	//	MProductAcct

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName trx
	 */
	public MProductAcct (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MCost

	/**
	 * 	Get Costing Of Product
	 *	@param ctx context
	 *	@param M_Product_ID product
	 *	@param trxName trx
	 *	@return array of costs
	 */
	public static MProductAcct[] getOfProduct (Properties ctx, int M_Product_ID, String trxName)
	{
		List<MProductAcct> list = new Query(Env.getCtx(), MProductAcct.Table_Name, "M_Product_ID = ?", trxName)
			.setParameters(M_Product_ID).list();
		MProductAcct[] retValue = new MProductAcct[list.size()];
		list.toArray(retValue);
		return retValue;
		//
	}	//	getOfProduct

	/**	Logger	*/
	private static CLogger 	s_log = CLogger.getCLogger (MProductAcct.class);

}
