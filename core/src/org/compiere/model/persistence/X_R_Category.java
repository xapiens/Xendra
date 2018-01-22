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
/** Generated Model for R_Category
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_Category extends PO
{
/** Standard Constructor
@param ctx context
@param R_Category_ID id
@param trxName transaction
*/
public X_R_Category (Properties ctx, int R_Category_ID, String trxName)
{
super (ctx, R_Category_ID, trxName);
/** if (R_Category_ID == 0)
{
setName (null);
setR_Category_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_Category (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=772 */
public static int Table_ID=MTable.getTable_ID("R_Category");

@XendraTrl(Identifier="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88")
public static String es_PE_TAB_RequestCategory_Description="Mantener Solicitud de Categoria";

@XendraTrl(Identifier="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88")
public static String es_PE_TAB_RequestCategory_Name="Categoria de Solicitud";

@XendraTrl(Identifier="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88")
public static String es_PE_TAB_RequestCategory_Help="Categoría ó asunto de la solicitud";

@XendraTab(Name="Request Category",Description="Maintain Request Category",
Help="Category or Topic of the Request ",AD_Window_ID="e9016b80-21a4-1781-85f4-03148c8c1976",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestCategory="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88";

@XendraTrl(Identifier="2b8eabe2-3ab2-62bb-6be6-cabd707460cf")
public static String es_PE_TABLE_R_Category_Name="Categoría";

@XendraTable(Name="Category",Description="Request Category",Help="",TableName="R_Category",
AccessLevel="6",AD_Window_ID="e9016b80-21a4-1781-85f4-03148c8c1976",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="2b8eabe2-3ab2-62bb-6be6-cabd707460cf",Synchronized="2017-08-16 11:43:46.0")
/** TableName=R_Category */
public static final String Table_Name="R_Category";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_Category");

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
    Table_ID = MTable.getTable_ID("R_Category");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_Category[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="f7fc4d06-6290-151e-ad4a-12c86fc5c358")
public static String es_PE_FIELD_RequestCategory_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f7fc4d06-6290-151e-ad4a-12c86fc5c358")
public static String es_PE_FIELD_RequestCategory_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="f7fc4d06-6290-151e-ad4a-12c86fc5c358")
public static String es_PE_FIELD_RequestCategory_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7fc4d06-6290-151e-ad4a-12c86fc5c358")
public static final String FIELDNAME_RequestCategory_Description="f7fc4d06-6290-151e-ad4a-12c86fc5c358";

@XendraTrl(Identifier="596e3471-02be-3f89-a40f-4000c8dd6426")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="596e3471-02be-3f89-a40f-4000c8dd6426",
Synchronized="2017-08-05 16:55:48.0")
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

@XendraTrl(Identifier="65360d93-11a3-f8bb-6f06-43b62255fdec")
public static String es_PE_FIELD_RequestCategory_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="65360d93-11a3-f8bb-6f06-43b62255fdec")
public static String es_PE_FIELD_RequestCategory_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="65360d93-11a3-f8bb-6f06-43b62255fdec")
public static String es_PE_FIELD_RequestCategory_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65360d93-11a3-f8bb-6f06-43b62255fdec")
public static final String FIELDNAME_RequestCategory_CommentHelp="65360d93-11a3-f8bb-6f06-43b62255fdec";

@XendraTrl(Identifier="59b47961-a241-5648-ceb7-3ca8598bff3a")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59b47961-a241-5648-ceb7-3ca8598bff3a",
Synchronized="2017-08-05 16:55:48.0")
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
@XendraTrl(Identifier="f98a03d2-d0d6-4e82-aecd-09e57273130c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f98a03d2-d0d6-4e82-aecd-09e57273130c",
Synchronized="2017-08-05 16:55:48.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="8ae87d61-e96a-a9e9-cc2c-7728cbbb924b")
public static String es_PE_FIELD_RequestCategory_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="8ae87d61-e96a-a9e9-cc2c-7728cbbb924b")
public static String es_PE_FIELD_RequestCategory_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="8ae87d61-e96a-a9e9-cc2c-7728cbbb924b")
public static String es_PE_FIELD_RequestCategory_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ae87d61-e96a-a9e9-cc2c-7728cbbb924b")
public static final String FIELDNAME_RequestCategory_Product="8ae87d61-e96a-a9e9-cc2c-7728cbbb924b";

@XendraTrl(Identifier="2a72eb48-9271-9f32-695d-73f30fbc1182")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2a72eb48-9271-9f32-695d-73f30fbc1182",Synchronized="2017-08-05 16:55:48.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="c151f726-217a-6c87-8395-ef5582d5d395")
public static String es_PE_FIELD_RequestCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c151f726-217a-6c87-8395-ef5582d5d395")
public static String es_PE_FIELD_RequestCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="c151f726-217a-6c87-8395-ef5582d5d395")
public static String es_PE_FIELD_RequestCategory_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c151f726-217a-6c87-8395-ef5582d5d395")
public static final String FIELDNAME_RequestCategory_Name="c151f726-217a-6c87-8395-ef5582d5d395";

@XendraTrl(Identifier="00230882-9aa9-eb71-5785-6736c2998e8a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00230882-9aa9-eb71-5785-6736c2998e8a",
Synchronized="2017-08-05 16:55:48.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Category.
@param R_Category_ID Request Category */
public void setR_Category_ID (int R_Category_ID)
{
if (R_Category_ID < 1) throw new IllegalArgumentException ("R_Category_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Category_ID, Integer.valueOf(R_Category_ID));
}
/** Get Category.
@return Request Category */
public int getR_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="89a6ec28-2a41-a58d-7692-a574a159fda6")
public static String es_PE_FIELD_RequestCategory_Category_Description="Categoría de Solicitud";

@XendraTrl(Identifier="89a6ec28-2a41-a58d-7692-a574a159fda6")
public static String es_PE_FIELD_RequestCategory_Category_Help="Categoria ó asunto de la solicitud";

@XendraTrl(Identifier="89a6ec28-2a41-a58d-7692-a574a159fda6")
public static String es_PE_FIELD_RequestCategory_Category_Name="Categoría";

@XendraField(AD_Column_ID="R_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b0c98e6b-a1ab-1f0b-f6d0-c57406c78d88",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89a6ec28-2a41-a58d-7692-a574a159fda6")
public static final String FIELDNAME_RequestCategory_Category="89a6ec28-2a41-a58d-7692-a574a159fda6";
/** Column name R_Category_ID */
public static final String COLUMNNAME_R_Category_ID = "R_Category_ID";
}
