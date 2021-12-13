package org.xendra.process;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.util.logging.Level;

import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MPeriod;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;

import java.math.BigDecimal;
import java.sql.ResultSet;

import org.xendra.annotations.*;

@XendraProcess(value="C_DocumentModify",
name="Modify Document",
description="Modifies certain fields of the document that normally can't be modified. This should only be run by the Super User or an Administrator.",
help="",
Identifier="21f67998-c26b-37c6-4a75-e2b602fedca3",
classname="org.xendra.process.DocumentModify",
updated="2015-06-20 10:10:12")	
public class DocumentModify extends SvrProcess {
	@XendraProcessParameter(Name="Invoice",
			                ColumnName="C_Invoice_ID",
			                Description="Invoice Identifier",
			                Help="The Invoice Document.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="410782c4-4305-43f3-590a-2a6d3d14280c")	
	private int m_C_Invoice_ID = 0;
	@XendraProcessParameter(Name="IsModifyDate",
			                ColumnName="IsModifyDate",
			                Description="If selected, you must enter the new date for the document.",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="05dedf19-28f3-3687-aeab-31a9cabd4a8c")	
	private boolean m_IsModifyDate = false;
	@XendraProcessParameter(Name="IsModifyOrder",
			                ColumnName="IsModifyOrder",
			                Description="If selected, then the Order associated with this document will be modified.",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="938d9ef7-1f32-837c-8d65-f61d401361da")	
	private boolean m_IsModifyOrder = false;
	@XendraProcessParameter(Name="IsModifyNumber",
			                ColumnName="IsModifyNumber",
			                Description="If selected, the document's number will be changed.",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="88186d75-93ff-9b7f-9407-c30ade268d6f")	
	private boolean m_IsModifyNumber = false;
	@XendraProcessParameter(Name="Date Invoiced",
			                ColumnName="DateInvoiced",
			                Description="Date printed on Invoice",
			                Help="The Date Invoice indicates the date printed on the invoice.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="cff9cf26-e658-0343-8e71-d71335f69af3")	
	private Timestamp m_DateInvoiced = null;
	@XendraProcessParameter(Name="Order",
			                ColumnName="C_Order_ID",
			                Description="Order",
			                Help="The Order is a control document.  The  Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you cloase an order, unshipped (backordered) quantities are cancelled.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="32c1daeb-22c6-2f14-a5c2-d26b88b18d70")
	private int m_C_Order_ID = 0;
	@XendraProcessParameter(Name="Document No",
			                ColumnName="DocumentNo",
			                Description="Document sequence number of the document",
			                Help="The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in \"<>\". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice).  If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the \"Maintain Sequence\" window with the NAME \"DocumentNo_<TableName>\", where TableName is the actual NAME of the table (e.g. C_Order).",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=70,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=30,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="a341df25-3e61-f1d7-7e9d-e29286ef5736")	
	private String m_DocumentNo = null;
	
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Invoice_ID"))
				m_C_Invoice_ID = para[i].getParameterAsInt();
			else if (name.equals("IsModifyDate"))
				m_IsModifyDate = "Y".equals(para[i].getParameter());
			else if (name.equals("DateInvoiced"))
				m_DateInvoiced = (Timestamp)para[i].getParameter();
			else if (name.equals("IsModifyOrder"))
				m_IsModifyOrder = "Y".equals(para[i].getParameter());
			else if (name.equals("C_Order_ID"))
				m_C_Order_ID = para[i].getParameterAsInt();
			else if (name.equals("IsModifyNumber"))
				m_IsModifyNumber = "Y".equals(para[i].getParameter());
			else if (name.equals("DocumentNo"))
				m_DocumentNo = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		
	}
	protected String doIt () throws Exception
	{
		MInvoice invoice = MInvoice.get(getCtx(), m_C_Invoice_ID);
		MDocType dt = MDocType.get(getCtx(), invoice.getC_DocType_ID());
		
		if (!MPeriod.isOpen(getCtx(), invoice.getDateAcct(), dt.getDocBaseType(), invoice.getAD_Org_ID(), invoice.getAD_Client_ID()))
		{
			return "@Error@: @PeriodClosed@";
		}				

		if (m_IsModifyDate)
			invoice.setDateInvoiced(m_DateInvoiced);
		if (m_IsModifyOrder)
			invoice.setC_Order_ID(m_C_Order_ID);
		if (m_IsModifyNumber) {
			/* First verify that the number isn't used */
			String sql = "SELECT * FROM C_Invoice WHERE C_DocType_ID=?"
				+ "AND C_BPartner_ID=? AND DocumentNo=?";
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, invoice.getC_DocType_ID());
			pstmt.setInt(2, invoice.getC_BPartner_ID());
			pstmt.setString(3, m_DocumentNo);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				rs.close();
				/* Already used, abort */
				throw new Exception( "@Error@: Document Number already used. Cannot duplicate.");
			}

			rs.close();

			/* Not used, so proceed */
			invoice.setDocumentNo(m_DocumentNo.toString());
		}
		
		if (invoice.save()) {
			return "Invoice successfully modified";
		}
		else return "@Error@";
	}
}
