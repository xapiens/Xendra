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
/** Generated Model for C_Project_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Project_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_Project_Acct_ID id
@param trxName transaction
*/
public X_C_Project_Acct (Properties ctx, int C_Project_Acct_ID, String trxName)
{
super (ctx, C_Project_Acct_ID, trxName);
/** if (C_Project_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_Project_ID (0);
setPJ_Asset_Acct (0);
setPJ_WIP_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Project_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=204 */
public static int Table_ID=MTable.getTable_ID("C_Project_Acct");

@XendraTrl(Identifier="36ca20f5-d936-6013-2269-4a9afbd3b989")
public static String es_PE_TAB_Accounting_Description="Definir Contabilidad del Proyecto";

@XendraTrl(Identifier="36ca20f5-d936-6013-2269-4a9afbd3b989")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="36ca20f5-d936-6013-2269-4a9afbd3b989")
public static String es_PE_TAB_Accounting_Help="La pestaña de Contabilidad es usada para definir la cuenta de activos que se usa cuando un proyecto es completado y el activo asociado es colocado en libros.";

@XendraTab(Name="Accounting",Description="Define Project Accounting",
Help="The Accounting Tab is used to define the Asset Account to use when a project is completed and the associated asset realized.",
AD_Window_ID="402bdf68-d0df-64fe-b670-0ca668710aa1",SeqNo=50,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="36ca20f5-d936-6013-2269-4a9afbd3b989",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="36ca20f5-d936-6013-2269-4a9afbd3b989";

@XendraTrl(Identifier="85979e0b-85bf-89f8-acd7-7d50fabc6499")
public static String es_PE_TAB_Accounting2_Description="Defina las Cuentas Contables del Proyecto";

@XendraTrl(Identifier="85979e0b-85bf-89f8-acd7-7d50fabc6499")
public static String es_PE_TAB_Accounting2_Name="Cuentas Contables";

@XendraTrl(Identifier="85979e0b-85bf-89f8-acd7-7d50fabc6499")
public static String es_PE_TAB_Accounting2_Help="La tabla de la contabilidad se utiliza para definir la cuenta de activo para utilizar cuando se termina un proyecto y el activo asociado observado.";

@XendraTab(Name="Accounting",Description="Define Project Accounting",
Help="The Accounting Tab is used to define the Asset Account to use when a project is completed and the associated asset realized.",
AD_Window_ID="3d408be2-c806-9eca-e379-2876dfbbec6d",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="85979e0b-85bf-89f8-acd7-7d50fabc6499",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting2="85979e0b-85bf-89f8-acd7-7d50fabc6499";

@XendraTrl(Identifier="5412859e-9ab9-c683-fcd3-656b502864cd")
public static String es_PE_TABLE_C_Project_Acct_Name="C_Project_Acct";

@XendraTable(Name="C_Project_Acct",Description="",Help="",TableName="C_Project_Acct",
AccessLevel="3",AD_Window_ID="3d408be2-c806-9eca-e379-2876dfbbec6d",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="5412859e-9ab9-c683-fcd3-656b502864cd",Synchronized="2017-08-16 11:42:19.0")
/** TableName=C_Project_Acct */
public static final String Table_Name="C_Project_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Project_Acct");

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
    Table_ID = MTable.getTable_ID("C_Project_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Project_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="8735067b-9a38-ac84-411f-62cc914c9325")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="8735067b-9a38-ac84-411f-62cc914c9325")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="8735067b-9a38-ac84-411f-62cc914c9325")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="36ca20f5-d936-6013-2269-4a9afbd3b989",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8735067b-9a38-ac84-411f-62cc914c9325")
public static final String FIELDNAME_Accounting_AccountingSchema="8735067b-9a38-ac84-411f-62cc914c9325";

@XendraTrl(Identifier="78359fcf-7ecb-4aa0-51da-11099644e693")
public static String es_PE_FIELD_Accounting_AccountingSchema2_Description="Reglas para contabilizar";

@XendraTrl(Identifier="78359fcf-7ecb-4aa0-51da-11099644e693")
public static String es_PE_FIELD_Accounting_AccountingSchema2_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="78359fcf-7ecb-4aa0-51da-11099644e693")
public static String es_PE_FIELD_Accounting_AccountingSchema2_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85979e0b-85bf-89f8-acd7-7d50fabc6499",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78359fcf-7ecb-4aa0-51da-11099644e693")
public static final String FIELDNAME_Accounting_AccountingSchema2="78359fcf-7ecb-4aa0-51da-11099644e693";

