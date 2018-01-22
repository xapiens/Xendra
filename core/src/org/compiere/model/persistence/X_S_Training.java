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
/** Generated Model for S_Training
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_Training extends PO
{
/** Standard Constructor
@param ctx context
@param S_Training_ID id
@param trxName transaction
*/
public X_S_Training (Properties ctx, int S_Training_ID, String trxName)
{
super (ctx, S_Training_ID, trxName);
/** if (S_Training_ID == 0)
{
setC_TaxCategory_ID (0);
setC_UOM_ID (0);
setM_Product_Category_ID (0);
setName (null);
setS_Training_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_Training (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=538 */
public static int Table_ID=MTable.getTable_ID("S_Training");

@XendraTrl(Identifier="067eeed9-4db9-8547-680c-8cbbf4aa2d13")
public static String es_PE_TAB_Training_Description="Entrenamiento repetido";

@XendraTrl(Identifier="067eeed9-4db9-8547-680c-8cbbf4aa2d13")
public static String es_PE_TAB_Training_Name="Entrenamiento ";

@XendraTrl(Identifier="067eeed9-4db9-8547-680c-8cbbf4aa2d13")
public static String es_PE_TAB_Training_Help="El entrenamiento puede tener clases reales múltiples. Las nuevas clases se crean aquí.";

@XendraTab(Name="Training",Description="Repeated Training",
Help="The training may have multiple actual classes. New Classes are created here.",
AD_Window_ID="14c204f8-5dfb-ff0b-b3f7-8445e3bd66d5",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="067eeed9-4db9-8547-680c-8cbbf4aa2d13",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Training="067eeed9-4db9-8547-680c-8cbbf4aa2d13";

@XendraTrl(Identifier="984340f2-81ec-9c67-501a-3afb7bbd0024")
public static String es_PE_TABLE_S_Training_Name="Entrenamiento";

@XendraTable(Name="Training",Description="Repeated Training",Help="",TableName="S_Training",
AccessLevel="3",AD_Window_ID="14c204f8-5dfb-ff0b-b3f7-8445e3bd66d5",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.services",
Identifier="984340f2-81ec-9c67-501a-3afb7bbd0024",Synchronized="2017-08-16 11:44:16.0")
/** TableName=S_Training */
public static final String Table_Name="S_Training";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_Training");

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
    Table_ID = MTable.getTable_ID("S_Training");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_Training[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tax Category.
@param C_TaxCategory_ID Tax Category */
public void setC_TaxCategory_ID (int C_TaxCategory_ID)
{
if (C_TaxCategory_ID < 1) throw new IllegalArgumentException ("C_TaxCategory_ID is mandatory.");
set_Value (COLUMNNAME_C_TaxCategory_ID, Integer.valueOf(C_TaxCategory_ID));
}
/** Get Tax Category.
@return Tax Category */
public int getC_TaxCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab8b6afb-622a-476e-d37d-fdba7f8b5bcb")
public static String es_PE_FIELD_Training_TaxCategory_Description="Categoría del Impuesto";

@XendraTrl(Identifier="ab8b6afb-622a-476e-d37d-fdba7f8b5bcb")
public static String es_PE_FIELD_Training_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="ab8b6afb-622a-476e-d37d-fdba7f8b5bcb")
public static String es_PE_FIELD_Training_TaxCategory_Name="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab8b6afb-622a-476e-d37d-fdba7f8b5bcb")
public static final String FIELDNAME_Training_TaxCategory="ab8b6afb-622a-476e-d37d-fdba7f8b5bcb";

@XendraTrl(Identifier="7a1badb8-7140-8eb2-385c-a10ca71ebdb9")
public static String es_PE_COLUMN_C_TaxCategory_ID_Name="Categoría del Impuesto";

@XendraColumn(AD_Element_ID="d52d1891-09d1-cd05-f9fa-46c801a8d9a6",ColumnName="C_TaxCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a1badb8-7140-8eb2-385c-a10ca71ebdb9",
Synchronized="2017-08-05 16:56:21.0")
/** Column name C_TaxCategory_ID */
public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa78359f-cb8f-e436-dac5-d0a11c32f523")
public static String es_PE_FIELD_Training_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="fa78359f-cb8f-e436-dac5-d0a11c32f523")
public static String es_PE_FIELD_Training_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="fa78359f-cb8f-e436-dac5-d0a11c32f523")
public static String es_PE_FIELD_Training_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fa78359f-cb8f-e436-dac5-d0a11c32f523")
public static final String FIELDNAME_Training_UOM="fa78359f-cb8f-e436-dac5-d0a11c32f523";

