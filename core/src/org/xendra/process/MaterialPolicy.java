package org.xendra.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

@XendraProcess(value="MaterialPolicy",
name="Material Policy",
description="Material Policy Process",
help="The Material Policy is the process to calculate the stock policy of the organization",
Identifier="a73c9786-f867-f6e7-d5a8-8835bcce1bc6",				   
classname="org.xendra.process.MaterialPolicy",
updated="2019-11-06 09:34:12")				
public class MaterialPolicy extends SvrProcess {
	/** The date to calculate the days due from			*/
	@XendraProcessParameter(Name="Client",	
			ColumnName="AD_Client_ID",
			Description="Client/Tenant for this installation.",
			Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
			AD_Reference_ID=DisplayType.TableDir,
			SeqNo=10,
			ReferenceValueID="",	
			ValRuleID="",
			FieldLength=1,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="b65ca86d-c480-7985-f1e2-0b5e22f0a982")						
	private int	p_AD_Client_ID = -1;
	@XendraProcessParameter(Name="Synchronized",	
			ColumnName="Synchronized",
			Description="Synchronized All Data",
			Help="Synchronized All Data",
			AD_Reference_ID=DisplayType.YesNo,
			SeqNo=20,
			ReferenceValueID="",	
			ValRuleID="",
			FieldLength=1,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="0192b549-771d-6895-14f5-009c89711aad")							
	private Boolean p_Synchronized = false;
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;			
			else if (name.equals(Constants.COLUMNNAME_AD_Client_ID))
				p_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals(X_M_MaterialPolicy.COLUMNNAME_Synchronized))
				p_Synchronized = "Y".equals(para[i].getParameter());				
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	
	
	protected String doIt() throws Exception {
		int count = new Query(Env.getCtx(), X_M_Product.Table_Name, "AD_Client_ID = ? AND iscostable = 'N'", null).setParameters(p_AD_Client_ID).count();
		String msg = String.format("existen %s productos no costeables", count);
		PreparedStatement pstmt = null;		
		X_M_MaterialPolicy mp = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "AD_Client_ID = ?", null)
			.setParameters(p_AD_Client_ID).first();		
		if (mp != null) {
			//
			StringBuilder sql = new StringBuilder("SELECT MATERIALPOLICY(?,?,?)");
			try
			{			
				pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
				pstmt.setInt(1, p_AD_Client_ID);
				pstmt.setInt(2, mp.getM_CostElement_ID());
				pstmt.setBoolean(3, p_Synchronized);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					String error = rs.getString(1);
					if (error == null) 
						error = "";
					if (error.length() > 0) {
						msg += "<br>" + error;						
					}
				}
				rs.close();
				pstmt.close();
				pstmt = null;
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, sql.toString(), e);
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
		}
		return msg;
	}
}
