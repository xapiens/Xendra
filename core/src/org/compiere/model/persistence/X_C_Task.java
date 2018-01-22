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
/** Generated Model for C_Task
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Task extends PO
{
/** Standard Constructor
@param ctx context
@param C_Task_ID id
@param trxName transaction
*/
public X_C_Task (Properties ctx, int C_Task_ID, String trxName)
{
super (ctx, C_Task_ID, trxName);
/** if (C_Task_ID == 0)
{
setC_Phase_ID (0);
setC_Task_ID (0);
setName (null);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_Task WHERE C_Phase_ID=@C_Phase_ID@
setStandardQty (Env.ZERO);	
// 1
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Task (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=583 */
public static int Table_ID=MTable.getTable_ID("C_Task");

@XendraTrl(Identifier="0f0be7be-5406-ec15-f6db-009fc98e590c")
public static String es_PE_TAB_StandardTask_Description="Mantener Tarea Estándar de un Proyecto";

@XendraTrl(Identifier="0f0be7be-5406-ec15-f6db-009fc98e590c")
public static String es_PE_TAB_StandardTask_Name="Tarea Estándar";

@XendraTrl(Identifier="0f0be7be-5406-ec15-f6db-009fc98e590c")
public static String es_PE_TAB_StandardTask_Help="Tarea Estándar de un Proyecto";

@XendraTab(Name="Standard Task",Description="Maintain Standard Project Task",
Help="Standard Project Task",AD_Window_ID="2e1a4ba2-daf5-c92e-d63d-46cbad48833e",SeqNo=30,
TabLevel=2,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0f0be7be-5406-ec15-f6db-009fc98e590c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_StandardTask="0f0be7be-5406-ec15-f6db-009fc98e590c";

@XendraTrl(Identifier="e1e75f6a-6270-51d0-0e5b-30a081a79efa")
public static String es_PE_TABLE_C_Task_Name="Tarea Estándar";

@XendraTable(Name="Standard Task",Description="Standard Project Type Task",Help="",
TableName="C_Task",AccessLevel="3",AD_Window_ID="2e1a4ba2-daf5-c92e-d63d-46cbad48833e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="e1e75f6a-6270-51d0-0e5b-30a081a79efa",Synchronized="2017-08-16 11:42:30.0")
/** TableName=C_Task */
public static final String Table_Name="C_Task";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Task");

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
    Table_ID = MTable.getTable_ID("C_Task");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Task[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Standard Phase.
@param C_Phase_ID Standard Phase of the Project Type */
public void setC_Phase_ID (int C_Phase_ID)
{
if (C_Phase_ID < 1) throw new IllegalArgumentException ("C_Phase_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Phase_ID, Integer.valueOf(C_Phase_ID));
}
/** Get Standard Phase.
@return Standard Phase of the Project Type */
public int getC_Phase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Phase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="972dd034-f368-f98f-a442-3e4a5214adc6")
public static String es_PE_FIELD_StandardTask_StandardPhase_Description="Fase estándar de el tipo de proyecto";

@XendraTrl(Identifier="972dd034-f368-f98f-a442-3e4a5214adc6")
public static String es_PE_FIELD_StandardTask_StandardPhase_Help="Fase del proyecto con la información estándar del funcionamiento con el trabajo estándar.";

@XendraTrl(Identifier="972dd034-f368-f98f-a442-3e4a5214adc6")
public static String es_PE_FIELD_StandardTask_StandardPhase_Name="Fase Estándar";

@XendraField(AD_Column_ID="C_Phase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="972dd034-f368-f98f-a442-3e4a5214adc6")
public static final String FIELDNAME_StandardTask_StandardPhase="972dd034-f368-f98f-a442-3e4a5214adc6";

@XendraTrl(Identifier="c82f24ef-554a-c55f-ee0e-db2d6aa05784")
public static String es_PE_COLUMN_C_Phase_ID_Name="Fase Estándar";

@XendraColumn(AD_Element_ID="3ef98f9c-ae28-3183-566b-a77d4b8d6048",ColumnName="C_Phase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c82f24ef-554a-c55f-ee0e-db2d6aa05784",
Synchronized="2017-08-05 16:54:28.0")
/** Column name C_Phase_ID */
public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
/** Set Standard Task.
@param C_Task_ID Standard Project Type Task */
public void setC_Task_ID (int C_Task_ID)
{
if (C_Task_ID < 1) throw new IllegalArgumentException ("C_Task_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Task_ID, Integer.valueOf(C_Task_ID));
}
/** Get Standard Task.
@return Standard Project Type Task */
public int getC_Task_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Task_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="afbf5b67-df39-f053-2f63-dc0ba4d709f5")
public static String es_PE_FIELD_StandardTask_StandardTask_Description="Tarea estandar en tipo de proyecto.";

@XendraTrl(Identifier="afbf5b67-df39-f053-2f63-dc0ba4d709f5")
public static String es_PE_FIELD_StandardTask_StandardTask_Help="Tarea estándar del proyecto de una fase del proyecto con esfuerzo estándar.";

@XendraTrl(Identifier="afbf5b67-df39-f053-2f63-dc0ba4d709f5")
public static String es_PE_FIELD_StandardTask_StandardTask_Name="Tarea Estándar";

@XendraField(AD_Column_ID="C_Task_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afbf5b67-df39-f053-2f63-dc0ba4d709f5")
public static final String FIELDNAME_StandardTask_StandardTask="afbf5b67-df39-f053-2f63-dc0ba4d709f5";
/** Column name C_Task_ID */
public static final String COLUMNNAME_C_Task_ID = "C_Task_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="5d840cad-0ac1-b712-acd6-f655fab6a642")
public static String es_PE_FIELD_StandardTask_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="5d840cad-0ac1-b712-acd6-f655fab6a642")
public static String es_PE_FIELD_StandardTask_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="5d840cad-0ac1-b712-acd6-f655fab6a642")
public static String es_PE_FIELD_StandardTask_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d840cad-0ac1-b712-acd6-f655fab6a642")
public static final String FIELDNAME_StandardTask_Description="5d840cad-0ac1-b712-acd6-f655fab6a642";

@XendraTrl(Identifier="c9e3db01-7daf-a655-ffbd-9eb0069c3692")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9e3db01-7daf-a655-ffbd-9eb0069c3692",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="07a87114-6890-9d96-e10a-d0c779d3f484")
public static String es_PE_FIELD_StandardTask_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="07a87114-6890-9d96-e10a-d0c779d3f484")
public static String es_PE_FIELD_StandardTask_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="07a87114-6890-9d96-e10a-d0c779d3f484")
public static String es_PE_FIELD_StandardTask_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07a87114-6890-9d96-e10a-d0c779d3f484")
public static final String FIELDNAME_StandardTask_CommentHelp="07a87114-6890-9d96-e10a-d0c779d3f484";

@XendraTrl(Identifier="5c5acef1-03de-9e29-9d88-17eddc4f962e")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c5acef1-03de-9e29-9d88-17eddc4f962e",
Synchronized="2017-08-05 16:54:28.0")
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
@XendraTrl(Identifier="141abe83-0eed-453d-aee5-daccb848413c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="141abe83-0eed-453d-aee5-daccb848413c",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="47d03f16-ebb0-e53b-1737-2be91fc22d01")
public static String es_PE_FIELD_StandardTask_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="47d03f16-ebb0-e53b-1737-2be91fc22d01")
public static String es_PE_FIELD_StandardTask_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="47d03f16-ebb0-e53b-1737-2be91fc22d01")
public static String es_PE_FIELD_StandardTask_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47d03f16-ebb0-e53b-1737-2be91fc22d01")
public static final String FIELDNAME_StandardTask_Product="47d03f16-ebb0-e53b-1737-2be91fc22d01";

