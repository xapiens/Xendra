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
/** Generated Model for M_CostType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_CostType extends PO
{
/** Standard Constructor
@param ctx context
@param M_CostType_ID id
@param trxName transaction
*/
public X_M_CostType (Properties ctx, int M_CostType_ID, String trxName)
{
super (ctx, M_CostType_ID, trxName);
/** if (M_CostType_ID == 0)
{
setM_CostType_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_CostType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=586 */
public static int Table_ID=MTable.getTable_ID("M_CostType");

@XendraTrl(Identifier="d84741a3-f24d-e675-3116-d7198bd341a4")
public static String es_PE_TAB_CostType_Description="Tipos de Costo";

@XendraTrl(Identifier="d84741a3-f24d-e675-3116-d7198bd341a4")
public static String es_PE_TAB_CostType_Name="Tipo de Costo";
@XendraTab(Name="Cost Type",
Description="Type of Cost (e.g. Current, Plan, Future)",
Help="You can define multiple cost types. The cost type selected in an Accounting Schema is used for accounting.",
AD_Window_ID="733727e1-cd9d-ee1e-f4a8-81dbdc018abd",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d84741a3-f24d-e675-3116-d7198bd341a4",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CostType="d84741a3-f24d-e675-3116-d7198bd341a4";

@XendraTrl(Identifier="9b288783-0a06-745f-81c2-50f6bb3fc74d")
public static String es_PE_TABLE_M_CostType_Name="Tipo de Costo";

@XendraTable(Name="Cost Type",Description="Type of Cost",Help="",TableName="M_CostType",
AccessLevel="2",AD_Window_ID="733727e1-cd9d-ee1e-f4a8-81dbdc018abd",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="9b288783-0a06-745f-81c2-50f6bb3fc74d",Synchronized="2017-08-16 11:43:09.0")
/** TableName=M_CostType */
public static final String Table_Name="M_CostType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_CostType");

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
    Table_ID = MTable.getTable_ID("M_CostType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_CostType[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="04a15506-86ea-0052-485d-4ce45cd373c5")
public static String es_PE_FIELD_CostType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="04a15506-86ea-0052-485d-4ce45cd373c5")
public static String es_PE_FIELD_CostType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="04a15506-86ea-0052-485d-4ce45cd373c5")
public static String es_PE_FIELD_CostType_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d84741a3-f24d-e675-3116-d7198bd341a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04a15506-86ea-0052-485d-4ce45cd373c5")
public static final String FIELDNAME_CostType_Description="04a15506-86ea-0052-485d-4ce45cd373c5";

@XendraTrl(Identifier="842d13a6-5c40-16d5-c407-9179c184797f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="842d13a6-5c40-16d5-c407-9179c184797f",
Synchronized="2017-08-05 16:55:04.0")
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

@XendraTrl(Identifier="a472589e-b857-a535-09de-af74dad56b71")
public static String es_PE_FIELD_CostType_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="a472589e-b857-a535-09de-af74dad56b71")
public static String es_PE_FIELD_CostType_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="a472589e-b857-a535-09de-af74dad56b71")
public static String es_PE_FIELD_CostType_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="d84741a3-f24d-e675-3116-d7198bd341a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a472589e-b857-a535-09de-af74dad56b71")
public static final String FIELDNAME_CostType_CommentHelp="a472589e-b857-a535-09de-af74dad56b71";

@XendraTrl(Identifier="3b529682-2e57-e743-bdec-2a69ccdf1b9a")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b529682-2e57-e743-bdec-2a69ccdf1b9a",
Synchronized="2017-08-05 16:55:04.0")
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
@XendraTrl(Identifier="162c49ea-75ea-400f-8772-86836035a6e1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="162c49ea-75ea-400f-8772-86836035a6e1",
Synchronized="2017-08-05 16:55:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Cost Type.
@param M_CostType_ID Type of Cost (e.g. Current, Plan, Future) */
public void setM_CostType_ID (int M_CostType_ID)
{
if (M_CostType_ID < 1) throw new IllegalArgumentException ("M_CostType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_CostType_ID, Integer.valueOf(M_CostType_ID));
}
/** Get Cost Type.
@return Type of Cost (e.g. Current, Plan, Future) */
public int getM_CostType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="07bb5969-9de7-5f5c-b640-cd2d6e7d508c")
public static String es_PE_FIELD_CostType_CostType_Description="Tipo de Costo";

@XendraTrl(Identifier="07bb5969-9de7-5f5c-b640-cd2d6e7d508c")
public static String es_PE_FIELD_CostType_CostType_Name="Tipo de Costo";

@XendraField(AD_Column_ID="M_CostType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d84741a3-f24d-e675-3116-d7198bd341a4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07bb5969-9de7-5f5c-b640-cd2d6e7d508c")
public static final String FIELDNAME_CostType_CostType="07bb5969-9de7-5f5c-b640-cd2d6e7d508c";
/** Column name M_CostType_ID */
public static final String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
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

@XendraTrl(Identifier="fb488525-6e92-d0d8-73be-5bfa9c97e2b9")
public static String es_PE_FIELD_CostType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="fb488525-6e92-d0d8-73be-5bfa9c97e2b9")
public static String es_PE_FIELD_CostType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="fb488525-6e92-d0d8-73be-5bfa9c97e2b9")
public static String es_PE_FIELD_CostType_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="d84741a3-f24d-e675-3116-d7198bd341a4",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fb488525-6e92-d0d8-73be-5bfa9c97e2b9")
public static final String FIELDNAME_CostType_Name="fb488525-6e92-d0d8-73be-5bfa9c97e2b9";

@XendraTrl(Identifier="3dd8af1c-5827-dd29-b36f-93d90d7a8bbc")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3dd8af1c-5827-dd29-b36f-93d90d7a8bbc",
Synchronized="2017-08-05 16:55:04.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
