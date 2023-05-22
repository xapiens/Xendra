package org.xendra.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MYear;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_Demand;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

@XendraProcess(value="DemandGenerate",
name="Generate Demand from Inouts",
description="Generate Demand",
help="Generate Demand",
Identifier="2890abd6-87e3-1b6a-a4d3-fe1e4506a5aa",
classname="org.xendra.process.DemandGenerate",
updated="2023-05-18 16:30:12")
public class DemandGenerate extends SvrProcess {

	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null) {
				;                               
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
			}
		}		
	}

	// group by client, org can duplicate periods 
	private String getSQL() {
		String sql =  "INSERT into m_demandline (m_demand_id, m_demandline_id, created, createdby, updated, updatedby, ad_client_id, ad_org_id, c_period_id, m_product_id, qty) " +
				" SELECT ?, nextval('m_demandline_seq'),now(), 100, now(), 100, ad_client_id, org, ( SELECT p.c_period_id FROM c_period p WHERE y.dd >= p.startdate AND y.dd <= p.enddate AND p.ad_client_id = y.ad_client_id) AS c_period_id,"+
				"		m_product_id, qty from ( " +
				"		select ad_client_id, org, make_date(year::integer,month::integer,1) as dd, m_product_id, qty from ( " +
				"		select iol.ad_client_id, iol.ad_org_id as org, extract(year from movementdate) as year, extract(month from movementdate) as month, m_product_id, sum(movementqty) as qty "+
				"		  from m_inoutline iol join m_inout io " + 
				"		    on  iol.m_inout_id = io.m_inout_id " +
				"		    where io.issotrx = 'Y' and io.docstatus = 'CO' " +
				"		    and extract(year from movementdate) = ? " +
				"		  group by iol.ad_client_id, iol.ad_org_id, year, month,m_product_id) as x) as y; ";
		return sql;
	}

	private String getDeleteSQL() {
		String sql = "DELETE FROM M_demandLine where m_demand_id = ? ";
		return sql;
	}
	
	protected String doIt() throws Exception {
		String error = "";
		try {			
			int i = 1;
			X_M_Demand demand = new Query(Env.getCtx(), X_M_Demand.Table_Name, "M_Demand_ID = ?", null)
					.setParameters(getRecord_ID()).first();
			MYear year = new Query(Env.getCtx(), MYear.Table_Name, "C_Year_ID = ?", null)
					.setParameters(demand.getC_Year_ID()).first();
			if (year != null) {
				DB.executeUpdate(getDeleteSQL(), getRecord_ID(), get_TrxName());
				int m_Year = Integer.valueOf(year.getFiscalYear());
				PreparedStatement pstmt = DB.prepareStatement(getSQL(), get_TrxName());
				DB.setParameter(pstmt, i++, getRecord_ID());
				DB.setParameter(pstmt, i++, m_Year);
				int records = pstmt.executeUpdate();		
				error = String.format("%s processed", records);
				pstmt.close();
			} else {
				error = "Year not exists";
			}
			return error;
		}
		catch (Exception e) {
			return "@Error@";
		}
	}

	public static void main(String[] args) throws Exception {
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		DemandGenerate rr = new DemandGenerate();

		ProcessInfo pi = new ProcessInfo ("DemandGenerate", 0 /* Process ID */, /* Table_ID*/ 0, 0 /* record_ID */);
		pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
		pi.setAD_Client_ID (Env.getAD_Client_ID(Env.getCtx()));
		Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
		//
		ProcessInfoParameter pip;
		pip = new ProcessInfoParameter("Year", 2018 , null, null, null);
		tabParams.add(pip);
		//                      
		pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));
		rr.startProcess(Env.getCtx(), pi, null);
		//rr.doIt();		
	}
}
