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
/** Generated Model for M_SerNoCtl
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_SerNoCtl extends PO
{
/** Standard Constructor
@param ctx context
@param M_SerNoCtl_ID id
@param trxName transaction
*/
public X_M_SerNoCtl (Properties ctx, int M_SerNoCtl_ID, String trxName)
{
super (ctx, M_SerNoCtl_ID, trxName);
/** if (M_SerNoCtl_ID == 0)
{
setCurrentNext (0);	
// 100
setIncrementNo (0);	
// 1
setM_SerNoCtl_ID (0);
setName (null);
setStartNo (0);	
// 100
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_SerNoCtl (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=555 */
public static int Table_ID=MTable.getTable_ID("M_SerNoCtl");

@XendraTrl(Identifier="de14507c-ba8d-e889-51bf-72d6672fefc4")
public static String es_PE_TAB_SerialNoControl_Description="Control No. de Serie del Producto";

@XendraTrl(Identifier="de14507c-ba8d-e889-51bf-72d6672fefc4")
public static String es_PE_TAB_SerialNoControl_Help="Definición para crear los números de serie para los productos";

@XendraTrl(Identifier="de14507c-ba8d-e889-51bf-72d6672fefc4")
public static String es_PE_TAB_SerialNoControl_Name="Control No. de Serie";

@XendraTab(Name="Serial No Control",Description="Product Serial Number Control",
Help="Definition to create Serial numbers for Products",
AD_Window_ID="15591a4b-721e-18c5-b207-d85d143f88e3",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="de14507c-ba8d-e889-51bf-72d6672fefc4",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SerialNoControl="de14507c-ba8d-e889-51bf-72d6672fefc4";

@XendraTrl(Identifier="52d9ef99-9bcb-c641-e01f-84e140247cdf")
public static String es_PE_TABLE_M_SerNoCtl_Name="Control de numero de Serie";

@XendraTable(Name="Serial No Control",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Product Serial Number Control",
Help="",TableName="M_SerNoCtl",AccessLevel="3",AD_Window_ID="15591a4b-721e-18c5-b207-d85d143f88e3",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=80,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="52d9ef99-9bcb-c641-e01f-84e140247cdf",Synchronized="2020-03-03 21:38:56.0")
/** TableName=M_SerNoCtl */
public static final String Table_Name="M_SerNoCtl";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_SerNoCtl");

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
    Table_ID = MTable.getTable_ID("M_SerNoCtl");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_SerNoCtl[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="b012d99e-bf7b-40c5-341e-2a1e281e5c57")
public static String es_PE_FIELD_SerialNoControl_CurrentNext_Name="Siguiente Secuencia";

@XendraTrl(Identifier="b012d99e-bf7b-40c5-341e-2a1e281e5c57")
public static String es_PE_FIELD_SerialNoControl_CurrentNext_Description="El número siguiente a ser usado";

@XendraTrl(Identifier="b012d99e-bf7b-40c5-341e-2a1e281e5c57")
public static String es_PE_FIELD_SerialNoControl_CurrentNext_Help="El siguiente corriente indica el número siguiente a usar para este documento";

@XendraField(AD_Column_ID="CurrentNext",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b012d99e-bf7b-40c5-341e-2a1e281e5c57")
public static final String FIELDNAME_SerialNoControl_CurrentNext="b012d99e-bf7b-40c5-341e-2a1e281e5c57";

@XendraTrl(Identifier="6608cc11-bb1a-e03d-7854-7fd171840bcd")
public static String es_PE_COLUMN_CurrentNext_Name="Siguiente Secuencia";

@XendraColumn(AD_Element_ID="3cb3c545-8207-00bd-81ee-d16aaa68f4c2",ColumnName="CurrentNext",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="100",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6608cc11-bb1a-e03d-7854-7fd171840bcd",
Synchronized="2019-08-30 22:23:31.0")
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

@XendraTrl(Identifier="41e9258f-e7d7-fc56-4cd3-ab29f8f1b8cb")
public static String es_PE_FIELD_SerialNoControl_Description_Name="Observación";

@XendraTrl(Identifier="41e9258f-e7d7-fc56-4cd3-ab29f8f1b8cb")
public static String es_PE_FIELD_SerialNoControl_Description_Description="Observación";

@XendraTrl(Identifier="41e9258f-e7d7-fc56-4cd3-ab29f8f1b8cb")
public static String es_PE_FIELD_SerialNoControl_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41e9258f-e7d7-fc56-4cd3-ab29f8f1b8cb")
public static final String FIELDNAME_SerialNoControl_Description="41e9258f-e7d7-fc56-4cd3-ab29f8f1b8cb";

@XendraTrl(Identifier="9d9a728d-8450-ba51-b266-a66f4006a7fe")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d9a728d-8450-ba51-b266-a66f4006a7fe",
Synchronized="2019-08-30 22:23:31.0")
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
@XendraTrl(Identifier="a40a87e9-f97c-476d-bd3c-ba34adbbc13b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a40a87e9-f97c-476d-bd3c-ba34adbbc13b",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Increment.
@param IncrementNo The number to increment the last document number by */
public void setIncrementNo (int IncrementNo)
{
set_Value (COLUMNNAME_IncrementNo, Integer.valueOf(IncrementNo));
}
/** Get Increment.
@return The number to increment the last document number by */
public int getIncrementNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_IncrementNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab501177-f994-a169-f899-549301daf7f9")
public static String es_PE_FIELD_SerialNoControl_Increment_Name="Incremento";

@XendraTrl(Identifier="ab501177-f994-a169-f899-549301daf7f9")
public static String es_PE_FIELD_SerialNoControl_Increment_Description="El número a incrementar a el último número de documento";

@XendraTrl(Identifier="ab501177-f994-a169-f899-549301daf7f9")
public static String es_PE_FIELD_SerialNoControl_Increment_Help="El incremento indica el numero a adicionar al último número de documento para obtener el número de secuencia siguiente";

@XendraField(AD_Column_ID="IncrementNo",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab501177-f994-a169-f899-549301daf7f9")
public static final String FIELDNAME_SerialNoControl_Increment="ab501177-f994-a169-f899-549301daf7f9";

@XendraTrl(Identifier="6da63f66-e6f0-83d6-17e8-065f139b9d77")
public static String es_PE_COLUMN_IncrementNo_Name="Incremento";

@XendraColumn(AD_Element_ID="e731c4f7-49de-196e-dea3-c6d1bc840633",ColumnName="IncrementNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6da63f66-e6f0-83d6-17e8-065f139b9d77",
Synchronized="2019-08-30 22:23:31.0")
/** Column name IncrementNo */
public static final String COLUMNNAME_IncrementNo = "IncrementNo";
/** Set Serial No Control.
@param M_SerNoCtl_ID Product Serial Number Control */
public void setM_SerNoCtl_ID (int M_SerNoCtl_ID)
{
if (M_SerNoCtl_ID < 1) throw new IllegalArgumentException ("M_SerNoCtl_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_SerNoCtl_ID, Integer.valueOf(M_SerNoCtl_ID));
}
/** Get Serial No Control.
@return Product Serial Number Control */
public int getM_SerNoCtl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_SerNoCtl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5329dda-f756-6ed8-fff0-e877a6b3f449")
public static String es_PE_FIELD_SerialNoControl_SerialNoControl_Name="Control de numero de Serie";

@XendraTrl(Identifier="f5329dda-f756-6ed8-fff0-e877a6b3f449")
public static String es_PE_FIELD_SerialNoControl_SerialNoControl_Description="Control de número de serie del producto";

@XendraTrl(Identifier="f5329dda-f756-6ed8-fff0-e877a6b3f449")
public static String es_PE_FIELD_SerialNoControl_SerialNoControl_Help="Definición para crear numero de serie de productos.";

@XendraField(AD_Column_ID="M_SerNoCtl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5329dda-f756-6ed8-fff0-e877a6b3f449")
public static final String FIELDNAME_SerialNoControl_SerialNoControl="f5329dda-f756-6ed8-fff0-e877a6b3f449";
/** Column name M_SerNoCtl_ID */
public static final String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";
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

@XendraTrl(Identifier="4cb5e68e-9aee-bbc8-23e3-208c8b082e5b")
public static String es_PE_FIELD_SerialNoControl_Name_Name="Nombre";

@XendraTrl(Identifier="4cb5e68e-9aee-bbc8-23e3-208c8b082e5b")
public static String es_PE_FIELD_SerialNoControl_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4cb5e68e-9aee-bbc8-23e3-208c8b082e5b")
public static String es_PE_FIELD_SerialNoControl_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cb5e68e-9aee-bbc8-23e3-208c8b082e5b")
public static final String FIELDNAME_SerialNoControl_Name="4cb5e68e-9aee-bbc8-23e3-208c8b082e5b";

@XendraTrl(Identifier="cc14d6a0-4e71-61db-77d7-bf153e962099")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc14d6a0-4e71-61db-77d7-bf153e962099",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Prefix.
@param Prefix Prefix before the sequence number */
public void setPrefix (String Prefix)
{
if (Prefix != null && Prefix.length() > 10)
{
log.warning("Length > 10 - truncated");
Prefix = Prefix.substring(0,9);
}
set_Value (COLUMNNAME_Prefix, Prefix);
}
/** Get Prefix.
@return Prefix before the sequence number */
public String getPrefix() 
{
String value = (String)get_Value(COLUMNNAME_Prefix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0494e698-03bb-5981-7512-49c1f7f9c7db")
public static String es_PE_FIELD_SerialNoControl_Prefix_Name="Prefijo";

@XendraTrl(Identifier="0494e698-03bb-5981-7512-49c1f7f9c7db")
public static String es_PE_FIELD_SerialNoControl_Prefix_Description="Caracteres de prefijo en la identificación del documento";

@XendraTrl(Identifier="0494e698-03bb-5981-7512-49c1f7f9c7db")
public static String es_PE_FIELD_SerialNoControl_Prefix_Help="El Prefijo indica los caracteres a imprimir enfrente del número de documento";

@XendraField(AD_Column_ID="Prefix",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0494e698-03bb-5981-7512-49c1f7f9c7db")
public static final String FIELDNAME_SerialNoControl_Prefix="0494e698-03bb-5981-7512-49c1f7f9c7db";

@XendraTrl(Identifier="37177ccd-f7f0-8325-43a0-404d0ef0d613")
public static String es_PE_COLUMN_Prefix_Name="Prefijo";

@XendraColumn(AD_Element_ID="be6a221d-f61b-ebf0-5a2c-d677571991d6",ColumnName="Prefix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37177ccd-f7f0-8325-43a0-404d0ef0d613",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Prefix */
public static final String COLUMNNAME_Prefix = "Prefix";
/** Set Start No.
@param StartNo Starting number/position */
public void setStartNo (int StartNo)
{
set_Value (COLUMNNAME_StartNo, Integer.valueOf(StartNo));
}
/** Get Start No.
@return Starting number/position */
public int getStartNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_StartNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce740bd4-4876-908b-d8af-926e26963b60")
public static String es_PE_FIELD_SerialNoControl_StartNo_Name="No. de Inicio";

@XendraTrl(Identifier="ce740bd4-4876-908b-d8af-926e26963b60")
public static String es_PE_FIELD_SerialNoControl_StartNo_Description="Número de inicio / posición";

@XendraTrl(Identifier="ce740bd4-4876-908b-d8af-926e26963b60")
public static String es_PE_FIELD_SerialNoControl_StartNo_Help="El Número de Inicio indica el número inicial del documento ó posición";

@XendraField(AD_Column_ID="StartNo",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce740bd4-4876-908b-d8af-926e26963b60")
public static final String FIELDNAME_SerialNoControl_StartNo="ce740bd4-4876-908b-d8af-926e26963b60";

@XendraTrl(Identifier="ec4bf110-4391-542d-f0a5-951a785f6ded")
public static String es_PE_COLUMN_StartNo_Name="No. de Inicio";

@XendraColumn(AD_Element_ID="88d592be-43c4-2902-25a0-56584fd9c3f9",ColumnName="StartNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="100",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec4bf110-4391-542d-f0a5-951a785f6ded",
Synchronized="2019-08-30 22:23:31.0")
/** Column name StartNo */
public static final String COLUMNNAME_StartNo = "StartNo";
/** Set Suffix.
@param Suffix Suffix after the number */
public void setSuffix (String Suffix)
{
if (Suffix != null && Suffix.length() > 10)
{
log.warning("Length > 10 - truncated");
Suffix = Suffix.substring(0,9);
}
set_Value (COLUMNNAME_Suffix, Suffix);
}
/** Get Suffix.
@return Suffix after the number */
public String getSuffix() 
{
String value = (String)get_Value(COLUMNNAME_Suffix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ee5236bc-7400-27a3-2294-e9eab72e54a8")
public static String es_PE_FIELD_SerialNoControl_Suffix_Name="Sufijo";

@XendraTrl(Identifier="ee5236bc-7400-27a3-2294-e9eab72e54a8")
public static String es_PE_FIELD_SerialNoControl_Suffix_Description="Sufijo del Número";

@XendraTrl(Identifier="ee5236bc-7400-27a3-2294-e9eab72e54a8")
public static String es_PE_FIELD_SerialNoControl_Suffix_Help="El Sufijo indica los caracteres a ser adicionados al número de documento.";

@XendraField(AD_Column_ID="Suffix",IsCentrallyMaintained=true,
AD_Tab_ID="de14507c-ba8d-e889-51bf-72d6672fefc4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee5236bc-7400-27a3-2294-e9eab72e54a8")
public static final String FIELDNAME_SerialNoControl_Suffix="ee5236bc-7400-27a3-2294-e9eab72e54a8";

@XendraTrl(Identifier="11c97305-8d48-acc8-8b7d-a6dec7db3993")
public static String es_PE_COLUMN_Suffix_Name="Sufijo";

@XendraColumn(AD_Element_ID="0404eac5-3c2b-06f8-cfae-d59c9fd0677d",ColumnName="Suffix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11c97305-8d48-acc8-8b7d-a6dec7db3993",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Suffix */
public static final String COLUMNNAME_Suffix = "Suffix";
}