@XendraTrl(Identifier="c6bd2c44-6c0e-8641-a187-520ba9d3198a")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c6bd2c44-6c0e-8641-a187-520ba9d3198a",Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="25e8a423-6831-f73a-a9dd-59d3b361d83c")
public static String es_PE_FIELD_StandardTask_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="25e8a423-6831-f73a-a9dd-59d3b361d83c")
public static String es_PE_FIELD_StandardTask_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="25e8a423-6831-f73a-a9dd-59d3b361d83c")
public static String es_PE_FIELD_StandardTask_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="25e8a423-6831-f73a-a9dd-59d3b361d83c")
public static final String FIELDNAME_StandardTask_Name="25e8a423-6831-f73a-a9dd-59d3b361d83c";

@XendraTrl(Identifier="0f1a3e07-b8d7-40a9-19ab-e7a54751e2d7")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f1a3e07-b8d7-40a9-19ab-e7a54751e2d7",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="dfd850ae-4bc9-57d3-f570-83545457cce4")
public static String es_PE_FIELD_StandardTask_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="dfd850ae-4bc9-57d3-f570-83545457cce4")
public static String es_PE_FIELD_StandardTask_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="dfd850ae-4bc9-57d3-f570-83545457cce4")
public static String es_PE_FIELD_StandardTask_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfd850ae-4bc9-57d3-f570-83545457cce4")
public static final String FIELDNAME_StandardTask_Sequence="dfd850ae-4bc9-57d3-f570-83545457cce4";

@XendraTrl(Identifier="6d08ff46-133e-8ca7-c397-b004540720a7")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_Task WHERE C_Phase_ID=@C_Phase_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d08ff46-133e-8ca7-c397-b004540720a7",
Synchronized="2017-08-05 16:54:28.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Standard Quantity.
@param StandardQty Standard Quantity */
public void setStandardQty (BigDecimal StandardQty)
{
if (StandardQty == null) throw new IllegalArgumentException ("StandardQty is mandatory.");
set_Value (COLUMNNAME_StandardQty, StandardQty);
}
/** Get Standard Quantity.
@return Standard Quantity */
public BigDecimal getStandardQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StandardQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="15baae99-a9ba-1109-b9d2-af6f40904b44")
public static String es_PE_FIELD_StandardTask_StandardQuantity_Description="Cantidad Estándar";

@XendraTrl(Identifier="15baae99-a9ba-1109-b9d2-af6f40904b44")
public static String es_PE_FIELD_StandardTask_StandardQuantity_Name="Cantidad Estándar";

@XendraField(AD_Column_ID="StandardQty",IsCentrallyMaintained=true,
AD_Tab_ID="0f0be7be-5406-ec15-f6db-009fc98e590c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15baae99-a9ba-1109-b9d2-af6f40904b44")
public static final String FIELDNAME_StandardTask_StandardQuantity="15baae99-a9ba-1109-b9d2-af6f40904b44";

@XendraTrl(Identifier="5826a604-f00a-fa9e-7f3a-2b5decdd734a")
public static String es_PE_COLUMN_StandardQty_Name="Cantidad Estándar";

@XendraColumn(AD_Element_ID="1634a9bd-7de9-1a03-9d36-e5777fb734e7",ColumnName="StandardQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5826a604-f00a-fa9e-7f3a-2b5decdd734a",
Synchronized="2017-08-05 16:54:28.0")
/** Column name StandardQty */
public static final String COLUMNNAME_StandardQty = "StandardQty";
}
