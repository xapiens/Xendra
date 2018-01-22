package org.xendra.report;

import java.sql.Timestamp;
import java.util.logging.Level;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.xendra.annotations.XendraProcess;

public class CardingReport extends SvrProcess{

	private Timestamp m_Date_From;
	private Timestamp m_Date_To;
	private int m_Product_ID;
	private int m_Locator_ID;
	private int m_AD_Org_ID;

	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = para[i].getParameterAsInt();			
			else if (name.equals("M_Locator_ID"))
				m_Locator_ID = para[i].getParameterAsInt();
			else if (name.equals("M_Product_ID"))
				m_Product_ID = para[i].getParameterAsInt();			
			else if (name.equals("MovementDate")) {
				m_Date_From = (Timestamp)para[i].getParameter();
				m_Date_To = (Timestamp)para[i].getParameter_To();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	
	}
	
//	@XendraProcess(value="Carding",
//	name="Carding",
//	description="Carding of Products",
//	help="Carding of Products",
//	id="46142328-87d4-1e8c-9fda-f23baf44d5d7",
//	ParametersName={"AD_Org_ID",
//	"M_Locator_ID",
//	"M_Product_ID",
//	"MovementDate"},
//	ParametersType={DisplayType.TableDir,
//	DisplayType.Locator,
//	DisplayType.Search,
//	DisplayType.Date},
//	ParametersSeqNo={10,20,30,40},
//	ParametersReference={"3cefd939-fdfe-f99a-8105-07955b81a4cd",
//	"9b679002-c31f-dba6-6ce9-80d3b5149bbb",
//	"6f4a17ad-b890-92c3-09cf-6811e3fb48c7",
//	"ecebf9e6-f3bc-656f-7e58-c16d3719068b"},
//	ParametersReferenceValue={"",
//	"",
//	"",
//	""},
//	ParametersIsMandatory={"Y","Y","N","Y"},
//	ParametersIsRange={"N","N","N","Y"},
//	ParametersDefaultValue={"","","",""},
//	ParametersDefaultValue2={"","","",""},
//	ParametersvFormat={"","","",""},
//	ParametersvalueMin={"","","",""},
//	ParametersvalueMax={"","","",""},
//	ParametersDisplayLogic={"","","",""},
//	ParametersReadOnlyLogic={"","","",""})	
	protected String doIt() throws Exception
	{
		String cWhere = "";
		String sql = " INSERT INTO " +
		  " T_Carding ( " +
			  "ad_pinstance_id," +
			  "ad_client_id," +
			  "ad_org_id," +
			  "isactive," +
			  "created," +
			  "createdby," +
			  "updated," +
			  "updatedby," +
			  "movementtype," +
			  "m_locator_id," +
			  "m_product_id," +
			  "movementdate," +
			  "movementqty," +
			  "m_inventoryline_id," +
			  "m_movementline_id," +
			  "m_inout_id," +
			  "m_productionline_id," +
			  "c_projectissue_id," +
			  "movementqtybalance, " +
			  "pricecost," +
			  "totalcost) " +
			  "SELECT " +
				this.getAD_PInstance_ID() + "," +
				"t.ad_client_id," +
				m_AD_Org_ID + "," +
				"'Y'," +
				"CURRENT_TIMESTAMP," +
				this.getAD_User_ID() + "," +
				"CURRENT_TIMESTAMP," +
				this.getAD_User_ID() + "," +
				"t.movementtype," +
				"t.m_locator_id," +
				"t.m_product_id," +
				"t.movementdate," +
				"t.movementqty," +
				"t.m_inventoryline_id," +
				"t.m_movementline_id," +
				"il.m_inout_id," +
				"t.m_productionline_id," +
				"t.c_projectissue_id," +
				"t.movementqtybalance," +
				"(SELECT distinct SUM(f.amtacctdr) from fact_acct f where f.ad_table_id=319 and f.m_product_id=t.m_product_id and record_id=(select m_inout_id from m_inoutline where m_inoutline.m_inoutline_id=t.m_inoutline_id)) AS cost," +
				"(SELECT totalcost from M_CostDetail cd WHERE cd.m_product_id=t.m_product_id and cd.m_inoutline_id=t.m_inoutline_id) " +
			    "FROM " +
	    		"m_transaction t " +
	    		"RIGHT JOIN M_InOutLine il ON (t.M_InOutLine_ID=il.M_InOutLine_ID) " +
	    		//" INNER JOIN "
//	    		//"(select case when f.amtacctdr>f.amtacctcr then f.amtacctdr else f.amtacctcr end from fact_acct f where f.ad_table_id=319 and f.m_product_id=t.m_product_id and f.record_id=(select m_inout_id from m_inoutline where m_inoutline.m_inoutline_id=t.m_inoutline_id) where f.amtacctdr>f.amtacctcr) " +
				//"(select case when amtacctdr>amtacctcr  then amtacctdr else amtacctcr end from fact_acct where ad_table_id=319 and m_product_id=t.m_product_id and record_id=(select m_inout_id from m_inoutline where m_inoutline.m_inoutline_id=t.m_inoutline_id limit 1) " +
	    		//"(select pricecost from c_orderline where c_orderline_id=(select c_orderline_id from m_inoutline where m_inoutline_id=t.m_inoutline_id))" +
		    "WHERE ";			
		
		    if (m_AD_Org_ID != 0) {
		    	if (cWhere.length() == 0)
		    		cWhere = "t.AD_Org_ID= " + m_AD_Org_ID;		    		
		    	else
		    		cWhere = cWhere + " AND t.AD_Org_ID= " + m_AD_Org_ID + " ";
		    }
		    if (m_Locator_ID != 0 ) {
		    	if (cWhere.length() == 0) 
		    		cWhere ="t.m_locator_id = " + m_Locator_ID;
		    	else
		    		cWhere = cWhere + " AND t.m_locator_id = " + m_Locator_ID + " ";		    			
		    }
		    if (m_Product_ID != 0 ) {
		    	if (cWhere.length() == 0)
		    		cWhere = "t.m_product_id = " + m_Product_ID;
		    	else
		    		cWhere = cWhere +" AND t.m_product_id = " + m_Product_ID + " ";		    	
		    }
		    if ( cWhere.length() == 0 ) {
				cWhere =            "t.movementdate>=" + DB.TO_DATE(m_Date_From) + " " +
								"AND t.movementdate<=" + DB.TO_DATE(m_Date_To) + " ";
		    }
		    else
		    {
				cWhere = cWhere + " AND t.movementdate>=" + DB.TO_DATE(m_Date_From) + " " +
		                        "AND t.movementdate<=" + DB.TO_DATE(m_Date_To) + " ";		    	
		    }			
		    sql = sql + cWhere;
			int no = DB.executeUpdate(sql, this.get_TrxName());
			if (no == -1) {
				return "@error@";
			}			
		return null;
	}
	
}
