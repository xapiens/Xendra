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
/** Generated Model for PA_ReportColumn
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_ReportColumn extends PO
{
/** Standard Constructor
@param ctx context
@param PA_ReportColumn_ID id
@param trxName transaction
*/
public X_PA_ReportColumn (Properties ctx, int PA_ReportColumn_ID, String trxName)
{
super (ctx, PA_ReportColumn_ID, trxName);
/** if (PA_ReportColumn_ID == 0)
{
setColumnType (null);	
// R
setIsPrinted (true);	
// Y
setName (null);
setPA_ReportColumn_ID (0);
setPA_ReportColumnSet_ID (0);
setPostingType (null);	
// A
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM PA_ReportColumn WHERE PA_ReportColumnSet_ID=@PA_ReportColumnSet_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_ReportColumn (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=446 */
public static int Table_ID=MTable.getTable_ID("PA_ReportColumn");

@XendraTrl(Identifier="27a80d72-a932-c8da-f476-5770830e4968")
public static String es_PE_TAB_ReportColumn_Description="Mantener Columnas del Informe financiero";

@XendraTrl(Identifier="27a80d72-a932-c8da-f476-5770830e4968")
public static String es_PE_TAB_ReportColumn_Help="Una Columna representa una columna en el Informe financiero.";

@XendraTrl(Identifier="27a80d72-a932-c8da-f476-5770830e4968")
public static String es_PE_TAB_ReportColumn_Name="Columna del Informe";

@XendraTab(Name="Report Column",Description="Maintain Financial Report Column",
Help="A column represents a column in a Financial Report",
AD_Window_ID="1f84b370-fe0e-cce4-68b9-422e755a2bf5",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="27a80d72-a932-c8da-f476-5770830e4968",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportColumn="27a80d72-a932-c8da-f476-5770830e4968";

@XendraTrl(Identifier="8cf05f43-7ca5-688b-7f0b-c01675c75eb3")
public static String es_PE_TABLE_PA_ReportColumn_Name="Columna en Informe";

@XendraTable(Name="Report Column",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Column in Report",Help="",
TableName="PA_ReportColumn",AccessLevel="7",AD_Window_ID="1f84b370-fe0e-cce4-68b9-422e755a2bf5",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="8cf05f43-7ca5-688b-7f0b-c01675c75eb3",Synchronized="2020-03-03 21:39:13.0")
/** TableName=PA_ReportColumn */
public static final String Table_Name="PA_ReportColumn";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_ReportColumn");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("PA_ReportColumn");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_ReportColumn[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount Type.
@param AmountType Type of amount to report */
public void setAmountType (String AmountType)
{
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

@XendraTrl(Identifier="691429e2-c653-90f8-7c11-efd042392fdd")
public static String es_PE_FIELD_ReportColumn_AmountType_Name="Tipo de Total";

@XendraTrl(Identifier="691429e2-c653-90f8-7c11-efd042392fdd")
public static String es_PE_FIELD_ReportColumn_AmountType_Description="Tipo de Total a reportar";

@XendraField(AD_Column_ID="AmountType",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="691429e2-c653-90f8-7c11-efd042392fdd")
public static final String FIELDNAME_ReportColumn_AmountType="691429e2-c653-90f8-7c11-efd042392fdd";

@XendraTrl(Identifier="4a57adb5-2387-4a7f-38e2-2648cb48f8bc")
public static String es_PE_COLUMN_AmountType_Name="Tipo de Total";

@XendraColumn(AD_Element_ID="f8082f78-cd1a-8646-0eea-f21838605c45",ColumnName="AmountType",
AD_Reference_ID=17,AD_Reference_Value_ID="e5a03701-e090-7320-b87f-ac3b41e9f09d",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="BP",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4a57adb5-2387-4a7f-38e2-2648cb48f8bc",Synchronized="2019-08-30 22:23:38.0")
/** Column name AmountType */
public static final String COLUMNNAME_AmountType = "AmountType";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e98aac9-2217-82ac-ccf1-440d44d14a5b")
public static String es_PE_FIELD_ReportColumn_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="2e98aac9-2217-82ac-ccf1-440d44d14a5b")
public static String es_PE_FIELD_ReportColumn_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="2e98aac9-2217-82ac-ccf1-440d44d14a5b")
public static String es_PE_FIELD_ReportColumn_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=AY",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2e98aac9-2217-82ac-ccf1-440d44d14a5b")
public static final String FIELDNAME_ReportColumn_Activity="2e98aac9-2217-82ac-ccf1-440d44d14a5b";

@XendraTrl(Identifier="39dd6138-fa38-948f-60ec-d5bd1e3d249a")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39dd6138-fa38-948f-60ec-d5bd1e3d249a",
Synchronized="2019-08-30 22:23:38.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Calculation.
@param CalculationType Calculation */
public void setCalculationType (String CalculationType)
{
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

@XendraTrl(Identifier="58793751-aaa5-7404-d330-a4917a184799")
public static String es_PE_FIELD_ReportColumn_Calculation_Name="Calcular";

@XendraField(AD_Column_ID="CalculationType",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ColumnType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="58793751-aaa5-7404-d330-a4917a184799")
public static final String FIELDNAME_ReportColumn_Calculation="58793751-aaa5-7404-d330-a4917a184799";

@XendraTrl(Identifier="fbfb4762-33ac-07e4-a6d3-72794c75edfd")
public static String es_PE_COLUMN_CalculationType_Name="Calcular";

@XendraColumn(AD_Element_ID="8a8cf398-694b-297c-e76a-81b2fc441c0b",ColumnName="CalculationType",
AD_Reference_ID=17,AD_Reference_Value_ID="3a174b14-50ef-3398-51bd-b9392c6e2c0a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fbfb4762-33ac-07e4-a6d3-72794c75edfd",Synchronized="2019-08-30 22:23:38.0")
/** Column name CalculationType */
public static final String COLUMNNAME_CalculationType = "CalculationType";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e437030f-2952-ff70-be43-2d87aefad3ad")
public static String es_PE_FIELD_ReportColumn_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="e437030f-2952-ff70-be43-2d87aefad3ad")
public static String es_PE_FIELD_ReportColumn_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="e437030f-2952-ff70-be43-2d87aefad3ad")
public static String es_PE_FIELD_ReportColumn_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=BP",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e437030f-2952-ff70-be43-2d87aefad3ad")
public static final String FIELDNAME_ReportColumn_BusinessPartner="e437030f-2952-ff70-be43-2d87aefad3ad";

