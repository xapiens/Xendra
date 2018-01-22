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
/** Generated Model for S_ResourceAssignment
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_ResourceAssignment extends PO
{
/** Standard Constructor
@param ctx context
@param S_ResourceAssignment_ID id
@param trxName transaction
*/
public X_S_ResourceAssignment (Properties ctx, int S_ResourceAssignment_ID, String trxName)
{
super (ctx, S_ResourceAssignment_ID, trxName);
/** if (S_ResourceAssignment_ID == 0)
{
setAssignDateFrom (new Timestamp(System.currentTimeMillis()));
setIsConfirmed (false);	
// N
setName (null);
setS_ResourceAssignment_ID (0);
setS_Resource_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_ResourceAssignment (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=485 */
public static int Table_ID=MTable.getTable_ID("S_ResourceAssignment");

@XendraTrl(Identifier="242f4840-dbe9-305d-69f8-5b3871e78e24")
public static String es_PE_TAB_Assignment_Description="Asignación de Recursos";

@XendraTrl(Identifier="242f4840-dbe9-305d-69f8-5b3871e78e24")
public static String es_PE_TAB_Assignment_Name="Asignación";

@XendraTrl(Identifier="242f4840-dbe9-305d-69f8-5b3871e78e24")
public static String es_PE_TAB_Assignment_Help="Historia de asignaciones";

@XendraTab(Name="Assignment",Description="Resource Assignments",Help="History of Assignments",
AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",SeqNo=70,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="d0370134-56b7-d468-cd9b-34d10b9d8e9c",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="242f4840-dbe9-305d-69f8-5b3871e78e24",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Assignment="242f4840-dbe9-305d-69f8-5b3871e78e24";

@XendraTrl(Identifier="f7a5ddf2-cb1e-b32b-1254-d475502216d7")
public static String es_PE_TABLE_S_ResourceAssignment_Name="Asignación de Recursos";

@XendraTable(Name="Resource Assignment",Description="Resource Assignment",Help="",
TableName="S_ResourceAssignment",AccessLevel="1",
AD_Window_ID="d64fba3f-bbf2-bd5b-1f70-0c9bcedb722a",AD_Val_Rule_ID="",IsKey=1,LoadSeq=110,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.services",Identifier="f7a5ddf2-cb1e-b32b-1254-d475502216d7",
Synchronized="2017-08-16 11:44:14.0")
/** TableName=S_ResourceAssignment */
public static final String Table_Name="S_ResourceAssignment";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_ResourceAssignment");

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
    Table_ID = MTable.getTable_ID("S_ResourceAssignment");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_ResourceAssignment[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Assign From.
@param AssignDateFrom Assign resource from */
public void setAssignDateFrom (Timestamp AssignDateFrom)
{
if (AssignDateFrom == null) throw new IllegalArgumentException ("AssignDateFrom is mandatory.");
set_ValueNoCheck (COLUMNNAME_AssignDateFrom, AssignDateFrom);
}
/** Get Assign From.
@return Assign resource from */
public Timestamp getAssignDateFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_AssignDateFrom);
}

@XendraTrl(Identifier="6828b2d9-9fcf-d60b-f854-5fff353f61ec")
public static String es_PE_FIELD_Assignment_AssignFrom_Description="Asignar recurso desde";

@XendraTrl(Identifier="6828b2d9-9fcf-d60b-f854-5fff353f61ec")
public static String es_PE_FIELD_Assignment_AssignFrom_Help="Comienzo de la asignación";

@XendraTrl(Identifier="6828b2d9-9fcf-d60b-f854-5fff353f61ec")
public static String es_PE_FIELD_Assignment_AssignFrom_Name="Asignar Desde";

@XendraField(AD_Column_ID="AssignDateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6828b2d9-9fcf-d60b-f854-5fff353f61ec")
public static final String FIELDNAME_Assignment_AssignFrom="6828b2d9-9fcf-d60b-f854-5fff353f61ec";

@XendraTrl(Identifier="943cddc8-a7b3-1d4f-9ac0-4e1cf28e8608")
public static String es_PE_COLUMN_AssignDateFrom_Name="Asignar Desde";

@XendraColumn(AD_Element_ID="3ed4017f-f2cd-8b73-45bd-e5ef7099abd9",ColumnName="AssignDateFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="943cddc8-a7b3-1d4f-9ac0-4e1cf28e8608",
Synchronized="2017-08-05 16:56:19.0")
/** Column name AssignDateFrom */
public static final String COLUMNNAME_AssignDateFrom = "AssignDateFrom";
/** Set Assign To.
@param AssignDateTo Assign resource until */
public void setAssignDateTo (Timestamp AssignDateTo)
{
set_ValueNoCheck (COLUMNNAME_AssignDateTo, AssignDateTo);
}
/** Get Assign To.
@return Assign resource until */
public Timestamp getAssignDateTo() 
{
return (Timestamp)get_Value(COLUMNNAME_AssignDateTo);
}

@XendraTrl(Identifier="60f68856-acdb-acc6-7349-90e414d1a35f")
public static String es_PE_FIELD_Assignment_AssignTo_Description="Asignar recurso hasta";

@XendraTrl(Identifier="60f68856-acdb-acc6-7349-90e414d1a35f")
public static String es_PE_FIELD_Assignment_AssignTo_Help="Fin de la asignación";

@XendraTrl(Identifier="60f68856-acdb-acc6-7349-90e414d1a35f")
public static String es_PE_FIELD_Assignment_AssignTo_Name="Asignar Hasta";

@XendraField(AD_Column_ID="AssignDateTo",IsCentrallyMaintained=true,
AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60f68856-acdb-acc6-7349-90e414d1a35f")
public static final String FIELDNAME_Assignment_AssignTo="60f68856-acdb-acc6-7349-90e414d1a35f";

@XendraTrl(Identifier="dc878553-a980-108b-4821-9ff54a9befd0")
public static String es_PE_COLUMN_AssignDateTo_Name="Asignar Hasta";

@XendraColumn(AD_Element_ID="8aacb4de-993c-57b0-0277-3c9aa8690f12",ColumnName="AssignDateTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc878553-a980-108b-4821-9ff54a9befd0",
Synchronized="2017-08-05 16:56:19.0")
/** Column name AssignDateTo */
public static final String COLUMNNAME_AssignDateTo = "AssignDateTo";
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

@XendraTrl(Identifier="ba19562a-d5cb-df4e-b5fa-8d845b42ac43")
public static String es_PE_FIELD_Assignment_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="ba19562a-d5cb-df4e-b5fa-8d845b42ac43")
public static String es_PE_FIELD_Assignment_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="ba19562a-d5cb-df4e-b5fa-8d845b42ac43")
public static String es_PE_FIELD_Assignment_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba19562a-d5cb-df4e-b5fa-8d845b42ac43")
public static final String FIELDNAME_Assignment_Description="ba19562a-d5cb-df4e-b5fa-8d845b42ac43";

