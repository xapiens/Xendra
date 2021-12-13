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
/** Generated Model for C_BankAccountDoc
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BankAccountDoc extends PO
{
/** Standard Constructor
@param ctx context
@param C_BankAccountDoc_ID id
@param trxName transaction
*/
public X_C_BankAccountDoc (Properties ctx, int C_BankAccountDoc_ID, String trxName)
{
super (ctx, C_BankAccountDoc_ID, trxName);
/** if (C_BankAccountDoc_ID == 0)
{
setC_BankAccountDoc_ID (0);
setC_BankAccount_ID (0);
setCurrentNext (0);	
// 1000000
setName (null);
setPaymentRule (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BankAccountDoc (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=455 */
public static int Table_ID=MTable.getTable_ID("C_BankAccountDoc");

@XendraTrl(Identifier="f862713c-5522-6be2-108b-0a2ce3176b49")
public static String es_PE_TAB_BankAccountDocument_Description="Mantener documentos de cuentas bancarias";

@XendraTrl(Identifier="f862713c-5522-6be2-108b-0a2ce3176b49")
public static String es_PE_TAB_BankAccountDocument_Help="En esta pestaña se definen los documentos usados para esta cuenta bancaria. Se definen los números (secuencia) de cheques y los otros documentos de pago así como su formato.";

@XendraTrl(Identifier="f862713c-5522-6be2-108b-0a2ce3176b49")
public static String es_PE_TAB_BankAccountDocument_Name="Documento de Cuenta Bancaria";

@XendraTab(Name="Bank Account Document",Description="Maintain Bank Account Documents",
Help="In this tab, you define the documents used for this bank account.  You define your check and other payment document (sequence) number as well as format.",
AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f862713c-5522-6be2-108b-0a2ce3176b49",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BankAccountDocument="f862713c-5522-6be2-108b-0a2ce3176b49";

@XendraTrl(Identifier="20331ecb-2ea3-d50e-64b0-0ca95897d586")
public static String es_PE_TABLE_C_BankAccountDoc_Name="Documento De la Cuenta Bancaria";


@XendraTable(Name="Bank Account Document",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Checks, Transfers, etc.",Help="",
TableName="C_BankAccountDoc",AccessLevel="3",AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="20331ecb-2ea3-d50e-64b0-0ca95897d586",Synchronized="2020-03-03 21:36:26.0")
/** TableName=C_BankAccountDoc */
public static final String Table_Name="C_BankAccountDoc";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BankAccountDoc");

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
    Table_ID = MTable.getTable_ID("C_BankAccountDoc");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BankAccountDoc[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bank Account Document.
@param C_BankAccountDoc_ID Checks, Transfers, etc. */
public void setC_BankAccountDoc_ID (int C_BankAccountDoc_ID)
{
if (C_BankAccountDoc_ID < 1) throw new IllegalArgumentException ("C_BankAccountDoc_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankAccountDoc_ID, Integer.valueOf(C_BankAccountDoc_ID));
}
/** Get Bank Account Document.
@return Checks, Transfers, etc. */
public int getC_BankAccountDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccountDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f013d7d9-5ab1-aa7d-72df-f21ab62a4991")
public static String es_PE_FIELD_BankAccountDocument_BankAccountDocument_Name="Documento De la Cuenta Bancaria";

@XendraTrl(Identifier="f013d7d9-5ab1-aa7d-72df-f21ab62a4991")
public static String es_PE_FIELD_BankAccountDocument_BankAccountDocument_Description="Cheques; transferencias; etc.";

@XendraTrl(Identifier="f013d7d9-5ab1-aa7d-72df-f21ab62a4991")
public static String es_PE_FIELD_BankAccountDocument_BankAccountDocument_Help="Documentos bancarios que usted genera ó monitorea";

@XendraField(AD_Column_ID="C_BankAccountDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f862713c-5522-6be2-108b-0a2ce3176b49",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f013d7d9-5ab1-aa7d-72df-f21ab62a4991")
public static final String FIELDNAME_BankAccountDocument_BankAccountDocument="f013d7d9-5ab1-aa7d-72df-f21ab62a4991";
/** Column name C_BankAccountDoc_ID */
public static final String COLUMNNAME_C_BankAccountDoc_ID = "C_BankAccountDoc_ID";
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

@XendraTrl(Identifier="9954cfaa-8589-ff08-0c5f-d65975745c65")
public static String es_PE_FIELD_BankAccountDocument_BankAccount_Name="Cuenta Bancaria";

@XendraTrl(Identifier="9954cfaa-8589-ff08-0c5f-d65975745c65")
public static String es_PE_FIELD_BankAccountDocument_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="9954cfaa-8589-ff08-0c5f-d65975745c65")
public static String es_PE_FIELD_BankAccountDocument_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f862713c-5522-6be2-108b-0a2ce3176b49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9954cfaa-8589-ff08-0c5f-d65975745c65")
public static final String FIELDNAME_BankAccountDocument_BankAccount="9954cfaa-8589-ff08-0c5f-d65975745c65";

@XendraTrl(Identifier="59f1637b-32a9-5411-9c5b-7ffb33c89804")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59f1637b-32a9-5411-9c5b-7ffb33c89804",
Synchronized="2019-08-30 22:21:04.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Check Print Format.
@param Check_PrintFormat_ID Print Format for printing Checks */
public void setCheck_PrintFormat_ID (int Check_PrintFormat_ID)
{
if (Check_PrintFormat_ID <= 0) set_Value (COLUMNNAME_Check_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_Check_PrintFormat_ID, Integer.valueOf(Check_PrintFormat_ID));
}
/** Get Check Print Format.
@return Print Format for printing Checks */
public int getCheck_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Check_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="56a181f0-121b-20c4-4c73-3e8e3645d1d0")
public static String es_PE_FIELD_BankAccountDocument_CheckPrintFormat_Name="Formato de Impresión de Cheques";

@XendraTrl(Identifier="56a181f0-121b-20c4-4c73-3e8e3645d1d0")
public static String es_PE_FIELD_BankAccountDocument_CheckPrintFormat_Description="Formato de impresión usado para imprimir cheques";

@XendraTrl(Identifier="56a181f0-121b-20c4-4c73-3e8e3645d1d0")
public static String es_PE_FIELD_BankAccountDocument_CheckPrintFormat_Help="Es necesario definir un formato para imprimir el documento";

@XendraField(AD_Column_ID="Check_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f862713c-5522-6be2-108b-0a2ce3176b49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56a181f0-121b-20c4-4c73-3e8e3645d1d0")
public static final String FIELDNAME_BankAccountDocument_CheckPrintFormat="56a181f0-121b-20c4-4c73-3e8e3645d1d0";

@XendraTrl(Identifier="055e6273-598f-e7cc-2605-418544a81c4b")
public static String es_PE_COLUMN_Check_PrintFormat_ID_Name="Formato de Impresión de Cheques";

@XendraColumn(AD_Element_ID="b4a62e83-cb28-b904-7fc1-6e4623eff1f0",
ColumnName="Check_PrintFormat_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="c6373860-2da1-9b9a-fb99-6ddafee99e3f",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="055e6273-598f-e7cc-2605-418544a81c4b",
Synchronized="2019-08-30 22:21:04.0")
/** Column name Check_PrintFormat_ID */
public static final String COLUMNNAME_Check_PrintFormat_ID = "Check_PrintFormat_ID";
/** Set Current Next.
@param CurrentNext The next number to be used */
public void setCurrentNext (int CurrentNext)
{
set_Value (COLUMNNAME_CurrentNext, Integer.valueOf(CurrentNext));
}
/** Get Current Next.
@return The next number to be used */
public int getCurrentNext() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CurrentNext);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bec40223-0f54-2b97-a394-bafa392fd3eb")
public static String es_PE_FIELD_BankAccountDocument_CurrentNext_Name="Siguiente Secuencia";

@XendraTrl(Identifier="bec40223-0f54-2b97-a394-bafa392fd3eb")
public static String es_PE_FIELD_BankAccountDocument_CurrentNext_Description="El número siguiente a ser usado";

@XendraTrl(Identifier="bec40223-0f54-2b97-a394-bafa392fd3eb")
public static String es_PE_FIELD_BankAccountDocument_CurrentNext_Help="El siguiente corriente indica el número siguiente a usar para este documento";

@XendraField(AD_Column_ID="CurrentNext",IsCentrallyMaintained=true,
AD_Tab_ID="f862713c-5522-6be2-108b-0a2ce3176b49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bec40223-0f54-2b97-a394-bafa392fd3eb")
public static final String FIELDNAME_BankAccountDocument_CurrentNext="bec40223-0f54-2b97-a394-bafa392fd3eb";

@XendraTrl(Identifier="874c9b3b-258d-8af8-9f9c-5330bfd3e7ff")
public static String es_PE_COLUMN_CurrentNext_Name="Siguiente Secuencia";

@XendraColumn(AD_Element_ID="3cb3c545-8207-00bd-81ee-d16aaa68f4c2",ColumnName="CurrentNext",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="1000000",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="0",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="874c9b3b-258d-8af8-9f9c-5330bfd3e7ff",Synchronized="2019-08-30 22:21:04.0")
/** Column name CurrentNext */
public static final String COLUMNNAME_CurrentNext = "CurrentNext";
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

@XendraTrl(Identifier="6c672735-24b4-011a-fd33-92d3124dadd1")
public static String es_PE_FIELD_BankAccountDocument_Description_Name="Observación";

@XendraTrl(Identifier="6c672735-24b4-011a-fd33-92d3124dadd1")
public static String es_PE_FIELD_BankAccountDocument_Description_Description="Observación";

@XendraTrl(Identifier="6c672735-24b4-011a-fd33-92d3124dadd1")
public static String es_PE_FIELD_BankAccountDocument_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f862713c-5522-6be2-108b-0a2ce3176b49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c672735-24b4-011a-fd33-92d3124dadd1")
public static final String FIELDNAME_BankAccountDocument_Description="6c672735-24b4-011a-fd33-92d3124dadd1";

@XendraTrl(Identifier="5f8fb862-761a-11b7-888f-bb9fd2dbcdd6")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f8fb862-761a-11b7-888f-bb9fd2dbcdd6",
Synchronized="2019-08-30 22:21:04.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="f4758490-b348-43e7-bd1b-ce90c3acef51")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4758490-b348-43e7-bd1b-ce90c3acef51",
Synchronized="2019-08-30 22:21:04.0")
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

@XendraTrl(Identifier="b9d984c5-2be2-b653-a924-2474f59c1751")
public static String es_PE_FIELD_BankAccountDocument_Name_Name="Nombre";

@XendraTrl(Identifier="b9d984c5-2be2-b653-a924-2474f59c1751")
public static String es_PE_FIELD_BankAccountDocument_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b9d984c5-2be2-b653-a924-2474f59c1751")
public static String es_PE_FIELD_BankAccountDocument_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="f862713c-5522-6be2-108b-0a2ce3176b49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9d984c5-2be2-b653-a924-2474f59c1751")
public static final String FIELDNAME_BankAccountDocument_Name="b9d984c5-2be2-b653-a924-2474f59c1751";