@XendraTrl(Identifier="1d558cbd-465e-5058-b023-9d2a5be5c5f6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d558cbd-465e-5058-b023-9d2a5be5c5f6",
Synchronized="2019-08-30 22:23:39.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7bcd9013-99a5-5f64-4d2d-a3b556c1d0df")
public static String es_PE_FIELD_ReportColumn_Campaign_Name="Campaña";

@XendraTrl(Identifier="7bcd9013-99a5-5f64-4d2d-a3b556c1d0df")
public static String es_PE_FIELD_ReportColumn_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="7bcd9013-99a5-5f64-4d2d-a3b556c1d0df")
public static String es_PE_FIELD_ReportColumn_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=MC",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7bcd9013-99a5-5f64-4d2d-a3b556c1d0df")
public static final String FIELDNAME_ReportColumn_Campaign="7bcd9013-99a5-5f64-4d2d-a3b556c1d0df";

@XendraTrl(Identifier="075788d8-9cc9-5e9d-c515-9f02c1248a4b")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="075788d8-9cc9-5e9d-c515-9f02c1248a4b",
Synchronized="2019-08-30 22:23:39.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="93d5b105-e603-ac25-6eca-279a0fc2833a")
public static String es_PE_FIELD_ReportColumn_Currency_Name="Currency";

@XendraTrl(Identifier="93d5b105-e603-ac25-6eca-279a0fc2833a")
public static String es_PE_FIELD_ReportColumn_Currency_Description="The Currency for this record";

@XendraTrl(Identifier="93d5b105-e603-ac25-6eca-279a0fc2833a")
public static String es_PE_FIELD_ReportColumn_Currency_Help="Indicates the Currency to be used when processing or reporting on this record";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintQty@=N",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93d5b105-e603-ac25-6eca-279a0fc2833a")
public static final String FIELDNAME_ReportColumn_Currency="93d5b105-e603-ac25-6eca-279a0fc2833a";

@XendraTrl(Identifier="b58a800c-ab5a-0ec1-615d-12c39c05e994")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b58a800c-ab5a-0ec1-615d-12c39c05e994",
Synchronized="2019-08-30 22:23:39.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="a344059e-f71b-d857-9503-611a818235d7")
public static String es_PE_FIELD_ReportColumn_AccountElement_Name="Valor del Elemento";

