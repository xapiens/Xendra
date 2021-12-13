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
/** Generated Model for C_Activity
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Activity extends PO
{
/** Standard Constructor
@param ctx context
@param C_Activity_ID id
@param trxName transaction
*/
public X_C_Activity (Properties ctx, int C_Activity_ID, String trxName)
{
super (ctx, C_Activity_ID, trxName);
/** if (C_Activity_ID == 0)
{
setC_Activity_ID (0);
setIsSummary (false);	
// N
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Activity (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=316 */
public static int Table_ID=MTable.getTable_ID("C_Activity");

@XendraTrl(Identifier="7f31274c-677d-3782-49c7-652e03291128")
public static String es_PE_TAB_Activity_Description="Actividad para Costeo por Actividad";

@XendraTrl(Identifier="7f31274c-677d-3782-49c7-652e03291128")
public static String es_PE_TAB_Activity_Name="Actividad";
@XendraTab(Name="Activity",
Description="Activity for Activity Based Costing",Help="",
AD_Window_ID="2cb4c98a-cccd-72ed-bc9b-172d4f09af42",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7f31274c-677d-3782-49c7-652e03291128",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Activity="7f31274c-677d-3782-49c7-652e03291128";

@XendraTrl(Identifier="179bb480-5d9b-8aec-18a4-c16fcd68cc30")
public static String es_PE_TAB_AcitivityDimension_Description="Mantenga el árbol de la dimensión de la actividad de contabilidad";

@XendraTrl(Identifier="179bb480-5d9b-8aec-18a4-c16fcd68cc30")
public static String es_PE_TAB_AcitivityDimension_Help="¡Observe por favor que usted no podrá crear entidades nuevas en esta ventana si usted no tiene defecto fijado para todos los valores obligatorios!";

@XendraTrl(Identifier="179bb480-5d9b-8aec-18a4-c16fcd68cc30")
public static String es_PE_TAB_AcitivityDimension_Name="Dimensión de Actividad";

@XendraTab(Name="Acitivity Dimension",Description="Maintain Acitivity Accounting Dimension Tree",
Help="Please note that you will not be able to create new entities in this window if you have not default set for all mandatory values! ",
AD_Window_ID="6d82a0ab-8b9a-fa56-aec1-277a04b274a1",SeqNo=30,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="179bb480-5d9b-8aec-18a4-c16fcd68cc30",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AcitivityDimension="179bb480-5d9b-8aec-18a4-c16fcd68cc30";

@XendraTrl(Identifier="d5417af1-81ce-a4c5-2b57-7d3b7171249a")
public static String es_PE_TABLE_C_Activity_Name="Tipo de Gasto";

@XendraTable(Name="Activity",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Business Activity",Help="",
TableName="C_Activity",AccessLevel="2",AD_Window_ID="2cb4c98a-cccd-72ed-bc9b-172d4f09af42",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="d5417af1-81ce-a4c5-2b57-7d3b7171249a",Synchronized="2020-03-03 21:36:23.0")
/** TableName=C_Activity */
public static final String Table_Name="C_Activity";


@XendraIndex(Name="c_activity_value",Identifier="bd8db55c-ff83-1c5e-2694-45a780ad0835",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="bd8db55c-ff83-1c5e-2694-45a780ad0835",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_activity_value = "bd8db55c-ff83-1c5e-2694-45a780ad0835";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Activity");

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
    Table_ID = MTable.getTable_ID("C_Activity");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Activity[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID < 1) throw new IllegalArgumentException ("C_Activity_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1853bf65-b6ae-b023-b25d-f1e3268c971b")
public static String es_PE_FIELD_Activity_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="1853bf65-b6ae-b023-b25d-f1e3268c971b")
public static String es_PE_FIELD_Activity_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="1853bf65-b6ae-b023-b25d-f1e3268c971b")
public static String es_PE_FIELD_Activity_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f31274c-677d-3782-49c7-652e03291128",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1853bf65-b6ae-b023-b25d-f1e3268c971b")
public static final String FIELDNAME_Activity_Activity="1853bf65-b6ae-b023-b25d-f1e3268c971b";

@XendraTrl(Identifier="2d9afa69-fe5c-cbad-28ab-9c07c6ea1488")
public static String es_PE_FIELD_AcitivityDimension_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="2d9afa69-fe5c-cbad-28ab-9c07c6ea1488")
public static String es_PE_FIELD_AcitivityDimension_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="2d9afa69-fe5c-cbad-28ab-9c07c6ea1488")
public static String es_PE_FIELD_AcitivityDimension_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="179bb480-5d9b-8aec-18a4-c16fcd68cc30",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d9afa69-fe5c-cbad-28ab-9c07c6ea1488")
public static final String FIELDNAME_AcitivityDimension_Activity="2d9afa69-fe5c-cbad-28ab-9c07c6ea1488";
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
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

