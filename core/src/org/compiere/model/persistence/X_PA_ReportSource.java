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
/** Generated Model for PA_ReportSource
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_ReportSource extends PO
{
/** Standard Constructor
@param ctx context
@param PA_ReportSource_ID id
@param trxName transaction
*/
public X_PA_ReportSource (Properties ctx, int PA_ReportSource_ID, String trxName)
{
super (ctx, PA_ReportSource_ID, trxName);
/** if (PA_ReportSource_ID == 0)
{
setElementType (null);
setIsIncludeNullsActivity (false);
setIsIncludeNullsBPartner (false);
setIsIncludeNullsCampaign (false);
setIsIncludeNullsElementValue (false);
setIsIncludeNullsLocation (false);
setIsIncludeNullsOrg (false);
setIsIncludeNullsOrgTrx (false);
setIsIncludeNullsProduct (false);
setIsIncludeNullsProject (false);
setIsIncludeNullsSalesRegion (false);
setIsIncludeNullsUserElement1 (false);
setIsIncludeNullsUserElement2 (false);
setPA_ReportLine_ID (0);
setPA_ReportSource_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_ReportSource (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=450 */
public static int Table_ID=MTable.getTable_ID("PA_ReportSource");

@XendraTrl(Identifier="91d81652-ae85-abf8-fcba-532de6d2e3af")
public static String es_PE_TAB_ReportSource_Description="Mantener valores de segmentos de fuente del Informe";

@XendraTrl(Identifier="91d81652-ae85-abf8-fcba-532de6d2e3af")
public static String es_PE_TAB_ReportSource_Name="Fuente del Informe";

@XendraTab(Name="Report Source",Description="Maintain Segment Values of Report Line Source ",
Help="",AD_Window_ID="8c6d3119-8975-60f6-4810-c1c02115372c",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="91d81652-ae85-abf8-fcba-532de6d2e3af",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportSource="91d81652-ae85-abf8-fcba-532de6d2e3af";

@XendraTrl(Identifier="4d2b8cde-886f-ee7d-e0de-6fa2b631ac5a")
public static String es_PE_TABLE_PA_ReportSource_Name="Fuente de Informe";

@XendraTable(Name="Report Source",Description="Restriction of what will be shown in Report Line",
Help="",TableName="PA_ReportSource",AccessLevel="3",
AD_Window_ID="8c6d3119-8975-60f6-4810-c1c02115372c",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="4d2b8cde-886f-ee7d-e0de-6fa2b631ac5a",Synchronized="2017-08-16 11:43:43.0")
/** TableName=PA_ReportSource */
public static final String Table_Name="PA_ReportSource";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_ReportSource");

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
    Table_ID = MTable.getTable_ID("PA_ReportSource");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_ReportSource[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="866ad692-d497-4e22-9719-a6e848d04d97")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Trx Organization";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="866ad692-d497-4e22-9719-a6e848d04d97",
Synchronized="2017-08-05 16:55:44.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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

@XendraTrl(Identifier="a8fa8d66-c775-0a90-71eb-65cd6780a5f1")
public static String es_PE_FIELD_ReportSource_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="a8fa8d66-c775-0a90-71eb-65cd6780a5f1")
public static String es_PE_FIELD_ReportSource_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="a8fa8d66-c775-0a90-71eb-65cd6780a5f1")
public static String es_PE_FIELD_ReportSource_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=AY",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a8fa8d66-c775-0a90-71eb-65cd6780a5f1")
public static final String FIELDNAME_ReportSource_Activity="a8fa8d66-c775-0a90-71eb-65cd6780a5f1";

@XendraTrl(Identifier="da16cca6-ec0e-6c50-2be3-d3d97d3c2fc4")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da16cca6-ec0e-6c50-2be3-d3d97d3c2fc4",
Synchronized="2017-08-05 16:55:44.0")
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

