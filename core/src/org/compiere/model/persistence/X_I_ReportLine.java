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
/** Generated Model for I_ReportLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_ReportLine extends PO
{
/** Standard Constructor
@param ctx context
@param I_ReportLine_ID id
@param trxName transaction
*/
public X_I_ReportLine (Properties ctx, int I_ReportLine_ID, String trxName)
{
super (ctx, I_ReportLine_ID, trxName);
/** if (I_ReportLine_ID == 0)
{
setI_IsImported (false);	
// N
setI_ReportLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_ReportLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=535 */
public static int Table_ID=MTable.getTable_ID("I_ReportLine");

@XendraTrl(Identifier="749abf01-be36-991d-704c-bfabe0dc2484")
public static String es_PE_TAB_ImportReportLineSet_Name="Importar Informes de Lineas fijo";

@XendraTab(Name="Import Report Line Set",Description="",Help="",
AD_Window_ID="44734133-da95-af11-152a-52766007048a",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="749abf01-be36-991d-704c-bfabe0dc2484",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportReportLineSet="749abf01-be36-991d-704c-bfabe0dc2484";

@XendraTrl(Identifier="01eab73e-93be-b551-f16c-fe34d642e895")
public static String es_PE_TABLE_I_ReportLine_Name="Importar Lineas de Informes";

@XendraTable(Name="Import Report Line Set",Description="Import Report Line Set values",Help="",
TableName="I_ReportLine",AccessLevel="6",AD_Window_ID="44734133-da95-af11-152a-52766007048a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="01eab73e-93be-b551-f16c-fe34d642e895",Synchronized="2017-08-16 11:43:05.0")
/** TableName=I_ReportLine */
public static final String Table_Name="I_ReportLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_ReportLine");

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
    Table_ID = MTable.getTable_ID("I_ReportLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_ReportLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="63c2ba9f-74a3-5642-01b1-7978ea154c30")
public static String es_PE_FIELD_ImportReportLineSet_AmountType_Description="Tipo de Total a reportar";

@XendraTrl(Identifier="63c2ba9f-74a3-5642-01b1-7978ea154c30")
public static String es_PE_FIELD_ImportReportLineSet_AmountType_Name="Tipo de Total";

@XendraField(AD_Column_ID="AmountType",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63c2ba9f-74a3-5642-01b1-7978ea154c30")
public static final String FIELDNAME_ImportReportLineSet_AmountType="63c2ba9f-74a3-5642-01b1-7978ea154c30";

@XendraTrl(Identifier="90ec7531-a9d3-05c2-7066-5ba44a2a1e90")
public static String es_PE_COLUMN_AmountType_Name="Tipo de Total";

@XendraColumn(AD_Element_ID="f8082f78-cd1a-8646-0eea-f21838605c45",ColumnName="AmountType",
AD_Reference_ID=17,AD_Reference_Value_ID="e5a03701-e090-7320-b87f-ac3b41e9f09d",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="90ec7531-a9d3-05c2-7066-5ba44a2a1e90",Synchronized="2017-08-05 16:54:58.0")
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

@XendraTrl(Identifier="18822c03-d568-64d6-f70d-0584217606bf")
public static String es_PE_FIELD_ImportReportLineSet_Calculation_Name="Calcular";

@XendraField(AD_Column_ID="CalculationType",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18822c03-d568-64d6-f70d-0584217606bf")
public static final String FIELDNAME_ImportReportLineSet_Calculation="18822c03-d568-64d6-f70d-0584217606bf";

@XendraTrl(Identifier="18e37fc8-b1b3-e4ba-8fa7-593ba0c06e5e")
public static String es_PE_COLUMN_CalculationType_Name="Calcular";

@XendraColumn(AD_Element_ID="8a8cf398-694b-297c-e76a-81b2fc441c0b",ColumnName="CalculationType",
AD_Reference_ID=17,AD_Reference_Value_ID="3a174b14-50ef-3398-51bd-b9392c6e2c0a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="18e37fc8-b1b3-e4ba-8fa7-593ba0c06e5e",Synchronized="2017-08-05 16:54:58.0")
/** Column name CalculationType */
public static final String COLUMNNAME_CalculationType = "CalculationType";
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID <= 0) set_Value (COLUMNNAME_C_ElementValue_ID, null);
 else 
set_Value (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="66a4ad73-e440-2e14-0666-89dc668581b9")
public static String es_PE_FIELD_ImportReportLineSet_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="66a4ad73-e440-2e14-0666-89dc668581b9")
public static String es_PE_FIELD_ImportReportLineSet_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraTrl(Identifier="66a4ad73-e440-2e14-0666-89dc668581b9")
public static String es_PE_FIELD_ImportReportLineSet_AccountElement_Name="Valor del Elemento";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66a4ad73-e440-2e14-0666-89dc668581b9")
public static final String FIELDNAME_ImportReportLineSet_AccountElement="66a4ad73-e440-2e14-0666-89dc668581b9";

@XendraTrl(Identifier="18a3acc2-7d6e-5ff8-f0fd-ce894ac3dd24")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18a3acc2-7d6e-5ff8-f0fd-ce894ac3dd24",
Synchronized="2017-08-05 16:54:58.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
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

@XendraTrl(Identifier="16f6992c-6481-d7e3-9514-8929094cc15d")
public static String es_PE_FIELD_ImportReportLineSet_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="16f6992c-6481-d7e3-9514-8929094cc15d")
public static String es_PE_FIELD_ImportReportLineSet_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="16f6992c-6481-d7e3-9514-8929094cc15d")
public static String es_PE_FIELD_ImportReportLineSet_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16f6992c-6481-d7e3-9514-8929094cc15d")
public static final String FIELDNAME_ImportReportLineSet_Description="16f6992c-6481-d7e3-9514-8929094cc15d";

@XendraTrl(Identifier="4d872c5b-cec1-be71-15a4-36928a836d77")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d872c5b-cec1-be71-15a4-36928a836d77",
Synchronized="2017-08-05 16:54:58.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Element Key.
@param ElementValue Key of the element */
public void setElementValue (String ElementValue)
{
if (ElementValue != null && ElementValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ElementValue = ElementValue.substring(0,39);
}
set_Value (COLUMNNAME_ElementValue, ElementValue);
}
/** Get Element Key.
@return Key of the element */
public String getElementValue() 
{
String value = (String)get_Value(COLUMNNAME_ElementValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4b575247-2a61-5ffb-e140-43a2db9cda0c")
public static String es_PE_FIELD_ImportReportLineSet_ElementKey_Description="Llave del elemento.";

@XendraTrl(Identifier="4b575247-2a61-5ffb-e140-43a2db9cda0c")
public static String es_PE_FIELD_ImportReportLineSet_ElementKey_Name="Llave de Elemento";

@XendraField(AD_Column_ID="ElementValue",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b575247-2a61-5ffb-e140-43a2db9cda0c")
public static final String FIELDNAME_ImportReportLineSet_ElementKey="4b575247-2a61-5ffb-e140-43a2db9cda0c";

@XendraTrl(Identifier="dca4d1b2-9f7c-616e-cd3f-e956ee55dbb2")
public static String es_PE_COLUMN_ElementValue_Name="Llave de Elemento";

@XendraColumn(AD_Element_ID="f32b9cf9-825f-bd4c-9436-2e950c06b19e",ColumnName="ElementValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dca4d1b2-9f7c-616e-cd3f-e956ee55dbb2",
Synchronized="2017-08-05 16:54:58.0")
/** Column name ElementValue */
public static final String COLUMNNAME_ElementValue = "ElementValue";
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
@XendraTrl(Identifier="61ce1d34-69d9-40b2-b036-7eaf5c80c84b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61ce1d34-69d9-40b2-b036-7eaf5c80c84b",
Synchronized="2017-08-05 16:54:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
if (I_ErrorMsg != null && I_ErrorMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
I_ErrorMsg = I_ErrorMsg.substring(0,1999);
}
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14146633-0d3c-68f0-3fa4-2fb3734478b2")
public static String es_PE_FIELD_ImportReportLineSet_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="14146633-0d3c-68f0-3fa4-2fb3734478b2")
public static String es_PE_FIELD_ImportReportLineSet_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraTrl(Identifier="14146633-0d3c-68f0-3fa4-2fb3734478b2")
public static String es_PE_FIELD_ImportReportLineSet_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14146633-0d3c-68f0-3fa4-2fb3734478b2")
public static final String FIELDNAME_ImportReportLineSet_ImportErrorMessage="14146633-0d3c-68f0-3fa4-2fb3734478b2";

@XendraTrl(Identifier="661468cf-b50b-59e4-e1aa-fe2b1cee199c")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="661468cf-b50b-59e4-e1aa-fe2b1cee199c",
Synchronized="2017-08-05 16:54:58.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="86ec9534-85bc-cd2c-6c4f-18e63f5981bf")
public static String es_PE_FIELD_ImportReportLineSet_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="86ec9534-85bc-cd2c-6c4f-18e63f5981bf")
public static String es_PE_FIELD_ImportReportLineSet_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraTrl(Identifier="86ec9534-85bc-cd2c-6c4f-18e63f5981bf")
public static String es_PE_FIELD_ImportReportLineSet_Imported_Name="Importar";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86ec9534-85bc-cd2c-6c4f-18e63f5981bf")
public static final String FIELDNAME_ImportReportLineSet_Imported="86ec9534-85bc-cd2c-6c4f-18e63f5981bf";

@XendraTrl(Identifier="cf139952-d544-cbab-1d4b-8c929f4ca43b")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf139952-d544-cbab-1d4b-8c929f4ca43b",
Synchronized="2017-08-05 16:54:58.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Import Report Line Set.
@param I_ReportLine_ID Import Report Line Set values */
public void setI_ReportLine_ID (int I_ReportLine_ID)
{
if (I_ReportLine_ID < 1) throw new IllegalArgumentException ("I_ReportLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_ReportLine_ID, Integer.valueOf(I_ReportLine_ID));
}
/** Get Import Report Line Set.
@return Import Report Line Set values */
public int getI_ReportLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_ReportLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d2ba6c22-5cd6-3a1f-4c97-2cd54b32d2a8")
public static String es_PE_FIELD_ImportReportLineSet_ImportReportLineSet_Description="Importar lineas de informes ";

@XendraTrl(Identifier="d2ba6c22-5cd6-3a1f-4c97-2cd54b32d2a8")
public static String es_PE_FIELD_ImportReportLineSet_ImportReportLineSet_Name="Importar Lineas de Informes";

@XendraField(AD_Column_ID="I_ReportLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2ba6c22-5cd6-3a1f-4c97-2cd54b32d2a8")
public static final String FIELDNAME_ImportReportLineSet_ImportReportLineSet="d2ba6c22-5cd6-3a1f-4c97-2cd54b32d2a8";
/** Column name I_ReportLine_ID */
public static final String COLUMNNAME_I_ReportLine_ID = "I_ReportLine_ID";
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

@XendraTrl(Identifier="e6cd7590-0596-f013-720d-87d12dbd2323")
public static String es_PE_FIELD_ImportReportLineSet_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="e6cd7590-0596-f013-720d-87d12dbd2323")
public static String es_PE_FIELD_ImportReportLineSet_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="e6cd7590-0596-f013-720d-87d12dbd2323")
public static String es_PE_FIELD_ImportReportLineSet_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6cd7590-0596-f013-720d-87d12dbd2323")
public static final String FIELDNAME_ImportReportLineSet_Printed="e6cd7590-0596-f013-720d-87d12dbd2323";

@XendraTrl(Identifier="9c162c3b-1bb2-149b-84d5-7b101bff57ec")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c162c3b-1bb2-149b-84d5-7b101bff57ec",
Synchronized="2017-08-05 16:54:58.0")
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

@XendraTrl(Identifier="f2db05a2-cb33-f045-b850-4beae0047d63")
public static String es_PE_FIELD_ImportReportLineSet_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="f2db05a2-cb33-f045-b850-4beae0047d63")
public static String es_PE_FIELD_ImportReportLineSet_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="f2db05a2-cb33-f045-b850-4beae0047d63")
public static String es_PE_FIELD_ImportReportLineSet_SummaryLevel_Name="Entidad Acumulada";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2db05a2-cb33-f045-b850-4beae0047d63")
public static final String FIELDNAME_ImportReportLineSet_SummaryLevel="f2db05a2-cb33-f045-b850-4beae0047d63";

