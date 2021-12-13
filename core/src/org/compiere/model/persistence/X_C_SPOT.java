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
/** Generated Model for C_SPOT
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_SPOT extends PO
{
/** Standard Constructor
@param ctx context
@param C_SPOT_ID id
@param trxName transaction
*/
public X_C_SPOT (Properties ctx, int C_SPOT_ID, String trxName)
{
super (ctx, C_SPOT_ID, trxName);
/** if (C_SPOT_ID == 0)
{
setC_RetentionMinAmt (Env.ZERO);	
// 0
setC_RetentionRate (Env.ZERO);
setC_SPOT_ID (0);
setName (null);
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_SPOT (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000129 */
public static int Table_ID=MTable.getTable_ID("C_SPOT");

@XendraTrl(Identifier="1f054ed6-8a4e-9110-d016-9e7bb112997c")
public static String es_PE_TAB_Spot_Name="Spot";
@XendraTab(Name="Spot",Description="",Help="",
AD_Window_ID="2be857ea-0153-f59c-2a00-5f33feb58858",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1f054ed6-8a4e-9110-d016-9e7bb112997c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Spot="1f054ed6-8a4e-9110-d016-9e7bb112997c";

@XendraTrl(Identifier="8f4d7c86-1c8d-1c7e-d4f4-882aa352f2ac")
public static String es_PE_TABLE_C_SPOT_Name="C_SPOT";

@XendraTable(Name="C_SPOT",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="C_SPOT",Help="",
TableName="C_SPOT",AccessLevel="3",AD_Window_ID="2be857ea-0153-f59c-2a00-5f33feb58858",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="8f4d7c86-1c8d-1c7e-d4f4-882aa352f2ac",Synchronized="2020-03-03 21:37:40.0")
/** TableName=C_SPOT */
public static final String Table_Name="C_SPOT";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_SPOT");

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
    Table_ID = MTable.getTable_ID("C_SPOT");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_SPOT[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_ReteConversionType_ID.
@param C_ReteConversionType_ID C_ReteConversionType_ID */
public void setC_ReteConversionType_ID (int C_ReteConversionType_ID)
{
if (C_ReteConversionType_ID <= 0) set_Value (COLUMNNAME_C_ReteConversionType_ID, null);
 else 
set_Value (COLUMNNAME_C_ReteConversionType_ID, Integer.valueOf(C_ReteConversionType_ID));
}
/** Get C_ReteConversionType_ID.
@return C_ReteConversionType_ID */
public int getC_ReteConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ReteConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="756485f8-0c53-da92-6e4c-5cfdc1ef1994")
public static String es_PE_FIELD_Spot_C_ReteConversionType_ID_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ReteConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1f054ed6-8a4e-9110-d016-9e7bb112997c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="756485f8-0c53-da92-6e4c-5cfdc1ef1994")
public static final String FIELDNAME_Spot_C_ReteConversionType_ID="756485f8-0c53-da92-6e4c-5cfdc1ef1994";

@XendraTrl(Identifier="94796208-d5f6-d461-6cfc-cffe9116382c")
public static String es_PE_COLUMN_C_ReteConversionType_ID_Name="c_reteconversiontype_id";

@XendraColumn(AD_Element_ID="593b8fd5-2841-b884-263f-9027eed654a0",
ColumnName="C_ReteConversionType_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="41dda287-7ecf-a6d1-d177-b35716a62768",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="94796208-d5f6-d461-6cfc-cffe9116382c",
Synchronized="2019-08-30 22:22:17.0")
/** Column name C_ReteConversionType_ID */
public static final String COLUMNNAME_C_ReteConversionType_ID = "C_ReteConversionType_ID";
/** Set C_RetentionMinAmt.
@param C_RetentionMinAmt C_RetentionMinAmt */
public void setC_RetentionMinAmt (BigDecimal C_RetentionMinAmt)
{
if (C_RetentionMinAmt == null) throw new IllegalArgumentException ("C_RetentionMinAmt is mandatory.");
set_Value (COLUMNNAME_C_RetentionMinAmt, C_RetentionMinAmt);
}
/** Get C_RetentionMinAmt.
@return C_RetentionMinAmt */
public BigDecimal getC_RetentionMinAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_C_RetentionMinAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9ca001c3-6ae9-0f25-a685-013f139a1b72")
public static String es_PE_FIELD_Spot_C_RetentionMinAmt_Name="Monto Mínimo";

@XendraField(AD_Column_ID="C_RetentionMinAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1f054ed6-8a4e-9110-d016-9e7bb112997c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ca001c3-6ae9-0f25-a685-013f139a1b72")
public static final String FIELDNAME_Spot_C_RetentionMinAmt="9ca001c3-6ae9-0f25-a685-013f139a1b72";

@XendraTrl(Identifier="c53a7fee-d697-6c08-6dd7-c1f412e9f637")
public static String es_PE_COLUMN_C_RetentionMinAmt_Name="c_retentionminamt";

@XendraColumn(AD_Element_ID="73c4fdcb-ea10-7900-5b9e-0d841d168250",ColumnName="C_RetentionMinAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c53a7fee-d697-6c08-6dd7-c1f412e9f637",
Synchronized="2019-08-30 22:22:17.0")
/** Column name C_RetentionMinAmt */
public static final String COLUMNNAME_C_RetentionMinAmt = "C_RetentionMinAmt";
/** Set C_RetentionRate.
@param C_RetentionRate C_RetentionRate */
public void setC_RetentionRate (BigDecimal C_RetentionRate)
{
if (C_RetentionRate == null) throw new IllegalArgumentException ("C_RetentionRate is mandatory.");
set_Value (COLUMNNAME_C_RetentionRate, C_RetentionRate);
}
/** Get C_RetentionRate.
@return C_RetentionRate */
public BigDecimal getC_RetentionRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_C_RetentionRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e76ff486-2088-a9a2-a336-b78846c34d85")
public static String es_PE_FIELD_Spot_C_RetentionRate_Name="Tasa de Detracción";

@XendraField(AD_Column_ID="C_RetentionRate",IsCentrallyMaintained=true,
AD_Tab_ID="1f054ed6-8a4e-9110-d016-9e7bb112997c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e76ff486-2088-a9a2-a336-b78846c34d85")
public static final String FIELDNAME_Spot_C_RetentionRate="e76ff486-2088-a9a2-a336-b78846c34d85";

@XendraTrl(Identifier="69b61330-d66c-1f2f-f62b-cae6c9bb5ade")
public static String es_PE_COLUMN_C_RetentionRate_Name="c_retentionrate";

@XendraColumn(AD_Element_ID="c2850ec9-d1d9-88bd-3971-9faf8f4aaf49",ColumnName="C_RetentionRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69b61330-d66c-1f2f-f62b-cae6c9bb5ade",
Synchronized="2019-08-30 22:22:17.0")
/** Column name C_RetentionRate */
public static final String COLUMNNAME_C_RetentionRate = "C_RetentionRate";
/** Set C_SPOT_ID.
@param C_SPOT_ID C_SPOT_ID */
public void setC_SPOT_ID (int C_SPOT_ID)
{
if (C_SPOT_ID < 1) throw new IllegalArgumentException ("C_SPOT_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_SPOT_ID, Integer.valueOf(C_SPOT_ID));
}
/** Get C_SPOT_ID.
@return C_SPOT_ID */
public int getC_SPOT_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SPOT_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9a9e2676-f6db-d98b-205c-9d5827741824")
public static String es_PE_FIELD_Spot_C_SPOT_ID_Name="c_spot_id";

@XendraField(AD_Column_ID="C_SPOT_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1f054ed6-8a4e-9110-d016-9e7bb112997c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a9e2676-f6db-d98b-205c-9d5827741824")
public static final String FIELDNAME_Spot_C_SPOT_ID="9a9e2676-f6db-d98b-205c-9d5827741824";
/** Column name C_SPOT_ID */
public static final String COLUMNNAME_C_SPOT_ID = "C_SPOT_ID";
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
@XendraTrl(Identifier="0a370f88-8a47-41b8-8582-7ee2447cc941")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a370f88-8a47-41b8-8582-7ee2447cc941",
Synchronized="2019-08-30 22:22:17.0")
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

@XendraTrl(Identifier="430e1b31-8d9f-076c-9195-fcb0330e9052")
public static String es_PE_FIELD_Spot_Name_Name="Nombre";

@XendraTrl(Identifier="430e1b31-8d9f-076c-9195-fcb0330e9052")
public static String es_PE_FIELD_Spot_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="430e1b31-8d9f-076c-9195-fcb0330e9052")
public static String es_PE_FIELD_Spot_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="1f054ed6-8a4e-9110-d016-9e7bb112997c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="430e1b31-8d9f-076c-9195-fcb0330e9052")
public static final String FIELDNAME_Spot_Name="430e1b31-8d9f-076c-9195-fcb0330e9052";

