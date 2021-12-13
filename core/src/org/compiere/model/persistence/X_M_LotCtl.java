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
/** Generated Model for M_LotCtl
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_LotCtl extends PO
{
/** Standard Constructor
@param ctx context
@param M_LotCtl_ID id
@param trxName transaction
*/
public X_M_LotCtl (Properties ctx, int M_LotCtl_ID, String trxName)
{
super (ctx, M_LotCtl_ID, trxName);
/** if (M_LotCtl_ID == 0)
{
setCurrentNext (0);	
// 100
setIncrementNo (0);	
// 1
setM_LotCtl_ID (0);
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
public X_M_LotCtl (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=556 */
public static int Table_ID=MTable.getTable_ID("M_LotCtl");

@XendraTrl(Identifier="225e0bdd-9294-61cd-1de5-d2703e6e4048")
public static String es_PE_TAB_LotControl_Description="Control de Lote de Producción";

@XendraTrl(Identifier="225e0bdd-9294-61cd-1de5-d2703e6e4048")
public static String es_PE_TAB_LotControl_Help="Definición para crear número de lotes para productos";

@XendraTrl(Identifier="225e0bdd-9294-61cd-1de5-d2703e6e4048")
public static String es_PE_TAB_LotControl_Name="Control de Lote";
@XendraTab(Name="Lot Control",
Description="Product Lot Control",Help="Definition to create Lot numbers for Products",
AD_Window_ID="8e36c673-4582-effe-d6a4-d690c65293bb",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="225e0bdd-9294-61cd-1de5-d2703e6e4048",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_LotControl="225e0bdd-9294-61cd-1de5-d2703e6e4048";

@XendraTrl(Identifier="b025cdd9-f820-6e59-8d8f-cd202032d25b")
public static String es_PE_TABLE_M_LotCtl_Name="Control de Lote";

@XendraTable(Name="Lot Control",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Product Lot Control",Help="",
TableName="M_LotCtl",AccessLevel="3",AD_Window_ID="8e36c673-4582-effe-d6a4-d690c65293bb",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=80,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="b025cdd9-f820-6e59-8d8f-cd202032d25b",Synchronized="2020-03-03 21:38:35.0")
/** TableName=M_LotCtl */
public static final String Table_Name="M_LotCtl";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_LotCtl");

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
    Table_ID = MTable.getTable_ID("M_LotCtl");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_LotCtl[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="74629415-66dd-b967-efc7-9c33b647b2ec")
public static String es_PE_FIELD_LotControl_CurrentNext_Name="Siguiente Secuencia";

@XendraTrl(Identifier="74629415-66dd-b967-efc7-9c33b647b2ec")
public static String es_PE_FIELD_LotControl_CurrentNext_Description="El número siguiente a ser usado";

@XendraTrl(Identifier="74629415-66dd-b967-efc7-9c33b647b2ec")
public static String es_PE_FIELD_LotControl_CurrentNext_Help="El siguiente corriente indica el número siguiente a usar para este documento";

@XendraField(AD_Column_ID="CurrentNext",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74629415-66dd-b967-efc7-9c33b647b2ec")
public static final String FIELDNAME_LotControl_CurrentNext="74629415-66dd-b967-efc7-9c33b647b2ec";

@XendraTrl(Identifier="e16f0a61-81ca-7993-18d1-761e05f57ee1")
public static String es_PE_COLUMN_CurrentNext_Name="Siguiente Secuencia";

@XendraColumn(AD_Element_ID="3cb3c545-8207-00bd-81ee-d16aaa68f4c2",ColumnName="CurrentNext",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="100",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e16f0a61-81ca-7993-18d1-761e05f57ee1",
Synchronized="2019-08-30 22:23:15.0")
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

@XendraTrl(Identifier="d091fe3d-9a7d-45bf-eac6-27489f4759d7")
public static String es_PE_FIELD_LotControl_Description_Name="Observación";

@XendraTrl(Identifier="d091fe3d-9a7d-45bf-eac6-27489f4759d7")
public static String es_PE_FIELD_LotControl_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d091fe3d-9a7d-45bf-eac6-27489f4759d7")
public static String es_PE_FIELD_LotControl_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d091fe3d-9a7d-45bf-eac6-27489f4759d7")
public static final String FIELDNAME_LotControl_Description="d091fe3d-9a7d-45bf-eac6-27489f4759d7";

@XendraTrl(Identifier="78e9f63a-30b7-1911-cd4b-abd319b1e3c8")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78e9f63a-30b7-1911-cd4b-abd319b1e3c8",
Synchronized="2019-08-30 22:23:15.0")
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
@XendraTrl(Identifier="cb7f6bd2-eff1-4e53-b255-a3882c42239d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb7f6bd2-eff1-4e53-b255-a3882c42239d",
Synchronized="2019-08-30 22:23:15.0")
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

@XendraTrl(Identifier="7cf12c63-466f-b3a6-fb0d-018910dc8b2d")
public static String es_PE_FIELD_LotControl_Increment_Name="Incremento";

@XendraTrl(Identifier="7cf12c63-466f-b3a6-fb0d-018910dc8b2d")
public static String es_PE_FIELD_LotControl_Increment_Description="El número a incrementar a el último número de documento";

@XendraTrl(Identifier="7cf12c63-466f-b3a6-fb0d-018910dc8b2d")
public static String es_PE_FIELD_LotControl_Increment_Help="El incremento indica el numero a adicionar al último número de documento para obtener el número de secuencia siguiente";

@XendraField(AD_Column_ID="IncrementNo",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7cf12c63-466f-b3a6-fb0d-018910dc8b2d")
public static final String FIELDNAME_LotControl_Increment="7cf12c63-466f-b3a6-fb0d-018910dc8b2d";

@XendraTrl(Identifier="c8fbb30b-23c0-7cee-d8de-f7a75597ec10")
public static String es_PE_COLUMN_IncrementNo_Name="Incremento";

@XendraColumn(AD_Element_ID="e731c4f7-49de-196e-dea3-c6d1bc840633",ColumnName="IncrementNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8fbb30b-23c0-7cee-d8de-f7a75597ec10",
Synchronized="2019-08-30 22:23:15.0")
/** Column name IncrementNo */
public static final String COLUMNNAME_IncrementNo = "IncrementNo";
/** Set Lot Control.
@param M_LotCtl_ID Product Lot Control */
public void setM_LotCtl_ID (int M_LotCtl_ID)
{
if (M_LotCtl_ID < 1) throw new IllegalArgumentException ("M_LotCtl_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_LotCtl_ID, Integer.valueOf(M_LotCtl_ID));
}
/** Get Lot Control.
@return Product Lot Control */
public int getM_LotCtl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_LotCtl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e204ec3f-ddd2-c6ea-923c-d89cef0b0141")
public static String es_PE_FIELD_LotControl_LotControl_Name="Control de Lote";

@XendraTrl(Identifier="e204ec3f-ddd2-c6ea-923c-d89cef0b0141")
public static String es_PE_FIELD_LotControl_LotControl_Description="Control del lote del producto";

@XendraTrl(Identifier="e204ec3f-ddd2-c6ea-923c-d89cef0b0141")
public static String es_PE_FIELD_LotControl_LotControl_Help="Definición para crear los números de lote para los productos";

@XendraField(AD_Column_ID="M_LotCtl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e204ec3f-ddd2-c6ea-923c-d89cef0b0141")
public static final String FIELDNAME_LotControl_LotControl="e204ec3f-ddd2-c6ea-923c-d89cef0b0141";
/** Column name M_LotCtl_ID */
public static final String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
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

@XendraTrl(Identifier="367b3fc9-baac-6007-2d30-7059beed6524")
public static String es_PE_FIELD_LotControl_Name_Name="Nombre";

@XendraTrl(Identifier="367b3fc9-baac-6007-2d30-7059beed6524")
public static String es_PE_FIELD_LotControl_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="367b3fc9-baac-6007-2d30-7059beed6524")
public static String es_PE_FIELD_LotControl_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="367b3fc9-baac-6007-2d30-7059beed6524")
public static final String FIELDNAME_LotControl_Name="367b3fc9-baac-6007-2d30-7059beed6524";

@XendraTrl(Identifier="fdd03cc5-a3fe-334b-ea9f-bc1a5d06ece3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdd03cc5-a3fe-334b-ea9f-bc1a5d06ece3",
Synchronized="2019-08-30 22:23:15.0")
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
@XendraTrl(Identifier="144f2fe0-61a2-b2b0-e5c1-cf6270640ae4")
public static String es_PE_FIELD_LotControl_Prefix_Name="Prefijo";

@XendraTrl(Identifier="144f2fe0-61a2-b2b0-e5c1-cf6270640ae4")
public static String es_PE_FIELD_LotControl_Prefix_Description="Caracteres de prefijo en la identificación del documento";

@XendraTrl(Identifier="144f2fe0-61a2-b2b0-e5c1-cf6270640ae4")
public static String es_PE_FIELD_LotControl_Prefix_Help="El Prefijo indica los caracteres a imprimir enfrente del número de documento";

@XendraField(AD_Column_ID="Prefix",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="144f2fe0-61a2-b2b0-e5c1-cf6270640ae4")
public static final String FIELDNAME_LotControl_Prefix="144f2fe0-61a2-b2b0-e5c1-cf6270640ae4";

@XendraTrl(Identifier="0633bd0c-7ac0-a479-0051-d6cd9d5ed358")
public static String es_PE_COLUMN_Prefix_Name="Prefijo";

@XendraColumn(AD_Element_ID="be6a221d-f61b-ebf0-5a2c-d677571991d6",ColumnName="Prefix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0633bd0c-7ac0-a479-0051-d6cd9d5ed358",
Synchronized="2019-08-30 22:23:15.0")
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

@XendraTrl(Identifier="de884d19-1184-b073-c3e4-a08875aeb5e6")
public static String es_PE_FIELD_LotControl_StartNo_Name="No. de Inicio";

@XendraTrl(Identifier="de884d19-1184-b073-c3e4-a08875aeb5e6")
public static String es_PE_FIELD_LotControl_StartNo_Description="Número de inicio / posición";

@XendraTrl(Identifier="de884d19-1184-b073-c3e4-a08875aeb5e6")
public static String es_PE_FIELD_LotControl_StartNo_Help="El Número de Inicio indica el número inicial del documento ó posición";

@XendraField(AD_Column_ID="StartNo",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de884d19-1184-b073-c3e4-a08875aeb5e6")
public static final String FIELDNAME_LotControl_StartNo="de884d19-1184-b073-c3e4-a08875aeb5e6";

@XendraTrl(Identifier="31ea0ca4-a43b-a956-c659-bac400f3d158")
public static String es_PE_COLUMN_StartNo_Name="No. de Inicio";

@XendraColumn(AD_Element_ID="88d592be-43c4-2902-25a0-56584fd9c3f9",ColumnName="StartNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="100",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31ea0ca4-a43b-a956-c659-bac400f3d158",
Synchronized="2019-08-30 22:23:15.0")
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
@XendraTrl(Identifier="b0820472-8620-c660-29c1-f3acfe152e12")
public static String es_PE_FIELD_LotControl_Suffix_Name="Sufijo";

@XendraTrl(Identifier="b0820472-8620-c660-29c1-f3acfe152e12")
public static String es_PE_FIELD_LotControl_Suffix_Description="Sufijo del Número";

@XendraTrl(Identifier="b0820472-8620-c660-29c1-f3acfe152e12")
public static String es_PE_FIELD_LotControl_Suffix_Help="El Sufijo indica los caracteres a ser adicionados al número de documento.";

@XendraField(AD_Column_ID="Suffix",IsCentrallyMaintained=true,
AD_Tab_ID="225e0bdd-9294-61cd-1de5-d2703e6e4048",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0820472-8620-c660-29c1-f3acfe152e12")
public static final String FIELDNAME_LotControl_Suffix="b0820472-8620-c660-29c1-f3acfe152e12";

@XendraTrl(Identifier="033331dd-237a-6ce6-17d1-172a0b0d57e7")
public static String es_PE_COLUMN_Suffix_Name="Sufijo";

@XendraColumn(AD_Element_ID="0404eac5-3c2b-06f8-cfae-d59c9fd0677d",ColumnName="Suffix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="033331dd-237a-6ce6-17d1-172a0b0d57e7",
Synchronized="2019-08-30 22:23:15.0")
/** Column name Suffix */
public static final String COLUMNNAME_Suffix = "Suffix";
}