@XendraTrl(Identifier="257ba5f6-903a-447d-f6a4-28b577cb0206")
public static String es_PE_FIELD_ReportSource_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="257ba5f6-903a-447d-f6a4-28b577cb0206")
public static String es_PE_FIELD_ReportSource_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="257ba5f6-903a-447d-f6a4-28b577cb0206")
public static String es_PE_FIELD_ReportSource_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=BP",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="257ba5f6-903a-447d-f6a4-28b577cb0206")
public static final String FIELDNAME_ReportSource_BusinessPartner="257ba5f6-903a-447d-f6a4-28b577cb0206";

@XendraTrl(Identifier="7e3351a9-9a8d-971c-b9fa-656075799ee0")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e3351a9-9a8d-971c-b9fa-656075799ee0",
Synchronized="2017-08-05 16:55:44.0")
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

@XendraTrl(Identifier="5dc749fb-2e30-dfbd-3525-b2284a561117")
public static String es_PE_FIELD_ReportSource_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="5dc749fb-2e30-dfbd-3525-b2284a561117")
public static String es_PE_FIELD_ReportSource_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="5dc749fb-2e30-dfbd-3525-b2284a561117")
public static String es_PE_FIELD_ReportSource_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=MC",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5dc749fb-2e30-dfbd-3525-b2284a561117")
public static final String FIELDNAME_ReportSource_Campaign="5dc749fb-2e30-dfbd-3525-b2284a561117";

@XendraTrl(Identifier="49f7b8bb-eb92-bdd1-a927-5f082fb9b7b8")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49f7b8bb-eb92-bdd1-a927-5f082fb9b7b8",
Synchronized="2017-08-05 16:55:44.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

/** C_ElementValue_ID AD_Reference=4a70ea12-0269-0422-814e-17afaa3a5479 */
public static final int C_ELEMENTVALUE_ID_AD_Reference_ID=182;
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

@XendraTrl(Identifier="e5b80d08-bfa5-b600-f4eb-171f081fe098")
public static String es_PE_FIELD_ReportSource_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="e5b80d08-bfa5-b600-f4eb-171f081fe098")
public static String es_PE_FIELD_ReportSource_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraTrl(Identifier="e5b80d08-bfa5-b600-f4eb-171f081fe098")
public static String es_PE_FIELD_ReportSource_AccountElement_Name="Valor del Elemento";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=AC | @ElementType@=U1 | @ElementType@=U2",DisplayLength=14,
IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5b80d08-bfa5-b600-f4eb-171f081fe098")
public static final String FIELDNAME_ReportSource_AccountElement="e5b80d08-bfa5-b600-f4eb-171f081fe098";

@XendraTrl(Identifier="f9d65ed3-c227-435e-bf08-507b0ec1365e")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="4a70ea12-0269-0422-814e-17afaa3a5479",
AD_Val_Rule_ID="5fb736b0-241b-e452-6294-10968baddd7c",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9d65ed3-c227-435e-bf08-507b0ec1365e",
Synchronized="2017-08-05 16:55:44.0")
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

@XendraTrl(Identifier="03240613-fc84-fb68-784e-169f25d88026")
public static String es_PE_FIELD_ReportSource_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="03240613-fc84-fb68-784e-169f25d88026")
public static String es_PE_FIELD_ReportSource_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="03240613-fc84-fb68-784e-169f25d88026")
public static String es_PE_FIELD_ReportSource_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=LF | @ElementType@=LT",DisplayLength=26,IsReadOnly=false,SeqNo=120,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="03240613-fc84-fb68-784e-169f25d88026")
public static final String FIELDNAME_ReportSource_Address="03240613-fc84-fb68-784e-169f25d88026";

@XendraTrl(Identifier="d11074c4-3860-780c-0eb8-bc7168c0a977")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d11074c4-3860-780c-0eb8-bc7168c0a977",
Synchronized="2017-08-05 16:55:44.0")
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

