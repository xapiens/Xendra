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
import org.compiere.model.reference.REF_C_PaymentCreditCardType;
import org.compiere.model.reference.REF_C_PaymentTenderType;
import org.compiere.model.reference.REF_C_PaymentTrxType;
/** Generated Model for I_Payment
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_Payment extends PO
{
/** Standard Constructor
@param ctx context
@param I_Payment_ID id
@param trxName transaction
*/
public X_I_Payment (Properties ctx, int I_Payment_ID, String trxName)
{
super (ctx, I_Payment_ID, trxName);
/** if (I_Payment_ID == 0)
{
setI_IsImported (false);	
// N
setI_Payment_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_Payment (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=597 */
public static int Table_ID=MTable.getTable_ID("I_Payment");

@XendraTrl(Identifier="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db")
public static String es_PE_TAB_Payment_Description="Pagos de la importación";

@XendraTrl(Identifier="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db")
public static String es_PE_TAB_Payment_Name="Pago";
@XendraTab(Name="Payment",
Description="Import Payments",Help="",AD_Window_ID="a2942656-21d0-93b8-9add-b3b104c30b5c",SeqNo=10,
TabLevel=0,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Payment="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db";

@XendraTrl(Identifier="87187e74-c3b9-96ba-ba98-289296cc3687")
public static String es_PE_TABLE_I_Payment_Name="Importar Pagos";

@XendraTable(Name="Import Payment",Description="Import Payment",Help="",TableName="I_Payment",
AccessLevel="2",AD_Window_ID="a2942656-21d0-93b8-9add-b3b104c30b5c",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="87187e74-c3b9-96ba-ba98-289296cc3687",Synchronized="2017-08-16 11:43:03.0")
/** TableName=I_Payment */
public static final String Table_Name="I_Payment";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_Payment");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("I_Payment");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_Payment[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="2ab676d7-5c96-f869-0392-4cf7d86a93cf")
public static String es_PE_FIELD_Payment_AccountNo_Description="Número de cuenta";

@XendraTrl(Identifier="2ab676d7-5c96-f869-0392-4cf7d86a93cf")
public static String es_PE_FIELD_Payment_AccountNo_Help="El número de cuenta indica el número asignado a esta cuenta.";

@XendraTrl(Identifier="2ab676d7-5c96-f869-0392-4cf7d86a93cf")
public static String es_PE_FIELD_Payment_AccountNo_Name="No. De Cuenta";

@XendraField(AD_Column_ID="AccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ab676d7-5c96-f869-0392-4cf7d86a93cf")
public static final String FIELDNAME_Payment_AccountNo="2ab676d7-5c96-f869-0392-4cf7d86a93cf";

@XendraTrl(Identifier="05f9b125-dea4-9b85-6d88-5e962ae9d050")
public static String es_PE_COLUMN_AccountNo_Name="No. De Cuenta";

@XendraColumn(AD_Element_ID="f476cad1-331f-9d18-a8b7-c03b172f9997",ColumnName="AccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05f9b125-dea4-9b85-6d88-5e962ae9d050",
Synchronized="2017-08-05 16:54:55.0")
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
@XendraTrl(Identifier="401e9153-6210-631b-462b-5c6022eb29a8")
public static String es_PE_FIELD_Payment_AccountCity_Description="Ciudad de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="401e9153-6210-631b-462b-5c6022eb29a8")
public static String es_PE_FIELD_Payment_AccountCity_Help="La ciudad de la cuenta indica la ciudad de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="401e9153-6210-631b-462b-5c6022eb29a8")
public static String es_PE_FIELD_Payment_AccountCity_Name="Ciudad";

@XendraField(AD_Column_ID="A_City",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="401e9153-6210-631b-462b-5c6022eb29a8")
public static final String FIELDNAME_Payment_AccountCity="401e9153-6210-631b-462b-5c6022eb29a8";

@XendraTrl(Identifier="d5435927-136a-fcf1-14fe-e400dce4381c")
public static String es_PE_COLUMN_A_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="d0b9f0dc-6e4e-7b82-ce92-ce27f1d981da",ColumnName="A_City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5435927-136a-fcf1-14fe-e400dce4381c",
Synchronized="2017-08-05 16:54:55.0")
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
@XendraTrl(Identifier="7a83aa12-48c0-7e6d-5f2f-932314dd0688")
public static String es_PE_FIELD_Payment_AccountCountry_Description="País";

@XendraTrl(Identifier="7a83aa12-48c0-7e6d-5f2f-932314dd0688")
public static String es_PE_FIELD_Payment_AccountCountry_Help="Nombre de país cuenta.";

@XendraTrl(Identifier="7a83aa12-48c0-7e6d-5f2f-932314dd0688")
public static String es_PE_FIELD_Payment_AccountCountry_Name="País Cuenta";

@XendraField(AD_Column_ID="A_Country",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a83aa12-48c0-7e6d-5f2f-932314dd0688")
public static final String FIELDNAME_Payment_AccountCountry="7a83aa12-48c0-7e6d-5f2f-932314dd0688";

@XendraTrl(Identifier="12a665b5-d8f4-d33d-310f-6a7f2fe61ea0")
public static String es_PE_COLUMN_A_Country_Name="País Cuenta";

@XendraColumn(AD_Element_ID="2557bc05-7c00-bbb7-3d44-0332178331b7",ColumnName="A_Country",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12a665b5-d8f4-d33d-310f-6a7f2fe61ea0",
Synchronized="2017-08-05 16:54:55.0")
/** Column name A_Country */
public static final String COLUMNNAME_A_Country = "A_Country";
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
@XendraTrl(Identifier="32f8e83e-1319-ef34-36aa-6b1514b130ca")
public static String es_PE_FIELD_Payment_AccountEMail_Description="Dirección de correo electrónico";

@XendraTrl(Identifier="32f8e83e-1319-ef34-36aa-6b1514b130ca")
public static String es_PE_FIELD_Payment_AccountEMail_Help="La dirección de email indica la dirección de correo electrónico de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="32f8e83e-1319-ef34-36aa-6b1514b130ca")
public static String es_PE_FIELD_Payment_AccountEMail_Name="Cta. Correo Electrónico";

@XendraField(AD_Column_ID="A_EMail",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32f8e83e-1319-ef34-36aa-6b1514b130ca")
public static final String FIELDNAME_Payment_AccountEMail="32f8e83e-1319-ef34-36aa-6b1514b130ca";

@XendraTrl(Identifier="6c781c16-4b72-653c-c4f5-a849d5119614")
public static String es_PE_COLUMN_A_EMail_Name="Cta. Correo Electrónico";

@XendraColumn(AD_Element_ID="7d49db1f-4635-479c-1130-e25e429b9dde",ColumnName="A_EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c781c16-4b72-653c-c4f5-a849d5119614",
Synchronized="2017-08-05 16:54:56.0")
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
@XendraTrl(Identifier="8ccd5e5d-cd9e-7cbd-5043-1844b630ee3a")
public static String es_PE_FIELD_Payment_DriverLicense_Description="Identificación de pago - Licencia de manejo";

@XendraTrl(Identifier="8ccd5e5d-cd9e-7cbd-5043-1844b630ee3a")
public static String es_PE_FIELD_Payment_DriverLicense_Help="Licencia de conducir";

@XendraTrl(Identifier="8ccd5e5d-cd9e-7cbd-5043-1844b630ee3a")
public static String es_PE_FIELD_Payment_DriverLicense_Name="Licencia de Conducir";

@XendraField(AD_Column_ID="A_Ident_DL",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ccd5e5d-cd9e-7cbd-5043-1844b630ee3a")
public static final String FIELDNAME_Payment_DriverLicense="8ccd5e5d-cd9e-7cbd-5043-1844b630ee3a";

@XendraTrl(Identifier="52f1aa33-98f8-2c5b-1a08-0657f6544b1a")
public static String es_PE_COLUMN_A_Ident_DL_Name="Licencia de Conducir";

@XendraColumn(AD_Element_ID="6cadeb4e-fc57-dc2e-3338-caca80ba426d",ColumnName="A_Ident_DL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52f1aa33-98f8-2c5b-1a08-0657f6544b1a",
Synchronized="2017-08-05 16:54:56.0")
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
@XendraTrl(Identifier="d6016a1d-714d-f939-bc1b-ffee19e9ab47")
public static String es_PE_FIELD_Payment_SocialSecurityNo_Description="Identificación de pago - No. del seguro social.";

@XendraTrl(Identifier="d6016a1d-714d-f939-bc1b-ffee19e9ab47")
public static String es_PE_FIELD_Payment_SocialSecurityNo_Help="El número de seguro social que se usará como identificación.";

@XendraTrl(Identifier="d6016a1d-714d-f939-bc1b-ffee19e9ab47")
public static String es_PE_FIELD_Payment_SocialSecurityNo_Name="No. Seguro Social";

@XendraField(AD_Column_ID="A_Ident_SSN",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6016a1d-714d-f939-bc1b-ffee19e9ab47")
public static final String FIELDNAME_Payment_SocialSecurityNo="d6016a1d-714d-f939-bc1b-ffee19e9ab47";

@XendraTrl(Identifier="39f7acc7-b776-9682-8259-b3ad8deb8609")
public static String es_PE_COLUMN_A_Ident_SSN_Name="No. Seguro Social";

@XendraColumn(AD_Element_ID="a8725a16-fd7d-7fff-8ac8-c9ce0b539b15",ColumnName="A_Ident_SSN",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39f7acc7-b776-9682-8259-b3ad8deb8609",
Synchronized="2017-08-05 16:54:56.0")
/** Column name A_Ident_SSN */
public static final String COLUMNNAME_A_Ident_SSN = "A_Ident_SSN";
/** Set Account Name.
@param A_Name Name on Credit Card or Account holder */
public void setA_Name (String A_Name)
{
if (A_Name != null && A_Name.length() > 60)
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
@XendraTrl(Identifier="21701bf6-3299-0e19-383b-910b23d7affb")
public static String es_PE_FIELD_Payment_AccountName_Description="Nombre de la tarjeta de crédito ó el poseedor de la cuenta.";

@XendraTrl(Identifier="21701bf6-3299-0e19-383b-910b23d7affb")
public static String es_PE_FIELD_Payment_AccountName_Help="El nombre de la tarjeta de crédito ó poseedor de la cuenta.";

@XendraTrl(Identifier="21701bf6-3299-0e19-383b-910b23d7affb")
public static String es_PE_FIELD_Payment_AccountName_Name="Nombre";

@XendraField(AD_Column_ID="A_Name",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21701bf6-3299-0e19-383b-910b23d7affb")
public static final String FIELDNAME_Payment_AccountName="21701bf6-3299-0e19-383b-910b23d7affb";

@XendraTrl(Identifier="49cf50f5-aec9-e57b-de29-51a4ba973d9d")
public static String es_PE_COLUMN_A_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="4caab851-6dad-67db-64c8-779b7d63b4c6",ColumnName="A_Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49cf50f5-aec9-e57b-de29-51a4ba973d9d",
Synchronized="2017-08-05 16:54:56.0")
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
@XendraTrl(Identifier="aa1f7938-a61e-1bc4-43a4-74ed150013d3")
public static String es_PE_FIELD_Payment_AccountState_Description="Estado de la tarjeta de crédito ó el poseedor de la cuenta";

@XendraTrl(Identifier="aa1f7938-a61e-1bc4-43a4-74ed150013d3")
public static String es_PE_FIELD_Payment_AccountState_Help="El estado de la tarjeta de crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="aa1f7938-a61e-1bc4-43a4-74ed150013d3")
public static String es_PE_FIELD_Payment_AccountState_Name="Estado";

@XendraField(AD_Column_ID="A_State",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa1f7938-a61e-1bc4-43a4-74ed150013d3")
public static final String FIELDNAME_Payment_AccountState="aa1f7938-a61e-1bc4-43a4-74ed150013d3";

@XendraTrl(Identifier="dc40c05d-22a7-8142-476d-d1547cb4ed36")
public static String es_PE_COLUMN_A_State_Name="Estado";

@XendraColumn(AD_Element_ID="9d555d0b-34c9-065f-d541-fe1cd1ef7490",ColumnName="A_State",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc40c05d-22a7-8142-476d-d1547cb4ed36",
Synchronized="2017-08-05 16:54:56.0")
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
@XendraTrl(Identifier="c59b13f6-ed1c-ecc6-ab31-a8b5874f3c99")
public static String es_PE_FIELD_Payment_AccountStreet_Description="Calle de la Tarjeta de Crédito o el Poseedor de la cuenta";

@XendraTrl(Identifier="c59b13f6-ed1c-ecc6-ab31-a8b5874f3c99")
public static String es_PE_FIELD_Payment_AccountStreet_Help="La Dirección de la Calle de la Tarjeta de Crédito o poseedor de la cuenta";

@XendraTrl(Identifier="c59b13f6-ed1c-ecc6-ab31-a8b5874f3c99")
public static String es_PE_FIELD_Payment_AccountStreet_Name="Calle";

@XendraField(AD_Column_ID="A_Street",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c59b13f6-ed1c-ecc6-ab31-a8b5874f3c99")
public static final String FIELDNAME_Payment_AccountStreet="c59b13f6-ed1c-ecc6-ab31-a8b5874f3c99";

@XendraTrl(Identifier="f36e2ef0-1293-0174-606c-06725c237e49")
public static String es_PE_COLUMN_A_Street_Name="Calle";

@XendraColumn(AD_Element_ID="ef375ac2-5149-dbad-bf90-0f49fed02bbc",ColumnName="A_Street",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f36e2ef0-1293-0174-606c-06725c237e49",
Synchronized="2017-08-05 16:54:56.0")
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
@XendraTrl(Identifier="e001d6eb-a2b8-8939-963e-35598e54bcd3")
public static String es_PE_FIELD_Payment_AccountZipPostal_Description="Código Postal de la Tarjeta de Crédito ó el Poseedor de la cuenta";

@XendraTrl(Identifier="e001d6eb-a2b8-8939-963e-35598e54bcd3")
public static String es_PE_FIELD_Payment_AccountZipPostal_Help="El Código Postal de la Tarjeta de Crédito ó poseedor de la cuenta";

@XendraTrl(Identifier="e001d6eb-a2b8-8939-963e-35598e54bcd3")
public static String es_PE_FIELD_Payment_AccountZipPostal_Name="Código Postal";

@XendraField(AD_Column_ID="A_Zip",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e001d6eb-a2b8-8939-963e-35598e54bcd3")
public static final String FIELDNAME_Payment_AccountZipPostal="e001d6eb-a2b8-8939-963e-35598e54bcd3";

@XendraTrl(Identifier="f605a7da-1091-1996-592d-5f0fa4eafadc")
public static String es_PE_COLUMN_A_Zip_Name="Código Postal";

@XendraColumn(AD_Element_ID="72061340-1a35-bf43-78af-738caee1cb49",ColumnName="A_Zip",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f605a7da-1091-1996-592d-5f0fa4eafadc",
Synchronized="2017-08-05 16:54:56.0")
/** Column name A_Zip */
public static final String COLUMNNAME_A_Zip = "A_Zip";
/** Set Bank Account No.
@param BankAccountNo Bank Account Number */
public void setBankAccountNo (String BankAccountNo)
{
if (BankAccountNo != null && BankAccountNo.length() > 20)
{
log.warning("Length > 20 - truncated");
BankAccountNo = BankAccountNo.substring(0,19);
}
set_Value (COLUMNNAME_BankAccountNo, BankAccountNo);
}
/** Get Bank Account No.
@return Bank Account Number */
public String getBankAccountNo() 
{
String value = (String)get_Value(COLUMNNAME_BankAccountNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0a5654d3-781e-c16c-f4fc-3543c7c14ef7")
public static String es_PE_FIELD_Payment_BankAccountNo_Description="No. de Cuenta Bancaria";

@XendraTrl(Identifier="0a5654d3-781e-c16c-f4fc-3543c7c14ef7")
public static String es_PE_FIELD_Payment_BankAccountNo_Name="No. de Cuenta Bancaria";

@XendraField(AD_Column_ID="BankAccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a5654d3-781e-c16c-f4fc-3543c7c14ef7")
public static final String FIELDNAME_Payment_BankAccountNo="0a5654d3-781e-c16c-f4fc-3543c7c14ef7";

@XendraTrl(Identifier="eda87050-5eb2-33d5-546b-ab9b00ff12dc")
public static String es_PE_COLUMN_BankAccountNo_Name="No. de Cuenta Bancaria";

@XendraColumn(AD_Element_ID="ec47c905-09fa-8d51-ed8a-2c042d48e359",ColumnName="BankAccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eda87050-5eb2-33d5-546b-ab9b00ff12dc",
Synchronized="2017-08-05 16:54:56.0")
/** Column name BankAccountNo */
public static final String COLUMNNAME_BankAccountNo = "BankAccountNo";
/** Set Business Partner Key.
@param BPartnerValue Key of the Business Partner */
public void setBPartnerValue (String BPartnerValue)
{
if (BPartnerValue != null && BPartnerValue.length() > 40)
{
log.warning("Length > 40 - truncated");
BPartnerValue = BPartnerValue.substring(0,39);
}
set_Value (COLUMNNAME_BPartnerValue, BPartnerValue);
}
/** Get Business Partner Key.
@return Key of the Business Partner */
public String getBPartnerValue() 
{
String value = (String)get_Value(COLUMNNAME_BPartnerValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="425ec4d4-873d-9202-7e12-3e642a015259")
public static String es_PE_FIELD_Payment_BusinessPartnerKey_Description="Clave para el S.N.";

@XendraTrl(Identifier="425ec4d4-873d-9202-7e12-3e642a015259")
public static String es_PE_FIELD_Payment_BusinessPartnerKey_Name="Clave de S.N.";

@XendraField(AD_Column_ID="BPartnerValue",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="425ec4d4-873d-9202-7e12-3e642a015259")
public static final String FIELDNAME_Payment_BusinessPartnerKey="425ec4d4-873d-9202-7e12-3e642a015259";

@XendraTrl(Identifier="ce5d8ee0-5ca0-dbcd-5bab-5b637096da1b")
public static String es_PE_COLUMN_BPartnerValue_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="8128a796-0c52-a502-d53b-7f4fe35f5f78",ColumnName="BPartnerValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce5d8ee0-5ca0-dbcd-5bab-5b637096da1b",
Synchronized="2017-08-05 16:54:56.0")
/** Column name BPartnerValue */
public static final String COLUMNNAME_BPartnerValue = "BPartnerValue";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID <= 0) set_Value (COLUMNNAME_C_BankAccount_ID, null);
 else 
set_Value (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
}
/** Get Bank Account.
@return Account at the Bank */
public int getC_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d17e576-dc01-b130-e136-b9825121f235")
public static String es_PE_FIELD_Payment_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="0d17e576-dc01-b130-e136-b9825121f235")
public static String es_PE_FIELD_Payment_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="0d17e576-dc01-b130-e136-b9825121f235")
public static String es_PE_FIELD_Payment_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d17e576-dc01-b130-e136-b9825121f235")
public static final String FIELDNAME_Payment_BankAccount="0d17e576-dc01-b130-e136-b9825121f235";

@XendraTrl(Identifier="891ab111-33f6-4c51-3249-d532eb14d588")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="891ab111-33f6-4c51-3249-d532eb14d588",
Synchronized="2017-08-05 16:54:56.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dffb7c81-aa49-9c45-d632-ee3e93055195")
public static String es_PE_FIELD_Payment_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="dffb7c81-aa49-9c45-d632-ee3e93055195")
public static String es_PE_FIELD_Payment_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="dffb7c81-aa49-9c45-d632-ee3e93055195")
public static String es_PE_FIELD_Payment_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dffb7c81-aa49-9c45-d632-ee3e93055195")
public static final String FIELDNAME_Payment_BusinessPartner="dffb7c81-aa49-9c45-d632-ee3e93055195";

@XendraTrl(Identifier="69b735ab-55c3-4a1c-190a-5648c705139f")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69b735ab-55c3-4a1c-190a-5648c705139f",
Synchronized="2017-08-05 16:54:56.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad4ba0c0-e40e-0ed9-7fd8-bbb6b7928f92")
public static String es_PE_FIELD_Payment_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="ad4ba0c0-e40e-0ed9-7fd8-bbb6b7928f92")
public static String es_PE_FIELD_Payment_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="ad4ba0c0-e40e-0ed9-7fd8-bbb6b7928f92")
public static String es_PE_FIELD_Payment_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad4ba0c0-e40e-0ed9-7fd8-bbb6b7928f92")
public static final String FIELDNAME_Payment_Charge="ad4ba0c0-e40e-0ed9-7fd8-bbb6b7928f92";

@XendraTrl(Identifier="36d7a287-414d-024c-05fc-f37581ac3cec")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36d7a287-414d-024c-05fc-f37581ac3cec",
Synchronized="2017-08-05 16:54:56.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc831c5b-93a2-f05a-89c9-a1362b808d02")
public static String es_PE_FIELD_Payment_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="fc831c5b-93a2-f05a-89c9-a1362b808d02")
public static String es_PE_FIELD_Payment_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="fc831c5b-93a2-f05a-89c9-a1362b808d02")
public static String es_PE_FIELD_Payment_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc831c5b-93a2-f05a-89c9-a1362b808d02")
public static final String FIELDNAME_Payment_Currency="fc831c5b-93a2-f05a-89c9-a1362b808d02";

