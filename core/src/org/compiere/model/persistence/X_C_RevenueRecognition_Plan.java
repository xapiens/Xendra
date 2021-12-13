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
/** Generated Model for C_RevenueRecognition_Plan
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RevenueRecognition_Plan extends PO
{
/** Standard Constructor
@param ctx context
@param C_RevenueRecognition_Plan_ID id
@param trxName transaction
*/
public X_C_RevenueRecognition_Plan (Properties ctx, int C_RevenueRecognition_Plan_ID, String trxName)
{
super (ctx, C_RevenueRecognition_Plan_ID, trxName);
/** if (C_RevenueRecognition_Plan_ID == 0)
{
setC_AcctSchema_ID (0);
setC_Currency_ID (0);
setC_InvoiceLine_ID (0);
setC_RevenueRecognition_ID (0);
setC_RevenueRecognition_Plan_ID (0);
setP_Revenue_Acct (0);
setRecognizedAmt (Env.ZERO);	
// 0
setTotalAmt (Env.ZERO);	
// 0
setUnEarnedRevenue_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RevenueRecognition_Plan (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=443 */
public static int Table_ID=MTable.getTable_ID("C_RevenueRecognition_Plan");

@XendraTrl(Identifier="9314684d-72ca-d161-a53c-12a0a67be9e5")
public static String es_PE_TAB_RevenueRecognitionPlan_Description="Ver plan de reconocimiento de ingresos";

@XendraTrl(Identifier="9314684d-72ca-d161-a53c-12a0a67be9e5")
public static String es_PE_TAB_RevenueRecognitionPlan_Help="El plan de reconocimiento de ingresos es generado cuando se factura por un producto que tenga reconocimiento de ingresos. Con reconocimiento de ingresos; el Total es registrado en libros como Ingresos sin reconocer y a través del tiempo ó basado en el nivel de servicio; se registra como Ingreso Ganado.";

@XendraTrl(Identifier="9314684d-72ca-d161-a53c-12a0a67be9e5")
public static String es_PE_TAB_RevenueRecognitionPlan_Name="Plan de Reconocimiento de Ingresos";

@XendraTab(Name="Revenue Recognition Plan",Description="View Revenue Recognition Plan",
Help="The Revenue Recognition plan is generated then invoicing a product with revenue recognition.  With Revenue Recognition, the amount is posted to the Unrecognized revenue and over time or based on Service Level booked to Earned Revenue.",
AD_Window_ID="733a8f19-500f-50a8-f39f-40d4949bd162",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9314684d-72ca-d161-a53c-12a0a67be9e5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RevenueRecognitionPlan="9314684d-72ca-d161-a53c-12a0a67be9e5";

@XendraTrl(Identifier="b40ae36a-229f-158f-2976-2a8977d7397c")
public static String es_PE_TABLE_C_RevenueRecognition_Plan_Name="Plan de Reconocimiento de ingresos";


@XendraTable(Name="Revenue Recognition Plan",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Plan for recognizing or recording revenue",Help="",
TableName="C_RevenueRecognition_Plan",AccessLevel="1",
AD_Window_ID="733a8f19-500f-50a8-f39f-40d4949bd162",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="b40ae36a-229f-158f-2976-2a8977d7397c",
Synchronized="2020-03-03 21:37:36.0")
/** TableName=C_RevenueRecognition_Plan */
public static final String Table_Name="C_RevenueRecognition_Plan";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RevenueRecognition_Plan");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_RevenueRecognition_Plan");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RevenueRecognition_Plan[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5dae02bc-7f7e-2e01-29e8-04015e1faccd")
public static String es_PE_FIELD_RevenueRecognitionPlan_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="5dae02bc-7f7e-2e01-29e8-04015e1faccd")
public static String es_PE_FIELD_RevenueRecognitionPlan_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="5dae02bc-7f7e-2e01-29e8-04015e1faccd")
public static String es_PE_FIELD_RevenueRecognitionPlan_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5dae02bc-7f7e-2e01-29e8-04015e1faccd")
public static final String FIELDNAME_RevenueRecognitionPlan_AccountingSchema="5dae02bc-7f7e-2e01-29e8-04015e1faccd";

@XendraTrl(Identifier="7d6128cd-8a87-10d1-5097-0ef532487e84")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d6128cd-8a87-10d1-5097-0ef532487e84",
Synchronized="2019-08-30 22:22:13.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="735b4d53-f06b-61fd-c4ab-b0d7c7ce1b41")
public static String es_PE_FIELD_RevenueRecognitionPlan_Currency_Name="Moneda";