@XendraTrl(Identifier="47b9e7ea-5765-755c-9624-f857a96fb16a")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47b9e7ea-5765-755c-9624-f857a96fb16a",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2f82c7c5-790d-ea0b-c3ac-26ee1300e509")
public static String es_PE_FIELD_Spot_Processed_Name="Procesado";

@XendraTrl(Identifier="2f82c7c5-790d-ea0b-c3ac-26ee1300e509")
public static String es_PE_FIELD_Spot_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2f82c7c5-790d-ea0b-c3ac-26ee1300e509")
public static String es_PE_FIELD_Spot_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="1f054ed6-8a4e-9110-d016-9e7bb112997c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f82c7c5-790d-ea0b-c3ac-26ee1300e509")
public static final String FIELDNAME_Spot_Processed="2f82c7c5-790d-ea0b-c3ac-26ee1300e509";

@XendraTrl(Identifier="934f63ee-cc2a-d606-143c-263eb49ed28f")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="934f63ee-cc2a-d606-143c-263eb49ed28f",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="2e4c1c1d-9d16-ef2c-dae6-d6ee60633906")
public static String es_PE_FIELD_Spot_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="1f054ed6-8a4e-9110-d016-9e7bb112997c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e4c1c1d-9d16-ef2c-dae6-d6ee60633906")
public static final String FIELDNAME_Spot_ProcessNow="2e4c1c1d-9d16-ef2c-dae6-d6ee60633906";

@XendraTrl(Identifier="acbac5cc-9864-29d0-7a27-7064b6072c97")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="acbac5cc-9864-29d0-7a27-7064b6072c97",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
