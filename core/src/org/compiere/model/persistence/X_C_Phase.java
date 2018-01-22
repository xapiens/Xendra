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
/** Generated Model for C_Phase
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Phase extends PO
{
/** Standard Constructor
@param ctx context
@param C_Phase_ID id
@param trxName transaction
*/
public X_C_Phase (Properties ctx, int C_Phase_ID, String trxName)
{
super (ctx, C_Phase_ID, trxName);
/** if (C_Phase_ID == 0)
{
setC_Phase_ID (0);
setC_ProjectType_ID (0);
setName (null);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_Phase WHERE C_ProjectType_ID=@C_ProjectType_ID@
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
public X_C_Phase (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=577 */
public static int Table_ID=MTable.getTable_ID("C_Phase");

@XendraTrl(Identifier="9ecd6243-220c-92b7-0c4b-2094eff8ac04")
public static String es_PE_TAB_StandardPhase_Description="Mantener Fase Estándar de un Proyecto";

@XendraTrl(Identifier="9ecd6243-220c-92b7-0c4b-2094eff8ac04")
public static String es_PE_TAB_StandardPhase_Name="Fase Estándar";

@XendraTrl(Identifier="9ecd6243-220c-92b7-0c4b-2094eff8ac04")
public static String es_PE_TAB_StandardPhase_Help="Fase estándar del proyecto con la información del funcionamiento.";

@XendraTab(Name="Standard Phase",Description="Maintain Standard Project Phase",
Help="Standard Phase of the project with performance information",
AD_Window_ID="2e1a4ba2-daf5-c92e-d63d-46cbad48833e",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9ecd6243-220c-92b7-0c4b-2094eff8ac04",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_StandardPhase="9ecd6243-220c-92b7-0c4b-2094eff8ac04";

@XendraTrl(Identifier="4bbbe730-0d5b-ea45-992a-ff25d89a0833")
public static String es_PE_TABLE_C_Phase_Name="Fase Estándar";

@XendraTable(Name="Standard Phase",Description="Standard Phase of the Project Type",Help="",
TableName="C_Phase",AccessLevel="3",AD_Window_ID="2e1a4ba2-daf5-c92e-d63d-46cbad48833e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="4bbbe730-0d5b-ea45-992a-ff25d89a0833",Synchronized="2017-08-16 11:42:13.0")
/** TableName=C_Phase */
public static final String Table_Name="C_Phase";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Phase");

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
    Table_ID = MTable.getTable_ID("C_Phase");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Phase[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="dfdc931b-3c56-8a59-dcd2-a44dba78a114")
public static String es_PE_FIELD_StandardPhase_StandardPhase_Description="Fase estándar de el tipo de proyecto";

@XendraTrl(Identifier="dfdc931b-3c56-8a59-dcd2-a44dba78a114")
public static String es_PE_FIELD_StandardPhase_StandardPhase_Help="Fase del proyecto con la información estándar del funcionamiento con el trabajo estándar.";

@XendraTrl(Identifier="dfdc931b-3c56-8a59-dcd2-a44dba78a114")
public static String es_PE_FIELD_StandardPhase_StandardPhase_Name="Fase Estándar";

@XendraField(AD_Column_ID="C_Phase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfdc931b-3c56-8a59-dcd2-a44dba78a114")
public static final String FIELDNAME_StandardPhase_StandardPhase="dfdc931b-3c56-8a59-dcd2-a44dba78a114";
/** Column name C_Phase_ID */
public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
/** Set Project Type.
@param C_ProjectType_ID Type of the project */
public void setC_ProjectType_ID (int C_ProjectType_ID)
{
if (C_ProjectType_ID < 1) throw new IllegalArgumentException ("C_ProjectType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ProjectType_ID, Integer.valueOf(C_ProjectType_ID));
}
/** Get Project Type.
@return Type of the project */
public int getC_ProjectType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="961a4150-d743-9f76-c430-1abb81d3fdde")
public static String es_PE_FIELD_StandardPhase_ProjectType_Description="Tipo de proyecto";

@XendraTrl(Identifier="961a4150-d743-9f76-c430-1abb81d3fdde")
public static String es_PE_FIELD_StandardPhase_ProjectType_Help="Tipo de proyecto con las fases opcionales del proyecto y la información estándar de funcionamiento";

@XendraTrl(Identifier="961a4150-d743-9f76-c430-1abb81d3fdde")
public static String es_PE_FIELD_StandardPhase_ProjectType_Name="Tipo de Proyecto";

@XendraField(AD_Column_ID="C_ProjectType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="961a4150-d743-9f76-c430-1abb81d3fdde")
public static final String FIELDNAME_StandardPhase_ProjectType="961a4150-d743-9f76-c430-1abb81d3fdde";

@XendraTrl(Identifier="db0c3f08-384c-d147-2184-22c6ceef9c6a")
public static String es_PE_COLUMN_C_ProjectType_ID_Name="Tipo de Proyecto";

@XendraColumn(AD_Element_ID="f000bb9d-562b-51bf-8de1-feef472fc4a8",ColumnName="C_ProjectType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db0c3f08-384c-d147-2184-22c6ceef9c6a",
Synchronized="2017-08-05 16:54:07.0")
/** Column name C_ProjectType_ID */
public static final String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
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

@XendraTrl(Identifier="aed23603-64e3-a082-7f90-74976f47f70e")
public static String es_PE_FIELD_StandardPhase_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="aed23603-64e3-a082-7f90-74976f47f70e")
public static String es_PE_FIELD_StandardPhase_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="aed23603-64e3-a082-7f90-74976f47f70e")
public static String es_PE_FIELD_StandardPhase_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aed23603-64e3-a082-7f90-74976f47f70e")
public static final String FIELDNAME_StandardPhase_Description="aed23603-64e3-a082-7f90-74976f47f70e";

@XendraTrl(Identifier="59dba726-645e-9266-e642-20d7f1d65500")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59dba726-645e-9266-e642-20d7f1d65500",
Synchronized="2017-08-05 16:54:07.0")
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

@XendraTrl(Identifier="83307931-dab0-b55d-81ed-449b44c39efd")
public static String es_PE_FIELD_StandardPhase_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="83307931-dab0-b55d-81ed-449b44c39efd")
public static String es_PE_FIELD_StandardPhase_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="83307931-dab0-b55d-81ed-449b44c39efd")
public static String es_PE_FIELD_StandardPhase_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83307931-dab0-b55d-81ed-449b44c39efd")
public static final String FIELDNAME_StandardPhase_CommentHelp="83307931-dab0-b55d-81ed-449b44c39efd";

