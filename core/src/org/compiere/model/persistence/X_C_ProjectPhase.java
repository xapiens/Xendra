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
/** Generated Model for C_ProjectPhase
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ProjectPhase extends PO
{
/** Standard Constructor
@param ctx context
@param C_ProjectPhase_ID id
@param trxName transaction
*/
public X_C_ProjectPhase (Properties ctx, int C_ProjectPhase_ID, String trxName)
{
super (ctx, C_ProjectPhase_ID, trxName);
/** if (C_ProjectPhase_ID == 0)
{
setCommittedAmt (Env.ZERO);	
// 0
setC_Project_ID (0);
setC_ProjectPhase_ID (0);
setIsCommitCeiling (false);	
// N
setIsComplete (false);	
// N
setName (null);
setPlannedAmt (Env.ZERO);	
// 0
setProjInvoiceRule (null);	
// @ProjInvoiceRule@
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_ProjectPhase WHERE C_Project_ID=@C_Project_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ProjectPhase (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=576 */
public static int Table_ID=MTable.getTable_ID("C_ProjectPhase");

@XendraTrl(Identifier="0db359cc-e99f-0d49-ad6b-16c08ad16da6")
public static String es_PE_TAB_Phase_Description="Fase actual del proyecto";

@XendraTrl(Identifier="0db359cc-e99f-0d49-ad6b-16c08ad16da6")
public static String es_PE_TAB_Phase_Help="Fase actual del proyecto con la información de estado - generada a partir de la fase del tipo del proyecto.";

@XendraTrl(Identifier="0db359cc-e99f-0d49-ad6b-16c08ad16da6")
public static String es_PE_TAB_Phase_Name="Fase";
@XendraTab(Name="Phase",
Description="Maintain Actual Project Phase",
Help="Actual Phase of the Project with Status information - generated from Phase of Project Type.",
AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",
DisplayLogic="@ProjectLineLevel@=A | @ProjectLineLevel@=T",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="0db359cc-e99f-0d49-ad6b-16c08ad16da6",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Phase="0db359cc-e99f-0d49-ad6b-16c08ad16da6";

@XendraTrl(Identifier="0e74a025-914e-e674-9e8a-9f8e1cb57b73")
public static String es_PE_TABLE_C_ProjectPhase_Name="Fase del Proyecto";

@XendraTable(Name="Project Phase",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Phase of a Project",Help="",
TableName="C_ProjectPhase",AccessLevel="3",AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="0e74a025-914e-e674-9e8a-9f8e1cb57b73",Synchronized="2020-03-03 21:37:34.0")
/** TableName=C_ProjectPhase */
public static final String Table_Name="C_ProjectPhase";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ProjectPhase");

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
    Table_ID = MTable.getTable_ID("C_ProjectPhase");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ProjectPhase[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Committed Amount.
@param CommittedAmt The (legal) commitment amount */
public void setCommittedAmt (BigDecimal CommittedAmt)
{
if (CommittedAmt == null) throw new IllegalArgumentException ("CommittedAmt is mandatory.");
set_Value (COLUMNNAME_CommittedAmt, CommittedAmt);
}
/** Get Committed Amount.
@return The (legal) commitment amount */
public BigDecimal getCommittedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommittedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="75b721b8-b8b4-6c93-23ee-02d6c6775051")
public static String es_PE_FIELD_Phase_CommittedAmount_Name="Total Comprometido";

@XendraTrl(Identifier="75b721b8-b8b4-6c93-23ee-02d6c6775051")
public static String es_PE_FIELD_Phase_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="75b721b8-b8b4-6c93-23ee-02d6c6775051")
public static String es_PE_FIELD_Phase_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75b721b8-b8b4-6c93-23ee-02d6c6775051")
public static final String FIELDNAME_Phase_CommittedAmount="75b721b8-b8b4-6c93-23ee-02d6c6775051";

@XendraTrl(Identifier="8908f597-537c-0cef-87d1-1123f7692196")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8908f597-537c-0cef-87d1-1123f7692196",
Synchronized="2019-08-30 22:22:09.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f49770a4-2664-f06b-861f-3de649314c14")
public static String es_PE_FIELD_Phase_Order_Name="Orden de Venta";

@XendraTrl(Identifier="f49770a4-2664-f06b-861f-3de649314c14")
public static String es_PE_FIELD_Phase_Order_Description="Orden de Venta";

