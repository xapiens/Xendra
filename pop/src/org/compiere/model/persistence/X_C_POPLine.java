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
/** Generated Model for C_POPLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_POPLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_POPLine_ID id
@param trxName transaction
*/
public X_C_POPLine (Properties ctx, int C_POPLine_ID, String trxName)
{
super (ctx, C_POPLine_ID, trxName);
/** if (C_POPLine_ID == 0)
{
setC_POPLine_ID (0);
setIsDescription (false);	
// N
setIsKey (false);	
// N
setIsNextLine (false);	
// N
setIsReadWrite (false);	
// N
setIsVisible (false);	
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
public X_C_POPLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000170 */
public static int Table_ID=MTable.getTable_ID("C_POPLine");

@XendraTrl(Identifier="016e6de5-471b-f45c-f278-6936c03a4e0a")
public static String es_PE_TAB_POPLine_Name="POPLine";
@XendraTab(Name="POPLine",Description="",
Help="",AD_Window_ID="5020fd22-079b-8104-1805-e79a96a8fbbf",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="016e6de5-471b-f45c-f278-6936c03a4e0a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_POPLine="016e6de5-471b-f45c-f278-6936c03a4e0a";

@XendraTrl(Identifier="c006beaa-3df7-c121-44dc-b58adf167f9f")
public static String es_PE_TABLE_C_POPLine_Name="Point of Purchase Line";

@XendraTable(Name="Point of Purchase Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_POPLine",
AccessLevel="3",AD_Window_ID="5020fd22-079b-8104-1805-e79a96a8fbbf",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="c006beaa-3df7-c121-44dc-b58adf167f9f",Synchronized="2020-03-03 21:37:27.0")
/** TableName=C_POPLine */
public static final String Table_Name="C_POPLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POPLine");

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
    Table_ID = MTable.getTable_ID("C_POPLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POPLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="f36112d7-89f8-e434-6bd9-96fa4fec65ba")
public static String es_PE_FIELD_POPLine_Column_Name="Columna";

@XendraTrl(Identifier="f36112d7-89f8-e434-6bd9-96fa4fec65ba")
public static String es_PE_FIELD_POPLine_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="f36112d7-89f8-e434-6bd9-96fa4fec65ba")
public static String es_PE_FIELD_POPLine_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f36112d7-89f8-e434-6bd9-96fa4fec65ba")
public static final String FIELDNAME_POPLine_Column="f36112d7-89f8-e434-6bd9-96fa4fec65ba";

@XendraTrl(Identifier="2749f6a6-03fb-bb42-3d48-46373e800fe0")
public static String es_PE_COLUMN_AD_Column_ID_Name="Column";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2749f6a6-03fb-bb42-3d48-46373e800fe0",Synchronized="2019-08-30 22:22:03.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID <= 0) set_Value (COLUMNNAME_AD_Reference_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="90271dae-f519-2450-738a-1d374e5173a6")
public static String es_PE_FIELD_POPLine_Reference_Name="Referencia";

@XendraTrl(Identifier="90271dae-f519-2450-738a-1d374e5173a6")
public static String es_PE_FIELD_POPLine_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="90271dae-f519-2450-738a-1d374e5173a6")
public static String es_PE_FIELD_POPLine_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90271dae-f519-2450-738a-1d374e5173a6")
public static final String FIELDNAME_POPLine_Reference="90271dae-f519-2450-738a-1d374e5173a6";

@XendraTrl(Identifier="5bbac650-f0cd-4899-abda-360faddb285a")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5bbac650-f0cd-4899-abda-360faddb285a",Synchronized="2019-08-30 22:22:03.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eba96749-4283-bb79-2c4c-fcdcbafa4d72")
public static String es_PE_FIELD_POPLine_ReferenceKey_Name="Valor de Referencia";

