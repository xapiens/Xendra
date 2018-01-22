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
/** Generated Model for C_PaySelection
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaySelection extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaySelection_ID id
@param trxName transaction
*/
public X_C_PaySelection (Properties ctx, int C_PaySelection_ID, String trxName)
{
super (ctx, C_PaySelection_ID, trxName);
/** if (C_PaySelection_ID == 0)
{
setC_BankAccount_ID (0);
setC_PaySelection_ID (0);
setIsApproved (false);	
// N
setName (null);	
// @#Date@
setPayDate (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setProcessed (false);	
// N
setProcessing (false);
setTotalAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaySelection (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=426 */
public static int Table_ID=MTable.getTable_ID("C_PaySelection");

@XendraTrl(Identifier="0cca236f-8556-bc24-da62-ded660cc2967")
public static String es_PE_TAB_PaymentSelection_Description="Definir Pagos";

@XendraTrl(Identifier="0cca236f-8556-bc24-da62-ded660cc2967")
public static String es_PE_TAB_PaymentSelection_Name="Selección de Pago";

@XendraTrl(Identifier="0cca236f-8556-bc24-da62-ded660cc2967")
public static String es_PE_TAB_PaymentSelection_Help="La pestaña Selección de Pago define la cuenta bancaria para los pagos y la fecha en las cuales éstos deben ocurrir. Los pagos también son creados aquí.";

@XendraTab(Name="Payment Selection",Description="Define Payment",
Help="The Payment Selection Tab defines the bank account and date of the payments to be made. You also create the payments here.",
AD_Window_ID="3b3a39ee-5fa5-65fa-8f03-b3cbf65cc9e9",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0cca236f-8556-bc24-da62-ded660cc2967",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentSelection="0cca236f-8556-bc24-da62-ded660cc2967";

@XendraTrl(Identifier="925a2356-6cfe-6774-3050-8b291636bade")
public static String es_PE_TABLE_C_PaySelection_Name="Selección de Pago";

@XendraTable(Name="Payment Selection",Description="Payment Selection",Help="",
TableName="C_PaySelection",AccessLevel="1",AD_Window_ID="3b3a39ee-5fa5-65fa-8f03-b3cbf65cc9e9",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="925a2356-6cfe-6774-3050-8b291636bade",Synchronized="2017-08-16 11:42:12.0")
/** TableName=C_PaySelection */
public static final String Table_Name="C_PaySelection";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaySelection");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_PaySelection");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaySelection[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID < 1) throw new IllegalArgumentException ("C_BankAccount_ID is mandatory.");
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

@XendraTrl(Identifier="780613b5-d488-6771-e721-6b5481a662f6")
public static String es_PE_FIELD_PaymentSelection_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="780613b5-d488-6771-e721-6b5481a662f6")
public static String es_PE_FIELD_PaymentSelection_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="780613b5-d488-6771-e721-6b5481a662f6")
public static String es_PE_FIELD_PaymentSelection_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="780613b5-d488-6771-e721-6b5481a662f6")
public static final String FIELDNAME_PaymentSelection_BankAccount="780613b5-d488-6771-e721-6b5481a662f6";

@XendraTrl(Identifier="8253ce35-8f15-cace-769e-2c22b593b28d")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8253ce35-8f15-cace-769e-2c22b593b28d",
Synchronized="2017-08-05 16:54:04.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Payment Selection.
@param C_PaySelection_ID Payment Selection */
public void setC_PaySelection_ID (int C_PaySelection_ID)
{
if (C_PaySelection_ID < 1) throw new IllegalArgumentException ("C_PaySelection_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaySelection_ID, Integer.valueOf(C_PaySelection_ID));
}
/** Get Payment Selection.
@return Payment Selection */
public int getC_PaySelection_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySelection_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="02593d4e-4e59-da9a-5789-259a719bbdd6")
public static String es_PE_FIELD_PaymentSelection_PaymentSelection_Description="Selección de Pago";

@XendraTrl(Identifier="02593d4e-4e59-da9a-5789-259a719bbdd6")
public static String es_PE_FIELD_PaymentSelection_PaymentSelection_Help="La selección de pago identifica un pago único.";

@XendraTrl(Identifier="02593d4e-4e59-da9a-5789-259a719bbdd6")
public static String es_PE_FIELD_PaymentSelection_PaymentSelection_Name="Selección de Pago";

@XendraField(AD_Column_ID="C_PaySelection_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02593d4e-4e59-da9a-5789-259a719bbdd6")
public static final String FIELDNAME_PaymentSelection_PaymentSelection="02593d4e-4e59-da9a-5789-259a719bbdd6";
/** Column name C_PaySelection_ID */
public static final String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
/** Set Create lines from.
@param CreateFrom Process which will generate a new document lines based on an existing document */
public void setCreateFrom (String CreateFrom)
{
if (CreateFrom != null && CreateFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateFrom = CreateFrom.substring(0,0);
}
set_Value (COLUMNNAME_CreateFrom, CreateFrom);
}
/** Get Create lines from.
@return Process which will generate a new document lines based on an existing document */
public String getCreateFrom() 
{
return (String)get_Value(COLUMNNAME_CreateFrom);
}

