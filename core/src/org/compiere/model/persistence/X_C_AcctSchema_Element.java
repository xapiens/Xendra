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
import org.compiere.model.reference.REF_C_AcctSchemaElementType;
/** Generated Model for C_AcctSchema_Element
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AcctSchema_Element extends PO
{
/** Standard Constructor
@param ctx context
@param C_AcctSchema_Element_ID id
@param trxName transaction
*/
public X_C_AcctSchema_Element (Properties ctx, int C_AcctSchema_Element_ID, String trxName)
{
super (ctx, C_AcctSchema_Element_ID, trxName);
/** if (C_AcctSchema_Element_ID == 0)
{
setC_AcctSchema_Element_ID (0);
setC_AcctSchema_ID (0);
setC_Element_ID (0);
setElementType (null);
setIsBalanced (false);	
// N
setIsMandatory (false);	
// N
setName (null);
setOrg_ID (0);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_AcctSchema_Element WHERE C_AcctSchema_ID=@C_AcctSchema_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_AcctSchema_Element (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=279 */
public static int Table_ID=MTable.getTable_ID("C_AcctSchema_Element");

@XendraTrl(Identifier="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c")
public static String es_PE_TAB_AccountSchemaElement_Description="Definir los elementos de su cuenta primaria";

@XendraTrl(Identifier="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c")
public static String es_PE_TAB_AccountSchemaElement_Name="Elemento del Esquema Contable";

@XendraTrl(Identifier="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c")
public static String es_PE_TAB_AccountSchemaElement_Help="La pestaña Elementos del Esquema Contable define los elementos que comprenden la clave contable. Un nombre es definido el cual se despliega en los documentos. También se indica el orden de los diferentes elementos y si ellos están balanceados y son obligatorios.";

@XendraTab(Name="Account Schema Element",Description="Define the elements of your Account Key",
Help="The Account Schema Element Tab defines the elements that comprise the account key. A name is defined which will display in documents.  Also the order of the elements and if they are balanced and mandatory are indicated.",
AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",
CommitWarning="ATTENTION: ANY CHANGES here will effect the structure of your chart of accounts! Depending what changes you did, you should reset accounting. For changes to become effective, you must re-login and re-start the Application Server. Saving/deleting the record starts processes which may take a while.",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AccountSchemaElement="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c";

@XendraTrl(Identifier="8f46f149-dae3-c835-9bd1-b8daaff9bdd1")
public static String es_PE_TABLE_C_AcctSchema_Element_Name="Elemento del Esquema Contable";


@XendraTable(Name="Acct.Schema Element",Description="",Help="",TableName="C_AcctSchema_Element",
AccessLevel="2",AD_Window_ID="1d20d4ab-6f93-65b5-6cbb-44da46ec6819",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="8f46f149-dae3-c835-9bd1-b8daaff9bdd1",Synchronized="2017-08-16 11:41:20.0")
/** TableName=C_AcctSchema_Element */
public static final String Table_Name="C_AcctSchema_Element";


@XendraIndex(Name="c_acctschema_element_schema",Identifier="013e78c4-aa87-514d-1002-bbab36dcf17b",
Column_Names="c_acctschema_id",IsUnique="false",
TableIdentifier="013e78c4-aa87-514d-1002-bbab36dcf17b",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_acctschema_element_schema = "013e78c4-aa87-514d-1002-bbab36dcf17b";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AcctSchema_Element");

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
    Table_ID = MTable.getTable_ID("C_AcctSchema_Element");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AcctSchema_Element[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID <= 0) set_Value (COLUMNNAME_AD_Column_ID, null);
 else 
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac840473-3bf3-dfd6-3dfb-1ae65709b4af")
public static String es_PE_FIELD_AccountSchemaElement_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="ac840473-3bf3-dfd6-3dfb-1ae65709b4af")
public static String es_PE_FIELD_AccountSchemaElement_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="ac840473-3bf3-dfd6-3dfb-1ae65709b4af")
public static String es_PE_FIELD_AccountSchemaElement_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='X1' | @ElementType@='X2'",DisplayLength=10,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ac840473-3bf3-dfd6-3dfb-1ae65709b4af")
public static final String FIELDNAME_AccountSchemaElement_Column="ac840473-3bf3-dfd6-3dfb-1ae65709b4af";

