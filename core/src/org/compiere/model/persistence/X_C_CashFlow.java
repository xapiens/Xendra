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
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.model.reference.REF_C_CashFlow_Group_Sign;
/** Generated Model for C_CashFlow
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CashFlow extends PO
{
/** Standard Constructor
@param ctx context
@param C_CashFlow_ID id
@param trxName transaction
*/
public X_C_CashFlow (Properties ctx, int C_CashFlow_ID, String trxName)
{
super (ctx, C_CashFlow_ID, trxName);
/** if (C_CashFlow_ID == 0)
{
setAD_Table_ID (0);
setAmount (Env.ZERO);
setC_Cashflow_Group_ID (0);
setC_CashFlow_ID (0);
setDateTrx (new Timestamp(System.currentTimeMillis()));
setIsRecurring (false);	
// N
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
public X_C_CashFlow (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000034 */
public static int Table_ID=MTable.getTable_ID("C_CashFlow");

@XendraTrl(Identifier="10215d9b-32d5-d50c-32c8-fbea30ee1191")
public static String es_PE_TAB_CashFlowForecast_Name="Flujo de Caja";

@XendraTab(Name="Cash Flow Forecast",Description="",Help="",
AD_Window_ID="6e5a9141-a2b7-2b6b-881b-279eb8a57091",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="10215d9b-32d5-d50c-32c8-fbea30ee1191",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CashFlowForecast="10215d9b-32d5-d50c-32c8-fbea30ee1191";

@XendraTrl(Identifier="67d7c350-322f-79f4-b155-ef4565e71e84")
public static String es_PE_TABLE_C_CashFlow_Name="Cash Flow";

@XendraTable(Name="Cash Flow",Description="Cash Flow",Help="",TableName="C_CashFlow",
AccessLevel="3",AD_Window_ID="6e5a9141-a2b7-2b6b-881b-279eb8a57091",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="67d7c350-322f-79f4-b155-ef4565e71e84",Synchronized="2017-08-16 11:41:36.0")
/** TableName=C_CashFlow */
public static final String Table_Name="C_CashFlow";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CashFlow");

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
    Table_ID = MTable.getTable_ID("C_CashFlow");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CashFlow[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="27175bcd-5a42-a437-9838-d49fce33e3d9")
public static String es_PE_FIELD_CashFlowForecast_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="27175bcd-5a42-a437-9838-d49fce33e3d9")
public static String es_PE_FIELD_CashFlowForecast_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="27175bcd-5a42-a437-9838-d49fce33e3d9")
public static String es_PE_FIELD_CashFlowForecast_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27175bcd-5a42-a437-9838-d49fce33e3d9")
public static final String FIELDNAME_CashFlowForecast_Table="27175bcd-5a42-a437-9838-d49fce33e3d9";

@XendraTrl(Identifier="431a0909-e2c9-e90f-8798-fe7d589bd176")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="431a0909-e2c9-e90f-8798-fe7d589bd176",
Synchronized="2017-08-05 16:53:27.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
if (Amount == null) throw new IllegalArgumentException ("Amount is mandatory.");
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="686e8ef2-baff-78cf-2ebb-b127fad2f0db")
public static String es_PE_FIELD_CashFlowForecast_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="686e8ef2-baff-78cf-2ebb-b127fad2f0db")
public static String es_PE_FIELD_CashFlowForecast_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="686e8ef2-baff-78cf-2ebb-b127fad2f0db")
public static String es_PE_FIELD_CashFlowForecast_Amount_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="686e8ef2-baff-78cf-2ebb-b127fad2f0db")
public static final String FIELDNAME_CashFlowForecast_Amount="686e8ef2-baff-78cf-2ebb-b127fad2f0db";

