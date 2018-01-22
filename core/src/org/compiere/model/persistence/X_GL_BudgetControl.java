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
import org.compiere.model.reference.REF_GL_BudgetControlScope;
import org.compiere.model.reference.REF_C_AcctSchemaCommitmentType;
/** Generated Model for GL_BudgetControl
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_BudgetControl extends PO
{
/** Standard Constructor
@param ctx context
@param GL_BudgetControl_ID id
@param trxName transaction
*/
public X_GL_BudgetControl (Properties ctx, int GL_BudgetControl_ID, String trxName)
{
super (ctx, GL_BudgetControl_ID, trxName);
/** if (GL_BudgetControl_ID == 0)
{
setBudgetControlScope (null);
setC_AcctSchema_ID (0);
setCommitmentType (null);	
// C
setGL_BudgetControl_ID (0);
setGL_Budget_ID (0);
setIsBeforeApproval (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_BudgetControl (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=822 */
public static int Table_ID=MTable.getTable_ID("GL_BudgetControl");

@XendraTrl(Identifier="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e")
public static String es_PE_TAB_BudgetControl_Description="Mantener Control de Presupuesto";

@XendraTrl(Identifier="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e")
public static String es_PE_TAB_BudgetControl_Name="Control de Presupuesto";

@XendraTrl(Identifier="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e")
public static String es_PE_TAB_BudgetControl_Help="Control de Presupuesto le èr,ite restringir el empleo de gastos, Compromisos (Ordenes de Compra) y reservados (Requisiciones). Si definió, no podrá aprobar Requisiciones, Ordenes de Comprao Facturas CxP.";

@XendraTab(Name="Budget Control",Description="Maintain Budget Controls",
Help="Budget Control allows you to restrict the use of expenditures, commitments (Purchase Orders) and reservations (Requisitions). If defined, you mey not be able to approve Requisitions, Purchse Orders, or AP Invoices.",
AD_Window_ID="dd12b819-94cd-115d-d2f9-7bc0a443e9b7",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BudgetControl="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e";

@XendraTrl(Identifier="fe2beb7b-6a89-b3e9-9fb0-f5c08f71e027")
public static String es_PE_TABLE_GL_BudgetControl_Name="Presupuesto de Control";

@XendraTable(Name="Budget Control",Description="Budget Control",Help="",
TableName="GL_BudgetControl",AccessLevel="2",AD_Window_ID="dd12b819-94cd-115d-d2f9-7bc0a443e9b7",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="fe2beb7b-6a89-b3e9-9fb0-f5c08f71e027",Synchronized="2017-08-16 11:42:43.0")
/** TableName=GL_BudgetControl */
public static final String Table_Name="GL_BudgetControl";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_BudgetControl");

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
    Table_ID = MTable.getTable_ID("GL_BudgetControl");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_BudgetControl[").append(get_ID()).append("]");
return sb.toString();
}

/** BudgetControlScope AD_Reference=70095159-aa49-0401-11b4-8c6892a946b0 */
public static final int BUDGETCONTROLSCOPE_AD_Reference_ID=361;
/** Set Control Scope.
@param BudgetControlScope Scope of the Budget Control */
public void setBudgetControlScope (String BudgetControlScope)
{
if (BudgetControlScope == null) throw new IllegalArgumentException ("BudgetControlScope is mandatory");
if (BudgetControlScope.equals(REF_GL_BudgetControlScope.PeriodOnly) || BudgetControlScope.equals(REF_GL_BudgetControlScope.YearToDate) || BudgetControlScope.equals(REF_GL_BudgetControlScope.Total));
 else throw new IllegalArgumentException ("BudgetControlScope Invalid value - " + BudgetControlScope + " - Reference_ID=361 - P - Y - T");
if (BudgetControlScope.length() > 1)
{
log.warning("Length > 1 - truncated");
BudgetControlScope = BudgetControlScope.substring(0,0);
}
set_Value (COLUMNNAME_BudgetControlScope, BudgetControlScope);
}
/** Get Control Scope.
@return Scope of the Budget Control */
public String getBudgetControlScope() 
{
return (String)get_Value(COLUMNNAME_BudgetControlScope);
}

@XendraTrl(Identifier="ed2d52a5-a7f6-6f0f-b7f5-6ee40ddb6f48")
public static String es_PE_FIELD_BudgetControl_ControlScope_Description="Scope of the Budget Control";

@XendraTrl(Identifier="ed2d52a5-a7f6-6f0f-b7f5-6ee40ddb6f48")
public static String es_PE_FIELD_BudgetControl_ControlScope_Name="Control Scope";

@XendraField(AD_Column_ID="BudgetControlScope",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed2d52a5-a7f6-6f0f-b7f5-6ee40ddb6f48")
public static final String FIELDNAME_BudgetControl_ControlScope="ed2d52a5-a7f6-6f0f-b7f5-6ee40ddb6f48";

@XendraTrl(Identifier="59be3fc7-b624-a31a-e554-d3f3789b1d1d")
public static String es_PE_COLUMN_BudgetControlScope_Name="Control Scope";

@XendraColumn(AD_Element_ID="3a5b8f96-039c-ad33-da16-d78b76aac9aa",ColumnName="BudgetControlScope",
AD_Reference_ID=17,AD_Reference_Value_ID="70095159-aa49-0401-11b4-8c6892a946b0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="59be3fc7-b624-a31a-e554-d3f3789b1d1d",Synchronized="2017-08-05 16:54:40.0")
/** Column name BudgetControlScope */
public static final String COLUMNNAME_BudgetControlScope = "BudgetControlScope";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7b6c870-1fdd-4cc3-fe7f-fa2301bf2107")
public static String es_PE_FIELD_BudgetControl_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="e7b6c870-1fdd-4cc3-fe7f-fa2301bf2107")
public static String es_PE_FIELD_BudgetControl_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="e7b6c870-1fdd-4cc3-fe7f-fa2301bf2107")
public static String es_PE_FIELD_BudgetControl_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7b6c870-1fdd-4cc3-fe7f-fa2301bf2107")
public static final String FIELDNAME_BudgetControl_AccountingSchema="e7b6c870-1fdd-4cc3-fe7f-fa2301bf2107";

@XendraTrl(Identifier="4027521f-9531-6c59-04f4-5d5a92af218b")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4027521f-9531-6c59-04f4-5d5a92af218b",
Synchronized="2017-08-05 16:54:40.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

/** CommitmentType AD_Reference=02423143-0566-ffd3-86cd-8a9e29dfa190 */
public static final int COMMITMENTTYPE_AD_Reference_ID=359;
/** Set Commitment Type.
@param CommitmentType Create Commitment and/or Reservations for Budget Control */
public void setCommitmentType (String CommitmentType)
{
if (CommitmentType == null) throw new IllegalArgumentException ("CommitmentType is mandatory");
if (CommitmentType.equals(REF_C_AcctSchemaCommitmentType.CommitmentOnly) || CommitmentType.equals(REF_C_AcctSchemaCommitmentType.CommitmentReservation) || CommitmentType.equals(REF_C_AcctSchemaCommitmentType.None));
 else throw new IllegalArgumentException ("CommitmentType Invalid value - " + CommitmentType + " - Reference_ID=359 - C - B - N");
if (CommitmentType.length() > 1)
{
log.warning("Length > 1 - truncated");
CommitmentType = CommitmentType.substring(0,0);
}
set_Value (COLUMNNAME_CommitmentType, CommitmentType);
}
/** Get Commitment Type.
@return Create Commitment and/or Reservations for Budget Control */
public String getCommitmentType() 
{
return (String)get_Value(COLUMNNAME_CommitmentType);
}

@XendraTrl(Identifier="968a9178-2883-d407-a6a6-b1454534ebfa")
public static String es_PE_FIELD_BudgetControl_CommitmentType_Description="Crear Compromiso y/o Reservados para Control de Presupuesto";

@XendraTrl(Identifier="968a9178-2883-d407-a6a6-b1454534ebfa")
public static String es_PE_FIELD_BudgetControl_CommitmentType_Help="El Compromiso Tipo Aplicación es creado al aplicar Ordenes de Compra; El Reservado Tipo Aplicación es creado al aplicar una Requisición. Esto es empleado para Control de Presupuesto.";

@XendraTrl(Identifier="968a9178-2883-d407-a6a6-b1454534ebfa")
public static String es_PE_FIELD_BudgetControl_CommitmentType_Name="Tipo de Compromiso";

@XendraField(AD_Column_ID="CommitmentType",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="968a9178-2883-d407-a6a6-b1454534ebfa")
public static final String FIELDNAME_BudgetControl_CommitmentType="968a9178-2883-d407-a6a6-b1454534ebfa";

@XendraTrl(Identifier="3a35a9c7-ebad-0afb-70e6-e85c832319e5")
public static String es_PE_COLUMN_CommitmentType_Name="Tipo de Compromiso";

@XendraColumn(AD_Element_ID="1679c1ca-5fbd-ab2d-f95a-c9d5b4fd91b6",ColumnName="CommitmentType",
AD_Reference_ID=17,AD_Reference_Value_ID="02423143-0566-ffd3-86cd-8a9e29dfa190",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3a35a9c7-ebad-0afb-70e6-e85c832319e5",Synchronized="2017-08-05 16:54:40.0")
/** Column name CommitmentType */
public static final String COLUMNNAME_CommitmentType = "CommitmentType";
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

@XendraTrl(Identifier="a8de8196-4900-e0b8-2aad-eaccb886ffde")
public static String es_PE_FIELD_BudgetControl_Description_Description="Observación";

@XendraTrl(Identifier="a8de8196-4900-e0b8-2aad-eaccb886ffde")
public static String es_PE_FIELD_BudgetControl_Description_Help="Observación";

@XendraTrl(Identifier="a8de8196-4900-e0b8-2aad-eaccb886ffde")
public static String es_PE_FIELD_BudgetControl_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8de8196-4900-e0b8-2aad-eaccb886ffde")
public static final String FIELDNAME_BudgetControl_Description="a8de8196-4900-e0b8-2aad-eaccb886ffde";

@XendraTrl(Identifier="d3876e49-a0f5-3a9e-5e12-84103f88c68e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3876e49-a0f5-3a9e-5e12-84103f88c68e",
Synchronized="2017-08-05 16:54:40.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Budget Control.
@param GL_BudgetControl_ID Budget Control */
public void setGL_BudgetControl_ID (int GL_BudgetControl_ID)
{
if (GL_BudgetControl_ID < 1) throw new IllegalArgumentException ("GL_BudgetControl_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_BudgetControl_ID, Integer.valueOf(GL_BudgetControl_ID));
}
/** Get Budget Control.
@return Budget Control */
public int getGL_BudgetControl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4d636e9-1019-5796-a8b6-778e18ef9cb2")
public static String es_PE_FIELD_BudgetControl_BudgetControl_Description="Presupuesto de Control";

@XendraTrl(Identifier="b4d636e9-1019-5796-a8b6-778e18ef9cb2")
public static String es_PE_FIELD_BudgetControl_BudgetControl_Help="Presupuesto de Control le permite restringuir el empleo de compromisos y gastos (Ordenes de Compra) y reservados (Requisiciones). Si definio, usted no estar'a en posibilidad de Aprobar  Requisiciones, Ordenes de Compra o Facturas CxP.";

@XendraTrl(Identifier="b4d636e9-1019-5796-a8b6-778e18ef9cb2")
public static String es_PE_FIELD_BudgetControl_BudgetControl_Name="Presupuesto de Control";

@XendraField(AD_Column_ID="GL_BudgetControl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4d636e9-1019-5796-a8b6-778e18ef9cb2")
public static final String FIELDNAME_BudgetControl_BudgetControl="b4d636e9-1019-5796-a8b6-778e18ef9cb2";
/** Column name GL_BudgetControl_ID */
public static final String COLUMNNAME_GL_BudgetControl_ID = "GL_BudgetControl_ID";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID < 1) throw new IllegalArgumentException ("GL_Budget_ID is mandatory.");
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

@XendraTrl(Identifier="4f52cad6-fa20-d4dd-75e2-b859e7031599")
public static String es_PE_FIELD_BudgetControl_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="4f52cad6-fa20-d4dd-75e2-b859e7031599")
public static String es_PE_FIELD_BudgetControl_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraTrl(Identifier="4f52cad6-fa20-d4dd-75e2-b859e7031599")
public static String es_PE_FIELD_BudgetControl_Budget_Name="Presupuesto";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f52cad6-fa20-d4dd-75e2-b859e7031599")
public static final String FIELDNAME_BudgetControl_Budget="4f52cad6-fa20-d4dd-75e2-b859e7031599";

@XendraTrl(Identifier="6156dad5-ab95-b159-5d83-0d989b3f5331")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6156dad5-ab95-b159-5d83-0d989b3f5331",
Synchronized="2017-08-05 16:54:40.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
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

@XendraTrl(Identifier="2b4a5d40-1b89-6ef9-0407-fe3dbcdc0b03")
public static String es_PE_FIELD_BudgetControl_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="2b4a5d40-1b89-6ef9-0407-fe3dbcdc0b03")
public static String es_PE_FIELD_BudgetControl_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="2b4a5d40-1b89-6ef9-0407-fe3dbcdc0b03")
public static String es_PE_FIELD_BudgetControl_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b4a5d40-1b89-6ef9-0407-fe3dbcdc0b03")
public static final String FIELDNAME_BudgetControl_CommentHelp="2b4a5d40-1b89-6ef9-0407-fe3dbcdc0b03";

