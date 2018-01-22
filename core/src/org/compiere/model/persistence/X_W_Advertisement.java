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
import org.compiere.model.reference.REF__PublishStatus;
/** Generated Model for W_Advertisement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_Advertisement extends PO
{
/** Standard Constructor
@param ctx context
@param W_Advertisement_ID id
@param trxName transaction
*/
public X_W_Advertisement (Properties ctx, int W_Advertisement_ID, String trxName)
{
super (ctx, W_Advertisement_ID, trxName);
/** if (W_Advertisement_ID == 0)
{
setAD_User_ID (0);	
// -1
setC_BPartner_ID (0);
setIsSelfService (true);	
// Y
setName (null);
setPublishStatus (null);	
// U
setW_Advertisement_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_Advertisement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=579 */
public static int Table_ID=MTable.getTable_ID("W_Advertisement");

@XendraTrl(Identifier="f9b26fa7-2955-338e-d52c-e04f664dd7c5")
public static String es_PE_TAB_Advertisement_Description="Advertencia Web";

@XendraTrl(Identifier="f9b26fa7-2955-338e-d52c-e04f664dd7c5")
public static String es_PE_TAB_Advertisement_Name="Advertencia";

@XendraTrl(Identifier="f9b26fa7-2955-338e-d52c-e04f664dd7c5")
public static String es_PE_TAB_Advertisement_Help="Advertencia sobre la Web";

@XendraTab(Name="Advertisement",Description="Web Advertisement",Help="Advertisement on the Web",
AD_Window_ID="025f8991-020d-e925-24f2-97ef2fcf9e15",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f9b26fa7-2955-338e-d52c-e04f664dd7c5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Advertisement="f9b26fa7-2955-338e-d52c-e04f664dd7c5";

@XendraTrl(Identifier="75f9c78a-c0be-049b-fa09-574413169171")
public static String es_PE_TABLE_W_Advertisement_Name="Anuncios";

@XendraTable(Name="Advertisement",Description="Web Advertisement",Help="",
TableName="W_Advertisement",AccessLevel="3",AD_Window_ID="025f8991-020d-e925-24f2-97ef2fcf9e15",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="75f9c78a-c0be-049b-fa09-574413169171",Synchronized="2017-08-16 11:44:27.0")
/** TableName=W_Advertisement */
public static final String Table_Name="W_Advertisement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_Advertisement");

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
    Table_ID = MTable.getTable_ID("W_Advertisement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_Advertisement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Advertisement Text.
@param AdText Text of the Advertisement */
public void setAdText (String AdText)
{
if (AdText != null && AdText.length() > 2000)
{
log.warning("Length > 2000 - truncated");
AdText = AdText.substring(0,1999);
}
set_Value (COLUMNNAME_AdText, AdText);
}
/** Get Advertisement Text.
@return Text of the Advertisement */
public String getAdText() 
{
String value = (String)get_Value(COLUMNNAME_AdText);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="52750532-5b62-8ed8-c97a-5165b4a0dd8d")
public static String es_PE_FIELD_Advertisement_AdvertisementText_Description="Texto del Anuncio";

@XendraTrl(Identifier="52750532-5b62-8ed8-c97a-5165b4a0dd8d")
public static String es_PE_FIELD_Advertisement_AdvertisementText_Help="El texto del anuncio con marca de etiqueta opcional HTML.  Las etiquetas del HTML no se comprueban para saber si hay corrección y pueden afectar la página restante.";

@XendraTrl(Identifier="52750532-5b62-8ed8-c97a-5165b4a0dd8d")
public static String es_PE_FIELD_Advertisement_AdvertisementText_Name="Texto del Anuncio";

@XendraField(AD_Column_ID="AdText",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52750532-5b62-8ed8-c97a-5165b4a0dd8d")
public static final String FIELDNAME_Advertisement_AdvertisementText="52750532-5b62-8ed8-c97a-5165b4a0dd8d";

@XendraTrl(Identifier="029ec5d3-4c83-0a77-600d-1c384d3e19ca")
public static String es_PE_COLUMN_AdText_Name="Texto del Anuncio";

@XendraColumn(AD_Element_ID="4f56f968-908a-5190-c56e-fc1e43d81432",ColumnName="AdText",
AD_Reference_ID=34,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="029ec5d3-4c83-0a77-600d-1c384d3e19ca",
Synchronized="2017-08-05 16:56:31.0")
/** Column name AdText */
public static final String COLUMNNAME_AdText = "AdText";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d2bb66d8-f5df-e27c-05c6-68e8ad61332f")
public static String es_PE_FIELD_Advertisement_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="d2bb66d8-f5df-e27c-05c6-68e8ad61332f")
public static String es_PE_FIELD_Advertisement_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="d2bb66d8-f5df-e27c-05c6-68e8ad61332f")
public static String es_PE_FIELD_Advertisement_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2bb66d8-f5df-e27c-05c6-68e8ad61332f")
public static final String FIELDNAME_Advertisement_UserContact="d2bb66d8-f5df-e27c-05c6-68e8ad61332f";

@XendraTrl(Identifier="f35c91eb-ac27-f4f7-47d0-32b84e220849")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f35c91eb-ac27-f4f7-47d0-32b84e220849",Synchronized="2017-08-05 16:56:31.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

/** C_BPartner_ID AD_Reference=60ae0c61-2010-74a0-d56f-a6f27933c4c4 */
public static final int C_BPARTNER_ID_AD_Reference_ID=232;
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

@XendraTrl(Identifier="1fe63410-f773-9f9f-47c2-7353e1355b9c")
public static String es_PE_FIELD_Advertisement_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="1fe63410-f773-9f9f-47c2-7353e1355b9c")
public static String es_PE_FIELD_Advertisement_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="1fe63410-f773-9f9f-47c2-7353e1355b9c")
public static String es_PE_FIELD_Advertisement_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fe63410-f773-9f9f-47c2-7353e1355b9c")
public static final String FIELDNAME_Advertisement_BusinessPartner="1fe63410-f773-9f9f-47c2-7353e1355b9c";

