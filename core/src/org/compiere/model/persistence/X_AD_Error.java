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
/** Generated Model for AD_Error
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Error extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Error_ID id
@param trxName transaction
*/
public X_AD_Error (Properties ctx, int AD_Error_ID, String trxName)
{
super (ctx, AD_Error_ID, trxName);
/** if (AD_Error_ID == 0)
{
setAD_Error_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Error (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=380 */
public static int Table_ID=MTable.getTable_ID("AD_Error");

@XendraTrl(Identifier="22c4fff6-af72-4fe2-4de6-fc5ef7c44366")
public static String es_PE_TAB_ErrorMessage_Description="Mensaje de error";

@XendraTrl(Identifier="22c4fff6-af72-4fe2-4de6-fc5ef7c44366")
public static String es_PE_TAB_ErrorMessage_Help="La pestaña Mensaje de Error despliega mensajes de error que han sido generados. Estos mensajes pueden ser borrados con un proceso automatizado de limpieza.";

@XendraTrl(Identifier="22c4fff6-af72-4fe2-4de6-fc5ef7c44366")
public static String es_PE_TAB_ErrorMessage_Name="Mensaje de Error";

@XendraTab(Name="Error Message",Description="Error Message",
Help="The Error Message Tab displays error messages that have been generated.  They can be deleted with an automated clean up process.",
AD_Window_ID="4cd0b114-5e3f-ef45-0d24-353865d47509",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="22c4fff6-af72-4fe2-4de6-fc5ef7c44366",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ErrorMessage="22c4fff6-af72-4fe2-4de6-fc5ef7c44366";

@XendraTrl(Identifier="b846e359-418d-ec1f-eba9-f2e55d90e198")
public static String es_PE_TABLE_AD_Error_Name="ID de Error";

@XendraTable(Name="Error",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Error",
AccessLevel="6",AD_Window_ID="4cd0b114-5e3f-ef45-0d24-353865d47509",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="b846e359-418d-ec1f-eba9-f2e55d90e198",Synchronized="2020-03-03 21:35:00.0")
/** TableName=AD_Error */
public static final String Table_Name="AD_Error";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Error");

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
    Table_ID = MTable.getTable_ID("AD_Error");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Error[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Error.
@param AD_Error_ID Error */
public void setAD_Error_ID (int AD_Error_ID)
{
if (AD_Error_ID < 1) throw new IllegalArgumentException ("AD_Error_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Error_ID, Integer.valueOf(AD_Error_ID));
}
/** Get Error.
@return Error */
public int getAD_Error_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Error_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a23b88ce-ff0a-6fca-4494-86d6f492cb49")
public static String es_PE_FIELD_ErrorMessage_Error_Name="ID de Error";

@XendraField(AD_Column_ID="AD_Error_ID",IsCentrallyMaintained=true,
AD_Tab_ID="22c4fff6-af72-4fe2-4de6-fc5ef7c44366",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a23b88ce-ff0a-6fca-4494-86d6f492cb49")
public static final String FIELDNAME_ErrorMessage_Error="a23b88ce-ff0a-6fca-4494-86d6f492cb49";
/** Column name AD_Error_ID */
public static final String COLUMNNAME_AD_Error_ID = "AD_Error_ID";
/** Set Language.
@param AD_Language Language for this entity */
public void setAD_Language (String AD_Language)
{
if (AD_Language != null && AD_Language.length() > 6)
{
log.warning("Length > 6 - truncated");
AD_Language = AD_Language.substring(0,5);
}
set_Value (COLUMNNAME_AD_Language, AD_Language);
}
/** Get Language.
@return Language for this entity */
public String getAD_Language() 
{
return (String)get_Value(COLUMNNAME_AD_Language);
}

@XendraTrl(Identifier="9322e531-d0d4-70ad-f211-3b89ec103d4b")
public static String es_PE_FIELD_ErrorMessage_Language_Name="Lenguaje";

@XendraTrl(Identifier="9322e531-d0d4-70ad-f211-3b89ec103d4b")
public static String es_PE_FIELD_ErrorMessage_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="9322e531-d0d4-70ad-f211-3b89ec103d4b")
public static String es_PE_FIELD_ErrorMessage_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="22c4fff6-af72-4fe2-4de6-fc5ef7c44366",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9322e531-d0d4-70ad-f211-3b89ec103d4b")
public static final String FIELDNAME_ErrorMessage_Language="9322e531-d0d4-70ad-f211-3b89ec103d4b";

@XendraTrl(Identifier="cf7c819b-3c2b-840a-49fd-ff5e806b719c")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=6,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cf7c819b-3c2b-840a-49fd-ff5e806b719c",Synchronized="2019-08-30 22:20:19.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
if (Code != null && Code.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Code = Code.substring(0,1999);
}
set_Value (COLUMNNAME_Code, Code);
}
/** Get Validation code.
@return Validation Code */
public String getCode() 
{
String value = (String)get_Value(COLUMNNAME_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e32729cf-47db-fd16-eee7-89a25a84816a")
public static String es_PE_FIELD_ErrorMessage_ValidationCode_Name="Código de Validación";

@XendraTrl(Identifier="e32729cf-47db-fd16-eee7-89a25a84816a")
public static String es_PE_FIELD_ErrorMessage_ValidationCode_Description="Código de Validación";

@XendraTrl(Identifier="e32729cf-47db-fd16-eee7-89a25a84816a")
public static String es_PE_FIELD_ErrorMessage_ValidationCode_Help="El código validación despliega la fecha; hora y mensaje del error";

@XendraField(AD_Column_ID="Code",IsCentrallyMaintained=true,
AD_Tab_ID="22c4fff6-af72-4fe2-4de6-fc5ef7c44366",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e32729cf-47db-fd16-eee7-89a25a84816a")
public static final String FIELDNAME_ErrorMessage_ValidationCode="e32729cf-47db-fd16-eee7-89a25a84816a";

@XendraTrl(Identifier="45ecc764-02d3-f642-91bc-dc623b67e4e5")
public static String es_PE_COLUMN_Code_Name="Código de Validación";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45ecc764-02d3-f642-91bc-dc623b67e4e5",
Synchronized="2019-08-30 22:20:19.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
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
@XendraTrl(Identifier="e14314f9-adaf-4a6c-b005-5c053076ed70")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e14314f9-adaf-4a6c-b005-5c053076ed70",
Synchronized="2019-08-30 22:20:19.0")
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

@XendraTrl(Identifier="a162aa2a-5552-837c-38c2-fa41493c0794")
public static String es_PE_FIELD_ErrorMessage_Name_Name="Nombre";

@XendraTrl(Identifier="a162aa2a-5552-837c-38c2-fa41493c0794")
public static String es_PE_FIELD_ErrorMessage_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a162aa2a-5552-837c-38c2-fa41493c0794")
public static String es_PE_FIELD_ErrorMessage_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="22c4fff6-af72-4fe2-4de6-fc5ef7c44366",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a162aa2a-5552-837c-38c2-fa41493c0794")
public static final String FIELDNAME_ErrorMessage_Name="a162aa2a-5552-837c-38c2-fa41493c0794";

@XendraTrl(Identifier="e4a7ecbb-7dce-fd25-dd06-6135c4ca753e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4a7ecbb-7dce-fd25-dd06-6135c4ca753e",
Synchronized="2019-08-30 22:20:19.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
