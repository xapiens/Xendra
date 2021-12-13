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
/** Generated Model for AD_PInstance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PInstance extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PInstance_ID id
@param trxName transaction
*/
public X_AD_PInstance (Properties ctx, int AD_PInstance_ID, String trxName)
{
super (ctx, AD_PInstance_ID, trxName);
/** if (AD_PInstance_ID == 0)
{
setAD_PInstance_ID (0);
setAD_Process_ID (0);
setIsProcessing (false);	
// N
setRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PInstance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=282 */
public static int Table_ID=MTable.getTable_ID("AD_PInstance");

@XendraTrl(Identifier="90777d95-0dc4-022d-3408-03369485cde5")
public static String es_PE_TAB_ProcessAudit_Description="Uso del proceso de auditoría";

@XendraTrl(Identifier="90777d95-0dc4-022d-3408-03369485cde5")
public static String es_PE_TAB_ProcessAudit_Name="Proceso de Auditoría";

@XendraTab(Name="Process Audit",Description="Audit Process use",Help="",
AD_Window_ID="08dcb8f3-54eb-187f-4e28-3d300e974ac2",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="90777d95-0dc4-022d-3408-03369485cde5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProcessAudit="90777d95-0dc4-022d-3408-03369485cde5";

@XendraTrl(Identifier="85a82946-9d1a-6aad-f864-9e407f82c14a")
public static String es_PE_TABLE_AD_PInstance_Name="Instancia del Proceso";

@XendraTable(Name="Process Instance",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Instance of the process",Help="",
TableName="AD_PInstance",AccessLevel="6",AD_Window_ID="08dcb8f3-54eb-187f-4e28-3d300e974ac2",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="85a82946-9d1a-6aad-f864-9e407f82c14a",Synchronized="2020-03-03 21:35:13.0")
/** TableName=AD_PInstance */
public static final String Table_Name="AD_PInstance";


@XendraIndex(Name="ad_pinstance_record",Identifier="5abc03e6-dadf-fb91-905e-05305bc1e6f1",
Column_Names="ad_process_id, record_id",IsUnique="false",
TableIdentifier="5abc03e6-dadf-fb91-905e-05305bc1e6f1",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_pinstance_record = "5abc03e6-dadf-fb91-905e-05305bc1e6f1";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PInstance");

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
    Table_ID = MTable.getTable_ID("AD_PInstance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PInstance[").append(get_ID()).append("]");
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_PInstance_ID()));
}

@XendraTrl(Identifier="436e92d9-d564-0601-9743-f5c7235197fe")
public static String es_PE_FIELD_ProcessAudit_ProcessInstance_Name="Instancia del Proceso";

@XendraField(AD_Column_ID="AD_PInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90777d95-0dc4-022d-3408-03369485cde5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="436e92d9-d564-0601-9743-f5c7235197fe")
public static final String FIELDNAME_ProcessAudit_ProcessInstance="436e92d9-d564-0601-9743-f5c7235197fe";
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID < 1) throw new IllegalArgumentException ("AD_Process_ID is mandatory.");
set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4fe33f3-972a-feb4-1a8a-682f704ecd95")
public static String es_PE_FIELD_ProcessAudit_Process_Name="Proceso";

@XendraTrl(Identifier="b4fe33f3-972a-feb4-1a8a-682f704ecd95")
public static String es_PE_FIELD_ProcessAudit_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="b4fe33f3-972a-feb4-1a8a-682f704ecd95")
public static String es_PE_FIELD_ProcessAudit_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90777d95-0dc4-022d-3408-03369485cde5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4fe33f3-972a-feb4-1a8a-682f704ecd95")
public static final String FIELDNAME_ProcessAudit_Process="b4fe33f3-972a-feb4-1a8a-682f704ecd95";

@XendraTrl(Identifier="f5f09d6f-6690-c074-0da7-cdce90427208")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5f09d6f-6690-c074-0da7-cdce90427208",
Synchronized="2019-08-30 22:20:29.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
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

@XendraTrl(Identifier="72c08886-dc24-30e8-7e9b-2f5bb0691c76")
public static String es_PE_FIELD_ProcessAudit_UserContact_Name="Usuario";

@XendraTrl(Identifier="72c08886-dc24-30e8-7e9b-2f5bb0691c76")
public static String es_PE_FIELD_ProcessAudit_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="72c08886-dc24-30e8-7e9b-2f5bb0691c76")
public static String es_PE_FIELD_ProcessAudit_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90777d95-0dc4-022d-3408-03369485cde5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72c08886-dc24-30e8-7e9b-2f5bb0691c76")
public static final String FIELDNAME_ProcessAudit_UserContact="72c08886-dc24-30e8-7e9b-2f5bb0691c76";

