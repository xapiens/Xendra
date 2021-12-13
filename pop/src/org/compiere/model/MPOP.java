package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_C_POPLine;
import org.compiere.util.CCache;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;

public class MPOP extends X_C_POP {
	
	public Boolean getbool(String name)
	{		
		Boolean var = false;
		if (Env.getMachine().getProperties().get(name) != null)
			var = Boolean.valueOf(Env.getMachine().getProperties().get(name).toString());
		return var;
			
	}	
	public int getint(String name)
	{
		Integer value = 0;
		if (Env.getMachine().getProperties().get(name) != null)
			value = Integer.valueOf(Env.getMachine().getProperties().get(name).toString());
		return value;
	}
	
	public MPOPLine[] getLines()
	{
		ArrayList<MPOPLine> list = new ArrayList<MPOPLine> ();
		StringBuffer sql = new StringBuffer("SELECT * FROM C_POPLine WHERE C_POP_ID=? AND IsVisible='Y' AND IsActive='Y' ORDER by Line ");
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, getC_POP_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MPOPLine ol = new MPOPLine(getCtx(), rs, get_TrxName());
				ol.setHeaderInfo (this);
				list.add(ol);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		finally
		{
			try
			{
				if (pstmt != null)
					pstmt.close ();
			}
			catch (Exception e)
			{}
			pstmt = null;
		}
		//
		MPOPLine[] lines = new MPOPLine[list.size ()];
		list.toArray (lines);
		return lines;		
	}
	
	public List<MPOPLine> getLines(String Type)
	{
		//String where = "C_POP_ID=? AND IsVisible='Y' AND Type in ( ?, 'B')";
		String where = "C_POP_ID=? AND IsVisible='Y' AND Type = ?";
		List<MPOPLine> lines = new Query(Env.getCtx(), X_C_POPLine.Table_Name, where, null)
		.setParameters(getC_POP_ID(), Type).setOrderBy("Line").list();
		return lines;	
	}
	
	/**
	 * 	Get POS from Cache
	 *	@param ctx context
	 *	@param C_POS_ID id
	 *	@return MPOS
	 */
	public static MPOP get (Properties ctx, int C_POP_ID)
	{
		Integer key = new Integer (C_POP_ID);
		MPOP retValue = (MPOP) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MPOP (ctx, C_POP_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	} //	get

	public static MPOP getByUser (Properties ctx, int AD_User_ID)
	{
		int C_Pop_ID = DB.getSQLValue(null, "SELECT C_Pop_ID FROM C_Pop WHERE AD_User_ID=" + AD_User_ID + " AND IsActive='Y'");
		if (C_Pop_ID == -1) return null;
		
		return get(ctx, C_Pop_ID);
	}

	/**	Cache						*/
	private static CCache<Integer,MPOP> s_cache = new CCache<Integer,MPOP>("C_POP", 20);

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_POS_ID id
	 *	@param trxName transaction
	 */
	public MPOP (Properties ctx, int C_POP_ID, String trxName)
	{
		super (ctx, C_POP_ID, trxName);
		if (C_POP_ID == 0)
		{
		//	setName (null);
		//	setSalesRep_ID (0);
		//	setC_CashBook_ID (0);
		//	setM_PriceList_ID (0);
		//	setM_Warehouse_ID (0);
		}	
	}	//	MPOS

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MPOP (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MPOS
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Org Consistency
		if (newRecord 
			|| is_ValueChanged("C_CashBook_ID") || is_ValueChanged("M_Warehouse_ID"))
		{
			MCashBook cb = MCashBook.get(getCtx(), getC_CashBook_ID());
			if (cb.getAD_Org_ID() != getAD_Org_ID())
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@AD_Org_ID@: @C_CashBook_ID@"));
				return false;
			}
		}
		return true;
	}	//	beforeSave

	public String toString()
	{		
		MWarehouse wh = MWarehouse.get(Env.getCtx(), getM_Warehouse_ID());
		MUser user = MUser.get(Env.getCtx(), getAD_User_ID());
		String name = getName().concat("-").concat(wh.getName()).concat("-").concat(user.getName());
		return name;
	}
	
}