@XendraTrl(Identifier="cf39a9dd-f115-d436-6af5-4e71959817f0")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf39a9dd-f115-d436-6af5-4e71959817f0",
Synchronized="2017-08-05 16:54:58.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";

/** LineType AD_Reference=349913c4-1875-0149-824c-1be75fddc6c3 */
public static final int LINETYPE_AD_Reference_ID=241;
/** Set Line Type.
@param LineType Line Type */
public void setLineType (String LineType)
{
if (LineType == null || LineType.equals(REF_PA_ReportLineType.SegmentValue) || LineType.equals(REF_PA_ReportLineType.Calculation));
 else throw new IllegalArgumentException ("LineType Invalid value - " + LineType + " - Reference_ID=241 - S - C");
if (LineType != null && LineType.length() > 1)
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

@XendraTrl(Identifier="4c9131e3-7144-82c4-4299-ffb717a21e46")
public static String es_PE_FIELD_ImportReportLineSet_LineType_Name="Tipo de Línea";

@XendraField(AD_Column_ID="LineType",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c9131e3-7144-82c4-4299-ffb717a21e46")
public static final String FIELDNAME_ImportReportLineSet_LineType="4c9131e3-7144-82c4-4299-ffb717a21e46";

@XendraTrl(Identifier="e9b7d322-9282-65e5-f064-f57236fe7e51")
public static String es_PE_COLUMN_LineType_Name="Tipo de Línea";

@XendraColumn(AD_Element_ID="c15d5c2e-9a2a-bebc-1d8c-808f78565726",ColumnName="LineType",
AD_Reference_ID=17,AD_Reference_Value_ID="349913c4-1875-0149-824c-1be75fddc6c3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e9b7d322-9282-65e5-f064-f57236fe7e51",Synchronized="2017-08-05 16:54:58.0")
/** Column name LineType */
public static final String COLUMNNAME_LineType = "LineType";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
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

@XendraTrl(Identifier="cb909389-2949-df8e-a82c-58b466579ad4")
public static String es_PE_FIELD_ImportReportLineSet_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="cb909389-2949-df8e-a82c-58b466579ad4")
public static String es_PE_FIELD_ImportReportLineSet_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="cb909389-2949-df8e-a82c-58b466579ad4")
public static String es_PE_FIELD_ImportReportLineSet_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb909389-2949-df8e-a82c-58b466579ad4")
public static final String FIELDNAME_ImportReportLineSet_Name="cb909389-2949-df8e-a82c-58b466579ad4";