@XendraTrl(Identifier="f49770a4-2664-f06b-861f-3de649314c14")
public static String es_PE_FIELD_Phase_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f49770a4-2664-f06b-861f-3de649314c14")
public static final String FIELDNAME_Phase_Order="f49770a4-2664-f06b-861f-3de649314c14";

@XendraTrl(Identifier="6e25fa1f-2490-d055-8fba-d03c967e61ad")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e25fa1f-2490-d055-8fba-d03c967e61ad",
Synchronized="2019-08-30 22:22:09.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Standard Phase.
@param C_Phase_ID Standard Phase of the Project Type */
public void setC_Phase_ID (int C_Phase_ID)
{
if (C_Phase_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Phase_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Phase_ID, Integer.valueOf(C_Phase_ID));
}
/** Get Standard Phase.
@return Standard Phase of the Project Type */
public int getC_Phase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Phase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="259e4eb7-7be1-457d-050c-ef130b327963")
public static String es_PE_FIELD_Phase_StandardPhase_Name="Fase Estándar";

@XendraTrl(Identifier="259e4eb7-7be1-457d-050c-ef130b327963")
public static String es_PE_FIELD_Phase_StandardPhase_Description="Fase estándar de el tipo de proyecto";

@XendraTrl(Identifier="259e4eb7-7be1-457d-050c-ef130b327963")
public static String es_PE_FIELD_Phase_StandardPhase_Help="Fase del proyecto con la información estándar del funcionamiento con el trabajo estándar.";

@XendraField(AD_Column_ID="C_Phase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="259e4eb7-7be1-457d-050c-ef130b327963")
public static final String FIELDNAME_Phase_StandardPhase="259e4eb7-7be1-457d-050c-ef130b327963";

@XendraTrl(Identifier="7e7ec204-c03e-073a-9c40-f69f74f4a84c")
public static String es_PE_COLUMN_C_Phase_ID_Name="Fase Estándar";

@XendraColumn(AD_Element_ID="3ef98f9c-ae28-3183-566b-a77d4b8d6048",ColumnName="C_Phase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e7ec204-c03e-073a-9c40-f69f74f4a84c",
Synchronized="2019-08-30 22:22:09.0")
/** Column name C_Phase_ID */
public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID < 1) throw new IllegalArgumentException ("C_Project_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c47c97ba-df19-22ab-391f-2763e6ebe8c6")
public static String es_PE_FIELD_Phase_Project_Name="Proyecto";

@XendraTrl(Identifier="c47c97ba-df19-22ab-391f-2763e6ebe8c6")
public static String es_PE_FIELD_Phase_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="c47c97ba-df19-22ab-391f-2763e6ebe8c6")
public static String es_PE_FIELD_Phase_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c47c97ba-df19-22ab-391f-2763e6ebe8c6")
public static final String FIELDNAME_Phase_Project="c47c97ba-df19-22ab-391f-2763e6ebe8c6";

@XendraTrl(Identifier="eae5914a-9227-77b8-fff9-81902253062a")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eae5914a-9227-77b8-fff9-81902253062a",
Synchronized="2019-08-30 22:22:09.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID < 1) throw new IllegalArgumentException ("C_ProjectPhase_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="caa487f2-25fe-0a63-4b1c-d4135ba4f630")
public static String es_PE_FIELD_Phase_ProjectPhase_Name="Fase del Proyecto";

@XendraTrl(Identifier="caa487f2-25fe-0a63-4b1c-d4135ba4f630")
public static String es_PE_FIELD_Phase_ProjectPhase_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="caa487f2-25fe-0a63-4b1c-d4135ba4f630")
public static final String FIELDNAME_Phase_ProjectPhase="caa487f2-25fe-0a63-4b1c-d4135ba4f630";
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="06c2d947-ec61-731a-487a-c2a3597e5532")
public static String es_PE_FIELD_Phase_Description_Name="Observación";

@XendraTrl(Identifier="06c2d947-ec61-731a-487a-c2a3597e5532")
public static String es_PE_FIELD_Phase_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="06c2d947-ec61-731a-487a-c2a3597e5532")
public static String es_PE_FIELD_Phase_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06c2d947-ec61-731a-487a-c2a3597e5532")
public static final String FIELDNAME_Phase_Description="06c2d947-ec61-731a-487a-c2a3597e5532";

@XendraTrl(Identifier="8a010cd1-1ffa-83af-fbfe-2935a72f8108")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a010cd1-1ffa-83af-fbfe-2935a72f8108",
Synchronized="2019-08-30 22:22:09.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="13e20e05-ba8f-8c79-fea6-74520831b274")
public static String es_PE_FIELD_Phase_EndDate_Name="Fecha Final";

