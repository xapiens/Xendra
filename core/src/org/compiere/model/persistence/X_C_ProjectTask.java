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
import org.compiere.model.reference.REF_C_ProjectInvoiceRule;
/** Generated Model for C_ProjectTask
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ProjectTask extends PO
{
/** Standard Constructor
@param ctx context
@param C_ProjectTask_ID id
@param trxName transaction
*/
public X_C_ProjectTask (Properties ctx, int C_ProjectTask_ID, String trxName)
{
super (ctx, C_ProjectTask_ID, trxName);
/** if (C_ProjectTask_ID == 0)
{
setCommittedAmt (Env.ZERO);	
// 0
setC_ProjectPhase_ID (0);
setC_ProjectTask_ID (0);
setName (null);
setPlannedAmt (Env.ZERO);	
// 0
setProjInvoiceRule (null);	
// @ProjInvoiceRule@
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_ProjectTask WHERE C_ProjectPhase_ID=@C_ProjectPhase_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ProjectTask (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=584 */
public static int Table_ID=MTable.getTable_ID("C_ProjectTask");

@XendraTrl(Identifier="f66b758b-d281-9c6c-9773-19b67bcf1145")
public static String es_PE_TAB_Task_Description="Tarea actual del proyecto";

@XendraTrl(Identifier="f66b758b-d281-9c6c-9773-19b67bcf1145")
public static String es_PE_TAB_Task_Name="Tarea";

@XendraTrl(Identifier="f66b758b-d281-9c6c-9773-19b67bcf1145")
public static String es_PE_TAB_Task_Help="Una tarea del proyecto en una fase del proyecto representa el trabajo real.";

@XendraTab(Name="Task",Description="Actual Project Task",
Help="A Project Task in a Project Phase represents the actual work.",
AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",
DisplayLogic="@ProjectLineLevel@=T",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f66b758b-d281-9c6c-9773-19b67bcf1145",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Task="f66b758b-d281-9c6c-9773-19b67bcf1145";

@XendraTrl(Identifier="e3b48cec-f2ee-f47b-39d9-eadb93dd779f")
public static String es_PE_TABLE_C_ProjectTask_Name="Tarea del Proyecto";

@XendraTable(Name="Project Task",Description="Actual Project Task in a Phase",Help="",
TableName="C_ProjectTask",AccessLevel="3",AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="e3b48cec-f2ee-f47b-39d9-eadb93dd779f",Synchronized="2017-08-16 11:42:22.0")
/** TableName=C_ProjectTask */
public static final String Table_Name="C_ProjectTask";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ProjectTask");

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
    Table_ID = MTable.getTable_ID("C_ProjectTask");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ProjectTask[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="d9eb8373-d65e-4bfd-8f53-589fd3b9d8a5")
public static String es_PE_FIELD_Task_CommittedAmount_Description="Total Comprometido (legal)";

@XendraTrl(Identifier="d9eb8373-d65e-4bfd-8f53-589fd3b9d8a5")
public static String es_PE_FIELD_Task_CommittedAmount_Help="El Total comprometido es independiente del total planeado, usted usaría el total planeado para su estimación realista; esta podría ser mayor ó menor que el total comprometido.";

@XendraTrl(Identifier="d9eb8373-d65e-4bfd-8f53-589fd3b9d8a5")
public static String es_PE_FIELD_Task_CommittedAmount_Name="Total Comprometido";

@XendraField(AD_Column_ID="CommittedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9eb8373-d65e-4bfd-8f53-589fd3b9d8a5")
public static final String FIELDNAME_Task_CommittedAmount="d9eb8373-d65e-4bfd-8f53-589fd3b9d8a5";

@XendraTrl(Identifier="176407ff-a01a-55bc-9e22-5fd575368222")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="176407ff-a01a-55bc-9e22-5fd575368222",
Synchronized="2017-08-05 16:54:19.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";
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

@XendraTrl(Identifier="0aa32547-8d26-850c-34fa-6300b8fefb8e")
public static String es_PE_FIELD_Task_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="0aa32547-8d26-850c-34fa-6300b8fefb8e")
public static String es_PE_FIELD_Task_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0aa32547-8d26-850c-34fa-6300b8fefb8e")
public static final String FIELDNAME_Task_ProjectPhase="0aa32547-8d26-850c-34fa-6300b8fefb8e";

@XendraTrl(Identifier="723936a2-3fa0-c6a6-e072-6152b187396c")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="723936a2-3fa0-c6a6-e072-6152b187396c",
Synchronized="2017-08-05 16:54:19.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID < 1) throw new IllegalArgumentException ("C_ProjectTask_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e5c84ed0-6fff-2cde-41b3-6c8f5c9fdd33")
public static String es_PE_FIELD_Task_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="e5c84ed0-6fff-2cde-41b3-6c8f5c9fdd33")
public static String es_PE_FIELD_Task_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="e5c84ed0-6fff-2cde-41b3-6c8f5c9fdd33")
public static String es_PE_FIELD_Task_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5c84ed0-6fff-2cde-41b3-6c8f5c9fdd33")
public static final String FIELDNAME_Task_ProjectTask="e5c84ed0-6fff-2cde-41b3-6c8f5c9fdd33";
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set Standard Task.
@param C_Task_ID Standard Project Type Task */
public void setC_Task_ID (int C_Task_ID)
{
if (C_Task_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Task_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Task_ID, Integer.valueOf(C_Task_ID));
}
/** Get Standard Task.
@return Standard Project Type Task */
public int getC_Task_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Task_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72b75ee7-aa3f-a53a-5349-c4e956da9d00")
public static String es_PE_FIELD_Task_StandardTask_Description="Tarea estandar en tipo de proyecto.";

