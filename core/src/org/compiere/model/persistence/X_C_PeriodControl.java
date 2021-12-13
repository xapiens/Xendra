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
/** Generated Model for C_PeriodControl
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PeriodControl extends PO
{
/** Standard Constructor
@param ctx context
@param C_PeriodControl_ID id
@param trxName transaction
*/
public X_C_PeriodControl (Properties ctx, int C_PeriodControl_ID, String trxName)
{
super (ctx, C_PeriodControl_ID, trxName);
/** if (C_PeriodControl_ID == 0)
{
setC_PeriodControl_ID (0);
setC_Period_ID (0);
setDocBaseType (null);
setPeriodAction (null);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PeriodControl (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=229 */
public static int Table_ID=MTable.getTable_ID("C_PeriodControl");

@XendraTrl(Identifier="31e6aa31-d676-aaa8-ceba-e684058c8ff3")
public static String es_PE_TAB_PeriodControl_Description="Definir Control de Período";

@XendraTrl(Identifier="31e6aa31-d676-aaa8-ceba-e684058c8ff3")
public static String es_PE_TAB_PeriodControl_Help="La pestaña de Período despliega el estado de un período (Nunca abierto; Abierto; Cerrado).";

@XendraTrl(Identifier="31e6aa31-d676-aaa8-ceba-e684058c8ff3")
public static String es_PE_TAB_PeriodControl_Name="Control de Período";

@XendraTab(Name="Period Control",Description="Define Period Control",
Help="The Period Control Tab displays the status of a Period (Never Opened, Opened, Closed).  ",
AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",SeqNo=40,TabLevel=3,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="31e6aa31-d676-aaa8-ceba-e684058c8ff3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PeriodControl="31e6aa31-d676-aaa8-ceba-e684058c8ff3";

@XendraTrl(Identifier="ce136414-e04f-21df-f957-7c9395b611d1")
public static String es_PE_TABLE_C_PeriodControl_Name="Período de Control";

@XendraTable(Name="Period Control",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_PeriodControl",AccessLevel="2",AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="ce136414-e04f-21df-f957-7c9395b611d1",Synchronized="2020-03-03 21:37:26.0")
/** TableName=C_PeriodControl */
public static final String Table_Name="C_PeriodControl";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PeriodControl");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_PeriodControl");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PeriodControl[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Period Control.
@param C_PeriodControl_ID Period Control */
public void setC_PeriodControl_ID (int C_PeriodControl_ID)
{
if (C_PeriodControl_ID < 1) throw new IllegalArgumentException ("C_PeriodControl_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PeriodControl_ID, Integer.valueOf(C_PeriodControl_ID));
}
/** Get Period Control.
@return Period Control */
public int getC_PeriodControl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PeriodControl_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_PeriodControl_ID()));
}

@XendraTrl(Identifier="3e2724f8-ff64-efce-9884-6599241394f1")
public static String es_PE_FIELD_PeriodControl_PeriodControl_Name="Período de Control";

@XendraField(AD_Column_ID="C_PeriodControl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="31e6aa31-d676-aaa8-ceba-e684058c8ff3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e2724f8-ff64-efce-9884-6599241394f1")
public static final String FIELDNAME_PeriodControl_PeriodControl="3e2724f8-ff64-efce-9884-6599241394f1";
/** Column name C_PeriodControl_ID */
public static final String COLUMNNAME_C_PeriodControl_ID = "C_PeriodControl_ID";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="57803c0b-b125-bfb3-0ed6-153c1ce38ca1")
public static String es_PE_FIELD_PeriodControl_Period_Name="Período";

@XendraTrl(Identifier="57803c0b-b125-bfb3-0ed6-153c1ce38ca1")
public static String es_PE_FIELD_PeriodControl_Period_Description="Período de Calendario";

@XendraTrl(Identifier="57803c0b-b125-bfb3-0ed6-153c1ce38ca1")
public static String es_PE_FIELD_PeriodControl_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="31e6aa31-d676-aaa8-ceba-e684058c8ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57803c0b-b125-bfb3-0ed6-153c1ce38ca1")
public static final String FIELDNAME_PeriodControl_Period="57803c0b-b125-bfb3-0ed6-153c1ce38ca1";

