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
/** Generated Model for M_ChangeRequest
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ChangeRequest extends PO
{
/** Standard Constructor
@param ctx context
@param M_ChangeRequest_ID id
@param trxName transaction
*/
public X_M_ChangeRequest (Properties ctx, int M_ChangeRequest_ID, String trxName)
{
super (ctx, M_ChangeRequest_ID, trxName);
/** if (M_ChangeRequest_ID == 0)
{
setDocumentNo (null);
setIsApproved (false);	
// N
setM_ChangeRequest_ID (0);
setName (null);
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
public X_M_ChangeRequest (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=800 */
public static int Table_ID=MTable.getTable_ID("M_ChangeRequest");

@XendraTrl(Identifier="e449bd0a-5756-6212-31e6-ceb913a02268")
public static String es_PE_TAB_ChangeRequest_Description="Cambie la Solicitud del Aviso del Cambio";

@XendraTrl(Identifier="e449bd0a-5756-6212-31e6-ceb913a02268")
public static String es_PE_TAB_ChangeRequest_Name="Cambio a la Solicitud";

@XendraTab(Name="Change Request",Description="Change Request of Change Notice",Help="",
AD_Window_ID="8a10e84b-05cb-5640-2377-dbc3e3e24069",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="f4dc2401-57d7-7da8-a81c-33b9927f0839",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="e449bd0a-5756-6212-31e6-ceb913a02268",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ChangeRequest="e449bd0a-5756-6212-31e6-ceb913a02268";

@XendraTrl(Identifier="8432b576-81b6-0807-a7c1-9e9a31e68552")
public static String es_PE_TAB_FixedChangeRequests_Description="Solicitudes de cambio Fijadas";

@XendraTrl(Identifier="8432b576-81b6-0807-a7c1-9e9a31e68552")
public static String es_PE_TAB_FixedChangeRequests_Name="Solicitudes de cambio Fijadas";

@XendraTab(Name="Fixed Change Requests",Description="Fixed Change Request of this Change Notice",
Help="",AD_Window_ID="64b6deef-ba6e-76a9-8b1f-78e36f73c8f1",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="d5224f79-dafa-b241-30ab-55af65b54ca3",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="8432b576-81b6-0807-a7c1-9e9a31e68552",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FixedChangeRequests="8432b576-81b6-0807-a7c1-9e9a31e68552";

@XendraTrl(Identifier="9382adaf-8c3a-796c-7caf-070efa1d485c")
public static String es_PE_TAB_BOMChangeRequest_Description="LDM (Ingenieria) Cambio de Solicitud";

@XendraTrl(Identifier="9382adaf-8c3a-796c-7caf-070efa1d485c")
public static String es_PE_TAB_BOMChangeRequest_Help="Cambio de Solicitud para la LDM. Pueden ser creados automáticamente las solicitudes, si están permitidos en el tipo de la petición y el grupo de la petición a una cuenta de materiales.";

@XendraTrl(Identifier="9382adaf-8c3a-796c-7caf-070efa1d485c")
public static String es_PE_TAB_BOMChangeRequest_Name="Cambio a la Solicitud LDM";

@XendraTab(Name="BOM Change Request",Description="BOM (Engineering) Change Requests",
Help="Change requests for a Bill of Materials. They can be automatically created from Requests, if enabled in the Request Type and the Request Group referres to a Bill of Materials",
AD_Window_ID="64b6deef-ba6e-76a9-8b1f-78e36f73c8f1",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="b10405fa-7e9f-0d1f-51e2-24ddbaca4dcb",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9382adaf-8c3a-796c-7caf-070efa1d485c",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BOMChangeRequest="9382adaf-8c3a-796c-7caf-070efa1d485c";

@XendraTrl(Identifier="d72b9c86-e70e-1c65-b4c4-19737ea392a3")
public static String es_PE_TAB_FixedChangeRequests2_Description="Solicitud Fija del Cambio de este Aviso de Cambio.";

@XendraTrl(Identifier="d72b9c86-e70e-1c65-b4c4-19737ea392a3")
public static String es_PE_TAB_FixedChangeRequests2_Name="Cambios Corregidos a la Solicitud";

@XendraTab(Name="Fixed Change Requests",Description="Fixed Change Requests of this Change Notice",
Help="",AD_Window_ID="8a10e84b-05cb-5640-2377-dbc3e3e24069",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="d5224f79-dafa-b241-30ab-55af65b54ca3",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d72b9c86-e70e-1c65-b4c4-19737ea392a3",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FixedChangeRequests2="d72b9c86-e70e-1c65-b4c4-19737ea392a3";

@XendraTrl(Identifier="4aa3506a-f4ef-0731-ff6c-d8c52caa003c")
public static String es_PE_TABLE_M_ChangeRequest_Name="Cambio de Solicitud";

@XendraTable(Name="Change Request",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_ChangeRequest",AccessLevel="3",AD_Window_ID="64b6deef-ba6e-76a9-8b1f-78e36f73c8f1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="4aa3506a-f4ef-0731-ff6c-d8c52caa003c",Synchronized="2020-03-03 21:38:18.0")
/** TableName=M_ChangeRequest */
public static final String Table_Name="M_ChangeRequest";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ChangeRequest");

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
    Table_ID = MTable.getTable_ID("M_ChangeRequest");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ChangeRequest[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="7406e067-597c-1074-bb74-d1b8313b99b6")
public static String es_PE_FIELD_BOMChangeRequest_Description_Name="Observación";

@XendraTrl(Identifier="7406e067-597c-1074-bb74-d1b8313b99b6")
public static String es_PE_FIELD_BOMChangeRequest_Description_Description="Observación";

@XendraTrl(Identifier="7406e067-597c-1074-bb74-d1b8313b99b6")
public static String es_PE_FIELD_BOMChangeRequest_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7406e067-597c-1074-bb74-d1b8313b99b6")
public static final String FIELDNAME_BOMChangeRequest_Description="7406e067-597c-1074-bb74-d1b8313b99b6";

@XendraTrl(Identifier="1052aff8-aa40-5967-0a73-34554eefd26e")
public static String es_PE_FIELD_FixedChangeRequests_Description_Name="Observación";

@XendraTrl(Identifier="1052aff8-aa40-5967-0a73-34554eefd26e")
public static String es_PE_FIELD_FixedChangeRequests_Description_Description="Observación";

@XendraTrl(Identifier="1052aff8-aa40-5967-0a73-34554eefd26e")
public static String es_PE_FIELD_FixedChangeRequests_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1052aff8-aa40-5967-0a73-34554eefd26e")
public static final String FIELDNAME_FixedChangeRequests_Description="1052aff8-aa40-5967-0a73-34554eefd26e";

@XendraTrl(Identifier="1e4b7a83-0723-c3ed-d457-02d36b1f99f8")
public static String es_PE_FIELD_ChangeRequest_Description_Name="Observación";

@XendraTrl(Identifier="1e4b7a83-0723-c3ed-d457-02d36b1f99f8")
public static String es_PE_FIELD_ChangeRequest_Description_Description="Observación";

@XendraTrl(Identifier="1e4b7a83-0723-c3ed-d457-02d36b1f99f8")
public static String es_PE_FIELD_ChangeRequest_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e4b7a83-0723-c3ed-d457-02d36b1f99f8")
public static final String FIELDNAME_ChangeRequest_Description="1e4b7a83-0723-c3ed-d457-02d36b1f99f8";

@XendraTrl(Identifier="20d23d44-fbe5-76d5-0ba0-1ef8845d5e9a")
public static String es_PE_FIELD_FixedChangeRequests_Description2_Name="Observación";

@XendraTrl(Identifier="20d23d44-fbe5-76d5-0ba0-1ef8845d5e9a")
public static String es_PE_FIELD_FixedChangeRequests_Description2_Description="Observación";

@XendraTrl(Identifier="20d23d44-fbe5-76d5-0ba0-1ef8845d5e9a")
public static String es_PE_FIELD_FixedChangeRequests_Description2_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20d23d44-fbe5-76d5-0ba0-1ef8845d5e9a")
public static final String FIELDNAME_FixedChangeRequests_Description2="20d23d44-fbe5-76d5-0ba0-1ef8845d5e9a";

@XendraTrl(Identifier="63d3abed-2e30-0d2d-7e3c-7db096d754be")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63d3abed-2e30-0d2d-7e3c-7db096d754be",
Synchronized="2019-08-30 22:22:59.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Detail Information.
@param DetailInfo Additional Detail Information */
public void setDetailInfo (String DetailInfo)
{
set_Value (COLUMNNAME_DetailInfo, DetailInfo);
}
/** Get Detail Information.
@return Additional Detail Information */
public String getDetailInfo() 
{
String value = (String)get_Value(COLUMNNAME_DetailInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c51c8cd3-e185-a524-fdea-d25e4f1135c7")
public static String es_PE_FIELD_BOMChangeRequest_DetailInformation_Name="Imprimir Detalle de Transacciones";

@XendraField(AD_Column_ID="DetailInfo",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c51c8cd3-e185-a524-fdea-d25e4f1135c7")
public static final String FIELDNAME_BOMChangeRequest_DetailInformation="c51c8cd3-e185-a524-fdea-d25e4f1135c7";

@XendraTrl(Identifier="9c666107-1de5-4e99-17d2-5583b16d1ecb")
public static String es_PE_FIELD_FixedChangeRequests_DetailInformation_Name="Imprimir Detalle de Transacciones";

@XendraField(AD_Column_ID="DetailInfo",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c666107-1de5-4e99-17d2-5583b16d1ecb")
public static final String FIELDNAME_FixedChangeRequests_DetailInformation="9c666107-1de5-4e99-17d2-5583b16d1ecb";

@XendraTrl(Identifier="012e2c9b-223a-ce30-8d1e-5fb36badf04c")
public static String es_PE_FIELD_ChangeRequest_DetailInformation_Name="Imprimir Detalle de Transacciones";

@XendraField(AD_Column_ID="DetailInfo",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="012e2c9b-223a-ce30-8d1e-5fb36badf04c")
public static final String FIELDNAME_ChangeRequest_DetailInformation="012e2c9b-223a-ce30-8d1e-5fb36badf04c";

@XendraTrl(Identifier="e1e067b6-52e1-b68a-2e8e-64dae04197a4")
public static String es_PE_FIELD_FixedChangeRequests_DetailInformation2_Name="Imprimir Detalle de Transacciones";

@XendraField(AD_Column_ID="DetailInfo",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1e067b6-52e1-b68a-2e8e-64dae04197a4")
public static final String FIELDNAME_FixedChangeRequests_DetailInformation2="e1e067b6-52e1-b68a-2e8e-64dae04197a4";

@XendraTrl(Identifier="c4485f75-5302-6ad6-4372-9bf65a931ecb")
public static String es_PE_COLUMN_DetailInfo_Name="Imprimir Detalle de Transacciones";

@XendraColumn(AD_Element_ID="7e3059bd-f5bc-4828-6462-c2d9d165f019",ColumnName="DetailInfo",
AD_Reference_ID=36,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=0,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4485f75-5302-6ad6-4372-9bf65a931ecb",
Synchronized="2019-08-30 22:22:59.0")
/** Column name DetailInfo */
public static final String COLUMNNAME_DetailInfo = "DetailInfo";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="29183e2e-a288-a9ce-efd0-3a1600256ef6")
public static String es_PE_FIELD_BOMChangeRequest_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="29183e2e-a288-a9ce-efd0-3a1600256ef6")
public static String es_PE_FIELD_BOMChangeRequest_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="29183e2e-a288-a9ce-efd0-3a1600256ef6")
public static String es_PE_FIELD_BOMChangeRequest_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29183e2e-a288-a9ce-efd0-3a1600256ef6")
public static final String FIELDNAME_BOMChangeRequest_DocumentNo="29183e2e-a288-a9ce-efd0-3a1600256ef6";

@XendraTrl(Identifier="f553a3b0-bf75-bb0a-6731-32238af5ec9c")
public static String es_PE_FIELD_FixedChangeRequests_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="f553a3b0-bf75-bb0a-6731-32238af5ec9c")
public static String es_PE_FIELD_FixedChangeRequests_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="f553a3b0-bf75-bb0a-6731-32238af5ec9c")
public static String es_PE_FIELD_FixedChangeRequests_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f553a3b0-bf75-bb0a-6731-32238af5ec9c")
public static final String FIELDNAME_FixedChangeRequests_DocumentNo="f553a3b0-bf75-bb0a-6731-32238af5ec9c";

@XendraTrl(Identifier="663e3ea2-0987-3603-d97f-9d0128f79dd1")
public static String es_PE_FIELD_ChangeRequest_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="663e3ea2-0987-3603-d97f-9d0128f79dd1")
public static String es_PE_FIELD_ChangeRequest_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="663e3ea2-0987-3603-d97f-9d0128f79dd1")
public static String es_PE_FIELD_ChangeRequest_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="663e3ea2-0987-3603-d97f-9d0128f79dd1")
public static final String FIELDNAME_ChangeRequest_DocumentNo="663e3ea2-0987-3603-d97f-9d0128f79dd1";

@XendraTrl(Identifier="312321c9-7d56-f360-395d-47d615d16cd2")
public static String es_PE_FIELD_FixedChangeRequests_DocumentNo2_Name="No. del Documento";

@XendraTrl(Identifier="312321c9-7d56-f360-395d-47d615d16cd2")
public static String es_PE_FIELD_FixedChangeRequests_DocumentNo2_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="312321c9-7d56-f360-395d-47d615d16cd2")
public static String es_PE_FIELD_FixedChangeRequests_DocumentNo2_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="312321c9-7d56-f360-395d-47d615d16cd2")
public static final String FIELDNAME_FixedChangeRequests_DocumentNo2="312321c9-7d56-f360-395d-47d615d16cd2";