@XendraTrl(Identifier="13e20e05-ba8f-8c79-fea6-74520831b274")
public static String es_PE_FIELD_Phase_EndDate_Description="Última fecha efectiva (inclusive)";

@XendraTrl(Identifier="13e20e05-ba8f-8c79-fea6-74520831b274")
public static String es_PE_FIELD_Phase_EndDate_Help="La fecha final indica la última fecha en este rango.";

@XendraField(AD_Column_ID="EndDate",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13e20e05-ba8f-8c79-fea6-74520831b274")
public static final String FIELDNAME_Phase_EndDate="13e20e05-ba8f-8c79-fea6-74520831b274";

@XendraTrl(Identifier="db3457fc-689c-f447-15db-4c8a1b6fea58")
public static String es_PE_COLUMN_EndDate_Name="Fecha Final";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db3457fc-689c-f447-15db-4c8a1b6fea58",
Synchronized="2019-08-30 22:22:09.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
/** Set Generate Order.
@param GenerateOrder Generate Order */
public void setGenerateOrder (String GenerateOrder)
{
if (GenerateOrder != null && GenerateOrder.length() > 1)
{
log.warning("Length > 1 - truncated");
GenerateOrder = GenerateOrder.substring(0,0);
}
set_Value (COLUMNNAME_GenerateOrder, GenerateOrder);
}
/** Get Generate Order.
@return Generate Order */
public String getGenerateOrder() 
{
return (String)get_Value(COLUMNNAME_GenerateOrder);
}

@XendraTrl(Identifier="d30cf4d5-2e29-d98b-d841-8b93ae51e009")
public static String es_PE_FIELD_Phase_GenerateOrder_Name="Generar Orden";

@XendraTrl(Identifier="d30cf4d5-2e29-d98b-d841-8b93ae51e009")
public static String es_PE_FIELD_Phase_GenerateOrder_Description="Generar Orden desde una Fase de Proyecto";

@XendraTrl(Identifier="d30cf4d5-2e29-d98b-d841-8b93ae51e009")
public static String es_PE_FIELD_Phase_GenerateOrder_Help="Una fase puede ser facturada completa en lugar de facturar los productos de las tareas dependientes de la fase. El Proceso generar orden generará un documento de orden nueva basada en en la fase del proyecto o las tareas. En el Proyecto debe estar definida una lista de Precios y un almacén/punto de servicio. Si se define un producto al nivel de fase, se usa la información de la fase como la base para la orden (control de facturaciçon) - de otra manera se facturan las tareas individuales.";

@XendraField(AD_Column_ID="GenerateOrder",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d30cf4d5-2e29-d98b-d841-8b93ae51e009")
public static final String FIELDNAME_Phase_GenerateOrder="d30cf4d5-2e29-d98b-d841-8b93ae51e009";

@XendraTrl(Identifier="08b91f3f-a78d-df0d-934b-756b5a3c87a2")
public static String es_PE_COLUMN_GenerateOrder_Name="Generar Orden";

@XendraColumn(AD_Element_ID="5d12a66d-2930-002f-4b84-cbe5dcdf031b",ColumnName="GenerateOrder",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="f0083919-da66-2a0a-568e-c445234208df",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="08b91f3f-a78d-df0d-934b-756b5a3c87a2",Synchronized="2019-08-30 22:22:09.0")
/** Column name GenerateOrder */
public static final String COLUMNNAME_GenerateOrder = "GenerateOrder";
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

@XendraTrl(Identifier="db092bf0-767b-49e1-a9be-cfe05c21a0e1")
public static String es_PE_FIELD_Phase_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="db092bf0-767b-49e1-a9be-cfe05c21a0e1")
public static String es_PE_FIELD_Phase_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="db092bf0-767b-49e1-a9be-cfe05c21a0e1")
public static String es_PE_FIELD_Phase_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db092bf0-767b-49e1-a9be-cfe05c21a0e1")
public static final String FIELDNAME_Phase_CommentHelp="db092bf0-767b-49e1-a9be-cfe05c21a0e1";

