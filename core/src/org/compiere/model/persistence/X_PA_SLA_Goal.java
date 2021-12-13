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
/** Generated Model for PA_SLA_Goal
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_SLA_Goal extends PO
{
/** Standard Constructor
@param ctx context
@param PA_SLA_Goal_ID id
@param trxName transaction
*/
public X_PA_SLA_Goal (Properties ctx, int PA_SLA_Goal_ID, String trxName)
{
super (ctx, PA_SLA_Goal_ID, trxName);
/** if (PA_SLA_Goal_ID == 0)
{
setC_BPartner_ID (0);
setMeasureActual (Env.ZERO);
setMeasureTarget (Env.ZERO);
setName (null);
setPA_SLA_Criteria_ID (0);
setPA_SLA_Goal_ID (0);
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
public X_PA_SLA_Goal (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=745 */
public static int Table_ID=MTable.getTable_ID("PA_SLA_Goal");

@XendraTrl(Identifier="0ea4882f-9228-6574-c2c4-25331780a08d")
public static String es_PE_TAB_SLAGoal_Description="ANS para la Meta";

@XendraTrl(Identifier="0ea4882f-9228-6574-c2c4-25331780a08d")
public static String es_PE_TAB_SLAGoal_Help="Meta individual para los criterios de SLA para el socio de negocio.";

@XendraTrl(Identifier="0ea4882f-9228-6574-c2c4-25331780a08d")
public static String es_PE_TAB_SLAGoal_Name="ANS Meta";
@XendraTab(Name="SLA Goal",
Description="Service Level Agreement Goal",
Help="Individual Goal for the SLA criteria for the Business Partner",
AD_Window_ID="2f9c0dec-822e-9ffd-0c1a-85834bda184f",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="f62e1492-4cbe-b829-9371-92de7a07e66e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="0ea4882f-9228-6574-c2c4-25331780a08d",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SLAGoal="0ea4882f-9228-6574-c2c4-25331780a08d";

@XendraTrl(Identifier="7caae296-2983-8371-76cc-8b60e85271a1")
public static String es_PE_TAB_SLAGoal2_Description="Meta del Acuerdo de Porcentaje de disponibilidad";

@XendraTrl(Identifier="7caae296-2983-8371-76cc-8b60e85271a1")
public static String es_PE_TAB_SLAGoal2_Help="Meta de la SLA criterio del Socio de negocio";

@XendraTrl(Identifier="7caae296-2983-8371-76cc-8b60e85271a1")
public static String es_PE_TAB_SLAGoal2_Name="Meta ANS";
@XendraTab(Name="SLA Goal",
Description="Service Level Agreement Goal",
Help="Individual Goal for the SLA criteria for the Business Partner",
AD_Window_ID="c73cdd34-69c8-f9a1-85cc-cb0e427c8ec7",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7caae296-2983-8371-76cc-8b60e85271a1",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SLAGoal2="7caae296-2983-8371-76cc-8b60e85271a1";

@XendraTrl(Identifier="f34f6c51-7a93-a6d2-f11f-5ad918f47099")
public static String es_PE_TABLE_PA_SLA_Goal_Name="Meta ANS";

@XendraTable(Name="SLA Goal",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Service Level Agreement Goal",
Help="",TableName="PA_SLA_Goal",AccessLevel="3",
AD_Window_ID="2f9c0dec-822e-9ffd-0c1a-85834bda184f",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="f34f6c51-7a93-a6d2-f11f-5ad918f47099",Synchronized="2020-03-03 21:39:20.0")
/** TableName=PA_SLA_Goal */
public static final String Table_Name="PA_SLA_Goal";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_SLA_Goal");

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
    Table_ID = MTable.getTable_ID("PA_SLA_Goal");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_SLA_Goal[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="3c977f49-17cb-85f3-03ad-f0166db27ec1")
public static String es_PE_FIELD_SLAGoal_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="3c977f49-17cb-85f3-03ad-f0166db27ec1")
public static String es_PE_FIELD_SLAGoal_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="3c977f49-17cb-85f3-03ad-f0166db27ec1")
public static String es_PE_FIELD_SLAGoal_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c977f49-17cb-85f3-03ad-f0166db27ec1")
public static final String FIELDNAME_SLAGoal_BusinessPartner="3c977f49-17cb-85f3-03ad-f0166db27ec1";

@XendraTrl(Identifier="314d05b7-ea71-6c6c-9256-ab97ef838d58")
public static String es_PE_FIELD_SLAGoal_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="314d05b7-ea71-6c6c-9256-ab97ef838d58")
public static String es_PE_FIELD_SLAGoal_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="314d05b7-ea71-6c6c-9256-ab97ef838d58")
public static String es_PE_FIELD_SLAGoal_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="314d05b7-ea71-6c6c-9256-ab97ef838d58")
public static final String FIELDNAME_SLAGoal_BusinessPartner2="314d05b7-ea71-6c6c-9256-ab97ef838d58";

