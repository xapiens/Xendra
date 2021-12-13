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
/** Generated Model for C_Withholding
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Withholding extends PO
{
/** Standard Constructor
@param ctx context
@param C_Withholding_ID id
@param trxName transaction
*/
public X_C_Withholding (Properties ctx, int C_Withholding_ID, String trxName)
{
super (ctx, C_Withholding_ID, trxName);
/** if (C_Withholding_ID == 0)
{
setBeneficiary (0);
setC_PaymentTerm_ID (0);
setC_Withholding_ID (0);
setIsPaidTo3Party (false);	
// N
setIsPercentWithholding (false);	
// N
setIsTaxProrated (false);	
// N
setIsTaxWithholding (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Withholding (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=304 */
public static int Table_ID=MTable.getTable_ID("C_Withholding");

@XendraTrl(Identifier="8d10e819-350d-ac2c-2b51-3aa3e7584d46")
public static String es_PE_TAB_Withholding_Description="Reglas de Retención";

@XendraTrl(Identifier="8d10e819-350d-ac2c-2b51-3aa3e7584d46")
public static String es_PE_TAB_Withholding_Help="La pestaña de Reglas de Retención define las reglas que determinan los totales retenidos.";

@XendraTrl(Identifier="8d10e819-350d-ac2c-2b51-3aa3e7584d46")
public static String es_PE_TAB_Withholding_Name="Retención";
@XendraTab(Name="Withholding",
Description="Withholding Rules",
Help="The Withholding Rules Tab define the rules governing the withholding of amounts.",
AD_Window_ID="1506817d-7a38-4734-8175-af48f9288444",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8d10e819-350d-ac2c-2b51-3aa3e7584d46",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Withholding="8d10e819-350d-ac2c-2b51-3aa3e7584d46";

@XendraTrl(Identifier="18ddc1b7-6159-2ce0-b369-5b8b77210c52")
public static String es_PE_TABLE_C_Withholding_Name="Retención";

@XendraTable(Name="Withholding",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Withholding type defined",Help="",
TableName="C_Withholding",AccessLevel="3",AD_Window_ID="1506817d-7a38-4734-8175-af48f9288444",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="18ddc1b7-6159-2ce0-b369-5b8b77210c52",Synchronized="2020-03-03 21:37:45.0")
/** TableName=C_Withholding */
public static final String Table_Name="C_Withholding";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Withholding");

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
    Table_ID = MTable.getTable_ID("C_Withholding");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Withholding[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Beneficiary.
@param Beneficiary Business Partner to whom payment is made */
public void setBeneficiary (int Beneficiary)
{
set_Value (COLUMNNAME_Beneficiary, Integer.valueOf(Beneficiary));
}
/** Get Beneficiary.
@return Business Partner to whom payment is made */
public int getBeneficiary() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Beneficiary);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e37f1c44-a2cb-7d16-3650-1a21625dfd83")
public static String es_PE_FIELD_Withholding_Beneficiary_Name="Beneficiario";

@XendraTrl(Identifier="e37f1c44-a2cb-7d16-3650-1a21625dfd83")
public static String es_PE_FIELD_Withholding_Beneficiary_Description="Socio del Negocio a quién se hace el pago";

@XendraTrl(Identifier="e37f1c44-a2cb-7d16-3650-1a21625dfd83")
public static String es_PE_FIELD_Withholding_Beneficiary_Help="El beneficiario indica el socio del negocio a quién se hará el pago. Este campo se despliega solamente si el cuadro de verificación pago a terceros se selecciona";

@XendraField(AD_Column_ID="Beneficiary",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPaidTo3Party@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e37f1c44-a2cb-7d16-3650-1a21625dfd83")
public static final String FIELDNAME_Withholding_Beneficiary="e37f1c44-a2cb-7d16-3650-1a21625dfd83";

@XendraTrl(Identifier="be9648fb-861a-bd18-6ab4-33687a30ec72")
public static String es_PE_COLUMN_Beneficiary_Name="Beneficiario";

@XendraColumn(AD_Element_ID="c523b541-e263-e973-6f0d-0732fa73ceac",ColumnName="Beneficiary",
AD_Reference_ID=18,AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="be9648fb-861a-bd18-6ab4-33687a30ec72",Synchronized="2019-08-30 22:22:22.0")
/** Column name Beneficiary */
public static final String COLUMNNAME_Beneficiary = "Beneficiary";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="59caa10d-375a-4652-a492-47a62173b161")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59caa10d-375a-4652-a492-47a62173b161",
Synchronized="2019-08-30 22:22:22.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Payment Term.
@param C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
{
if (C_PaymentTerm_ID < 1) throw new IllegalArgumentException ("C_PaymentTerm_ID is mandatory.");
set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
}
/** Get Payment Term.
@return The terms of Payment (timing, discount) */
public int getC_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8cf53919-c85f-f702-f4fd-038e9747ab1c")
public static String es_PE_FIELD_Withholding_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="8cf53919-c85f-f702-f4fd-038e9747ab1c")
public static String es_PE_FIELD_Withholding_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="8cf53919-c85f-f702-f4fd-038e9747ab1c")
public static String es_PE_FIELD_Withholding_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8cf53919-c85f-f702-f4fd-038e9747ab1c")
public static final String FIELDNAME_Withholding_PaymentTerm="8cf53919-c85f-f702-f4fd-038e9747ab1c";

