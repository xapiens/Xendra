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
/** Generated Model for C_SubAcct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_SubAcct extends PO
{
/** Standard Constructor
@param ctx context
@param C_SubAcct_ID id
@param trxName transaction
*/
public X_C_SubAcct (Properties ctx, int C_SubAcct_ID, String trxName)
{
super (ctx, C_SubAcct_ID, trxName);
/** if (C_SubAcct_ID == 0)
{
setC_ElementValue_ID (0);
setC_SubAcct_ID (0);
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
public X_C_SubAcct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=825 */
public static int Table_ID=MTable.getTable_ID("C_SubAcct");

@XendraTrl(Identifier="0c04d238-8871-cd02-f92c-207347187ba7")
public static String es_PE_TAB_SubAccount_Description="Sub Cuenta para Valor del Elemento";

@XendraTrl(Identifier="0c04d238-8871-cd02-f92c-207347187ba7")
public static String es_PE_TAB_SubAccount_Name="Sub Cuenta";

@XendraTrl(Identifier="0c04d238-8871-cd02-f92c-207347187ba7")
public static String es_PE_TAB_SubAccount_Help="El Valor del Elemento (ej. Cuenta) puede tener opcionalmente sub cuentas para detalles adicionales. La sub cuenta es dependiente  sobr los valores de la cuenta, en consecuencia los detalles posteriores. Si las sub cuentas son mas o menos lo mismo, considere emplear otra dimensión contable.";

@XendraTab(Name="Sub Account",Description="Sub Account for Element Value",
Help="The Element Value (e.g. Account) may have optional sub accounts for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension.",
AD_Window_ID="ed28a38f-7f48-c102-93c3-c8952924b221",SeqNo=40,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0c04d238-8871-cd02-f92c-207347187ba7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SubAccount="0c04d238-8871-cd02-f92c-207347187ba7";

@XendraTrl(Identifier="5cb223dd-388e-549c-1ba5-ebd8ba782470")
public static String es_PE_TABLE_C_SubAcct_Name="Sub Cuenta";

@XendraTable(Name="Sub Account",Description="Sub account for Element Value",Help="",
TableName="C_SubAcct",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="5cb223dd-388e-549c-1ba5-ebd8ba782470",
Synchronized="2017-08-16 11:42:29.0")
/** TableName=C_SubAcct */
public static final String Table_Name="C_SubAcct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_SubAcct");

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
    Table_ID = MTable.getTable_ID("C_SubAcct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_SubAcct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID < 1) throw new IllegalArgumentException ("C_ElementValue_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c608a29-a4ba-c22e-40a7-055c8b6d88d4")
public static String es_PE_FIELD_SubAccount_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="3c608a29-a4ba-c22e-40a7-055c8b6d88d4")
public static String es_PE_FIELD_SubAccount_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraTrl(Identifier="3c608a29-a4ba-c22e-40a7-055c8b6d88d4")
public static String es_PE_FIELD_SubAccount_AccountElement_Name="Valor del Elemento";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0c04d238-8871-cd02-f92c-207347187ba7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c608a29-a4ba-c22e-40a7-055c8b6d88d4")
public static final String FIELDNAME_SubAccount_AccountElement="3c608a29-a4ba-c22e-40a7-055c8b6d88d4";

@XendraTrl(Identifier="1776068e-1448-fe6b-11b0-b16d981a36ff")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1776068e-1448-fe6b-11b0-b16d981a36ff",
Synchronized="2017-08-05 16:54:27.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Sub Account.
@param C_SubAcct_ID Sub account for Element Value */
public void setC_SubAcct_ID (int C_SubAcct_ID)
{
if (C_SubAcct_ID < 1) throw new IllegalArgumentException ("C_SubAcct_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_SubAcct_ID, Integer.valueOf(C_SubAcct_ID));
}
/** Get Sub Account.
@return Sub account for Element Value */
public int getC_SubAcct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SubAcct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="12c9077d-05bc-d896-e295-1bf41afd65eb")
public static String es_PE_FIELD_SubAccount_SubAccount_Description="Sub Cuenta para Valor del Elemento";

@XendraTrl(Identifier="12c9077d-05bc-d896-e295-1bf41afd65eb")
public static String es_PE_FIELD_SubAccount_SubAccount_Help="El Valor del Elemento (ej. Cuenta) opcionalmente puede tener subcuentas para detalles adicionales. La subcuenta es dependientedel valor de la cuenta, así también las especificaciónes. Si las cuentas son mas o menos lo mismo, considere el empleo de otra dimensión contable.";

@XendraTrl(Identifier="12c9077d-05bc-d896-e295-1bf41afd65eb")
public static String es_PE_FIELD_SubAccount_SubAccount_Name="Sub Cuenta";

@XendraField(AD_Column_ID="C_SubAcct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0c04d238-8871-cd02-f92c-207347187ba7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12c9077d-05bc-d896-e295-1bf41afd65eb")
public static final String FIELDNAME_SubAccount_SubAccount="12c9077d-05bc-d896-e295-1bf41afd65eb";
/** Column name C_SubAcct_ID */
public static final String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
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

@XendraTrl(Identifier="01900c0c-2c9d-ad6e-f3fb-9d4557ad7bc5")
public static String es_PE_FIELD_SubAccount_Description_Description="Observación";

@XendraTrl(Identifier="01900c0c-2c9d-ad6e-f3fb-9d4557ad7bc5")
public static String es_PE_FIELD_SubAccount_Description_Help="Observación";

@XendraTrl(Identifier="01900c0c-2c9d-ad6e-f3fb-9d4557ad7bc5")
public static String es_PE_FIELD_SubAccount_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0c04d238-8871-cd02-f92c-207347187ba7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01900c0c-2c9d-ad6e-f3fb-9d4557ad7bc5")
public static final String FIELDNAME_SubAccount_Description="01900c0c-2c9d-ad6e-f3fb-9d4557ad7bc5";

@XendraTrl(Identifier="5d9c9eb6-21da-2b30-d00c-62266ba5a095")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d9c9eb6-21da-2b30-d00c-62266ba5a095",
Synchronized="2017-08-05 16:54:27.0")
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

