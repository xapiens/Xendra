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
/** Generated Model for T_Sales
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_Sales extends PO
{
/** Standard Constructor
@param ctx context
@param T_Sales_ID id
@param trxName transaction
*/
public X_T_Sales (Properties ctx, int T_Sales_ID, String trxName)
{
super (ctx, T_Sales_ID, trxName);
/** if (T_Sales_ID == 0)
{
setAD_PInstance_ID (0);
setBPartner_Name (null);
setBPartner_Type (null);
setBPartner_Value (null);
setC_BPartner_ID (0);
setC_DocType_ID (0);
setGrandTotal (Env.ZERO);	
// 0
setSerial (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Sales (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000012 */
public static int Table_ID=MTable.getTable_ID("T_Sales");

@XendraTrl(Identifier="b1a776fe-04bb-4a62-0394-ea266cf8b788")
public static String es_PE_TABLE_T_Sales_Name="Tabla Ventas";

@XendraTable(Name="Tabla Ventas",Description="",Help="",TableName="T_Sales",AccessLevel="4",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="b1a776fe-04bb-4a62-0394-ea266cf8b788",Synchronized="2017-08-16 11:44:26.0")
/** TableName=T_Sales */
public static final String Table_Name="T_Sales";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Sales");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("T_Sales");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Sales[").append(get_ID()).append("]");
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
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Monto base boleta.
@param Amt_Base_Boleta Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Boleta (BigDecimal Amt_Base_Boleta)
{
set_ValueNoCheck (COLUMNNAME_Amt_Base_Boleta, Amt_Base_Boleta);
}
/** Get Monto base boleta.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Boleta() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_Base_Boleta);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="85075f46-1fad-8eb7-c890-97c4b717e63c")
public static String es_PE_COLUMN_Amt_Base_Boleta_Name="Monto Boleta";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85075f46-1fad-8eb7-c890-97c4b717e63c",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Amt_Base_Boleta */
public static final String COLUMNNAME_Amt_Base_Boleta = "Amt_Base_Boleta";
/** Set exonerado.
@param Amt_Base_Excempt Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Excempt (BigDecimal Amt_Base_Excempt)
{
set_ValueNoCheck (COLUMNNAME_Amt_Base_Excempt, Amt_Base_Excempt);
}
/** Get exonerado.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Excempt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_Base_Excempt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="833e3aea-1d8a-a40d-d940-bc4a6b646b4f")
public static String es_PE_COLUMN_Amt_Base_Excempt_Name="Monto exonerado";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="833e3aea-1d8a-a40d-d940-bc4a6b646b4f",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Amt_Base_Excempt */
public static final String COLUMNNAME_Amt_Base_Excempt = "Amt_Base_Excempt";
/** Set Monto export, exonerado.
@param Amt_Base_Export_Excempt Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Export_Excempt (BigDecimal Amt_Base_Export_Excempt)
{
set_ValueNoCheck (COLUMNNAME_Amt_Base_Export_Excempt, Amt_Base_Export_Excempt);
}
/** Get Monto export, exonerado.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Export_Excempt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_Base_Export_Excempt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9a6d724f-af8d-8f4e-d534-80e2743fea15")
public static String es_PE_COLUMN_Amt_Base_Export_Excempt_Name="exportacion";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a6d724f-af8d-8f4e-d534-80e2743fea15",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Amt_Base_Export_Excempt */
public static final String COLUMNNAME_Amt_Base_Export_Excempt = "Amt_Base_Export_Excempt";
/** Set Base afecta.
@param Amt_Base_Taxed Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Taxed (BigDecimal Amt_Base_Taxed)
{
set_ValueNoCheck (COLUMNNAME_Amt_Base_Taxed, Amt_Base_Taxed);
}
/** Get Base afecta.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Taxed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_Base_Taxed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="02492544-c467-cbf4-5719-f14905b86444")
public static String es_PE_COLUMN_Amt_Base_Taxed_Name="Base afecta";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02492544-c467-cbf4-5719-f14905b86444",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Amt_Base_Taxed */
public static final String COLUMNNAME_Amt_Base_Taxed = "Amt_Base_Taxed";
/** Set Base inafecta.
@param Amt_Base_Untaxed Amount Balance in Currency of Accounting Schema */
public void setAmt_Base_Untaxed (BigDecimal Amt_Base_Untaxed)
{
set_ValueNoCheck (COLUMNNAME_Amt_Base_Untaxed, Amt_Base_Untaxed);
}
/** Get Base inafecta.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_Base_Untaxed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_Base_Untaxed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ce201ea4-ec73-f10b-b87e-801556742787")
public static String es_PE_COLUMN_Amt_Base_Untaxed_Name="Base inafecta";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce201ea4-ec73-f10b-b87e-801556742787",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Amt_Base_Untaxed */
public static final String COLUMNNAME_Amt_Base_Untaxed = "Amt_Base_Untaxed";
/** Set IGV exportacion.
@param Amt_IGV_Export_Excempt Amount Balance in Currency of Accounting Schema */
public void setAmt_IGV_Export_Excempt (BigDecimal Amt_IGV_Export_Excempt)
{
set_ValueNoCheck (COLUMNNAME_Amt_IGV_Export_Excempt, Amt_IGV_Export_Excempt);
}
/** Get IGV exportacion.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_IGV_Export_Excempt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_IGV_Export_Excempt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="597257a9-e2c1-8a7b-39f6-24fdde01f964")
public static String es_PE_COLUMN_Amt_IGV_Export_Excempt_Name="IGV exportacion";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="597257a9-e2c1-8a7b-39f6-24fdde01f964",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Amt_IGV_Export_Excempt */
public static final String COLUMNNAME_Amt_IGV_Export_Excempt = "Amt_IGV_Export_Excempt";
/** Set IGV.
@param Amt_IGV_Taxed Amount Balance in Currency of Accounting Schema */
public void setAmt_IGV_Taxed (BigDecimal Amt_IGV_Taxed)
{
set_ValueNoCheck (COLUMNNAME_Amt_IGV_Taxed, Amt_IGV_Taxed);
}
/** Get IGV.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmt_IGV_Taxed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_IGV_Taxed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2535c378-bec8-8cb6-2f13-b87a876b068c")
public static String es_PE_COLUMN_Amt_IGV_Taxed_Name="IGV";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2535c378-bec8-8cb6-2f13-b87a876b068c",
Synchronized="2017-08-05 16:56:29.0")
/** Column name Amt_IGV_Taxed */
public static final String COLUMNNAME_Amt_IGV_Taxed = "Amt_IGV_Taxed";
/** Set ISC impuesto.
@param AmtTax_ISC Amount Balance in Currency of Accounting Schema */
public void setAmtTax_ISC (BigDecimal AmtTax_ISC)
{
set_ValueNoCheck (COLUMNNAME_AmtTax_ISC, AmtTax_ISC);
}
/** Get ISC impuesto.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtTax_ISC() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtTax_ISC);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b5f0d732-9c80-d5e4-8a2b-63b5eadc01f0")
public static String es_PE_COLUMN_AmtTax_ISC_Name="ISC impuesto";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5f0d732-9c80-d5e4-8a2b-63b5eadc01f0",
Synchronized="2017-08-05 16:56:29.0")
/** Column name AmtTax_ISC */
public static final String COLUMNNAME_AmtTax_ISC = "AmtTax_ISC";
/** Set Otros Impuestos.
@param AmtTax_Other Amount Balance in Currency of Accounting Schema */
public void setAmtTax_Other (BigDecimal AmtTax_Other)
{
set_ValueNoCheck (COLUMNNAME_AmtTax_Other, AmtTax_Other);
}
/** Get Otros Impuestos.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtTax_Other() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtTax_Other);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ed338695-dcb0-b7d6-6ced-32d93f978ce7")
public static String es_PE_COLUMN_AmtTax_Other_Name="Otros Impuestos";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed338695-dcb0-b7d6-6ced-32d93f978ce7",
Synchronized="2017-08-05 16:56:29.0")
/** Column name AmtTax_Other */
public static final String COLUMNNAME_AmtTax_Other = "AmtTax_Other";
/** Set percepcion.
@param AmtTax_Perception Amount Balance in Currency of Accounting Schema */
public void setAmtTax_Perception (BigDecimal AmtTax_Perception)
{
set_ValueNoCheck (COLUMNNAME_AmtTax_Perception, AmtTax_Perception);
}
/** Get percepcion.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtTax_Perception() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtTax_Perception);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="18db9fd7-7d23-f3e7-41b1-1187a8272578")
public static String es_PE_COLUMN_AmtTax_Perception_Name="Percepcion Impuestos";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18db9fd7-7d23-f3e7-41b1-1187a8272578",
Synchronized="2017-08-05 16:56:29.0")
/** Column name AmtTax_Perception */
public static final String COLUMNNAME_AmtTax_Perception = "AmtTax_Perception";
/** Set Name.
@param BPartner_Name Alphanumeric identifier of the entity */
public void setBPartner_Name (String BPartner_Name)
{
if (BPartner_Name == null) throw new IllegalArgumentException ("BPartner_Name is mandatory.");
if (BPartner_Name.length() > 60)
{
log.warning("Length > 60 - truncated");
BPartner_Name = BPartner_Name.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_BPartner_Name, BPartner_Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getBPartner_Name() 
{
String value = (String)get_Value(COLUMNNAME_BPartner_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d673a40f-e6c2-a37c-3a5f-2950840cf663")
public static String es_PE_COLUMN_BPartner_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d673a40f-e6c2-a37c-3a5f-2950840cf663",
Synchronized="2017-08-05 16:56:29.0")
/** Column name BPartner_Name */
public static final String COLUMNNAME_BPartner_Name = "BPartner_Name";
/** Set Type.
@param BPartner_Type Type of Validation (SQL, Java Script, Java Language) */
public void setBPartner_Type (String BPartner_Type)
{
if (BPartner_Type == null) throw new IllegalArgumentException ("BPartner_Type is mandatory.");
if (BPartner_Type.length() > 5)
{
log.warning("Length > 5 - truncated");
BPartner_Type = BPartner_Type.substring(0,4);
}
set_ValueNoCheck (COLUMNNAME_BPartner_Type, BPartner_Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getBPartner_Type() 
{
String value = (String)get_Value(COLUMNNAME_BPartner_Type);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8d6390b4-0949-3995-d7c8-d75c4551fc12")
public static String es_PE_COLUMN_BPartner_Type_Name="Tipo";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d6390b4-0949-3995-d7c8-d75c4551fc12",
Synchronized="2017-08-05 16:56:29.0")
/** Column name BPartner_Type */
public static final String COLUMNNAME_BPartner_Type = "BPartner_Type";
/** Set Business Partner Key.
@param BPartner_Value The Key of the Business Partner */
public void setBPartner_Value (String BPartner_Value)
{
if (BPartner_Value == null) throw new IllegalArgumentException ("BPartner_Value is mandatory.");
if (BPartner_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
BPartner_Value = BPartner_Value.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_BPartner_Value, BPartner_Value);
}
/** Get Business Partner Key.
@return The Key of the Business Partner */
public String getBPartner_Value() 
{
String value = (String)get_Value(COLUMNNAME_BPartner_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="401cd33c-33cd-cffc-1d66-74609af69037")
public static String es_PE_COLUMN_BPartner_Value_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="0dc0e5ce-73ba-f7b3-e9a6-86c2a48fd36d",ColumnName="BPartner_Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="401cd33c-33cd-cffc-1d66-74609af69037",
Synchronized="2017-08-05 16:56:29.0")
/** Column name BPartner_Value */
public static final String COLUMNNAME_BPartner_Value = "BPartner_Value";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9a824f6e-97be-a404-16b3-6639fbf19946")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a824f6e-97be-a404-16b3-6639fbf19946",
Synchronized="2017-08-05 16:56:29.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ConversionType_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1dc12475-3fdb-76cc-f395-dfe457c1ac00")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1dc12475-3fdb-76cc-f395-dfe457c1ac00",Synchronized="2017-08-05 16:56:29.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Currency_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d5b4eb5f-984b-6cb8-e281-c47b73205e7a")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5b4eb5f-984b-6cb8-e281-c47b73205e7a",
Synchronized="2017-08-05 16:56:29.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f24d8aa9-a880-bee0-4834-b9bc794c4367")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f24d8aa9-a880-bee0-4834-b9bc794c4367",
Synchronized="2017-08-05 16:56:29.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="072d9137-356d-4578-4f04-ea237e8f3e0e")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="072d9137-356d-4578-4f04-ea237e8f3e0e",
Synchronized="2017-08-05 16:56:29.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Sunat Document Code.
@param CodSunat Sunat Document Code */
public void setCodSunat (String CodSunat)
{
if (CodSunat != null && CodSunat.length() > 2)
{
log.warning("Length > 2 - truncated");
CodSunat = CodSunat.substring(0,1);
}
set_ValueNoCheck (COLUMNNAME_CodSunat, CodSunat);
}
/** Get Sunat Document Code.
@return Sunat Document Code */
public String getCodSunat() 
{
String value = (String)get_Value(COLUMNNAME_CodSunat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6c6d8bbc-0bed-4a7e-5038-efc2c279a869")
public static String es_PE_COLUMN_CodSunat_Name="Codigo de documento Sunat";

@XendraColumn(AD_Element_ID="84884f14-1f72-b5d2-c38f-d807ef550fd4",ColumnName="CodSunat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c6d8bbc-0bed-4a7e-5038-efc2c279a869",
Synchronized="2017-08-05 16:56:30.0")
/** Column name CodSunat */
public static final String COLUMNNAME_CodSunat = "CodSunat";
/** Set Date Invoiced Ref.
@param C_Reference_DateInvoiced Date printed on Invoice */
public void setC_Reference_DateInvoiced (Timestamp C_Reference_DateInvoiced)
{
set_ValueNoCheck (COLUMNNAME_C_Reference_DateInvoiced, C_Reference_DateInvoiced);
}
/** Get Date Invoiced Ref.
@return Date printed on Invoice */
public Timestamp getC_Reference_DateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_C_Reference_DateInvoiced);
}

@XendraTrl(Identifier="33bd4190-bca9-aa8c-ee32-dae341353cdd")
public static String es_PE_COLUMN_C_Reference_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33bd4190-bca9-aa8c-ee32-dae341353cdd",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_Reference_DateInvoiced */
public static final String COLUMNNAME_C_Reference_DateInvoiced = "C_Reference_DateInvoiced";
/** Set c_reference_doctype_id.
@param c_reference_doctype_id c_reference_doctype_id */
public void setc_reference_doctype_id (int c_reference_doctype_id)
{
set_Value (COLUMNNAME_c_reference_doctype_id, Integer.valueOf(c_reference_doctype_id));
}
/** Get c_reference_doctype_id.
@return c_reference_doctype_id */
public int getc_reference_doctype_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_c_reference_doctype_id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0656054c-6707-47c2-c2c4-23d9f09aa501")
public static String es_PE_COLUMN_c_reference_doctype_id_Name="c_reference_doctype_id";

@XendraColumn(AD_Element_ID="42456cbe-b6bc-7829-1346-8ca110d90524",
ColumnName="c_reference_doctype_id",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0656054c-6707-47c2-c2c4-23d9f09aa501",Synchronized="2017-08-05 16:56:30.0")
/** Column name c_reference_doctype_id */
public static final String COLUMNNAME_c_reference_doctype_id = "c_reference_doctype_id";
/** Set Document No Ref.
@param C_Reference_DocumentNo Document sequence number of the document */
public void setC_Reference_DocumentNo (String C_Reference_DocumentNo)
{
if (C_Reference_DocumentNo != null && C_Reference_DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
C_Reference_DocumentNo = C_Reference_DocumentNo.substring(0,29);
}
set_ValueNoCheck (COLUMNNAME_C_Reference_DocumentNo, C_Reference_DocumentNo);
}
/** Get Document No Ref.
@return Document sequence number of the document */
public String getC_Reference_DocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_C_Reference_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="65446ebb-e383-0746-009c-b40f566be5be")
public static String es_PE_COLUMN_C_Reference_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65446ebb-e383-0746-009c-b40f566be5be",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_Reference_DocumentNo */
public static final String COLUMNNAME_C_Reference_DocumentNo = "C_Reference_DocumentNo";
/** Set c_reference_id.
@param c_reference_id c_reference_id */
public void setc_reference_id (int c_reference_id)
{
set_Value (COLUMNNAME_c_reference_id, Integer.valueOf(c_reference_id));
}
/** Get c_reference_id.
@return c_reference_id */
public int getc_reference_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_c_reference_id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73164623-419e-7748-7c8b-1db9c9ddbe1a")
public static String es_PE_COLUMN_c_reference_id_Name="c_reference_id";

@XendraColumn(AD_Element_ID="1bad4a66-52b3-a0df-968b-e4d8b19e8ada",ColumnName="c_reference_id",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73164623-419e-7748-7c8b-1db9c9ddbe1a",
Synchronized="2017-08-05 16:56:30.0")
/** Column name c_reference_id */
public static final String COLUMNNAME_c_reference_id = "c_reference_id";
/** Set Document Serial REf.
@param C_Reference_Serial Serial Number for the Document */
public void setC_Reference_Serial (String C_Reference_Serial)
{
if (C_Reference_Serial != null && C_Reference_Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
C_Reference_Serial = C_Reference_Serial.substring(0,9);
}
set_ValueNoCheck (COLUMNNAME_C_Reference_Serial, C_Reference_Serial);
}
/** Get Document Serial REf.
@return Serial Number for the Document */
public String getC_Reference_Serial() 
{
String value = (String)get_Value(COLUMNNAME_C_Reference_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="42a28f5c-e86f-0f75-b19f-694ebcf732a2")
public static String es_PE_COLUMN_C_Reference_Serial_Name="Serie del Documento";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42a28f5c-e86f-0f75-b19f-694ebcf732a2",
Synchronized="2017-08-05 16:56:30.0")
/** Column name C_Reference_Serial */
public static final String COLUMNNAME_C_Reference_Serial = "C_Reference_Serial";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
set_ValueNoCheck (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="7b0014e6-763c-afdb-10a5-13f7c95823f9")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b0014e6-763c-afdb-10a5-13f7c95823f9",
Synchronized="2017-08-05 16:56:30.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
/** Set Date Invoiced detraccion.
@param Detraction_Date Date printed on Invoice */
public void setDetraction_Date (Timestamp Detraction_Date)
{
set_ValueNoCheck (COLUMNNAME_Detraction_Date, Detraction_Date);
}
/** Get Date Invoiced detraccion.
@return Date printed on Invoice */
public Timestamp getDetraction_Date() 
{
return (Timestamp)get_Value(COLUMNNAME_Detraction_Date);
}

@XendraTrl(Identifier="743ac4fb-7ed9-7307-f41b-5699b435c13f")
public static String es_PE_COLUMN_Detraction_Date_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="743ac4fb-7ed9-7307-f41b-5699b435c13f",
Synchronized="2017-08-05 16:56:30.0")
/** Column name Detraction_Date */
public static final String COLUMNNAME_Detraction_Date = "Detraction_Date";
/** Set Document No detraccion.
@param Detraction_Number Document sequence number of the document */
public void setDetraction_Number (String Detraction_Number)
{
if (Detraction_Number != null && Detraction_Number.length() > 30)
{
log.warning("Length > 30 - truncated");
Detraction_Number = Detraction_Number.substring(0,29);
}
set_ValueNoCheck (COLUMNNAME_Detraction_Number, Detraction_Number);
}
/** Get Document No detraccion.
@return Document sequence number of the document */
public String getDetraction_Number() 
{
String value = (String)get_Value(COLUMNNAME_Detraction_Number);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b3242788-5dbd-d540-3e35-8be2957d357a")
public static String es_PE_COLUMN_Detraction_Number_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3242788-5dbd-d540-3e35-8be2957d357a",
Synchronized="2017-08-05 16:56:30.0")
/** Column name Detraction_Number */
public static final String COLUMNNAME_Detraction_Number = "Detraction_Number";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8c742423-15eb-4d0a-b3b9-85471859293f")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c742423-15eb-4d0a-b3b9-85471859293f",
Synchronized="2017-08-05 16:56:30.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d322ae22-333b-684b-dd63-d8761159b977")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d322ae22-333b-684b-dd63-d8761159b977",
Synchronized="2017-08-05 16:56:30.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
if (GrandTotal == null) throw new IllegalArgumentException ("GrandTotal is mandatory.");
set_ValueNoCheck (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1bd14bd7-de8b-bea0-1b6f-413681329f8e")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bd14bd7-de8b-bea0-1b6f-413681329f8e",
Synchronized="2017-08-05 16:56:30.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
/** Set Multiply Rate.
@param MultiplyRate Rate to multiple the source by to calculate the target. */
public void setMultiplyRate (BigDecimal MultiplyRate)
{
set_ValueNoCheck (COLUMNNAME_MultiplyRate, MultiplyRate);
}
/** Get Multiply Rate.
@return Rate to multiple the source by to calculate the target. */
public BigDecimal getMultiplyRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MultiplyRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9c4ada70-2096-eb29-7886-b21ff636bf17")
public static String es_PE_COLUMN_MultiplyRate_Name="Tasa Multiplicadora";

@XendraColumn(AD_Element_ID="01f1ea55-fcce-bdc6-b676-8dbecf680a30",ColumnName="MultiplyRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c4ada70-2096-eb29-7886-b21ff636bf17",
Synchronized="2017-08-05 16:56:30.0")
/** Column name MultiplyRate */
public static final String COLUMNNAME_MultiplyRate = "MultiplyRate";
/** Set Payment date.
@param PayDate Date Payment made */
public void setPayDate (Timestamp PayDate)
{
set_ValueNoCheck (COLUMNNAME_PayDate, PayDate);
}
/** Get Payment date.
@return Date Payment made */
public Timestamp getPayDate() 
{
return (Timestamp)get_Value(COLUMNNAME_PayDate);
}

@XendraTrl(Identifier="20418a89-aa78-2ade-75db-7a75b80f1a78")
public static String es_PE_COLUMN_PayDate_Name="Fecha de Pago";

@XendraColumn(AD_Element_ID="02e177f7-1ba9-0c09-c018-450de6d5502d",ColumnName="PayDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20418a89-aa78-2ade-75db-7a75b80f1a78",
Synchronized="2017-08-05 16:56:30.0")
/** Column name PayDate */
public static final String COLUMNNAME_PayDate = "PayDate";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial == null) throw new IllegalArgumentException ("Serial is mandatory.");
if (Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_ValueNoCheck (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fb4a7f54-e22d-b0d5-f481-2882f5af3fc5")
public static String es_PE_COLUMN_Serial_Name="Serie del Documento";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb4a7f54-e22d-b0d5-f481-2882f5af3fc5",
Synchronized="2017-08-05 16:56:30.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
}