@XendraTrl(Identifier="84702f25-e610-7fbf-5305-f7974520ac01")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84702f25-e610-7fbf-5305-f7974520ac01",
Synchronized="2019-08-30 22:20:29.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
if (ErrorMsg != null && ErrorMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
ErrorMsg = ErrorMsg.substring(0,1999);
}
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7d64c958-bfdb-fa54-f80d-95437ca4465d")
public static String es_PE_FIELD_ProcessAudit_ErrorMsg_Name="Mensaje de Error";

@XendraField(AD_Column_ID="ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="90777d95-0dc4-022d-3408-03369485cde5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d64c958-bfdb-fa54-f80d-95437ca4465d")
public static final String FIELDNAME_ProcessAudit_ErrorMsg="7d64c958-bfdb-fa54-f80d-95437ca4465d";

@XendraTrl(Identifier="a64a79b4-a8f9-946e-94a9-ae15dc858d25")
public static String es_PE_COLUMN_ErrorMsg_Name="Mensaje de Error";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a64a79b4-a8f9-946e-94a9-ae15dc858d25",
Synchronized="2019-08-30 22:20:29.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
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
@XendraTrl(Identifier="6ae0788e-2342-4598-a902-f63eed4b85c5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ae0788e-2342-4598-a902-f63eed4b85c5",
Synchronized="2019-08-30 22:20:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Processing.
@param IsProcessing Processing */
public void setIsProcessing (boolean IsProcessing)
{
set_Value (COLUMNNAME_IsProcessing, Boolean.valueOf(IsProcessing));
}
/** Get Processing.
@return Processing */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_IsProcessing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e8577584-9924-7d49-2028-92771f1e9c70")
public static String es_PE_FIELD_ProcessAudit_Processing_Name="Proceso";

@XendraField(AD_Column_ID="IsProcessing",IsCentrallyMaintained=true,
AD_Tab_ID="90777d95-0dc4-022d-3408-03369485cde5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8577584-9924-7d49-2028-92771f1e9c70")
public static final String FIELDNAME_ProcessAudit_Processing="e8577584-9924-7d49-2028-92771f1e9c70";

@XendraTrl(Identifier="069c4058-7a90-0555-a9d7-7474197b297f")
public static String es_PE_COLUMN_IsProcessing_Name="Proceso";

@XendraColumn(AD_Element_ID="49f9b86f-6a5f-048d-ff88-ca9fd20a2af8",ColumnName="IsProcessing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="069c4058-7a90-0555-a9d7-7474197b297f",
Synchronized="2019-08-30 22:20:29.0")
/** Column name IsProcessing */
public static final String COLUMNNAME_IsProcessing = "IsProcessing";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c3438c1-fa00-ca33-a99c-c6e6953ea56c")
public static String es_PE_FIELD_ProcessAudit_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="3c3438c1-fa00-ca33-a99c-c6e6953ea56c")
public static String es_PE_FIELD_ProcessAudit_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="3c3438c1-fa00-ca33-a99c-c6e6953ea56c")
public static String es_PE_FIELD_ProcessAudit_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="90777d95-0dc4-022d-3408-03369485cde5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c3438c1-fa00-ca33-a99c-c6e6953ea56c")
public static final String FIELDNAME_ProcessAudit_RecordID="3c3438c1-fa00-ca33-a99c-c6e6953ea56c";

@XendraTrl(Identifier="a99a9fd1-8a9d-44da-11b0-22b7e8808fd4")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a99a9fd1-8a9d-44da-11b0-22b7e8808fd4",
Synchronized="2019-08-30 22:20:29.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Result.
@param Result Result of the action taken */
public void setResult (int Result)
{
set_Value (COLUMNNAME_Result, Integer.valueOf(Result));
}
/** Get Result.
@return Result of the action taken */
public int getResult() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Result);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="46b8e117-bff9-93cd-04d1-87df0cd2f678")
public static String es_PE_FIELD_ProcessAudit_Result_Name="Resultado";

@XendraTrl(Identifier="46b8e117-bff9-93cd-04d1-87df0cd2f678")
public static String es_PE_FIELD_ProcessAudit_Result_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="46b8e117-bff9-93cd-04d1-87df0cd2f678")
public static String es_PE_FIELD_ProcessAudit_Result_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="90777d95-0dc4-022d-3408-03369485cde5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46b8e117-bff9-93cd-04d1-87df0cd2f678")
public static final String FIELDNAME_ProcessAudit_Result="46b8e117-bff9-93cd-04d1-87df0cd2f678";

@XendraTrl(Identifier="321fb376-65db-7b71-dd28-b66999ccfe2a")
public static String es_PE_COLUMN_Result_Name="Resultado";

@XendraColumn(AD_Element_ID="ba7b014d-4620-7c1c-4680-838ca2550502",ColumnName="Result",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="321fb376-65db-7b71-dd28-b66999ccfe2a",
Synchronized="2019-08-30 22:20:29.0")
/** Column name Result */
public static final String COLUMNNAME_Result = "Result";
}
