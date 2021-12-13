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
/** Generated Model for AD_Plugin
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Plugin extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Plugin_ID id
@param trxName transaction
*/
public X_AD_Plugin (Properties ctx, int AD_Plugin_ID, String trxName)
{
super (ctx, AD_Plugin_ID, trxName);
/** if (AD_Plugin_ID == 0)
{
setAccessLevel (null);
setAD_Plugin_ID (0);
setEntityType (null);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Plugin (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000330 */
public static int Table_ID=MTable.getTable_ID("AD_Plugin");

@XendraTrl(Identifier="95f6fce4-d0d0-4fef-9d96-ea2d7c601057")
public static String es_PE_TABLE_AD_Plugin_Name="Plugin";

@XendraTable(Name="Plugin",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Plugin",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="95f6fce4-d0d0-4fef-9d96-ea2d7c601057",
Synchronized="2020-03-03 21:35:15.0")
/** TableName=AD_Plugin */
public static final String Table_Name="AD_Plugin";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Plugin");

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
    Table_ID = MTable.getTable_ID("AD_Plugin");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Plugin[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
if (AccessLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
AccessLevel = AccessLevel.substring(0,0);
}
set_Value (COLUMNNAME_AccessLevel, AccessLevel);
}
/** Get Data Access Level.
@return Access Level required */
public String getAccessLevel() 
{
return (String)get_Value(COLUMNNAME_AccessLevel);
}

@XendraTrl(Identifier="8698b70f-b1e6-472e-b1df-0b136ab4b2a4")
public static String es_PE_COLUMN_AccessLevel_Name="Data Access Level";

@XendraColumn(AD_Element_ID="bd129648-2bd8-10dc-6b09-97aa41aa28e2",ColumnName="AccessLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="5684046b-00f0-a17c-843e-efad2b0e42f3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8698b70f-b1e6-472e-b1df-0b136ab4b2a4",Synchronized="2019-08-30 22:20:30.0")
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID < 1) throw new IllegalArgumentException ("AD_Plugin_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Plugin_ID, Integer.valueOf(AD_Plugin_ID));
}
/** Get Plugin.
@return Plugin */
public int getAD_Plugin_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Plugin_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
/** Set Category Name.
@param CategoryName Name of the Category */
public void setCategoryName (String CategoryName)
{
if (CategoryName != null && CategoryName.length() > 60)
{
log.warning("Length > 60 - truncated");
CategoryName = CategoryName.substring(0,59);
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
@XendraTrl(Identifier="8475e164-96b5-4087-a388-baf2601dcf0d")
public static String es_PE_COLUMN_CategoryName_Name="Category Name";

@XendraColumn(AD_Element_ID="6f30a805-6fdd-446d-efc8-cf35be4e2c2d",ColumnName="CategoryName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8475e164-96b5-4087-a388-baf2601dcf0d",
Synchronized="2019-08-30 22:20:30.0")
/** Column name CategoryName */
public static final String COLUMNNAME_CategoryName = "CategoryName";
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

@XendraTrl(Identifier="ff70a8f1-2ad1-4ffc-b2c5-cd51340461d2")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff70a8f1-2ad1-4ffc-b2c5-cd51340461d2",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="bec4ff3f-f163-4423-a8a0-153490205ae6")
public static String es_PE_COLUMN_EntityType_Name="Entity Type";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bec4ff3f-f163-4423-a8a0-153490205ae6",Synchronized="2019-08-30 22:20:30.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set extensionhandler.
@param extensionhandler extensionhandler */
public void setextensionhandler (String extensionhandler)
{
set_Value (COLUMNNAME_extensionhandler, extensionhandler);
}
/** Get extensionhandler.
@return extensionhandler */
public String getextensionhandler() 
{
String value = (String)get_Value(COLUMNNAME_extensionhandler);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ed2d4aa4-e2ab-4ff2-9557-e49b200cff48")
public static String es_PE_COLUMN_extensionhandler_Name="extensionhandler";

@XendraColumn(AD_Element_ID="b2da7023-3d97-4fbd-8fd6-0830696e62a2",ColumnName="extensionhandler",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed2d4aa4-e2ab-4ff2-9557-e49b200cff48",
Synchronized="2019-08-30 22:20:30.0")
/** Column name extensionhandler */
public static final String COLUMNNAME_extensionhandler = "extensionhandler";
/** Set File Name.
@param FileName Name of the local file or URL */
public void setFileName (String FileName)
{
if (FileName != null && FileName.length() > 120)
{
log.warning("Length > 120 - truncated");
FileName = FileName.substring(0,119);
}
set_Value (COLUMNNAME_FileName, FileName);
}
/** Get File Name.
@return Name of the local file or URL */
public String getFileName() 
{
String value = (String)get_Value(COLUMNNAME_FileName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2fbbdaa9-96f0-4f76-ba00-d597c36e08f0")
public static String es_PE_COLUMN_FileName_Name="File Name";

@XendraColumn(AD_Element_ID="309eb761-231b-faf7-45e5-8f880bf8604a",ColumnName="FileName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fbbdaa9-96f0-4f76-ba00-d597c36e08f0",
Synchronized="2019-08-30 22:20:30.0")
/** Column name FileName */
public static final String COLUMNNAME_FileName = "FileName";
/** Set File Size.
@param FileSize Size of the File in bytes */
public void setFileSize (int FileSize)
{
set_Value (COLUMNNAME_FileSize, Integer.valueOf(FileSize));
}
/** Get File Size.
@return Size of the File in bytes */
public int getFileSize() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FileSize);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4dc651d5-5772-495c-bed4-c959d019b406")
public static String es_PE_COLUMN_FileSize_Name="File Size";

@XendraColumn(AD_Element_ID="109bc392-20c4-bc36-cb38-7435d4a7f467",ColumnName="FileSize",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4dc651d5-5772-495c-bed4-c959d019b406",
Synchronized="2019-08-30 22:20:30.0")
/** Column name FileSize */
public static final String COLUMNNAME_FileSize = "FileSize";
/** Set Folder.
@param Folder A folder on a local or remote system to store data into */
public void setFolder (String Folder)
{
if (Folder != null && Folder.length() > 60)
{
log.warning("Length > 60 - truncated");
Folder = Folder.substring(0,59);
}
set_Value (COLUMNNAME_Folder, Folder);
}
/** Get Folder.
@return A folder on a local or remote system to store data into */
public String getFolder() 
{
String value = (String)get_Value(COLUMNNAME_Folder);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="09348d9c-9fe9-41c5-be33-9725d1950900")
public static String es_PE_COLUMN_Folder_Name="Folder";

@XendraColumn(AD_Element_ID="ff784f2c-2616-733d-5ef6-61172b5acfbd",ColumnName="Folder",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09348d9c-9fe9-41c5-be33-9725d1950900",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Folder */
public static final String COLUMNNAME_Folder = "Folder";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="2ed47383-fe95-468d-8161-e602028941d8")
public static String es_PE_COLUMN_Help_Name="Comment/Help";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ed47383-fe95-468d-8161-e602028941d8",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
if (ID != null && ID.length() > 100)
{
log.warning("Length > 100 - truncated");
ID = ID.substring(0,99);
}
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="885ae11f-9dae-4799-938e-7e1e0f0d8401")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="885ae11f-9dae-4799-938e-7e1e0f0d8401",
Synchronized="2019-08-30 22:20:30.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
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
@XendraTrl(Identifier="5d3f5f0c-5d9e-49a8-aa04-5d6fbeb32841")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d3f5f0c-5d9e-49a8-aa04-5d6fbeb32841",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsInstalled.
@param IsInstalled IsInstalled */
public void setIsInstalled (boolean IsInstalled)
{
set_Value (COLUMNNAME_IsInstalled, Boolean.valueOf(IsInstalled));
}
/** Get IsInstalled.
@return IsInstalled */
public boolean isInstalled() 
{
Object oo = get_Value(COLUMNNAME_IsInstalled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c45d2701-1659-42e8-9a82-f79c6027d27a")
public static String es_PE_COLUMN_IsInstalled_Name="isinstalled";

@XendraColumn(AD_Element_ID="9b365a84-0dab-4e0d-8454-a7b8a047a45a",ColumnName="IsInstalled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c45d2701-1659-42e8-9a82-f79c6027d27a",
Synchronized="2019-08-30 22:20:30.0")
/** Column name IsInstalled */
public static final String COLUMNNAME_IsInstalled = "IsInstalled";
/** Set IsSystem.
@param IsSystem IsSystem */
public void setIsSystem (boolean IsSystem)
{
set_Value (COLUMNNAME_IsSystem, Boolean.valueOf(IsSystem));
}
/** Get IsSystem.
@return IsSystem */
public boolean isSystem() 
{
Object oo = get_Value(COLUMNNAME_IsSystem);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1fe2e275-8ee3-49ac-9fbe-3464bf88e8b7")
public static String es_PE_COLUMN_IsSystem_Name="issystem";

@XendraColumn(AD_Element_ID="2f5e5955-82c9-48bf-b402-93d3add39e4d",ColumnName="IsSystem",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fe2e275-8ee3-49ac-9fbe-3464bf88e8b7",
Synchronized="2019-08-30 22:20:30.0")
/** Column name IsSystem */
public static final String COLUMNNAME_IsSystem = "IsSystem";
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

@XendraTrl(Identifier="d4191acc-d1d5-436a-ad14-2a16387b34f9")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4191acc-d1d5-436a-ad14-2a16387b34f9",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set plugin.
@param plugin plugin */
public void setplugin (String plugin)
{
set_Value (COLUMNNAME_plugin, plugin);
}
/** Get plugin.
@return plugin */
public String getplugin() 
{
String value = (String)get_Value(COLUMNNAME_plugin);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9f5f0179-7d19-4f58-9dfe-3f1e859dcde0")
public static String es_PE_COLUMN_plugin_Name="plugin";

@XendraColumn(AD_Element_ID="f0c55dc4-d227-4965-8e1c-5820ddcb2ff1",ColumnName="plugin",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f5f0179-7d19-4f58-9dfe-3f1e859dcde0",
Synchronized="2019-08-30 22:20:30.0")
/** Column name plugin */
public static final String COLUMNNAME_plugin = "plugin";
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

@XendraTrl(Identifier="a9efe741-c799-49f5-a25a-8cebeafc36ee")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9efe741-c799-49f5-a25a-8cebeafc36ee",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set Source.
@param Source Source */
public void setSource (String Source)
{
set_Value (COLUMNNAME_Source, Source);
}
/** Get Source.
@return Source */
public String getSource() 
{
String value = (String)get_Value(COLUMNNAME_Source);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14ecf5de-ef2a-4190-b0a3-e459463c7ba6")
public static String es_PE_COLUMN_Source_Name="source";

@XendraColumn(AD_Element_ID="0196dfe8-dc27-4c5c-9891-1a6c15182944",ColumnName="Source",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14ecf5de-ef2a-4190-b0a3-e459463c7ba6",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Source */
public static final String COLUMNNAME_Source = "Source";
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

@XendraTrl(Identifier="691009b8-2ec2-4701-ae25-e02f75307605")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="691009b8-2ec2-4701-ae25-e02f75307605",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Tags.
@param Tags Tags */
public void setTags (String Tags)
{
set_Value (COLUMNNAME_Tags, Tags);
}
/** Get Tags.
@return Tags */
public String getTags() 
{
String value = (String)get_Value(COLUMNNAME_Tags);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c2331abd-9b28-405b-bdcf-554e2809ea90")
public static String es_PE_COLUMN_Tags_Name="tags";

@XendraColumn(AD_Element_ID="ccdbeb88-f824-4fa7-9bc6-68f6ac828e96",ColumnName="Tags",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c2331abd-9b28-405b-bdcf-554e2809ea90",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Tags */
public static final String COLUMNNAME_Tags = "Tags";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (BigDecimal Version)
{
set_Value (COLUMNNAME_Version, Version);
}
/** Get Version.
@return Version of the table definition */
public BigDecimal getVersion() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Version);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="43fbc88a-f4b7-4215-8790-f1da807cd033")
public static String es_PE_COLUMN_Version_Name="Version";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43fbc88a-f4b7-4215-8790-f1da807cd033",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
}