@XendraTrl(Identifier="05829f16-6ce2-f321-ec99-98b1ebd2ffb5")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05829f16-6ce2-f321-ec99-98b1ebd2ffb5",
Synchronized="2017-08-05 16:54:15.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID < 1) throw new IllegalArgumentException ("C_Project_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="940acae1-ab01-3299-994b-2d346ce6de55")
public static String es_PE_FIELD_Accounting_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="940acae1-ab01-3299-994b-2d346ce6de55")
public static String es_PE_FIELD_Accounting_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="940acae1-ab01-3299-994b-2d346ce6de55")
public static String es_PE_FIELD_Accounting_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="36ca20f5-d936-6013-2269-4a9afbd3b989",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="940acae1-ab01-3299-994b-2d346ce6de55")
public static final String FIELDNAME_Accounting_Project="940acae1-ab01-3299-994b-2d346ce6de55";

@XendraTrl(Identifier="4a938040-dad6-e9a9-10f0-0d9e71370b44")
public static String es_PE_FIELD_Accounting_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="4a938040-dad6-e9a9-10f0-0d9e71370b44")
public static String es_PE_FIELD_Accounting_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="4a938040-dad6-e9a9-10f0-0d9e71370b44")
public static String es_PE_FIELD_Accounting_Project2_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="85979e0b-85bf-89f8-acd7-7d50fabc6499",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a938040-dad6-e9a9-10f0-0d9e71370b44")
public static final String FIELDNAME_Accounting_Project2="4a938040-dad6-e9a9-10f0-0d9e71370b44";