@XendraTrl(Identifier="266d43c5-8099-45ee-0e1e-fc9f69750f09")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="266d43c5-8099-45ee-0e1e-fc9f69750f09",
Synchronized="2019-08-30 22:21:04.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Payment Rule.
@param PaymentRule How you pay the invoice */
public void setPaymentRule (String PaymentRule)
{
if (PaymentRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PaymentRule = PaymentRule.substring(0,0);
}
set_Value (COLUMNNAME_PaymentRule, PaymentRule);
}
/** Get Payment Rule.
@return How you pay the invoice */
public String getPaymentRule() 
{
return (String)get_Value(COLUMNNAME_PaymentRule);
}

@XendraTrl(Identifier="6408d000-2c73-6397-b4ea-d01376ce5304")
public static String es_PE_FIELD_BankAccountDocument_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="6408d000-2c73-6397-b4ea-d01376ce5304")
public static String es_PE_FIELD_BankAccountDocument_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="6408d000-2c73-6397-b4ea-d01376ce5304")
public static String es_PE_FIELD_BankAccountDocument_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="f862713c-5522-6be2-108b-0a2ce3176b49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6408d000-2c73-6397-b4ea-d01376ce5304")
public static final String FIELDNAME_BankAccountDocument_PaymentRule="6408d000-2c73-6397-b4ea-d01376ce5304";

@XendraTrl(Identifier="6466a020-3c08-2361-5c6b-f76adc48b07d")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=17,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6466a020-3c08-2361-5c6b-f76adc48b07d",Synchronized="2019-08-30 22:21:04.0")
/** Column name PaymentRule */
public static final String COLUMNNAME_PaymentRule = "PaymentRule";
}
