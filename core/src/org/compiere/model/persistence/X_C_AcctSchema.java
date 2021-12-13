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
/** Generated Model for C_AcctSchema
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AcctSchema extends PO
{
/** Standard Constructor
@param ctx context
@param C_AcctSchema_ID id
@param trxName transaction
*/
public X_C_AcctSchema (Properties ctx, int C_AcctSchema_ID, String trxName)
{
super (ctx, C_AcctSchema_ID, trxName);
/** if (C_AcctSchema_ID == 0)
{
setAutoPeriodControl (false);	
// N
setC_AcctSchema_ID (0);
setC_Currency_ID (0);
setCommitmentType (null);	
// N
setCostedFrom (new Timestamp(System.currentTimeMillis()));
setCostingLevel (null);	
// C
setCostingMethod (null);	
// S
setGAAP (null);
setHasAlias (false);	
// N
setHasCombination (false);	
// N
setIsAccrual (true);	
// Y
setIsAdjustCOGS (false);	
// N
setIsDiscountCorrectsTax (false);	
// N
setIsExplicitCostAdjustment (false);	
// N
setIsPostServices (false);	
// N
setIsTradeDiscountPosted (false);	
// N
setM_CostElement_ID (0);
setName (null);
setSeparator (null);	
// -
setTaxCorrectionType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_AcctSchema (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=265 */
public static int Table_ID=MTable.getTable_ID("C_AcctSchema");

@XendraTrl(Identifier="554d2124-ffef-868e-8705-4a67fb6ed18d")
public static String es_PE_TAB_AccountingSchema_Description="Definir estructura del esquema contable";

@XendraTrl(Identifier="554d2124-ffef-868e-8705-4a67fb6ed18d")
public static String es_PE_TAB_AccountingSchema_Help="La pestaña de Esquema Contable define los controles para la contabilidad. Cada organización selecciona un esquema contable para su uso.";

@XendraTrl(Identifier="554d2124-ffef-868e-8705-4a67fb6ed18d")
public static String es_PE_TAB_AccountingSchema_Name="Esquema Contable";

@XendraTab(Name="Accounting Schema",Description="Define your Account Schema Structure",
Help="The Accounting Schema Tab defines the controls used for accounting.  You can define multiple accounting schema per client (for parallel accounting).   Postings are generated for an accounting schema, if the schema is valid and you have defined GL and Default accounts and after completion of the Add / Copy Accounts process.",
AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",
CommitWarning="If you change the currency or costing method, you must to reset t all accounting transactions. For changes to become effective, you must re-login and re-start the Application Server. ",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="554d2124-ffef-868e-8705-4a67fb6ed18d",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AccountingSchema="554d2124-ffef-868e-8705-4a67fb6ed18d";

@XendraTrl(Identifier="705122a9-d3b8-b057-4c3b-ff5459cd0f15")
public static String es_PE_TABLE_C_AcctSchema_Name="Esquema Contable";

@XendraTable(Name="Accounting Schema",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Rules for accounting",Help="",
TableName="C_AcctSchema",AccessLevel="2",AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="705122a9-d3b8-b057-4c3b-ff5459cd0f15",Synchronized="2020-03-03 21:36:19.0")
/** TableName=C_AcctSchema */
public static final String Table_Name="C_AcctSchema";


@XendraIndex(Name="c_acctschema_name",Identifier="ef3579fe-5c35-e83b-a073-4a5887b91049",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="ef3579fe-5c35-e83b-a073-4a5887b91049",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_acctschema_name = "ef3579fe-5c35-e83b-a073-4a5887b91049";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AcctSchema");

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
    Table_ID = MTable.getTable_ID("C_AcctSchema");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AcctSchema[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Only Organization.
@param AD_OrgOnly_ID Create posting entries only for this organization */
public void setAD_OrgOnly_ID (int AD_OrgOnly_ID)
{
if (AD_OrgOnly_ID <= 0) set_Value (COLUMNNAME_AD_OrgOnly_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgOnly_ID, Integer.valueOf(AD_OrgOnly_ID));
}
/** Get Only Organization.
@return Create posting entries only for this organization */
public int getAD_OrgOnly_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgOnly_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="67862272-30c1-edd3-308a-ce9e4c2f5fc0")
public static String es_PE_FIELD_AccountingSchema_OnlyOrganization_Name="Sólo Organización";

@XendraTrl(Identifier="67862272-30c1-edd3-308a-ce9e4c2f5fc0")
public static String es_PE_FIELD_AccountingSchema_OnlyOrganization_Description="Crear aplicación de entradas solo para esta organización";

@XendraTrl(Identifier="67862272-30c1-edd3-308a-ce9e4c2f5fc0")
public static String es_PE_FIELD_AccountingSchema_OnlyOrganization_Help="Cuando usted tiene múltiples esquemas contables, usted puede desear restringir la generación de aplicación de entradas para el esquema contable adicional (ej no para la org primaria). Ejemplo usted puede tener una organización en US y otra en FR. El esquema contable primario en USD, el segundo en EUR, si para el esquema contable en EUR  usted selecciona la organización FR, usted podrá no crear entradas contables para transacciónes de la organización US en EUR .";

@XendraField(AD_Column_ID="AD_OrgOnly_ID",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67862272-30c1-edd3-308a-ce9e4c2f5fc0")
public static final String FIELDNAME_AccountingSchema_OnlyOrganization="67862272-30c1-edd3-308a-ce9e4c2f5fc0";

@XendraTrl(Identifier="ff01fc04-e077-c75c-daca-800061664795")
public static String es_PE_COLUMN_AD_OrgOnly_ID_Name="Sólo Organización";

@XendraColumn(AD_Element_ID="9c30a255-a66a-3df0-779b-6595115e3fe8",ColumnName="AD_OrgOnly_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="03b73d55-8464-9bbd-df2b-d10ff9f3913f",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ff01fc04-e077-c75c-daca-800061664795",Synchronized="2019-08-30 22:20:59.0")
/** Column name AD_OrgOnly_ID */
public static final String COLUMNNAME_AD_OrgOnly_ID = "AD_OrgOnly_ID";
/** Set Automatic Period Control.
@param AutoPeriodControl If selected, the periods are automatically opened and closed */
public void setAutoPeriodControl (boolean AutoPeriodControl)
{
set_Value (COLUMNNAME_AutoPeriodControl, Boolean.valueOf(AutoPeriodControl));
}
/** Get Automatic Period Control.
@return If selected, the periods are automatically opened and closed */
public boolean isAutoPeriodControl() 
{
Object oo = get_Value(COLUMNNAME_AutoPeriodControl);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cb6eb9db-4448-2e11-e185-771e64981e46")
public static String es_PE_FIELD_AccountingSchema_AutomaticPeriodControl_Name="Control de Período Automático";

@XendraTrl(Identifier="cb6eb9db-4448-2e11-e185-771e64981e46")
public static String es_PE_FIELD_AccountingSchema_AutomaticPeriodControl_Description="Si es seleccionado; los períodos son abiertos y cerrados automáticamente";

@XendraTrl(Identifier="cb6eb9db-4448-2e11-e185-771e64981e46")
public static String es_PE_FIELD_AccountingSchema_AutomaticPeriodControl_Help="Con control de período automático; los períodos son abiertos y cerrados en base a la fecha actual. Sí la alternativa manual se activa; es necesario abrir y cerrar los períodos manualmente";

@XendraField(AD_Column_ID="AutoPeriodControl",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb6eb9db-4448-2e11-e185-771e64981e46")
public static final String FIELDNAME_AccountingSchema_AutomaticPeriodControl="cb6eb9db-4448-2e11-e185-771e64981e46";

@XendraTrl(Identifier="6b291b1d-2bfd-d4b6-a8b9-6a05af75989e")
public static String es_PE_COLUMN_AutoPeriodControl_Name="Control de Período Automático";

@XendraColumn(AD_Element_ID="18fa68ae-5bf7-0351-1c0f-77e34b808332",ColumnName="AutoPeriodControl",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b291b1d-2bfd-d4b6-a8b9-6a05af75989e",
Synchronized="2019-08-30 22:20:59.0")
/** Column name AutoPeriodControl */
public static final String COLUMNNAME_AutoPeriodControl = "AutoPeriodControl";
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

@XendraTrl(Identifier="b581f940-70b0-b019-3675-869d0ec146fb")
public static String es_PE_FIELD_AccountingSchema_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="b581f940-70b0-b019-3675-869d0ec146fb")
public static String es_PE_FIELD_AccountingSchema_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="b581f940-70b0-b019-3675-869d0ec146fb")
public static String es_PE_FIELD_AccountingSchema_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b581f940-70b0-b019-3675-869d0ec146fb")
public static final String FIELDNAME_AccountingSchema_AccountingSchema="b581f940-70b0-b019-3675-869d0ec146fb";
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="b29f11bd-f048-e55b-5a47-d9dc5524d0cd")
public static String es_PE_FIELD_AccountingSchema_Currency_Name="Moneda";

@XendraTrl(Identifier="b29f11bd-f048-e55b-5a47-d9dc5524d0cd")
public static String es_PE_FIELD_AccountingSchema_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="b29f11bd-f048-e55b-5a47-d9dc5524d0cd")
public static String es_PE_FIELD_AccountingSchema_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b29f11bd-f048-e55b-5a47-d9dc5524d0cd")
public static final String FIELDNAME_AccountingSchema_Currency="b29f11bd-f048-e55b-5a47-d9dc5524d0cd";

@XendraTrl(Identifier="d3958688-4329-87d8-72f4-d09a2f569064")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3958688-4329-87d8-72f4-d09a2f569064",
Synchronized="2019-08-30 22:20:59.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Commitment Type.
@param CommitmentType Create Commitment and/or Reservations for Budget Control */
public void setCommitmentType (String CommitmentType)
{
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

@XendraTrl(Identifier="c571fea6-288b-6e1a-4260-742b85a43d44")
public static String es_PE_FIELD_AccountingSchema_CommitmentType_Name="Tipo de Compromiso";

@XendraTrl(Identifier="c571fea6-288b-6e1a-4260-742b85a43d44")
public static String es_PE_FIELD_AccountingSchema_CommitmentType_Description="Crear Compromiso y/o Reservados para Control de Presupuesto";

@XendraTrl(Identifier="c571fea6-288b-6e1a-4260-742b85a43d44")
public static String es_PE_FIELD_AccountingSchema_CommitmentType_Help="El Compromiso Tipo Aplicación es creado al aplicar Ordenes de Compra; El Reservado Tipo Aplicación es creado al aplicar una Requisición. Esto es empleado para Control de Presupuesto.";

@XendraField(AD_Column_ID="CommitmentType",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c571fea6-288b-6e1a-4260-742b85a43d44")
public static final String FIELDNAME_AccountingSchema_CommitmentType="c571fea6-288b-6e1a-4260-742b85a43d44";

@XendraTrl(Identifier="a40c2fe6-7bea-bfd9-24d5-67da99503075")
public static String es_PE_COLUMN_CommitmentType_Name="Tipo de Compromiso";

@XendraColumn(AD_Element_ID="1679c1ca-5fbd-ab2d-f95a-c9d5b4fd91b6",ColumnName="CommitmentType",
AD_Reference_ID=17,AD_Reference_Value_ID="02423143-0566-ffd3-86cd-8a9e29dfa190",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a40c2fe6-7bea-bfd9-24d5-67da99503075",Synchronized="2019-08-30 22:20:59.0")
/** Column name CommitmentType */
public static final String COLUMNNAME_CommitmentType = "CommitmentType";
/** Set CostedFrom.
@param CostedFrom CostedFrom */
public void setCostedFrom (Timestamp CostedFrom)
{
if (CostedFrom == null) throw new IllegalArgumentException ("CostedFrom is mandatory.");
set_Value (COLUMNNAME_CostedFrom, CostedFrom);
}
/** Get CostedFrom.
@return CostedFrom */
public Timestamp getCostedFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_CostedFrom);
}

@XendraTrl(Identifier="a11c138d-f215-4491-a1f1-ea4ac7aa77cb")
public static String es_PE_FIELD_AccountingSchema_CostedFrom_Name="costedfrom";

@XendraField(AD_Column_ID="CostedFrom",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-04-01 08:00:48.0",
Identifier="a11c138d-f215-4491-a1f1-ea4ac7aa77cb")
public static final String FIELDNAME_AccountingSchema_CostedFrom="a11c138d-f215-4491-a1f1-ea4ac7aa77cb";

@XendraTrl(Identifier="6d98b601-f71a-4086-8496-245c752d4b7b")
public static String es_PE_COLUMN_CostedFrom_Name="costedfrom";

@XendraColumn(AD_Element_ID="4c6f677f-2de1-48dc-8f2e-9237782943d2",ColumnName="CostedFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d98b601-f71a-4086-8496-245c752d4b7b",
Synchronized="2019-08-30 22:20:59.0")
/** Column name CostedFrom */
public static final String COLUMNNAME_CostedFrom = "CostedFrom";
/** Set Costing Level.
@param CostingLevel The lowest level to accumulate Costing Information */
public void setCostingLevel (String CostingLevel)
{
if (CostingLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
CostingLevel = CostingLevel.substring(0,0);
}
set_Value (COLUMNNAME_CostingLevel, CostingLevel);
}
/** Get Costing Level.
@return The lowest level to accumulate Costing Information */
public String getCostingLevel() 
{
return (String)get_Value(COLUMNNAME_CostingLevel);
}

@XendraTrl(Identifier="59c144ff-1ed1-a115-a598-d6de17436989")
public static String es_PE_FIELD_AccountingSchema_CostingLevel_Name="Nivel de Costeo";

@XendraTrl(Identifier="59c144ff-1ed1-a115-a598-d6de17436989")
public static String es_PE_FIELD_AccountingSchema_CostingLevel_Description="El nivel mas bajo para acumular información del costeo";

@XendraTrl(Identifier="59c144ff-1ed1-a115-a598-d6de17436989")
public static String es_PE_FIELD_AccountingSchema_CostingLevel_Help="Si desea mantener diferentes costos por organización (Almacén) o por Lote/No de Lote, cerciorese que usted define el costo para cada organización  o  Lote/No de Lote. El nivel de Costeo es definido  por Esquema Contable y puede ser sobreescrito mediante Categoría de Producto y Esquema Contable.";

@XendraField(AD_Column_ID="CostingLevel",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59c144ff-1ed1-a115-a598-d6de17436989")
public static final String FIELDNAME_AccountingSchema_CostingLevel="59c144ff-1ed1-a115-a598-d6de17436989";

@XendraTrl(Identifier="b3118e70-e43f-a187-eead-86cfaf810a2c")
public static String es_PE_COLUMN_CostingLevel_Name="Nivel de Costeo";

@XendraColumn(AD_Element_ID="75255888-a130-58b8-ac62-be5642b80011",ColumnName="CostingLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="50276432-1362-79b4-e882-a2d08541856b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b3118e70-e43f-a187-eead-86cfaf810a2c",Synchronized="2019-08-30 22:20:59.0")
/** Column name CostingLevel */
public static final String COLUMNNAME_CostingLevel = "CostingLevel";
/** Set Costing Method.
@param CostingMethod Indicates how Costs will be calculated */
public void setCostingMethod (String CostingMethod)
{
if (CostingMethod.length() > 1)
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

@XendraTrl(Identifier="b035ce73-d7a4-f055-fca9-fe34a98d5764")
public static String es_PE_FIELD_AccountingSchema_CostingMethod_Name="Método de Costeo";

@XendraTrl(Identifier="b035ce73-d7a4-f055-fca9-fe34a98d5764")
public static String es_PE_FIELD_AccountingSchema_CostingMethod_Description="Indica cómo serán calculados los costos";

@XendraTrl(Identifier="b035ce73-d7a4-f055-fca9-fe34a98d5764")
public static String es_PE_FIELD_AccountingSchema_CostingMethod_Help="El método de costeo indica cómo se calcularán los costos (Estándar; promedio)";

@XendraField(AD_Column_ID="CostingMethod",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b035ce73-d7a4-f055-fca9-fe34a98d5764")
public static final String FIELDNAME_AccountingSchema_CostingMethod="b035ce73-d7a4-f055-fca9-fe34a98d5764";

@XendraTrl(Identifier="2a161f63-55b1-024c-b450-763530b0890a")
public static String es_PE_COLUMN_CostingMethod_Name="Método de Costeo";

@XendraColumn(AD_Element_ID="d3c72366-8d7e-1b49-ef94-f5412c3f434c",ColumnName="CostingMethod",
AD_Reference_ID=17,AD_Reference_Value_ID="f784bd15-8b38-c388-3a0e-a0ae23b717ec",
AD_Val_Rule_ID="62983f4c-0f5e-8a77-2189-53895351bcb2",FieldLength=1,DefaultValue="S",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a161f63-55b1-024c-b450-763530b0890a",
Synchronized="2019-08-30 22:20:59.0")
/** Column name CostingMethod */
public static final String COLUMNNAME_CostingMethod = "CostingMethod";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Period_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9dea2bb5-d2c0-af2d-aaaf-978643f910dc")
public static String es_PE_FIELD_AccountingSchema_Period_Name="Período";

@XendraTrl(Identifier="9dea2bb5-d2c0-af2d-aaaf-978643f910dc")
public static String es_PE_FIELD_AccountingSchema_Period_Description="Período de Calendario";

@XendraTrl(Identifier="9dea2bb5-d2c0-af2d-aaaf-978643f910dc")
public static String es_PE_FIELD_AccountingSchema_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AutoPeriodControl@='Y'",DisplayLength=14,IsReadOnly=true,SeqNo=150,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9dea2bb5-d2c0-af2d-aaaf-978643f910dc")
public static final String FIELDNAME_AccountingSchema_Period="9dea2bb5-d2c0-af2d-aaaf-978643f910dc";

@XendraTrl(Identifier="6f89bbc3-683d-6c9c-d76e-436b08c17dda")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f89bbc3-683d-6c9c-d76e-436b08c17dda",
Synchronized="2019-08-30 22:20:59.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
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

@XendraTrl(Identifier="25f6cce9-ab5b-6591-6ed9-1ce24f36aa10")
public static String es_PE_FIELD_AccountingSchema_Description_Name="Observación";

@XendraTrl(Identifier="25f6cce9-ab5b-6591-6ed9-1ce24f36aa10")
public static String es_PE_FIELD_AccountingSchema_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="25f6cce9-ab5b-6591-6ed9-1ce24f36aa10")
public static String es_PE_FIELD_AccountingSchema_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25f6cce9-ab5b-6591-6ed9-1ce24f36aa10")
public static final String FIELDNAME_AccountingSchema_Description="25f6cce9-ab5b-6591-6ed9-1ce24f36aa10";

@XendraTrl(Identifier="0657612b-019e-9472-7694-0c6e5824fc6b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0657612b-019e-9472-7694-0c6e5824fc6b",
Synchronized="2019-08-30 22:20:59.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set GAAP.
@param GAAP Generally Accepted Accounting Principles */
public void setGAAP (String GAAP)
{
if (GAAP.length() > 2)
{
log.warning("Length > 2 - truncated");
GAAP = GAAP.substring(0,1);
}
set_Value (COLUMNNAME_GAAP, GAAP);
}
/** Get GAAP.
@return Generally Accepted Accounting Principles */
public String getGAAP() 
{
return (String)get_Value(COLUMNNAME_GAAP);
}

@XendraTrl(Identifier="7e139af4-bafd-db54-fcdd-4872373ae016")
public static String es_PE_FIELD_AccountingSchema_GAAP_Name="GAAP";

@XendraTrl(Identifier="7e139af4-bafd-db54-fcdd-4872373ae016")
public static String es_PE_FIELD_AccountingSchema_GAAP_Description="Principios de Contabilidad Generalmente Aceptados.";

@XendraTrl(Identifier="7e139af4-bafd-db54-fcdd-4872373ae016")
public static String es_PE_FIELD_AccountingSchema_GAAP_Help="El GAAP identifica los principios contables en que este esquema contable esta basado.";

@XendraField(AD_Column_ID="GAAP",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e139af4-bafd-db54-fcdd-4872373ae016")
public static final String FIELDNAME_AccountingSchema_GAAP="7e139af4-bafd-db54-fcdd-4872373ae016";

@XendraTrl(Identifier="911cbf8b-b519-b876-683f-47839ddfa029")
public static String es_PE_COLUMN_GAAP_Name="GAAP";

@XendraColumn(AD_Element_ID="71800fd9-9b15-4a69-1873-f70c1172f7d6",ColumnName="GAAP",
AD_Reference_ID=17,AD_Reference_Value_ID="a2f94990-e1f6-4c2e-a891-4ea9109dd64e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="911cbf8b-b519-b876-683f-47839ddfa029",Synchronized="2019-08-30 22:20:59.0")
/** Column name GAAP */
public static final String COLUMNNAME_GAAP = "GAAP";
/** Set Use Account Alias.
@param HasAlias Ability to select (partial) account combinations by an Alias */
public void setHasAlias (boolean HasAlias)
{
set_Value (COLUMNNAME_HasAlias, Boolean.valueOf(HasAlias));
}
/** Get Use Account Alias.
@return Ability to select (partial) account combinations by an Alias */
public boolean isHasAlias() 
{
Object oo = get_Value(COLUMNNAME_HasAlias);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4acfb34b-0d2f-35d1-7504-b67fd3ca5508")
public static String es_PE_FIELD_AccountingSchema_UseAccountAlias_Name="Uso de Alias en Cuentas";

@XendraTrl(Identifier="4acfb34b-0d2f-35d1-7504-b67fd3ca5508")
public static String es_PE_FIELD_AccountingSchema_UseAccountAlias_Description="Capacidad para seleccionar (parcial) combinaciones de cuenta por medio de un alias";

@XendraTrl(Identifier="4acfb34b-0d2f-35d1-7504-b67fd3ca5508")
public static String es_PE_FIELD_AccountingSchema_UseAccountAlias_Help="El Cuadro de verificación alias indica que la combinación contable puede ser seleccionada usando un alias definido por el usuario ó una clave corta";

@XendraField(AD_Column_ID="HasAlias",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4acfb34b-0d2f-35d1-7504-b67fd3ca5508")
public static final String FIELDNAME_AccountingSchema_UseAccountAlias="4acfb34b-0d2f-35d1-7504-b67fd3ca5508";

@XendraTrl(Identifier="2c5ede45-c695-3cb5-7e35-fd760f78affb")
public static String es_PE_COLUMN_HasAlias_Name="Uso de Alias en Cuentas";

@XendraColumn(AD_Element_ID="f1b9eea3-a577-5754-0423-d270fcd3942f",ColumnName="HasAlias",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c5ede45-c695-3cb5-7e35-fd760f78affb",
Synchronized="2019-08-30 22:20:59.0")
/** Column name HasAlias */
public static final String COLUMNNAME_HasAlias = "HasAlias";
/** Set Use Account Combination Control.
@param HasCombination Combination of account elements are checked */
public void setHasCombination (boolean HasCombination)
{
set_Value (COLUMNNAME_HasCombination, Boolean.valueOf(HasCombination));
}
/** Get Use Account Combination Control.
@return Combination of account elements are checked */
public boolean isHasCombination() 
{
Object oo = get_Value(COLUMNNAME_HasCombination);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="57efee53-a914-6e1e-c5f1-268abb3da48f")
public static String es_PE_FIELD_AccountingSchema_UseAccountCombinationControl_Name="Usar Control de Combinación de Cuentas";

@XendraTrl(Identifier="57efee53-a914-6e1e-c5f1-268abb3da48f")
public static String es_PE_FIELD_AccountingSchema_UseAccountCombinationControl_Description="Verificación de la combinación de los elementos de la cuenta";

@XendraTrl(Identifier="57efee53-a914-6e1e-c5f1-268abb3da48f")
public static String es_PE_FIELD_AccountingSchema_UseAccountCombinationControl_Help="El cuadro de verificación indica si la combinación de elementos de cuenta serán verificados contra la combinación aceptable definida";

@XendraField(AD_Column_ID="HasCombination",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57efee53-a914-6e1e-c5f1-268abb3da48f")
public static final String FIELDNAME_AccountingSchema_UseAccountCombinationControl="57efee53-a914-6e1e-c5f1-268abb3da48f";

@XendraTrl(Identifier="4e292cd2-88a1-a810-fba3-d253bc887b83")
public static String es_PE_COLUMN_HasCombination_Name="Usar Control de Combinación de Cuentas";

@XendraColumn(AD_Element_ID="879b7dc3-d1ed-f92c-213a-133bf654ce06",ColumnName="HasCombination",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e292cd2-88a1-a810-fba3-d253bc887b83",
Synchronized="2019-08-30 22:20:59.0")
/** Column name HasCombination */
public static final String COLUMNNAME_HasCombination = "HasCombination";
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
@XendraTrl(Identifier="624f749d-2f04-4798-aad8-0c045ae3a027")
public static String es_PE_FIELD_AccountingSchema_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-04-01 08:00:48.0",
Identifier="624f749d-2f04-4798-aad8-0c045ae3a027")
public static final String FIELDNAME_AccountingSchema_Identifier="624f749d-2f04-4798-aad8-0c045ae3a027";

@XendraTrl(Identifier="2b882425-5789-4b3c-9782-378e1bc836f8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b882425-5789-4b3c-9782-378e1bc836f8",
Synchronized="2019-08-30 22:20:59.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Accrual.
@param IsAccrual Indicates if Accrual or Cash Based accounting will be used */
public void setIsAccrual (boolean IsAccrual)
{
set_Value (COLUMNNAME_IsAccrual, Boolean.valueOf(IsAccrual));
}
/** Get Accrual.
@return Indicates if Accrual or Cash Based accounting will be used */
public boolean isAccrual() 
{
Object oo = get_Value(COLUMNNAME_IsAccrual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e654fd9d-7d9a-62da-9045-2014ca11f9c0")
public static String es_PE_FIELD_AccountingSchema_Accrual_Name="Absorción (Acumulación)";

@XendraTrl(Identifier="e654fd9d-7d9a-62da-9045-2014ca11f9c0")
public static String es_PE_FIELD_AccountingSchema_Accrual_Description="Indica que se usará contabilidad basada en efectivo o absorción.";

@XendraTrl(Identifier="e654fd9d-7d9a-62da-9045-2014ca11f9c0")
public static String es_PE_FIELD_AccountingSchema_Accrual_Help="El Cuadro de Verificación Absorción indica si el esquema contable usará contabilidad basada en absorción o contabilidad basada en efectivo.  El método de Absorción reconoce ingresos cuando el producto o servicio es entregado. El método basado en efectivo reconoce ingresos cuando el pago es recibido.";

@XendraField(AD_Column_ID="IsAccrual",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e654fd9d-7d9a-62da-9045-2014ca11f9c0")
public static final String FIELDNAME_AccountingSchema_Accrual="e654fd9d-7d9a-62da-9045-2014ca11f9c0";

@XendraTrl(Identifier="13892427-814f-18fd-f33f-b5de554c289c")
public static String es_PE_COLUMN_IsAccrual_Name="Absorción (Acumulación)";

@XendraColumn(AD_Element_ID="b23ba12a-e85f-066b-cb9b-5cf551050289",ColumnName="IsAccrual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13892427-814f-18fd-f33f-b5de554c289c",
Synchronized="2019-08-30 22:20:59.0")
/** Column name IsAccrual */
public static final String COLUMNNAME_IsAccrual = "IsAccrual";
/** Set Adjust COGS.
@param IsAdjustCOGS Adjust Cost of Good Sold */
public void setIsAdjustCOGS (boolean IsAdjustCOGS)
{
set_Value (COLUMNNAME_IsAdjustCOGS, Boolean.valueOf(IsAdjustCOGS));
}
/** Get Adjust COGS.
@return Adjust Cost of Good Sold */
public boolean isAdjustCOGS() 
{
Object oo = get_Value(COLUMNNAME_IsAdjustCOGS);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9cd5b03d-890f-75ba-d26a-48070e1a6a35")
public static String es_PE_FIELD_AccountingSchema_AdjustCOGS_Name="Ajustar CDV";

@XendraTrl(Identifier="9cd5b03d-890f-75ba-d26a-48070e1a6a35")
public static String es_PE_FIELD_AccountingSchema_AdjustCOGS_Description="Ajusta Costo DE Venta";

@XendraTrl(Identifier="9cd5b03d-890f-75ba-d26a-48070e1a6a35")
public static String es_PE_FIELD_AccountingSchema_AdjustCOGS_Help="Para métodos de costeo de facturas, usted puede ajustar el costo de la venta al momento de la entrega, pudo no haber recibido la factura para el ajuste del costo como es flete,  gastos, etc.";

@XendraField(AD_Column_ID="IsAdjustCOGS",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@CostingMethod@=F | @CostingMethod@=I | @CostingMethod@=L",DisplayLength=1,
IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cd5b03d-890f-75ba-d26a-48070e1a6a35")
public static final String FIELDNAME_AccountingSchema_AdjustCOGS="9cd5b03d-890f-75ba-d26a-48070e1a6a35";

@XendraTrl(Identifier="3240e67b-3340-34f9-e29b-c85ab6ba9e15")
public static String es_PE_COLUMN_IsAdjustCOGS_Name="Ajustar CDV";

@XendraColumn(AD_Element_ID="599b2062-025c-8e62-7126-f5fb05a494e9",ColumnName="IsAdjustCOGS",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3240e67b-3340-34f9-e29b-c85ab6ba9e15",
Synchronized="2019-08-30 22:20:59.0")
/** Column name IsAdjustCOGS */
public static final String COLUMNNAME_IsAdjustCOGS = "IsAdjustCOGS";
/** Set IsAutoCosted.
@param IsAutoCosted IsAutoCosted */
public void setIsAutoCosted (boolean IsAutoCosted)
{
set_Value (COLUMNNAME_IsAutoCosted, Boolean.valueOf(IsAutoCosted));
}
/** Get IsAutoCosted.
@return IsAutoCosted */
public boolean isAutoCosted() 
{
Object oo = get_Value(COLUMNNAME_IsAutoCosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="667f2423-894a-44d7-a3d7-52904134c3cc")
public static String es_PE_FIELD_AccountingSchema_IsAutoCosted_Name="isautocosted";

@XendraField(AD_Column_ID="IsAutoCosted",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-04-01 08:00:48.0",
Identifier="667f2423-894a-44d7-a3d7-52904134c3cc")
public static final String FIELDNAME_AccountingSchema_IsAutoCosted="667f2423-894a-44d7-a3d7-52904134c3cc";

@XendraTrl(Identifier="98d3dc85-9373-49ca-993b-ba50e3d9d073")
public static String es_PE_COLUMN_IsAutoCosted_Name="isautocosted";

@XendraColumn(AD_Element_ID="cfb974fd-e823-45cd-8ef9-bd4d30b8bb22",ColumnName="IsAutoCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98d3dc85-9373-49ca-993b-ba50e3d9d073",
Synchronized="2019-08-30 22:20:59.0")
/** Column name IsAutoCosted */
public static final String COLUMNNAME_IsAutoCosted = "IsAutoCosted";
/** Set Correct tax for Discounts/Charges.
@param IsDiscountCorrectsTax Correct the tax for payment discount and charges */
public void setIsDiscountCorrectsTax (boolean IsDiscountCorrectsTax)
{
set_Value (COLUMNNAME_IsDiscountCorrectsTax, Boolean.valueOf(IsDiscountCorrectsTax));
}
/** Get Correct tax for Discounts/Charges.
@return Correct the tax for payment discount and charges */
public boolean isDiscountCorrectsTax() 
{
Object oo = get_Value(COLUMNNAME_IsDiscountCorrectsTax);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c7c044eb-ba6a-c372-cb82-43fdf415430c")
public static String es_PE_FIELD_AccountingSchema_CorrectTaxForDiscountsCharges_Name="Corregir Impuesto para Descuento / cargos";

@XendraTrl(Identifier="c7c044eb-ba6a-c372-cb82-43fdf415430c")
public static String es_PE_FIELD_AccountingSchema_CorrectTaxForDiscountsCharges_Description="Corregir impuesto para descuento y cargos";

@XendraTrl(Identifier="c7c044eb-ba6a-c372-cb82-43fdf415430c")
public static String es_PE_FIELD_AccountingSchema_CorrectTaxForDiscountsCharges_Help="Descuentos en pago puede requerir corregir el impuesto. Esto es aplicable primeramente en sistemas de IVA. Si la factura original había registrado impuesto; el descuento en pago; ajuste; etc. corrige el impuesto. El cálculo del impuesto es prorateado basado en la factura.";

@XendraField(AD_Column_ID="IsDiscountCorrectsTax",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7c044eb-ba6a-c372-cb82-43fdf415430c")
public static final String FIELDNAME_AccountingSchema_CorrectTaxForDiscountsCharges="c7c044eb-ba6a-c372-cb82-43fdf415430c";

@XendraTrl(Identifier="83da941a-dc2d-11c3-052d-0d025cbb4250")
public static String es_PE_COLUMN_IsDiscountCorrectsTax_Name="Corregir Impuesto para Descuento / cargos";

@XendraColumn(AD_Element_ID="7f09010f-92dd-44a5-542b-96925bed85c4",
ColumnName="IsDiscountCorrectsTax",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="83da941a-dc2d-11c3-052d-0d025cbb4250",Synchronized="2019-08-30 22:20:59.0")
/** Column name IsDiscountCorrectsTax */
public static final String COLUMNNAME_IsDiscountCorrectsTax = "IsDiscountCorrectsTax";
/** Set Explicit Cost Adjustment.
@param IsExplicitCostAdjustment Post the cost adjustment explicitly */
public void setIsExplicitCostAdjustment (boolean IsExplicitCostAdjustment)
{
set_Value (COLUMNNAME_IsExplicitCostAdjustment, Boolean.valueOf(IsExplicitCostAdjustment));
}
/** Get Explicit Cost Adjustment.
@return Post the cost adjustment explicitly */
public boolean isExplicitCostAdjustment() 
{
Object oo = get_Value(COLUMNNAME_IsExplicitCostAdjustment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cce38a3b-3cba-4ffe-bac0-7ac695e790d5")
public static String es_PE_FIELD_AccountingSchema_ExplicitCostAdjustment_Name="Explicitar Ajuste de Costo";

@XendraTrl(Identifier="cce38a3b-3cba-4ffe-bac0-7ac695e790d5")
public static String es_PE_FIELD_AccountingSchema_ExplicitCostAdjustment_Description="Aplicar el Ajuste de Costo explícitamente ";

@XendraTrl(Identifier="cce38a3b-3cba-4ffe-bac0-7ac695e790d5")
public static String es_PE_FIELD_AccountingSchema_ExplicitCostAdjustment_Help="Si seleccionó, Costos Adicionales son aplicados a las cuentas en la línea y entpnces esta aplicación es revertida por la aplicación de Ajustar Costo de Cuenta. Si no es seleccionado, es directamente aplicado a Ajustar Costo de Cuenta.";

@XendraField(AD_Column_ID="IsExplicitCostAdjustment",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cce38a3b-3cba-4ffe-bac0-7ac695e790d5")
public static final String FIELDNAME_AccountingSchema_ExplicitCostAdjustment="cce38a3b-3cba-4ffe-bac0-7ac695e790d5";

@XendraTrl(Identifier="14fd86c8-4b11-ec74-23b2-bc7a48910ff2")
public static String es_PE_COLUMN_IsExplicitCostAdjustment_Name="Explicitar Ajuste de Costo";

@XendraColumn(AD_Element_ID="2a2e5022-0779-a407-e629-dead8e205aa2",
ColumnName="IsExplicitCostAdjustment",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="14fd86c8-4b11-ec74-23b2-bc7a48910ff2",Synchronized="2019-08-30 22:20:59.0")
/** Column name IsExplicitCostAdjustment */
public static final String COLUMNNAME_IsExplicitCostAdjustment = "IsExplicitCostAdjustment";
/** Set Post Services Separately.
@param IsPostServices Differentiate between Services and Product Receivable/Payables */
public void setIsPostServices (boolean IsPostServices)
{
set_Value (COLUMNNAME_IsPostServices, Boolean.valueOf(IsPostServices));
}
/** Get Post Services Separately.
@return Differentiate between Services and Product Receivable/Payables */
public boolean isPostServices() 
{
Object oo = get_Value(COLUMNNAME_IsPostServices);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0d20e976-4efb-b812-ba63-c9e3cf04b577")
public static String es_PE_FIELD_AccountingSchema_PostServicesSeparately_Name="Aplicar Servicios Separadamente";

@XendraTrl(Identifier="0d20e976-4efb-b812-ba63-c9e3cf04b577")
public static String es_PE_FIELD_AccountingSchema_PostServicesSeparately_Description="Diferenciación entre Servicios y Productos Cobranzas/Pagos";

@XendraTrl(Identifier="0d20e976-4efb-b812-ba63-c9e3cf04b577")
public static String es_PE_FIELD_AccountingSchema_PostServicesSeparately_Help="Si seleccionó, usted aplicará ingresos a servicios relacionados a diferentes cuentas por cobrar y costos relacionados a servicios a diferentes cuentas por pagar.";

@XendraField(AD_Column_ID="IsPostServices",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d20e976-4efb-b812-ba63-c9e3cf04b577")
public static final String FIELDNAME_AccountingSchema_PostServicesSeparately="0d20e976-4efb-b812-ba63-c9e3cf04b577";

@XendraTrl(Identifier="1b417b23-7b24-97cf-6988-7676a599140a")
public static String es_PE_COLUMN_IsPostServices_Name="Aplicar Servicios Separadamente";

@XendraColumn(AD_Element_ID="760e6c84-28e1-ef93-f757-c0869617ba7a",ColumnName="IsPostServices",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b417b23-7b24-97cf-6988-7676a599140a",
Synchronized="2019-08-30 22:20:59.0")
/** Column name IsPostServices */
public static final String COLUMNNAME_IsPostServices = "IsPostServices";
/** Set Post Trade Discount.
@param IsTradeDiscountPosted Generate postings for trade discounts */
public void setIsTradeDiscountPosted (boolean IsTradeDiscountPosted)
{
set_Value (COLUMNNAME_IsTradeDiscountPosted, Boolean.valueOf(IsTradeDiscountPosted));
}
/** Get Post Trade Discount.
@return Generate postings for trade discounts */
public boolean isTradeDiscountPosted() 
{
Object oo = get_Value(COLUMNNAME_IsTradeDiscountPosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="444cbcda-b2c6-1fd6-3d95-825150710fd5")
public static String es_PE_FIELD_AccountingSchema_PostTradeDiscount_Name="Aplicar Descuento Comercial";

@XendraTrl(Identifier="444cbcda-b2c6-1fd6-3d95-825150710fd5")
public static String es_PE_FIELD_AccountingSchema_PostTradeDiscount_Description="Genera registro para descuentos comerciales";

@XendraTrl(Identifier="444cbcda-b2c6-1fd6-3d95-825150710fd5")
public static String es_PE_FIELD_AccountingSchema_PostTradeDiscount_Help="Si la factura se basa en un artículo con un precio de lista; el Total basado en el precio de lista y el descuento es registrado en lugar del Total neto";

@XendraField(AD_Column_ID="IsTradeDiscountPosted",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="444cbcda-b2c6-1fd6-3d95-825150710fd5")
public static final String FIELDNAME_AccountingSchema_PostTradeDiscount="444cbcda-b2c6-1fd6-3d95-825150710fd5";

@XendraTrl(Identifier="95b6a271-ba3e-117d-4700-13d669b906a6")
public static String es_PE_COLUMN_IsTradeDiscountPosted_Name="Aplicar Descuento Comercial";

@XendraColumn(AD_Element_ID="9c4a6984-a1c2-bdab-a7a8-1ca8507b6c89",
ColumnName="IsTradeDiscountPosted",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="95b6a271-ba3e-117d-4700-13d669b906a6",Synchronized="2019-08-30 22:20:59.0")
/** Column name IsTradeDiscountPosted */
public static final String COLUMNNAME_IsTradeDiscountPosted = "IsTradeDiscountPosted";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID < 1) throw new IllegalArgumentException ("M_CostElement_ID is mandatory.");
set_Value (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c669f4b8-c3c0-4b69-a8aa-d8d9837c2ef0")
public static String es_PE_FIELD_AccountingSchema_CostElement_Name="Elemento de Costo";

@XendraTrl(Identifier="c669f4b8-c3c0-4b69-a8aa-d8d9837c2ef0")
public static String es_PE_FIELD_AccountingSchema_CostElement_Description="Elemento de costo de producto";

@XendraField(AD_Column_ID="M_CostElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-04-01 08:00:48.0",
Identifier="c669f4b8-c3c0-4b69-a8aa-d8d9837c2ef0")
public static final String FIELDNAME_AccountingSchema_CostElement="c669f4b8-c3c0-4b69-a8aa-d8d9837c2ef0";

@XendraTrl(Identifier="90a4b1fc-2db5-3afd-afdf-5dbeb7b3a68c")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Cost Element";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90a4b1fc-2db5-3afd-afdf-5dbeb7b3a68c",
Synchronized="2019-08-30 22:20:59.0")
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

@XendraTrl(Identifier="119d21b1-fbea-1174-c17e-eea85f9d65ad")
public static String es_PE_FIELD_AccountingSchema_Name_Name="Nombre";

@XendraTrl(Identifier="119d21b1-fbea-1174-c17e-eea85f9d65ad")
public static String es_PE_FIELD_AccountingSchema_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="119d21b1-fbea-1174-c17e-eea85f9d65ad")
public static String es_PE_FIELD_AccountingSchema_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="119d21b1-fbea-1174-c17e-eea85f9d65ad")
public static final String FIELDNAME_AccountingSchema_Name="119d21b1-fbea-1174-c17e-eea85f9d65ad";

@XendraTrl(Identifier="e49e3cf0-755f-c855-4de5-1937bbde2a9a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e49e3cf0-755f-c855-4de5-1937bbde2a9a",
Synchronized="2019-08-30 22:20:59.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Future Days.
@param Period_OpenFuture Number of days to be able to post to a future date (based on system date) */
public void setPeriod_OpenFuture (int Period_OpenFuture)
{
set_Value (COLUMNNAME_Period_OpenFuture, Integer.valueOf(Period_OpenFuture));
}
/** Get Future Days.
@return Number of days to be able to post to a future date (based on system date) */
public int getPeriod_OpenFuture() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Period_OpenFuture);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="92df34c5-c9b0-a522-c30b-6032fd580196")
public static String es_PE_FIELD_AccountingSchema_FutureDays_Name="Días a Futuro";

@XendraTrl(Identifier="92df34c5-c9b0-a522-c30b-6032fd580196")
public static String es_PE_FIELD_AccountingSchema_FutureDays_Description="Número de días a futuro que es posible registrar (basado en la fecha del sistema)";

@XendraTrl(Identifier="92df34c5-c9b0-a522-c30b-6032fd580196")
public static String es_PE_FIELD_AccountingSchema_FutureDays_Help="Si control de período automático está habilitado; el período actual se calcula en base a la fecha del sistema y usted puede aplicar siempre a todos los días el período actual. Días a futuro permiten aplicar a períodos futuros. Ej. Hoy es 15 de abril y días a futuro se establece al 30";

@XendraField(AD_Column_ID="Period_OpenFuture",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AutoPeriodControl@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="92df34c5-c9b0-a522-c30b-6032fd580196")
public static final String FIELDNAME_AccountingSchema_FutureDays="92df34c5-c9b0-a522-c30b-6032fd580196";

@XendraTrl(Identifier="8369b0fc-05a3-7de8-3228-a7f08f285e23")
public static String es_PE_COLUMN_Period_OpenFuture_Name="Días a Futuro";

@XendraColumn(AD_Element_ID="7ecbf4a3-c0a1-7276-ee87-993e70ee9994",ColumnName="Period_OpenFuture",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8369b0fc-05a3-7de8-3228-a7f08f285e23",
Synchronized="2019-08-30 22:20:59.0")
/** Column name Period_OpenFuture */
public static final String COLUMNNAME_Period_OpenFuture = "Period_OpenFuture";
/** Set History Days.
@param Period_OpenHistory Number of days to be able to post in the past (based on system date) */
public void setPeriod_OpenHistory (int Period_OpenHistory)
{
set_Value (COLUMNNAME_Period_OpenHistory, Integer.valueOf(Period_OpenHistory));
}
/** Get History Days.
@return Number of days to be able to post in the past (based on system date) */
public int getPeriod_OpenHistory() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Period_OpenHistory);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2b1ec6e-3c4e-3283-432b-605554256f82")
public static String es_PE_FIELD_AccountingSchema_HistoryDays_Name="Días de Historia";

@XendraTrl(Identifier="f2b1ec6e-3c4e-3283-432b-605554256f82")
public static String es_PE_FIELD_AccountingSchema_HistoryDays_Description="Número de días en el pasado que es posible registrar (basado en la fecha del sistema)";

@XendraTrl(Identifier="f2b1ec6e-3c4e-3283-432b-605554256f82")
public static String es_PE_FIELD_AccountingSchema_HistoryDays_Help="Si control de período automático está habilitado; el período actual se calcula en base a la fecha del sistema y usted puede aplicar siempre a todos los días el período actual. Días de historia permiten aplicar a períodos previos.";

@XendraField(AD_Column_ID="Period_OpenHistory",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AutoPeriodControl@='Y'",DisplayLength=11,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f2b1ec6e-3c4e-3283-432b-605554256f82")
public static final String FIELDNAME_AccountingSchema_HistoryDays="f2b1ec6e-3c4e-3283-432b-605554256f82";

@XendraTrl(Identifier="77ccaa72-b802-ec62-ed4d-74c0e2eb8ad8")
public static String es_PE_COLUMN_Period_OpenHistory_Name="Días de Historia";

@XendraColumn(AD_Element_ID="b047ddfe-4156-e10d-980f-273f20958965",ColumnName="Period_OpenHistory",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77ccaa72-b802-ec62-ed4d-74c0e2eb8ad8",
Synchronized="2019-08-30 22:20:59.0")
/** Column name Period_OpenHistory */
public static final String COLUMNNAME_Period_OpenHistory = "Period_OpenHistory";
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

@XendraTrl(Identifier="890429ba-abad-b4a8-8d91-cd7610bf43fc")
public static String es_PE_FIELD_AccountingSchema_ProcessNow_Name="Crear CG/ Predeterminado ";

@XendraTrl(Identifier="890429ba-abad-b4a8-8d91-cd7610bf43fc")
public static String es_PE_FIELD_AccountingSchema_ProcessNow_Description="Copia valores de Elementos de Cuenta cotejados desde esquema contable existente";

@XendraTrl(Identifier="890429ba-abad-b4a8-8d91-cd7610bf43fc")
public static String es_PE_FIELD_AccountingSchema_ProcessNow_Help="Crear CG y predeterminar cuentas para este Esquema Contable y copia valores de elementos de cuenta cotejados.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="890429ba-abad-b4a8-8d91-cd7610bf43fc")
public static final String FIELDNAME_AccountingSchema_ProcessNow="890429ba-abad-b4a8-8d91-cd7610bf43fc";

@XendraTrl(Identifier="2da746d2-8cc0-2881-8eae-0deb5307e6b9")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="01fc9acd-8f62-4231-76e6-1a7839da54c8",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2da746d2-8cc0-2881-8eae-0deb5307e6b9",Synchronized="2019-08-30 22:20:59.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Element Separator.
@param Separator Element Separator */
public void setSeparator (String Separator)
{
if (Separator == null) throw new IllegalArgumentException ("Separator is mandatory.");
if (Separator.length() > 1)
{
log.warning("Length > 1 - truncated");
Separator = Separator.substring(0,0);
}
set_Value (COLUMNNAME_Separator, Separator);
}
/** Get Element Separator.
@return Element Separator */
public String getSeparator() 
{
String value = (String)get_Value(COLUMNNAME_Separator);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="65bae290-5e1e-0e45-6197-578e4a147c52")
public static String es_PE_FIELD_AccountingSchema_ElementSeparator_Name="Separador Elemento de Cuentas";

@XendraTrl(Identifier="65bae290-5e1e-0e45-6197-578e4a147c52")
public static String es_PE_FIELD_AccountingSchema_ElementSeparator_Description="Separador de los elementos de la cuenta";

@XendraTrl(Identifier="65bae290-5e1e-0e45-6197-578e4a147c52")
public static String es_PE_FIELD_AccountingSchema_ElementSeparator_Help="El separador de elementos de cuenta define el delimitador impreso entre los elementos de la cuenta.";

@XendraField(AD_Column_ID="Separator",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65bae290-5e1e-0e45-6197-578e4a147c52")
public static final String FIELDNAME_AccountingSchema_ElementSeparator="65bae290-5e1e-0e45-6197-578e4a147c52";

@XendraTrl(Identifier="58b17647-809e-677e-05f3-46775c4b03ad")
public static String es_PE_COLUMN_Separator_Name="Separador Elemento de Cuentas";

@XendraColumn(AD_Element_ID="afaa6265-5446-7f61-81a8-b90e9bcaa0fb",ColumnName="Separator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="-",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58b17647-809e-677e-05f3-46775c4b03ad",
Synchronized="2019-08-30 22:20:59.0")
/** Column name Separator */
public static final String COLUMNNAME_Separator = "Separator";
/** Set Tax Correction.
@param TaxCorrectionType Type of Tax Correction */
public void setTaxCorrectionType (String TaxCorrectionType)
{
if (TaxCorrectionType.length() > 1)
{
log.warning("Length > 1 - truncated");
TaxCorrectionType = TaxCorrectionType.substring(0,0);
}
set_Value (COLUMNNAME_TaxCorrectionType, TaxCorrectionType);
}
/** Get Tax Correction.
@return Type of Tax Correction */
public String getTaxCorrectionType() 
{
return (String)get_Value(COLUMNNAME_TaxCorrectionType);
}

@XendraTrl(Identifier="c2641d1c-658f-c630-09c5-d5b315249d0a")
public static String es_PE_FIELD_AccountingSchema_TaxCorrection_Name="Tax Correction";

@XendraTrl(Identifier="c2641d1c-658f-c630-09c5-d5b315249d0a")
public static String es_PE_FIELD_AccountingSchema_TaxCorrection_Description="Type of Tax Correction";

@XendraTrl(Identifier="c2641d1c-658f-c630-09c5-d5b315249d0a")
public static String es_PE_FIELD_AccountingSchema_TaxCorrection_Help="Determines if/when tax is corrected. Discount could be agreed or granted underpayments; Write-off may be partial or complete write-off.";

@XendraField(AD_Column_ID="TaxCorrectionType",IsCentrallyMaintained=true,
AD_Tab_ID="554d2124-ffef-868e-8705-4a67fb6ed18d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2641d1c-658f-c630-09c5-d5b315249d0a")
public static final String FIELDNAME_AccountingSchema_TaxCorrection="c2641d1c-658f-c630-09c5-d5b315249d0a";

@XendraTrl(Identifier="451d79bd-b793-2a23-3e3f-da620487cd47")
public static String es_PE_COLUMN_TaxCorrectionType_Name="Tax Correction";

@XendraColumn(AD_Element_ID="a0ba32ab-c10a-7612-6aac-c51a156a4a21",ColumnName="TaxCorrectionType",
AD_Reference_ID=17,AD_Reference_Value_ID="12590ff2-3d61-d0fd-e90c-1bda6aa57d6f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="451d79bd-b793-2a23-3e3f-da620487cd47",Synchronized="2019-08-30 22:20:59.0")
/** Column name TaxCorrectionType */
public static final String COLUMNNAME_TaxCorrectionType = "TaxCorrectionType";
}