@XendraTrl(Identifier="72b75ee7-aa3f-a53a-5349-c4e956da9d00")
public static String es_PE_FIELD_Task_StandardTask_Help="Tarea estándar del proyecto de una fase del proyecto con esfuerzo estándar.";

@XendraTrl(Identifier="72b75ee7-aa3f-a53a-5349-c4e956da9d00")
public static String es_PE_FIELD_Task_StandardTask_Name="Tarea Estándar";

@XendraField(AD_Column_ID="C_Task_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72b75ee7-aa3f-a53a-5349-c4e956da9d00")
public static final String FIELDNAME_Task_StandardTask="72b75ee7-aa3f-a53a-5349-c4e956da9d00";

@XendraTrl(Identifier="cfa494d2-6992-15b5-806b-7a07654ac37a")
public static String es_PE_COLUMN_C_Task_ID_Name="Tarea Estándar";

@XendraColumn(AD_Element_ID="df1f6d63-fe37-266f-a119-a5f60c1443dc",ColumnName="C_Task_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfa494d2-6992-15b5-806b-7a07654ac37a",
Synchronized="2017-08-05 16:54:19.0")
/** Column name C_Task_ID */
public static final String COLUMNNAME_C_Task_ID = "C_Task_ID";
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

@XendraTrl(Identifier="6262c8de-699b-f8ac-bd7f-19cf2805b306")
public static String es_PE_FIELD_Task_Description_Description="Observación";

@XendraTrl(Identifier="6262c8de-699b-f8ac-bd7f-19cf2805b306")
public static String es_PE_FIELD_Task_Description_Help="Observación";

@XendraTrl(Identifier="6262c8de-699b-f8ac-bd7f-19cf2805b306")
public static String es_PE_FIELD_Task_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6262c8de-699b-f8ac-bd7f-19cf2805b306")
public static final String FIELDNAME_Task_Description="6262c8de-699b-f8ac-bd7f-19cf2805b306";

@XendraTrl(Identifier="19ece3a8-a26c-4d24-77e4-b80a1521c04f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19ece3a8-a26c-4d24-77e4-b80a1521c04f",
Synchronized="2017-08-05 16:54:19.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="34bf70f8-1c64-b2be-8c81-5b8e0f76f8aa")
public static String es_PE_FIELD_Task_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="34bf70f8-1c64-b2be-8c81-5b8e0f76f8aa")
public static String es_PE_FIELD_Task_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="34bf70f8-1c64-b2be-8c81-5b8e0f76f8aa")
public static String es_PE_FIELD_Task_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="34bf70f8-1c64-b2be-8c81-5b8e0f76f8aa")
public static final String FIELDNAME_Task_CommentHelp="34bf70f8-1c64-b2be-8c81-5b8e0f76f8aa";