@XendraTrl(Identifier="c49d4746-4cc3-05ab-a435-654656d9bb11")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c49d4746-4cc3-05ab-a435-654656d9bb11",Synchronized="2019-08-30 22:23:40.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_Value (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="01e2077b-05d6-a325-999f-7fb3b810c820")
public static String es_PE_FIELD_SLAGoal_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="01e2077b-05d6-a325-999f-7fb3b810c820")
public static String es_PE_FIELD_SLAGoal_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="01e2077b-05d6-a325-999f-7fb3b810c820")
public static String es_PE_FIELD_SLAGoal_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01e2077b-05d6-a325-999f-7fb3b810c820")
public static final String FIELDNAME_SLAGoal_DateLastRun="01e2077b-05d6-a325-999f-7fb3b810c820";

@XendraTrl(Identifier="1abeaa92-62b5-0a78-fc34-084e99ed119a")
public static String es_PE_FIELD_SLAGoal_DateLastRun2_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="1abeaa92-62b5-0a78-fc34-084e99ed119a")
public static String es_PE_FIELD_SLAGoal_DateLastRun2_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="1abeaa92-62b5-0a78-fc34-084e99ed119a")
public static String es_PE_FIELD_SLAGoal_DateLastRun2_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1abeaa92-62b5-0a78-fc34-084e99ed119a")
public static final String FIELDNAME_SLAGoal_DateLastRun2="1abeaa92-62b5-0a78-fc34-084e99ed119a";

@XendraTrl(Identifier="afe7cbf4-2a46-1f04-79d9-77aa8157988e")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="afe7cbf4-2a46-1f04-79d9-77aa8157988e",
Synchronized="2019-08-30 22:23:40.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
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

@XendraTrl(Identifier="9af5fae0-2ac4-640b-1197-8b02428ccf57")
public static String es_PE_FIELD_SLAGoal_Description_Name="Observación";

@XendraTrl(Identifier="9af5fae0-2ac4-640b-1197-8b02428ccf57")
public static String es_PE_FIELD_SLAGoal_Description_Description="Observación";

@XendraTrl(Identifier="9af5fae0-2ac4-640b-1197-8b02428ccf57")
public static String es_PE_FIELD_SLAGoal_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9af5fae0-2ac4-640b-1197-8b02428ccf57")
public static final String FIELDNAME_SLAGoal_Description="9af5fae0-2ac4-640b-1197-8b02428ccf57";

@XendraTrl(Identifier="6ac31fe3-1287-e877-e5a3-a22ba16cb904")
public static String es_PE_FIELD_SLAGoal_Description2_Name="Observación";

@XendraTrl(Identifier="6ac31fe3-1287-e877-e5a3-a22ba16cb904")
public static String es_PE_FIELD_SLAGoal_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6ac31fe3-1287-e877-e5a3-a22ba16cb904")
public static String es_PE_FIELD_SLAGoal_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ac31fe3-1287-e877-e5a3-a22ba16cb904")
public static final String FIELDNAME_SLAGoal_Description2="6ac31fe3-1287-e877-e5a3-a22ba16cb904";

@XendraTrl(Identifier="36927b2f-7a8e-609a-cce0-b311b627bceb")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36927b2f-7a8e-609a-cce0-b311b627bceb",
Synchronized="2019-08-30 22:23:40.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="47535be1-6064-29b5-daec-51752d225c2e")
public static String es_PE_FIELD_SLAGoal_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="47535be1-6064-29b5-daec-51752d225c2e")
public static String es_PE_FIELD_SLAGoal_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="47535be1-6064-29b5-daec-51752d225c2e")
public static String es_PE_FIELD_SLAGoal_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47535be1-6064-29b5-daec-51752d225c2e")
public static final String FIELDNAME_SLAGoal_CommentHelp="47535be1-6064-29b5-daec-51752d225c2e";

