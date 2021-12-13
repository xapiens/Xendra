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
/** Generated Model for GL_BookFile
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_BookFile extends PO
{
/** Standard Constructor
@param ctx context
@param GL_BookFile_ID id
@param trxName transaction
*/
public X_GL_BookFile (Properties ctx, int GL_BookFile_ID, String trxName)
{
super (ctx, GL_BookFile_ID, trxName);
/** if (GL_BookFile_ID == 0)
{
setGL_BookFIle_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_BookFile (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000320 */
public static int Table_ID=MTable.getTable_ID("GL_BookFile");

@XendraTrl(Identifier="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb")
public static String es_PE_TAB_GL_BookFile_Name="Estructura del Archivo del Libro";

@XendraTab(Name="GL_BookFile",Description="",Help="",
AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",Synchronized="2016-09-19 11:33:25.0")
public static final String TABNAME_GL_BookFile="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb";

@XendraTrl(Identifier="ebe9c016-03c2-4c60-90a2-98c1a7698c37")
public static String es_PE_TABLE_GL_BookFile_Name="GL Book File";

@XendraTable(Name="GL Book File",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="GL_BookFile",
AccessLevel="3",AD_Window_ID="5d03174a-432f-b3b2-6275-87031ef6e308",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="ebe9c016-03c2-4c60-90a2-98c1a7698c37",Synchronized="2020-03-03 21:37:54.0")
/** TableName=GL_BookFile */
public static final String Table_Name="GL_BookFile";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_BookFile");

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
    Table_ID = MTable.getTable_ID("GL_BookFile");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_BookFile[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID <= 0) set_Value (COLUMNNAME_AD_Reference_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08258b85-ac2b-4cbf-b6d2-984b28be217c")
public static String es_PE_FIELD_GL_BookFile_Reference_Name="Referencia";

@XendraTrl(Identifier="08258b85-ac2b-4cbf-b6d2-984b28be217c")
public static String es_PE_FIELD_GL_BookFile_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="08258b85-ac2b-4cbf-b6d2-984b28be217c")
public static String es_PE_FIELD_GL_BookFile_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="08258b85-ac2b-4cbf-b6d2-984b28be217c")
public static final String FIELDNAME_GL_BookFile_Reference="08258b85-ac2b-4cbf-b6d2-984b28be217c";

@XendraTrl(Identifier="1f5c91aa-30f6-48d9-aa82-13cca16b4a45")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f5c91aa-30f6-48d9-aa82-13cca16b4a45",
Synchronized="2019-08-30 22:22:31.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="18de70d8-63ac-4846-b515-ec1f9eed3063")
public static String es_PE_FIELD_GL_BookFile_ReferenceKey_Name="Valor de Referencia";

@XendraTrl(Identifier="18de70d8-63ac-4846-b515-ec1f9eed3063")
public static String es_PE_FIELD_GL_BookFile_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="18de70d8-63ac-4846-b515-ec1f9eed3063")
public static String es_PE_FIELD_GL_BookFile_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="18de70d8-63ac-4846-b515-ec1f9eed3063")
public static final String FIELDNAME_GL_BookFile_ReferenceKey="18de70d8-63ac-4846-b515-ec1f9eed3063";

@XendraTrl(Identifier="f0ae3599-1c05-40fa-a7cb-4d47ed419d55")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",
AD_Val_Rule_ID="147ddeef-c150-2ac8-67e8-346cc5225ef4",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0ae3599-1c05-40fa-a7cb-4d47ed419d55",
Synchronized="2019-08-30 22:22:31.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
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

@XendraTrl(Identifier="e65d416b-33b1-48cf-89c4-1a82c6e55e0e")
public static String es_PE_FIELD_GL_BookFile_Description_Name="Descripción";

@XendraTrl(Identifier="e65d416b-33b1-48cf-89c4-1a82c6e55e0e")
public static String es_PE_FIELD_GL_BookFile_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="e65d416b-33b1-48cf-89c4-1a82c6e55e0e")
public static String es_PE_FIELD_GL_BookFile_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="e65d416b-33b1-48cf-89c4-1a82c6e55e0e")
public static final String FIELDNAME_GL_BookFile_Description="e65d416b-33b1-48cf-89c4-1a82c6e55e0e";

