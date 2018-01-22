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
/** Generated Model for C_TaxDeclarationLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_TaxDeclarationLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_TaxDeclarationLine_ID id
@param trxName transaction
*/
public X_C_TaxDeclarationLine (Properties ctx, int C_TaxDeclarationLine_ID, String trxName)
{
super (ctx, C_TaxDeclarationLine_ID, trxName);
/** if (C_TaxDeclarationLine_ID == 0)
{
setC_BPartner_ID (0);
setC_Currency_ID (0);
setC_TaxDeclaration_ID (0);
setC_TaxDeclarationLine_ID (0);
setC_Tax_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setIsManual (true);	
// Y
setLine (0);
setTaxAmt (Env.ZERO);	
// 0
setTaxBaseAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_TaxDeclarationLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=819 */
public static int Table_ID=MTable.getTable_ID("C_TaxDeclarationLine");

@XendraTrl(Identifier="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f")
public static String es_PE_TAB_Line_Description="Ìtems Declaración de Impuestos";

@XendraTrl(Identifier="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f")
public static String es_PE_TAB_Line_Name="Ìtem";

@XendraTrl(Identifier="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f")
public static String es_PE_TAB_Line_Help="Las líneas son creadas mediante el proceso Crear.Puede eliminarlas sono desea incluirlas en una declaración en particular.Usted puede crear manualmente Líneas de Ajuste.";

@XendraTab(Name="Line",Description="Tax Declaration Lines",
Help="The lines are created by the create process. You can delete them if you do not want to include them in a particular declaration.  You can create manual adjustment lines.",
AD_Window_ID="fb0fc605-6ba3-81e4-e1cd-99ec1bda901b",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f";

@XendraTrl(Identifier="283d47f0-7767-4cfc-bdd8-61dfdc12ef1c")
public static String es_PE_TABLE_C_TaxDeclarationLine_Name="Línea declaración de Impuestos";


@XendraTable(Name="Tax Declaration Line",Description="Tax Declaration Document Information",
Help="The lines are created by the create process. You can delete them if you do not want to include them in a particular declaration. ",
TableName="C_TaxDeclarationLine",AccessLevel="3",
AD_Window_ID="fb0fc605-6ba3-81e4-e1cd-99ec1bda901b",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="283d47f0-7767-4cfc-bdd8-61dfdc12ef1c",
Synchronized="2017-08-16 11:42:32.0")
/** TableName=C_TaxDeclarationLine */
public static final String Table_Name="C_TaxDeclarationLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_TaxDeclarationLine");

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
    Table_ID = MTable.getTable_ID("C_TaxDeclarationLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_TaxDeclarationLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Allocation Line.
@param C_AllocationLine_ID Allocation Line */
public void setC_AllocationLine_ID (int C_AllocationLine_ID)
{
if (C_AllocationLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_AllocationLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_AllocationLine_ID, Integer.valueOf(C_AllocationLine_ID));
}
/** Get Allocation Line.
@return Allocation Line */
public int getC_AllocationLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AllocationLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d3e6d9f4-37fc-b17c-b8a8-7e15165457a4")
public static String es_PE_FIELD_Line_AllocationLine_Description="Item de Asignación";

@XendraTrl(Identifier="d3e6d9f4-37fc-b17c-b8a8-7e15165457a4")
public static String es_PE_FIELD_Line_AllocationLine_Help="Asignación de Efectivo/Pagos a facturas";

@XendraTrl(Identifier="d3e6d9f4-37fc-b17c-b8a8-7e15165457a4")
public static String es_PE_FIELD_Line_AllocationLine_Name="Item de Asignación";

@XendraField(AD_Column_ID="C_AllocationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3e6d9f4-37fc-b17c-b8a8-7e15165457a4")
public static final String FIELDNAME_Line_AllocationLine="d3e6d9f4-37fc-b17c-b8a8-7e15165457a4";

@XendraTrl(Identifier="5d727834-995b-b23b-ae6e-2f00f17e3e66")
public static String es_PE_COLUMN_C_AllocationLine_ID_Name="Línea de Asignación";

@XendraColumn(AD_Element_ID="2be588b1-2d10-d36e-dc0e-aa9b74d99c63",
ColumnName="C_AllocationLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5d727834-995b-b23b-ae6e-2f00f17e3e66",Synchronized="2017-08-05 16:54:29.0")
/** Column name C_AllocationLine_ID */
public static final String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
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

@XendraTrl(Identifier="220849ee-0f75-61b5-6389-66954d93d520")
public static String es_PE_FIELD_Line_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="220849ee-0f75-61b5-6389-66954d93d520")
public static String es_PE_FIELD_Line_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="220849ee-0f75-61b5-6389-66954d93d520")
public static String es_PE_FIELD_Line_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="220849ee-0f75-61b5-6389-66954d93d520")
public static final String FIELDNAME_Line_BusinessPartner="220849ee-0f75-61b5-6389-66954d93d520";

