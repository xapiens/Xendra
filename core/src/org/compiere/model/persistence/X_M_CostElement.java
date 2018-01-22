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
import org.compiere.model.reference.REF_M_CostElementType;
import org.compiere.model.reference.REF_C_AcctSchemaCostingMethod;
/** Generated Model for M_CostElement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_CostElement extends PO
{
/** Standard Constructor
@param ctx context
@param M_CostElement_ID id
@param trxName transaction
*/
public X_M_CostElement (Properties ctx, int M_CostElement_ID, String trxName)
{
super (ctx, M_CostElement_ID, trxName);
/** if (M_CostElement_ID == 0)
{
setC_Currency_ID (0);
setCostElementType (null);
setIsCalculated (false);	
// N
setM_CostElement_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_CostElement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=770 */
public static int Table_ID=MTable.getTable_ID("M_CostElement");

@XendraTrl(Identifier="2b4d05ba-72f8-8539-454c-8e9c23cafc8b")
public static String es_PE_TAB_CostElement_Description="Mantenga los elementos de costo del producto";

@XendraTrl(Identifier="2b4d05ba-72f8-8539-454c-8e9c23cafc8b")
public static String es_PE_TAB_CostElement_Name="Elemento de Costo";

@XendraTrl(Identifier="2b4d05ba-72f8-8539-454c-8e9c23cafc8b")
public static String es_PE_TAB_CostElement_Help="Usted puede mantener multiples costos de materiales. Cuando el costo de material mecanografía se utiliza para la contabilidad es determinado por metodo de costeo .<br > defina un método de costo (para los elementos materiales) solamente si usted desea el costo calculado para ese método de costo. Para la contabilidad, el método de costo definido en la categoría de cuenta del esquema ó del producto de la contabilidad se utiliza.";

@XendraTab(Name="Cost Element",Description="Maintain product cost elements",
Help="You can maintain multiple Material Costs. Which of the Material Cost Types is used for accounting is determined by the costing method.<br> Define a Costing Method (for Material Elements) only if you want the cost calculated for that costing method. For accounting, the costing method defined in the Accounting Schema or Product Category Acct is used.",
AD_Window_ID="8f43274c-668e-5d6f-3ea4-33063cdc818b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CostElement="2b4d05ba-72f8-8539-454c-8e9c23cafc8b";

@XendraTrl(Identifier="e592055d-e73a-5625-2311-cd197c5a2db1")
public static String es_PE_TABLE_M_CostElement_Name="Elemento de Costo";

@XendraTable(Name="Cost Element",Description="",Help="",TableName="M_CostElement",AccessLevel="2",
AD_Window_ID="8f43274c-668e-5d6f-3ea4-33063cdc818b",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="e592055d-e73a-5625-2311-cd197c5a2db1",
Synchronized="2017-08-16 11:43:08.0")
/** TableName=M_CostElement */
public static final String Table_Name="M_CostElement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_CostElement");

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
    Table_ID = MTable.getTable_ID("M_CostElement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_CostElement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="affc75cf-086a-4d96-864f-80a9c8f9ad97")
public static String es_PE_FIELD_CostElement_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="affc75cf-086a-4d96-864f-80a9c8f9ad97")
public static String es_PE_FIELD_CostElement_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="affc75cf-086a-4d96-864f-80a9c8f9ad97")
public static String es_PE_FIELD_CostElement_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-04 15:36:15.0",
Identifier="affc75cf-086a-4d96-864f-80a9c8f9ad97")
public static final String FIELDNAME_CostElement_Currency="affc75cf-086a-4d96-864f-80a9c8f9ad97";

@XendraTrl(Identifier="1ee40440-72c4-4b90-8504-5c771e33de25")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ee40440-72c4-4b90-8504-5c771e33de25",
Synchronized="2017-08-05 16:55:03.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

/** CostElementType AD_Reference=c39dbce7-fd9c-ebfe-db45-4538a1812270 */
public static final int COSTELEMENTTYPE_AD_Reference_ID=338;
/** Set Cost Element Type.
@param CostElementType Type of Cost Element */
public void setCostElementType (String CostElementType)
{
if (CostElementType == null) throw new IllegalArgumentException ("CostElementType is mandatory");
if (CostElementType.equals(REF_M_CostElementType.BurdenMOverhead) || CostElementType.equals(REF_M_CostElementType.Material) || CostElementType.equals(REF_M_CostElementType.Overhead) || CostElementType.equals(REF_M_CostElementType.OutsideProcessing) || CostElementType.equals(REF_M_CostElementType.Resource));
 else throw new IllegalArgumentException ("CostElementType Invalid value - " + CostElementType + " - Reference_ID=338 - B - M - O - X - R");
if (CostElementType.length() > 1)
{
log.warning("Length > 1 - truncated");
CostElementType = CostElementType.substring(0,0);
}
set_Value (COLUMNNAME_CostElementType, CostElementType);
}
/** Get Cost Element Type.
@return Type of Cost Element */
public String getCostElementType() 
{
return (String)get_Value(COLUMNNAME_CostElementType);
}

