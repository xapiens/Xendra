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
import org.compiere.model.reference.REF_AD_ClientAutoArchive;
import org.compiere.model.reference.REF__MMPolicy;
/** Generated Model for AD_Client
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Client extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Client_ID id
@param trxName transaction
*/
public X_AD_Client (Properties ctx, int AD_Client_ID, String trxName)
{
super (ctx, AD_Client_ID, trxName);
/** if (AD_Client_ID == 0)
{
setAutoArchive (null);	
// N
setIsCostImmediate (false);	
// N
setIsMultiLingualDocument (false);	
// N
setIsPostImmediate (false);	
// N
setIsServerEMail (false);	
// N
setIsSmtpAuthorization (false);	
// N
setIsUseASP (false);	
// N
setIsUseBetaFunctions (true);	
// Y
setMMPolicy (null);	
// F
setName (null);
setStoreAttachmentsOnFileSystem (false);	
// N
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Client (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=112 */
public static int Table_ID=MTable.getTable_ID("AD_Client");

@XendraTrl(Identifier="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4")
public static String es_PE_TAB_Client_Description="Definir Compañías";

@XendraTrl(Identifier="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4")
public static String es_PE_TAB_Client_Help="La pestaña de definición de Compañía define una compañía única. No use esta ventana para crear una compañía; use el flujo de trabajo `Definir Compañía` para establecer las reglas de seguridad y de acceso requeridas. Si se crea una compañía aquí; la compañía no podrá ser vista dentro del sistema y su definición de parámetros no sera creada.";

@XendraTrl(Identifier="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4")
public static String es_PE_TAB_Client_Name="Compañía";
@XendraTab(Name="Client",
Description="Client/Tenant Definition",
Help="The Client Definition Tab defines a unique client. Do not create a new client in this window, but use 'Initial Client Setup' (System Administrator Role) to set up the required security and access rules. If you create a new client here, you will not be able to view it and also the required client infrastructure would not have been set up.",
AD_Window_ID="e44db880-39fd-a94c-7bc3-d8740a7efd77",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",
CommitWarning="Create a new client via 'Initial Client Setup'. You can only change information here!  You need re-login and restart your application server for most changes made here to be effective.  The change of the Material Policy applies to future transactions.",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Client="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4";

@XendraTrl(Identifier="521dace3-dac2-bd3e-5fc6-6be8381d76ab")
public static String es_PE_TABLE_AD_Client_Name="Compañía";

@XendraTable(Name="Client",Description="Client/Tenant for this installation.",Help="",
TableName="AD_Client",AccessLevel="6",AD_Window_ID="e44db880-39fd-a94c-7bc3-d8740a7efd77",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=40,IsSecurityEnabled=true,IsDeleteable=false,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="521dace3-dac2-bd3e-5fc6-6be8381d76ab",Synchronized="2018-01-08 15:23:16.0")
/** TableName=AD_Client */
public static final String Table_Name="AD_Client";


@XendraIndex(Name="ad_client_name",Identifier="2ff8bba5-c8d8-849a-b38d-6353eda39687",
Column_Names="name",IsUnique="true",TableIdentifier="2ff8bba5-c8d8-849a-b38d-6353eda39687",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_client_name = "2ff8bba5-c8d8-849a-b38d-6353eda39687";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Client");

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
    Table_ID = MTable.getTable_ID("AD_Client");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Client[").append(get_ID()).append("]");
return sb.toString();
}

/** AD_Language AD_Reference=205708de-88ce-3bee-b5b6-bf6fdc34a384 */
public static final int AD_LANGUAGE_AD_Reference_ID=327;
/** Set Language.
@param AD_Language Language for this entity */
public void setAD_Language (String AD_Language)
{
if (AD_Language != null && AD_Language.length() > 6)
{
log.warning("Length > 6 - truncated");
AD_Language = AD_Language.substring(0,5);
}
set_Value (COLUMNNAME_AD_Language, AD_Language);
}
/** Get Language.
@return Language for this entity */
public String getAD_Language() 
{
return (String)get_Value(COLUMNNAME_AD_Language);
}

@XendraTrl(Identifier="64899a44-66c6-effe-1c4a-63760c6e88bb")
public static String es_PE_FIELD_Client_Language_Name="Lenguaje";

@XendraTrl(Identifier="64899a44-66c6-effe-1c4a-63760c6e88bb")
public static String es_PE_FIELD_Client_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="64899a44-66c6-effe-1c4a-63760c6e88bb")
public static String es_PE_FIELD_Client_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64899a44-66c6-effe-1c4a-63760c6e88bb")
public static final String FIELDNAME_Client_Language="64899a44-66c6-effe-1c4a-63760c6e88bb";

@XendraTrl(Identifier="c3188bf2-093f-6b5e-a332-be4c2a66219c")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="205708de-88ce-3bee-b5b6-bf6fdc34a384",AD_Val_Rule_ID="",
FieldLength=6,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3188bf2-093f-6b5e-a332-be4c2a66219c",Synchronized="2017-08-28 09:54:19.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

/** AutoArchive AD_Reference=7c64cce5-d006-536a-f6ff-cd5b5852d0aa */
public static final int AUTOARCHIVE_AD_Reference_ID=334;
/** Set Auto Archive.
@param AutoArchive Enable and level of automatic Archive of documents */
public void setAutoArchive (String AutoArchive)
{
if (AutoArchive == null) throw new IllegalArgumentException ("AutoArchive is mandatory");
if (AutoArchive.equals(REF_AD_ClientAutoArchive.None) || AutoArchive.equals(REF_AD_ClientAutoArchive.AllReportsDocuments) || AutoArchive.equals(REF_AD_ClientAutoArchive.Documents) || AutoArchive.equals(REF_AD_ClientAutoArchive.ExternalDocuments));
 else throw new IllegalArgumentException ("AutoArchive Invalid value - " + AutoArchive + " - Reference_ID=334 - N - 1 - 2 - 3");
if (AutoArchive.length() > 1)
{
log.warning("Length > 1 - truncated");
AutoArchive = AutoArchive.substring(0,0);
}
set_Value (COLUMNNAME_AutoArchive, AutoArchive);
}
/** Get Auto Archive.
@return Enable and level of automatic Archive of documents */
public String getAutoArchive() 
{
return (String)get_Value(COLUMNNAME_AutoArchive);
}

@XendraTrl(Identifier="85919872-0d8c-ce71-ce34-d3ce742c2728")
public static String es_PE_FIELD_Client_AutoArchive_Name="Auto Archiva";

@XendraTrl(Identifier="85919872-0d8c-ce71-ce34-d3ce742c2728")
public static String es_PE_FIELD_Client_AutoArchive_Description="Permite nivele el archivo automático de documentos";

@XendraTrl(Identifier="85919872-0d8c-ce71-ce34-d3ce742c2728")
public static String es_PE_FIELD_Client_AutoArchive_Help="Adempiere permite crear automáticamente archivos de los documentos (ej. facturas) o de los informes. Usted define el material archivado con el espectador del archivo";

@XendraField(AD_Column_ID="AutoArchive",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85919872-0d8c-ce71-ce34-d3ce742c2728")
public static final String FIELDNAME_Client_AutoArchive="85919872-0d8c-ce71-ce34-d3ce742c2728";

@XendraTrl(Identifier="6d47c8ad-a127-e8f4-e5cf-2b1014050985")
public static String es_PE_COLUMN_AutoArchive_Name="Auto Archiva";

@XendraColumn(AD_Element_ID="fd068d75-eb69-43cf-9f46-d817cd3d64ae",ColumnName="AutoArchive",
AD_Reference_ID=17,AD_Reference_Value_ID="7c64cce5-d006-536a-f6ff-cd5b5852d0aa",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6d47c8ad-a127-e8f4-e5cf-2b1014050985",Synchronized="2017-08-28 09:54:19.0")
/** Column name AutoArchive */
public static final String COLUMNNAME_AutoArchive = "AutoArchive";
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

@XendraTrl(Identifier="830847d0-ee43-7d87-caf4-3d9eb31dbdd6")
public static String es_PE_FIELD_Client_Description_Name="Observación";

@XendraTrl(Identifier="830847d0-ee43-7d87-caf4-3d9eb31dbdd6")
public static String es_PE_FIELD_Client_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="830847d0-ee43-7d87-caf4-3d9eb31dbdd6")
public static String es_PE_FIELD_Client_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="830847d0-ee43-7d87-caf4-3d9eb31dbdd6")
public static final String FIELDNAME_Client_Description="830847d0-ee43-7d87-caf4-3d9eb31dbdd6";

@XendraTrl(Identifier="b0ba20a0-774f-771e-8e15-ead883f37962")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0ba20a0-774f-771e-8e15-ead883f37962",
Synchronized="2017-08-28 09:54:19.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Directory.
@param DocumentDir Directory for documents from the application server */
public void setDocumentDir (String DocumentDir)
{
if (DocumentDir != null && DocumentDir.length() > 60)
{
log.warning("Length > 60 - truncated");
DocumentDir = DocumentDir.substring(0,59);
}
set_Value (COLUMNNAME_DocumentDir, DocumentDir);
}
/** Get Document Directory.
@return Directory for documents from the application server */
public String getDocumentDir() 
{
String value = (String)get_Value(COLUMNNAME_DocumentDir);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14cab25d-d8f9-e5ad-0e02-6d9d421be40a")
public static String es_PE_FIELD_Client_DocumentDirectory_Name="Document Directory";

@XendraTrl(Identifier="14cab25d-d8f9-e5ad-0e02-6d9d421be40a")
public static String es_PE_FIELD_Client_DocumentDirectory_Description="Directory for documents from the application server";

@XendraTrl(Identifier="14cab25d-d8f9-e5ad-0e02-6d9d421be40a")
public static String es_PE_FIELD_Client_DocumentDirectory_Help="Directory to store documents by the application server.  The path/directory is accessed by the application server and may not be accessible to clients.";

@XendraField(AD_Column_ID="DocumentDir",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14cab25d-d8f9-e5ad-0e02-6d9d421be40a")
public static final String FIELDNAME_Client_DocumentDirectory="14cab25d-d8f9-e5ad-0e02-6d9d421be40a";

@XendraTrl(Identifier="a59024e6-41be-55c1-e017-3f3117da0d11")
public static String es_PE_COLUMN_DocumentDir_Name="Document Directory";

@XendraColumn(AD_Element_ID="15ce0a91-2608-9763-e764-a38dfd708bda",ColumnName="DocumentDir",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a59024e6-41be-55c1-e017-3f3117da0d11",
Synchronized="2017-08-28 09:54:19.0")
/** Column name DocumentDir */
public static final String COLUMNNAME_DocumentDir = "DocumentDir";
/** Set EMail Test.
@param EMailTest Test EMail */
public void setEMailTest (String EMailTest)
{
if (EMailTest != null && EMailTest.length() > 1)
{
log.warning("Length > 1 - truncated");
EMailTest = EMailTest.substring(0,0);
}
set_Value (COLUMNNAME_EMailTest, EMailTest);
}
/** Get EMail Test.
@return Test EMail */
public String getEMailTest() 
{
return (String)get_Value(COLUMNNAME_EMailTest);
}

@XendraTrl(Identifier="c8710929-77b3-3a18-b203-5a03446762fa")
public static String es_PE_FIELD_Client_EMailTest_Name="Probar EMail";

@XendraTrl(Identifier="c8710929-77b3-3a18-b203-5a03446762fa")
public static String es_PE_FIELD_Client_EMailTest_Description="Probar Conexión a EMail ";

@XendraTrl(Identifier="c8710929-77b3-3a18-b203-5a03446762fa")
public static String es_PE_FIELD_Client_EMailTest_Help="Probar conexión a Email basados en información definida. Un Email es enviado desde el usuario de la solicitud a el usuario de la solicitud. También son probadas las configriraciones del portal Web.";

@XendraField(AD_Column_ID="EMailTest",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8710929-77b3-3a18-b203-5a03446762fa")
public static final String FIELDNAME_Client_EMailTest="c8710929-77b3-3a18-b203-5a03446762fa";

@XendraTrl(Identifier="fb1271ab-f434-67ad-8784-e80be170c4f2")
public static String es_PE_COLUMN_EMailTest_Name="EMail Prueba";

@XendraColumn(AD_Element_ID="9569bb69-b201-227c-f8fa-0e29cd909750",ColumnName="EMailTest",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="d9e8200a-9c54-7104-800d-83eeb2296c32",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fb1271ab-f434-67ad-8784-e80be170c4f2",Synchronized="2017-08-28 09:54:19.0")
/** Column name EMailTest */
public static final String COLUMNNAME_EMailTest = "EMailTest";
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
@XendraTrl(Identifier="54ef1b75-8502-4a90-a43b-cf1a0f2a5d66")
public static String es_PE_FIELD_Client_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 16:32:08.0",
Identifier="54ef1b75-8502-4a90-a43b-cf1a0f2a5d66")
public static final String FIELDNAME_Client_Identifier="54ef1b75-8502-4a90-a43b-cf1a0f2a5d66";

@XendraTrl(Identifier="cf3fdca4-9870-439b-8e17-a5c3e9489012")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf3fdca4-9870-439b-8e17-a5c3e9489012",
Synchronized="2017-08-28 09:54:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Cost Immediately.
@param IsCostImmediate Update Costs immediately for testing */
public void setIsCostImmediate (boolean IsCostImmediate)
{
set_Value (COLUMNNAME_IsCostImmediate, Boolean.valueOf(IsCostImmediate));
}
/** Get Cost Immediately.
@return Update Costs immediately for testing */
public boolean isCostImmediate() 
{
Object oo = get_Value(COLUMNNAME_IsCostImmediate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f34071f0-d886-4db8-f446-89faea8a0078")
public static String es_PE_FIELD_Client_CostImmediately_Name="Costo Inmediato";

@XendraTrl(Identifier="f34071f0-d886-4db8-f446-89faea8a0078")
public static String es_PE_FIELD_Client_CostImmediately_Description="Actualiza Costo Inmediatamente para Comprobación";

@XendraTrl(Identifier="f34071f0-d886-4db8-f446-89faea8a0078")
public static String es_PE_FIELD_Client_CostImmediately_Help="Si seleccionó,los costos son actualizados inmediatamente cuando un registro Detalle Costo es creado (mediante cotejo o entrega).Sino los costos son actualizados mediante Lote o cuando son requeridos para su aplicación.  Solo deberá seleccionar esto si está comprobando.";

@XendraField(AD_Column_ID="IsCostImmediate",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f34071f0-d886-4db8-f446-89faea8a0078")
public static final String FIELDNAME_Client_CostImmediately="f34071f0-d886-4db8-f446-89faea8a0078";

@XendraTrl(Identifier="45d09210-516c-d9ac-bedb-0b18ed93bf91")
public static String es_PE_COLUMN_IsCostImmediate_Name="Costo Inmediato";

@XendraColumn(AD_Element_ID="9bdedaee-484f-a0a6-f613-5d9f1814f1c7",ColumnName="IsCostImmediate",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45d09210-516c-d9ac-bedb-0b18ed93bf91",
Synchronized="2017-08-28 09:54:19.0")
/** Column name IsCostImmediate */
public static final String COLUMNNAME_IsCostImmediate = "IsCostImmediate";
/** Set Multi Lingual Documents.
@param IsMultiLingualDocument Documents are Multi Lingual */
public void setIsMultiLingualDocument (boolean IsMultiLingualDocument)
{
set_Value (COLUMNNAME_IsMultiLingualDocument, Boolean.valueOf(IsMultiLingualDocument));
}
/** Get Multi Lingual Documents.
@return Documents are Multi Lingual */
public boolean isMultiLingualDocument() 
{
Object oo = get_Value(COLUMNNAME_IsMultiLingualDocument);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f4e0844a-f897-cf43-4f35-749d22abe063")
public static String es_PE_FIELD_Client_MultiLingualDocuments_Name="Documentos Multi-idioma";

@XendraTrl(Identifier="f4e0844a-f897-cf43-4f35-749d22abe063")
public static String es_PE_FIELD_Client_MultiLingualDocuments_Description="Los documentos son multi-idioma";

@XendraTrl(Identifier="f4e0844a-f897-cf43-4f35-749d22abe063")
public static String es_PE_FIELD_Client_MultiLingualDocuments_Help="Sí es seleccionado; se habilita los documentos multi-idioma y es necesario mantener traducciones para las entidades usadas en los documentos (ejemplos: Productos; pagos; términos;...). Note que el lenguaje base ó primario siempre es en Inglés.";

@XendraField(AD_Column_ID="IsMultiLingualDocument",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4e0844a-f897-cf43-4f35-749d22abe063")
public static final String FIELDNAME_Client_MultiLingualDocuments="f4e0844a-f897-cf43-4f35-749d22abe063";

@XendraTrl(Identifier="426e7910-5ff4-501c-3ee9-7f96521d871b")
public static String es_PE_COLUMN_IsMultiLingualDocument_Name="Documentos Multi-idioma";

@XendraColumn(AD_Element_ID="f498c9a2-0346-b623-400e-0fb39306dc74",
ColumnName="IsMultiLingualDocument",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="426e7910-5ff4-501c-3ee9-7f96521d871b",Synchronized="2017-08-28 09:54:19.0")
/** Column name IsMultiLingualDocument */
public static final String COLUMNNAME_IsMultiLingualDocument = "IsMultiLingualDocument";
/** Set Post Immediately.
@param IsPostImmediate Post the accounting immediately for testing */
public void setIsPostImmediate (boolean IsPostImmediate)
{
set_Value (COLUMNNAME_IsPostImmediate, Boolean.valueOf(IsPostImmediate));
}
/** Get Post Immediately.
@return Post the accounting immediately for testing */
public boolean isPostImmediate() 
{
Object oo = get_Value(COLUMNNAME_IsPostImmediate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9e12a79f-43df-0279-7760-310c9c6608e9")
public static String es_PE_FIELD_Client_PostImmediately_Name="Aplicar Inmediatamente";

@XendraTrl(Identifier="9e12a79f-43df-0279-7760-310c9c6608e9")
public static String es_PE_FIELD_Client_PostImmediately_Description="Aplique la Contabilidad inmediatamente para comprobación";

@XendraTrl(Identifier="9e12a79f-43df-0279-7760-310c9c6608e9")
public static String es_PE_FIELD_Client_PostImmediately_Help="Si seleccionó, las consecuencias contables son generadas inmediatamente al completar un documento. Sino el documento es aplicado mediante un proceso por lotes. Esto sólo debe ser seleccionádo si usted está comprobando.";

@XendraField(AD_Column_ID="IsPostImmediate",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e12a79f-43df-0279-7760-310c9c6608e9")
public static final String FIELDNAME_Client_PostImmediately="9e12a79f-43df-0279-7760-310c9c6608e9";

@XendraTrl(Identifier="c54cadc6-b0b1-dfa3-dbdd-b0dfb37f9d8b")
public static String es_PE_COLUMN_IsPostImmediate_Name="Aplicar Inmediatamente";

@XendraColumn(AD_Element_ID="e18d76e8-5748-d6d0-9480-8a0024dec535",ColumnName="IsPostImmediate",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c54cadc6-b0b1-dfa3-dbdd-b0dfb37f9d8b",
Synchronized="2017-08-28 09:54:19.0")
/** Column name IsPostImmediate */
public static final String COLUMNNAME_IsPostImmediate = "IsPostImmediate";
/** Set Replicated.
@param IsReplicated The data is successfully replicated */
public void setIsReplicated (boolean IsReplicated)
{
set_Value (COLUMNNAME_IsReplicated, Boolean.valueOf(IsReplicated));
}
/** Get Replicated.
@return The data is successfully replicated */
public boolean isReplicated() 
{
Object oo = get_Value(COLUMNNAME_IsReplicated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f5f2ee65-359b-44b2-8a50-366da5d79352")
public static String es_PE_FIELD_Client_Replicated_Name="Replicado";

@XendraTrl(Identifier="f5f2ee65-359b-44b2-8a50-366da5d79352")
public static String es_PE_FIELD_Client_Replicated_Description="Los datos son replicados con exito.";

@XendraTrl(Identifier="f5f2ee65-359b-44b2-8a50-366da5d79352")
public static String es_PE_FIELD_Client_Replicated_Help="El dato de replicación es acertado.";

@XendraField(AD_Column_ID="IsReplicated",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-09-20 19:51:58.0",
Identifier="f5f2ee65-359b-44b2-8a50-366da5d79352")
public static final String FIELDNAME_Client_Replicated="f5f2ee65-359b-44b2-8a50-366da5d79352";

@XendraTrl(Identifier="0479dcea-1e12-405b-a8a9-9c5e6e04eee1")
public static String es_PE_COLUMN_IsReplicated_Name="Replicated";

@XendraColumn(AD_Element_ID="ad50ae17-25bd-cdcd-ccb5-ec1abb550c90",ColumnName="IsReplicated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0479dcea-1e12-405b-a8a9-9c5e6e04eee1",
Synchronized="2017-08-28 09:54:19.0")
/** Column name IsReplicated */
public static final String COLUMNNAME_IsReplicated = "IsReplicated";
/** Set Server EMail.
@param IsServerEMail Send EMail from Server */
public void setIsServerEMail (boolean IsServerEMail)
{
set_Value (COLUMNNAME_IsServerEMail, Boolean.valueOf(IsServerEMail));
}
/** Get Server EMail.
@return Send EMail from Server */
public boolean isServerEMail() 
{
Object oo = get_Value(COLUMNNAME_IsServerEMail);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="62e6d302-6e43-1ce1-ae10-8ac32d6ff9f9")
public static String es_PE_FIELD_Client_ServerEMail_Name="Servidor de Correo Electrónico";

@XendraTrl(Identifier="62e6d302-6e43-1ce1-ae10-8ac32d6ff9f9")
public static String es_PE_FIELD_Client_ServerEMail_Description="Enviar correo electrónico desde el servidor";

@XendraTrl(Identifier="62e6d302-6e43-1ce1-ae10-8ac32d6ff9f9")
public static String es_PE_FIELD_Client_ServerEMail_Help="Cuando está seleccionado, los correos electrñonicos son enviados desde el servidor de la compañía. Usted puede seleccionar esto cuando no desea permitir contestar correos electrónicos para  lasdirecciones alancenadas en su servidor de correo.";

@XendraField(AD_Column_ID="IsServerEMail",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62e6d302-6e43-1ce1-ae10-8ac32d6ff9f9")
public static final String FIELDNAME_Client_ServerEMail="62e6d302-6e43-1ce1-ae10-8ac32d6ff9f9";

@XendraTrl(Identifier="cfe43d2f-6659-1632-3712-89427c987a55")
public static String es_PE_COLUMN_IsServerEMail_Name="Servidor de Correo Electrónico";

@XendraColumn(AD_Element_ID="cc88e784-dd0e-3c5e-6542-8abb71044ea9",ColumnName="IsServerEMail",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cfe43d2f-6659-1632-3712-89427c987a55",
Synchronized="2017-08-28 09:54:19.0")
/** Column name IsServerEMail */
public static final String COLUMNNAME_IsServerEMail = "IsServerEMail";
/** Set SMTP Authentication.
@param IsSmtpAuthorization Your mail server requires Authentication */
public void setIsSmtpAuthorization (boolean IsSmtpAuthorization)
{
set_Value (COLUMNNAME_IsSmtpAuthorization, Boolean.valueOf(IsSmtpAuthorization));
}
/** Get SMTP Authentication.
@return Your mail server requires Authentication */
public boolean isSmtpAuthorization() 
{
Object oo = get_Value(COLUMNNAME_IsSmtpAuthorization);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dd86ed6b-1f91-2b80-1f4f-271038be63dc")
public static String es_PE_FIELD_Client_SMTPAuthentication_Name="Autorización servidor SMTP";

@XendraTrl(Identifier="dd86ed6b-1f91-2b80-1f4f-271038be63dc")
public static String es_PE_FIELD_Client_SMTPAuthentication_Description="Su servidor SMTP requiere autorización";

@XendraTrl(Identifier="dd86ed6b-1f91-2b80-1f4f-271038be63dc")
public static String es_PE_FIELD_Client_SMTPAuthentication_Help="Algunos servidores de e-mail requieren de autenticación antes de enviar email. Si se selecciona; se requiere que el usuario defina su user id y password";

@XendraField(AD_Column_ID="IsSmtpAuthorization",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="Request Management",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dd86ed6b-1f91-2b80-1f4f-271038be63dc")
public static final String FIELDNAME_Client_SMTPAuthentication="dd86ed6b-1f91-2b80-1f4f-271038be63dc";

@XendraTrl(Identifier="eab4dc51-6558-76f5-4fcd-b70afa3b469d")
public static String es_PE_COLUMN_IsSmtpAuthorization_Name="Autorización servidor SMTP";

@XendraColumn(AD_Element_ID="867f8f07-3a8a-5ae7-28f8-29561aecbf90",
ColumnName="IsSmtpAuthorization",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="eab4dc51-6558-76f5-4fcd-b70afa3b469d",Synchronized="2017-08-28 09:54:19.0")
/** Column name IsSmtpAuthorization */
public static final String COLUMNNAME_IsSmtpAuthorization = "IsSmtpAuthorization";
/** Set IsUseASP.
@param IsUseASP IsUseASP */
public void setIsUseASP (boolean IsUseASP)
{
set_Value (COLUMNNAME_IsUseASP, Boolean.valueOf(IsUseASP));
}
/** Get IsUseASP.
@return IsUseASP */
public boolean isUseASP() 
{
Object oo = get_Value(COLUMNNAME_IsUseASP);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4da669ef-d574-498f-27d3-d8bcd9d5d9e0")
public static String es_PE_FIELD_Client_IsUseASP_Name="isuseasp";

@XendraField(AD_Column_ID="IsUseASP",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4da669ef-d574-498f-27d3-d8bcd9d5d9e0")
public static final String FIELDNAME_Client_IsUseASP="4da669ef-d574-498f-27d3-d8bcd9d5d9e0";

@XendraTrl(Identifier="fadfff22-0632-b553-c139-e4b7a689f7de")
public static String es_PE_COLUMN_IsUseASP_Name="isuseasp";

@XendraColumn(AD_Element_ID="4317cd51-8657-44e8-9677-5c1c0bb38b7e",ColumnName="IsUseASP",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fadfff22-0632-b553-c139-e4b7a689f7de",
Synchronized="2017-08-28 09:54:19.0")
/** Column name IsUseASP */
public static final String COLUMNNAME_IsUseASP = "IsUseASP";
/** Set Use Beta Functions.
@param IsUseBetaFunctions Enable the use of Beta Functionality */
public void setIsUseBetaFunctions (boolean IsUseBetaFunctions)
{
set_Value (COLUMNNAME_IsUseBetaFunctions, Boolean.valueOf(IsUseBetaFunctions));
}
/** Get Use Beta Functions.
@return Enable the use of Beta Functionality */
public boolean isUseBetaFunctions() 
{
Object oo = get_Value(COLUMNNAME_IsUseBetaFunctions);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6132ef8e-3164-ba9e-88b3-7ae3ad86ffb0")
public static String es_PE_FIELD_Client_UseBetaFunctions_Name="Usar Funciones Beta";

@XendraTrl(Identifier="6132ef8e-3164-ba9e-88b3-7ae3ad86ffb0")
public static String es_PE_FIELD_Client_UseBetaFunctions_Description="Activar usar funciones beta";

@XendraTrl(Identifier="6132ef8e-3164-ba9e-88b3-7ae3ad86ffb0")
public static String es_PE_FIELD_Client_UseBetaFunctions_Help="El alcance exacto de la funcionalidad beta se enumera en la nota del lanzamiento. No se recomienda generalmente para permitir funcionalidad beta en ambientes de la producción.";

@XendraField(AD_Column_ID="IsUseBetaFunctions",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6132ef8e-3164-ba9e-88b3-7ae3ad86ffb0")
public static final String FIELDNAME_Client_UseBetaFunctions="6132ef8e-3164-ba9e-88b3-7ae3ad86ffb0";

@XendraTrl(Identifier="d68edd0a-8fc2-4b7d-37b8-74b3e8bfc5db")
public static String es_PE_COLUMN_IsUseBetaFunctions_Name="Usar Funciones Beta";

@XendraColumn(AD_Element_ID="3b051c7b-ce7d-926e-b144-0d3d084c1c7c",ColumnName="IsUseBetaFunctions",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d68edd0a-8fc2-4b7d-37b8-74b3e8bfc5db",
Synchronized="2017-08-28 09:54:19.0")
/** Column name IsUseBetaFunctions */
public static final String COLUMNNAME_IsUseBetaFunctions = "IsUseBetaFunctions";
/** Set IsWithoutConversion.
@param IsWithoutConversion IsWithoutConversion */
public void setIsWithoutConversion (boolean IsWithoutConversion)
{
set_Value (COLUMNNAME_IsWithoutConversion, Boolean.valueOf(IsWithoutConversion));
}
/** Get IsWithoutConversion.
@return IsWithoutConversion */
public boolean isWithoutConversion() 
{
Object oo = get_Value(COLUMNNAME_IsWithoutConversion);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ff4d9728-bc01-48d9-878a-922dbaf4d26a")
public static String es_PE_FIELD_Client_IsWithoutConversion_Name="iswithoutconversion";

@XendraField(AD_Column_ID="IsWithoutConversion",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 16:32:08.0",
Identifier="ff4d9728-bc01-48d9-878a-922dbaf4d26a")
public static final String FIELDNAME_Client_IsWithoutConversion="ff4d9728-bc01-48d9-878a-922dbaf4d26a";

@XendraTrl(Identifier="67e1f4a7-fc00-b85a-9cef-531217ef9bd9")
public static String es_PE_COLUMN_IsWithoutConversion_Name="iswithoutconversion";

@XendraColumn(AD_Element_ID="cc5af59a-0bdf-23d2-80b9-1399c773d395",
ColumnName="IsWithoutConversion",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="67e1f4a7-fc00-b85a-9cef-531217ef9bd9",Synchronized="2017-08-28 09:54:19.0")
/** Column name IsWithoutConversion */
public static final String COLUMNNAME_IsWithoutConversion = "IsWithoutConversion";
/** Set ldapquery.
@param ldapquery ldapquery */
public void setldapquery (String ldapquery)
{
if (ldapquery != null && ldapquery.length() > 255)
{
log.warning("Length > 255 - truncated");
ldapquery = ldapquery.substring(0,254);
}
set_Value (COLUMNNAME_ldapquery, ldapquery);
}
/** Get ldapquery.
@return ldapquery */
public String getldapquery() 
{
String value = (String)get_Value(COLUMNNAME_ldapquery);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f3249153-20bc-fb1b-b4c4-0277d5c8d3a4")
public static String es_PE_FIELD_Client_Ldapquery_Name="ldapquery";

@XendraField(AD_Column_ID="ldapquery",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3249153-20bc-fb1b-b4c4-0277d5c8d3a4")
public static final String FIELDNAME_Client_Ldapquery="f3249153-20bc-fb1b-b4c4-0277d5c8d3a4";

@XendraTrl(Identifier="f858c0ee-9c58-5416-bb02-27c548ad7d5e")
public static String es_PE_COLUMN_ldapquery_Name="ldapquery";

@XendraColumn(AD_Element_ID="5d6afb65-30be-d6bd-dbc0-ef950c946309",ColumnName="ldapquery",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f858c0ee-9c58-5416-bb02-27c548ad7d5e",
Synchronized="2017-08-28 09:54:20.0")
/** Column name ldapquery */
public static final String COLUMNNAME_ldapquery = "ldapquery";
/** Set Material Policy.
@param M_MaterialPolicy_ID Material Policy */
public void setM_MaterialPolicy_ID (int M_MaterialPolicy_ID)
{
if (M_MaterialPolicy_ID <= 0) set_Value (COLUMNNAME_M_MaterialPolicy_ID, null);
 else 
set_Value (COLUMNNAME_M_MaterialPolicy_ID, Integer.valueOf(M_MaterialPolicy_ID));
}
/** Get Material Policy.
@return Material Policy */
public int getM_MaterialPolicy_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MaterialPolicy_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bd3ecf0e-ba60-42c7-b19c-78af22df97ba")
public static String es_PE_FIELD_Client_MaterialPolicy_Name="Material Policy";

@XendraField(AD_Column_ID="M_MaterialPolicy_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-08-09 16:32:08.0",
Identifier="bd3ecf0e-ba60-42c7-b19c-78af22df97ba")
public static final String FIELDNAME_Client_MaterialPolicy="bd3ecf0e-ba60-42c7-b19c-78af22df97ba";

@XendraTrl(Identifier="5eb4966a-ee38-4c76-ba64-cc929c117337")
public static String es_PE_COLUMN_M_MaterialPolicy_ID_Name="Material Policy";

@XendraColumn(AD_Element_ID="a0f22943-762b-44c8-937b-ba7a1e048772",
ColumnName="M_MaterialPolicy_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5eb4966a-ee38-4c76-ba64-cc929c117337",Synchronized="2017-08-28 09:54:20.0")
/** Column name M_MaterialPolicy_ID */
public static final String COLUMNNAME_M_MaterialPolicy_ID = "M_MaterialPolicy_ID";

/** MMPolicy AD_Reference=a00dc4c4-1532-e484-fdd2-81ec830cf15b */
public static final int MMPOLICY_AD_Reference_ID=335;
/** Set Material Policy.
@param MMPolicy Material Movement Policy */
public void setMMPolicy (String MMPolicy)
{
if (MMPolicy == null) throw new IllegalArgumentException ("MMPolicy is mandatory");
if (MMPolicy.equals(REF__MMPolicy.LiFo) || MMPolicy.equals(REF__MMPolicy.FiFo) || MMPolicy.equals(REF__MMPolicy.FeFo));
 else throw new IllegalArgumentException ("MMPolicy Invalid value - " + MMPolicy + " - Reference_ID=335 - L - F - E");
if (MMPolicy.length() > 1)
{
log.warning("Length > 1 - truncated");
MMPolicy = MMPolicy.substring(0,0);
}
set_Value (COLUMNNAME_MMPolicy, MMPolicy);
}
/** Get Material Policy.
@return Material Movement Policy */
public String getMMPolicy() 
{
return (String)get_Value(COLUMNNAME_MMPolicy);
}

@XendraTrl(Identifier="fa715738-309c-da38-db92-7222a07b8785")
public static String es_PE_FIELD_Client_MaterialPolicy2_Name="Política de Material";

@XendraTrl(Identifier="fa715738-309c-da38-db92-7222a07b8785")
public static String es_PE_FIELD_Client_MaterialPolicy2_Description="Política de movimiento de material.";

@XendraTrl(Identifier="fa715738-309c-da38-db92-7222a07b8785")
public static String es_PE_FIELD_Client_MaterialPolicy2_Help="La politica de movimiento determina como esta fluyendo la acción (PEPS ó UEPS) si un caso específico del producto no fue seleccionado. La política no puede contradecir el método de costeo (ej. PEPS movimiento de politica y UEPS metodo de costeo).";

@XendraField(AD_Column_ID="MMPolicy",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa715738-309c-da38-db92-7222a07b8785")
public static final String FIELDNAME_Client_MaterialPolicy2="fa715738-309c-da38-db92-7222a07b8785";

@XendraTrl(Identifier="9297844d-b676-7aaa-6404-1bbf7dcc5c42")
public static String es_PE_COLUMN_MMPolicy_Name="Política de Material";

@XendraColumn(AD_Element_ID="835a2dfb-454a-24bc-fd20-11ca86233a2b",ColumnName="MMPolicy",
AD_Reference_ID=17,AD_Reference_Value_ID="a00dc4c4-1532-e484-fdd2-81ec830cf15b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="F",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9297844d-b676-7aaa-6404-1bbf7dcc5c42",Synchronized="2017-08-28 09:54:20.0")
/** Column name MMPolicy */
public static final String COLUMNNAME_MMPolicy = "MMPolicy";
/** Set Model Validation Classes.
@param ModelValidationClasses List of data model validation classes separated by : */
public void setModelValidationClasses (String ModelValidationClasses)
{
if (ModelValidationClasses != null && ModelValidationClasses.length() > 255)
{
log.warning("Length > 255 - truncated");
ModelValidationClasses = ModelValidationClasses.substring(0,254);
}
set_Value (COLUMNNAME_ModelValidationClasses, ModelValidationClasses);
}
/** Get Model Validation Classes.
@return List of data model validation classes separated by : */
public String getModelValidationClasses() 
{
String value = (String)get_Value(COLUMNNAME_ModelValidationClasses);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bfd9d547-c1c2-6954-0740-9b9de302b652")
public static String es_PE_FIELD_Client_ModelValidationClasses_Name="Clases de Validación del modelo";

@XendraTrl(Identifier="bfd9d547-c1c2-6954-0740-9b9de302b652")
public static String es_PE_FIELD_Client_ModelValidationClasses_Description="La lista de datos modela las clases de la validación por separado;";

@XendraTrl(Identifier="bfd9d547-c1c2-6954-0740-9b9de302b652")
public static String es_PE_FIELD_Client_ModelValidationClasses_Help="La lista de las clases que ponían el interfaz en ejecución org.compiere.model.ModelValidator, separados por punto y coma. La clase es llamada para el cliente para validar documentos en la preparación y el modelo del monitor cambia.";

@XendraField(AD_Column_ID="ModelValidationClasses",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfd9d547-c1c2-6954-0740-9b9de302b652")
public static final String FIELDNAME_Client_ModelValidationClasses="bfd9d547-c1c2-6954-0740-9b9de302b652";

@XendraTrl(Identifier="f2bf981c-ffed-1928-3287-fda9eb950e84")
public static String es_PE_COLUMN_ModelValidationClasses_Name="Clases de Validación del modelo";

@XendraColumn(AD_Element_ID="88955570-4ff8-bc74-9642-86ec01f333b3",
ColumnName="ModelValidationClasses",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=255,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f2bf981c-ffed-1928-3287-fda9eb950e84",Synchronized="2017-08-28 09:54:20.0")
/** Column name ModelValidationClasses */
public static final String COLUMNNAME_ModelValidationClasses = "ModelValidationClasses";
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

@XendraTrl(Identifier="b55acc82-3773-8a4e-9da6-25501ede9444")
public static String es_PE_FIELD_Client_Name_Name="Nombre";

@XendraTrl(Identifier="b55acc82-3773-8a4e-9da6-25501ede9444")
public static String es_PE_FIELD_Client_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b55acc82-3773-8a4e-9da6-25501ede9444")
public static String es_PE_FIELD_Client_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=20,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b55acc82-3773-8a4e-9da6-25501ede9444")
public static final String FIELDNAME_Client_Name="b55acc82-3773-8a4e-9da6-25501ede9444";

@XendraTrl(Identifier="5bb0224b-8e1c-e65e-3981-0be240018f09")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bb0224b-8e1c-e65e-3981-0be240018f09",
Synchronized="2017-08-28 09:54:20.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set PluginUpdate.
@param PluginUpdate PluginUpdate */
public void setPluginUpdate (boolean PluginUpdate)
{
set_Value (COLUMNNAME_PluginUpdate, Boolean.valueOf(PluginUpdate));
}
/** Get PluginUpdate.
@return PluginUpdate */
public boolean isPluginUpdate() 
{
Object oo = get_Value(COLUMNNAME_PluginUpdate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7e9ea921-2293-4da9-8055-b6ad16dfb7f9")
public static String es_PE_COLUMN_PluginUpdate_Name="pluginupdate";

@XendraColumn(AD_Element_ID="9fa2101c-eba3-4925-8165-f065915ed6ac",ColumnName="PluginUpdate",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e9ea921-2293-4da9-8055-b6ad16dfb7f9",
Synchronized="2018-01-08 15:20:49.0")
/** Column name PluginUpdate */
public static final String COLUMNNAME_PluginUpdate = "PluginUpdate";
/** Set Request EMail.
@param RequestEMail EMail address to send automated mails from or receive mails for automated processing (fully qualified) */
public void setRequestEMail (String RequestEMail)
{
if (RequestEMail != null && RequestEMail.length() > 60)
{
log.warning("Length > 60 - truncated");
RequestEMail = RequestEMail.substring(0,59);
}
set_Value (COLUMNNAME_RequestEMail, RequestEMail);
}
/** Get Request EMail.
@return EMail address to send automated mails from or receive mails for automated processing (fully qualified) */
public String getRequestEMail() 
{
String value = (String)get_Value(COLUMNNAME_RequestEMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b02d04a0-1863-c4ce-da3c-2fb8c4aa9fca")
public static String es_PE_FIELD_Client_RequestEMail_Name="Correo Electrónico de la Solicitud ";

@XendraTrl(Identifier="b02d04a0-1863-c4ce-da3c-2fb8c4aa9fca")
public static String es_PE_FIELD_Client_RequestEMail_Description="Dirección de correo electrónico desde el que se envían solicitudes (completamente calificado)";

@XendraTrl(Identifier="b02d04a0-1863-c4ce-da3c-2fb8c4aa9fca")
public static String es_PE_FIELD_Client_RequestEMail_Help="Email para alertas y escalación son enviadas desde esta dirección de correo. La dirección debe ser totalmente calificada (Ej.joe@company.com) y debería ser una dirección válida";

@XendraField(AD_Column_ID="RequestEMail",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="Request Management",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b02d04a0-1863-c4ce-da3c-2fb8c4aa9fca")
public static final String FIELDNAME_Client_RequestEMail="b02d04a0-1863-c4ce-da3c-2fb8c4aa9fca";

@XendraTrl(Identifier="3bd1a565-d48c-8bf9-3f6a-7dd2663ca459")
public static String es_PE_COLUMN_RequestEMail_Name="Correo Electrónico de la Solicitud ";

@XendraColumn(AD_Element_ID="4c9b4765-1df2-7dbb-165e-43d36e7d63f8",ColumnName="RequestEMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bd1a565-d48c-8bf9-3f6a-7dd2663ca459",
Synchronized="2017-08-28 09:54:20.0")
/** Column name RequestEMail */
public static final String COLUMNNAME_RequestEMail = "RequestEMail";
/** Set Request Folder.
@param RequestFolder EMail folder to process incoming emails: if empty INBOX is used */
public void setRequestFolder (String RequestFolder)
{
if (RequestFolder != null && RequestFolder.length() > 20)
{
log.warning("Length > 20 - truncated");
RequestFolder = RequestFolder.substring(0,19);
}
set_Value (COLUMNNAME_RequestFolder, RequestFolder);
}
/** Get Request Folder.
@return EMail folder to process incoming emails: if empty INBOX is used */
public String getRequestFolder() 
{
String value = (String)get_Value(COLUMNNAME_RequestFolder);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="54c5551f-c0b7-e226-807a-688798f2b6e1")
public static String es_PE_FIELD_Client_RequestFolder_Name="Carpeta de Solicitudes";

@XendraTrl(Identifier="54c5551f-c0b7-e226-807a-688798f2b6e1")
public static String es_PE_FIELD_Client_RequestFolder_Description="Carpeta para procesar correos que se reciben, si está vacío se usa la bandeja de entrada";

@XendraTrl(Identifier="54c5551f-c0b7-e226-807a-688798f2b6e1")
public static String es_PE_FIELD_Client_RequestFolder_Help="Carpeta de Email usada para leer correos electrónicos a procesar como requerimientos. Si se deja vacía el buzón de Ingreso predeterminado (INBOX) será usado.";

@XendraField(AD_Column_ID="RequestFolder",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="Request Management",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="54c5551f-c0b7-e226-807a-688798f2b6e1")
public static final String FIELDNAME_Client_RequestFolder="54c5551f-c0b7-e226-807a-688798f2b6e1";

@XendraTrl(Identifier="0ead5ab0-3932-d98a-bd2f-715a9fa14baa")
public static String es_PE_COLUMN_RequestFolder_Name="Carpeta de Solicitudes";

@XendraColumn(AD_Element_ID="0ca9f976-2c86-e976-369b-34644560ec7c",ColumnName="RequestFolder",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ead5ab0-3932-d98a-bd2f-715a9fa14baa",
Synchronized="2017-08-28 09:54:20.0")
/** Column name RequestFolder */
public static final String COLUMNNAME_RequestFolder = "RequestFolder";
/** Set Request User.
@param RequestUser User Name (ID) of the email owner */
public void setRequestUser (String RequestUser)
{
if (RequestUser != null && RequestUser.length() > 60)
{
log.warning("Length > 60 - truncated");
RequestUser = RequestUser.substring(0,59);
}
set_Value (COLUMNNAME_RequestUser, RequestUser);
}
/** Get Request User.
@return User Name (ID) of the email owner */
public String getRequestUser() 
{
String value = (String)get_Value(COLUMNNAME_RequestUser);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3d197017-981c-1719-9305-c8a0a6c6ecf0")
public static String es_PE_FIELD_Client_RequestUser_Name="Usuario de la Solicitud ";

@XendraTrl(Identifier="3d197017-981c-1719-9305-c8a0a6c6ecf0")
public static String es_PE_FIELD_Client_RequestUser_Description="ID de usuario de propietario del correo electrónico que recibe las solicitudes";

@XendraField(AD_Column_ID="RequestUser",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="Request Management",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3d197017-981c-1719-9305-c8a0a6c6ecf0")
public static final String FIELDNAME_Client_RequestUser="3d197017-981c-1719-9305-c8a0a6c6ecf0";

@XendraTrl(Identifier="9e240c22-54e8-77d4-6b1b-5dacd92c3bd5")
public static String es_PE_COLUMN_RequestUser_Name="Usuario de la Solicitud ";

@XendraColumn(AD_Element_ID="802aca3a-f645-7476-a556-e4341f9d67cc",ColumnName="RequestUser",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e240c22-54e8-77d4-6b1b-5dacd92c3bd5",
Synchronized="2017-08-28 09:54:20.0")
/** Column name RequestUser */
public static final String COLUMNNAME_RequestUser = "RequestUser";
/** Set Request User Password.
@param RequestUserPW Password of the user NAME (ID) for mail processing */
public void setRequestUserPW (String RequestUserPW)
{
if (RequestUserPW != null && RequestUserPW.length() > 20)
{
log.warning("Length > 20 - truncated");
RequestUserPW = RequestUserPW.substring(0,19);
}
set_Value (COLUMNNAME_RequestUserPW, RequestUserPW);
}
/** Get Request User Password.
@return Password of the user NAME (ID) for mail processing */
public String getRequestUserPW() 
{
String value = (String)get_Value(COLUMNNAME_RequestUserPW);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ae965ac6-0d19-789a-258a-3a9166a589f9")
public static String es_PE_FIELD_Client_RequestUserPassword_Name="Contraseña de Usuario de la Solicitud ";

@XendraTrl(Identifier="ae965ac6-0d19-789a-258a-3a9166a589f9")
public static String es_PE_FIELD_Client_RequestUserPassword_Description="Contraseña del usuario para el proceso de solicitudes";

@XendraField(AD_Column_ID="RequestUserPW",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="Request Management",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ae965ac6-0d19-789a-258a-3a9166a589f9")
public static final String FIELDNAME_Client_RequestUserPassword="ae965ac6-0d19-789a-258a-3a9166a589f9";

@XendraTrl(Identifier="9a93c3d7-046a-3702-4a65-60fdf6c5cbd0")
public static String es_PE_COLUMN_RequestUserPW_Name="Contraseña de Usuario de la Solicitud ";

@XendraColumn(AD_Element_ID="199ac0dd-80a7-3f20-0708-2b2757928bb8",ColumnName="RequestUserPW",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a93c3d7-046a-3702-4a65-60fdf6c5cbd0",
Synchronized="2017-08-28 09:54:20.0")
/** Column name RequestUserPW */
public static final String COLUMNNAME_RequestUserPW = "RequestUserPW";
/** Set Mail Host.
@param SMTPHost HostNAME of Mail Server for SMTP and IMAP */
public void setSMTPHost (String SMTPHost)
{
if (SMTPHost != null && SMTPHost.length() > 60)
{
log.warning("Length > 60 - truncated");
SMTPHost = SMTPHost.substring(0,59);
}
set_Value (COLUMNNAME_SMTPHost, SMTPHost);
}
/** Get Mail Host.
@return HostNAME of Mail Server for SMTP and IMAP */
public String getSMTPHost() 
{
String value = (String)get_Value(COLUMNNAME_SMTPHost);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c46a4a6d-94fc-1587-fa74-a68c9468e2d8")
public static String es_PE_FIELD_Client_MailHost_Name="Nombre del Host SMTP";

@XendraTrl(Identifier="c46a4a6d-94fc-1587-fa74-a68c9468e2d8")
public static String es_PE_FIELD_Client_MailHost_Description="Nombre del servidor de correos.";

@XendraTrl(Identifier="c46a4a6d-94fc-1587-fa74-a68c9468e2d8")
public static String es_PE_FIELD_Client_MailHost_Help="El servidor SMTP define el nombre del servidor de correos para este registro";

@XendraField(AD_Column_ID="SMTPHost",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="Request Management",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c46a4a6d-94fc-1587-fa74-a68c9468e2d8")
public static final String FIELDNAME_Client_MailHost="c46a4a6d-94fc-1587-fa74-a68c9468e2d8";

@XendraTrl(Identifier="b2784cf7-b453-0fb9-3e22-3b6c04482d02")
public static String es_PE_COLUMN_SMTPHost_Name="Nombre del Host SMTP";

@XendraColumn(AD_Element_ID="9a7df85a-d804-a096-0eb9-adf9051d7dc3",ColumnName="SMTPHost",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2784cf7-b453-0fb9-3e22-3b6c04482d02",
Synchronized="2017-08-28 09:54:20.0")
/** Column name SMTPHost */
public static final String COLUMNNAME_SMTPHost = "SMTPHost";
/** Set Store Attachments On File System.
@param StoreAttachmentsOnFileSystem Store Attachments On File System */
public void setStoreAttachmentsOnFileSystem (boolean StoreAttachmentsOnFileSystem)
{
set_Value (COLUMNNAME_StoreAttachmentsOnFileSystem, Boolean.valueOf(StoreAttachmentsOnFileSystem));
}
/** Get Store Attachments On File System.
@return Store Attachments On File System */
public boolean isStoreAttachmentsOnFileSystem() 
{
Object oo = get_Value(COLUMNNAME_StoreAttachmentsOnFileSystem);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3ce20a48-dc14-3da6-51d4-9807105e2ce4")
public static String es_PE_FIELD_Client_StoreAttachmentsOnFileSystem_Name="Store Attachments On File System";

@XendraField(AD_Column_ID="StoreAttachmentsOnFileSystem",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ce20a48-dc14-3da6-51d4-9807105e2ce4")
public static final String FIELDNAME_Client_StoreAttachmentsOnFileSystem="3ce20a48-dc14-3da6-51d4-9807105e2ce4";

@XendraTrl(Identifier="3d1c5563-c357-0327-0c6c-8a36297d284a")
public static String es_PE_COLUMN_StoreAttachmentsOnFileSystem_Name="Store Attachments On File System";

@XendraColumn(AD_Element_ID="01b66e54-478f-2156-1e53-19f26867aec2",
ColumnName="StoreAttachmentsOnFileSystem",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutClient.storeAttachmentOnFileSystem",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="3d1c5563-c357-0327-0c6c-8a36297d284a",
Synchronized="2017-08-28 09:54:20.0")
/** Column name StoreAttachmentsOnFileSystem */
public static final String COLUMNNAME_StoreAttachmentsOnFileSystem = "StoreAttachmentsOnFileSystem";
/** Set Unix Attachment Path.
@param UnixAttachmentPath Unix Attachment Path */
public void setUnixAttachmentPath (String UnixAttachmentPath)
{
if (UnixAttachmentPath != null && UnixAttachmentPath.length() > 255)
{
log.warning("Length > 255 - truncated");
UnixAttachmentPath = UnixAttachmentPath.substring(0,254);
}
set_Value (COLUMNNAME_UnixAttachmentPath, UnixAttachmentPath);
}
/** Get Unix Attachment Path.
@return Unix Attachment Path */
public String getUnixAttachmentPath() 
{
String value = (String)get_Value(COLUMNNAME_UnixAttachmentPath);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8f4e89c9-c7e4-f45f-0c02-8d3b8c5b8006")
public static String es_PE_FIELD_Client_UnixAttachmentPath_Name="Unix Attachment Path";

@XendraField(AD_Column_ID="UnixAttachmentPath",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@StoreAttachmentsOnFileSystem@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=250,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8f4e89c9-c7e4-f45f-0c02-8d3b8c5b8006")
public static final String FIELDNAME_Client_UnixAttachmentPath="8f4e89c9-c7e4-f45f-0c02-8d3b8c5b8006";

@XendraTrl(Identifier="9830e5d2-db41-696e-e34d-06e6c65d675e")
public static String es_PE_COLUMN_UnixAttachmentPath_Name="Unix Attachment Path";

@XendraColumn(AD_Element_ID="d9a6b7a1-5d77-7567-1d88-f1124183d7c1",ColumnName="UnixAttachmentPath",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9830e5d2-db41-696e-e34d-06e6c65d675e",
Synchronized="2017-08-28 09:54:20.0")
/** Column name UnixAttachmentPath */
public static final String COLUMNNAME_UnixAttachmentPath = "UnixAttachmentPath";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="42ae8654-0404-2d6c-c9a2-68f3fe79e0ce")
public static String es_PE_FIELD_Client_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="42ae8654-0404-2d6c-c9a2-68f3fe79e0ce")
public static String es_PE_FIELD_Client_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="42ae8654-0404-2d6c-c9a2-68f3fe79e0ce")
public static String es_PE_FIELD_Client_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42ae8654-0404-2d6c-c9a2-68f3fe79e0ce")
public static final String FIELDNAME_Client_SearchKey="42ae8654-0404-2d6c-c9a2-68f3fe79e0ce";

@XendraTrl(Identifier="19dc524c-1963-9224-3803-471f9faf766f")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19dc524c-1963-9224-3803-471f9faf766f",
Synchronized="2017-08-28 09:54:20.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Windows Attachment Path.
@param WindowsAttachmentPath Windows Attachment Path */
public void setWindowsAttachmentPath (String WindowsAttachmentPath)
{
if (WindowsAttachmentPath != null && WindowsAttachmentPath.length() > 255)
{
log.warning("Length > 255 - truncated");
WindowsAttachmentPath = WindowsAttachmentPath.substring(0,254);
}
set_Value (COLUMNNAME_WindowsAttachmentPath, WindowsAttachmentPath);
}
/** Get Windows Attachment Path.
@return Windows Attachment Path */
public String getWindowsAttachmentPath() 
{
String value = (String)get_Value(COLUMNNAME_WindowsAttachmentPath);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7c2fa6e5-271d-e28f-3a74-10fd4231f25b")
public static String es_PE_FIELD_Client_WindowsAttachmentPath_Name="Windows Attachment Path";

@XendraField(AD_Column_ID="WindowsAttachmentPath",IsCentrallyMaintained=true,
AD_Tab_ID="f80cee2c-c98d-8f1a-4dbb-5123ac9f16d4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@StoreAttachmentsOnFileSystem@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=240,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7c2fa6e5-271d-e28f-3a74-10fd4231f25b")
public static final String FIELDNAME_Client_WindowsAttachmentPath="7c2fa6e5-271d-e28f-3a74-10fd4231f25b";

@XendraTrl(Identifier="21d8e774-3ad2-f9fd-8b5a-48b327c97ce0")
public static String es_PE_COLUMN_WindowsAttachmentPath_Name="Windows Attachment Path";

@XendraColumn(AD_Element_ID="8e6487c2-8484-142a-dd53-cf4ee06a13ef",
ColumnName="WindowsAttachmentPath",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=255,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="21d8e774-3ad2-f9fd-8b5a-48b327c97ce0",Synchronized="2017-08-28 09:54:20.0")
/** Column name WindowsAttachmentPath */
public static final String COLUMNNAME_WindowsAttachmentPath = "WindowsAttachmentPath";
}
