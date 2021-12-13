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
/** Generated Model for PA_RatioElement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_RatioElement extends PO
{
/** Standard Constructor
@param ctx context
@param PA_RatioElement_ID id
@param trxName transaction
*/
public X_PA_RatioElement (Properties ctx, int PA_RatioElement_ID, String trxName)
{
super (ctx, PA_RatioElement_ID, trxName);
/** if (PA_RatioElement_ID == 0)
{
setName (null);
setPA_RatioElement_ID (0);
setPA_Ratio_ID (0);
setRatioElementType (null);
setRatioOperand (null);	
// P
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_RatioElement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=836 */
public static int Table_ID=MTable.getTable_ID("PA_RatioElement");

@XendraTrl(Identifier="04695927-0550-7881-404d-3ce482f22095")
public static String es_PE_TAB_Element_Description="Elemento para la valuación del desempeño";

@XendraTrl(Identifier="04695927-0550-7881-404d-3ce482f22095")
public static String es_PE_TAB_Element_Help="instrucción de cálculo indiviidual para una valuación ";

@XendraTrl(Identifier="04695927-0550-7881-404d-3ce482f22095")
public static String es_PE_TAB_Element_Name="Elemento";
@XendraTab(Name="Element",
Description="Performance Ratio Element",Help="Individual calculation instruction for a ratio",
AD_Window_ID="55c355a0-9ecc-670d-480c-5315b8c95dd3",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="04695927-0550-7881-404d-3ce482f22095",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Element="04695927-0550-7881-404d-3ce482f22095";

@XendraTrl(Identifier="168b7252-2360-e82a-4f54-d4760d14693b")
public static String es_PE_TABLE_PA_RatioElement_Name="Elemento de Razón";

@XendraTable(Name="Ratio Element",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Performance Ratio Element",
Help="",TableName="PA_RatioElement",AccessLevel="2",
AD_Window_ID="55c355a0-9ecc-670d-480c-5315b8c95dd3",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="168b7252-2360-e82a-4f54-d4760d14693b",Synchronized="2020-03-03 21:39:08.0")
/** TableName=PA_RatioElement */
public static final String Table_Name="PA_RatioElement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_RatioElement");

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
    Table_ID = MTable.getTable_ID("PA_RatioElement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_RatioElement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID <= 0) set_Value (COLUMNNAME_Account_ID, null);
 else 
set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf3ea333-6445-c4af-9dab-423290a2c58d")
public static String es_PE_FIELD_Element_Account_Name="Cuenta";

@XendraTrl(Identifier="cf3ea333-6445-c4af-9dab-423290a2c58d")
public static String es_PE_FIELD_Element_Account_Description="Cuenta usada";

@XendraTrl(Identifier="cf3ea333-6445-c4af-9dab-423290a2c58d")
public static String es_PE_FIELD_Element_Account_Help="La cuenta (natural) usada";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RatioElementType@=A",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cf3ea333-6445-c4af-9dab-423290a2c58d")
public static final String FIELDNAME_Element_Account="cf3ea333-6445-c4af-9dab-423290a2c58d";

@XendraTrl(Identifier="2c6f0d42-7781-e47b-9077-fcf2807fbf86")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c63c37c4-7a13-09ab-5af8-48da1b35609d",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2c6f0d42-7781-e47b-9077-fcf2807fbf86",Synchronized="2019-08-30 22:23:38.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";
/** Set Constant Value.
@param ConstantValue Constant value */
public void setConstantValue (BigDecimal ConstantValue)
{
set_Value (COLUMNNAME_ConstantValue, ConstantValue);
}
/** Get Constant Value.
@return Constant value */
public BigDecimal getConstantValue() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConstantValue);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f22f6935-b882-7775-174e-ecd3c266a798")
public static String es_PE_FIELD_Element_ConstantValue_Name="Valor Constante";

@XendraField(AD_Column_ID="ConstantValue",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RatioElementType@=C",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f22f6935-b882-7775-174e-ecd3c266a798")
public static final String FIELDNAME_Element_ConstantValue="f22f6935-b882-7775-174e-ecd3c266a798";