@XendraTrl(Identifier="a2f89114-b468-3c8c-4b61-9c9eda23e35c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2f89114-b468-3c8c-4b61-9c9eda23e35c",
Synchronized="2017-08-05 16:54:58.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Report Line.
@param PA_ReportLine_ID Report Line */
public void setPA_ReportLine_ID (int PA_ReportLine_ID)
{
if (PA_ReportLine_ID <= 0) set_Value (COLUMNNAME_PA_ReportLine_ID, null);
 else 
set_Value (COLUMNNAME_PA_ReportLine_ID, Integer.valueOf(PA_ReportLine_ID));
}
/** Get Report Line.
@return Report Line */
public int getPA_ReportLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6af654ba-a958-2ff7-d6b1-c1bd509d666b")
public static String es_PE_FIELD_ImportReportLineSet_ReportLine_Name="Item de Informe";

@XendraField(AD_Column_ID="PA_ReportLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6af654ba-a958-2ff7-d6b1-c1bd509d666b")
public static final String FIELDNAME_ImportReportLineSet_ReportLine="6af654ba-a958-2ff7-d6b1-c1bd509d666b";

@XendraTrl(Identifier="79691735-a6d4-68b9-41ba-154d33d6e9e6")
public static String es_PE_COLUMN_PA_ReportLine_ID_Name="Línea de Informe";

@XendraColumn(AD_Element_ID="52ed6403-4961-3af8-0136-2d580aef2758",ColumnName="PA_ReportLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79691735-a6d4-68b9-41ba-154d33d6e9e6",
Synchronized="2017-08-05 16:54:58.0")
/** Column name PA_ReportLine_ID */
public static final String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
/** Set Report Line Set.
@param PA_ReportLineSet_ID Report Line Set */
public void setPA_ReportLineSet_ID (int PA_ReportLineSet_ID)
{
if (PA_ReportLineSet_ID <= 0) set_Value (COLUMNNAME_PA_ReportLineSet_ID, null);
 else 
set_Value (COLUMNNAME_PA_ReportLineSet_ID, Integer.valueOf(PA_ReportLineSet_ID));
}
/** Get Report Line Set.
@return Report Line Set */
public int getPA_ReportLineSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLineSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1c922384-ac15-dd81-cf88-4e7c3da90b2d")
public static String es_PE_FIELD_ImportReportLineSet_ReportLineSet_Name="Establecer Línea de Informe";

@XendraField(AD_Column_ID="PA_ReportLineSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c922384-ac15-dd81-cf88-4e7c3da90b2d")
public static final String FIELDNAME_ImportReportLineSet_ReportLineSet="1c922384-ac15-dd81-cf88-4e7c3da90b2d";

@XendraTrl(Identifier="a183806c-24cd-3767-61d3-198db8358056")
public static String es_PE_COLUMN_PA_ReportLineSet_ID_Name="Establecer Línea de Informe";

@XendraColumn(AD_Element_ID="71d54bec-2aa5-e5e8-5306-b5fa80ab086e",
ColumnName="PA_ReportLineSet_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a183806c-24cd-3767-61d3-198db8358056",Synchronized="2017-08-05 16:54:58.0")
/** Column name PA_ReportLineSet_ID */
public static final String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";
/** Set Report Source.
@param PA_ReportSource_ID Restriction of what will be shown in Report Line */
public void setPA_ReportSource_ID (int PA_ReportSource_ID)
{
if (PA_ReportSource_ID <= 0) set_Value (COLUMNNAME_PA_ReportSource_ID, null);
 else 
set_Value (COLUMNNAME_PA_ReportSource_ID, Integer.valueOf(PA_ReportSource_ID));
}
/** Get Report Source.
@return Restriction of what will be shown in Report Line */
public int getPA_ReportSource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportSource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f98402e-1c6c-49e6-cb07-39ff6930e87a")
public static String es_PE_FIELD_ImportReportLineSet_ReportSource_Description="Restricción de lo que será mostrado en la línea del Informe";

@XendraTrl(Identifier="1f98402e-1c6c-49e6-cb07-39ff6930e87a")
public static String es_PE_FIELD_ImportReportLineSet_ReportSource_Name="Fuente de Informe";

@XendraField(AD_Column_ID="PA_ReportSource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f98402e-1c6c-49e6-cb07-39ff6930e87a")
public static final String FIELDNAME_ImportReportLineSet_ReportSource="1f98402e-1c6c-49e6-cb07-39ff6930e87a";

@XendraTrl(Identifier="1eae9430-98b8-8136-7a10-8a172b8d620e")
public static String es_PE_COLUMN_PA_ReportSource_ID_Name="Fuente de Informe";

@XendraColumn(AD_Element_ID="3bdb3470-2383-5a79-8ffb-392c086b14e0",ColumnName="PA_ReportSource_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1eae9430-98b8-8136-7a10-8a172b8d620e",
Synchronized="2017-08-05 16:54:58.0")
/** Column name PA_ReportSource_ID */
public static final String COLUMNNAME_PA_ReportSource_ID = "PA_ReportSource_ID";

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

@XendraTrl(Identifier="82f62587-3eea-73ef-9dca-bf4252d36a87")
public static String es_PE_FIELD_ImportReportLineSet_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="82f62587-3eea-73ef-9dca-bf4252d36a87")
public static String es_PE_FIELD_ImportReportLineSet_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraTrl(Identifier="82f62587-3eea-73ef-9dca-bf4252d36a87")
public static String es_PE_FIELD_ImportReportLineSet_PostingType_Name="Tipo de Aplicación";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82f62587-3eea-73ef-9dca-bf4252d36a87")
public static final String FIELDNAME_ImportReportLineSet_PostingType="82f62587-3eea-73ef-9dca-bf4252d36a87";