@XendraTrl(Identifier="fcf2f4e4-f3c2-9610-25aa-8170aae335bc")
public static String es_PE_FIELD_PaymentSelection_CreateFrom_Name="Crear Desde";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcf2f4e4-f3c2-9610-25aa-8170aae335bc")
public static final String FIELDNAME_PaymentSelection_CreateFrom="fcf2f4e4-f3c2-9610-25aa-8170aae335bc";

@XendraTrl(Identifier="673ac142-9200-d003-93c5-c00e36144a01")
public static String es_PE_COLUMN_CreateFrom_Name="Crear Desde";

@XendraColumn(AD_Element_ID="7fccccce-83dd-9c79-faa2-d4675bdb0e1c",ColumnName="CreateFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="e208a2fd-02a0-8ca5-6b34-d85faa881fd4",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="673ac142-9200-d003-93c5-c00e36144a01",Synchronized="2017-08-05 16:54:04.0")
/** Column name CreateFrom */
public static final String COLUMNNAME_CreateFrom = "CreateFrom";
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

@XendraTrl(Identifier="d1b128f2-2115-5be9-05b4-c759ec4b46a2")
public static String es_PE_FIELD_PaymentSelection_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d1b128f2-2115-5be9-05b4-c759ec4b46a2")
public static String es_PE_FIELD_PaymentSelection_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="d1b128f2-2115-5be9-05b4-c759ec4b46a2")
public static String es_PE_FIELD_PaymentSelection_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1b128f2-2115-5be9-05b4-c759ec4b46a2")
public static final String FIELDNAME_PaymentSelection_Description="d1b128f2-2115-5be9-05b4-c759ec4b46a2";

@XendraTrl(Identifier="4d850e38-c2d1-9fff-d01c-4220dda86da0")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="4d850e38-c2d1-9fff-d01c-4220dda86da0",
Synchronized="2017-08-05 16:54:04.0")
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
@XendraTrl(Identifier="3562e24e-1da6-4579-b155-3bc27679038a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3562e24e-1da6-4579-b155-3bc27679038a",
Synchronized="2017-08-05 16:54:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="5ba5e9d9-5409-6f5a-4eb3-21fec6cd49b2")
public static String es_PE_FIELD_PaymentSelection_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="5ba5e9d9-5409-6f5a-4eb3-21fec6cd49b2")
public static String es_PE_FIELD_PaymentSelection_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="5ba5e9d9-5409-6f5a-4eb3-21fec6cd49b2")
public static String es_PE_FIELD_PaymentSelection_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ba5e9d9-5409-6f5a-4eb3-21fec6cd49b2")
public static final String FIELDNAME_PaymentSelection_Approved="5ba5e9d9-5409-6f5a-4eb3-21fec6cd49b2";

@XendraTrl(Identifier="23248796-1a89-a785-d859-79d752cfb0dd")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23248796-1a89-a785-d859-79d752cfb0dd",
Synchronized="2017-08-05 16:54:04.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
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

@XendraTrl(Identifier="65842588-2475-d6af-2c45-1befb50d0bdb")
public static String es_PE_FIELD_PaymentSelection_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="65842588-2475-d6af-2c45-1befb50d0bdb")
public static String es_PE_FIELD_PaymentSelection_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="65842588-2475-d6af-2c45-1befb50d0bdb")
public static String es_PE_FIELD_PaymentSelection_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65842588-2475-d6af-2c45-1befb50d0bdb")
public static final String FIELDNAME_PaymentSelection_Name="65842588-2475-d6af-2c45-1befb50d0bdb";