@XendraTrl(Identifier="b50db050-d001-427c-1dce-2dd2bbecec80")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b50db050-d001-427c-1dce-2dd2bbecec80",
Synchronized="2019-08-30 22:22:59.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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

@XendraTrl(Identifier="7c1c7aa7-5658-6307-59e9-0edc26c2d510")
public static String es_PE_FIELD_BOMChangeRequest_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="7c1c7aa7-5658-6307-59e9-0edc26c2d510")
public static String es_PE_FIELD_BOMChangeRequest_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="7c1c7aa7-5658-6307-59e9-0edc26c2d510")
public static String es_PE_FIELD_BOMChangeRequest_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c1c7aa7-5658-6307-59e9-0edc26c2d510")
public static final String FIELDNAME_BOMChangeRequest_CommentHelp="7c1c7aa7-5658-6307-59e9-0edc26c2d510";

@XendraTrl(Identifier="e60904da-7fb7-1913-2ad6-f8313f67b646")
public static String es_PE_FIELD_FixedChangeRequests_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="e60904da-7fb7-1913-2ad6-f8313f67b646")
public static String es_PE_FIELD_FixedChangeRequests_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="e60904da-7fb7-1913-2ad6-f8313f67b646")
public static String es_PE_FIELD_FixedChangeRequests_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e60904da-7fb7-1913-2ad6-f8313f67b646")
public static final String FIELDNAME_FixedChangeRequests_CommentHelp="e60904da-7fb7-1913-2ad6-f8313f67b646";