@XendraTrl(Identifier="735b4d53-f06b-61fd-c4ab-b0d7c7ce1b41")
public static String es_PE_FIELD_RevenueRecognitionPlan_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="735b4d53-f06b-61fd-c4ab-b0d7c7ce1b41")
public static String es_PE_FIELD_RevenueRecognitionPlan_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="735b4d53-f06b-61fd-c4ab-b0d7c7ce1b41")
public static final String FIELDNAME_RevenueRecognitionPlan_Currency="735b4d53-f06b-61fd-c4ab-b0d7c7ce1b41";

@XendraTrl(Identifier="9f85f88b-411c-17cc-cd15-6a17e3d87421")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f85f88b-411c-17cc-cd15-6a17e3d87421",
Synchronized="2019-08-30 22:22:13.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID < 1) throw new IllegalArgumentException ("C_InvoiceLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4d8e619-8ebd-5237-9755-d4c6902cd418")
public static String es_PE_FIELD_RevenueRecognitionPlan_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="b4d8e619-8ebd-5237-9755-d4c6902cd418")
public static String es_PE_FIELD_RevenueRecognitionPlan_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="b4d8e619-8ebd-5237-9755-d4c6902cd418")
public static String es_PE_FIELD_RevenueRecognitionPlan_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4d8e619-8ebd-5237-9755-d4c6902cd418")
public static final String FIELDNAME_RevenueRecognitionPlan_InvoiceLine="b4d8e619-8ebd-5237-9755-d4c6902cd418";

@XendraTrl(Identifier="dc1dd7de-d718-3c34-fac3-0760eaf66335")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc1dd7de-d718-3c34-fac3-0760eaf66335",
Synchronized="2019-08-30 22:22:13.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Revenue Recognition.
@param C_RevenueRecognition_ID Method for recording revenue */
public void setC_RevenueRecognition_ID (int C_RevenueRecognition_ID)
{
if (C_RevenueRecognition_ID < 1) throw new IllegalArgumentException ("C_RevenueRecognition_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_ID, Integer.valueOf(C_RevenueRecognition_ID));
}
/** Get Revenue Recognition.
@return Method for recording revenue */
public int getC_RevenueRecognition_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_RevenueRecognition_ID()));
}

@XendraTrl(Identifier="cc2b2e13-a0da-81a9-1431-0e0c2292c1e1")
public static String es_PE_FIELD_RevenueRecognitionPlan_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="cc2b2e13-a0da-81a9-1431-0e0c2292c1e1")
public static String es_PE_FIELD_RevenueRecognitionPlan_RevenueRecognition_Description="Método para registro de ingresos";

@XendraTrl(Identifier="cc2b2e13-a0da-81a9-1431-0e0c2292c1e1")
public static String es_PE_FIELD_RevenueRecognitionPlan_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc2b2e13-a0da-81a9-1431-0e0c2292c1e1")
public static final String FIELDNAME_RevenueRecognitionPlan_RevenueRecognition="cc2b2e13-a0da-81a9-1431-0e0c2292c1e1";

@XendraTrl(Identifier="802bf66e-e11f-7b50-9988-bc3cfda5c365")
public static String es_PE_COLUMN_C_RevenueRecognition_ID_Name="Reconocimiento de Ingreso";

