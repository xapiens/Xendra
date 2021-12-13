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
/** Generated Model for C_BP_BankAccount
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_BankAccount extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_BankAccount_ID id
@param trxName transaction
*/
public X_C_BP_BankAccount (Properties ctx, int C_BP_BankAccount_ID, String trxName)
{
super (ctx, C_BP_BankAccount_ID, trxName);
/** if (C_BP_BankAccount_ID == 0)
{
setA_Name (null);
setC_BPartner_ID (0);
setC_BP_BankAccount_ID (0);
setIsACH (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_BankAccount (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=298 */
public static int Table_ID=MTable.getTable_ID("C_BP_BankAccount");

@XendraTrl(Identifier="724486aa-8a6f-7b22-c2e6-d97be2f126e4")
public static String es_PE_TAB_BankAccount_Description="Definir Cuenta Bancaria";

@XendraTrl(Identifier="724486aa-8a6f-7b22-c2e6-d97be2f126e4")
public static String es_PE_TAB_BankAccount_Help="La pestaña Definir Cuenta Bancaria define la información bancaria para este socio de negocio. Estos datos son usados para procesar pagos y giros.";

@XendraTrl(Identifier="724486aa-8a6f-7b22-c2e6-d97be2f126e4")
public static String es_PE_TAB_BankAccount_Name="Cuenta Bancaria";
@XendraTab(Name="Bank Account",
Description="Define Bank Account",
Help="The Define Bank Account Tab defines the banking information for this business partner.  This data is used for processing payments and remittances.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=80,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="724486aa-8a6f-7b22-c2e6-d97be2f126e4",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BankAccount="724486aa-8a6f-7b22-c2e6-d97be2f126e4";

@XendraTrl(Identifier="c93a1d32-159b-d293-0e72-92cae6912c0a")
public static String es_PE_TABLE_C_BP_BankAccount_Name="Cuenta Bancaria del Socio";

@XendraTable(Name="Partner Bank Account",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Bank Account of the Business Partner",Help="",TableName="C_BP_BankAccount",
AccessLevel="3",AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="c93a1d32-159b-d293-0e72-92cae6912c0a",Synchronized="2020-03-03 21:36:36.0")
/** TableName=C_BP_BankAccount */
public static final String Table_Name="C_BP_BankAccount";


@XendraIndex(Name="c_bpbankacct_bpartner",Identifier="160a2c62-cc00-219f-e90b-b093efc64c05",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="160a2c62-cc00-219f-e90b-b093efc64c05",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bpbankacct_bpartner = "160a2c62-cc00-219f-e90b-b093efc64c05";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_BankAccount");

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
    Table_ID = MTable.getTable_ID("C_BP_BankAccount");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_BankAccount[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account No.
@param AccountNo Account Number */
public void setAccountNo (String AccountNo)
{
if (AccountNo != null && AccountNo.length() > 20)
{
log.warning("Length > 20 - truncated");
AccountNo = AccountNo.substring(0,19);
}
set_Value (COLUMNNAME_AccountNo, AccountNo);
}
/** Get Account No.
@return Account Number */
public String getAccountNo() 
{
String value = (String)get_Value(COLUMNNAME_AccountNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ba5c12be-5c78-1958-0a61-055aa954c0b6")
public static String es_PE_FIELD_BankAccount_AccountNo_Name="No. De Cuenta";

@XendraTrl(Identifier="ba5c12be-5c78-1958-0a61-055aa954c0b6")
public static String es_PE_FIELD_BankAccount_AccountNo_Description="Número de cuenta";

@XendraTrl(Identifier="ba5c12be-5c78-1958-0a61-055aa954c0b6")
public static String es_PE_FIELD_BankAccount_AccountNo_Help="El número de cuenta indica el número asignado a esta cuenta.";

@XendraField(AD_Column_ID="AccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba5c12be-5c78-1958-0a61-055aa954c0b6")
public static final String FIELDNAME_BankAccount_AccountNo="ba5c12be-5c78-1958-0a61-055aa954c0b6";

@XendraTrl(Identifier="f3a2c482-9816-5f6e-836a-5f2a4ed5e403")
public static String es_PE_COLUMN_AccountNo_Name="No. De Cuenta";

@XendraColumn(AD_Element_ID="f476cad1-331f-9d18-a8b7-c03b172f9997",ColumnName="AccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3a2c482-9816-5f6e-836a-5f2a4ed5e403",
Synchronized="2019-08-30 22:21:13.0")
/** Column name AccountNo */
public static final String COLUMNNAME_AccountNo = "AccountNo";
/** Set Account City.
@param A_City City or the Credit Card or Account Holder */
public void setA_City (String A_City)
{
if (A_City != null && A_City.length() > 60)
{
log.warning("Length > 60 - truncated");
A_City = A_City.substring(0,59);
}
set_Value (COLUMNNAME_A_City, A_City);
}
/** Get Account City.
@return City or the Credit Card or Account Holder */
public String getA_City() 
{
String value = (String)get_Value(COLUMNNAME_A_City);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="05ecc4d9-023d-9c77-9435-70399a100b85")
public static String es_PE_FIELD_BankAccount_AccountCity_Name="Ciudad";

@XendraTrl(Identifier="05ecc4d9-023d-9c77-9435-70399a100b85")
public static String es_PE_FIELD_BankAccount_AccountCity_Description="Ciudad de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="05ecc4d9-023d-9c77-9435-70399a100b85")
public static String es_PE_FIELD_BankAccount_AccountCity_Help="La ciudad de la cuenta indica la ciudad de la tarjeta de crédito ó poseedor de la cuenta";

@XendraField(AD_Column_ID="A_City",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05ecc4d9-023d-9c77-9435-70399a100b85")
public static final String FIELDNAME_BankAccount_AccountCity="05ecc4d9-023d-9c77-9435-70399a100b85";

@XendraTrl(Identifier="6bc9ddf9-8d04-3480-80dd-97fac4b8f121")
public static String es_PE_COLUMN_A_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="d0b9f0dc-6e4e-7b82-ce92-ce27f1d981da",ColumnName="A_City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bc9ddf9-8d04-3480-80dd-97fac4b8f121",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_City */
public static final String COLUMNNAME_A_City = "A_City";
/** Set Account Country.
@param A_Country Country */
public void setA_Country (String A_Country)
{
if (A_Country != null && A_Country.length() > 40)
{
log.warning("Length > 40 - truncated");
A_Country = A_Country.substring(0,39);
}
set_Value (COLUMNNAME_A_Country, A_Country);
}
/** Get Account Country.
@return Country */
public String getA_Country() 
{
String value = (String)get_Value(COLUMNNAME_A_Country);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="71cac426-aa19-7468-545a-6b4932b06564")
public static String es_PE_FIELD_BankAccount_AccountCountry_Name="País Cuenta";

@XendraTrl(Identifier="71cac426-aa19-7468-545a-6b4932b06564")
public static String es_PE_FIELD_BankAccount_AccountCountry_Description="País";

@XendraTrl(Identifier="71cac426-aa19-7468-545a-6b4932b06564")
public static String es_PE_FIELD_BankAccount_AccountCountry_Help="Nombre de país cuenta.";

@XendraField(AD_Column_ID="A_Country",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71cac426-aa19-7468-545a-6b4932b06564")
public static final String FIELDNAME_BankAccount_AccountCountry="71cac426-aa19-7468-545a-6b4932b06564";

@XendraTrl(Identifier="954297d3-871f-67a2-6a98-a86f960309c7")
public static String es_PE_COLUMN_A_Country_Name="País Cuenta";

@XendraColumn(AD_Element_ID="2557bc05-7c00-bbb7-3d44-0332178331b7",ColumnName="A_Country",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="954297d3-871f-67a2-6a98-a86f960309c7",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_Country */
public static final String COLUMNNAME_A_Country = "A_Country";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="849c91e4-f5e8-2476-3d09-9d5f9fa1c852")
public static String es_PE_FIELD_BankAccount_UserContact_Name="Usuario";

@XendraTrl(Identifier="849c91e4-f5e8-2476-3d09-9d5f9fa1c852")
public static String es_PE_FIELD_BankAccount_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="849c91e4-f5e8-2476-3d09-9d5f9fa1c852")
public static String es_PE_FIELD_BankAccount_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="849c91e4-f5e8-2476-3d09-9d5f9fa1c852")
public static final String FIELDNAME_BankAccount_UserContact="849c91e4-f5e8-2476-3d09-9d5f9fa1c852";

@XendraTrl(Identifier="5d29109b-051f-2f88-6947-bcf12a2e307d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5d29109b-051f-2f88-6947-bcf12a2e307d",Synchronized="2019-08-30 22:21:13.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Account EMail.
@param A_EMail Email Address */
public void setA_EMail (String A_EMail)
{
if (A_EMail != null && A_EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
A_EMail = A_EMail.substring(0,59);
}
set_Value (COLUMNNAME_A_EMail, A_EMail);
}
/** Get Account EMail.
@return Email Address */
public String getA_EMail() 
{
String value = (String)get_Value(COLUMNNAME_A_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8e986b34-c387-19f1-e22e-f0cb60b09ba1")
public static String es_PE_FIELD_BankAccount_AccountEMail_Name="Cta. Correo Electrónico";

@XendraTrl(Identifier="8e986b34-c387-19f1-e22e-f0cb60b09ba1")
public static String es_PE_FIELD_BankAccount_AccountEMail_Description="Dirección de correo electrónico";

@XendraTrl(Identifier="8e986b34-c387-19f1-e22e-f0cb60b09ba1")
public static String es_PE_FIELD_BankAccount_AccountEMail_Help="La dirección de email indica la dirección de correo electrónico de la tarjeta de crédito ó poseedor de la cuenta";

@XendraField(AD_Column_ID="A_EMail",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e986b34-c387-19f1-e22e-f0cb60b09ba1")
public static final String FIELDNAME_BankAccount_AccountEMail="8e986b34-c387-19f1-e22e-f0cb60b09ba1";

@XendraTrl(Identifier="c4d49118-e798-e757-5bfe-b2a4f98c9a00")
public static String es_PE_COLUMN_A_EMail_Name="Cta. Correo Electrónico";

@XendraColumn(AD_Element_ID="7d49db1f-4635-479c-1130-e25e429b9dde",ColumnName="A_EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4d49118-e798-e757-5bfe-b2a4f98c9a00",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_EMail */
public static final String COLUMNNAME_A_EMail = "A_EMail";
/** Set Driver License.
@param A_Ident_DL Payment Identification - Driver License */
public void setA_Ident_DL (String A_Ident_DL)
{
if (A_Ident_DL != null && A_Ident_DL.length() > 20)
{
log.warning("Length > 20 - truncated");
A_Ident_DL = A_Ident_DL.substring(0,19);
}
set_Value (COLUMNNAME_A_Ident_DL, A_Ident_DL);
}
/** Get Driver License.
@return Payment Identification - Driver License */
public String getA_Ident_DL() 
{
String value = (String)get_Value(COLUMNNAME_A_Ident_DL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="90129534-7998-4459-8eac-83628cd30467")
public static String es_PE_FIELD_BankAccount_DriverLicense_Name="Licencia de Conducir";

@XendraTrl(Identifier="90129534-7998-4459-8eac-83628cd30467")
public static String es_PE_FIELD_BankAccount_DriverLicense_Description="Identificación de pago - Licencia de manejo";

@XendraTrl(Identifier="90129534-7998-4459-8eac-83628cd30467")
public static String es_PE_FIELD_BankAccount_DriverLicense_Help="Licencia de conducir";

@XendraField(AD_Column_ID="A_Ident_DL",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90129534-7998-4459-8eac-83628cd30467")
public static final String FIELDNAME_BankAccount_DriverLicense="90129534-7998-4459-8eac-83628cd30467";

@XendraTrl(Identifier="e00a3ec2-2253-aba2-160b-ea1fc29fd91d")
public static String es_PE_COLUMN_A_Ident_DL_Name="Licencia de Conducir";

@XendraColumn(AD_Element_ID="6cadeb4e-fc57-dc2e-3338-caca80ba426d",ColumnName="A_Ident_DL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e00a3ec2-2253-aba2-160b-ea1fc29fd91d",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_Ident_DL */
public static final String COLUMNNAME_A_Ident_DL = "A_Ident_DL";
/** Set Social Security No.
@param A_Ident_SSN Payment Identification - Social Security No */
public void setA_Ident_SSN (String A_Ident_SSN)
{
if (A_Ident_SSN != null && A_Ident_SSN.length() > 20)
{
log.warning("Length > 20 - truncated");
A_Ident_SSN = A_Ident_SSN.substring(0,19);
}
set_Value (COLUMNNAME_A_Ident_SSN, A_Ident_SSN);
}
/** Get Social Security No.
@return Payment Identification - Social Security No */
public String getA_Ident_SSN() 
{
String value = (String)get_Value(COLUMNNAME_A_Ident_SSN);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f0e14b84-a3ac-74ba-09d1-048f85b579a1")
public static String es_PE_FIELD_BankAccount_SocialSecurityNo_Name="No. Seguro Social";

@XendraTrl(Identifier="f0e14b84-a3ac-74ba-09d1-048f85b579a1")
public static String es_PE_FIELD_BankAccount_SocialSecurityNo_Description="Identificación de pago - No. del seguro social.";

@XendraTrl(Identifier="f0e14b84-a3ac-74ba-09d1-048f85b579a1")
public static String es_PE_FIELD_BankAccount_SocialSecurityNo_Help="El número de seguro social que se usará como identificación.";

@XendraField(AD_Column_ID="A_Ident_SSN",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0e14b84-a3ac-74ba-09d1-048f85b579a1")
public static final String FIELDNAME_BankAccount_SocialSecurityNo="f0e14b84-a3ac-74ba-09d1-048f85b579a1";

@XendraTrl(Identifier="9860b21c-5bd6-6bc7-42f9-a0465c568690")
public static String es_PE_COLUMN_A_Ident_SSN_Name="No. Seguro Social";

@XendraColumn(AD_Element_ID="a8725a16-fd7d-7fff-8ac8-c9ce0b539b15",ColumnName="A_Ident_SSN",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9860b21c-5bd6-6bc7-42f9-a0465c568690",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_Ident_SSN */
public static final String COLUMNNAME_A_Ident_SSN = "A_Ident_SSN";
/** Set Account Name.
@param A_Name Name on Credit Card or Account holder */
public void setA_Name (String A_Name)
{
if (A_Name == null) throw new IllegalArgumentException ("A_Name is mandatory.");
if (A_Name.length() > 60)
{
log.warning("Length > 60 - truncated");
A_Name = A_Name.substring(0,59);
}
set_Value (COLUMNNAME_A_Name, A_Name);
}
/** Get Account Name.
@return Name on Credit Card or Account holder */
public String getA_Name() 
{
String value = (String)get_Value(COLUMNNAME_A_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="04307499-778a-161a-00be-5e80da297673")
public static String es_PE_FIELD_BankAccount_AccountName_Name="Nombre";

@XendraTrl(Identifier="04307499-778a-161a-00be-5e80da297673")
public static String es_PE_FIELD_BankAccount_AccountName_Description="Nombre de la tarjeta de crédito ó el poseedor de la cuenta.";

@XendraTrl(Identifier="04307499-778a-161a-00be-5e80da297673")
public static String es_PE_FIELD_BankAccount_AccountName_Help="El nombre de la tarjeta de crédito ó poseedor de la cuenta.";

@XendraField(AD_Column_ID="A_Name",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04307499-778a-161a-00be-5e80da297673")
public static final String FIELDNAME_BankAccount_AccountName="04307499-778a-161a-00be-5e80da297673";

@XendraTrl(Identifier="a328b256-7af0-8ba6-cf1b-591352231025")
public static String es_PE_COLUMN_A_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="4caab851-6dad-67db-64c8-779b7d63b4c6",ColumnName="A_Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a328b256-7af0-8ba6-cf1b-591352231025",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_Name */
public static final String COLUMNNAME_A_Name = "A_Name";
/** Set Account State.
@param A_State State of the Credit Card or Account holder */
public void setA_State (String A_State)
{
if (A_State != null && A_State.length() > 40)
{
log.warning("Length > 40 - truncated");
A_State = A_State.substring(0,39);
}
set_Value (COLUMNNAME_A_State, A_State);
}
/** Get Account State.
@return State of the Credit Card or Account holder */
public String getA_State() 
{
String value = (String)get_Value(COLUMNNAME_A_State);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e53cf644-c985-2cdc-8149-dd63a77c246f")
public static String es_PE_FIELD_BankAccount_AccountState_Name="Estado";

@XendraTrl(Identifier="e53cf644-c985-2cdc-8149-dd63a77c246f")
public static String es_PE_FIELD_BankAccount_AccountState_Description="Estado de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="e53cf644-c985-2cdc-8149-dd63a77c246f")
public static String es_PE_FIELD_BankAccount_AccountState_Help="El estado de la tarjeta de crédito ó poseedor de la cuenta";

@XendraField(AD_Column_ID="A_State",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e53cf644-c985-2cdc-8149-dd63a77c246f")
public static final String FIELDNAME_BankAccount_AccountState="e53cf644-c985-2cdc-8149-dd63a77c246f";

@XendraTrl(Identifier="a7c4d65d-3a55-6f14-a865-31fe69a83289")
public static String es_PE_COLUMN_A_State_Name="Estado";

@XendraColumn(AD_Element_ID="9d555d0b-34c9-065f-d541-fe1cd1ef7490",ColumnName="A_State",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7c4d65d-3a55-6f14-a865-31fe69a83289",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_State */
public static final String COLUMNNAME_A_State = "A_State";
/** Set Account Street.
@param A_Street Street address of the Credit Card or Account holder */
public void setA_Street (String A_Street)
{
if (A_Street != null && A_Street.length() > 60)
{
log.warning("Length > 60 - truncated");
A_Street = A_Street.substring(0,59);
}
set_Value (COLUMNNAME_A_Street, A_Street);
}
/** Get Account Street.
@return Street address of the Credit Card or Account holder */
public String getA_Street() 
{
String value = (String)get_Value(COLUMNNAME_A_Street);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4a39f2a3-f8ae-e873-be5c-ae7c180a83b4")
public static String es_PE_FIELD_BankAccount_AccountStreet_Name="Calle";

@XendraTrl(Identifier="4a39f2a3-f8ae-e873-be5c-ae7c180a83b4")
public static String es_PE_FIELD_BankAccount_AccountStreet_Description="Calle de la Tarjeta de Crédito o el Poseedor de la cuenta";

@XendraTrl(Identifier="4a39f2a3-f8ae-e873-be5c-ae7c180a83b4")
public static String es_PE_FIELD_BankAccount_AccountStreet_Help="La Dirección de la Calle de la Tarjeta de Crédito o poseedor de la cuenta";

@XendraField(AD_Column_ID="A_Street",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a39f2a3-f8ae-e873-be5c-ae7c180a83b4")
public static final String FIELDNAME_BankAccount_AccountStreet="4a39f2a3-f8ae-e873-be5c-ae7c180a83b4";

@XendraTrl(Identifier="0590f1f5-fb87-c198-05f5-f347c6a14113")
public static String es_PE_COLUMN_A_Street_Name="Calle";

@XendraColumn(AD_Element_ID="ef375ac2-5149-dbad-bf90-0f49fed02bbc",ColumnName="A_Street",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0590f1f5-fb87-c198-05f5-f347c6a14113",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_Street */
public static final String COLUMNNAME_A_Street = "A_Street";
/** Set Account Zip/Postal.
@param A_Zip Zip Code of the Credit Card or Account Holder */
public void setA_Zip (String A_Zip)
{
if (A_Zip != null && A_Zip.length() > 20)
{
log.warning("Length > 20 - truncated");
A_Zip = A_Zip.substring(0,19);
}
set_Value (COLUMNNAME_A_Zip, A_Zip);
}
/** Get Account Zip/Postal.
@return Zip Code of the Credit Card or Account Holder */
public String getA_Zip() 
{
String value = (String)get_Value(COLUMNNAME_A_Zip);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a57fb895-a070-9e2c-0dc9-22b8be573bba")
public static String es_PE_FIELD_BankAccount_AccountZipPostal_Name="Código Postal";

@XendraTrl(Identifier="a57fb895-a070-9e2c-0dc9-22b8be573bba")
public static String es_PE_FIELD_BankAccount_AccountZipPostal_Description="Código Postal de la Tarjeta de Crédito ó el Poseedor de la cuenta";

@XendraTrl(Identifier="a57fb895-a070-9e2c-0dc9-22b8be573bba")
public static String es_PE_FIELD_BankAccount_AccountZipPostal_Help="El Código Postal de la Tarjeta de Crédito ó poseedor de la cuenta";

@XendraField(AD_Column_ID="A_Zip",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a57fb895-a070-9e2c-0dc9-22b8be573bba")
public static final String FIELDNAME_BankAccount_AccountZipPostal="a57fb895-a070-9e2c-0dc9-22b8be573bba";

@XendraTrl(Identifier="89e0202a-c19e-72d5-3b89-8f0232233500")
public static String es_PE_COLUMN_A_Zip_Name="Código Postal";

@XendraColumn(AD_Element_ID="72061340-1a35-bf43-78af-738caee1cb49",ColumnName="A_Zip",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89e0202a-c19e-72d5-3b89-8f0232233500",
Synchronized="2019-08-30 22:21:13.0")
/** Column name A_Zip */
public static final String COLUMNNAME_A_Zip = "A_Zip";
/** Set Bank Account Type.
@param BankAccountType Bank Account Type */
public void setBankAccountType (String BankAccountType)
{
if (BankAccountType != null && BankAccountType.length() > 1)
{
log.warning("Length > 1 - truncated");
BankAccountType = BankAccountType.substring(0,0);
}
set_Value (COLUMNNAME_BankAccountType, BankAccountType);
}
/** Get Bank Account Type.
@return Bank Account Type */
public String getBankAccountType() 
{
return (String)get_Value(COLUMNNAME_BankAccountType);
}

@XendraTrl(Identifier="5167c822-660a-0280-fb6b-693c59fc238d")
public static String es_PE_FIELD_BankAccount_BankAccountType_Name="Tipo de Cuenta Bancaria";

@XendraTrl(Identifier="5167c822-660a-0280-fb6b-693c59fc238d")
public static String es_PE_FIELD_BankAccount_BankAccountType_Description="Tipo de cuenta Bancaria";

@XendraTrl(Identifier="5167c822-660a-0280-fb6b-693c59fc238d")
public static String es_PE_FIELD_BankAccount_BankAccountType_Help="El Tipo de Cuenta Bancario indica el tipo de cuenta (ahorros; cheques; etc.) como está definida esta cuenta";

@XendraField(AD_Column_ID="BankAccountType",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5167c822-660a-0280-fb6b-693c59fc238d")
public static final String FIELDNAME_BankAccount_BankAccountType="5167c822-660a-0280-fb6b-693c59fc238d";

@XendraTrl(Identifier="3593df6b-fc8c-5e4c-0a11-51f8dcfe5142")
public static String es_PE_COLUMN_BankAccountType_Name="Tipo de Cuenta Bancaria";

@XendraColumn(AD_Element_ID="2c7e9444-f63a-32ab-6164-9eac9c7fd1fe",ColumnName="BankAccountType",
AD_Reference_ID=17,AD_Reference_Value_ID="acb85a97-8387-31f1-319a-5aec11c0aca3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3593df6b-fc8c-5e4c-0a11-51f8dcfe5142",Synchronized="2019-08-30 22:21:13.0")
/** Column name BankAccountType */
public static final String COLUMNNAME_BankAccountType = "BankAccountType";
/** Set Account Usage.
@param BPBankAcctUse Business Partner Bank Account usage */
public void setBPBankAcctUse (String BPBankAcctUse)
{
if (BPBankAcctUse != null && BPBankAcctUse.length() > 1)
{
log.warning("Length > 1 - truncated");
BPBankAcctUse = BPBankAcctUse.substring(0,0);
}
set_Value (COLUMNNAME_BPBankAcctUse, BPBankAcctUse);
}
/** Get Account Usage.
@return Business Partner Bank Account usage */
public String getBPBankAcctUse() 
{
return (String)get_Value(COLUMNNAME_BPBankAcctUse);
}

@XendraTrl(Identifier="5e40a72c-79f0-1752-6eee-4ee369bc2a5d")
public static String es_PE_FIELD_BankAccount_AccountUsage_Name="Account Usage";

@XendraTrl(Identifier="5e40a72c-79f0-1752-6eee-4ee369bc2a5d")
public static String es_PE_FIELD_BankAccount_AccountUsage_Description="Business Partner Bank Account usage";

@XendraTrl(Identifier="5e40a72c-79f0-1752-6eee-4ee369bc2a5d")
public static String es_PE_FIELD_BankAccount_AccountUsage_Help="Determines how the bank account is used.";

@XendraField(AD_Column_ID="BPBankAcctUse",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e40a72c-79f0-1752-6eee-4ee369bc2a5d")
public static final String FIELDNAME_BankAccount_AccountUsage="5e40a72c-79f0-1752-6eee-4ee369bc2a5d";

@XendraTrl(Identifier="4541768b-f189-7412-5b83-8cec11615d24")
public static String es_PE_COLUMN_BPBankAcctUse_Name="Account Usage";

@XendraColumn(AD_Element_ID="caa56505-e390-4ef3-1b64-5c62b18d3edb",ColumnName="BPBankAcctUse",
AD_Reference_ID=17,AD_Reference_Value_ID="afc90cd3-db9c-e55c-36e0-3e3943e38a03",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="														B",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4541768b-f189-7412-5b83-8cec11615d24",Synchronized="2019-08-30 22:21:13.0")
/** Column name BPBankAcctUse */
public static final String COLUMNNAME_BPBankAcctUse = "BPBankAcctUse";
/** Set Bank.
@param C_Bank_ID Bank */
public void setC_Bank_ID (int C_Bank_ID)
{
if (C_Bank_ID <= 0) set_Value (COLUMNNAME_C_Bank_ID, null);
 else 
set_Value (COLUMNNAME_C_Bank_ID, Integer.valueOf(C_Bank_ID));
}
/** Get Bank.
@return Bank */
public int getC_Bank_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Bank_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Bank_ID()));
}

@XendraTrl(Identifier="ad57beb8-e9dd-f197-6927-e947c5cfa15e")
public static String es_PE_FIELD_BankAccount_Bank_Name="Banco";

@XendraTrl(Identifier="ad57beb8-e9dd-f197-6927-e947c5cfa15e")
public static String es_PE_FIELD_BankAccount_Bank_Description="Banco";

@XendraTrl(Identifier="ad57beb8-e9dd-f197-6927-e947c5cfa15e")
public static String es_PE_FIELD_BankAccount_Bank_Help="El Banco es un identificador único de un Banco para esta Organización o para un Socio del Negocio con quien esta organización efectúa transacciones";

@XendraField(AD_Column_ID="C_Bank_ID",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad57beb8-e9dd-f197-6927-e947c5cfa15e")
public static final String FIELDNAME_BankAccount_Bank="ad57beb8-e9dd-f197-6927-e947c5cfa15e";

@XendraTrl(Identifier="dac42833-a0f8-5675-d68e-da82df9bd98d")
public static String es_PE_COLUMN_C_Bank_ID_Name="Banco";

@XendraColumn(AD_Element_ID="89f0477f-4fb3-0740-081a-46ed80def564",ColumnName="C_Bank_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dac42833-a0f8-5675-d68e-da82df9bd98d",
Synchronized="2019-08-30 22:21:13.0")
/** Column name C_Bank_ID */
public static final String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
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

@XendraTrl(Identifier="c96d6635-e927-99ac-bfb2-0e6aa122fb5d")
public static String es_PE_FIELD_BankAccount_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="c96d6635-e927-99ac-bfb2-0e6aa122fb5d")
public static String es_PE_FIELD_BankAccount_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="c96d6635-e927-99ac-bfb2-0e6aa122fb5d")
public static String es_PE_FIELD_BankAccount_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c96d6635-e927-99ac-bfb2-0e6aa122fb5d")
public static final String FIELDNAME_BankAccount_BusinessPartner="c96d6635-e927-99ac-bfb2-0e6aa122fb5d";

@XendraTrl(Identifier="5b23decc-1700-2c32-a1e3-cc3c77bbe5e7")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5b23decc-1700-2c32-a1e3-cc3c77bbe5e7",Synchronized="2019-08-30 22:21:13.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Bank Account.
@param C_BP_BankAccount_ID Bank Account of the Business Partner */
public void setC_BP_BankAccount_ID (int C_BP_BankAccount_ID)
{
if (C_BP_BankAccount_ID < 1) throw new IllegalArgumentException ("C_BP_BankAccount_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BP_BankAccount_ID, Integer.valueOf(C_BP_BankAccount_ID));
}
/** Get Partner Bank Account.
@return Bank Account of the Business Partner */
public int getC_BP_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7e0ca4b-8fde-a963-f3ff-699f691312c5")
public static String es_PE_FIELD_BankAccount_PartnerBankAccount_Name="Cuenta Bancaria del Socio";

@XendraTrl(Identifier="d7e0ca4b-8fde-a963-f3ff-699f691312c5")
public static String es_PE_FIELD_BankAccount_PartnerBankAccount_Description="Cuenta bancaria del socio del negocio";

@XendraTrl(Identifier="d7e0ca4b-8fde-a963-f3ff-699f691312c5")
public static String es_PE_FIELD_BankAccount_PartnerBankAccount_Help="La cuenta bancaria del socio identifica la cuenta bancaria a ser usada por este socio de negocio";

@XendraField(AD_Column_ID="C_BP_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7e0ca4b-8fde-a963-f3ff-699f691312c5")
public static final String FIELDNAME_BankAccount_PartnerBankAccount="d7e0ca4b-8fde-a963-f3ff-699f691312c5";
/** Column name C_BP_BankAccount_ID */
public static final String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
/** Set Exp. Month.
@param CreditCardExpMM Expiry Month */
public void setCreditCardExpMM (int CreditCardExpMM)
{
set_Value (COLUMNNAME_CreditCardExpMM, Integer.valueOf(CreditCardExpMM));
}
/** Get Exp. Month.
@return Expiry Month */
public int getCreditCardExpMM() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CreditCardExpMM);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2637c969-6ed6-e619-10d3-7468a2afa4c9")
public static String es_PE_FIELD_BankAccount_ExpMonth_Name="Mes de Expiración";

@XendraTrl(Identifier="2637c969-6ed6-e619-10d3-7468a2afa4c9")
public static String es_PE_FIELD_BankAccount_ExpMonth_Description="Mes de expiración";

@XendraTrl(Identifier="2637c969-6ed6-e619-10d3-7468a2afa4c9")
public static String es_PE_FIELD_BankAccount_ExpMonth_Help="El mes de expiración indica el mes de expiración para esta tarjeta de crédito";

@XendraField(AD_Column_ID="CreditCardExpMM",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=N",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2637c969-6ed6-e619-10d3-7468a2afa4c9")
public static final String FIELDNAME_BankAccount_ExpMonth="2637c969-6ed6-e619-10d3-7468a2afa4c9";

@XendraTrl(Identifier="7a4bc131-2682-9d69-e43d-8d7dab5431db")
public static String es_PE_COLUMN_CreditCardExpMM_Name="Mes de Expiración";

@XendraColumn(AD_Element_ID="356e5287-2f42-aa22-fe06-93d0c824b8b8",ColumnName="CreditCardExpMM",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a4bc131-2682-9d69-e43d-8d7dab5431db",
Synchronized="2019-08-30 22:21:13.0")
/** Column name CreditCardExpMM */
public static final String COLUMNNAME_CreditCardExpMM = "CreditCardExpMM";
/** Set Exp. Year.
@param CreditCardExpYY Expiry Year */
public void setCreditCardExpYY (int CreditCardExpYY)
{
set_Value (COLUMNNAME_CreditCardExpYY, Integer.valueOf(CreditCardExpYY));
}
/** Get Exp. Year.
@return Expiry Year */
public int getCreditCardExpYY() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CreditCardExpYY);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f3d685bf-5c69-8382-8e51-9de31fa7c80d")
public static String es_PE_FIELD_BankAccount_ExpYear_Name="Año de Expiración";

@XendraTrl(Identifier="f3d685bf-5c69-8382-8e51-9de31fa7c80d")
public static String es_PE_FIELD_BankAccount_ExpYear_Description="Año de expiración";

@XendraTrl(Identifier="f3d685bf-5c69-8382-8e51-9de31fa7c80d")
public static String es_PE_FIELD_BankAccount_ExpYear_Help="El Año de Expiración indica el año de expiración para esta tarjeta de crédito";

@XendraField(AD_Column_ID="CreditCardExpYY",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=N",DisplayLength=11,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3d685bf-5c69-8382-8e51-9de31fa7c80d")
public static final String FIELDNAME_BankAccount_ExpYear="f3d685bf-5c69-8382-8e51-9de31fa7c80d";

@XendraTrl(Identifier="a129f1bb-db3e-f2e3-1188-353b55cb5aa2")
public static String es_PE_COLUMN_CreditCardExpYY_Name="Año de Expiración";

@XendraColumn(AD_Element_ID="0fd5b930-7df8-710d-43fa-e4e55dd5df2d",ColumnName="CreditCardExpYY",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="2000",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a129f1bb-db3e-f2e3-1188-353b55cb5aa2",
Synchronized="2019-08-30 22:21:14.0")
/** Column name CreditCardExpYY */
public static final String COLUMNNAME_CreditCardExpYY = "CreditCardExpYY";
/** Set Number.
@param CreditCardNumber Credit Card Number  */
public void setCreditCardNumber (String CreditCardNumber)
{
if (CreditCardNumber != null && CreditCardNumber.length() > 20)
{
log.warning("Length > 20 - truncated");
CreditCardNumber = CreditCardNumber.substring(0,19);
}
set_Value (COLUMNNAME_CreditCardNumber, CreditCardNumber);
}
/** Get Number.
@return Credit Card Number  */
public String getCreditCardNumber() 
{
String value = (String)get_Value(COLUMNNAME_CreditCardNumber);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="acbdd050-a280-1e42-50d0-170aef27ed50")
public static String es_PE_FIELD_BankAccount_Number_Name="Número";

@XendraTrl(Identifier="acbdd050-a280-1e42-50d0-170aef27ed50")
public static String es_PE_FIELD_BankAccount_Number_Description="Número de tarjeta de crédito";

@XendraTrl(Identifier="acbdd050-a280-1e42-50d0-170aef27ed50")
public static String es_PE_FIELD_BankAccount_Number_Help="El número de tarjeta de crédito indica el número sin espacios en blancos.";

@XendraField(AD_Column_ID="CreditCardNumber",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=N",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acbdd050-a280-1e42-50d0-170aef27ed50")
public static final String FIELDNAME_BankAccount_Number="acbdd050-a280-1e42-50d0-170aef27ed50";

@XendraTrl(Identifier="c1acd9a8-9f25-64da-1192-376c9f0c61cb")
public static String es_PE_COLUMN_CreditCardNumber_Name="Número";

@XendraColumn(AD_Element_ID="ba2012cb-ab05-b83e-d2ab-52eaad7b996c",ColumnName="CreditCardNumber",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1acd9a8-9f25-64da-1192-376c9f0c61cb",
Synchronized="2019-08-30 22:21:14.0")
/** Column name CreditCardNumber */
public static final String COLUMNNAME_CreditCardNumber = "CreditCardNumber";
/** Set Credit Card.
@param CreditCardType Credit Card (Visa, MC, AmEx) */
public void setCreditCardType (String CreditCardType)
{
if (CreditCardType != null && CreditCardType.length() > 1)
{
log.warning("Length > 1 - truncated");
CreditCardType = CreditCardType.substring(0,0);
}
set_Value (COLUMNNAME_CreditCardType, CreditCardType);
}
/** Get Credit Card.
@return Credit Card (Visa, MC, AmEx) */
public String getCreditCardType() 
{
return (String)get_Value(COLUMNNAME_CreditCardType);
}

@XendraTrl(Identifier="4550f72d-2400-5495-fed7-abb8b3b2420e")
public static String es_PE_FIELD_BankAccount_CreditCard_Name="Tarjeta de Crédito";

@XendraTrl(Identifier="4550f72d-2400-5495-fed7-abb8b3b2420e")
public static String es_PE_FIELD_BankAccount_CreditCard_Description="Tarjeta de Crédito (Visa; MC; Am Ex)";

@XendraTrl(Identifier="4550f72d-2400-5495-fed7-abb8b3b2420e")
public static String es_PE_FIELD_BankAccount_CreditCard_Help="El cuadro de lista de tarjeta de crédito se usa para seleccionar el tipo de tarjeta de crédito presentada para  pago.";

@XendraField(AD_Column_ID="CreditCardType",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=N",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4550f72d-2400-5495-fed7-abb8b3b2420e")
public static final String FIELDNAME_BankAccount_CreditCard="4550f72d-2400-5495-fed7-abb8b3b2420e";

@XendraTrl(Identifier="deb2b0b9-4405-4ba3-bd6a-f3bcb647bb71")
public static String es_PE_COLUMN_CreditCardType_Name="Tarjeta de Crédito";

@XendraColumn(AD_Element_ID="22758af1-56f5-1e54-84a3-40d8827367a1",ColumnName="CreditCardType",
AD_Reference_ID=17,AD_Reference_Value_ID="5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="deb2b0b9-4405-4ba3-bd6a-f3bcb647bb71",Synchronized="2019-08-30 22:21:14.0")
/** Column name CreditCardType */
public static final String COLUMNNAME_CreditCardType = "CreditCardType";
/** Set Verification Code.
@param CreditCardVV Credit Card Verification code on credit card */
public void setCreditCardVV (String CreditCardVV)
{
if (CreditCardVV != null && CreditCardVV.length() > 4)
{
log.warning("Length > 4 - truncated");
CreditCardVV = CreditCardVV.substring(0,3);
}
set_Value (COLUMNNAME_CreditCardVV, CreditCardVV);
}
/** Get Verification Code.
@return Credit Card Verification code on credit card */
public String getCreditCardVV() 
{
String value = (String)get_Value(COLUMNNAME_CreditCardVV);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="67b4de5b-c9e7-0be4-e7e8-9efbffae5966")
public static String es_PE_FIELD_BankAccount_VerificationCode_Name="Verificación de Tarjeta de Crédito";

@XendraTrl(Identifier="67b4de5b-c9e7-0be4-e7e8-9efbffae5966")
public static String es_PE_FIELD_BankAccount_VerificationCode_Description="Código de verificación en la tarjeta de crédito";

@XendraTrl(Identifier="67b4de5b-c9e7-0be4-e7e8-9efbffae5966")
public static String es_PE_FIELD_BankAccount_VerificationCode_Help="La verificación de la tarjeta de crédito indica el código de verificación en la tarjeta de crédito (AMEX 4 digitos en frente; MC;Visa 3 digitos)";

@XendraField(AD_Column_ID="CreditCardVV",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=N",DisplayLength=5,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67b4de5b-c9e7-0be4-e7e8-9efbffae5966")
public static final String FIELDNAME_BankAccount_VerificationCode="67b4de5b-c9e7-0be4-e7e8-9efbffae5966";

@XendraTrl(Identifier="b480eb70-c543-8a76-3a91-10889accb2d6")
public static String es_PE_COLUMN_CreditCardVV_Name="Verificación de Tarjeta de Crédito";

@XendraColumn(AD_Element_ID="cfff0a60-ada3-c9c2-d76e-7f805447f51b",ColumnName="CreditCardVV",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b480eb70-c543-8a76-3a91-10889accb2d6",
Synchronized="2019-08-30 22:21:14.0")
/** Column name CreditCardVV */
public static final String COLUMNNAME_CreditCardVV = "CreditCardVV";
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
@XendraTrl(Identifier="32209e15-0f0f-41fd-930e-8cb30dfa062e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32209e15-0f0f-41fd-930e-8cb30dfa062e",
Synchronized="2019-08-30 22:21:14.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set ACH.
@param IsACH Automatic Clearing House */
public void setIsACH (boolean IsACH)
{
set_Value (COLUMNNAME_IsACH, Boolean.valueOf(IsACH));
}
/** Get ACH.
@return Automatic Clearing House */
public boolean isACH() 
{
Object oo = get_Value(COLUMNNAME_IsACH);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="70cd6d61-a179-6e09-d774-8043cb5ed08f")
public static String es_PE_FIELD_BankAccount_ACH_Name="Transacciones Automáticas";

@XendraTrl(Identifier="70cd6d61-a179-6e09-d774-8043cb5ed08f")
public static String es_PE_FIELD_BankAccount_ACH_Help="El cuadro de verificación ACH indica si esta cuenta bancaria acepta transacciones tipo ACH";

@XendraField(AD_Column_ID="IsACH",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70cd6d61-a179-6e09-d774-8043cb5ed08f")
public static final String FIELDNAME_BankAccount_ACH="70cd6d61-a179-6e09-d774-8043cb5ed08f";

@XendraTrl(Identifier="d305916e-2e5b-174f-440c-39d5811ff35f")
public static String es_PE_COLUMN_IsACH_Name="TRAN";

@XendraColumn(AD_Element_ID="f5bd5561-1acd-938e-8f0a-e47bea13eca1",ColumnName="IsACH",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d305916e-2e5b-174f-440c-39d5811ff35f",
Synchronized="2019-08-30 22:21:14.0")
/** Column name IsACH */
public static final String COLUMNNAME_IsACH = "IsACH";
/** Set Address verified.
@param R_AvsAddr This address has been verified */
public void setR_AvsAddr (String R_AvsAddr)
{
if (R_AvsAddr != null && R_AvsAddr.length() > 1)
{
log.warning("Length > 1 - truncated");
R_AvsAddr = R_AvsAddr.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_R_AvsAddr, R_AvsAddr);
}
/** Get Address verified.
@return This address has been verified */
public String getR_AvsAddr() 
{
return (String)get_Value(COLUMNNAME_R_AvsAddr);
}

@XendraTrl(Identifier="046b5afb-1239-53d2-c824-aa510b275167")
public static String es_PE_FIELD_BankAccount_AddressVerified_Name="Dirección Verificada";

@XendraTrl(Identifier="046b5afb-1239-53d2-c824-aa510b275167")
public static String es_PE_FIELD_BankAccount_AddressVerified_Description="Esta dirección ha sido devuelta";

@XendraTrl(Identifier="046b5afb-1239-53d2-c824-aa510b275167")
public static String es_PE_FIELD_BankAccount_AddressVerified_Help="La dirección verificada indica si la dirección ha sido verificada por la compañía de la tarjeta de crédito";

@XendraField(AD_Column_ID="R_AvsAddr",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="046b5afb-1239-53d2-c824-aa510b275167")
public static final String FIELDNAME_BankAccount_AddressVerified="046b5afb-1239-53d2-c824-aa510b275167";

@XendraTrl(Identifier="7ab9b883-a84c-0b8f-9943-211b5b4afc56")
public static String es_PE_COLUMN_R_AvsAddr_Name="Dirección Verificada";

@XendraColumn(AD_Element_ID="3432afba-fd83-3253-148c-70d58d2646cd",ColumnName="R_AvsAddr",
AD_Reference_ID=17,AD_Reference_Value_ID="a38caa4a-a80a-342b-7bcf-5e887ef40a4c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7ab9b883-a84c-0b8f-9943-211b5b4afc56",Synchronized="2019-08-30 22:21:14.0")
/** Column name R_AvsAddr */
public static final String COLUMNNAME_R_AvsAddr = "R_AvsAddr";
/** Set Zip verified.
@param R_AvsZip The Zip Code has been verified */
public void setR_AvsZip (String R_AvsZip)
{
if (R_AvsZip != null && R_AvsZip.length() > 1)
{
log.warning("Length > 1 - truncated");
R_AvsZip = R_AvsZip.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_R_AvsZip, R_AvsZip);
}
/** Get Zip verified.
@return The Zip Code has been verified */
public String getR_AvsZip() 
{
return (String)get_Value(COLUMNNAME_R_AvsZip);
}

@XendraTrl(Identifier="0825a388-c0be-f1be-9670-2a540d78d137")
public static String es_PE_FIELD_BankAccount_ZipVerified_Name="Código Postal Verificado";

@XendraTrl(Identifier="0825a388-c0be-f1be-9670-2a540d78d137")
public static String es_PE_FIELD_BankAccount_ZipVerified_Description="El Código Postal ha sido verificado";

@XendraTrl(Identifier="0825a388-c0be-f1be-9670-2a540d78d137")
public static String es_PE_FIELD_BankAccount_ZipVerified_Help="El Zip Verificado indica si el código postal ha sido verificado por la compañía de la tarjeta de crédito";

@XendraField(AD_Column_ID="R_AvsZip",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0825a388-c0be-f1be-9670-2a540d78d137")
public static final String FIELDNAME_BankAccount_ZipVerified="0825a388-c0be-f1be-9670-2a540d78d137";

@XendraTrl(Identifier="db312bbe-4850-b082-da81-7a0453f4b5c9")
public static String es_PE_COLUMN_R_AvsZip_Name="Código Postal Verificado";

@XendraColumn(AD_Element_ID="4f2e0f81-83ea-d083-4bfb-a91d0660a73f",ColumnName="R_AvsZip",
AD_Reference_ID=17,AD_Reference_Value_ID="a38caa4a-a80a-342b-7bcf-5e887ef40a4c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="db312bbe-4850-b082-da81-7a0453f4b5c9",Synchronized="2019-08-30 22:21:14.0")
/** Column name R_AvsZip */
public static final String COLUMNNAME_R_AvsZip = "R_AvsZip";
/** Set Routing No.
@param RoutingNo Bank Routing Number */
public void setRoutingNo (String RoutingNo)
{
if (RoutingNo != null && RoutingNo.length() > 20)
{
log.warning("Length > 20 - truncated");
RoutingNo = RoutingNo.substring(0,19);
}
set_Value (COLUMNNAME_RoutingNo, RoutingNo);
}
/** Get Routing No.
@return Bank Routing Number */
public String getRoutingNo() 
{
String value = (String)get_Value(COLUMNNAME_RoutingNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c4b6c6c6-9411-5a0e-1e6a-18e4d847d092")
public static String es_PE_FIELD_BankAccount_RoutingNo_Name="No. de Ruta";

@XendraTrl(Identifier="c4b6c6c6-9411-5a0e-1e6a-18e4d847d092")
public static String es_PE_FIELD_BankAccount_RoutingNo_Description="Número de sucursal bancaria";

@XendraTrl(Identifier="c4b6c6c6-9411-5a0e-1e6a-18e4d847d092")
public static String es_PE_FIELD_BankAccount_RoutingNo_Help="El número de ruta del banco (Número ABA) identifica un banco legal. Se usa en ruteo de cheques y transacciones electrónicas.";

@XendraField(AD_Column_ID="RoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="724486aa-8a6f-7b22-c2e6-d97be2f126e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsACH@=Y & @C_Bank_ID@=0",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c4b6c6c6-9411-5a0e-1e6a-18e4d847d092")
public static final String FIELDNAME_BankAccount_RoutingNo="c4b6c6c6-9411-5a0e-1e6a-18e4d847d092";

@XendraTrl(Identifier="ae0de78f-3153-5a98-21f6-28b5213dee8c")
public static String es_PE_COLUMN_RoutingNo_Name="No. de Ruta";

@XendraColumn(AD_Element_ID="6fe1dae1-ff7f-9b06-686b-31ba56524158",ColumnName="RoutingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae0de78f-3153-5a98-21f6-28b5213dee8c",
Synchronized="2019-08-30 22:21:14.0")
/** Column name RoutingNo */
public static final String COLUMNNAME_RoutingNo = "RoutingNo";
}
