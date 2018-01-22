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
import org.compiere.model.reference.REF_PA_ReportAmountType;
import org.compiere.model.reference.REF_PA_ReportCalculationType;
import org.compiere.model.reference.REF_PA_ReportLineType;
import org.compiere.model.reference.REF__PostingType;
/** Generated Model for PA_ReportLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_ReportLine extends PO
{
/** Standard Constructor
@param ctx context
@param PA_ReportLine_ID id
@param trxName transaction
*/
public X_PA_ReportLine (Properties ctx, int PA_ReportLine_ID, String trxName)
{
super (ctx, PA_ReportLine_ID, trxName);
/** if (PA_ReportLine_ID == 0)
{
setIsPrinted (true);	
// Y
setIsSummary (false);	
// N
setLineType (null);
setName (null);
setPA_ReportLine_ID (0);
setPA_ReportLineSet_ID (0);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM PA_ReportLine WHERE PA_ReportLineSet_ID=@PA_ReportLineSet_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_ReportLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=448 */
public static int Table_ID=MTable.getTable_ID("PA_ReportLine");

@XendraTrl(Identifier="c2f3dd50-0b9c-4d04-a990-5a215bd06122")
public static String es_PE_TAB_ReportLine_Description="Mantener Ìtems del Informe financiero";

@XendraTrl(Identifier="c2f3dd50-0b9c-4d04-a990-5a215bd06122")
public static String es_PE_TAB_ReportLine_Name="Ìtem del Informe";
@XendraTab(Name="Report Line",
Description="Maintain Financial Report Line",Help="",
AD_Window_ID="8c6d3119-8975-60f6-4810-c1c02115372c",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c2f3dd50-0b9c-4d04-a990-5a215bd06122",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportLine="c2f3dd50-0b9c-4d04-a990-5a215bd06122";

@XendraTrl(Identifier="bb09e042-59c3-c5f5-4a99-3490e63f52b3")
public static String es_PE_TABLE_PA_ReportLine_Name="Línea de Informe";

@XendraTable(Name="Report Line",Description="",Help="",TableName="PA_ReportLine",AccessLevel="3",
AD_Window_ID="8c6d3119-8975-60f6-4810-c1c02115372c",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="bb09e042-59c3-c5f5-4a99-3490e63f52b3",Synchronized="2017-08-16 11:43:42.0")
/** TableName=PA_ReportLine */
public static final String Table_Name="PA_ReportLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_ReportLine");

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
    Table_ID = MTable.getTable_ID("PA_ReportLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_ReportLine[").append(get_ID()).append("]");
return sb.toString();
}

/** AmountType AD_Reference=e5a03701-e090-7320-b87f-ac3b41e9f09d */
public static final int AMOUNTTYPE_AD_Reference_ID=235;
/** Set Amount Type.
@param AmountType Type of amount to report */
public void setAmountType (String AmountType)
{
if (AmountType == null || AmountType.equals(REF_PA_ReportAmountType.YearCreditOnly) || AmountType.equals(REF_PA_ReportAmountType.YearDebitOnly) || AmountType.equals(REF_PA_ReportAmountType.YearQuantity) || AmountType.equals(REF_PA_ReportAmountType.TotalCreditOnly) || AmountType.equals(REF_PA_ReportAmountType.TotalQuantity) || AmountType.equals(REF_PA_ReportAmountType.YearBalance) || AmountType.equals(REF_PA_ReportAmountType.TotalDebitOnly) || AmountType.equals(REF_PA_ReportAmountType.TotalBalance) || AmountType.equals(REF_PA_ReportAmountType.PeriodBalance) || AmountType.equals(REF_PA_ReportAmountType.PeriodCreditOnly) || AmountType.equals(REF_PA_ReportAmountType.PeriodDebitOnly) || AmountType.equals(REF_PA_ReportAmountType.PeriodQuantity));
 else throw new IllegalArgumentException ("AmountType Invalid value - " + AmountType + " - Reference_ID=235 - CY - DY - QY - CT - QT - BY - DT - BT - BP - CP - DP - QP");
if (AmountType != null && AmountType.length() > 2)
{
log.warning("Length > 2 - truncated");
AmountType = AmountType.substring(0,1);
}
set_Value (COLUMNNAME_AmountType, AmountType);
}
/** Get Amount Type.
@return Type of amount to report */
public String getAmountType() 
{
return (String)get_Value(COLUMNNAME_AmountType);
}