@XendraTrl(Identifier="c6879aa9-d0da-cd5b-604a-30007749e863")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6879aa9-d0da-cd5b-604a-30007749e863",
Synchronized="2017-08-05 16:54:40.0")
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
@XendraTrl(Identifier="796ea1fa-2e86-4715-834e-1fef398764bc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="796ea1fa-2e86-4715-834e-1fef398764bc",
Synchronized="2017-08-05 16:54:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Before Approval.
@param IsBeforeApproval The Check is before the (manual) approval */
public void setIsBeforeApproval (boolean IsBeforeApproval)
{
set_Value (COLUMNNAME_IsBeforeApproval, Boolean.valueOf(IsBeforeApproval));
}
/** Get Before Approval.
@return The Check is before the (manual) approval */
public boolean isBeforeApproval() 
{
Object oo = get_Value(COLUMNNAME_IsBeforeApproval);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2096b465-9c90-5db0-09c0-2e6983c7019a")
public static String es_PE_FIELD_BudgetControl_BeforeApproval_Description="El Verificar es antes de aprobar (manual) ";

@XendraTrl(Identifier="2096b465-9c90-5db0-09c0-2e6983c7019a")
public static String es_PE_FIELD_BudgetControl_BeforeApproval_Help="Si es seleccionado, la apoación de presupuesto es antes que las aprobaciones manuales - ej. solamente es aprobada si el presupuesto está disponible. Esto puede provocar que el empleo de presupuesto sea retardado (después de la aprobación)";

@XendraTrl(Identifier="2096b465-9c90-5db0-09c0-2e6983c7019a")
public static String es_PE_FIELD_BudgetControl_BeforeApproval_Name="Antes de Aprobación";

@XendraField(AD_Column_ID="IsBeforeApproval",IsCentrallyMaintained=true,
AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2096b465-9c90-5db0-09c0-2e6983c7019a")
public static final String FIELDNAME_BudgetControl_BeforeApproval="2096b465-9c90-5db0-09c0-2e6983c7019a";

@XendraTrl(Identifier="1ae6da18-bea7-88c8-5d8b-506f51a6fb02")
public static String es_PE_COLUMN_IsBeforeApproval_Name="Antes de Aprobación";

@XendraColumn(AD_Element_ID="67bb441d-d288-636e-857b-03604fc0afa3",ColumnName="IsBeforeApproval",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ae6da18-bea7-88c8-5d8b-506f51a6fb02",
Synchronized="2017-08-05 16:54:40.0")
/** Column name IsBeforeApproval */
public static final String COLUMNNAME_IsBeforeApproval = "IsBeforeApproval";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="f9cdc276-8531-96f0-e88e-cfedd5c3c944")
public static String es_PE_FIELD_BudgetControl_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f9cdc276-8531-96f0-e88e-cfedd5c3c944")
public static String es_PE_FIELD_BudgetControl_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="f9cdc276-8531-96f0-e88e-cfedd5c3c944")
public static String es_PE_FIELD_BudgetControl_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="9ee45cc5-3ff0-23c7-07cd-d84f7e56e52e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f9cdc276-8531-96f0-e88e-cfedd5c3c944")
public static final String FIELDNAME_BudgetControl_Name="f9cdc276-8531-96f0-e88e-cfedd5c3c944";

@XendraTrl(Identifier="8cb7a351-19a2-38dd-5bdb-1042daed5a3b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cb7a351-19a2-38dd-5bdb-1042daed5a3b",
Synchronized="2017-08-05 16:54:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
