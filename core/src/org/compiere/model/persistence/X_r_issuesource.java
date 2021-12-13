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
/** Generated Model for r_issuesource
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_r_issuesource extends PO
{
/** Standard Constructor
@param ctx context
@param r_issuesource_ID id
@param trxName transaction
*/
public X_r_issuesource (Properties ctx, int r_issuesource_ID, String trxName)
{
super (ctx, r_issuesource_ID, trxName);
/** if (r_issuesource_ID == 0)
{
setR_IssueProject_ID (0);
setr_issuesource_ID (0);
setR_IssueSystem_ID (0);
setR_IssueUser_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_r_issuesource (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000236 */
public static int Table_ID=MTable.getTable_ID("r_issuesource");

@XendraTrl(Identifier="a464dc2e-9376-f51d-7d23-9eb1f1f41fad")
public static String es_PE_TABLE_r_issuesource_Name="r_issuesource";

@XendraTable(Name="r_issuesource",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="r_issuesource",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="a464dc2e-9376-f51d-7d23-9eb1f1f41fad",
Synchronized="2020-03-03 21:39:32.0")
/** TableName=r_issuesource */
public static final String Table_Name="r_issuesource";


@XendraIndex(Name="r_issuesource_spo",Identifier="132e71cc-996c-c3ee-633d-1d30dedd7ba9",
Column_Names="r_issuesystem_id, r_issueproject_id, r_issueuser_id",IsUnique="true",
TableIdentifier="132e71cc-996c-c3ee-633d-1d30dedd7ba9",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_issuesource_spo = "132e71cc-996c-c3ee-633d-1d30dedd7ba9";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"r_issuesource");

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
    Table_ID = MTable.getTable_ID("r_issuesource");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_r_issuesource[").append(get_ID()).append("]");
return sb.toString();
}
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
@XendraTrl(Identifier="664923f7-7ab4-497d-8582-4bc775c650b4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="664923f7-7ab4-497d-8582-4bc775c650b4",
Synchronized="2019-08-30 22:23:45.0")
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
set_Value (COLUMNNAME_ProfileInfo, ProfileInfo);
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
@XendraTrl(Identifier="a486549d-6ccd-7b89-6bd5-8af70ab20500")
public static String es_PE_COLUMN_ProfileInfo_Name="Profile";

@XendraColumn(AD_Element_ID="77ce72b8-feb1-d63c-1414-d8068d2b9c63",ColumnName="ProfileInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a486549d-6ccd-7b89-6bd5-8af70ab20500",
Synchronized="2019-08-30 22:23:45.0")
/** Column name ProfileInfo */
public static final String COLUMNNAME_ProfileInfo = "ProfileInfo";
/** Set Issue Project.
@param R_IssueProject_ID Implementation Projects */
public void setR_IssueProject_ID (int R_IssueProject_ID)
{
if (R_IssueProject_ID < 1) throw new IllegalArgumentException ("R_IssueProject_ID is mandatory.");
set_Value (COLUMNNAME_R_IssueProject_ID, Integer.valueOf(R_IssueProject_ID));
}
/** Get Issue Project.
@return Implementation Projects */
public int getR_IssueProject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueProject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7eb50ecd-7fe7-6b62-ac96-811b06bdbea3")
public static String es_PE_COLUMN_R_IssueProject_ID_Name="Issue Project";

@XendraColumn(AD_Element_ID="e3e64ba6-8349-f89d-b126-03a4314c2f03",ColumnName="R_IssueProject_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7eb50ecd-7fe7-6b62-ac96-811b06bdbea3",
Synchronized="2019-08-30 22:23:45.0")
/** Column name R_IssueProject_ID */
public static final String COLUMNNAME_R_IssueProject_ID = "R_IssueProject_ID";
/** Set r_issuesource.
@param r_issuesource_ID r_issuesource */
public void setr_issuesource_ID (int r_issuesource_ID)
{
if (r_issuesource_ID < 1) throw new IllegalArgumentException ("r_issuesource_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_r_issuesource_ID, Integer.valueOf(r_issuesource_ID));
}
/** Get r_issuesource.
@return r_issuesource */
public int getr_issuesource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_r_issuesource_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name r_issuesource_ID */
public static final String COLUMNNAME_r_issuesource_ID = "r_issuesource_ID";
/** Set Issue System.
@param R_IssueSystem_ID System creating the issue */
public void setR_IssueSystem_ID (int R_IssueSystem_ID)
{
if (R_IssueSystem_ID < 1) throw new IllegalArgumentException ("R_IssueSystem_ID is mandatory.");
set_Value (COLUMNNAME_R_IssueSystem_ID, Integer.valueOf(R_IssueSystem_ID));
}
/** Get Issue System.
@return System creating the issue */
public int getR_IssueSystem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueSystem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a35085e8-f508-c053-ae03-6f3f56afc91f")
public static String es_PE_COLUMN_R_IssueSystem_ID_Name="Issue System";

@XendraColumn(AD_Element_ID="86ae7d06-3ae4-c567-0207-d0ec6da9d42a",ColumnName="R_IssueSystem_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a35085e8-f508-c053-ae03-6f3f56afc91f",
Synchronized="2019-08-30 22:23:45.0")
/** Column name R_IssueSystem_ID */
public static final String COLUMNNAME_R_IssueSystem_ID = "R_IssueSystem_ID";
/** Set IssueUser.
@param R_IssueUser_ID User who reported issues */
public void setR_IssueUser_ID (int R_IssueUser_ID)
{
if (R_IssueUser_ID < 1) throw new IllegalArgumentException ("R_IssueUser_ID is mandatory.");
set_Value (COLUMNNAME_R_IssueUser_ID, Integer.valueOf(R_IssueUser_ID));
}
/** Get IssueUser.
@return User who reported issues */
public int getR_IssueUser_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueUser_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="85cefe75-ad64-5c04-549f-cd703ea8c317")
public static String es_PE_COLUMN_R_IssueUser_ID_Name="IssueUser";

@XendraColumn(AD_Element_ID="dc28f935-fd86-1f75-68c1-4247bf0f6ecd",ColumnName="R_IssueUser_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85cefe75-ad64-5c04-549f-cd703ea8c317",
Synchronized="2019-08-30 22:23:45.0")
/** Column name R_IssueUser_ID */
public static final String COLUMNNAME_R_IssueUser_ID = "R_IssueUser_ID";
/** Set Statistics.
@param StatisticsInfo Information to HELP profiling the system for solving support issues */
public void setStatisticsInfo (String StatisticsInfo)
{
if (StatisticsInfo != null && StatisticsInfo.length() > 60)
{
log.warning("Length > 60 - truncated");
StatisticsInfo = StatisticsInfo.substring(0,59);
}
set_Value (COLUMNNAME_StatisticsInfo, StatisticsInfo);
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
@XendraTrl(Identifier="734cc89b-c3a6-5245-b41b-d9a9b3fac121")
public static String es_PE_COLUMN_StatisticsInfo_Name="Statistics";

@XendraColumn(AD_Element_ID="cb4e2bb3-3a05-420d-402e-eac787e0151a",ColumnName="StatisticsInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="734cc89b-c3a6-5245-b41b-d9a9b3fac121",
Synchronized="2019-08-30 22:23:45.0")
/** Column name StatisticsInfo */
public static final String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
}