@XendraTrl(Identifier="eba96749-4283-bb79-2c4c-fcdcbafa4d72")
public static String es_PE_FIELD_POPLine_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="eba96749-4283-bb79-2c4c-fcdcbafa4d72")
public static String es_PE_FIELD_POPLine_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eba96749-4283-bb79-2c4c-fcdcbafa4d72")
public static final String FIELDNAME_POPLine_ReferenceKey="eba96749-4283-bb79-2c4c-fcdcbafa4d72";

@XendraTrl(Identifier="1d69fb3a-baeb-d5d8-0f22-0de526e6dba4")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",
AD_Val_Rule_ID="147ddeef-c150-2ac8-67e8-346cc5225ef4",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d69fb3a-baeb-d5d8-0f22-0de526e6dba4",
Synchronized="2019-08-30 22:22:03.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7f45e0b5-f407-b879-4cb6-35d6bd827b5e")
public static String es_PE_FIELD_POPLine_Table_Name="Tabla";

@XendraTrl(Identifier="7f45e0b5-f407-b879-4cb6-35d6bd827b5e")
public static String es_PE_FIELD_POPLine_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="7f45e0b5-f407-b879-4cb6-35d6bd827b5e")
public static String es_PE_FIELD_POPLine_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f45e0b5-f407-b879-4cb6-35d6bd827b5e")
public static final String FIELDNAME_POPLine_Table="7f45e0b5-f407-b879-4cb6-35d6bd827b5e";