@XendraTrl(Identifier="865c8828-027a-638f-86a9-3f0c724594a9")
public static String es_PE_FIELD_Activity_Description_Name="Observación";

@XendraTrl(Identifier="865c8828-027a-638f-86a9-3f0c724594a9")
public static String es_PE_FIELD_Activity_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="865c8828-027a-638f-86a9-3f0c724594a9")
public static String es_PE_FIELD_Activity_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7f31274c-677d-3782-49c7-652e03291128",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="865c8828-027a-638f-86a9-3f0c724594a9")
public static final String FIELDNAME_Activity_Description="865c8828-027a-638f-86a9-3f0c724594a9";

@XendraTrl(Identifier="b57076f1-f246-dd4f-d5e5-69a27e60e3db")
public static String es_PE_FIELD_AcitivityDimension_Description_Name="Observación";

@XendraTrl(Identifier="b57076f1-f246-dd4f-d5e5-69a27e60e3db")
public static String es_PE_FIELD_AcitivityDimension_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b57076f1-f246-dd4f-d5e5-69a27e60e3db")
public static String es_PE_FIELD_AcitivityDimension_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="179bb480-5d9b-8aec-18a4-c16fcd68cc30",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b57076f1-f246-dd4f-d5e5-69a27e60e3db")
public static final String FIELDNAME_AcitivityDimension_Description="b57076f1-f246-dd4f-d5e5-69a27e60e3db";

@XendraTrl(Identifier="47e617a7-a185-808f-eebd-7fd2ba7cd1bf")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47e617a7-a185-808f-eebd-7fd2ba7cd1bf",
Synchronized="2019-08-30 22:21:01.0")
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

@XendraTrl(Identifier="0890f248-5134-f546-fef0-3e29e79eedca")
public static String es_PE_FIELD_Activity_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="0890f248-5134-f546-fef0-3e29e79eedca")
public static String es_PE_FIELD_Activity_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="0890f248-5134-f546-fef0-3e29e79eedca")
public static String es_PE_FIELD_Activity_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="7f31274c-677d-3782-49c7-652e03291128",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0890f248-5134-f546-fef0-3e29e79eedca")
public static final String FIELDNAME_Activity_CommentHelp="0890f248-5134-f546-fef0-3e29e79eedca";

@XendraTrl(Identifier="bd6b2140-b56d-db96-b034-628072f536c8")
public static String es_PE_FIELD_AcitivityDimension_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="bd6b2140-b56d-db96-b034-628072f536c8")
public static String es_PE_FIELD_AcitivityDimension_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="bd6b2140-b56d-db96-b034-628072f536c8")
public static String es_PE_FIELD_AcitivityDimension_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="179bb480-5d9b-8aec-18a4-c16fcd68cc30",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd6b2140-b56d-db96-b034-628072f536c8")
public static final String FIELDNAME_AcitivityDimension_CommentHelp="bd6b2140-b56d-db96-b034-628072f536c8";

@XendraTrl(Identifier="e3657271-220c-aca2-1741-a07c6f27e917")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3657271-220c-aca2-1741-a07c6f27e917",
Synchronized="2019-08-30 22:21:01.0")
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
@XendraTrl(Identifier="ecb5a034-53c5-4e3c-a2ea-3d50d085553d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecb5a034-53c5-4e3c-a2ea-3d50d085553d",
Synchronized="2019-08-30 22:21:01.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4ff74c5c-94a2-19ba-f8e9-bcfec9528d7c")
public static String es_PE_FIELD_Activity_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="4ff74c5c-94a2-19ba-f8e9-bcfec9528d7c")
public static String es_PE_FIELD_Activity_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="4ff74c5c-94a2-19ba-f8e9-bcfec9528d7c")
public static String es_PE_FIELD_Activity_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="7f31274c-677d-3782-49c7-652e03291128",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ff74c5c-94a2-19ba-f8e9-bcfec9528d7c")
public static final String FIELDNAME_Activity_SummaryLevel="4ff74c5c-94a2-19ba-f8e9-bcfec9528d7c";