@XendraTrl(Identifier="857a6ffa-c5d3-3516-58c2-2c73823701d4")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="857a6ffa-c5d3-3516-58c2-2c73823701d4",Synchronized="2017-08-05 16:54:58.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
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

@XendraTrl(Identifier="cb8fb556-95db-3634-b972-9c48d0802318")
public static String es_PE_FIELD_ImportReportLineSet_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="cb8fb556-95db-3634-b972-9c48d0802318")
public static String es_PE_FIELD_ImportReportLineSet_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="cb8fb556-95db-3634-b972-9c48d0802318")
public static String es_PE_FIELD_ImportReportLineSet_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb8fb556-95db-3634-b972-9c48d0802318")
public static final String FIELDNAME_ImportReportLineSet_Processed="cb8fb556-95db-3634-b972-9c48d0802318";

@XendraTrl(Identifier="9414de97-dac9-cb1c-2ccf-2da3130cd2ef")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9414de97-dac9-cb1c-2ccf-2da3130cd2ef",
Synchronized="2017-08-05 16:54:58.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="12ed3624-039a-224a-e0b1-2f5115ac7e1d")
public static String es_PE_FIELD_ImportReportLineSet_ProcessNow_Description="Importa lote de líneas de información ";

@XendraTrl(Identifier="12ed3624-039a-224a-e0b1-2f5115ac7e1d")
public static String es_PE_FIELD_ImportReportLineSet_ProcessNow_Name="Importa lote de líneas de Informe";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12ed3624-039a-224a-e0b1-2f5115ac7e1d")
public static final String FIELDNAME_ImportReportLineSet_ProcessNow="12ed3624-039a-224a-e0b1-2f5115ac7e1d";

