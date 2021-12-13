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
/** Generated Model for AD_PInstance_Para
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PInstance_Para extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PInstance_Para_ID id
@param trxName transaction
*/
public X_AD_PInstance_Para (Properties ctx, int AD_PInstance_Para_ID, String trxName)
{
super (ctx, AD_PInstance_Para_ID, trxName);
/** if (AD_PInstance_Para_ID == 0)
{
setAD_PInstance_ID (0);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PInstance_Para (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=283 */
public static int Table_ID=MTable.getTable_ID("AD_PInstance_Para");

@XendraTrl(Identifier="919c88c2-e4ac-d00f-a3d1-81202a00fc85")
public static String es_PE_TAB_ParameterAudit_Description="Valores del parámetro del proceso de la auditoría.";

@XendraTrl(Identifier="919c88c2-e4ac-d00f-a3d1-81202a00fc85")
public static String es_PE_TAB_ParameterAudit_Name="Parámetros de Auditoría";

@XendraTab(Name="Parameter Audit",Description="Audit Process Parameter Values",Help="",
AD_Window_ID="08dcb8f3-54eb-187f-4e28-3d300e974ac2",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="919c88c2-e4ac-d00f-a3d1-81202a00fc85",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ParameterAudit="919c88c2-e4ac-d00f-a3d1-81202a00fc85";

@XendraTrl(Identifier="17989b61-a2fc-31cc-fb0e-07d06caf2478")
public static String es_PE_TABLE_AD_PInstance_Para_Name="AD_PInstance_Para";

@XendraTable(Name="AD_PInstance_Para",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_PInstance_Para",AccessLevel="6",AD_Window_ID="08dcb8f3-54eb-187f-4e28-3d300e974ac2",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="17989b61-a2fc-31cc-fb0e-07d06caf2478",Synchronized="2020-03-03 21:35:14.0")
/** TableName=AD_PInstance_Para */
public static final String Table_Name="AD_PInstance_Para";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PInstance_Para");

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
    Table_ID = MTable.getTable_ID("AD_PInstance_Para");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PInstance_Para[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="07ee4221-2a63-3aa0-ba53-c6319aac491b")
public static String es_PE_FIELD_ParameterAudit_ProcessInstance_Name="Instancia del Proceso";

@XendraField(AD_Column_ID="AD_PInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07ee4221-2a63-3aa0-ba53-c6319aac491b")
public static final String FIELDNAME_ParameterAudit_ProcessInstance="07ee4221-2a63-3aa0-ba53-c6319aac491b";

@XendraTrl(Identifier="1fca8c96-6566-a003-c585-21f1d1f768f9")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fca8c96-6566-a003-c585-21f1d1f768f9",
Synchronized="2019-08-30 22:20:30.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set AD_PInstance_Para.
@param AD_PInstance_Para_ID AD_PInstance_Para */
public void setAD_PInstance_Para_ID (int AD_PInstance_Para_ID)
{
if (AD_PInstance_Para_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_PInstance_Para_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_PInstance_Para_ID, Integer.valueOf(AD_PInstance_Para_ID));
}
/** Get AD_PInstance_Para.
@return AD_PInstance_Para */
public int getAD_PInstance_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_PInstance_Para_ID */
public static final String COLUMNNAME_AD_PInstance_Para_ID = "AD_PInstance_Para_ID";
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
@XendraTrl(Identifier="a921a456-cb7c-4b44-9475-93ff434f6772")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a921a456-cb7c-4b44-9475-93ff434f6772",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Info.
@param Info Information */
public void setInfo (String Info)
{
if (Info != null && Info.length() > 60)
{
log.warning("Length > 60 - truncated");
Info = Info.substring(0,59);
}
set_Value (COLUMNNAME_Info, Info);
}
/** Get Info.
@return Information */
public String getInfo() 
{
String value = (String)get_Value(COLUMNNAME_Info);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8cc0db6d-3f38-4d0d-0cb9-6375fb856ae8")
public static String es_PE_FIELD_ParameterAudit_Info_Name="Información";

@XendraTrl(Identifier="8cc0db6d-3f38-4d0d-0cb9-6375fb856ae8")
public static String es_PE_FIELD_ParameterAudit_Info_Description="Información";

@XendraTrl(Identifier="8cc0db6d-3f38-4d0d-0cb9-6375fb856ae8")
public static String es_PE_FIELD_ParameterAudit_Info_Help="La Información despliega datos desde la línea del documento fuente";

@XendraField(AD_Column_ID="Info",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8cc0db6d-3f38-4d0d-0cb9-6375fb856ae8")
public static final String FIELDNAME_ParameterAudit_Info="8cc0db6d-3f38-4d0d-0cb9-6375fb856ae8";

@XendraTrl(Identifier="529d5339-7f11-e131-3f25-24808f44eb02")
public static String es_PE_COLUMN_Info_Name="Información";

@XendraColumn(AD_Element_ID="ab412fab-8336-50a9-21d9-30571bb98ce1",ColumnName="Info",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="529d5339-7f11-e131-3f25-24808f44eb02",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Info */
public static final String COLUMNNAME_Info = "Info";
/** Set Info To.
@param Info_To Info To */
public void setInfo_To (String Info_To)
{
if (Info_To != null && Info_To.length() > 60)
{
log.warning("Length > 60 - truncated");
Info_To = Info_To.substring(0,59);
}
set_Value (COLUMNNAME_Info_To, Info_To);
}
/** Get Info To.
@return Info To */
public String getInfo_To() 
{
String value = (String)get_Value(COLUMNNAME_Info_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="80d9af6e-641f-a91e-54a8-701ff70e1028")
public static String es_PE_FIELD_ParameterAudit_InfoTo_Name="Información A";

@XendraField(AD_Column_ID="Info_To",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80d9af6e-641f-a91e-54a8-701ff70e1028")
public static final String FIELDNAME_ParameterAudit_InfoTo="80d9af6e-641f-a91e-54a8-701ff70e1028";

@XendraTrl(Identifier="40a24782-b7c4-d584-e785-8dc1446d3997")
public static String es_PE_COLUMN_Info_To_Name="Información A";

@XendraColumn(AD_Element_ID="3267ac50-5954-b566-6622-18aec2e4550f",ColumnName="Info_To",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40a24782-b7c4-d584-e785-8dc1446d3997",
Synchronized="2019-08-30 22:20:30.0")
/** Column name Info_To */
public static final String COLUMNNAME_Info_To = "Info_To";
/** Set Parameter Name.
@param ParameterName Parameter Name */
public void setParameterName (String ParameterName)
{
if (ParameterName != null && ParameterName.length() > 60)
{
log.warning("Length > 60 - truncated");
ParameterName = ParameterName.substring(0,59);
}
set_Value (COLUMNNAME_ParameterName, ParameterName);
}
/** Get Parameter Name.
@return Parameter Name */
public String getParameterName() 
{
String value = (String)get_Value(COLUMNNAME_ParameterName);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getParameterName());
}

@XendraTrl(Identifier="f90ae52a-4a96-87ba-7c4a-12e2c52d01d2")
public static String es_PE_FIELD_ParameterAudit_ParameterName_Name="Nombre de Parámetro";

@XendraField(AD_Column_ID="ParameterName",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f90ae52a-4a96-87ba-7c4a-12e2c52d01d2")
public static final String FIELDNAME_ParameterAudit_ParameterName="f90ae52a-4a96-87ba-7c4a-12e2c52d01d2";

@XendraTrl(Identifier="95c0903b-5bc5-df37-9a1b-ae853ac1f4bb")
public static String es_PE_COLUMN_ParameterName_Name="Nombre de Parámetro";

@XendraColumn(AD_Element_ID="3d38409b-93d1-e6c0-4e25-a6472fbe4d03",ColumnName="ParameterName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95c0903b-5bc5-df37-9a1b-ae853ac1f4bb",
Synchronized="2019-08-30 22:20:30.0")
/** Column name ParameterName */
public static final String COLUMNNAME_ParameterName = "ParameterName";
/** Set Process Date.
@param P_Date Process Parameter */
public void setP_Date (Timestamp P_Date)
{
set_Value (COLUMNNAME_P_Date, P_Date);
}
/** Get Process Date.
@return Process Parameter */
public Timestamp getP_Date() 
{
return (Timestamp)get_Value(COLUMNNAME_P_Date);
}

@XendraTrl(Identifier="e93fcf91-10d5-b93e-4fb4-211eebf95c88")
public static String es_PE_FIELD_ParameterAudit_ProcessDate_Name="Fecha";

@XendraField(AD_Column_ID="P_Date",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e93fcf91-10d5-b93e-4fb4-211eebf95c88")
public static final String FIELDNAME_ParameterAudit_ProcessDate="e93fcf91-10d5-b93e-4fb4-211eebf95c88";

@XendraTrl(Identifier="3befbc5f-02f7-ed4a-3c6a-18e25f7e1055")
public static String es_PE_COLUMN_P_Date_Name="Fecha";

@XendraColumn(AD_Element_ID="790305e7-f6b8-9b15-744a-432f8f76f5e8",ColumnName="P_Date",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3befbc5f-02f7-ed4a-3c6a-18e25f7e1055",
Synchronized="2019-08-30 22:20:30.0")
/** Column name P_Date */
public static final String COLUMNNAME_P_Date = "P_Date";
/** Set Process Date To.
@param P_Date_To Process Parameter */
public void setP_Date_To (Timestamp P_Date_To)
{
set_Value (COLUMNNAME_P_Date_To, P_Date_To);
}
/** Get Process Date To.
@return Process Parameter */
public Timestamp getP_Date_To() 
{
return (Timestamp)get_Value(COLUMNNAME_P_Date_To);
}

@XendraTrl(Identifier="1c91f430-4cd4-eefd-be4c-0c37c22ee1cc")
public static String es_PE_FIELD_ParameterAudit_ProcessDateTo_Name="Fecha Para";

@XendraField(AD_Column_ID="P_Date_To",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c91f430-4cd4-eefd-be4c-0c37c22ee1cc")
public static final String FIELDNAME_ParameterAudit_ProcessDateTo="1c91f430-4cd4-eefd-be4c-0c37c22ee1cc";

@XendraTrl(Identifier="f64472c9-b7f2-8d3f-fb23-acd8488ac850")
public static String es_PE_COLUMN_P_Date_To_Name="Fecha Para";

@XendraColumn(AD_Element_ID="15c0d683-1757-8888-e11c-820dd1e7e1d0",ColumnName="P_Date_To",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f64472c9-b7f2-8d3f-fb23-acd8488ac850",
Synchronized="2019-08-30 22:20:30.0")
/** Column name P_Date_To */
public static final String COLUMNNAME_P_Date_To = "P_Date_To";
/** Set Process Number.
@param P_Number Process Parameter */
public void setP_Number (BigDecimal P_Number)
{
set_Value (COLUMNNAME_P_Number, P_Number);
}
/** Get Process Number.
@return Process Parameter */
public BigDecimal getP_Number() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_P_Number);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a8e1fd5d-e4de-63f8-798d-fd26e3589891")
public static String es_PE_FIELD_ParameterAudit_ProcessNumber_Name="Número";

@XendraField(AD_Column_ID="P_Number",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8e1fd5d-e4de-63f8-798d-fd26e3589891")
public static final String FIELDNAME_ParameterAudit_ProcessNumber="a8e1fd5d-e4de-63f8-798d-fd26e3589891";

@XendraTrl(Identifier="5910156f-f645-1475-c98e-7311e72e7150")
public static String es_PE_COLUMN_P_Number_Name="Número";

@XendraColumn(AD_Element_ID="09e1d4c5-95ad-6214-9fa3-baa4772c5453",ColumnName="P_Number",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5910156f-f645-1475-c98e-7311e72e7150",
Synchronized="2019-08-30 22:20:30.0")
/** Column name P_Number */
public static final String COLUMNNAME_P_Number = "P_Number";
/** Set Process Number To.
@param P_Number_To Process Parameter */
public void setP_Number_To (BigDecimal P_Number_To)
{
set_Value (COLUMNNAME_P_Number_To, P_Number_To);
}
/** Get Process Number To.
@return Process Parameter */
public BigDecimal getP_Number_To() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_P_Number_To);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b10b6963-4ebd-7e46-b48e-1233103e0a29")
public static String es_PE_FIELD_ParameterAudit_ProcessNumberTo_Name="Número Para";

@XendraField(AD_Column_ID="P_Number_To",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b10b6963-4ebd-7e46-b48e-1233103e0a29")
public static final String FIELDNAME_ParameterAudit_ProcessNumberTo="b10b6963-4ebd-7e46-b48e-1233103e0a29";

@XendraTrl(Identifier="1ffb84af-1874-9a3c-e1fd-677c21410f04")
public static String es_PE_COLUMN_P_Number_To_Name="Número Para";

@XendraColumn(AD_Element_ID="c8ec178f-7bf4-a4a8-9b56-1ffb174309e5",ColumnName="P_Number_To",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ffb84af-1874-9a3c-e1fd-677c21410f04",
Synchronized="2019-08-30 22:20:30.0")
/** Column name P_Number_To */
public static final String COLUMNNAME_P_Number_To = "P_Number_To";
/** Set Process String.
@param P_String Process Parameter */
public void setP_String (String P_String)
{
if (P_String != null && P_String.length() > 60)
{
log.warning("Length > 60 - truncated");
P_String = P_String.substring(0,59);
}
set_Value (COLUMNNAME_P_String, P_String);
}
/** Get Process String.
@return Process Parameter */
public String getP_String() 
{
String value = (String)get_Value(COLUMNNAME_P_String);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a8bce237-38db-8e6c-5671-4785b21dcb62")
public static String es_PE_FIELD_ParameterAudit_ProcessString_Name="Secuencia";

@XendraField(AD_Column_ID="P_String",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8bce237-38db-8e6c-5671-4785b21dcb62")
public static final String FIELDNAME_ParameterAudit_ProcessString="a8bce237-38db-8e6c-5671-4785b21dcb62";

@XendraTrl(Identifier="bf24ac6f-ed13-3470-7f92-e676738927cf")
public static String es_PE_COLUMN_P_String_Name="Secuencia";

@XendraColumn(AD_Element_ID="33fd448f-2f59-c36d-9a39-3c9be9a0d382",ColumnName="P_String",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf24ac6f-ed13-3470-7f92-e676738927cf",
Synchronized="2019-08-30 22:20:30.0")
/** Column name P_String */
public static final String COLUMNNAME_P_String = "P_String";
/** Set Process String To.
@param P_String_To Process Parameter */
public void setP_String_To (String P_String_To)
{
if (P_String_To != null && P_String_To.length() > 60)
{
log.warning("Length > 60 - truncated");
P_String_To = P_String_To.substring(0,59);
}
set_Value (COLUMNNAME_P_String_To, P_String_To);
}
/** Get Process String To.
@return Process Parameter */
public String getP_String_To() 
{
String value = (String)get_Value(COLUMNNAME_P_String_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5435cb78-6b97-4b26-444f-749b9592ccdb")
public static String es_PE_FIELD_ParameterAudit_ProcessStringTo_Name="Secuencia Para";

@XendraField(AD_Column_ID="P_String_To",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5435cb78-6b97-4b26-444f-749b9592ccdb")
public static final String FIELDNAME_ParameterAudit_ProcessStringTo="5435cb78-6b97-4b26-444f-749b9592ccdb";

@XendraTrl(Identifier="1e07fed2-ed04-ed6c-d103-54dccb5add49")
public static String es_PE_COLUMN_P_String_To_Name="Secuencia Para";

@XendraColumn(AD_Element_ID="93b29b4a-a90f-7de3-b041-f7295cbf0000",ColumnName="P_String_To",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e07fed2-ed04-ed6c-d103-54dccb5add49",
Synchronized="2019-08-30 22:20:30.0")
/** Column name P_String_To */
public static final String COLUMNNAME_P_String_To = "P_String_To";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_ValueNoCheck (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2d43e6f-1bc8-a52a-4689-940c13a3c1c3")
public static String es_PE_FIELD_ParameterAudit_Sequence_Name="Secuencia";

@XendraTrl(Identifier="c2d43e6f-1bc8-a52a-4689-940c13a3c1c3")
public static String es_PE_FIELD_ParameterAudit_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="c2d43e6f-1bc8-a52a-4689-940c13a3c1c3")
public static String es_PE_FIELD_ParameterAudit_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="919c88c2-e4ac-d00f-a3d1-81202a00fc85",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2d43e6f-1bc8-a52a-4689-940c13a3c1c3")
public static final String FIELDNAME_ParameterAudit_Sequence="c2d43e6f-1bc8-a52a-4689-940c13a3c1c3";

@XendraTrl(Identifier="179d0d45-dadd-b6d3-3b44-2f46d6133dec")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="179d0d45-dadd-b6d3-3b44-2f46d6133dec",
Synchronized="2019-08-30 22:20:30.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