@XendraTrl(Identifier="11bf311a-a433-ed31-9e4b-35411b46c365")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11bf311a-a433-ed31-9e4b-35411b46c365",
Synchronized="2017-08-05 16:54:56.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="3c1aa123-3de0-5765-47d0-684eaf071a2d")
public static String es_PE_FIELD_Payment_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="3c1aa123-3de0-5765-47d0-684eaf071a2d")
public static String es_PE_FIELD_Payment_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="3c1aa123-3de0-5765-47d0-684eaf071a2d")
public static String es_PE_FIELD_Payment_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c1aa123-3de0-5765-47d0-684eaf071a2d")
public static final String FIELDNAME_Payment_DocumentType="3c1aa123-3de0-5765-47d0-684eaf071a2d";

@XendraTrl(Identifier="257016f7-214f-2684-131a-ec4ec424eed6")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="257016f7-214f-2684-131a-ec4ec424eed6",
Synchronized="2017-08-05 16:54:56.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
}
/** Get Charge amount.
@return Charge Amount */
public BigDecimal getChargeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7d898855-d622-c5c9-ce3c-d321b6d8d829")
public static String es_PE_FIELD_Payment_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="7d898855-d622-c5c9-ce3c-d321b6d8d829")
public static String es_PE_FIELD_Payment_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="7d898855-d622-c5c9-ce3c-d321b6d8d829")
public static String es_PE_FIELD_Payment_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d898855-d622-c5c9-ce3c-d321b6d8d829")
public static final String FIELDNAME_Payment_ChargeAmount="7d898855-d622-c5c9-ce3c-d321b6d8d829";