@XendraTrl(Identifier="5823b64f-c072-44ba-cfdb-10cd2e3895e2")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="eca0a2af-aff7-ae4b-93e6-78f917fed31a",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5823b64f-c072-44ba-cfdb-10cd2e3895e2",Synchronized="2017-08-05 16:53:11.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Acct.Schema Element.
@param C_AcctSchema_Element_ID Acct.Schema Element */
public void setC_AcctSchema_Element_ID (int C_AcctSchema_Element_ID)
{
if (C_AcctSchema_Element_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_Element_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_Element_ID, Integer.valueOf(C_AcctSchema_Element_ID));
}
/** Get Acct.Schema Element.
@return Acct.Schema Element */
public int getC_AcctSchema_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5eb641af-8810-6e6f-7441-19a8cdd6d299")
public static String es_PE_FIELD_AccountSchemaElement_AcctSchemaElement_Name="Elemento del Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5eb641af-8810-6e6f-7441-19a8cdd6d299")
public static final String FIELDNAME_AccountSchemaElement_AcctSchemaElement="5eb641af-8810-6e6f-7441-19a8cdd6d299";
/** Column name C_AcctSchema_Element_ID */
public static final String COLUMNNAME_C_AcctSchema_Element_ID = "C_AcctSchema_Element_ID";
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

@XendraTrl(Identifier="f8a01361-c003-443a-47d8-fbee30a0d3bc")
public static String es_PE_FIELD_AccountSchemaElement_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="f8a01361-c003-443a-47d8-fbee30a0d3bc")
public static String es_PE_FIELD_AccountSchemaElement_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="f8a01361-c003-443a-47d8-fbee30a0d3bc")
public static String es_PE_FIELD_AccountSchemaElement_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8a01361-c003-443a-47d8-fbee30a0d3bc")
public static final String FIELDNAME_AccountSchemaElement_AccountingSchema="f8a01361-c003-443a-47d8-fbee30a0d3bc";

@XendraTrl(Identifier="9a5779df-3b69-e48b-21d9-d386ea4c3e78")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a5779df-3b69-e48b-21d9-d386ea4c3e78",
Synchronized="2017-08-05 16:53:11.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="7c9e615f-0d63-2429-6943-4b62bafe4f1d")
public static String es_PE_FIELD_AccountSchemaElement_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="7c9e615f-0d63-2429-6943-4b62bafe4f1d")
public static String es_PE_FIELD_AccountSchemaElement_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="7c9e615f-0d63-2429-6943-4b62bafe4f1d")
public static String es_PE_FIELD_AccountSchemaElement_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='AY'",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7c9e615f-0d63-2429-6943-4b62bafe4f1d")
public static final String FIELDNAME_AccountSchemaElement_Activity="7c9e615f-0d63-2429-6943-4b62bafe4f1d";

@XendraTrl(Identifier="5a0c1993-6a9e-6617-9130-3b0a9b722c0a")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="079b2687-77a7-3004-9b77-18ca68ffe4fc",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5a0c1993-6a9e-6617-9130-3b0a9b722c0a",Synchronized="2017-08-05 16:53:11.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
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

@XendraTrl(Identifier="1ae113cc-58ec-d549-52e1-d66479752edb")
public static String es_PE_FIELD_AccountSchemaElement_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="1ae113cc-58ec-d549-52e1-d66479752edb")
public static String es_PE_FIELD_AccountSchemaElement_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="1ae113cc-58ec-d549-52e1-d66479752edb")
public static String es_PE_FIELD_AccountSchemaElement_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='BP'",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1ae113cc-58ec-d549-52e1-d66479752edb")
public static final String FIELDNAME_AccountSchemaElement_BusinessPartner="1ae113cc-58ec-d549-52e1-d66479752edb";

@XendraTrl(Identifier="7a19991f-1f8f-7c62-d05d-31161690c9c9")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7a19991f-1f8f-7c62-d05d-31161690c9c9",Synchronized="2017-08-05 16:53:11.0")
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