@XendraTrl(Identifier="a344059e-f71b-d857-9503-611a818235d7")
public static String es_PE_FIELD_ReportColumn_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="a344059e-f71b-d857-9503-611a818235d7")
public static String es_PE_FIELD_ReportColumn_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=AC | @ElementType@=U1 | @ElementType@=U2",DisplayLength=14,
IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a344059e-f71b-d857-9503-611a818235d7")
public static final String FIELDNAME_ReportColumn_AccountElement="a344059e-f71b-d857-9503-611a818235d7";

@XendraTrl(Identifier="f010519a-3741-7648-5bfd-96bdda6958ef")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="c40abe5d-8b9b-8737-44a1-f6ceab05c3bd",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f010519a-3741-7648-5bfd-96bdda6958ef",Synchronized="2019-08-30 22:23:39.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID <= 0) set_Value (COLUMNNAME_C_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="829d3808-2ad0-abc7-216c-6060a316d240")
public static String es_PE_FIELD_ReportColumn_Address_Name="Localización / Dirección";

@XendraTrl(Identifier="829d3808-2ad0-abc7-216c-6060a316d240")
public static String es_PE_FIELD_ReportColumn_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="829d3808-2ad0-abc7-216c-6060a316d240")
public static String es_PE_FIELD_ReportColumn_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=LF | @ElementType@=LT",DisplayLength=26,IsReadOnly=false,SeqNo=280,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="829d3808-2ad0-abc7-216c-6060a316d240")
public static final String FIELDNAME_ReportColumn_Address="829d3808-2ad0-abc7-216c-6060a316d240";

@XendraTrl(Identifier="60d90f1d-d2ee-1a34-c86e-e84102b044da")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60d90f1d-d2ee-1a34-c86e-e84102b044da",
Synchronized="2019-08-30 22:23:39.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Set Column Type.
@param ColumnType Column Type */
public void setColumnType (String ColumnType)
{
if (ColumnType.length() > 1)
{
log.warning("Length > 1 - truncated");
ColumnType = ColumnType.substring(0,0);
}
set_Value (COLUMNNAME_ColumnType, ColumnType);
}
/** Get Column Type.
@return Column Type */
public String getColumnType() 
{
return (String)get_Value(COLUMNNAME_ColumnType);
}

@XendraTrl(Identifier="39dc3f0e-ecec-70ac-25c5-201609f0b762")
public static String es_PE_FIELD_ReportColumn_ColumnType_Name="Tipo de Columna";

@XendraField(AD_Column_ID="ColumnType",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39dc3f0e-ecec-70ac-25c5-201609f0b762")
public static final String FIELDNAME_ReportColumn_ColumnType="39dc3f0e-ecec-70ac-25c5-201609f0b762";

@XendraTrl(Identifier="caa8c739-cb34-41ea-e713-caef19ea8a9c")
public static String es_PE_COLUMN_ColumnType_Name="Tipo de Columna";

@XendraColumn(AD_Element_ID="0b8552b6-c46e-65ec-4406-e850f56b5e7e",ColumnName="ColumnType",
AD_Reference_ID=17,AD_Reference_Value_ID="67329cef-9786-598f-3b28-6bb0c4d31858",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="R",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="caa8c739-cb34-41ea-e713-caef19ea8a9c",Synchronized="2019-08-30 22:23:39.0")
/** Column name ColumnType */
public static final String COLUMNNAME_ColumnType = "ColumnType";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4fc66685-8432-2854-53b2-b776a7b2f99a")
public static String es_PE_FIELD_ReportColumn_Project_Name="Proyecto";

@XendraTrl(Identifier="4fc66685-8432-2854-53b2-b776a7b2f99a")
public static String es_PE_FIELD_ReportColumn_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="4fc66685-8432-2854-53b2-b776a7b2f99a")
public static String es_PE_FIELD_ReportColumn_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=PJ",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4fc66685-8432-2854-53b2-b776a7b2f99a")
public static final String FIELDNAME_ReportColumn_Project="4fc66685-8432-2854-53b2-b776a7b2f99a";

@XendraTrl(Identifier="7661fc3c-3a81-2973-9f8c-b23dbf07401d")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7661fc3c-3a81-2973-9f8c-b23dbf07401d",
Synchronized="2019-08-30 22:23:39.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_Value (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="64a5de83-5f2c-261b-6fc9-94bcc3a3de08")
public static String es_PE_FIELD_ReportColumn_SalesRegion_Name="Región de Ventas";