@XendraTrl(Identifier="61572fbc-142e-e00e-8154-f5ae9b1c9dfd")
public static String es_PE_COLUMN_Amount_Name="Total";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61572fbc-142e-e00e-8154-f5ae9b1c9dfd",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set Cash Flow Category.
@param C_Cashflow_Group_ID Cash Flow Category  */
public void setC_Cashflow_Group_ID (int C_Cashflow_Group_ID)
{
if (C_Cashflow_Group_ID < 1) throw new IllegalArgumentException ("C_Cashflow_Group_ID is mandatory.");
set_Value (COLUMNNAME_C_Cashflow_Group_ID, Integer.valueOf(C_Cashflow_Group_ID));
}
/** Get Cash Flow Category.
@return Cash Flow Category  */
public int getC_Cashflow_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cashflow_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ee606237-59d1-8312-caed-7038174e6ee6")
public static String es_PE_FIELD_CashFlowForecast_CashFlowCategory_Name="Categoría Flujo";

@XendraField(AD_Column_ID="C_Cashflow_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee606237-59d1-8312-caed-7038174e6ee6")
public static final String FIELDNAME_CashFlowForecast_CashFlowCategory="ee606237-59d1-8312-caed-7038174e6ee6";

@XendraTrl(Identifier="3e25eb10-d8c9-72c9-d4ea-74efab94a53d")
public static String es_PE_COLUMN_C_Cashflow_Group_ID_Name="Cash Flow Category";

@XendraColumn(AD_Element_ID="d6ea8b87-4b95-2b42-c8d2-26b382da1f6c",
ColumnName="C_Cashflow_Group_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3e25eb10-d8c9-72c9-d4ea-74efab94a53d",Synchronized="2017-08-05 16:53:27.0")
/** Column name C_Cashflow_Group_ID */
public static final String COLUMNNAME_C_Cashflow_Group_ID = "C_Cashflow_Group_ID";
/** Set Cash Flow.
@param C_CashFlow_ID Cash Flow */
public void setC_CashFlow_ID (int C_CashFlow_ID)
{
if (C_CashFlow_ID < 1) throw new IllegalArgumentException ("C_CashFlow_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashFlow_ID, Integer.valueOf(C_CashFlow_ID));
}
/** Get Cash Flow.
@return Cash Flow */
public int getC_CashFlow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashFlow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a190a493-1118-d81d-a0b1-b432def1aece")
public static String es_PE_FIELD_CashFlowForecast_CashFlow_Name="Cash Flow";

@XendraField(AD_Column_ID="C_CashFlow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a190a493-1118-d81d-a0b1-b432def1aece")
public static final String FIELDNAME_CashFlowForecast_CashFlow="a190a493-1118-d81d-a0b1-b432def1aece";
/** Column name C_CashFlow_ID */
public static final String COLUMNNAME_C_CashFlow_ID = "C_CashFlow_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94c7528f-df80-a5ce-2cc6-282bd2517b84")
public static String es_PE_FIELD_CashFlowForecast_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="94c7528f-df80-a5ce-2cc6-282bd2517b84")
public static String es_PE_FIELD_CashFlowForecast_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="94c7528f-df80-a5ce-2cc6-282bd2517b84")
public static String es_PE_FIELD_CashFlowForecast_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94c7528f-df80-a5ce-2cc6-282bd2517b84")
public static final String FIELDNAME_CashFlowForecast_Currency="94c7528f-df80-a5ce-2cc6-282bd2517b84";

@XendraTrl(Identifier="cfff7929-9437-ecb8-f4e8-0ee93541ef7d")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfff7929-9437-ecb8-f4e8-0ee93541ef7d",
Synchronized="2017-08-05 16:53:27.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
if (DateTrx == null) throw new IllegalArgumentException ("DateTrx is mandatory.");
set_Value (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="ac0c35fd-5847-d147-27d3-eea44bdcacf8")
public static String es_PE_FIELD_CashFlowForecast_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="ac0c35fd-5847-d147-27d3-eea44bdcacf8")
public static String es_PE_FIELD_CashFlowForecast_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="ac0c35fd-5847-d147-27d3-eea44bdcacf8")
public static String es_PE_FIELD_CashFlowForecast_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac0c35fd-5847-d147-27d3-eea44bdcacf8")
public static final String FIELDNAME_CashFlowForecast_TransactionDate="ac0c35fd-5847-d147-27d3-eea44bdcacf8";