@XendraTrl(Identifier="4dadf08e-1216-62dd-d105-45752e511946")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4dadf08e-1216-62dd-d105-45752e511946",
Synchronized="2017-08-05 16:56:21.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="902d5fd5-3859-c0c5-ab0a-f2362cd799a4")
public static String es_PE_FIELD_Training_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="902d5fd5-3859-c0c5-ab0a-f2362cd799a4")
public static String es_PE_FIELD_Training_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="902d5fd5-3859-c0c5-ab0a-f2362cd799a4")
public static String es_PE_FIELD_Training_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="902d5fd5-3859-c0c5-ab0a-f2362cd799a4")
public static final String FIELDNAME_Training_Description="902d5fd5-3859-c0c5-ab0a-f2362cd799a4";

@XendraTrl(Identifier="89875ba5-2ca2-df0e-2da6-461b21435d44")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89875ba5-2ca2-df0e-2da6-461b21435d44",
Synchronized="2017-08-05 16:56:21.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Description URL.
@param DescriptionURL URL for the DESCRIPTION */
public void setDescriptionURL (String DescriptionURL)
{
if (DescriptionURL != null && DescriptionURL.length() > 120)
{
log.warning("Length > 120 - truncated");
DescriptionURL = DescriptionURL.substring(0,119);
}
set_Value (COLUMNNAME_DescriptionURL, DescriptionURL);
}
/** Get Description URL.
@return URL for the DESCRIPTION */
public String getDescriptionURL() 
{
String value = (String)get_Value(COLUMNNAME_DescriptionURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="36d14611-0991-16be-4c5e-7a7f63d25d7e")
public static String es_PE_FIELD_Training_DescriptionURL_Description="Descripción de la URL";

@XendraTrl(Identifier="36d14611-0991-16be-4c5e-7a7f63d25d7e")
public static String es_PE_FIELD_Training_DescriptionURL_Name="Descripción URL";

@XendraField(AD_Column_ID="DescriptionURL",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36d14611-0991-16be-4c5e-7a7f63d25d7e")
public static final String FIELDNAME_Training_DescriptionURL="36d14611-0991-16be-4c5e-7a7f63d25d7e";

@XendraTrl(Identifier="164c87f6-1b88-9f12-aee3-dff91216dbab")
public static String es_PE_COLUMN_DescriptionURL_Name="Descripción URL";

@XendraColumn(AD_Element_ID="22f9040f-e220-0cf5-b1a0-c26babbe91f1",ColumnName="DescriptionURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="164c87f6-1b88-9f12-aee3-dff91216dbab",
Synchronized="2017-08-05 16:56:21.0")
/** Column name DescriptionURL */
public static final String COLUMNNAME_DescriptionURL = "DescriptionURL";
/** Set Document Note.
@param DocumentNote Additional information for a Document */
public void setDocumentNote (String DocumentNote)
{
set_Value (COLUMNNAME_DocumentNote, DocumentNote);
}
/** Get Document Note.
@return Additional information for a Document */
public String getDocumentNote() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="77f553e1-d042-d146-a582-39e37c72b397")
public static String es_PE_FIELD_Training_DocumentNote_Description="Información adicional para un documento";

@XendraTrl(Identifier="77f553e1-d042-d146-a582-39e37c72b397")
public static String es_PE_FIELD_Training_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="77f553e1-d042-d146-a582-39e37c72b397")
public static String es_PE_FIELD_Training_DocumentNote_Name="Nota de Documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77f553e1-d042-d146-a582-39e37c72b397")
public static final String FIELDNAME_Training_DocumentNote="77f553e1-d042-d146-a582-39e37c72b397";

@XendraTrl(Identifier="b3f3346a-8e35-51cd-cef6-ddbf9825a9ff")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3f3346a-8e35-51cd-cef6-ddbf9825a9ff",
Synchronized="2017-08-05 16:56:21.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";
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

@XendraTrl(Identifier="ec94c798-1726-738a-ec05-0580988d99ce")
public static String es_PE_FIELD_Training_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="ec94c798-1726-738a-ec05-0580988d99ce")
public static String es_PE_FIELD_Training_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="ec94c798-1726-738a-ec05-0580988d99ce")
public static String es_PE_FIELD_Training_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec94c798-1726-738a-ec05-0580988d99ce")
public static final String FIELDNAME_Training_CommentHelp="ec94c798-1726-738a-ec05-0580988d99ce";

@XendraTrl(Identifier="946c655b-710c-4e9b-af96-73ae31b23633")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="946c655b-710c-4e9b-af96-73ae31b23633",
Synchronized="2017-08-05 16:56:21.0")
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
@XendraTrl(Identifier="72230874-6e6a-4941-9963-14f026f4f7e0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72230874-6e6a-4941-9963-14f026f4f7e0",
Synchronized="2017-08-05 16:56:21.0")
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
@XendraTrl(Identifier="e39e6e56-b791-85ed-32a2-6ba464928ed3")
public static String es_PE_FIELD_Training_ImageURL_Description="URL de la estructura de la imagen";