@XendraTrl(Identifier="0b090fb3-305a-708a-cc7b-93a3a4d209f1")
public static String es_PE_FIELD_ReportLine_AmountType_Description="Tipo de Total a reportar";

@XendraTrl(Identifier="0b090fb3-305a-708a-cc7b-93a3a4d209f1")
public static String es_PE_FIELD_ReportLine_AmountType_Name="Tipo de Total";

@XendraField(AD_Column_ID="AmountType",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LineType@=S",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b090fb3-305a-708a-cc7b-93a3a4d209f1")
public static final String FIELDNAME_ReportLine_AmountType="0b090fb3-305a-708a-cc7b-93a3a4d209f1";

@XendraTrl(Identifier="739e2640-7637-3c07-aaa3-0ae31b8158a1")
public static String es_PE_COLUMN_AmountType_Name="Tipo de Total";

@XendraColumn(AD_Element_ID="f8082f78-cd1a-8646-0eea-f21838605c45",ColumnName="AmountType",
AD_Reference_ID=17,AD_Reference_Value_ID="e5a03701-e090-7320-b87f-ac3b41e9f09d",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="739e2640-7637-3c07-aaa3-0ae31b8158a1",Synchronized="2017-08-05 16:55:43.0")
/** Column name AmountType */
public static final String COLUMNNAME_AmountType = "AmountType";

/** CalculationType AD_Reference=3a174b14-50ef-3398-51bd-b9392c6e2c0a */
public static final int CALCULATIONTYPE_AD_Reference_ID=236;
/** Set Calculation.
@param CalculationType Calculation */
public void setCalculationType (String CalculationType)
{
if (CalculationType == null || CalculationType.equals(REF_PA_ReportCalculationType.AddOp1PlusOp2) || CalculationType.equals(REF_PA_ReportCalculationType.SubtractOp1_Op2) || CalculationType.equals(REF_PA_ReportCalculationType.PercentageOp1OfOp2) || CalculationType.equals(REF_PA_ReportCalculationType.AddRangeOp1ToOp2));
 else throw new IllegalArgumentException ("CalculationType Invalid value - " + CalculationType + " - Reference_ID=236 - A - S - P - R");
if (CalculationType != null && CalculationType.length() > 1)
{
log.warning("Length > 1 - truncated");
CalculationType = CalculationType.substring(0,0);
}
set_Value (COLUMNNAME_CalculationType, CalculationType);
}
/** Get Calculation.
@return Calculation */
public String getCalculationType() 
{
return (String)get_Value(COLUMNNAME_CalculationType);
}

@XendraTrl(Identifier="0fa3b51c-15f9-bb27-5024-8d4686607202")
public static String es_PE_FIELD_ReportLine_Calculation_Name="Calcular";

@XendraField(AD_Column_ID="CalculationType",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LineType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fa3b51c-15f9-bb27-5024-8d4686607202")
public static final String FIELDNAME_ReportLine_Calculation="0fa3b51c-15f9-bb27-5024-8d4686607202";

@XendraTrl(Identifier="158b7b79-a440-bcd0-9794-cf4607df22fe")
public static String es_PE_COLUMN_CalculationType_Name="Calcular";

@XendraColumn(AD_Element_ID="8a8cf398-694b-297c-e76a-81b2fc441c0b",ColumnName="CalculationType",
AD_Reference_ID=17,AD_Reference_Value_ID="3a174b14-50ef-3398-51bd-b9392c6e2c0a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="158b7b79-a440-bcd0-9794-cf4607df22fe",Synchronized="2017-08-05 16:55:43.0")
/** Column name CalculationType */
public static final String COLUMNNAME_CalculationType = "CalculationType";
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

@XendraTrl(Identifier="347d835a-4dc5-ce16-d9e0-ccdc69b1d52d")
public static String es_PE_FIELD_ReportLine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="347d835a-4dc5-ce16-d9e0-ccdc69b1d52d")
public static String es_PE_FIELD_ReportLine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="347d835a-4dc5-ce16-d9e0-ccdc69b1d52d")
public static String es_PE_FIELD_ReportLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="347d835a-4dc5-ce16-d9e0-ccdc69b1d52d")
public static final String FIELDNAME_ReportLine_Description="347d835a-4dc5-ce16-d9e0-ccdc69b1d52d";

