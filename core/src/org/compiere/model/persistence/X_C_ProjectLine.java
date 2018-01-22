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
/** Generated Model for C_ProjectLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ProjectLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_ProjectLine_ID id
@param trxName transaction
*/
public X_C_ProjectLine (Properties ctx, int C_ProjectLine_ID, String trxName)
{
super (ctx, C_ProjectLine_ID, trxName);
/** if (C_ProjectLine_ID == 0)
{
setC_Project_ID (0);
setC_ProjectLine_ID (0);
setInvoicedAmt (Env.ZERO);	
// 0
setInvoicedQty (Env.ZERO);	
// 0
setIsPrinted (true);	
// Y
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_ProjectLine WHERE C_Project_ID=@C_Project_ID@
setPlannedAmt (Env.ZERO);	
// 0
setPlannedMarginAmt (Env.ZERO);	
// 0
setPlannedPrice (Env.ZERO);
setPlannedQty (Env.ZERO);	
// 1
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ProjectLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=434 */
public static int Table_ID=MTable.getTable_ID("C_ProjectLine");

@XendraTrl(Identifier="f68731fd-8238-8734-88de-e72e1665a036")
public static String es_PE_TAB_TaskLine_Description="Project Lines of Tasks";

@XendraTrl(Identifier="f68731fd-8238-8734-88de-e72e1665a036")
public static String es_PE_TAB_TaskLine_Name="Task Line";

@XendraTrl(Identifier="f68731fd-8238-8734-88de-e72e1665a036")
public static String es_PE_TAB_TaskLine_Help="Maintain Project Lines of Tasks";

@XendraTab(Name="Task Line",Description="Project Lines of Tasks",
Help="Maintain Project Lines of Tasks",AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",
SeqNo=40,TabLevel=3,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="f032f57b-cd3f-381b-548b-b2301bbd3ac1",HasTree=false,
WhereClause="C_ProjectTask_ID > 0",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="@ProjectLineLevel@=T",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="f68731fd-8238-8734-88de-e72e1665a036",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TaskLine="f68731fd-8238-8734-88de-e72e1665a036";

@XendraTrl(Identifier="251de85a-147e-0a05-4520-8935442b760e")
public static String es_PE_TAB_ProjectLine_Description="Maintain Project Lines";

@XendraTrl(Identifier="251de85a-147e-0a05-4520-8935442b760e")
public static String es_PE_TAB_ProjectLine_Name="Project Line";

@XendraTrl(Identifier="251de85a-147e-0a05-4520-8935442b760e")
public static String es_PE_TAB_ProjectLine_Help="Maintain Project Level Lines";

@XendraTab(Name="Project Line",Description="Maintain Project Lines",
Help="Maintain Project Level Lines",AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",SeqNo=15,
TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="de9c40bd-b4e2-e9d8-5450-fb3aded64ce0",HasTree=false,
WhereClause="COALESCE(C_ProjectTask_ID,0)=0 AND COALESCE(C_ProjectPhase_ID,0)=0",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="@ProjectLineLevel@=P",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="251de85a-147e-0a05-4520-8935442b760e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProjectLine="251de85a-147e-0a05-4520-8935442b760e";

@XendraTrl(Identifier="46e099a0-7853-4d55-f3b3-ea67f51b4c3d")
public static String es_PE_TAB_PhaseLine_Description="Project Lines of Phase";

@XendraTrl(Identifier="46e099a0-7853-4d55-f3b3-ea67f51b4c3d")
public static String es_PE_TAB_PhaseLine_Name="Phase Line";

@XendraTrl(Identifier="46e099a0-7853-4d55-f3b3-ea67f51b4c3d")
public static String es_PE_TAB_PhaseLine_Help="Maintain Project Lines on Phase Level";

@XendraTab(Name="Phase Line",Description="Project Lines of Phase",
Help="Maintain Project Lines on Phase Level",AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",
SeqNo=25,TabLevel=2,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="10aed756-f29f-2628-ee45-587465300ccd",HasTree=false,
WhereClause="C_ProjectPhase_ID > 0 AND COALESCE(C_ProjectTask_ID,0)=0",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="@ProjectLineLevel@=A",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PhaseLine="46e099a0-7853-4d55-f3b3-ea67f51b4c3d";

@XendraTrl(Identifier="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9")
public static String es_PE_TAB_Line_Description="Definir Ìtems de Proyecto";

@XendraTrl(Identifier="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9")
public static String es_PE_TAB_Line_Name="Línea";

@XendraTrl(Identifier="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9")
public static String es_PE_TAB_Line_Help="La pestaña Ìtem de Proyecto es usada para definir las líneas (productos y/o servicios) asociadas a este proyecto.";

@XendraTab(Name="Line",Description="Define Project Lines",
Help="The Project Lines Tab is used to define the lines (products and/or services) associated with this Project. This is an alternative to Project Phases. You would use lines, if you do not want to use a Project Type template with phases.",
AD_Window_ID="3d408be2-c806-9eca-e379-2876dfbbec6d",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="@ProjectCategory@!S",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9";

@XendraTrl(Identifier="59e82ec8-59ec-c2a3-e42d-87bcaf919bfc")
public static String es_PE_TABLE_C_ProjectLine_Name="Línea del Proyecto";

@XendraTable(Name="Project Line",Description="Task or step in a project",Help="",
TableName="C_ProjectLine",AccessLevel="3",AD_Window_ID="3d408be2-c806-9eca-e379-2876dfbbec6d",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="59e82ec8-59ec-c2a3-e42d-87bcaf919bfc",Synchronized="2017-08-16 11:42:21.0")
/** TableName=C_ProjectLine */
public static final String Table_Name="C_ProjectLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ProjectLine");

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
    Table_ID = MTable.getTable_ID("C_ProjectLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ProjectLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Committed Amount.
@param CommittedAmt The (legal) commitment amount */
public void setCommittedAmt (BigDecimal CommittedAmt)
{
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

@XendraTrl(Identifier="c08d6046-12a1-7a55-0b71-10c390288564")
public static String es_PE_FIELD_Line_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="c08d6046-12a1-7a55-0b71-10c390288564")
public static String es_PE_FIELD_Line_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="c08d6046-12a1-7a55-0b71-10c390288564")
public static String es_PE_FIELD_Line_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c08d6046-12a1-7a55-0b71-10c390288564")
public static final String FIELDNAME_Line_CommittedAmount="c08d6046-12a1-7a55-0b71-10c390288564";

@XendraTrl(Identifier="8e095e58-bf8f-83af-c970-0797855ae872")
public static String es_PE_FIELD_TaskLine_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="8e095e58-bf8f-83af-c970-0797855ae872")
public static String es_PE_FIELD_TaskLine_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="8e095e58-bf8f-83af-c970-0797855ae872")
public static String es_PE_FIELD_TaskLine_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8e095e58-bf8f-83af-c970-0797855ae872")
public static final String FIELDNAME_TaskLine_CommittedAmount="8e095e58-bf8f-83af-c970-0797855ae872";

@XendraTrl(Identifier="ffab434b-7cb0-4347-d776-a027fe2a5071")
public static String es_PE_FIELD_ProjectLine_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="ffab434b-7cb0-4347-d776-a027fe2a5071")
public static String es_PE_FIELD_ProjectLine_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="ffab434b-7cb0-4347-d776-a027fe2a5071")
public static String es_PE_FIELD_ProjectLine_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ffab434b-7cb0-4347-d776-a027fe2a5071")
public static final String FIELDNAME_ProjectLine_CommittedAmount="ffab434b-7cb0-4347-d776-a027fe2a5071";

@XendraTrl(Identifier="8abb5c14-8c99-9933-19de-b34dd1a8ff47")
public static String es_PE_FIELD_PhaseLine_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="8abb5c14-8c99-9933-19de-b34dd1a8ff47")
public static String es_PE_FIELD_PhaseLine_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="8abb5c14-8c99-9933-19de-b34dd1a8ff47")
public static String es_PE_FIELD_PhaseLine_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8abb5c14-8c99-9933-19de-b34dd1a8ff47")
public static final String FIELDNAME_PhaseLine_CommittedAmount="8abb5c14-8c99-9933-19de-b34dd1a8ff47";

@XendraTrl(Identifier="df9a5535-fc1d-1d62-d8ff-89fa0fc2cd23")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="df9a5535-fc1d-1d62-d8ff-89fa0fc2cd23",
Synchronized="2017-08-05 16:54:17.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";
/** Set Committed Quantity.
@param CommittedQty The (legal) commitment Quantity */
public void setCommittedQty (BigDecimal CommittedQty)
{
set_Value (COLUMNNAME_CommittedQty, CommittedQty);
}
/** Get Committed Quantity.
@return The (legal) commitment Quantity */
public BigDecimal getCommittedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommittedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cb9c1c04-0696-6da1-6e11-c77aa61f13f3")
public static String es_PE_FIELD_Line_CommittedQuantity_Description="La cantidad (legal) cometida ";

@XendraTrl(Identifier="cb9c1c04-0696-6da1-6e11-c77aa61f13f3")
public static String es_PE_FIELD_Line_CommittedQuantity_Help="La cantidad de la comisión es independiente de la cantidad prevista. Usted utilizaría la cantidad prevista para su valoración realista, que pudierán ser más alta ó baja que la cantidad de la comisión.";

@XendraTrl(Identifier="cb9c1c04-0696-6da1-6e11-c77aa61f13f3")
public static String es_PE_FIELD_Line_CommittedQuantity_Name="Cantidad Cometida";