@XendraTrl(Identifier="e39e6e56-b791-85ed-32a2-6ba464928ed3")
public static String es_PE_FIELD_Training_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraTrl(Identifier="e39e6e56-b791-85ed-32a2-6ba464928ed3")
public static String es_PE_FIELD_Training_ImageURL_Name="URL de la Imagen";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e39e6e56-b791-85ed-32a2-6ba464928ed3")
public static final String FIELDNAME_Training_ImageURL="e39e6e56-b791-85ed-32a2-6ba464928ed3";

@XendraTrl(Identifier="ba1412af-9877-a2b5-d32f-195a435eafe1")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba1412af-9877-a2b5-d32f-195a435eafe1",
Synchronized="2017-08-05 16:56:21.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID < 1) throw new IllegalArgumentException ("M_Product_Category_ID is mandatory.");
set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d1076c25-4061-cbbc-52d5-7a387259d565")
public static String es_PE_FIELD_Training_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="d1076c25-4061-cbbc-52d5-7a387259d565")
public static String es_PE_FIELD_Training_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraTrl(Identifier="d1076c25-4061-cbbc-52d5-7a387259d565")
public static String es_PE_FIELD_Training_ProductCategory_Name="Categoría del Producto";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1076c25-4061-cbbc-52d5-7a387259d565")
public static final String FIELDNAME_Training_ProductCategory="d1076c25-4061-cbbc-52d5-7a387259d565";

@XendraTrl(Identifier="0d4f72d6-8600-d8ef-2b74-a2c140529b3d")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0d4f72d6-8600-d8ef-2b74-a2c140529b3d",Synchronized="2017-08-05 16:56:21.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="f6f6cf96-e7e5-9195-d5b5-2c46ece330cc")
public static String es_PE_FIELD_Training_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f6f6cf96-e7e5-9195-d5b5-2c46ece330cc")
public static String es_PE_FIELD_Training_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="f6f6cf96-e7e5-9195-d5b5-2c46ece330cc")
public static String es_PE_FIELD_Training_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f6f6cf96-e7e5-9195-d5b5-2c46ece330cc")
public static final String FIELDNAME_Training_Name="f6f6cf96-e7e5-9195-d5b5-2c46ece330cc";

@XendraTrl(Identifier="fa1d9a68-8eaf-8e2a-b243-3703b3f7c1b5")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa1d9a68-8eaf-8e2a-b243-3703b3f7c1b5",
Synchronized="2017-08-05 16:56:21.0")
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

@XendraTrl(Identifier="0dd4ef53-57a0-8cd1-bce5-83a69a453af0")
public static String es_PE_FIELD_Training_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dd4ef53-57a0-8cd1-bce5-83a69a453af0")
public static final String FIELDNAME_Training_ProcessNow="0dd4ef53-57a0-8cd1-bce5-83a69a453af0";

@XendraTrl(Identifier="d949ff35-580c-5522-2319-e7310a6a6e1d")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d949ff35-580c-5522-2319-e7310a6a6e1d",
Synchronized="2017-08-05 16:56:21.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Training.
@param S_Training_ID Repeated Training */
public void setS_Training_ID (int S_Training_ID)
{
if (S_Training_ID < 1) throw new IllegalArgumentException ("S_Training_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_Training_ID, Integer.valueOf(S_Training_ID));
}
/** Get Training.
@return Repeated Training */
public int getS_Training_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Training_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6998d0fb-ef35-de7a-b863-5cd4ff085c2b")
public static String es_PE_FIELD_Training_Training_Description="Entrenamiento repetido";

@XendraTrl(Identifier="6998d0fb-ef35-de7a-b863-5cd4ff085c2b")
public static String es_PE_FIELD_Training_Training_Help="El entrenamiento puede tener clases reales múltiples";

@XendraTrl(Identifier="6998d0fb-ef35-de7a-b863-5cd4ff085c2b")
public static String es_PE_FIELD_Training_Training_Name="Entrenamiento";

@XendraField(AD_Column_ID="S_Training_ID",IsCentrallyMaintained=true,
AD_Tab_ID="067eeed9-4db9-8547-680c-8cbbf4aa2d13",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6998d0fb-ef35-de7a-b863-5cd4ff085c2b")
public static final String FIELDNAME_Training_Training="6998d0fb-ef35-de7a-b863-5cd4ff085c2b";
/** Column name S_Training_ID */
public static final String COLUMNNAME_S_Training_ID = "S_Training_ID";
}