@XendraTrl(Identifier="6712e07d-a431-7fd2-b128-062e07a998cc")
public static String es_PE_FIELD_SLAGoal_CommentHelp2_Name="Ayuda";

@XendraTrl(Identifier="6712e07d-a431-7fd2-b128-062e07a998cc")
public static String es_PE_FIELD_SLAGoal_CommentHelp2_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="6712e07d-a431-7fd2-b128-062e07a998cc")
public static String es_PE_FIELD_SLAGoal_CommentHelp2_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6712e07d-a431-7fd2-b128-062e07a998cc")
public static final String FIELDNAME_SLAGoal_CommentHelp2="6712e07d-a431-7fd2-b128-062e07a998cc";

@XendraTrl(Identifier="f5ea51d5-01fc-3414-6599-713532c8dde8")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5ea51d5-01fc-3414-6599-713532c8dde8",
Synchronized="2019-08-30 22:23:40.0")
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
@XendraTrl(Identifier="eabbe189-88d4-4750-b8af-490d849ea45b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eabbe189-88d4-4750-b8af-490d849ea45b",
Synchronized="2019-08-30 22:23:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Measure Actual.
@param MeasureActual Actual value that has been measured. */
public void setMeasureActual (BigDecimal MeasureActual)
{
if (MeasureActual == null) throw new IllegalArgumentException ("MeasureActual is mandatory.");
set_Value (COLUMNNAME_MeasureActual, MeasureActual);
}
/** Get Measure Actual.
@return Actual value that has been measured. */
public BigDecimal getMeasureActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6747bd12-b083-c4b5-f7e7-fbbaca3fb63f")
public static String es_PE_FIELD_SLAGoal_MeasureActual_Name="Medida Actual";

@XendraTrl(Identifier="6747bd12-b083-c4b5-f7e7-fbbaca3fb63f")
public static String es_PE_FIELD_SLAGoal_MeasureActual_Description="Valor actual que ha sido medido";

@XendraTrl(Identifier="6747bd12-b083-c4b5-f7e7-fbbaca3fb63f")
public static String es_PE_FIELD_SLAGoal_MeasureActual_Help="La medida actual indica el valor medido actual. Los valores medidos se usan para determinar si una meta de desempeño ha sido alcanzada.";

@XendraField(AD_Column_ID="MeasureActual",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6747bd12-b083-c4b5-f7e7-fbbaca3fb63f")
public static final String FIELDNAME_SLAGoal_MeasureActual="6747bd12-b083-c4b5-f7e7-fbbaca3fb63f";

@XendraTrl(Identifier="2d0fcd78-a026-bed1-70cf-f1007988bee6")
public static String es_PE_FIELD_SLAGoal_MeasureActual2_Name="Medida Actual";

@XendraTrl(Identifier="2d0fcd78-a026-bed1-70cf-f1007988bee6")
public static String es_PE_FIELD_SLAGoal_MeasureActual2_Description="Valor actual que ha sido medido";

@XendraTrl(Identifier="2d0fcd78-a026-bed1-70cf-f1007988bee6")
public static String es_PE_FIELD_SLAGoal_MeasureActual2_Help="La medida actual indica el valor medido actual. Los valores medidos se usan para determinar si una meta de desempeño ha sido alcanzada.";

@XendraField(AD_Column_ID="MeasureActual",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d0fcd78-a026-bed1-70cf-f1007988bee6")
public static final String FIELDNAME_SLAGoal_MeasureActual2="2d0fcd78-a026-bed1-70cf-f1007988bee6";

@XendraTrl(Identifier="c05b7704-4ef7-5ecf-872f-e4707edc0a0e")
public static String es_PE_COLUMN_MeasureActual_Name="Medida Actual";

@XendraColumn(AD_Element_ID="0825e99a-364e-4459-9f17-d2bbda39cfde",ColumnName="MeasureActual",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c05b7704-4ef7-5ecf-872f-e4707edc0a0e",
Synchronized="2019-08-30 22:23:40.0")
/** Column name MeasureActual */
public static final String COLUMNNAME_MeasureActual = "MeasureActual";
/** Set Measure Target.
@param MeasureTarget Target value for measure */
public void setMeasureTarget (BigDecimal MeasureTarget)
{
if (MeasureTarget == null) throw new IllegalArgumentException ("MeasureTarget is mandatory.");
set_Value (COLUMNNAME_MeasureTarget, MeasureTarget);
}
/** Get Measure Target.
@return Target value for measure */
public BigDecimal getMeasureTarget() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureTarget);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="94a416e6-ca32-1c1c-480c-219821e06932")
public static String es_PE_FIELD_SLAGoal_MeasureTarget_Name="Medida Objetivo";

@XendraTrl(Identifier="94a416e6-ca32-1c1c-480c-219821e06932")
public static String es_PE_FIELD_SLAGoal_MeasureTarget_Description="Valor objetivo de esta medida";

@XendraTrl(Identifier="94a416e6-ca32-1c1c-480c-219821e06932")
public static String es_PE_FIELD_SLAGoal_MeasureTarget_Help="La medida objetivo indica el objetivo ó meta para esta medida. Se usa como una comparación contra las medidas actuales.";

@XendraField(AD_Column_ID="MeasureTarget",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94a416e6-ca32-1c1c-480c-219821e06932")
public static final String FIELDNAME_SLAGoal_MeasureTarget="94a416e6-ca32-1c1c-480c-219821e06932";

@XendraTrl(Identifier="a394df68-1cca-0f3f-bdb6-c0e8aba44dc2")
public static String es_PE_FIELD_SLAGoal_MeasureTarget2_Name="Medida Objetivo";

@XendraTrl(Identifier="a394df68-1cca-0f3f-bdb6-c0e8aba44dc2")
public static String es_PE_FIELD_SLAGoal_MeasureTarget2_Description="Valor objetivo de esta medida";

@XendraTrl(Identifier="a394df68-1cca-0f3f-bdb6-c0e8aba44dc2")
public static String es_PE_FIELD_SLAGoal_MeasureTarget2_Help="La medida objetivo indica el objetivo ó meta para esta medida. Se usa como una comparación contra las medidas actuales.";

@XendraField(AD_Column_ID="MeasureTarget",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a394df68-1cca-0f3f-bdb6-c0e8aba44dc2")
public static final String FIELDNAME_SLAGoal_MeasureTarget2="a394df68-1cca-0f3f-bdb6-c0e8aba44dc2";

@XendraTrl(Identifier="1b6814e6-eee7-7f68-c7b0-e4492e2e7891")
public static String es_PE_COLUMN_MeasureTarget_Name="Medida Objetivo";

@XendraColumn(AD_Element_ID="49cb94bb-de84-99a5-ca61-aa73744fc707",ColumnName="MeasureTarget",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b6814e6-eee7-7f68-c7b0-e4492e2e7891",
Synchronized="2019-08-30 22:23:40.0")
/** Column name MeasureTarget */
public static final String COLUMNNAME_MeasureTarget = "MeasureTarget";
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

@XendraTrl(Identifier="4fb95463-19b0-2ce7-70bd-18a179ddf893")
public static String es_PE_FIELD_SLAGoal_Name_Name="Nombre";

@XendraTrl(Identifier="4fb95463-19b0-2ce7-70bd-18a179ddf893")
public static String es_PE_FIELD_SLAGoal_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4fb95463-19b0-2ce7-70bd-18a179ddf893")
public static String es_PE_FIELD_SLAGoal_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4fb95463-19b0-2ce7-70bd-18a179ddf893")
public static final String FIELDNAME_SLAGoal_Name="4fb95463-19b0-2ce7-70bd-18a179ddf893";

@XendraTrl(Identifier="ed920013-2972-a2bd-38e3-0be8d9a450ec")
public static String es_PE_FIELD_SLAGoal_Name2_Name="Nombre";

@XendraTrl(Identifier="ed920013-2972-a2bd-38e3-0be8d9a450ec")
public static String es_PE_FIELD_SLAGoal_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ed920013-2972-a2bd-38e3-0be8d9a450ec")
public static String es_PE_FIELD_SLAGoal_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed920013-2972-a2bd-38e3-0be8d9a450ec")
public static final String FIELDNAME_SLAGoal_Name2="ed920013-2972-a2bd-38e3-0be8d9a450ec";

@XendraTrl(Identifier="fd7b80fc-9ce5-6ae7-ba03-8a2c1dbb8c0e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd7b80fc-9ce5-6ae7-ba03-8a2c1dbb8c0e",
Synchronized="2019-08-30 22:23:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set SLA Criteria.
@param PA_SLA_Criteria_ID Service Level Agreement Criteria */
public void setPA_SLA_Criteria_ID (int PA_SLA_Criteria_ID)
{
if (PA_SLA_Criteria_ID < 1) throw new IllegalArgumentException ("PA_SLA_Criteria_ID is mandatory.");
set_Value (COLUMNNAME_PA_SLA_Criteria_ID, Integer.valueOf(PA_SLA_Criteria_ID));
}
/** Get SLA Criteria.
@return Service Level Agreement Criteria */
public int getPA_SLA_Criteria_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_SLA_Criteria_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="963f0416-bc50-4772-141e-0805a63a33cf")
public static String es_PE_FIELD_SLAGoal_SLACriteria_Name="Criterio ANS";

@XendraTrl(Identifier="963f0416-bc50-4772-141e-0805a63a33cf")
public static String es_PE_FIELD_SLAGoal_SLACriteria_Description="Criterios de acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="963f0416-bc50-4772-141e-0805a63a33cf")
public static String es_PE_FIELD_SLAGoal_SLACriteria_Help="Criterios para medir los acuerdos del porcentaje de disponibilidad (Ej. de la calidad, de la entrega prometidas la fecha,..)";

@XendraField(AD_Column_ID="PA_SLA_Criteria_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="963f0416-bc50-4772-141e-0805a63a33cf")
public static final String FIELDNAME_SLAGoal_SLACriteria="963f0416-bc50-4772-141e-0805a63a33cf";

@XendraTrl(Identifier="b2cd167e-1643-89f3-b8da-ddde4ff79cc3")
public static String es_PE_FIELD_SLAGoal_SLACriteria2_Name="Criterio ANS";

@XendraTrl(Identifier="b2cd167e-1643-89f3-b8da-ddde4ff79cc3")
public static String es_PE_FIELD_SLAGoal_SLACriteria2_Description="Criterios de acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="b2cd167e-1643-89f3-b8da-ddde4ff79cc3")
public static String es_PE_FIELD_SLAGoal_SLACriteria2_Help="Criterios para medir los acuerdos del porcentaje de disponibilidad (Ej. de la calidad, de la entrega prometidas la fecha,..)";

@XendraField(AD_Column_ID="PA_SLA_Criteria_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2cd167e-1643-89f3-b8da-ddde4ff79cc3")
public static final String FIELDNAME_SLAGoal_SLACriteria2="b2cd167e-1643-89f3-b8da-ddde4ff79cc3";

@XendraTrl(Identifier="f62e1492-4cbe-b829-9371-92de7a07e66e")
public static String es_PE_COLUMN_PA_SLA_Criteria_ID_Name="Criterio ANS";

@XendraColumn(AD_Element_ID="7ad4ca5b-4857-746a-2674-b971424c1f69",ColumnName="PA_SLA_Criteria_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f62e1492-4cbe-b829-9371-92de7a07e66e",
Synchronized="2019-08-30 22:23:40.0")
/** Column name PA_SLA_Criteria_ID */
public static final String COLUMNNAME_PA_SLA_Criteria_ID = "PA_SLA_Criteria_ID";
/** Set SLA Goal.
@param PA_SLA_Goal_ID Service Level Agreement Goal */
public void setPA_SLA_Goal_ID (int PA_SLA_Goal_ID)
{
if (PA_SLA_Goal_ID < 1) throw new IllegalArgumentException ("PA_SLA_Goal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_SLA_Goal_ID, Integer.valueOf(PA_SLA_Goal_ID));
}
/** Get SLA Goal.
@return Service Level Agreement Goal */
public int getPA_SLA_Goal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_SLA_Goal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d8616712-e1bb-6394-4633-ae03201c4d03")
public static String es_PE_FIELD_SLAGoal_SLAGoal_Name="Meta ANS";

@XendraTrl(Identifier="d8616712-e1bb-6394-4633-ae03201c4d03")
public static String es_PE_FIELD_SLAGoal_SLAGoal_Description="Meta del acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="d8616712-e1bb-6394-4633-ae03201c4d03")
public static String es_PE_FIELD_SLAGoal_SLAGoal_Help="Meta para los criterios de ANS para el socio de negocio";

@XendraField(AD_Column_ID="PA_SLA_Goal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8616712-e1bb-6394-4633-ae03201c4d03")
public static final String FIELDNAME_SLAGoal_SLAGoal="d8616712-e1bb-6394-4633-ae03201c4d03";

@XendraTrl(Identifier="2e7e42a2-4427-0a64-0a6c-3977a9787ce8")
public static String es_PE_FIELD_SLAGoal_SLAGoal2_Name="Meta ANS";

@XendraTrl(Identifier="2e7e42a2-4427-0a64-0a6c-3977a9787ce8")
public static String es_PE_FIELD_SLAGoal_SLAGoal2_Description="Meta del acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="2e7e42a2-4427-0a64-0a6c-3977a9787ce8")
public static String es_PE_FIELD_SLAGoal_SLAGoal2_Help="Meta para los criterios de ANS para el socio de negocio";

@XendraField(AD_Column_ID="PA_SLA_Goal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e7e42a2-4427-0a64-0a6c-3977a9787ce8")
public static final String FIELDNAME_SLAGoal_SLAGoal2="2e7e42a2-4427-0a64-0a6c-3977a9787ce8";
/** Column name PA_SLA_Goal_ID */
public static final String COLUMNNAME_PA_SLA_Goal_ID = "PA_SLA_Goal_ID";
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

@XendraTrl(Identifier="3f843eeb-984f-0616-afd0-5639c27175fd")
public static String es_PE_FIELD_SLAGoal_Processed_Name="Procesado";

@XendraTrl(Identifier="3f843eeb-984f-0616-afd0-5639c27175fd")
public static String es_PE_FIELD_SLAGoal_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="3f843eeb-984f-0616-afd0-5639c27175fd")
public static String es_PE_FIELD_SLAGoal_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f843eeb-984f-0616-afd0-5639c27175fd")
public static final String FIELDNAME_SLAGoal_Processed="3f843eeb-984f-0616-afd0-5639c27175fd";

@XendraTrl(Identifier="5ff11afe-5679-66e0-b1ee-b642e8c533db")
public static String es_PE_FIELD_SLAGoal_Processed2_Name="Procesado";

@XendraTrl(Identifier="5ff11afe-5679-66e0-b1ee-b642e8c533db")
public static String es_PE_FIELD_SLAGoal_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="5ff11afe-5679-66e0-b1ee-b642e8c533db")
public static String es_PE_FIELD_SLAGoal_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ff11afe-5679-66e0-b1ee-b642e8c533db")
public static final String FIELDNAME_SLAGoal_Processed2="5ff11afe-5679-66e0-b1ee-b642e8c533db";

@XendraTrl(Identifier="d006bb5d-8c85-fea6-07b8-18f77a6d1280")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d006bb5d-8c85-fea6-07b8-18f77a6d1280",
Synchronized="2019-08-30 22:23:40.0")
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

@XendraTrl(Identifier="6ea5c204-f708-a370-83cd-0fc70eedfedd")
public static String es_PE_FIELD_SLAGoal_ProcessNow_Name="Captura y Cálculo de Medida";

@XendraTrl(Identifier="6ea5c204-f708-a370-83cd-0fc70eedfedd")
public static String es_PE_FIELD_SLAGoal_ProcessNow_Description="Captura y Cálculo de Medida";

@XendraTrl(Identifier="6ea5c204-f708-a370-83cd-0fc70eedfedd")
public static String es_PE_FIELD_SLAGoal_ProcessNow_Help="Si Automatico, captura - cálcula/actualiza la actual Medida.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ea5c204-f708-a370-83cd-0fc70eedfedd")
public static final String FIELDNAME_SLAGoal_ProcessNow="6ea5c204-f708-a370-83cd-0fc70eedfedd";

@XendraTrl(Identifier="fcb06041-9bd9-990e-e237-8ebf0d4cc6be")
public static String es_PE_FIELD_SLAGoal_ProcessNow2_Name="Captura y Cálculo de Medida";

@XendraTrl(Identifier="fcb06041-9bd9-990e-e237-8ebf0d4cc6be")
public static String es_PE_FIELD_SLAGoal_ProcessNow2_Description="Captura y Cálculo de Medida";

@XendraTrl(Identifier="fcb06041-9bd9-990e-e237-8ebf0d4cc6be")
public static String es_PE_FIELD_SLAGoal_ProcessNow2_Help="Si Automatico, captura - cálcula/actualiza la actual Medida.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcb06041-9bd9-990e-e237-8ebf0d4cc6be")
public static final String FIELDNAME_SLAGoal_ProcessNow2="fcb06041-9bd9-990e-e237-8ebf0d4cc6be";