@XendraField(AD_Column_ID="CommittedQty",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cb9c1c04-0696-6da1-6e11-c77aa61f13f3")
public static final String FIELDNAME_Line_CommittedQuantity="cb9c1c04-0696-6da1-6e11-c77aa61f13f3";

@XendraTrl(Identifier="b22d400b-6ad6-c161-2a3c-8b9353b14990")
public static String es_PE_FIELD_TaskLine_CommittedQuantity_Description="La cantidad (legal) cometida ";

@XendraTrl(Identifier="b22d400b-6ad6-c161-2a3c-8b9353b14990")
public static String es_PE_FIELD_TaskLine_CommittedQuantity_Help="La cantidad de la comisión es independiente de la cantidad prevista. Usted utilizaría la cantidad prevista para su valoración realista, que pudierán ser más alta ó baja que la cantidad de la comisión.";

@XendraTrl(Identifier="b22d400b-6ad6-c161-2a3c-8b9353b14990")
public static String es_PE_FIELD_TaskLine_CommittedQuantity_Name="Cantidad Cometida";

@XendraField(AD_Column_ID="CommittedQty",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b22d400b-6ad6-c161-2a3c-8b9353b14990")
public static final String FIELDNAME_TaskLine_CommittedQuantity="b22d400b-6ad6-c161-2a3c-8b9353b14990";

@XendraTrl(Identifier="1eb70050-a32d-ccf8-fe41-13955392cb6d")
public static String es_PE_FIELD_ProjectLine_CommittedQuantity_Description="La cantidad (legal) cometida ";

@XendraTrl(Identifier="1eb70050-a32d-ccf8-fe41-13955392cb6d")
public static String es_PE_FIELD_ProjectLine_CommittedQuantity_Help="La cantidad de la comisión es independiente de la cantidad prevista. Usted utilizaría la cantidad prevista para su valoración realista, que pudierán ser más alta ó baja que la cantidad de la comisión.";

@XendraTrl(Identifier="1eb70050-a32d-ccf8-fe41-13955392cb6d")
public static String es_PE_FIELD_ProjectLine_CommittedQuantity_Name="Cantidad Cometida";

@XendraField(AD_Column_ID="CommittedQty",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1eb70050-a32d-ccf8-fe41-13955392cb6d")
public static final String FIELDNAME_ProjectLine_CommittedQuantity="1eb70050-a32d-ccf8-fe41-13955392cb6d";

@XendraTrl(Identifier="841873c2-22f4-e989-a2fa-978812c6b85b")
public static String es_PE_FIELD_PhaseLine_CommittedQuantity_Description="La cantidad (legal) cometida ";

@XendraTrl(Identifier="841873c2-22f4-e989-a2fa-978812c6b85b")
public static String es_PE_FIELD_PhaseLine_CommittedQuantity_Help="La cantidad de la comisión es independiente de la cantidad prevista. Usted utilizaría la cantidad prevista para su valoración realista, que pudierán ser más alta ó baja que la cantidad de la comisión.";

@XendraTrl(Identifier="841873c2-22f4-e989-a2fa-978812c6b85b")
public static String es_PE_FIELD_PhaseLine_CommittedQuantity_Name="Cantidad Cometida";

@XendraField(AD_Column_ID="CommittedQty",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCommitment@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="841873c2-22f4-e989-a2fa-978812c6b85b")
public static final String FIELDNAME_PhaseLine_CommittedQuantity="841873c2-22f4-e989-a2fa-978812c6b85b";

@XendraTrl(Identifier="6b847f75-6fd8-ce1d-f677-a263a37a2dab")
public static String es_PE_COLUMN_CommittedQty_Name="Cantidad Cometida";

@XendraColumn(AD_Element_ID="ca943d4f-7852-e710-d8eb-028f698c75a5",ColumnName="CommittedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b847f75-6fd8-ce1d-f677-a263a37a2dab",
Synchronized="2017-08-05 16:54:17.0")
/** Column name CommittedQty */
public static final String COLUMNNAME_CommittedQty = "CommittedQty";
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

@XendraTrl(Identifier="cb86bde2-7889-a68d-d116-f186beb1efca")
public static String es_PE_FIELD_Line_Order_Description="Orden de Venta";

@XendraTrl(Identifier="cb86bde2-7889-a68d-d116-f186beb1efca")
public static String es_PE_FIELD_Line_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="cb86bde2-7889-a68d-d116-f186beb1efca")
public static String es_PE_FIELD_Line_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb86bde2-7889-a68d-d116-f186beb1efca")
public static final String FIELDNAME_Line_Order="cb86bde2-7889-a68d-d116-f186beb1efca";

@XendraTrl(Identifier="a766b8ca-e860-29a0-177f-0c15302e410c")
public static String es_PE_FIELD_TaskLine_Order_Description="Orden de Venta";

@XendraTrl(Identifier="a766b8ca-e860-29a0-177f-0c15302e410c")
public static String es_PE_FIELD_TaskLine_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="a766b8ca-e860-29a0-177f-0c15302e410c")
public static String es_PE_FIELD_TaskLine_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a766b8ca-e860-29a0-177f-0c15302e410c")
public static final String FIELDNAME_TaskLine_Order="a766b8ca-e860-29a0-177f-0c15302e410c";

@XendraTrl(Identifier="2a83c746-8a1b-9e8e-b07b-271b2f52daf5")
public static String es_PE_FIELD_ProjectLine_Order_Description="Orden de Venta";

@XendraTrl(Identifier="2a83c746-8a1b-9e8e-b07b-271b2f52daf5")
public static String es_PE_FIELD_ProjectLine_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="2a83c746-8a1b-9e8e-b07b-271b2f52daf5")
public static String es_PE_FIELD_ProjectLine_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a83c746-8a1b-9e8e-b07b-271b2f52daf5")
public static final String FIELDNAME_ProjectLine_Order="2a83c746-8a1b-9e8e-b07b-271b2f52daf5";

@XendraTrl(Identifier="e7bf908d-e3e5-6594-bcce-9d8c02b8f3fc")
public static String es_PE_FIELD_PhaseLine_Order_Description="Orden de Venta";

@XendraTrl(Identifier="e7bf908d-e3e5-6594-bcce-9d8c02b8f3fc")
public static String es_PE_FIELD_PhaseLine_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="e7bf908d-e3e5-6594-bcce-9d8c02b8f3fc")
public static String es_PE_FIELD_PhaseLine_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7bf908d-e3e5-6594-bcce-9d8c02b8f3fc")
public static final String FIELDNAME_PhaseLine_Order="e7bf908d-e3e5-6594-bcce-9d8c02b8f3fc";

@XendraTrl(Identifier="90dfe2f8-f0b9-589e-177d-65db131929b6")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90dfe2f8-f0b9-589e-177d-65db131929b6",
Synchronized="2017-08-05 16:54:18.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

/** C_OrderPO_ID AD_Reference=0dbd9edb-94cc-bd5a-1824-0c6381e7976b */
public static final int C_ORDERPO_ID_AD_Reference_ID=290;
/** Set Purchase Order.
@param C_OrderPO_ID Purchase Order */
public void setC_OrderPO_ID (int C_OrderPO_ID)
{
if (C_OrderPO_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_OrderPO_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_OrderPO_ID, Integer.valueOf(C_OrderPO_ID));
}
/** Get Purchase Order.
@return Purchase Order */
public int getC_OrderPO_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderPO_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5f6784da-9dd8-8cef-04d2-1c21060adaab")
public static String es_PE_FIELD_Line_PurchaseOrder_Description="Orden de Compra";

@XendraTrl(Identifier="5f6784da-9dd8-8cef-04d2-1c21060adaab")
public static String es_PE_FIELD_Line_PurchaseOrder_Name="Orden de Compra";

@XendraField(AD_Column_ID="C_OrderPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f6784da-9dd8-8cef-04d2-1c21060adaab")
public static final String FIELDNAME_Line_PurchaseOrder="5f6784da-9dd8-8cef-04d2-1c21060adaab";

@XendraTrl(Identifier="43f40ad9-42c1-f7dc-ea8e-dbeff88bea30")
public static String es_PE_FIELD_TaskLine_PurchaseOrder_Description="Orden de Compra";

@XendraTrl(Identifier="43f40ad9-42c1-f7dc-ea8e-dbeff88bea30")
public static String es_PE_FIELD_TaskLine_PurchaseOrder_Name="Orden de Compra";

@XendraField(AD_Column_ID="C_OrderPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43f40ad9-42c1-f7dc-ea8e-dbeff88bea30")
public static final String FIELDNAME_TaskLine_PurchaseOrder="43f40ad9-42c1-f7dc-ea8e-dbeff88bea30";

@XendraTrl(Identifier="73367abb-02ca-e487-cc9f-129eec40fd3f")
public static String es_PE_FIELD_ProjectLine_PurchaseOrder_Description="Orden de Compra";

@XendraTrl(Identifier="73367abb-02ca-e487-cc9f-129eec40fd3f")
public static String es_PE_FIELD_ProjectLine_PurchaseOrder_Name="Orden de Compra";

@XendraField(AD_Column_ID="C_OrderPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73367abb-02ca-e487-cc9f-129eec40fd3f")
public static final String FIELDNAME_ProjectLine_PurchaseOrder="73367abb-02ca-e487-cc9f-129eec40fd3f";

@XendraTrl(Identifier="74789518-70e5-40db-852e-ee687d3c4af3")
public static String es_PE_FIELD_PhaseLine_PurchaseOrder_Description="Orden de Compra";

@XendraTrl(Identifier="74789518-70e5-40db-852e-ee687d3c4af3")
public static String es_PE_FIELD_PhaseLine_PurchaseOrder_Name="Orden de Compra";

@XendraField(AD_Column_ID="C_OrderPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74789518-70e5-40db-852e-ee687d3c4af3")
public static final String FIELDNAME_PhaseLine_PurchaseOrder="74789518-70e5-40db-852e-ee687d3c4af3";

@XendraTrl(Identifier="9c116d6c-a867-4233-1c61-d2b2d3b18bd6")
public static String es_PE_COLUMN_C_OrderPO_ID_Name="Orden de Compra";

