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
/** Generated Model for C_Commission
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Commission extends PO
{
/** Standard Constructor
@param ctx context
@param C_Commission_ID id
@param trxName transaction
*/
public X_C_Commission (Properties ctx, int C_Commission_ID, String trxName)
{
super (ctx, C_Commission_ID, trxName);
/** if (C_Commission_ID == 0)
{
setC_BPartner_ID (0);
setC_Charge_ID (0);
setC_Commission_ID (0);
setC_Currency_ID (0);
setDocBasisType (null);	
// I
setFrequencyType (null);	
// M
setListDetails (false);	
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
public X_C_Commission (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=429 */
public static int Table_ID=MTable.getTable_ID("C_Commission");

@XendraTrl(Identifier="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff")
public static String es_PE_TAB_Commission_Description="Definir Reglas de Comisiones";

@XendraTrl(Identifier="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff")
public static String es_PE_TAB_Commission_Help="Define cuando pagar una Comisión y a quien. Para cada período; el calculo de la comisión comienza después que las transacciones de ese período están completas ó cerradas.";

@XendraTrl(Identifier="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff")
public static String es_PE_TAB_Commission_Name="Comisión";
@XendraTab(Name="Commission",
Description="Define Commission Rule",
Help="Define when to pay a commission to whom.  For each period, you start the calculation of the commission after the transaction for that period are completed or closed.",
AD_Window_ID="714562e3-3fcb-dd06-5bab-6e03249018a6",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Commission="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff";

@XendraTrl(Identifier="232f32d0-d9a2-5acc-7685-45996da39d97")
public static String es_PE_TABLE_C_Commission_Name="Comisión";

@XendraTable(Name="Commission",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Commission",Help="",
TableName="C_Commission",AccessLevel="3",AD_Window_ID="714562e3-3fcb-dd06-5bab-6e03249018a6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="232f32d0-d9a2-5acc-7685-45996da39d97",Synchronized="2020-03-03 21:36:44.0")
/** TableName=C_Commission */
public static final String Table_Name="C_Commission";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Commission");

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
    Table_ID = MTable.getTable_ID("C_Commission");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Commission[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
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

@XendraTrl(Identifier="3b50954a-0b57-d981-0cf4-0ea9aa71e6d8")
public static String es_PE_FIELD_Commission_BusinessPartnerSalesRep_Name="Socio del Negocio / Rep de Ventas";

@XendraTrl(Identifier="3b50954a-0b57-d981-0cf4-0ea9aa71e6d8")
public static String es_PE_FIELD_Commission_BusinessPartnerSalesRep_Description="Identifica al socio del negocio (representante de ventas) que recibe una Comisi=F3n.";

@XendraTrl(Identifier="3b50954a-0b57-d981-0cf4-0ea9aa71e6d8")
public static String es_PE_FIELD_Commission_BusinessPartnerSalesRep_Help="El socio de negocio debe ser vendedor y puede ser un representante de ventas.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=false,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b50954a-0b57-d981-0cf4-0ea9aa71e6d8")
public static final String FIELDNAME_Commission_BusinessPartnerSalesRep="3b50954a-0b57-d981-0cf4-0ea9aa71e6d8";

@XendraTrl(Identifier="13b39059-45b7-e9ce-9393-ae68965f8eb4")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="60ae0c61-2010-74a0-d56f-a6f27933c4c4",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="13b39059-45b7-e9ce-9393-ae68965f8eb4",Synchronized="2019-08-30 22:21:22.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID < 1) throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6a62b266-194d-8a78-af98-88e22c6cc28e")
public static String es_PE_FIELD_Commission_Charge_Name="Cargo";

@XendraTrl(Identifier="6a62b266-194d-8a78-af98-88e22c6cc28e")
public static String es_PE_FIELD_Commission_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="6a62b266-194d-8a78-af98-88e22c6cc28e")
public static String es_PE_FIELD_Commission_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a62b266-194d-8a78-af98-88e22c6cc28e")
public static final String FIELDNAME_Commission_Charge="6a62b266-194d-8a78-af98-88e22c6cc28e";

@XendraTrl(Identifier="3956fc07-6f7c-70bd-660b-88615daee04b")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3956fc07-6f7c-70bd-660b-88615daee04b",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Commission.
@param C_Commission_ID Commission */
public void setC_Commission_ID (int C_Commission_ID)
{
if (C_Commission_ID < 1) throw new IllegalArgumentException ("C_Commission_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Commission_ID, Integer.valueOf(C_Commission_ID));
}
/** Get Commission.
@return Commission */
public int getC_Commission_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Commission_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1332e86c-f01f-ac4a-3187-86595b3c80ec")
public static String es_PE_FIELD_Commission_Commission_Name="Comisión";

@XendraTrl(Identifier="1332e86c-f01f-ac4a-3187-86595b3c80ec")
public static String es_PE_FIELD_Commission_Commission_Description="Identificador de comisiones";

@XendraTrl(Identifier="1332e86c-f01f-ac4a-3187-86595b3c80ec")
public static String es_PE_FIELD_Commission_Commission_Help="La ID de Comisiones es un identificador único de un conjunto de reglas de comisiones";

@XendraField(AD_Column_ID="C_Commission_ID",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1332e86c-f01f-ac4a-3187-86595b3c80ec")
public static final String FIELDNAME_Commission_Commission="1332e86c-f01f-ac4a-3187-86595b3c80ec";
/** Column name C_Commission_ID */
public static final String COLUMNNAME_C_Commission_ID = "C_Commission_ID";
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

@XendraTrl(Identifier="9d6d46ed-f0d6-c7a0-127c-b58faabb1fb0")
public static String es_PE_FIELD_Commission_Currency_Name="Moneda";

@XendraTrl(Identifier="9d6d46ed-f0d6-c7a0-127c-b58faabb1fb0")
public static String es_PE_FIELD_Commission_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9d6d46ed-f0d6-c7a0-127c-b58faabb1fb0")
public static String es_PE_FIELD_Commission_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d6d46ed-f0d6-c7a0-127c-b58faabb1fb0")
public static final String FIELDNAME_Commission_Currency="9d6d46ed-f0d6-c7a0-127c-b58faabb1fb0";

@XendraTrl(Identifier="fa82707d-f20e-b461-d262-8d9a66ee1588")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa82707d-f20e-b461-d262-8d9a66ee1588",
Synchronized="2019-08-30 22:21:22.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Create lines from.
@param CreateFrom Process which will generate a new document lines based on an existing document */
public void setCreateFrom (String CreateFrom)
{
if (CreateFrom != null && CreateFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateFrom = CreateFrom.substring(0,0);
}
set_Value (COLUMNNAME_CreateFrom, CreateFrom);
}
/** Get Create lines from.
@return Process which will generate a new document lines based on an existing document */
public String getCreateFrom() 
{
return (String)get_Value(COLUMNNAME_CreateFrom);
}

@XendraTrl(Identifier="a9a5b022-2ebb-f26d-39fb-11e2511232cf")
public static String es_PE_FIELD_Commission_CopyLines_Name="Copiar De";

@XendraTrl(Identifier="a9a5b022-2ebb-f26d-39fb-11e2511232cf")
public static String es_PE_FIELD_Commission_CopyLines_Description="Copiar líneas desde comisión existente";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9a5b022-2ebb-f26d-39fb-11e2511232cf")
public static final String FIELDNAME_Commission_CopyLines="a9a5b022-2ebb-f26d-39fb-11e2511232cf";

@XendraTrl(Identifier="173d22fb-4061-d7ec-4a1a-88a38d64369e")
public static String es_PE_COLUMN_CreateFrom_Name="Crear Desde";

@XendraColumn(AD_Element_ID="7fccccce-83dd-9c79-faa2-d4675bdb0e1c",ColumnName="CreateFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="197629c5-71d9-a9a7-6c08-fe00ae14cb90",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="173d22fb-4061-d7ec-4a1a-88a38d64369e",Synchronized="2019-08-30 22:21:22.0")
/** Column name CreateFrom */
public static final String COLUMNNAME_CreateFrom = "CreateFrom";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_ValueNoCheck (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="d831fa1a-8125-7021-68a4-890bc38e94c6")
public static String es_PE_FIELD_Commission_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="d831fa1a-8125-7021-68a4-890bc38e94c6")
public static String es_PE_FIELD_Commission_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="d831fa1a-8125-7021-68a4-890bc38e94c6")
public static String es_PE_FIELD_Commission_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d831fa1a-8125-7021-68a4-890bc38e94c6")
public static final String FIELDNAME_Commission_DateLastRun="d831fa1a-8125-7021-68a4-890bc38e94c6";

@XendraTrl(Identifier="685b485d-6717-b5bf-e99a-fa3bdb24daf2")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="685b485d-6717-b5bf-e99a-fa3bdb24daf2",
Synchronized="2019-08-30 22:21:22.0")
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

@XendraTrl(Identifier="03b38a29-d929-88de-5466-0a27d3afccac")
public static String es_PE_FIELD_Commission_Description_Name="Observación";

@XendraTrl(Identifier="03b38a29-d929-88de-5466-0a27d3afccac")
public static String es_PE_FIELD_Commission_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="03b38a29-d929-88de-5466-0a27d3afccac")
public static String es_PE_FIELD_Commission_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03b38a29-d929-88de-5466-0a27d3afccac")
public static final String FIELDNAME_Commission_Description="03b38a29-d929-88de-5466-0a27d3afccac";