@XendraTrl(Identifier="cbf00e16-6a49-6a51-2171-98d18ae10c90")
public static String es_PE_FIELD_AccountSchemaElement_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="cbf00e16-6a49-6a51-2171-98d18ae10c90")
public static String es_PE_FIELD_AccountSchemaElement_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="cbf00e16-6a49-6a51-2171-98d18ae10c90")
public static String es_PE_FIELD_AccountSchemaElement_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='MC'",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cbf00e16-6a49-6a51-2171-98d18ae10c90")
public static final String FIELDNAME_AccountSchemaElement_Campaign="cbf00e16-6a49-6a51-2171-98d18ae10c90";

@XendraTrl(Identifier="8353e276-59ae-7608-396d-4b80df22e008")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8e0d532d-2e55-9877-ef0b-a5950455e031",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8353e276-59ae-7608-396d-4b80df22e008",Synchronized="2017-08-05 16:53:11.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Element.
@param C_Element_ID Accounting Element */
public void setC_Element_ID (int C_Element_ID)
{
if (C_Element_ID < 1) throw new IllegalArgumentException ("C_Element_ID is mandatory.");
set_Value (COLUMNNAME_C_Element_ID, Integer.valueOf(C_Element_ID));
}
/** Get Element.
@return Accounting Element */
public int getC_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab8ef2e5-b967-5983-fca4-2d92a91931de")
public static String es_PE_FIELD_AccountSchemaElement_Element_Description="Elemento de Cuenta";

@XendraTrl(Identifier="ab8ef2e5-b967-5983-fca4-2d92a91931de")
public static String es_PE_FIELD_AccountSchemaElement_Element_Help="El elemento cuenta identifica únicamente una cuenta. El conjunto es conocido comúnmente como catálogo de cuentas";

@XendraTrl(Identifier="ab8ef2e5-b967-5983-fca4-2d92a91931de")
public static String es_PE_FIELD_AccountSchemaElement_Element_Name="Elemento";

@XendraField(AD_Column_ID="C_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='AC' | @ElementType@='U1' | @ElementType@='U2'",DisplayLength=14,
IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab8ef2e5-b967-5983-fca4-2d92a91931de")
public static final String FIELDNAME_AccountSchemaElement_Element="ab8ef2e5-b967-5983-fca4-2d92a91931de";

@XendraTrl(Identifier="ed8381cb-8164-41b4-ffbf-8d715f5b762e")
public static String es_PE_COLUMN_C_Element_ID_Name="Elemento";

@XendraColumn(AD_Element_ID="39b73755-e186-38a7-a23f-0283cb7c1155",ColumnName="C_Element_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed8381cb-8164-41b4-ffbf-8d715f5b762e",
Synchronized="2017-08-05 16:53:11.0")
/** Column name C_Element_ID */
public static final String COLUMNNAME_C_Element_ID = "C_Element_ID";
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

@XendraTrl(Identifier="8af070dc-7e26-902e-4a8a-7fd7577133fc")
public static String es_PE_FIELD_AccountSchemaElement_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="8af070dc-7e26-902e-4a8a-7fd7577133fc")
public static String es_PE_FIELD_AccountSchemaElement_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraTrl(Identifier="8af070dc-7e26-902e-4a8a-7fd7577133fc")
public static String es_PE_FIELD_AccountSchemaElement_AccountElement_Name="Valor del Elemento";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='AC' | @ElementType@='U1' | @ElementType@='U2'",DisplayLength=14,
IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8af070dc-7e26-902e-4a8a-7fd7577133fc")
public static final String FIELDNAME_AccountSchemaElement_AccountElement="8af070dc-7e26-902e-4a8a-7fd7577133fc";

@XendraTrl(Identifier="185bc47e-de70-b710-e717-6acd92726e75")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="2e77b9a6-8702-c07f-5e59-ee69d0bb97ab",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="185bc47e-de70-b710-e717-6acd92726e75",Synchronized="2017-08-05 16:53:11.0")
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

@XendraTrl(Identifier="b7354b0f-26c9-3d84-42d9-1672ba96ceed")
public static String es_PE_FIELD_AccountSchemaElement_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="b7354b0f-26c9-3d84-42d9-1672ba96ceed")
public static String es_PE_FIELD_AccountSchemaElement_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="b7354b0f-26c9-3d84-42d9-1672ba96ceed")
public static String es_PE_FIELD_AccountSchemaElement_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='LF' | @ElementType@='LT'",DisplayLength=26,IsReadOnly=false,SeqNo=160,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b7354b0f-26c9-3d84-42d9-1672ba96ceed")
public static final String FIELDNAME_AccountSchemaElement_Address="b7354b0f-26c9-3d84-42d9-1672ba96ceed";

