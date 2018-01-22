package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_M_Product_Acct;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

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
		String sql = "SELECT * FROM M_Product_Acct WHERE M_Product_ID=?";
		ArrayList<MProductAcct> list = new ArrayList<MProductAcct>();
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, M_Product_ID);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				list.add (new MProductAcct (ctx, rs, trxName));
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e); 
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		//
		MProductAcct[] retValue = new MProductAcct[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getOfProduct

	/**	Logger	*/
	private static CLogger 	s_log = CLogger.getCLogger (MProductAcct.class);

}