@XendraColumn(AD_Element_ID="874c0d47-1c5f-9fc9-8805-0ba48ccc7cff",
ColumnName="C_RevenueRecognition_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="802bf66e-e11f-7b50-9988-bc3cfda5c365",Synchronized="2019-08-30 22:22:13.0")
/** Column name C_RevenueRecognition_ID */
public static final String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
/** Set Revenue Recognition Plan.
@param C_RevenueRecognition_Plan_ID Plan for recognizing or recording revenue */
public void setC_RevenueRecognition_Plan_ID (int C_RevenueRecognition_Plan_ID)
{
if (C_RevenueRecognition_Plan_ID < 1) throw new IllegalArgumentException ("C_RevenueRecognition_Plan_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Plan_ID, Integer.valueOf(C_RevenueRecognition_Plan_ID));
}
/** Get Revenue Recognition Plan.
@return Plan for recognizing or recording revenue */
public int getC_RevenueRecognition_Plan_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Plan_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="20c197c5-ae5f-de36-5d6c-3f93dcdd868b")
public static String es_PE_FIELD_RevenueRecognitionPlan_RevenueRecognitionPlan_Name="Plan de Reconocimiento de ingresos";

@XendraTrl(Identifier="20c197c5-ae5f-de36-5d6c-3f93dcdd868b")
public static String es_PE_FIELD_RevenueRecognitionPlan_RevenueRecognitionPlan_Description="Plan para reconocer ó registrar ingresos";

@XendraTrl(Identifier="20c197c5-ae5f-de36-5d6c-3f93dcdd868b")
public static String es_PE_FIELD_RevenueRecognitionPlan_RevenueRecognitionPlan_Help="El plan de reconocimiento de Ingresos identifica un plan de reconocimiento de Ingresos único.";

@XendraField(AD_Column_ID="C_RevenueRecognition_Plan_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20c197c5-ae5f-de36-5d6c-3f93dcdd868b")
public static final String FIELDNAME_RevenueRecognitionPlan_RevenueRecognitionPlan="20c197c5-ae5f-de36-5d6c-3f93dcdd868b";
/** Column name C_RevenueRecognition_Plan_ID */
public static final String COLUMNNAME_C_RevenueRecognition_Plan_ID = "C_RevenueRecognition_Plan_ID";
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
@XendraTrl(Identifier="ae14eb44-47c3-40a5-a981-4ef06ef861ef")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae14eb44-47c3-40a5-a981-4ef06ef861ef",
Synchronized="2019-08-30 22:22:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Revenue.
@param P_Revenue_Acct Account for Product Revenue (Sales Account) */
public void setP_Revenue_Acct (int P_Revenue_Acct)
{
set_ValueNoCheck (COLUMNNAME_P_Revenue_Acct, Integer.valueOf(P_Revenue_Acct));
}
/** Get Product Revenue.
@return Account for Product Revenue (Sales Account) */
public int getP_Revenue_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_Revenue_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2838c966-8718-5fd4-78b8-3bea609f0c6d")
public static String es_PE_FIELD_RevenueRecognitionPlan_ProductRevenue_Name="Ventas";

@XendraTrl(Identifier="2838c966-8718-5fd4-78b8-3bea609f0c6d")
public static String es_PE_FIELD_RevenueRecognitionPlan_ProductRevenue_Description="Cuenta de Ingresos por el producto (Cuenta de Ventas)";

@XendraTrl(Identifier="2838c966-8718-5fd4-78b8-3bea609f0c6d")
public static String es_PE_FIELD_RevenueRecognitionPlan_ProductRevenue_Help="Cuenta de Ingresos por el producto (Cuenta de Ventas)  indica la cuenta usada para registrar ingresos de ventas para este producto";

@XendraField(AD_Column_ID="P_Revenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2838c966-8718-5fd4-78b8-3bea609f0c6d")
public static final String FIELDNAME_RevenueRecognitionPlan_ProductRevenue="2838c966-8718-5fd4-78b8-3bea609f0c6d";

@XendraTrl(Identifier="47a44f2d-c38d-6680-4864-e491a460dfc3")
public static String es_PE_COLUMN_P_Revenue_Acct_Name="Ventas";

@XendraColumn(AD_Element_ID="fda0d9fb-f4a4-e939-7cf3-6b0ec27ece2f",ColumnName="P_Revenue_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47a44f2d-c38d-6680-4864-e491a460dfc3",
Synchronized="2019-08-30 22:22:13.0")
/** Column name P_Revenue_Acct */
public static final String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
/** Set Recognized Amount.
@param RecognizedAmt Recognized Amount */
public void setRecognizedAmt (BigDecimal RecognizedAmt)
{
if (RecognizedAmt == null) throw new IllegalArgumentException ("RecognizedAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_RecognizedAmt, RecognizedAmt);
}
/** Get Recognized Amount.
@return Recognized Amount */
public BigDecimal getRecognizedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RecognizedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bb6257f5-65d1-b752-5a12-ef06d36faca9")
public static String es_PE_FIELD_RevenueRecognitionPlan_RecognizedAmount_Name="Total Reconocido";

@XendraField(AD_Column_ID="RecognizedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb6257f5-65d1-b752-5a12-ef06d36faca9")
public static final String FIELDNAME_RevenueRecognitionPlan_RecognizedAmount="bb6257f5-65d1-b752-5a12-ef06d36faca9";

@XendraTrl(Identifier="be3a6872-c620-6130-11b9-4d460e3f06b6")
public static String es_PE_COLUMN_RecognizedAmt_Name="Total Reconocido";

@XendraColumn(AD_Element_ID="2331627d-3f32-c435-d45a-63fcf72b3cc2",ColumnName="RecognizedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be3a6872-c620-6130-11b9-4d460e3f06b6",
Synchronized="2019-08-30 22:22:13.0")
/** Column name RecognizedAmt */
public static final String COLUMNNAME_RecognizedAmt = "RecognizedAmt";
/** Set Total Amount.
@param TotalAmt Total Amount */
public void setTotalAmt (BigDecimal TotalAmt)
{
if (TotalAmt == null) throw new IllegalArgumentException ("TotalAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalAmt, TotalAmt);
}
/** Get Total Amount.
@return Total Amount */
public BigDecimal getTotalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f7e6e392-ae60-bd0c-930f-40be2979fb69")
public static String es_PE_FIELD_RevenueRecognitionPlan_TotalAmount_Name="Total Total";

@XendraTrl(Identifier="f7e6e392-ae60-bd0c-930f-40be2979fb69")
public static String es_PE_FIELD_RevenueRecognitionPlan_TotalAmount_Description="Total Total";

@XendraTrl(Identifier="f7e6e392-ae60-bd0c-930f-40be2979fb69")
public static String es_PE_FIELD_RevenueRecognitionPlan_TotalAmount_Help="Indica el total total del documento";

@XendraField(AD_Column_ID="TotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7e6e392-ae60-bd0c-930f-40be2979fb69")
public static final String FIELDNAME_RevenueRecognitionPlan_TotalAmount="f7e6e392-ae60-bd0c-930f-40be2979fb69";

@XendraTrl(Identifier="4fe5623f-aef5-3097-dd12-c386920c16be")
public static String es_PE_COLUMN_TotalAmt_Name="Total Total";

@XendraColumn(AD_Element_ID="c413def6-435d-8c44-d0d5-90526042b2e0",ColumnName="TotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fe5623f-aef5-3097-dd12-c386920c16be",
Synchronized="2019-08-30 22:22:13.0")
/** Column name TotalAmt */
public static final String COLUMNNAME_TotalAmt = "TotalAmt";
/** Set Unearned Revenue.
@param UnEarnedRevenue_Acct Account for unearned revenue */
public void setUnEarnedRevenue_Acct (int UnEarnedRevenue_Acct)
{
set_ValueNoCheck (COLUMNNAME_UnEarnedRevenue_Acct, Integer.valueOf(UnEarnedRevenue_Acct));
}
/** Get Unearned Revenue.
@return Account for unearned revenue */
public int getUnEarnedRevenue_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UnEarnedRevenue_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="003db2b3-3cc7-8b69-5274-836becf5fe23")
public static String es_PE_FIELD_RevenueRecognitionPlan_UnearnedRevenue_Name="Ingresos no Devengados";

@XendraTrl(Identifier="003db2b3-3cc7-8b69-5274-836becf5fe23")
public static String es_PE_FIELD_RevenueRecognitionPlan_UnearnedRevenue_Description="Cuenta para ingresos no devengados";

@XendraTrl(Identifier="003db2b3-3cc7-8b69-5274-836becf5fe23")
public static String es_PE_FIELD_RevenueRecognitionPlan_UnearnedRevenue_Help="El Ingreso no devengado indica la cuenta usada para registrar facturas enviadas por productos ó servicios que aún no han sido entregados. Es usado en reconocimiento de ingresos.";

@XendraField(AD_Column_ID="UnEarnedRevenue_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="9314684d-72ca-d161-a53c-12a0a67be9e5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="003db2b3-3cc7-8b69-5274-836becf5fe23")
public static final String FIELDNAME_RevenueRecognitionPlan_UnearnedRevenue="003db2b3-3cc7-8b69-5274-836becf5fe23";

@XendraTrl(Identifier="6c6c8bcb-4898-11a7-aa0e-d4b52d34a711")
public static String es_PE_COLUMN_UnEarnedRevenue_Acct_Name="Ingresos no Devengados";

@XendraColumn(AD_Element_ID="7e124a02-1533-da59-cb65-c976cc633243",
ColumnName="UnEarnedRevenue_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6c6c8bcb-4898-11a7-aa0e-d4b52d34a711",Synchronized="2019-08-30 22:22:13.0")
/** Column name UnEarnedRevenue_Acct */
public static final String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";
}