@XendraColumn(AD_Element_ID="7ab987db-9563-0c8a-3e0a-4739436abeed",ColumnName="C_OrderPO_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="0dbd9edb-94cc-bd5a-1824-0c6381e7976b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9c116d6c-a867-4233-1c61-d2b2d3b18bd6",Synchronized="2017-08-05 16:54:18.0")
/** Column name C_OrderPO_ID */
public static final String COLUMNNAME_C_OrderPO_ID = "C_OrderPO_ID";
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

@XendraTrl(Identifier="bd247795-bd03-43d0-01ee-9491ec216aed")
public static String es_PE_FIELD_Line_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="bd247795-bd03-43d0-01ee-9491ec216aed")
public static String es_PE_FIELD_Line_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="bd247795-bd03-43d0-01ee-9491ec216aed")
public static String es_PE_FIELD_Line_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd247795-bd03-43d0-01ee-9491ec216aed")
public static final String FIELDNAME_Line_Project="bd247795-bd03-43d0-01ee-9491ec216aed";

@XendraTrl(Identifier="faa0639f-73a9-a5fc-e704-cf74447f5217")
public static String es_PE_FIELD_TaskLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="faa0639f-73a9-a5fc-e704-cf74447f5217")
public static String es_PE_FIELD_TaskLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="faa0639f-73a9-a5fc-e704-cf74447f5217")
public static String es_PE_FIELD_TaskLine_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="faa0639f-73a9-a5fc-e704-cf74447f5217")
public static final String FIELDNAME_TaskLine_Project="faa0639f-73a9-a5fc-e704-cf74447f5217";

@XendraTrl(Identifier="5e63021b-7fcb-11e1-a567-1d4f44e64fcc")
public static String es_PE_FIELD_ProjectLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="5e63021b-7fcb-11e1-a567-1d4f44e64fcc")
public static String es_PE_FIELD_ProjectLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="5e63021b-7fcb-11e1-a567-1d4f44e64fcc")
public static String es_PE_FIELD_ProjectLine_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e63021b-7fcb-11e1-a567-1d4f44e64fcc")
public static final String FIELDNAME_ProjectLine_Project="5e63021b-7fcb-11e1-a567-1d4f44e64fcc";

@XendraTrl(Identifier="1f366487-da69-25b5-b787-2c85d58d7534")
public static String es_PE_FIELD_PhaseLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="1f366487-da69-25b5-b787-2c85d58d7534")
public static String es_PE_FIELD_PhaseLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="1f366487-da69-25b5-b787-2c85d58d7534")
public static String es_PE_FIELD_PhaseLine_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f366487-da69-25b5-b787-2c85d58d7534")
public static final String FIELDNAME_PhaseLine_Project="1f366487-da69-25b5-b787-2c85d58d7534";

@XendraTrl(Identifier="de9c40bd-b4e2-e9d8-5450-fb3aded64ce0")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de9c40bd-b4e2-e9d8-5450-fb3aded64ce0",
Synchronized="2017-08-05 16:54:18.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Issue.
@param C_ProjectIssue_ID Project Issues (Material, Labor) */
public void setC_ProjectIssue_ID (int C_ProjectIssue_ID)
{
if (C_ProjectIssue_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectIssue_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectIssue_ID, Integer.valueOf(C_ProjectIssue_ID));
}
/** Get Project Issue.
@return Project Issues (Material, Labor) */
public int getC_ProjectIssue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectIssue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93850eec-8426-9a36-a6f7-e2e171e2b926")
public static String es_PE_FIELD_Line_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="93850eec-8426-9a36-a6f7-e2e171e2b926")
public static String es_PE_FIELD_Line_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="93850eec-8426-9a36-a6f7-e2e171e2b926")
public static String es_PE_FIELD_Line_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93850eec-8426-9a36-a6f7-e2e171e2b926")
public static final String FIELDNAME_Line_ProjectIssue="93850eec-8426-9a36-a6f7-e2e171e2b926";

@XendraTrl(Identifier="2fed42d6-f9a7-247e-ea84-90a346ef60d7")
public static String es_PE_FIELD_TaskLine_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="2fed42d6-f9a7-247e-ea84-90a346ef60d7")
public static String es_PE_FIELD_TaskLine_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="2fed42d6-f9a7-247e-ea84-90a346ef60d7")
public static String es_PE_FIELD_TaskLine_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2fed42d6-f9a7-247e-ea84-90a346ef60d7")
public static final String FIELDNAME_TaskLine_ProjectIssue="2fed42d6-f9a7-247e-ea84-90a346ef60d7";

@XendraTrl(Identifier="3d8f1ffa-1f5a-f998-3a2a-978aca96ef42")
public static String es_PE_FIELD_ProjectLine_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="3d8f1ffa-1f5a-f998-3a2a-978aca96ef42")
public static String es_PE_FIELD_ProjectLine_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="3d8f1ffa-1f5a-f998-3a2a-978aca96ef42")
public static String es_PE_FIELD_ProjectLine_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d8f1ffa-1f5a-f998-3a2a-978aca96ef42")
public static final String FIELDNAME_ProjectLine_ProjectIssue="3d8f1ffa-1f5a-f998-3a2a-978aca96ef42";

@XendraTrl(Identifier="e78b35e5-e5b5-f819-3bc8-758887021b3e")
public static String es_PE_FIELD_PhaseLine_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="e78b35e5-e5b5-f819-3bc8-758887021b3e")
public static String es_PE_FIELD_PhaseLine_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="e78b35e5-e5b5-f819-3bc8-758887021b3e")
public static String es_PE_FIELD_PhaseLine_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e78b35e5-e5b5-f819-3bc8-758887021b3e")
public static final String FIELDNAME_PhaseLine_ProjectIssue="e78b35e5-e5b5-f819-3bc8-758887021b3e";

@XendraTrl(Identifier="4e14a21d-168a-9e22-0abc-41f616407888")
public static String es_PE_COLUMN_C_ProjectIssue_ID_Name="Asunto del Proyecto";

@XendraColumn(AD_Element_ID="6c6aa911-79e0-a8ca-00de-c0e2aa4fd667",ColumnName="C_ProjectIssue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e14a21d-168a-9e22-0abc-41f616407888",
Synchronized="2017-08-05 16:54:18.0")
/** Column name C_ProjectIssue_ID */
public static final String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
/** Set Project Line.
@param C_ProjectLine_ID Task or step in a project */
public void setC_ProjectLine_ID (int C_ProjectLine_ID)
{
if (C_ProjectLine_ID < 1) throw new IllegalArgumentException ("C_ProjectLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ProjectLine_ID, Integer.valueOf(C_ProjectLine_ID));
}
/** Get Project Line.
@return Task or step in a project */
public int getC_ProjectLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2b0bce6-832d-5d11-0102-f44fa1037402")
public static String es_PE_FIELD_Line_ProjectLine_Description="Tarea ó paso en un proyecto.";

@XendraTrl(Identifier="c2b0bce6-832d-5d11-0102-f44fa1037402")
public static String es_PE_FIELD_Line_ProjectLine_Help="Indica un Item único del proyecto.";

@XendraTrl(Identifier="c2b0bce6-832d-5d11-0102-f44fa1037402")
public static String es_PE_FIELD_Line_ProjectLine_Name="Item del Proyecto";

@XendraField(AD_Column_ID="C_ProjectLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2b0bce6-832d-5d11-0102-f44fa1037402")
public static final String FIELDNAME_Line_ProjectLine="c2b0bce6-832d-5d11-0102-f44fa1037402";

@XendraTrl(Identifier="c5015d76-5cd0-3792-0913-0042db4f9782")
public static String es_PE_FIELD_TaskLine_ProjectLine_Description="Tarea ó paso en un proyecto.";

@XendraTrl(Identifier="c5015d76-5cd0-3792-0913-0042db4f9782")
public static String es_PE_FIELD_TaskLine_ProjectLine_Help="Indica un Item único del proyecto.";

@XendraTrl(Identifier="c5015d76-5cd0-3792-0913-0042db4f9782")
public static String es_PE_FIELD_TaskLine_ProjectLine_Name="Item del Proyecto";

@XendraField(AD_Column_ID="C_ProjectLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5015d76-5cd0-3792-0913-0042db4f9782")
public static final String FIELDNAME_TaskLine_ProjectLine="c5015d76-5cd0-3792-0913-0042db4f9782";

@XendraTrl(Identifier="a1c92dff-e72e-6065-0e8b-a787ef9bd750")
public static String es_PE_FIELD_ProjectLine_ProjectLine_Description="Tarea ó paso en un proyecto.";

@XendraTrl(Identifier="a1c92dff-e72e-6065-0e8b-a787ef9bd750")
public static String es_PE_FIELD_ProjectLine_ProjectLine_Help="Indica un Item único del proyecto.";

@XendraTrl(Identifier="a1c92dff-e72e-6065-0e8b-a787ef9bd750")
public static String es_PE_FIELD_ProjectLine_ProjectLine_Name="Item del Proyecto";

@XendraField(AD_Column_ID="C_ProjectLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1c92dff-e72e-6065-0e8b-a787ef9bd750")
public static final String FIELDNAME_ProjectLine_ProjectLine="a1c92dff-e72e-6065-0e8b-a787ef9bd750";

@XendraTrl(Identifier="9bf6d852-63d7-25ea-4f14-97e34b2baec3")
public static String es_PE_FIELD_PhaseLine_ProjectLine_Description="Tarea ó paso en un proyecto.";

@XendraTrl(Identifier="9bf6d852-63d7-25ea-4f14-97e34b2baec3")
public static String es_PE_FIELD_PhaseLine_ProjectLine_Help="Indica un Item único del proyecto.";

@XendraTrl(Identifier="9bf6d852-63d7-25ea-4f14-97e34b2baec3")
public static String es_PE_FIELD_PhaseLine_ProjectLine_Name="Item del Proyecto";

@XendraField(AD_Column_ID="C_ProjectLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bf6d852-63d7-25ea-4f14-97e34b2baec3")
public static final String FIELDNAME_PhaseLine_ProjectLine="9bf6d852-63d7-25ea-4f14-97e34b2baec3";
/** Column name C_ProjectLine_ID */
public static final String COLUMNNAME_C_ProjectLine_ID = "C_ProjectLine_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_Value (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0b46f4cd-228e-3ea1-3b01-27e50f1f1b14")
public static String es_PE_FIELD_Line_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="0b46f4cd-228e-3ea1-3b01-27e50f1f1b14")
public static String es_PE_FIELD_Line_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b46f4cd-228e-3ea1-3b01-27e50f1f1b14")
public static final String FIELDNAME_Line_ProjectPhase="0b46f4cd-228e-3ea1-3b01-27e50f1f1b14";