@XendraTrl(Identifier="bcf3c0c8-dc30-2c82-4bca-9698de74172c")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcf3c0c8-dc30-2c82-4bca-9698de74172c",
Synchronized="2017-08-05 16:54:19.0")
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
@XendraTrl(Identifier="a68171e1-0b67-423c-878d-9810fc3429a4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a68171e1-0b67-423c-878d-9810fc3429a4",
Synchronized="2017-08-05 16:54:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="b19179a8-4754-d184-dfb2-4c8e9782cbe6")
public static String es_PE_FIELD_Task_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="b19179a8-4754-d184-dfb2-4c8e9782cbe6")
public static String es_PE_FIELD_Task_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="b19179a8-4754-d184-dfb2-4c8e9782cbe6")
public static String es_PE_FIELD_Task_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ProjInvoiceRule@=P",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b19179a8-4754-d184-dfb2-4c8e9782cbe6")
public static final String FIELDNAME_Task_Product="b19179a8-4754-d184-dfb2-4c8e9782cbe6";

@XendraTrl(Identifier="28f17600-ee55-7ce5-542b-d9228493a382")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="28f17600-ee55-7ce5-542b-d9228493a382",Synchronized="2017-08-05 16:54:19.0")
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
@XendraTrl(Identifier="d4b800af-43fa-9786-345e-0a6c487ceec5")
public static String es_PE_FIELD_Task_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d4b800af-43fa-9786-345e-0a6c487ceec5")
public static String es_PE_FIELD_Task_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d4b800af-43fa-9786-345e-0a6c487ceec5")
public static String es_PE_FIELD_Task_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d4b800af-43fa-9786-345e-0a6c487ceec5")
public static final String FIELDNAME_Task_Name="d4b800af-43fa-9786-345e-0a6c487ceec5";

@XendraTrl(Identifier="ecd63f81-9894-fa7a-8ad9-fbdef1632f3c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecd63f81-9894-fa7a-8ad9-fbdef1632f3c",
Synchronized="2017-08-05 16:54:19.0")
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

@XendraTrl(Identifier="87cc7cf2-8df9-3f3a-6b67-0e511e15e2b2")
public static String es_PE_FIELD_Task_PlannedAmount_Description="Total planeado para este proyecto";

@XendraTrl(Identifier="87cc7cf2-8df9-3f3a-6b67-0e511e15e2b2")
public static String es_PE_FIELD_Task_PlannedAmount_Help="El Total planeado indica el total anticipado para este proyecto ó linea de proyecto";

@XendraTrl(Identifier="87cc7cf2-8df9-3f3a-6b67-0e511e15e2b2")
public static String es_PE_FIELD_Task_PlannedAmount_Name="Total Planeado";

@XendraField(AD_Column_ID="PlannedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87cc7cf2-8df9-3f3a-6b67-0e511e15e2b2")
public static final String FIELDNAME_Task_PlannedAmount="87cc7cf2-8df9-3f3a-6b67-0e511e15e2b2";

@XendraTrl(Identifier="e8ffb3b7-b639-8e66-cb20-4144073a3952")
public static String es_PE_COLUMN_PlannedAmt_Name="Total Planeado";

@XendraColumn(AD_Element_ID="7d2e668d-1293-27b7-a5ff-85f836dc7388",ColumnName="PlannedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8ffb3b7-b639-8e66-cb20-4144073a3952",
Synchronized="2017-08-05 16:54:19.0")
/** Column name PlannedAmt */
public static final String COLUMNNAME_PlannedAmt = "PlannedAmt";

