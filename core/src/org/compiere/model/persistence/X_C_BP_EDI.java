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
import org.compiere.model.reference.REF_C_BP_EDIEDIType;
/** Generated Model for C_BP_EDI
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_EDI extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_EDI_ID id
@param trxName transaction
*/
public X_C_BP_EDI (Properties ctx, int C_BP_EDI_ID, String trxName)
{
super (ctx, C_BP_EDI_ID, trxName);
/** if (C_BP_EDI_ID == 0)
{
setAD_Sequence_ID (0);
setC_BPartner_ID (0);
setC_BP_EDI_ID (0);
setCustomerNo (null);
setEDIType (null);
setEMail_Error_To (null);
setEMail_Info_To (null);
setIsAudited (false);	
// N
setIsInfoSent (false);	
// N
setM_Warehouse_ID (0);
setName (null);
setReceiveInquiryReply (false);	
// N
setReceiveOrderReply (false);	
// N
setSendInquiry (false);	
// N
setSendOrder (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_EDI (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=366 */
public static int Table_ID=MTable.getTable_ID("C_BP_EDI");

@XendraTrl(Identifier="eb863798-c330-e2cb-828d-9518b9315df4")
public static String es_PE_TAB_EDIDefinition_Description="Mantener Definición de EDI";

@XendraTrl(Identifier="eb863798-c330-e2cb-828d-9518b9315df4")
public static String es_PE_TAB_EDIDefinition_Name="Definición de EDI";

@XendraTab(Name="EDI Definition",Description="Maintain EDI Definition",Help="",
AD_Window_ID="00fa953f-38f7-5544-2f31-8c0cc16f7725",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="eb863798-c330-e2cb-828d-9518b9315df4",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EDIDefinition="eb863798-c330-e2cb-828d-9518b9315df4";

@XendraTrl(Identifier="ec4bf812-cc3b-fbc2-0df3-f16e9d69c4df")
public static String es_PE_TABLE_C_BP_EDI_Name="Definición EDI";

@XendraTable(Name="EDI Definition",Description="Electronic Data Interchange",Help="",
TableName="C_BP_EDI",AccessLevel="3",AD_Window_ID="00fa953f-38f7-5544-2f31-8c0cc16f7725",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="ec4bf812-cc3b-fbc2-0df3-f16e9d69c4df",Synchronized="2017-08-16 11:41:33.0")
/** TableName=C_BP_EDI */
public static final String Table_Name="C_BP_EDI";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_EDI");

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
    Table_ID = MTable.getTable_ID("C_BP_EDI");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_EDI[").append(get_ID()).append("]");
return sb.toString();
}

/** AD_Sequence_ID AD_Reference=4aa462a2-7603-59ba-08c7-4982c43f3ad7 */
public static final int AD_SEQUENCE_ID_AD_Reference_ID=128;
/** Set Sequence.
@param AD_Sequence_ID Document Sequence */
public void setAD_Sequence_ID (int AD_Sequence_ID)
{
if (AD_Sequence_ID < 1) throw new IllegalArgumentException ("AD_Sequence_ID is mandatory.");
set_Value (COLUMNNAME_AD_Sequence_ID, Integer.valueOf(AD_Sequence_ID));
}
/** Get Sequence.
@return Document Sequence */
public int getAD_Sequence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Sequence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8a4dee88-397a-6530-75d7-ef1ab86846fb")
public static String es_PE_FIELD_EDIDefinition_Sequence_Description="Secuencia del documento";

@XendraTrl(Identifier="8a4dee88-397a-6530-75d7-ef1ab86846fb")
public static String es_PE_FIELD_EDIDefinition_Sequence_Help="La secuencia indica el número de secuencia a ser usado para los documentos";

@XendraTrl(Identifier="8a4dee88-397a-6530-75d7-ef1ab86846fb")
public static String es_PE_FIELD_EDIDefinition_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="AD_Sequence_ID",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a4dee88-397a-6530-75d7-ef1ab86846fb")
public static final String FIELDNAME_EDIDefinition_Sequence="8a4dee88-397a-6530-75d7-ef1ab86846fb";

@XendraTrl(Identifier="a72db36b-4945-d9a3-7636-f4d4426f4ead")
public static String es_PE_COLUMN_AD_Sequence_ID_Name="Secuencia";

@XendraColumn(AD_Element_ID="b4ecd1ce-eb14-87fa-8115-bb00f9f5d8b5",ColumnName="AD_Sequence_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="4aa462a2-7603-59ba-08c7-4982c43f3ad7",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a72db36b-4945-d9a3-7636-f4d4426f4ead",Synchronized="2017-08-05 16:53:24.0")
/** Column name AD_Sequence_ID */
public static final String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
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

@XendraTrl(Identifier="45bdb9f5-c36d-642b-cc05-ad7c5c9667fd")
public static String es_PE_FIELD_EDIDefinition_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="45bdb9f5-c36d-642b-cc05-ad7c5c9667fd")
public static String es_PE_FIELD_EDIDefinition_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="45bdb9f5-c36d-642b-cc05-ad7c5c9667fd")
public static String es_PE_FIELD_EDIDefinition_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45bdb9f5-c36d-642b-cc05-ad7c5c9667fd")
public static final String FIELDNAME_EDIDefinition_BusinessPartner="45bdb9f5-c36d-642b-cc05-ad7c5c9667fd";