@XendraTrl(Identifier="421ce297-e2bb-3c94-e249-545ba7a480e7")
public static String es_PE_FIELD_TaskLine_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="421ce297-e2bb-3c94-e249-545ba7a480e7")
public static String es_PE_FIELD_TaskLine_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="421ce297-e2bb-3c94-e249-545ba7a480e7")
public static final String FIELDNAME_TaskLine_ProjectPhase="421ce297-e2bb-3c94-e249-545ba7a480e7";

@XendraTrl(Identifier="4e79f81a-f98c-02b5-88de-bfe30839932e")
public static String es_PE_FIELD_ProjectLine_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="4e79f81a-f98c-02b5-88de-bfe30839932e")
public static String es_PE_FIELD_ProjectLine_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e79f81a-f98c-02b5-88de-bfe30839932e")
public static final String FIELDNAME_ProjectLine_ProjectPhase="4e79f81a-f98c-02b5-88de-bfe30839932e";

@XendraTrl(Identifier="6fa486d9-99e1-ed7f-4486-b70e072cbb48")
public static String es_PE_FIELD_PhaseLine_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="6fa486d9-99e1-ed7f-4486-b70e072cbb48")
public static String es_PE_FIELD_PhaseLine_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fa486d9-99e1-ed7f-4486-b70e072cbb48")
public static final String FIELDNAME_PhaseLine_ProjectPhase="6fa486d9-99e1-ed7f-4486-b70e072cbb48";

@XendraTrl(Identifier="10aed756-f29f-2628-ee45-587465300ccd")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="69e5a46c-92d0-8660-9d0d-a7f1b354e9b9",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10aed756-f29f-2628-ee45-587465300ccd",Synchronized="2017-08-05 16:54:18.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_Value (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0be5e603-f885-f5b8-d63f-0e448f1008ee")
public static String es_PE_FIELD_Line_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="0be5e603-f885-f5b8-d63f-0e448f1008ee")
public static String es_PE_FIELD_Line_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="0be5e603-f885-f5b8-d63f-0e448f1008ee")
public static String es_PE_FIELD_Line_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0be5e603-f885-f5b8-d63f-0e448f1008ee")
public static final String FIELDNAME_Line_ProjectTask="0be5e603-f885-f5b8-d63f-0e448f1008ee";

@XendraTrl(Identifier="b527c475-28f7-8c54-ed11-ddce03ecf3a5")
public static String es_PE_FIELD_TaskLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="b527c475-28f7-8c54-ed11-ddce03ecf3a5")
public static String es_PE_FIELD_TaskLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="b527c475-28f7-8c54-ed11-ddce03ecf3a5")
public static String es_PE_FIELD_TaskLine_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b527c475-28f7-8c54-ed11-ddce03ecf3a5")
public static final String FIELDNAME_TaskLine_ProjectTask="b527c475-28f7-8c54-ed11-ddce03ecf3a5";

@XendraTrl(Identifier="5e00bc3c-c609-ddab-fe5a-28556cd5f6ce")
public static String es_PE_FIELD_ProjectLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="5e00bc3c-c609-ddab-fe5a-28556cd5f6ce")
public static String es_PE_FIELD_ProjectLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="5e00bc3c-c609-ddab-fe5a-28556cd5f6ce")
public static String es_PE_FIELD_ProjectLine_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e00bc3c-c609-ddab-fe5a-28556cd5f6ce")
public static final String FIELDNAME_ProjectLine_ProjectTask="5e00bc3c-c609-ddab-fe5a-28556cd5f6ce";

@XendraTrl(Identifier="3f5bedd8-8d2a-6303-46c8-ee921ece1f0d")
public static String es_PE_FIELD_PhaseLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="3f5bedd8-8d2a-6303-46c8-ee921ece1f0d")
public static String es_PE_FIELD_PhaseLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="3f5bedd8-8d2a-6303-46c8-ee921ece1f0d")
public static String es_PE_FIELD_PhaseLine_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f5bedd8-8d2a-6303-46c8-ee921ece1f0d")
public static final String FIELDNAME_PhaseLine_ProjectTask="3f5bedd8-8d2a-6303-46c8-ee921ece1f0d";

@XendraTrl(Identifier="f032f57b-cd3f-381b-548b-b2301bbd3ac1")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="53906434-74e2-0844-02ba-0367c21ac60c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f032f57b-cd3f-381b-548b-b2301bbd3ac1",Synchronized="2017-08-05 16:54:18.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
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

@XendraTrl(Identifier="5f3cfd23-e65e-a416-a5db-99c648f89bad")
public static String es_PE_FIELD_Line_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="5f3cfd23-e65e-a416-a5db-99c648f89bad")
public static String es_PE_FIELD_Line_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="5f3cfd23-e65e-a416-a5db-99c648f89bad")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f3cfd23-e65e-a416-a5db-99c648f89bad")
public static final String FIELDNAME_Line_Description="5f3cfd23-e65e-a416-a5db-99c648f89bad";

@XendraTrl(Identifier="830c8688-ba43-d316-151d-ee842ea9037f")
public static String es_PE_FIELD_TaskLine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="830c8688-ba43-d316-151d-ee842ea9037f")
public static String es_PE_FIELD_TaskLine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="830c8688-ba43-d316-151d-ee842ea9037f")
public static String es_PE_FIELD_TaskLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="830c8688-ba43-d316-151d-ee842ea9037f")
public static final String FIELDNAME_TaskLine_Description="830c8688-ba43-d316-151d-ee842ea9037f";

@XendraTrl(Identifier="fe32328d-43b7-1e69-f313-a02c05dff52e")
public static String es_PE_FIELD_ProjectLine_Description_Description="Observación";

@XendraTrl(Identifier="fe32328d-43b7-1e69-f313-a02c05dff52e")
public static String es_PE_FIELD_ProjectLine_Description_Help="Observación";

@XendraTrl(Identifier="fe32328d-43b7-1e69-f313-a02c05dff52e")
public static String es_PE_FIELD_ProjectLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe32328d-43b7-1e69-f313-a02c05dff52e")
public static final String FIELDNAME_ProjectLine_Description="fe32328d-43b7-1e69-f313-a02c05dff52e";

@XendraTrl(Identifier="ddf68554-495c-08c6-10d2-7044ece6ebd1")
public static String es_PE_FIELD_PhaseLine_Description_Description="Observación";

@XendraTrl(Identifier="ddf68554-495c-08c6-10d2-7044ece6ebd1")
public static String es_PE_FIELD_PhaseLine_Description_Help="Observación";

@XendraTrl(Identifier="ddf68554-495c-08c6-10d2-7044ece6ebd1")
public static String es_PE_FIELD_PhaseLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddf68554-495c-08c6-10d2-7044ece6ebd1")
public static final String FIELDNAME_PhaseLine_Description="ddf68554-495c-08c6-10d2-7044ece6ebd1";

@XendraTrl(Identifier="c0f469a8-a541-92f5-2ff3-02a7d8c73a03")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0f469a8-a541-92f5-2ff3-02a7d8c73a03",
Synchronized="2017-08-05 16:54:18.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Pricing.
@param DoPricing Pricing */
public void setDoPricing (String DoPricing)
{
if (DoPricing != null && DoPricing.length() > 1)
{
log.warning("Length > 1 - truncated");
DoPricing = DoPricing.substring(0,0);
}
set_Value (COLUMNNAME_DoPricing, DoPricing);
}
/** Get Pricing.
@return Pricing */
public String getDoPricing() 
{
return (String)get_Value(COLUMNNAME_DoPricing);
}

@XendraTrl(Identifier="adc79cbf-726c-2348-aa59-baeaa7760a2c")
public static String es_PE_FIELD_Line_Pricing_Description="Obtener Precio para una Linea de Proyecto Basado en una lista de Precios del Proyecto";

@XendraTrl(Identifier="adc79cbf-726c-2348-aa59-baeaa7760a2c")
public static String es_PE_FIELD_Line_Pricing_Name="Obtener Precio";