@XendraTrl(Identifier="63604d35-3b57-ce39-ac44-b1c0881fab50")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63604d35-3b57-ce39-ac44-b1c0881fab50",
Synchronized="2019-08-30 22:22:09.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="20876b0c-70d8-4cf9-b933-3e5cb1f72d0a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20876b0c-70d8-4cf9-b933-3e5cb1f72d0a",
Synchronized="2019-08-30 22:22:09.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Commitment is Ceiling.
@param IsCommitCeiling The commitment amount/quantity is the chargeable ceiling  */
public void setIsCommitCeiling (boolean IsCommitCeiling)
{
set_Value (COLUMNNAME_IsCommitCeiling, Boolean.valueOf(IsCommitCeiling));
}
/** Get Commitment is Ceiling.
@return The commitment amount/quantity is the chargeable ceiling  */
public boolean isCommitCeiling() 
{
Object oo = get_Value(COLUMNNAME_IsCommitCeiling);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="04c411c5-bff3-ce41-e71c-ebef5f7a1fb1")
public static String es_PE_FIELD_Phase_CommitmentIsCeiling_Name="Compromiso Límite";

@XendraTrl(Identifier="04c411c5-bff3-ce41-e71c-ebef5f7a1fb1")
public static String es_PE_FIELD_Phase_CommitmentIsCeiling_Description="La comisión importe/cantidad es el techo cargable.";

@XendraTrl(Identifier="04c411c5-bff3-ce41-e71c-ebef5f7a1fb1")
public static String es_PE_FIELD_Phase_CommitmentIsCeiling_Help="El importe y la cantidad de la comisión, es el importe y la cantidad máxima que se cargará. No hacer caso, si el importe ó la cantidad es cero.";

@XendraField(AD_Column_ID="IsCommitCeiling",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04c411c5-bff3-ce41-e71c-ebef5f7a1fb1")
public static final String FIELDNAME_Phase_CommitmentIsCeiling="04c411c5-bff3-ce41-e71c-ebef5f7a1fb1";

@XendraTrl(Identifier="1ee7eb5e-6f56-3730-2f7a-6ab04c5e301b")
public static String es_PE_COLUMN_IsCommitCeiling_Name="Compromiso Límite";

@XendraColumn(AD_Element_ID="84c4bef6-505f-8908-6191-e90cf9f12db7",ColumnName="IsCommitCeiling",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ee7eb5e-6f56-3730-2f7a-6ab04c5e301b",
Synchronized="2019-08-30 22:22:09.0")
/** Column name IsCommitCeiling */
public static final String COLUMNNAME_IsCommitCeiling = "IsCommitCeiling";
/** Set Complete.
@param IsComplete It is complete */
public void setIsComplete (boolean IsComplete)
{
set_Value (COLUMNNAME_IsComplete, Boolean.valueOf(IsComplete));
}
/** Get Complete.
@return It is complete */
public boolean isComplete() 
{
Object oo = get_Value(COLUMNNAME_IsComplete);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d6149040-f963-50ac-a4b9-ed1c1e78e18c")
public static String es_PE_FIELD_Phase_Complete_Name="Completo";

@XendraTrl(Identifier="d6149040-f963-50ac-a4b9-ed1c1e78e18c")
public static String es_PE_FIELD_Phase_Complete_Description="Esta completo";

@XendraTrl(Identifier="d6149040-f963-50ac-a4b9-ed1c1e78e18c")
public static String es_PE_FIELD_Phase_Complete_Help="Indica que esta completo.";

@XendraField(AD_Column_ID="IsComplete",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6149040-f963-50ac-a4b9-ed1c1e78e18c")
public static final String FIELDNAME_Phase_Complete="d6149040-f963-50ac-a4b9-ed1c1e78e18c";

@XendraTrl(Identifier="9d920f13-3de8-088c-2550-25dc8bd9cbde")
public static String es_PE_COLUMN_IsComplete_Name="Completo";

@XendraColumn(AD_Element_ID="21e7bef5-031b-47dc-2d6d-fa6a789b02c5",ColumnName="IsComplete",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d920f13-3de8-088c-2550-25dc8bd9cbde",
Synchronized="2019-08-30 22:22:09.0")
/** Column name IsComplete */
public static final String COLUMNNAME_IsComplete = "IsComplete";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1dd2a5ab-cc1f-51ef-18a5-941c380b5f7e")
public static String es_PE_FIELD_Phase_Product_Name="Producto";

@XendraTrl(Identifier="1dd2a5ab-cc1f-51ef-18a5-941c380b5f7e")
public static String es_PE_FIELD_Phase_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="1dd2a5ab-cc1f-51ef-18a5-941c380b5f7e")
public static String es_PE_FIELD_Phase_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ProjInvoiceRule@=P",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1dd2a5ab-cc1f-51ef-18a5-941c380b5f7e")
public static final String FIELDNAME_Phase_Product="1dd2a5ab-cc1f-51ef-18a5-941c380b5f7e";

@XendraTrl(Identifier="79e4cb4c-2877-561c-0104-578e45b13783")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="79e4cb4c-2877-561c-0104-578e45b13783",Synchronized="2019-08-30 22:22:09.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
@XendraTrl(Identifier="14c04de0-bc8a-f8f5-3ab9-0e0c9c7c6794")
public static String es_PE_FIELD_Phase_Name_Name="Nombre";

@XendraTrl(Identifier="14c04de0-bc8a-f8f5-3ab9-0e0c9c7c6794")
public static String es_PE_FIELD_Phase_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="14c04de0-bc8a-f8f5-3ab9-0e0c9c7c6794")
public static String es_PE_FIELD_Phase_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14c04de0-bc8a-f8f5-3ab9-0e0c9c7c6794")
public static final String FIELDNAME_Phase_Name="14c04de0-bc8a-f8f5-3ab9-0e0c9c7c6794";

