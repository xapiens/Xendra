/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software. you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model.persistence;

/** Generated Model - DO NOT CHANGE */
import org.compiere.model.*;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.xendra.annotations.*;
import org.compiere.util.*;
/** Generated Model for C_BP_Withholding
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_Withholding extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_Withholding_ID id
@param trxName transaction
*/
public X_C_BP_Withholding (Properties ctx, int C_BP_Withholding_ID, String trxName)
{
super (ctx, C_BP_Withholding_ID, trxName);
/** if (C_BP_Withholding_ID == 0)
{
setC_BPartner_ID (0);
setC_Withholding_ID (0);
setIsMandatoryWithholding (false);	
// N
setIsTemporaryExempt (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_Withholding (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=299 */
public static int Table_ID=MTable.getTable_ID("C_BP_Withholding");

@XendraTrl(Identifier="406c643d-c9a0-bc23-bdd7-ecb946a08352")
public static String es_PE_TAB_Withholding_Description="Definir Retención";

@XendraTrl(Identifier="406c643d-c9a0-bc23-bdd7-ecb946a08352")
public static String es_PE_TAB_Withholding_Name="Retención";

@XendraTrl(Identifier="406c643d-c9a0-bc23-bdd7-ecb946a08352")
public static String es_PE_TAB_Withholding_Help="La pestaña Retención define información sobre retenciones para este socio de negocio.";

@XendraTab(Name="Withholding",Description="Define Withholding (Beta)",
Help="The Withholding Tab defines any withholding information for this business partner.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=120,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="3e7ac839-0b6f-245f-1105-3808c714aa3c",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="406c643d-c9a0-bc23-bdd7-ecb946a08352",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Withholding="406c643d-c9a0-bc23-bdd7-ecb946a08352";

@XendraTrl(Identifier="261aad01-5210-fc7b-b524-fdeb568ba4b0")
public static String es_PE_TABLE_C_BP_Withholding_Name="C_BP_Withholding";

@XendraTable(Name="C_BP_Withholding",Description="",Help="",TableName="C_BP_Withholding",
AccessLevel="3",AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="261aad01-5210-fc7b-b524-fdeb568ba4b0",Synchronized="2017-08-16 11:41:34.0")
/** TableName=C_BP_Withholding */
public static final String Table_Name="C_BP_Withholding";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_Withholding");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
  if (Table_ID == 0)
    Table_ID = MTable.getTable_ID("C_BP_Withholding");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_Withholding[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f49b2fef-b7ad-0279-fe0c-77b3df9d9e5b")
public static String es_PE_FIELD_Withholding_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f49b2fef-b7ad-0279-fe0c-77b3df9d9e5b")
public static String es_PE_FIELD_Withholding_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="f49b2fef-b7ad-0279-fe0c-77b3df9d9e5b")
public static String es_PE_FIELD_Withholding_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="406c643d-c9a0-bc23-bdd7-ecb946a08352",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f49b2fef-b7ad-0279-fe0c-77b3df9d9e5b")
public static final String FIELDNAME_Withholding_BusinessPartner="f49b2fef-b7ad-0279-fe0c-77b3df9d9e5b";

@XendraTrl(Identifier="3e7ac839-0b6f-245f-1105-3808c714aa3c")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3e7ac839-0b6f-245f-1105-3808c714aa3c",Synchronized="2017-08-05 16:53:26.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Withholding.
@param C_Withholding_ID Withholding type defined */
public void setC_Withholding_ID (int C_Withholding_ID)
{
if (C_Withholding_ID < 1) throw new IllegalArgumentException ("C_Withholding_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Withholding_ID, Integer.valueOf(C_Withholding_ID));
}
/** Get Withholding.
@return Withholding type defined */
public int getC_Withholding_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Withholding_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="adeed944-bc0c-cb22-7a4e-9f354a0a2a2b")
public static String es_PE_FIELD_Withholding_Withholding_Description="Tipo de retención definida";

@XendraTrl(Identifier="adeed944-bc0c-cb22-7a4e-9f354a0a2a2b")
public static String es_PE_FIELD_Withholding_Withholding_Help="La Retención indica el tipo de retención a ser calculada";

@XendraTrl(Identifier="adeed944-bc0c-cb22-7a4e-9f354a0a2a2b")
public static String es_PE_FIELD_Withholding_Withholding_Name="Retención";

@XendraField(AD_Column_ID="C_Withholding_ID",IsCentrallyMaintained=true,
AD_Tab_ID="406c643d-c9a0-bc23-bdd7-ecb946a08352",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adeed944-bc0c-cb22-7a4e-9f354a0a2a2b")
public static final String FIELDNAME_Withholding_Withholding="adeed944-bc0c-cb22-7a4e-9f354a0a2a2b";

@XendraTrl(Identifier="2ebd8a93-880b-8d79-d398-78d5925d04c9")
public static String es_PE_COLUMN_C_Withholding_ID_Name="Retención";

@XendraColumn(AD_Element_ID="518d5ae2-65ee-2bb8-8c37-13beaceecf15",ColumnName="C_Withholding_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ebd8a93-880b-8d79-d398-78d5925d04c9",
Synchronized="2017-08-05 16:53:26.0")
/** Column name C_Withholding_ID */
public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
/** Set Exempt reason.
@param ExemptReason Reason for not withholding */
public void setExemptReason (String ExemptReason)
{
if (ExemptReason != null && ExemptReason.length() > 20)
{
log.warning("Length > 20 - truncated");
ExemptReason = ExemptReason.substring(0,19);
}
set_Value (COLUMNNAME_ExemptReason, ExemptReason);
}
/** Get Exempt reason.
@return Reason for not withholding */
public String getExemptReason() 
{
String value = (String)get_Value(COLUMNNAME_ExemptReason);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="80eaecc7-7ad2-8277-040d-4ae012b536ab")
public static String es_PE_FIELD_Withholding_ExemptReason_Description="Razón para no retener";

@XendraTrl(Identifier="80eaecc7-7ad2-8277-040d-4ae012b536ab")
public static String es_PE_FIELD_Withholding_ExemptReason_Help="Razón de excepción indica la razón por la que el dinero no es retenido para este empleado";

@XendraTrl(Identifier="80eaecc7-7ad2-8277-040d-4ae012b536ab")
public static String es_PE_FIELD_Withholding_ExemptReason_Name="Razón de Excepción";

@XendraField(AD_Column_ID="ExemptReason",IsCentrallyMaintained=true,
AD_Tab_ID="406c643d-c9a0-bc23-bdd7-ecb946a08352",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTemporaryExempt@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="80eaecc7-7ad2-8277-040d-4ae012b536ab")
public static final String FIELDNAME_Withholding_ExemptReason="80eaecc7-7ad2-8277-040d-4ae012b536ab";

@XendraTrl(Identifier="e22ade05-c426-28f5-f341-622b67e6eee6")
public static String es_PE_COLUMN_ExemptReason_Name="Razón de Excepción";

@XendraColumn(AD_Element_ID="f79e656c-c15b-38af-6957-5c1345cadcd5",ColumnName="ExemptReason",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e22ade05-c426-28f5-f341-622b67e6eee6",
Synchronized="2017-08-05 16:53:26.0")
/** Column name ExemptReason */
public static final String COLUMNNAME_ExemptReason = "ExemptReason";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 36)
{
log.warning("Length > 36 - truncated");
Identifier = Identifier.substring(0,35);
}
set_Value (COLUMNNAME_Identifier, Identifier);
}
/** Get Identifier.
@return Identifier */
public String getIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_Identifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a84c9dac-d10b-4ea0-ba32-efda59ed1c15")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a84c9dac-d10b-4ea0-ba32-efda59ed1c15",
Synchronized="2017-08-05 16:53:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Mandatory Withholding.
@param IsMandatoryWithholding Monies must be withheld */
public void setIsMandatoryWithholding (boolean IsMandatoryWithholding)
{
set_Value (COLUMNNAME_IsMandatoryWithholding, Boolean.valueOf(IsMandatoryWithholding));
}
/** Get Mandatory Withholding.
@return Monies must be withheld */
public boolean isMandatoryWithholding() 
{
Object oo = get_Value(COLUMNNAME_IsMandatoryWithholding);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6526fe57-f675-26d0-aefc-71c6a86a2447")
public static String es_PE_FIELD_Withholding_MandatoryWithholding_Description="El dinero debe ser retenido";

@XendraTrl(Identifier="6526fe57-f675-26d0-aefc-71c6a86a2447")
public static String es_PE_FIELD_Withholding_MandatoryWithholding_Help="El cuadro de verificación Retención Obligatoria indica que el dinero debe ser retenido para este empleado";

@XendraTrl(Identifier="6526fe57-f675-26d0-aefc-71c6a86a2447")
public static String es_PE_FIELD_Withholding_MandatoryWithholding_Name="Retención Obligatoria";

@XendraField(AD_Column_ID="IsMandatoryWithholding",IsCentrallyMaintained=true,
AD_Tab_ID="406c643d-c9a0-bc23-bdd7-ecb946a08352",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6526fe57-f675-26d0-aefc-71c6a86a2447")
public static final String FIELDNAME_Withholding_MandatoryWithholding="6526fe57-f675-26d0-aefc-71c6a86a2447";

@XendraTrl(Identifier="b639b2b8-f6fb-c44c-ca7f-79a6a4d67827")
public static String es_PE_COLUMN_IsMandatoryWithholding_Name="Retención Obligatoria";

@XendraColumn(AD_Element_ID="118c5925-02d4-a2c2-1d91-f94d25e5f565",
ColumnName="IsMandatoryWithholding",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b639b2b8-f6fb-c44c-ca7f-79a6a4d67827",Synchronized="2017-08-05 16:53:26.0")
/** Column name IsMandatoryWithholding */
public static final String COLUMNNAME_IsMandatoryWithholding = "IsMandatoryWithholding";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="14e61f9e-e0b1-4511-b055-f53220f4838b")
public static String es_PE_COLUMN_IsSOTrx_Name="Sales Transaction";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14e61f9e-e0b1-4511-b055-f53220f4838b",
Synchronized="2017-08-05 16:53:26.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Temporary exempt.
@param IsTemporaryExempt Temporarily do not withhold taxes */
public void setIsTemporaryExempt (boolean IsTemporaryExempt)
{
set_Value (COLUMNNAME_IsTemporaryExempt, Boolean.valueOf(IsTemporaryExempt));
}
/** Get Temporary exempt.
@return Temporarily do not withhold taxes */
public boolean isTemporaryExempt() 
{
Object oo = get_Value(COLUMNNAME_IsTemporaryExempt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5cf33c36-2a2c-7516-e17b-873b8dc1c156")
public static String es_PE_FIELD_Withholding_TemporaryExempt_Description="Temporalmente no retener impuestos";

@XendraTrl(Identifier="5cf33c36-2a2c-7516-e17b-873b8dc1c156")
public static String es_PE_FIELD_Withholding_TemporaryExempt_Help="El cuadro de verificación exento temporalmente indica que por un tiempo limitado ; los impuestos no serán retenidos para este empleado.";

@XendraTrl(Identifier="5cf33c36-2a2c-7516-e17b-873b8dc1c156")
public static String es_PE_FIELD_Withholding_TemporaryExempt_Name="Exención temporal";

@XendraField(AD_Column_ID="IsTemporaryExempt",IsCentrallyMaintained=true,
AD_Tab_ID="406c643d-c9a0-bc23-bdd7-ecb946a08352",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cf33c36-2a2c-7516-e17b-873b8dc1c156")
public static final String FIELDNAME_Withholding_TemporaryExempt="5cf33c36-2a2c-7516-e17b-873b8dc1c156";

@XendraTrl(Identifier="3d4b070f-6709-ce09-9476-4ccb0e012bfd")
public static String es_PE_COLUMN_IsTemporaryExempt_Name="Exención temporal";

@XendraColumn(AD_Element_ID="fa73e2b9-94ea-a6a1-e420-cc8b8886ddd6",ColumnName="IsTemporaryExempt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d4b070f-6709-ce09-9476-4ccb0e012bfd",
Synchronized="2017-08-05 16:53:26.0")
/** Column name IsTemporaryExempt */
public static final String COLUMNNAME_IsTemporaryExempt = "IsTemporaryExempt";
}