@XendraTrl(Identifier="3c97a0a0-366e-d58d-0f58-856c4a5da987")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c97a0a0-366e-d58d-0f58-856c4a5da987",
Synchronized="2017-08-05 16:53:11.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
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

@XendraTrl(Identifier="5fd36fc0-0f5f-08c1-b636-fd598564719d")
public static String es_PE_FIELD_AccountSchemaElement_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="5fd36fc0-0f5f-08c1-b636-fd598564719d")
public static String es_PE_FIELD_AccountSchemaElement_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="5fd36fc0-0f5f-08c1-b636-fd598564719d")
public static String es_PE_FIELD_AccountSchemaElement_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='PJ'",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5fd36fc0-0f5f-08c1-b636-fd598564719d")
public static final String FIELDNAME_AccountSchemaElement_Project="5fd36fc0-0f5f-08c1-b636-fd598564719d";

@XendraTrl(Identifier="070bca77-1138-506f-ec74-23a364374951")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="992a8502-7fe8-20b8-6bc5-b5b4b225f1e3",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="070bca77-1138-506f-ec74-23a364374951",Synchronized="2017-08-05 16:53:11.0")
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

@XendraTrl(Identifier="c250ce13-a1f1-4cbe-84a6-67ea963f2b07")
public static String es_PE_FIELD_AccountSchemaElement_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="c250ce13-a1f1-4cbe-84a6-67ea963f2b07")
public static String es_PE_FIELD_AccountSchemaElement_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="c250ce13-a1f1-4cbe-84a6-67ea963f2b07")
public static String es_PE_FIELD_AccountSchemaElement_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='SR' ",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c250ce13-a1f1-4cbe-84a6-67ea963f2b07")
public static final String FIELDNAME_AccountSchemaElement_SalesRegion="c250ce13-a1f1-4cbe-84a6-67ea963f2b07";

@XendraTrl(Identifier="3fc9d126-82e2-94db-d8f4-de37d2d24b07")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="33328ea1-ec77-2fd1-e3bb-d2e42a80b138",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3fc9d126-82e2-94db-d8f4-de37d2d24b07",Synchronized="2017-08-05 16:53:11.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";