@XendraTrl(Identifier="c3adc73a-0b88-961b-0b51-11b80b3c4b86")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="86226409-f60a-4805-6068-af3cffa11e84",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3adc73a-0b88-961b-0b51-11b80b3c4b86",Synchronized="2019-08-30 22:23:40.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="6b9e931a-1b90-330b-4908-18c3662e93e4")
public static String es_PE_FIELD_SLAGoal_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="6b9e931a-1b90-330b-4908-18c3662e93e4")
public static String es_PE_FIELD_SLAGoal_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="6b9e931a-1b90-330b-4908-18c3662e93e4")
public static String es_PE_FIELD_SLAGoal_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b9e931a-1b90-330b-4908-18c3662e93e4")
public static final String FIELDNAME_SLAGoal_ValidFrom="6b9e931a-1b90-330b-4908-18c3662e93e4";

@XendraTrl(Identifier="f71a3169-e41d-8238-09c0-1e0a586d6f5b")
public static String es_PE_FIELD_SLAGoal_ValidFrom2_Name="Válido Desde";

@XendraTrl(Identifier="f71a3169-e41d-8238-09c0-1e0a586d6f5b")
public static String es_PE_FIELD_SLAGoal_ValidFrom2_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="f71a3169-e41d-8238-09c0-1e0a586d6f5b")
public static String es_PE_FIELD_SLAGoal_ValidFrom2_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f71a3169-e41d-8238-09c0-1e0a586d6f5b")
public static final String FIELDNAME_SLAGoal_ValidFrom2="f71a3169-e41d-8238-09c0-1e0a586d6f5b";

