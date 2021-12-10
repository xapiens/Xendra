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
/** Generated Model for AD_Backup
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Backup extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Backup_ID id
@param trxName transaction
*/
public X_AD_Backup (Properties ctx, int AD_Backup_ID, String trxName)
{
super (ctx, AD_Backup_ID, trxName);
/** if (AD_Backup_ID == 0)
{
setAD_Backup_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Backup (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000424 */
public static int Table_ID=MTable.getTable_ID("AD_Backup");

@XendraTrl(Identifier="bf2e8a9b-8cff-4814-8ed0-435b5fb87cb2")
public static String es_PE_TABLE_AD_Backup_Name="AD_Backup";

@XendraTable(Name="AD_Backup",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Backup",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="bf2e8a9b-8cff-4814-8ed0-435b5fb87cb2",Synchronized="2020-10-17 17:43:15.0")
/** TableName=AD_Backup */
public static final String Table_Name="AD_Backup";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Backup");

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
    Table_ID = MTable.getTable_ID("AD_Backup");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Backup[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Backup_ID.
@param AD_Backup_ID AD_Backup_ID */
public void setAD_Backup_ID (int AD_Backup_ID)
{
if (AD_Backup_ID < 1) throw new IllegalArgumentException ("AD_Backup_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Backup_ID, Integer.valueOf(AD_Backup_ID));
}
/** Get AD_Backup_ID.
@return AD_Backup_ID */
public int getAD_Backup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Backup_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Backup_ID */
public static final String COLUMNNAME_AD_Backup_ID = "AD_Backup_ID";
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
@XendraTrl(Identifier="2669ca3b-2d24-4fb8-a39f-ad779462a64e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2669ca3b-2d24-4fb8-a39f-ad779462a64e",
Synchronized="2020-10-12 22:57:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="7ae0d3e2-b18c-458b-8d0b-da20a5152295")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ae0d3e2-b18c-458b-8d0b-da20a5152295",
Synchronized="2020-10-12 22:57:25.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
}