@XendraTrl(Identifier="1dff8200-c0da-f801-e77d-75b8c5a1f671")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1dff8200-c0da-f801-e77d-75b8c5a1f671",
Synchronized="2019-08-30 22:22:03.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Classname.
@param Classname Java Classname */
public void setClassname (String Classname)
{
if (Classname != null && Classname.length() > 60)
{
log.warning("Length > 60 - truncated");
Classname = Classname.substring(0,59);
}
set_Value (COLUMNNAME_Classname, Classname);
}
/** Get Classname.
@return Java Classname */
public String getClassname() 
{
String value = (String)get_Value(COLUMNNAME_Classname);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d29b6e32-81af-4eaf-f81a-d7ffdee3a003")
public static String es_PE_FIELD_POPLine_Classname_Name="Nombre de Clase";

@XendraTrl(Identifier="d29b6e32-81af-4eaf-f81a-d7ffdee3a003")
public static String es_PE_FIELD_POPLine_Classname_Description="Nombre de la clase Java";

@XendraTrl(Identifier="d29b6e32-81af-4eaf-f81a-d7ffdee3a003")
public static String es_PE_FIELD_POPLine_Classname_Help="El nombre de clase identifica el nombre de la clase Java usada por este Informe ó proceso.";

@XendraField(AD_Column_ID="Classname",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d29b6e32-81af-4eaf-f81a-d7ffdee3a003")
public static final String FIELDNAME_POPLine_Classname="d29b6e32-81af-4eaf-f81a-d7ffdee3a003";

@XendraTrl(Identifier="3f0a9d56-fe3a-6782-3d6f-e55254bc9961")
public static String es_PE_COLUMN_Classname_Name="Classname";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f0a9d56-fe3a-6782-3d6f-e55254bc9961",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
/** Set Point of Purchase.
@param C_POP_ID Point of Purchase */
public void setC_POP_ID (int C_POP_ID)
{
if (C_POP_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_POP_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_POP_ID, Integer.valueOf(C_POP_ID));
}
/** Get Point of Purchase.
@return Point of Purchase */
public int getC_POP_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POP_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d38036a-2ca7-f71f-2cdd-9f5682419ad8")
public static String es_PE_FIELD_POPLine_PointOfPurchase_Name="Punto de Compra";

@XendraField(AD_Column_ID="C_POP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d38036a-2ca7-f71f-2cdd-9f5682419ad8")
public static final String FIELDNAME_POPLine_PointOfPurchase="0d38036a-2ca7-f71f-2cdd-9f5682419ad8";

@XendraTrl(Identifier="4e6f9015-1085-bbc7-65ad-27f7d51c9d5b")
public static String es_PE_COLUMN_C_POP_ID_Name="Point of Purchase";

@XendraColumn(AD_Element_ID="aeab4e94-a404-6b73-10c4-b133128c2853",ColumnName="C_POP_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e6f9015-1085-bbc7-65ad-27f7d51c9d5b",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_POP_ID */
public static final String COLUMNNAME_C_POP_ID = "C_POP_ID";
/** Set Point of Purchase Line.
@param C_POPLine_ID Point of Purchase Line */
public void setC_POPLine_ID (int C_POPLine_ID)
{
if (C_POPLine_ID < 1) throw new IllegalArgumentException ("C_POPLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POPLine_ID, Integer.valueOf(C_POPLine_ID));
}
/** Get Point of Purchase Line.
@return Point of Purchase Line */
public int getC_POPLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POPLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="206d6bc4-f9a8-e31d-4eb9-8f46e0ada676")
public static String es_PE_FIELD_POPLine_PointOfPurchaseLine_Name="Point of Purchase Line";

@XendraField(AD_Column_ID="C_POPLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="206d6bc4-f9a8-e31d-4eb9-8f46e0ada676")
public static final String FIELDNAME_POPLine_PointOfPurchaseLine="206d6bc4-f9a8-e31d-4eb9-8f46e0ada676";
/** Column name C_POPLine_ID */
public static final String COLUMNNAME_C_POPLine_ID = "C_POPLine_ID";
/** Set Store POP Line.
@param C_StorePOPLine_ID Store POP Line */
public void setC_StorePOPLine_ID (int C_StorePOPLine_ID)
{
if (C_StorePOPLine_ID <= 0) set_Value (COLUMNNAME_C_StorePOPLine_ID, null);
 else 
set_Value (COLUMNNAME_C_StorePOPLine_ID, Integer.valueOf(C_StorePOPLine_ID));
}
/** Get Store POP Line.
@return Store POP Line */
public int getC_StorePOPLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_StorePOPLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="668a3079-2343-4be2-beef-566cabfd2ab0")
public static String es_PE_COLUMN_C_StorePOPLine_ID_Name="Store POP Line";

@XendraColumn(AD_Element_ID="405218aa-0b21-4c83-8cfa-bfa2bd707e3b",ColumnName="C_StorePOPLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="668a3079-2343-4be2-beef-566cabfd2ab0",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_StorePOPLine_ID */
public static final String COLUMNNAME_C_StorePOPLine_ID = "C_StorePOPLine_ID";
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

@XendraTrl(Identifier="6be0b51d-ad76-fa47-7c59-c4ec5566dd3d")
public static String es_PE_FIELD_POPLine_Description_Name="Descripción";

@XendraTrl(Identifier="6be0b51d-ad76-fa47-7c59-c4ec5566dd3d")
public static String es_PE_FIELD_POPLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="6be0b51d-ad76-fa47-7c59-c4ec5566dd3d")
public static String es_PE_FIELD_POPLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6be0b51d-ad76-fa47-7c59-c4ec5566dd3d")
public static final String FIELDNAME_POPLine_Description="6be0b51d-ad76-fa47-7c59-c4ec5566dd3d";

@XendraTrl(Identifier="e3957b9b-4945-fe44-84f0-2265b8838b9b")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3957b9b-4945-fe44-84f0-2265b8838b9b",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="0f1176a3-703e-0bed-730e-c6df26211006")
public static String es_PE_FIELD_POPLine_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="0f1176a3-703e-0bed-730e-c6df26211006")
public static String es_PE_FIELD_POPLine_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="0f1176a3-703e-0bed-730e-c6df26211006")
public static String es_PE_FIELD_POPLine_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f1176a3-703e-0bed-730e-c6df26211006")
public static final String FIELDNAME_POPLine_CommentHelp="0f1176a3-703e-0bed-730e-c6df26211006";

@XendraTrl(Identifier="38406f80-0bd4-7cc2-96d8-01a82c2fc32a")
public static String es_PE_COLUMN_Help_Name="Comment/Help";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38406f80-0bd4-7cc2-96d8-01a82c2fc32a",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="ef0c399c-0c63-40dc-9258-df465526fefa")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef0c399c-0c63-40dc-9258-df465526fefa",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsColorColumn.
@param IsColorColumn IsColorColumn */
public void setIsColorColumn (boolean IsColorColumn)
{
set_Value (COLUMNNAME_IsColorColumn, Boolean.valueOf(IsColorColumn));
}
/** Get IsColorColumn.
@return IsColorColumn */
public boolean isColorColumn() 
{
Object oo = get_Value(COLUMNNAME_IsColorColumn);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ee2fa21d-218c-2184-9cf2-5a5abc3363cf")
public static String es_PE_FIELD_POPLine_IsColorColumn_Name="IsColorColumn";

@XendraField(AD_Column_ID="IsColorColumn",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee2fa21d-218c-2184-9cf2-5a5abc3363cf")
public static final String FIELDNAME_POPLine_IsColorColumn="ee2fa21d-218c-2184-9cf2-5a5abc3363cf";

@XendraTrl(Identifier="c3300c0d-e8df-daf3-971a-b5b36a73c0c5")
public static String es_PE_COLUMN_IsColorColumn_Name="IsColorColumn";

@XendraColumn(AD_Element_ID="483dfa3a-1b4f-898f-1165-7a916ae6f797",ColumnName="IsColorColumn",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3300c0d-e8df-daf3-971a-b5b36a73c0c5",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsColorColumn */
public static final String COLUMNNAME_IsColorColumn = "IsColorColumn";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f39f2b93-87e8-b27f-9953-a2b6d296fc85")
public static String es_PE_FIELD_POPLine_Default_Name="Predeterminado";

@XendraTrl(Identifier="f39f2b93-87e8-b27f-9953-a2b6d296fc85")
public static String es_PE_FIELD_POPLine_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="f39f2b93-87e8-b27f-9953-a2b6d296fc85")
public static String es_PE_FIELD_POPLine_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f39f2b93-87e8-b27f-9953-a2b6d296fc85")
public static final String FIELDNAME_POPLine_Default="f39f2b93-87e8-b27f-9953-a2b6d296fc85";

@XendraTrl(Identifier="bf800c6e-1496-4a59-8977-37b00437792e")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf800c6e-1496-4a59-8977-37b00437792e",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Description Only.
@param IsDescription if true, the line is just DESCRIPTION and no transaction */
public void setIsDescription (boolean IsDescription)
{
set_Value (COLUMNNAME_IsDescription, Boolean.valueOf(IsDescription));
}
/** Get Description Only.
@return if true, the line is just DESCRIPTION and no transaction */
public boolean isDescription() 
{
Object oo = get_Value(COLUMNNAME_IsDescription);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9007efdd-8378-7594-97cc-95e7967a6ea3")
public static String es_PE_FIELD_POPLine_DescriptionOnly_Name="Sólo Descripción";

@XendraTrl(Identifier="9007efdd-8378-7594-97cc-95e7967a6ea3")
public static String es_PE_FIELD_POPLine_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="9007efdd-8378-7594-97cc-95e7967a6ea3")
public static String es_PE_FIELD_POPLine_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9007efdd-8378-7594-97cc-95e7967a6ea3")
public static final String FIELDNAME_POPLine_DescriptionOnly="9007efdd-8378-7594-97cc-95e7967a6ea3";

@XendraTrl(Identifier="142a944e-043a-5027-fbb9-70b5fdf1ff52")
public static String es_PE_COLUMN_IsDescription_Name="Description Only";

@XendraColumn(AD_Element_ID="bd7f450d-a061-1b08-60d8-19c8943042f0",ColumnName="IsDescription",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="142a944e-043a-5027-fbb9-70b5fdf1ff52",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsDescription */
public static final String COLUMNNAME_IsDescription = "IsDescription";
/** Set Key column.
@param IsKey This column is the key in this table */
public void setIsKey (boolean IsKey)
{
set_Value (COLUMNNAME_IsKey, Boolean.valueOf(IsKey));
}
/** Get Key column.
@return This column is the key in this table */
public boolean isKey() 
{
Object oo = get_Value(COLUMNNAME_IsKey);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ff361de3-6545-8068-203d-9959b5e1c73a")
public static String es_PE_FIELD_POPLine_KeyColumn_Name="Columna Clave";

@XendraTrl(Identifier="ff361de3-6545-8068-203d-9959b5e1c73a")
public static String es_PE_FIELD_POPLine_KeyColumn_Description="Esta columna es la clave en esta tabla";

@XendraTrl(Identifier="ff361de3-6545-8068-203d-9959b5e1c73a")
public static String es_PE_FIELD_POPLine_KeyColumn_Help="La columna clave debe también desplegar la secuencia 0 en la definición de campo y puede estar oculto";

@XendraField(AD_Column_ID="IsKey",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff361de3-6545-8068-203d-9959b5e1c73a")
public static final String FIELDNAME_POPLine_KeyColumn="ff361de3-6545-8068-203d-9959b5e1c73a";

@XendraTrl(Identifier="0d0f97f6-fbc2-2bb6-a5f5-6e076dae6a90")
public static String es_PE_COLUMN_IsKey_Name="Key column";

@XendraColumn(AD_Element_ID="8be2cc4b-c2a0-4ba3-839f-51f95a60471f",ColumnName="IsKey",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d0f97f6-fbc2-2bb6-a5f5-6e076dae6a90",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsKey */
public static final String COLUMNNAME_IsKey = "IsKey";
/** Set Next Line.
@param IsNextLine Print item on next line */
public void setIsNextLine (boolean IsNextLine)
{
set_Value (COLUMNNAME_IsNextLine, Boolean.valueOf(IsNextLine));
}
/** Get Next Line.
@return Print item on next line */
public boolean isNextLine() 
{
Object oo = get_Value(COLUMNNAME_IsNextLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b8cfd795-28aa-0e20-8b51-32e89b3e7ab0")
public static String es_PE_FIELD_POPLine_NextLine_Name="Próxima Línea";

@XendraTrl(Identifier="b8cfd795-28aa-0e20-8b51-32e89b3e7ab0")
public static String es_PE_FIELD_POPLine_NextLine_Description="Imprimir item en la próxima línea";

@XendraTrl(Identifier="b8cfd795-28aa-0e20-8b51-32e89b3e7ab0")
public static String es_PE_FIELD_POPLine_NextLine_Help="Sí no se selecciona; el item es impreso en la misma línea";

@XendraField(AD_Column_ID="IsNextLine",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8cfd795-28aa-0e20-8b51-32e89b3e7ab0")
public static final String FIELDNAME_POPLine_NextLine="b8cfd795-28aa-0e20-8b51-32e89b3e7ab0";

@XendraTrl(Identifier="0f464898-0457-d030-5407-c4fded9a7bf5")
public static String es_PE_COLUMN_IsNextLine_Name="Next Line";

@XendraColumn(AD_Element_ID="f174a61c-2e3c-e69b-1602-2c17eb3540b8",ColumnName="IsNextLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f464898-0457-d030-5407-c4fded9a7bf5",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsNextLine */
public static final String COLUMNNAME_IsNextLine = "IsNextLine";
/** Set IsOverwrite.
@param IsOverwrite IsOverwrite */
public void setIsOverwrite (boolean IsOverwrite)
{
set_Value (COLUMNNAME_IsOverwrite, Boolean.valueOf(IsOverwrite));
}
/** Get IsOverwrite.
@return IsOverwrite */
public boolean isOverwrite() 
{
Object oo = get_Value(COLUMNNAME_IsOverwrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9cc540ff-c693-6d62-ae12-787ba3662ad3")
public static String es_PE_COLUMN_IsOverwrite_Name="IsOverwrite";

@XendraColumn(AD_Element_ID="68339b4d-933a-68ba-d78f-c0fbb9c1c361",ColumnName="IsOverwrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cc540ff-c693-6d62-ae12-787ba3662ad3",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsOverwrite */
public static final String COLUMNNAME_IsOverwrite = "IsOverwrite";
/** Set Read Write.
@param IsReadWrite Field is read / write */
public void setIsReadWrite (boolean IsReadWrite)
{
set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
}
/** Get Read Write.
@return Field is read / write */
public boolean isReadWrite() 
{
Object oo = get_Value(COLUMNNAME_IsReadWrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="be0c6b03-68be-086f-409f-c68381e69c94")
public static String es_PE_FIELD_POPLine_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="be0c6b03-68be-086f-409f-c68381e69c94")
public static String es_PE_FIELD_POPLine_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="be0c6b03-68be-086f-409f-c68381e69c94")
public static String es_PE_FIELD_POPLine_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be0c6b03-68be-086f-409f-c68381e69c94")
public static final String FIELDNAME_POPLine_ReadWrite="be0c6b03-68be-086f-409f-c68381e69c94";

@XendraTrl(Identifier="3814e354-b7bc-5912-4301-cbe52425f269")
public static String es_PE_COLUMN_IsReadWrite_Name="Read Write";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3814e354-b7bc-5912-4301-cbe52425f269",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
/** Set IsVisible.
@param IsVisible IsVisible */
public void setIsVisible (boolean IsVisible)
{
set_Value (COLUMNNAME_IsVisible, Boolean.valueOf(IsVisible));
}
/** Get IsVisible.
@return IsVisible */
public boolean isVisible() 
{
Object oo = get_Value(COLUMNNAME_IsVisible);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0af6659d-5a8d-d58a-a28a-6d6528ae45d9")
public static String es_PE_FIELD_POPLine_IsVisible_Name="isvisible";

@XendraField(AD_Column_ID="IsVisible",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0af6659d-5a8d-d58a-a28a-6d6528ae45d9")
public static final String FIELDNAME_POPLine_IsVisible="0af6659d-5a8d-d58a-a28a-6d6528ae45d9";

@XendraTrl(Identifier="fedba02e-2003-4f9f-e6f8-3e2ea1112f0d")
public static String es_PE_COLUMN_IsVisible_Name="IsVisible";

@XendraColumn(AD_Element_ID="d5755b76-7c48-2932-e64a-ac8e7bfa27c9",ColumnName="IsVisible",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fedba02e-2003-4f9f-e6f8-3e2ea1112f0d",
Synchronized="2019-08-30 22:22:04.0")
/** Column name IsVisible */
public static final String COLUMNNAME_IsVisible = "IsVisible";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a4288acb-9979-5255-9be8-004e31a63baf")
public static String es_PE_FIELD_POPLine_LineNo_Name="No. Línea";

@XendraTrl(Identifier="a4288acb-9979-5255-9be8-004e31a63baf")
public static String es_PE_FIELD_POPLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="a4288acb-9979-5255-9be8-004e31a63baf")
public static String es_PE_FIELD_POPLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4288acb-9979-5255-9be8-004e31a63baf")
public static final String FIELDNAME_POPLine_LineNo="a4288acb-9979-5255-9be8-004e31a63baf";

@XendraTrl(Identifier="319a8d8f-3836-6008-13e1-9eee0a0a5633")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="319a8d8f-3836-6008-13e1-9eee0a0a5633",
Synchronized="2019-08-30 22:22:04.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
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

@XendraTrl(Identifier="93b16e84-7bdb-e566-21b9-636781a35355")
public static String es_PE_FIELD_POPLine_Name_Name="Nombre";

@XendraTrl(Identifier="93b16e84-7bdb-e566-21b9-636781a35355")
public static String es_PE_FIELD_POPLine_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="93b16e84-7bdb-e566-21b9-636781a35355")
public static String es_PE_FIELD_POPLine_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93b16e84-7bdb-e566-21b9-636781a35355")
public static final String FIELDNAME_POPLine_Name="93b16e84-7bdb-e566-21b9-636781a35355";

@XendraTrl(Identifier="a84f3f96-98b5-f2d7-baa9-a75a867cb7f0")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a84f3f96-98b5-f2d7-baa9-a75a867cb7f0",
Synchronized="2019-08-30 22:22:04.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Source Method.
@param SourceMethodName Source Method Name */
public void setSourceMethodName (String SourceMethodName)
{
if (SourceMethodName != null && SourceMethodName.length() > 60)
{
log.warning("Length > 60 - truncated");
SourceMethodName = SourceMethodName.substring(0,59);
}
set_Value (COLUMNNAME_SourceMethodName, SourceMethodName);
}
/** Get Source Method.
@return Source Method Name */
public String getSourceMethodName() 
{
String value = (String)get_Value(COLUMNNAME_SourceMethodName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3f7e24fe-e3cf-2379-37ff-1f7a21ebac16")
public static String es_PE_FIELD_POPLine_SourceMethod_Name="Método de Fuente";

@XendraTrl(Identifier="3f7e24fe-e3cf-2379-37ff-1f7a21ebac16")
public static String es_PE_FIELD_POPLine_SourceMethod_Description="Nombre Método de Fuente";

@XendraField(AD_Column_ID="SourceMethodName",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f7e24fe-e3cf-2379-37ff-1f7a21ebac16")
public static final String FIELDNAME_POPLine_SourceMethod="3f7e24fe-e3cf-2379-37ff-1f7a21ebac16";

@XendraTrl(Identifier="ae8c6506-9d7b-88c6-ac39-a47b8ff5ad61")
public static String es_PE_COLUMN_SourceMethodName_Name="Source Method";

@XendraColumn(AD_Element_ID="c8f923ba-42fd-65b8-bf15-8f7d5b2d78ca",ColumnName="SourceMethodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae8c6506-9d7b-88c6-ac39-a47b8ff5ad61",
Synchronized="2019-08-30 22:22:04.0")
/** Column name SourceMethodName */
public static final String COLUMNNAME_SourceMethodName = "SourceMethodName";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type != null && Type.length() > 1)
{
log.warning("Length > 1 - truncated");
Type = Type.substring(0,0);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
return (String)get_Value(COLUMNNAME_Type);
}

@XendraTrl(Identifier="98382b01-fd4b-9636-ee97-5d2583631932")
public static String es_PE_FIELD_POPLine_Type_Name="Tipo";

@XendraTrl(Identifier="98382b01-fd4b-9636-ee97-5d2583631932")
public static String es_PE_FIELD_POPLine_Type_Description="Tipo de validación (SQL; Java Script; Java Language)";

@XendraTrl(Identifier="98382b01-fd4b-9636-ee97-5d2583631932")
public static String es_PE_FIELD_POPLine_Type_Help="Indica el tipo de validación que ocurrirá. Esto puede ser SQL; Java Script ó Java Language.";

@XendraField(AD_Column_ID="Type",IsCentrallyMaintained=true,
AD_Tab_ID="016e6de5-471b-f45c-f278-6936c03a4e0a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98382b01-fd4b-9636-ee97-5d2583631932")
public static final String FIELDNAME_POPLine_Type="98382b01-fd4b-9636-ee97-5d2583631932";

@XendraTrl(Identifier="0a41ef95-bb05-47ec-4b94-4eefd86fce3d")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=17,AD_Reference_Value_ID="0cb23f5b-8205-3d4b-f168-2a135e888ca4",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0a41ef95-bb05-47ec-4b94-4eefd86fce3d",Synchronized="2019-08-30 22:22:04.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
