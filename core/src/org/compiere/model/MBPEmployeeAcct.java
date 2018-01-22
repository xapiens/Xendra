package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_C_BP_Employee_Acct;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

public class MBPEmployeeAcct extends X_C_BP_Employee_Acct {
	/**
	 * 	Default Constructor
	 * 	@param ctx context
	 * 	@param rs ResultSet to load from
	 * 	@param trxName transaction
	 */
	public MBPEmployeeAcct (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBPartner

	public static MBPEmployeeAcct[] getOfBP (Properties ctx, int M_BPartner_ID, String trxName)
	{
		ArrayList<MBPEmployeeAcct> list = new ArrayList<MBPEmployeeAcct>();
		String sql = "SELECT * FROM C_BP_Employee_Acct "
			+ "WHERE C_BPartner_ID=? AND IsActive='Y' ";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, M_BPartner_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
				list.add(new MBPEmployeeAcct (ctx, rs, trxName));
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
		MBPEmployeeAcct[] retValue = new MBPEmployeeAcct[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getOfProduct

	/**	Logger	*/
	private static CLogger 	s_log = CLogger.getCLogger (MBPEmployeeAcct.class);

}
