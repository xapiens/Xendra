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
/** Generated Model for A_Association
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Association extends PO
{
/** Standard Constructor
@param ctx context
@param A_Association_ID id
@param trxName transaction
*/
public X_A_Association (Properties ctx, int A_Association_ID, String trxName)
{
super (ctx, A_Association_ID, trxName);
/** if (A_Association_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Association (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000338 */
public static int Table_ID=MTable.getTable_ID("A_Association");

@XendraTrl(Identifier="82c0a181-0c2f-48e1-b8fa-3bad026de98e")
public static String es_PE_TABLE_A_Association_Name="Association between plugins ";

@XendraTable(Name="Association between plugins ",
AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="A_Association",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="82c0a181-0c2f-48e1-b8fa-3bad026de98e",
Synchronized="2020-03-03 21:34:50.0")
/** TableName=A_Association */
public static final String Table_Name="A_Association";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Association");

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
    Table_ID = MTable.getTable_ID("A_Association");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Association[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Association between plugins .
@param A_Association_ID Association between plugins  */
public void setA_Association_ID (int A_Association_ID)
{
if (A_Association_ID <= 0) set_ValueNoCheck (COLUMNNAME_A_Association_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_A_Association_ID, Integer.valueOf(A_Association_ID));
}
/** Get Association between plugins .
@return Association between plugins  */
public int getA_Association_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Association_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name A_Association_ID */
public static final String COLUMNNAME_A_Association_ID = "A_Association_ID";
/** Set ItemID.
@param ItemID ItemID */
public void setItemID (String ItemID)
{
if (ItemID != null && ItemID.length() > 100)
{
log.warning("Length > 100 - truncated");
ItemID = ItemID.substring(0,99);
}
set_Value (COLUMNNAME_ItemID, ItemID);
}
/** Get ItemID.
@return ItemID */
public String getItemID() 
{
String value = (String)get_Value(COLUMNNAME_ItemID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="566d0006-bf0e-4d51-85b3-20821b28ae31")
public static String es_PE_COLUMN_ItemID_Name="itemid";

@XendraColumn(AD_Element_ID="eb188b3e-95ed-4639-9cf2-52312f665c7d",ColumnName="ItemID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="566d0006-bf0e-4d51-85b3-20821b28ae31",
Synchronized="2020-03-03 21:34:17.0")
/** Column name ItemID */
public static final String COLUMNNAME_ItemID = "ItemID";
/** Set MetadataID.
@param MetadataID MetadataID */
public void setMetadataID (String MetadataID)
{
if (MetadataID != null && MetadataID.length() > 100)
{
log.warning("Length > 100 - truncated");
MetadataID = MetadataID.substring(0,99);
}
set_Value (COLUMNNAME_MetadataID, MetadataID);
}
/** Get MetadataID.
@return MetadataID */
public String getMetadataID() 
{
String value = (String)get_Value(COLUMNNAME_MetadataID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="68a331e7-53f3-4225-b3df-24617fc0519f")
public static String es_PE_COLUMN_MetadataID_Name="metadataid";

@XendraColumn(AD_Element_ID="d9812c76-e0de-49c0-be3e-62cf2a530963",ColumnName="MetadataID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68a331e7-53f3-4225-b3df-24617fc0519f",
Synchronized="2020-03-03 21:34:18.0")
/** Column name MetadataID */
public static final String COLUMNNAME_MetadataID = "MetadataID";
/** Set ServiceID.
@param ServiceID ServiceID */
public void setServiceID (String ServiceID)
{
if (ServiceID != null && ServiceID.length() > 100)
{
log.warning("Length > 100 - truncated");
ServiceID = ServiceID.substring(0,99);
}
set_Value (COLUMNNAME_ServiceID, ServiceID);
}
/** Get ServiceID.
@return ServiceID */
public String getServiceID() 
{
String value = (String)get_Value(COLUMNNAME_ServiceID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="62c47b10-85d0-41df-af56-9b86b1cbfa05")
public static String es_PE_COLUMN_ServiceID_Name="serviceid";

@XendraColumn(AD_Element_ID="9a211985-d1aa-4fb8-85b3-143e3280ad97",ColumnName="ServiceID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62c47b10-85d0-41df-af56-9b86b1cbfa05",
Synchronized="2020-03-03 21:34:18.0")
/** Column name ServiceID */
public static final String COLUMNNAME_ServiceID = "ServiceID";
}