@XendraTrl(Identifier="fcf21b99-f295-dfe9-b00e-93b98ad98bbe")
public static String es_PE_FIELD_ReportSource_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="fcf21b99-f295-dfe9-b00e-93b98ad98bbe")
public static String es_PE_FIELD_ReportSource_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="fcf21b99-f295-dfe9-b00e-93b98ad98bbe")
public static String es_PE_FIELD_ReportSource_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=PJ",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fcf21b99-f295-dfe9-b00e-93b98ad98bbe")
public static final String FIELDNAME_ReportSource_Project="fcf21b99-f295-dfe9-b00e-93b98ad98bbe";

@XendraTrl(Identifier="4a49da17-f67b-6bfd-69bc-d45668f64979")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a49da17-f67b-6bfd-69bc-d45668f64979",
Synchronized="2017-08-05 16:55:44.0")
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

@XendraTrl(Identifier="7d19cf8f-3da2-1ad7-fc1b-5f217cc153a5")
public static String es_PE_FIELD_ReportSource_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="7d19cf8f-3da2-1ad7-fc1b-5f217cc153a5")
public static String es_PE_FIELD_ReportSource_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="7d19cf8f-3da2-1ad7-fc1b-5f217cc153a5")
public static String es_PE_FIELD_ReportSource_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=SR",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7d19cf8f-3da2-1ad7-fc1b-5f217cc153a5")
public static final String FIELDNAME_ReportSource_SalesRegion="7d19cf8f-3da2-1ad7-fc1b-5f217cc153a5";

@XendraTrl(Identifier="a67285a9-3e2b-fa52-7755-ae62fcf04e9e")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a67285a9-3e2b-fa52-7755-ae62fcf04e9e",
Synchronized="2017-08-05 16:55:44.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
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

@XendraTrl(Identifier="d09486ca-1149-36b7-bf70-4e8c8883f725")
public static String es_PE_FIELD_ReportSource_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d09486ca-1149-36b7-bf70-4e8c8883f725")
public static String es_PE_FIELD_ReportSource_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="d09486ca-1149-36b7-bf70-4e8c8883f725")
public static String es_PE_FIELD_ReportSource_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LineType@=S",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d09486ca-1149-36b7-bf70-4e8c8883f725")
public static final String FIELDNAME_ReportSource_Description="d09486ca-1149-36b7-bf70-4e8c8883f725";

@XendraTrl(Identifier="fb36f5dd-8649-9536-4639-678da375d096")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb36f5dd-8649-9536-4639-678da375d096",
Synchronized="2017-08-05 16:55:44.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getElementType()));
}

@XendraTrl(Identifier="aebb51e7-bf36-fed0-8b14-474cbf310dd3")
public static String es_PE_FIELD_ReportSource_Type_Description="Tipo de Elemento (cuenta ó definido por el usuario)";

@XendraTrl(Identifier="aebb51e7-bf36-fed0-8b14-474cbf310dd3")
public static String es_PE_FIELD_ReportSource_Type_Help="Indica si este elemento es el elemento cuenta ó es un elemento definido por el usuario";

@XendraTrl(Identifier="aebb51e7-bf36-fed0-8b14-474cbf310dd3")
public static String es_PE_FIELD_ReportSource_Type_Name="Tipo";

@XendraField(AD_Column_ID="ElementType",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LineType@=S",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aebb51e7-bf36-fed0-8b14-474cbf310dd3")
public static final String FIELDNAME_ReportSource_Type="aebb51e7-bf36-fed0-8b14-474cbf310dd3";

@XendraTrl(Identifier="4b07e143-6dff-d326-6a9f-ac9504a46833")
public static String es_PE_COLUMN_ElementType_Name="Tipo";