@XendraTrl(Identifier="8fae025f-db4b-7067-4599-74f09e4e2ab3")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="60ae0c61-2010-74a0-d56f-a6f27933c4c4",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8fae025f-db4b-7067-4599-74f09e4e2ab3",Synchronized="2017-08-05 16:56:31.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="89032e85-afbe-42e9-e520-f7992c1d863f")
public static String es_PE_FIELD_Advertisement_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="89032e85-afbe-42e9-e520-f7992c1d863f")
public static String es_PE_FIELD_Advertisement_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="89032e85-afbe-42e9-e520-f7992c1d863f")
public static String es_PE_FIELD_Advertisement_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89032e85-afbe-42e9-e520-f7992c1d863f")
public static final String FIELDNAME_Advertisement_Description="89032e85-afbe-42e9-e520-f7992c1d863f";

@XendraTrl(Identifier="04a2f95b-9401-6b32-572f-fcd97f65a0b7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04a2f95b-9401-6b32-572f-fcd97f65a0b7",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="3e6bf22e-c058-28ca-37ea-355133586dd9")
public static String es_PE_FIELD_Advertisement_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="3e6bf22e-c058-28ca-37ea-355133586dd9")
public static String es_PE_FIELD_Advertisement_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="3e6bf22e-c058-28ca-37ea-355133586dd9")
public static String es_PE_FIELD_Advertisement_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e6bf22e-c058-28ca-37ea-355133586dd9")
public static final String FIELDNAME_Advertisement_CommentHelp="3e6bf22e-c058-28ca-37ea-355133586dd9";