@XendraTrl(Identifier="a02b5918-26a3-98d5-9e0b-afbe02b0ae20")
public static String es_PE_COLUMN_ConstantValue_Name="Valor Constante";

@XendraColumn(AD_Element_ID="f6f3ff1d-eb61-cfbb-7985-7438714289a2",ColumnName="ConstantValue",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a02b5918-26a3-98d5-9e0b-afbe02b0ae20",
Synchronized="2019-08-30 22:23:38.0")
/** Column name ConstantValue */
public static final String COLUMNNAME_ConstantValue = "ConstantValue";
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

@XendraTrl(Identifier="1a73dfee-e80a-58c7-98ce-5fd2ff8ca040")
public static String es_PE_FIELD_Element_Description_Name="Observación";

@XendraTrl(Identifier="1a73dfee-e80a-58c7-98ce-5fd2ff8ca040")
public static String es_PE_FIELD_Element_Description_Description="Observación";

@XendraTrl(Identifier="1a73dfee-e80a-58c7-98ce-5fd2ff8ca040")
public static String es_PE_FIELD_Element_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a73dfee-e80a-58c7-98ce-5fd2ff8ca040")
public static final String FIELDNAME_Element_Description="1a73dfee-e80a-58c7-98ce-5fd2ff8ca040";

@XendraTrl(Identifier="2ec3881a-1fdc-75cc-b968-8eb098a4c5e5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ec3881a-1fdc-75cc-b968-8eb098a4c5e5",
Synchronized="2019-08-30 22:23:38.0")
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
@XendraTrl(Identifier="17a70570-9c23-4bfd-b0af-6e1a48801002")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17a70570-9c23-4bfd-b0af-6e1a48801002",
Synchronized="2019-08-30 22:23:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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
@XendraTrl(Identifier="6255a0b8-8de1-c819-6557-0427f05f685f")
public static String es_PE_FIELD_Element_Name_Name="Nombre";

@XendraTrl(Identifier="6255a0b8-8de1-c819-6557-0427f05f685f")
public static String es_PE_FIELD_Element_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6255a0b8-8de1-c819-6557-0427f05f685f")
public static String es_PE_FIELD_Element_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6255a0b8-8de1-c819-6557-0427f05f685f")
public static final String FIELDNAME_Element_Name="6255a0b8-8de1-c819-6557-0427f05f685f";

@XendraTrl(Identifier="d0b1f418-5a4b-d880-29e0-9e9dad986bd4")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0b1f418-5a4b-d880-29e0-9e9dad986bd4",
Synchronized="2019-08-30 22:23:38.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Measure Calculation.
@param PA_MeasureCalc_ID Calculation method for measuring performance */
public void setPA_MeasureCalc_ID (int PA_MeasureCalc_ID)
{
if (PA_MeasureCalc_ID <= 0) set_Value (COLUMNNAME_PA_MeasureCalc_ID, null);
 else 
set_Value (COLUMNNAME_PA_MeasureCalc_ID, Integer.valueOf(PA_MeasureCalc_ID));
}
/** Get Measure Calculation.
@return Calculation method for measuring performance */
public int getPA_MeasureCalc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_MeasureCalc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f947f2dc-cd6f-b137-6376-f3a1f5efc501")
public static String es_PE_FIELD_Element_MeasureCalculation_Name="Cálculo de la Medida";

@XendraTrl(Identifier="f947f2dc-cd6f-b137-6376-f3a1f5efc501")
public static String es_PE_FIELD_Element_MeasureCalculation_Description="Método de cálculo para medir el desempeño";

@XendraTrl(Identifier="f947f2dc-cd6f-b137-6376-f3a1f5efc501")
public static String es_PE_FIELD_Element_MeasureCalculation_Help="El Cálculo de la Medida indica el método para medir el desempeño";