@XendraColumn(AD_Element_ID="3c5013c0-9720-b812-2dd4-b97cb379d525",ColumnName="ElementType",
AD_Reference_ID=17,AD_Reference_Value_ID="24957d9a-7342-7c9b-45fa-52d6e887e0d5",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4b07e143-6dff-d326-6a9f-ac9504a46833",Synchronized="2017-08-05 16:55:44.0")
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
@XendraTrl(Identifier="678a1b26-853f-4c99-82bb-e0bb6edcd0ee")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="678a1b26-853f-4c99-82bb-e0bb6edcd0ee",
Synchronized="2017-08-05 16:55:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsIncludeNullsActivity.
@param IsIncludeNullsActivity IsIncludeNullsActivity */
public void setIsIncludeNullsActivity (boolean IsIncludeNullsActivity)
{
set_Value (COLUMNNAME_IsIncludeNullsActivity, Boolean.valueOf(IsIncludeNullsActivity));
}
/** Get IsIncludeNullsActivity.
@return IsIncludeNullsActivity */
public boolean isIncludeNullsActivity() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsActivity);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dbddb7a0-31cc-4744-9c03-82ead79a1ff1")
public static String es_PE_COLUMN_IsIncludeNullsActivity_Name="isincludenullsactivity";

@XendraColumn(AD_Element_ID="e1364b03-291d-436c-af10-7d58708951d6",
ColumnName="IsIncludeNullsActivity",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dbddb7a0-31cc-4744-9c03-82ead79a1ff1",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsActivity */
public static final String COLUMNNAME_IsIncludeNullsActivity = "IsIncludeNullsActivity";
/** Set IsIncludeNullsBPartner.
@param IsIncludeNullsBPartner IsIncludeNullsBPartner */
public void setIsIncludeNullsBPartner (boolean IsIncludeNullsBPartner)
{
set_Value (COLUMNNAME_IsIncludeNullsBPartner, Boolean.valueOf(IsIncludeNullsBPartner));
}
/** Get IsIncludeNullsBPartner.
@return IsIncludeNullsBPartner */
public boolean isIncludeNullsBPartner() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsBPartner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="01a4d363-4965-4d78-92c4-a219d5349473")
public static String es_PE_COLUMN_IsIncludeNullsBPartner_Name="isincludenullsbpartner";

@XendraColumn(AD_Element_ID="a51d50b1-f40f-4cdc-ab76-5d8e6105741f",
ColumnName="IsIncludeNullsBPartner",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="01a4d363-4965-4d78-92c4-a219d5349473",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsBPartner */
public static final String COLUMNNAME_IsIncludeNullsBPartner = "IsIncludeNullsBPartner";
/** Set IsIncludeNullsCampaign.
@param IsIncludeNullsCampaign IsIncludeNullsCampaign */
public void setIsIncludeNullsCampaign (boolean IsIncludeNullsCampaign)
{
set_Value (COLUMNNAME_IsIncludeNullsCampaign, Boolean.valueOf(IsIncludeNullsCampaign));
}
/** Get IsIncludeNullsCampaign.
@return IsIncludeNullsCampaign */
public boolean isIncludeNullsCampaign() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsCampaign);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="73903d01-7459-4a46-9ea9-b0329333e3b6")
public static String es_PE_COLUMN_IsIncludeNullsCampaign_Name="isincludenullscampaign";

@XendraColumn(AD_Element_ID="aaa373a0-9fce-47c4-814a-004a6a2e4b43",
ColumnName="IsIncludeNullsCampaign",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="73903d01-7459-4a46-9ea9-b0329333e3b6",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsCampaign */
public static final String COLUMNNAME_IsIncludeNullsCampaign = "IsIncludeNullsCampaign";
/** Set IsIncludeNullsElementValue.
@param IsIncludeNullsElementValue IsIncludeNullsElementValue */
public void setIsIncludeNullsElementValue (boolean IsIncludeNullsElementValue)
{
set_Value (COLUMNNAME_IsIncludeNullsElementValue, Boolean.valueOf(IsIncludeNullsElementValue));
}
/** Get IsIncludeNullsElementValue.
@return IsIncludeNullsElementValue */
public boolean isIncludeNullsElementValue() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsElementValue);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="45fd4eab-7d7c-48f6-b758-c116a57da6a2")
public static String es_PE_COLUMN_IsIncludeNullsElementValue_Name="isincludenullselementvalue";

