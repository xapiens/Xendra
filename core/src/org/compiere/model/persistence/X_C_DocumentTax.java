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
/** Generated Model for C_DocumentTax
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DocumentTax extends PO
{
/** Standard Constructor
@param ctx context
@param C_DocumentTax_ID id
@param trxName transaction
*/
public X_C_DocumentTax (Properties ctx, int C_DocumentTax_ID, String trxName)
{
super (ctx, C_DocumentTax_ID, trxName);
/** if (C_DocumentTax_ID == 0)
{
setC_DocumentTax_ID (0);
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DocumentTax (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000418 */
public static int Table_ID=MTable.getTable_ID("C_DocumentTax");

@XendraTrl(Identifier="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2")
public static String es_PE_TAB_DocumentTax_Name="Tipos Doc. SUNAT";
@XendraTab(Name="Document Tax",
Description="",Help="",AD_Window_ID="1c8a45a7-a83e-4d91-84b2-0afa05e9c7dd",SeqNo=10,TabLevel=0,
IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2",Synchronized="2019-03-19 07:34:02.0")
public static final String TABNAME_DocumentTax="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2";

@XendraTrl(Identifier="849371d5-d42c-4f26-adf7-42c615807a4d")
public static String es_PE_TABLE_C_DocumentTax_Name="DocumentTax";

@XendraTable(Name="DocumentTax",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_DocumentTax",AccessLevel="6",AD_Window_ID="1c8a45a7-a83e-4d91-84b2-0afa05e9c7dd",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="849371d5-d42c-4f26-adf7-42c615807a4d",Synchronized="2020-03-03 21:36:51.0")
/** TableName=C_DocumentTax */
public static final String Table_Name="C_DocumentTax";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DocumentTax");

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
    Table_ID = MTable.getTable_ID("C_DocumentTax");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DocumentTax[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_DocumentTax_ID.
@param C_DocumentTax_ID C_DocumentTax_ID */
public void setC_DocumentTax_ID (int C_DocumentTax_ID)
{
if (C_DocumentTax_ID < 1) throw new IllegalArgumentException ("C_DocumentTax_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocumentTax_ID, Integer.valueOf(C_DocumentTax_ID));
}
/** Get C_DocumentTax_ID.
@return C_DocumentTax_ID */
public int getC_DocumentTax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocumentTax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b6b3a480-292e-4610-8c90-a4e8dfca0232")
public static String es_PE_FIELD_DocumentTax_C_DocumentTax_ID_Name="C_DocumentTax_ID";

@XendraField(AD_Column_ID="C_DocumentTax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-19 07:34:01.0",
Identifier="b6b3a480-292e-4610-8c90-a4e8dfca0232")
public static final String FIELDNAME_DocumentTax_C_DocumentTax_ID="b6b3a480-292e-4610-8c90-a4e8dfca0232";
/** Column name C_DocumentTax_ID */
public static final String COLUMNNAME_C_DocumentTax_ID = "C_DocumentTax_ID";
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
@XendraTrl(Identifier="b5f7c229-8dae-4f7d-89a7-5738d70f9a8e")
public static String es_PE_FIELD_DocumentTax_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-19 07:34:01.0",
Identifier="b5f7c229-8dae-4f7d-89a7-5738d70f9a8e")
public static final String FIELDNAME_DocumentTax_Identifier="b5f7c229-8dae-4f7d-89a7-5738d70f9a8e";

@XendraTrl(Identifier="77a4dd9b-d8b6-404d-8730-e0c71874f3b4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77a4dd9b-d8b6-404d-8730-e0c71874f3b4",
Synchronized="2019-08-30 22:21:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 255)
{
log.warning("Length > 255 - truncated");
Name = Name.substring(0,254);
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
@XendraTrl(Identifier="6ba5f3c1-947d-4137-b72f-000c0ae5750d")
public static String es_PE_FIELD_DocumentTax_Name_Name="Nombre";

@XendraTrl(Identifier="6ba5f3c1-947d-4137-b72f-000c0ae5750d")
public static String es_PE_FIELD_DocumentTax_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6ba5f3c1-947d-4137-b72f-000c0ae5750d")
public static String es_PE_FIELD_DocumentTax_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-19 07:34:01.0",
Identifier="6ba5f3c1-947d-4137-b72f-000c0ae5750d")
public static final String FIELDNAME_DocumentTax_Name="6ba5f3c1-947d-4137-b72f-000c0ae5750d";

@XendraTrl(Identifier="4c5813aa-c8d2-4522-ab7e-9fbd420bc9a7")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c5813aa-c8d2-4522-ab7e-9fbd420bc9a7",
Synchronized="2019-08-30 22:21:30.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getTaxID());
}

@XendraTrl(Identifier="17130886-365f-462a-818a-1c0023b7e6b7")
public static String es_PE_FIELD_DocumentTax_TaxID_Name="RFC";

@XendraTrl(Identifier="17130886-365f-462a-818a-1c0023b7e6b7")
public static String es_PE_FIELD_DocumentTax_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="17130886-365f-462a-818a-1c0023b7e6b7")
public static String es_PE_FIELD_DocumentTax_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-19 07:34:01.0",
Identifier="17130886-365f-462a-818a-1c0023b7e6b7")
public static final String FIELDNAME_DocumentTax_TaxID="17130886-365f-462a-818a-1c0023b7e6b7";

@XendraTrl(Identifier="dc728544-ff90-469b-8e3e-aa3c5f5f594a")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc728544-ff90-469b-8e3e-aa3c5f5f594a",
Synchronized="2019-08-30 22:21:31.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
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
@XendraTrl(Identifier="23ef496b-c046-4aff-816c-e3d05aeeb2aa")
public static String es_PE_FIELD_DocumentTax_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="23ef496b-c046-4aff-816c-e3d05aeeb2aa")
public static String es_PE_FIELD_DocumentTax_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="23ef496b-c046-4aff-816c-e3d05aeeb2aa")
public static String es_PE_FIELD_DocumentTax_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="0418b0eb-4f6e-4f78-8b9d-1bfd1824beb2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-19 07:34:01.0",
Identifier="23ef496b-c046-4aff-816c-e3d05aeeb2aa")
public static final String FIELDNAME_DocumentTax_SearchKey="23ef496b-c046-4aff-816c-e3d05aeeb2aa";

@XendraTrl(Identifier="f1c94646-deb0-4858-91b7-8c8ebb664ad5")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1c94646-deb0-4858-91b7-8c8ebb664ad5",
Synchronized="2019-08-30 22:21:31.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
