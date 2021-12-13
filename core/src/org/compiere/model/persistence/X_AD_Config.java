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
/** Generated Model for AD_Config
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Config extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Config_ID id
@param trxName transaction
*/
public X_AD_Config (Properties ctx, int AD_Config_ID, String trxName)
{
super (ctx, AD_Config_ID, trxName);
/** if (AD_Config_ID == 0)
{
setAD_Config_ID (0);
setAD_User_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Config (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000288 */
public static int Table_ID=MTable.getTable_ID("AD_Config");

@XendraTrl(Identifier="156dcdf1-0b79-4e07-b957-839d7ceeca3b")
public static String es_PE_TAB_UserConfiguration_Name="User Configuration";

@XendraTab(Name="User Configuration",Description="",Help="",
AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",SeqNo=90,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="9ce712f5-b4b8-4218-8be7-a9709f8fba8f",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="156dcdf1-0b79-4e07-b957-839d7ceeca3b",
Synchronized="2017-09-13 18:45:12.0")
public static final String TABNAME_UserConfiguration="156dcdf1-0b79-4e07-b957-839d7ceeca3b";

@XendraTrl(Identifier="0f754335-6a36-4955-ae7d-51113dcca08e")
public static String es_PE_TABLE_AD_Config_Name="AD_Config";

@XendraTable(Name="AD_Config",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Config",
AccessLevel="7",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="0f754335-6a36-4955-ae7d-51113dcca08e",
Synchronized="2020-03-03 21:34:58.0")
/** TableName=AD_Config */
public static final String Table_Name="AD_Config";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Config");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_Config");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Config[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Config_ID.
@param AD_Config_ID AD_Config_ID */
public void setAD_Config_ID (int AD_Config_ID)
{
if (AD_Config_ID < 1) throw new IllegalArgumentException ("AD_Config_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Config_ID, Integer.valueOf(AD_Config_ID));
}
/** Get AD_Config_ID.
@return AD_Config_ID */
public int getAD_Config_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Config_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4d54b878-2c6c-4206-bfb2-95652bc2e3f2")
public static String es_PE_FIELD_UserConfiguration_AD_Config_ID_Name="AD_Config_ID";

@XendraTrl(Identifier="4d54b878-2c6c-4206-bfb2-95652bc2e3f2")
public static String es_PE_FIELD_UserConfiguration_AD_Config_ID_Description="AD_Config_ID";

@XendraTrl(Identifier="4d54b878-2c6c-4206-bfb2-95652bc2e3f2")
public static String es_PE_FIELD_UserConfiguration_AD_Config_ID_Help="AD_Config_ID";

@XendraField(AD_Column_ID="AD_Config_ID",IsCentrallyMaintained=true,
AD_Tab_ID="156dcdf1-0b79-4e07-b957-839d7ceeca3b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-09-13 18:45:12.0",
Identifier="4d54b878-2c6c-4206-bfb2-95652bc2e3f2")
public static final String FIELDNAME_UserConfiguration_AD_Config_ID="4d54b878-2c6c-4206-bfb2-95652bc2e3f2";
/** Column name AD_Config_ID */
public static final String COLUMNNAME_AD_Config_ID = "AD_Config_ID";
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID <= 0) set_Value (COLUMNNAME_AD_Plugin_ID, null);
 else 
set_Value (COLUMNNAME_AD_Plugin_ID, Integer.valueOf(AD_Plugin_ID));
}
/** Get Plugin.
@return Plugin */
public int getAD_Plugin_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Plugin_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="265c4e78-f01b-4dd1-9cfc-8aaca967ea8c")
public static String es_PE_COLUMN_AD_Plugin_ID_Name="Plugin";

@XendraColumn(AD_Element_ID="895f0c3e-fa52-48b7-8fce-f9b2dc637774",ColumnName="AD_Plugin_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="265c4e78-f01b-4dd1-9cfc-8aaca967ea8c",
Synchronized="2019-08-30 22:20:18.0")
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
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

@XendraTrl(Identifier="7a62ec58-bc38-4ef5-a96e-525cd3d1d4e1")
public static String es_PE_FIELD_UserConfiguration_UserContact_Name="Usuario";