@XendraTrl(Identifier="79c10449-8450-6a5b-bb2f-9cf50031ec4d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,
DefaultValue="@#Date@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="79c10449-8450-6a5b-bb2f-9cf50031ec4d",Synchronized="2017-08-05 16:54:04.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Payment date.
@param PayDate Date Payment made */
public void setPayDate (Timestamp PayDate)
{
if (PayDate == null) throw new IllegalArgumentException ("PayDate is mandatory.");
set_Value (COLUMNNAME_PayDate, PayDate);
}
/** Get Payment date.
@return Date Payment made */
public Timestamp getPayDate() 
{
return (Timestamp)get_Value(COLUMNNAME_PayDate);
}

@XendraTrl(Identifier="86c5ceca-ebd3-e0ce-3fd7-25359ea4027a")
public static String es_PE_FIELD_PaymentSelection_PaymentDate_Description="Fecha cuando se hizo el pago.";

@XendraTrl(Identifier="86c5ceca-ebd3-e0ce-3fd7-25359ea4027a")
public static String es_PE_FIELD_PaymentSelection_PaymentDate_Help="La fecha de pago indica la fecha en que el pago fue hecho.";

@XendraTrl(Identifier="86c5ceca-ebd3-e0ce-3fd7-25359ea4027a")
public static String es_PE_FIELD_PaymentSelection_PaymentDate_Name="Fecha de Pago";

@XendraField(AD_Column_ID="PayDate",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86c5ceca-ebd3-e0ce-3fd7-25359ea4027a")
public static final String FIELDNAME_PaymentSelection_PaymentDate="86c5ceca-ebd3-e0ce-3fd7-25359ea4027a";

@XendraTrl(Identifier="d353687d-9a4e-6b13-8d72-98b0b480a03e")
public static String es_PE_COLUMN_PayDate_Name="Fecha de Pago";

@XendraColumn(AD_Element_ID="02e177f7-1ba9-0c09-c018-450de6d5502d",ColumnName="PayDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d353687d-9a4e-6b13-8d72-98b0b480a03e",
Synchronized="2017-08-05 16:54:04.0")
/** Column name PayDate */
public static final String COLUMNNAME_PayDate = "PayDate";
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

@XendraTrl(Identifier="e23bbe2c-01d7-b3be-b26e-a5a4a89a32bc")
public static String es_PE_FIELD_PaymentSelection_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="e23bbe2c-01d7-b3be-b26e-a5a4a89a32bc")
public static String es_PE_FIELD_PaymentSelection_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="e23bbe2c-01d7-b3be-b26e-a5a4a89a32bc")
public static String es_PE_FIELD_PaymentSelection_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e23bbe2c-01d7-b3be-b26e-a5a4a89a32bc")
public static final String FIELDNAME_PaymentSelection_Processed="e23bbe2c-01d7-b3be-b26e-a5a4a89a32bc";

@XendraTrl(Identifier="64bbe533-0c85-926f-67f5-b845f1cc4979")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64bbe533-0c85-926f-67f5-b845f1cc4979",
Synchronized="2017-08-05 16:54:04.0")
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

@XendraTrl(Identifier="fc42d684-e69c-41e0-c7b2-cf6bc2ee3bf2")
public static String es_PE_FIELD_PaymentSelection_ProcessNow_Name="Crear Pagos";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc42d684-e69c-41e0-c7b2-cf6bc2ee3bf2")
public static final String FIELDNAME_PaymentSelection_ProcessNow="fc42d684-e69c-41e0-c7b2-cf6bc2ee3bf2";

@XendraTrl(Identifier="410509bb-ae38-281e-b902-f662ed0b54b6")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="dc8c43e3-c9cb-ccfd-ab35-3ab3645ec155",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="410509bb-ae38-281e-b902-f662ed0b54b6",Synchronized="2017-08-05 16:54:04.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Total Amount.
@param TotalAmt Total Amount */
public void setTotalAmt (BigDecimal TotalAmt)
{
if (TotalAmt == null) throw new IllegalArgumentException ("TotalAmt is mandatory.");
set_Value (COLUMNNAME_TotalAmt, TotalAmt);
}
/** Get Total Amount.
@return Total Amount */
public BigDecimal getTotalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="159f6ec2-ab7b-a656-eb36-492bc0a1a762")
public static String es_PE_FIELD_PaymentSelection_TotalAmount_Description="Total Total";

@XendraTrl(Identifier="159f6ec2-ab7b-a656-eb36-492bc0a1a762")
public static String es_PE_FIELD_PaymentSelection_TotalAmount_Help="Indica el total total del documento";

@XendraTrl(Identifier="159f6ec2-ab7b-a656-eb36-492bc0a1a762")
public static String es_PE_FIELD_PaymentSelection_TotalAmount_Name="Total Total";

@XendraField(AD_Column_ID="TotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0cca236f-8556-bc24-da62-ded660cc2967",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="159f6ec2-ab7b-a656-eb36-492bc0a1a762")
public static final String FIELDNAME_PaymentSelection_TotalAmount="159f6ec2-ab7b-a656-eb36-492bc0a1a762";

@XendraTrl(Identifier="5e5d1e95-e01f-8bfd-e8e0-c52a46bee7e8")
public static String es_PE_COLUMN_TotalAmt_Name="Total Total";

@XendraColumn(AD_Element_ID="c413def6-435d-8c44-d0d5-90526042b2e0",ColumnName="TotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e5d1e95-e01f-8bfd-e8e0-c52a46bee7e8",
Synchronized="2017-08-05 16:54:05.0")
/** Column name TotalAmt */
public static final String COLUMNNAME_TotalAmt = "TotalAmt";
}