@XendraTrl(Identifier="c2b63f77-eac1-dcb2-d0e8-8b4a35fade23")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2b63f77-eac1-dcb2-d0e8-8b4a35fade23",
Synchronized="2017-08-05 16:54:16.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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
@XendraTrl(Identifier="bffd2555-5a4e-4cef-9405-112823ce6fcc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bffd2555-5a4e-4cef-9405-112823ce6fcc",
Synchronized="2017-08-05 16:54:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Project Asset.
@param PJ_Asset_Acct Project Asset Account */
public void setPJ_Asset_Acct (int PJ_Asset_Acct)
{
set_Value (COLUMNNAME_PJ_Asset_Acct, Integer.valueOf(PJ_Asset_Acct));
}
/** Get Project Asset.
@return Project Asset Account */
public int getPJ_Asset_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PJ_Asset_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce7bd954-5593-ba90-0c4d-85fb92a274ff")
public static String es_PE_FIELD_Accounting_ProjectAsset_Description="Cuenta de Activos de Proyecto";

@XendraTrl(Identifier="ce7bd954-5593-ba90-0c4d-85fb92a274ff")
public static String es_PE_FIELD_Accounting_ProjectAsset_Help="La cuenta de Activos de Proyecto es la cuenta usada como la cuenta final de capitalización de activos en proyectos de capital";

@XendraTrl(Identifier="ce7bd954-5593-ba90-0c4d-85fb92a274ff")
public static String es_PE_FIELD_Accounting_ProjectAsset_Name="Activos de Proyecto";

@XendraField(AD_Column_ID="PJ_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="36ca20f5-d936-6013-2269-4a9afbd3b989",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce7bd954-5593-ba90-0c4d-85fb92a274ff")
public static final String FIELDNAME_Accounting_ProjectAsset="ce7bd954-5593-ba90-0c4d-85fb92a274ff";

@XendraTrl(Identifier="c88a1a65-11d4-3317-6677-3f0902d3cd88")
public static String es_PE_FIELD_Accounting_ProjectAsset2_Description="Cuenta de Activos de Proyecto";

@XendraTrl(Identifier="c88a1a65-11d4-3317-6677-3f0902d3cd88")
public static String es_PE_FIELD_Accounting_ProjectAsset2_Help="La cuenta de Activos de Proyecto es la cuenta usada como la cuenta final de capitalización de activos en proyectos de capital";

@XendraTrl(Identifier="c88a1a65-11d4-3317-6677-3f0902d3cd88")
public static String es_PE_FIELD_Accounting_ProjectAsset2_Name="Activos de Proyecto";

@XendraField(AD_Column_ID="PJ_Asset_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="85979e0b-85bf-89f8-acd7-7d50fabc6499",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c88a1a65-11d4-3317-6677-3f0902d3cd88")
public static final String FIELDNAME_Accounting_ProjectAsset2="c88a1a65-11d4-3317-6677-3f0902d3cd88";

@XendraTrl(Identifier="94d56fa7-64d0-7791-d0ff-c16cf824060f")
public static String es_PE_COLUMN_PJ_Asset_Acct_Name="Activos de Proyecto";

@XendraColumn(AD_Element_ID="4f648405-0f0b-2987-7d81-4fc3198c2a42",ColumnName="PJ_Asset_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94d56fa7-64d0-7791-d0ff-c16cf824060f",
Synchronized="2017-08-05 16:54:16.0")
/** Column name PJ_Asset_Acct */
public static final String COLUMNNAME_PJ_Asset_Acct = "PJ_Asset_Acct";
/** Set Work In Progress.
@param PJ_WIP_Acct Account for Work in Progress */
public void setPJ_WIP_Acct (int PJ_WIP_Acct)
{
set_Value (COLUMNNAME_PJ_WIP_Acct, Integer.valueOf(PJ_WIP_Acct));
}
/** Get Work In Progress.
@return Account for Work in Progress */
public int getPJ_WIP_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PJ_WIP_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3151e9cf-12cb-b03e-972e-67bd5d5e89be")
public static String es_PE_FIELD_Accounting_WorkInProgress_Description="Cuenta de trabajo en proceso";

@XendraTrl(Identifier="3151e9cf-12cb-b03e-972e-67bd5d5e89be")
public static String es_PE_FIELD_Accounting_WorkInProgress_Help="La cuenta de trabajo en proceso es la cuenta usada en proyectos capitales hasta que el proyecto se completa";

@XendraTrl(Identifier="3151e9cf-12cb-b03e-972e-67bd5d5e89be")
public static String es_PE_FIELD_Accounting_WorkInProgress_Name="Cuenta de Trabajo en Proceso";

@XendraField(AD_Column_ID="PJ_WIP_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="36ca20f5-d936-6013-2269-4a9afbd3b989",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3151e9cf-12cb-b03e-972e-67bd5d5e89be")
public static final String FIELDNAME_Accounting_WorkInProgress="3151e9cf-12cb-b03e-972e-67bd5d5e89be";

@XendraTrl(Identifier="1cc5e0dd-ad24-0436-9512-45f254007ec7")
public static String es_PE_FIELD_Accounting_WorkInProgress2_Description="Cuenta de trabajo en proceso";

@XendraTrl(Identifier="1cc5e0dd-ad24-0436-9512-45f254007ec7")
public static String es_PE_FIELD_Accounting_WorkInProgress2_Help="La cuenta de trabajo en proceso es la cuenta usada en proyectos capitales hasta que el proyecto se completa";

@XendraTrl(Identifier="1cc5e0dd-ad24-0436-9512-45f254007ec7")
public static String es_PE_FIELD_Accounting_WorkInProgress2_Name="Cuenta de Trabajo en Proceso";

@XendraField(AD_Column_ID="PJ_WIP_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="85979e0b-85bf-89f8-acd7-7d50fabc6499",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cc5e0dd-ad24-0436-9512-45f254007ec7")
public static final String FIELDNAME_Accounting_WorkInProgress2="1cc5e0dd-ad24-0436-9512-45f254007ec7";

@XendraTrl(Identifier="966d0086-32e5-5ef4-9163-e35d142dc4fc")
public static String es_PE_COLUMN_PJ_WIP_Acct_Name="Cuenta de Trabajo en Proceso";

@XendraColumn(AD_Element_ID="6210a7b5-1560-eda6-676f-3a2ca1d56da6",ColumnName="PJ_WIP_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="966d0086-32e5-5ef4-9163-e35d142dc4fc",
Synchronized="2017-08-05 16:54:16.0")
/** Column name PJ_WIP_Acct */
public static final String COLUMNNAME_PJ_WIP_Acct = "PJ_WIP_Acct";
}