@XendraColumn(AD_Element_ID="8cbc797f-148a-4442-b9aa-26c78dac454e",
ColumnName="IsIncludeNullsElementValue",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="45fd4eab-7d7c-48f6-b758-c116a57da6a2",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsElementValue */
public static final String COLUMNNAME_IsIncludeNullsElementValue = "IsIncludeNullsElementValue";
/** Set IsIncludeNullsLocation.
@param IsIncludeNullsLocation IsIncludeNullsLocation */
public void setIsIncludeNullsLocation (boolean IsIncludeNullsLocation)
{
set_Value (COLUMNNAME_IsIncludeNullsLocation, Boolean.valueOf(IsIncludeNullsLocation));
}
/** Get IsIncludeNullsLocation.
@return IsIncludeNullsLocation */
public boolean isIncludeNullsLocation() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsLocation);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7eac8dbf-e64e-4dab-aaac-1077ece7c8b3")
public static String es_PE_COLUMN_IsIncludeNullsLocation_Name="isincludenullslocation";

@XendraColumn(AD_Element_ID="9f47a8bf-016c-41dc-b07d-129576df4b6a",
ColumnName="IsIncludeNullsLocation",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7eac8dbf-e64e-4dab-aaac-1077ece7c8b3",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsLocation */
public static final String COLUMNNAME_IsIncludeNullsLocation = "IsIncludeNullsLocation";
/** Set IsIncludeNullsOrg.
@param IsIncludeNullsOrg IsIncludeNullsOrg */
public void setIsIncludeNullsOrg (boolean IsIncludeNullsOrg)
{
set_Value (COLUMNNAME_IsIncludeNullsOrg, Boolean.valueOf(IsIncludeNullsOrg));
}
/** Get IsIncludeNullsOrg.
@return IsIncludeNullsOrg */
public boolean isIncludeNullsOrg() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsOrg);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5b252568-ed24-4af2-b2aa-a480a4b773d7")
public static String es_PE_COLUMN_IsIncludeNullsOrg_Name="isincludenullsorg";

@XendraColumn(AD_Element_ID="6c6cb885-38ef-4abd-a527-53d1ded62a83",ColumnName="IsIncludeNullsOrg",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b252568-ed24-4af2-b2aa-a480a4b773d7",
Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsOrg */
public static final String COLUMNNAME_IsIncludeNullsOrg = "IsIncludeNullsOrg";
/** Set IsIncludeNullsOrgTrx.
@param IsIncludeNullsOrgTrx IsIncludeNullsOrgTrx */
public void setIsIncludeNullsOrgTrx (boolean IsIncludeNullsOrgTrx)
{
set_Value (COLUMNNAME_IsIncludeNullsOrgTrx, Boolean.valueOf(IsIncludeNullsOrgTrx));
}
/** Get IsIncludeNullsOrgTrx.
@return IsIncludeNullsOrgTrx */
public boolean isIncludeNullsOrgTrx() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsOrgTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0afdf9c5-020e-42b3-a0ad-6da060ec834c")
public static String es_PE_COLUMN_IsIncludeNullsOrgTrx_Name="isincludenullsorgtrx";

@XendraColumn(AD_Element_ID="afdca439-dbcb-462d-bd1f-6f1a8593aebf",
ColumnName="IsIncludeNullsOrgTrx",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0afdf9c5-020e-42b3-a0ad-6da060ec834c",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsOrgTrx */
public static final String COLUMNNAME_IsIncludeNullsOrgTrx = "IsIncludeNullsOrgTrx";
/** Set IsIncludeNullsProduct.
@param IsIncludeNullsProduct IsIncludeNullsProduct */
public void setIsIncludeNullsProduct (boolean IsIncludeNullsProduct)
{
set_Value (COLUMNNAME_IsIncludeNullsProduct, Boolean.valueOf(IsIncludeNullsProduct));
}
/** Get IsIncludeNullsProduct.
@return IsIncludeNullsProduct */
public boolean isIncludeNullsProduct() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsProduct);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e9295037-4f5e-43e8-b9df-83ac04c089ff")
public static String es_PE_COLUMN_IsIncludeNullsProduct_Name="isincludenullsproduct";

@XendraColumn(AD_Element_ID="1095eb53-5adf-4510-a35a-b32cf28b0ebf",
ColumnName="IsIncludeNullsProduct",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e9295037-4f5e-43e8-b9df-83ac04c089ff",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsProduct */
public static final String COLUMNNAME_IsIncludeNullsProduct = "IsIncludeNullsProduct";
/** Set IsIncludeNullsProject.
@param IsIncludeNullsProject IsIncludeNullsProject */
public void setIsIncludeNullsProject (boolean IsIncludeNullsProject)
{
set_Value (COLUMNNAME_IsIncludeNullsProject, Boolean.valueOf(IsIncludeNullsProject));
}
/** Get IsIncludeNullsProject.
@return IsIncludeNullsProject */
public boolean isIncludeNullsProject() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsProject);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cd7f26af-cf41-42df-8b9b-5f8efaeea5be")
public static String es_PE_COLUMN_IsIncludeNullsProject_Name="isincludenullsproject";

@XendraColumn(AD_Element_ID="ccedde64-f728-43cd-9d3e-c5cbd704fe97",
ColumnName="IsIncludeNullsProject",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cd7f26af-cf41-42df-8b9b-5f8efaeea5be",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsProject */
public static final String COLUMNNAME_IsIncludeNullsProject = "IsIncludeNullsProject";
/** Set IsIncludeNullsSalesRegion.
@param IsIncludeNullsSalesRegion IsIncludeNullsSalesRegion */
public void setIsIncludeNullsSalesRegion (boolean IsIncludeNullsSalesRegion)
{
set_Value (COLUMNNAME_IsIncludeNullsSalesRegion, Boolean.valueOf(IsIncludeNullsSalesRegion));
}
/** Get IsIncludeNullsSalesRegion.
@return IsIncludeNullsSalesRegion */
public boolean isIncludeNullsSalesRegion() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsSalesRegion);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="60442f4b-8a4c-4dfc-8d18-de3b9711c5fa")
public static String es_PE_COLUMN_IsIncludeNullsSalesRegion_Name="isincludenullssalesregion";