@XendraField(AD_Column_ID="DoPricing",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adc79cbf-726c-2348-aa59-baeaa7760a2c")
public static final String FIELDNAME_Line_Pricing="adc79cbf-726c-2348-aa59-baeaa7760a2c";

@XendraTrl(Identifier="6f98fbec-894b-cae1-1d49-32ec9a97f099")
public static String es_PE_FIELD_TaskLine_Pricing_Description="Obtener Precio para una Linea de Proyecto Basado en una lista de Precios del Proyecto";

@XendraTrl(Identifier="6f98fbec-894b-cae1-1d49-32ec9a97f099")
public static String es_PE_FIELD_TaskLine_Pricing_Name="Obtener Precio";

@XendraField(AD_Column_ID="DoPricing",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f98fbec-894b-cae1-1d49-32ec9a97f099")
public static final String FIELDNAME_TaskLine_Pricing="6f98fbec-894b-cae1-1d49-32ec9a97f099";

@XendraTrl(Identifier="d579ea88-12d8-df74-5f19-08645e61f40d")
public static String es_PE_FIELD_ProjectLine_Pricing_Description="Obtener Precio para una Linea de Proyecto Basado en una lista de Precios del Proyecto";

@XendraTrl(Identifier="d579ea88-12d8-df74-5f19-08645e61f40d")
public static String es_PE_FIELD_ProjectLine_Pricing_Name="Obtener Precio";

@XendraField(AD_Column_ID="DoPricing",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d579ea88-12d8-df74-5f19-08645e61f40d")
public static final String FIELDNAME_ProjectLine_Pricing="d579ea88-12d8-df74-5f19-08645e61f40d";

@XendraTrl(Identifier="9e98f8d6-18f6-2bd1-3bcf-55606cad9afb")
public static String es_PE_FIELD_PhaseLine_Pricing_Description="Obtener Precio para una Linea de Proyecto Basado en una lista de Precios del Proyecto";

@XendraTrl(Identifier="9e98f8d6-18f6-2bd1-3bcf-55606cad9afb")
public static String es_PE_FIELD_PhaseLine_Pricing_Name="Obtener Precio";

@XendraField(AD_Column_ID="DoPricing",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e98f8d6-18f6-2bd1-3bcf-55606cad9afb")
public static final String FIELDNAME_PhaseLine_Pricing="9e98f8d6-18f6-2bd1-3bcf-55606cad9afb";

@XendraTrl(Identifier="0897e307-e8eb-b044-69e4-d02b34283cf5")
public static String es_PE_COLUMN_DoPricing_Name="Fijación";

@XendraColumn(AD_Element_ID="7ba9f838-b3b3-9a7b-549e-9e5e1cdc131b",ColumnName="DoPricing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="6f0f24cd-5b19-08e0-ed75-fb765d53938c",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0897e307-e8eb-b044-69e4-d02b34283cf5",Synchronized="2017-08-05 16:54:18.0")
/** Column name DoPricing */
public static final String COLUMNNAME_DoPricing = "DoPricing";
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
@XendraTrl(Identifier="ce7ba276-3db7-42b3-ae3f-c6b15e857d9d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce7ba276-3db7-42b3-ae3f-c6b15e857d9d",
Synchronized="2017-08-05 16:54:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoiced Amount.
@param InvoicedAmt The amount invoiced */
public void setInvoicedAmt (BigDecimal InvoicedAmt)
{
if (InvoicedAmt == null) throw new IllegalArgumentException ("InvoicedAmt is mandatory.");
set_Value (COLUMNNAME_InvoicedAmt, InvoicedAmt);
}
/** Get Invoiced Amount.
@return The amount invoiced */
public BigDecimal getInvoicedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1ac714ac-4998-6ba9-22fa-289464f0912e")
public static String es_PE_FIELD_Line_InvoicedAmount_Description="La cuenta facturada";

@XendraTrl(Identifier="1ac714ac-4998-6ba9-22fa-289464f0912e")
public static String es_PE_FIELD_Line_InvoicedAmount_Help="La cuenta facturada";

@XendraTrl(Identifier="1ac714ac-4998-6ba9-22fa-289464f0912e")
public static String es_PE_FIELD_Line_InvoicedAmount_Name="Cuenta Facturada";

@XendraField(AD_Column_ID="InvoicedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ac714ac-4998-6ba9-22fa-289464f0912e")
public static final String FIELDNAME_Line_InvoicedAmount="1ac714ac-4998-6ba9-22fa-289464f0912e";

@XendraTrl(Identifier="f30fde0f-4c8c-4d8d-2f80-e90f6bb3701d")
public static String es_PE_FIELD_TaskLine_InvoicedAmount_Description="La cuenta facturada";

@XendraTrl(Identifier="f30fde0f-4c8c-4d8d-2f80-e90f6bb3701d")
public static String es_PE_FIELD_TaskLine_InvoicedAmount_Help="La cuenta facturada";

@XendraTrl(Identifier="f30fde0f-4c8c-4d8d-2f80-e90f6bb3701d")
public static String es_PE_FIELD_TaskLine_InvoicedAmount_Name="Cuenta Facturada";

@XendraField(AD_Column_ID="InvoicedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f30fde0f-4c8c-4d8d-2f80-e90f6bb3701d")
public static final String FIELDNAME_TaskLine_InvoicedAmount="f30fde0f-4c8c-4d8d-2f80-e90f6bb3701d";

@XendraTrl(Identifier="bd09ae6e-37f8-d3bd-9d96-eb60ca185a8b")
public static String es_PE_FIELD_ProjectLine_InvoicedAmount_Description="La cuenta facturada";

@XendraTrl(Identifier="bd09ae6e-37f8-d3bd-9d96-eb60ca185a8b")
public static String es_PE_FIELD_ProjectLine_InvoicedAmount_Help="La cuenta facturada";

@XendraTrl(Identifier="bd09ae6e-37f8-d3bd-9d96-eb60ca185a8b")
public static String es_PE_FIELD_ProjectLine_InvoicedAmount_Name="Cuenta Facturada";

@XendraField(AD_Column_ID="InvoicedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd09ae6e-37f8-d3bd-9d96-eb60ca185a8b")
public static final String FIELDNAME_ProjectLine_InvoicedAmount="bd09ae6e-37f8-d3bd-9d96-eb60ca185a8b";

@XendraTrl(Identifier="08087e94-f0f4-c53a-b327-861e1d1f8d4b")
public static String es_PE_FIELD_PhaseLine_InvoicedAmount_Description="La cuenta facturada";

@XendraTrl(Identifier="08087e94-f0f4-c53a-b327-861e1d1f8d4b")
public static String es_PE_FIELD_PhaseLine_InvoicedAmount_Help="La cuenta facturada";

@XendraTrl(Identifier="08087e94-f0f4-c53a-b327-861e1d1f8d4b")
public static String es_PE_FIELD_PhaseLine_InvoicedAmount_Name="Cuenta Facturada";

@XendraField(AD_Column_ID="InvoicedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08087e94-f0f4-c53a-b327-861e1d1f8d4b")
public static final String FIELDNAME_PhaseLine_InvoicedAmount="08087e94-f0f4-c53a-b327-861e1d1f8d4b";

@XendraTrl(Identifier="8afd255c-a3f6-534d-5427-9881c489f3de")
public static String es_PE_COLUMN_InvoicedAmt_Name="Cuenta Facturada";

@XendraColumn(AD_Element_ID="e31ccacf-d322-b66d-1d03-702dced2cbb8",ColumnName="InvoicedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8afd255c-a3f6-534d-5427-9881c489f3de",
Synchronized="2017-08-05 16:54:18.0")
/** Column name InvoicedAmt */
public static final String COLUMNNAME_InvoicedAmt = "InvoicedAmt";
/** Set Quantity Invoiced .
@param InvoicedQty The quantity invoiced */
public void setInvoicedQty (BigDecimal InvoicedQty)
{
if (InvoicedQty == null) throw new IllegalArgumentException ("InvoicedQty is mandatory.");
set_Value (COLUMNNAME_InvoicedQty, InvoicedQty);
}
/** Get Quantity Invoiced .
@return The quantity invoiced */
public BigDecimal getInvoicedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="51c1b23e-540f-e7ef-3163-98c62de79ad1")
public static String es_PE_FIELD_Line_QuantityInvoiced_Description="La Cantidad Facturada";

@XendraTrl(Identifier="51c1b23e-540f-e7ef-3163-98c62de79ad1")
public static String es_PE_FIELD_Line_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="InvoicedQty",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51c1b23e-540f-e7ef-3163-98c62de79ad1")
public static final String FIELDNAME_Line_QuantityInvoiced="51c1b23e-540f-e7ef-3163-98c62de79ad1";

@XendraTrl(Identifier="bd77290c-01e2-e423-be86-e82487fad167")
public static String es_PE_FIELD_TaskLine_QuantityInvoiced_Description="La Cantidad Facturada";

@XendraTrl(Identifier="bd77290c-01e2-e423-be86-e82487fad167")
public static String es_PE_FIELD_TaskLine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="InvoicedQty",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd77290c-01e2-e423-be86-e82487fad167")
public static final String FIELDNAME_TaskLine_QuantityInvoiced="bd77290c-01e2-e423-be86-e82487fad167";

@XendraTrl(Identifier="fb874706-b150-9fee-21a4-aa65c48a6adb")
public static String es_PE_FIELD_ProjectLine_QuantityInvoiced_Description="La Cantidad Facturada";

@XendraTrl(Identifier="fb874706-b150-9fee-21a4-aa65c48a6adb")
public static String es_PE_FIELD_ProjectLine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="InvoicedQty",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb874706-b150-9fee-21a4-aa65c48a6adb")
public static final String FIELDNAME_ProjectLine_QuantityInvoiced="fb874706-b150-9fee-21a4-aa65c48a6adb";

@XendraTrl(Identifier="410ab0cb-0216-cf7b-da80-382f31004f24")
public static String es_PE_FIELD_PhaseLine_QuantityInvoiced_Description="La Cantidad Facturada";

@XendraTrl(Identifier="410ab0cb-0216-cf7b-da80-382f31004f24")
public static String es_PE_FIELD_PhaseLine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="InvoicedQty",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="410ab0cb-0216-cf7b-da80-382f31004f24")
public static final String FIELDNAME_PhaseLine_QuantityInvoiced="410ab0cb-0216-cf7b-da80-382f31004f24";

@XendraTrl(Identifier="c623c8ad-62c6-af08-04c9-d0d552e7e40f")
public static String es_PE_COLUMN_InvoicedQty_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="2b11e63f-05c2-ba1b-c83e-4ba51253ea7f",ColumnName="InvoicedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c623c8ad-62c6-af08-04c9-d0d552e7e40f",
Synchronized="2017-08-05 16:54:18.0")
/** Column name InvoicedQty */
public static final String COLUMNNAME_InvoicedQty = "InvoicedQty";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8a896b92-f32f-f723-afec-806d44ea0cb8")
public static String es_PE_FIELD_Line_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="8a896b92-f32f-f723-afec-806d44ea0cb8")
public static String es_PE_FIELD_Line_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="8a896b92-f32f-f723-afec-806d44ea0cb8")
public static String es_PE_FIELD_Line_Printed_Name="Impreso";
@XendraField(AD_Column_ID="IsPrinted",
IsCentrallyMaintained=true,AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8a896b92-f32f-f723-afec-806d44ea0cb8")
public static final String FIELDNAME_Line_Printed="8a896b92-f32f-f723-afec-806d44ea0cb8";

@XendraTrl(Identifier="5fa84894-d7a7-e8f8-7aab-0d6d58ee6dd8")
public static String es_PE_FIELD_TaskLine_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="5fa84894-d7a7-e8f8-7aab-0d6d58ee6dd8")
public static String es_PE_FIELD_TaskLine_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="5fa84894-d7a7-e8f8-7aab-0d6d58ee6dd8")
public static String es_PE_FIELD_TaskLine_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fa84894-d7a7-e8f8-7aab-0d6d58ee6dd8")
public static final String FIELDNAME_TaskLine_Printed="5fa84894-d7a7-e8f8-7aab-0d6d58ee6dd8";

