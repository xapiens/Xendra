package org.compiere.process;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MRefList;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_AcctSchema_Default;
import org.compiere.model.persistence.X_C_AcctSchema_Element;
import org.compiere.model.persistence.X_C_AcctSchema_GL;
import org.compiere.model.persistence.X_C_Element;
import org.compiere.model.persistence.X_C_ElementValue;
import org.compiere.model.persistence.X_I_ElementSchema;
import org.compiere.model.reference.REF_C_AcctSchemaElementType;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.util.UpdatePO;

public class ImportAccountSchemaDefault extends SvrProcess {
	/**	Client to be imported to		*/
	@XendraProcessParameter(Name="Client",
			ColumnName="AD_Client_ID",
			Description="Client/Tenant for this installation.",
			Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
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
			Identifier="9c7bc2a8-c30e-ef3a-1357-2e16e32d03f9")	
	private int	m_AD_Client_ID = 0;
	/**	Delete old Imported				*/
	@XendraProcessParameter(Name="Delete old imported records",
			ColumnName="DeleteOldImported",
			Description="Before processing delete old imported records in the import table",
			Help="",
			AD_Reference_ID=DisplayType.YesNo,
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
			Identifier="b1c5734f-1a5a-4729-8ccf-d2b46a0d1389")
	private boolean			m_deleteOldImported = false;	
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
				m_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("DeleteOldImported"))
				m_deleteOldImported = "Y".equals(para[i].getParameter());			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare
	/**
	 *  Perrform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{
		int no = 0;
		UpdatePO o = new UpdatePO();
		//	Delete Old Imported
		if (m_deleteOldImported)
		{			
			o.setTablename(X_I_ElementSchema.Table_Name);
			o.setClient(m_AD_Client_ID);			
			no = o.delete("I_IsImported='Y'", get_TrxName());
			log.info("Delete Old Impored =" + no);
		}
		List<X_I_ElementSchema> schemas = new Query(Env.getCtx(), X_I_ElementSchema.Table_Name, "I_IsImported='N'", get_TrxName()).list();
		for (X_I_ElementSchema schema:schemas)
		{
			//
		}		
		o = new UpdatePO();
		o.setTablename(X_I_ElementSchema.Table_Name);
		o.setField(X_I_ElementSchema.COLUMNNAME_I_ErrorMsg, "");
		o.setField(X_I_ElementSchema.COLUMNNAME_I_IsImported, Constants.NO);
		o.setClient(m_AD_Client_ID);
		no = o.update("I_IsImported<>'Y' OR I_IsImported IS NULL", get_TrxName());		
		log.info("Reset=" + no);

		o = new UpdatePO();
		o.setTablename(X_I_ElementSchema.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		String fieldexpr = "(SELECT C_ElementValue_ID FROM C_ElementValue e WHERE i.Elementname=e.Value AND i.AD_Client_ID=e.AD_Client_ID)"; 
		o.setFieldExpr(X_I_ElementSchema.COLUMNNAME_C_ElementValue_ID, fieldexpr);		
		no = o.update("C_ElementValue_ID IS NULL", get_TrxName());
		log.info("ElementValue=" + no);
		//	Verify ElementValue
		o = new UpdatePO();
		o.setTablename(X_I_ElementSchema.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementSchema.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_ElementSchema.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid ElementValue,'");
		no = o.update("C_ElementValue_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		if (no != 0)
			log.warning("Invalid ElementValue=" + no);

		commit();
		//	-------------------------------------------------------------------
		int noInsert = 0;
		int noUpdate = 0;
		int noInsertPO = 0;
		int noUpdatePO = 0;
		log.fine("start inserting/updating ...");

		MAcctSchema  m_as = new Query(Env.getCtx(), MAcctSchema.Table_Name, "AD_Client_ID = ?", get_TrxName())
		.setParameters(m_AD_Client_ID).first();

		int C_Element_ID = new Query(Env.getCtx(), X_C_Element.Table_Name, "AD_Client_ID = ?", get_TrxName())
			.setParameters(m_AD_Client_ID).firstId();
		
		UpdatePO schema = new UpdatePO();
		schema.setTablename(X_C_AcctSchema_GL.Table_Name);
		schema.setClient(m_AD_Client_ID);		
		schema.setField(X_C_AcctSchema_GL.COLUMNNAME_C_AcctSchema_ID, m_as.getC_AcctSchema_ID());
		schema.setField(X_C_AcctSchema_GL.COLUMNNAME_UseSuspenseBalancing, Constants.YES);
		schema.setField(X_C_AcctSchema_GL.COLUMNNAME_UseSuspenseError, Constants.YES);
		schema.setField(X_C_AcctSchema_GL.COLUMNNAME_UseCurrencyBalancing, Constants.YES);

		UpdatePO schemadefault = new UpdatePO();
		schemadefault.setTablename(X_C_AcctSchema_Default.Table_Name);
		schemadefault.setClient(m_AD_Client_ID);
		schemadefault.setField(X_C_AcctSchema_GL.COLUMNNAME_C_AcctSchema_ID, m_as.getC_AcctSchema_ID());

		// define the accounts elements
		ValueNamePair[] results = MRefList.getList("24957d9a-7342-7c9b-45fa-52d6e887e0d5");
		//int AD_Client_ID = m_client.getAD_Client_ID();
		int Element_OO=0, Element_AC=0, Element_PR=0, Element_BP=0, Element_PJ=0,
				Element_MC=0, Element_SR=0;		
		for (ValueNamePair result:results) {
			String IsMandatory = null;
			String IsBalanced = "N";
			int SeqNo = 0;		
			int C_AcctSchema_Element_ID = 0;			
			String ElementType = result.getValue();
			String name = result.getName();
			if (ElementType.equals(REF_C_AcctSchemaElementType.Organization)) 
			{
				C_AcctSchema_Element_ID = getNextID(m_AD_Client_ID, "C_AcctSchema_Element");
				Element_OO = C_AcctSchema_Element_ID;
				IsMandatory = "Y";
				IsBalanced = "Y";
				SeqNo = 10;
			}
			else if (ElementType.equals(REF_C_AcctSchemaElementType.Account))
			{
				C_AcctSchema_Element_ID = getNextID(m_AD_Client_ID, "C_AcctSchema_Element");
				Element_AC = C_AcctSchema_Element_ID;
				IsMandatory = "Y";
				SeqNo = 20;
			}
			else if (ElementType.equals(REF_C_AcctSchemaElementType.Product))
			{
				C_AcctSchema_Element_ID = getNextID(m_AD_Client_ID, "C_AcctSchema_Element");
				Element_PR = C_AcctSchema_Element_ID;
				IsMandatory = "N";
				SeqNo = 30;
			}
			else if (ElementType.equals(REF_C_AcctSchemaElementType.BPartner))
			{
				C_AcctSchema_Element_ID = getNextID(m_AD_Client_ID, "C_AcctSchema_Element");
				Element_BP = C_AcctSchema_Element_ID;
				IsMandatory = "N";
				SeqNo = 40;
			}
			else if (ElementType.equals(REF_C_AcctSchemaElementType.Project))
			{
				C_AcctSchema_Element_ID = getNextID(m_AD_Client_ID, "C_AcctSchema_Element");
				Element_PJ = C_AcctSchema_Element_ID;
				IsMandatory = "N";
				SeqNo = 50;
			}
			else if (ElementType.equals(REF_C_AcctSchemaElementType.Campaign))
			{
				C_AcctSchema_Element_ID = getNextID(m_AD_Client_ID, "C_AcctSchema_Element");
				Element_MC = C_AcctSchema_Element_ID;
				IsMandatory = "N";
				SeqNo = 60;
			}
			else if (ElementType.equals(REF_C_AcctSchemaElementType.SalesRegion))
			{
				C_AcctSchema_Element_ID = getNextID(m_AD_Client_ID, "C_AcctSchema_Element");
				Element_SR = C_AcctSchema_Element_ID;
				IsMandatory = "N";
				SeqNo = 70;
			}
			//	Not OT, LF, LT, U1, U2, AY
			if (IsMandatory != null)
			{
				UpdatePO se = new UpdatePO();
				se.setClient(m_AD_Client_ID);
				se.setTablename(X_C_AcctSchema_Element.Table_Name);					
				se.setField(X_C_AcctSchema_Element.COLUMNNAME_C_AcctSchema_Element_ID, C_AcctSchema_Element_ID);
				se.setField(X_C_AcctSchema_Element.COLUMNNAME_C_AcctSchema_ID, m_as.getC_AcctSchema_ID());
				se.setField(X_C_AcctSchema_Element.COLUMNNAME_ElementType, ElementType);
				se.setField(X_C_AcctSchema_Element.COLUMNNAME_Name, name);
				se.setField(X_C_AcctSchema_Element.COLUMNNAME_SeqNo, SeqNo);
				se.setField(X_C_AcctSchema_Element.COLUMNNAME_IsMandatory, IsMandatory);
				se.setField(X_C_AcctSchema_Element.COLUMNNAME_IsBalanced, IsBalanced);
				no = se.insert(get_TrxName());				
				//if (no == 1)
					//m_info.append(Msg.translate(m_lang, "C_AcctSchema_Element_ID")).append("=").append(name).append("\n");

				/** Default value for mandatory elements: OO and AC */
				if (ElementType.equals(REF_C_AcctSchemaElementType.Organization))
				{
					o = new UpdatePO();
					o.setTablename(X_C_AcctSchema_Element.Table_Name);
					o.setClient(m_AD_Client_ID);
					o.setField(Constants.COLUMNNAME_AD_Client_ID, m_AD_Client_ID);
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_Org_ID, Env.getContext(Env.getCtx(), "#AD_Org_ID"));					
					no = o.update(String.format("C_AcctSchema_Element_ID='%s'",C_AcctSchema_Element_ID),get_TrxName());										
					if (no != 1)
						log.log(Level.SEVERE, "Default Org in AcctSchamaElement NOT updated");
				}
				if (ElementType.equals(REF_C_AcctSchemaElementType.Account))
				{
					o = new UpdatePO();
					o.setTablename(X_C_AcctSchema_Element.Table_Name);
					o.setClient(m_AD_Client_ID);						
					X_I_ElementSchema es = new Query(Env.getCtx(), X_I_ElementSchema.Table_Name, "schemaname = ?", get_TrxName())
						.setParameters("ELEMENT").first();
					if (es != null) {
						o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_ElementValue_ID, es.getC_ElementValue_ID());
						o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_Element_ID, C_Element_ID);
						no = o.update(String.format("C_AcctSchema_Element_ID='%s'", C_AcctSchema_Element_ID), get_TrxName());
						if (no != 1)
							log.log(Level.SEVERE, "Default Account in AcctSchamaElement NOT updated");							
					}
				}
			}			
		}		
		//
		List<X_I_ElementSchema> importschemas = new Query(Env.getCtx(), X_I_ElementSchema.Table_Name, "I_IsImported='N'", get_TrxName()).list();
		for (X_I_ElementSchema importschema:importschemas) {
			Boolean m_accountsOK = true;
			int C_ElementValue_ID = importschema.getC_ElementValue_ID();
			X_C_ElementValue e = new Query(Env.getCtx(), X_C_ElementValue.Table_Name, "C_ElementValue_ID = ?", get_TrxName())
			.setParameters(C_ElementValue_ID).first();
			MAccount vc = MAccount.getDefault(m_as, true);	//	optional null
			vc.setAD_Org_ID(Env.getContextAsInt(Env.getCtx(), "#AD_Org_ID"));		//	will be overwritten
			vc.setAccount_ID(C_ElementValue_ID);
			if (!vc.save())
			{
				log.severe("Not Saved - Key=" + importschema.getaccount() + ", C_ElementValue_ID=" + C_ElementValue_ID);
				m_accountsOK = false;
			}
			int C_ValidCombination_ID = vc.getC_ValidCombination_ID();
			if (C_ValidCombination_ID == 0)
			{
				m_accountsOK = false;
			}
			if (m_accountsOK) {
				importschema.setC_ValidCombination_ID(C_ValidCombination_ID);
				if (importschema.save()) {
					if (importschema.getSchemaName().equals("SCHEMA")) {
						schema.setField(importschema.getaccount(), C_ValidCombination_ID);
					} else if (importschema.getSchemaName().equals("DEFAULT")) {
						schemadefault.setField(importschema.getaccount(), C_ValidCombination_ID);	
					}							
				}
			}			

		}
		no = schema.insert(get_TrxName());			
		if (no != 1) {

		}
		no = schemadefault.insert(get_TrxName());
		if (no != 1) {

		}
		
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@M_Product_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdate), "@M_Product_ID@: @Updated@");
		addLog (0, null, new BigDecimal (noInsertPO), "@M_Product_ID@ @Purchase@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdatePO), "@M_Product_ID@ @Purchase@: @Updated@");		
		return "";
	}
	
	/**************************************************************************
	 * 	Get Next ID
	 * 	@param AD_Client_ID client
	 * 	@param TableName table name
	 * 	@return id
	 */
	private int getNextID (int AD_Client_ID, String TableName)
	{
		//	TODO: Exception 
		return DB.getNextID (AD_Client_ID, TableName, get_TrxName());
	}	//	getNextID
	
}