/** ProjInvoiceRule AD_Reference=d99f06b4-e2f5-c1c0-def9-657548c5f17d */
public static final int PROJINVOICERULE_AD_Reference_ID=383;
/** Set Invoice Rule.
@param ProjInvoiceRule Invoice Rule for the project */
public void setProjInvoiceRule (String ProjInvoiceRule)
{
if (ProjInvoiceRule == null) throw new IllegalArgumentException ("ProjInvoiceRule is mandatory");
if (ProjInvoiceRule.equals(REF_C_ProjectInvoiceRule.None) || ProjInvoiceRule.equals(REF_C_ProjectInvoiceRule.CommittedAmount) || ProjInvoiceRule.equals(REF_C_ProjectInvoiceRule.TimeMaterialMaxComitted) || ProjInvoiceRule.equals(REF_C_ProjectInvoiceRule.TimeMaterial) || ProjInvoiceRule.equals(REF_C_ProjectInvoiceRule.ProductQuantity));
 else throw new IllegalArgumentException ("ProjInvoiceRule Invalid value - " + ProjInvoiceRule + " - Reference_ID=383 - - - C - c - T - P");
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

@XendraTrl(Identifier="8ef75f1f-3ec0-e6fc-83e2-903ae2f9487c")
public static String es_PE_FIELD_Task_InvoiceRule_Description="Invoice Rule for the project";

@XendraTrl(Identifier="8ef75f1f-3ec0-e6fc-83e2-903ae2f9487c")
public static String es_PE_FIELD_Task_InvoiceRule_Help="The Invoice Rule for the project determines how orders (and consequently invoices) are created.  The selection on project level can be overwritten on Phase or Task";

@XendraTrl(Identifier="8ef75f1f-3ec0-e6fc-83e2-903ae2f9487c")
public static String es_PE_FIELD_Task_InvoiceRule_Name="Invoice Rule";

@XendraField(AD_Column_ID="ProjInvoiceRule",IsCentrallyMaintained=true,
AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ef75f1f-3ec0-e6fc-83e2-903ae2f9487c")
public static final String FIELDNAME_Task_InvoiceRule="8ef75f1f-3ec0-e6fc-83e2-903ae2f9487c";

@XendraTrl(Identifier="0c43ff19-c7e3-630d-ec2a-30e83f119185")
public static String es_PE_COLUMN_ProjInvoiceRule_Name="Invoice Rule";

@XendraColumn(AD_Element_ID="01fd82ab-ea43-1c18-3987-72651eee91de",ColumnName="ProjInvoiceRule",
AD_Reference_ID=17,AD_Reference_Value_ID="d99f06b4-e2f5-c1c0-def9-657548c5f17d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="@ProjInvoiceRule@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0c43ff19-c7e3-630d-ec2a-30e83f119185",Synchronized="2017-08-05 16:54:19.0")
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

@XendraTrl(Identifier="cf621ef2-5a82-e8f5-6e28-153fe4ba42c7")
public static String es_PE_FIELD_Task_Quantity_Description="Cantidad";

@XendraTrl(Identifier="cf621ef2-5a82-e8f5-6e28-153fe4ba42c7")
public static String es_PE_FIELD_Task_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="cf621ef2-5a82-e8f5-6e28-153fe4ba42c7")
public static String es_PE_FIELD_Task_Quantity_Name="Cantidad";
@XendraField(AD_Column_ID="Qty",
IsCentrallyMaintained=true,AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@ProjInvoiceRule@=P",DisplayLength=26,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cf621ef2-5a82-e8f5-6e28-153fe4ba42c7")
public static final String FIELDNAME_Task_Quantity="cf621ef2-5a82-e8f5-6e28-153fe4ba42c7";

@XendraTrl(Identifier="de910967-c1a3-7d0e-a690-cd243a221497")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de910967-c1a3-7d0e-a690-cd243a221497",
Synchronized="2017-08-05 16:54:19.0")
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

@XendraTrl(Identifier="196d5898-5d0f-d928-4f62-b6b3716b9013")
public static String es_PE_FIELD_Task_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="196d5898-5d0f-d928-4f62-b6b3716b9013")
public static String es_PE_FIELD_Task_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="196d5898-5d0f-d928-4f62-b6b3716b9013")
public static String es_PE_FIELD_Task_Sequence_Name="Secuencia";
@XendraField(AD_Column_ID="SeqNo",
IsCentrallyMaintained=true,AD_Tab_ID="f66b758b-d281-9c6c-9773-19b67bcf1145",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="196d5898-5d0f-d928-4f62-b6b3716b9013")
public static final String FIELDNAME_Task_Sequence="196d5898-5d0f-d928-4f62-b6b3716b9013";

@XendraTrl(Identifier="42624bc3-f1b5-206b-6217-3a3068bfda86")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_ProjectTask WHERE C_ProjectPhase_ID=@C_ProjectPhase_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42624bc3-f1b5-206b-6217-3a3068bfda86",
Synchronized="2017-08-05 16:54:19.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
