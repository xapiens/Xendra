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
/** Generated Model for R_RequestType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestType extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestType_ID id
@param trxName transaction
*/
public X_R_RequestType (Properties ctx, int R_RequestType_ID, String trxName)
{
super (ctx, R_RequestType_ID, trxName);
/** if (R_RequestType_ID == 0)
{
setConfidentialType (null);	
// C
setDueDateTolerance (0);	
// 7
setIsAutoChangeRequest (false);	
// N
setIsConfidentialInfo (false);	
// N
setIsDefault (false);	
// N
setIsEMailWhenDue (false);	
// N
setIsEMailWhenOverdue (false);	
// N
setIsIndexed (false);	
// N
setIsSelfService (true);	
// Y
setName (null);
setR_RequestType_ID (0);
setR_StatusCategory_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=529 */
public static int Table_ID=MTable.getTable_ID("R_RequestType");

@XendraTrl(Identifier="a2c5b6bd-16fe-90a9-556b-25338db69c2f")
public static String es_PE_TAB_RequestType_Description="Tipo de Solicitud (Consulta; queja; ...)";

@XendraTrl(Identifier="a2c5b6bd-16fe-90a9-556b-25338db69c2f")
public static String es_PE_TAB_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar las solicitudes. Las opciones son Consulta de Cuenta; Garantía; etc.";

@XendraTrl(Identifier="a2c5b6bd-16fe-90a9-556b-25338db69c2f")
public static String es_PE_TAB_RequestType_Name="Tipo de Solicitud";
@XendraTab(Name="Request Type",
Description="Type of request (e.g. Inquiry, Complaint, ..)",
Help="Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.",
AD_Window_ID="4082c323-4544-c91e-56c4-ed205b54b762",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a2c5b6bd-16fe-90a9-556b-25338db69c2f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestType="a2c5b6bd-16fe-90a9-556b-25338db69c2f";

@XendraTrl(Identifier="095f0440-30a7-879e-2128-9d5707263498")
public static String es_PE_TABLE_R_RequestType_Name="Tipo de Solicitud";

@XendraTable(Name="Request Type",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Type of request (e.g. Inquiry, Complaint, ..)",Help="",TableName="R_RequestType",
AccessLevel="6",AD_Window_ID="4082c323-4544-c91e-56c4-ed205b54b762",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="095f0440-30a7-879e-2128-9d5707263498",Synchronized="2020-03-03 21:39:41.0")
/** TableName=R_RequestType */
public static final String Table_Name="R_RequestType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestType");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("R_RequestType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Auto Due Date Days.
@param AutoDueDateDays Automatic Due Date Days */
public void setAutoDueDateDays (int AutoDueDateDays)
{
set_Value (COLUMNNAME_AutoDueDateDays, Integer.valueOf(AutoDueDateDays));
}
/** Get Auto Due Date Days.
@return Automatic Due Date Days */
public int getAutoDueDateDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AutoDueDateDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="83db52f8-6e11-f68f-c5f1-b8a52a5b9edf")
public static String es_PE_FIELD_RequestType_AutoDueDateDays_Name="Auto Fecha Vencimiento Días";

@XendraTrl(Identifier="83db52f8-6e11-f68f-c5f1-b8a52a5b9edf")
public static String es_PE_FIELD_RequestType_AutoDueDateDays_Description="Automaticamente Fecha Vencimiento Días";

@XendraTrl(Identifier="83db52f8-6e11-f68f-c5f1-b8a52a5b9edf")
public static String es_PE_FIELD_RequestType_AutoDueDateDays_Help="Si una Fecha de Vencimiento no se define y el campo de Auto, días de vencimiento es mayor que 0, una fecha de vencimiento, en numero de días es autmaticamente creada.";

@XendraField(AD_Column_ID="AutoDueDateDays",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83db52f8-6e11-f68f-c5f1-b8a52a5b9edf")
public static final String FIELDNAME_RequestType_AutoDueDateDays="83db52f8-6e11-f68f-c5f1-b8a52a5b9edf";

@XendraTrl(Identifier="16fb71b5-1520-08ef-e320-a4ce7f8126c2")
public static String es_PE_COLUMN_AutoDueDateDays_Name="Auto Fecha Vencimiento Días";

@XendraColumn(AD_Element_ID="72c3fcac-2a51-e91a-3b96-37a180eaa046",ColumnName="AutoDueDateDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16fb71b5-1520-08ef-e320-a4ce7f8126c2",
Synchronized="2019-08-30 22:23:50.0")
/** Column name AutoDueDateDays */
public static final String COLUMNNAME_AutoDueDateDays = "AutoDueDateDays";
/** Set Confidentiality.
@param ConfidentialType Type of Confidentiality */
public void setConfidentialType (String ConfidentialType)
{
if (ConfidentialType.length() > 1)
{
log.warning("Length > 1 - truncated");
ConfidentialType = ConfidentialType.substring(0,0);
}
set_Value (COLUMNNAME_ConfidentialType, ConfidentialType);
}
/** Get Confidentiality.
@return Type of Confidentiality */
public String getConfidentialType() 
{
return (String)get_Value(COLUMNNAME_ConfidentialType);
}

@XendraTrl(Identifier="3ef12198-9a18-4cbf-aaf7-c0d46c3f6fd9")
public static String es_PE_FIELD_RequestType_Confidentiality_Name="Confidencialidad";

@XendraTrl(Identifier="3ef12198-9a18-4cbf-aaf7-c0d46c3f6fd9")
public static String es_PE_FIELD_RequestType_Confidentiality_Description="Tipo de Confidencialidad";

@XendraField(AD_Column_ID="ConfidentialType",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ef12198-9a18-4cbf-aaf7-c0d46c3f6fd9")
public static final String FIELDNAME_RequestType_Confidentiality="3ef12198-9a18-4cbf-aaf7-c0d46c3f6fd9";

@XendraTrl(Identifier="9e77552c-5373-165c-2f16-47e5e76911b0")
public static String es_PE_COLUMN_ConfidentialType_Name="Confidencialidad";

@XendraColumn(AD_Element_ID="24d269bf-542a-eb9e-b244-feea486dfc6b",ColumnName="ConfidentialType",
AD_Reference_ID=17,AD_Reference_Value_ID="af038e49-9eea-4e1c-da39-e6d987a12111",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9e77552c-5373-165c-2f16-47e5e76911b0",Synchronized="2019-08-30 22:23:50.0")
/** Column name ConfidentialType */
public static final String COLUMNNAME_ConfidentialType = "ConfidentialType";
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

@XendraTrl(Identifier="88242bc0-bc97-510d-bb25-5b444f02665f")
public static String es_PE_FIELD_RequestType_Description_Name="Observación";

@XendraTrl(Identifier="88242bc0-bc97-510d-bb25-5b444f02665f")
public static String es_PE_FIELD_RequestType_Description_Description="Observación";

@XendraTrl(Identifier="88242bc0-bc97-510d-bb25-5b444f02665f")
public static String es_PE_FIELD_RequestType_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88242bc0-bc97-510d-bb25-5b444f02665f")
public static final String FIELDNAME_RequestType_Description="88242bc0-bc97-510d-bb25-5b444f02665f";

@XendraTrl(Identifier="9adb0ce7-780f-d103-36fd-68dfb1a6a4b1")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9adb0ce7-780f-d103-36fd-68dfb1a6a4b1",
Synchronized="2019-08-30 22:23:50.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Due Date Tolerance.
@param DueDateTolerance Tolerance in days between the Date Next Action and the date the request is regarded as overdue */
public void setDueDateTolerance (int DueDateTolerance)
{
set_Value (COLUMNNAME_DueDateTolerance, Integer.valueOf(DueDateTolerance));
}
/** Get Due Date Tolerance.
@return Tolerance in days between the Date Next Action and the date the request is regarded as overdue */
public int getDueDateTolerance() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DueDateTolerance);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e134bfd-969b-c9ed-2f07-30a21f711b56")
public static String es_PE_FIELD_RequestType_DueDateTolerance_Name="Tolerancia a la Fecha de Vencimiento";

@XendraTrl(Identifier="2e134bfd-969b-c9ed-2f07-30a21f711b56")
public static String es_PE_FIELD_RequestType_DueDateTolerance_Help="Cuando se pasa la acción siguiente de la fecha, La solicitud llega a ser debida. Después de la tolerancia de la fecha debida, la petición llega a ser atrasada.";

@XendraField(AD_Column_ID="DueDateTolerance",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e134bfd-969b-c9ed-2f07-30a21f711b56")
public static final String FIELDNAME_RequestType_DueDateTolerance="2e134bfd-969b-c9ed-2f07-30a21f711b56";

@XendraTrl(Identifier="9e12d524-7fa5-599b-ee86-5ea01030d478")
public static String es_PE_COLUMN_DueDateTolerance_Name="Tolerancia a la Fecha de Vencimiento";

@XendraColumn(AD_Element_ID="89e848bf-be17-8932-2e45-2ee18853c001",ColumnName="DueDateTolerance",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="7",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e12d524-7fa5-599b-ee86-5ea01030d478",
Synchronized="2019-08-30 22:23:50.0")
/** Column name DueDateTolerance */
public static final String COLUMNNAME_DueDateTolerance = "DueDateTolerance";
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
@XendraTrl(Identifier="bcb501e5-a921-4bc9-bf98-488616623f68")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcb501e5-a921-4bc9-bf98-488616623f68",
Synchronized="2019-08-30 22:23:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Create Change Request.
@param IsAutoChangeRequest Automatically create BOM (Engineering) Change Request */
public void setIsAutoChangeRequest (boolean IsAutoChangeRequest)
{
set_Value (COLUMNNAME_IsAutoChangeRequest, Boolean.valueOf(IsAutoChangeRequest));
}
/** Get Create Change Request.
@return Automatically create BOM (Engineering) Change Request */
public boolean isAutoChangeRequest() 
{
Object oo = get_Value(COLUMNNAME_IsAutoChangeRequest);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="766b5c11-bfb0-40b2-b166-cb85c5daf847")
public static String es_PE_FIELD_RequestType_CreateChangeRequest_Name="Crea Cambios de Solicitud";

@XendraTrl(Identifier="766b5c11-bfb0-40b2-b166-cb85c5daf847")
public static String es_PE_FIELD_RequestType_CreateChangeRequest_Description="Cree automáticamente la petición del cambio de LDM (ingeniería)";

@XendraTrl(Identifier="766b5c11-bfb0-40b2-b166-cb85c5daf847")
public static String es_PE_FIELD_RequestType_CreateChangeRequest_Help="Cree automaticamente un producto a cuenta de material (Ingenieria). Cambie la solicitud cuando el grupo de la solicitud se refiere a un producto LDM.";

@XendraField(AD_Column_ID="IsAutoChangeRequest",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="766b5c11-bfb0-40b2-b166-cb85c5daf847")
public static final String FIELDNAME_RequestType_CreateChangeRequest="766b5c11-bfb0-40b2-b166-cb85c5daf847";

@XendraTrl(Identifier="02cbedaa-571b-1270-8837-8a4481d54408")
public static String es_PE_COLUMN_IsAutoChangeRequest_Name="Crea Cambios de Solicitud";

@XendraColumn(AD_Element_ID="4e6af06f-a898-b6eb-cc62-e3b6595c98f7",
ColumnName="IsAutoChangeRequest",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="02cbedaa-571b-1270-8837-8a4481d54408",Synchronized="2019-08-30 22:23:50.0")
/** Column name IsAutoChangeRequest */
public static final String COLUMNNAME_IsAutoChangeRequest = "IsAutoChangeRequest";
/** Set Confidential Info.
@param IsConfidentialInfo Can enter confidential information */
public void setIsConfidentialInfo (boolean IsConfidentialInfo)
{
set_Value (COLUMNNAME_IsConfidentialInfo, Boolean.valueOf(IsConfidentialInfo));
}
/** Get Confidential Info.
@return Can enter confidential information */
public boolean isConfidentialInfo() 
{
Object oo = get_Value(COLUMNNAME_IsConfidentialInfo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b07ddf2e-10ed-822d-6f79-c9d625d4b0b2")
public static String es_PE_FIELD_RequestType_ConfidentialInfo_Name="Info Confidencial";

@XendraTrl(Identifier="b07ddf2e-10ed-822d-6f79-c9d625d4b0b2")
public static String es_PE_FIELD_RequestType_ConfidentialInfo_Description="Puede dar entrada a informacióm confidencial.";

@XendraTrl(Identifier="b07ddf2e-10ed-822d-6f79-c9d625d4b0b2")
public static String es_PE_FIELD_RequestType_ConfidentialInfo_Help="Cuando las peticiones entran/puesta al día sobre la Web, el usuario pueden marcar su Información como confidencial.";

@XendraField(AD_Column_ID="IsConfidentialInfo",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b07ddf2e-10ed-822d-6f79-c9d625d4b0b2")
public static final String FIELDNAME_RequestType_ConfidentialInfo="b07ddf2e-10ed-822d-6f79-c9d625d4b0b2";

@XendraTrl(Identifier="fa3c98e2-e04d-c0eb-cf72-5011239ac881")
public static String es_PE_COLUMN_IsConfidentialInfo_Name="Info Confidencial";

@XendraColumn(AD_Element_ID="928a5de1-a583-cf39-596c-aeb1e1d9aaca",ColumnName="IsConfidentialInfo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa3c98e2-e04d-c0eb-cf72-5011239ac881",
Synchronized="2019-08-30 22:23:50.0")
/** Column name IsConfidentialInfo */
public static final String COLUMNNAME_IsConfidentialInfo = "IsConfidentialInfo";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8b51d001-ca59-78b1-7c47-dfd857f412c4")
public static String es_PE_FIELD_RequestType_Default_Name="Predeterminado";

@XendraTrl(Identifier="8b51d001-ca59-78b1-7c47-dfd857f412c4")
public static String es_PE_FIELD_RequestType_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="8b51d001-ca59-78b1-7c47-dfd857f412c4")
public static String es_PE_FIELD_RequestType_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b51d001-ca59-78b1-7c47-dfd857f412c4")
public static final String FIELDNAME_RequestType_Default="8b51d001-ca59-78b1-7c47-dfd857f412c4";

@XendraTrl(Identifier="ac5630d2-ea02-74b0-9994-3519cf42359b")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac5630d2-ea02-74b0-9994-3519cf42359b",
Synchronized="2019-08-30 22:23:50.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set EMail when Due.
@param IsEMailWhenDue Send EMail when Request becomes due */
public void setIsEMailWhenDue (boolean IsEMailWhenDue)
{
set_Value (COLUMNNAME_IsEMailWhenDue, Boolean.valueOf(IsEMailWhenDue));
}
/** Get EMail when Due.
@return Send EMail when Request becomes due */
public boolean isEMailWhenDue() 
{
Object oo = get_Value(COLUMNNAME_IsEMailWhenDue);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4c5717f1-5021-ba31-e0dd-8989e9e95128")
public static String es_PE_FIELD_RequestType_EMailWhenDue_Name="Email Cuando esta Vencido";

@XendraTrl(Identifier="4c5717f1-5021-ba31-e0dd-8989e9e95128")
public static String es_PE_FIELD_RequestType_EMailWhenDue_Description="Envíe el email cuando la petición llega a ser debida";

@XendraTrl(Identifier="4c5717f1-5021-ba31-e0dd-8989e9e95128")
public static String es_PE_FIELD_RequestType_EMailWhenDue_Help="Envíe el email cuando la petición llega a ser debida";

@XendraField(AD_Column_ID="IsEMailWhenDue",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c5717f1-5021-ba31-e0dd-8989e9e95128")
public static final String FIELDNAME_RequestType_EMailWhenDue="4c5717f1-5021-ba31-e0dd-8989e9e95128";

@XendraTrl(Identifier="fa5911af-f583-ce2c-aea1-88faa2ed0fab")
public static String es_PE_COLUMN_IsEMailWhenDue_Name="Email Cuando esta Vencido";

@XendraColumn(AD_Element_ID="8e415dcf-3c54-9826-28fc-48d92d605a9f",ColumnName="IsEMailWhenDue",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa5911af-f583-ce2c-aea1-88faa2ed0fab",
Synchronized="2019-08-30 22:23:50.0")
/** Column name IsEMailWhenDue */
public static final String COLUMNNAME_IsEMailWhenDue = "IsEMailWhenDue";
/** Set EMail when Overdue.
@param IsEMailWhenOverdue Send EMail when Request becomes overdue */
public void setIsEMailWhenOverdue (boolean IsEMailWhenOverdue)
{
set_Value (COLUMNNAME_IsEMailWhenOverdue, Boolean.valueOf(IsEMailWhenOverdue));
}
/** Get EMail when Overdue.
@return Send EMail when Request becomes overdue */
public boolean isEMailWhenOverdue() 
{
Object oo = get_Value(COLUMNNAME_IsEMailWhenOverdue);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f95d88ea-bae4-75a9-355b-87102477246f")
public static String es_PE_FIELD_RequestType_EMailWhenOverdue_Name="Email Vencidos";

@XendraTrl(Identifier="f95d88ea-bae4-75a9-355b-87102477246f")
public static String es_PE_FIELD_RequestType_EMailWhenOverdue_Description="Envíe el email cuando la solicitud llega a ser atrasada";

@XendraTrl(Identifier="f95d88ea-bae4-75a9-355b-87102477246f")
public static String es_PE_FIELD_RequestType_EMailWhenOverdue_Help="Envíe el email cuando la solicitud llega a ser atrasada";

@XendraField(AD_Column_ID="IsEMailWhenOverdue",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f95d88ea-bae4-75a9-355b-87102477246f")
public static final String FIELDNAME_RequestType_EMailWhenOverdue="f95d88ea-bae4-75a9-355b-87102477246f";

@XendraTrl(Identifier="9c1dc377-5e4a-84a0-2e51-d6711e890b5c")
public static String es_PE_COLUMN_IsEMailWhenOverdue_Name="Email Vencidos";

@XendraColumn(AD_Element_ID="780f6b67-32a2-0b35-12d1-54813a195b9c",ColumnName="IsEMailWhenOverdue",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c1dc377-5e4a-84a0-2e51-d6711e890b5c",
Synchronized="2019-08-30 22:23:50.0")
/** Column name IsEMailWhenOverdue */
public static final String COLUMNNAME_IsEMailWhenOverdue = "IsEMailWhenOverdue";
/** Set Indexed.
@param IsIndexed Index the document for the internal search engine */
public void setIsIndexed (boolean IsIndexed)
{
set_Value (COLUMNNAME_IsIndexed, Boolean.valueOf(IsIndexed));
}
/** Get Indexed.
@return Index the document for the internal search engine */
public boolean isIndexed() 
{
Object oo = get_Value(COLUMNNAME_IsIndexed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9f3e022c-5073-eb1c-00f8-29458abbe2a7")
public static String es_PE_COLUMN_IsIndexed_Name="Indexed";

@XendraColumn(AD_Element_ID="d1590244-3414-257f-0fd2-4766ac5da7e7",ColumnName="IsIndexed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f3e022c-5073-eb1c-00f8-29458abbe2a7",
Synchronized="2019-08-30 22:23:50.0")
/** Column name IsIndexed */
public static final String COLUMNNAME_IsIndexed = "IsIndexed";
/** Set Invoiced.
@param IsInvoiced Is this invoiced? */
public void setIsInvoiced (boolean IsInvoiced)
{
set_Value (COLUMNNAME_IsInvoiced, Boolean.valueOf(IsInvoiced));
}
/** Get Invoiced.
@return Is this invoiced? */
public boolean isInvoiced() 
{
Object oo = get_Value(COLUMNNAME_IsInvoiced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="282a800c-4839-3eb6-3842-5a5bf05ab577")
public static String es_PE_FIELD_RequestType_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="282a800c-4839-3eb6-3842-5a5bf05ab577")
public static final String FIELDNAME_RequestType_Invoiced="282a800c-4839-3eb6-3842-5a5bf05ab577";

@XendraTrl(Identifier="eb7fe7fc-5682-c40d-51ed-aa1df1160121")
public static String es_PE_COLUMN_IsInvoiced_Name="Facturado";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb7fe7fc-5682-c40d-51ed-aa1df1160121",
Synchronized="2019-08-30 22:23:50.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1c55faf5-26c2-6e19-fbd0-4048cea36b1f")
public static String es_PE_FIELD_RequestType_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="1c55faf5-26c2-6e19-fbd0-4048cea36b1f")
public static String es_PE_FIELD_RequestType_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="1c55faf5-26c2-6e19-fbd0-4048cea36b1f")
public static String es_PE_FIELD_RequestType_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c55faf5-26c2-6e19-fbd0-4048cea36b1f")
public static final String FIELDNAME_RequestType_Self_Service="1c55faf5-26c2-6e19-fbd0-4048cea36b1f";

@XendraTrl(Identifier="7838b99f-5b5c-1f70-7c5f-e7a3ea7a2767")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7838b99f-5b5c-1f70-7c5f-e7a3ea7a2767",
Synchronized="2019-08-30 22:23:50.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
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

@XendraTrl(Identifier="fbd25ada-26f1-dd56-c766-2c541d5ef28a")
public static String es_PE_FIELD_RequestType_Name_Name="Nombre";

@XendraTrl(Identifier="fbd25ada-26f1-dd56-c766-2c541d5ef28a")
public static String es_PE_FIELD_RequestType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="fbd25ada-26f1-dd56-c766-2c541d5ef28a")
public static String es_PE_FIELD_RequestType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbd25ada-26f1-dd56-c766-2c541d5ef28a")
public static final String FIELDNAME_RequestType_Name="fbd25ada-26f1-dd56-c766-2c541d5ef28a";

@XendraTrl(Identifier="56630cb5-7e79-20a7-f490-c6c055194fad")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56630cb5-7e79-20a7-f490-c6c055194fad",
Synchronized="2019-08-30 22:23:50.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID < 1) throw new IllegalArgumentException ("R_RequestType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
}
/** Get Request Type.
@return Type of request (e.g. Inquiry, Complaint, ..) */
public int getR_RequestType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e3de08d8-f972-627e-8d30-1427b414de24")
public static String es_PE_FIELD_RequestType_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="e3de08d8-f972-627e-8d30-1427b414de24")
public static String es_PE_FIELD_RequestType_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="e3de08d8-f972-627e-8d30-1427b414de24")
public static String es_PE_FIELD_RequestType_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e3de08d8-f972-627e-8d30-1427b414de24")
public static final String FIELDNAME_RequestType_RequestType="e3de08d8-f972-627e-8d30-1427b414de24";
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
/** Set Status Category.
@param R_StatusCategory_ID Request Status Category */
public void setR_StatusCategory_ID (int R_StatusCategory_ID)
{
if (R_StatusCategory_ID < 1) throw new IllegalArgumentException ("R_StatusCategory_ID is mandatory.");
set_Value (COLUMNNAME_R_StatusCategory_ID, Integer.valueOf(R_StatusCategory_ID));
}
/** Get Status Category.
@return Request Status Category */
public int getR_StatusCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_StatusCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="81697ebf-dbb7-abdf-a720-193eda04eaa3")
public static String es_PE_FIELD_RequestType_StatusCategory_Name="Categoría de Estado";

@XendraTrl(Identifier="81697ebf-dbb7-abdf-a720-193eda04eaa3")
public static String es_PE_FIELD_RequestType_StatusCategory_Description="Request Status Category";

@XendraTrl(Identifier="81697ebf-dbb7-abdf-a720-193eda04eaa3")
public static String es_PE_FIELD_RequestType_StatusCategory_Help="Category of Request Status enables to maintain different set of Status for different Request Categories";

@XendraField(AD_Column_ID="R_StatusCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a2c5b6bd-16fe-90a9-556b-25338db69c2f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81697ebf-dbb7-abdf-a720-193eda04eaa3")
public static final String FIELDNAME_RequestType_StatusCategory="81697ebf-dbb7-abdf-a720-193eda04eaa3";

@XendraTrl(Identifier="0e0d259c-4d3a-0cf9-aecd-ca5031b3cee1")
public static String es_PE_COLUMN_R_StatusCategory_ID_Name="Status Category";

@XendraColumn(AD_Element_ID="238d74b1-f9de-ab89-d971-f77cdda09e7b",
ColumnName="R_StatusCategory_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0e0d259c-4d3a-0cf9-aecd-ca5031b3cee1",Synchronized="2019-08-30 22:23:50.0")
/** Column name R_StatusCategory_ID */
public static final String COLUMNNAME_R_StatusCategory_ID = "R_StatusCategory_ID";
}