@XendraTrl(Identifier="ab75871a-a0c0-eadf-d29a-457c580b885d")
public static String es_PE_FIELD_SubAccount_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="ab75871a-a0c0-eadf-d29a-457c580b885d")
public static String es_PE_FIELD_SubAccount_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="ab75871a-a0c0-eadf-d29a-457c580b885d")
public static String es_PE_FIELD_SubAccount_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="0c04d238-8871-cd02-f92c-207347187ba7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab75871a-a0c0-eadf-d29a-457c580b885d")
public static final String FIELDNAME_SubAccount_CommentHelp="ab75871a-a0c0-eadf-d29a-457c580b885d";

@XendraTrl(Identifier="37d685f3-922e-1e2e-9acc-3361ff1d5848")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37d685f3-922e-1e2e-9acc-3361ff1d5848",
Synchronized="2017-08-05 16:54:27.0")
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
@XendraTrl(Identifier="8282aa76-75b6-474d-9f74-b6663dbf2190")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8282aa76-75b6-474d-9f74-b6663dbf2190",
Synchronized="2017-08-05 16:54:27.0")
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
@XendraTrl(Identifier="e6470ed8-1fa5-6264-c648-39613856f555")
public static String es_PE_FIELD_SubAccount_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e6470ed8-1fa5-6264-c648-39613856f555")
public static String es_PE_FIELD_SubAccount_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="e6470ed8-1fa5-6264-c648-39613856f555")
public static String es_PE_FIELD_SubAccount_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="0c04d238-8871-cd02-f92c-207347187ba7",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e6470ed8-1fa5-6264-c648-39613856f555")
public static final String FIELDNAME_SubAccount_Name="e6470ed8-1fa5-6264-c648-39613856f555";

@XendraTrl(Identifier="009291b2-a8c0-4371-004d-c36a665cf071")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="009291b2-a8c0-4371-004d-c36a665cf071",
Synchronized="2017-08-05 16:54:27.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="d6f1e820-748f-d389-7162-ab1beb34099f")
public static String es_PE_FIELD_SubAccount_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="d6f1e820-748f-d389-7162-ab1beb34099f")
public static String es_PE_FIELD_SubAccount_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="d6f1e820-748f-d389-7162-ab1beb34099f")
public static String es_PE_FIELD_SubAccount_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="0c04d238-8871-cd02-f92c-207347187ba7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6f1e820-748f-d389-7162-ab1beb34099f")
public static final String FIELDNAME_SubAccount_SearchKey="d6f1e820-748f-d389-7162-ab1beb34099f";

@XendraTrl(Identifier="4f703e2b-9525-4a98-6ab7-3d783fb81a56")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f703e2b-9525-4a98-6ab7-3d783fb81a56",
Synchronized="2017-08-05 16:54:27.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
