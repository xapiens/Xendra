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
import org.compiere.model.reference.REF_AD_SystemStatus;
/** Generated Model for R_IssueSystem
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_IssueSystem extends PO
{
/** Standard Constructor
@param ctx context
@param R_IssueSystem_ID id
@param trxName transaction
*/
public X_R_IssueSystem (Properties ctx, int R_IssueSystem_ID, String trxName)
{
super (ctx, R_IssueSystem_ID, trxName);
/** if (R_IssueSystem_ID == 0)
{
setDBAddress (null);
setR_IssueSystem_ID (0);
setSystemStatus (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_IssueSystem (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=843 */
public static int Table_ID=MTable.getTable_ID("R_IssueSystem");

@XendraTrl(Identifier="11baab96-479e-1639-e62a-561f50ec5c95")
public static String es_PE_TAB_IssueSystem_Description="Mantener Versión de Sistemas ";

@XendraTrl(Identifier="11baab96-479e-1639-e62a-561f50ec5c95")
public static String es_PE_TAB_IssueSystem_Name="Versión de Sistema ";

@XendraTab(Name="Issue System",Description="Maintain Issue Systems",Help="",
AD_Window_ID="c5440ad3-0423-56d0-5153-86c2ec302f5a",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="11baab96-479e-1639-e62a-561f50ec5c95",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IssueSystem="11baab96-479e-1639-e62a-561f50ec5c95";

@XendraTrl(Identifier="605b2237-f638-0527-7c61-7ad82c309a96")
public static String es_PE_TABLE_R_IssueSystem_Name="Edición Sistema";

@XendraTable(Name="Issue System",Description="",Help="",TableName="R_IssueSystem",AccessLevel="6",
AD_Window_ID="c5440ad3-0423-56d0-5153-86c2ec302f5a",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="605b2237-f638-0527-7c61-7ad82c309a96",
Synchronized="2017-08-16 11:43:49.0")
/** TableName=R_IssueSystem */
public static final String Table_Name="R_IssueSystem";


@XendraIndex(Name="r_issuesystem_address",Identifier="9ea40afe-13a9-2e4a-efb2-6b2c0cf5f558",
Column_Names="dbaddress",IsUnique="true",TableIdentifier="9ea40afe-13a9-2e4a-efb2-6b2c0cf5f558",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_issuesystem_address = "9ea40afe-13a9-2e4a-efb2-6b2c0cf5f558";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_IssueSystem");

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
    Table_ID = MTable.getTable_ID("R_IssueSystem");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_IssueSystem[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_Value (COLUMNNAME_A_Asset_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cfd4735d-6633-11e1-2655-cc9b3b64dc80")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfd4735d-6633-11e1-2655-cc9b3b64dc80",
Synchronized="2017-08-05 16:55:50.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set DB Address.
@param DBAddress JDBC URL of the database server */
public void setDBAddress (String DBAddress)
{
if (DBAddress == null) throw new IllegalArgumentException ("DBAddress is mandatory.");
if (DBAddress.length() > 255)
{
log.warning("Length > 255 - truncated");
DBAddress = DBAddress.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_DBAddress, DBAddress);
}
/** Get DB Address.
@return JDBC URL of the database server */
public String getDBAddress() 
{
String value = (String)get_Value(COLUMNNAME_DBAddress);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDBAddress());
}

@XendraTrl(Identifier="ace3e0c5-72b7-dc50-ab85-5a25d2e7c0d6")
public static String es_PE_FIELD_IssueSystem_DBAddress_Description="Dirección de BD servidor";

@XendraTrl(Identifier="ace3e0c5-72b7-dc50-ab85-5a25d2e7c0d6")
public static String es_PE_FIELD_IssueSystem_DBAddress_Name="Dirección de BD Servidor";

@XendraField(AD_Column_ID="DBAddress",IsCentrallyMaintained=true,
AD_Tab_ID="11baab96-479e-1639-e62a-561f50ec5c95",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ace3e0c5-72b7-dc50-ab85-5a25d2e7c0d6")
public static final String FIELDNAME_IssueSystem_DBAddress="ace3e0c5-72b7-dc50-ab85-5a25d2e7c0d6";

@XendraTrl(Identifier="0c87c527-1c87-fd31-b96d-ef32b8dec084")
public static String es_PE_COLUMN_DBAddress_Name="Dirección de BD Servidor";

@XendraColumn(AD_Element_ID="ec6efc21-e877-d4e1-1d31-67dac89f2532",ColumnName="DBAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c87c527-1c87-fd31-b96d-ef32b8dec084",
Synchronized="2017-08-05 16:55:50.0")
/** Column name DBAddress */
public static final String COLUMNNAME_DBAddress = "DBAddress";
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
@XendraTrl(Identifier="e61cd5c2-68dc-42d6-8e5c-84e1ee835b09")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e61cd5c2-68dc-42d6-8e5c-84e1ee835b09",
Synchronized="2017-08-05 16:55:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Profile.
@param ProfileInfo Information to HELP profiling the system for solving support issues */
public void setProfileInfo (String ProfileInfo)
{
if (ProfileInfo != null && ProfileInfo.length() > 60)
{
log.warning("Length > 60 - truncated");
ProfileInfo = ProfileInfo.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_ProfileInfo, ProfileInfo);
}
/** Get Profile.
@return Information to HELP profiling the system for solving support issues */
public String getProfileInfo() 
{
String value = (String)get_Value(COLUMNNAME_ProfileInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a9cf6dce-ae28-8f34-4379-5a3c623dee9e")
public static String es_PE_FIELD_IssueSystem_Profile_Description="Información que ayuda al perfilamiento del sistema para solucionar ediciónes de soporte";

@XendraTrl(Identifier="a9cf6dce-ae28-8f34-4379-5a3c623dee9e")
public static String es_PE_FIELD_IssueSystem_Profile_Help="La información de perfil no contiene información confidencial y se utiliza para soportar la detección y el diagnóstico de la edición.";

@XendraTrl(Identifier="a9cf6dce-ae28-8f34-4379-5a3c623dee9e")
public static String es_PE_FIELD_IssueSystem_Profile_Name="Perfil";

@XendraField(AD_Column_ID="ProfileInfo",IsCentrallyMaintained=true,
AD_Tab_ID="11baab96-479e-1639-e62a-561f50ec5c95",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9cf6dce-ae28-8f34-4379-5a3c623dee9e")
public static final String FIELDNAME_IssueSystem_Profile="a9cf6dce-ae28-8f34-4379-5a3c623dee9e";

@XendraTrl(Identifier="75e6dc5b-9dcb-8e0d-cbce-8a3ae197af1c")
public static String es_PE_COLUMN_ProfileInfo_Name="Perfil";

@XendraColumn(AD_Element_ID="77ce72b8-feb1-d63c-1414-d8068d2b9c63",ColumnName="ProfileInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75e6dc5b-9dcb-8e0d-cbce-8a3ae197af1c",
Synchronized="2017-08-05 16:55:50.0")
/** Column name ProfileInfo */
public static final String COLUMNNAME_ProfileInfo = "ProfileInfo";
/** Set Issue System.
@param R_IssueSystem_ID System creating the issue */
public void setR_IssueSystem_ID (int R_IssueSystem_ID)
{
if (R_IssueSystem_ID < 1) throw new IllegalArgumentException ("R_IssueSystem_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_IssueSystem_ID, Integer.valueOf(R_IssueSystem_ID));
}
/** Get Issue System.
@return System creating the issue */
public int getR_IssueSystem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueSystem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2b084b8-a4de-07f7-ca6c-aeb55deadf05")
public static String es_PE_FIELD_IssueSystem_IssueSystem_Description="Edición de la creación del sistema";

@XendraTrl(Identifier="c2b084b8-a4de-07f7-ca6c-aeb55deadf05")
public static String es_PE_FIELD_IssueSystem_IssueSystem_Name="Edición Sistema";

@XendraField(AD_Column_ID="R_IssueSystem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11baab96-479e-1639-e62a-561f50ec5c95",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2b084b8-a4de-07f7-ca6c-aeb55deadf05")
public static final String FIELDNAME_IssueSystem_IssueSystem="c2b084b8-a4de-07f7-ca6c-aeb55deadf05";
/** Column name R_IssueSystem_ID */
public static final String COLUMNNAME_R_IssueSystem_ID = "R_IssueSystem_ID";
/** Set Statistics.
@param StatisticsInfo Information to HELP profiling the system for solving support issues */
public void setStatisticsInfo (String StatisticsInfo)
{
if (StatisticsInfo != null && StatisticsInfo.length() > 60)
{
log.warning("Length > 60 - truncated");
StatisticsInfo = StatisticsInfo.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_StatisticsInfo, StatisticsInfo);
}
/** Get Statistics.
@return Information to HELP profiling the system for solving support issues */
public String getStatisticsInfo() 
{
String value = (String)get_Value(COLUMNNAME_StatisticsInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="432709be-9d66-9b01-4e12-daca51292816")
public static String es_PE_FIELD_IssueSystem_Statistics_Description="Información que ayuda a perfilar el sistema para solucionar ediciones de soporte";

@XendraTrl(Identifier="432709be-9d66-9b01-4e12-daca51292816")
public static String es_PE_FIELD_IssueSystem_Statistics_Help="La información de perfil no contiene información confidencial y se utiliza para apoyar la detección y el diagnóstico de la edición así como la estadística anónima en general";

@XendraTrl(Identifier="432709be-9d66-9b01-4e12-daca51292816")
public static String es_PE_FIELD_IssueSystem_Statistics_Name="Estadística";

@XendraField(AD_Column_ID="StatisticsInfo",IsCentrallyMaintained=true,
AD_Tab_ID="11baab96-479e-1639-e62a-561f50ec5c95",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="432709be-9d66-9b01-4e12-daca51292816")
public static final String FIELDNAME_IssueSystem_Statistics="432709be-9d66-9b01-4e12-daca51292816";

@XendraTrl(Identifier="4486c4e9-237d-871d-485d-c99c956dcba7")
public static String es_PE_COLUMN_StatisticsInfo_Name="Estadística";

@XendraColumn(AD_Element_ID="cb4e2bb3-3a05-420d-402e-eac787e0151a",ColumnName="StatisticsInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4486c4e9-237d-871d-485d-c99c956dcba7",
Synchronized="2017-08-05 16:55:50.0")
/** Column name StatisticsInfo */
public static final String COLUMNNAME_StatisticsInfo = "StatisticsInfo";

/** SystemStatus AD_Reference=2aca3aa9-4a75-ed5a-2785-69ad14e5c85d */
public static final int SYSTEMSTATUS_AD_Reference_ID=374;
/** Set System Status.
@param SystemStatus Status of the system - Support priority depends on system status */
public void setSystemStatus (String SystemStatus)
{
if (SystemStatus == null) throw new IllegalArgumentException ("SystemStatus is mandatory");
if (SystemStatus.equals(REF_AD_SystemStatus.Evaluation) || SystemStatus.equals(REF_AD_SystemStatus.Implementation) || SystemStatus.equals(REF_AD_SystemStatus.Production));
 else throw new IllegalArgumentException ("SystemStatus Invalid value - " + SystemStatus + " - Reference_ID=374 - E - I - P");
if (SystemStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
SystemStatus = SystemStatus.substring(0,0);
}
set_Value (COLUMNNAME_SystemStatus, SystemStatus);
}
/** Get System Status.
@return Status of the system - Support priority depends on system status */
public String getSystemStatus() 
{
return (String)get_Value(COLUMNNAME_SystemStatus);
}

@XendraTrl(Identifier="a4df03b2-2738-deec-aae3-3bdc40703390")
public static String es_PE_FIELD_IssueSystem_SystemStatus_Description="Estado del Sistema - La prioridad del soporte depende del estado del sistema.";

@XendraTrl(Identifier="a4df03b2-2738-deec-aae3-3bdc40703390")
public static String es_PE_FIELD_IssueSystem_SystemStatus_Help="Estado del Sistema ayuda a priorizar recursos de soporte.";

@XendraTrl(Identifier="a4df03b2-2738-deec-aae3-3bdc40703390")
public static String es_PE_FIELD_IssueSystem_SystemStatus_Name="Estado del Sistema";

@XendraField(AD_Column_ID="SystemStatus",IsCentrallyMaintained=true,
AD_Tab_ID="11baab96-479e-1639-e62a-561f50ec5c95",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4df03b2-2738-deec-aae3-3bdc40703390")
public static final String FIELDNAME_IssueSystem_SystemStatus="a4df03b2-2738-deec-aae3-3bdc40703390";

@XendraTrl(Identifier="68382c49-e173-ca22-c1b4-fa377faf1879")
public static String es_PE_COLUMN_SystemStatus_Name="Estado del Sistema";

@XendraColumn(AD_Element_ID="66b6be12-484d-bb38-e430-af4c3adbdb6a",ColumnName="SystemStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="2aca3aa9-4a75-ed5a-2785-69ad14e5c85d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="68382c49-e173-ca22-c1b4-fa377faf1879",Synchronized="2017-08-05 16:55:50.0")
/** Column name SystemStatus */
public static final String COLUMNNAME_SystemStatus = "SystemStatus";
}
