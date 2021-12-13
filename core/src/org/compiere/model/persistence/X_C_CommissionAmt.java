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
/** Generated Model for C_CommissionAmt
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CommissionAmt extends PO
{
/** Standard Constructor
@param ctx context
@param C_CommissionAmt_ID id
@param trxName transaction
*/
public X_C_CommissionAmt (Properties ctx, int C_CommissionAmt_ID, String trxName)
{
super (ctx, C_CommissionAmt_ID, trxName);
/** if (C_CommissionAmt_ID == 0)
{
setActualQty (Env.ZERO);
setC_CommissionAmt_ID (0);
setC_CommissionLine_ID (0);
setC_CommissionRun_ID (0);
setCommissionAmt (Env.ZERO);	
// 0
setConvertedAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CommissionAmt (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=430 */
public static int Table_ID=MTable.getTable_ID("C_CommissionAmt");

@XendraTrl(Identifier="518b021d-34da-c03f-ca8d-be1993f28b2c")
public static String es_PE_TAB_CommissionAmount_Description="Totales de línea de comisión";

@XendraTrl(Identifier="518b021d-34da-c03f-ca8d-be1993f28b2c")
public static String es_PE_TAB_CommissionAmount_Help="Para cada línea de comisión; una línea es generada. Se puede sobreescribir el Total y cantidad para modificar el Total de la comisión; pero se sugiere crear líneas de detalle de comisión adicionales. Tenga en cuenta que los cambios manuales no se reconciliarán con los detalles de comisión.";

@XendraTrl(Identifier="518b021d-34da-c03f-ca8d-be1993f28b2c")
public static String es_PE_TAB_CommissionAmount_Name="Total de Comisión";

@XendraTab(Name="Commission Amount",Description="Commission line amounts",
Help="For each commission line, a line is generated.  You can overwrite the amount and quantity to modify the commission amount, but the suggested way is creating additional Commission Detail lines.  Please be aware that manual changes will not reconcile with the Commission Details.",
AD_Window_ID="4951efe3-6b21-ab9a-5bc7-01af51e516d9",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="518b021d-34da-c03f-ca8d-be1993f28b2c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CommissionAmount="518b021d-34da-c03f-ca8d-be1993f28b2c";

@XendraTrl(Identifier="58bd026b-f414-7eb8-4761-e23a05e20517")
public static String es_PE_TABLE_C_CommissionAmt_Name="Total de la Comisión";

@XendraTable(Name="Commission Amount",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Generated Commission Amount ",
Help="",TableName="C_CommissionAmt",AccessLevel="1",
AD_Window_ID="4951efe3-6b21-ab9a-5bc7-01af51e516d9",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="58bd026b-f414-7eb8-4761-e23a05e20517",
Synchronized="2020-03-03 21:36:44.0")
/** TableName=C_CommissionAmt */
public static final String Table_Name="C_CommissionAmt";


@XendraIndex(Name="c_commissionamt_comline",Identifier="1446ba4a-8474-40b3-9bb8-1041a89be0ae",
Column_Names="c_commissionline_id",IsUnique="false",
TableIdentifier="1446ba4a-8474-40b3-9bb8-1041a89be0ae",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_commissionamt_comline = "1446ba4a-8474-40b3-9bb8-1041a89be0ae";


@XendraIndex(Name="c_commissionamt_run",Identifier="755fd876-5685-1230-18b9-cb8b65f12e8c",
Column_Names="c_commissionrun_id",IsUnique="false",
TableIdentifier="755fd876-5685-1230-18b9-cb8b65f12e8c",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_commissionamt_run = "755fd876-5685-1230-18b9-cb8b65f12e8c";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CommissionAmt");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_CommissionAmt");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CommissionAmt[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Actual Quantity.
@param ActualQty The actual quantity */
public void setActualQty (BigDecimal ActualQty)
{
if (ActualQty == null) throw new IllegalArgumentException ("ActualQty is mandatory.");
set_Value (COLUMNNAME_ActualQty, ActualQty);
}
/** Get Actual Quantity.
@return The actual quantity */
public BigDecimal getActualQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ActualQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="239c1dba-029c-5661-96e0-7eca181c6256")
public static String es_PE_FIELD_CommissionAmount_ActualQuantity_Name="Cantidad Actual";

@XendraTrl(Identifier="239c1dba-029c-5661-96e0-7eca181c6256")
public static String es_PE_FIELD_CommissionAmount_ActualQuantity_Description="La cantidad actual";

@XendraTrl(Identifier="239c1dba-029c-5661-96e0-7eca181c6256")
public static String es_PE_FIELD_CommissionAmount_ActualQuantity_Help="La Cantidad actual indica la cantidad tal como se refiere en un documento";

@XendraField(AD_Column_ID="ActualQty",IsCentrallyMaintained=true,
AD_Tab_ID="518b021d-34da-c03f-ca8d-be1993f28b2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="239c1dba-029c-5661-96e0-7eca181c6256")
public static final String FIELDNAME_CommissionAmount_ActualQuantity="239c1dba-029c-5661-96e0-7eca181c6256";

@XendraTrl(Identifier="c5c88514-60e5-d5a8-9565-cc1480cdc276")
public static String es_PE_COLUMN_ActualQty_Name="Cantidad Actual";

@XendraColumn(AD_Element_ID="422ec1ba-eb68-e7f9-d2b6-93623297521f",ColumnName="ActualQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5c88514-60e5-d5a8-9565-cc1480cdc276",
Synchronized="2019-08-30 22:21:23.0")
/** Column name ActualQty */
public static final String COLUMNNAME_ActualQty = "ActualQty";
/** Set Commission Amount.
@param C_CommissionAmt_ID Generated Commission Amount  */
public void setC_CommissionAmt_ID (int C_CommissionAmt_ID)
{
if (C_CommissionAmt_ID < 1) throw new IllegalArgumentException ("C_CommissionAmt_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CommissionAmt_ID, Integer.valueOf(C_CommissionAmt_ID));
}
/** Get Commission Amount.
@return Generated Commission Amount  */
public int getC_CommissionAmt_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionAmt_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ee15aa9f-9be6-8b77-4dc9-f77f0068d663")
public static String es_PE_FIELD_CommissionAmount_CommissionAmount_Name="Total de la Comisión";

@XendraTrl(Identifier="ee15aa9f-9be6-8b77-4dc9-f77f0068d663")
public static String es_PE_FIELD_CommissionAmount_CommissionAmount_Description="Total de la comisión generada";

@XendraTrl(Identifier="ee15aa9f-9be6-8b77-4dc9-f77f0068d663")
public static String es_PE_FIELD_CommissionAmount_CommissionAmount_Help="La cantidad de la Comisión indica la cantidad que resulta de un funcionamiento de la comisión.";

@XendraField(AD_Column_ID="C_CommissionAmt_ID",IsCentrallyMaintained=true,
AD_Tab_ID="518b021d-34da-c03f-ca8d-be1993f28b2c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee15aa9f-9be6-8b77-4dc9-f77f0068d663")
public static final String FIELDNAME_CommissionAmount_CommissionAmount="ee15aa9f-9be6-8b77-4dc9-f77f0068d663";
/** Column name C_CommissionAmt_ID */
public static final String COLUMNNAME_C_CommissionAmt_ID = "C_CommissionAmt_ID";
/** Set Commission Line.
@param C_CommissionLine_ID Commission Line */
public void setC_CommissionLine_ID (int C_CommissionLine_ID)
{
if (C_CommissionLine_ID < 1) throw new IllegalArgumentException ("C_CommissionLine_ID is mandatory.");
set_Value (COLUMNNAME_C_CommissionLine_ID, Integer.valueOf(C_CommissionLine_ID));
}
/** Get Commission Line.
@return Commission Line */
public int getC_CommissionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="110e489f-bb63-d3f7-c2da-4ea0553e98ad")
public static String es_PE_FIELD_CommissionAmount_CommissionLine_Name="Item de la comisión";

@XendraTrl(Identifier="110e489f-bb63-d3f7-c2da-4ea0553e98ad")
public static String es_PE_FIELD_CommissionAmount_CommissionLine_Description="Item de la comisión";

@XendraTrl(Identifier="110e489f-bb63-d3f7-c2da-4ea0553e98ad")
public static String es_PE_FIELD_CommissionAmount_CommissionLine_Help="Es un caso único de un funcionamiento de la comisión. Si el funcionamiento de la comisión fue hecho en modo sumario entonces habrá un solo Item que representa los totales seleccionados de los documentos. ";

@XendraField(AD_Column_ID="C_CommissionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="518b021d-34da-c03f-ca8d-be1993f28b2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="110e489f-bb63-d3f7-c2da-4ea0553e98ad")
public static final String FIELDNAME_CommissionAmount_CommissionLine="110e489f-bb63-d3f7-c2da-4ea0553e98ad";

@XendraTrl(Identifier="25d1b937-e5e1-4940-a9f9-ad2fa011acc5")
public static String es_PE_COLUMN_C_CommissionLine_ID_Name="Línea de la comisión";

@XendraColumn(AD_Element_ID="c58c16cb-f144-72bc-b200-e7886e8444da",
ColumnName="C_CommissionLine_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="25d1b937-e5e1-4940-a9f9-ad2fa011acc5",Synchronized="2019-08-30 22:21:23.0")
/** Column name C_CommissionLine_ID */
public static final String COLUMNNAME_C_CommissionLine_ID = "C_CommissionLine_ID";
/** Set Commission Run.
@param C_CommissionRun_ID Commission Run or Process */
public void setC_CommissionRun_ID (int C_CommissionRun_ID)
{
if (C_CommissionRun_ID < 1) throw new IllegalArgumentException ("C_CommissionRun_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CommissionRun_ID, Integer.valueOf(C_CommissionRun_ID));
}
/** Get Commission Run.
@return Commission Run or Process */
public int getC_CommissionRun_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionRun_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_CommissionRun_ID()));
}

@XendraTrl(Identifier="045d45f8-9433-efc5-c970-465cb9c69bc3")
public static String es_PE_FIELD_CommissionAmount_CommissionRun_Name="Cálculo de Comisiones";

@XendraTrl(Identifier="045d45f8-9433-efc5-c970-465cb9c69bc3")
public static String es_PE_FIELD_CommissionAmount_CommissionRun_Description="Cálculo o proceso de comisiones ";

@XendraTrl(Identifier="045d45f8-9433-efc5-c970-465cb9c69bc3")
public static String es_PE_FIELD_CommissionAmount_CommissionRun_Help="La Corrida de Comisión es un identificador único definido por el sistema de una corrida específica de comisiones. Cuando una comisión se procece en la pantalla de comisiones. La ID de corrida de comisiones será desplegada";

@XendraField(AD_Column_ID="C_CommissionRun_ID",IsCentrallyMaintained=true,
AD_Tab_ID="518b021d-34da-c03f-ca8d-be1993f28b2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="045d45f8-9433-efc5-c970-465cb9c69bc3")
public static final String FIELDNAME_CommissionAmount_CommissionRun="045d45f8-9433-efc5-c970-465cb9c69bc3";

@XendraTrl(Identifier="09d8119c-a30c-8888-51cb-aff0931e995f")
public static String es_PE_COLUMN_C_CommissionRun_ID_Name="Cálculo de Comisiones";

@XendraColumn(AD_Element_ID="076506ed-031d-ee54-86fa-8e66e19a30b9",ColumnName="C_CommissionRun_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09d8119c-a30c-8888-51cb-aff0931e995f",
Synchronized="2019-08-30 22:21:23.0")
/** Column name C_CommissionRun_ID */
public static final String COLUMNNAME_C_CommissionRun_ID = "C_CommissionRun_ID";
/** Set Commission Amount.
@param CommissionAmt Commission Amount */
public void setCommissionAmt (BigDecimal CommissionAmt)
{
if (CommissionAmt == null) throw new IllegalArgumentException ("CommissionAmt is mandatory.");
set_Value (COLUMNNAME_CommissionAmt, CommissionAmt);
}
/** Get Commission Amount.
@return Commission Amount */
public BigDecimal getCommissionAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommissionAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9540f3b9-ac35-1aa5-beae-81754f04a60f")
public static String es_PE_FIELD_CommissionAmount_CommissionAmount2_Name="Total de la Comisión";

@XendraTrl(Identifier="9540f3b9-ac35-1aa5-beae-81754f04a60f")
public static String es_PE_FIELD_CommissionAmount_CommissionAmount2_Description="Total de la Comisión";

@XendraTrl(Identifier="9540f3b9-ac35-1aa5-beae-81754f04a60f")
public static String es_PE_FIELD_CommissionAmount_CommissionAmount2_Help="La cantidad de la Comisión es la comisión calculada total. Se basa en los parámetros según lo definido para este funcionamiento de la comisión.";

@XendraField(AD_Column_ID="CommissionAmt",IsCentrallyMaintained=true,
AD_Tab_ID="518b021d-34da-c03f-ca8d-be1993f28b2c",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9540f3b9-ac35-1aa5-beae-81754f04a60f")
public static final String FIELDNAME_CommissionAmount_CommissionAmount2="9540f3b9-ac35-1aa5-beae-81754f04a60f";

@XendraTrl(Identifier="fca1a5c4-a895-e657-ef78-81b38e63d7c1")
public static String es_PE_COLUMN_CommissionAmt_Name="Total de la Comisión";

@XendraColumn(AD_Element_ID="851af720-34b5-23f0-c666-7bd6631d675e",ColumnName="CommissionAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fca1a5c4-a895-e657-ef78-81b38e63d7c1",
Synchronized="2019-08-30 22:21:23.0")
/** Column name CommissionAmt */
public static final String COLUMNNAME_CommissionAmt = "CommissionAmt";
/** Set Converted Amount.
@param ConvertedAmt Converted Amount */
public void setConvertedAmt (BigDecimal ConvertedAmt)
{
if (ConvertedAmt == null) throw new IllegalArgumentException ("ConvertedAmt is mandatory.");
set_Value (COLUMNNAME_ConvertedAmt, ConvertedAmt);
}
/** Get Converted Amount.
@return Converted Amount */
public BigDecimal getConvertedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConvertedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="722f5586-456a-1061-3b84-49d56e74154b")
public static String es_PE_FIELD_CommissionAmount_ConvertedAmount_Name="Total Convertido";

@XendraTrl(Identifier="722f5586-456a-1061-3b84-49d56e74154b")
public static String es_PE_FIELD_CommissionAmount_ConvertedAmount_Description="Total Convertido";

@XendraTrl(Identifier="722f5586-456a-1061-3b84-49d56e74154b")
public static String es_PE_FIELD_CommissionAmount_ConvertedAmount_Help="El Total convertido es el resultado de multiplicar el total fuente por la tasa de conversión para esta moneda destino.";

@XendraField(AD_Column_ID="ConvertedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="518b021d-34da-c03f-ca8d-be1993f28b2c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="722f5586-456a-1061-3b84-49d56e74154b")
public static final String FIELDNAME_CommissionAmount_ConvertedAmount="722f5586-456a-1061-3b84-49d56e74154b";

@XendraTrl(Identifier="27c2ba5d-3868-f24b-c697-b23c58a55b04")
public static String es_PE_COLUMN_ConvertedAmt_Name="Total Convertido";

@XendraColumn(AD_Element_ID="6b6925fc-75bd-914f-a973-fc059d2b2f46",ColumnName="ConvertedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27c2ba5d-3868-f24b-c697-b23c58a55b04",
Synchronized="2019-08-30 22:21:23.0")
/** Column name ConvertedAmt */
public static final String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
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
@XendraTrl(Identifier="82b0a7e0-3e8f-4a2f-9d4f-53943f4a349e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82b0a7e0-3e8f-4a2f-9d4f-53943f4a349e",
Synchronized="2019-08-30 22:21:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