@XendraTrl(Identifier="442dee54-04f7-4b38-f480-673ddac4c9b0")
public static String es_PE_FIELD_CostElement_CostElementType_Description="Tipo de costo del elemento";

@XendraTrl(Identifier="442dee54-04f7-4b38-f480-673ddac4c9b0")
public static String es_PE_FIELD_CostElement_CostElementType_Name="Tipo de Costo del Elemento";

@XendraField(AD_Column_ID="CostElementType",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="442dee54-04f7-4b38-f480-673ddac4c9b0")
public static final String FIELDNAME_CostElement_CostElementType="442dee54-04f7-4b38-f480-673ddac4c9b0";

@XendraTrl(Identifier="e7c01e56-5ea0-7a55-86a5-5afe69851ef7")
public static String es_PE_COLUMN_CostElementType_Name="Tipo de Costo del Elemento";

@XendraColumn(AD_Element_ID="b120e647-4030-6836-6993-05fb4fb96f19",ColumnName="CostElementType",
AD_Reference_ID=17,AD_Reference_Value_ID="c39dbce7-fd9c-ebfe-db45-4538a1812270",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@IsCalculated@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e7c01e56-5ea0-7a55-86a5-5afe69851ef7",Synchronized="2017-08-05 16:55:03.0")
/** Column name CostElementType */
public static final String COLUMNNAME_CostElementType = "CostElementType";

/** CostingMethod AD_Reference=f784bd15-8b38-c388-3a0e-a0ae23b717ec */
public static final int COSTINGMETHOD_AD_Reference_ID=122;
/** Set Costing Method.
@param CostingMethod Indicates how Costs will be calculated */
public void setCostingMethod (String CostingMethod)
{
if (CostingMethod == null || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.LastPOPrice) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod._) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.StandardCosting) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.AveragePO) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.Lifo) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.Fifo) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.AverageInvoice) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.AverageWarehouse) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.LastInvoice) || CostingMethod.equals(REF_C_AcctSchemaCostingMethod.UserDefined));
 else throw new IllegalArgumentException ("CostingMethod Invalid value - " + CostingMethod + " - Reference_ID=122 - p - x - S - A - L - F - I - W - i - U");
if (CostingMethod != null && CostingMethod.length() > 1)
{
log.warning("Length > 1 - truncated");
CostingMethod = CostingMethod.substring(0,0);
}
set_Value (COLUMNNAME_CostingMethod, CostingMethod);
}
/** Get Costing Method.
@return Indicates how Costs will be calculated */
public String getCostingMethod() 
{
return (String)get_Value(COLUMNNAME_CostingMethod);
}

@XendraTrl(Identifier="83272e2a-5abc-27ad-946b-00314ac9f82c")
public static String es_PE_FIELD_CostElement_CostingMethod_Description="Indica cómo serán calculados los costos";

@XendraTrl(Identifier="83272e2a-5abc-27ad-946b-00314ac9f82c")
public static String es_PE_FIELD_CostElement_CostingMethod_Help="El método de costeo indica cómo se calcularán los costos (Estándar; promedio)";

@XendraTrl(Identifier="83272e2a-5abc-27ad-946b-00314ac9f82c")
public static String es_PE_FIELD_CostElement_CostingMethod_Name="Método de Costeo";

@XendraField(AD_Column_ID="CostingMethod",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CostElementType@=M",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="83272e2a-5abc-27ad-946b-00314ac9f82c")
public static final String FIELDNAME_CostElement_CostingMethod="83272e2a-5abc-27ad-946b-00314ac9f82c";

@XendraTrl(Identifier="0f999935-bee0-0a50-590b-419387ec191d")
public static String es_PE_COLUMN_CostingMethod_Name="Método de Costeo";

@XendraColumn(AD_Element_ID="d3c72366-8d7e-1b49-ef94-f5412c3f434c",ColumnName="CostingMethod",
AD_Reference_ID=17,AD_Reference_Value_ID="f784bd15-8b38-c388-3a0e-a0ae23b717ec",
AD_Val_Rule_ID="62983f4c-0f5e-8a77-2189-53895351bcb2",FieldLength=1,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsCalculated@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0f999935-bee0-0a50-590b-419387ec191d",Synchronized="2017-08-05 16:55:03.0")
/** Column name CostingMethod */
public static final String COLUMNNAME_CostingMethod = "CostingMethod";
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

@XendraTrl(Identifier="73052d0b-d23b-fabf-564e-2e7a56b8aa56")
public static String es_PE_FIELD_CostElement_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="73052d0b-d23b-fabf-564e-2e7a56b8aa56")
public static String es_PE_FIELD_CostElement_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="73052d0b-d23b-fabf-564e-2e7a56b8aa56")
public static String es_PE_FIELD_CostElement_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73052d0b-d23b-fabf-564e-2e7a56b8aa56")
public static final String FIELDNAME_CostElement_Description="73052d0b-d23b-fabf-564e-2e7a56b8aa56";