@XendraTrl(Identifier="7f33b4e7-2921-f6d9-c4d8-0da3321242d8")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f33b4e7-2921-f6d9-c4d8-0da3321242d8",
Synchronized="2017-08-05 16:53:27.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
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

@XendraTrl(Identifier="fc052f81-ac79-e2a5-ce10-a80b2d870bed")
public static String es_PE_FIELD_CashFlowForecast_Description_Description="Observación";

@XendraTrl(Identifier="fc052f81-ac79-e2a5-ce10-a80b2d870bed")
public static String es_PE_FIELD_CashFlowForecast_Description_Help="Observación";

@XendraTrl(Identifier="fc052f81-ac79-e2a5-ce10-a80b2d870bed")
public static String es_PE_FIELD_CashFlowForecast_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc052f81-ac79-e2a5-ce10-a80b2d870bed")
public static final String FIELDNAME_CashFlowForecast_Description="fc052f81-ac79-e2a5-ce10-a80b2d870bed";

@XendraTrl(Identifier="6a2af354-c890-672f-1d43-6b03045e4ecf")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a2af354-c890-672f-1d43-6b03045e4ecf",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Frequency.
@param Frequency Frequency of events */
public void setFrequency (int Frequency)
{
set_Value (COLUMNNAME_Frequency, Integer.valueOf(Frequency));
}
/** Get Frequency.
@return Frequency of events */
public int getFrequency() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Frequency);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="17e2c232-92a7-dd35-f4aa-b62b30bf3c84")
public static String es_PE_FIELD_CashFlowForecast_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="17e2c232-92a7-dd35-f4aa-b62b30bf3c84")
public static String es_PE_FIELD_CashFlowForecast_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraTrl(Identifier="17e2c232-92a7-dd35-f4aa-b62b30bf3c84")
public static String es_PE_FIELD_CashFlowForecast_Frequency_Name="Frecuencia";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@isRecurring@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="17e2c232-92a7-dd35-f4aa-b62b30bf3c84")
public static final String FIELDNAME_CashFlowForecast_Frequency="17e2c232-92a7-dd35-f4aa-b62b30bf3c84";

@XendraTrl(Identifier="ce1b9922-23d2-de4f-2966-33eb07f07221")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce1b9922-23d2-de4f-2966-33eb07f07221",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Frequency */
public static final String COLUMNNAME_Frequency = "Frequency";

/** FrequencyType AD_Reference=a8e24598-16fb-a392-7587-12a112938032 */
public static final int FREQUENCYTYPE_AD_Reference_ID=221;
/** Set Frequency Type.
@param FrequencyType Frequency of event */
public void setFrequencyType (String FrequencyType)
{
if (FrequencyType == null || FrequencyType.equals(REF__FrequencyType.Minute) || FrequencyType.equals(REF__FrequencyType.Hour) || FrequencyType.equals(REF__FrequencyType.Day) || FrequencyType.equals(REF__FrequencyType.Once) || FrequencyType.equals(REF__FrequencyType.Notification));
 else throw new IllegalArgumentException ("FrequencyType Invalid value - " + FrequencyType + " - Reference_ID=221 - M - H - D - O - N");
if (FrequencyType != null && FrequencyType.length() > 1)
{
log.warning("Length > 1 - truncated");
FrequencyType = FrequencyType.substring(0,0);
}
set_Value (COLUMNNAME_FrequencyType, FrequencyType);
}
/** Get Frequency Type.
@return Frequency of event */
public String getFrequencyType() 
{
return (String)get_Value(COLUMNNAME_FrequencyType);
}

@XendraTrl(Identifier="8db0c7d0-50e2-561c-39fe-e362a34591c3")
public static String es_PE_FIELD_CashFlowForecast_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="8db0c7d0-50e2-561c-39fe-e362a34591c3")
public static String es_PE_FIELD_CashFlowForecast_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraTrl(Identifier="8db0c7d0-50e2-561c-39fe-e362a34591c3")
public static String es_PE_FIELD_CashFlowForecast_FrequencyType_Name="Tipo de Frecuencia";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@isRecurring@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8db0c7d0-50e2-561c-39fe-e362a34591c3")
public static final String FIELDNAME_CashFlowForecast_FrequencyType="8db0c7d0-50e2-561c-39fe-e362a34591c3";