@XendraTrl(Identifier="24098855-271a-84a1-e05d-2658d557a3a4")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24098855-271a-84a1-e05d-2658d557a3a4",
Synchronized="2017-08-05 16:56:31.0")
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
@XendraTrl(Identifier="13c718ca-7e8a-438b-aacd-2e13187af6e3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13c718ca-7e8a-438b-aacd-2e13187af6e3",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Image URL.
@param ImageURL URL of  image */
public void setImageURL (String ImageURL)
{
if (ImageURL != null && ImageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
ImageURL = ImageURL.substring(0,119);
}
set_Value (COLUMNNAME_ImageURL, ImageURL);
}
/** Get Image URL.
@return URL of  image */
public String getImageURL() 
{
String value = (String)get_Value(COLUMNNAME_ImageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6af6d69a-7a71-e39c-d9f3-4929cd42376f")
public static String es_PE_FIELD_Advertisement_ImageURL_Description="URL de la estructura de la imagen";

@XendraTrl(Identifier="6af6d69a-7a71-e39c-d9f3-4929cd42376f")
public static String es_PE_FIELD_Advertisement_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="6af6d69a-7a71-e39c-d9f3-4929cd42376f")
public static String es_PE_FIELD_Advertisement_ImageURL_Name="URL de la Imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6af6d69a-7a71-e39c-d9f3-4929cd42376f")
public static final String FIELDNAME_Advertisement_ImageURL="6af6d69a-7a71-e39c-d9f3-4929cd42376f";

@XendraTrl(Identifier="f510a29d-fa77-c340-d2c0-5f2e8c785212")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f510a29d-fa77-c340-d2c0-5f2e8c785212",
Synchronized="2017-08-05 16:56:31.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
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

@XendraTrl(Identifier="28e838de-bd0b-351c-fde4-e2f5d76ab26b")
public static String es_PE_FIELD_Advertisement_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="28e838de-bd0b-351c-fde4-e2f5d76ab26b")
public static String es_PE_FIELD_Advertisement_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="28e838de-bd0b-351c-fde4-e2f5d76ab26b")
public static String es_PE_FIELD_Advertisement_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28e838de-bd0b-351c-fde4-e2f5d76ab26b")
public static final String FIELDNAME_Advertisement_Self_Service="28e838de-bd0b-351c-fde4-e2f5d76ab26b";

@XendraTrl(Identifier="90a9d745-b76d-6251-2dd4-0ac2e9ebc3f7")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90a9d745-b76d-6251-2dd4-0ac2e9ebc3f7",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="13ff1350-3a2d-706c-cfd2-765a586a48a6")
public static String es_PE_FIELD_Advertisement_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="13ff1350-3a2d-706c-cfd2-765a586a48a6")
public static String es_PE_FIELD_Advertisement_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="13ff1350-3a2d-706c-cfd2-765a586a48a6")
public static String es_PE_FIELD_Advertisement_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="13ff1350-3a2d-706c-cfd2-765a586a48a6")
public static final String FIELDNAME_Advertisement_Name="13ff1350-3a2d-706c-cfd2-765a586a48a6";

@XendraTrl(Identifier="0d384e7c-7a43-9cad-bf3a-9dc7f57bbdea")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d384e7c-7a43-9cad-bf3a-9dc7f57bbdea",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="b075d139-e313-6d26-0182-7ec89a866c6a")
public static String es_PE_FIELD_Advertisement_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b075d139-e313-6d26-0182-7ec89a866c6a")
public static final String FIELDNAME_Advertisement_ProcessNow="b075d139-e313-6d26-0182-7ec89a866c6a";

@XendraTrl(Identifier="6f334c4c-751a-538c-af68-ee5f884dc937")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f334c4c-751a-538c-af68-ee5f884dc937",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** PublishStatus AD_Reference=500006fa-6215-9c7e-9fb1-23609093d16b */
public static final int PUBLISHSTATUS_AD_Reference_ID=310;
/** Set Publication Status.
@param PublishStatus Status of Publication */
public void setPublishStatus (String PublishStatus)
{
if (PublishStatus == null) throw new IllegalArgumentException ("PublishStatus is mandatory");
if (PublishStatus.equals(REF__PublishStatus.Released) || PublishStatus.equals(REF__PublishStatus.Test) || PublishStatus.equals(REF__PublishStatus.UnderRevision) || PublishStatus.equals(REF__PublishStatus.Void));
 else throw new IllegalArgumentException ("PublishStatus Invalid value - " + PublishStatus + " - Reference_ID=310 - R - T - U - V");
if (PublishStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
PublishStatus = PublishStatus.substring(0,0);
}
set_Value (COLUMNNAME_PublishStatus, PublishStatus);
}
/** Get Publication Status.
@return Status of Publication */
public String getPublishStatus() 
{
return (String)get_Value(COLUMNNAME_PublishStatus);
}

@XendraTrl(Identifier="e1cb2128-0836-c733-6dd7-95503325cd4e")
public static String es_PE_FIELD_Advertisement_PublicationStatus_Description="Estado de la Publicación";

@XendraTrl(Identifier="e1cb2128-0836-c733-6dd7-95503325cd4e")
public static String es_PE_FIELD_Advertisement_PublicationStatus_Help="Usado para documentación interna";

