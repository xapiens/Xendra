package org.compiere.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_View;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MView  extends X_AD_View {
	
	private static CLogger s_log = CLogger.getCLogger(MView.class);

	public MView(Properties ctx, int AD_View_ID, String trxName) {
		super(ctx, AD_View_ID, trxName);
	}
	
	public MView(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	
	public static MView getbyIdentifier(String identifier) {
		MView view = new Query(Env.getCtx(), X_AD_View.Table_Name, "identifier = ?", null).setParameters(identifier).first();
		return view;
	}

	public static MView get(String viewname) {
		MView retval = new MView(Env.getCtx(), 0, null);
		String sql = "SELECT AD_View_ID FROM AD_View WHERE name = ?";
		int AD_View_ID = DB.getSQLValue(null, sql, viewname);		
		if ( AD_View_ID > 0)
		{
			retval = new MView( Env.getCtx(), AD_View_ID, null);
		}
		return retval;
	}

	public static Boolean exist(String viewname) {
		String sql = "SELECT COUNT(*) FROM AD_View WHERE name = ?";
		int no = DB.getSQLValue(null, sql, viewname);
		return no == 1;
	}

	public Boolean createfunction() {
		String SQLFunction = this.getDefinition();
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