@XendraTrl(Identifier="7d6f94b9-b637-3c2f-3c00-e2b8cae76349")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7d6f94b9-b637-3c2f-3c00-e2b8cae76349",Synchronized="2017-08-05 16:53:27.0")
/** Column name FrequencyType */
public static final String COLUMNNAME_FrequencyType = "FrequencyType";
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
@XendraTrl(Identifier="b370a2c8-79d5-4f5e-872a-68cd905a0bcd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b370a2c8-79d5-4f5e-872a-68cd905a0bcd",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsRecurring.
@param IsRecurring IsRecurring */
public void setIsRecurring (boolean IsRecurring)
{
set_Value (COLUMNNAME_IsRecurring, Boolean.valueOf(IsRecurring));
}
/** Get IsRecurring.
@return IsRecurring */
public boolean isRecurring() 
{
Object oo = get_Value(COLUMNNAME_IsRecurring);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="04f7787d-155e-daea-05bb-f9976f164e76")
public static String es_PE_FIELD_CashFlowForecast_IsRecurring_Name="Recurrente";

@XendraField(AD_Column_ID="IsRecurring",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04f7787d-155e-daea-05bb-f9976f164e76")
public static final String FIELDNAME_CashFlowForecast_IsRecurring="04f7787d-155e-daea-05bb-f9976f164e76";

@XendraTrl(Identifier="7ec7d438-8783-698c-2bc0-d7028f210881")
public static String es_PE_COLUMN_IsRecurring_Name="isrecurring";

@XendraColumn(AD_Element_ID="c8dbd58c-d945-ef72-78f8-b347d0f4f314",ColumnName="IsRecurring",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ec7d438-8783-698c-2bc0-d7028f210881",
Synchronized="2017-08-05 16:53:27.0")
/** Column name IsRecurring */
public static final String COLUMNNAME_IsRecurring = "IsRecurring";
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

@XendraTrl(Identifier="6a7c9f28-4a51-b0bd-2bfe-ca59f0eb132f")
public static String es_PE_FIELD_CashFlowForecast_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="6a7c9f28-4a51-b0bd-2bfe-ca59f0eb132f")
public static String es_PE_FIELD_CashFlowForecast_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="6a7c9f28-4a51-b0bd-2bfe-ca59f0eb132f")
public static String es_PE_FIELD_CashFlowForecast_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a7c9f28-4a51-b0bd-2bfe-ca59f0eb132f")
public static final String FIELDNAME_CashFlowForecast_Processed="6a7c9f28-4a51-b0bd-2bfe-ca59f0eb132f";

@XendraTrl(Identifier="72b2b387-583f-76be-61ed-b5ecbb2afbed")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72b2b387-583f-76be-61ed-b5ecbb2afbed",
Synchronized="2017-08-05 16:53:27.0")
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

@XendraTrl(Identifier="780b8fae-f0f6-6b7d-9088-4d43ba6dc12a")
public static String es_PE_FIELD_CashFlowForecast_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="780b8fae-f0f6-6b7d-9088-4d43ba6dc12a")
public static final String FIELDNAME_CashFlowForecast_ProcessNow="780b8fae-f0f6-6b7d-9088-4d43ba6dc12a";

@XendraTrl(Identifier="f2ce3757-867e-a736-2f7b-f0b5051c75f2")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2ce3757-867e-a736-2f7b-f0b5051c75f2",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a45b8245-59a4-0a6c-3d72-74fc1758c098")
public static String es_PE_FIELD_CashFlowForecast_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="a45b8245-59a4-0a6c-3d72-74fc1758c098")
public static String es_PE_FIELD_CashFlowForecast_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="a45b8245-59a4-0a6c-3d72-74fc1758c098")
public static String es_PE_FIELD_CashFlowForecast_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a45b8245-59a4-0a6c-3d72-74fc1758c098")
public static final String FIELDNAME_CashFlowForecast_RecordID="a45b8245-59a4-0a6c-3d72-74fc1758c098";

