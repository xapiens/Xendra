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
/** Generated Model for AD_Store
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Store extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Store_ID id
@param trxName transaction
*/
public X_AD_Store (Properties ctx, int AD_Store_ID, String trxName)
{
super (ctx, AD_Store_ID, trxName);
/** if (AD_Store_ID == 0)
{
setAD_Store_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Store (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000398 */
public static int Table_ID=MTable.getTable_ID("AD_Store");

@XendraTrl(Identifier="ee81c4d4-1fff-4fa3-ab3f-80cea8079fc6")
public static String es_PE_TABLE_AD_Store_Name="Store";

@XendraTable(Name="Store",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Store",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="ee81c4d4-1fff-4fa3-ab3f-80cea8079fc6",
Synchronized="2020-03-03 21:35:56.0")
/** TableName=AD_Store */
public static final String Table_Name="AD_Store";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Store");

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
    Table_ID = MTable.getTable_ID("AD_Store");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Store[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Store.
@param AD_Store_ID Store */
public void setAD_Store_ID (int AD_Store_ID)
{
if (AD_Store_ID < 1) throw new IllegalArgumentException ("AD_Store_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Store_ID, Integer.valueOf(AD_Store_ID));
}
/** Get Store.
@return Store */
public int getAD_Store_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Store_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Store_ID */
public static final String COLUMNNAME_AD_Store_ID = "AD_Store_ID";
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

@XendraTrl(Identifier="5038819c-7dfe-418a-b53c-cc50b4bd1d40")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5038819c-7dfe-418a-b53c-cc50b4bd1d40",
Synchronized="2019-08-30 22:20:42.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="b9821445-5482-4f32-b097-db20b8b971bd")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9821445-5482-4f32-b097-db20b8b971bd",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set Repository.
@param Repository Repository */
public void setRepository (String Repository)
{
set_Value (COLUMNNAME_Repository, Repository);
}
/** Get Repository.
@return Repository */
public String getRepository() 
{
String value = (String)get_Value(COLUMNNAME_Repository);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="daeff9db-c721-4006-8e5b-aefb5755d34e")
public static String es_PE_COLUMN_Repository_Name="repository";

@XendraColumn(AD_Element_ID="f16b4adb-65c0-4cf7-9df6-9e4ad5b3f61f",ColumnName="Repository",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="daeff9db-c721-4006-8e5b-aefb5755d34e",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Repository */
public static final String COLUMNNAME_Repository = "Repository";
/** Set Tags.
@param Tags Tags */
public void setTags (HashMap Tags)
{
set_Value (COLUMNNAME_Tags, Tags);
}
/** Get Tags.
@return Tags */
public HashMap getTags() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Tags);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="8b08f01e-ee36-42f1-bd73-c4bf77d6d6c7")
public static String es_PE_COLUMN_Tags_Name="tags";

@XendraColumn(AD_Element_ID="ccdbeb88-f824-4fa7-9bc6-68f6ac828e96",ColumnName="Tags",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b08f01e-ee36-42f1-bd73-c4bf77d6d6c7",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Tags */
public static final String COLUMNNAME_Tags = "Tags";
}