@XendraTrl(Identifier="6de4cdd1-a3c9-0d29-a64d-74f9edaf027d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6de4cdd1-a3c9-0d29-a64d-74f9edaf027d",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set FixedPercentage.
@param FixedPercentage FixedPercentage */
public void setFixedPercentage (BigDecimal FixedPercentage)
{
set_Value (COLUMNNAME_FixedPercentage, FixedPercentage);
}
/** Get FixedPercentage.
@return FixedPercentage */
public BigDecimal getFixedPercentage() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FixedPercentage);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="337c2786-24d7-4bcc-91a8-54d427d48f8f")
public static String es_PE_COLUMN_FixedPercentage_Name="fixedpercentage";

@XendraColumn(AD_Element_ID="1aec8248-7ad7-4f62-98fd-1ee29b438cd1",ColumnName="FixedPercentage",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="337c2786-24d7-4bcc-91a8-54d427d48f8f",
Synchronized="2017-08-05 16:55:43.0")
/** Column name FixedPercentage */
public static final String COLUMNNAME_FixedPercentage = "FixedPercentage";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID <= 0) set_Value (COLUMNNAME_GL_Budget_ID, null);
 else 
set_Value (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4d05ece6-93c1-64cc-2b24-4eda4b8081d5")
public static String es_PE_FIELD_ReportLine_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="4d05ece6-93c1-64cc-2b24-4eda4b8081d5")
public static String es_PE_FIELD_ReportLine_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraTrl(Identifier="4d05ece6-93c1-64cc-2b24-4eda4b8081d5")
public static String es_PE_FIELD_ReportLine_Budget_Name="Presupuesto";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PostingType@=B",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4d05ece6-93c1-64cc-2b24-4eda4b8081d5")
public static final String FIELDNAME_ReportLine_Budget="4d05ece6-93c1-64cc-2b24-4eda4b8081d5";

@XendraTrl(Identifier="1164b6cb-fb5f-d527-3a7f-87add3666047")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1164b6cb-fb5f-d527-3a7f-87add3666047",
Synchronized="2017-08-05 16:55:43.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
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
@XendraTrl(Identifier="6a03a737-5a2e-410c-b78c-51167ea72940")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a03a737-5a2e-410c-b78c-51167ea72940",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="c79dadf4-69a8-4ec4-cd21-027dc2ced1c4")
public static String es_PE_FIELD_ReportLine_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="c79dadf4-69a8-4ec4-cd21-027dc2ced1c4")
public static String es_PE_FIELD_ReportLine_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="c79dadf4-69a8-4ec4-cd21-027dc2ced1c4")
public static String es_PE_FIELD_ReportLine_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c79dadf4-69a8-4ec4-cd21-027dc2ced1c4")
public static final String FIELDNAME_ReportLine_Printed="c79dadf4-69a8-4ec4-cd21-027dc2ced1c4";

@XendraTrl(Identifier="87d6effe-8613-379c-1205-7a389da972bd")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87d6effe-8613-379c-1205-7a389da972bd",
Synchronized="2017-08-05 16:55:43.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b64dbe43-e957-8001-546b-c3dc5a47fead")
public static String es_PE_FIELD_ReportLine_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="b64dbe43-e957-8001-546b-c3dc5a47fead")
public static String es_PE_FIELD_ReportLine_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="b64dbe43-e957-8001-546b-c3dc5a47fead")
public static String es_PE_FIELD_ReportLine_SummaryLevel_Name="Entidad Acumulada";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b64dbe43-e957-8001-546b-c3dc5a47fead")
public static final String FIELDNAME_ReportLine_SummaryLevel="b64dbe43-e957-8001-546b-c3dc5a47fead";

@XendraTrl(Identifier="255955a9-93cc-a217-280f-694ebf854e2d")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="255955a9-93cc-a217-280f-694ebf854e2d",
Synchronized="2017-08-05 16:55:43.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";