@XendraField(AD_Column_ID="PA_MeasureCalc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RatioElementType@=X",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f947f2dc-cd6f-b137-6376-f3a1f5efc501")
public static final String FIELDNAME_Element_MeasureCalculation="f947f2dc-cd6f-b137-6376-f3a1f5efc501";

@XendraTrl(Identifier="bc308546-b832-20fa-0c2d-b5bc0310dc62")
public static String es_PE_COLUMN_PA_MeasureCalc_ID_Name="Cálculo de la Medida";

@XendraColumn(AD_Element_ID="91f987c2-0c7c-5323-1b6a-d43d697ba1b7",ColumnName="PA_MeasureCalc_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc308546-b832-20fa-0c2d-b5bc0310dc62",
Synchronized="2019-08-30 22:23:38.0")
/** Column name PA_MeasureCalc_ID */
public static final String COLUMNNAME_PA_MeasureCalc_ID = "PA_MeasureCalc_ID";
/** Set Ratio Element.
@param PA_RatioElement_ID Performance Ratio Element */
public void setPA_RatioElement_ID (int PA_RatioElement_ID)
{
if (PA_RatioElement_ID < 1) throw new IllegalArgumentException ("PA_RatioElement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_RatioElement_ID, Integer.valueOf(PA_RatioElement_ID));
}
/** Get Ratio Element.
@return Performance Ratio Element */
public int getPA_RatioElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_RatioElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3be05c83-dc1b-884e-ddfb-fe822a597d5a")
public static String es_PE_FIELD_Element_RatioElement_Name="Elemento de Razón";

@XendraTrl(Identifier="3be05c83-dc1b-884e-ddfb-fe822a597d5a")
public static String es_PE_FIELD_Element_RatioElement_Description="Desempeño Elemento de Razón ";

@XendraTrl(Identifier="3be05c83-dc1b-884e-ddfb-fe822a597d5a")
public static String es_PE_FIELD_Element_RatioElement_Help="Instrucción cálculo individual para una razón.";

@XendraField(AD_Column_ID="PA_RatioElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3be05c83-dc1b-884e-ddfb-fe822a597d5a")
public static final String FIELDNAME_Element_RatioElement="3be05c83-dc1b-884e-ddfb-fe822a597d5a";
/** Column name PA_RatioElement_ID */
public static final String COLUMNNAME_PA_RatioElement_ID = "PA_RatioElement_ID";
/** Set Ratio.
@param PA_Ratio_ID Performace Ratio */
public void setPA_Ratio_ID (int PA_Ratio_ID)
{
if (PA_Ratio_ID < 1) throw new IllegalArgumentException ("PA_Ratio_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Ratio_ID, Integer.valueOf(PA_Ratio_ID));
}
/** Get Ratio.
@return Performace Ratio */
public int getPA_Ratio_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Ratio_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6b5d16fd-ce45-f875-ca00-2886cc04e7db")
public static String es_PE_FIELD_Element_Ratio_Name="Razón";

@XendraTrl(Identifier="6b5d16fd-ce45-f875-ca00-2886cc04e7db")
public static String es_PE_FIELD_Element_Ratio_Description="Razón de Desempeño";

@XendraTrl(Identifier="6b5d16fd-ce45-f875-ca00-2886cc04e7db")
public static String es_PE_FIELD_Element_Ratio_Help="Ajusta instrucción de cálculo para Razón de Desempeño.";

@XendraField(AD_Column_ID="PA_Ratio_ID",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b5d16fd-ce45-f875-ca00-2886cc04e7db")
public static final String FIELDNAME_Element_Ratio="6b5d16fd-ce45-f875-ca00-2886cc04e7db";

@XendraTrl(Identifier="45641250-5092-7c52-1f13-6be506fb1ab2")
public static String es_PE_COLUMN_PA_Ratio_ID_Name="Razón";

@XendraColumn(AD_Element_ID="69ecf648-1f3a-ed9d-5dfc-4444352e595f",ColumnName="PA_Ratio_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45641250-5092-7c52-1f13-6be506fb1ab2",
Synchronized="2019-08-30 22:23:38.0")
/** Column name PA_Ratio_ID */
public static final String COLUMNNAME_PA_Ratio_ID = "PA_Ratio_ID";
/** Set Ratio Used.
@param PA_RatioUsed_ID Performace Ratio Used */
public void setPA_RatioUsed_ID (int PA_RatioUsed_ID)
{
if (PA_RatioUsed_ID <= 0) set_Value (COLUMNNAME_PA_RatioUsed_ID, null);
 else 
set_Value (COLUMNNAME_PA_RatioUsed_ID, Integer.valueOf(PA_RatioUsed_ID));
}
/** Get Ratio Used.
@return Performace Ratio Used */
public int getPA_RatioUsed_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_RatioUsed_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="205892a2-0256-6068-b1fc-9f5509189748")
public static String es_PE_FIELD_Element_RatioUsed_Name="Razón Empleada";

@XendraTrl(Identifier="205892a2-0256-6068-b1fc-9f5509189748")
public static String es_PE_FIELD_Element_RatioUsed_Description="Desempeño Razón Empleada";

@XendraTrl(Identifier="205892a2-0256-6068-b1fc-9f5509189748")
public static String es_PE_FIELD_Element_RatioUsed_Help="Razón de Desempeño Existente a ser empleada en el cálculo. Asegurése que la razón no se referencía asi misma (búcle) ";

@XendraField(AD_Column_ID="PA_RatioUsed_ID",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RatioElementType@=R",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="205892a2-0256-6068-b1fc-9f5509189748")
public static final String FIELDNAME_Element_RatioUsed="205892a2-0256-6068-b1fc-9f5509189748";

@XendraTrl(Identifier="a755c71e-2582-3136-df59-41059ba18a5d")
public static String es_PE_COLUMN_PA_RatioUsed_ID_Name="Razón Empleada";

@XendraColumn(AD_Element_ID="681cc08d-ced8-05ee-6a8b-10f5bedf67d7",ColumnName="PA_RatioUsed_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="ab063eee-ccf8-4f4f-9bad-a7f0d53a14f6",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a755c71e-2582-3136-df59-41059ba18a5d",Synchronized="2019-08-30 22:23:38.0")
/** Column name PA_RatioUsed_ID */
public static final String COLUMNNAME_PA_RatioUsed_ID = "PA_RatioUsed_ID";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
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

@XendraTrl(Identifier="3c151658-3ebc-8883-42aa-3e7c34153bd2")
public static String es_PE_FIELD_Element_PostingType_Name="Tipo de Aplicación";

@XendraTrl(Identifier="3c151658-3ebc-8883-42aa-3e7c34153bd2")
public static String es_PE_FIELD_Element_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="3c151658-3ebc-8883-42aa-3e7c34153bd2")
public static String es_PE_FIELD_Element_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RatioElementType@=A",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3c151658-3ebc-8883-42aa-3e7c34153bd2")
public static final String FIELDNAME_Element_PostingType="3c151658-3ebc-8883-42aa-3e7c34153bd2";

@XendraTrl(Identifier="d259d5a3-b01d-d5c6-0529-ca9a142fc19a")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d259d5a3-b01d-d5c6-0529-ca9a142fc19a",Synchronized="2019-08-30 22:23:38.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Element Type.
@param RatioElementType Ratio Element Type */
public void setRatioElementType (String RatioElementType)
{
if (RatioElementType.length() > 1)
{
log.warning("Length > 1 - truncated");
RatioElementType = RatioElementType.substring(0,0);
}
set_Value (COLUMNNAME_RatioElementType, RatioElementType);
}
/** Get Element Type.
@return Ratio Element Type */
public String getRatioElementType() 
{
return (String)get_Value(COLUMNNAME_RatioElementType);
}

@XendraTrl(Identifier="80e2bd23-e55e-85d3-7259-0bdef69a311b")
public static String es_PE_FIELD_Element_ElementType_Name="Tipo de Elemento";

@XendraTrl(Identifier="80e2bd23-e55e-85d3-7259-0bdef69a311b")
public static String es_PE_FIELD_Element_ElementType_Description="Relación Tipo de Elemento";

@XendraTrl(Identifier="80e2bd23-e55e-85d3-7259-0bdef69a311b")
public static String es_PE_FIELD_Element_ElementType_Help="Tipo de Dato empleado para el Cálculo";

@XendraField(AD_Column_ID="RatioElementType",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80e2bd23-e55e-85d3-7259-0bdef69a311b")
public static final String FIELDNAME_Element_ElementType="80e2bd23-e55e-85d3-7259-0bdef69a311b";

@XendraTrl(Identifier="26cd3ec1-e403-70da-a5d8-4e592a10a31d")
public static String es_PE_COLUMN_RatioElementType_Name="Tipo de Elemento";

@XendraColumn(AD_Element_ID="e45167b4-6573-50a9-46e2-d67c60a142f2",ColumnName="RatioElementType",
AD_Reference_ID=17,AD_Reference_Value_ID="29462fd0-b2bb-8d8c-fc51-6a41a22f028f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="26cd3ec1-e403-70da-a5d8-4e592a10a31d",Synchronized="2019-08-30 22:23:38.0")
/** Column name RatioElementType */
public static final String COLUMNNAME_RatioElementType = "RatioElementType";
/** Set Operand.
@param RatioOperand Ratio Operand */
public void setRatioOperand (String RatioOperand)
{
if (RatioOperand.length() > 1)
{
log.warning("Length > 1 - truncated");
RatioOperand = RatioOperand.substring(0,0);
}
set_Value (COLUMNNAME_RatioOperand, RatioOperand);
}
/** Get Operand.
@return Ratio Operand */
public String getRatioOperand() 
{
return (String)get_Value(COLUMNNAME_RatioOperand);
}

@XendraTrl(Identifier="a7f6ea57-41d8-dd27-c743-deaaa6425356")
public static String es_PE_FIELD_Element_Operand_Name="Operando";

@XendraTrl(Identifier="a7f6ea57-41d8-dd27-c743-deaaa6425356")
public static String es_PE_FIELD_Element_Operand_Description="Operando División";

@XendraTrl(Identifier="a7f6ea57-41d8-dd27-c743-deaaa6425356")
public static String es_PE_FIELD_Element_Operand_Help="Operando como la información es cálculada. Si es el primero de la serie, \"minus\" creará un valor negativo, sino es ignorado..";

@XendraField(AD_Column_ID="RatioOperand",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7f6ea57-41d8-dd27-c743-deaaa6425356")
public static final String FIELDNAME_Element_Operand="a7f6ea57-41d8-dd27-c743-deaaa6425356";

@XendraTrl(Identifier="d96ffc75-c8ae-abc9-720e-633a51b26416")
public static String es_PE_COLUMN_RatioOperand_Name="Operando";

@XendraColumn(AD_Element_ID="03ce335b-5d6f-4bdc-e67c-42a2580885c9",ColumnName="RatioOperand",
AD_Reference_ID=17,AD_Reference_Value_ID="44176ac4-188a-6d06-e432-378b8cb10d30",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="P",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d96ffc75-c8ae-abc9-720e-633a51b26416",Synchronized="2019-08-30 22:23:38.0")
/** Column name RatioOperand */
public static final String COLUMNNAME_RatioOperand = "RatioOperand";
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

@XendraTrl(Identifier="11f1b9b5-d2ba-bab7-c9be-5e6027007d7f")
public static String es_PE_FIELD_Element_Sequence_Name="Secuencia";

@XendraTrl(Identifier="11f1b9b5-d2ba-bab7-c9be-5e6027007d7f")
public static String es_PE_FIELD_Element_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="11f1b9b5-d2ba-bab7-c9be-5e6027007d7f")
public static String es_PE_FIELD_Element_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="04695927-0550-7881-404d-3ce482f22095",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11f1b9b5-d2ba-bab7-c9be-5e6027007d7f")
public static final String FIELDNAME_Element_Sequence="11f1b9b5-d2ba-bab7-c9be-5e6027007d7f";

@XendraTrl(Identifier="67fdeb58-c07e-dca3-a583-6e977a0df023")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67fdeb58-c07e-dca3-a583-6e977a0df023",
Synchronized="2019-08-30 22:23:38.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