/** ElementType AD_Reference=24957d9a-7342-7c9b-45fa-52d6e887e0d5 */
public static final int ELEMENTTYPE_AD_Reference_ID=181;
/** Set Type.
@param ElementType Element Type (account or user defined) */
public void setElementType (String ElementType)
{
if (ElementType == null) throw new IllegalArgumentException ("ElementType is mandatory");
if (ElementType.equals(REF_C_AcctSchemaElementType.UserList2) || ElementType.equals(REF_C_AcctSchemaElementType.Account) || ElementType.equals(REF_C_AcctSchemaElementType.Product) || ElementType.equals(REF_C_AcctSchemaElementType.UserElement2) || ElementType.equals(REF_C_AcctSchemaElementType.SubAccount) || ElementType.equals(REF_C_AcctSchemaElementType.UserElement1) || ElementType.equals(REF_C_AcctSchemaElementType.Organization) || ElementType.equals(REF_C_AcctSchemaElementType.LocationFrom) || ElementType.equals(REF_C_AcctSchemaElementType.LocationTo) || ElementType.equals(REF_C_AcctSchemaElementType.SalesRegion) || ElementType.equals(REF_C_AcctSchemaElementType.Project) || ElementType.equals(REF_C_AcctSchemaElementType.BPartner) || ElementType.equals(REF_C_AcctSchemaElementType.OrgTrx) || ElementType.equals(REF_C_AcctSchemaElementType.Activity) || ElementType.equals(REF_C_AcctSchemaElementType.Campaign) || ElementType.equals(REF_C_AcctSchemaElementType.UserList1));
 else throw new IllegalArgumentException ("ElementType Invalid value - " + ElementType + " - Reference_ID=181 - U2 - AC - PR - X2 - SA - X1 - OO - LF - LT - SR - PJ - BP - OT - AY - MC - U1");
if (ElementType.length() > 2)
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

@XendraTrl(Identifier="377e9ae2-1436-4feb-8246-31ebe555ef86")
public static String es_PE_FIELD_AccountSchemaElement_Type_Description="Tipo de Elemento (cuenta ó definido por el usuario)";

@XendraTrl(Identifier="377e9ae2-1436-4feb-8246-31ebe555ef86")
public static String es_PE_FIELD_AccountSchemaElement_Type_Help="Indica si este elemento es el elemento cuenta ó es un elemento definido por el usuario";

@XendraTrl(Identifier="377e9ae2-1436-4feb-8246-31ebe555ef86")
public static String es_PE_FIELD_AccountSchemaElement_Type_Name="Tipo";

@XendraField(AD_Column_ID="ElementType",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="377e9ae2-1436-4feb-8246-31ebe555ef86")
public static final String FIELDNAME_AccountSchemaElement_Type="377e9ae2-1436-4feb-8246-31ebe555ef86";

@XendraTrl(Identifier="e186d011-cc9f-30fe-fb3d-f76ff5238fcc")
public static String es_PE_COLUMN_ElementType_Name="Tipo";

@XendraColumn(AD_Element_ID="3c5013c0-9720-b812-2dd4-b97cb379d525",ColumnName="ElementType",
AD_Reference_ID=17,AD_Reference_Value_ID="24957d9a-7342-7c9b-45fa-52d6e887e0d5",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e186d011-cc9f-30fe-fb3d-f76ff5238fcc",Synchronized="2017-08-05 16:53:11.0")
/** Column name ElementType */
public static final String COLUMNNAME_ElementType = "ElementType";
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
@XendraTrl(Identifier="7a68a793-e8c1-4346-ba11-32217f8b01a3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a68a793-e8c1-4346-ba11-32217f8b01a3",
Synchronized="2017-08-05 16:53:11.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Balanced.
@param IsBalanced Balanced */
public void setIsBalanced (boolean IsBalanced)
{
set_Value (COLUMNNAME_IsBalanced, Boolean.valueOf(IsBalanced));
}
/** Get Balanced.
@return Balanced */
public boolean isBalanced() 
{
Object oo = get_Value(COLUMNNAME_IsBalanced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6d55f0da-8949-f8d2-6ccc-02c3f017e9e4")
public static String es_PE_FIELD_AccountSchemaElement_Balanced_Name="Balanceado";

@XendraField(AD_Column_ID="IsBalanced",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d55f0da-8949-f8d2-6ccc-02c3f017e9e4")
public static final String FIELDNAME_AccountSchemaElement_Balanced="6d55f0da-8949-f8d2-6ccc-02c3f017e9e4";

@XendraTrl(Identifier="bd381df0-0cbb-6d3c-aaa5-ed46255b59d9")
public static String es_PE_COLUMN_IsBalanced_Name="Balanceado";

@XendraColumn(AD_Element_ID="06f9fa56-7c52-efee-2ec3-54315525aaba",ColumnName="IsBalanced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd381df0-0cbb-6d3c-aaa5-ed46255b59d9",
Synchronized="2017-08-05 16:53:11.0")
/** Column name IsBalanced */
public static final String COLUMNNAME_IsBalanced = "IsBalanced";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f9eb1c1e-0aa7-441b-9194-00cdf4d76514")
public static String es_PE_FIELD_AccountSchemaElement_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="f9eb1c1e-0aa7-441b-9194-00cdf4d76514")
public static String es_PE_FIELD_AccountSchemaElement_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="f9eb1c1e-0aa7-441b-9194-00cdf4d76514")
public static String es_PE_FIELD_AccountSchemaElement_Mandatory_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9eb1c1e-0aa7-441b-9194-00cdf4d76514")
public static final String FIELDNAME_AccountSchemaElement_Mandatory="f9eb1c1e-0aa7-441b-9194-00cdf4d76514";

@XendraTrl(Identifier="b9842d16-1228-9d90-2202-e7e9d627886b")
public static String es_PE_COLUMN_IsMandatory_Name="Entrada Obligatoria";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9842d16-1228-9d90-2202-e7e9d627886b",
Synchronized="2017-08-05 16:53:11.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
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

@XendraTrl(Identifier="06708de2-aa0e-954c-f606-94c78557bd29")
public static String es_PE_FIELD_AccountSchemaElement_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="06708de2-aa0e-954c-f606-94c78557bd29")
public static String es_PE_FIELD_AccountSchemaElement_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="06708de2-aa0e-954c-f606-94c78557bd29")
public static String es_PE_FIELD_AccountSchemaElement_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='PR' ",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="06708de2-aa0e-954c-f606-94c78557bd29")
public static final String FIELDNAME_AccountSchemaElement_Product="06708de2-aa0e-954c-f606-94c78557bd29";

@XendraTrl(Identifier="682ead6c-9d97-a959-a973-a73fefe265b8")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="682ead6c-9d97-a959-a973-a73fefe265b8",Synchronized="2017-08-05 16:53:11.0")
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

@XendraTrl(Identifier="4c2f759c-0616-c206-43dd-53af4402c002")
public static String es_PE_FIELD_AccountSchemaElement_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4c2f759c-0616-c206-43dd-53af4402c002")
public static String es_PE_FIELD_AccountSchemaElement_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="4c2f759c-0616-c206-43dd-53af4402c002")
public static String es_PE_FIELD_AccountSchemaElement_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c2f759c-0616-c206-43dd-53af4402c002")
public static final String FIELDNAME_AccountSchemaElement_Name="4c2f759c-0616-c206-43dd-53af4402c002";