@XendraTrl(Identifier="8129dabc-47b6-5927-04a9-2f8f56bbb8c7")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8129dabc-47b6-5927-04a9-2f8f56bbb8c7",
Synchronized="2019-08-30 22:23:40.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="499e582a-b57d-e4ae-a0e0-1f3d50418827")
public static String es_PE_FIELD_SLAGoal_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="499e582a-b57d-e4ae-a0e0-1f3d50418827")
public static String es_PE_FIELD_SLAGoal_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="499e582a-b57d-e4ae-a0e0-1f3d50418827")
public static String es_PE_FIELD_SLAGoal_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="7caae296-2983-8371-76cc-8b60e85271a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="499e582a-b57d-e4ae-a0e0-1f3d50418827")
public static final String FIELDNAME_SLAGoal_ValidTo="499e582a-b57d-e4ae-a0e0-1f3d50418827";

@XendraTrl(Identifier="a8a0d50c-cfa6-04cc-f1d2-c60f4525a0c2")
public static String es_PE_FIELD_SLAGoal_ValidTo2_Name="Válido Hasta";

@XendraTrl(Identifier="a8a0d50c-cfa6-04cc-f1d2-c60f4525a0c2")
public static String es_PE_FIELD_SLAGoal_ValidTo2_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="a8a0d50c-cfa6-04cc-f1d2-c60f4525a0c2")
public static String es_PE_FIELD_SLAGoal_ValidTo2_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="0ea4882f-9228-6574-c2c4-25331780a08d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8a0d50c-cfa6-04cc-f1d2-c60f4525a0c2")
public static final String FIELDNAME_SLAGoal_ValidTo2="a8a0d50c-cfa6-04cc-f1d2-c60f4525a0c2";

@XendraTrl(Identifier="af7701ec-a7d5-0627-813d-a1d51abe4f50")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af7701ec-a7d5-0627-813d-a1d51abe4f50",
Synchronized="2019-08-30 22:23:40.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
