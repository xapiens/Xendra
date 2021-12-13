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
/** Generated Model for AD_ReplicationFile
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ReplicationFile extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ReplicationFile_ID id
@param trxName transaction
*/
public X_AD_ReplicationFile (Properties ctx, int AD_ReplicationFile_ID, String trxName)
{
super (ctx, AD_ReplicationFile_ID, trxName);
/** if (AD_ReplicationFile_ID == 0)
{
setAD_ReplicationFile_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ReplicationFile (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000336 */
public static int Table_ID=MTable.getTable_ID("AD_ReplicationFile");

@XendraTrl(Identifier="96c6326a-0984-45e6-938d-ff17808676b0")
public static String es_PE_TABLE_AD_ReplicationFile_Name="Replication Files configuration";


@XendraTable(Name="Replication Files configuration",
AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_ReplicationFile",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="96c6326a-0984-45e6-938d-ff17808676b0",
Synchronized="2020-03-03 21:35:51.0")
/** TableName=AD_ReplicationFile */
public static final String Table_Name="AD_ReplicationFile";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ReplicationFile");

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
    Table_ID = MTable.getTable_ID("AD_ReplicationFile");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ReplicationFile[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Replication Files configuration.
@param AD_ReplicationFile_ID Replication Files configuration */
public void setAD_ReplicationFile_ID (int AD_ReplicationFile_ID)
{
if (AD_ReplicationFile_ID < 1) throw new IllegalArgumentException ("AD_ReplicationFile_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ReplicationFile_ID, Integer.valueOf(AD_ReplicationFile_ID));
}
/** Get Replication Files configuration.
@return Replication Files configuration */
public int getAD_ReplicationFile_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReplicationFile_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_ReplicationFile_ID */
public static final String COLUMNNAME_AD_ReplicationFile_ID = "AD_ReplicationFile_ID";
/** Set Content.
@param Content Content */
public void setContent (String Content)
{
set_Value (COLUMNNAME_Content, Content);
}
/** Get Content.
@return Content */
public String getContent() 
{
String value = (String)get_Value(COLUMNNAME_Content);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b80c51a7-62eb-4b28-88ec-41f615ed6277")
public static String es_PE_COLUMN_Content_Name="Content";

@XendraColumn(AD_Element_ID="1aa0835d-f6ff-ae44-3d38-0719eab019ce",ColumnName="Content",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="b80c51a7-62eb-4b28-88ec-41f615ed6277",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Content */
public static final String COLUMNNAME_Content = "Content";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 50)
{
log.warning("Length > 50 - truncated");
Name = Name.substring(0,49);
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

@XendraTrl(Identifier="705f0cf1-8ee6-4552-8a7e-3e0801cada63")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="705f0cf1-8ee6-4552-8a7e-3e0801cada63",
Synchronized="2019-08-30 22:20:38.0")
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

@XendraTrl(Identifier="9b44b1aa-37ff-436e-9c3f-9d3b6bec7fb6")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b44b1aa-37ff-436e-9c3f-9d3b6bec7fb6",
Synchronized="2019-08-30 22:20:38.0")
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
@XendraTrl(Identifier="9aed0e22-804c-4a73-8527-25811c8af91e")
public static String es_PE_COLUMN_TableIdentifier_Name="TableIdentifier";

@XendraColumn(AD_Element_ID="8b4a9083-e1f3-4fef-9d45-5361fb409c11",ColumnName="TableIdentifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9aed0e22-804c-4a73-8527-25811c8af91e",
Synchronized="2019-08-30 22:20:38.0")
/** Column name TableIdentifier */
public static final String COLUMNNAME_TableIdentifier = "TableIdentifier";
}
