package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_AD_PrintForm;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

public class MPrintForm extends X_AD_PrintForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 	Get MColumn from Cache
	 *	@param ctx context
	 * 	@param AD_Column_ID id
	 *	@return MColumn
	 */
	public static MPrintForm get (Properties ctx, int AD_Client_ID)
	{
		MPrintForm retValue = null;
		String sql = "SELECT AD_PrintForm_ID FROM AD_PrintForm WHERE AD_Client_ID=? ";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt(1, AD_Client_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
				retValue = new MPrintForm(ctx, rs.getInt(1), null);
			rs.close ();
			pstmt.close ();
			pstmt = null;
			rs = null;
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
		return retValue;
	}	//	get
	/**	Cache						*/
	private static CLogger	s_log	= CLogger.getCLogger (MPrintForm.class);

	public MPrintForm (Properties ctx, int AD_PrintForm_ID, String trxName)
	{
		super (ctx, AD_PrintForm_ID, trxName);
		if (AD_PrintForm_ID == 0)
		{
		//	setAD_Element_ID (0);
		//	setAD_Reference_ID (0);
		//	setColumnName (null);
		//	setName (null);
		//	setEntityType (null);	// U
		}
	}	//	MPrintForm
}