@XendraTrl(Identifier="5d2591af-32f0-921b-7ac6-bfc634f682db")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d2591af-32f0-921b-7ac6-bfc634f682db",
Synchronized="2019-08-30 22:22:22.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
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

@XendraTrl(Identifier="261c785d-36ba-84f8-112c-21e7bc2a107e")
public static String es_PE_FIELD_Withholding_Withholding_Name="Retención";

@XendraTrl(Identifier="261c785d-36ba-84f8-112c-21e7bc2a107e")
public static String es_PE_FIELD_Withholding_Withholding_Description="Tipo de retención definida";

@XendraTrl(Identifier="261c785d-36ba-84f8-112c-21e7bc2a107e")
public static String es_PE_FIELD_Withholding_Withholding_Help="La Retención indica el tipo de retención a ser calculada";

@XendraField(AD_Column_ID="C_Withholding_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="261c785d-36ba-84f8-112c-21e7bc2a107e")
public static final String FIELDNAME_Withholding_Withholding="261c785d-36ba-84f8-112c-21e7bc2a107e";
/** Column name C_Withholding_ID */
public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="b7f68732-4e43-1c35-3473-f053f301e358")
public static String es_PE_FIELD_Withholding_Description_Name="Observación";

@XendraTrl(Identifier="b7f68732-4e43-1c35-3473-f053f301e358")
public static String es_PE_FIELD_Withholding_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b7f68732-4e43-1c35-3473-f053f301e358")
public static String es_PE_FIELD_Withholding_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7f68732-4e43-1c35-3473-f053f301e358")
public static final String FIELDNAME_Withholding_Description="b7f68732-4e43-1c35-3473-f053f301e358";

@XendraTrl(Identifier="0e0c7846-38d4-dc66-49cd-46286f333937")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e0c7846-38d4-dc66-49cd-46286f333937",
Synchronized="2019-08-30 22:22:22.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Fix amount.
@param FixAmt Fix amounted amount to be levied or paid */
public void setFixAmt (BigDecimal FixAmt)
{
set_Value (COLUMNNAME_FixAmt, FixAmt);
}
/** Get Fix amount.
@return Fix amounted amount to be levied or paid */
public BigDecimal getFixAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FixAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="89404903-854e-eae2-68ef-2651a013da98")
public static String es_PE_FIELD_Withholding_FixAmount_Name="Total Fijo";

@XendraTrl(Identifier="89404903-854e-eae2-68ef-2651a013da98")
public static String es_PE_FIELD_Withholding_FixAmount_Description="Total fijo a ser recaudado ó pagado";

@XendraTrl(Identifier="89404903-854e-eae2-68ef-2651a013da98")
public static String es_PE_FIELD_Withholding_FixAmount_Help="El total fijado indica un total fijo a ser recaudado ó pagado";