@XendraColumn(AD_Element_ID="8dc7451a-780a-4646-8cff-e70633582f12",
ColumnName="IsIncludeNullsSalesRegion",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="60442f4b-8a4c-4dfc-8d18-de3b9711c5fa",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsSalesRegion */
public static final String COLUMNNAME_IsIncludeNullsSalesRegion = "IsIncludeNullsSalesRegion";
/** Set IsIncludeNullsUserElement1.
@param IsIncludeNullsUserElement1 IsIncludeNullsUserElement1 */
public void setIsIncludeNullsUserElement1 (boolean IsIncludeNullsUserElement1)
{
set_Value (COLUMNNAME_IsIncludeNullsUserElement1, Boolean.valueOf(IsIncludeNullsUserElement1));
}
/** Get IsIncludeNullsUserElement1.
@return IsIncludeNullsUserElement1 */
public boolean isIncludeNullsUserElement1() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsUserElement1);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ab147833-bdcd-401a-9690-8b5b06268aec")
public static String es_PE_COLUMN_IsIncludeNullsUserElement1_Name="isincludenullsuserelement1";

@XendraColumn(AD_Element_ID="24f700c6-90b3-4c2e-88a1-318e2874b093",
ColumnName="IsIncludeNullsUserElement1",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ab147833-bdcd-401a-9690-8b5b06268aec",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsUserElement1 */
public static final String COLUMNNAME_IsIncludeNullsUserElement1 = "IsIncludeNullsUserElement1";
/** Set IsIncludeNullsUserElement2.
@param IsIncludeNullsUserElement2 IsIncludeNullsUserElement2 */
public void setIsIncludeNullsUserElement2 (boolean IsIncludeNullsUserElement2)
{
set_Value (COLUMNNAME_IsIncludeNullsUserElement2, Boolean.valueOf(IsIncludeNullsUserElement2));
}
/** Get IsIncludeNullsUserElement2.
@return IsIncludeNullsUserElement2 */
public boolean isIncludeNullsUserElement2() 
{
Object oo = get_Value(COLUMNNAME_IsIncludeNullsUserElement2);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="75cec607-7c45-4c26-adfd-8f63b1bc049e")
public static String es_PE_COLUMN_IsIncludeNullsUserElement2_Name="isincludenullsuserelement2";

@XendraColumn(AD_Element_ID="28b748fc-1fcf-43ed-b781-abcf42594cf8",
ColumnName="IsIncludeNullsUserElement2",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="75cec607-7c45-4c26-adfd-8f63b1bc049e",Synchronized="2017-08-05 16:55:44.0")
/** Column name IsIncludeNullsUserElement2 */
public static final String COLUMNNAME_IsIncludeNullsUserElement2 = "IsIncludeNullsUserElement2";
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

@XendraTrl(Identifier="df060413-4cf5-40de-1f80-fb70ad072801")
public static String es_PE_FIELD_ReportSource_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="df060413-4cf5-40de-1f80-fb70ad072801")
public static String es_PE_FIELD_ReportSource_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="df060413-4cf5-40de-1f80-fb70ad072801")
public static String es_PE_FIELD_ReportSource_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=PR",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="df060413-4cf5-40de-1f80-fb70ad072801")
public static final String FIELDNAME_ReportSource_Product="df060413-4cf5-40de-1f80-fb70ad072801";