@XendraTrl(Identifier="98a94833-194a-cbe0-4ed2-c6ce9c5d4225")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98a94833-194a-cbe0-4ed2-c6ce9c5d4225",
Synchronized="2017-08-05 16:54:56.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
/** Set Charge Name.
@param ChargeName Name of the Charge */
public void setChargeName (String ChargeName)
{
if (ChargeName != null && ChargeName.length() > 60)
{
log.warning("Length > 60 - truncated");
ChargeName = ChargeName.substring(0,59);
}
set_Value (COLUMNNAME_ChargeName, ChargeName);
}
/** Get Charge Name.
@return Name of the Charge */
public String getChargeName() 
{
String value = (String)get_Value(COLUMNNAME_ChargeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9c3a5c73-ba96-5b97-7005-110046bcefa7")
public static String es_PE_FIELD_Payment_ChargeName_Description="Nombre de la carga";

@XendraTrl(Identifier="9c3a5c73-ba96-5b97-7005-110046bcefa7")
public static String es_PE_FIELD_Payment_ChargeName_Name="Nombre de la Carga";

@XendraField(AD_Column_ID="ChargeName",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c3a5c73-ba96-5b97-7005-110046bcefa7")
public static final String FIELDNAME_Payment_ChargeName="9c3a5c73-ba96-5b97-7005-110046bcefa7";

@XendraTrl(Identifier="f063997f-4bf7-f1f2-8790-b1ce3f8ee17f")
public static String es_PE_COLUMN_ChargeName_Name="Nombre de la Carga";

@XendraColumn(AD_Element_ID="0276aef2-48b9-ac17-3634-7d9311741db0",ColumnName="ChargeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f063997f-4bf7-f1f2-8790-b1ce3f8ee17f",
Synchronized="2017-08-05 16:54:56.0")
/** Column name ChargeName */
public static final String COLUMNNAME_ChargeName = "ChargeName";
/** Set Check No.
@param CheckNo Check Number */
public void setCheckNo (String CheckNo)
{
if (CheckNo != null && CheckNo.length() > 20)
{
log.warning("Length > 20 - truncated");
CheckNo = CheckNo.substring(0,19);
}
set_Value (COLUMNNAME_CheckNo, CheckNo);
}
/** Get Check No.
@return Check Number */
public String getCheckNo() 
{
String value = (String)get_Value(COLUMNNAME_CheckNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="66ef7a30-06c6-66fc-fe0f-fe02b00959d4")
public static String es_PE_FIELD_Payment_CheckNo_Description="No. de Cheque";

@XendraTrl(Identifier="66ef7a30-06c6-66fc-fe0f-fe02b00959d4")
public static String es_PE_FIELD_Payment_CheckNo_Help="El Número de Cheque indica el número en el cheque";

@XendraTrl(Identifier="66ef7a30-06c6-66fc-fe0f-fe02b00959d4")
public static String es_PE_FIELD_Payment_CheckNo_Name="No. de Cheque";

@XendraField(AD_Column_ID="CheckNo",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66ef7a30-06c6-66fc-fe0f-fe02b00959d4")
public static final String FIELDNAME_Payment_CheckNo="66ef7a30-06c6-66fc-fe0f-fe02b00959d4";

@XendraTrl(Identifier="36e3006d-b32d-4cfb-ee27-5db9cc930c7f")
public static String es_PE_COLUMN_CheckNo_Name="No. de Cheque";

@XendraColumn(AD_Element_ID="3123a69e-c052-5e62-1da1-52e9859520d5",ColumnName="CheckNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36e3006d-b32d-4cfb-ee27-5db9cc930c7f",
Synchronized="2017-08-05 16:54:56.0")
/** Column name CheckNo */
public static final String COLUMNNAME_CheckNo = "CheckNo";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a8da888c-0788-ecef-df84-1ad859bc1117")
public static String es_PE_FIELD_Payment_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="a8da888c-0788-ecef-df84-1ad859bc1117")
public static String es_PE_FIELD_Payment_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="a8da888c-0788-ecef-df84-1ad859bc1117")
public static String es_PE_FIELD_Payment_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8da888c-0788-ecef-df84-1ad859bc1117")
public static final String FIELDNAME_Payment_Invoice="a8da888c-0788-ecef-df84-1ad859bc1117";

@XendraTrl(Identifier="dd043e9b-c2a2-3f97-b6b8-bcf58aedda54")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd043e9b-c2a2-3f97-b6b8-bcf58aedda54",
Synchronized="2017-08-05 16:54:56.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="77ba4444-ee02-07d6-0dec-576e386d6cfc")
public static String es_PE_FIELD_Payment_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="77ba4444-ee02-07d6-0dec-576e386d6cfc")
public static String es_PE_FIELD_Payment_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="77ba4444-ee02-07d6-0dec-576e386d6cfc")
public static String es_PE_FIELD_Payment_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77ba4444-ee02-07d6-0dec-576e386d6cfc")
public static final String FIELDNAME_Payment_Payment="77ba4444-ee02-07d6-0dec-576e386d6cfc";

@XendraTrl(Identifier="05f56994-f857-60bc-aa75-120161e76f14")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05f56994-f857-60bc-aa75-120161e76f14",
Synchronized="2017-08-05 16:54:56.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
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

@XendraTrl(Identifier="4caf3cd8-36f1-44bd-5184-3b236a2bdcbe")
public static String es_PE_FIELD_Payment_ExpMonth_Description="Mes de expiración";

@XendraTrl(Identifier="4caf3cd8-36f1-44bd-5184-3b236a2bdcbe")
public static String es_PE_FIELD_Payment_ExpMonth_Help="El mes de expiración indica el mes de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="4caf3cd8-36f1-44bd-5184-3b236a2bdcbe")
public static String es_PE_FIELD_Payment_ExpMonth_Name="Mes de Expiración";

@XendraField(AD_Column_ID="CreditCardExpMM",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4caf3cd8-36f1-44bd-5184-3b236a2bdcbe")
public static final String FIELDNAME_Payment_ExpMonth="4caf3cd8-36f1-44bd-5184-3b236a2bdcbe";

@XendraTrl(Identifier="fcda2d0b-8823-4c9d-ee4d-f8d536515910")
public static String es_PE_COLUMN_CreditCardExpMM_Name="Mes de Expiración";

@XendraColumn(AD_Element_ID="356e5287-2f42-aa22-fe06-93d0c824b8b8",ColumnName="CreditCardExpMM",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fcda2d0b-8823-4c9d-ee4d-f8d536515910",
Synchronized="2017-08-05 16:54:56.0")
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

@XendraTrl(Identifier="cf8726a5-0b8a-b0ba-34f9-2c8e4295ec4c")
public static String es_PE_FIELD_Payment_ExpYear_Description="Año de expiración";

@XendraTrl(Identifier="cf8726a5-0b8a-b0ba-34f9-2c8e4295ec4c")
public static String es_PE_FIELD_Payment_ExpYear_Help="El Año de Expiración indica el año de expiración para esta tarjeta de crédito";

@XendraTrl(Identifier="cf8726a5-0b8a-b0ba-34f9-2c8e4295ec4c")
public static String es_PE_FIELD_Payment_ExpYear_Name="Año de Expiración";

@XendraField(AD_Column_ID="CreditCardExpYY",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf8726a5-0b8a-b0ba-34f9-2c8e4295ec4c")
public static final String FIELDNAME_Payment_ExpYear="cf8726a5-0b8a-b0ba-34f9-2c8e4295ec4c";

@XendraTrl(Identifier="f867d2d8-4cce-759d-cf52-b472485d04f1")
public static String es_PE_COLUMN_CreditCardExpYY_Name="Año de Expiración";

@XendraColumn(AD_Element_ID="0fd5b930-7df8-710d-43fa-e4e55dd5df2d",ColumnName="CreditCardExpYY",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f867d2d8-4cce-759d-cf52-b472485d04f1",
Synchronized="2017-08-05 16:54:56.0")
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
@XendraTrl(Identifier="50daffd8-f17a-f34c-3b05-88db8e17ac22")
public static String es_PE_FIELD_Payment_Number_Description="Número de tarjeta de crédito";

@XendraTrl(Identifier="50daffd8-f17a-f34c-3b05-88db8e17ac22")
public static String es_PE_FIELD_Payment_Number_Help="El número de tarjeta de crédito indica el número sin espacios en blancos.";

@XendraTrl(Identifier="50daffd8-f17a-f34c-3b05-88db8e17ac22")
public static String es_PE_FIELD_Payment_Number_Name="Número";

@XendraField(AD_Column_ID="CreditCardNumber",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50daffd8-f17a-f34c-3b05-88db8e17ac22")
public static final String FIELDNAME_Payment_Number="50daffd8-f17a-f34c-3b05-88db8e17ac22";

@XendraTrl(Identifier="4164b04e-6b08-a4f2-8f2b-9dc0e0f7400b")
public static String es_PE_COLUMN_CreditCardNumber_Name="Número";

@XendraColumn(AD_Element_ID="ba2012cb-ab05-b83e-d2ab-52eaad7b996c",ColumnName="CreditCardNumber",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4164b04e-6b08-a4f2-8f2b-9dc0e0f7400b",
Synchronized="2017-08-05 16:54:56.0")
/** Column name CreditCardNumber */
public static final String COLUMNNAME_CreditCardNumber = "CreditCardNumber";

/** CreditCardType AD_Reference=5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9 */
public static final int CREDITCARDTYPE_AD_Reference_ID=149;
/** Set Credit Card.
@param CreditCardType Credit Card (Visa, MC, AmEx) */
public void setCreditCardType (String CreditCardType)
{
if (CreditCardType == null || CreditCardType.equals(REF_C_PaymentCreditCardType.Amex) || CreditCardType.equals(REF_C_PaymentCreditCardType.MasterCard) || CreditCardType.equals(REF_C_PaymentCreditCardType.Visa) || CreditCardType.equals(REF_C_PaymentCreditCardType.ATM) || CreditCardType.equals(REF_C_PaymentCreditCardType.PurchaseCard) || CreditCardType.equals(REF_C_PaymentCreditCardType.Diners) || CreditCardType.equals(REF_C_PaymentCreditCardType.Discover) || CreditCardType.equals(REF_C_PaymentCreditCardType.Ripley) || CreditCardType.equals(REF_C_PaymentCreditCardType.CMRFalabella));
 else throw new IllegalArgumentException ("CreditCardType Invalid value - " + CreditCardType + " - Reference_ID=149 - A - M - V - C - P - D - N - R - S");
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

@XendraTrl(Identifier="e4c77fa8-2da7-f315-862e-fcfd24e4671e")
public static String es_PE_FIELD_Payment_CreditCard_Description="Tarjeta de Crédito (Visa; MC; Am Ex)";

@XendraTrl(Identifier="e4c77fa8-2da7-f315-862e-fcfd24e4671e")
public static String es_PE_FIELD_Payment_CreditCard_Help="El cuadro de lista de tarjeta de crédito se usa para seleccionar el tipo de tarjeta de crédito presentada para  pago.";

@XendraTrl(Identifier="e4c77fa8-2da7-f315-862e-fcfd24e4671e")
public static String es_PE_FIELD_Payment_CreditCard_Name="Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardType",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4c77fa8-2da7-f315-862e-fcfd24e4671e")
public static final String FIELDNAME_Payment_CreditCard="e4c77fa8-2da7-f315-862e-fcfd24e4671e";

@XendraTrl(Identifier="a778d94d-f083-c312-4854-c838f60d7533")
public static String es_PE_COLUMN_CreditCardType_Name="Tarjeta de Crédito";

@XendraColumn(AD_Element_ID="22758af1-56f5-1e54-84a3-40d8827367a1",ColumnName="CreditCardType",
AD_Reference_ID=17,AD_Reference_Value_ID="5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a778d94d-f083-c312-4854-c838f60d7533",Synchronized="2017-08-05 16:54:56.0")
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
@XendraTrl(Identifier="f96a2f21-4fe0-0dd3-9c45-43aa41d72e0e")
public static String es_PE_FIELD_Payment_VerificationCode_Description="Código de verificación en la tarjeta de crédito";

@XendraTrl(Identifier="f96a2f21-4fe0-0dd3-9c45-43aa41d72e0e")
public static String es_PE_FIELD_Payment_VerificationCode_Help="La verificación de la tarjeta de crédito indica el código de verificación en la tarjeta de crédito (AMEX 4 digitos en frente; MC;Visa 3 digitos)";

@XendraTrl(Identifier="f96a2f21-4fe0-0dd3-9c45-43aa41d72e0e")
public static String es_PE_FIELD_Payment_VerificationCode_Name="Verificación de Tarjeta de Crédito";

@XendraField(AD_Column_ID="CreditCardVV",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f96a2f21-4fe0-0dd3-9c45-43aa41d72e0e")
public static final String FIELDNAME_Payment_VerificationCode="f96a2f21-4fe0-0dd3-9c45-43aa41d72e0e";

@XendraTrl(Identifier="5655451e-1ddf-9187-4ae8-009161b863a4")
public static String es_PE_COLUMN_CreditCardVV_Name="Verificación de Tarjeta de Crédito";

@XendraColumn(AD_Element_ID="cfff0a60-ada3-c9c2-d76e-7f805447f51b",ColumnName="CreditCardVV",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5655451e-1ddf-9187-4ae8-009161b863a4",
Synchronized="2017-08-05 16:54:56.0")
/** Column name CreditCardVV */
public static final String COLUMNNAME_CreditCardVV = "CreditCardVV";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="a1477a60-9fb3-1825-9be4-5336a48e4434")
public static String es_PE_FIELD_Payment_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="a1477a60-9fb3-1825-9be4-5336a48e4434")
public static String es_PE_FIELD_Payment_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="a1477a60-9fb3-1825-9be4-5336a48e4434")
public static String es_PE_FIELD_Payment_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1477a60-9fb3-1825-9be4-5336a48e4434")
public static final String FIELDNAME_Payment_AccountDate="a1477a60-9fb3-1825-9be4-5336a48e4434";

@XendraTrl(Identifier="5189113c-b6d7-cb7a-d608-0d5704cae8e2")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5189113c-b6d7-cb7a-d608-0d5704cae8e2",
Synchronized="2017-08-05 16:54:56.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
set_Value (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="b0d6ed38-a2ac-f2f2-fb2b-39cfcf45ef85")
public static String es_PE_FIELD_Payment_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="b0d6ed38-a2ac-f2f2-fb2b-39cfcf45ef85")
public static String es_PE_FIELD_Payment_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="b0d6ed38-a2ac-f2f2-fb2b-39cfcf45ef85")
public static String es_PE_FIELD_Payment_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0d6ed38-a2ac-f2f2-fb2b-39cfcf45ef85")
public static final String FIELDNAME_Payment_TransactionDate="b0d6ed38-a2ac-f2f2-fb2b-39cfcf45ef85";

@XendraTrl(Identifier="2fc91d2e-520d-3983-481e-256ff20ae4ed")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fc91d2e-520d-3983-481e-256ff20ae4ed",
Synchronized="2017-08-05 16:54:56.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
/** Set Discount Amount.
@param DiscountAmt Calculated amount of discount */
public void setDiscountAmt (BigDecimal DiscountAmt)
{
set_Value (COLUMNNAME_DiscountAmt, DiscountAmt);
}
/** Get Discount Amount.
@return Calculated amount of discount */
public BigDecimal getDiscountAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="07b3e0fb-c105-708a-22cb-323dc8f85af2")
public static String es_PE_FIELD_Payment_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="07b3e0fb-c105-708a-22cb-323dc8f85af2")
public static String es_PE_FIELD_Payment_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraTrl(Identifier="07b3e0fb-c105-708a-22cb-323dc8f85af2")
public static String es_PE_FIELD_Payment_DiscountAmount_Name="Total del Descuento";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07b3e0fb-c105-708a-22cb-323dc8f85af2")
public static final String FIELDNAME_Payment_DiscountAmount="07b3e0fb-c105-708a-22cb-323dc8f85af2";