@XendraTrl(Identifier="86370af8-4db1-8bf4-e0b4-04893d402c11")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86370af8-4db1-8bf4-e0b4-04893d402c11",
Synchronized="2019-08-30 22:22:09.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Planned Amount.
@param PlannedAmt Planned amount for this project */
public void setPlannedAmt (BigDecimal PlannedAmt)
{
if (PlannedAmt == null) throw new IllegalArgumentException ("PlannedAmt is mandatory.");
set_Value (COLUMNNAME_PlannedAmt, PlannedAmt);
}
/** Get Planned Amount.
@return Planned amount for this project */
public BigDecimal getPlannedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4790e854-ac62-81fd-2f87-5c2e5e35e2a9")
public static String es_PE_FIELD_Phase_PlannedAmount_Name="Total Planeado";

@XendraTrl(Identifier="4790e854-ac62-81fd-2f87-5c2e5e35e2a9")
public static String es_PE_FIELD_Phase_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="4790e854-ac62-81fd-2f87-5c2e5e35e2a9")
public static String es_PE_FIELD_Phase_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4790e854-ac62-81fd-2f87-5c2e5e35e2a9")
public static final String FIELDNAME_Phase_PlannedAmount="4790e854-ac62-81fd-2f87-5c2e5e35e2a9";

@XendraTrl(Identifier="c9c1eda3-d201-f021-9b99-8baa74179fff")
public static String es_PE_COLUMN_PlannedAmt_Name="Total Planeado";

@XendraColumn(AD_Element_ID="7d2e668d-1293-27b7-a5ff-85f836dc7388",ColumnName="PlannedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9c1eda3-d201-f021-9b99-8baa74179fff",
Synchronized="2019-08-30 22:22:09.0")
/** Column name PlannedAmt */
public static final String COLUMNNAME_PlannedAmt = "PlannedAmt";
/** Set Unit Price.
@param PriceActual Actual Price  */
public void setPriceActual (BigDecimal PriceActual)
{
set_Value (COLUMNNAME_PriceActual, PriceActual);
}
/** Get Unit Price.
@return Actual Price  */
public BigDecimal getPriceActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="42f063e3-9516-3dff-ba71-582e853e3e0e")
public static String es_PE_FIELD_Phase_UnitPrice_Name="Precio Actual";

@XendraTrl(Identifier="42f063e3-9516-3dff-ba71-582e853e3e0e")
public static String es_PE_FIELD_Phase_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="42f063e3-9516-3dff-ba71-582e853e3e0e")
public static String es_PE_FIELD_Phase_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42f063e3-9516-3dff-ba71-582e853e3e0e")
public static final String FIELDNAME_Phase_UnitPrice="42f063e3-9516-3dff-ba71-582e853e3e0e";

@XendraTrl(Identifier="9c310b0d-139c-455e-ac3e-77fa4d70ceb8")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c310b0d-139c-455e-ac3e-77fa4d70ceb8",
Synchronized="2019-08-30 22:22:09.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";
/** Set Invoice Rule.
@param ProjInvoiceRule Invoice Rule for the project */
public void setProjInvoiceRule (String ProjInvoiceRule)
{
if (ProjInvoiceRule.length() > 1)
{
log.warning("Length > 1 - truncated");
ProjInvoiceRule = ProjInvoiceRule.substring(0,0);
}
set_Value (COLUMNNAME_ProjInvoiceRule, ProjInvoiceRule);
}
/** Get Invoice Rule.
@return Invoice Rule for the project */
public String getProjInvoiceRule() 
{
return (String)get_Value(COLUMNNAME_ProjInvoiceRule);
}