@XendraTrl(Identifier="a393b173-d1c0-a97a-92d0-93834aa377ec")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="@IsManual@=N",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a393b173-d1c0-a97a-92d0-93834aa377ec",Synchronized="2017-08-05 16:54:29.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="fc0b656b-3c1f-accd-b62a-174fcbdf3e03")
public static String es_PE_FIELD_Line_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="fc0b656b-3c1f-accd-b62a-174fcbdf3e03")
public static String es_PE_FIELD_Line_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="fc0b656b-3c1f-accd-b62a-174fcbdf3e03")
public static String es_PE_FIELD_Line_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc0b656b-3c1f-accd-b62a-174fcbdf3e03")
public static final String FIELDNAME_Line_Currency="fc0b656b-3c1f-accd-b62a-174fcbdf3e03";

@XendraTrl(Identifier="273f420a-705d-40d4-7e62-1931eb825155")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="@IsManual@=N",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="273f420a-705d-40d4-7e62-1931eb825155",Synchronized="2017-08-05 16:54:29.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="57b8513d-5c6f-8018-d924-71544e33c0ff")
public static String es_PE_FIELD_Line_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="57b8513d-5c6f-8018-d924-71544e33c0ff")
public static String es_PE_FIELD_Line_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="57b8513d-5c6f-8018-d924-71544e33c0ff")
public static String es_PE_FIELD_Line_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57b8513d-5c6f-8018-d924-71544e33c0ff")
public static final String FIELDNAME_Line_Invoice="57b8513d-5c6f-8018-d924-71544e33c0ff";

@XendraTrl(Identifier="e12c6855-4f00-1e19-4d38-6e1d95a62f7a")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e12c6855-4f00-1e19-4d38-6e1d95a62f7a",
Synchronized="2017-08-05 16:54:29.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
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

@XendraTrl(Identifier="ceb7ea45-ab59-9aae-9284-26d206993287")
public static String es_PE_FIELD_Line_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="ceb7ea45-ab59-9aae-9284-26d206993287")
public static String es_PE_FIELD_Line_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="ceb7ea45-ab59-9aae-9284-26d206993287")
public static String es_PE_FIELD_Line_InvoiceLine_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ceb7ea45-ab59-9aae-9284-26d206993287")
public static final String FIELDNAME_Line_InvoiceLine="ceb7ea45-ab59-9aae-9284-26d206993287";