@XendraTrl(Identifier="1f1bac68-c181-28a7-b6e7-f7ea5cbb3775")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f1bac68-c181-28a7-b6e7-f7ea5cbb3775",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Document BaseType.
@param DocBaseType Logical type of document */
public void setDocBaseType (String DocBaseType)
{
if (DocBaseType.length() > 3)
{
log.warning("Length > 3 - truncated");
DocBaseType = DocBaseType.substring(0,2);
}
set_ValueNoCheck (COLUMNNAME_DocBaseType, DocBaseType);
}
/** Get Document BaseType.
@return Logical type of document */
public String getDocBaseType() 
{
return (String)get_Value(COLUMNNAME_DocBaseType);
}

@XendraTrl(Identifier="58b26f8b-5c03-3910-1ec6-66c57cbb0d88")
public static String es_PE_FIELD_PeriodControl_DocumentBaseType_Name="Tipo de Documento Base";

@XendraTrl(Identifier="58b26f8b-5c03-3910-1ec6-66c57cbb0d88")
public static String es_PE_FIELD_PeriodControl_DocumentBaseType_Description="Identifica el punto de inicio para un documento";

@XendraTrl(Identifier="58b26f8b-5c03-3910-1ec6-66c57cbb0d88")
public static String es_PE_FIELD_PeriodControl_DocumentBaseType_Help="El tipo base de documento identifica la base ó punto de inicio de un documento. Múltiples tipos de documento pueden compartir un tipo base de documento simple.";

@XendraField(AD_Column_ID="DocBaseType",IsCentrallyMaintained=true,
AD_Tab_ID="31e6aa31-d676-aaa8-ceba-e684058c8ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58b26f8b-5c03-3910-1ec6-66c57cbb0d88")
public static final String FIELDNAME_PeriodControl_DocumentBaseType="58b26f8b-5c03-3910-1ec6-66c57cbb0d88";

@XendraTrl(Identifier="34c0f83b-35af-c5eb-d78d-4cdaa98fd886")
public static String es_PE_COLUMN_DocBaseType_Name="Tipo de Documento Base";