@XendraTrl(Identifier="64a5de83-5f2c-261b-6fc9-94bcc3a3de08")
public static String es_PE_FIELD_ReportColumn_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="64a5de83-5f2c-261b-6fc9-94bcc3a3de08")
public static String es_PE_FIELD_ReportColumn_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=SR",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="64a5de83-5f2c-261b-6fc9-94bcc3a3de08")
public static final String FIELDNAME_ReportColumn_SalesRegion="64a5de83-5f2c-261b-6fc9-94bcc3a3de08";

@XendraTrl(Identifier="f7e25422-fb29-258a-ab79-2e2af50b00f2")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7e25422-fb29-258a-ab79-2e2af50b00f2",
Synchronized="2019-08-30 22:23:39.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
/** Set Currency Type.
@param CurrencyType Currency Type */
public void setCurrencyType (String CurrencyType)
{
if (CurrencyType != null && CurrencyType.length() > 1)
{
log.warning("Length > 1 - truncated");
CurrencyType = CurrencyType.substring(0,0);
}
set_Value (COLUMNNAME_CurrencyType, CurrencyType);
}
/** Get Currency Type.
@return Currency Type */
public String getCurrencyType() 
{
return (String)get_Value(COLUMNNAME_CurrencyType);
}

@XendraTrl(Identifier="b6451d7f-1353-3fe6-561c-d7d8cb3f03a0")
public static String es_PE_FIELD_ReportColumn_CurrencyType_Name="Currency Type";

@XendraField(AD_Column_ID="CurrencyType",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintQty@=N",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6451d7f-1353-3fe6-561c-d7d8cb3f03a0")
public static final String FIELDNAME_ReportColumn_CurrencyType="b6451d7f-1353-3fe6-561c-d7d8cb3f03a0";

@XendraTrl(Identifier="40e4b8ea-ba30-8d71-9f86-3a581229eea3")
public static String es_PE_COLUMN_CurrencyType_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="8699d8c6-7908-f5d0-26f2-02c3b58660ed",ColumnName="CurrencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="85df3775-2b7b-c8f7-5f10-c83a9bb26ff0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="40e4b8ea-ba30-8d71-9f86-3a581229eea3",Synchronized="2019-08-30 22:23:39.0")
/** Column name CurrencyType */
public static final String COLUMNNAME_CurrencyType = "CurrencyType";
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

@XendraTrl(Identifier="b05bdaf5-bab6-f07d-be77-9cd358641b59")
public static String es_PE_FIELD_ReportColumn_Description_Name="Observación";

@XendraTrl(Identifier="b05bdaf5-bab6-f07d-be77-9cd358641b59")
public static String es_PE_FIELD_ReportColumn_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b05bdaf5-bab6-f07d-be77-9cd358641b59")
public static String es_PE_FIELD_ReportColumn_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b05bdaf5-bab6-f07d-be77-9cd358641b59")
public static final String FIELDNAME_ReportColumn_Description="b05bdaf5-bab6-f07d-be77-9cd358641b59";

@XendraTrl(Identifier="aaf644be-29d9-42d7-85cb-ce678f52d970")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aaf644be-29d9-42d7-85cb-ce678f52d970",
Synchronized="2019-08-30 22:23:39.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Type.
@param ElementType Element Type (account or user defined) */
public void setElementType (String ElementType)
{
if (ElementType != null && ElementType.length() > 2)
{
log.warning("Length > 2 - truncated");
ElementType = ElementType.substring(0,1);
}
set_Value (COLUMNNAME_ElementType, ElementType);
}
/** Get Type.
@return Element Type (account or user defined) */
public String getElementType() 
{
return (String)get_Value(COLUMNNAME_ElementType);
}

@XendraTrl(Identifier="407aa7ce-1e1c-f194-eb8f-39b75a4930d2")
public static String es_PE_FIELD_ReportColumn_Type_Name="Tipo";

@XendraTrl(Identifier="407aa7ce-1e1c-f194-eb8f-39b75a4930d2")
public static String es_PE_FIELD_ReportColumn_Type_Description="Tipo de Elemento (cuenta ó definido por el usuario)";

@XendraTrl(Identifier="407aa7ce-1e1c-f194-eb8f-39b75a4930d2")
public static String es_PE_FIELD_ReportColumn_Type_Help="Indica si este elemento es el elemento cuenta ó es un elemento definido por el usuario";