@XendraTrl(Identifier="3dc7381f-f3a0-3354-c7d6-d5ef3d34abf9")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="44600fbb-7d13-03ff-277e-249bb341e799",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3dc7381f-f3a0-3354-c7d6-d5ef3d34abf9",Synchronized="2017-08-05 16:54:58.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Report Line Set Name.
@param ReportLineSetName Name of the Report Line Set */
public void setReportLineSetName (String ReportLineSetName)
{
if (ReportLineSetName != null && ReportLineSetName.length() > 60)
{
log.warning("Length > 60 - truncated");
ReportLineSetName = ReportLineSetName.substring(0,59);
}
set_Value (COLUMNNAME_ReportLineSetName, ReportLineSetName);
}
/** Get Report Line Set Name.
@return Name of the Report Line Set */
public String getReportLineSetName() 
{
String value = (String)get_Value(COLUMNNAME_ReportLineSetName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f39a1595-87ee-5f1d-ca92-8d325edc0af1")
public static String es_PE_FIELD_ImportReportLineSet_ReportLineSetName_Description="Nombre del sistema del Item de informe";

@XendraTrl(Identifier="f39a1595-87ee-5f1d-ca92-8d325edc0af1")
public static String es_PE_FIELD_ImportReportLineSet_ReportLineSetName_Name="Item Conjunto de nombre para informe";

@XendraField(AD_Column_ID="ReportLineSetName",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f39a1595-87ee-5f1d-ca92-8d325edc0af1")
public static final String FIELDNAME_ImportReportLineSet_ReportLineSetName="f39a1595-87ee-5f1d-ca92-8d325edc0af1";

@XendraTrl(Identifier="31dc9c18-c640-58e8-65ad-871e320608f1")
public static String es_PE_COLUMN_ReportLineSetName_Name="Línea Conjunto de nombre para informe";

@XendraColumn(AD_Element_ID="425c6920-96d8-c66b-d3ca-3358a9c1e5ed",ColumnName="ReportLineSetName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31dc9c18-c640-58e8-65ad-871e320608f1",
Synchronized="2017-08-05 16:54:58.0")
/** Column name ReportLineSetName */
public static final String COLUMNNAME_ReportLineSetName = "ReportLineSetName";
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

@XendraTrl(Identifier="7dd1a12c-4ae1-99db-9d40-9b6f6b1ba079")
public static String es_PE_FIELD_ImportReportLineSet_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="7dd1a12c-4ae1-99db-9d40-9b6f6b1ba079")
public static String es_PE_FIELD_ImportReportLineSet_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="7dd1a12c-4ae1-99db-9d40-9b6f6b1ba079")
public static String es_PE_FIELD_ImportReportLineSet_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="749abf01-be36-991d-704c-bfabe0dc2484",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7dd1a12c-4ae1-99db-9d40-9b6f6b1ba079")
public static final String FIELDNAME_ImportReportLineSet_Sequence="7dd1a12c-4ae1-99db-9d40-9b6f6b1ba079";

@XendraTrl(Identifier="4843e517-fb82-4d68-3667-c087853629c1")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4843e517-fb82-4d68-3667-c087853629c1",
Synchronized="2017-08-05 16:54:58.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