@XendraTrl(Identifier="12b005fc-85da-5ec6-ef56-ddd79ebefa47")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12b005fc-85da-5ec6-ef56-ddd79ebefa47",
Synchronized="2017-08-05 16:54:56.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";
/** Set Document Type Name.
@param DocTypeName Name of the Document Type */
public void setDocTypeName (String DocTypeName)
{
if (DocTypeName != null && DocTypeName.length() > 60)
{
log.warning("Length > 60 - truncated");
DocTypeName = DocTypeName.substring(0,59);
}
set_Value (COLUMNNAME_DocTypeName, DocTypeName);
}
/** Get Document Type Name.
@return Name of the Document Type */
public String getDocTypeName() 
{
String value = (String)get_Value(COLUMNNAME_DocTypeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f1e51d77-369e-8467-a795-1f7e7983c6b1")
public static String es_PE_FIELD_Payment_DocumentTypeName_Description="Nombre del tipo de documento";

@XendraTrl(Identifier="f1e51d77-369e-8467-a795-1f7e7983c6b1")
public static String es_PE_FIELD_Payment_DocumentTypeName_Name="Nombre del Tipo de Documento";

@XendraField(AD_Column_ID="DocTypeName",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1e51d77-369e-8467-a795-1f7e7983c6b1")
public static final String FIELDNAME_Payment_DocumentTypeName="f1e51d77-369e-8467-a795-1f7e7983c6b1";

@XendraTrl(Identifier="6f796072-e6cc-4b10-a302-ba4fda3a616d")
public static String es_PE_COLUMN_DocTypeName_Name="Nombre del Tipo de Documento";

@XendraColumn(AD_Element_ID="af613457-d4ac-9b3e-87a0-02ba8501326b",ColumnName="DocTypeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f796072-e6cc-4b10-a302-ba4fda3a616d",
Synchronized="2017-08-05 16:54:56.0")
/** Column name DocTypeName */
public static final String COLUMNNAME_DocTypeName = "DocTypeName";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fb957511-e01b-5e7c-5790-1c14fe122901")
public static String es_PE_FIELD_Payment_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="fb957511-e01b-5e7c-5790-1c14fe122901")
public static String es_PE_FIELD_Payment_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="fb957511-e01b-5e7c-5790-1c14fe122901")
public static String es_PE_FIELD_Payment_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb957511-e01b-5e7c-5790-1c14fe122901")
public static final String FIELDNAME_Payment_DocumentNo="fb957511-e01b-5e7c-5790-1c14fe122901";

@XendraTrl(Identifier="2d8abe3e-05e2-dd87-2778-cd3c3c3636d7")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d8abe3e-05e2-dd87-2778-cd3c3c3636d7",
Synchronized="2017-08-05 16:54:56.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="0f55b48e-8dae-4f86-9cba-2753716b360c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f55b48e-8dae-4f86-9cba-2753716b360c",
Synchronized="2017-08-05 16:54:56.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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
@XendraTrl(Identifier="dc5d6cb0-1318-aee5-61a8-81b953980396")
public static String es_PE_FIELD_Payment_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="dc5d6cb0-1318-aee5-61a8-81b953980396")
public static String es_PE_FIELD_Payment_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraTrl(Identifier="dc5d6cb0-1318-aee5-61a8-81b953980396")
public static String es_PE_FIELD_Payment_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc5d6cb0-1318-aee5-61a8-81b953980396")
public static final String FIELDNAME_Payment_ImportErrorMessage="dc5d6cb0-1318-aee5-61a8-81b953980396";

@XendraTrl(Identifier="5b91d8d1-d669-2ddc-a6f6-31add363cf72")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b91d8d1-d669-2ddc-a6f6-31add363cf72",
Synchronized="2017-08-05 16:54:56.0")
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

@XendraTrl(Identifier="bda7e8a0-0fa6-10e6-310a-5beee48c46d1")
public static String es_PE_FIELD_Payment_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="bda7e8a0-0fa6-10e6-310a-5beee48c46d1")
public static String es_PE_FIELD_Payment_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraTrl(Identifier="bda7e8a0-0fa6-10e6-310a-5beee48c46d1")
public static String es_PE_FIELD_Payment_Imported_Name="Importar";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bda7e8a0-0fa6-10e6-310a-5beee48c46d1")
public static final String FIELDNAME_Payment_Imported="bda7e8a0-0fa6-10e6-310a-5beee48c46d1";

@XendraTrl(Identifier="a73af8e6-0180-0fdc-fab7-4782a3f2718c")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a73af8e6-0180-0fdc-fab7-4782a3f2718c",
Synchronized="2017-08-05 16:54:56.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Invoice Document No.
@param InvoiceDocumentNo Document Number of the Invoice */
public void setInvoiceDocumentNo (String InvoiceDocumentNo)
{
if (InvoiceDocumentNo != null && InvoiceDocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
InvoiceDocumentNo = InvoiceDocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_InvoiceDocumentNo, InvoiceDocumentNo);
}
/** Get Invoice Document No.
@return Document Number of the Invoice */
public String getInvoiceDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_InvoiceDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="77a8f200-bfbd-d367-438d-3ba39e4a4325")
public static String es_PE_FIELD_Payment_InvoiceDocumentNo_Description="Número de documento en la factura";