@XendraField(AD_Column_ID="ElementType",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ColumnType@=S",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="407aa7ce-1e1c-f194-eb8f-39b75a4930d2")
public static final String FIELDNAME_ReportColumn_Type="407aa7ce-1e1c-f194-eb8f-39b75a4930d2";

@XendraTrl(Identifier="59a905f5-b467-81b7-eb00-e495ac42f675")
public static String es_PE_COLUMN_ElementType_Name="Tipo";

@XendraColumn(AD_Element_ID="3c5013c0-9720-b812-2dd4-b97cb379d525",ColumnName="ElementType",
AD_Reference_ID=17,AD_Reference_Value_ID="24957d9a-7342-7c9b-45fa-52d6e887e0d5",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="59a905f5-b467-81b7-eb00-e495ac42f675",Synchronized="2019-08-30 22:23:39.0")
/** Column name ElementType */
public static final String COLUMNNAME_ElementType = "ElementType";
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

@XendraTrl(Identifier="bc79746a-e72e-d324-9e17-3a3fd55cfc36")
public static String es_PE_FIELD_ReportColumn_Budget_Name="Presupuesto";

@XendraTrl(Identifier="bc79746a-e72e-d324-9e17-3a3fd55cfc36")
public static String es_PE_FIELD_ReportColumn_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="bc79746a-e72e-d324-9e17-3a3fd55cfc36")
public static String es_PE_FIELD_ReportColumn_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PostingType@=B",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bc79746a-e72e-d324-9e17-3a3fd55cfc36")
public static final String FIELDNAME_ReportColumn_Budget="bc79746a-e72e-d324-9e17-3a3fd55cfc36";

@XendraTrl(Identifier="43240df3-777e-956e-a93c-041fcb55f551")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43240df3-777e-956e-a93c-041fcb55f551",
Synchronized="2019-08-30 22:23:39.0")
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
@XendraTrl(Identifier="52de5be4-5af4-4b79-9d42-90d73a6367e5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52de5be4-5af4-4b79-9d42-90d73a6367e5",
Synchronized="2019-08-30 22:23:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Adhoc Conversion.
@param IsAdhocConversion Perform conversion for all amounts to currency */
public void setIsAdhocConversion (boolean IsAdhocConversion)
{
set_Value (COLUMNNAME_IsAdhocConversion, Boolean.valueOf(IsAdhocConversion));
}
/** Get Adhoc Conversion.
@return Perform conversion for all amounts to currency */
public boolean isAdhocConversion() 
{
Object oo = get_Value(COLUMNNAME_IsAdhocConversion);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="289ed945-e1a8-e63a-2bd9-5dd0b7ba963e")
public static String es_PE_FIELD_ReportColumn_AdhocConversion_Name="Adhoc Conversion";

@XendraTrl(Identifier="289ed945-e1a8-e63a-2bd9-5dd0b7ba963e")
public static String es_PE_FIELD_ReportColumn_AdhocConversion_Description="Perform conversion for all amounts to currency";

@XendraTrl(Identifier="289ed945-e1a8-e63a-2bd9-5dd0b7ba963e")
public static String es_PE_FIELD_ReportColumn_AdhocConversion_Help="If a currency is selected, only this currency will be reported. If adhoc conversion is selected, all currencies are converted to the defined currency";

@XendraField(AD_Column_ID="IsAdhocConversion",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PrintQty@=N",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="289ed945-e1a8-e63a-2bd9-5dd0b7ba963e")
public static final String FIELDNAME_ReportColumn_AdhocConversion="289ed945-e1a8-e63a-2bd9-5dd0b7ba963e";

@XendraTrl(Identifier="bdcc90bb-f6c6-1110-a188-fd33e7c24a3b")
public static String es_PE_COLUMN_IsAdhocConversion_Name="Conversión";

@XendraColumn(AD_Element_ID="c6eb7ad4-b2b2-6be1-6353-3843f1b07bb4",ColumnName="IsAdhocConversion",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bdcc90bb-f6c6-1110-a188-fd33e7c24a3b",
Synchronized="2019-08-30 22:23:39.0")
/** Column name IsAdhocConversion */
public static final String COLUMNNAME_IsAdhocConversion = "IsAdhocConversion";
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

@XendraTrl(Identifier="46e98445-788c-b0c7-5caf-7dc318b66453")
public static String es_PE_FIELD_ReportColumn_Printed_Name="Impreso";

@XendraTrl(Identifier="46e98445-788c-b0c7-5caf-7dc318b66453")
public static String es_PE_FIELD_ReportColumn_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="46e98445-788c-b0c7-5caf-7dc318b66453")
public static String es_PE_FIELD_ReportColumn_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46e98445-788c-b0c7-5caf-7dc318b66453")
public static final String FIELDNAME_ReportColumn_Printed="46e98445-788c-b0c7-5caf-7dc318b66453";

@XendraTrl(Identifier="613cb5cc-1a93-2ee5-ddfb-77da493387e1")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="613cb5cc-1a93-2ee5-ddfb-77da493387e1",
Synchronized="2019-08-30 22:23:39.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
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

@XendraTrl(Identifier="a9cea341-358c-7ce6-21f0-b108c5901622")
public static String es_PE_FIELD_ReportColumn_Product_Name="Producto";

@XendraTrl(Identifier="a9cea341-358c-7ce6-21f0-b108c5901622")
public static String es_PE_FIELD_ReportColumn_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="a9cea341-358c-7ce6-21f0-b108c5901622")
public static String es_PE_FIELD_ReportColumn_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=PR",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a9cea341-358c-7ce6-21f0-b108c5901622")
public static final String FIELDNAME_ReportColumn_Product="a9cea341-358c-7ce6-21f0-b108c5901622";