@XendraTrl(Identifier="eca2de5e-c699-77e8-2a1a-ca13022ea3c9")
public static String es_PE_FIELD_AcitivityDimension_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="eca2de5e-c699-77e8-2a1a-ca13022ea3c9")
public static String es_PE_FIELD_AcitivityDimension_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="eca2de5e-c699-77e8-2a1a-ca13022ea3c9")
public static String es_PE_FIELD_AcitivityDimension_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="179bb480-5d9b-8aec-18a4-c16fcd68cc30",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eca2de5e-c699-77e8-2a1a-ca13022ea3c9")
public static final String FIELDNAME_AcitivityDimension_SummaryLevel="eca2de5e-c699-77e8-2a1a-ca13022ea3c9";

@XendraTrl(Identifier="2c54da8c-4f54-741c-7c62-1a7b5ce9a748")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c54da8c-4f54-741c-7c62-1a7b5ce9a748",
Synchronized="2019-08-30 22:21:01.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
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

@XendraTrl(Identifier="97dd4374-5cb0-1881-899f-7b3049992dfe")
public static String es_PE_FIELD_Activity_Name_Name="Nombre";

@XendraTrl(Identifier="97dd4374-5cb0-1881-899f-7b3049992dfe")
public static String es_PE_FIELD_Activity_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="97dd4374-5cb0-1881-899f-7b3049992dfe")
public static String es_PE_FIELD_Activity_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="7f31274c-677d-3782-49c7-652e03291128",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97dd4374-5cb0-1881-899f-7b3049992dfe")
public static final String FIELDNAME_Activity_Name="97dd4374-5cb0-1881-899f-7b3049992dfe";

@XendraTrl(Identifier="13b4fa37-4b20-e00e-050e-44730bde4dd0")
public static String es_PE_FIELD_AcitivityDimension_Name_Name="Nombre";

@XendraTrl(Identifier="13b4fa37-4b20-e00e-050e-44730bde4dd0")
public static String es_PE_FIELD_AcitivityDimension_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="13b4fa37-4b20-e00e-050e-44730bde4dd0")
public static String es_PE_FIELD_AcitivityDimension_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="179bb480-5d9b-8aec-18a4-c16fcd68cc30",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13b4fa37-4b20-e00e-050e-44730bde4dd0")
public static final String FIELDNAME_AcitivityDimension_Name="13b4fa37-4b20-e00e-050e-44730bde4dd0";

@XendraTrl(Identifier="87a5cf48-a209-b399-0c06-acaf13b58b24")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87a5cf48-a209-b399-0c06-acaf13b58b24",
Synchronized="2019-08-30 22:21:01.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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
@XendraTrl(Identifier="ca63b6ee-c9e2-d332-cef3-fc73e8520a9c")
public static String es_PE_FIELD_Activity_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="ca63b6ee-c9e2-d332-cef3-fc73e8520a9c")
public static String es_PE_FIELD_Activity_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="ca63b6ee-c9e2-d332-cef3-fc73e8520a9c")
public static String es_PE_FIELD_Activity_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="7f31274c-677d-3782-49c7-652e03291128",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca63b6ee-c9e2-d332-cef3-fc73e8520a9c")
public static final String FIELDNAME_Activity_SearchKey="ca63b6ee-c9e2-d332-cef3-fc73e8520a9c";

@XendraTrl(Identifier="5e298306-af91-488b-f941-8931f60ac5a4")
public static String es_PE_FIELD_AcitivityDimension_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="5e298306-af91-488b-f941-8931f60ac5a4")
public static String es_PE_FIELD_AcitivityDimension_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="5e298306-af91-488b-f941-8931f60ac5a4")
public static String es_PE_FIELD_AcitivityDimension_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="179bb480-5d9b-8aec-18a4-c16fcd68cc30",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e298306-af91-488b-f941-8931f60ac5a4")
public static final String FIELDNAME_AcitivityDimension_SearchKey="5e298306-af91-488b-f941-8931f60ac5a4";

@XendraTrl(Identifier="b6aba91d-b16f-3e6a-2380-d8bb464e5d97")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6aba91d-b16f-3e6a-2380-d8bb464e5d97",
Synchronized="2019-08-30 22:21:01.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