@XendraTrl(Identifier="e6010fbb-2bd6-574a-cf7c-578ded3e1589")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6010fbb-2bd6-574a-cf7c-578ded3e1589",
Synchronized="2017-08-05 16:55:44.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

/** Org_ID AD_Reference=03b73d55-8464-9bbd-df2b-d10ff9f3913f */
public static final int ORG_ID_AD_Reference_ID=322;
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

@XendraTrl(Identifier="b1e48590-4a1a-2fa7-22aa-a93a970171b9")
public static String es_PE_FIELD_ReportSource_Organization_Description="Entidad organizacional dentro de la empresa.";

@XendraTrl(Identifier="b1e48590-4a1a-2fa7-22aa-a93a970171b9")
public static String es_PE_FIELD_ReportSource_Organization_Help="Una organización es una unidad de su compañía ó entidad legal. Ej. tiendas; departamentos";

@XendraTrl(Identifier="b1e48590-4a1a-2fa7-22aa-a93a970171b9")
public static String es_PE_FIELD_ReportSource_Organization_Name="Organización";

@XendraField(AD_Column_ID="Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=OO | @ElementType@=OT",DisplayLength=14,IsReadOnly=false,SeqNo=80,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b1e48590-4a1a-2fa7-22aa-a93a970171b9")
public static final String FIELDNAME_ReportSource_Organization="b1e48590-4a1a-2fa7-22aa-a93a970171b9";

@XendraTrl(Identifier="9394a9b4-7bd1-ec37-808d-3c41ea49d816")
public static String es_PE_COLUMN_Org_ID_Name="Organización";

@XendraColumn(AD_Element_ID="a4e75444-9eb1-c885-3445-9b55e2eb765a",ColumnName="Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="03b73d55-8464-9bbd-df2b-d10ff9f3913f",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9394a9b4-7bd1-ec37-808d-3c41ea49d816",Synchronized="2017-08-05 16:55:44.0")
/** Column name Org_ID */
public static final String COLUMNNAME_Org_ID = "Org_ID";
/** Set Report Line.
@param PA_ReportLine_ID Report Line */
public void setPA_ReportLine_ID (int PA_ReportLine_ID)
{
if (PA_ReportLine_ID < 1) throw new IllegalArgumentException ("PA_ReportLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportLine_ID, Integer.valueOf(PA_ReportLine_ID));
}
/** Get Report Line.
@return Report Line */
public int getPA_ReportLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="20294499-da51-658f-3824-81622b490dd0")
public static String es_PE_FIELD_ReportSource_ReportLine_Help="";

@XendraTrl(Identifier="20294499-da51-658f-3824-81622b490dd0")
public static String es_PE_FIELD_ReportSource_ReportLine_Name="Item de Informe";

@XendraField(AD_Column_ID="PA_ReportLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20294499-da51-658f-3824-81622b490dd0")
public static final String FIELDNAME_ReportSource_ReportLine="20294499-da51-658f-3824-81622b490dd0";

@XendraTrl(Identifier="67b66d80-8095-4b5b-a903-7a50195bd5c1")
public static String es_PE_COLUMN_PA_ReportLine_ID_Name="Línea de Informe";

@XendraColumn(AD_Element_ID="52ed6403-4961-3af8-0136-2d580aef2758",ColumnName="PA_ReportLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67b66d80-8095-4b5b-a903-7a50195bd5c1",
Synchronized="2017-08-05 16:55:44.0")
/** Column name PA_ReportLine_ID */
public static final String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
/** Set Report Source.
@param PA_ReportSource_ID Restriction of what will be shown in Report Line */
public void setPA_ReportSource_ID (int PA_ReportSource_ID)
{
if (PA_ReportSource_ID < 1) throw new IllegalArgumentException ("PA_ReportSource_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportSource_ID, Integer.valueOf(PA_ReportSource_ID));
}
/** Get Report Source.
@return Restriction of what will be shown in Report Line */
public int getPA_ReportSource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportSource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="acdddfb9-5131-e796-74f5-77e8d614445c")
public static String es_PE_FIELD_ReportSource_ReportSource_Description="Restricción de lo que será mostrado en la línea del Informe";

@XendraTrl(Identifier="acdddfb9-5131-e796-74f5-77e8d614445c")
public static String es_PE_FIELD_ReportSource_ReportSource_Name="Fuente de Informe";

@XendraField(AD_Column_ID="PA_ReportSource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="91d81652-ae85-abf8-fcba-532de6d2e3af",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acdddfb9-5131-e796-74f5-77e8d614445c")
public static final String FIELDNAME_ReportSource_ReportSource="acdddfb9-5131-e796-74f5-77e8d614445c";
/** Column name PA_ReportSource_ID */
public static final String COLUMNNAME_PA_ReportSource_ID = "PA_ReportSource_ID";
/** Set User Element 1.
@param UserElement1_ID User defined accounting Element */
public void setUserElement1_ID (int UserElement1_ID)
{
if (UserElement1_ID <= 0) set_Value (COLUMNNAME_UserElement1_ID, null);
 else 
set_Value (COLUMNNAME_UserElement1_ID, Integer.valueOf(UserElement1_ID));
}
/** Get User Element 1.
@return User defined accounting Element */
public int getUserElement1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="51f1c4fe-62e6-424f-8087-7d813342c4e0")
public static String es_PE_COLUMN_UserElement1_ID_Name="User Element 1";