@XendraTrl(Identifier="b8ba74eb-6eb5-69b7-5a7c-964810dd048f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8ba74eb-6eb5-69b7-5a7c-964810dd048f",
Synchronized="2017-08-05 16:56:19.0")
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
@XendraTrl(Identifier="5b95b253-0be4-4637-8bd4-89132ddefd7a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b95b253-0be4-4637-8bd4-89132ddefd7a",
Synchronized="2017-08-05 16:56:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Confirmed.
@param IsConfirmed Assignment is confirmed */
public void setIsConfirmed (boolean IsConfirmed)
{
set_ValueNoCheck (COLUMNNAME_IsConfirmed, Boolean.valueOf(IsConfirmed));
}
/** Get Confirmed.
@return Assignment is confirmed */
public boolean isConfirmed() 
{
Object oo = get_Value(COLUMNNAME_IsConfirmed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="688951ae-b850-a4ef-10dd-f7b89a9419cd")
public static String es_PE_FIELD_Assignment_Confirmed_Description="Asignación esta confirmada";

@XendraTrl(Identifier="688951ae-b850-a4ef-10dd-f7b89a9419cd")
public static String es_PE_FIELD_Assignment_Confirmed_Help="Asignación del recurso está confirmada";

@XendraTrl(Identifier="688951ae-b850-a4ef-10dd-f7b89a9419cd")
public static String es_PE_FIELD_Assignment_Confirmed_Name="Confirmado";

@XendraField(AD_Column_ID="IsConfirmed",IsCentrallyMaintained=true,
AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="688951ae-b850-a4ef-10dd-f7b89a9419cd")
public static final String FIELDNAME_Assignment_Confirmed="688951ae-b850-a4ef-10dd-f7b89a9419cd";

@XendraTrl(Identifier="ba2f12d3-6c31-6baf-6cdf-5147072d36d1")
public static String es_PE_COLUMN_IsConfirmed_Name="Confirmado";

@XendraColumn(AD_Element_ID="7b990788-ac30-ea92-659a-4bd5b7bd178f",ColumnName="IsConfirmed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba2f12d3-6c31-6baf-6cdf-5147072d36d1",
Synchronized="2017-08-05 16:56:19.0")
/** Column name IsConfirmed */
public static final String COLUMNNAME_IsConfirmed = "IsConfirmed";
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
@XendraTrl(Identifier="cab02b21-c7db-54e6-c502-65f30a56fa5d")
public static String es_PE_FIELD_Assignment_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="cab02b21-c7db-54e6-c502-65f30a56fa5d")
public static String es_PE_FIELD_Assignment_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="cab02b21-c7db-54e6-c502-65f30a56fa5d")
public static String es_PE_FIELD_Assignment_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cab02b21-c7db-54e6-c502-65f30a56fa5d")
public static final String FIELDNAME_Assignment_Name="cab02b21-c7db-54e6-c502-65f30a56fa5d";

