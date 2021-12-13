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
/** Generated Model for AD_Resource
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Resource extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Resource_ID id
@param trxName transaction
*/
public X_AD_Resource (Properties ctx, int AD_Resource_ID, String trxName)
{
super (ctx, AD_Resource_ID, trxName);
/** if (AD_Resource_ID == 0)
{
setAD_Resource_ID (0);
setContainer (null);
setModuleName (null);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Resource (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000329 */
public static int Table_ID=MTable.getTable_ID("AD_Resource");

@XendraTrl(Identifier="92149bcf-4289-4a84-9dea-f62ed0e36c5c")
public static String es_PE_TABLE_AD_Resource_Name="Resources";

@XendraTable(Name="Resources",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Resource",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="92149bcf-4289-4a84-9dea-f62ed0e36c5c",
Synchronized="2020-03-03 21:35:52.0")
/** TableName=AD_Resource */
public static final String Table_Name="AD_Resource";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Resource");

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
    Table_ID = MTable.getTable_ID("AD_Resource");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Resource[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Resources.
@param AD_Resource_ID Resources */
public void setAD_Resource_ID (int AD_Resource_ID)
{
if (AD_Resource_ID < 1) throw new IllegalArgumentException ("AD_Resource_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Resource_ID, Integer.valueOf(AD_Resource_ID));
}
/** Get Resources.
@return Resources */
public int getAD_Resource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Resource_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Resource_ID */
public static final String COLUMNNAME_AD_Resource_ID = "AD_Resource_ID";
/** Set Container.
@param Container Container */
public void setContainer (String Container)
{
if (Container == null) throw new IllegalArgumentException ("Container is mandatory.");
if (Container.length() > 60)
{
log.warning("Length > 60 - truncated");
Container = Container.substring(0,59);
}
set_Value (COLUMNNAME_Container, Container);
}
/** Get Container.
@return Container */
public String getContainer() 
{
String value = (String)get_Value(COLUMNNAME_Container);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b8ae4271-607c-45a0-a995-f7ac4f355e29")
public static String es_PE_COLUMN_Container_Name="container";

@XendraColumn(AD_Element_ID="4393c206-03bc-45cf-af70-c2a63efc637e",ColumnName="Container",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8ae4271-607c-45a0-a995-f7ac4f355e29",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Container */
public static final String COLUMNNAME_Container = "Container";
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
@XendraTrl(Identifier="0dc16d5f-1ad9-4b68-ba0b-81aa9763ee86")
public static String es_PE_COLUMN_Content_Name="Content";

@XendraColumn(AD_Element_ID="1aa0835d-f6ff-ae44-3d38-0719eab019ce",ColumnName="Content",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dc16d5f-1ad9-4b68-ba0b-81aa9763ee86",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Content */
public static final String COLUMNNAME_Content = "Content";
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
@XendraTrl(Identifier="8d0e2d49-752c-4729-9cde-048db6400355")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d0e2d49-752c-4729-9cde-048db6400355",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set ModuleName.
@param ModuleName ModuleName */
public void setModuleName (String ModuleName)
{
if (ModuleName == null) throw new IllegalArgumentException ("ModuleName is mandatory.");
if (ModuleName.length() > 60)
{
log.warning("Length > 60 - truncated");
ModuleName = ModuleName.substring(0,59);
}
set_Value (COLUMNNAME_ModuleName, ModuleName);
}
/** Get ModuleName.
@return ModuleName */
public String getModuleName() 
{
String value = (String)get_Value(COLUMNNAME_ModuleName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="63f95fe2-32f6-40d2-9cd1-96d6d5ee4bcd")
public static String es_PE_COLUMN_ModuleName_Name="ModuleName";

@XendraColumn(AD_Element_ID="3f839e25-1735-4503-b90a-218e787645b4",ColumnName="ModuleName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63f95fe2-32f6-40d2-9cd1-96d6d5ee4bcd",
Synchronized="2019-08-30 22:20:38.0")
/** Column name ModuleName */
public static final String COLUMNNAME_ModuleName = "ModuleName";
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

@XendraTrl(Identifier="60c9135d-1fc7-4c30-ab13-0fde78587c8c")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60c9135d-1fc7-4c30-ab13-0fde78587c8c",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