@XendraTrl(Identifier="bce69383-7987-d414-59cb-6b7430daeb10")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bce69383-7987-d414-59cb-6b7430daeb10",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="39b867d7-c98d-4be1-829e-f76655760115")
public static String es_PE_FIELD_CostElement_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-04 15:36:15.0",
Identifier="39b867d7-c98d-4be1-829e-f76655760115")
public static final String FIELDNAME_CostElement_Identifier="39b867d7-c98d-4be1-829e-f76655760115";

@XendraTrl(Identifier="c4877ff3-f402-4a06-a906-a3d9242631f5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4877ff3-f402-4a06-a906-a3d9242631f5",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Calculated.
@param IsCalculated The value is calculated by the system */
public void setIsCalculated (boolean IsCalculated)
{
set_Value (COLUMNNAME_IsCalculated, Boolean.valueOf(IsCalculated));
}
/** Get Calculated.
@return The value is calculated by the system */
public boolean isCalculated() 
{
Object oo = get_Value(COLUMNNAME_IsCalculated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c6161ed0-fa51-8cbf-b9b6-31f9002d83d9")
public static String es_PE_FIELD_CostElement_Calculated_Description="El valor es calculado por el sistema";

@XendraTrl(Identifier="c6161ed0-fa51-8cbf-b9b6-31f9002d83d9")
public static String es_PE_FIELD_CostElement_Calculated_Name="Calculado";

@XendraField(AD_Column_ID="IsCalculated",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6161ed0-fa51-8cbf-b9b6-31f9002d83d9")
public static final String FIELDNAME_CostElement_Calculated="c6161ed0-fa51-8cbf-b9b6-31f9002d83d9";

@XendraTrl(Identifier="6440f3be-b906-f7a7-d041-cabe20900b81")
public static String es_PE_COLUMN_IsCalculated_Name="Calculado";

@XendraColumn(AD_Element_ID="9a7b5e55-338e-a69b-449d-8c9ad9ee5b77",ColumnName="IsCalculated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="@IsCalculated@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6440f3be-b906-f7a7-d041-cabe20900b81",Synchronized="2017-08-05 16:55:03.0")
/** Column name IsCalculated */
public static final String COLUMNNAME_IsCalculated = "IsCalculated";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID < 1) throw new IllegalArgumentException ("M_CostElement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="40174ac6-0c23-7895-af3c-aac6ae94d4b0")
public static String es_PE_FIELD_CostElement_CostElement_Description="Elemento de costo de producto";

@XendraTrl(Identifier="40174ac6-0c23-7895-af3c-aac6ae94d4b0")
public static String es_PE_FIELD_CostElement_CostElement_Name="Elemento de Costo";

@XendraField(AD_Column_ID="M_CostElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40174ac6-0c23-7895-af3c-aac6ae94d4b0")
public static final String FIELDNAME_CostElement_CostElement="40174ac6-0c23-7895-af3c-aac6ae94d4b0";
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
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

@XendraTrl(Identifier="eab88095-3bd9-ebab-1d62-f1cf1cc2ee91")
public static String es_PE_FIELD_CostElement_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="eab88095-3bd9-ebab-1d62-f1cf1cc2ee91")
public static String es_PE_FIELD_CostElement_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="eab88095-3bd9-ebab-1d62-f1cf1cc2ee91")
public static String es_PE_FIELD_CostElement_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="eab88095-3bd9-ebab-1d62-f1cf1cc2ee91")
public static final String FIELDNAME_CostElement_Name="eab88095-3bd9-ebab-1d62-f1cf1cc2ee91";

@XendraTrl(Identifier="c0329818-ceb4-9f60-e5ba-a5f52bad1e7f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0329818-ceb4-9f60-e5ba-a5f52bad1e7f",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="8971ed37-29f0-4255-8ca1-0b7250bf6fc1")
public static String es_PE_FIELD_CostElement_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="2b4d05ba-72f8-8539-454c-8e9c23cafc8b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-04 15:36:15.0",
Identifier="8971ed37-29f0-4255-8ca1-0b7250bf6fc1")
public static final String FIELDNAME_CostElement_Properties="8971ed37-29f0-4255-8ca1-0b7250bf6fc1";

@XendraTrl(Identifier="3f63a4ee-c610-452a-917b-84c056281f8c")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f63a4ee-c610-452a-917b-84c056281f8c",
Synchronized="2015-09-20 20:14:38.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
}