@XendraTrl(Identifier="eff3230a-133b-bff1-c12f-8bf076ce597f")
public static String es_PE_FIELD_ChangeRequest_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="eff3230a-133b-bff1-c12f-8bf076ce597f")
public static String es_PE_FIELD_ChangeRequest_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="eff3230a-133b-bff1-c12f-8bf076ce597f")
public static String es_PE_FIELD_ChangeRequest_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eff3230a-133b-bff1-c12f-8bf076ce597f")
public static final String FIELDNAME_ChangeRequest_CommentHelp="eff3230a-133b-bff1-c12f-8bf076ce597f";

@XendraTrl(Identifier="85c8e2ba-eacd-2f95-476e-8d850140e496")
public static String es_PE_FIELD_FixedChangeRequests_CommentHelp2_Name="Ayuda";

@XendraTrl(Identifier="85c8e2ba-eacd-2f95-476e-8d850140e496")
public static String es_PE_FIELD_FixedChangeRequests_CommentHelp2_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="85c8e2ba-eacd-2f95-476e-8d850140e496")
public static String es_PE_FIELD_FixedChangeRequests_CommentHelp2_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85c8e2ba-eacd-2f95-476e-8d850140e496")
public static final String FIELDNAME_FixedChangeRequests_CommentHelp2="85c8e2ba-eacd-2f95-476e-8d850140e496";