@XendraTrl(Identifier="e1cb2128-0836-c733-6dd7-95503325cd4e")
public static String es_PE_FIELD_Advertisement_PublicationStatus_Name="Estado de la Publicación";

@XendraField(AD_Column_ID="PublishStatus",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1cb2128-0836-c733-6dd7-95503325cd4e")
public static final String FIELDNAME_Advertisement_PublicationStatus="e1cb2128-0836-c733-6dd7-95503325cd4e";

@XendraTrl(Identifier="a77077d0-8a79-494a-9ff8-47e7aef7d5a7")
public static String es_PE_COLUMN_PublishStatus_Name="Estado de la Publicación";

@XendraColumn(AD_Element_ID="3045869a-c563-3800-cc78-c17e3bd83d38",ColumnName="PublishStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="500006fa-6215-9c7e-9fb1-23609093d16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a77077d0-8a79-494a-9ff8-47e7aef7d5a7",Synchronized="2017-08-05 16:56:31.0")
/** Column name PublishStatus */
public static final String COLUMNNAME_PublishStatus = "PublishStatus";
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

@XendraTrl(Identifier="e79b8c50-f998-8f90-a11a-a89c42adb5e4")
public static String es_PE_FIELD_Advertisement_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="e79b8c50-f998-8f90-a11a-a89c42adb5e4")
public static String es_PE_FIELD_Advertisement_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraTrl(Identifier="e79b8c50-f998-8f90-a11a-a89c42adb5e4")
public static String es_PE_FIELD_Advertisement_ValidFrom_Name="Válido Desde";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e79b8c50-f998-8f90-a11a-a89c42adb5e4")
public static final String FIELDNAME_Advertisement_ValidFrom="e79b8c50-f998-8f90-a11a-a89c42adb5e4";

@XendraTrl(Identifier="ba1e26a7-8981-e32d-e648-b33e9e85e568")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba1e26a7-8981-e32d-e648-b33e9e85e568",
Synchronized="2017-08-05 16:56:31.0")
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

@XendraTrl(Identifier="b07bad19-dbd4-bd26-e166-1c7a0f0c7eb4")
public static String es_PE_FIELD_Advertisement_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="b07bad19-dbd4-bd26-e166-1c7a0f0c7eb4")
public static String es_PE_FIELD_Advertisement_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraTrl(Identifier="b07bad19-dbd4-bd26-e166-1c7a0f0c7eb4")
public static String es_PE_FIELD_Advertisement_ValidTo_Name="Válido Hasta";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b07bad19-dbd4-bd26-e166-1c7a0f0c7eb4")
public static final String FIELDNAME_Advertisement_ValidTo="b07bad19-dbd4-bd26-e166-1c7a0f0c7eb4";

@XendraTrl(Identifier="a48da497-5bde-d56d-7090-8dcf71dfeadd")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a48da497-5bde-d56d-7090-8dcf71dfeadd",
Synchronized="2017-08-05 16:56:31.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (int Version)
{
set_Value (COLUMNNAME_Version, Integer.valueOf(Version));
}
/** Get Version.
@return Version of the table definition */
public int getVersion() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Version);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b665cea1-63ca-aa80-4eb3-18402bb753c8")
public static String es_PE_FIELD_Advertisement_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="b665cea1-63ca-aa80-4eb3-18402bb753c8")
public static String es_PE_FIELD_Advertisement_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="b665cea1-63ca-aa80-4eb3-18402bb753c8")
public static String es_PE_FIELD_Advertisement_Version_Name="Versión";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b665cea1-63ca-aa80-4eb3-18402bb753c8")
public static final String FIELDNAME_Advertisement_Version="b665cea1-63ca-aa80-4eb3-18402bb753c8";