@XendraTrl(Identifier="6d4ab646-5071-ce44-5c0d-e9826c2f4096")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d4ab646-5071-ce44-5c0d-e9826c2f4096",
Synchronized="2017-08-05 16:54:07.0")
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
@XendraTrl(Identifier="b05d780f-a8ef-47f6-b8f4-21b1daeb2aa1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b05d780f-a8ef-47f6-b8f4-21b1daeb2aa1",
Synchronized="2017-08-05 16:54:07.0")
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

@XendraTrl(Identifier="bd3335df-577e-7cea-07ab-0fb7677a0151")
public static String es_PE_FIELD_StandardPhase_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="bd3335df-577e-7cea-07ab-0fb7677a0151")
public static String es_PE_FIELD_StandardPhase_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="bd3335df-577e-7cea-07ab-0fb7677a0151")
public static String es_PE_FIELD_StandardPhase_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd3335df-577e-7cea-07ab-0fb7677a0151")
public static final String FIELDNAME_StandardPhase_Product="bd3335df-577e-7cea-07ab-0fb7677a0151";

@XendraTrl(Identifier="02cb98e4-2cf1-f141-c66f-928dd5c9a949")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="02cb98e4-2cf1-f141-c66f-928dd5c9a949",Synchronized="2017-08-05 16:54:07.0")
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

@XendraTrl(Identifier="faf6a3bf-bfc8-3cf4-f8e2-153f9906a336")
public static String es_PE_FIELD_StandardPhase_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="faf6a3bf-bfc8-3cf4-f8e2-153f9906a336")
public static String es_PE_FIELD_StandardPhase_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="faf6a3bf-bfc8-3cf4-f8e2-153f9906a336")
public static String es_PE_FIELD_StandardPhase_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="faf6a3bf-bfc8-3cf4-f8e2-153f9906a336")
public static final String FIELDNAME_StandardPhase_Name="faf6a3bf-bfc8-3cf4-f8e2-153f9906a336";

@XendraTrl(Identifier="8aeb1e7f-0090-3cf5-6001-80214ccfefb3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8aeb1e7f-0090-3cf5-6001-80214ccfefb3",
Synchronized="2017-08-05 16:54:07.0")
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

@XendraTrl(Identifier="a37f3492-2e5b-6f7d-af00-9485b6398438")
public static String es_PE_FIELD_StandardPhase_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="a37f3492-2e5b-6f7d-af00-9485b6398438")
public static String es_PE_FIELD_StandardPhase_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="a37f3492-2e5b-6f7d-af00-9485b6398438")
public static String es_PE_FIELD_StandardPhase_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a37f3492-2e5b-6f7d-af00-9485b6398438")
public static final String FIELDNAME_StandardPhase_Sequence="a37f3492-2e5b-6f7d-af00-9485b6398438";

@XendraTrl(Identifier="4f09ad33-6ccc-cbaa-76c8-cda394456840")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_Phase WHERE C_ProjectType_ID=@C_ProjectType_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f09ad33-6ccc-cbaa-76c8-cda394456840",
Synchronized="2017-08-05 16:54:07.0")
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

@XendraTrl(Identifier="1b3c05f9-c5f5-eeef-5410-862272f4cc43")
public static String es_PE_FIELD_StandardPhase_StandardQuantity_Description="Cantidad Estándar";

@XendraTrl(Identifier="1b3c05f9-c5f5-eeef-5410-862272f4cc43")
public static String es_PE_FIELD_StandardPhase_StandardQuantity_Name="Cantidad Estándar";

@XendraField(AD_Column_ID="StandardQty",IsCentrallyMaintained=true,
AD_Tab_ID="9ecd6243-220c-92b7-0c4b-2094eff8ac04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b3c05f9-c5f5-eeef-5410-862272f4cc43")
public static final String FIELDNAME_StandardPhase_StandardQuantity="1b3c05f9-c5f5-eeef-5410-862272f4cc43";

@XendraTrl(Identifier="81794c40-f39d-df29-b33e-70f106c96bf9")
public static String es_PE_COLUMN_StandardQty_Name="Cantidad Estándar";

@XendraColumn(AD_Element_ID="1634a9bd-7de9-1a03-9d36-e5777fb734e7",ColumnName="StandardQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81794c40-f39d-df29-b33e-70f106c96bf9",
Synchronized="2017-08-05 16:54:07.0")
/** Column name StandardQty */
public static final String COLUMNNAME_StandardQty = "StandardQty";
}
