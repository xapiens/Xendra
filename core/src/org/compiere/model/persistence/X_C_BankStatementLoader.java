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
/** Generated Model for C_BankStatementLoader
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BankStatementLoader extends PO
{
/** Standard Constructor
@param ctx context
@param C_BankStatementLoader_ID id
@param trxName transaction
*/
public X_C_BankStatementLoader (Properties ctx, int C_BankStatementLoader_ID, String trxName)
{
super (ctx, C_BankStatementLoader_ID, trxName);
/** if (C_BankStatementLoader_ID == 0)
{
setC_BankAccount_ID (0);
setC_BankStatementLoader_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BankStatementLoader (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=640 */
public static int Table_ID=MTable.getTable_ID("C_BankStatementLoader");

@XendraTrl(Identifier="fd974730-4991-2758-6d49-3edcc51c12d3")
public static String es_PE_TAB_StatementLoader_Description="Definición del Cargador del Estado de Cuenta (SWIFT, OFX)";

@XendraTrl(Identifier="fd974730-4991-2758-6d49-3edcc51c12d3")
public static String es_PE_TAB_StatementLoader_Name="Cargador de Extrato de Cuenta";

@XendraTrl(Identifier="fd974730-4991-2758-6d49-3edcc51c12d3")
public static String es_PE_TAB_StatementLoader_Help="La Definición del Cargador de Parametros para cargar estados de cuenta EFT ajustar formato a gusto SWIFT (MT940) or OFX. Los parámetros requeridos dependen de la clase real del cargador de la declaración.";

@XendraTab(Name="Statement Loader",Description="Definition of Bank Statement Loader (SWIFT, OFX)",
Help="The loader definition privides the parameters to load bank statements from EFT formats like SWIFT (MT940) or OFX. The required parameters depend on the actual statement loader class",
AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",SeqNo=50,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="fd974730-4991-2758-6d49-3edcc51c12d3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_StatementLoader="fd974730-4991-2758-6d49-3edcc51c12d3";

@XendraTrl(Identifier="53b0c6ed-56ea-5cba-2252-7d6c1bf7df6a")
public static String es_PE_TABLE_C_BankStatementLoader_Name="Carga de Estado de Cuenta";


@XendraTable(Name="Bank Statement Loader",
Description="Definition of Bank Statement Loader (SWIFT, OFX)",Help="",
TableName="C_BankStatementLoader",AccessLevel="3",
AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="53b0c6ed-56ea-5cba-2252-7d6c1bf7df6a",
Synchronized="2017-08-16 11:41:24.0")
/** TableName=C_BankStatementLoader */
public static final String Table_Name="C_BankStatementLoader";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BankStatementLoader");

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
    Table_ID = MTable.getTable_ID("C_BankStatementLoader");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BankStatementLoader[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="09c525dc-aa71-94b3-8f58-3b25e28a3721")
public static String es_PE_FIELD_StatementLoader_AccountNo_Description="Número de cuenta";

@XendraTrl(Identifier="09c525dc-aa71-94b3-8f58-3b25e28a3721")
public static String es_PE_FIELD_StatementLoader_AccountNo_Help="El número de cuenta indica el número asignado a esta cuenta.";

@XendraTrl(Identifier="09c525dc-aa71-94b3-8f58-3b25e28a3721")
public static String es_PE_FIELD_StatementLoader_AccountNo_Name="No. De Cuenta";

@XendraField(AD_Column_ID="AccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09c525dc-aa71-94b3-8f58-3b25e28a3721")
public static final String FIELDNAME_StatementLoader_AccountNo="09c525dc-aa71-94b3-8f58-3b25e28a3721";

@XendraTrl(Identifier="2e5c0b00-61bf-abf6-9ae4-0aee6a605a1f")
public static String es_PE_COLUMN_AccountNo_Name="No. De Cuenta";

@XendraColumn(AD_Element_ID="f476cad1-331f-9d18-a8b7-c03b172f9997",ColumnName="AccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e5c0b00-61bf-abf6-9ae4-0aee6a605a1f",
Synchronized="2017-08-05 16:53:16.0")
/** Column name AccountNo */
public static final String COLUMNNAME_AccountNo = "AccountNo";
/** Set Branch ID.
@param BranchID Bank Branch ID */
public void setBranchID (String BranchID)
{
if (BranchID != null && BranchID.length() > 20)
{
log.warning("Length > 20 - truncated");
BranchID = BranchID.substring(0,19);
}
set_Value (COLUMNNAME_BranchID, BranchID);
}
/** Get Branch ID.
@return Bank Branch ID */
public String getBranchID() 
{
String value = (String)get_Value(COLUMNNAME_BranchID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="702ce9d9-45ef-c522-a464-e26c1442709e")
public static String es_PE_FIELD_StatementLoader_BranchID_Description="ID de marca del banco";

@XendraTrl(Identifier="702ce9d9-45ef-c522-a464-e26c1442709e")
public static String es_PE_FIELD_StatementLoader_BranchID_Help="Dependiendo de el cargador, usted puede tener que proporcionar una identificación de marca del banco.";

@XendraTrl(Identifier="702ce9d9-45ef-c522-a464-e26c1442709e")
public static String es_PE_FIELD_StatementLoader_BranchID_Name="Marca ID";

@XendraField(AD_Column_ID="BranchID",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="702ce9d9-45ef-c522-a464-e26c1442709e")
public static final String FIELDNAME_StatementLoader_BranchID="702ce9d9-45ef-c522-a464-e26c1442709e";

@XendraTrl(Identifier="f88c7862-360e-3b30-6728-9c3e600ade10")
public static String es_PE_COLUMN_BranchID_Name="Marca ID";

@XendraColumn(AD_Element_ID="61e5c508-3af3-1db2-7424-5f4c1fa15d1d",ColumnName="BranchID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f88c7862-360e-3b30-6728-9c3e600ade10",
Synchronized="2017-08-05 16:53:16.0")
/** Column name BranchID */
public static final String COLUMNNAME_BranchID = "BranchID";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID < 1) throw new IllegalArgumentException ("C_BankAccount_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
}
/** Get Bank Account.
@return Account at the Bank */
public int getC_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33053535-7027-08a2-5da3-5513955e3a0d")
public static String es_PE_FIELD_StatementLoader_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="33053535-7027-08a2-5da3-5513955e3a0d")
public static String es_PE_FIELD_StatementLoader_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="33053535-7027-08a2-5da3-5513955e3a0d")
public static String es_PE_FIELD_StatementLoader_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33053535-7027-08a2-5da3-5513955e3a0d")
public static final String FIELDNAME_StatementLoader_BankAccount="33053535-7027-08a2-5da3-5513955e3a0d";

