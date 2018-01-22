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
import org.compiere.model.reference.REF_GL_BudgetStatus;
/** Generated Model for GL_Budget
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_Budget extends PO
{
/** Standard Constructor
@param ctx context
@param GL_Budget_ID id
@param trxName transaction
*/
public X_GL_Budget (Properties ctx, int GL_Budget_ID, String trxName)
{
super (ctx, GL_Budget_ID, trxName);
/** if (GL_Budget_ID == 0)
{
setGL_Budget_ID (0);
setIsPrimary (false);	
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
public X_GL_Budget (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=271 */
public static int Table_ID=MTable.getTable_ID("GL_Budget");

@XendraTrl(Identifier="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49")
public static String es_PE_TAB_Budget_Description="La pestaña de presupuesto define un presupuesto de Libro Mayor";

@XendraTrl(Identifier="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49")
public static String es_PE_TAB_Budget_Name="Presupuesto";

@XendraTrl(Identifier="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49")
public static String es_PE_TAB_Budget_Help="Los presupuestos del libro mayor son usados para definir los costos anticipados de conducir el negocio. Son usados para reportar comparaciones con los Totales reales.";

@XendraTab(Name="Budget",Description="The GL Budget Tab defines a General Ledger Budget",
Help="The GL Budgets are used to define the anticipated costs of doing business.  They are used in reporting as a comparison to actual amounts.",
AD_Window_ID="f3c1af71-5fcf-0f37-af9e-5defb4a6e9d1",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Budget="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49";

@XendraTrl(Identifier="56fc38ad-deb0-395b-613e-0434766f5939")
public static String es_PE_TABLE_GL_Budget_Name="Presupuesto";

@XendraTable(Name="Budget",Description="General Ledger Budget",Help="",TableName="GL_Budget",
AccessLevel="3",AD_Window_ID="f3c1af71-5fcf-0f37-af9e-5defb4a6e9d1",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="56fc38ad-deb0-395b-613e-0434766f5939",Synchronized="2017-08-16 11:42:42.0")
/** TableName=GL_Budget */
public static final String Table_Name="GL_Budget";


@XendraIndex(Name="gl_budget_name",Identifier="249a26b8-82d5-d386-070d-fba30eb46546",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="249a26b8-82d5-d386-070d-fba30eb46546",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_gl_budget_name = "249a26b8-82d5-d386-070d-fba30eb46546";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_Budget");

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
    Table_ID = MTable.getTable_ID("GL_Budget");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_Budget[").append(get_ID()).append("]");
return sb.toString();
}

/** BudgetStatus AD_Reference=fcd2e472-c052-bde9-c921-dffd438016ae */
public static final int BUDGETSTATUS_AD_Reference_ID=178;
/** Set Budget Status.
@param BudgetStatus Indicates the current status of this budget */
public void setBudgetStatus (String BudgetStatus)
{
if (BudgetStatus == null || BudgetStatus.equals(REF_GL_BudgetStatus.Approved) || BudgetStatus.equals(REF_GL_BudgetStatus.Draft));
 else throw new IllegalArgumentException ("BudgetStatus Invalid value - " + BudgetStatus + " - Reference_ID=178 - A - D");
if (BudgetStatus != null && BudgetStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
BudgetStatus = BudgetStatus.substring(0,0);
}
set_Value (COLUMNNAME_BudgetStatus, BudgetStatus);
}
/** Get Budget Status.
@return Indicates the current status of this budget */
public String getBudgetStatus() 
{
return (String)get_Value(COLUMNNAME_BudgetStatus);
}

@XendraTrl(Identifier="d73c825b-25e4-3015-0751-fc08bf7ae5ef")
public static String es_PE_FIELD_Budget_BudgetStatus_Description="Indica el estado actual de este presupuesto.";

@XendraTrl(Identifier="d73c825b-25e4-3015-0751-fc08bf7ae5ef")
public static String es_PE_FIELD_Budget_BudgetStatus_Help="El estado del presupuesto indica el estado actual de este presupuesto (Ej. Borrador; aprobado).";

@XendraTrl(Identifier="d73c825b-25e4-3015-0751-fc08bf7ae5ef")
public static String es_PE_FIELD_Budget_BudgetStatus_Name="Estado del Presupuesto";

@XendraField(AD_Column_ID="BudgetStatus",IsCentrallyMaintained=true,
AD_Tab_ID="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d73c825b-25e4-3015-0751-fc08bf7ae5ef")
public static final String FIELDNAME_Budget_BudgetStatus="d73c825b-25e4-3015-0751-fc08bf7ae5ef";

@XendraTrl(Identifier="413942e6-8c0f-21be-553f-2dcf264b4e86")
public static String es_PE_COLUMN_BudgetStatus_Name="Estado del Presupuesto";

@XendraColumn(AD_Element_ID="aad72a1b-1902-f158-3efd-db36ec04ac09",ColumnName="BudgetStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="fcd2e472-c052-bde9-c921-dffd438016ae",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="D",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="413942e6-8c0f-21be-553f-2dcf264b4e86",Synchronized="2017-08-05 16:54:40.0")
/** Column name BudgetStatus */
public static final String COLUMNNAME_BudgetStatus = "BudgetStatus";
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

@XendraTrl(Identifier="a52e37a3-08eb-6d5b-672c-557dde3507be")
public static String es_PE_FIELD_Budget_Description_Description="Observación";

@XendraTrl(Identifier="a52e37a3-08eb-6d5b-672c-557dde3507be")
public static String es_PE_FIELD_Budget_Description_Help="Observación";

@XendraTrl(Identifier="a52e37a3-08eb-6d5b-672c-557dde3507be")
public static String es_PE_FIELD_Budget_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a52e37a3-08eb-6d5b-672c-557dde3507be")
public static final String FIELDNAME_Budget_Description="a52e37a3-08eb-6d5b-672c-557dde3507be";

@XendraTrl(Identifier="3adaab09-66d7-c65f-06d0-913e6cb97295")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3adaab09-66d7-c65f-06d0-913e6cb97295",
Synchronized="2017-08-05 16:54:40.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID < 1) throw new IllegalArgumentException ("GL_Budget_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e1afd7bb-f39c-d546-dc22-b376fd048a51")
public static String es_PE_FIELD_Budget_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="e1afd7bb-f39c-d546-dc22-b376fd048a51")
public static String es_PE_FIELD_Budget_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraTrl(Identifier="e1afd7bb-f39c-d546-dc22-b376fd048a51")
public static String es_PE_FIELD_Budget_Budget_Name="Presupuesto";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1afd7bb-f39c-d546-dc22-b376fd048a51")
public static final String FIELDNAME_Budget_Budget="e1afd7bb-f39c-d546-dc22-b376fd048a51";
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
@XendraTrl(Identifier="aeabfe5c-3963-4522-b629-aafe299c11e9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aeabfe5c-3963-4522-b629-aafe299c11e9",
Synchronized="2017-08-05 16:54:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Primary.
@param IsPrimary Indicates if this is the primary budget */
public void setIsPrimary (boolean IsPrimary)
{
set_Value (COLUMNNAME_IsPrimary, Boolean.valueOf(IsPrimary));
}
/** Get Primary.
@return Indicates if this is the primary budget */
public boolean isPrimary() 
{
Object oo = get_Value(COLUMNNAME_IsPrimary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f40dc1e0-4009-9302-04ad-add61b4e52a2")
public static String es_PE_FIELD_Budget_Primary_Description="Indica si este es el presupuesto primario";

@XendraTrl(Identifier="f40dc1e0-4009-9302-04ad-add61b4e52a2")
public static String es_PE_FIELD_Budget_Primary_Help="El cuadro de verificación primaria indica si este presupuesto es el presupuesto primario";

@XendraTrl(Identifier="f40dc1e0-4009-9302-04ad-add61b4e52a2")
public static String es_PE_FIELD_Budget_Primary_Name="Primario";

@XendraField(AD_Column_ID="IsPrimary",IsCentrallyMaintained=true,
AD_Tab_ID="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f40dc1e0-4009-9302-04ad-add61b4e52a2")
public static final String FIELDNAME_Budget_Primary="f40dc1e0-4009-9302-04ad-add61b4e52a2";

@XendraTrl(Identifier="4e5469d0-4eff-735d-8fe7-108e41718e02")
public static String es_PE_COLUMN_IsPrimary_Name="Primario";

@XendraColumn(AD_Element_ID="76eb1170-b0ae-1b50-319d-253b20c560d2",ColumnName="IsPrimary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e5469d0-4eff-735d-8fe7-108e41718e02",
Synchronized="2017-08-05 16:54:40.0")
/** Column name IsPrimary */
public static final String COLUMNNAME_IsPrimary = "IsPrimary";
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

@XendraTrl(Identifier="19e8beee-705c-18fe-ca99-8f69385e3e81")
public static String es_PE_FIELD_Budget_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="19e8beee-705c-18fe-ca99-8f69385e3e81")
public static String es_PE_FIELD_Budget_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="19e8beee-705c-18fe-ca99-8f69385e3e81")
public static String es_PE_FIELD_Budget_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="f2bb73ab-d8ac-0575-b9d5-362adb0a8e49",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="19e8beee-705c-18fe-ca99-8f69385e3e81")
public static final String FIELDNAME_Budget_Name="19e8beee-705c-18fe-ca99-8f69385e3e81";

@XendraTrl(Identifier="833e0e18-0122-c93e-776e-1cdf3dbc39b3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="833e0e18-0122-c93e-776e-1cdf3dbc39b3",
Synchronized="2017-08-05 16:54:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