@XendraTrl(Identifier="86f2873a-6b08-4b4c-2681-f70690d86d25")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86f2873a-6b08-4b4c-2681-f70690d86d25",
Synchronized="2017-08-05 16:56:20.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_ValueNoCheck (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c56ccff6-29cb-025e-d18f-b851960a533d")
public static String es_PE_FIELD_Assignment_Quantity_Description="Cantidad";

@XendraTrl(Identifier="c56ccff6-29cb-025e-d18f-b851960a533d")
public static String es_PE_FIELD_Assignment_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="c56ccff6-29cb-025e-d18f-b851960a533d")
public static String es_PE_FIELD_Assignment_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c56ccff6-29cb-025e-d18f-b851960a533d")
public static final String FIELDNAME_Assignment_Quantity="c56ccff6-29cb-025e-d18f-b851960a533d";

@XendraTrl(Identifier="9e83151e-daef-a9ca-0187-7c38ecdc6b3b")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e83151e-daef-a9ca-0187-7c38ecdc6b3b",
Synchronized="2017-08-05 16:56:20.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Resource Assignment.
@param S_ResourceAssignment_ID Resource Assignment */
public void setS_ResourceAssignment_ID (int S_ResourceAssignment_ID)
{
if (S_ResourceAssignment_ID < 1) throw new IllegalArgumentException ("S_ResourceAssignment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_ResourceAssignment_ID, Integer.valueOf(S_ResourceAssignment_ID));
}
/** Get Resource Assignment.
@return Resource Assignment */
public int getS_ResourceAssignment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ResourceAssignment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ebd6a41-af4e-e3cc-dcff-04432caefdd5")
public static String es_PE_FIELD_Assignment_ResourceAssignment_Description="Asignación de Recursos";

@XendraTrl(Identifier="0ebd6a41-af4e-e3cc-dcff-04432caefdd5")
public static String es_PE_FIELD_Assignment_ResourceAssignment_Name="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ebd6a41-af4e-e3cc-dcff-04432caefdd5")
public static final String FIELDNAME_Assignment_ResourceAssignment="0ebd6a41-af4e-e3cc-dcff-04432caefdd5";
/** Column name S_ResourceAssignment_ID */
public static final String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
/** Set Resource.
@param S_Resource_ID Resource */
public void setS_Resource_ID (int S_Resource_ID)
{
if (S_Resource_ID < 1) throw new IllegalArgumentException ("S_Resource_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_Resource_ID, Integer.valueOf(S_Resource_ID));
}
/** Get Resource.
@return Resource */
public int getS_Resource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Resource_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getS_Resource_ID()));
}

@XendraTrl(Identifier="6c887e2d-1bb4-1289-98e9-ce576c205bfb")
public static String es_PE_FIELD_Assignment_Resource_Description="Recurso";

@XendraTrl(Identifier="6c887e2d-1bb4-1289-98e9-ce576c205bfb")
public static String es_PE_FIELD_Assignment_Resource_Name="Recurso";

@XendraField(AD_Column_ID="S_Resource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="242f4840-dbe9-305d-69f8-5b3871e78e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c887e2d-1bb4-1289-98e9-ce576c205bfb")
public static final String FIELDNAME_Assignment_Resource="6c887e2d-1bb4-1289-98e9-ce576c205bfb";

@XendraTrl(Identifier="d0370134-56b7-d468-cd9b-34d10b9d8e9c")
public static String es_PE_COLUMN_S_Resource_ID_Name="Recurso";

@XendraColumn(AD_Element_ID="22f30913-1545-c2d4-4092-f033c05219ea",ColumnName="S_Resource_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0370134-56b7-d468-cd9b-34d10b9d8e9c",
Synchronized="2017-08-05 16:56:20.0")
/** Column name S_Resource_ID */
public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
}