@XendraTrl(Identifier="f58915cc-3390-d67d-1341-c2919483ca5e")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f58915cc-3390-d67d-1341-c2919483ca5e",
Synchronized="2017-08-05 16:54:29.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Tax Declaration.
@param C_TaxDeclaration_ID Define the declaration to the tax authorities */
public void setC_TaxDeclaration_ID (int C_TaxDeclaration_ID)
{
if (C_TaxDeclaration_ID < 1) throw new IllegalArgumentException ("C_TaxDeclaration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_TaxDeclaration_ID, Integer.valueOf(C_TaxDeclaration_ID));
}
/** Get Tax Declaration.
@return Define the declaration to the tax authorities */
public int getC_TaxDeclaration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxDeclaration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bfca666e-6b0f-4faa-9740-a5b21b0be5d4")
public static String es_PE_FIELD_Line_TaxDeclaration_Description="Define declaración de impuestos a las autoridades  ";

@XendraTrl(Identifier="bfca666e-6b0f-4faa-9740-a5b21b0be5d4")
public static String es_PE_FIELD_Line_TaxDeclaration_Help="La declaración de impuestos le permite crear información de soporte y documentos de conciliación  con la contabilidad.";

@XendraTrl(Identifier="bfca666e-6b0f-4faa-9740-a5b21b0be5d4")
public static String es_PE_FIELD_Line_TaxDeclaration_Name="Declaración Impuestos";

@XendraField(AD_Column_ID="C_TaxDeclaration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfca666e-6b0f-4faa-9740-a5b21b0be5d4")
public static final String FIELDNAME_Line_TaxDeclaration="bfca666e-6b0f-4faa-9740-a5b21b0be5d4";

@XendraTrl(Identifier="17066f52-645a-7105-9c45-a7a1399ee389")
public static String es_PE_COLUMN_C_TaxDeclaration_ID_Name="Declaración Impuestos";

@XendraColumn(AD_Element_ID="91b35a12-f73d-10ef-9906-7612a8622caf",
ColumnName="C_TaxDeclaration_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="17066f52-645a-7105-9c45-a7a1399ee389",Synchronized="2017-08-05 16:54:29.0")
/** Column name C_TaxDeclaration_ID */
public static final String COLUMNNAME_C_TaxDeclaration_ID = "C_TaxDeclaration_ID";
/** Set Tax Declaration Line.
@param C_TaxDeclarationLine_ID Tax Declaration Document Information */
public void setC_TaxDeclarationLine_ID (int C_TaxDeclarationLine_ID)
{
if (C_TaxDeclarationLine_ID < 1) throw new IllegalArgumentException ("C_TaxDeclarationLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_TaxDeclarationLine_ID, Integer.valueOf(C_TaxDeclarationLine_ID));
}
/** Get Tax Declaration Line.
@return Tax Declaration Document Information */
public int getC_TaxDeclarationLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxDeclarationLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f629eb04-0730-6768-763d-6aea31a5d05a")
public static String es_PE_FIELD_Line_TaxDeclarationLine_Description="Documento Información Declaración de Impuestos";

@XendraTrl(Identifier="f629eb04-0730-6768-763d-6aea31a5d05a")
public static String es_PE_FIELD_Line_TaxDeclarationLine_Help="Los Items son creadas mediante el proceso crear. Puede borrarlas sino desea incluírlas en unadeclaración en partícular.";

@XendraTrl(Identifier="f629eb04-0730-6768-763d-6aea31a5d05a")
public static String es_PE_FIELD_Line_TaxDeclarationLine_Name="Item declaración de Impuestos";

@XendraField(AD_Column_ID="C_TaxDeclarationLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f629eb04-0730-6768-763d-6aea31a5d05a")
public static final String FIELDNAME_Line_TaxDeclarationLine="f629eb04-0730-6768-763d-6aea31a5d05a";
/** Column name C_TaxDeclarationLine_ID */
public static final String COLUMNNAME_C_TaxDeclarationLine_ID = "C_TaxDeclarationLine_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94a3d73d-5b98-640e-f358-5cc77c9151c2")
public static String es_PE_FIELD_Line_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="94a3d73d-5b98-640e-f358-5cc77c9151c2")
public static String es_PE_FIELD_Line_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="94a3d73d-5b98-640e-f358-5cc77c9151c2")
public static String es_PE_FIELD_Line_Tax_Name="Impuesto";
@XendraField(AD_Column_ID="C_Tax_ID",
IsCentrallyMaintained=true,AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="94a3d73d-5b98-640e-f358-5cc77c9151c2")
public static final String FIELDNAME_Line_Tax="94a3d73d-5b98-640e-f358-5cc77c9151c2";

@XendraTrl(Identifier="9829fe85-981d-98f7-843d-d9c37dcff49c")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="@IsManual@=N",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9829fe85-981d-98f7-843d-d9c37dcff49c",Synchronized="2017-08-05 16:54:29.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_ValueNoCheck (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="267877fb-9ea7-72ef-e323-db8fca2a8c79")
public static String es_PE_FIELD_Line_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="267877fb-9ea7-72ef-e323-db8fca2a8c79")
public static String es_PE_FIELD_Line_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="267877fb-9ea7-72ef-e323-db8fca2a8c79")
public static String es_PE_FIELD_Line_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="267877fb-9ea7-72ef-e323-db8fca2a8c79")
public static final String FIELDNAME_Line_AccountDate="267877fb-9ea7-72ef-e323-db8fca2a8c79";

@XendraTrl(Identifier="e388a8b8-4091-13dd-8475-103d47830239")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e388a8b8-4091-13dd-8475-103d47830239",
Synchronized="2017-08-05 16:54:29.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="338e9930-600b-e6fc-4590-17539d655461")
public static String es_PE_FIELD_Line_Description_Description="Observación";

@XendraTrl(Identifier="338e9930-600b-e6fc-4590-17539d655461")
public static String es_PE_FIELD_Line_Description_Help="Observación";

@XendraTrl(Identifier="338e9930-600b-e6fc-4590-17539d655461")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="338e9930-600b-e6fc-4590-17539d655461")
public static final String FIELDNAME_Line_Description="338e9930-600b-e6fc-4590-17539d655461";