@XendraTrl(Identifier="766d51c1-b3f3-e9a4-1133-3e77f55076bc")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="766d51c1-b3f3-e9a4-1133-3e77f55076bc",
Synchronized="2017-08-05 16:53:16.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Bank Statement Loader.
@param C_BankStatementLoader_ID Definition of Bank Statement Loader (SWIFT, OFX) */
public void setC_BankStatementLoader_ID (int C_BankStatementLoader_ID)
{
if (C_BankStatementLoader_ID < 1) throw new IllegalArgumentException ("C_BankStatementLoader_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankStatementLoader_ID, Integer.valueOf(C_BankStatementLoader_ID));
}
/** Get Bank Statement Loader.
@return Definition of Bank Statement Loader (SWIFT, OFX) */
public int getC_BankStatementLoader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatementLoader_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="21f6de81-8d08-d17c-2d83-0c235e1af697")
public static String es_PE_FIELD_StatementLoader_BankStatementLoader_Description="Definición del cargador del estado de cuenta (SWIFT, OFX)";

@XendraTrl(Identifier="21f6de81-8d08-d17c-2d83-0c235e1af697")
public static String es_PE_FIELD_StatementLoader_BankStatementLoader_Help="La definición de parámetros para cargar estados de cuenta de EFT ajustan a formato como SWIFT (MT940) ó OFX ";

@XendraTrl(Identifier="21f6de81-8d08-d17c-2d83-0c235e1af697")
public static String es_PE_FIELD_StatementLoader_BankStatementLoader_Name="Carga de Estado de Cuenta";