@XendraColumn(AD_Element_ID="d03cb659-5074-3721-d480-034c74c562e4",ColumnName="DocBaseType",
AD_Reference_ID=17,AD_Reference_Value_ID="c1999318-834d-4c66-5345-371ffe3c1f06",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="34c0f83b-35af-c5eb-d78d-4cdaa98fd886",Synchronized="2019-08-30 22:22:03.0")
/** Column name DocBaseType */
public static final String COLUMNNAME_DocBaseType = "DocBaseType";
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
@XendraTrl(Identifier="90e49a12-42e8-4902-bccf-9d938715a9b7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90e49a12-42e8-4902-bccf-9d938715a9b7",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Period Action.
@param PeriodAction Action taken for this period */
public void setPeriodAction (String PeriodAction)
{
if (PeriodAction.length() > 1)
{
log.warning("Length > 1 - truncated");
PeriodAction = PeriodAction.substring(0,0);
}
set_Value (COLUMNNAME_PeriodAction, PeriodAction);
}
/** Get Period Action.
@return Action taken for this period */
public String getPeriodAction() 
{
return (String)get_Value(COLUMNNAME_PeriodAction);
}

@XendraTrl(Identifier="f4587483-9316-e418-f5a5-bdd23629eb26")
public static String es_PE_FIELD_PeriodControl_PeriodAction_Name="Acción del Período";

@XendraTrl(Identifier="f4587483-9316-e418-f5a5-bdd23629eb26")
public static String es_PE_FIELD_PeriodControl_PeriodAction_Description="Acción a ser tomada para este período";

@XendraTrl(Identifier="f4587483-9316-e418-f5a5-bdd23629eb26")
public static String es_PE_FIELD_PeriodControl_PeriodAction_Help="La Acción del Período indica la acción a ser tomada en este período.";

@XendraField(AD_Column_ID="PeriodAction",IsCentrallyMaintained=true,
AD_Tab_ID="31e6aa31-d676-aaa8-ceba-e684058c8ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4587483-9316-e418-f5a5-bdd23629eb26")
public static final String FIELDNAME_PeriodControl_PeriodAction="f4587483-9316-e418-f5a5-bdd23629eb26";

@XendraTrl(Identifier="6ad82595-e49f-bc31-5cf0-a1129db183fc")
public static String es_PE_COLUMN_PeriodAction_Name="Acción del Período";

@XendraColumn(AD_Element_ID="ceb432f9-6bd6-847d-ce46-55f3b47c1b15",ColumnName="PeriodAction",
AD_Reference_ID=17,AD_Reference_Value_ID="6d64edf3-1b4f-9316-fe28-18a11e3727de",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ad82595-e49f-bc31-5cf0-a1129db183fc",Synchronized="2019-08-30 22:22:03.0")
/** Column name PeriodAction */
public static final String COLUMNNAME_PeriodAction = "PeriodAction";
/** Set Period Status.
@param PeriodStatus Current state of this period */
public void setPeriodStatus (String PeriodStatus)
{
if (PeriodStatus != null && PeriodStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
PeriodStatus = PeriodStatus.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_PeriodStatus, PeriodStatus);
}
/** Get Period Status.
@return Current state of this period */
public String getPeriodStatus() 
{
return (String)get_Value(COLUMNNAME_PeriodStatus);
}

@XendraTrl(Identifier="6f07979a-f9bb-7ac9-6c51-1c1b9727cd16")
public static String es_PE_FIELD_PeriodControl_PeriodStatus_Name="Estado del Período";

@XendraTrl(Identifier="6f07979a-f9bb-7ac9-6c51-1c1b9727cd16")
public static String es_PE_FIELD_PeriodControl_PeriodStatus_Description="Estado actual de este período.";

@XendraTrl(Identifier="6f07979a-f9bb-7ac9-6c51-1c1b9727cd16")
public static String es_PE_FIELD_PeriodControl_PeriodStatus_Help="El estado del período indica el estado actual para este período. ";

@XendraField(AD_Column_ID="PeriodStatus",IsCentrallyMaintained=true,
AD_Tab_ID="31e6aa31-d676-aaa8-ceba-e684058c8ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f07979a-f9bb-7ac9-6c51-1c1b9727cd16")
public static final String FIELDNAME_PeriodControl_PeriodStatus="6f07979a-f9bb-7ac9-6c51-1c1b9727cd16";

@XendraTrl(Identifier="97d2030f-653d-803f-33d9-7e97ab20ad1d")
public static String es_PE_COLUMN_PeriodStatus_Name="Estado del Período";

@XendraColumn(AD_Element_ID="997746cb-4365-dfc8-9ef2-410a20913d14",ColumnName="PeriodStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="8e8ed358-4348-653f-ffae-63b13cc40a68",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="97d2030f-653d-803f-33d9-7e97ab20ad1d",Synchronized="2019-08-30 22:22:03.0")
/** Column name PeriodStatus */
public static final String COLUMNNAME_PeriodStatus = "PeriodStatus";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d2cac750-5a3c-b42b-867a-f72f588d13e4")
public static String es_PE_FIELD_PeriodControl_ProcessNow_Name="Abrir/Cerrar";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="31e6aa31-d676-aaa8-ceba-e684058c8ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2cac750-5a3c-b42b-867a-f72f588d13e4")
public static final String FIELDNAME_PeriodControl_ProcessNow="d2cac750-5a3c-b42b-867a-f72f588d13e4";

@XendraTrl(Identifier="2b6c1b27-30bd-b438-ba8b-c5c3a06d9bcb")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="9d722911-3461-4489-e497-210c7badfef3",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2b6c1b27-30bd-b438-ba8b-c5c3a06d9bcb",Synchronized="2019-08-30 22:22:03.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