@XendraTrl(Identifier="8ad8fbcb-0e07-ea38-630e-b728e67b9a71")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="8ad8fbcb-0e07-ea38-630e-b728e67b9a71",
Synchronized="2017-08-05 16:54:29.0")
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
@XendraTrl(Identifier="b8683c3b-ccf4-4487-8ea4-ddb5614930f3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8683c3b-ccf4-4487-8ea4-ddb5614930f3",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_ValueNoCheck (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="911c9a95-9ac1-12d7-2056-e5e3bb3b8490")
public static String es_PE_FIELD_Line_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="911c9a95-9ac1-12d7-2056-e5e3bb3b8490")
public static String es_PE_FIELD_Line_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="911c9a95-9ac1-12d7-2056-e5e3bb3b8490")
public static String es_PE_FIELD_Line_Manual_Name="Manual";
@XendraField(AD_Column_ID="IsManual",
IsCentrallyMaintained=true,AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="911c9a95-9ac1-12d7-2056-e5e3bb3b8490")
public static final String FIELDNAME_Line_Manual="911c9a95-9ac1-12d7-2056-e5e3bb3b8490";

@XendraTrl(Identifier="adc71d6a-d805-29cc-5724-a38d80bdcfda")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="@IsManual@=N",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="adc71d6a-d805-29cc-5724-a38d80bdcfda",Synchronized="2017-08-05 16:54:29.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
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

@XendraTrl(Identifier="9a0a9541-4301-0dea-3286-ba4eb7b4f662")
public static String es_PE_FIELD_Line_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="9a0a9541-4301-0dea-3286-ba4eb7b4f662")
public static String es_PE_FIELD_Line_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="9a0a9541-4301-0dea-3286-ba4eb7b4f662")
public static String es_PE_FIELD_Line_LineNo_Name="No. Línea";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9a0a9541-4301-0dea-3286-ba4eb7b4f662")
public static final String FIELDNAME_Line_LineNo="9a0a9541-4301-0dea-3286-ba4eb7b4f662";

@XendraTrl(Identifier="53e1a94f-eccf-85d4-e20c-12e3f86abde4")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="53e1a94f-eccf-85d4-e20c-12e3f86abde4",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
if (TaxAmt == null) throw new IllegalArgumentException ("TaxAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f2a8092c-7cec-fb5d-0866-aabde3c9aafa")
public static String es_PE_FIELD_Line_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="f2a8092c-7cec-fb5d-0866-aabde3c9aafa")
public static String es_PE_FIELD_Line_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraTrl(Identifier="f2a8092c-7cec-fb5d-0866-aabde3c9aafa")
public static String es_PE_FIELD_Line_TaxAmount_Name="Total del Impuesto";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2a8092c-7cec-fb5d-0866-aabde3c9aafa")
public static final String FIELDNAME_Line_TaxAmount="f2a8092c-7cec-fb5d-0866-aabde3c9aafa";

@XendraTrl(Identifier="b7f6dc33-ae39-2a7d-6f24-af3cbc2095dc")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="@IsManual@=N",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b7f6dc33-ae39-2a7d-6f24-af3cbc2095dc",Synchronized="2017-08-05 16:54:29.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";
/** Set Tax base Amount.
@param TaxBaseAmt Base for calculating the tax amount */
public void setTaxBaseAmt (BigDecimal TaxBaseAmt)
{
if (TaxBaseAmt == null) throw new IllegalArgumentException ("TaxBaseAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_TaxBaseAmt, TaxBaseAmt);
}
/** Get Tax base Amount.
@return Base for calculating the tax amount */
public BigDecimal getTaxBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="333fd41c-2486-1167-769c-eb06c00f2029")
public static String es_PE_FIELD_Line_TaxBaseAmount_Description="Base para calcular el total del impuesto";

@XendraTrl(Identifier="333fd41c-2486-1167-769c-eb06c00f2029")
public static String es_PE_FIELD_Line_TaxBaseAmount_Help="El total base de impuesto indica el total base usado para calcular el total de impuesto.";

@XendraTrl(Identifier="333fd41c-2486-1167-769c-eb06c00f2029")
public static String es_PE_FIELD_Line_TaxBaseAmount_Name="Total Base del Impuesto";

@XendraField(AD_Column_ID="TaxBaseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="43457f5c-4a11-09a1-3ca4-fba4d2af8c4f",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="333fd41c-2486-1167-769c-eb06c00f2029")
public static final String FIELDNAME_Line_TaxBaseAmount="333fd41c-2486-1167-769c-eb06c00f2029";

@XendraTrl(Identifier="2123d53e-4716-9dad-1b82-b2978440c573")
public static String es_PE_COLUMN_TaxBaseAmt_Name="Total Base del Impuesto";

@XendraColumn(AD_Element_ID="11beb746-5f42-cac6-2ece-2c64fb573db9",ColumnName="TaxBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="@IsManual@=N",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2123d53e-4716-9dad-1b82-b2978440c573",Synchronized="2017-08-05 16:54:29.0")
/** Column name TaxBaseAmt */
public static final String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";
}