@XendraTrl(Identifier="76eb46fe-6b02-4b3e-85ef-79172d6455d5")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76eb46fe-6b02-4b3e-85ef-79172d6455d5",
Synchronized="2019-08-30 22:22:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set GL Book File.
@param GL_BookFIle_ID GL Book File */
public void setGL_BookFIle_ID (int GL_BookFIle_ID)
{
if (GL_BookFIle_ID < 1) throw new IllegalArgumentException ("GL_BookFIle_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_BookFIle_ID, Integer.valueOf(GL_BookFIle_ID));
}
/** Get GL Book File.
@return GL Book File */
public int getGL_BookFIle_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_BookFIle_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7745d782-6e69-4f22-ad58-45ed0fd70c54")
public static String es_PE_FIELD_GL_BookFile_GLBookFile_Name="GL Book File";

@XendraField(AD_Column_ID="GL_BookFIle_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="7745d782-6e69-4f22-ad58-45ed0fd70c54")
public static final String FIELDNAME_GL_BookFile_GLBookFile="7745d782-6e69-4f22-ad58-45ed0fd70c54";
/** Column name GL_BookFIle_ID */
public static final String COLUMNNAME_GL_BookFIle_ID = "GL_BookFIle_ID";
/** Set Book.
@param GL_Book_ID Book */
public void setGL_Book_ID (int GL_Book_ID)
{
if (GL_Book_ID <= 0) set_ValueNoCheck (COLUMNNAME_GL_Book_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_GL_Book_ID, Integer.valueOf(GL_Book_ID));
}
/** Get Book.
@return Book */
public int getGL_Book_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Book_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8777f747-6c81-4392-a174-0a7fee9eb1e0")
public static String es_PE_FIELD_GL_BookFile_Book_Name="Book";

@XendraField(AD_Column_ID="GL_Book_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="8777f747-6c81-4392-a174-0a7fee9eb1e0")
public static final String FIELDNAME_GL_BookFile_Book="8777f747-6c81-4392-a174-0a7fee9eb1e0";

@XendraTrl(Identifier="b2734531-cc2b-407d-a8de-c250c20ff42d")
public static String es_PE_COLUMN_GL_Book_ID_Name="Book";

@XendraColumn(AD_Element_ID="ea1aa938-283c-a393-bca4-7ed1e97f2745",ColumnName="GL_Book_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2734531-cc2b-407d-a8de-c250c20ff42d",
Synchronized="2019-08-30 22:22:31.0")
/** Column name GL_Book_ID */
public static final String COLUMNNAME_GL_Book_ID = "GL_Book_ID";
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
@XendraTrl(Identifier="c370e9b8-1ddc-49dd-ac63-6b8376c39565")
public static String es_PE_FIELD_GL_BookFile_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="c370e9b8-1ddc-49dd-ac63-6b8376c39565")
public static final String FIELDNAME_GL_BookFile_Identifier="c370e9b8-1ddc-49dd-ac63-6b8376c39565";

@XendraTrl(Identifier="be6bd860-9549-4933-911e-32090c5d666a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be6bd860-9549-4933-911e-32090c5d666a",
Synchronized="2019-08-30 22:22:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 20)
{
log.warning("Length > 20 - truncated");
Name = Name.substring(0,19);
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

@XendraTrl(Identifier="60adc524-9ad2-46aa-a9eb-f46e4a1ebe90")
public static String es_PE_FIELD_GL_BookFile_Name_Name="Nombre";

@XendraTrl(Identifier="60adc524-9ad2-46aa-a9eb-f46e4a1ebe90")
public static String es_PE_FIELD_GL_BookFile_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="60adc524-9ad2-46aa-a9eb-f46e4a1ebe90")
public static String es_PE_FIELD_GL_BookFile_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="60adc524-9ad2-46aa-a9eb-f46e4a1ebe90")
public static final String FIELDNAME_GL_BookFile_Name="60adc524-9ad2-46aa-a9eb-f46e4a1ebe90";

@XendraTrl(Identifier="341dc12a-2206-49d3-9330-b054a018d692")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="341dc12a-2206-49d3-9330-b054a018d692",
Synchronized="2019-08-30 22:22:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="615cefcb-5959-480d-a839-3caf8877dcd1")
public static String es_PE_FIELD_GL_BookFile_Sequence_Name="Secuencia";

@XendraTrl(Identifier="615cefcb-5959-480d-a839-3caf8877dcd1")
public static String es_PE_FIELD_GL_BookFile_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="615cefcb-5959-480d-a839-3caf8877dcd1")
public static String es_PE_FIELD_GL_BookFile_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="e882bdb6-175b-44cc-9b6a-f25bfbddd5bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-26 18:17:06.0",
Identifier="615cefcb-5959-480d-a839-3caf8877dcd1")
public static final String FIELDNAME_GL_BookFile_Sequence="615cefcb-5959-480d-a839-3caf8877dcd1";

@XendraTrl(Identifier="a2ed0bb7-3054-4b22-856f-a40fa43a72c9")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2ed0bb7-3054-4b22-856f-a40fa43a72c9",
Synchronized="2019-08-30 22:22:31.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