@XendraTrl(Identifier="77a8f200-bfbd-d367-438d-3ba39e4a4325")
public static String es_PE_FIELD_Payment_InvoiceDocumentNo_Name="No. de Documento Factura";

@XendraField(AD_Column_ID="InvoiceDocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77a8f200-bfbd-d367-438d-3ba39e4a4325")
public static final String FIELDNAME_Payment_InvoiceDocumentNo="77a8f200-bfbd-d367-438d-3ba39e4a4325";

@XendraTrl(Identifier="4712304a-2812-9abc-81c9-cec819cf6ec4")
public static String es_PE_COLUMN_InvoiceDocumentNo_Name="No. de Documento Factura";

@XendraColumn(AD_Element_ID="8fe4a47f-1637-81de-48d3-f43e7643d57d",ColumnName="InvoiceDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4712304a-2812-9abc-81c9-cec819cf6ec4",
Synchronized="2017-08-05 16:54:56.0")
/** Column name InvoiceDocumentNo */
public static final String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";
/** Set Import Payment.
@param I_Payment_ID Import Payment */
public void setI_Payment_ID (int I_Payment_ID)
{
if (I_Payment_ID < 1) throw new IllegalArgumentException ("I_Payment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_Payment_ID, Integer.valueOf(I_Payment_ID));
}
/** Get Import Payment.
@return Import Payment */
public int getI_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a87e50bf-382a-4e9e-908d-046a554cfe36")
public static String es_PE_FIELD_Payment_ImportPayment_Description="Importar Pagos";

@XendraTrl(Identifier="a87e50bf-382a-4e9e-908d-046a554cfe36")
public static String es_PE_FIELD_Payment_ImportPayment_Name="Importar Pagos";

@XendraField(AD_Column_ID="I_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a87e50bf-382a-4e9e-908d-046a554cfe36")
public static final String FIELDNAME_Payment_ImportPayment="a87e50bf-382a-4e9e-908d-046a554cfe36";
/** Column name I_Payment_ID */
public static final String COLUMNNAME_I_Payment_ID = "I_Payment_ID";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="891f7a6f-7902-a290-64a0-3fda3a31343c")
public static String es_PE_FIELD_Payment_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="891f7a6f-7902-a290-64a0-3fda3a31343c")
public static String es_PE_FIELD_Payment_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="891f7a6f-7902-a290-64a0-3fda3a31343c")
public static String es_PE_FIELD_Payment_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="891f7a6f-7902-a290-64a0-3fda3a31343c")
public static final String FIELDNAME_Payment_Approved="891f7a6f-7902-a290-64a0-3fda3a31343c";