@XendraTrl(Identifier="d2ed3a50-acd4-d316-96f0-b5c4efa936c9")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2ed3a50-acd4-d316-96f0-b5c4efa936c9",
Synchronized="2019-08-30 22:22:59.0")
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
@XendraTrl(Identifier="86ea1753-b738-4723-b188-ca88027077aa")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86ea1753-b738-4723-b188-ca88027077aa",
Synchronized="2019-08-30 22:23:00.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="614f288b-2c3d-f3e5-a7f4-cb57c901063f")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="614f288b-2c3d-f3e5-a7f4-cb57c901063f",
Synchronized="2019-08-30 22:23:00.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set BOM.
@param M_BOM_ID Bill of Material */
public void setM_BOM_ID (int M_BOM_ID)
{
if (M_BOM_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_BOM_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_BOM_ID, Integer.valueOf(M_BOM_ID));
}
/** Get BOM.
@return Bill of Material */
public int getM_BOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="221e4f14-9ac7-a94c-69e4-feb5efd652de")
public static String es_PE_FIELD_BOMChangeRequest_BOM_Name="LDM";

@XendraTrl(Identifier="221e4f14-9ac7-a94c-69e4-feb5efd652de")
public static String es_PE_FIELD_BOMChangeRequest_BOM_Description="Lista de materiales";

@XendraTrl(Identifier="221e4f14-9ac7-a94c-69e4-feb5efd652de")
public static String es_PE_FIELD_BOMChangeRequest_BOM_Help="La composición de el producto.";