@XendraTrl(Identifier="544a8b48-5290-954a-c5ef-178dcdae7827")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="544a8b48-5290-954a-c5ef-178dcdae7827",
Synchronized="2017-08-05 16:53:27.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";

/** Sign AD_Reference=b2bdca74-40ef-ac86-9876-56171a31e4bc */
public static final int SIGN_AD_Reference_ID=1000008;
/** Set Sign.
@param Sign Sign */
public void setSign (String Sign)
{
if (Sign == null || Sign.equals(REF_C_CashFlow_Group_Sign.InFlow) || Sign.equals(REF_C_CashFlow_Group_Sign.OutFlow));
 else throw new IllegalArgumentException ("Sign Invalid value - " + Sign + " - Reference_ID=1000008 - I - O");
if (Sign != null && Sign.length() > 1)
{
log.warning("Length > 1 - truncated");
Sign = Sign.substring(0,0);
}
set_Value (COLUMNNAME_Sign, Sign);
}
/** Get Sign.
@return Sign */
public String getSign() 
{
return (String)get_Value(COLUMNNAME_Sign);
}

@XendraTrl(Identifier="71a4b5ed-f234-02e7-9fda-c773ab7cdb68")
public static String es_PE_FIELD_CashFlowForecast_Sign_Name="Tipo";

@XendraField(AD_Column_ID="Sign",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71a4b5ed-f234-02e7-9fda-c773ab7cdb68")
public static final String FIELDNAME_CashFlowForecast_Sign="71a4b5ed-f234-02e7-9fda-c773ab7cdb68";

@XendraTrl(Identifier="e205de06-5b77-f97f-8623-41a129764279")
public static String es_PE_COLUMN_Sign_Name="sign";

@XendraColumn(AD_Element_ID="e9ae10c1-d3d6-3d6e-38f0-321292bbc550",ColumnName="Sign",
AD_Reference_ID=17,AD_Reference_Value_ID="b2bdca74-40ef-ac86-9876-56171a31e4bc",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e205de06-5b77-f97f-8623-41a129764279",Synchronized="2017-08-05 16:53:27.0")
/** Column name Sign */
public static final String COLUMNNAME_Sign = "Sign";
/** Set UntilDate.
@param UntilDate UntilDate */
public void setUntilDate (Timestamp UntilDate)
{
set_Value (COLUMNNAME_UntilDate, UntilDate);
}
/** Get UntilDate.
@return UntilDate */
public Timestamp getUntilDate() 
{
return (Timestamp)get_Value(COLUMNNAME_UntilDate);
}

@XendraTrl(Identifier="eda1e4bd-40c8-feed-1ec3-990975ed69b1")
public static String es_PE_FIELD_CashFlowForecast_UntilDate_Name="untildate";

@XendraField(AD_Column_ID="UntilDate",IsCentrallyMaintained=true,
AD_Tab_ID="10215d9b-32d5-d50c-32c8-fbea30ee1191",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@isRecurring@=Y",DisplayLength=29,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="eda1e4bd-40c8-feed-1ec3-990975ed69b1")
public static final String FIELDNAME_CashFlowForecast_UntilDate="eda1e4bd-40c8-feed-1ec3-990975ed69b1";

@XendraTrl(Identifier="156e463f-d504-7b68-61d0-acef2aa96663")
public static String es_PE_COLUMN_UntilDate_Name="untildate";

@XendraColumn(AD_Element_ID="f676b248-0d0f-6daf-9ef8-6649fb598fff",ColumnName="UntilDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="156e463f-d504-7b68-61d0-acef2aa96663",
Synchronized="2017-08-05 16:53:27.0")
/** Column name UntilDate */
public static final String COLUMNNAME_UntilDate = "UntilDate";
}