@XendraTrl(Identifier="2c4eb481-2bf0-5932-83a2-dc62dd6743cb")
public static String es_PE_COLUMN_Version_Name="Versión";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c4eb481-2bf0-5932-83a2-dc62dd6743cb",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
/** Set Advertisement.
@param W_Advertisement_ID Web Advertisement */
public void setW_Advertisement_ID (int W_Advertisement_ID)
{
if (W_Advertisement_ID < 1) throw new IllegalArgumentException ("W_Advertisement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_Advertisement_ID, Integer.valueOf(W_Advertisement_ID));
}
/** Get Advertisement.
@return Web Advertisement */
public int getW_Advertisement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Advertisement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac7eb1f1-649a-5237-c867-a46b893d2f8c")
public static String es_PE_FIELD_Advertisement_Advertisement_Description="Anuncios Web";

@XendraTrl(Identifier="ac7eb1f1-649a-5237-c867-a46b893d2f8c")
public static String es_PE_FIELD_Advertisement_Advertisement_Help="Anuncios en la Web";

@XendraTrl(Identifier="ac7eb1f1-649a-5237-c867-a46b893d2f8c")
public static String es_PE_FIELD_Advertisement_Advertisement_Name="Anuncios";

@XendraField(AD_Column_ID="W_Advertisement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac7eb1f1-649a-5237-c867-a46b893d2f8c")
public static final String FIELDNAME_Advertisement_Advertisement="ac7eb1f1-649a-5237-c867-a46b893d2f8c";
/** Column name W_Advertisement_ID */
public static final String COLUMNNAME_W_Advertisement_ID = "W_Advertisement_ID";
/** Set Click Count.
@param W_ClickCount_ID Web Click Management */
public void setW_ClickCount_ID (int W_ClickCount_ID)
{
if (W_ClickCount_ID <= 0) set_Value (COLUMNNAME_W_ClickCount_ID, null);
 else 
set_Value (COLUMNNAME_W_ClickCount_ID, Integer.valueOf(W_ClickCount_ID));
}
/** Get Click Count.
@return Web Click Management */
public int getW_ClickCount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_ClickCount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5198b4f1-410b-5cd0-3805-2e3361a28066")
public static String es_PE_FIELD_Advertisement_ClickCount_Description="Gerencia de tecleo Web";

@XendraTrl(Identifier="5198b4f1-410b-5cd0-3805-2e3361a28066")
public static String es_PE_FIELD_Advertisement_ClickCount_Help="Gerencia de tecleo Web";

@XendraTrl(Identifier="5198b4f1-410b-5cd0-3805-2e3361a28066")
public static String es_PE_FIELD_Advertisement_ClickCount_Name="Contador Clic";

@XendraField(AD_Column_ID="W_ClickCount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5198b4f1-410b-5cd0-3805-2e3361a28066")
public static final String FIELDNAME_Advertisement_ClickCount="5198b4f1-410b-5cd0-3805-2e3361a28066";

@XendraTrl(Identifier="b3137703-9d72-a293-1dd0-30fca6795fa9")
public static String es_PE_COLUMN_W_ClickCount_ID_Name="Contador Clic";

@XendraColumn(AD_Element_ID="ad2d625c-b752-7a9d-82b0-61c2aea4dc5a",ColumnName="W_ClickCount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3137703-9d72-a293-1dd0-30fca6795fa9",
Synchronized="2017-08-05 16:56:31.0")
/** Column name W_ClickCount_ID */
public static final String COLUMNNAME_W_ClickCount_ID = "W_ClickCount_ID";
/** Set Counter Count.
@param W_CounterCount_ID Web Counter Count Management */
public void setW_CounterCount_ID (int W_CounterCount_ID)
{
if (W_CounterCount_ID <= 0) set_Value (COLUMNNAME_W_CounterCount_ID, null);
 else 
set_Value (COLUMNNAME_W_CounterCount_ID, Integer.valueOf(W_CounterCount_ID));
}
/** Get Counter Count.
@return Web Counter Count Management */
public int getW_CounterCount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_CounterCount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6ec81153-c0ad-53b2-69f6-51a9759f0110")
public static String es_PE_FIELD_Advertisement_CounterCount_Description="Gerencia contraria de la cuenta Web";

@XendraTrl(Identifier="6ec81153-c0ad-53b2-69f6-51a9759f0110")
public static String es_PE_FIELD_Advertisement_CounterCount_Help="Información de la cuenta contaria en Web";

@XendraTrl(Identifier="6ec81153-c0ad-53b2-69f6-51a9759f0110")
public static String es_PE_FIELD_Advertisement_CounterCount_Name="Cuenta Contraria";

@XendraField(AD_Column_ID="W_CounterCount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ec81153-c0ad-53b2-69f6-51a9759f0110")
public static final String FIELDNAME_Advertisement_CounterCount="6ec81153-c0ad-53b2-69f6-51a9759f0110";

@XendraTrl(Identifier="f66de615-b93b-12c7-6e26-e580ff9926d1")
public static String es_PE_COLUMN_W_CounterCount_ID_Name="Cuenta Contraria";

@XendraColumn(AD_Element_ID="9676fb33-2d34-d665-ade0-44452ee92bf4",ColumnName="W_CounterCount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f66de615-b93b-12c7-6e26-e580ff9926d1",
Synchronized="2017-08-05 16:56:31.0")
/** Column name W_CounterCount_ID */
public static final String COLUMNNAME_W_CounterCount_ID = "W_CounterCount_ID";
/** Set Web Parameter 1.
@param WebParam1 Web Site Parameter 1 (default: header image) */
public void setWebParam1 (String WebParam1)
{
if (WebParam1 != null && WebParam1.length() > 2000)
{
log.warning("Length > 2000 - truncated");
WebParam1 = WebParam1.substring(0,1999);
}
set_Value (COLUMNNAME_WebParam1, WebParam1);
}
/** Get Web Parameter 1.
@return Web Site Parameter 1 (default: header image) */
public String getWebParam1() 
{
String value = (String)get_Value(COLUMNNAME_WebParam1);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="394513ab-acb6-1e7f-5bae-e2a359bd1d2a")
public static String es_PE_FIELD_Advertisement_WebParameter_Description="Sitio Web Parametro 1";

@XendraTrl(Identifier="394513ab-acb6-1e7f-5bae-e2a359bd1d2a")
public static String es_PE_FIELD_Advertisement_WebParameter_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam1";

@XendraTrl(Identifier="394513ab-acb6-1e7f-5bae-e2a359bd1d2a")
public static String es_PE_FIELD_Advertisement_WebParameter_Name="Web Socio 1";

@XendraField(AD_Column_ID="WebParam1",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="394513ab-acb6-1e7f-5bae-e2a359bd1d2a")
public static final String FIELDNAME_Advertisement_WebParameter="394513ab-acb6-1e7f-5bae-e2a359bd1d2a";

@XendraTrl(Identifier="4e84540f-aa57-3c45-fcfa-e87ba1a9a866")
public static String es_PE_COLUMN_WebParam1_Name="Web Socio 1";

@XendraColumn(AD_Element_ID="f55d289a-d177-3e1f-4081-c72369bb0e35",ColumnName="WebParam1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e84540f-aa57-3c45-fcfa-e87ba1a9a866",
Synchronized="2017-08-05 16:56:31.0")
/** Column name WebParam1 */
public static final String COLUMNNAME_WebParam1 = "WebParam1";
/** Set Web Parameter 2.
@param WebParam2 Web Site Parameter 2 (default index page) */
public void setWebParam2 (String WebParam2)
{
if (WebParam2 != null && WebParam2.length() > 2000)
{
log.warning("Length > 2000 - truncated");
WebParam2 = WebParam2.substring(0,1999);
}
set_Value (COLUMNNAME_WebParam2, WebParam2);
}
/** Get Web Parameter 2.
@return Web Site Parameter 2 (default index page) */
public String getWebParam2() 
{
String value = (String)get_Value(COLUMNNAME_WebParam2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="11e77003-4e84-78ef-c731-21db0f14c9a5")
public static String es_PE_FIELD_Advertisement_WebParameter22_Description="Sitio Web parametro 2";

@XendraTrl(Identifier="11e77003-4e84-78ef-c731-21db0f14c9a5")
public static String es_PE_FIELD_Advertisement_WebParameter22_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam2";

@XendraTrl(Identifier="11e77003-4e84-78ef-c731-21db0f14c9a5")
public static String es_PE_FIELD_Advertisement_WebParameter22_Name="Web Socio 2";

@XendraField(AD_Column_ID="WebParam2",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11e77003-4e84-78ef-c731-21db0f14c9a5")
public static final String FIELDNAME_Advertisement_WebParameter22="11e77003-4e84-78ef-c731-21db0f14c9a5";

@XendraTrl(Identifier="d9f26934-a781-f254-7fb0-3dd4d4a0eee7")
public static String es_PE_COLUMN_WebParam2_Name="Web Socio 2";

@XendraColumn(AD_Element_ID="a77cbc18-6000-9c67-27e5-5a09e4335fc1",ColumnName="WebParam2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9f26934-a781-f254-7fb0-3dd4d4a0eee7",
Synchronized="2017-08-05 16:56:31.0")
/** Column name WebParam2 */
public static final String COLUMNNAME_WebParam2 = "WebParam2";
/** Set Web Parameter 3.
@param WebParam3 Web Site Parameter 3 (default left - menu) */
public void setWebParam3 (String WebParam3)
{
if (WebParam3 != null && WebParam3.length() > 2000)
{
log.warning("Length > 2000 - truncated");
WebParam3 = WebParam3.substring(0,1999);
}
set_Value (COLUMNNAME_WebParam3, WebParam3);
}
/** Get Web Parameter 3.
@return Web Site Parameter 3 (default left - menu) */
public String getWebParam3() 
{
String value = (String)get_Value(COLUMNNAME_WebParam3);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aab36ac0-a3ea-20a6-22ac-c8bde0462b02")
public static String es_PE_FIELD_Advertisement_WebParameter33_Description="Sitio Web parametro 3";

@XendraTrl(Identifier="aab36ac0-a3ea-20a6-22ac-c8bde0462b02")
public static String es_PE_FIELD_Advertisement_WebParameter33_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam3";

@XendraTrl(Identifier="aab36ac0-a3ea-20a6-22ac-c8bde0462b02")
public static String es_PE_FIELD_Advertisement_WebParameter33_Name="Web Socio 3";

@XendraField(AD_Column_ID="WebParam3",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aab36ac0-a3ea-20a6-22ac-c8bde0462b02")
public static final String FIELDNAME_Advertisement_WebParameter33="aab36ac0-a3ea-20a6-22ac-c8bde0462b02";

@XendraTrl(Identifier="f655d5f0-5cdb-680b-b770-89017af247e4")
public static String es_PE_COLUMN_WebParam3_Name="Web Socio 3";

@XendraColumn(AD_Element_ID="9fd8e236-b3d0-fa8b-8922-15928708a71e",ColumnName="WebParam3",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f655d5f0-5cdb-680b-b770-89017af247e4",
Synchronized="2017-08-05 16:56:31.0")
/** Column name WebParam3 */
public static final String COLUMNNAME_WebParam3 = "WebParam3";
/** Set Web Parameter 4.
@param WebParam4 Web Site Parameter 4 (default footer left) */
public void setWebParam4 (String WebParam4)
{
if (WebParam4 != null && WebParam4.length() > 2000)
{
log.warning("Length > 2000 - truncated");
WebParam4 = WebParam4.substring(0,1999);
}
set_Value (COLUMNNAME_WebParam4, WebParam4);
}
/** Get Web Parameter 4.
@return Web Site Parameter 4 (default footer left) */
public String getWebParam4() 
{
String value = (String)get_Value(COLUMNNAME_WebParam4);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="96757f74-3bd2-7d19-82ae-5b58fd4f553d")
public static String es_PE_FIELD_Advertisement_WebParameter44_Description="Sitio Web parametro 4";

@XendraTrl(Identifier="96757f74-3bd2-7d19-82ae-5b58fd4f553d")
public static String es_PE_FIELD_Advertisement_WebParameter44_Help="El parámetro se podía utilizar en la página de JSP para las variables como insignias, contraseñas, URLs ó bloques enteros de hotmail. El acceso está vía ctx.webParam4";

@XendraTrl(Identifier="96757f74-3bd2-7d19-82ae-5b58fd4f553d")
public static String es_PE_FIELD_Advertisement_WebParameter44_Name="Web Socio 4";

@XendraField(AD_Column_ID="WebParam4",IsCentrallyMaintained=true,
AD_Tab_ID="f9b26fa7-2955-338e-d52c-e04f664dd7c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="96757f74-3bd2-7d19-82ae-5b58fd4f553d")
public static final String FIELDNAME_Advertisement_WebParameter44="96757f74-3bd2-7d19-82ae-5b58fd4f553d";

@XendraTrl(Identifier="c491718a-0d20-570a-5516-bc9a5cc781d8")
public static String es_PE_COLUMN_WebParam4_Name="Web Socio 4";

@XendraColumn(AD_Element_ID="8dc7a841-f5c6-5982-1443-d3eb2247a696",ColumnName="WebParam4",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c491718a-0d20-570a-5516-bc9a5cc781d8",
Synchronized="2017-08-05 16:56:31.0")
/** Column name WebParam4 */
public static final String COLUMNNAME_WebParam4 = "WebParam4";
}
