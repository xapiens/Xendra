/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 * Contributor: Carlos Ruiz - globalqss                                       *
 *****************************************************************************/
package org.compiere.process;

import java.math.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.*;

import org.compiere.model.MBOE;
import org.compiere.model.persistence.X_I_BOE;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Import Bill of Exchange from I_boe
 *
 * 	@author 	xapiens
 * 	@version 	$Id: ImportBillOfExchange.java 508 2007-11-24 23:06:53Z el_man $
 */
@XendraProcess(value="Import_BillOfExchange",
name="Import BillOfExchange",
description="Import BillOfExchange",
help="The Parameters are default values for null import record values, they do not overwrite any data. Note that only Prepare and Complete are valid document actions.",
Identifier="15793ed7-2ba8-c7b3-9083-6dc0ef815e80",
classname="org.compiere.process.ImportBillOfExchange",
updated="2015-06-20 10:10:12")
public class ImportBillOfExchange extends SvrProcess
{
	/**	Client to be imported to		*/
	@XendraProcessParameter(Name="Client",
			                ColumnName="AD_Client_ID",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.TableDir,
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
			                Identifier="41db84c2-8d43-1ea7-12fa-add06271dc36")	
	private int				m_AD_Client_ID = 0;
	
	/** Organization to be imported to  */
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
			                DefaultValue="-1",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="728728ae-4957-7ec4-b0a5-ddd54acbfe51")	
	private int 			m_AD_Org_ID = 0;
	/**	Delete old Imported				*/
	@XendraProcessParameter(Name="Delete old imported records",
                ColumnName="DeleteOldImported",
                Description="Before processing delete old imported records in the import table",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
                SeqNo=30,
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
                Identifier="d4f740d9-292b-d369-d11d-c3ef450b9515")
	private boolean			m_deleteOldImported = false;
	
	private String m_lang;

	private Properties 		m_ctx;

	private MBOE BOE;

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (name.equals("AD_Client_ID"))
				/** m_AD_Client_ID = 1000027;*/
		        m_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("AD_Org_ID"))
				/**m_AD_Org_ID = 1000070;*/
			    m_AD_Org_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("DeleteOldImported"))
				m_deleteOldImported = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		m_ctx = Env.getCtx();
	}	//	prepare


	/**
	 *  Perrform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{
		StringBuffer sql = null;
		int no = 0;
		String clientCheck = " AND AD_Client_ID=" + m_AD_Client_ID;		
		m_lang = Env.getAD_Language(m_ctx);
		String defaultName = Msg.translate(m_lang, "Standard");
		//	****	Prepare	****

		//	Delete Old Imported
		if (m_deleteOldImported)
		{
			sql = new StringBuffer ("DELETE FROM I_BOE "
				+ "WHERE I_IsImported='Y'").append(clientCheck);
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("Delete Old Impored =" + no);
		}

		//	Set Client, Org, IsActive, Created/Updated
		sql = new StringBuffer ("UPDATE I_BOE "
			+ "SET AD_Client_ID = COALESCE (AD_Client_ID,0),"
			+ " AD_Org_ID = COALESCE (AD_Org_ID,0),"
			+ " IsActive = COALESCE (IsActive, 'Y'),"
			+ " Created = COALESCE (Created, CURRENT_TIMESTAMP),"
			+ " CreatedBy = COALESCE (CreatedBy, 0),"
			+ " Updated = COALESCE (Updated, CURRENT_TIMESTAMP),"
			+ " UpdatedBy = COALESCE (UpdatedBy, 0),"
			+ " I_ErrorMsg = ' ',"
			+ " I_IsImported = 'N' "
			+ "WHERE I_IsImported<>'Y' OR I_IsImported IS NULL");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Reset=" + no);

		
		//	Set Currency
		sql = new StringBuffer ("UPDATE I_BOE i "
				+ "SET C_Currency_ID=(SELECT C_Currency_ID FROM C_Currency c WHERE c.iso_code=i.CurSymbol) ");
		sql.append("WHERE I_IsImported<>'Y'").append(clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set Currency Default=" + no);
		
		sql = new StringBuffer ("UPDATE I_BOE i "
				+ "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Invalid Org, '"
				+ " WHERE (AD_Org_ID IS NULL OR AD_Org_ID=0"
				+ " OR EXISTS (SELECT * FROM AD_Org oo WHERE i.AD_Org_ID=oo.AD_Org_ID AND (oo.IsSummary='Y' OR oo.IsActive='N')))"
				+ " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no != 0)
			log.warning ("Invalid Org=" + no);
		
		
		// DocTypeDefault
		//	Document Type - BOE
		// i.DocTypeName = Letra-Proveedor , Letra-Cliente
		sql = new StringBuffer ("UPDATE I_BOE i "
			  + "SET C_DocType_ID=(SELECT C_DocType_ID FROM C_DocType d WHERE d.Name=i.DocTypeName"
			  + " AND d.DocBaseType IN ('BOE') AND i.AD_Client_ID=d.AD_Client_ID) "
			  + "WHERE C_DocType_ID IS NULL AND DocTypeName IS NOT NULL AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no != 0)			
			log.fine("Set DocType=" + no);

		sql = new StringBuffer ("UPDATE I_BOE i "
				  + "SET IsSoTrx=(SELECT IsSoTrx FROM C_DocType d WHERE d.C_DocType_ID=i.C_DocType_ID"
				  + " AND i.AD_Client_ID=d.AD_Client_ID) "
				  + "WHERE NOT C_DocType_ID IS NULL AND I_IsImported<>'Y'").append (clientCheck);
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			if (no != 0)			
				log.fine("Set IsSoTrx=" + no);
		
		sql = new StringBuffer ("UPDATE I_BOE "
				  + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Invalid DocTypeName, ' "
				  + "WHERE C_DocType_ID IS NULL AND DocTypeName IS NOT NULL"
				  + " AND I_IsImported<>'Y'").append (clientCheck);
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			if (no != 0)
				log.warning ("Invalid DocTypeName=" + no);		
		
		// Business Partner
		
		//	BP from EMail
		sql = new StringBuffer ("UPDATE I_BOE o "
			  + "SET (C_BPartner_ID,AD_User_ID)=(SELECT C_BPartner_ID,AD_User_ID FROM AD_User u"
			  + " WHERE o.EMail=u.EMail AND o.AD_Client_ID=u.AD_Client_ID AND u.C_BPartner_ID IS NOT NULL) "
			  + "WHERE C_BPartner_ID IS NULL AND EMail IS NOT NULL"
			  + " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set BP from EMail=" + no);
		//	BP from ContactName
		sql = new StringBuffer ("UPDATE I_BOE o "
			  + "SET (C_BPartner_ID,AD_User_ID)=(SELECT C_BPartner_ID,AD_User_ID FROM AD_User u"
			  + " WHERE o.ContactName=u.Name AND o.AD_Client_ID=u.AD_Client_ID AND u.C_BPartner_ID IS NOT NULL) "
			  + "WHERE C_BPartner_ID IS NULL AND ContactName IS NOT NULL"
			  + " AND EXISTS (SELECT Name FROM AD_User u WHERE o.ContactName=u.Name AND o.AD_Client_ID=u.AD_Client_ID AND u.C_BPartner_ID IS NOT NULL GROUP BY Name HAVING COUNT(*)=1)"
			  + " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set BP from ContactName=" + no);
		//	BP from Value
		sql = new StringBuffer ("UPDATE I_BOE i "
			  + "SET C_BPartner_ID=(SELECT MAX(C_BPartner_ID) FROM C_BPartner bp"
			  + " WHERE i.BPartnerValue=bp.Value AND i.AD_Client_ID=bp.AD_Client_ID) "
			  + "WHERE C_BPartner_ID IS NULL AND BPartnerValue IS NOT NULL"
			  + " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set BP from Value=" + no);
		//	Default BP
		sql = new StringBuffer ("UPDATE I_BOE o "
			  + "SET C_BPartner_ID=(SELECT C_BPartnerCashTrx_ID FROM AD_ClientInfo c"
			  + " WHERE o.AD_Client_ID=c.AD_Client_ID) "
			  + "WHERE C_BPartner_ID IS NULL AND BPartnerValue IS NULL AND Name IS NULL"
			  + " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set Default BP=" + no);

		sql = new StringBuffer("UPDATE I_BOE i " 	
		+ " SET C_BPartner_Location_ID=(SELECT MAX(bpl.C_BPartner_Location_ID) from C_BPartner_Location bpl INNER JOIN I_BOE i ON (bpl.C_BPartner_ID = i.C_BPartner_ID)) "
		+ " WHERE C_BPartner_Location_ID IS NULL AND I_IsImported='N' ").append(clientCheck);

		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Found Location=" + no);		

		sql = new StringBuffer ("UPDATE I_BOE "
			  + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=No BP Location, ' "
			  + "WHERE C_BPartner_ID IS NOT NULL AND C_BPartner_Location_ID IS NULL"
			  + " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		if (no != 0)
			log.warning ("No BP Location=" + no);
		

		//	BP from Value
		sql = new StringBuffer ("UPDATE I_BOE i "
			  + "SET guarantor_ID=(SELECT MAX(C_BPartner_ID) FROM C_BPartner bp"
			  + " WHERE i.GuarantorValue=bp.Value AND i.AD_Client_ID=bp.AD_Client_ID) "
			  + "WHERE guarantor_ID IS NULL AND GuarantorValue IS NOT NULL"
			  + " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set BP from Value=" + no);

		//	Conversion from Value
		sql = new StringBuffer ("UPDATE I_BOE i "
			  + "SET C_ConversionType_ID=(SELECT MAX(C_ConversionType_ID) FROM C_ConversionType ct"
			  + " WHERE TRIM(i.ConversionValue)=TRIM(ct.Value) AND i.AD_Client_ID=ct.AD_Client_ID) "
			  + "WHERE C_ConversionType_ID IS NULL AND ConversionValue IS NOT NULL"
			  + " AND I_IsImported<>'Y'").append (clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set Conversion Type from Value=" + no);
		
		commit();
		//	-------------------------------------------------------------------
		int noInsert = 0;
		int noUpdate = 0;

		//	Go through Records
		sql = new StringBuffer ("SELECT * FROM I_BOE "
			+ "WHERE I_IsImported='N'").append(clientCheck);
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{				
				boolean ok = false;				
				X_I_BOE imp = new X_I_BOE (getCtx (), rs, get_TrxName());
				BOE = new MBOE (getCtx(), 0, null);
				BOE.setClientOrg (imp.getAD_Client_ID(), imp.getAD_Org_ID());
				BOE.setC_DocTypeTarget_ID(imp.getC_DocType_ID());
				BOE.setC_BPartner_ID(imp.getC_BPartner_ID());
				BOE.setC_DocType_ID(imp.getC_DocType_ID());
				BOE.setC_BPartner_Location_ID(imp.getC_BPartner_Location_ID());
				BOE.setC_Currency_ID(imp.getC_Currency_ID());
				BOE.setC_BankAccount_ID(imp.getC_BankAccount_ID());
				BOE.setDateBOE(imp.getDateBOE());
				BOE.setStatusDate(imp.getStatusDate());
				BOE.setIsSOTrx(imp.isSOTrx());
				BOE.setGrandTotal(imp.getGrandTotal());
				BOE.setDueDate(imp.getDueDate());
				BOE.setC_ConversionType_ID(imp.getC_ConversionType_ID());
				//BOE.setRefinanceDoc(imp.getRefinanceDoc());
				//BOE.setRefinanceDays(imp.getRefinanceDays());
				BOE.setBOENo(imp.getBOENo());
				BOE.setDocAction(imp.getDocAction());
				BOE.setDocStatus(imp.getDocStatus());

				imp.setI_IsImported(true);
				imp.setProcessed(true);
				
				BOE.save();

				imp.setC_BOE_ID(BOE.getC_BOE_ID());
				
				if (imp.save())
					noInsert++;
				
			}
			commit();
			rs.close();
			pstmt.close();			
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "", e);
			rollback();
		}

		//	Set Error to indicator to not imported
		sql = new StringBuffer ("UPDATE I_BOE "
			+ "SET I_IsImported='N', Updated=CURRENT_TIMESTAMP "
			+ "WHERE I_IsImported<>'Y'").append(clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@C_BOE_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdate), "@C_BOE_ID@: @Updated@");
		return "";
	}	//	doIt

}	//	ImportBOE