@XendraTrl(Identifier="351be7f9-bc94-4c87-eb44-4f7e54723702")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="351be7f9-bc94-4c87-eb44-4f7e54723702",
Synchronized="2019-08-30 22:21:22.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Calculation Basis.
@param DocBasisType Basis for the calculation the commission */
public void setDocBasisType (String DocBasisType)
{
if (DocBasisType.length() > 1)
{
log.warning("Length > 1 - truncated");
DocBasisType = DocBasisType.substring(0,0);
}
set_Value (COLUMNNAME_DocBasisType, DocBasisType);
}
/** Get Calculation Basis.
@return Basis for the calculation the commission */
public String getDocBasisType() 
{
return (String)get_Value(COLUMNNAME_DocBasisType);
}

@XendraTrl(Identifier="d304bb61-6ab6-4e23-c377-3f3aec157017")
public static String es_PE_FIELD_Commission_CalculationBasis_Name="Base del Cálculo";

@XendraTrl(Identifier="d304bb61-6ab6-4e23-c377-3f3aec157017")
public static String es_PE_FIELD_Commission_CalculationBasis_Description="Base para el cálculo de comisiones";

@XendraTrl(Identifier="d304bb61-6ab6-4e23-c377-3f3aec157017")
public static String es_PE_FIELD_Commission_CalculationBasis_Help="La Base del Cálculo indica la base a ser usada para el cálculo de comisiones";

