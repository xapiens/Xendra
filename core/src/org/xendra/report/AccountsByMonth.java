package org.xendra.report;

import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.xendra.annotations.*;

@XendraProcess(value="RV_AcctMonth",
name="Accounts by Month",
description="",
help="",
Identifier="f43fc1be-26a3-64fa-0cf4-b75a148ea301",
classname="org.xendra.report.AccountsByMonth",
updated="2015-06-20 10:10:12")
public class AccountsByMonth extends SvrProcess {
	@XendraProcessParameter(Name="Client",
			                ColumnName="AD_Client_ID",
			                Description="Client/Tenant for this installation.",
			                Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
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
			                Identifier="0f0acbef-239b-1b2c-9c1b-e46f5845878e")	
	private int m_AD_Client_ID;
	@XendraProcessParameter(Name="Organization",
			                ColumnName="AD_Org_ID",
			                Description="Organizational entity within client",
			                Help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.",
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
			                Identifier="0bce3b01-d744-6561-fbc0-cc967c146236")	
	private int m_AD_Org_ID;
	@XendraProcessParameter(Name="Accounting Schema",
			                ColumnName="C_AcctSchema_ID",
			                Description="Rules for accounting",
			                Help="An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=30,
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
			                Identifier="1f30d1bd-c143-92a0-05f3-e0d15773d55c")
	private int m_C_AcctSchema_ID;
	@XendraProcessParameter(Name="Account Key",
			                ColumnName="AccountValue",
			                Description="Key of Account Element",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=70,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=20,
			                IsMandatory=false,
			                IsRange=true,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="95646de2-c3b0-5258-3eed-63417e1edadd")	
	private String m_AccountValue_From;
	private String m_AccountValue_To;
	@XendraProcessParameter(Name="Year",
			                ColumnName="Year",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.Integer,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=14,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="1db45254-2dac-9540-1de2-bde2704972f1")	
	private int m_Year;
	@XendraProcessParameter(Name="PostingType",
			                ColumnName="PostingType",
			                Description="The type of posted amount for the transaction",
			                Help="The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="A",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="f3039cb6-0285-7409-9937-440506e2b77a")	
	private String m_PostingType;
	@XendraProcessParameter(Name="account_level",
			                ColumnName="account_level",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.Integer,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=14,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="d99cb944-93fb-8d5c-7608-3afa3c6ab6fe")	
	private int m_Level;
	@XendraProcessParameter(Name="Is Only movement account",
			                ColumnName="IsOnlyMovementAccount",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=80,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="61b7648c-49db-a736-7a58-f2011fb2b203")	
	private String m_IsOnlyMovementAccount;


	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = para[i].getParameterAsInt();
			else if (name.equals("C_AcctSchema_ID"))
				m_C_AcctSchema_ID = para[i].getParameterAsInt();
			else if (name.equals("PostingType")) {
				m_PostingType = (String)para[i].getParameter();
			}
			else if (name.equals("Year")) {
				m_Year = para[i].getParameterAsInt();
			}
			else if (name.equals("Account_Level")) {
				m_Level = para[i].getParameterAsInt();
			}
			else if (name.equals("AccountValue")) {
				m_AccountValue_From = (String)para[i].getParameter();
				m_AccountValue_To = (String)para[i].getParameter_To();
			}
			else if (name.equals("IsOnlyMovementAccount")) {
				m_IsOnlyMovementAccount = (String)para[i].getParameter();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	protected String doIt() throws Exception {
		
		String sql = "CREATE  TEMPORARY TABLE " +
						"tmp_AccountByMonth " +
					 "AS " +
					 	"SELECT " +
					 		"ev.value," +
					 		"f.Account_ID," +
							"case when extract(month from f.dateacct)=1 then sum(f.amtacctdr-f.amtacctcr) else null end as January," +
							"case when extract(month from f.dateacct)=2 then sum(f.amtacctdr-f.amtacctcr) else null end as February," +
							"case when extract(month from f.dateacct)=3 then sum(f.amtacctdr-f.amtacctcr) else null end as March," +
							"case when extract(month from f.dateacct)=4 then sum(f.amtacctdr-f.amtacctcr) else null end as April," +
							"case when extract(month from f.dateacct)=5 then sum(f.amtacctdr-f.amtacctcr) else null end as May," +
							"case when extract(month from f.dateacct)=6 then sum(f.amtacctdr-f.amtacctcr) else null end as June," +
							"case when extract(month from f.dateacct)=7 then sum(f.amtacctdr-f.amtacctcr) else null end as July," +
							"case when extract(month from f.dateacct)=8 then sum(f.amtacctdr-f.amtacctcr) else null end as August," +
							"case when extract(month from f.dateacct)=9 then sum(f.amtacctdr-f.amtacctcr) else null end as September," +
							"case when extract(month from f.dateacct)=10 then sum(f.amtacctdr-f.amtacctcr) else null end as October," +
							"case when extract(month from f.dateacct)=11 then sum(f.amtacctdr-f.amtacctcr) else null end as November," +
							"case when extract(month from f.dateacct)=12 then sum(f.amtacctdr-f.amtacctcr) else null end as December " +
                        "FROM " +
                        	"Fact_Acct f " +
                        	"INNER JOIN C_ElementValue ev ON (f.Account_ID=ev.C_ElementValue_ID) " +
                        "WHERE " +
                        	"f.AD_Client_ID=" + m_AD_Client_ID + " ";
        if (m_AD_Org_ID != 0) {
        	sql = sql + "AND f.AD_Org_ID=" + m_AD_Org_ID + " ";
        }
        sql = sql +
        					"AND f.DateAcct>='" + m_Year + "-01-01' " +
                        	"AND f.DateAcct<'" + (m_Year+1) + "-01-01' ";
		if (m_AccountValue_From != null) {
			sql = sql +		"AND ev.Value >= '" + m_AccountValue_From + "' ";
		}
		if (m_AccountValue_To != null) {
			sql = sql +		"AND ev.Value <= '" + m_AccountValue_To + "' ";
		}
		sql = sql +
                        "GROUP BY " +
                        	"f.Account_ID, " +
                        	"extract(month FROM f.dateacct), " +
                        	"ev.value";

		int no = DB.executeUpdate(sql, this.get_TrxName());
		if (no == -1) return "@Error@";
		
		sql = "INSERT INTO " +
				"T_AcctMonth" +
				"(" +
					"AD_PInstance_ID," +
					"AD_Client_ID," +
					"AD_Org_ID," +
					"IsActive," +
					"Created," +
					"CreatedBy," +
					"Updated," +
					"UpdatedBy," +
					"C_AcctSchema_ID," +
					"PostingType," +
					"C_ElementValue_ID," +
					"Year," +
					"account_Level," +
					"AccountValue," +
					"Amt_January," +
					"Amt_February," +
					"Amt_March," +
					"Amt_April," +
					"Amt_May," +
					"Amt_June," +
					"Amt_July," +
					"Amt_August," +
					"Amt_September," +
					"Amt_October," +
					"Amt_November," +
					"Amt_December," +
					"AccountParent," +
					"AccountLevel," +
					"Value2," +
					"IsOnlyMovementAccount " +
				") " +
				"SELECT " +
					this.getAD_PInstance_ID() + "," +
					m_AD_Client_ID + "," +
					m_AD_Org_ID + "," +
					"'Y'," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					"CURRENT_TIMESTAMP," +
					this.getAD_User_ID() + "," +
					m_C_AcctSchema_ID + "," +
					"'" + m_PostingType + "'," +
					"t.Account_ID," +
					m_Year + "," +
					m_Level + "," +
					"t.Value," +
					"sum(t.January)," +
					"sum(t.February)," +
					"sum(t.March)," +
					"sum(t.April)," +
					"sum(t.May)," +
					"sum(t.June)," +
					"sum(t.July)," +
					"sum(t.August)," +
					"sum(t.September)," +
					"sum(t.October)," +
					"sum(t.November)," +
					"sum(t.December)," +
					"getParentAccount(t.Account_ID)," +
					"getAccountLevel(t.Account_ID)," +
					"t.Value," +
					"'" + m_IsOnlyMovementAccount + "' " +
				"FROM " +
					"tmp_AccountByMonth t " +
				"GROUP BY " +
					"t.Account_ID," +
					"t.Value";
		no = DB.executeUpdate(sql, this.get_TrxName());
		if (no == -1) return "@Error@";

		if (!m_IsOnlyMovementAccount.equals("Y")) {
			int maxlevel = DB.getSQLValue(this.get_TrxName(), "SELECT max(AccountLevel) FROM T_AcctMonth WHERE AD_PInstance_ID="+this.getAD_PInstance_ID());
			
			if (maxlevel > 0) {
				for (int i = maxlevel; i > 0; i--) {
					sql = "INSERT INTO " +
							"T_AcctMonth" +
							"(" +
								"AD_PInstance_ID," +
								"AD_Client_ID," +
								"AD_Org_ID," +
								"IsActive," +
								"Created," +
								"CreatedBy," +
								"Updated," +
								"UpdatedBy," +
								"C_AcctSchema_ID," +
								"PostingType," +
								"C_ElementValue_ID," +
								"Year," +
								"account_Level," +
								"AccountValue," +
								"Amt_January," +
								"Amt_February," +
								"Amt_March," +
								"Amt_April," +
								"Amt_May," +
								"Amt_June," +
								"Amt_July," +
								"Amt_August," +
								"Amt_September," +
								"Amt_October," +
								"Amt_November," +
								"Amt_December," +
								"AccountParent," +
								"AccountLevel," +
								"Value2," +
								"IsSubtotal," +
								"IsOnlyMovementAccount" +
					        ") " +
					        "SELECT " +
					        	this.getAD_PInstance_ID() + "," +
					        	m_AD_Client_ID + "," +
					        	m_AD_Org_ID + "," +
					        	"'Y'," +
					        	"CURRENT_TIMESTAMP," +
					        	this.getAD_User_ID() + "," +
					        	"CURRENT_TIMESTAMP," +
					        	this.getAD_User_ID() + "," +
					        	m_C_AcctSchema_ID + "," +
					        	"'" + m_PostingType + "'," +
					        	"t.AccountParent," +
					        	m_Year + "," +
					        	m_Level + "," +
					        	"ev.Value," +
					        	"sum(t.Amt_January)," +
					        	"sum(t.Amt_February)," +
					        	"sum(t.Amt_March)," +
					        	"sum(t.Amt_April)," +
					        	"sum(t.Amt_May)," +
					        	"sum(t.Amt_June)," +
					        	"sum(t.Amt_July)," +
					        	"sum(t.Amt_August)," +
					        	"sum(t.Amt_September)," +
					        	"sum(t.Amt_October)," +
					        	"sum(t.Amt_November)," +
					        	"sum(t.Amt_December)," +
					        	"getParentAccount(t.AccountParent)," +
					        	"getAccountLevel(t.AccountParent)," +
					        	"rpad(ev.Value, 40, 'Z')," +
					        	"'Y', " +
					        	"'" + m_IsOnlyMovementAccount + "' " +
					        "FROM " +
					        	"T_AcctMonth t," +
					        	"C_ElementValue ev " +
					        "WHERE " +
					        	"t.AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
//								"AND t.IsSubtotal='Y' " +
					        	"AND t.AccountLevel=" + i + " " +
					        	"AND ev.C_ElementValue_ID=t.AccountParent " +
					        "GROUP BY " +
					        	"t.AccountParent," +
					        	"ev.Value";
					no = DB.executeUpdate(sql, this.get_TrxName());
					if (no == -1) return "@Error@";
				}
			}
		}
		
		sql = "INSERT INTO " +
			"T_AcctMonth" +
			"(" +
				"AD_PInstance_ID," +
				"AD_Client_ID," +
				"AD_Org_ID," +
				"IsActive," +
				"Created," +
				"CreatedBy," +
				"Updated," +
				"UpdatedBy," +
				"C_AcctSchema_ID," +
				"PostingType," +
				"C_ElementValue_ID," +
				"Year," +
				"account_Level," +
				"AccountValue," +
				"Amt_January," +
				"Amt_February," +
				"Amt_March," +
				"Amt_April," +
				"Amt_May," +
				"Amt_June," +
				"Amt_July," +
				"Amt_August," +
				"Amt_September," +
				"Amt_October," +
				"Amt_November," +
				"Amt_December," +
				"AccountParent," +
				"AccountLevel," +
				"Value2," +
				"IsOnlyMovementAccount" +
			") " +
			"SELECT " +
        		this.getAD_PInstance_ID() + "," +
        		m_AD_Client_ID + "," +
        		m_AD_Org_ID + "," +
        		"'Y'," +
        		"CURRENT_TIMESTAMP," +
        		this.getAD_User_ID() + "," +
        		"CURRENT_TIMESTAMP," +
        		this.getAD_User_ID() + "," +
        		m_C_AcctSchema_ID + "," +
        		"'" + m_PostingType + "'," +
        		"null," +
	        	m_Year + "," +
				m_Level + "," +
        		"'Total'," +
        		"sum(t.Amt_January)," +
        		"sum(t.Amt_February)," +
        		"sum(t.Amt_March)," +
        		"sum(t.Amt_April)," +
        		"sum(t.Amt_May)," +
        		"sum(t.Amt_June)," +
        		"sum(t.Amt_July)," +
        		"sum(t.Amt_August)," +
        		"sum(t.Amt_September)," +
        		"sum(t.Amt_October)," +
        		"sum(t.Amt_November)," +
        		"sum(t.Amt_December)," +
        		"null," +
        		"0," +
        		"rpad('9', 40, '9')," +
				"'" + m_IsOnlyMovementAccount + "' " +
        	"FROM " +
        		"T_AcctMonth t " +
            "WHERE " +
        		"t.AD_PInstance_ID=" + this.getAD_PInstance_ID() + " " +
        		"AND t.IsSubtotal='N' ";
		no = DB.executeUpdate(sql, this.get_TrxName());
		if (no == -1) return "@Error@";
		
		if (m_Level > 0) {
			sql = "UPDATE " +
					"T_AcctMonth " +
				  "SET " +
			  		"IsVisible='Y' " +
			      "WHERE " +
			  		"AccountLevel<=" + m_Level + " " +
			  		"AND AD_PInstance_ID=" + this.getAD_PInstance_ID();
			no = DB.executeUpdate(sql, this.get_TrxName());
			if (no == -1) return "@Error@";
		}
		else {
			sql = "UPDATE " +
					"T_AcctMonth " +
				  "SET " +
				  	"IsVisible='Y' " +
				  "WHERE " +
				  	"AD_PInstance_ID=" + this.getAD_PInstance_ID();
			no = DB.executeUpdate(sql, this.get_TrxName());
			if (no == -1) return "@Error@";
		}
		
		sql = "DROP TABLE tmp_AccountByMonth";
		no = DB.executeUpdate(sql, this.get_TrxName());
		if (no == -1) return "@Error@";

		return null;
	}

}
