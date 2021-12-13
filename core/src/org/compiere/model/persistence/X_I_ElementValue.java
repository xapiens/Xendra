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
/** Generated Model for I_ElementValue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_ElementValue extends PO
{
/** Standard Constructor
@param ctx context
@param I_ElementValue_ID id
@param trxName transaction
*/
public X_I_ElementValue (Properties ctx, int I_ElementValue_ID, String trxName)
{
super (ctx, I_ElementValue_ID, trxName);
/** if (I_ElementValue_ID == 0)
{
setAccountSign (null);
setAccountType (null);
setDefault_Account (null);
setI_ElementValue_ID (0);
setI_IsImported (false);	
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
public X_I_ElementValue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=534 */
public static int Table_ID=MTable.getTable_ID("I_ElementValue");

@XendraTrl(Identifier="7c18245b-aa7e-63a7-1dbd-cff39122cf9d")
public static String es_PE_TAB_ImportAccount_Description="Importar Cuentas Contables";

@XendraTrl(Identifier="7c18245b-aa7e-63a7-1dbd-cff39122cf9d")
public static String es_PE_TAB_ImportAccount_Name="Importar Cuenta Contable";

@XendraTab(Name="Import Account",Description="",Help="",
AD_Window_ID="80d77488-feaf-3b65-1a19-408d3329cd3c",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportAccount="7c18245b-aa7e-63a7-1dbd-cff39122cf9d";

@XendraTrl(Identifier="096c860d-e95f-5e0a-d611-af21e4fa9058")
public static String es_PE_TABLE_I_ElementValue_Name="Importar Cuenta";

@XendraTable(Name="Import Account",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Import Account Value",Help="",
TableName="I_ElementValue",AccessLevel="6",AD_Window_ID="80d77488-feaf-3b65-1a19-408d3329cd3c",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="096c860d-e95f-5e0a-d611-af21e4fa9058",Synchronized="2020-03-03 21:38:07.0")
/** TableName=I_ElementValue */
public static final String Table_Name="I_ElementValue";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_ElementValue");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("I_ElementValue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_ElementValue[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Sign.
@param AccountSign Indicates the Natural Sign of the Account as a Debit or Credit */
public void setAccountSign (String AccountSign)
{
if (AccountSign.length() > 1)
{
log.warning("Length > 1 - truncated");
AccountSign = AccountSign.substring(0,0);
}
set_Value (COLUMNNAME_AccountSign, AccountSign);
}
/** Get Account Sign.
@return Indicates the Natural Sign of the Account as a Debit or Credit */
public String getAccountSign() 
{
return (String)get_Value(COLUMNNAME_AccountSign);
}

@XendraTrl(Identifier="e4e0f2df-9ac3-1c6a-bffd-ec2f9c79843e")
public static String es_PE_FIELD_ImportAccount_AccountSign_Name="Naturaleza de Cuenta";

@XendraTrl(Identifier="e4e0f2df-9ac3-1c6a-bffd-ec2f9c79843e")
public static String es_PE_FIELD_ImportAccount_AccountSign_Description="Indica el signo natural de la cuenta ya sea débito ó crédito";

@XendraTrl(Identifier="e4e0f2df-9ac3-1c6a-bffd-ec2f9c79843e")
public static String es_PE_FIELD_ImportAccount_AccountSign_Help="Indica si el saldo esperado para esta cuenta debería ser deudor ó acreedor";

@XendraField(AD_Column_ID="AccountSign",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4e0f2df-9ac3-1c6a-bffd-ec2f9c79843e")
public static final String FIELDNAME_ImportAccount_AccountSign="e4e0f2df-9ac3-1c6a-bffd-ec2f9c79843e";

@XendraTrl(Identifier="0ac5de65-66a9-af1f-c40b-f13852f6dbb2")
public static String es_PE_COLUMN_AccountSign_Name="Naturaleza de Cuenta";

@XendraColumn(AD_Element_ID="bec935a6-86d9-7793-51fb-4ce378612a32",ColumnName="AccountSign",
AD_Reference_ID=17,AD_Reference_Value_ID="f63281b9-9b5a-42c0-e4ec-3240ca6a08f1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0ac5de65-66a9-af1f-c40b-f13852f6dbb2",Synchronized="2019-08-30 22:22:47.0")
/** Column name AccountSign */
public static final String COLUMNNAME_AccountSign = "AccountSign";
/** Set Account Type.
@param AccountType Indicates the type of account */
public void setAccountType (String AccountType)
{
if (AccountType.length() > 1)
{
log.warning("Length > 1 - truncated");
AccountType = AccountType.substring(0,0);
}
set_Value (COLUMNNAME_AccountType, AccountType);
}
/** Get Account Type.
@return Indicates the type of account */
public String getAccountType() 
{
return (String)get_Value(COLUMNNAME_AccountType);
}

@XendraTrl(Identifier="3e394246-a87e-c96a-18f5-3c01a82a1740")
public static String es_PE_FIELD_ImportAccount_AccountType_Name="Tipo de Cuenta";

@XendraTrl(Identifier="3e394246-a87e-c96a-18f5-3c01a82a1740")
public static String es_PE_FIELD_ImportAccount_AccountType_Description="Indica el tipo de cuenta";

@XendraTrl(Identifier="3e394246-a87e-c96a-18f5-3c01a82a1740")
public static String es_PE_FIELD_ImportAccount_AccountType_Help="Tipos de cuenta válidos son A - Activo; E - Gastos; L - Pasivo; O - Propietario";

@XendraField(AD_Column_ID="AccountType",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e394246-a87e-c96a-18f5-3c01a82a1740")
public static final String FIELDNAME_ImportAccount_AccountType="3e394246-a87e-c96a-18f5-3c01a82a1740";

@XendraTrl(Identifier="8c070429-ba5c-af59-9283-1722a5381ebb")
public static String es_PE_COLUMN_AccountType_Name="Tipo de Cuenta";

@XendraColumn(AD_Element_ID="ec156e95-2067-29e9-eb38-6c9e67f8a90d",ColumnName="AccountType",
AD_Reference_ID=17,AD_Reference_Value_ID="c9364c64-6481-06c6-6a91-931ae4cfdb71",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c070429-ba5c-af59-9283-1722a5381ebb",Synchronized="2019-08-30 22:22:47.0")
/** Column name AccountType */
public static final String COLUMNNAME_AccountType = "AccountType";
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID <= 0) set_Value (COLUMNNAME_AD_Column_ID, null);
 else 
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff82acd6-1cfa-8439-0076-d6fa45420073")
public static String es_PE_FIELD_ImportAccount_Column_Name="Columna";

@XendraTrl(Identifier="ff82acd6-1cfa-8439-0076-d6fa45420073")
public static String es_PE_FIELD_ImportAccount_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="ff82acd6-1cfa-8439-0076-d6fa45420073")
public static String es_PE_FIELD_ImportAccount_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff82acd6-1cfa-8439-0076-d6fa45420073")
public static final String FIELDNAME_ImportAccount_Column="ff82acd6-1cfa-8439-0076-d6fa45420073";

@XendraTrl(Identifier="9cabad96-48bf-e524-ce0e-17fedbec440a")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="9fc61864-d30f-70d0-3c22-45f1426e8068",
AD_Val_Rule_ID="3d0ad5c8-6268-7179-e0db-72dfa20ab6a3",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cabad96-48bf-e524-ce0e-17fedbec440a",
Synchronized="2019-08-30 22:22:47.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Element.
@param C_Element_ID Accounting Element */
public void setC_Element_ID (int C_Element_ID)
{
if (C_Element_ID <= 0) set_Value (COLUMNNAME_C_Element_ID, null);
 else 
set_Value (COLUMNNAME_C_Element_ID, Integer.valueOf(C_Element_ID));
}
/** Get Element.
@return Accounting Element */
public int getC_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f4705842-103e-f2a3-087e-5cc49358aaf2")
public static String es_PE_FIELD_ImportAccount_Element_Name="Elemento";

@XendraTrl(Identifier="f4705842-103e-f2a3-087e-5cc49358aaf2")
public static String es_PE_FIELD_ImportAccount_Element_Description="Elemento de Cuenta";

@XendraTrl(Identifier="f4705842-103e-f2a3-087e-5cc49358aaf2")
public static String es_PE_FIELD_ImportAccount_Element_Help="El elemento cuenta identifica únicamente una cuenta. El conjunto es conocido comúnmente como catálogo de cuentas";

@XendraField(AD_Column_ID="C_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4705842-103e-f2a3-087e-5cc49358aaf2")
public static final String FIELDNAME_ImportAccount_Element="f4705842-103e-f2a3-087e-5cc49358aaf2";

@XendraTrl(Identifier="b3675271-79ae-34b2-d18a-38631edfe98b")
public static String es_PE_COLUMN_C_Element_ID_Name="Elemento";

@XendraColumn(AD_Element_ID="39b73755-e186-38a7-a23f-0283cb7c1155",ColumnName="C_Element_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3675271-79ae-34b2-d18a-38631edfe98b",
Synchronized="2019-08-30 22:22:47.0")
/** Column name C_Element_ID */
public static final String COLUMNNAME_C_Element_ID = "C_Element_ID";
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID <= 0) set_Value (COLUMNNAME_C_ElementValue_ID, null);
 else 
set_Value (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f585695b-994e-fc33-2df2-cfe38a7dfa7d")
public static String es_PE_FIELD_ImportAccount_AccountElement_Name="Valor del Elemento";

@XendraTrl(Identifier="f585695b-994e-fc33-2df2-cfe38a7dfa7d")
public static String es_PE_FIELD_ImportAccount_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="f585695b-994e-fc33-2df2-cfe38a7dfa7d")
public static String es_PE_FIELD_ImportAccount_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f585695b-994e-fc33-2df2-cfe38a7dfa7d")
public static final String FIELDNAME_ImportAccount_AccountElement="f585695b-994e-fc33-2df2-cfe38a7dfa7d";

@XendraTrl(Identifier="c226d70a-df95-e1d9-4534-07905da98e6a")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c226d70a-df95-e1d9-4534-07905da98e6a",
Synchronized="2019-08-30 22:22:47.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Default Account.
@param Default_Account Name of the Default Account Column */
public void setDefault_Account (String Default_Account)
{
if (Default_Account == null) throw new IllegalArgumentException ("Default_Account is mandatory.");
if (Default_Account.length() > 30)
{
log.warning("Length > 30 - truncated");
Default_Account = Default_Account.substring(0,29);
}
set_Value (COLUMNNAME_Default_Account, Default_Account);
}
/** Get Default Account.
@return Name of the Default Account Column */
public String getDefault_Account() 
{
String value = (String)get_Value(COLUMNNAME_Default_Account);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fa5525ed-acb5-e449-542f-2056613ef7d1")
public static String es_PE_FIELD_ImportAccount_DefaultAccount_Name="Cuenta por Defecto";

@XendraTrl(Identifier="fa5525ed-acb5-e449-542f-2056613ef7d1")
public static String es_PE_FIELD_ImportAccount_DefaultAccount_Description="Nombre de la cuenta por defecto";

@XendraField(AD_Column_ID="Default_Account",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa5525ed-acb5-e449-542f-2056613ef7d1")
public static final String FIELDNAME_ImportAccount_DefaultAccount="fa5525ed-acb5-e449-542f-2056613ef7d1";

@XendraTrl(Identifier="1f9ff7f9-e47d-b50d-5e71-94a91a7b562f")
public static String es_PE_COLUMN_Default_Account_Name="Cuenta por Defecto";

@XendraColumn(AD_Element_ID="136d031c-2a77-8783-1ef3-0e1f547ca24e",ColumnName="Default_Account",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f9ff7f9-e47d-b50d-5e71-94a91a7b562f",
Synchronized="2019-08-30 22:22:47.0")
/** Column name Default_Account */
public static final String COLUMNNAME_Default_Account = "Default_Account";
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

@XendraTrl(Identifier="304cd63b-84df-0039-070b-978df8861fac")
public static String es_PE_FIELD_ImportAccount_Description_Name="Observación";

@XendraTrl(Identifier="304cd63b-84df-0039-070b-978df8861fac")
public static String es_PE_FIELD_ImportAccount_Description_Description="Observación";

@XendraTrl(Identifier="304cd63b-84df-0039-070b-978df8861fac")
public static String es_PE_FIELD_ImportAccount_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="304cd63b-84df-0039-070b-978df8861fac")
public static final String FIELDNAME_ImportAccount_Description="304cd63b-84df-0039-070b-978df8861fac";

@XendraTrl(Identifier="9d582b16-1459-ce07-3274-d2edb24647cd")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d582b16-1459-ce07-3274-d2edb24647cd",
Synchronized="2019-08-30 22:22:47.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EGPF_C_Subject_value.
@param EGPF_C_Subject_value EGPF_C_Subject_value */
public void setEGPF_C_Subject_value (String EGPF_C_Subject_value)
{
if (EGPF_C_Subject_value != null && EGPF_C_Subject_value.length() > 60)
{
log.warning("Length > 60 - truncated");
EGPF_C_Subject_value = EGPF_C_Subject_value.substring(0,59);
}
set_Value (COLUMNNAME_EGPF_C_Subject_value, EGPF_C_Subject_value);
}
/** Get EGPF_C_Subject_value.
@return EGPF_C_Subject_value */
public String getEGPF_C_Subject_value() 
{
String value = (String)get_Value(COLUMNNAME_EGPF_C_Subject_value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d5175b80-63f9-498a-babc-19e22a82e620")
public static String es_PE_COLUMN_EGPF_C_Subject_value_Name="egpf_c_subject_value";

@XendraColumn(AD_Element_ID="d98d7006-e533-4e54-be8c-f260292e8fd6",
ColumnName="EGPF_C_Subject_value",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=60,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d5175b80-63f9-498a-babc-19e22a82e620",Synchronized="2019-08-30 22:22:47.0")
/** Column name EGPF_C_Subject_value */
public static final String COLUMNNAME_EGPF_C_Subject_value = "EGPF_C_Subject_value";
/** Set EGPN_C_Subject_value.
@param EGPN_C_Subject_value EGPN_C_Subject_value */
public void setEGPN_C_Subject_value (String EGPN_C_Subject_value)
{
set_Value (COLUMNNAME_EGPN_C_Subject_value, EGPN_C_Subject_value);
}
/** Get EGPN_C_Subject_value.
@return EGPN_C_Subject_value */
public String getEGPN_C_Subject_value() 
{
String value = (String)get_Value(COLUMNNAME_EGPN_C_Subject_value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e33bc0a7-3739-4129-a62a-59be4ea05691")
public static String es_PE_COLUMN_EGPN_C_Subject_value_Name="egpn_c_subject_value";

@XendraColumn(AD_Element_ID="4f7879be-e553-4c00-bb81-c4cd6f61ed36",
ColumnName="EGPN_C_Subject_value",AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=600,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e33bc0a7-3739-4129-a62a-59be4ea05691",Synchronized="2019-08-30 22:22:47.0")
/** Column name EGPN_C_Subject_value */
public static final String COLUMNNAME_EGPN_C_Subject_value = "EGPN_C_Subject_value";
/** Set Element Name.
@param ElementName Name of the Element */
public void setElementName (String ElementName)
{
if (ElementName != null && ElementName.length() > 60)
{
log.warning("Length > 60 - truncated");
ElementName = ElementName.substring(0,59);
}
set_Value (COLUMNNAME_ElementName, ElementName);
}
/** Get Element Name.
@return Name of the Element */
public String getElementName() 
{
String value = (String)get_Value(COLUMNNAME_ElementName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e0ab0927-2930-fd25-5fb7-1db13026f1d0")
public static String es_PE_FIELD_ImportAccount_ElementName_Name="Nombre de Elemento";

@XendraTrl(Identifier="e0ab0927-2930-fd25-5fb7-1db13026f1d0")
public static String es_PE_FIELD_ImportAccount_ElementName_Description="Nombre del elemento";

@XendraField(AD_Column_ID="ElementName",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0ab0927-2930-fd25-5fb7-1db13026f1d0")
public static final String FIELDNAME_ImportAccount_ElementName="e0ab0927-2930-fd25-5fb7-1db13026f1d0";

@XendraTrl(Identifier="9f5f4c0d-2a21-2efd-d21c-3c80d2048e24")
public static String es_PE_COLUMN_ElementName_Name="Nombre de Elemento";

@XendraColumn(AD_Element_ID="bca1092d-623c-5d03-b7df-0154e9b8368f",ColumnName="ElementName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f5f4c0d-2a21-2efd-d21c-3c80d2048e24",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ElementName */
public static final String COLUMNNAME_ElementName = "ElementName";
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
@XendraTrl(Identifier="8585b133-8ce2-4665-9f3b-c99132493817")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8585b133-8ce2-4665-9f3b-c99132493817",
Synchronized="2019-08-30 22:22:47.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Account.
@param I_ElementValue_ID Import Account Value */
public void setI_ElementValue_ID (int I_ElementValue_ID)
{
if (I_ElementValue_ID < 1) throw new IllegalArgumentException ("I_ElementValue_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_ElementValue_ID, Integer.valueOf(I_ElementValue_ID));
}
/** Get Import Account.
@return Import Account Value */
public int getI_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="16b406dd-8f1a-9603-d9f3-63ced42adcc8")
public static String es_PE_FIELD_ImportAccount_ImportAccount_Name="Importar Cuenta";

@XendraTrl(Identifier="16b406dd-8f1a-9603-d9f3-63ced42adcc8")
public static String es_PE_FIELD_ImportAccount_ImportAccount_Description="Importar valor de cuenta";

@XendraField(AD_Column_ID="I_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=10,IsReadOnly=true,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16b406dd-8f1a-9603-d9f3-63ced42adcc8")
public static final String FIELDNAME_ImportAccount_ImportAccount="16b406dd-8f1a-9603-d9f3-63ced42adcc8";
/** Column name I_ElementValue_ID */
public static final String COLUMNNAME_I_ElementValue_ID = "I_ElementValue_ID";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
if (I_ErrorMsg != null && I_ErrorMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
I_ErrorMsg = I_ErrorMsg.substring(0,1999);
}
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1ff1b8c4-7f6e-385e-0c28-62573b8b594a")
public static String es_PE_FIELD_ImportAccount_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="1ff1b8c4-7f6e-385e-0c28-62573b8b594a")
public static String es_PE_FIELD_ImportAccount_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="1ff1b8c4-7f6e-385e-0c28-62573b8b594a")
public static String es_PE_FIELD_ImportAccount_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ff1b8c4-7f6e-385e-0c28-62573b8b594a")
public static final String FIELDNAME_ImportAccount_ImportErrorMessage="1ff1b8c4-7f6e-385e-0c28-62573b8b594a";

@XendraTrl(Identifier="6f26e92e-0910-cc49-5f5a-ced8eeea75b7")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f26e92e-0910-cc49-5f5a-ced8eeea75b7",
Synchronized="2019-08-30 22:22:47.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="749790d7-ff6c-6d0b-8f19-9d86630e4973")
public static String es_PE_FIELD_ImportAccount_Imported_Name="Importar";

@XendraTrl(Identifier="749790d7-ff6c-6d0b-8f19-9d86630e4973")
public static String es_PE_FIELD_ImportAccount_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="749790d7-ff6c-6d0b-8f19-9d86630e4973")
public static String es_PE_FIELD_ImportAccount_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="749790d7-ff6c-6d0b-8f19-9d86630e4973")
public static final String FIELDNAME_ImportAccount_Imported="749790d7-ff6c-6d0b-8f19-9d86630e4973";

@XendraTrl(Identifier="76f10393-30d4-f172-5786-4fcce8bfb62f")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76f10393-30d4-f172-5786-4fcce8bfb62f",
Synchronized="2019-08-30 22:22:47.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Document Controlled.
@param IsDocControlled Control account - If an account is controlled by a document, you cannot post manually to it */
public void setIsDocControlled (boolean IsDocControlled)
{
set_Value (COLUMNNAME_IsDocControlled, Boolean.valueOf(IsDocControlled));
}
/** Get Document Controlled.
@return Control account - If an account is controlled by a document, you cannot post manually to it */
public boolean isDocControlled() 
{
Object oo = get_Value(COLUMNNAME_IsDocControlled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="513c2b0a-3241-d1d3-f16a-832b302886ef")
public static String es_PE_FIELD_ImportAccount_DocumentControlled_Name="Cuenta Controlada";

@XendraTrl(Identifier="513c2b0a-3241-d1d3-f16a-832b302886ef")
public static String es_PE_FIELD_ImportAccount_DocumentControlled_Description="Control de cuenta - Si una cuenta es controlada por un documento";

@XendraField(AD_Column_ID="IsDocControlled",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="513c2b0a-3241-d1d3-f16a-832b302886ef")
public static final String FIELDNAME_ImportAccount_DocumentControlled="513c2b0a-3241-d1d3-f16a-832b302886ef";

@XendraTrl(Identifier="f8bf3af0-4277-85ab-3ffb-53718896b4e0")
public static String es_PE_COLUMN_IsDocControlled_Name="Cuenta Controlada";

@XendraColumn(AD_Element_ID="06ca55f5-5c24-e757-3a01-bb392d837253",ColumnName="IsDocControlled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8bf3af0-4277-85ab-3ffb-53718896b4e0",
Synchronized="2019-08-30 22:22:47.0")
/** Column name IsDocControlled */
public static final String COLUMNNAME_IsDocControlled = "IsDocControlled";
/** Set isDocTypeAccount.
@param isDocTypeAccount isDocTypeAccount */
public void setisDocTypeAccount (boolean isDocTypeAccount)
{
set_Value (COLUMNNAME_isDocTypeAccount, Boolean.valueOf(isDocTypeAccount));
}
/** Get isDocTypeAccount.
@return isDocTypeAccount */
public boolean isDocTypeAccount() 
{
Object oo = get_Value(COLUMNNAME_isDocTypeAccount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f5c9fc23-a35a-444f-b0cd-658d6c843001")
public static String es_PE_COLUMN_isDocTypeAccount_Name="isDocTypeAccount";

@XendraColumn(AD_Element_ID="c5270666-d78d-6c13-04bd-4ce86c588f0e",ColumnName="isDocTypeAccount",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5c9fc23-a35a-444f-b0cd-658d6c843001",
Synchronized="2019-08-30 22:22:47.0")
/** Column name isDocTypeAccount */
public static final String COLUMNNAME_isDocTypeAccount = "isDocTypeAccount";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2606b369-01bf-3637-6060-6947794dadb0")
public static String es_PE_FIELD_ImportAccount_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="2606b369-01bf-3637-6060-6947794dadb0")
public static String es_PE_FIELD_ImportAccount_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="2606b369-01bf-3637-6060-6947794dadb0")
public static String es_PE_FIELD_ImportAccount_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2606b369-01bf-3637-6060-6947794dadb0")
public static final String FIELDNAME_ImportAccount_SummaryLevel="2606b369-01bf-3637-6060-6947794dadb0";

@XendraTrl(Identifier="ca972e5f-9184-bf64-0db0-f117b3bb813a")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca972e5f-9184-bf64-0db0-f117b3bb813a",
Synchronized="2019-08-30 22:22:47.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
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
@XendraTrl(Identifier="216c4a6a-af14-0f29-9582-9719670c18e3")
public static String es_PE_FIELD_ImportAccount_Name_Name="Nombre";

@XendraTrl(Identifier="216c4a6a-af14-0f29-9582-9719670c18e3")
public static String es_PE_FIELD_ImportAccount_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="216c4a6a-af14-0f29-9582-9719670c18e3")
public static String es_PE_FIELD_ImportAccount_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="216c4a6a-af14-0f29-9582-9719670c18e3")
public static final String FIELDNAME_ImportAccount_Name="216c4a6a-af14-0f29-9582-9719670c18e3";

@XendraTrl(Identifier="ca3d8c13-b01f-28da-f88e-943ff46f6033")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca3d8c13-b01f-28da-f88e-943ff46f6033",
Synchronized="2019-08-30 22:22:47.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Parent Account.
@param ParentElementValue_ID The parent (summary) account */
public void setParentElementValue_ID (int ParentElementValue_ID)
{
if (ParentElementValue_ID <= 0) set_Value (COLUMNNAME_ParentElementValue_ID, null);
 else 
set_Value (COLUMNNAME_ParentElementValue_ID, Integer.valueOf(ParentElementValue_ID));
}
/** Get Parent Account.
@return The parent (summary) account */
public int getParentElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ParentElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9dc3c79f-0e01-ec51-ceec-6e7ee14b3c66")
public static String es_PE_FIELD_ImportAccount_ParentAccount_Name="Cuenta Padre";

@XendraTrl(Identifier="9dc3c79f-0e01-ec51-ceec-6e7ee14b3c66")
public static String es_PE_FIELD_ImportAccount_ParentAccount_Description="La cuenta padre (resumen)";

@XendraField(AD_Column_ID="ParentElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dc3c79f-0e01-ec51-ceec-6e7ee14b3c66")
public static final String FIELDNAME_ImportAccount_ParentAccount="9dc3c79f-0e01-ec51-ceec-6e7ee14b3c66";

@XendraTrl(Identifier="2bbb0ac3-1add-ddfd-f36e-d20e6df8e151")
public static String es_PE_COLUMN_ParentElementValue_ID_Name="Cuenta Padre";

@XendraColumn(AD_Element_ID="55da3589-e402-5494-5740-8a0f86b5162a",
ColumnName="ParentElementValue_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="2c49a6bb-f3ab-0f31-6447-eadfef443fd5",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="2bbb0ac3-1add-ddfd-f36e-d20e6df8e151",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ParentElementValue_ID */
public static final String COLUMNNAME_ParentElementValue_ID = "ParentElementValue_ID";
/** Set Parent Key.
@param ParentValue Key if the Parent */
public void setParentValue (String ParentValue)
{
if (ParentValue != null && ParentValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ParentValue = ParentValue.substring(0,39);
}
set_Value (COLUMNNAME_ParentValue, ParentValue);
}
/** Get Parent Key.
@return Key if the Parent */
public String getParentValue() 
{
String value = (String)get_Value(COLUMNNAME_ParentValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9d76a3d2-94ba-2060-7aef-e772a89d3286")
public static String es_PE_FIELD_ImportAccount_ParentKey_Name="Clave Padre";

@XendraTrl(Identifier="9d76a3d2-94ba-2060-7aef-e772a89d3286")
public static String es_PE_FIELD_ImportAccount_ParentKey_Description="Clave Padre";

@XendraField(AD_Column_ID="ParentValue",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d76a3d2-94ba-2060-7aef-e772a89d3286")
public static final String FIELDNAME_ImportAccount_ParentKey="9d76a3d2-94ba-2060-7aef-e772a89d3286";

@XendraTrl(Identifier="9b7a1494-beb4-2df8-c61c-ecd583536bdd")
public static String es_PE_COLUMN_ParentValue_Name="Clave Padre";

@XendraColumn(AD_Element_ID="b4c852bc-7a9f-d5cb-67cc-f44e2e42d9b7",ColumnName="ParentValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b7a1494-beb4-2df8-c61c-ecd583536bdd",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ParentValue */
public static final String COLUMNNAME_ParentValue = "ParentValue";
/** Set Post Actual.
@param PostActual Actual Values can be posted */
public void setPostActual (boolean PostActual)
{
set_Value (COLUMNNAME_PostActual, Boolean.valueOf(PostActual));
}
/** Get Post Actual.
@return Actual Values can be posted */
public boolean isPostActual() 
{
Object oo = get_Value(COLUMNNAME_PostActual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f0a4cbe5-68e2-3519-ec1a-a5dc2204e078")
public static String es_PE_FIELD_ImportAccount_PostActual_Name="Aplicar Reales";

@XendraTrl(Identifier="f0a4cbe5-68e2-3519-ec1a-a5dc2204e078")
public static String es_PE_FIELD_ImportAccount_PostActual_Description="Valores reales pueden ser aplicados";

@XendraTrl(Identifier="f0a4cbe5-68e2-3519-ec1a-a5dc2204e078")
public static String es_PE_FIELD_ImportAccount_PostActual_Help="El campo Aplicar Reales indica si valores reales pueden ser aplicados a este elemento contable";

@XendraField(AD_Column_ID="PostActual",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0a4cbe5-68e2-3519-ec1a-a5dc2204e078")
public static final String FIELDNAME_ImportAccount_PostActual="f0a4cbe5-68e2-3519-ec1a-a5dc2204e078";

@XendraTrl(Identifier="44a546d0-1d03-e2d2-c09e-940d3110f628")
public static String es_PE_COLUMN_PostActual_Name="Aplicar Reales";

@XendraColumn(AD_Element_ID="cda96ec7-2ae3-713e-0f2c-74729858394d",ColumnName="PostActual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44a546d0-1d03-e2d2-c09e-940d3110f628",
Synchronized="2019-08-30 22:22:47.0")
/** Column name PostActual */
public static final String COLUMNNAME_PostActual = "PostActual";
/** Set Post Budget.
@param PostBudget Budget values can be posted */
public void setPostBudget (boolean PostBudget)
{
set_Value (COLUMNNAME_PostBudget, Boolean.valueOf(PostBudget));
}
/** Get Post Budget.
@return Budget values can be posted */
public boolean isPostBudget() 
{
Object oo = get_Value(COLUMNNAME_PostBudget);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0f68c11a-4e2b-7be9-be0f-5f71c76a3f0d")
public static String es_PE_FIELD_ImportAccount_PostBudget_Name="Aplicar Presupuesto";

@XendraTrl(Identifier="0f68c11a-4e2b-7be9-be0f-5f71c76a3f0d")
public static String es_PE_FIELD_ImportAccount_PostBudget_Description="Valores del presupuesto pueden ser aplicados";

@XendraTrl(Identifier="0f68c11a-4e2b-7be9-be0f-5f71c76a3f0d")
public static String es_PE_FIELD_ImportAccount_PostBudget_Help="Presupuesto Aplicado indica si los valores del presupuesto pueden ser aplicados a este valor de elemento";

@XendraField(AD_Column_ID="PostBudget",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f68c11a-4e2b-7be9-be0f-5f71c76a3f0d")
public static final String FIELDNAME_ImportAccount_PostBudget="0f68c11a-4e2b-7be9-be0f-5f71c76a3f0d";

@XendraTrl(Identifier="d51036dd-111d-e2e3-232e-95343ca4e52b")
public static String es_PE_COLUMN_PostBudget_Name="Aplicar Presupuesto";

@XendraColumn(AD_Element_ID="1b7d2215-dff9-14b7-c2f9-d622b2191b03",ColumnName="PostBudget",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d51036dd-111d-e2e3-232e-95343ca4e52b",
Synchronized="2019-08-30 22:22:48.0")
/** Column name PostBudget */
public static final String COLUMNNAME_PostBudget = "PostBudget";
/** Set Post Encumbrance.
@param PostEncumbrance Post commitments to this account */
public void setPostEncumbrance (boolean PostEncumbrance)
{
set_Value (COLUMNNAME_PostEncumbrance, Boolean.valueOf(PostEncumbrance));
}
/** Get Post Encumbrance.
@return Post commitments to this account */
public boolean isPostEncumbrance() 
{
Object oo = get_Value(COLUMNNAME_PostEncumbrance);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="01f99a47-59b7-eff2-ff7a-966e762e0cc5")
public static String es_PE_FIELD_ImportAccount_PostEncumbrance_Name="Aplicar Gravámenes";

@XendraTrl(Identifier="01f99a47-59b7-eff2-ff7a-966e762e0cc5")
public static String es_PE_FIELD_ImportAccount_PostEncumbrance_Description="Registro de gravámenes a esta cuenta";

@XendraField(AD_Column_ID="PostEncumbrance",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01f99a47-59b7-eff2-ff7a-966e762e0cc5")
public static final String FIELDNAME_ImportAccount_PostEncumbrance="01f99a47-59b7-eff2-ff7a-966e762e0cc5";

@XendraTrl(Identifier="375869c6-a553-ef14-51d7-d9a2735fae69")
public static String es_PE_COLUMN_PostEncumbrance_Name="Aplicar Gravámenes";

@XendraColumn(AD_Element_ID="f67d6dbb-7034-6df3-63e0-0f0003ffb2a7",ColumnName="PostEncumbrance",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="375869c6-a553-ef14-51d7-d9a2735fae69",
Synchronized="2019-08-30 22:22:48.0")
/** Column name PostEncumbrance */
public static final String COLUMNNAME_PostEncumbrance = "PostEncumbrance";
/** Set Post Statistical.
@param PostStatistical Post statistical quantities to this account? */
public void setPostStatistical (boolean PostStatistical)
{
set_Value (COLUMNNAME_PostStatistical, Boolean.valueOf(PostStatistical));
}
/** Get Post Statistical.
@return Post statistical quantities to this account? */
public boolean isPostStatistical() 
{
Object oo = get_Value(COLUMNNAME_PostStatistical);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="27137a1f-8aca-3f51-84ee-eb00bef737b4")
public static String es_PE_FIELD_ImportAccount_PostStatistical_Name="Aplicar Estadísticas";

@XendraTrl(Identifier="27137a1f-8aca-3f51-84ee-eb00bef737b4")
public static String es_PE_FIELD_ImportAccount_PostStatistical_Description="Registro de cantidades estadísticas a esta cuenta";

@XendraField(AD_Column_ID="PostStatistical",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27137a1f-8aca-3f51-84ee-eb00bef737b4")
public static final String FIELDNAME_ImportAccount_PostStatistical="27137a1f-8aca-3f51-84ee-eb00bef737b4";

@XendraTrl(Identifier="f7b62188-9822-3019-79bf-fd2531fba371")
public static String es_PE_COLUMN_PostStatistical_Name="Aplicar Estadísticas";

@XendraColumn(AD_Element_ID="bd510cfd-555b-caae-2da4-894be696a886",ColumnName="PostStatistical",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7b62188-9822-3019-79bf-fd2531fba371",
Synchronized="2019-08-30 22:22:48.0")
/** Column name PostStatistical */
public static final String COLUMNNAME_PostStatistical = "PostStatistical";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fa2f890f-21dc-33cf-4c60-c8e1ee2fd6b3")
public static String es_PE_FIELD_ImportAccount_Processed_Name="Procesado";

@XendraTrl(Identifier="fa2f890f-21dc-33cf-4c60-c8e1ee2fd6b3")
public static String es_PE_FIELD_ImportAccount_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="fa2f890f-21dc-33cf-4c60-c8e1ee2fd6b3")
public static String es_PE_FIELD_ImportAccount_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa2f890f-21dc-33cf-4c60-c8e1ee2fd6b3")
public static final String FIELDNAME_ImportAccount_Processed="fa2f890f-21dc-33cf-4c60-c8e1ee2fd6b3";

@XendraTrl(Identifier="19c20d9d-1b02-188a-17b1-b66bfd6c9369")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19c20d9d-1b02-188a-17b1-b66bfd6c9369",
Synchronized="2019-08-30 22:22:48.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1f2b5af1-657d-09b0-d1c2-40f924dd7a48")
public static String es_PE_FIELD_ImportAccount_ProcessNow_Name="Importa Cuentas";

@XendraTrl(Identifier="1f2b5af1-657d-09b0-d1c2-40f924dd7a48")
public static String es_PE_FIELD_ImportAccount_ProcessNow_Description="Importa Cuentas Naturales";

@XendraTrl(Identifier="1f2b5af1-657d-09b0-d1c2-40f924dd7a48")
public static String es_PE_FIELD_ImportAccount_ProcessNow_Help="Cuentas de la importación y su actualización de jerarquía y opcional a cuentas por default. la actualización a cuentas considera los cambios el segmento natural de la cuenta usada, ejm. la cuenta 01-240 se convierte en 01-300). Si usted crea una nueva combinación, seguirá existiendo cuenta anterior (ejm. 01-240), si no es substituido. ¡Si usted selecciona esto, cerciórese de que por default duplique una cuenta natural y TENGA Una RESERVA!!";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f2b5af1-657d-09b0-d1c2-40f924dd7a48")
public static final String FIELDNAME_ImportAccount_ProcessNow="1f2b5af1-657d-09b0-d1c2-40f924dd7a48";

@XendraTrl(Identifier="264458c8-6914-9d3b-b488-26a62674234d")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="08880a86-5796-a110-2c7a-3a4647d197f2",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="264458c8-6914-9d3b-b488-26a62674234d",Synchronized="2019-08-30 22:22:48.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Subject_value.
@param Subject_value Subject_value */
public void setSubject_value (String Subject_value)
{
if (Subject_value != null && Subject_value.length() > 10)
{
log.warning("Length > 10 - truncated");
Subject_value = Subject_value.substring(0,9);
}
set_Value (COLUMNNAME_Subject_value, Subject_value);
}
/** Get Subject_value.
@return Subject_value */
public String getSubject_value() 
{
String value = (String)get_Value(COLUMNNAME_Subject_value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1138916e-5615-499a-bb23-c3188e0158af")
public static String es_PE_COLUMN_Subject_value_Name="subject_value";

@XendraColumn(AD_Element_ID="e37598ed-f3ee-4ea8-bb1e-5ef62b23c5c2",ColumnName="Subject_value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1138916e-5615-499a-bb23-c3188e0158af",
Synchronized="2019-08-30 22:22:48.0")
/** Column name Subject_value */
public static final String COLUMNNAME_Subject_value = "Subject_value";
/** Set TypeGroupingClose.
@param TypeGroupingClose TypeGroupingClose */
public void setTypeGroupingClose (String TypeGroupingClose)
{
if (TypeGroupingClose != null && TypeGroupingClose.length() > 60)
{
log.warning("Length > 60 - truncated");
TypeGroupingClose = TypeGroupingClose.substring(0,59);
}
set_Value (COLUMNNAME_TypeGroupingClose, TypeGroupingClose);
}
/** Get TypeGroupingClose.
@return TypeGroupingClose */
public String getTypeGroupingClose() 
{
String value = (String)get_Value(COLUMNNAME_TypeGroupingClose);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="41b3b1c2-5ee2-4807-b6e4-899aede3ad72")
public static String es_PE_COLUMN_TypeGroupingClose_Name="TypeGroupingClose";

@XendraColumn(AD_Element_ID="45d5c981-80ec-4281-bad9-354a1ee93e01",ColumnName="TypeGroupingClose",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41b3b1c2-5ee2-4807-b6e4-899aede3ad72",
Synchronized="2019-08-30 22:22:48.0")
/** Column name TypeGroupingClose */
public static final String COLUMNNAME_TypeGroupingClose = "TypeGroupingClose";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="ff86e49c-b807-ce47-ebb1-99b744428ff7")
public static String es_PE_FIELD_ImportAccount_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="ff86e49c-b807-ce47-ebb1-99b744428ff7")
public static String es_PE_FIELD_ImportAccount_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="ff86e49c-b807-ce47-ebb1-99b744428ff7")
public static String es_PE_FIELD_ImportAccount_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="7c18245b-aa7e-63a7-1dbd-cff39122cf9d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff86e49c-b807-ce47-ebb1-99b744428ff7")
public static final String FIELDNAME_ImportAccount_SearchKey="ff86e49c-b807-ce47-ebb1-99b744428ff7";

@XendraTrl(Identifier="d157fa56-038f-378b-a294-087e4e0d6185")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d157fa56-038f-378b-a294-087e4e0d6185",
Synchronized="2019-08-30 22:22:48.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
