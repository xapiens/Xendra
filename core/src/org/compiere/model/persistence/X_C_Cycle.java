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
/** Generated Model for C_Cycle
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Cycle extends PO
{
/** Standard Constructor
@param ctx context
@param C_Cycle_ID id
@param trxName transaction
*/
public X_C_Cycle (Properties ctx, int C_Cycle_ID, String trxName)
{
super (ctx, C_Cycle_ID, trxName);
/** if (C_Cycle_ID == 0)
{
setC_Currency_ID (0);
setC_Cycle_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Cycle (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=432 */
public static int Table_ID=MTable.getTable_ID("C_Cycle");

@XendraTrl(Identifier="8fd8bb49-02fa-999b-c363-381a0cbcab07")
public static String es_PE_TAB_ProjectCycle_Description="Definir Ciclos de Proyecto";

@XendraTrl(Identifier="8fd8bb49-02fa-999b-c363-381a0cbcab07")
public static String es_PE_TAB_ProjectCycle_Help="Definir la moneda en la cual los proyectos son reportados. Los proyectos en si mismos pueden usar una moneda diferente.";

@XendraTrl(Identifier="8fd8bb49-02fa-999b-c363-381a0cbcab07")
public static String es_PE_TAB_ProjectCycle_Name="Ciclo de Proyecto";

@XendraTab(Name="Project Cycle",Description="Define Project Report Cycle",
Help="Define the currency that projects Project are reported. The projects themselves could be in a different currency.",
AD_Window_ID="1d686c87-4250-cd4c-c787-342ca8921a79",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8fd8bb49-02fa-999b-c363-381a0cbcab07",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProjectCycle="8fd8bb49-02fa-999b-c363-381a0cbcab07";

@XendraTrl(Identifier="ce7029de-e4fb-9894-d8fb-3009a75c06c6")
public static String es_PE_TABLE_C_Cycle_Name="Ciclo del Proyecto";

@XendraTable(Name="Project Cycle",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Identifier for this Project Reporting Cycle",Help="",TableName="C_Cycle",
AccessLevel="3",AD_Window_ID="1d686c87-4250-cd4c-c787-342ca8921a79",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="ce7029de-e4fb-9894-d8fb-3009a75c06c6",Synchronized="2020-03-03 21:36:49.0")
/** TableName=C_Cycle */
public static final String Table_Name="C_Cycle";


@XendraIndex(Name="c_cycle_name",Identifier="e495d90c-1a66-a165-6448-4f2f42ee1074",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="e495d90c-1a66-a165-6448-4f2f42ee1074",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_cycle_name = "e495d90c-1a66-a165-6448-4f2f42ee1074";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Cycle");

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
    Table_ID = MTable.getTable_ID("C_Cycle");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Cycle[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="ed5b92a3-fc03-e1e8-1c02-f9389f4de665")
public static String es_PE_FIELD_ProjectCycle_Currency_Name="Moneda";

@XendraTrl(Identifier="ed5b92a3-fc03-e1e8-1c02-f9389f4de665")
public static String es_PE_FIELD_ProjectCycle_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="ed5b92a3-fc03-e1e8-1c02-f9389f4de665")
public static String es_PE_FIELD_ProjectCycle_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8fd8bb49-02fa-999b-c363-381a0cbcab07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed5b92a3-fc03-e1e8-1c02-f9389f4de665")
public static final String FIELDNAME_ProjectCycle_Currency="ed5b92a3-fc03-e1e8-1c02-f9389f4de665";

@XendraTrl(Identifier="42282f0d-9e18-1df3-de82-026d2e705fe3")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42282f0d-9e18-1df3-de82-026d2e705fe3",
Synchronized="2019-08-30 22:21:28.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Project Cycle.
@param C_Cycle_ID Identifier for this Project Reporting Cycle */
public void setC_Cycle_ID (int C_Cycle_ID)
{
if (C_Cycle_ID < 1) throw new IllegalArgumentException ("C_Cycle_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Cycle_ID, Integer.valueOf(C_Cycle_ID));
}
/** Get Project Cycle.
@return Identifier for this Project Reporting Cycle */
public int getC_Cycle_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cycle_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5574254a-d28f-796b-c518-8d3aea189d3d")
public static String es_PE_FIELD_ProjectCycle_ProjectCycle_Name="Ciclo del Proyecto";

@XendraTrl(Identifier="5574254a-d28f-796b-c518-8d3aea189d3d")
public static String es_PE_FIELD_ProjectCycle_ProjectCycle_Description="Identificador de este ciclo del proyecto";

@XendraTrl(Identifier="5574254a-d28f-796b-c518-8d3aea189d3d")
public static String es_PE_FIELD_ProjectCycle_ProjectCycle_Help="Identifica un ciclo del proyecto que se pueda componer de uno ó más pasos ó estados.";

@XendraField(AD_Column_ID="C_Cycle_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8fd8bb49-02fa-999b-c363-381a0cbcab07",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5574254a-d28f-796b-c518-8d3aea189d3d")
public static final String FIELDNAME_ProjectCycle_ProjectCycle="5574254a-d28f-796b-c518-8d3aea189d3d";
/** Column name C_Cycle_ID */
public static final String COLUMNNAME_C_Cycle_ID = "C_Cycle_ID";
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

@XendraTrl(Identifier="54ce9be6-d735-c86d-ae45-c135efab32e9")
public static String es_PE_FIELD_ProjectCycle_Description_Name="Observación";

@XendraTrl(Identifier="54ce9be6-d735-c86d-ae45-c135efab32e9")
public static String es_PE_FIELD_ProjectCycle_Description_Description="Observación";

@XendraTrl(Identifier="54ce9be6-d735-c86d-ae45-c135efab32e9")
public static String es_PE_FIELD_ProjectCycle_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="8fd8bb49-02fa-999b-c363-381a0cbcab07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54ce9be6-d735-c86d-ae45-c135efab32e9")
public static final String FIELDNAME_ProjectCycle_Description="54ce9be6-d735-c86d-ae45-c135efab32e9";

@XendraTrl(Identifier="5afd54cb-3437-c95b-8146-5b86b8d96403")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5afd54cb-3437-c95b-8146-5b86b8d96403",
Synchronized="2019-08-30 22:21:28.0")
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
@XendraTrl(Identifier="fd998208-55c6-4bd7-842b-ead71ed221b5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd998208-55c6-4bd7-842b-ead71ed221b5",
Synchronized="2019-08-30 22:21:28.0")
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

@XendraTrl(Identifier="e006c15d-7d34-48e4-5647-1cb330d08a4c")
public static String es_PE_FIELD_ProjectCycle_Name_Name="Nombre";

@XendraTrl(Identifier="e006c15d-7d34-48e4-5647-1cb330d08a4c")
public static String es_PE_FIELD_ProjectCycle_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e006c15d-7d34-48e4-5647-1cb330d08a4c")
public static String es_PE_FIELD_ProjectCycle_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8fd8bb49-02fa-999b-c363-381a0cbcab07",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e006c15d-7d34-48e4-5647-1cb330d08a4c")
public static final String FIELDNAME_ProjectCycle_Name="e006c15d-7d34-48e4-5647-1cb330d08a4c";

@XendraTrl(Identifier="4c693a30-8b1b-bb5f-91f3-09c04e63a392")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c693a30-8b1b-bb5f-91f3-09c04e63a392",
Synchronized="2019-08-30 22:21:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
