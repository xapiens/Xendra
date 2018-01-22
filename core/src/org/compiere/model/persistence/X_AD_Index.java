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
/** Generated Model for AD_Index
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Index extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Index_ID id
@param trxName transaction
*/
public X_AD_Index (Properties ctx, int AD_Index_ID, String trxName)
{
super (ctx, AD_Index_ID, trxName);
/** if (AD_Index_ID == 0)
{
setAD_Index_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Index (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000315 */
public static int Table_ID=MTable.getTable_ID("AD_Index");

@XendraTrl(Identifier="d94c911c-bba4-4e4a-8148-09802153f17c")
public static String es_PE_TABLE_AD_Index_Name="Indices para optimizacion";

@XendraTable(Name="Indices para optimizacion",Description="",Help="",TableName="AD_Index",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="d94c911c-bba4-4e4a-8148-09802153f17c",
Synchronized="2017-08-16 11:40:21.0")
/** TableName=AD_Index */
public static final String Table_Name="AD_Index";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Index");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_Index");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Index[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Indices para optimizacion.
@param AD_Index_ID Indices para optimizacion */
public void setAD_Index_ID (int AD_Index_ID)
{
if (AD_Index_ID < 1) throw new IllegalArgumentException ("AD_Index_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Index_ID, Integer.valueOf(AD_Index_ID));
}
/** Get Indices para optimizacion.
@return Indices para optimizacion */
public int getAD_Index_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Index_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Index_ID */
public static final String COLUMNNAME_AD_Index_ID = "AD_Index_ID";
/** Set Column_Names.
@param Column_Names Column_Names */
public void setColumn_Names (String Column_Names)
{
set_Value (COLUMNNAME_Column_Names, Column_Names);
}
/** Get Column_Names.
@return Column_Names */
public String getColumn_Names() 
{
String value = (String)get_Value(COLUMNNAME_Column_Names);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="792256aa-b55a-4eb2-92fa-6185e391408c")
public static String es_PE_COLUMN_Column_Names_Name="column_names";

@XendraColumn(AD_Element_ID="94df5c15-ed0e-4994-8d48-a73e2415b2d2",ColumnName="Column_Names",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="792256aa-b55a-4eb2-92fa-6185e391408c",
Synchronized="2014-06-01 17:48:50.0")
/** Column name Column_Names */
public static final String COLUMNNAME_Column_Names = "Column_Names";
/** Set Comments.
@param Comments Comments or additional information */
public void setComments (String Comments)
{
set_Value (COLUMNNAME_Comments, Comments);
}
/** Get Comments.
@return Comments or additional information */
public String getComments() 
{
String value = (String)get_Value(COLUMNNAME_Comments);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="304da27f-dbf9-4c85-8444-6eb0a9fe2318")
public static String es_PE_COLUMN_Comments_Name="Comments";

@XendraColumn(AD_Element_ID="68725fe2-3419-b727-d8d4-8bf5d0d8cfc2",ColumnName="Comments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="304da27f-dbf9-4c85-8444-6eb0a9fe2318",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Comments */
public static final String COLUMNNAME_Comments = "Comments";
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

@XendraTrl(Identifier="6edafb15-458c-4d1f-b15f-a9b3f903cd2a")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6edafb15-458c-4d1f-b15f-a9b3f903cd2a",
Synchronized="2017-08-05 16:52:33.0")
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
@XendraTrl(Identifier="17fb3b4e-e468-49ae-a778-d8a6bb787f2b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17fb3b4e-e468-49ae-a778-d8a6bb787f2b",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsUnique.
@param IsUnique IsUnique */
public void setIsUnique (boolean IsUnique)
{
set_Value (COLUMNNAME_IsUnique, Boolean.valueOf(IsUnique));
}
/** Get IsUnique.
@return IsUnique */
public boolean isUnique() 
{
Object oo = get_Value(COLUMNNAME_IsUnique);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="05cec50f-f428-46dd-a714-9835c10de0d8")
public static String es_PE_COLUMN_IsUnique_Name="isunique";

@XendraColumn(AD_Element_ID="3aca9d48-8f46-4796-b26a-4cfb92457570",ColumnName="IsUnique",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05cec50f-f428-46dd-a714-9835c10de0d8",
Synchronized="2014-06-02 11:19:09.0")
/** Column name IsUnique */
public static final String COLUMNNAME_IsUnique = "IsUnique";
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

@XendraTrl(Identifier="bf14aacc-9fea-4a3a-81b3-935c8ccb05ba")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf14aacc-9fea-4a3a-81b3-935c8ccb05ba",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="a135d479-6f89-4cbf-a740-3f0e562377b7")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a135d479-6f89-4cbf-a740-3f0e562377b7",
Synchronized="2017-08-05 16:52:33.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set TableIdentifier.
@param TableIdentifier TableIdentifier */
public void setTableIdentifier (String TableIdentifier)
{
if (TableIdentifier != null && TableIdentifier.length() > 36)
{
log.warning("Length > 36 - truncated");
TableIdentifier = TableIdentifier.substring(0,35);
}
set_Value (COLUMNNAME_TableIdentifier, TableIdentifier);
}
/** Get TableIdentifier.
@return TableIdentifier */
public String getTableIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_TableIdentifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5aefba8d-83cc-4014-be56-918bb4f8b266")
public static String es_PE_COLUMN_TableIdentifier_Name="TableIdentifier";

@XendraColumn(AD_Element_ID="8b4a9083-e1f3-4fef-9d45-5361fb409c11",ColumnName="TableIdentifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5aefba8d-83cc-4014-be56-918bb4f8b266",
Synchronized="2017-08-05 16:52:33.0")
/** Column name TableIdentifier */
public static final String COLUMNNAME_TableIdentifier = "TableIdentifier";
}