@XendraTrl(Identifier="9ded9fe7-7077-4687-fc38-b07889cf2242")
public static String es_PE_FIELD_Phase_InvoiceRule_Name="Invoice Rule";

@XendraTrl(Identifier="9ded9fe7-7077-4687-fc38-b07889cf2242")
public static String es_PE_FIELD_Phase_InvoiceRule_Description="Invoice Rule for the project";

@XendraTrl(Identifier="9ded9fe7-7077-4687-fc38-b07889cf2242")
public static String es_PE_FIELD_Phase_InvoiceRule_Help="The Invoice Rule for the project determines how orders (and consequently invoices) are created.  The selection on project level can be overwritten on Phase or Task";

@XendraField(AD_Column_ID="ProjInvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ded9fe7-7077-4687-fc38-b07889cf2242")
public static final String FIELDNAME_Phase_InvoiceRule="9ded9fe7-7077-4687-fc38-b07889cf2242";

@XendraTrl(Identifier="3ab2c97b-68e9-1535-c86f-959083f9869b")
public static String es_PE_COLUMN_ProjInvoiceRule_Name="Invoice Rule";

@XendraColumn(AD_Element_ID="01fd82ab-ea43-1c18-3987-72651eee91de",ColumnName="ProjInvoiceRule",
AD_Reference_ID=17,AD_Reference_Value_ID="d99f06b4-e2f5-c1c0-def9-657548c5f17d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="@ProjInvoiceRule@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3ab2c97b-68e9-1535-c86f-959083f9869b",Synchronized="2019-08-30 22:22:10.0")
/** Column name ProjInvoiceRule */
public static final String COLUMNNAME_ProjInvoiceRule = "ProjInvoiceRule";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4c533079-a285-2fb1-7c2e-54f51817cc95")
public static String es_PE_FIELD_Phase_Quantity_Name="Cantidad";

@XendraTrl(Identifier="4c533079-a285-2fb1-7c2e-54f51817cc95")
public static String es_PE_FIELD_Phase_Quantity_Description="Cantidad";

@XendraTrl(Identifier="4c533079-a285-2fb1-7c2e-54f51817cc95")
public static String es_PE_FIELD_Phase_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ProjInvoiceRule@=P",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4c533079-a285-2fb1-7c2e-54f51817cc95")
public static final String FIELDNAME_Phase_Quantity="4c533079-a285-2fb1-7c2e-54f51817cc95";

@XendraTrl(Identifier="b6cc29e6-05af-8526-92f1-a14c0c0b889e")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6cc29e6-05af-8526-92f1-a14c0c0b889e",
Synchronized="2019-08-30 22:22:10.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
}

@XendraTrl(Identifier="1cc6997f-fde3-5d29-4e31-84eeba5fa696")
public static String es_PE_FIELD_Phase_Sequence_Name="Secuencia";

@XendraTrl(Identifier="1cc6997f-fde3-5d29-4e31-84eeba5fa696")
public static String es_PE_FIELD_Phase_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="1cc6997f-fde3-5d29-4e31-84eeba5fa696")
public static String es_PE_FIELD_Phase_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cc6997f-fde3-5d29-4e31-84eeba5fa696")
public static final String FIELDNAME_Phase_Sequence="1cc6997f-fde3-5d29-4e31-84eeba5fa696";

@XendraTrl(Identifier="d29f0676-2877-c120-69af-fbe1bb92d43a")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_ProjectPhase WHERE C_Project_ID=@C_Project_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d29f0676-2877-c120-69af-fbe1bb92d43a",
Synchronized="2019-08-30 22:22:10.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="0061298d-1c7e-7c7d-8dd2-727c8577121e")
public static String es_PE_FIELD_Phase_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="0061298d-1c7e-7c7d-8dd2-727c8577121e")
public static String es_PE_FIELD_Phase_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="0061298d-1c7e-7c7d-8dd2-727c8577121e")
public static String es_PE_FIELD_Phase_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="0db359cc-e99f-0d49-ad6b-16c08ad16da6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0061298d-1c7e-7c7d-8dd2-727c8577121e")
public static final String FIELDNAME_Phase_StartDate="0061298d-1c7e-7c7d-8dd2-727c8577121e";

@XendraTrl(Identifier="48bc27d3-fe8d-117f-7ed1-5a3915895068")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48bc27d3-fe8d-117f-7ed1-5a3915895068",
Synchronized="2019-08-30 22:22:10.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
}
