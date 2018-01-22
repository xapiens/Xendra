package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.compiere.model.persistence.X_AD_FieldGroup;
import org.compiere.util.DB;
import org.compiere.util.Env;

@SuppressWarnings("serial")
public class MFieldGroup extends X_AD_FieldGroup {
	
	/**
	 * Standard constructor for Plan
	 * @param ctx Context
	 * @param AD_FieldGroup_ID ID
	 * @param trxName Transaction
	 */
	public MFieldGroup (Properties ctx, int AD_FieldGroup_ID, String trxName)
	{
		super (ctx, AD_FieldGroup_ID, trxName);
	}
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MFieldGroup (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MFieldGroup

	public static MFieldGroup getbyIdentifier(String identifier) {
		MFieldGroup retValue = null;
		String SQL = "SELECT * FROM AD_FieldGroup WHERE Identifier = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(SQL, null);
			pstmt.setString(1, identifier);
			rs = pstmt.executeQuery();
			if (rs.next())
				retValue = new MFieldGroup(Env.getCtx(),rs, null);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DB.close(rs, pstmt);
		}
		return retValue;
	}
	public static MFieldGroup getbyName(String fieldgroup) {
		MFieldGroup retValue = null;
		String whereClause = "Name = ? "; 
		try {
			retValue = new Query(Env.getCtx(), MFieldGroup.Table_Name, whereClause, null).setParameters(fieldgroup).first();				
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return retValue;
	}
}