@XendraField(AD_Column_ID="FixAmt",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPercentWithholding@='N'",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="89404903-854e-eae2-68ef-2651a013da98")
public static final String FIELDNAME_Withholding_FixAmount="89404903-854e-eae2-68ef-2651a013da98";

@XendraTrl(Identifier="fb75055a-cb86-5bd6-d99b-032eb061c9c9")
public static String es_PE_COLUMN_FixAmt_Name="Total Fijo";

@XendraColumn(AD_Element_ID="f59f3209-3808-d1bc-6ffb-49ea83b758aa",ColumnName="FixAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb75055a-cb86-5bd6-d99b-032eb061c9c9",
Synchronized="2019-08-30 22:22:22.0")
/** Column name FixAmt */
public static final String COLUMNNAME_FixAmt = "FixAmt";
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
@XendraTrl(Identifier="dae59d99-a9e9-420f-90d9-8f69b5ce2305")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dae59d99-a9e9-420f-90d9-8f69b5ce2305",
Synchronized="2019-08-30 22:22:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Paid to third party.
@param IsPaidTo3Party Amount paid to someone other than the Business Partner */
public void setIsPaidTo3Party (boolean IsPaidTo3Party)
{
set_Value (COLUMNNAME_IsPaidTo3Party, Boolean.valueOf(IsPaidTo3Party));
}
/** Get Paid to third party.
@return Amount paid to someone other than the Business Partner */
public boolean isPaidTo3Party() 
{
Object oo = get_Value(COLUMNNAME_IsPaidTo3Party);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="53b5a36a-1833-3314-8f15-88c36e015941")
public static String es_PE_FIELD_Withholding_PaidToThirdParty_Name="Pagado a Tercera Parte";

@XendraTrl(Identifier="53b5a36a-1833-3314-8f15-88c36e015941")
public static String es_PE_FIELD_Withholding_PaidToThirdParty_Description="Total pagado a alguien diferente del socio de negocio.";

@XendraTrl(Identifier="53b5a36a-1833-3314-8f15-88c36e015941")
public static String es_PE_FIELD_Withholding_PaidToThirdParty_Help="El cuadro de verificación pagado a terceros indica que los totales son pagados a alguien diferente del socio de negocio.";

@XendraField(AD_Column_ID="IsPaidTo3Party",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53b5a36a-1833-3314-8f15-88c36e015941")
public static final String FIELDNAME_Withholding_PaidToThirdParty="53b5a36a-1833-3314-8f15-88c36e015941";

@XendraTrl(Identifier="3244fe6b-959e-87f9-e6c5-5a35c657b689")
public static String es_PE_COLUMN_IsPaidTo3Party_Name="Pagado a Tercera Parte";

@XendraColumn(AD_Element_ID="670b1a22-c3e6-ac4e-450a-ac70a2dd0ceb",ColumnName="IsPaidTo3Party",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3244fe6b-959e-87f9-e6c5-5a35c657b689",
Synchronized="2019-08-30 22:22:22.0")
/** Column name IsPaidTo3Party */
public static final String COLUMNNAME_IsPaidTo3Party = "IsPaidTo3Party";
/** Set Percent withholding.
@param IsPercentWithholding Withholding amount is a percentage of the invoice amount */
public void setIsPercentWithholding (boolean IsPercentWithholding)
{
set_Value (COLUMNNAME_IsPercentWithholding, Boolean.valueOf(IsPercentWithholding));
}
/** Get Percent withholding.
@return Withholding amount is a percentage of the invoice amount */
public boolean isPercentWithholding() 
{
Object oo = get_Value(COLUMNNAME_IsPercentWithholding);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c97cb5ac-1b41-fbeb-664e-75effbac2843")
public static String es_PE_FIELD_Withholding_PercentWithholding_Name="Porcentaje Retenido";

@XendraTrl(Identifier="c97cb5ac-1b41-fbeb-664e-75effbac2843")
public static String es_PE_FIELD_Withholding_PercentWithholding_Description="El total retenido es un porcentaje de la factura.";

@XendraTrl(Identifier="c97cb5ac-1b41-fbeb-664e-75effbac2843")
public static String es_PE_FIELD_Withholding_PercentWithholding_Help="El cuadro de verificación porcentaje de retención indica si el total retenido es un porcentaje del total de la factura";

@XendraField(AD_Column_ID="IsPercentWithholding",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c97cb5ac-1b41-fbeb-664e-75effbac2843")
public static final String FIELDNAME_Withholding_PercentWithholding="c97cb5ac-1b41-fbeb-664e-75effbac2843";

@XendraTrl(Identifier="7a82d928-e978-5e84-a707-45f8ef14789b")
public static String es_PE_COLUMN_IsPercentWithholding_Name="Porcentaje Retenido";

@XendraColumn(AD_Element_ID="d5f91969-3342-e580-6ccc-cc991f126bf5",
ColumnName="IsPercentWithholding",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7a82d928-e978-5e84-a707-45f8ef14789b",Synchronized="2019-08-30 22:22:22.0")
/** Column name IsPercentWithholding */
public static final String COLUMNNAME_IsPercentWithholding = "IsPercentWithholding";
/** Set Prorate tax.
@param IsTaxProrated Tax is Prorated */
public void setIsTaxProrated (boolean IsTaxProrated)
{
set_Value (COLUMNNAME_IsTaxProrated, Boolean.valueOf(IsTaxProrated));
}
/** Get Prorate tax.
@return Tax is Prorated */
public boolean isTaxProrated() 
{
Object oo = get_Value(COLUMNNAME_IsTaxProrated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="11ec0b85-0e49-cdbe-18aa-0e3839b03103")
public static String es_PE_FIELD_Withholding_ProrateTax_Name="Prorratear Impuesto";

@XendraTrl(Identifier="11ec0b85-0e49-cdbe-18aa-0e3839b03103")
public static String es_PE_FIELD_Withholding_ProrateTax_Description="El impuesto es prorrateado";

@XendraTrl(Identifier="11ec0b85-0e49-cdbe-18aa-0e3839b03103")
public static String es_PE_FIELD_Withholding_ProrateTax_Help="El cuadro de verificación Impuesto Prorrateado indica si este impuesto es prorrateado";

@XendraField(AD_Column_ID="IsTaxProrated",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11ec0b85-0e49-cdbe-18aa-0e3839b03103")
public static final String FIELDNAME_Withholding_ProrateTax="11ec0b85-0e49-cdbe-18aa-0e3839b03103";

@XendraTrl(Identifier="e56c65fa-4700-da38-dcbc-c09bb5ab63f6")
public static String es_PE_COLUMN_IsTaxProrated_Name="Prorratear Impuesto";

@XendraColumn(AD_Element_ID="45ebe495-32cf-36b1-54ad-017c6640db38",ColumnName="IsTaxProrated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e56c65fa-4700-da38-dcbc-c09bb5ab63f6",
Synchronized="2019-08-30 22:22:22.0")
/** Column name IsTaxProrated */
public static final String COLUMNNAME_IsTaxProrated = "IsTaxProrated";
/** Set Tax withholding.
@param IsTaxWithholding This is a tax related withholding */
public void setIsTaxWithholding (boolean IsTaxWithholding)
{
set_Value (COLUMNNAME_IsTaxWithholding, Boolean.valueOf(IsTaxWithholding));
}
/** Get Tax withholding.
@return This is a tax related withholding */
public boolean isTaxWithholding() 
{
Object oo = get_Value(COLUMNNAME_IsTaxWithholding);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fc8ab857-eb66-4eec-5a8a-898d56b75f4d")
public static String es_PE_FIELD_Withholding_TaxWithholding_Name="Impuesto Retenido";

@XendraTrl(Identifier="fc8ab857-eb66-4eec-5a8a-898d56b75f4d")
public static String es_PE_FIELD_Withholding_TaxWithholding_Description="Esta es una retención relacionada de impuesto.";

@XendraTrl(Identifier="fc8ab857-eb66-4eec-5a8a-898d56b75f4d")
public static String es_PE_FIELD_Withholding_TaxWithholding_Help="El cuadro de verificación retención de Impuesto indica si esta retención está relacionada al impuesto.";

@XendraField(AD_Column_ID="IsTaxWithholding",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc8ab857-eb66-4eec-5a8a-898d56b75f4d")
public static final String FIELDNAME_Withholding_TaxWithholding="fc8ab857-eb66-4eec-5a8a-898d56b75f4d";

@XendraTrl(Identifier="8d5608e1-50c3-24a4-fa34-6f0e330c2182")
public static String es_PE_COLUMN_IsTaxWithholding_Name="Impuesto Retenido";

@XendraColumn(AD_Element_ID="f1f05486-7f92-b4ee-014c-568233063b00",ColumnName="IsTaxWithholding",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d5608e1-50c3-24a4-fa34-6f0e330c2182",
Synchronized="2019-08-30 22:22:22.0")
/** Column name IsTaxWithholding */
public static final String COLUMNNAME_IsTaxWithholding = "IsTaxWithholding";
/** Set Max Amount.
@param MaxAmt Maximum Amount in invoice currency */
public void setMaxAmt (BigDecimal MaxAmt)
{
set_Value (COLUMNNAME_MaxAmt, MaxAmt);
}
/** Get Max Amount.
@return Maximum Amount in invoice currency */
public BigDecimal getMaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="186714e0-7a7c-05d6-004e-aceccbedb7c9")
public static String es_PE_FIELD_Withholding_MaxAmount_Name="Total Máximo";

@XendraTrl(Identifier="186714e0-7a7c-05d6-004e-aceccbedb7c9")
public static String es_PE_FIELD_Withholding_MaxAmount_Description="Total máximo en la moneda de la factura";

@XendraTrl(Identifier="186714e0-7a7c-05d6-004e-aceccbedb7c9")
public static String es_PE_FIELD_Withholding_MaxAmount_Help="El total máximo indica el total máximo en la moneda de la factura";

@XendraField(AD_Column_ID="MaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="186714e0-7a7c-05d6-004e-aceccbedb7c9")
public static final String FIELDNAME_Withholding_MaxAmount="186714e0-7a7c-05d6-004e-aceccbedb7c9";

@XendraTrl(Identifier="d44b6857-36cb-9abb-23b6-8441a75bd5b8")
public static String es_PE_COLUMN_MaxAmt_Name="Total Máximo";

@XendraColumn(AD_Element_ID="6861e638-d30f-2ea2-4acb-518f1422ea14",ColumnName="MaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d44b6857-36cb-9abb-23b6-8441a75bd5b8",
Synchronized="2019-08-30 22:22:22.0")
/** Column name MaxAmt */
public static final String COLUMNNAME_MaxAmt = "MaxAmt";
/** Set Min Amount.
@param MinAmt Minimum Amount in invoice currency */
public void setMinAmt (BigDecimal MinAmt)
{
set_Value (COLUMNNAME_MinAmt, MinAmt);
}
/** Get Min Amount.
@return Minimum Amount in invoice currency */
public BigDecimal getMinAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MinAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="099e5172-ffa5-36f3-4809-de9474ab616e")
public static String es_PE_FIELD_Withholding_MinAmount_Name="Total Mínimo";

@XendraTrl(Identifier="099e5172-ffa5-36f3-4809-de9474ab616e")
public static String es_PE_FIELD_Withholding_MinAmount_Description="Total mínimo en en la moneda de la factura";

@XendraTrl(Identifier="099e5172-ffa5-36f3-4809-de9474ab616e")
public static String es_PE_FIELD_Withholding_MinAmount_Help="El total mínimo indica el total mínimo tal como se estableció en la moneda de la factura";

@XendraField(AD_Column_ID="MinAmt",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="099e5172-ffa5-36f3-4809-de9474ab616e")
public static final String FIELDNAME_Withholding_MinAmount="099e5172-ffa5-36f3-4809-de9474ab616e";

@XendraTrl(Identifier="f5d7dcbb-34b4-fc26-4340-1c0b50fb966c")
public static String es_PE_COLUMN_MinAmt_Name="Total Mínimo";

@XendraColumn(AD_Element_ID="8e50f59c-c4b9-5a48-5229-960030bc4a73",ColumnName="MinAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5d7dcbb-34b4-fc26-4340-1c0b50fb966c",
Synchronized="2019-08-30 22:22:22.0")
/** Column name MinAmt */
public static final String COLUMNNAME_MinAmt = "MinAmt";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="24c35514-643d-89fa-2003-09a98978c479")
public static String es_PE_FIELD_Withholding_Name_Name="Nombre";

@XendraTrl(Identifier="24c35514-643d-89fa-2003-09a98978c479")
public static String es_PE_FIELD_Withholding_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="24c35514-643d-89fa-2003-09a98978c479")
public static String es_PE_FIELD_Withholding_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24c35514-643d-89fa-2003-09a98978c479")
public static final String FIELDNAME_Withholding_Name="24c35514-643d-89fa-2003-09a98978c479";

@XendraTrl(Identifier="ebba5bf8-663a-d1b2-1d9e-6c7b73fcb454")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ebba5bf8-663a-d1b2-1d9e-6c7b73fcb454",
Synchronized="2019-08-30 22:22:22.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Percent.
@param Percent Percentage */
public void setPercent (BigDecimal Percent)
{
set_Value (COLUMNNAME_Percent, Percent);
}
/** Get Percent.
@return Percentage */
public BigDecimal getPercent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="34863f7b-aadb-c832-733c-8e3f8d675e35")
public static String es_PE_FIELD_Withholding_Percent_Name="Porcentaje";

@XendraTrl(Identifier="34863f7b-aadb-c832-733c-8e3f8d675e35")
public static String es_PE_FIELD_Withholding_Percent_Description="Porcentaje de retención";

@XendraTrl(Identifier="34863f7b-aadb-c832-733c-8e3f8d675e35")
public static String es_PE_FIELD_Withholding_Percent_Help="El porcentaje indica el porcentaje usado para retención.";

@XendraField(AD_Column_ID="Percent",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPercentWithholding@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="34863f7b-aadb-c832-733c-8e3f8d675e35")
public static final String FIELDNAME_Withholding_Percent="34863f7b-aadb-c832-733c-8e3f8d675e35";

@XendraTrl(Identifier="66c0ea28-1388-776a-30c2-601956e9adec")
public static String es_PE_COLUMN_Percent_Name="Porcentaje";

@XendraColumn(AD_Element_ID="a70b0c31-700a-d879-f313-b31531c93f04",ColumnName="Percent",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66c0ea28-1388-776a-30c2-601956e9adec",
Synchronized="2019-08-30 22:22:22.0")
/** Column name Percent */
public static final String COLUMNNAME_Percent = "Percent";
/** Set Threshold max.
@param ThresholdMax Maximum gross amount for withholding calculation  (0=no limit) */
public void setThresholdMax (BigDecimal ThresholdMax)
{
set_Value (COLUMNNAME_ThresholdMax, ThresholdMax);
}
/** Get Threshold max.
@return Maximum gross amount for withholding calculation  (0=no limit) */
public BigDecimal getThresholdMax() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ThresholdMax);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="adc04a24-9c7c-394f-193f-6d077d31c742")
public static String es_PE_FIELD_Withholding_ThresholdMax_Name="Límite Máximo";

@XendraTrl(Identifier="adc04a24-9c7c-394f-193f-6d077d31c742")
public static String es_PE_FIELD_Withholding_ThresholdMax_Description="Total bruto máximo para el calculo de retención (0=Sin límite)";

@XendraTrl(Identifier="adc04a24-9c7c-394f-193f-6d077d31c742")
public static String es_PE_FIELD_Withholding_ThresholdMax_Help="El máximo umbral indica el máximo total bruto a ser usado en el cálculo de retención. Un valor de 0 indica que no hay límite.";

@XendraField(AD_Column_ID="ThresholdMax",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adc04a24-9c7c-394f-193f-6d077d31c742")
public static final String FIELDNAME_Withholding_ThresholdMax="adc04a24-9c7c-394f-193f-6d077d31c742";

@XendraTrl(Identifier="dcf9d983-4837-331f-613a-669ccd3810ce")
public static String es_PE_COLUMN_ThresholdMax_Name="Límite Máximo";

@XendraColumn(AD_Element_ID="f57d109e-e539-ddf9-acec-28b55901495c",ColumnName="ThresholdMax",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcf9d983-4837-331f-613a-669ccd3810ce",
Synchronized="2019-08-30 22:22:22.0")
/** Column name ThresholdMax */
public static final String COLUMNNAME_ThresholdMax = "ThresholdMax";
/** Set Threshold min.
@param Thresholdmin Minimum gross amount for withholding calculation */
public void setThresholdmin (BigDecimal Thresholdmin)
{
set_Value (COLUMNNAME_Thresholdmin, Thresholdmin);
}
/** Get Threshold min.
@return Minimum gross amount for withholding calculation */
public BigDecimal getThresholdmin() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Thresholdmin);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="50699673-feaa-9c76-9cc9-098a5ec69e32")
public static String es_PE_FIELD_Withholding_ThresholdMin_Name="Límite Mínimo";

@XendraTrl(Identifier="50699673-feaa-9c76-9cc9-098a5ec69e32")
public static String es_PE_FIELD_Withholding_ThresholdMin_Description="Total bruto mínimo para el calculo de retención";

@XendraTrl(Identifier="50699673-feaa-9c76-9cc9-098a5ec69e32")
public static String es_PE_FIELD_Withholding_ThresholdMin_Help="El mínimo umbral indica el mínimo total bruto a ser usado en el cálculo de retención.";

@XendraField(AD_Column_ID="Thresholdmin",IsCentrallyMaintained=true,
AD_Tab_ID="8d10e819-350d-ac2c-2b51-3aa3e7584d46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50699673-feaa-9c76-9cc9-098a5ec69e32")
public static final String FIELDNAME_Withholding_ThresholdMin="50699673-feaa-9c76-9cc9-098a5ec69e32";

@XendraTrl(Identifier="274e77b7-4674-f1e3-d1af-4c3017e497ce")
public static String es_PE_COLUMN_Thresholdmin_Name="Límite Mínimo";

@XendraColumn(AD_Element_ID="428e47dc-5f72-bd7e-62c2-1861e1e3525b",ColumnName="Thresholdmin",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="274e77b7-4674-f1e3-d1af-4c3017e497ce",
Synchronized="2019-08-30 22:22:22.0")
/** Column name Thresholdmin */
public static final String COLUMNNAME_Thresholdmin = "Thresholdmin";
/** Set WithholdingType.
@param WithholdingType WithholdingType */
public void setWithholdingType (String WithholdingType)
{
if (WithholdingType != null && WithholdingType.length() > 1)
{
log.warning("Length > 1 - truncated");
WithholdingType = WithholdingType.substring(0,0);
}
set_Value (COLUMNNAME_WithholdingType, WithholdingType);
}
/** Get WithholdingType.
@return WithholdingType */
public String getWithholdingType() 
{
return (String)get_Value(COLUMNNAME_WithholdingType);
}

@XendraTrl(Identifier="d2ebedaf-2018-4c5c-9190-513e5cca6ccd")
public static String es_PE_COLUMN_WithholdingType_Name="withholdingtype";

@XendraColumn(AD_Element_ID="7d4f1c66-fc7b-4c9e-ac9e-5fd1796bf7f9",ColumnName="WithholdingType",
AD_Reference_ID=17,AD_Reference_Value_ID="843810e4-0376-4299-bd8c-1fc15022d579",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d2ebedaf-2018-4c5c-9190-513e5cca6ccd",Synchronized="2019-08-30 22:22:22.0")
/** Column name WithholdingType */
public static final String COLUMNNAME_WithholdingType = "WithholdingType";
}