/** LineType AD_Reference=349913c4-1875-0149-824c-1be75fddc6c3 */
public static final int LINETYPE_AD_Reference_ID=241;
/** Set Line Type.
@param LineType Line Type */
public void setLineType (String LineType)
{
if (LineType == null) throw new IllegalArgumentException ("LineType is mandatory");
if (LineType.equals(REF_PA_ReportLineType.SegmentValue) || LineType.equals(REF_PA_ReportLineType.Calculation));
 else throw new IllegalArgumentException ("LineType Invalid value - " + LineType + " - Reference_ID=241 - S - C");
if (LineType.length() > 1)
{
log.warning("Length > 1 - truncated");
LineType = LineType.substring(0,0);
}
set_Value (COLUMNNAME_LineType, LineType);
}
/** Get Line Type.
@return Line Type */
public String getLineType() 
{
return (String)get_Value(COLUMNNAME_LineType);
}

@XendraTrl(Identifier="e2d478ec-6481-aa74-a036-abdd57b84fc3")
public static String es_PE_FIELD_ReportLine_LineType_Name="Tipo de Línea";

@XendraField(AD_Column_ID="LineType",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2d478ec-6481-aa74-a036-abdd57b84fc3")
public static final String FIELDNAME_ReportLine_LineType="e2d478ec-6481-aa74-a036-abdd57b84fc3";

@XendraTrl(Identifier="5d633b8a-35c5-2524-aa76-0db7c15a6b6f")
public static String es_PE_COLUMN_LineType_Name="Tipo de Línea";

@XendraColumn(AD_Element_ID="c15d5c2e-9a2a-bebc-1d8c-808f78565726",ColumnName="LineType",
AD_Reference_ID=17,AD_Reference_Value_ID="349913c4-1875-0149-824c-1be75fddc6c3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5d633b8a-35c5-2524-aa76-0db7c15a6b6f",Synchronized="2017-08-05 16:55:43.0")
/** Column name LineType */
public static final String COLUMNNAME_LineType = "LineType";
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

@XendraTrl(Identifier="6fcb60e5-cbf3-2ed5-c3e3-aceaad22fccf")
public static String es_PE_FIELD_ReportLine_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6fcb60e5-cbf3-2ed5-c3e3-aceaad22fccf")
public static String es_PE_FIELD_ReportLine_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="6fcb60e5-cbf3-2ed5-c3e3-aceaad22fccf")
public static String es_PE_FIELD_ReportLine_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6fcb60e5-cbf3-2ed5-c3e3-aceaad22fccf")
public static final String FIELDNAME_ReportLine_Name="6fcb60e5-cbf3-2ed5-c3e3-aceaad22fccf";

@XendraTrl(Identifier="ae185c56-866a-98c3-492a-69d5e81f01fd")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae185c56-866a-98c3-492a-69d5e81f01fd",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** Oper_1_ID AD_Reference=9bbbed65-5787-d31e-8c94-be60c7811cf0 */
public static final int OPER_1_ID_AD_Reference_ID=240;
/** Set Operand 1.
@param Oper_1_ID First operand for calculation */
public void setOper_1_ID (int Oper_1_ID)
{
if (Oper_1_ID <= 0) set_Value (COLUMNNAME_Oper_1_ID, null);
 else 
set_Value (COLUMNNAME_Oper_1_ID, Integer.valueOf(Oper_1_ID));
}
/** Get Operand 1.
@return First operand for calculation */
public int getOper_1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Oper_1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce314e16-3742-663b-b1f2-b16ab014e983")
public static String es_PE_FIELD_ReportLine_Operand_Description="Primer operación para el cálculo";

@XendraTrl(Identifier="ce314e16-3742-663b-b1f2-b16ab014e983")
public static String es_PE_FIELD_ReportLine_Operand_Name="Operación 1";

@XendraField(AD_Column_ID="Oper_1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LineType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce314e16-3742-663b-b1f2-b16ab014e983")
public static final String FIELDNAME_ReportLine_Operand="ce314e16-3742-663b-b1f2-b16ab014e983";

@XendraTrl(Identifier="e913e0db-affa-5693-c7b0-45e2d0f4e698")
public static String es_PE_COLUMN_Oper_1_ID_Name="Operación 1";

