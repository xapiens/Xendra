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
/** Generated Model for PA_Ratio
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Ratio extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Ratio_ID id
@param trxName transaction
*/
public X_PA_Ratio (Properties ctx, int PA_Ratio_ID, String trxName)
{
super (ctx, PA_Ratio_ID, trxName);
/** if (PA_Ratio_ID == 0)
{
setC_AcctSchema_ID (0);
setName (null);
setPA_Ratio_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Ratio (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=835 */
public static int Table_ID=MTable.getTable_ID("PA_Ratio");

@XendraTrl(Identifier="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6")
public static String es_PE_TAB_Ratio_Description="Relación de Desempeño";

@XendraTrl(Identifier="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6")
public static String es_PE_TAB_Ratio_Name="Relación";

@XendraTrl(Identifier="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6")
public static String es_PE_TAB_Ratio_Help="Ajusta instrucción de cálculo para una Relación de Desempeño.";

@XendraTab(Name="Ratio",Description="Performance Ratio",
Help="Calculation instruction set  for a performance ratio",
AD_Window_ID="55c355a0-9ecc-670d-480c-5315b8c95dd3",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Ratio="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6";

@XendraTrl(Identifier="7a886d87-0a1b-f3a3-f4c0-177583e1f270")
public static String es_PE_TABLE_PA_Ratio_Name="Razón";

@XendraTable(Name="Ratio",Description="Performace Ratio",Help="",TableName="PA_Ratio",
AccessLevel="2",AD_Window_ID="55c355a0-9ecc-670d-480c-5315b8c95dd3",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="7a886d87-0a1b-f3a3-f4c0-177583e1f270",Synchronized="2017-08-16 11:43:41.0")
/** TableName=PA_Ratio */
public static final String Table_Name="PA_Ratio";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Ratio");

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
    Table_ID = MTable.getTable_ID("PA_Ratio");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Ratio[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b1d72f1a-e5f0-a1bb-9c76-a22b80f567b3")
public static String es_PE_FIELD_Ratio_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="b1d72f1a-e5f0-a1bb-9c76-a22b80f567b3")
public static String es_PE_FIELD_Ratio_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="b1d72f1a-e5f0-a1bb-9c76-a22b80f567b3")
public static String es_PE_FIELD_Ratio_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1d72f1a-e5f0-a1bb-9c76-a22b80f567b3")
public static final String FIELDNAME_Ratio_AccountingSchema="b1d72f1a-e5f0-a1bb-9c76-a22b80f567b3";

@XendraTrl(Identifier="beef3456-2046-9b11-a62b-87eadd938165")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="beef3456-2046-9b11-a62b-87eadd938165",
Synchronized="2017-08-05 16:55:42.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="38193731-1c8d-9ec5-d99f-19fc8d36b0b2")
public static String es_PE_FIELD_Ratio_Description_Description="Observación";

@XendraTrl(Identifier="38193731-1c8d-9ec5-d99f-19fc8d36b0b2")
public static String es_PE_FIELD_Ratio_Description_Help="Observación";

@XendraTrl(Identifier="38193731-1c8d-9ec5-d99f-19fc8d36b0b2")
public static String es_PE_FIELD_Ratio_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38193731-1c8d-9ec5-d99f-19fc8d36b0b2")
public static final String FIELDNAME_Ratio_Description="38193731-1c8d-9ec5-d99f-19fc8d36b0b2";

@XendraTrl(Identifier="6883c21b-47a9-4b8c-f1d6-049542feb578")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6883c21b-47a9-4b8c-f1d6-049542feb578",
Synchronized="2017-08-05 16:55:42.0")
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

@XendraTrl(Identifier="7c5db80d-1904-b3a2-bce0-3dc735790a67")
public static String es_PE_FIELD_Ratio_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="7c5db80d-1904-b3a2-bce0-3dc735790a67")
public static String es_PE_FIELD_Ratio_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="7c5db80d-1904-b3a2-bce0-3dc735790a67")
public static String es_PE_FIELD_Ratio_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7c5db80d-1904-b3a2-bce0-3dc735790a67")
public static final String FIELDNAME_Ratio_CommentHelp="7c5db80d-1904-b3a2-bce0-3dc735790a67";

@XendraTrl(Identifier="a26f856a-a390-bc5c-35a1-2de22377d569")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a26f856a-a390-bc5c-35a1-2de22377d569",
Synchronized="2017-08-05 16:55:42.0")
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
@XendraTrl(Identifier="d7b9b219-1c34-4dff-945f-f01d08583d22")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7b9b219-1c34-4dff-945f-f01d08583d22",
Synchronized="2017-08-05 16:55:42.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="92e36213-6474-0401-53fe-3801775d9381")
public static String es_PE_FIELD_Ratio_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="92e36213-6474-0401-53fe-3801775d9381")
public static String es_PE_FIELD_Ratio_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="92e36213-6474-0401-53fe-3801775d9381")
public static String es_PE_FIELD_Ratio_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="92e36213-6474-0401-53fe-3801775d9381")
public static final String FIELDNAME_Ratio_Name="92e36213-6474-0401-53fe-3801775d9381";

@XendraTrl(Identifier="e16f7c3a-65e2-b306-8706-749c2d00155d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e16f7c3a-65e2-b306-8706-749c2d00155d",
Synchronized="2017-08-05 16:55:42.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Ratio.
@param PA_Ratio_ID Performace Ratio */
public void setPA_Ratio_ID (int PA_Ratio_ID)
{
if (PA_Ratio_ID < 1) throw new IllegalArgumentException ("PA_Ratio_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Ratio_ID, Integer.valueOf(PA_Ratio_ID));
}
/** Get Ratio.
@return Performace Ratio */
public int getPA_Ratio_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Ratio_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="24c05f70-bb09-6393-0ab4-a5ed6fa89eb5")
public static String es_PE_FIELD_Ratio_Ratio_Description="Razón de Desempeño";

@XendraTrl(Identifier="24c05f70-bb09-6393-0ab4-a5ed6fa89eb5")
public static String es_PE_FIELD_Ratio_Ratio_Help="Ajusta instrucción de cálculo para Razón de Desempeño.";

@XendraTrl(Identifier="24c05f70-bb09-6393-0ab4-a5ed6fa89eb5")
public static String es_PE_FIELD_Ratio_Ratio_Name="Razón";
@XendraField(AD_Column_ID="PA_Ratio_ID",
IsCentrallyMaintained=true,AD_Tab_ID="2e8b7bb4-7acc-3c90-196c-1c83fccfe5a6",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="24c05f70-bb09-6393-0ab4-a5ed6fa89eb5")
public static final String FIELDNAME_Ratio_Ratio="24c05f70-bb09-6393-0ab4-a5ed6fa89eb5";
/** Column name PA_Ratio_ID */
public static final String COLUMNNAME_PA_Ratio_ID = "PA_Ratio_ID";
}
