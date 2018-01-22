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
/** Generated Model for AD_View
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_View extends PO
{
/** Standard Constructor
@param ctx context
@param AD_View_ID id
@param trxName transaction
*/
public X_AD_View (Properties ctx, int AD_View_ID, String trxName)
{
super (ctx, AD_View_ID, trxName);
/** if (AD_View_ID == 0)
{
setAD_View_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_View (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000250 */
public static int Table_ID=MTable.getTable_ID("AD_View");

@XendraTrl(Identifier="6ba96494-0c46-dbd8-7249-da8876623e82")
public static String es_PE_TABLE_AD_View_Name="Views";

@XendraTable(Name="Views",Description="",Help="",TableName="AD_View",AccessLevel="4",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="6ba96494-0c46-dbd8-7249-da8876623e82",Synchronized="2017-08-16 11:41:08.0")
/** TableName=AD_View */
public static final String Table_Name="AD_View";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_View");

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
    Table_ID = MTable.getTable_ID("AD_View");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_View[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD View.
@param AD_View_ID AD View */
public void setAD_View_ID (int AD_View_ID)
{
if (AD_View_ID < 1) throw new IllegalArgumentException ("AD_View_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_View_ID, Integer.valueOf(AD_View_ID));
}
/** Get AD View.
@return AD View */
public int getAD_View_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_View_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_View_ID */
public static final String COLUMNNAME_AD_View_ID = "AD_View_ID";
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
@XendraTrl(Identifier="bf5c1397-676d-488b-aeb9-dd8ad800bccb")
public static String es_PE_COLUMN_Comments_Name="Comments";

@XendraColumn(AD_Element_ID="68725fe2-3419-b727-d8d4-8bf5d0d8cfc2",ColumnName="Comments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf5c1397-676d-488b-aeb9-dd8ad800bccb",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Comments */
public static final String COLUMNNAME_Comments = "Comments";
/** Set Definition.
@param Definition Definition */
public void setDefinition (String Definition)
{
set_Value (COLUMNNAME_Definition, Definition);
}
/** Get Definition.
@return Definition */
public String getDefinition() 
{
String value = (String)get_Value(COLUMNNAME_Definition);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f3bd42f8-7ecd-3402-c994-5b1390ef825f")
public static String es_PE_COLUMN_Definition_Name="Definition";

@XendraColumn(AD_Element_ID="95c94e19-0ed7-3f9c-3fd2-4830a2f8a5b6",ColumnName="Definition",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f3bd42f8-7ecd-3402-c994-5b1390ef825f",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Definition */
public static final String COLUMNNAME_Definition = "Definition";
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

@XendraTrl(Identifier="07e8188f-079f-550d-4015-bf92f1dd60c9")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07e8188f-079f-550d-4015-bf92f1dd60c9",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Extension.
@param Extension Extension */
public void setExtension (String Extension)
{
if (Extension != null && Extension.length() > 255)
{
log.warning("Length > 255 - truncated");
Extension = Extension.substring(0,254);
}
set_Value (COLUMNNAME_Extension, Extension);
}
/** Get Extension.
@return Extension */
public String getExtension() 
{
String value = (String)get_Value(COLUMNNAME_Extension);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eea21bf4-dce9-4e94-ab12-742a44d0dd57")
public static String es_PE_COLUMN_Extension_Name="extension";

@XendraColumn(AD_Element_ID="a6ec9764-7bbc-404e-870c-230ac4042a48",ColumnName="Extension",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eea21bf4-dce9-4e94-ab12-742a44d0dd57",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Extension */
public static final String COLUMNNAME_Extension = "Extension";
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
@XendraTrl(Identifier="df6b9cfd-30f2-042d-d2f1-8b79fbc17bde")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="df6b9cfd-30f2-042d-d2f1-8b79fbc17bde",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a4326720-ab71-4081-bb7b-94e1b765e1f9")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM AD_View",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4326720-ab71-4081-bb7b-94e1b765e1f9",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 255)
{
log.warning("Length > 255 - truncated");
Name = Name.substring(0,254);
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

@XendraTrl(Identifier="799c7ad5-2b67-b3ef-57fa-e0e153cba892")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="799c7ad5-2b67-b3ef-57fa-e0e153cba892",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set OID.
@param OID OID */
public void setOID (int OID)
{
set_Value (COLUMNNAME_OID, Integer.valueOf(OID));
}
/** Get OID.
@return OID */
public int getOID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_OID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73e21e78-d114-4b9a-adc9-a6b8a00fc60c")
public static String es_PE_COLUMN_OID_Name="oid";

@XendraColumn(AD_Element_ID="bed74541-c2ac-4d91-92f3-4ed5d006eb5c",ColumnName="OID",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73e21e78-d114-4b9a-adc9-a6b8a00fc60c",
Synchronized="2017-08-05 16:52:58.0")
/** Column name OID */
public static final String COLUMNNAME_OID = "OID";
/** Set Owner.
@param Owner Owner */
public void setOwner (String Owner)
{
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
@XendraTrl(Identifier="74cf764f-4242-855c-e972-7e87733381c0")
public static String es_PE_COLUMN_Owner_Name="Owner";

@XendraColumn(AD_Element_ID="45bfcd72-f729-6be1-072c-8a346be684e8",ColumnName="Owner",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="74cf764f-4242-855c-e972-7e87733381c0",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Owner */
public static final String COLUMNNAME_Owner = "Owner";
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

@XendraTrl(Identifier="4af1fa72-4fa2-768a-3496-87b3dac7bba3")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4af1fa72-4fa2-768a-3496-87b3dac7bba3",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (boolean Type)
{
set_Value (COLUMNNAME_Type, Boolean.valueOf(Type));
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public boolean isType() 
{
Object oo = get_Value(COLUMNNAME_Type);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="99225dbd-5a7c-4c7e-164d-322b0d0181d4")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99225dbd-5a7c-4c7e-164d-322b0d0181d4",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