@XendraTrl(Identifier="85fcfec3-c4ab-72aa-cf14-a9060b2cb32e")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85fcfec3-c4ab-72aa-cf14-a9060b2cb32e",
Synchronized="2019-08-30 22:23:39.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="12a55e82-22a4-9dac-d95d-a179595823ce")
public static String es_PE_FIELD_ReportColumn_Name_Name="Nombre";

@XendraTrl(Identifier="12a55e82-22a4-9dac-d95d-a179595823ce")
public static String es_PE_FIELD_ReportColumn_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="12a55e82-22a4-9dac-d95d-a179595823ce")
public static String es_PE_FIELD_ReportColumn_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12a55e82-22a4-9dac-d95d-a179595823ce")
public static final String FIELDNAME_ReportColumn_Name="12a55e82-22a4-9dac-d95d-a179595823ce";

@XendraTrl(Identifier="edef6fac-61dc-44b6-907e-8f1b8bcf237c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edef6fac-61dc-44b6-907e-8f1b8bcf237c",
Synchronized="2019-08-30 22:23:39.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="68689824-9354-7a33-9e2c-539e8dbe3180")
public static String es_PE_FIELD_ReportColumn_Operand_Name="Operación 1";

@XendraTrl(Identifier="68689824-9354-7a33-9e2c-539e8dbe3180")
public static String es_PE_FIELD_ReportColumn_Operand_Description="Primer operación para el cálculo";

@XendraField(AD_Column_ID="Oper_1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ColumnType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="68689824-9354-7a33-9e2c-539e8dbe3180")
public static final String FIELDNAME_ReportColumn_Operand="68689824-9354-7a33-9e2c-539e8dbe3180";

@XendraTrl(Identifier="cd4f6b28-7fe2-3848-61c3-8c2f4d3fa8a7")
public static String es_PE_COLUMN_Oper_1_ID_Name="Operación 1";

@XendraColumn(AD_Element_ID="84302d07-ffb5-d7c7-525c-461de4e04cdc",ColumnName="Oper_1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f6b67787-41dd-6bd8-8193-797a7fd5ffb2",
AD_Val_Rule_ID="91d4a2fb-eb69-bd8b-06f8-010a1034b428",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd4f6b28-7fe2-3848-61c3-8c2f4d3fa8a7",
Synchronized="2019-08-30 22:23:39.0")
/** Column name Oper_1_ID */
public static final String COLUMNNAME_Oper_1_ID = "Oper_1_ID";
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

@XendraTrl(Identifier="91afb852-b22d-8562-1758-32972e336375")
public static String es_PE_FIELD_ReportColumn_Operand22_Name="Operación 2";

@XendraTrl(Identifier="91afb852-b22d-8562-1758-32972e336375")
public static String es_PE_FIELD_ReportColumn_Operand22_Description="Segunda operación para el cálculo";

@XendraField(AD_Column_ID="Oper_2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ColumnType@=C",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="91afb852-b22d-8562-1758-32972e336375")
public static final String FIELDNAME_ReportColumn_Operand22="91afb852-b22d-8562-1758-32972e336375";

@XendraTrl(Identifier="13682fd5-554f-fc62-95fd-d0869327ece5")
public static String es_PE_COLUMN_Oper_2_ID_Name="Operación 2";

@XendraColumn(AD_Element_ID="e5e9d6ca-70a1-77cc-4d3b-d5787dafa061",ColumnName="Oper_2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f6b67787-41dd-6bd8-8193-797a7fd5ffb2",
AD_Val_Rule_ID="91d4a2fb-eb69-bd8b-06f8-010a1034b428",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13682fd5-554f-fc62-95fd-d0869327ece5",
Synchronized="2019-08-30 22:23:39.0")
/** Column name Oper_2_ID */
public static final String COLUMNNAME_Oper_2_ID = "Oper_2_ID";
/** Set Organization.
@param Org_ID Organizational entity within client */
public void setOrg_ID (int Org_ID)
{
if (Org_ID <= 0) set_Value (COLUMNNAME_Org_ID, null);
 else 
set_Value (COLUMNNAME_Org_ID, Integer.valueOf(Org_ID));
}
/** Get Organization.
@return Organizational entity within client */
public int getOrg_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33e45221-a85f-fc07-1349-47d7d7637984")
public static String es_PE_FIELD_ReportColumn_Organization_Name="Organización";

@XendraTrl(Identifier="33e45221-a85f-fc07-1349-47d7d7637984")
public static String es_PE_FIELD_ReportColumn_Organization_Description="Entidad organizacional dentro de la empresa.";

@XendraTrl(Identifier="33e45221-a85f-fc07-1349-47d7d7637984")
public static String es_PE_FIELD_ReportColumn_Organization_Help="Una organización es una unidad de su compañía ó entidad legal. Ej. tiendas; departamentos";

@XendraField(AD_Column_ID="Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=OO | @ElementType@=OT",DisplayLength=14,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="33e45221-a85f-fc07-1349-47d7d7637984")
public static final String FIELDNAME_ReportColumn_Organization="33e45221-a85f-fc07-1349-47d7d7637984";

@XendraTrl(Identifier="3646cfd4-6f33-ca05-ab02-0ea7b13d4926")
public static String es_PE_COLUMN_Org_ID_Name="Organización";

@XendraColumn(AD_Element_ID="a4e75444-9eb1-c885-3445-9b55e2eb765a",ColumnName="Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3646cfd4-6f33-ca05-ab02-0ea7b13d4926",Synchronized="2019-08-30 22:23:39.0")
/** Column name Org_ID */
public static final String COLUMNNAME_Org_ID = "Org_ID";
/** Set Report Column.
@param PA_ReportColumn_ID Column in Report */
public void setPA_ReportColumn_ID (int PA_ReportColumn_ID)
{
if (PA_ReportColumn_ID < 1) throw new IllegalArgumentException ("PA_ReportColumn_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportColumn_ID, Integer.valueOf(PA_ReportColumn_ID));
}
/** Get Report Column.
@return Column in Report */
public int getPA_ReportColumn_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportColumn_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8ed2ffa2-2366-52d9-ce45-bcdab7e5026d")
public static String es_PE_FIELD_ReportColumn_ReportColumn_Name="Columna en Informe";

@XendraTrl(Identifier="8ed2ffa2-2366-52d9-ce45-bcdab7e5026d")
public static String es_PE_FIELD_ReportColumn_ReportColumn_Description="Columna en Informe";

@XendraField(AD_Column_ID="PA_ReportColumn_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ed2ffa2-2366-52d9-ce45-bcdab7e5026d")
public static final String FIELDNAME_ReportColumn_ReportColumn="8ed2ffa2-2366-52d9-ce45-bcdab7e5026d";
/** Column name PA_ReportColumn_ID */
public static final String COLUMNNAME_PA_ReportColumn_ID = "PA_ReportColumn_ID";
/** Set Report Column Set.
@param PA_ReportColumnSet_ID Collection of Columns for Report */
public void setPA_ReportColumnSet_ID (int PA_ReportColumnSet_ID)
{
if (PA_ReportColumnSet_ID < 1) throw new IllegalArgumentException ("PA_ReportColumnSet_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportColumnSet_ID, Integer.valueOf(PA_ReportColumnSet_ID));
}
/** Get Report Column Set.
@return Collection of Columns for Report */
public int getPA_ReportColumnSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportColumnSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8284d304-a74b-bb89-bc3d-e1ab795cc7b2")
public static String es_PE_FIELD_ReportColumn_ReportColumnSet_Name="Grupo de Columnas del Informe";

@XendraTrl(Identifier="8284d304-a74b-bb89-bc3d-e1ab795cc7b2")
public static String es_PE_FIELD_ReportColumn_ReportColumnSet_Description="Colección de columnas para Informe";

@XendraTrl(Identifier="8284d304-a74b-bb89-bc3d-e1ab795cc7b2")
public static String es_PE_FIELD_ReportColumn_ReportColumnSet_Help="El conjunto de columnas del Informe identifica las columnas usadas en un Informe.";

@XendraField(AD_Column_ID="PA_ReportColumnSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8284d304-a74b-bb89-bc3d-e1ab795cc7b2")
public static final String FIELDNAME_ReportColumn_ReportColumnSet="8284d304-a74b-bb89-bc3d-e1ab795cc7b2";

@XendraTrl(Identifier="9b600492-b98c-0282-6ad2-e0e25bfd0b90")
public static String es_PE_COLUMN_PA_ReportColumnSet_ID_Name="Grupo de Columnas del Informe";

@XendraColumn(AD_Element_ID="be7e7c3a-9bab-3f7d-1aa7-ef15bf66e346",
ColumnName="PA_ReportColumnSet_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9b600492-b98c-0282-6ad2-e0e25bfd0b90",Synchronized="2019-08-30 22:23:39.0")
/** Column name PA_ReportColumnSet_ID */
public static final String COLUMNNAME_PA_ReportColumnSet_ID = "PA_ReportColumnSet_ID";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType.length() > 1)
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

@XendraTrl(Identifier="88376d89-6a0a-93a9-8c23-00616bc7cc98")
public static String es_PE_FIELD_ReportColumn_PostingType_Name="Tipo de Aplicación";

@XendraTrl(Identifier="88376d89-6a0a-93a9-8c23-00616bc7cc98")
public static String es_PE_FIELD_ReportColumn_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="88376d89-6a0a-93a9-8c23-00616bc7cc98")
public static String es_PE_FIELD_ReportColumn_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88376d89-6a0a-93a9-8c23-00616bc7cc98")
public static final String FIELDNAME_ReportColumn_PostingType="88376d89-6a0a-93a9-8c23-00616bc7cc98";

@XendraTrl(Identifier="3f52ec8f-507d-e63b-0115-793d53b1f928")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3f52ec8f-507d-e63b-0115-793d53b1f928",Synchronized="2019-08-30 22:23:39.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Relative Period.
@param RelativePeriod Period offset (0 is current) */
public void setRelativePeriod (BigDecimal RelativePeriod)
{
set_Value (COLUMNNAME_RelativePeriod, RelativePeriod);
}
/** Get Relative Period.
@return Period offset (0 is current) */
public BigDecimal getRelativePeriod() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RelativePeriod);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a32139d1-4046-6290-ce98-89fdc9e2d015")
public static String es_PE_FIELD_ReportColumn_RelativePeriod_Name="Período Relativo";

@XendraTrl(Identifier="a32139d1-4046-6290-ce98-89fdc9e2d015")
public static String es_PE_FIELD_ReportColumn_RelativePeriod_Description="Número diferencial de períodos (0 es el período actual)";

@XendraField(AD_Column_ID="RelativePeriod",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ColumnType@=R",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a32139d1-4046-6290-ce98-89fdc9e2d015")
public static final String FIELDNAME_ReportColumn_RelativePeriod="a32139d1-4046-6290-ce98-89fdc9e2d015";

@XendraTrl(Identifier="535b978f-d68b-5625-a82a-0b2a909378ab")
public static String es_PE_COLUMN_RelativePeriod_Name="Período Relativo";

@XendraColumn(AD_Element_ID="4bfcb831-5602-967d-9582-a37a644a1d44",ColumnName="RelativePeriod",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="535b978f-d68b-5625-a82a-0b2a909378ab",
Synchronized="2019-08-30 22:23:39.0")
/** Column name RelativePeriod */
public static final String COLUMNNAME_RelativePeriod = "RelativePeriod";
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

@XendraTrl(Identifier="4675dcfa-7fc5-3684-661e-1367ffe3e806")
public static String es_PE_FIELD_ReportColumn_Sequence_Name="Secuencia";

@XendraTrl(Identifier="4675dcfa-7fc5-3684-661e-1367ffe3e806")
public static String es_PE_FIELD_ReportColumn_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="4675dcfa-7fc5-3684-661e-1367ffe3e806")
public static String es_PE_FIELD_ReportColumn_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="27a80d72-a932-c8da-f476-5770830e4968",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4675dcfa-7fc5-3684-661e-1367ffe3e806")
public static final String FIELDNAME_ReportColumn_Sequence="4675dcfa-7fc5-3684-661e-1367ffe3e806";

@XendraTrl(Identifier="b1d47640-00d7-4e60-9c87-8b2b6f82d764")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM PA_ReportColumn WHERE PA_ReportColumnSet_ID=@PA_ReportColumnSet_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1d47640-00d7-4e60-9c87-8b2b6f82d764",
Synchronized="2019-08-30 22:23:39.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