@XendraField(AD_Column_ID="DocBasisType",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d304bb61-6ab6-4e23-c377-3f3aec157017")
public static final String FIELDNAME_Commission_CalculationBasis="d304bb61-6ab6-4e23-c377-3f3aec157017";

@XendraTrl(Identifier="b21e6eee-6470-278a-fbaa-1eb2ccdd0f05")
public static String es_PE_COLUMN_DocBasisType_Name="Base del Cálculo";

@XendraColumn(AD_Element_ID="40d5cb7b-af45-6476-42f6-0418beddcb44",ColumnName="DocBasisType",
AD_Reference_ID=17,AD_Reference_Value_ID="bd1d44f5-4066-c631-959b-1a0ef88e308b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b21e6eee-6470-278a-fbaa-1eb2ccdd0f05",Synchronized="2019-08-30 22:21:22.0")
/** Column name DocBasisType */
public static final String COLUMNNAME_DocBasisType = "DocBasisType";
/** Set Frequency Type.
@param FrequencyType Frequency of event */
public void setFrequencyType (String FrequencyType)
{
if (FrequencyType.length() > 1)
{
log.warning("Length > 1 - truncated");
FrequencyType = FrequencyType.substring(0,0);
}
set_Value (COLUMNNAME_FrequencyType, FrequencyType);
}
/** Get Frequency Type.
@return Frequency of event */
public String getFrequencyType() 
{
return (String)get_Value(COLUMNNAME_FrequencyType);
}

@XendraTrl(Identifier="af80d20f-e94c-f12d-c56f-3b167064bc37")
public static String es_PE_FIELD_Commission_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="af80d20f-e94c-f12d-c56f-3b167064bc37")
public static String es_PE_FIELD_Commission_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="af80d20f-e94c-f12d-c56f-3b167064bc37")
public static String es_PE_FIELD_Commission_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af80d20f-e94c-f12d-c56f-3b167064bc37")
public static final String FIELDNAME_Commission_FrequencyType="af80d20f-e94c-f12d-c56f-3b167064bc37";

