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
/** Generated Model for C_StorePOSLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_StorePOSLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_StorePOSLine_ID id
@param trxName transaction
*/
public X_C_StorePOSLine (Properties ctx, int C_StorePOSLine_ID, String trxName)
{
super (ctx, C_StorePOSLine_ID, trxName);
/** if (C_StorePOSLine_ID == 0)
{
setC_StorePOSLine_ID (0);
setIsDescription (false);
setIsKey (false);
setIsNextLine (false);
setIsReadWrite (false);
setIsVisible (false);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_StorePOSLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000337 */
public static int Table_ID=MTable.getTable_ID("C_StorePOSLine");

@XendraTrl(Identifier="503bb97d-24a3-4900-ba0d-f488ae0c3c3d")
public static String es_PE_TABLE_C_StorePOSLine_Name="Store POS Line";

@XendraTable(Name="Store POS Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_StorePOSLine",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="503bb97d-24a3-4900-ba0d-f488ae0c3c3d",
Synchronized="2020-03-03 21:37:41.0")
/** TableName=C_StorePOSLine */
public static final String Table_Name="C_StorePOSLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_StorePOSLine");

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
    Table_ID = MTable.getTable_ID("C_StorePOSLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_StorePOSLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID <= 0) set_Value (COLUMNNAME_AD_Reference_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="267283e2-e6fe-48bc-9b79-85c1cfc38302")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="267283e2-e6fe-48bc-9b79-85c1cfc38302",
Synchronized="2019-08-30 22:22:17.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6226b38b-075c-41aa-8e28-8b96898c55c4")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6226b38b-075c-41aa-8e28-8b96898c55c4",Synchronized="2019-08-30 22:22:18.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
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
@XendraTrl(Identifier="8072c265-be40-48ce-b6f2-610c15f02398")
public static String es_PE_COLUMN_Classname_Name="Classname";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8072c265-be40-48ce-b6f2-610c15f02398",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
/** Set ColumnID.
@param ColumnID ColumnID */
public void setColumnID (String ColumnID)
{
if (ColumnID != null && ColumnID.length() > 36)
{
log.warning("Length > 36 - truncated");
ColumnID = ColumnID.substring(0,35);
}
set_Value (COLUMNNAME_ColumnID, ColumnID);
}
/** Get ColumnID.
@return ColumnID */
public String getColumnID() 
{
String value = (String)get_Value(COLUMNNAME_ColumnID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a236f6c3-f0da-4b74-bd99-c82942daf468")
public static String es_PE_COLUMN_ColumnID_Name="columnid";

@XendraColumn(AD_Element_ID="adafb618-658e-4965-805a-44016c4a73ad",ColumnName="ColumnID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a236f6c3-f0da-4b74-bd99-c82942daf468",
Synchronized="2019-08-30 22:22:18.0")
/** Column name ColumnID */
public static final String COLUMNNAME_ColumnID = "ColumnID";
/** Set Store POS Line.
@param C_StorePOSLine_ID Store POS Line */
public void setC_StorePOSLine_ID (int C_StorePOSLine_ID)
{
if (C_StorePOSLine_ID < 1) throw new IllegalArgumentException ("C_StorePOSLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_StorePOSLine_ID, Integer.valueOf(C_StorePOSLine_ID));
}
/** Get Store POS Line.
@return Store POS Line */
public int getC_StorePOSLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_StorePOSLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_StorePOSLine_ID */
public static final String COLUMNNAME_C_StorePOSLine_ID = "C_StorePOSLine_ID";
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

@XendraTrl(Identifier="15504edf-2712-4145-8333-face96d341a9")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15504edf-2712-4145-8333-face96d341a9",
Synchronized="2019-08-30 22:22:18.0")
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
@XendraTrl(Identifier="ef49d450-667b-4dac-8718-61c2f85817ec")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef49d450-667b-4dac-8718-61c2f85817ec",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsColorColumn.
@param IsColorColumn IsColorColumn */
public void setIsColorColumn (boolean IsColorColumn)
{
set_Value (COLUMNNAME_IsColorColumn, Boolean.valueOf(IsColorColumn));
}
/** Get IsColorColumn.
@return IsColorColumn */
public boolean isColorColumn() 
{
Object oo = get_Value(COLUMNNAME_IsColorColumn);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ae9751db-2d7f-4c16-aee8-b0fc04be8e2e")
public static String es_PE_COLUMN_IsColorColumn_Name="IsColorColumn";

@XendraColumn(AD_Element_ID="483dfa3a-1b4f-898f-1165-7a916ae6f797",ColumnName="IsColorColumn",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae9751db-2d7f-4c16-aee8-b0fc04be8e2e",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsColorColumn */
public static final String COLUMNNAME_IsColorColumn = "IsColorColumn";
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

@XendraTrl(Identifier="a149de6b-a481-49b0-b4e5-a8e6649b6bc4")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a149de6b-a481-49b0-b4e5-a8e6649b6bc4",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Description Only.
@param IsDescription if true, the line is just DESCRIPTION and no transaction */
public void setIsDescription (boolean IsDescription)
{
set_Value (COLUMNNAME_IsDescription, Boolean.valueOf(IsDescription));
}
/** Get Description Only.
@return if true, the line is just DESCRIPTION and no transaction */
public boolean isDescription() 
{
Object oo = get_Value(COLUMNNAME_IsDescription);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2fa90b12-4f43-4bb0-af7b-d613b303312c")
public static String es_PE_COLUMN_IsDescription_Name="Description Only";

@XendraColumn(AD_Element_ID="bd7f450d-a061-1b08-60d8-19c8943042f0",ColumnName="IsDescription",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fa90b12-4f43-4bb0-af7b-d613b303312c",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsDescription */
public static final String COLUMNNAME_IsDescription = "IsDescription";
/** Set Key column.
@param IsKey This column is the key in this table */
public void setIsKey (boolean IsKey)
{
set_Value (COLUMNNAME_IsKey, Boolean.valueOf(IsKey));
}
/** Get Key column.
@return This column is the key in this table */
public boolean isKey() 
{
Object oo = get_Value(COLUMNNAME_IsKey);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f111b3bd-efa6-4b3c-a6bf-bb6c64be74b4")
public static String es_PE_COLUMN_IsKey_Name="Key column";

@XendraColumn(AD_Element_ID="8be2cc4b-c2a0-4ba3-839f-51f95a60471f",ColumnName="IsKey",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f111b3bd-efa6-4b3c-a6bf-bb6c64be74b4",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsKey */
public static final String COLUMNNAME_IsKey = "IsKey";
/** Set Next Line.
@param IsNextLine Print item on next line */
public void setIsNextLine (boolean IsNextLine)
{
set_Value (COLUMNNAME_IsNextLine, Boolean.valueOf(IsNextLine));
}
/** Get Next Line.
@return Print item on next line */
public boolean isNextLine() 
{
Object oo = get_Value(COLUMNNAME_IsNextLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="808908ed-d7da-4cae-ac2a-02f66cf720f7")
public static String es_PE_COLUMN_IsNextLine_Name="Next Line";

@XendraColumn(AD_Element_ID="f174a61c-2e3c-e69b-1602-2c17eb3540b8",ColumnName="IsNextLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="808908ed-d7da-4cae-ac2a-02f66cf720f7",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsNextLine */
public static final String COLUMNNAME_IsNextLine = "IsNextLine";
/** Set Read Write.
@param IsReadWrite Field is read / write */
public void setIsReadWrite (boolean IsReadWrite)
{
set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
}
/** Get Read Write.
@return Field is read / write */
public boolean isReadWrite() 
{
Object oo = get_Value(COLUMNNAME_IsReadWrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d40055c0-f38c-4dae-867f-4de5c17331ac")
public static String es_PE_COLUMN_IsReadWrite_Name="Read Write";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d40055c0-f38c-4dae-867f-4de5c17331ac",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
/** Set Selected.
@param IsSelected Selected */
public void setIsSelected (boolean IsSelected)
{
set_Value (COLUMNNAME_IsSelected, Boolean.valueOf(IsSelected));
}
/** Get Selected.
@return Selected */
public boolean isSelected() 
{
Object oo = get_Value(COLUMNNAME_IsSelected);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="24ee4a5d-6c9b-4ceb-97a1-29dd02f6cfbd")
public static String es_PE_COLUMN_IsSelected_Name="Selected";

@XendraColumn(AD_Element_ID="7e3ec6ae-4cbf-7dc9-73ce-9a24e9fb7f16",ColumnName="IsSelected",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24ee4a5d-6c9b-4ceb-97a1-29dd02f6cfbd",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsSelected */
public static final String COLUMNNAME_IsSelected = "IsSelected";
/** Set IsVisible.
@param IsVisible IsVisible */
public void setIsVisible (boolean IsVisible)
{
set_Value (COLUMNNAME_IsVisible, Boolean.valueOf(IsVisible));
}
/** Get IsVisible.
@return IsVisible */
public boolean isVisible() 
{
Object oo = get_Value(COLUMNNAME_IsVisible);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f96fa325-1dcd-4dde-be62-b1e7996dd552")
public static String es_PE_COLUMN_IsVisible_Name="IsVisible";

@XendraColumn(AD_Element_ID="d5755b76-7c48-2932-e64a-ac8e7bfa27c9",ColumnName="IsVisible",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f96fa325-1dcd-4dde-be62-b1e7996dd552",
Synchronized="2019-08-30 22:22:18.0")
/** Column name IsVisible */
public static final String COLUMNNAME_IsVisible = "IsVisible";
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

@XendraTrl(Identifier="ede1563e-303a-42d8-8c0e-eee613b1a857")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ede1563e-303a-42d8-8c0e-eee613b1a857",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
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

@XendraTrl(Identifier="2520cd31-b422-4e6d-90c4-86eef3fe4888")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2520cd31-b422-4e6d-90c4-86eef3fe4888",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set ReferenceID.
@param ReferenceID ReferenceID */
public void setReferenceID (String ReferenceID)
{
if (ReferenceID != null && ReferenceID.length() > 36)
{
log.warning("Length > 36 - truncated");
ReferenceID = ReferenceID.substring(0,35);
}
set_Value (COLUMNNAME_ReferenceID, ReferenceID);
}
/** Get ReferenceID.
@return ReferenceID */
public String getReferenceID() 
{
String value = (String)get_Value(COLUMNNAME_ReferenceID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c9f94800-6826-4c53-bbf0-0690e4a56d07")
public static String es_PE_COLUMN_ReferenceID_Name="referenceid";

@XendraColumn(AD_Element_ID="c3a6880c-b6b3-4d07-a5b3-dbb297efd432",ColumnName="ReferenceID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9f94800-6826-4c53-bbf0-0690e4a56d07",
Synchronized="2019-08-30 22:22:18.0")
/** Column name ReferenceID */
public static final String COLUMNNAME_ReferenceID = "ReferenceID";
/** Set Source Method.
@param SourceMethodName Source Method Name */
public void setSourceMethodName (String SourceMethodName)
{
if (SourceMethodName != null && SourceMethodName.length() > 60)
{
log.warning("Length > 60 - truncated");
SourceMethodName = SourceMethodName.substring(0,59);
}
set_Value (COLUMNNAME_SourceMethodName, SourceMethodName);
}
/** Get Source Method.
@return Source Method Name */
public String getSourceMethodName() 
{
String value = (String)get_Value(COLUMNNAME_SourceMethodName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5f290092-c85c-4aba-bd85-a8909892903a")
public static String es_PE_COLUMN_SourceMethodName_Name="Source Method";

@XendraColumn(AD_Element_ID="c8f923ba-42fd-65b8-bf15-8f7d5b2d78ca",ColumnName="SourceMethodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f290092-c85c-4aba-bd85-a8909892903a",
Synchronized="2019-08-30 22:22:18.0")
/** Column name SourceMethodName */
public static final String COLUMNNAME_SourceMethodName = "SourceMethodName";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type != null && Type.length() > 1)
{
log.warning("Length > 1 - truncated");
Type = Type.substring(0,0);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
String value = (String)get_Value(COLUMNNAME_Type);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b9180cce-2528-432e-adb1-1f4337c003b3")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9180cce-2528-432e-adb1-1f4337c003b3",
Synchronized="2019-08-30 22:22:18.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
