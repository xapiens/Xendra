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
/** Generated Model for M_RMAType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_RMAType extends PO
{
/** Standard Constructor
@param ctx context
@param M_RMAType_ID id
@param trxName transaction
*/
public X_M_RMAType (Properties ctx, int M_RMAType_ID, String trxName)
{
super (ctx, M_RMAType_ID, trxName);
/** if (M_RMAType_ID == 0)
{
setM_RMAType_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_RMAType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=729 */
public static int Table_ID=MTable.getTable_ID("M_RMAType");

@XendraTrl(Identifier="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec")
public static String es_PE_TAB_RMAType_Description="Tipo Autorización para Devoluciones de Material";

@XendraTrl(Identifier="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec")
public static String es_PE_TAB_RMAType_Name="Tipo de Devolución de Material";

@XendraTrl(Identifier="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec")
public static String es_PE_TAB_RMAType_Help="Tipo Autorización para Devoluciones de Material";

@XendraTab(Name="RMA Type",Description="Return Material Authorization Type",
Help="Maintain the types of RMA",AD_Window_ID="5ada075a-0c39-e2ae-a880-054dfcd96cb5",SeqNo=10,
TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RMAType="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec";

@XendraTrl(Identifier="d772c7b0-e137-276f-d5c1-cff679871c66")
public static String es_PE_TABLE_M_RMAType_Name="Tipo de ADM (RMA)";

@XendraTable(Name="RMA Type",Description="Return Material Authorization Type",Help="",
TableName="M_RMAType",AccessLevel="2",AD_Window_ID="5ada075a-0c39-e2ae-a880-054dfcd96cb5",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="d772c7b0-e137-276f-d5c1-cff679871c66",Synchronized="2017-08-16 11:43:35.0")
/** TableName=M_RMAType */
public static final String Table_Name="M_RMAType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_RMAType");

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
    Table_ID = MTable.getTable_ID("M_RMAType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_RMAType[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="637b347b-a500-e398-b171-7045853d04cb")
public static String es_PE_FIELD_RMAType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="637b347b-a500-e398-b171-7045853d04cb")
public static String es_PE_FIELD_RMAType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="637b347b-a500-e398-b171-7045853d04cb")
public static String es_PE_FIELD_RMAType_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="637b347b-a500-e398-b171-7045853d04cb")
public static final String FIELDNAME_RMAType_Description="637b347b-a500-e398-b171-7045853d04cb";

@XendraTrl(Identifier="933d99e8-207d-a703-32b8-40b698d8e7da")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="933d99e8-207d-a703-32b8-40b698d8e7da",
Synchronized="2017-08-05 16:55:33.0")
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

@XendraTrl(Identifier="99170613-902c-d133-65ff-f6a4bf46b873")
public static String es_PE_FIELD_RMAType_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="99170613-902c-d133-65ff-f6a4bf46b873")
public static String es_PE_FIELD_RMAType_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="99170613-902c-d133-65ff-f6a4bf46b873")
public static String es_PE_FIELD_RMAType_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="99170613-902c-d133-65ff-f6a4bf46b873")
public static final String FIELDNAME_RMAType_CommentHelp="99170613-902c-d133-65ff-f6a4bf46b873";

@XendraTrl(Identifier="b5f22650-a8f7-11c6-68b6-41d203fe97fe")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5f22650-a8f7-11c6-68b6-41d203fe97fe",
Synchronized="2017-08-05 16:55:33.0")
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
@XendraTrl(Identifier="1e695391-e8cc-4c54-83d6-cdaaf951678f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e695391-e8cc-4c54-83d6-cdaaf951678f",
Synchronized="2017-08-05 16:55:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set RMA Type.
@param M_RMAType_ID Return Material Authorization Type */
public void setM_RMAType_ID (int M_RMAType_ID)
{
if (M_RMAType_ID < 1) throw new IllegalArgumentException ("M_RMAType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_RMAType_ID, Integer.valueOf(M_RMAType_ID));
}
/** Get RMA Type.
@return Return Material Authorization Type */
public int getM_RMAType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMAType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="df298f4f-1e9a-a7e8-0f9f-beeae896c4d1")
public static String es_PE_FIELD_RMAType_RMAType_Description="Tipo Autorización de Devolución de Material";

@XendraTrl(Identifier="df298f4f-1e9a-a7e8-0f9f-beeae896c4d1")
public static String es_PE_FIELD_RMAType_RMAType_Help="Tipos de ADM (RMA)";

@XendraTrl(Identifier="df298f4f-1e9a-a7e8-0f9f-beeae896c4d1")
public static String es_PE_FIELD_RMAType_RMAType_Name="Tipo de ADM (RMA)";

@XendraField(AD_Column_ID="M_RMAType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df298f4f-1e9a-a7e8-0f9f-beeae896c4d1")
public static final String FIELDNAME_RMAType_RMAType="df298f4f-1e9a-a7e8-0f9f-beeae896c4d1";
/** Column name M_RMAType_ID */
public static final String COLUMNNAME_M_RMAType_ID = "M_RMAType_ID";
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

@XendraTrl(Identifier="aeee642c-d8bf-ea2c-9630-8594a1cea128")
public static String es_PE_FIELD_RMAType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="aeee642c-d8bf-ea2c-9630-8594a1cea128")
public static String es_PE_FIELD_RMAType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="aeee642c-d8bf-ea2c-9630-8594a1cea128")
public static String es_PE_FIELD_RMAType_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="ad91b10a-29f3-62fd-1e99-ef32b3ff12ec",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aeee642c-d8bf-ea2c-9630-8594a1cea128")
public static final String FIELDNAME_RMAType_Name="aeee642c-d8bf-ea2c-9630-8594a1cea128";

@XendraTrl(Identifier="4542b5cf-830e-3589-f60d-2c4c4e9bb239")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4542b5cf-830e-3589-f60d-2c4c4e9bb239",
Synchronized="2017-08-05 16:55:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