@XendraTrl(Identifier="7a62ec58-bc38-4ef5-a96e-525cd3d1d4e1")
public static String es_PE_FIELD_UserConfiguration_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="7a62ec58-bc38-4ef5-a96e-525cd3d1d4e1")
public static String es_PE_FIELD_UserConfiguration_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="156dcdf1-0b79-4e07-b957-839d7ceeca3b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-09-13 18:45:12.0",
Identifier="7a62ec58-bc38-4ef5-a96e-525cd3d1d4e1")
public static final String FIELDNAME_UserConfiguration_UserContact="7a62ec58-bc38-4ef5-a96e-525cd3d1d4e1";

@XendraTrl(Identifier="9ce712f5-b4b8-4218-8be7-a9709f8fba8f")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ce712f5-b4b8-4218-8be7-a9709f8fba8f",
Synchronized="2019-08-30 22:20:18.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="f44020b7-0307-44c3-b1d5-7994f2b7d2a1")
public static String es_PE_FIELD_UserConfiguration_Content_Name="content";

@XendraField(AD_Column_ID="Content",IsCentrallyMaintained=true,
AD_Tab_ID="156dcdf1-0b79-4e07-b957-839d7ceeca3b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-09-13 18:45:12.0",
Identifier="f44020b7-0307-44c3-b1d5-7994f2b7d2a1")
public static final String FIELDNAME_UserConfiguration_Content="f44020b7-0307-44c3-b1d5-7994f2b7d2a1";

@XendraTrl(Identifier="2be1d004-0d2d-40ea-a3dc-52b157f1058c")
public static String es_PE_COLUMN_Content_Name="Content";

@XendraColumn(AD_Element_ID="1aa0835d-f6ff-ae44-3d38-0719eab019ce",ColumnName="Content",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2be1d004-0d2d-40ea-a3dc-52b157f1058c",
Synchronized="2019-08-30 22:20:18.0")
/** Column name Content */
public static final String COLUMNNAME_Content = "Content";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 30)
{
log.warning("Length > 30 - truncated");
Identifier = Identifier.substring(0,29);
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
@XendraTrl(Identifier="4d73890b-ed8d-405a-9341-5f04f65a4dac")
public static String es_PE_FIELD_UserConfiguration_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="156dcdf1-0b79-4e07-b957-839d7ceeca3b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-09-13 18:45:12.0",
Identifier="4d73890b-ed8d-405a-9341-5f04f65a4dac")
public static final String FIELDNAME_UserConfiguration_Identifier="4d73890b-ed8d-405a-9341-5f04f65a4dac";

@XendraTrl(Identifier="7374be10-7909-49ca-bb30-2a6f34f64fe2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7374be10-7909-49ca-bb30-2a6f34f64fe2",
Synchronized="2019-08-30 22:20:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set ModuleName.
@param ModuleName ModuleName */
public void setModuleName (String ModuleName)
{
if (ModuleName != null && ModuleName.length() > 100)
{
log.warning("Length > 100 - truncated");
ModuleName = ModuleName.substring(0,99);
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
@XendraTrl(Identifier="f5e73485-453c-417a-984c-01aca2f33ddc")
public static String es_PE_FIELD_UserConfiguration_ModuleName_Name="ModuleName";

@XendraField(AD_Column_ID="ModuleName",IsCentrallyMaintained=true,
AD_Tab_ID="156dcdf1-0b79-4e07-b957-839d7ceeca3b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-09-13 18:45:12.0",
Identifier="f5e73485-453c-417a-984c-01aca2f33ddc")
public static final String FIELDNAME_UserConfiguration_ModuleName="f5e73485-453c-417a-984c-01aca2f33ddc";

@XendraTrl(Identifier="db9355fb-f60e-4f09-ac24-54181ee7ab3a")
public static String es_PE_COLUMN_ModuleName_Name="ModuleName";

@XendraColumn(AD_Element_ID="3f839e25-1735-4503-b90a-218e787645b4",ColumnName="ModuleName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db9355fb-f60e-4f09-ac24-54181ee7ab3a",
Synchronized="2019-08-30 22:20:18.0")
/** Column name ModuleName */
public static final String COLUMNNAME_ModuleName = "ModuleName";
}