@XendraColumn(AD_Element_ID="ff0e32d9-4f26-c956-dcff-4c22340ac351",ColumnName="UserElement1_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51f1c4fe-62e6-424f-8087-7d813342c4e0",
Synchronized="2017-08-05 16:55:44.0")
/** Column name UserElement1_ID */
public static final String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
/** Set User Element 2.
@param UserElement2_ID User defined accounting Element */
public void setUserElement2_ID (int UserElement2_ID)
{
if (UserElement2_ID <= 0) set_Value (COLUMNNAME_UserElement2_ID, null);
 else 
set_Value (COLUMNNAME_UserElement2_ID, Integer.valueOf(UserElement2_ID));
}
/** Get User Element 2.
@return User defined accounting Element */
public int getUserElement2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6c63fed7-9d74-4c16-ab35-7e0dfcc3d438")
public static String es_PE_COLUMN_UserElement2_ID_Name="User Element 2";

@XendraColumn(AD_Element_ID="e99c9066-c80c-ab02-0bfb-e485dfbadc2d",ColumnName="UserElement2_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c63fed7-9d74-4c16-ab35-7e0dfcc3d438",
Synchronized="2017-08-05 16:55:44.0")
/** Column name UserElement2_ID */
public static final String COLUMNNAME_UserElement2_ID = "UserElement2_ID";
}
