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
/** Generated Model for C_StorePOPLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_StorePOPLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_StorePOPLine_ID id
@param trxName transaction
*/
public X_C_StorePOPLine (Properties ctx, int C_StorePOPLine_ID, String trxName)
{
super (ctx, C_StorePOPLine_ID, trxName);
/** if (C_StorePOPLine_ID == 0)
{
setC_StorePOPLine_ID (0);
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
public X_C_StorePOPLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000354 */
public static int Table_ID=MTable.getTable_ID("C_StorePOPLine");

@XendraTrl(Identifier="549882c0-f8a0-468e-92f2-3fe8f7011637")
public static String es_PE_TABLE_C_StorePOPLine_Name="Store POP Line";

@XendraTable(Name="Store POP Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_StorePOPLine",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="549882c0-f8a0-468e-92f2-3fe8f7011637",
Synchronized="2020-03-03 21:37:41.0")
/** TableName=C_StorePOPLine */
public static final String Table_Name="C_StorePOPLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_StorePOPLine");

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
    Table_ID = MTable.getTable_ID("C_StorePOPLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_StorePOPLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="8eb4ba04-0240-4147-9374-3985d4c7a5cf")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8eb4ba04-0240-4147-9374-3985d4c7a5cf",
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

@XendraTrl(Identifier="955488b0-ceb7-4832-ab4f-55f8a9d8f63b")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="955488b0-ceb7-4832-ab4f-55f8a9d8f63b",Synchronized="2019-08-30 22:22:17.0")
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
@XendraTrl(Identifier="a8c8fadb-b4ad-40ff-8ffe-0dfc33f60b45")
public static String es_PE_COLUMN_Classname_Name="Classname";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8c8fadb-b4ad-40ff-8ffe-0dfc33f60b45",
Synchronized="2019-08-30 22:22:17.0")
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
@XendraTrl(Identifier="d69e29db-d516-43bf-b974-2cbc8441efef")
public static String es_PE_COLUMN_ColumnID_Name="ColumnID";

@XendraColumn(AD_Element_ID="adafb618-658e-4965-805a-44016c4a73ad",ColumnName="ColumnID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d69e29db-d516-43bf-b974-2cbc8441efef",
Synchronized="2019-08-30 22:22:17.0")
/** Column name ColumnID */
public static final String COLUMNNAME_ColumnID = "ColumnID";
/** Set Store POP Line.
@param C_StorePOPLine_ID Store POP Line */
public void setC_StorePOPLine_ID (int C_StorePOPLine_ID)
{
if (C_StorePOPLine_ID < 1) throw new IllegalArgumentException ("C_StorePOPLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_StorePOPLine_ID, Integer.valueOf(C_StorePOPLine_ID));
}
/** Get Store POP Line.
@return Store POP Line */
public int getC_StorePOPLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_StorePOPLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_StorePOPLine_ID */
public static final String COLUMNNAME_C_StorePOPLine_ID = "C_StorePOPLine_ID";
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

@XendraTrl(Identifier="44e2bac5-ee3f-4e72-b4b0-343e5681b7f3")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44e2bac5-ee3f-4e72-b4b0-343e5681b7f3",
Synchronized="2019-08-30 22:22:17.0")
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
@XendraTrl(Identifier="1e8c8c46-a1b1-4a0a-9ef4-2044d17dc7dc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e8c8c46-a1b1-4a0a-9ef4-2044d17dc7dc",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="ccec1f27-6896-426b-a0a9-a7aa117523b1")
public static String es_PE_COLUMN_IsColorColumn_Name="IsColorColumn";

@XendraColumn(AD_Element_ID="483dfa3a-1b4f-898f-1165-7a916ae6f797",ColumnName="IsColorColumn",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccec1f27-6896-426b-a0a9-a7aa117523b1",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="ff5339d9-72e2-49e0-a144-1d62a7275a66")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff5339d9-72e2-49e0-a144-1d62a7275a66",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="ad3ee471-b3e4-4eb7-9f29-68f5673904ea")
public static String es_PE_COLUMN_IsDescription_Name="Description Only";

@XendraColumn(AD_Element_ID="bd7f450d-a061-1b08-60d8-19c8943042f0",ColumnName="IsDescription",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad3ee471-b3e4-4eb7-9f29-68f5673904ea",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="c44f6889-71b8-43dc-8538-402e0ced4c25")
public static String es_PE_COLUMN_IsKey_Name="Key column";

@XendraColumn(AD_Element_ID="8be2cc4b-c2a0-4ba3-839f-51f95a60471f",ColumnName="IsKey",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c44f6889-71b8-43dc-8538-402e0ced4c25",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="359742be-2bdc-4cf0-8ff0-2482af1b76a5")
public static String es_PE_COLUMN_IsNextLine_Name="Next Line";

@XendraColumn(AD_Element_ID="f174a61c-2e3c-e69b-1602-2c17eb3540b8",ColumnName="IsNextLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="359742be-2bdc-4cf0-8ff0-2482af1b76a5",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="453e1ac2-bc59-4a3f-bc49-e5399777b357")
public static String es_PE_COLUMN_IsReadWrite_Name="Read Write";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="453e1ac2-bc59-4a3f-bc49-e5399777b357",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="06a41a81-0b5d-491c-8c67-945de1b825cf")
public static String es_PE_COLUMN_IsSelected_Name="Selected";

@XendraColumn(AD_Element_ID="7e3ec6ae-4cbf-7dc9-73ce-9a24e9fb7f16",ColumnName="IsSelected",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06a41a81-0b5d-491c-8c67-945de1b825cf",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="0ff374bd-ca98-40d6-9933-6c321dd03121")
public static String es_PE_COLUMN_IsVisible_Name="IsVisible";

@XendraColumn(AD_Element_ID="d5755b76-7c48-2932-e64a-ac8e7bfa27c9",ColumnName="IsVisible",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ff374bd-ca98-40d6-9933-6c321dd03121",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="5e03b69a-9971-4cdd-8940-686b5c08b9ac")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e03b69a-9971-4cdd-8940-686b5c08b9ac",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="7118f303-5f10-45d7-9816-cc6a94baec4c")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7118f303-5f10-45d7-9816-cc6a94baec4c",
Synchronized="2019-08-30 22:22:17.0")
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
@XendraTrl(Identifier="18efe070-ee8a-4f64-bae1-47e72f2da422")
public static String es_PE_COLUMN_ReferenceID_Name="ReferenceID";

@XendraColumn(AD_Element_ID="c3a6880c-b6b3-4d07-a5b3-dbb297efd432",ColumnName="ReferenceID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18efe070-ee8a-4f64-bae1-47e72f2da422",
Synchronized="2019-08-30 22:22:17.0")
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
@XendraTrl(Identifier="f627511a-b9ef-44b1-9c67-26fe4bbf0138")
public static String es_PE_COLUMN_SourceMethodName_Name="Source Method";

@XendraColumn(AD_Element_ID="c8f923ba-42fd-65b8-bf15-8f7d5b2d78ca",ColumnName="SourceMethodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f627511a-b9ef-44b1-9c67-26fe4bbf0138",
Synchronized="2019-08-30 22:22:17.0")
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
@XendraTrl(Identifier="b39468da-a3ef-4ab1-8a51-a0bddb23fc53")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b39468da-a3ef-4ab1-8a51-a0bddb23fc53",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