@XendraField(AD_Column_ID="M_BOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="221e4f14-9ac7-a94c-69e4-feb5efd652de")
public static final String FIELDNAME_BOMChangeRequest_BOM="221e4f14-9ac7-a94c-69e4-feb5efd652de";

@XendraTrl(Identifier="ec6685ae-9d80-8dc4-8843-959a9a0733a7")
public static String es_PE_FIELD_FixedChangeRequests_BOM_Name="LDM";

@XendraTrl(Identifier="ec6685ae-9d80-8dc4-8843-959a9a0733a7")
public static String es_PE_FIELD_FixedChangeRequests_BOM_Description="Lista de materiales";

@XendraTrl(Identifier="ec6685ae-9d80-8dc4-8843-959a9a0733a7")
public static String es_PE_FIELD_FixedChangeRequests_BOM_Help="La composición de el producto.";

@XendraField(AD_Column_ID="M_BOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec6685ae-9d80-8dc4-8843-959a9a0733a7")
public static final String FIELDNAME_FixedChangeRequests_BOM="ec6685ae-9d80-8dc4-8843-959a9a0733a7";

@XendraTrl(Identifier="d6cc4755-ae48-5e47-365c-7386adf222e5")
public static String es_PE_FIELD_ChangeRequest_BOM_Name="LDM";

@XendraTrl(Identifier="d6cc4755-ae48-5e47-365c-7386adf222e5")
public static String es_PE_FIELD_ChangeRequest_BOM_Description="Lista de materiales";

@XendraTrl(Identifier="d6cc4755-ae48-5e47-365c-7386adf222e5")
public static String es_PE_FIELD_ChangeRequest_BOM_Help="La composición de el producto.";

@XendraField(AD_Column_ID="M_BOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6cc4755-ae48-5e47-365c-7386adf222e5")
public static final String FIELDNAME_ChangeRequest_BOM="d6cc4755-ae48-5e47-365c-7386adf222e5";

@XendraTrl(Identifier="ff9a0827-a7a9-716a-1107-f941a1eb6479")
public static String es_PE_FIELD_FixedChangeRequests_BOM2_Name="LDM";

@XendraTrl(Identifier="ff9a0827-a7a9-716a-1107-f941a1eb6479")
public static String es_PE_FIELD_FixedChangeRequests_BOM2_Description="Lista de materiales";

@XendraTrl(Identifier="ff9a0827-a7a9-716a-1107-f941a1eb6479")
public static String es_PE_FIELD_FixedChangeRequests_BOM2_Help="La composición de el producto.";

@XendraField(AD_Column_ID="M_BOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff9a0827-a7a9-716a-1107-f941a1eb6479")
public static final String FIELDNAME_FixedChangeRequests_BOM2="ff9a0827-a7a9-716a-1107-f941a1eb6479";

@XendraTrl(Identifier="b10405fa-7e9f-0d1f-51e2-24ddbaca4dcb")
public static String es_PE_COLUMN_M_BOM_ID_Name="LDM";

@XendraColumn(AD_Element_ID="f74f158f-a1ce-2b65-149d-8ef9be21d27e",ColumnName="M_BOM_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b10405fa-7e9f-0d1f-51e2-24ddbaca4dcb",
Synchronized="2019-08-30 22:23:00.0")
/** Column name M_BOM_ID */
public static final String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
/** Set Change Notice.
@param M_ChangeNotice_ID Bill of Materials (Engineering) Change Notice (Version) */
public void setM_ChangeNotice_ID (int M_ChangeNotice_ID)
{
if (M_ChangeNotice_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_ChangeNotice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_ChangeNotice_ID, Integer.valueOf(M_ChangeNotice_ID));
}
/** Get Change Notice.
@return Bill of Materials (Engineering) Change Notice (Version) */
public int getM_ChangeNotice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ChangeNotice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4d080e44-5c75-d7ad-4ed7-8a41f88738c9")
public static String es_PE_FIELD_BOMChangeRequest_ChangeNotice_Name="Aviso de Cambio";

@XendraTrl(Identifier="4d080e44-5c75-d7ad-4ed7-8a41f88738c9")
public static String es_PE_FIELD_BOMChangeRequest_ChangeNotice_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d080e44-5c75-d7ad-4ed7-8a41f88738c9")
public static final String FIELDNAME_BOMChangeRequest_ChangeNotice="4d080e44-5c75-d7ad-4ed7-8a41f88738c9";

@XendraTrl(Identifier="c7eb7f61-7fbc-01ab-dea5-3edb106f082a")
public static String es_PE_FIELD_FixedChangeRequests_ChangeNotice_Name="Aviso de Cambio";

@XendraTrl(Identifier="c7eb7f61-7fbc-01ab-dea5-3edb106f082a")
public static String es_PE_FIELD_FixedChangeRequests_ChangeNotice_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7eb7f61-7fbc-01ab-dea5-3edb106f082a")
public static final String FIELDNAME_FixedChangeRequests_ChangeNotice="c7eb7f61-7fbc-01ab-dea5-3edb106f082a";

@XendraTrl(Identifier="7892b2e7-16d1-e862-c29a-887ed1df71b0")
public static String es_PE_FIELD_ChangeRequest_ChangeNotice_Name="Aviso de Cambio";

@XendraTrl(Identifier="7892b2e7-16d1-e862-c29a-887ed1df71b0")
public static String es_PE_FIELD_ChangeRequest_ChangeNotice_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7892b2e7-16d1-e862-c29a-887ed1df71b0")
public static final String FIELDNAME_ChangeRequest_ChangeNotice="7892b2e7-16d1-e862-c29a-887ed1df71b0";

@XendraTrl(Identifier="7a35dcc5-a2dc-0b8d-3a59-62b853111a82")
public static String es_PE_FIELD_FixedChangeRequests_ChangeNotice2_Name="Aviso de Cambio";

@XendraTrl(Identifier="7a35dcc5-a2dc-0b8d-3a59-62b853111a82")
public static String es_PE_FIELD_FixedChangeRequests_ChangeNotice2_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a35dcc5-a2dc-0b8d-3a59-62b853111a82")
public static final String FIELDNAME_FixedChangeRequests_ChangeNotice2="7a35dcc5-a2dc-0b8d-3a59-62b853111a82";

@XendraTrl(Identifier="f4dc2401-57d7-7da8-a81c-33b9927f0839")
public static String es_PE_COLUMN_M_ChangeNotice_ID_Name="Aviso de Cambio";

@XendraColumn(AD_Element_ID="9ef80c4a-fc78-9760-2916-157f9f8d80b3",ColumnName="M_ChangeNotice_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4dc2401-57d7-7da8-a81c-33b9927f0839",
Synchronized="2019-08-30 22:23:00.0")
/** Column name M_ChangeNotice_ID */
public static final String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
/** Set Change Request.
@param M_ChangeRequest_ID BOM (Engineering) Change Request */
public void setM_ChangeRequest_ID (int M_ChangeRequest_ID)
{
if (M_ChangeRequest_ID < 1) throw new IllegalArgumentException ("M_ChangeRequest_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ChangeRequest_ID, Integer.valueOf(M_ChangeRequest_ID));
}
/** Get Change Request.
@return BOM (Engineering) Change Request */
public int getM_ChangeRequest_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ChangeRequest_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c7c438e3-5429-2e2f-dbb3-b777efe31b00")
public static String es_PE_FIELD_BOMChangeRequest_ChangeRequest_Name="Cambio de Solicitud";

@XendraTrl(Identifier="c7c438e3-5429-2e2f-dbb3-b777efe31b00")
public static String es_PE_FIELD_BOMChangeRequest_ChangeRequest_Description="LDM (ingenieria) Cambio de solicitud";

@XendraTrl(Identifier="c7c438e3-5429-2e2f-dbb3-b777efe31b00")
public static String es_PE_FIELD_BOMChangeRequest_ChangeRequest_Help="Cambio de solicitud para una lista de materiales. Pueden ser creadas automáticamente las peticiones, en si está permitido el tipo de la petición y los referres del grupo de la petición a una cuenta de materiales";

@XendraField(AD_Column_ID="M_ChangeRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7c438e3-5429-2e2f-dbb3-b777efe31b00")
public static final String FIELDNAME_BOMChangeRequest_ChangeRequest="c7c438e3-5429-2e2f-dbb3-b777efe31b00";

@XendraTrl(Identifier="b20b6df1-d177-53b9-fe97-0139808a785b")
public static String es_PE_FIELD_FixedChangeRequests_ChangeRequest_Name="Cambio de Solicitud";

@XendraTrl(Identifier="b20b6df1-d177-53b9-fe97-0139808a785b")
public static String es_PE_FIELD_FixedChangeRequests_ChangeRequest_Description="LDM (ingenieria) Cambio de solicitud";

@XendraTrl(Identifier="b20b6df1-d177-53b9-fe97-0139808a785b")
public static String es_PE_FIELD_FixedChangeRequests_ChangeRequest_Help="Cambio de solicitud para una lista de materiales. Pueden ser creadas automáticamente las peticiones, en si está permitido el tipo de la petición y los referres del grupo de la petición a una cuenta de materiales";

@XendraField(AD_Column_ID="M_ChangeRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b20b6df1-d177-53b9-fe97-0139808a785b")
public static final String FIELDNAME_FixedChangeRequests_ChangeRequest="b20b6df1-d177-53b9-fe97-0139808a785b";

@XendraTrl(Identifier="80142674-3e91-e539-6220-7768f8bacae3")
public static String es_PE_FIELD_ChangeRequest_ChangeRequest_Name="Cambio de Solicitud";

@XendraTrl(Identifier="80142674-3e91-e539-6220-7768f8bacae3")
public static String es_PE_FIELD_ChangeRequest_ChangeRequest_Description="LDM (ingenieria) Cambio de solicitud";

@XendraTrl(Identifier="80142674-3e91-e539-6220-7768f8bacae3")
public static String es_PE_FIELD_ChangeRequest_ChangeRequest_Help="Cambio de solicitud para una lista de materiales. Pueden ser creadas automáticamente las peticiones, en si está permitido el tipo de la petición y los referres del grupo de la petición a una cuenta de materiales";

@XendraField(AD_Column_ID="M_ChangeRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80142674-3e91-e539-6220-7768f8bacae3")
public static final String FIELDNAME_ChangeRequest_ChangeRequest="80142674-3e91-e539-6220-7768f8bacae3";

@XendraTrl(Identifier="d9f191d7-d33d-1015-a363-56c4e22cf07e")
public static String es_PE_FIELD_FixedChangeRequests_ChangeRequest2_Name="Cambio de Solicitud";

@XendraTrl(Identifier="d9f191d7-d33d-1015-a363-56c4e22cf07e")
public static String es_PE_FIELD_FixedChangeRequests_ChangeRequest2_Description="LDM (ingenieria) Cambio de solicitud";

@XendraTrl(Identifier="d9f191d7-d33d-1015-a363-56c4e22cf07e")
public static String es_PE_FIELD_FixedChangeRequests_ChangeRequest2_Help="Cambio de solicitud para una lista de materiales. Pueden ser creadas automáticamente las peticiones, en si está permitido el tipo de la petición y los referres del grupo de la petición a una cuenta de materiales";

@XendraField(AD_Column_ID="M_ChangeRequest_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9f191d7-d33d-1015-a363-56c4e22cf07e")
public static final String FIELDNAME_FixedChangeRequests_ChangeRequest2="d9f191d7-d33d-1015-a363-56c4e22cf07e";
/** Column name M_ChangeRequest_ID */
public static final String COLUMNNAME_M_ChangeRequest_ID = "M_ChangeRequest_ID";
/** Set Fixed in.
@param M_FixChangeNotice_ID Fixed in Change Notice */
public void setM_FixChangeNotice_ID (int M_FixChangeNotice_ID)
{
if (M_FixChangeNotice_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_FixChangeNotice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_FixChangeNotice_ID, Integer.valueOf(M_FixChangeNotice_ID));
}
/** Get Fixed in.
@return Fixed in Change Notice */
public int getM_FixChangeNotice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_FixChangeNotice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f9f33cd9-686c-ecd0-3ec7-56abe99efb34")
public static String es_PE_FIELD_BOMChangeRequest_FixedIn_Name="Corregido en";

@XendraTrl(Identifier="f9f33cd9-686c-ecd0-3ec7-56abe99efb34")
public static String es_PE_FIELD_BOMChangeRequest_FixedIn_Description="Corregido en aviso del cambio";

@XendraField(AD_Column_ID="M_FixChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9f33cd9-686c-ecd0-3ec7-56abe99efb34")
public static final String FIELDNAME_BOMChangeRequest_FixedIn="f9f33cd9-686c-ecd0-3ec7-56abe99efb34";

@XendraTrl(Identifier="6b635239-7de0-b7fe-0924-c0a2dbe4297c")
public static String es_PE_FIELD_FixedChangeRequests_FixedIn_Name="Corregido en";

@XendraTrl(Identifier="6b635239-7de0-b7fe-0924-c0a2dbe4297c")
public static String es_PE_FIELD_FixedChangeRequests_FixedIn_Description="Corregido en aviso del cambio";

@XendraField(AD_Column_ID="M_FixChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b635239-7de0-b7fe-0924-c0a2dbe4297c")
public static final String FIELDNAME_FixedChangeRequests_FixedIn="6b635239-7de0-b7fe-0924-c0a2dbe4297c";

@XendraTrl(Identifier="780eac5c-6b66-7d5d-87bf-ffdb8004d0ea")
public static String es_PE_FIELD_ChangeRequest_FixedIn_Name="Corregido en";

@XendraTrl(Identifier="780eac5c-6b66-7d5d-87bf-ffdb8004d0ea")
public static String es_PE_FIELD_ChangeRequest_FixedIn_Description="Corregido en aviso del cambio";

@XendraField(AD_Column_ID="M_FixChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="780eac5c-6b66-7d5d-87bf-ffdb8004d0ea")
public static final String FIELDNAME_ChangeRequest_FixedIn="780eac5c-6b66-7d5d-87bf-ffdb8004d0ea";

@XendraTrl(Identifier="cd73075f-d021-f0c3-6122-375e1750bb69")
public static String es_PE_FIELD_FixedChangeRequests_FixedIn2_Name="Corregido en";

@XendraTrl(Identifier="cd73075f-d021-f0c3-6122-375e1750bb69")
public static String es_PE_FIELD_FixedChangeRequests_FixedIn2_Description="Corregido en aviso del cambio";

@XendraField(AD_Column_ID="M_FixChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd73075f-d021-f0c3-6122-375e1750bb69")
public static final String FIELDNAME_FixedChangeRequests_FixedIn2="cd73075f-d021-f0c3-6122-375e1750bb69";

@XendraTrl(Identifier="d5224f79-dafa-b241-30ab-55af65b54ca3")
public static String es_PE_COLUMN_M_FixChangeNotice_ID_Name="Corregido en";

@XendraColumn(AD_Element_ID="79c683fa-b126-7371-0143-7aa8e7e6bcff",
ColumnName="M_FixChangeNotice_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="71c8e798-e72b-e0db-0a1a-3dc12b8f0b92",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="d5224f79-dafa-b241-30ab-55af65b54ca3",
Synchronized="2019-08-30 22:23:00.0")
/** Column name M_FixChangeNotice_ID */
public static final String COLUMNNAME_M_FixChangeNotice_ID = "M_FixChangeNotice_ID";
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
@XendraTrl(Identifier="f7dce111-30ab-2c34-d29f-21ecec87ce07")
public static String es_PE_FIELD_BOMChangeRequest_Name_Name="Nombre";

@XendraTrl(Identifier="f7dce111-30ab-2c34-d29f-21ecec87ce07")
public static String es_PE_FIELD_BOMChangeRequest_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f7dce111-30ab-2c34-d29f-21ecec87ce07")
public static String es_PE_FIELD_BOMChangeRequest_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="9382adaf-8c3a-796c-7caf-070efa1d485c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7dce111-30ab-2c34-d29f-21ecec87ce07")
public static final String FIELDNAME_BOMChangeRequest_Name="f7dce111-30ab-2c34-d29f-21ecec87ce07";

@XendraTrl(Identifier="9c8fc0f2-a65c-1b53-9b71-56352a69c39e")
public static String es_PE_FIELD_FixedChangeRequests_Name_Name="Nombre";

@XendraTrl(Identifier="9c8fc0f2-a65c-1b53-9b71-56352a69c39e")
public static String es_PE_FIELD_FixedChangeRequests_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9c8fc0f2-a65c-1b53-9b71-56352a69c39e")
public static String es_PE_FIELD_FixedChangeRequests_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8432b576-81b6-0807-a7c1-9e9a31e68552",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c8fc0f2-a65c-1b53-9b71-56352a69c39e")
public static final String FIELDNAME_FixedChangeRequests_Name="9c8fc0f2-a65c-1b53-9b71-56352a69c39e";

@XendraTrl(Identifier="58cbf0c8-e407-6cef-59ef-2d4b8993bba2")
public static String es_PE_FIELD_ChangeRequest_Name_Name="Nombre";

@XendraTrl(Identifier="58cbf0c8-e407-6cef-59ef-2d4b8993bba2")
public static String es_PE_FIELD_ChangeRequest_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="58cbf0c8-e407-6cef-59ef-2d4b8993bba2")
public static String es_PE_FIELD_ChangeRequest_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e449bd0a-5756-6212-31e6-ceb913a02268",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58cbf0c8-e407-6cef-59ef-2d4b8993bba2")
public static final String FIELDNAME_ChangeRequest_Name="58cbf0c8-e407-6cef-59ef-2d4b8993bba2";

@XendraTrl(Identifier="35576528-8f87-035b-780e-4e462657ad90")
public static String es_PE_FIELD_FixedChangeRequests_Name2_Name="Nombre";

@XendraTrl(Identifier="35576528-8f87-035b-780e-4e462657ad90")
public static String es_PE_FIELD_FixedChangeRequests_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="35576528-8f87-035b-780e-4e462657ad90")
public static String es_PE_FIELD_FixedChangeRequests_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="d72b9c86-e70e-1c65-b4c4-19737ea392a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35576528-8f87-035b-780e-4e462657ad90")
public static final String FIELDNAME_FixedChangeRequests_Name2="35576528-8f87-035b-780e-4e462657ad90";

@XendraTrl(Identifier="8277b69f-dae4-8e59-ae4d-acfc17aad217")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8277b69f-dae4-8e59-ae4d-acfc17aad217",
Synchronized="2019-08-30 22:23:00.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="544045b8-55ac-83fb-8d08-21bf9fc8e997")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="544045b8-55ac-83fb-8d08-21bf9fc8e997",
Synchronized="2019-08-30 22:23:00.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
}