@XendraColumn(AD_Element_ID="84302d07-ffb5-d7c7-525c-461de4e04cdc",ColumnName="Oper_1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="9bbbed65-5787-d31e-8c94-be60c7811cf0",
AD_Val_Rule_ID="eef9c731-043b-17c9-ea76-6c0faf568470",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e913e0db-affa-5693-c7b0-45e2d0f4e698",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Oper_1_ID */
public static final String COLUMNNAME_Oper_1_ID = "Oper_1_ID";

/** Oper_2_ID AD_Reference=9bbbed65-5787-d31e-8c94-be60c7811cf0 */
public static final int OPER_2_ID_AD_Reference_ID=240;
/** Set Operand 2.
@param Oper_2_ID Second operand for calculation */
public void setOper_2_ID (int Oper_2_ID)
{
if (Oper_2_ID <= 0) set_Value (COLUMNNAME_Oper_2_ID, null);
 else 
set_Value (COLUMNNAME_Oper_2_ID, Integer.valueOf(Oper_2_ID));
}
/** Get Operand 2.
@return Second operand for calculation */
public int getOper_2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Oper_2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e1b5675f-c980-f638-a079-257736aaa3f1")
public static String es_PE_FIELD_ReportLine_Operand22_Description="Segunda operación para el cálculo";

@XendraTrl(Identifier="e1b5675f-c980-f638-a079-257736aaa3f1")
public static String es_PE_FIELD_ReportLine_Operand22_Name="Operación 2";

@XendraField(AD_Column_ID="Oper_2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LineType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1b5675f-c980-f638-a079-257736aaa3f1")
public static final String FIELDNAME_ReportLine_Operand22="e1b5675f-c980-f638-a079-257736aaa3f1";

@XendraTrl(Identifier="6176af8f-4a5c-7361-a43c-080a70e17f9a")
public static String es_PE_COLUMN_Oper_2_ID_Name="Operación 2";

@XendraColumn(AD_Element_ID="e5e9d6ca-70a1-77cc-4d3b-d5787dafa061",ColumnName="Oper_2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="9bbbed65-5787-d31e-8c94-be60c7811cf0",
AD_Val_Rule_ID="eef9c731-043b-17c9-ea76-6c0faf568470",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6176af8f-4a5c-7361-a43c-080a70e17f9a",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Oper_2_ID */
public static final String COLUMNNAME_Oper_2_ID = "Oper_2_ID";
/** Set PAAmountType.
@param PAAmountType PAAmountType */
public void setPAAmountType (boolean PAAmountType)
{
set_Value (COLUMNNAME_PAAmountType, Boolean.valueOf(PAAmountType));
}
/** Get PAAmountType.
@return PAAmountType */
public boolean isPAAmountType() 
{
Object oo = get_Value(COLUMNNAME_PAAmountType);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c1138a45-1d3e-4360-b91a-0874806577ec")
public static String es_PE_COLUMN_PAAmountType_Name="paamounttype";

@XendraColumn(AD_Element_ID="8a7efa77-2479-48e7-8ff6-fabbe7f6aba0",ColumnName="PAAmountType",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1138a45-1d3e-4360-b91a-0874806577ec",
Synchronized="2017-08-05 16:55:43.0")
/** Column name PAAmountType */
public static final String COLUMNNAME_PAAmountType = "PAAmountType";
/** Set PAPeriodType.
@param PAPeriodType PAPeriodType */
public void setPAPeriodType (boolean PAPeriodType)
{
set_Value (COLUMNNAME_PAPeriodType, Boolean.valueOf(PAPeriodType));
}
/** Get PAPeriodType.
@return PAPeriodType */
public boolean isPAPeriodType() 
{
Object oo = get_Value(COLUMNNAME_PAPeriodType);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="777dac7a-d51b-468b-b95a-e0c75346b522")
public static String es_PE_COLUMN_PAPeriodType_Name="paperiodtype";

@XendraColumn(AD_Element_ID="cf516688-afaa-47b5-94c8-a21497c12de6",ColumnName="PAPeriodType",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="777dac7a-d51b-468b-b95a-e0c75346b522",
Synchronized="2017-08-05 16:55:43.0")
/** Column name PAPeriodType */
public static final String COLUMNNAME_PAPeriodType = "PAPeriodType";

/** Parent_ID AD_Reference=19157db7-5bbc-4a54-cbf2-7d1dea3ffe70 */
public static final int PARENT_ID_AD_Reference_ID=242;
/** Set Parent.
@param Parent_ID Parent of Entity */
public void setParent_ID (int Parent_ID)
{
if (Parent_ID <= 0) set_Value (COLUMNNAME_Parent_ID, null);
 else 
set_Value (COLUMNNAME_Parent_ID, Integer.valueOf(Parent_ID));
}
/** Get Parent.
@return Parent of Entity */
public int getParent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Parent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="449e6929-cf41-0403-6c6d-e373219daf9f")
public static String es_PE_FIELD_ReportLine_Parent_Description="Valor padre.";

@XendraTrl(Identifier="449e6929-cf41-0403-6c6d-e373219daf9f")
public static String es_PE_FIELD_ReportLine_Parent_Help="El padre indica un valor usado para representar un nivel sumario ó Informe a nivel para un registro.";

@XendraTrl(Identifier="449e6929-cf41-0403-6c6d-e373219daf9f")
public static String es_PE_FIELD_ReportLine_Parent_Name="Padre";

@XendraField(AD_Column_ID="Parent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="449e6929-cf41-0403-6c6d-e373219daf9f")
public static final String FIELDNAME_ReportLine_Parent="449e6929-cf41-0403-6c6d-e373219daf9f";

@XendraTrl(Identifier="09b4e1dc-1838-94e4-d47d-bb416f2abbdd")
public static String es_PE_COLUMN_Parent_ID_Name="Padre";

@XendraColumn(AD_Element_ID="26d35f92-f0e2-00bf-656e-99db30e53a7f",ColumnName="Parent_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="19157db7-5bbc-4a54-cbf2-7d1dea3ffe70",
AD_Val_Rule_ID="eef9c731-043b-17c9-ea76-6c0faf568470",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09b4e1dc-1838-94e4-d47d-bb416f2abbdd",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Parent_ID */
public static final String COLUMNNAME_Parent_ID = "Parent_ID";
/** Set Report Line.
@param PA_ReportLine_ID Report Line */
public void setPA_ReportLine_ID (int PA_ReportLine_ID)
{
if (PA_ReportLine_ID < 1) throw new IllegalArgumentException ("PA_ReportLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportLine_ID, Integer.valueOf(PA_ReportLine_ID));
}
/** Get Report Line.
@return Report Line */
public int getPA_ReportLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ceb9718a-64bf-be45-860e-8c584586e7bc")
public static String es_PE_FIELD_ReportLine_ReportLine_Name="Item de Informe";

@XendraField(AD_Column_ID="PA_ReportLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ceb9718a-64bf-be45-860e-8c584586e7bc")
public static final String FIELDNAME_ReportLine_ReportLine="ceb9718a-64bf-be45-860e-8c584586e7bc";
/** Column name PA_ReportLine_ID */
public static final String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
/** Set Report Line Set.
@param PA_ReportLineSet_ID Report Line Set */
public void setPA_ReportLineSet_ID (int PA_ReportLineSet_ID)
{
if (PA_ReportLineSet_ID < 1) throw new IllegalArgumentException ("PA_ReportLineSet_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportLineSet_ID, Integer.valueOf(PA_ReportLineSet_ID));
}
/** Get Report Line Set.
@return Report Line Set */
public int getPA_ReportLineSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLineSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="58f15e96-2e6a-a133-df0b-c78c1a04fe3e")
public static String es_PE_FIELD_ReportLine_ReportLineSet_Name="Establecer Línea de Informe";

@XendraField(AD_Column_ID="PA_ReportLineSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58f15e96-2e6a-a133-df0b-c78c1a04fe3e")
public static final String FIELDNAME_ReportLine_ReportLineSet="58f15e96-2e6a-a133-df0b-c78c1a04fe3e";

@XendraTrl(Identifier="140d0a92-c1c1-f99b-5127-5590ef7b329d")
public static String es_PE_COLUMN_PA_ReportLineSet_ID_Name="Establecer Línea de Informe";

@XendraColumn(AD_Element_ID="71d54bec-2aa5-e5e8-5306-b5fa80ab086e",
ColumnName="PA_ReportLineSet_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="140d0a92-c1c1-f99b-5127-5590ef7b329d",Synchronized="2017-08-05 16:55:43.0")
/** Column name PA_ReportLineSet_ID */
public static final String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";

/** PostingType AD_Reference=1ad48d23-2ec9-09d0-cb68-38688c5e6ce0 */
public static final int POSTINGTYPE_AD_Reference_ID=125;
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType == null || PostingType.equals(REF__PostingType.Actual) || PostingType.equals(REF__PostingType.Budget) || PostingType.equals(REF__PostingType.Commitment) || PostingType.equals(REF__PostingType.Statistical) || PostingType.equals(REF__PostingType.Reservation));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - S - R");
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="253733e9-b57f-8dc6-059c-2ac38eb4c18b")
public static String es_PE_FIELD_ReportLine_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="253733e9-b57f-8dc6-059c-2ac38eb4c18b")
public static String es_PE_FIELD_ReportLine_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraTrl(Identifier="253733e9-b57f-8dc6-059c-2ac38eb4c18b")
public static String es_PE_FIELD_ReportLine_PostingType_Name="Tipo de Aplicación";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LineType@=S",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="253733e9-b57f-8dc6-059c-2ac38eb4c18b")
public static final String FIELDNAME_ReportLine_PostingType="253733e9-b57f-8dc6-059c-2ac38eb4c18b";

@XendraTrl(Identifier="b105a99a-f95e-1f76-3332-38c9c471435c")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b105a99a-f95e-1f76-3332-38c9c471435c",Synchronized="2017-08-05 16:55:43.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set ReportLineStyle.
@param ReportLineStyle ReportLineStyle */
public void setReportLineStyle (boolean ReportLineStyle)
{
set_Value (COLUMNNAME_ReportLineStyle, Boolean.valueOf(ReportLineStyle));
}
/** Get ReportLineStyle.
@return ReportLineStyle */
public boolean isReportLineStyle() 
{
Object oo = get_Value(COLUMNNAME_ReportLineStyle);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9f7eb574-76e0-4009-a8d8-d3177239edd3")
public static String es_PE_COLUMN_ReportLineStyle_Name="reportlinestyle";

@XendraColumn(AD_Element_ID="9b1a5313-9d98-447f-b5a5-f6640a220588",ColumnName="ReportLineStyle",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f7eb574-76e0-4009-a8d8-d3177239edd3",
Synchronized="2017-08-05 16:55:43.0")
/** Column name ReportLineStyle */
public static final String COLUMNNAME_ReportLineStyle = "ReportLineStyle";
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

@XendraTrl(Identifier="6afd5467-47cb-3825-d2c3-bbbe8db98282")
public static String es_PE_FIELD_ReportLine_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="6afd5467-47cb-3825-d2c3-bbbe8db98282")
public static String es_PE_FIELD_ReportLine_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="6afd5467-47cb-3825-d2c3-bbbe8db98282")
public static String es_PE_FIELD_ReportLine_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="c2f3dd50-0b9c-4d04-a990-5a215bd06122",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6afd5467-47cb-3825-d2c3-bbbe8db98282")
public static final String FIELDNAME_ReportLine_Sequence="6afd5467-47cb-3825-d2c3-bbbe8db98282";

@XendraTrl(Identifier="4dc306dd-e1ca-b19b-d548-304860f575b1")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM PA_ReportLine WHERE PA_ReportLineSet_ID=@PA_ReportLineSet_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4dc306dd-e1ca-b19b-d548-304860f575b1",
Synchronized="2017-08-05 16:55:43.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Tab Level.
@param TabLevel Hierarchical Tab Level (0 = top) */
public void setTabLevel (int TabLevel)
{
set_Value (COLUMNNAME_TabLevel, Integer.valueOf(TabLevel));
}
/** Get Tab Level.
@return Hierarchical Tab Level (0 = top) */
public int getTabLevel() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_TabLevel);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b719068b-25d4-4cfd-9e28-565863e9a0fc")
public static String es_PE_COLUMN_TabLevel_Name="Tab Level";

@XendraColumn(AD_Element_ID="9fd1fa87-f0ad-359c-10bb-d8f914a982a4",ColumnName="TabLevel",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b719068b-25d4-4cfd-9e28-565863e9a0fc",
Synchronized="2017-08-05 16:55:43.0")
/** Column name TabLevel */
public static final String COLUMNNAME_TabLevel = "TabLevel";
}