@XendraField(AD_Column_ID="C_BankStatementLoader_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21f6de81-8d08-d17c-2d83-0c235e1af697")
public static final String FIELDNAME_StatementLoader_BankStatementLoader="21f6de81-8d08-d17c-2d83-0c235e1af697";
/** Column name C_BankStatementLoader_ID */
public static final String COLUMNNAME_C_BankStatementLoader_ID = "C_BankStatementLoader_ID";
/** Set Date Format.
@param DateFormat Date format used in the imput format */
public void setDateFormat (String DateFormat)
{
if (DateFormat != null && DateFormat.length() > 20)
{
log.warning("Length > 20 - truncated");
DateFormat = DateFormat.substring(0,19);
}
set_Value (COLUMNNAME_DateFormat, DateFormat);
}
/** Get Date Format.
@return Date format used in the imput format */
public String getDateFormat() 
{
String value = (String)get_Value(COLUMNNAME_DateFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ad10e63c-6965-d001-28c9-85efce25618b")
public static String es_PE_FIELD_StatementLoader_DateFormat_Description="Formato de Fecha usado ";

@XendraTrl(Identifier="ad10e63c-6965-d001-28c9-85efce25618b")
public static String es_PE_FIELD_StatementLoader_DateFormat_Help="El formato de fecha se detecta generalmente, pero a veces necesidad ser definido.";

@XendraTrl(Identifier="ad10e63c-6965-d001-28c9-85efce25618b")
public static String es_PE_FIELD_StatementLoader_DateFormat_Name="Formato de Fecha";

@XendraField(AD_Column_ID="DateFormat",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad10e63c-6965-d001-28c9-85efce25618b")
public static final String FIELDNAME_StatementLoader_DateFormat="ad10e63c-6965-d001-28c9-85efce25618b";

@XendraTrl(Identifier="d0c2bbc5-fbac-1f63-f59a-67cb90ba9862")
public static String es_PE_COLUMN_DateFormat_Name="Formato de Fecha";

@XendraColumn(AD_Element_ID="eb57e226-6f7b-a89d-9d19-12fb2883427d",ColumnName="DateFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0c2bbc5-fbac-1f63-f59a-67cb90ba9862",
Synchronized="2017-08-05 16:53:16.0")
/** Column name DateFormat */
public static final String COLUMNNAME_DateFormat = "DateFormat";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_Value (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="2eb99d96-e92d-00d0-7d88-8e6fc10e2988")
public static String es_PE_FIELD_StatementLoader_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="2eb99d96-e92d-00d0-7d88-8e6fc10e2988")
public static String es_PE_FIELD_StatementLoader_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraTrl(Identifier="2eb99d96-e92d-00d0-7d88-8e6fc10e2988")
public static String es_PE_FIELD_StatementLoader_DateLastRun_Name="Última Fecha de Corrida";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2eb99d96-e92d-00d0-7d88-8e6fc10e2988")
public static final String FIELDNAME_StatementLoader_DateLastRun="2eb99d96-e92d-00d0-7d88-8e6fc10e2988";

@XendraTrl(Identifier="93865d75-c2c2-9173-33e2-53fa7e0c914b")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93865d75-c2c2-9173-33e2-53fa7e0c914b",
Synchronized="2017-08-05 16:53:16.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
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

@XendraTrl(Identifier="642fc249-69e6-8a93-e49a-5425a4774245")
public static String es_PE_FIELD_StatementLoader_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="642fc249-69e6-8a93-e49a-5425a4774245")
public static String es_PE_FIELD_StatementLoader_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="642fc249-69e6-8a93-e49a-5425a4774245")
public static String es_PE_FIELD_StatementLoader_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="642fc249-69e6-8a93-e49a-5425a4774245")
public static final String FIELDNAME_StatementLoader_Description="642fc249-69e6-8a93-e49a-5425a4774245";

