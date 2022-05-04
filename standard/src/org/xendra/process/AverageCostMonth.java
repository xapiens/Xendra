package org.xendra.process;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

@XendraProcess(value="AverageCostMonth",
name="AverageCostMonth", 				   
description="Average Cost Calculation by Month", 
help="Average Cost calculated by Month from M_Transaction",
Identifier="488862a3-90a9-a171-eaf0-bc556af8c8e2",
classname="org.xendra.process.AverageCostMonth",
updated="2017-10-05 10:38:12")
public class AverageCostMonth extends SvrProcess {

	/**	Client	*/
	@XendraProcessParameter(Name="AD_Client_ID",
    ColumnName="AD_Client_ID",
    Description="",
    Help="",
	AD_Reference_ID=DisplayType.TableDir,
	SeqNo=10,	
	ReferenceValueID="",
	ValRuleID="",
	FieldLength=10,
	IsMandatory=true,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="67e866cb-7980-e467-36ec-b431aa4d61e5")	
	private int  p_AD_Client_ID = 0;	
	
	/**	Cost Element		*/
	@XendraProcessParameter(Name="Cost Element",
	ColumnName="M_CostElement_ID",
	Description="Product Cost Element",
	Help="",
	AD_Reference_ID=DisplayType.TableDir,
	SeqNo=20,
	ReferenceValueID="",
	ValRuleID="",
	FieldLength=10,
	IsMandatory=true,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="c5950df6-588b-0792-b9f8-741a81591a88")	
	private int	p_M_CostElement_ID = 0;
		
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				p_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("M_CostElement_ID"))
				p_M_CostElement_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		log.info("AD_Client_ID=" + p_AD_Client_ID + ", M_CostElement_ID=" + p_M_CostElement_ID);
		CallableStatement stmt = null;
		try {
			String function = "{call xendra.averagecostmaterial(?,?)}";
			stmt = DB.prepareCall(function, ResultSet.CONCUR_READ_ONLY, null);
			stmt.setInt(1, p_AD_Client_ID);
			stmt.setInt(2, p_M_CostElement_ID);
			stmt.execute();
			stmt.close();
		}
		catch (Exception e)
		{
			if (stmt != null)
				stmt.close();				
			throw new Exception();
		}		
		return null;
	}
}