@XendraTrl(Identifier="f74db147-14de-6c87-9301-0d6cbfa07fed")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="1a41086c-5720-12e9-66cf-af748bb125fa",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="M",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f74db147-14de-6c87-9301-0d6cbfa07fed",Synchronized="2019-08-30 22:21:22.0")
/** Column name FrequencyType */
public static final String COLUMNNAME_FrequencyType = "FrequencyType";
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
@XendraTrl(Identifier="5d25fbf6-2591-43e5-9427-bb0e242f3af0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d25fbf6-2591-43e5-9427-bb0e242f3af0",
Synchronized="2019-08-30 22:21:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set List Details.
@param ListDetails List document details */
public void setListDetails (boolean ListDetails)
{
set_Value (COLUMNNAME_ListDetails, Boolean.valueOf(ListDetails));
}
/** Get List Details.
@return List document details */
public boolean isListDetails() 
{
Object oo = get_Value(COLUMNNAME_ListDetails);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7d3e59df-d797-2b9b-154a-c6650dc1dbfd")
public static String es_PE_FIELD_Commission_ListDetails_Name="Lista detalle";

@XendraTrl(Identifier="7d3e59df-d797-2b9b-154a-c6650dc1dbfd")
public static String es_PE_FIELD_Commission_ListDetails_Description="Lista detalle de documentos";

@XendraTrl(Identifier="7d3e59df-d797-2b9b-154a-c6650dc1dbfd")
public static String es_PE_FIELD_Commission_ListDetails_Help="El cuadro de verificación detalles de lista indica que se desplegarán los detalles de lista para cada línea del documento.";

@XendraField(AD_Column_ID="ListDetails",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d3e59df-d797-2b9b-154a-c6650dc1dbfd")
public static final String FIELDNAME_Commission_ListDetails="7d3e59df-d797-2b9b-154a-c6650dc1dbfd";

@XendraTrl(Identifier="c192a3b5-b6dd-6c19-5cf4-8fcdec99e5ea")
public static String es_PE_COLUMN_ListDetails_Name="Lista detalle";

@XendraColumn(AD_Element_ID="4c7d0c09-faf1-9067-55b5-289eee39632b",ColumnName="ListDetails",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c192a3b5-b6dd-6c19-5cf4-8fcdec99e5ea",
Synchronized="2019-08-30 22:21:23.0")
/** Column name ListDetails */
public static final String COLUMNNAME_ListDetails = "ListDetails";
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

@XendraTrl(Identifier="3183dd2a-74b3-cd5f-4182-31eeb4a2905b")
public static String es_PE_FIELD_Commission_Name_Name="Nombre";

@XendraTrl(Identifier="3183dd2a-74b3-cd5f-4182-31eeb4a2905b")
public static String es_PE_FIELD_Commission_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3183dd2a-74b3-cd5f-4182-31eeb4a2905b")
public static String es_PE_FIELD_Commission_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3183dd2a-74b3-cd5f-4182-31eeb4a2905b")
public static final String FIELDNAME_Commission_Name="3183dd2a-74b3-cd5f-4182-31eeb4a2905b";

@XendraTrl(Identifier="f93173f5-a5fd-3960-7189-4173bf91e189")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f93173f5-a5fd-3960-7189-4173bf91e189",
Synchronized="2019-08-30 22:21:23.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="dddba213-0ef6-14c6-f303-a71556d0f637")
public static String es_PE_FIELD_Commission_ProcessNow_Name="Generar Comisión";

@XendraTrl(Identifier="dddba213-0ef6-14c6-f303-a71556d0f637")
public static String es_PE_FIELD_Commission_ProcessNow_Description="Generar comisión";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="84d6e8fd-caaf-909e-cbaa-c6dc128cf8ff",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dddba213-0ef6-14c6-f303-a71556d0f637")
public static final String FIELDNAME_Commission_ProcessNow="dddba213-0ef6-14c6-f303-a71556d0f637";

@XendraTrl(Identifier="8eb38025-2420-5d8b-68a5-509de827c127")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="263d4b22-d25e-13c9-a5d9-8112505f374c",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8eb38025-2420-5d8b-68a5-509de827c127",Synchronized="2019-08-30 22:21:23.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
