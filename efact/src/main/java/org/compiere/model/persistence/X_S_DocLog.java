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
/** Generated Model for S_DocLog
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocLog extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocLog_ID id
@param trxName transaction
*/
public X_S_DocLog (Properties ctx, int S_DocLog_ID, String trxName)
{
super (ctx, S_DocLog_ID, trxName);
/** if (S_DocLog_ID == 0)
{
setS_DocHeader_ID (0);
setS_DocLog_ID (0);
setTaskStatus (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000431 */
public static int Table_ID=MTable.getTable_ID("S_DocLog");

@XendraTrl(Identifier="2c04ab6b-6f6f-4af6-82ef-00933c5cff4f")
public static String es_PE_TABLE_S_DocLog_Name="Doc Sunat Log ";

@XendraTable(Name="Doc Sunat Log ",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocLog",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="2c04ab6b-6f6f-4af6-82ef-00933c5cff4f",Synchronized="2022-04-27 11:44:27.0")
/** TableName=S_DocLog */
public static final String Table_Name="S_DocLog";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocLog");

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
    Table_ID = MTable.getTable_ID("S_DocLog");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocLog[").append(get_ID()).append("]");
return sb.toString();
}
/** Set cdr_code.
@param cdr_code cdr_code */
public void setcdr_code (String cdr_code)
{
if (cdr_code != null && cdr_code.length() > 45)
{
log.warning("Length > 45 - truncated");
cdr_code = cdr_code.substring(0,44);
}
set_Value (COLUMNNAME_cdr_code, cdr_code);
}
/** Get cdr_code.
@return cdr_code */
public String getcdr_code() 
{
String value = (String)get_Value(COLUMNNAME_cdr_code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="823284a3-2fd8-4919-ab10-6559e41172d3")
public static String es_PE_COLUMN_cdr_code_Name="cdr_code";

@XendraColumn(AD_Element_ID="627e61b3-30fd-4cef-b085-8675ec8f9541",ColumnName="cdr_code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="823284a3-2fd8-4919-ab10-6559e41172d3",
Synchronized="2022-04-27 11:43:30.0")
/** Column name cdr_code */
public static final String COLUMNNAME_cdr_code = "cdr_code";
/** Set CDR_Nota.
@param CDR_Nota CDR_Nota */
public void setCDR_Nota (String CDR_Nota)
{
set_Value (COLUMNNAME_CDR_Nota, CDR_Nota);
}
/** Get CDR_Nota.
@return CDR_Nota */
public String getCDR_Nota() 
{
String value = (String)get_Value(COLUMNNAME_CDR_Nota);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3be5e625-9a3d-4ee3-ab0c-7af3fda7c6d7")
public static String es_PE_COLUMN_CDR_Nota_Name="CDR_Nota";

@XendraColumn(AD_Element_ID="d1f8fe95-13b4-465b-8e1b-fa34a1c17f61",ColumnName="CDR_Nota",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3be5e625-9a3d-4ee3-ab0c-7af3fda7c6d7",
Synchronized="2022-04-27 11:43:30.0")
/** Column name CDR_Nota */
public static final String COLUMNNAME_CDR_Nota = "CDR_Nota";
/** Set cdr_observacion.
@param cdr_observacion cdr_observacion */
public void setcdr_observacion (String cdr_observacion)
{
set_Value (COLUMNNAME_cdr_observacion, cdr_observacion);
}
/** Get cdr_observacion.
@return cdr_observacion */
public String getcdr_observacion() 
{
String value = (String)get_Value(COLUMNNAME_cdr_observacion);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4f2cf3aa-5d9e-4ad5-bdbc-722e6acd6613")
public static String es_PE_COLUMN_cdr_observacion_Name="cdr_observacion";

@XendraColumn(AD_Element_ID="f769b837-494d-4ce5-9428-b68e2455ad52",ColumnName="cdr_observacion",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f2cf3aa-5d9e-4ad5-bdbc-722e6acd6613",
Synchronized="2022-04-27 11:43:30.0")
/** Column name cdr_observacion */
public static final String COLUMNNAME_cdr_observacion = "cdr_observacion";
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
@XendraTrl(Identifier="4609ef85-522f-41d9-a39b-e3553de88b31")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4609ef85-522f-41d9-a39b-e3553de88b31",
Synchronized="2022-04-27 11:43:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set S_DocHeader_ID.
@param S_DocHeader_ID S_DocHeader_ID */
public void setS_DocHeader_ID (int S_DocHeader_ID)
{
if (S_DocHeader_ID < 1) throw new IllegalArgumentException ("S_DocHeader_ID is mandatory.");
set_Value (COLUMNNAME_S_DocHeader_ID, Integer.valueOf(S_DocHeader_ID));
}
/** Get S_DocHeader_ID.
@return S_DocHeader_ID */
public int getS_DocHeader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocHeader_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33ed4c22-2b1d-434e-a4ec-3b609bd80549")
public static String es_PE_COLUMN_S_DocHeader_ID_Name="S_DocHeader_ID";

@XendraColumn(AD_Element_ID="51cdf354-f5f5-4380-86e3-e1607a818626",ColumnName="S_DocHeader_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33ed4c22-2b1d-434e-a4ec-3b609bd80549",
Synchronized="2022-04-27 11:43:30.0")
/** Column name S_DocHeader_ID */
public static final String COLUMNNAME_S_DocHeader_ID = "S_DocHeader_ID";
/** Set Doc Sunat Log .
@param S_DocLog_ID Doc Sunat Log  */
public void setS_DocLog_ID (int S_DocLog_ID)
{
if (S_DocLog_ID < 1) throw new IllegalArgumentException ("S_DocLog_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocLog_ID, Integer.valueOf(S_DocLog_ID));
}
/** Get Doc Sunat Log .
@return Doc Sunat Log  */
public int getS_DocLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocLog_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocLog_ID */
public static final String COLUMNNAME_S_DocLog_ID = "S_DocLog_ID";
/** Set StatusDate.
@param StatusDate StatusDate */
public void setStatusDate (Timestamp StatusDate)
{
set_Value (COLUMNNAME_StatusDate, StatusDate);
}
/** Get StatusDate.
@return StatusDate */
public Timestamp getStatusDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatusDate);
}

@XendraTrl(Identifier="2f8529ff-86c1-41b6-afcc-280a35769a3d")
public static String es_PE_COLUMN_StatusDate_Name="StatusDate";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f8529ff-86c1-41b6-afcc-280a35769a3d",
Synchronized="2022-04-27 11:43:30.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";
/** Set Task Status.
@param TaskStatus Status of the Task */
public void setTaskStatus (String TaskStatus)
{
if (TaskStatus == null) throw new IllegalArgumentException ("TaskStatus is mandatory.");
if (TaskStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
TaskStatus = TaskStatus.substring(0,0);
}
set_Value (COLUMNNAME_TaskStatus, TaskStatus);
}
/** Get Task Status.
@return Status of the Task */
public String getTaskStatus() 
{
String value = (String)get_Value(COLUMNNAME_TaskStatus);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="66a64c43-a0c8-4b44-99ce-518675960daa")
public static String es_PE_COLUMN_TaskStatus_Name="Task Status";

@XendraColumn(AD_Element_ID="31ff6abd-ef62-f5f2-c9b8-903359a7f19d",ColumnName="TaskStatus",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66a64c43-a0c8-4b44-99ce-518675960daa",
Synchronized="2022-04-27 11:43:30.0")
/** Column name TaskStatus */
public static final String COLUMNNAME_TaskStatus = "TaskStatus";
}