@XendraTrl(Identifier="09d982fd-c105-1572-773e-ce4146df992b")
public static String es_PE_FIELD_ProjectLine_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="09d982fd-c105-1572-773e-ce4146df992b")
public static String es_PE_FIELD_ProjectLine_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="09d982fd-c105-1572-773e-ce4146df992b")
public static String es_PE_FIELD_ProjectLine_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09d982fd-c105-1572-773e-ce4146df992b")
public static final String FIELDNAME_ProjectLine_Printed="09d982fd-c105-1572-773e-ce4146df992b";

@XendraTrl(Identifier="5f920273-9717-1dba-5fcd-a4bf71868d54")
public static String es_PE_FIELD_PhaseLine_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="5f920273-9717-1dba-5fcd-a4bf71868d54")
public static String es_PE_FIELD_PhaseLine_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="5f920273-9717-1dba-5fcd-a4bf71868d54")
public static String es_PE_FIELD_PhaseLine_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f920273-9717-1dba-5fcd-a4bf71868d54")
public static final String FIELDNAME_PhaseLine_Printed="5f920273-9717-1dba-5fcd-a4bf71868d54";

@XendraTrl(Identifier="dac3e002-c522-5234-c4d1-b923d5b907bf")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dac3e002-c522-5234-c4d1-b923d5b907bf",
Synchronized="2017-08-05 16:54:18.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="36d874bf-c51d-9420-4c16-35cb05df3714")
public static String es_PE_FIELD_Line_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="36d874bf-c51d-9420-4c16-35cb05df3714")
public static String es_PE_FIELD_Line_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="36d874bf-c51d-9420-4c16-35cb05df3714")
public static String es_PE_FIELD_Line_LineNo_Name="No. Línea";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="36d874bf-c51d-9420-4c16-35cb05df3714")
public static final String FIELDNAME_Line_LineNo="36d874bf-c51d-9420-4c16-35cb05df3714";

@XendraTrl(Identifier="fa7accad-b5de-ed2a-b016-6141dffc707c")
public static String es_PE_FIELD_TaskLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="fa7accad-b5de-ed2a-b016-6141dffc707c")
public static String es_PE_FIELD_TaskLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="fa7accad-b5de-ed2a-b016-6141dffc707c")
public static String es_PE_FIELD_TaskLine_LineNo_Name="No. Línea";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fa7accad-b5de-ed2a-b016-6141dffc707c")
public static final String FIELDNAME_TaskLine_LineNo="fa7accad-b5de-ed2a-b016-6141dffc707c";

@XendraTrl(Identifier="207308e5-3c98-47d2-c7d9-6538624457ca")
public static String es_PE_FIELD_ProjectLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="207308e5-3c98-47d2-c7d9-6538624457ca")
public static String es_PE_FIELD_ProjectLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="207308e5-3c98-47d2-c7d9-6538624457ca")
public static String es_PE_FIELD_ProjectLine_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="207308e5-3c98-47d2-c7d9-6538624457ca")
public static final String FIELDNAME_ProjectLine_LineNo="207308e5-3c98-47d2-c7d9-6538624457ca";

@XendraTrl(Identifier="e65f434e-d7f2-981a-9e6d-5a6113078859")
public static String es_PE_FIELD_PhaseLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="e65f434e-d7f2-981a-9e6d-5a6113078859")
public static String es_PE_FIELD_PhaseLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="e65f434e-d7f2-981a-9e6d-5a6113078859")
public static String es_PE_FIELD_PhaseLine_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e65f434e-d7f2-981a-9e6d-5a6113078859")
public static final String FIELDNAME_PhaseLine_LineNo="e65f434e-d7f2-981a-9e6d-5a6113078859";

@XendraTrl(Identifier="3f0e77ce-2e0c-b27d-35ba-69614602ce02")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_ProjectLine WHERE C_Project_ID=@C_Project_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f0e77ce-2e0c-b27d-35ba-69614602ce02",
Synchronized="2017-08-05 16:54:18.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID <= 0) set_Value (COLUMNNAME_M_Product_Category_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1d1cc3aa-4815-747d-1899-6a451528867f")
public static String es_PE_FIELD_Line_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="1d1cc3aa-4815-747d-1899-6a451528867f")
public static String es_PE_FIELD_Line_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="1d1cc3aa-4815-747d-1899-6a451528867f")
public static String es_PE_FIELD_Line_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@M_Product_ID@=0",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1d1cc3aa-4815-747d-1899-6a451528867f")
public static final String FIELDNAME_Line_ProductCategory="1d1cc3aa-4815-747d-1899-6a451528867f";

@XendraTrl(Identifier="a4ba1877-b8b3-3314-df5b-0e4af399ce59")
public static String es_PE_FIELD_TaskLine_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="a4ba1877-b8b3-3314-df5b-0e4af399ce59")
public static String es_PE_FIELD_TaskLine_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="a4ba1877-b8b3-3314-df5b-0e4af399ce59")
public static String es_PE_FIELD_TaskLine_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@M_Product_ID@=0",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a4ba1877-b8b3-3314-df5b-0e4af399ce59")
public static final String FIELDNAME_TaskLine_ProductCategory="a4ba1877-b8b3-3314-df5b-0e4af399ce59";

@XendraTrl(Identifier="3e5da5ca-6342-cf36-7386-1eb035c207d0")
public static String es_PE_FIELD_ProjectLine_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="3e5da5ca-6342-cf36-7386-1eb035c207d0")
public static String es_PE_FIELD_ProjectLine_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="3e5da5ca-6342-cf36-7386-1eb035c207d0")
public static String es_PE_FIELD_ProjectLine_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@M_Product_ID@=0",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3e5da5ca-6342-cf36-7386-1eb035c207d0")
public static final String FIELDNAME_ProjectLine_ProductCategory="3e5da5ca-6342-cf36-7386-1eb035c207d0";

@XendraTrl(Identifier="bd3da62f-a753-dd25-97b4-6d1eb48190d0")
public static String es_PE_FIELD_PhaseLine_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="bd3da62f-a753-dd25-97b4-6d1eb48190d0")
public static String es_PE_FIELD_PhaseLine_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="bd3da62f-a753-dd25-97b4-6d1eb48190d0")
public static String es_PE_FIELD_PhaseLine_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@M_Product_ID@=0",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bd3da62f-a753-dd25-97b4-6d1eb48190d0")
public static final String FIELDNAME_PhaseLine_ProductCategory="bd3da62f-a753-dd25-97b4-6d1eb48190d0";

@XendraTrl(Identifier="2a964900-9aa3-a3ca-1262-77540a575ec7")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2a964900-9aa3-a3ca-1262-77540a575ec7",Synchronized="2017-08-05 16:54:18.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="5bcdaeec-f51f-1923-23c5-bce01620a4c7")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="5bcdaeec-f51f-1923-23c5-bce01620a4c7")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="5bcdaeec-f51f-1923-23c5-bce01620a4c7")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5bcdaeec-f51f-1923-23c5-bce01620a4c7")
public static final String FIELDNAME_Line_Product="5bcdaeec-f51f-1923-23c5-bce01620a4c7";

@XendraTrl(Identifier="3752ae28-1ab6-f1bb-c267-f640a5f61731")
public static String es_PE_FIELD_TaskLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="3752ae28-1ab6-f1bb-c267-f640a5f61731")
public static String es_PE_FIELD_TaskLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="3752ae28-1ab6-f1bb-c267-f640a5f61731")
public static String es_PE_FIELD_TaskLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3752ae28-1ab6-f1bb-c267-f640a5f61731")
public static final String FIELDNAME_TaskLine_Product="3752ae28-1ab6-f1bb-c267-f640a5f61731";

@XendraTrl(Identifier="325b745a-7599-d3e6-9f3f-69821e8cb0fa")
public static String es_PE_FIELD_ProjectLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="325b745a-7599-d3e6-9f3f-69821e8cb0fa")
public static String es_PE_FIELD_ProjectLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="325b745a-7599-d3e6-9f3f-69821e8cb0fa")
public static String es_PE_FIELD_ProjectLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="325b745a-7599-d3e6-9f3f-69821e8cb0fa")
public static final String FIELDNAME_ProjectLine_Product="325b745a-7599-d3e6-9f3f-69821e8cb0fa";

@XendraTrl(Identifier="a1f66194-960a-88fb-052f-e1295e9d8f79")
public static String es_PE_FIELD_PhaseLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="a1f66194-960a-88fb-052f-e1295e9d8f79")
public static String es_PE_FIELD_PhaseLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="a1f66194-960a-88fb-052f-e1295e9d8f79")
public static String es_PE_FIELD_PhaseLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1f66194-960a-88fb-052f-e1295e9d8f79")
public static final String FIELDNAME_PhaseLine_Product="a1f66194-960a-88fb-052f-e1295e9d8f79";

@XendraTrl(Identifier="4ef44f61-f028-4643-d367-1ba97a8574d3")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4ef44f61-f028-4643-d367-1ba97a8574d3",Synchronized="2017-08-05 16:54:18.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="7eb1a009-7e1d-1820-0b5b-b1554f3acb6a")
public static String es_PE_FIELD_Line_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="7eb1a009-7e1d-1820-0b5b-b1554f3acb6a")
public static String es_PE_FIELD_Line_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraTrl(Identifier="7eb1a009-7e1d-1820-0b5b-b1554f3acb6a")
public static String es_PE_FIELD_Line_PlannedAmount_Name="Total Planeado";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7eb1a009-7e1d-1820-0b5b-b1554f3acb6a")
public static final String FIELDNAME_Line_PlannedAmount="7eb1a009-7e1d-1820-0b5b-b1554f3acb6a";

