package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_C_BP_Customer_Acct;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

public class MBPCustomerAcct extends X_C_BP_Customer_Acct {
	/**
	 * 	Default Constructor
	 * 	@param ctx context
	 * 	@param rs ResultSet to load from
	 * 	@param trxName transaction
	 */
	public MBPCustomerAcct (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBPartner

	public static MBPCustomerAcct[] getOfBP (Properties ctx, int M_BPartner_ID, String trxName)
	{
		ArrayList<MBPCustomerAcct> list = new ArrayList<MBPCustomerAcct>();
		String sql = "SELECT * FROM C_BP_Customer_Acct "
			+ "WHERE C_BPartner_ID=? AND IsActive='Y' ";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, M_BPartner_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
				list.add(new MBPCustomerAcct (ctx, rs, trxName));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, sql, ex);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
		}
		catch (SQLException ex1)
		{
		}
		pstmt = null;
		//
		MBPCustomerAcct[] retValue = new MBPCustomerAcct[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getOfProduct

	/**	Logger	*/
	private static CLogger 	s_log = CLogger.getCLogger (MBPCustomerAcct.class);

}