@XendraTrl(Identifier="7f5cbb4d-d5cb-95c7-70e8-0b9ef787e568")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f5cbb4d-d5cb-95c7-70e8-0b9ef787e568",
Synchronized="2017-08-05 16:53:11.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** Org_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int ORG_ID_AD_Reference_ID=130;
/** Set Organization.
@param Org_ID Organizational entity within client */
public void setOrg_ID (int Org_ID)
{
if (Org_ID < 1) throw new IllegalArgumentException ("Org_ID is mandatory.");
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

@XendraTrl(Identifier="08207bc5-acf1-c6fd-71c0-3a1e77474c4d")
public static String es_PE_FIELD_AccountSchemaElement_Organization_Description="Entidad organizacional dentro de la empresa.";

@XendraTrl(Identifier="08207bc5-acf1-c6fd-71c0-3a1e77474c4d")
public static String es_PE_FIELD_AccountSchemaElement_Organization_Help="Una organización es una unidad de su compañía ó entidad legal. Ej. tiendas; departamentos";

@XendraTrl(Identifier="08207bc5-acf1-c6fd-71c0-3a1e77474c4d")
public static String es_PE_FIELD_AccountSchemaElement_Organization_Name="Organización";

@XendraField(AD_Column_ID="Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@='OO' | @ElementType@='OT'",DisplayLength=14,IsReadOnly=false,SeqNo=120,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="08207bc5-acf1-c6fd-71c0-3a1e77474c4d")
public static final String FIELDNAME_AccountSchemaElement_Organization="08207bc5-acf1-c6fd-71c0-3a1e77474c4d";

@XendraTrl(Identifier="1215597b-95fe-bde5-99d2-64052f46322b")
public static String es_PE_COLUMN_Org_ID_Name="Organización";

@XendraColumn(AD_Element_ID="a4e75444-9eb1-c885-3445-9b55e2eb765a",ColumnName="Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1215597b-95fe-bde5-99d2-64052f46322b",Synchronized="2017-08-05 16:53:11.0")
/** Column name Org_ID */
public static final String COLUMNNAME_Org_ID = "Org_ID";
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

@XendraTrl(Identifier="cd716329-bffb-4d36-b265-57271206ceec")
public static String es_PE_FIELD_AccountSchemaElement_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="cd716329-bffb-4d36-b265-57271206ceec")
public static String es_PE_FIELD_AccountSchemaElement_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="cd716329-bffb-4d36-b265-57271206ceec")
public static String es_PE_FIELD_AccountSchemaElement_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="9ff2cb42-cca5-58d6-dd3e-e58ee6c1708c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd716329-bffb-4d36-b265-57271206ceec")
public static final String FIELDNAME_AccountSchemaElement_Sequence="cd716329-bffb-4d36-b265-57271206ceec";

@XendraTrl(Identifier="b4df5eb7-5ad2-5ff0-210d-297f485f68d4")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_AcctSchema_Element WHERE C_AcctSchema_ID=@C_AcctSchema_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4df5eb7-5ad2-5ff0-210d-297f485f68d4",
Synchronized="2017-08-05 16:53:11.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