@XendraTrl(Identifier="bc70f511-33fb-1b20-c950-70ea23cf1c82")
public static String es_PE_FIELD_TaskLine_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="bc70f511-33fb-1b20-c950-70ea23cf1c82")
public static String es_PE_FIELD_TaskLine_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraTrl(Identifier="bc70f511-33fb-1b20-c950-70ea23cf1c82")
public static String es_PE_FIELD_TaskLine_PlannedAmount_Name="Total Planeado";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc70f511-33fb-1b20-c950-70ea23cf1c82")
public static final String FIELDNAME_TaskLine_PlannedAmount="bc70f511-33fb-1b20-c950-70ea23cf1c82";

@XendraTrl(Identifier="74d170eb-313a-6422-1919-a35bfd7aaa11")
public static String es_PE_FIELD_ProjectLine_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="74d170eb-313a-6422-1919-a35bfd7aaa11")
public static String es_PE_FIELD_ProjectLine_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraTrl(Identifier="74d170eb-313a-6422-1919-a35bfd7aaa11")
public static String es_PE_FIELD_ProjectLine_PlannedAmount_Name="Total Planeado";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74d170eb-313a-6422-1919-a35bfd7aaa11")
public static final String FIELDNAME_ProjectLine_PlannedAmount="74d170eb-313a-6422-1919-a35bfd7aaa11";

@XendraTrl(Identifier="345507ae-09af-c54d-51cd-527c48ce3aa6")
public static String es_PE_FIELD_PhaseLine_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="345507ae-09af-c54d-51cd-527c48ce3aa6")
public static String es_PE_FIELD_PhaseLine_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraTrl(Identifier="345507ae-09af-c54d-51cd-527c48ce3aa6")
public static String es_PE_FIELD_PhaseLine_PlannedAmount_Name="Total Planeado";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="345507ae-09af-c54d-51cd-527c48ce3aa6")
public static final String FIELDNAME_PhaseLine_PlannedAmount="345507ae-09af-c54d-51cd-527c48ce3aa6";

@XendraTrl(Identifier="2dc16410-1485-c45d-1de2-5385c47bcdb7")
public static String es_PE_COLUMN_PlannedAmt_Name="Total Planeado";

@XendraColumn(AD_Element_ID="7d2e668d-1293-27b7-a5ff-85f836dc7388",ColumnName="PlannedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dc16410-1485-c45d-1de2-5385c47bcdb7",
Synchronized="2017-08-05 16:54:18.0")
/** Column name PlannedAmt */
public static final String COLUMNNAME_PlannedAmt = "PlannedAmt";
/** Set Planned Margin.
@param PlannedMarginAmt Project's planned margin amount */
public void setPlannedMarginAmt (BigDecimal PlannedMarginAmt)
{
if (PlannedMarginAmt == null) throw new IllegalArgumentException ("PlannedMarginAmt is mandatory.");
set_Value (COLUMNNAME_PlannedMarginAmt, PlannedMarginAmt);
}
/** Get Planned Margin.
@return Project's planned margin amount */
public BigDecimal getPlannedMarginAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedMarginAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d24c3d8a-cd92-2dcf-f2a0-823a1ea0fe60")
public static String es_PE_FIELD_Line_PlannedMargin_Description="El total de margen planeado del proyecto";

@XendraTrl(Identifier="d24c3d8a-cd92-2dcf-f2a0-823a1ea0fe60")
public static String es_PE_FIELD_Line_PlannedMargin_Help="El total de margen planeado indica el margen anticipado que se espera para este proyecto ó esta línea del proyecto.";

@XendraTrl(Identifier="d24c3d8a-cd92-2dcf-f2a0-823a1ea0fe60")
public static String es_PE_FIELD_Line_PlannedMargin_Name="Margen Planeado";

@XendraField(AD_Column_ID="PlannedMarginAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d24c3d8a-cd92-2dcf-f2a0-823a1ea0fe60")
public static final String FIELDNAME_Line_PlannedMargin="d24c3d8a-cd92-2dcf-f2a0-823a1ea0fe60";

@XendraTrl(Identifier="99cd1bfc-1837-72f5-a445-e29183b0fb9d")
public static String es_PE_FIELD_TaskLine_PlannedMargin_Description="El total de margen planeado del proyecto";

@XendraTrl(Identifier="99cd1bfc-1837-72f5-a445-e29183b0fb9d")
public static String es_PE_FIELD_TaskLine_PlannedMargin_Help="El total de margen planeado indica el margen anticipado que se espera para este proyecto ó esta línea del proyecto.";

@XendraTrl(Identifier="99cd1bfc-1837-72f5-a445-e29183b0fb9d")
public static String es_PE_FIELD_TaskLine_PlannedMargin_Name="Margen Planeado";

@XendraField(AD_Column_ID="PlannedMarginAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99cd1bfc-1837-72f5-a445-e29183b0fb9d")
public static final String FIELDNAME_TaskLine_PlannedMargin="99cd1bfc-1837-72f5-a445-e29183b0fb9d";

@XendraTrl(Identifier="41922548-8325-858b-e123-5be2a2a70900")
public static String es_PE_FIELD_ProjectLine_PlannedMargin_Description="El total de margen planeado del proyecto";

@XendraTrl(Identifier="41922548-8325-858b-e123-5be2a2a70900")
public static String es_PE_FIELD_ProjectLine_PlannedMargin_Help="El total de margen planeado indica el margen anticipado que se espera para este proyecto ó esta línea del proyecto.";

@XendraTrl(Identifier="41922548-8325-858b-e123-5be2a2a70900")
public static String es_PE_FIELD_ProjectLine_PlannedMargin_Name="Margen Planeado";

