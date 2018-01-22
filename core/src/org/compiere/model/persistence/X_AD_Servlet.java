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
/** Generated Model for AD_Servlet
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Servlet extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Servlet_ID id
@param trxName transaction
*/
public X_AD_Servlet (Properties ctx, int AD_Servlet_ID, String trxName)
{
super (ctx, AD_Servlet_ID, trxName);
/** if (AD_Servlet_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Servlet (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000384 */
public static int Table_ID=MTable.getTable_ID("AD_Servlet");

@XendraTrl(Identifier="633dbb27-c83d-4a8a-b59f-fda6a3d3a3ae")
public static String es_PE_TABLE_AD_Servlet_Name="Servlet";

@XendraTable(Name="Servlet",Description="",Help="",TableName="AD_Servlet",AccessLevel="6",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="633dbb27-c83d-4a8a-b59f-fda6a3d3a3ae",Synchronized="2017-08-16 11:40:59.0")
/** TableName=AD_Servlet */
public static final String Table_Name="AD_Servlet";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Servlet");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_Servlet");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Servlet[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Servlet.
@param AD_Servlet_ID Servlet */
public void setAD_Servlet_ID (int AD_Servlet_ID)
{
if (AD_Servlet_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Servlet_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Servlet_ID, Integer.valueOf(AD_Servlet_ID));
}
/** Get Servlet.
@return Servlet */
public int getAD_Servlet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Servlet_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Servlet_ID */
public static final String COLUMNNAME_AD_Servlet_ID = "AD_Servlet_ID";
/** Set Servlet List.
@param AD_ServletList_ID Servlet List */
public void setAD_ServletList_ID (int AD_ServletList_ID)
{
if (AD_ServletList_ID <= 0) set_Value (COLUMNNAME_AD_ServletList_ID, null);
 else 
set_Value (COLUMNNAME_AD_ServletList_ID, Integer.valueOf(AD_ServletList_ID));
}
/** Get Servlet List.
@return Servlet List */
public int getAD_ServletList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ServletList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a7eb8e0d-d908-4985-82a1-b677a680b858")
public static String es_PE_COLUMN_AD_ServletList_ID_Name="Servlet List";

@XendraColumn(AD_Element_ID="c1134cb0-5ee7-4de4-a9a1-54d32c2f52eb",ColumnName="AD_ServletList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7eb8e0d-d908-4985-82a1-b677a680b858",
Synchronized="2017-08-05 16:52:50.0")
/** Column name AD_ServletList_ID */
public static final String COLUMNNAME_AD_ServletList_ID = "AD_ServletList_ID";
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
@XendraTrl(Identifier="6016f162-1d92-4f14-ba19-b03820fc095c")
public static String es_PE_COLUMN_Classname_Name="Classname";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6016f162-1d92-4f14-ba19-b03820fc095c",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
/** Set Mapping.
@param Mapping Mapping */
public void setMapping (String Mapping)
{
if (Mapping != null && Mapping.length() > 100)
{
log.warning("Length > 100 - truncated");
Mapping = Mapping.substring(0,99);
}
set_Value (COLUMNNAME_Mapping, Mapping);
}
/** Get Mapping.
@return Mapping */
public String getMapping() 
{
String value = (String)get_Value(COLUMNNAME_Mapping);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="159d011c-f558-42c5-9345-3be46921e4cf")
public static String es_PE_COLUMN_Mapping_Name="mapping";

@XendraColumn(AD_Element_ID="c3e561d2-2c12-493c-8c5e-f0c7c55648f3",ColumnName="Mapping",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="159d011c-f558-42c5-9345-3be46921e4cf",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Mapping */
public static final String COLUMNNAME_Mapping = "Mapping";
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

@XendraTrl(Identifier="6694f61b-e0da-4061-8a7e-784914cb9156")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6694f61b-e0da-4061-8a7e-784914cb9156",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
