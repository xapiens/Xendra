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
/** Generated Model for C_CycleStep
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CycleStep extends PO
{
/** Standard Constructor
@param ctx context
@param C_CycleStep_ID id
@param trxName transaction
*/
public X_C_CycleStep (Properties ctx, int C_CycleStep_ID, String trxName)
{
super (ctx, C_CycleStep_ID, trxName);
/** if (C_CycleStep_ID == 0)
{
setC_Cycle_ID (0);
setC_CycleStep_ID (0);
setName (null);
setRelativeWeight (Env.ZERO);	
// 1
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_CycleStep WHERE C_Cycle_ID=@C_Cycle_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CycleStep (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=590 */
public static int Table_ID=MTable.getTable_ID("C_CycleStep");

@XendraTrl(Identifier="a523752a-6f1a-fabf-6d17-e0249d83a759")
public static String es_PE_TAB_Step_Description="Pasos Cliclo del Proyecto";

@XendraTrl(Identifier="a523752a-6f1a-fabf-6d17-e0249d83a759")
public static String es_PE_TAB_Step_Help="El paso del ciclo determina la secuencia de evento lógica dentro de su ciclo. Es el campo común de las fases similares del proyecto que hacen diversos tipos del proyecto comparables.";

@XendraTrl(Identifier="a523752a-6f1a-fabf-6d17-e0249d83a759")
public static String es_PE_TAB_Step_Name="Paso";
@XendraTab(Name="Step",
Description="Project Cycle Step",
Help="The Cycle Step determines the logical sequence of events within your cycle. It is the common of similar Project Phases making different project types comparable.",
AD_Window_ID="1d686c87-4250-cd4c-c787-342ca8921a79",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a523752a-6f1a-fabf-6d17-e0249d83a759",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Step="a523752a-6f1a-fabf-6d17-e0249d83a759";

@XendraTrl(Identifier="a1040db6-2d09-6752-c2d3-ded6f41f174c")
public static String es_PE_TABLE_C_CycleStep_Name="Etapa del Ciclo";

@XendraTable(Name="Cycle Step",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="The step for this Cycle",Help="",
TableName="C_CycleStep",AccessLevel="3",AD_Window_ID="1d686c87-4250-cd4c-c787-342ca8921a79",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="a1040db6-2d09-6752-c2d3-ded6f41f174c",Synchronized="2020-03-03 21:36:49.0")
/** TableName=C_CycleStep */
public static final String Table_Name="C_CycleStep";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CycleStep");

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
    Table_ID = MTable.getTable_ID("C_CycleStep");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CycleStep[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Project Cycle.
@param C_Cycle_ID Identifier for this Project Reporting Cycle */
public void setC_Cycle_ID (int C_Cycle_ID)
{
if (C_Cycle_ID < 1) throw new IllegalArgumentException ("C_Cycle_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Cycle_ID, Integer.valueOf(C_Cycle_ID));
}
/** Get Project Cycle.
@return Identifier for this Project Reporting Cycle */
public int getC_Cycle_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cycle_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ae2014e-c905-6fe9-2642-a507a5f6b471")
public static String es_PE_FIELD_Step_ProjectCycle_Name="Ciclo del Proyecto";

@XendraTrl(Identifier="2ae2014e-c905-6fe9-2642-a507a5f6b471")
public static String es_PE_FIELD_Step_ProjectCycle_Description="Identificador de este ciclo del proyecto";

@XendraTrl(Identifier="2ae2014e-c905-6fe9-2642-a507a5f6b471")
public static String es_PE_FIELD_Step_ProjectCycle_Help="Identifica un ciclo del proyecto que se pueda componer de uno ó más pasos ó estados.";

@XendraField(AD_Column_ID="C_Cycle_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a523752a-6f1a-fabf-6d17-e0249d83a759",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ae2014e-c905-6fe9-2642-a507a5f6b471")
public static final String FIELDNAME_Step_ProjectCycle="2ae2014e-c905-6fe9-2642-a507a5f6b471";

@XendraTrl(Identifier="97206540-5d44-156e-ae1d-ec31cdc10c5b")
public static String es_PE_COLUMN_C_Cycle_ID_Name="Ciclo del Proyecto";

@XendraColumn(AD_Element_ID="f31648cd-d538-93c2-7ef5-0f6a82b18379",ColumnName="C_Cycle_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97206540-5d44-156e-ae1d-ec31cdc10c5b",
Synchronized="2019-08-30 22:21:29.0")
/** Column name C_Cycle_ID */
public static final String COLUMNNAME_C_Cycle_ID = "C_Cycle_ID";
/** Set Cycle Step.
@param C_CycleStep_ID The step for this Cycle */
public void setC_CycleStep_ID (int C_CycleStep_ID)
{
if (C_CycleStep_ID < 1) throw new IllegalArgumentException ("C_CycleStep_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CycleStep_ID, Integer.valueOf(C_CycleStep_ID));
}
/** Get Cycle Step.
@return The step for this Cycle */
public int getC_CycleStep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CycleStep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4cd605a0-ad2c-ab8b-ec01-8af8469e254a")
public static String es_PE_FIELD_Step_CycleStep_Name="Etapa del Ciclo";

@XendraTrl(Identifier="4cd605a0-ad2c-ab8b-ec01-8af8469e254a")
public static String es_PE_FIELD_Step_CycleStep_Description="El paso para este ciclo";

@XendraTrl(Identifier="4cd605a0-ad2c-ab8b-ec01-8af8469e254a")
public static String es_PE_FIELD_Step_CycleStep_Help="Identifica unos ó más pasos dentro de un ciclo del proyecto.";

@XendraField(AD_Column_ID="C_CycleStep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a523752a-6f1a-fabf-6d17-e0249d83a759",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cd605a0-ad2c-ab8b-ec01-8af8469e254a")
public static final String FIELDNAME_Step_CycleStep="4cd605a0-ad2c-ab8b-ec01-8af8469e254a";
/** Column name C_CycleStep_ID */
public static final String COLUMNNAME_C_CycleStep_ID = "C_CycleStep_ID";
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
@XendraTrl(Identifier="3b3a945c-fabd-43df-9f8d-7594fa83fffe")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b3a945c-fabd-43df-9f8d-7594fa83fffe",
Synchronized="2019-08-30 22:21:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="87c51db5-4d10-805c-6012-75c019652b0a")
public static String es_PE_FIELD_Step_Name_Name="Nombre";

@XendraTrl(Identifier="87c51db5-4d10-805c-6012-75c019652b0a")
public static String es_PE_FIELD_Step_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="87c51db5-4d10-805c-6012-75c019652b0a")
public static String es_PE_FIELD_Step_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="a523752a-6f1a-fabf-6d17-e0249d83a759",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87c51db5-4d10-805c-6012-75c019652b0a")
public static final String FIELDNAME_Step_Name="87c51db5-4d10-805c-6012-75c019652b0a";

@XendraTrl(Identifier="47977be4-98d6-30b3-f0dc-616e898cf7b1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47977be4-98d6-30b3-f0dc-616e898cf7b1",
Synchronized="2019-08-30 22:21:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Relative Weight.
@param RelativeWeight Relative weight of this step (0 = ignored) */
public void setRelativeWeight (BigDecimal RelativeWeight)
{
if (RelativeWeight == null) throw new IllegalArgumentException ("RelativeWeight is mandatory.");
set_Value (COLUMNNAME_RelativeWeight, RelativeWeight);
}
/** Get Relative Weight.
@return Relative weight of this step (0 = ignored) */
public BigDecimal getRelativeWeight() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RelativeWeight);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9abb52f0-0fd0-e619-5fee-22456c79d47c")
public static String es_PE_FIELD_Step_RelativeWeight_Name="Peso Relativo";

@XendraTrl(Identifier="9abb52f0-0fd0-e619-5fee-22456c79d47c")
public static String es_PE_FIELD_Step_RelativeWeight_Description="Peso relativo de este paso (0=ignorado)";

@XendraTrl(Identifier="9abb52f0-0fd0-e619-5fee-22456c79d47c")
public static String es_PE_FIELD_Step_RelativeWeight_Help="El peso relativo le permite ajustar el Informe basado en probabilidades. Por Ej. Si usted tiene 1:10 de oportunidades de cerrar un contrato cuando está en la etapa de prospecto y 1:2 de oportunidades cuando está en la etapa de contrato; usted puede poner un peso de 0.1 y 0.5";

@XendraField(AD_Column_ID="RelativeWeight",IsCentrallyMaintained=true,
AD_Tab_ID="a523752a-6f1a-fabf-6d17-e0249d83a759",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9abb52f0-0fd0-e619-5fee-22456c79d47c")
public static final String FIELDNAME_Step_RelativeWeight="9abb52f0-0fd0-e619-5fee-22456c79d47c";

@XendraTrl(Identifier="d71b4e5a-a772-ab73-bd0a-b3fd0ca135c5")
public static String es_PE_COLUMN_RelativeWeight_Name="Peso Relativo";

@XendraColumn(AD_Element_ID="e2db7feb-fe90-45ec-faac-9e11cb9ecdd7",ColumnName="RelativeWeight",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d71b4e5a-a772-ab73-bd0a-b3fd0ca135c5",
Synchronized="2019-08-30 22:21:29.0")
/** Column name RelativeWeight */
public static final String COLUMNNAME_RelativeWeight = "RelativeWeight";
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

@XendraTrl(Identifier="847d1ebb-9942-9ddc-a7cd-27cc7b3c56ac")
public static String es_PE_FIELD_Step_Sequence_Name="Secuencia";

@XendraTrl(Identifier="847d1ebb-9942-9ddc-a7cd-27cc7b3c56ac")
public static String es_PE_FIELD_Step_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="847d1ebb-9942-9ddc-a7cd-27cc7b3c56ac")
public static String es_PE_FIELD_Step_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="a523752a-6f1a-fabf-6d17-e0249d83a759",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="847d1ebb-9942-9ddc-a7cd-27cc7b3c56ac")
public static final String FIELDNAME_Step_Sequence="847d1ebb-9942-9ddc-a7cd-27cc7b3c56ac";

@XendraTrl(Identifier="98c3dded-fde0-c414-47d0-0608b59334e5")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM C_CycleStep WHERE C_Cycle_ID=@C_Cycle_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98c3dded-fde0-c414-47d0-0608b59334e5",
Synchronized="2019-08-30 22:21:29.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