@XendraField(AD_Column_ID="PlannedMarginAmt",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41922548-8325-858b-e123-5be2a2a70900")
public static final String FIELDNAME_ProjectLine_PlannedMargin="41922548-8325-858b-e123-5be2a2a70900";

@XendraTrl(Identifier="ab3ba12c-a635-63da-709d-6cdefb3035a0")
public static String es_PE_FIELD_PhaseLine_PlannedMargin_Description="El total de margen planeado del proyecto";

@XendraTrl(Identifier="ab3ba12c-a635-63da-709d-6cdefb3035a0")
public static String es_PE_FIELD_PhaseLine_PlannedMargin_Help="El total de margen planeado indica el margen anticipado que se espera para este proyecto ó esta línea del proyecto.";

@XendraTrl(Identifier="ab3ba12c-a635-63da-709d-6cdefb3035a0")
public static String es_PE_FIELD_PhaseLine_PlannedMargin_Name="Margen Planeado";

@XendraField(AD_Column_ID="PlannedMarginAmt",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab3ba12c-a635-63da-709d-6cdefb3035a0")
public static final String FIELDNAME_PhaseLine_PlannedMargin="ab3ba12c-a635-63da-709d-6cdefb3035a0";

@XendraTrl(Identifier="dec3f5ac-75fa-576c-b715-2bcdfc76aaf9")
public static String es_PE_COLUMN_PlannedMarginAmt_Name="Margen Planeado";

@XendraColumn(AD_Element_ID="413b1b88-7cf5-d00d-2f30-730014b2fce9",ColumnName="PlannedMarginAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dec3f5ac-75fa-576c-b715-2bcdfc76aaf9",
Synchronized="2017-08-05 16:54:18.0")
/** Column name PlannedMarginAmt */
public static final String COLUMNNAME_PlannedMarginAmt = "PlannedMarginAmt";
/** Set Planned Price.
@param PlannedPrice Planned price for this project line */
public void setPlannedPrice (BigDecimal PlannedPrice)
{
if (PlannedPrice == null) throw new IllegalArgumentException ("PlannedPrice is mandatory.");
set_Value (COLUMNNAME_PlannedPrice, PlannedPrice);
}
/** Get Planned Price.
@return Planned price for this project line */
public BigDecimal getPlannedPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedPrice);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7475e07d-329b-c78a-5970-31e38babe0b6")
public static String es_PE_FIELD_Line_PlannedPrice_Description="Precio Planeado para esta línea del proyecto";

@XendraTrl(Identifier="7475e07d-329b-c78a-5970-31e38babe0b6")
public static String es_PE_FIELD_Line_PlannedPrice_Help="El Precio Planeado indica el precio anticipado para esta línea de proyecto";

@XendraTrl(Identifier="7475e07d-329b-c78a-5970-31e38babe0b6")
public static String es_PE_FIELD_Line_PlannedPrice_Name="Precio Planeado";

@XendraField(AD_Column_ID="PlannedPrice",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7475e07d-329b-c78a-5970-31e38babe0b6")
public static final String FIELDNAME_Line_PlannedPrice="7475e07d-329b-c78a-5970-31e38babe0b6";

@XendraTrl(Identifier="265a882e-11f0-6689-6896-c1566b1033ea")
public static String es_PE_FIELD_TaskLine_PlannedPrice_Description="Precio Planeado para esta línea del proyecto";

@XendraTrl(Identifier="265a882e-11f0-6689-6896-c1566b1033ea")
public static String es_PE_FIELD_TaskLine_PlannedPrice_Help="El Precio Planeado indica el precio anticipado para esta línea de proyecto";

@XendraTrl(Identifier="265a882e-11f0-6689-6896-c1566b1033ea")
public static String es_PE_FIELD_TaskLine_PlannedPrice_Name="Precio Planeado";

@XendraField(AD_Column_ID="PlannedPrice",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="265a882e-11f0-6689-6896-c1566b1033ea")
public static final String FIELDNAME_TaskLine_PlannedPrice="265a882e-11f0-6689-6896-c1566b1033ea";

@XendraTrl(Identifier="3b06e6c6-b562-71ab-f84b-5aa6302382f9")
public static String es_PE_FIELD_ProjectLine_PlannedPrice_Description="Precio Planeado para esta línea del proyecto";

@XendraTrl(Identifier="3b06e6c6-b562-71ab-f84b-5aa6302382f9")
public static String es_PE_FIELD_ProjectLine_PlannedPrice_Help="El Precio Planeado indica el precio anticipado para esta línea de proyecto";

@XendraTrl(Identifier="3b06e6c6-b562-71ab-f84b-5aa6302382f9")
public static String es_PE_FIELD_ProjectLine_PlannedPrice_Name="Precio Planeado";

@XendraField(AD_Column_ID="PlannedPrice",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b06e6c6-b562-71ab-f84b-5aa6302382f9")
public static final String FIELDNAME_ProjectLine_PlannedPrice="3b06e6c6-b562-71ab-f84b-5aa6302382f9";

@XendraTrl(Identifier="9944789e-6a45-19f7-9336-4144480ceb70")
public static String es_PE_FIELD_PhaseLine_PlannedPrice_Description="Precio Planeado para esta línea del proyecto";

@XendraTrl(Identifier="9944789e-6a45-19f7-9336-4144480ceb70")
public static String es_PE_FIELD_PhaseLine_PlannedPrice_Help="El Precio Planeado indica el precio anticipado para esta línea de proyecto";

@XendraTrl(Identifier="9944789e-6a45-19f7-9336-4144480ceb70")
public static String es_PE_FIELD_PhaseLine_PlannedPrice_Name="Precio Planeado";

@XendraField(AD_Column_ID="PlannedPrice",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9944789e-6a45-19f7-9336-4144480ceb70")
public static final String FIELDNAME_PhaseLine_PlannedPrice="9944789e-6a45-19f7-9336-4144480ceb70";

@XendraTrl(Identifier="1d39de92-4ac9-f390-b247-67362de3a455")
public static String es_PE_COLUMN_PlannedPrice_Name="Precio Planeado";

@XendraColumn(AD_Element_ID="f723b5b6-4855-6bc4-a4a2-1b8952564718",ColumnName="PlannedPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutProject.planned",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1d39de92-4ac9-f390-b247-67362de3a455",Synchronized="2017-08-05 16:54:18.0")
/** Column name PlannedPrice */
public static final String COLUMNNAME_PlannedPrice = "PlannedPrice";
/** Set Planned Quantity.
@param PlannedQty Planned quantity for this project */
public void setPlannedQty (BigDecimal PlannedQty)
{
if (PlannedQty == null) throw new IllegalArgumentException ("PlannedQty is mandatory.");
set_Value (COLUMNNAME_PlannedQty, PlannedQty);
}
/** Get Planned Quantity.
@return Planned quantity for this project */
public BigDecimal getPlannedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a1a57743-3d55-eafa-c0ed-381794381ff9")
public static String es_PE_FIELD_Line_PlannedQuantity_Description="Cantidad planeada para este proyecto";

@XendraTrl(Identifier="a1a57743-3d55-eafa-c0ed-381794381ff9")
public static String es_PE_FIELD_Line_PlannedQuantity_Help="La Cantidad Planeada indica la cantidad anticipada para este proyecto ó línea del proyecto";

@XendraTrl(Identifier="a1a57743-3d55-eafa-c0ed-381794381ff9")
public static String es_PE_FIELD_Line_PlannedQuantity_Name="Cantidad Planeada";

@XendraField(AD_Column_ID="PlannedQty",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1a57743-3d55-eafa-c0ed-381794381ff9")
public static final String FIELDNAME_Line_PlannedQuantity="a1a57743-3d55-eafa-c0ed-381794381ff9";

@XendraTrl(Identifier="e58928ce-931f-b339-8ea3-f71d78066fb3")
public static String es_PE_FIELD_TaskLine_PlannedQuantity_Description="Cantidad planeada para este proyecto";

@XendraTrl(Identifier="e58928ce-931f-b339-8ea3-f71d78066fb3")
public static String es_PE_FIELD_TaskLine_PlannedQuantity_Help="La Cantidad Planeada indica la cantidad anticipada para este proyecto ó línea del proyecto";

@XendraTrl(Identifier="e58928ce-931f-b339-8ea3-f71d78066fb3")
public static String es_PE_FIELD_TaskLine_PlannedQuantity_Name="Cantidad Planeada";

@XendraField(AD_Column_ID="PlannedQty",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e58928ce-931f-b339-8ea3-f71d78066fb3")
public static final String FIELDNAME_TaskLine_PlannedQuantity="e58928ce-931f-b339-8ea3-f71d78066fb3";

@XendraTrl(Identifier="f714c88b-e662-e4b1-ed3c-45cb2ae1b418")
public static String es_PE_FIELD_ProjectLine_PlannedQuantity_Description="Cantidad planeada para este proyecto";

@XendraTrl(Identifier="f714c88b-e662-e4b1-ed3c-45cb2ae1b418")
public static String es_PE_FIELD_ProjectLine_PlannedQuantity_Help="La Cantidad Planeada indica la cantidad anticipada para este proyecto ó línea del proyecto";

@XendraTrl(Identifier="f714c88b-e662-e4b1-ed3c-45cb2ae1b418")
public static String es_PE_FIELD_ProjectLine_PlannedQuantity_Name="Cantidad Planeada";

@XendraField(AD_Column_ID="PlannedQty",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f714c88b-e662-e4b1-ed3c-45cb2ae1b418")
public static final String FIELDNAME_ProjectLine_PlannedQuantity="f714c88b-e662-e4b1-ed3c-45cb2ae1b418";

@XendraTrl(Identifier="040ac9f4-fd0b-d4fb-5246-dfef5182a233")
public static String es_PE_FIELD_PhaseLine_PlannedQuantity_Description="Cantidad planeada para este proyecto";

@XendraTrl(Identifier="040ac9f4-fd0b-d4fb-5246-dfef5182a233")
public static String es_PE_FIELD_PhaseLine_PlannedQuantity_Help="La Cantidad Planeada indica la cantidad anticipada para este proyecto ó línea del proyecto";

@XendraTrl(Identifier="040ac9f4-fd0b-d4fb-5246-dfef5182a233")
public static String es_PE_FIELD_PhaseLine_PlannedQuantity_Name="Cantidad Planeada";

@XendraField(AD_Column_ID="PlannedQty",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="040ac9f4-fd0b-d4fb-5246-dfef5182a233")
public static final String FIELDNAME_PhaseLine_PlannedQuantity="040ac9f4-fd0b-d4fb-5246-dfef5182a233";

@XendraTrl(Identifier="39565d64-f6ea-ae8d-2b78-34c8ea859cb8")
public static String es_PE_COLUMN_PlannedQty_Name="Cantidad Planeada";

@XendraColumn(AD_Element_ID="d4461654-1565-2b21-28c4-41673a75f16b",ColumnName="PlannedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutProject.planned",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="39565d64-f6ea-ae8d-2b78-34c8ea859cb8",Synchronized="2017-08-05 16:54:18.0")
/** Column name PlannedQty */
public static final String COLUMNNAME_PlannedQty = "PlannedQty";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a9b3f929-446d-82a7-59c2-e2a2d49598d4")
public static String es_PE_FIELD_Line_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a9b3f929-446d-82a7-59c2-e2a2d49598d4")
public static String es_PE_FIELD_Line_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="a9b3f929-446d-82a7-59c2-e2a2d49598d4")
public static String es_PE_FIELD_Line_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="3e642fb5-b9fd-fa57-00ab-44e56a8cd3d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9b3f929-446d-82a7-59c2-e2a2d49598d4")
public static final String FIELDNAME_Line_Processed="a9b3f929-446d-82a7-59c2-e2a2d49598d4";

@XendraTrl(Identifier="9b30a3dc-2ca4-0d65-cd54-66ad13742efa")
public static String es_PE_FIELD_TaskLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="9b30a3dc-2ca4-0d65-cd54-66ad13742efa")
public static String es_PE_FIELD_TaskLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="9b30a3dc-2ca4-0d65-cd54-66ad13742efa")
public static String es_PE_FIELD_TaskLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="f68731fd-8238-8734-88de-e72e1665a036",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b30a3dc-2ca4-0d65-cd54-66ad13742efa")
public static final String FIELDNAME_TaskLine_Processed="9b30a3dc-2ca4-0d65-cd54-66ad13742efa";

@XendraTrl(Identifier="738205ae-7dcc-7b41-0e24-51392025b271")
public static String es_PE_FIELD_ProjectLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="738205ae-7dcc-7b41-0e24-51392025b271")
public static String es_PE_FIELD_ProjectLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="738205ae-7dcc-7b41-0e24-51392025b271")
public static String es_PE_FIELD_ProjectLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="251de85a-147e-0a05-4520-8935442b760e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="738205ae-7dcc-7b41-0e24-51392025b271")
public static final String FIELDNAME_ProjectLine_Processed="738205ae-7dcc-7b41-0e24-51392025b271";

@XendraTrl(Identifier="f7c11af3-f9c0-d185-fcfe-38286e77f177")
public static String es_PE_FIELD_PhaseLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="f7c11af3-f9c0-d185-fcfe-38286e77f177")
public static String es_PE_FIELD_PhaseLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="f7c11af3-f9c0-d185-fcfe-38286e77f177")
public static String es_PE_FIELD_PhaseLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="46e099a0-7853-4d55-f3b3-ea67f51b4c3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7c11af3-f9c0-d185-fcfe-38286e77f177")
public static final String FIELDNAME_PhaseLine_Processed="f7c11af3-f9c0-d185-fcfe-38286e77f177";

@XendraTrl(Identifier="2f3072d3-3bea-5649-9cfb-4a8cced5dad5")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f3072d3-3bea-5649-9cfb-4a8cced5dad5",
Synchronized="2017-08-05 16:54:18.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
}
