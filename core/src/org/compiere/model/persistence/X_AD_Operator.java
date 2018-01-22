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
/** Generated Model for AD_Operator
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Operator extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Operator_ID id
@param trxName transaction
*/
public X_AD_Operator (Properties ctx, int AD_Operator_ID, String trxName)
{
super (ctx, AD_Operator_ID, trxName);
/** if (AD_Operator_ID == 0)
{
setAD_Operator_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Operator (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000326 */
public static int Table_ID=MTable.getTable_ID("AD_Operator");

@XendraTrl(Identifier="91861a60-a519-49f3-a764-b456475e19e3")
public static String es_PE_TABLE_AD_Operator_Name="Operator";

@XendraTable(Name="Operator",Description="",Help="",TableName="AD_Operator",AccessLevel="4",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="91861a60-a519-49f3-a764-b456475e19e3",Synchronized="2017-08-16 11:40:31.0")
/** TableName=AD_Operator */
public static final String Table_Name="AD_Operator";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Operator");

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
    Table_ID = MTable.getTable_ID("AD_Operator");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Operator[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Operator_ID.
@param AD_Operator_ID AD_Operator_ID */
public void setAD_Operator_ID (int AD_Operator_ID)
{
if (AD_Operator_ID < 1) throw new IllegalArgumentException ("AD_Operator_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Operator_ID, Integer.valueOf(AD_Operator_ID));
}
/** Get AD_Operator_ID.
@return AD_Operator_ID */
public int getAD_Operator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Operator_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Operator_ID */
public static final String COLUMNNAME_AD_Operator_ID = "AD_Operator_ID";
/** Set CompOp.
@param CompOp CompOp */
public void setCompOp (String CompOp)
{
if (CompOp != null && CompOp.length() > 20)
{
log.warning("Length > 20 - truncated");
CompOp = CompOp.substring(0,19);
}
set_Value (COLUMNNAME_CompOp, CompOp);
}
/** Get CompOp.
@return CompOp */
public String getCompOp() 
{
String value = (String)get_Value(COLUMNNAME_CompOp);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ddf74f5a-f3d4-4e24-8195-a0fda9b99fed")
public static String es_PE_COLUMN_CompOp_Name="compop";

@XendraColumn(AD_Element_ID="31752969-d801-49b6-9b4c-1e6752feab0a",ColumnName="CompOp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddf74f5a-f3d4-4e24-8195-a0fda9b99fed",
Synchronized="2015-08-15 14:25:01.0")
/** Column name CompOp */
public static final String COLUMNNAME_CompOp = "CompOp";
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

@XendraTrl(Identifier="12b28657-affc-44c7-bf93-7e10e218d373")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12b28657-affc-44c7-bf93-7e10e218d373",
Synchronized="2017-08-05 16:52:38.0")
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
@XendraTrl(Identifier="7fa4ff83-b94f-489d-b78b-6d4a0c9dbb68")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fa4ff83-b94f-489d-b78b-6d4a0c9dbb68",
Synchronized="2015-08-15 14:37:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set LeftType.
@param LeftType LeftType */
public void setLeftType (String LeftType)
{
if (LeftType != null && LeftType.length() > 20)
{
log.warning("Length > 20 - truncated");
LeftType = LeftType.substring(0,19);
}
set_Value (COLUMNNAME_LeftType, LeftType);
}
/** Get LeftType.
@return LeftType */
public String getLeftType() 
{
String value = (String)get_Value(COLUMNNAME_LeftType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3c530edc-b634-4f18-abdc-93d640401fe7")
public static String es_PE_COLUMN_LeftType_Name="lefttype";

@XendraColumn(AD_Element_ID="4e556d23-ec37-4a0d-9bec-a0e8b6dea833",ColumnName="LeftType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c530edc-b634-4f18-abdc-93d640401fe7",
Synchronized="2015-08-15 14:25:01.0")
/** Column name LeftType */
public static final String COLUMNNAME_LeftType = "LeftType";
/** Set OprName.
@param OprName OprName */
public void setOprName (String OprName)
{
if (OprName != null && OprName.length() > 20)
{
log.warning("Length > 20 - truncated");
OprName = OprName.substring(0,19);
}
set_Value (COLUMNNAME_OprName, OprName);
}
/** Get OprName.
@return OprName */
public String getOprName() 
{
String value = (String)get_Value(COLUMNNAME_OprName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="724a35a7-7b15-4a0c-bae9-13549e19e732")
public static String es_PE_COLUMN_OprName_Name="oprname";

@XendraColumn(AD_Element_ID="60160710-b955-4c42-a961-2eb82108e812",ColumnName="OprName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="724a35a7-7b15-4a0c-bae9-13549e19e732",
Synchronized="2015-08-15 14:25:01.0")
/** Column name OprName */
public static final String COLUMNNAME_OprName = "OprName";
/** Set OprProc.
@param OprProc OprProc */
public void setOprProc (String OprProc)
{
if (OprProc != null && OprProc.length() > 20)
{
log.warning("Length > 20 - truncated");
OprProc = OprProc.substring(0,19);
}
set_Value (COLUMNNAME_OprProc, OprProc);
}
/** Get OprProc.
@return OprProc */
public String getOprProc() 
{
String value = (String)get_Value(COLUMNNAME_OprProc);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0445e021-36d0-43cd-80ef-0fbea324fe1b")
public static String es_PE_COLUMN_OprProc_Name="oprproc";

@XendraColumn(AD_Element_ID="be2d7d10-1966-439b-9f2a-a95d570764e3",ColumnName="OprProc",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0445e021-36d0-43cd-80ef-0fbea324fe1b",
Synchronized="2015-08-15 14:25:01.0")
/** Column name OprProc */
public static final String COLUMNNAME_OprProc = "OprProc";
/** Set Owner.
@param Owner Owner */
public void setOwner (String Owner)
{
if (Owner != null && Owner.length() > 20)
{
log.warning("Length > 20 - truncated");
Owner = Owner.substring(0,19);
}
set_Value (COLUMNNAME_Owner, Owner);
}
/** Get Owner.
@return Owner */
public String getOwner() 
{
String value = (String)get_Value(COLUMNNAME_Owner);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6dfda3d4-0410-436a-b1c9-4dedc9b1cd61")
public static String es_PE_COLUMN_Owner_Name="Owner";

@XendraColumn(AD_Element_ID="45bfcd72-f729-6be1-072c-8a346be684e8",ColumnName="Owner",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6dfda3d4-0410-436a-b1c9-4dedc9b1cd61",
Synchronized="2015-08-15 14:25:01.0")
/** Column name Owner */
public static final String COLUMNNAME_Owner = "Owner";
/** Set RightType.
@param RightType RightType */
public void setRightType (String RightType)
{
if (RightType != null && RightType.length() > 20)
{
log.warning("Length > 20 - truncated");
RightType = RightType.substring(0,19);
}
set_Value (COLUMNNAME_RightType, RightType);
}
/** Get RightType.
@return RightType */
public String getRightType() 
{
String value = (String)get_Value(COLUMNNAME_RightType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b811d08a-d092-42fa-83ef-82d3d8dd1c92")
public static String es_PE_COLUMN_RightType_Name="righttype";

@XendraColumn(AD_Element_ID="f0c12770-b751-4dc7-b000-48627245ef48",ColumnName="RightType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b811d08a-d092-42fa-83ef-82d3d8dd1c92",
Synchronized="2015-08-15 14:25:01.0")
/** Column name RightType */
public static final String COLUMNNAME_RightType = "RightType";
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

@XendraTrl(Identifier="1b380c07-5a0d-486e-9771-bfb145c9b820")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b380c07-5a0d-486e-9771-bfb145c9b820",
Synchronized="2015-08-15 18:30:17.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
