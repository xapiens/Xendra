package org.compiere.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_AD_Function;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MFunction  extends X_AD_Function {
	
	private static CLogger s_log = CLogger.getCLogger(MFunction.class);

	public MFunction(Properties ctx, int AD_TableAnalyze_ID, String trxName) {
		super(ctx, AD_TableAnalyze_ID, trxName);
	}

	public MFunction(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public static MFunction getbyIdentifier(String Identifier) {
		MFunction retval = null;
		String sql = "SELECT AD_Function_ID FROM AD_Function WHERE Identifier = ?";
		int AD_Function_ID = DB.getSQLValue(null, sql, Identifier);		
		if ( AD_Function_ID > 0)
		{
			retval = new MFunction( Env.getCtx(), AD_Function_ID, null);
		}
		return retval;
	}

	public static MFunction get(String functionname, String arguments) {
		MFunction retval = new MFunction(Env.getCtx(), 0, null);
		String sql = null;
		int function_id = 0;
		if (arguments.length() > 0)
		{
			sql = "SELECT AD_Function_ID FROM AD_Function WHERE name = ? AND arguments = ?";		
			function_id = DB.getSQLValue(null, sql, functionname, arguments);
		}
		else
		{
			sql = "SELECT AD_Function_ID FROM AD_Function WHERE name = ?";		
			function_id = DB.getSQLValue(null, sql, functionname);			
		}
		if ( function_id > 0)
		{
			retval = new MFunction( Env.getCtx(), function_id, null);
		}
		return retval;
	}
	
	public static Boolean exist(String functionname) {
		String sql = "SELECT COUNT(*) FROM AD_Function WHERE name = ?";
		int no = DB.getSQLValue(null, sql, functionname);
		return no == 1;
	}

	public Boolean createfunction() {
		String SQLFunction = this.getCode();
		//int result = DB.executeUpdate(SQLFunction, null);
		Connection conn = null;
		PreparedStatement pstmt = null;
		try
		{
			conn = DB.getConnectionID();
			//	Error
			if (conn == null)
				return false;

			pstmt = conn.prepareStatement(SQLFunction);
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		}
		catch (Exception e)
		{
			try
			{
				if (conn != null)
					conn.rollback();
			} catch (SQLException e1) { }
		}
		finally
		{
			pstmt = null;
			if (conn != null)
			{
				try {
					conn.close();
				} catch (SQLException e) {}
				conn = null;
			}
		}
		return true;
	}

}
