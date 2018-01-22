package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_AD_TableAnalyze;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

public class MTableAnalyze extends X_AD_TableAnalyze {

	private static CLogger s_log = CLogger.getCLogger(MTableAnalyze.class);

	public MTableAnalyze(Properties ctx, int AD_TableAnalyze_ID, String trxName) {
		super(ctx, AD_TableAnalyze_ID, trxName);
	}

	public MTableAnalyze(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public static MTableAnalyze get(Properties ctx, String TableName, String problem, String trxName)
	{
		MTableAnalyze analyze = null;
		String sql = "SELECT * FROM AD_TableAnalyze WHERE TableName=? AND problem=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, trxName);
			pstmt.setString(1, TableName);
			pstmt.setString(2, problem);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				analyze = new MTableAnalyze(ctx,rs, trxName);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		return analyze;
	}
	
	public void addStatistics ()
	{
		setStatistic_Count(getStatistic_Count() + 1);
	}	//	addStatistics
	
}
