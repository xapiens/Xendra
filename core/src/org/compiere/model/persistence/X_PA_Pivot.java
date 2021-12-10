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
/** Generated Model for PA_Pivot
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Pivot extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Pivot_ID id
@param trxName transaction
*/
public X_PA_Pivot (Properties ctx, int PA_Pivot_ID, String trxName)
{
super (ctx, PA_Pivot_ID, trxName);
/** if (PA_Pivot_ID == 0)
{
setAD_Role_ID (0);
setAD_User_ID (0);
setName (null);
setPA_Pivot_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Pivot (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000415 */
public static int Table_ID=MTable.getTable_ID("PA_Pivot");

@XendraTrl(Identifier="240a33a3-afba-4000-8fda-5c9928fcf147")
public static String es_PE_TABLE_PA_Pivot_Name="Performance Analysis Pivot";

@XendraTable(Name="Performance Analysis Pivot",
AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="PA_Pivot",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="240a33a3-afba-4000-8fda-5c9928fcf147",Synchronized="2020-03-03 21:39:05.0")
/** TableName=PA_Pivot */
public static final String Table_Name="PA_Pivot";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Pivot");

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
    Table_ID = MTable.getTable_ID("PA_Pivot");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Pivot[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID <= 0) set_Value (COLUMNNAME_AD_Process_ID, null);
 else 
set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ac6008c-83f1-4615-8351-b66f576a26b2")
public static String es_PE_COLUMN_AD_Process_ID_Name="Process";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ac6008c-83f1-4615-8351-b66f576a26b2",
Synchronized="2019-10-14 10:52:18.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6131da44-d8dd-4976-a1a1-c3c8ee6ce371")
public static String es_PE_COLUMN_AD_Role_ID_Name="Role";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6131da44-d8dd-4976-a1a1-c3c8ee6ce371",
Synchronized="2019-10-14 10:52:18.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="39ccc134-500b-49c8-bc42-6f85adddd533")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39ccc134-500b-49c8-bc42-6f85adddd533",
Synchronized="2019-10-14 10:52:18.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Category Name.
@param CategoryName Name of the Category */
public void setCategoryName (String CategoryName)
{
if (CategoryName != null && CategoryName.length() > 100)
{
log.warning("Length > 100 - truncated");
CategoryName = CategoryName.substring(0,99);
}
set_Value (COLUMNNAME_CategoryName, CategoryName);
}
/** Get Category Name.
@return Name of the Category */
public String getCategoryName() 
{
String value = (String)get_Value(COLUMNNAME_CategoryName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7d691c4e-2629-45ff-9591-d5cd362da76b")
public static String es_PE_COLUMN_CategoryName_Name="Category Name";

@XendraColumn(AD_Element_ID="6f30a805-6fdd-446d-efc8-cf35be4e2c2d",ColumnName="CategoryName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d691c4e-2629-45ff-9591-d5cd362da76b",
Synchronized="2019-10-14 10:52:18.0")
/** Column name CategoryName */
public static final String COLUMNNAME_CategoryName = "CategoryName";
/** Set DataSource.
@param DataSource DataSource */
public void setDataSource (String DataSource)
{
set_Value (COLUMNNAME_DataSource, DataSource);
}
/** Get DataSource.
@return DataSource */
public String getDataSource() 
{
String value = (String)get_Value(COLUMNNAME_DataSource);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5664e8fb-2504-4519-90e8-a64edf53db7f")
public static String es_PE_COLUMN_DataSource_Name="DataSource";

@XendraColumn(AD_Element_ID="b1553225-5c21-ecd5-a173-cac62c25452f",ColumnName="DataSource",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5664e8fb-2504-4519-90e8-a64edf53db7f",
Synchronized="2019-10-14 10:52:18.0")
/** Column name DataSource */
public static final String COLUMNNAME_DataSource = "DataSource";
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
@XendraTrl(Identifier="5d511a5d-a866-4a7d-b124-6b06e28e403f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d511a5d-a866-4a7d-b124-6b06e28e403f",
Synchronized="2019-10-14 10:52:18.0")
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

@XendraTrl(Identifier="a0e06bb7-9c47-463b-854b-9d3c4aeee7ee")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0e06bb7-9c47-463b-854b-9d3c4aeee7ee",
Synchronized="2019-10-14 10:52:18.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Performance Analysis Pivot.
@param PA_Pivot_ID Performance Analysis Pivot */
public void setPA_Pivot_ID (int PA_Pivot_ID)
{
if (PA_Pivot_ID < 1) throw new IllegalArgumentException ("PA_Pivot_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Pivot_ID, Integer.valueOf(PA_Pivot_ID));
}
/** Get Performance Analysis Pivot.
@return Performance Analysis Pivot */
public int getPA_Pivot_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Pivot_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name PA_Pivot_ID */
public static final String COLUMNNAME_PA_Pivot_ID = "PA_Pivot_ID";
/** Set PA_Query.
@param PA_Query_ID PA_Query */
public void setPA_Query_ID (int PA_Query_ID)
{
if (PA_Query_ID <= 0) set_Value (COLUMNNAME_PA_Query_ID, null);
 else 
set_Value (COLUMNNAME_PA_Query_ID, Integer.valueOf(PA_Query_ID));
}
/** Get PA_Query.
@return PA_Query */
public int getPA_Query_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Query_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="58cc9ce0-1eed-44a4-83e8-f6247dab7f7a")
public static String es_PE_COLUMN_PA_Query_ID_Name="PA_Query";

@XendraColumn(AD_Element_ID="e1ae4606-d995-4499-8314-29bd8a565200",ColumnName="PA_Query_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58cc9ce0-1eed-44a4-83e8-f6247dab7f7a",
Synchronized="2019-10-14 10:52:18.0")
/** Column name PA_Query_ID */
public static final String COLUMNNAME_PA_Query_ID = "PA_Query_ID";
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

@XendraTrl(Identifier="e71163ed-55d9-470f-909d-4c539f0bf127")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e71163ed-55d9-470f-909d-4c539f0bf127",
Synchronized="2019-10-14 10:52:18.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
}