@XendraTrl(Identifier="26769c16-1933-cbf1-1029-f6161cd11308")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26769c16-1933-cbf1-1029-f6161cd11308",
Synchronized="2017-08-05 16:54:56.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Delayed Capture.
@param IsDelayedCapture Charge after Shipment */
public void setIsDelayedCapture (boolean IsDelayedCapture)
{
set_Value (COLUMNNAME_IsDelayedCapture, Boolean.valueOf(IsDelayedCapture));
}
/** Get Delayed Capture.
@return Charge after Shipment */
public boolean isDelayedCapture() 
{
Object oo = get_Value(COLUMNNAME_IsDelayedCapture);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c4b54e33-9f46-1773-fddc-a78e2569479d")
public static String es_PE_FIELD_Payment_DelayedCapture_Description="Cargo despues del envio";

@XendraTrl(Identifier="c4b54e33-9f46-1773-fddc-a78e2569479d")
public static String es_PE_FIELD_Payment_DelayedCapture_Help="Se requiere la captura retrasada, si usted envía productos. La primera transacción de la tarjeta de crédito es la autorización, el segundo es la transacción real después del envío del producto.";

@XendraTrl(Identifier="c4b54e33-9f46-1773-fddc-a78e2569479d")
public static String es_PE_FIELD_Payment_DelayedCapture_Name="Captura Retardada";

@XendraField(AD_Column_ID="IsDelayedCapture",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4b54e33-9f46-1773-fddc-a78e2569479d")
public static final String FIELDNAME_Payment_DelayedCapture="c4b54e33-9f46-1773-fddc-a78e2569479d";

@XendraTrl(Identifier="4967ede1-99ec-7b57-6629-a0509145e3b0")
public static String es_PE_COLUMN_IsDelayedCapture_Name="Captura Retardada";

@XendraColumn(AD_Element_ID="badfa246-719d-629f-87ac-4f1f66feb16c",ColumnName="IsDelayedCapture",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4967ede1-99ec-7b57-6629-a0509145e3b0",
Synchronized="2017-08-05 16:54:56.0")
/** Column name IsDelayedCapture */
public static final String COLUMNNAME_IsDelayedCapture = "IsDelayedCapture";
/** Set ISO Currency Code.
@param ISO_Code Three letter ISO 4217 Code of the Currency */
public void setISO_Code (String ISO_Code)
{
if (ISO_Code != null && ISO_Code.length() > 3)
{
log.warning("Length > 3 - truncated");
ISO_Code = ISO_Code.substring(0,2);
}
set_Value (COLUMNNAME_ISO_Code, ISO_Code);
}
/** Get ISO Currency Code.
@return Three letter ISO 4217 Code of the Currency */
public String getISO_Code() 
{
String value = (String)get_Value(COLUMNNAME_ISO_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d804d6cc-30a8-70f1-1414-e146fc568380")
public static String es_PE_FIELD_Payment_ISOCurrencyCode_Description="Código ISO 4217 de la moneda";

@XendraTrl(Identifier="d804d6cc-30a8-70f1-1414-e146fc568380")
public static String es_PE_FIELD_Payment_ISOCurrencyCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraTrl(Identifier="d804d6cc-30a8-70f1-1414-e146fc568380")
public static String es_PE_FIELD_Payment_ISOCurrencyCode_Name="Código ISO";

@XendraField(AD_Column_ID="ISO_Code",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=3,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d804d6cc-30a8-70f1-1414-e146fc568380")
public static final String FIELDNAME_Payment_ISOCurrencyCode="d804d6cc-30a8-70f1-1414-e146fc568380";

@XendraTrl(Identifier="b7b1f261-35f3-0a97-8199-741191a0b855")
public static String es_PE_COLUMN_ISO_Code_Name="Código ISO";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7b1f261-35f3-0a97-8199-741191a0b855",
Synchronized="2017-08-05 16:54:56.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";
/** Set Over/Under Payment.
@param IsOverUnderPayment Over-Payment (unallocated) or Under-Payment (partial payment) */
public void setIsOverUnderPayment (boolean IsOverUnderPayment)
{
set_Value (COLUMNNAME_IsOverUnderPayment, Boolean.valueOf(IsOverUnderPayment));
}
/** Get Over/Under Payment.
@return Over-Payment (unallocated) or Under-Payment (partial payment) */
public boolean isOverUnderPayment() 
{
Object oo = get_Value(COLUMNNAME_IsOverUnderPayment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a4365d0d-0757-b502-9455-d0996d630ddf")
public static String es_PE_FIELD_Payment_OverUnderPayment_Description="Sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="a4365d0d-0757-b502-9455-d0996d630ddf")
public static String es_PE_FIELD_Payment_OverUnderPayment_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="a4365d0d-0757-b502-9455-d0996d630ddf")
public static String es_PE_FIELD_Payment_OverUnderPayment_Name="Sobre/sub pago";

@XendraField(AD_Column_ID="IsOverUnderPayment",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4365d0d-0757-b502-9455-d0996d630ddf")
public static final String FIELDNAME_Payment_OverUnderPayment="a4365d0d-0757-b502-9455-d0996d630ddf";

@XendraTrl(Identifier="e0e2ff37-23ec-b9a6-0864-557a40bd4be8")
public static String es_PE_COLUMN_IsOverUnderPayment_Name="Sobre/sub pago";

@XendraColumn(AD_Element_ID="2c24379d-5a56-e5ee-c09f-632905d4e52f",ColumnName="IsOverUnderPayment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0e2ff37-23ec-b9a6-0864-557a40bd4be8",
Synchronized="2017-08-05 16:54:56.0")
/** Column name IsOverUnderPayment */
public static final String COLUMNNAME_IsOverUnderPayment = "IsOverUnderPayment";
/** Set Receipt.
@param IsReceipt This is a sales transaction (receipt) */
public void setIsReceipt (boolean IsReceipt)
{
set_Value (COLUMNNAME_IsReceipt, Boolean.valueOf(IsReceipt));
}
/** Get Receipt.
@return This is a sales transaction (receipt) */
public boolean isReceipt() 
{
Object oo = get_Value(COLUMNNAME_IsReceipt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="aa802040-abff-d082-b0e4-cbe588a6f29d")
public static String es_PE_FIELD_Payment_Receipt_Description="Ésta es una transacción de ventas (Cobros)";

@XendraTrl(Identifier="aa802040-abff-d082-b0e4-cbe588a6f29d")
public static String es_PE_FIELD_Payment_Receipt_Name="Cobros";

@XendraField(AD_Column_ID="IsReceipt",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa802040-abff-d082-b0e4-cbe588a6f29d")
public static final String FIELDNAME_Payment_Receipt="aa802040-abff-d082-b0e4-cbe588a6f29d";

@XendraTrl(Identifier="873bdedd-2790-12d8-e186-7103644e9fb2")
public static String es_PE_COLUMN_IsReceipt_Name="Cobros";

@XendraColumn(AD_Element_ID="68c0f386-4097-c612-05c3-316e89cb3692",ColumnName="IsReceipt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="873bdedd-2790-12d8-e186-7103644e9fb2",
Synchronized="2017-08-05 16:54:56.0")
/** Column name IsReceipt */
public static final String COLUMNNAME_IsReceipt = "IsReceipt";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="72687d7c-71d1-2b03-540e-4130b4b7d111")
public static String es_PE_FIELD_Payment_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="72687d7c-71d1-2b03-540e-4130b4b7d111")
public static String es_PE_FIELD_Payment_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="72687d7c-71d1-2b03-540e-4130b4b7d111")
public static String es_PE_FIELD_Payment_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72687d7c-71d1-2b03-540e-4130b4b7d111")
public static final String FIELDNAME_Payment_Self_Service="72687d7c-71d1-2b03-540e-4130b4b7d111";

@XendraTrl(Identifier="4160b500-d4c5-b90d-9e68-0391fe73e1e9")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4160b500-d4c5-b90d-9e68-0391fe73e1e9",
Synchronized="2017-08-05 16:54:56.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Micr.
@param Micr Combination of routing no, account and check no */
public void setMicr (String Micr)
{
if (Micr != null && Micr.length() > 20)
{
log.warning("Length > 20 - truncated");
Micr = Micr.substring(0,19);
}
set_Value (COLUMNNAME_Micr, Micr);
}
/** Get Micr.
@return Combination of routing no, account and check no */
public String getMicr() 
{
String value = (String)get_Value(COLUMNNAME_Micr);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="be3dac61-791f-2a27-1eec-5fcbfb4121d3")
public static String es_PE_FIELD_Payment_Micr_Description="Combinación de No. de Sucursal; Cta. y Cheque";

@XendraTrl(Identifier="be3dac61-791f-2a27-1eec-5fcbfb4121d3")
public static String es_PE_FIELD_Payment_Micr_Help="El número Micr es la combinación del número de sucursal del banco; número de cuenta y número de cheque.";

@XendraTrl(Identifier="be3dac61-791f-2a27-1eec-5fcbfb4121d3")
public static String es_PE_FIELD_Payment_Micr_Name="Sucursal; Cta.; No. Cheque";

@XendraField(AD_Column_ID="Micr",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be3dac61-791f-2a27-1eec-5fcbfb4121d3")
public static final String FIELDNAME_Payment_Micr="be3dac61-791f-2a27-1eec-5fcbfb4121d3";

@XendraTrl(Identifier="5242bb4d-c637-019d-96b4-590864bfaaca")
public static String es_PE_COLUMN_Micr_Name="Sucursal; Cta.; No. Cheque";

@XendraColumn(AD_Element_ID="0b752d44-f881-42b3-cecc-a50231c4a36d",ColumnName="Micr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5242bb4d-c637-019d-96b4-590864bfaaca",
Synchronized="2017-08-05 16:54:56.0")
/** Column name Micr */
public static final String COLUMNNAME_Micr = "Micr";
/** Set Original Transaction ID.
@param Orig_TrxID Original Transaction ID */
public void setOrig_TrxID (String Orig_TrxID)
{
if (Orig_TrxID != null && Orig_TrxID.length() > 20)
{
log.warning("Length > 20 - truncated");
Orig_TrxID = Orig_TrxID.substring(0,19);
}
set_Value (COLUMNNAME_Orig_TrxID, Orig_TrxID);
}
/** Get Original Transaction ID.
@return Original Transaction ID */
public String getOrig_TrxID() 
{
String value = (String)get_Value(COLUMNNAME_Orig_TrxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c58b9d37-bee1-2e23-21e3-13a8a0d1862d")
public static String es_PE_FIELD_Payment_OriginalTransactionID_Description="ID de la transacción original";

@XendraTrl(Identifier="c58b9d37-bee1-2e23-21e3-13a8a0d1862d")
public static String es_PE_FIELD_Payment_OriginalTransactionID_Help="La ID de la transacción original se usa para restaurar transacciones e indica la transacción a ser restaurada.";

@XendraTrl(Identifier="c58b9d37-bee1-2e23-21e3-13a8a0d1862d")
public static String es_PE_FIELD_Payment_OriginalTransactionID_Name="ID de la Transacción Original";

@XendraField(AD_Column_ID="Orig_TrxID",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c58b9d37-bee1-2e23-21e3-13a8a0d1862d")
public static final String FIELDNAME_Payment_OriginalTransactionID="c58b9d37-bee1-2e23-21e3-13a8a0d1862d";

@XendraTrl(Identifier="374e9fb8-73b4-6b08-dce9-a16b809049e4")
public static String es_PE_COLUMN_Orig_TrxID_Name="ID de la Transacción Original";

@XendraColumn(AD_Element_ID="e16848a0-0be3-8619-06f3-ad80fefbab90",ColumnName="Orig_TrxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="374e9fb8-73b4-6b08-dce9-a16b809049e4",
Synchronized="2017-08-05 16:54:56.0")
/** Column name Orig_TrxID */
public static final String COLUMNNAME_Orig_TrxID = "Orig_TrxID";
/** Set Over/Under Payment.
@param OverUnderAmt Over-Payment (unallocated) or Under-Payment (partial payment) Amount */
public void setOverUnderAmt (BigDecimal OverUnderAmt)
{
set_Value (COLUMNNAME_OverUnderAmt, OverUnderAmt);
}
/** Get Over/Under Payment.
@return Over-Payment (unallocated) or Under-Payment (partial payment) Amount */
public BigDecimal getOverUnderAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OverUnderAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="40a0087d-9206-6ce5-6869-a1854890da42")
public static String es_PE_FIELD_Payment_OverUnderPayment2_Description="Total de sobre pago (no contabilizado) ó sub pago (pago parcial)";

@XendraTrl(Identifier="40a0087d-9206-6ce5-6869-a1854890da42")
public static String es_PE_FIELD_Payment_OverUnderPayment2_Help="Sobre pagos (negativos) son totales no contabilizados y permiten recibir dinero por totales superiores a una factura particular. Sub pagos (positivo) es un pago parcial de una factura. No se saca de libros la cantidad no pagada.";

@XendraTrl(Identifier="40a0087d-9206-6ce5-6869-a1854890da42")
public static String es_PE_FIELD_Payment_OverUnderPayment2_Name="Totales con sobre/sub pago";

@XendraField(AD_Column_ID="OverUnderAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40a0087d-9206-6ce5-6869-a1854890da42")
public static final String FIELDNAME_Payment_OverUnderPayment2="40a0087d-9206-6ce5-6869-a1854890da42";

@XendraTrl(Identifier="cda94162-908f-6cb9-39b7-ec1b80a63882")
public static String es_PE_COLUMN_OverUnderAmt_Name="Totales con sobre/sub pago";

@XendraColumn(AD_Element_ID="c1b8d715-3799-d069-9abd-dcbda10d4c2a",ColumnName="OverUnderAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cda94162-908f-6cb9-39b7-ec1b80a63882",
Synchronized="2017-08-05 16:54:56.0")
/** Column name OverUnderAmt */
public static final String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
/** Set Payment amount.
@param PayAmt Amount being paid */
public void setPayAmt (BigDecimal PayAmt)
{
set_Value (COLUMNNAME_PayAmt, PayAmt);
}
/** Get Payment amount.
@return Amount being paid */
public BigDecimal getPayAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PayAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fdfbf50d-2e85-a9ad-3b48-80c964e06b42")
public static String es_PE_FIELD_Payment_PaymentAmount_Description="Total siendo pagado";

@XendraTrl(Identifier="fdfbf50d-2e85-a9ad-3b48-80c964e06b42")
public static String es_PE_FIELD_Payment_PaymentAmount_Help="Indica el total a pagar. El total del pago puede ser para una factura simple, múltiple ó un pago parcial de una factura.";

@XendraTrl(Identifier="fdfbf50d-2e85-a9ad-3b48-80c964e06b42")
public static String es_PE_FIELD_Payment_PaymentAmount_Name="Total del Pago";

@XendraField(AD_Column_ID="PayAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdfbf50d-2e85-a9ad-3b48-80c964e06b42")
public static final String FIELDNAME_Payment_PaymentAmount="fdfbf50d-2e85-a9ad-3b48-80c964e06b42";

@XendraTrl(Identifier="93471b34-b45d-aa7a-924a-d2e977fbeec2")
public static String es_PE_COLUMN_PayAmt_Name="Total del Pago";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93471b34-b45d-aa7a-924a-d2e977fbeec2",
Synchronized="2017-08-05 16:54:56.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
/** Set PO Number.
@param PONum Purchase Order Number */
public void setPONum (String PONum)
{
if (PONum != null && PONum.length() > 60)
{
log.warning("Length > 60 - truncated");
PONum = PONum.substring(0,59);
}
set_Value (COLUMNNAME_PONum, PONum);
}
/** Get PO Number.
@return Purchase Order Number */
public String getPONum() 
{
String value = (String)get_Value(COLUMNNAME_PONum);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d21c8f52-3e6a-fb31-2925-abf421af1c23")
public static String es_PE_FIELD_Payment_PONumber_Description="Número de Orden de Compra";

@XendraTrl(Identifier="d21c8f52-3e6a-fb31-2925-abf421af1c23")
public static String es_PE_FIELD_Payment_PONumber_Help="El Número de OC indica el número asignado a una orden de compras";

@XendraTrl(Identifier="d21c8f52-3e6a-fb31-2925-abf421af1c23")
public static String es_PE_FIELD_Payment_PONumber_Name="Número de OC";

@XendraField(AD_Column_ID="PONum",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d21c8f52-3e6a-fb31-2925-abf421af1c23")
public static final String FIELDNAME_Payment_PONumber="d21c8f52-3e6a-fb31-2925-abf421af1c23";

@XendraTrl(Identifier="81c09f6e-bccb-af8d-3a7a-1c9194f11154")
public static String es_PE_COLUMN_PONum_Name="Número de OC";

@XendraColumn(AD_Element_ID="05310437-552a-2dc7-2b71-517dbacef9d4",ColumnName="PONum",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81c09f6e-bccb-af8d-3a7a-1c9194f11154",
Synchronized="2017-08-05 16:54:56.0")
/** Column name PONum */
public static final String COLUMNNAME_PONum = "PONum";
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

@XendraTrl(Identifier="e123f8a2-265b-f15f-c82a-ed44615bb928")
public static String es_PE_FIELD_Payment_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="e123f8a2-265b-f15f-c82a-ed44615bb928")
public static String es_PE_FIELD_Payment_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="e123f8a2-265b-f15f-c82a-ed44615bb928")
public static String es_PE_FIELD_Payment_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e123f8a2-265b-f15f-c82a-ed44615bb928")
public static final String FIELDNAME_Payment_Processed="e123f8a2-265b-f15f-c82a-ed44615bb928";

@XendraTrl(Identifier="7416ea91-d27d-2e55-ce63-a22bbe79a5a6")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7416ea91-d27d-2e55-ce63-a22bbe79a5a6",
Synchronized="2017-08-05 16:54:56.0")
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

@XendraTrl(Identifier="ead00c3d-3baf-bbc1-3f1f-9b3cf5e36229")
public static String es_PE_FIELD_Payment_ProcessNow_Description="Import Payments";

@XendraTrl(Identifier="ead00c3d-3baf-bbc1-3f1f-9b3cf5e36229")
public static String es_PE_FIELD_Payment_ProcessNow_Help="The Parameters are default values for null import record values, they do not overwrite any data.";

@XendraTrl(Identifier="ead00c3d-3baf-bbc1-3f1f-9b3cf5e36229")
public static String es_PE_FIELD_Payment_ProcessNow_Name="Import Payments";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ead00c3d-3baf-bbc1-3f1f-9b3cf5e36229")
public static final String FIELDNAME_Payment_ProcessNow="ead00c3d-3baf-bbc1-3f1f-9b3cf5e36229";

@XendraTrl(Identifier="42eed5d5-e827-5530-681b-29180b283d26")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="427aa321-2d6a-6858-0f2a-5d25be9b95fc",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="42eed5d5-e827-5530-681b-29180b283d26",Synchronized="2017-08-05 16:54:56.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Authorization Code.
@param R_AuthCode Authorization Code returned */
public void setR_AuthCode (String R_AuthCode)
{
if (R_AuthCode != null && R_AuthCode.length() > 20)
{
log.warning("Length > 20 - truncated");
R_AuthCode = R_AuthCode.substring(0,19);
}
set_Value (COLUMNNAME_R_AuthCode, R_AuthCode);
}
/** Get Authorization Code.
@return Authorization Code returned */
public String getR_AuthCode() 
{
String value = (String)get_Value(COLUMNNAME_R_AuthCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="336c6130-7bb4-2abe-8b15-06d8009c048d")
public static String es_PE_FIELD_Payment_AuthorizationCode_Description="Autorización del Código devuelto";

@XendraTrl(Identifier="336c6130-7bb4-2abe-8b15-06d8009c048d")
public static String es_PE_FIELD_Payment_AuthorizationCode_Help="El código de autorización indica el código devuelto desde la transmisión electrónica";

@XendraTrl(Identifier="336c6130-7bb4-2abe-8b15-06d8009c048d")
public static String es_PE_FIELD_Payment_AuthorizationCode_Name="Código de Autorización";

@XendraField(AD_Column_ID="R_AuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="336c6130-7bb4-2abe-8b15-06d8009c048d")
public static final String FIELDNAME_Payment_AuthorizationCode="336c6130-7bb4-2abe-8b15-06d8009c048d";

@XendraTrl(Identifier="2bd73efc-1d1a-e423-3e72-cd8878879683")
public static String es_PE_COLUMN_R_AuthCode_Name="Código de Autorización";

@XendraColumn(AD_Element_ID="aba120af-b02d-16f6-4b52-dac37c17a92b",ColumnName="R_AuthCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2bd73efc-1d1a-e423-3e72-cd8878879683",
Synchronized="2017-08-05 16:54:56.0")
/** Column name R_AuthCode */
public static final String COLUMNNAME_R_AuthCode = "R_AuthCode";
/** Set Info.
@param R_Info Response info */
public void setR_Info (String R_Info)
{
if (R_Info != null && R_Info.length() > 2000)
{
log.warning("Length > 2000 - truncated");
R_Info = R_Info.substring(0,1999);
}
set_Value (COLUMNNAME_R_Info, R_Info);
}
/** Get Info.
@return Response info */
public String getR_Info() 
{
String value = (String)get_Value(COLUMNNAME_R_Info);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4597c127-5bb0-43d8-7309-7e020657740c")
public static String es_PE_FIELD_Payment_Info_Description="Respuesta info";

@XendraTrl(Identifier="4597c127-5bb0-43d8-7309-7e020657740c")
public static String es_PE_FIELD_Payment_Info_Help="La Info indica cualquier información de respuesta de la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="4597c127-5bb0-43d8-7309-7e020657740c")
public static String es_PE_FIELD_Payment_Info_Name="Información";

@XendraField(AD_Column_ID="R_Info",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4597c127-5bb0-43d8-7309-7e020657740c")
public static final String FIELDNAME_Payment_Info="4597c127-5bb0-43d8-7309-7e020657740c";

@XendraTrl(Identifier="9dd350bb-95b9-8cd0-beae-ebccd2a65517")
public static String es_PE_COLUMN_R_Info_Name="Información";

@XendraColumn(AD_Element_ID="9c1c4fed-0da5-ba9d-ce5a-5a95fe04f610",ColumnName="R_Info",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9dd350bb-95b9-8cd0-beae-ebccd2a65517",
Synchronized="2017-08-05 16:54:56.0")
/** Column name R_Info */
public static final String COLUMNNAME_R_Info = "R_Info";
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
@XendraTrl(Identifier="bbd8f9d8-1c66-e126-4f3f-13b2d7c7cada")
public static String es_PE_FIELD_Payment_RoutingNo_Description="Número de sucursal bancaria";

@XendraTrl(Identifier="bbd8f9d8-1c66-e126-4f3f-13b2d7c7cada")
public static String es_PE_FIELD_Payment_RoutingNo_Help="El número de ruta del banco (Número ABA) identifica un banco legal. Se usa en ruteo de cheques y transacciones electrónicas.";

@XendraTrl(Identifier="bbd8f9d8-1c66-e126-4f3f-13b2d7c7cada")
public static String es_PE_FIELD_Payment_RoutingNo_Name="No. de Ruta";

@XendraField(AD_Column_ID="RoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbd8f9d8-1c66-e126-4f3f-13b2d7c7cada")
public static final String FIELDNAME_Payment_RoutingNo="bbd8f9d8-1c66-e126-4f3f-13b2d7c7cada";

@XendraTrl(Identifier="cff65fe3-bc13-e584-cedf-af16b8ede8a1")
public static String es_PE_COLUMN_RoutingNo_Name="No. de Ruta";

@XendraColumn(AD_Element_ID="6fe1dae1-ff7f-9b06-686b-31ba56524158",ColumnName="RoutingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cff65fe3-bc13-e584-cedf-af16b8ede8a1",
Synchronized="2017-08-05 16:54:56.0")
/** Column name RoutingNo */
public static final String COLUMNNAME_RoutingNo = "RoutingNo";
/** Set Reference.
@param R_PnRef Payment reference */
public void setR_PnRef (String R_PnRef)
{
if (R_PnRef != null && R_PnRef.length() > 20)
{
log.warning("Length > 20 - truncated");
R_PnRef = R_PnRef.substring(0,19);
}
set_Value (COLUMNNAME_R_PnRef, R_PnRef);
}
/** Get Reference.
@return Payment reference */
public String getR_PnRef() 
{
String value = (String)get_Value(COLUMNNAME_R_PnRef);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8bc75b6f-5432-69ee-a4aa-784c57825166")
public static String es_PE_FIELD_Payment_Reference_Description="Referencia del pago";

@XendraTrl(Identifier="8bc75b6f-5432-69ee-a4aa-784c57825166")
public static String es_PE_FIELD_Payment_Reference_Help="La Referencia de Pago indica la referencia devuelta de la compañía de la tarjeta de crédito para un pago";

@XendraTrl(Identifier="8bc75b6f-5432-69ee-a4aa-784c57825166")
public static String es_PE_FIELD_Payment_Reference_Name="Referencia";

@XendraField(AD_Column_ID="R_PnRef",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bc75b6f-5432-69ee-a4aa-784c57825166")
public static final String FIELDNAME_Payment_Reference="8bc75b6f-5432-69ee-a4aa-784c57825166";

@XendraTrl(Identifier="501f5896-0817-f742-b9ce-e44195959fee")
public static String es_PE_COLUMN_R_PnRef_Name="Referencia";

@XendraColumn(AD_Element_ID="bc667ce3-4709-a9f2-fdb7-0decdb6500a1",ColumnName="R_PnRef",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="501f5896-0817-f742-b9ce-e44195959fee",
Synchronized="2017-08-05 16:54:56.0")
/** Column name R_PnRef */
public static final String COLUMNNAME_R_PnRef = "R_PnRef";
/** Set Response Message.
@param R_RespMsg Response message */
public void setR_RespMsg (String R_RespMsg)
{
if (R_RespMsg != null && R_RespMsg.length() > 60)
{
log.warning("Length > 60 - truncated");
R_RespMsg = R_RespMsg.substring(0,59);
}
set_Value (COLUMNNAME_R_RespMsg, R_RespMsg);
}
/** Get Response Message.
@return Response message */
public String getR_RespMsg() 
{
String value = (String)get_Value(COLUMNNAME_R_RespMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1eaefbcd-cbf3-8692-634e-699cdebac4e3")
public static String es_PE_FIELD_Payment_ResponseMessage_Description="Mensaje de respuesta.";

@XendraTrl(Identifier="1eaefbcd-cbf3-8692-634e-699cdebac4e3")
public static String es_PE_FIELD_Payment_ResponseMessage_Help="El mensaje de respuesta indica el mensaje devuelto desde la compañía de la tarjeta de crédito como resultado de una transmisión.";

@XendraTrl(Identifier="1eaefbcd-cbf3-8692-634e-699cdebac4e3")
public static String es_PE_FIELD_Payment_ResponseMessage_Name="Mensaje";

@XendraField(AD_Column_ID="R_RespMsg",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1eaefbcd-cbf3-8692-634e-699cdebac4e3")
public static final String FIELDNAME_Payment_ResponseMessage="1eaefbcd-cbf3-8692-634e-699cdebac4e3";

@XendraTrl(Identifier="92a8fd3a-ce7a-8673-f685-a02a6c222ac2")
public static String es_PE_COLUMN_R_RespMsg_Name="Mensaje";

@XendraColumn(AD_Element_ID="201e2ce8-8ec2-bbb5-93e1-38822287784e",ColumnName="R_RespMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92a8fd3a-ce7a-8673-f685-a02a6c222ac2",
Synchronized="2017-08-05 16:54:56.0")
/** Column name R_RespMsg */
public static final String COLUMNNAME_R_RespMsg = "R_RespMsg";
/** Set Result.
@param R_Result Result of transmission */
public void setR_Result (String R_Result)
{
if (R_Result != null && R_Result.length() > 20)
{
log.warning("Length > 20 - truncated");
R_Result = R_Result.substring(0,19);
}
set_Value (COLUMNNAME_R_Result, R_Result);
}
/** Get Result.
@return Result of transmission */
public String getR_Result() 
{
String value = (String)get_Value(COLUMNNAME_R_Result);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f975a275-2575-80df-4078-035d2af35270")
public static String es_PE_FIELD_Payment_Result_Description="Resultado de la transmisión";

@XendraTrl(Identifier="f975a275-2575-80df-4078-035d2af35270")
public static String es_PE_FIELD_Payment_Result_Help="El resultado de la respuesta indica el resultado de la transmisión a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="f975a275-2575-80df-4078-035d2af35270")
public static String es_PE_FIELD_Payment_Result_Name="Resultado";

@XendraField(AD_Column_ID="R_Result",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f975a275-2575-80df-4078-035d2af35270")
public static final String FIELDNAME_Payment_Result="f975a275-2575-80df-4078-035d2af35270";

@XendraTrl(Identifier="3e66898d-a909-1e8e-df0e-d951f2e7a223")
public static String es_PE_COLUMN_R_Result_Name="Resultado";

@XendraColumn(AD_Element_ID="8348daed-16ca-c682-827b-0bacd5dbb1a1",ColumnName="R_Result",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e66898d-a909-1e8e-df0e-d951f2e7a223",
Synchronized="2017-08-05 16:54:56.0")
/** Column name R_Result */
public static final String COLUMNNAME_R_Result = "R_Result";
/** Set Swipe.
@param Swipe Track 1 and 2 of the Credit Card */
public void setSwipe (String Swipe)
{
if (Swipe != null && Swipe.length() > 80)
{
log.warning("Length > 80 - truncated");
Swipe = Swipe.substring(0,79);
}
set_Value (COLUMNNAME_Swipe, Swipe);
}
/** Get Swipe.
@return Track 1 and 2 of the Credit Card */
public String getSwipe() 
{
String value = (String)get_Value(COLUMNNAME_Swipe);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bd8d932c-3300-d058-42a2-3573426acd1d")
public static String es_PE_FIELD_Payment_Swipe_Description="Track 1 and 2 of the Credit Card";

@XendraTrl(Identifier="bd8d932c-3300-d058-42a2-3573426acd1d")
public static String es_PE_FIELD_Payment_Swipe_Help="Swiped information for Credit Card Presence Transactions";

@XendraTrl(Identifier="bd8d932c-3300-d058-42a2-3573426acd1d")
public static String es_PE_FIELD_Payment_Swipe_Name="Swipe";
@XendraField(AD_Column_ID="Swipe",
IsCentrallyMaintained=true,AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bd8d932c-3300-d058-42a2-3573426acd1d")
public static final String FIELDNAME_Payment_Swipe="bd8d932c-3300-d058-42a2-3573426acd1d";

@XendraTrl(Identifier="496bff2d-f9ff-2150-c117-aab04a8cb0f2")
public static String es_PE_COLUMN_Swipe_Name="Swipe";

@XendraColumn(AD_Element_ID="222d5f88-5d5d-a3f4-9fbb-5ea53d84ee2d",ColumnName="Swipe",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=80,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="496bff2d-f9ff-2150-c117-aab04a8cb0f2",
Synchronized="2017-08-05 16:54:56.0")
/** Column name Swipe */
public static final String COLUMNNAME_Swipe = "Swipe";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
set_Value (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b2318824-fc5d-b39a-ffad-8605b00890b0")
public static String es_PE_FIELD_Payment_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="b2318824-fc5d-b39a-ffad-8605b00890b0")
public static String es_PE_FIELD_Payment_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="b2318824-fc5d-b39a-ffad-8605b00890b0")
public static String es_PE_FIELD_Payment_TaxAmount_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2318824-fc5d-b39a-ffad-8605b00890b0")
public static final String FIELDNAME_Payment_TaxAmount="b2318824-fc5d-b39a-ffad-8605b00890b0";

@XendraTrl(Identifier="ade27949-453f-f493-e062-2e9a26a9ce5b")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ade27949-453f-f493-e062-2e9a26a9ce5b",
Synchronized="2017-08-05 16:54:56.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";

/** TenderType AD_Reference=99d2e48b-10ce-666f-5675-0a893b4e12aa */
public static final int TENDERTYPE_AD_Reference_ID=214;
/** Set Tender type.
@param TenderType Method of Payment */
public void setTenderType (String TenderType)
{
if (TenderType == null || TenderType.equals(REF_C_PaymentTenderType.Continet) || TenderType.equals(REF_C_PaymentTenderType.FEC) || TenderType.equals(REF_C_PaymentTenderType.Telecredito) || TenderType.equals(REF_C_PaymentTenderType.DirectDebit) || TenderType.equals(REF_C_PaymentTenderType.CreditCard) || TenderType.equals(REF_C_PaymentTenderType.Check) || TenderType.equals(REF_C_PaymentTenderType.BillOfExchange) || TenderType.equals(REF_C_PaymentTenderType.Giro) || TenderType.equals(REF_C_PaymentTenderType.DirectDeposit) || TenderType.equals(REF_C_PaymentTenderType.Transfer));
 else throw new IllegalArgumentException ("TenderType Invalid value - " + TenderType + " - Reference_ID=214 - CN - FC - TL - D - C - K - B - G - A - T");
if (TenderType != null && TenderType.length() > 1)
{
log.warning("Length > 1 - truncated");
TenderType = TenderType.substring(0,0);
}
set_Value (COLUMNNAME_TenderType, TenderType);
}
/** Get Tender type.
@return Method of Payment */
public String getTenderType() 
{
return (String)get_Value(COLUMNNAME_TenderType);
}

@XendraTrl(Identifier="a674325d-b379-fe83-616f-d7b0bf02bc37")
public static String es_PE_FIELD_Payment_TenderType_Description="Método de pago";

@XendraTrl(Identifier="a674325d-b379-fe83-616f-d7b0bf02bc37")
public static String es_PE_FIELD_Payment_TenderType_Help="El Tipo de Pago indica el método de pago  (ACH; Tarjeta de Crédito; Cheque)";

@XendraTrl(Identifier="a674325d-b379-fe83-616f-d7b0bf02bc37")
public static String es_PE_FIELD_Payment_TenderType_Name="Tipo de Pago";

@XendraField(AD_Column_ID="TenderType",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a674325d-b379-fe83-616f-d7b0bf02bc37")
public static final String FIELDNAME_Payment_TenderType="a674325d-b379-fe83-616f-d7b0bf02bc37";

@XendraTrl(Identifier="bda2e61f-f51e-9321-20cd-601df09a7809")
public static String es_PE_COLUMN_TenderType_Name="Tipo de Pago";

@XendraColumn(AD_Element_ID="a11558e0-04b1-3a6f-e53e-dd508c5dfc1c",ColumnName="TenderType",
AD_Reference_ID=17,AD_Reference_Value_ID="99d2e48b-10ce-666f-5675-0a893b4e12aa",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bda2e61f-f51e-9321-20cd-601df09a7809",Synchronized="2017-08-05 16:54:56.0")
/** Column name TenderType */
public static final String COLUMNNAME_TenderType = "TenderType";

/** TrxType AD_Reference=a083d7a1-2e00-66db-651c-da45d285eb24 */
public static final int TRXTYPE_AD_Reference_ID=215;
/** Set Transaction Type.
@param TrxType Type of credit card transaction */
public void setTrxType (String TrxType)
{
if (TrxType == null || TrxType.equals(REF_C_PaymentTrxType.Sales) || TrxType.equals(REF_C_PaymentTrxType.DelayedCapture) || TrxType.equals(REF_C_PaymentTrxType.CreditPayment) || TrxType.equals(REF_C_PaymentTrxType.VoiceAuthorization) || TrxType.equals(REF_C_PaymentTrxType.Authorization) || TrxType.equals(REF_C_PaymentTrxType.Void));
 else throw new IllegalArgumentException ("TrxType Invalid value - " + TrxType + " - Reference_ID=215 - S - D - C - F - A - V");
if (TrxType != null && TrxType.length() > 1)
{
log.warning("Length > 1 - truncated");
TrxType = TrxType.substring(0,0);
}
set_Value (COLUMNNAME_TrxType, TrxType);
}
/** Get Transaction Type.
@return Type of credit card transaction */
public String getTrxType() 
{
return (String)get_Value(COLUMNNAME_TrxType);
}

@XendraTrl(Identifier="03940734-f053-bbec-67e8-65ef1bb81289")
public static String es_PE_FIELD_Payment_TransactionType_Description="Tipo de transacción de la tarjeta de crédito";

@XendraTrl(Identifier="03940734-f053-bbec-67e8-65ef1bb81289")
public static String es_PE_FIELD_Payment_TransactionType_Help="El tipo de transacción indica el tipo de transacción a ser sometida a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="03940734-f053-bbec-67e8-65ef1bb81289")
public static String es_PE_FIELD_Payment_TransactionType_Name="Tipo de Transacción";

@XendraField(AD_Column_ID="TrxType",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03940734-f053-bbec-67e8-65ef1bb81289")
public static final String FIELDNAME_Payment_TransactionType="03940734-f053-bbec-67e8-65ef1bb81289";

@XendraTrl(Identifier="b15f46c4-4168-7eae-f089-897e7ba12717")
public static String es_PE_COLUMN_TrxType_Name="Tipo de Transacción";

@XendraColumn(AD_Element_ID="4d4a53c4-1cc3-27bd-5eb1-03412d96bc93",ColumnName="TrxType",
AD_Reference_ID=17,AD_Reference_Value_ID="a083d7a1-2e00-66db-651c-da45d285eb24",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b15f46c4-4168-7eae-f089-897e7ba12717",Synchronized="2017-08-05 16:54:56.0")
/** Column name TrxType */
public static final String COLUMNNAME_TrxType = "TrxType";
/** Set Voice authorization code.
@param VoiceAuthCode Voice Authorization Code from credit card company */
public void setVoiceAuthCode (String VoiceAuthCode)
{
if (VoiceAuthCode != null && VoiceAuthCode.length() > 20)
{
log.warning("Length > 20 - truncated");
VoiceAuthCode = VoiceAuthCode.substring(0,19);
}
set_Value (COLUMNNAME_VoiceAuthCode, VoiceAuthCode);
}
/** Get Voice authorization code.
@return Voice Authorization Code from credit card company */
public String getVoiceAuthCode() 
{
String value = (String)get_Value(COLUMNNAME_VoiceAuthCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d8a0ecec-c539-0510-31a8-e53d78d3d85e")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode_Description="Código de Autorización de voz de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="d8a0ecec-c539-0510-31a8-e53d78d3d85e")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode_Help="El Código de Autorización de Voz indica el código recibido de la compañía de la tarjeta de crédito";

@XendraTrl(Identifier="d8a0ecec-c539-0510-31a8-e53d78d3d85e")
public static String es_PE_FIELD_Payment_VoiceAuthorizationCode_Name="Código de Autorización de voz";

@XendraField(AD_Column_ID="VoiceAuthCode",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8a0ecec-c539-0510-31a8-e53d78d3d85e")
public static final String FIELDNAME_Payment_VoiceAuthorizationCode="d8a0ecec-c539-0510-31a8-e53d78d3d85e";

@XendraTrl(Identifier="5f89aa9c-135e-efbb-0c06-77617287f306")
public static String es_PE_COLUMN_VoiceAuthCode_Name="Código de Autorización de voz";

@XendraColumn(AD_Element_ID="eaa5a6bc-5695-2f97-4eb8-b88205498956",ColumnName="VoiceAuthCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f89aa9c-135e-efbb-0c06-77617287f306",
Synchronized="2017-08-05 16:54:56.0")
/** Column name VoiceAuthCode */
public static final String COLUMNNAME_VoiceAuthCode = "VoiceAuthCode";
/** Set Write-off Amount.
@param WriteOffAmt Amount to write-off */
public void setWriteOffAmt (BigDecimal WriteOffAmt)
{
set_Value (COLUMNNAME_WriteOffAmt, WriteOffAmt);
}
/** Get Write-off Amount.
@return Amount to write-off */
public BigDecimal getWriteOffAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WriteOffAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c019a2b9-cf34-b4aa-2f0e-48e2e1c60e20")
public static String es_PE_FIELD_Payment_Write_OffAmount_Description="Total por ajustar";

@XendraTrl(Identifier="c019a2b9-cf34-b4aa-2f0e-48e2e1c60e20")
public static String es_PE_FIELD_Payment_Write_OffAmount_Help="El Total de ajuste indica el total a ser ajustado como incobrable";

@XendraTrl(Identifier="c019a2b9-cf34-b4aa-2f0e-48e2e1c60e20")
public static String es_PE_FIELD_Payment_Write_OffAmount_Name="Total del Ajuste";

@XendraField(AD_Column_ID="WriteOffAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a7a53b1e-aaba-66d5-29fb-a5a3f947c7db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c019a2b9-cf34-b4aa-2f0e-48e2e1c60e20")
public static final String FIELDNAME_Payment_Write_OffAmount="c019a2b9-cf34-b4aa-2f0e-48e2e1c60e20";

@XendraTrl(Identifier="17fb0564-8060-ac00-127f-45305fa6d88c")
public static String es_PE_COLUMN_WriteOffAmt_Name="Total del Ajuste";

@XendraColumn(AD_Element_ID="5f70c6d6-fd9f-549c-363e-80eaef7df1c7",ColumnName="WriteOffAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17fb0564-8060-ac00-127f-45305fa6d88c",
Synchronized="2017-08-05 16:54:56.0")
/** Column name WriteOffAmt */
public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
}