@XendraTrl(Identifier="25fc7864-f471-4742-66d3-5ff83e7567bb")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25fc7864-f471-4742-66d3-5ff83e7567bb",
Synchronized="2017-08-05 16:53:24.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set EDI Definition.
@param C_BP_EDI_ID Electronic Data Interchange */
public void setC_BP_EDI_ID (int C_BP_EDI_ID)
{
if (C_BP_EDI_ID < 1) throw new IllegalArgumentException ("C_BP_EDI_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BP_EDI_ID, Integer.valueOf(C_BP_EDI_ID));
}
/** Get EDI Definition.
@return Electronic Data Interchange */
public int getC_BP_EDI_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_EDI_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="913529a2-d0c5-9e70-c9a4-528b0fbb84c8")
public static String es_PE_FIELD_EDIDefinition_EDIDefinition_Description="Intercambio Electrónico de Datos";

@XendraTrl(Identifier="913529a2-d0c5-9e70-c9a4-528b0fbb84c8")
public static String es_PE_FIELD_EDIDefinition_EDIDefinition_Name="Definición EDI";

@XendraField(AD_Column_ID="C_BP_EDI_ID",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="913529a2-d0c5-9e70-c9a4-528b0fbb84c8")
public static final String FIELDNAME_EDIDefinition_EDIDefinition="913529a2-d0c5-9e70-c9a4-528b0fbb84c8";
/** Column name C_BP_EDI_ID */
public static final String COLUMNNAME_C_BP_EDI_ID = "C_BP_EDI_ID";
/** Set Customer No.
@param CustomerNo EDI Identification Number  */
public void setCustomerNo (String CustomerNo)
{
if (CustomerNo == null) throw new IllegalArgumentException ("CustomerNo is mandatory.");
if (CustomerNo.length() > 20)
{
log.warning("Length > 20 - truncated");
CustomerNo = CustomerNo.substring(0,19);
}
set_Value (COLUMNNAME_CustomerNo, CustomerNo);
}
/** Get Customer No.
@return EDI Identification Number  */
public String getCustomerNo() 
{
String value = (String)get_Value(COLUMNNAME_CustomerNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c74f7020-3d2a-902c-18f8-bffb81ece4f3")
public static String es_PE_FIELD_EDIDefinition_CustomerNo_Description="Número de Identificación EDI";

@XendraTrl(Identifier="c74f7020-3d2a-902c-18f8-bffb81ece4f3")
public static String es_PE_FIELD_EDIDefinition_CustomerNo_Name="No. De Cliente EDI";

@XendraField(AD_Column_ID="CustomerNo",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c74f7020-3d2a-902c-18f8-bffb81ece4f3")
public static final String FIELDNAME_EDIDefinition_CustomerNo="c74f7020-3d2a-902c-18f8-bffb81ece4f3";

@XendraTrl(Identifier="fa15d6f3-b62c-30af-d754-59acf48b7d21")
public static String es_PE_COLUMN_CustomerNo_Name="No. De Cliente EDI";

@XendraColumn(AD_Element_ID="3e177220-22da-f225-594c-11f29e38898e",ColumnName="CustomerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa15d6f3-b62c-30af-d754-59acf48b7d21",
Synchronized="2017-08-05 16:53:24.0")
/** Column name CustomerNo */
public static final String COLUMNNAME_CustomerNo = "CustomerNo";
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

@XendraTrl(Identifier="1590b575-531b-d935-3eb7-36e49097dbc6")
public static String es_PE_FIELD_EDIDefinition_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="1590b575-531b-d935-3eb7-36e49097dbc6")
public static String es_PE_FIELD_EDIDefinition_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="1590b575-531b-d935-3eb7-36e49097dbc6")
public static String es_PE_FIELD_EDIDefinition_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1590b575-531b-d935-3eb7-36e49097dbc6")
public static final String FIELDNAME_EDIDefinition_Description="1590b575-531b-d935-3eb7-36e49097dbc6";

@XendraTrl(Identifier="661280ff-4613-12b9-9f7b-62e3892ae23b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="661280ff-4613-12b9-9f7b-62e3892ae23b",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** EDIType AD_Reference=d44c2c52-be7b-5b52-291b-20826071df5a */
public static final int EDITYPE_AD_Reference_ID=201;
/** Set EDI Type.
@param EDIType EDI Type */
public void setEDIType (String EDIType)
{
if (EDIType == null) throw new IllegalArgumentException ("EDIType is mandatory");
if (EDIType.equals(REF_C_BP_EDIEDIType.ASCX12) || EDIType.equals(REF_C_BP_EDIEDIType.EDIFACT) || EDIType.equals(REF_C_BP_EDIEDIType.EmailEDI));
 else throw new IllegalArgumentException ("EDIType Invalid value - " + EDIType + " - Reference_ID=201 - X - E - M");
if (EDIType.length() > 1)
{
log.warning("Length > 1 - truncated");
EDIType = EDIType.substring(0,0);
}
set_Value (COLUMNNAME_EDIType, EDIType);
}
/** Get EDI Type.
@return EDI Type */
public String getEDIType() 
{
return (String)get_Value(COLUMNNAME_EDIType);
}

@XendraTrl(Identifier="c17d30cb-6243-e888-61a2-87afdab223fa")
public static String es_PE_FIELD_EDIDefinition_EDIType_Name="Tipo EDI";

@XendraField(AD_Column_ID="EDIType",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c17d30cb-6243-e888-61a2-87afdab223fa")
public static final String FIELDNAME_EDIDefinition_EDIType="c17d30cb-6243-e888-61a2-87afdab223fa";

@XendraTrl(Identifier="bedf8336-e5ae-d7c5-79d8-19856568a8e2")
public static String es_PE_COLUMN_EDIType_Name="Tipo EDI";

@XendraColumn(AD_Element_ID="3f48fe33-48a9-de6d-87ae-ab95109b2bd7",ColumnName="EDIType",
AD_Reference_ID=17,AD_Reference_Value_ID="d44c2c52-be7b-5b52-291b-20826071df5a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bedf8336-e5ae-d7c5-79d8-19856568a8e2",Synchronized="2017-08-05 16:53:24.0")
/** Column name EDIType */
public static final String COLUMNNAME_EDIType = "EDIType";
/** Set Error EMail.
@param EMail_Error_To Email address to send error messages to */
public void setEMail_Error_To (String EMail_Error_To)
{
if (EMail_Error_To == null) throw new IllegalArgumentException ("EMail_Error_To is mandatory.");
if (EMail_Error_To.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail_Error_To = EMail_Error_To.substring(0,59);
}
set_Value (COLUMNNAME_EMail_Error_To, EMail_Error_To);
}
/** Get Error EMail.
@return Email address to send error messages to */
public String getEMail_Error_To() 
{
String value = (String)get_Value(COLUMNNAME_EMail_Error_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="804c6a66-a35a-522c-459f-3cc6f258ffb3")
public static String es_PE_FIELD_EDIDefinition_ErrorEMail_Description="Dirección de correo electrónico a la que se envían mensajes de error";

@XendraTrl(Identifier="804c6a66-a35a-522c-459f-3cc6f258ffb3")
public static String es_PE_FIELD_EDIDefinition_ErrorEMail_Name="Correo Electrónico para Mensaje de Error";

@XendraField(AD_Column_ID="EMail_Error_To",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="804c6a66-a35a-522c-459f-3cc6f258ffb3")
public static final String FIELDNAME_EDIDefinition_ErrorEMail="804c6a66-a35a-522c-459f-3cc6f258ffb3";

@XendraTrl(Identifier="b8cba08a-d26f-a11a-7d06-5264453c3026")
public static String es_PE_COLUMN_EMail_Error_To_Name="Correo Electrónico para Mensaje de Error";

@XendraColumn(AD_Element_ID="12901200-6593-7afd-4b28-203809ef5518",ColumnName="EMail_Error_To",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8cba08a-d26f-a11a-7d06-5264453c3026",
Synchronized="2017-08-05 16:53:24.0")
/** Column name EMail_Error_To */
public static final String COLUMNNAME_EMail_Error_To = "EMail_Error_To";
/** Set From EMail.
@param EMail_From Full EMail address used to send requests - e.g. edi@organization.com */
public void setEMail_From (String EMail_From)
{
if (EMail_From != null && EMail_From.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail_From = EMail_From.substring(0,59);
}
set_Value (COLUMNNAME_EMail_From, EMail_From);
}
/** Get From EMail.
@return Full EMail address used to send requests - e.g. edi@organization.com */
public String getEMail_From() 
{
String value = (String)get_Value(COLUMNNAME_EMail_From);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="decaa770-9580-588e-daad-4e351b83cd0f")
public static String es_PE_FIELD_EDIDefinition_FromEMail_Description="Dirección de correo electrónico usada para enviar requerimientos -Ej. edi@organization.com";

@XendraTrl(Identifier="decaa770-9580-588e-daad-4e351b83cd0f")
public static String es_PE_FIELD_EDIDefinition_FromEMail_Name="Correo Electrónico Desde";

@XendraField(AD_Column_ID="EMail_From",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="decaa770-9580-588e-daad-4e351b83cd0f")
public static final String FIELDNAME_EDIDefinition_FromEMail="decaa770-9580-588e-daad-4e351b83cd0f";

@XendraTrl(Identifier="1cbb7f75-154e-6778-f1a4-b84c3b7f2696")
public static String es_PE_COLUMN_EMail_From_Name="Correo Electrónico Desde";

@XendraColumn(AD_Element_ID="76eed9ae-4edc-5c86-f416-34a2c34a1fd4",ColumnName="EMail_From",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1cbb7f75-154e-6778-f1a4-b84c3b7f2696",
Synchronized="2017-08-05 16:53:25.0")
/** Column name EMail_From */
public static final String COLUMNNAME_EMail_From = "EMail_From";
/** Set From EMail Password.
@param EMail_From_Pwd Password of the sending EMail address */
public void setEMail_From_Pwd (String EMail_From_Pwd)
{
if (EMail_From_Pwd != null && EMail_From_Pwd.length() > 20)
{
log.warning("Length > 20 - truncated");
EMail_From_Pwd = EMail_From_Pwd.substring(0,19);
}
set_Value (COLUMNNAME_EMail_From_Pwd, EMail_From_Pwd);
}
/** Get From EMail Password.
@return Password of the sending EMail address */
public String getEMail_From_Pwd() 
{
String value = (String)get_Value(COLUMNNAME_EMail_From_Pwd);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="01423af8-6315-9de4-ca82-08fa4f95fbbf")
public static String es_PE_FIELD_EDIDefinition_FromEMailPassword_Description="Contraseña de la dirección de correo electrónico que envía";

@XendraTrl(Identifier="01423af8-6315-9de4-ca82-08fa4f95fbbf")
public static String es_PE_FIELD_EDIDefinition_FromEMailPassword_Name="Contraseña del Correo Electrónico  desde";

@XendraField(AD_Column_ID="EMail_From_Pwd",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01423af8-6315-9de4-ca82-08fa4f95fbbf")
public static final String FIELDNAME_EDIDefinition_FromEMailPassword="01423af8-6315-9de4-ca82-08fa4f95fbbf";

@XendraTrl(Identifier="c90013f9-4350-dcec-5db5-6fc874ce3941")
public static String es_PE_COLUMN_EMail_From_Pwd_Name="Contraseña del Correo Electrónico  desde";

@XendraColumn(AD_Element_ID="67feadc1-a334-8144-d17a-9369d30cfeff",ColumnName="EMail_From_Pwd",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c90013f9-4350-dcec-5db5-6fc874ce3941",
Synchronized="2017-08-05 16:53:25.0")
/** Column name EMail_From_Pwd */
public static final String COLUMNNAME_EMail_From_Pwd = "EMail_From_Pwd";
/** Set From EMail User ID.
@param EMail_From_Uid User ID of the sending EMail address (on default SMTP Host) - e.g. edi */
public void setEMail_From_Uid (String EMail_From_Uid)
{
if (EMail_From_Uid != null && EMail_From_Uid.length() > 20)
{
log.warning("Length > 20 - truncated");
EMail_From_Uid = EMail_From_Uid.substring(0,19);
}
set_Value (COLUMNNAME_EMail_From_Uid, EMail_From_Uid);
}
/** Get From EMail User ID.
@return User ID of the sending EMail address (on default SMTP Host) - e.g. edi */
public String getEMail_From_Uid() 
{
String value = (String)get_Value(COLUMNNAME_EMail_From_Uid);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9643df7b-35f8-4251-b7ed-2df28dab8e73")
public static String es_PE_FIELD_EDIDefinition_FromEMailUserID_Description="ID de usuario de la dirección que envía el correo electrónico (Servidor SMTP predeterminado)";

@XendraTrl(Identifier="9643df7b-35f8-4251-b7ed-2df28dab8e73")
public static String es_PE_FIELD_EDIDefinition_FromEMailUserID_Name="ID de Usuario del Correo Electrónico";

@XendraField(AD_Column_ID="EMail_From_Uid",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9643df7b-35f8-4251-b7ed-2df28dab8e73")
public static final String FIELDNAME_EDIDefinition_FromEMailUserID="9643df7b-35f8-4251-b7ed-2df28dab8e73";

@XendraTrl(Identifier="68cee6f7-267c-6b71-9865-a287b93ff166")
public static String es_PE_COLUMN_EMail_From_Uid_Name="ID de Usuario del Correo Electrónico";

@XendraColumn(AD_Element_ID="e48739ed-1fc3-dc42-dc20-1c2d522c5664",ColumnName="EMail_From_Uid",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68cee6f7-267c-6b71-9865-a287b93ff166",
Synchronized="2017-08-05 16:53:25.0")
/** Column name EMail_From_Uid */
public static final String COLUMNNAME_EMail_From_Uid = "EMail_From_Uid";
/** Set Info EMail.
@param EMail_Info_To EMail address to send informational messages and copies */
public void setEMail_Info_To (String EMail_Info_To)
{
if (EMail_Info_To == null) throw new IllegalArgumentException ("EMail_Info_To is mandatory.");
if (EMail_Info_To.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail_Info_To = EMail_Info_To.substring(0,59);
}
set_Value (COLUMNNAME_EMail_Info_To, EMail_Info_To);
}
/** Get Info EMail.
@return EMail address to send informational messages and copies */
public String getEMail_Info_To() 
{
String value = (String)get_Value(COLUMNNAME_EMail_Info_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="375c6f9b-9b5d-928e-a2fc-6b8d8fd9e743")
public static String es_PE_FIELD_EDIDefinition_InfoEMail_Description="Dirección de email para enviar solicitudes - por ejemplo edi@manufacturer.com";

@XendraTrl(Identifier="375c6f9b-9b5d-928e-a2fc-6b8d8fd9e743")
public static String es_PE_FIELD_EDIDefinition_InfoEMail_Help="La dirección de email de información indica la dirección a usar cuando se envían mensajes informativos ó copias de otros mensajes.";

@XendraTrl(Identifier="375c6f9b-9b5d-928e-a2fc-6b8d8fd9e743")
public static String es_PE_FIELD_EDIDefinition_InfoEMail_Name="Email de Información";

@XendraField(AD_Column_ID="EMail_Info_To",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="375c6f9b-9b5d-928e-a2fc-6b8d8fd9e743")
public static final String FIELDNAME_EDIDefinition_InfoEMail="375c6f9b-9b5d-928e-a2fc-6b8d8fd9e743";

@XendraTrl(Identifier="5729ee2e-65fa-a436-2b9d-692acbcc492c")
public static String es_PE_COLUMN_EMail_Info_To_Name="Email de Información";

@XendraColumn(AD_Element_ID="222b4314-5a94-4f33-4c09-836f1fbdc2ac",ColumnName="EMail_Info_To",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5729ee2e-65fa-a436-2b9d-692acbcc492c",
Synchronized="2017-08-05 16:53:25.0")
/** Column name EMail_Info_To */
public static final String COLUMNNAME_EMail_Info_To = "EMail_Info_To";
/** Set To EMail.
@param EMail_To EMail address to send requests to - e.g. edi@manufacturer.com  */
public void setEMail_To (String EMail_To)
{
if (EMail_To != null && EMail_To.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail_To = EMail_To.substring(0,59);
}
set_Value (COLUMNNAME_EMail_To, EMail_To);
}
/** Get To EMail.
@return EMail address to send requests to - e.g. edi@manufacturer.com  */
public String getEMail_To() 
{
String value = (String)get_Value(COLUMNNAME_EMail_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0f5b2dc1-3f2b-7dc1-4ec7-bc79d904eb5c")
public static String es_PE_FIELD_EDIDefinition_ToEMail_Description="Dirección de correo electrónico a quien se envían requerimientos - Ej. edi@manufacturer.com";

@XendraTrl(Identifier="0f5b2dc1-3f2b-7dc1-4ec7-bc79d904eb5c")
public static String es_PE_FIELD_EDIDefinition_ToEMail_Name="Correo Electrónico hacia";

@XendraField(AD_Column_ID="EMail_To",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f5b2dc1-3f2b-7dc1-4ec7-bc79d904eb5c")
public static final String FIELDNAME_EDIDefinition_ToEMail="0f5b2dc1-3f2b-7dc1-4ec7-bc79d904eb5c";

@XendraTrl(Identifier="5f8b2f64-431f-83cd-5447-c594c8fe25f7")
public static String es_PE_COLUMN_EMail_To_Name="Correo Electrónico hacia";

@XendraColumn(AD_Element_ID="9d8fc102-82ad-855e-bbac-a44f57dbeb68",ColumnName="EMail_To",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f8b2f64-431f-83cd-5447-c594c8fe25f7",
Synchronized="2017-08-05 16:53:25.0")
/** Column name EMail_To */
public static final String COLUMNNAME_EMail_To = "EMail_To";
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
@XendraTrl(Identifier="fd67a1d9-707d-4033-9dc2-e8ac2e4c9e8d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd67a1d9-707d-4033-9dc2-e8ac2e4c9e8d",
Synchronized="2017-08-05 16:53:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Activate Audit.
@param IsAudited Activate Audit Trail of what numbers are generated */
public void setIsAudited (boolean IsAudited)
{
set_Value (COLUMNNAME_IsAudited, Boolean.valueOf(IsAudited));
}
/** Get Activate Audit.
@return Activate Audit Trail of what numbers are generated */
public boolean isAudited() 
{
Object oo = get_Value(COLUMNNAME_IsAudited);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="99cee778-458b-ff87-3bce-ef93ebd0c8b8")
public static String es_PE_FIELD_EDIDefinition_ActivateAudit_Description="Activa el seguimiento de auditoria de que números serán generados.";

@XendraTrl(Identifier="99cee778-458b-ff87-3bce-ef93ebd0c8b8")
public static String es_PE_FIELD_EDIDefinition_ActivateAudit_Help="El Cuadro de Verificación Activar Auditoria indica si se mantendrá un seguimiento de auditoria de números generados.";

@XendraTrl(Identifier="99cee778-458b-ff87-3bce-ef93ebd0c8b8")
public static String es_PE_FIELD_EDIDefinition_ActivateAudit_Name="Activar Auditoria";

@XendraField(AD_Column_ID="IsAudited",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99cee778-458b-ff87-3bce-ef93ebd0c8b8")
public static final String FIELDNAME_EDIDefinition_ActivateAudit="99cee778-458b-ff87-3bce-ef93ebd0c8b8";

@XendraTrl(Identifier="3b493292-69d7-7e95-58e1-65a536ca45a1")
public static String es_PE_COLUMN_IsAudited_Name="Activar Auditoria";

@XendraColumn(AD_Element_ID="65fadbac-0a5c-b4af-0885-19f77790a10c",ColumnName="IsAudited",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b493292-69d7-7e95-58e1-65a536ca45a1",
Synchronized="2017-08-05 16:53:25.0")
/** Column name IsAudited */
public static final String COLUMNNAME_IsAudited = "IsAudited";
/** Set Send Info.
@param IsInfoSent Send informational messages and copies */
public void setIsInfoSent (boolean IsInfoSent)
{
set_Value (COLUMNNAME_IsInfoSent, Boolean.valueOf(IsInfoSent));
}
/** Get Send Info.
@return Send informational messages and copies */
public boolean isInfoSent() 
{
Object oo = get_Value(COLUMNNAME_IsInfoSent);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e1d8f6fd-1ad3-2d1d-bfe8-a1c4f9c0e230")
public static String es_PE_FIELD_EDIDefinition_SendInfo_Description="Envía mensajes informativos y copias";

@XendraTrl(Identifier="e1d8f6fd-1ad3-2d1d-bfe8-a1c4f9c0e230")
public static String es_PE_FIELD_EDIDefinition_SendInfo_Name="Enviar Información";

@XendraField(AD_Column_ID="IsInfoSent",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1d8f6fd-1ad3-2d1d-bfe8-a1c4f9c0e230")
public static final String FIELDNAME_EDIDefinition_SendInfo="e1d8f6fd-1ad3-2d1d-bfe8-a1c4f9c0e230";

@XendraTrl(Identifier="2a642ca8-41df-886d-6445-733ef4bfbe23")
public static String es_PE_COLUMN_IsInfoSent_Name="Enviar Información";

@XendraColumn(AD_Element_ID="34274f19-30f5-a3f0-1a7a-ca741d76d875",ColumnName="IsInfoSent",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a642ca8-41df-886d-6445-733ef4bfbe23",
Synchronized="2017-08-05 16:53:25.0")
/** Column name IsInfoSent */
public static final String COLUMNNAME_IsInfoSent = "IsInfoSent";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d639a7fb-cbee-5af1-1918-79101e023fb3")
public static String es_PE_FIELD_EDIDefinition_Warehouse_Description="Almacén";

@XendraTrl(Identifier="d639a7fb-cbee-5af1-1918-79101e023fb3")
public static String es_PE_FIELD_EDIDefinition_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="d639a7fb-cbee-5af1-1918-79101e023fb3")
public static String es_PE_FIELD_EDIDefinition_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d639a7fb-cbee-5af1-1918-79101e023fb3")
public static final String FIELDNAME_EDIDefinition_Warehouse="d639a7fb-cbee-5af1-1918-79101e023fb3";

@XendraTrl(Identifier="aceb764a-2cc7-614d-ebf7-9c522ae8a9f1")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aceb764a-2cc7-614d-ebf7-9c522ae8a9f1",
Synchronized="2017-08-05 16:53:25.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="02158e80-5015-6fe0-19f6-50a7a39909d0")
public static String es_PE_FIELD_EDIDefinition_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="02158e80-5015-6fe0-19f6-50a7a39909d0")
public static String es_PE_FIELD_EDIDefinition_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="02158e80-5015-6fe0-19f6-50a7a39909d0")
public static String es_PE_FIELD_EDIDefinition_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="02158e80-5015-6fe0-19f6-50a7a39909d0")
public static final String FIELDNAME_EDIDefinition_Name="02158e80-5015-6fe0-19f6-50a7a39909d0";

@XendraTrl(Identifier="b93f4161-1992-3880-b30c-f18a7a162a61")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b93f4161-1992-3880-b30c-f18a7a162a61",
Synchronized="2017-08-05 16:53:25.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Received Inquiry Reply.
@param ReceiveInquiryReply Received Inquiry Reply */
public void setReceiveInquiryReply (boolean ReceiveInquiryReply)
{
set_Value (COLUMNNAME_ReceiveInquiryReply, Boolean.valueOf(ReceiveInquiryReply));
}
/** Get Received Inquiry Reply.
@return Received Inquiry Reply */
public boolean isReceiveInquiryReply() 
{
Object oo = get_Value(COLUMNNAME_ReceiveInquiryReply);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="eb9cab2c-e3ec-0a8d-1d9b-4f3b1e194137")
public static String es_PE_FIELD_EDIDefinition_ReceivedInquiryReply_Name="Responder a Consulta Recibida";

@XendraField(AD_Column_ID="ReceiveInquiryReply",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb9cab2c-e3ec-0a8d-1d9b-4f3b1e194137")
public static final String FIELDNAME_EDIDefinition_ReceivedInquiryReply="eb9cab2c-e3ec-0a8d-1d9b-4f3b1e194137";

@XendraTrl(Identifier="cda9695d-c053-60c1-b6fe-967bff9d9e36")
public static String es_PE_COLUMN_ReceiveInquiryReply_Name="Responder a Consulta Recibida";

@XendraColumn(AD_Element_ID="ee843183-86ee-a48e-d3a4-6b4844aafc2f",
ColumnName="ReceiveInquiryReply",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cda9695d-c053-60c1-b6fe-967bff9d9e36",Synchronized="2017-08-05 16:53:25.0")
/** Column name ReceiveInquiryReply */
public static final String COLUMNNAME_ReceiveInquiryReply = "ReceiveInquiryReply";
/** Set Receive Order Reply.
@param ReceiveOrderReply Receive Order Reply */
public void setReceiveOrderReply (boolean ReceiveOrderReply)
{
set_Value (COLUMNNAME_ReceiveOrderReply, Boolean.valueOf(ReceiveOrderReply));
}
/** Get Receive Order Reply.
@return Receive Order Reply */
public boolean isReceiveOrderReply() 
{
Object oo = get_Value(COLUMNNAME_ReceiveOrderReply);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="be61a87a-e454-7f0d-98c3-4379d9d9115f")
public static String es_PE_FIELD_EDIDefinition_ReceiveOrderReply_Name="Responder a Orden Recibida";

@XendraField(AD_Column_ID="ReceiveOrderReply",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be61a87a-e454-7f0d-98c3-4379d9d9115f")
public static final String FIELDNAME_EDIDefinition_ReceiveOrderReply="be61a87a-e454-7f0d-98c3-4379d9d9115f";

@XendraTrl(Identifier="7f5b97c7-d039-6482-8023-0ada324d3608")
public static String es_PE_COLUMN_ReceiveOrderReply_Name="Responder a Orden Recibida";

@XendraColumn(AD_Element_ID="3b3ad6b6-3241-af18-fc7d-1d86bf9d2f49",ColumnName="ReceiveOrderReply",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f5b97c7-d039-6482-8023-0ada324d3608",
Synchronized="2017-08-05 16:53:25.0")
/** Column name ReceiveOrderReply */
public static final String COLUMNNAME_ReceiveOrderReply = "ReceiveOrderReply";
/** Set Send Inquiry.
@param SendInquiry Quantity Availability Inquiry */
public void setSendInquiry (boolean SendInquiry)
{
set_Value (COLUMNNAME_SendInquiry, Boolean.valueOf(SendInquiry));
}
/** Get Send Inquiry.
@return Quantity Availability Inquiry */
public boolean isSendInquiry() 
{
Object oo = get_Value(COLUMNNAME_SendInquiry);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="657c6a68-4448-0f4e-443c-dbad381a2b80")
public static String es_PE_FIELD_EDIDefinition_SendInquiry_Description="Consulta de cantidad disponible";

@XendraTrl(Identifier="657c6a68-4448-0f4e-443c-dbad381a2b80")
public static String es_PE_FIELD_EDIDefinition_SendInquiry_Name="Enviar consulta";

@XendraField(AD_Column_ID="SendInquiry",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="657c6a68-4448-0f4e-443c-dbad381a2b80")
public static final String FIELDNAME_EDIDefinition_SendInquiry="657c6a68-4448-0f4e-443c-dbad381a2b80";

@XendraTrl(Identifier="e80a146e-0732-8ea8-bf1f-8f63c9206939")
public static String es_PE_COLUMN_SendInquiry_Name="Enviar consulta";

@XendraColumn(AD_Element_ID="f80dc55c-8c02-29a8-3807-97378f07bfcf",ColumnName="SendInquiry",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e80a146e-0732-8ea8-bf1f-8f63c9206939",
Synchronized="2017-08-05 16:53:25.0")
/** Column name SendInquiry */
public static final String COLUMNNAME_SendInquiry = "SendInquiry";
/** Set Send Order.
@param SendOrder Send Order */
public void setSendOrder (boolean SendOrder)
{
set_Value (COLUMNNAME_SendOrder, Boolean.valueOf(SendOrder));
}
/** Get Send Order.
@return Send Order */
public boolean isSendOrder() 
{
Object oo = get_Value(COLUMNNAME_SendOrder);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1df40f5c-4a14-4db2-1e78-04d917ecaae6")
public static String es_PE_FIELD_EDIDefinition_SendOrder_Name="Enviar Orden";

@XendraField(AD_Column_ID="SendOrder",IsCentrallyMaintained=true,
AD_Tab_ID="eb863798-c330-e2cb-828d-9518b9315df4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1df40f5c-4a14-4db2-1e78-04d917ecaae6")
public static final String FIELDNAME_EDIDefinition_SendOrder="1df40f5c-4a14-4db2-1e78-04d917ecaae6";

@XendraTrl(Identifier="97da226c-c272-aafb-b47f-a40efb39f961")
public static String es_PE_COLUMN_SendOrder_Name="Enviar Orden";

@XendraColumn(AD_Element_ID="6df230f7-253f-ed16-2520-ac63d6578f40",ColumnName="SendOrder",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97da226c-c272-aafb-b47f-a40efb39f961",
Synchronized="2017-08-05 16:53:25.0")
/** Column name SendOrder */
public static final String COLUMNNAME_SendOrder = "SendOrder";
}