@XendraTrl(Identifier="853f5391-7f66-1a79-8498-50eafbdeafb7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="853f5391-7f66-1a79-8498-50eafbdeafb7",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set File Name.
@param FileName Name of the local file or URL */
public void setFileName (String FileName)
{
if (FileName != null && FileName.length() > 120)
{
log.warning("Length > 120 - truncated");
FileName = FileName.substring(0,119);
}
set_Value (COLUMNNAME_FileName, FileName);
}
/** Get File Name.
@return Name of the local file or URL */
public String getFileName() 
{
String value = (String)get_Value(COLUMNNAME_FileName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1de7ac45-f04d-7c09-3bfc-2b8cce745b02")
public static String es_PE_FIELD_StatementLoader_FileName_Description="Nombre del fichero local ó URL";

@XendraTrl(Identifier="1de7ac45-f04d-7c09-3bfc-2b8cce745b02")
public static String es_PE_FIELD_StatementLoader_FileName_Help="Nombre de un archivo en el espacio local del directorio ó URL (Archivo://.., http://.., ftp://..)";

@XendraTrl(Identifier="1de7ac45-f04d-7c09-3bfc-2b8cce745b02")
public static String es_PE_FIELD_StatementLoader_FileName_Name="Nombre del Fichero";

@XendraField(AD_Column_ID="FileName",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1de7ac45-f04d-7c09-3bfc-2b8cce745b02")
public static final String FIELDNAME_StatementLoader_FileName="1de7ac45-f04d-7c09-3bfc-2b8cce745b02";

@XendraTrl(Identifier="80637a09-1241-3bb9-f83f-790664662477")
public static String es_PE_COLUMN_FileName_Name="Nombre del Fichero";

@XendraColumn(AD_Element_ID="309eb761-231b-faf7-45e5-8f880bf8604a",ColumnName="FileName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80637a09-1241-3bb9-f83f-790664662477",
Synchronized="2017-08-05 16:53:16.0")
/** Column name FileName */
public static final String COLUMNNAME_FileName = "FileName";
/** Set Financial Institution ID.
@param FinancialInstitutionID The ID of the Financial Institution / Bank */
public void setFinancialInstitutionID (String FinancialInstitutionID)
{
if (FinancialInstitutionID != null && FinancialInstitutionID.length() > 20)
{
log.warning("Length > 20 - truncated");
FinancialInstitutionID = FinancialInstitutionID.substring(0,19);
}
set_Value (COLUMNNAME_FinancialInstitutionID, FinancialInstitutionID);
}
/** Get Financial Institution ID.
@return The ID of the Financial Institution / Bank */
public String getFinancialInstitutionID() 
{
String value = (String)get_Value(COLUMNNAME_FinancialInstitutionID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7a566a82-d842-042b-1776-00c520b49e6e")
public static String es_PE_FIELD_StatementLoader_FinancialInstitutionID_Description="El ID de la institución financiera/Banco";

@XendraTrl(Identifier="7a566a82-d842-042b-1776-00c520b49e6e")
public static String es_PE_FIELD_StatementLoader_FinancialInstitutionID_Help="Dependiendo del cargador, puede ser que requiera una identificación de la institución financiera.";

@XendraTrl(Identifier="7a566a82-d842-042b-1776-00c520b49e6e")
public static String es_PE_FIELD_StatementLoader_FinancialInstitutionID_Name="ID de la Institución Financiera";

@XendraField(AD_Column_ID="FinancialInstitutionID",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a566a82-d842-042b-1776-00c520b49e6e")
public static final String FIELDNAME_StatementLoader_FinancialInstitutionID="7a566a82-d842-042b-1776-00c520b49e6e";

@XendraTrl(Identifier="3daf1926-4d26-e53f-79dd-10344800a7e2")
public static String es_PE_COLUMN_FinancialInstitutionID_Name="ID de la Institución Financiera";

@XendraColumn(AD_Element_ID="1697633a-36f5-87ba-8e13-0b000686accb",
ColumnName="FinancialInstitutionID",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3daf1926-4d26-e53f-79dd-10344800a7e2",Synchronized="2017-08-05 16:53:16.0")
/** Column name FinancialInstitutionID */
public static final String COLUMNNAME_FinancialInstitutionID = "FinancialInstitutionID";
/** Set Host Address.
@param HostAddress Host Address URL or DNS */
public void setHostAddress (String HostAddress)
{
if (HostAddress != null && HostAddress.length() > 60)
{
log.warning("Length > 60 - truncated");
HostAddress = HostAddress.substring(0,59);
}
set_Value (COLUMNNAME_HostAddress, HostAddress);
}
/** Get Host Address.
@return Host Address URL or DNS */
public String getHostAddress() 
{
String value = (String)get_Value(COLUMNNAME_HostAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3fe0a83d-326d-7def-43db-1d557a5a5d97")
public static String es_PE_FIELD_StatementLoader_HostAddress_Description="Dirección de host del procesador de pagos";

@XendraTrl(Identifier="3fe0a83d-326d-7def-43db-1d557a5a5d97")
public static String es_PE_FIELD_StatementLoader_HostAddress_Help="La dirección del host identifica el URL para su procesador de pagos";

@XendraTrl(Identifier="3fe0a83d-326d-7def-43db-1d557a5a5d97")
public static String es_PE_FIELD_StatementLoader_HostAddress_Name="Dirección Anfitrión";

@XendraField(AD_Column_ID="HostAddress",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fe0a83d-326d-7def-43db-1d557a5a5d97")
public static final String FIELDNAME_StatementLoader_HostAddress="3fe0a83d-326d-7def-43db-1d557a5a5d97";

@XendraTrl(Identifier="11fb653a-0164-6705-c9da-0ac8a6da26ca")
public static String es_PE_COLUMN_HostAddress_Name="Dirección Anfitrión";

@XendraColumn(AD_Element_ID="360f9086-02d8-c014-bb85-dbcfac9c3e1d",ColumnName="HostAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11fb653a-0164-6705-c9da-0ac8a6da26ca",
Synchronized="2017-08-05 16:53:16.0")
/** Column name HostAddress */
public static final String COLUMNNAME_HostAddress = "HostAddress";
/** Set Host port.
@param HostPort Host Communication Port */
public void setHostPort (int HostPort)
{
set_Value (COLUMNNAME_HostPort, Integer.valueOf(HostPort));
}
/** Get Host port.
@return Host Communication Port */
public int getHostPort() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HostPort);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c07dc9b-0f1c-48c1-31cd-8ee067964a87")
public static String es_PE_FIELD_StatementLoader_HostPort_Description="Puerto de host del procesador de pagos";

@XendraTrl(Identifier="2c07dc9b-0f1c-48c1-31cd-8ee067964a87")
public static String es_PE_FIELD_StatementLoader_HostPort_Help="El Puerto Host identifica la ID del puerto para su procesador de pagos";

@XendraTrl(Identifier="2c07dc9b-0f1c-48c1-31cd-8ee067964a87")
public static String es_PE_FIELD_StatementLoader_HostPort_Name="Puerto Anfitrión";

@XendraField(AD_Column_ID="HostPort",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c07dc9b-0f1c-48c1-31cd-8ee067964a87")
public static final String FIELDNAME_StatementLoader_HostPort="2c07dc9b-0f1c-48c1-31cd-8ee067964a87";

@XendraTrl(Identifier="aafcdfde-6f73-9b34-37bd-77b7a4d393cb")
public static String es_PE_COLUMN_HostPort_Name="Puerto Anfitrión";

@XendraColumn(AD_Element_ID="6082bb2b-fdc8-34b4-ba72-e7b1c6b69316",ColumnName="HostPort",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="443",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aafcdfde-6f73-9b34-37bd-77b7a4d393cb",
Synchronized="2017-08-05 16:53:16.0")
/** Column name HostPort */
public static final String COLUMNNAME_HostPort = "HostPort";
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
@XendraTrl(Identifier="ccb55c20-5529-4a2b-942e-e9e77edc0d0e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccb55c20-5529-4a2b-942e-e9e77edc0d0e",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="1b57be38-f21f-3830-310f-22ce6d2913d3")
public static String es_PE_FIELD_StatementLoader_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="1b57be38-f21f-3830-310f-22ce6d2913d3")
public static String es_PE_FIELD_StatementLoader_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="1b57be38-f21f-3830-310f-22ce6d2913d3")
public static String es_PE_FIELD_StatementLoader_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b57be38-f21f-3830-310f-22ce6d2913d3")
public static final String FIELDNAME_StatementLoader_Name="1b57be38-f21f-3830-310f-22ce6d2913d3";

@XendraTrl(Identifier="aaed723e-c16b-8f56-0a08-eefbe29e7946")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aaed723e-c16b-8f56-0a08-eefbe29e7946",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Password.
@param Password Password of any length (case sensitive) */
public void setPassword (String Password)
{
if (Password != null && Password.length() > 60)
{
log.warning("Length > 60 - truncated");
Password = Password.substring(0,59);
}
set_Value (COLUMNNAME_Password, Password);
}
/** Get Password.
@return Password of any length (case sensitive) */
public String getPassword() 
{
String value = (String)get_Value(COLUMNNAME_Password);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c2fdfaa5-ef95-98e6-d027-104842c3b089")
public static String es_PE_FIELD_StatementLoader_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="c2fdfaa5-ef95-98e6-d027-104842c3b089")
public static String es_PE_FIELD_StatementLoader_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraTrl(Identifier="c2fdfaa5-ef95-98e6-d027-104842c3b089")
public static String es_PE_FIELD_StatementLoader_Password_Name="Contraseña";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2fdfaa5-ef95-98e6-d027-104842c3b089")
public static final String FIELDNAME_StatementLoader_Password="c2fdfaa5-ef95-98e6-d027-104842c3b089";

@XendraTrl(Identifier="d12e9f53-a860-21b0-947d-0d777c220cc4")
public static String es_PE_COLUMN_Password_Name="Contraseña";

@XendraColumn(AD_Element_ID="cd8ab187-f65c-a732-8e67-8675630874c3",ColumnName="Password",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d12e9f53-a860-21b0-947d-0d777c220cc4",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Password */
public static final String COLUMNNAME_Password = "Password";
/** Set PIN.
@param PIN Personal Identification Number */
public void setPIN (String PIN)
{
if (PIN != null && PIN.length() > 20)
{
log.warning("Length > 20 - truncated");
PIN = PIN.substring(0,19);
}
set_Value (COLUMNNAME_PIN, PIN);
}
/** Get PIN.
@return Personal Identification Number */
public String getPIN() 
{
String value = (String)get_Value(COLUMNNAME_PIN);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="17490003-7c3b-bc3e-c3e7-cfd8fa142f12")
public static String es_PE_FIELD_StatementLoader_PIN_Description="Número de Identificación Personal";

@XendraTrl(Identifier="17490003-7c3b-bc3e-c3e7-cfd8fa142f12")
public static String es_PE_FIELD_StatementLoader_PIN_Name="NIP";
@XendraField(AD_Column_ID="PIN",
IsCentrallyMaintained=true,AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="17490003-7c3b-bc3e-c3e7-cfd8fa142f12")
public static final String FIELDNAME_StatementLoader_PIN="17490003-7c3b-bc3e-c3e7-cfd8fa142f12";

@XendraTrl(Identifier="b066f7f6-028d-a252-7b46-8baa796a4ada")
public static String es_PE_COLUMN_PIN_Name="NIP";

@XendraColumn(AD_Element_ID="3993bd7c-d516-3579-5c0a-ad9e2d319ca0",ColumnName="PIN",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b066f7f6-028d-a252-7b46-8baa796a4ada",
Synchronized="2017-08-05 16:53:16.0")
/** Column name PIN */
public static final String COLUMNNAME_PIN = "PIN";
/** Set Proxy address.
@param ProxyAddress  Address of your proxy server */
public void setProxyAddress (String ProxyAddress)
{
if (ProxyAddress != null && ProxyAddress.length() > 60)
{
log.warning("Length > 60 - truncated");
ProxyAddress = ProxyAddress.substring(0,59);
}
set_Value (COLUMNNAME_ProxyAddress, ProxyAddress);
}
/** Get Proxy address.
@return  Address of your proxy server */
public String getProxyAddress() 
{
String value = (String)get_Value(COLUMNNAME_ProxyAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f9a43c27-882d-0674-5105-3c8a61121305")
public static String es_PE_FIELD_StatementLoader_ProxyAddress_Description="Dirección de su servidor de proxy";

@XendraTrl(Identifier="f9a43c27-882d-0674-5105-3c8a61121305")
public static String es_PE_FIELD_StatementLoader_ProxyAddress_Help="La dirección del proxy debe ser definida si usted debe y pasa a través de un cortafuego para tener acceso a su procesador de pago";

@XendraTrl(Identifier="f9a43c27-882d-0674-5105-3c8a61121305")
public static String es_PE_FIELD_StatementLoader_ProxyAddress_Name="Dirección Proxy";

@XendraField(AD_Column_ID="ProxyAddress",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9a43c27-882d-0674-5105-3c8a61121305")
public static final String FIELDNAME_StatementLoader_ProxyAddress="f9a43c27-882d-0674-5105-3c8a61121305";

@XendraTrl(Identifier="bc5b549c-a16d-8ad9-7c00-6ec3685bb2f5")
public static String es_PE_COLUMN_ProxyAddress_Name="Dirección Proxy";

@XendraColumn(AD_Element_ID="16a58716-8ae9-bc0d-91e0-589988ba328e",ColumnName="ProxyAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc5b549c-a16d-8ad9-7c00-6ec3685bb2f5",
Synchronized="2017-08-05 16:53:16.0")
/** Column name ProxyAddress */
public static final String COLUMNNAME_ProxyAddress = "ProxyAddress";
/** Set Proxy logon.
@param ProxyLogon Logon of your proxy server */
public void setProxyLogon (String ProxyLogon)
{
if (ProxyLogon != null && ProxyLogon.length() > 60)
{
log.warning("Length > 60 - truncated");
ProxyLogon = ProxyLogon.substring(0,59);
}
set_Value (COLUMNNAME_ProxyLogon, ProxyLogon);
}
/** Get Proxy logon.
@return Logon of your proxy server */
public String getProxyLogon() 
{
String value = (String)get_Value(COLUMNNAME_ProxyLogon);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1e437ae3-f450-f641-0d1b-c11a72ee2a09")
public static String es_PE_FIELD_StatementLoader_ProxyLogon_Description="ID Usuario en el servidor Proxy";

@XendraTrl(Identifier="1e437ae3-f450-f641-0d1b-c11a72ee2a09")
public static String es_PE_FIELD_StatementLoader_ProxyLogon_Help="La Firma Proxy identifica en la ID de la Firma para su servidor proxy";

@XendraTrl(Identifier="1e437ae3-f450-f641-0d1b-c11a72ee2a09")
public static String es_PE_FIELD_StatementLoader_ProxyLogon_Name="ID Usuario Proxy";

@XendraField(AD_Column_ID="ProxyLogon",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e437ae3-f450-f641-0d1b-c11a72ee2a09")
public static final String FIELDNAME_StatementLoader_ProxyLogon="1e437ae3-f450-f641-0d1b-c11a72ee2a09";

@XendraTrl(Identifier="71d514e7-e511-8975-01ad-60394eb1edc8")
public static String es_PE_COLUMN_ProxyLogon_Name="ID Usuario Proxy";

@XendraColumn(AD_Element_ID="f3637931-d9d2-a10b-7289-230719e7eebe",ColumnName="ProxyLogon",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71d514e7-e511-8975-01ad-60394eb1edc8",
Synchronized="2017-08-05 16:53:16.0")
/** Column name ProxyLogon */
public static final String COLUMNNAME_ProxyLogon = "ProxyLogon";
/** Set Proxy password.
@param ProxyPassword Password of your proxy server */
public void setProxyPassword (String ProxyPassword)
{
if (ProxyPassword != null && ProxyPassword.length() > 60)
{
log.warning("Length > 60 - truncated");
ProxyPassword = ProxyPassword.substring(0,59);
}
set_Value (COLUMNNAME_ProxyPassword, ProxyPassword);
}
/** Get Proxy password.
@return Password of your proxy server */
public String getProxyPassword() 
{
String value = (String)get_Value(COLUMNNAME_ProxyPassword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="03f42183-eac3-c490-447d-c5bfaa3423e2")
public static String es_PE_FIELD_StatementLoader_ProxyPassword_Description="Contraseña en el servidor proxy";

@XendraTrl(Identifier="03f42183-eac3-c490-447d-c5bfaa3423e2")
public static String es_PE_FIELD_StatementLoader_ProxyPassword_Help="La contraseña proxy identifica la contraseña para su servidor proxy";

@XendraTrl(Identifier="03f42183-eac3-c490-447d-c5bfaa3423e2")
public static String es_PE_FIELD_StatementLoader_ProxyPassword_Name="Contraseña Proxy";

@XendraField(AD_Column_ID="ProxyPassword",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03f42183-eac3-c490-447d-c5bfaa3423e2")
public static final String FIELDNAME_StatementLoader_ProxyPassword="03f42183-eac3-c490-447d-c5bfaa3423e2";

@XendraTrl(Identifier="018e9cfb-0bf6-14d3-9306-23c7a9a0776e")
public static String es_PE_COLUMN_ProxyPassword_Name="Contraseña Proxy";

@XendraColumn(AD_Element_ID="290ba922-a5ea-5c7a-f2c7-dd298b623471",ColumnName="ProxyPassword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="018e9cfb-0bf6-14d3-9306-23c7a9a0776e",
Synchronized="2017-08-05 16:53:16.0")
/** Column name ProxyPassword */
public static final String COLUMNNAME_ProxyPassword = "ProxyPassword";
/** Set Proxy port.
@param ProxyPort Port of your proxy server */
public void setProxyPort (int ProxyPort)
{
set_Value (COLUMNNAME_ProxyPort, Integer.valueOf(ProxyPort));
}
/** Get Proxy port.
@return Port of your proxy server */
public int getProxyPort() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ProxyPort);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="199aebc7-bfcb-cc65-fc5e-7b85dcb60b8b")
public static String es_PE_FIELD_StatementLoader_ProxyPort_Description="Puerto de tu servidor proxy";

@XendraTrl(Identifier="199aebc7-bfcb-cc65-fc5e-7b85dcb60b8b")
public static String es_PE_FIELD_StatementLoader_ProxyPort_Help="El Puerto Proxy identifica el  puerto de su servidor proxy";

@XendraTrl(Identifier="199aebc7-bfcb-cc65-fc5e-7b85dcb60b8b")
public static String es_PE_FIELD_StatementLoader_ProxyPort_Name="Puerto Proxy";

@XendraField(AD_Column_ID="ProxyPort",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="199aebc7-bfcb-cc65-fc5e-7b85dcb60b8b")
public static final String FIELDNAME_StatementLoader_ProxyPort="199aebc7-bfcb-cc65-fc5e-7b85dcb60b8b";

@XendraTrl(Identifier="d657e2a3-9612-9ab3-607a-0327085c2b80")
public static String es_PE_COLUMN_ProxyPort_Name="Puerto Proxy";

@XendraColumn(AD_Element_ID="c272d2c7-8ad8-cca4-00ec-45195c7912e9",ColumnName="ProxyPort",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d657e2a3-9612-9ab3-607a-0327085c2b80",
Synchronized="2017-08-05 16:53:16.0")
/** Column name ProxyPort */
public static final String COLUMNNAME_ProxyPort = "ProxyPort";
/** Set Statement Loader Class.
@param StmtLoaderClass Class NAME of the bank statement loader */
public void setStmtLoaderClass (String StmtLoaderClass)
{
if (StmtLoaderClass != null && StmtLoaderClass.length() > 60)
{
log.warning("Length > 60 - truncated");
StmtLoaderClass = StmtLoaderClass.substring(0,59);
}
set_Value (COLUMNNAME_StmtLoaderClass, StmtLoaderClass);
}
/** Get Statement Loader Class.
@return Class NAME of the bank statement loader */
public String getStmtLoaderClass() 
{
String value = (String)get_Value(COLUMNNAME_StmtLoaderClass);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c2270ee8-ec14-65cd-d00c-49a89962599b")
public static String es_PE_FIELD_StatementLoader_StatementLoaderClass_Description="Nombre de la clase del cargador del extracto de cuenta";

@XendraTrl(Identifier="c2270ee8-ec14-65cd-d00c-49a89962599b")
public static String es_PE_FIELD_StatementLoader_StatementLoaderClass_Help="El nombre del cargador real del extracto de cuenta que pone el interfaz en ejecución org.compiere.impexp.BankStatementLoaderInterface";

@XendraTrl(Identifier="c2270ee8-ec14-65cd-d00c-49a89962599b")
public static String es_PE_FIELD_StatementLoader_StatementLoaderClass_Name="Estado de Cargador de Clases";

@XendraField(AD_Column_ID="StmtLoaderClass",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2270ee8-ec14-65cd-d00c-49a89962599b")
public static final String FIELDNAME_StatementLoader_StatementLoaderClass="c2270ee8-ec14-65cd-d00c-49a89962599b";

@XendraTrl(Identifier="24980950-11ef-887b-ec4d-a661fc67f371")
public static String es_PE_COLUMN_StmtLoaderClass_Name="Estado de Cargador de Clases";

@XendraColumn(AD_Element_ID="e44bf032-8f60-7c77-c29d-c22304e48f31",ColumnName="StmtLoaderClass",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24980950-11ef-887b-ec4d-a661fc67f371",
Synchronized="2017-08-05 16:53:16.0")
/** Column name StmtLoaderClass */
public static final String COLUMNNAME_StmtLoaderClass = "StmtLoaderClass";
/** Set User ID.
@param UserID User ID or account number */
public void setUserID (String UserID)
{
if (UserID != null && UserID.length() > 60)
{
log.warning("Length > 60 - truncated");
UserID = UserID.substring(0,59);
}
set_Value (COLUMNNAME_UserID, UserID);
}
/** Get User ID.
@return User ID or account number */
public String getUserID() 
{
String value = (String)get_Value(COLUMNNAME_UserID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="30169f6d-bcdc-f3d4-2aa9-a835a2a0f20f")
public static String es_PE_FIELD_StatementLoader_UserID_Description="ID de Usuario";

@XendraTrl(Identifier="30169f6d-bcdc-f3d4-2aa9-a835a2a0f20f")
public static String es_PE_FIELD_StatementLoader_UserID_Help="La ID de Usuario identifica a un usuario y le permite el acceso a los registros ó procesos.";

@XendraTrl(Identifier="30169f6d-bcdc-f3d4-2aa9-a835a2a0f20f")
public static String es_PE_FIELD_StatementLoader_UserID_Name="ID de Usuario";

@XendraField(AD_Column_ID="UserID",IsCentrallyMaintained=true,
AD_Tab_ID="fd974730-4991-2758-6d49-3edcc51c12d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30169f6d-bcdc-f3d4-2aa9-a835a2a0f20f")
public static final String FIELDNAME_StatementLoader_UserID="30169f6d-bcdc-f3d4-2aa9-a835a2a0f20f";

@XendraTrl(Identifier="f0339328-30fb-9aa9-03c1-7d35e1bef2f7")
public static String es_PE_COLUMN_UserID_Name="ID de Usuario";

@XendraColumn(AD_Element_ID="9ebe66cf-07df-8a41-14fc-726fbde3a347",ColumnName="UserID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0339328-30fb-9aa9-03c1-7d35e1bef2f7",
Synchronized="2017-08-05 16:53:16.0")
/** Column name UserID */
public static final String COLUMNNAME_UserID = "UserID";
}
