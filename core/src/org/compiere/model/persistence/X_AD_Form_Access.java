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
/** Generated Model for AD_Form_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Form_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Form_Access_ID id
@param trxName transaction
*/
public X_AD_Form_Access (Properties ctx, int AD_Form_Access_ID, String trxName)
{
super (ctx, AD_Form_Access_ID, trxName);
/** if (AD_Form_Access_ID == 0)
{
setAD_Form_ID (0);
setAD_Role_ID (0);
setIsReadWrite (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Form_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=378 */
public static int Table_ID=MTable.getTable_ID("AD_Form_Access");

@XendraTrl(Identifier="983c9f9f-3ec2-358e-a744-694c43484da5")
public static String es_PE_TAB_FormAccess_Description="Acceso a Forma";

@XendraTrl(Identifier="983c9f9f-3ec2-358e-a744-694c43484da5")
public static String es_PE_TAB_FormAccess_Help="La pestaña Acceso de Formas define las formas y el tipo de acceso que este rol tiene.";

@XendraTrl(Identifier="983c9f9f-3ec2-358e-a744-694c43484da5")
public static String es_PE_TAB_FormAccess_Name="Acceso a Forma";
@XendraTab(Name="Form Access",
Description="Form Access",
Help="The Form Access Tab defines the Forms and type of access that this Role is granted.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=70,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="65abbc2c-49b2-5cfe-6067-82c0cc75550d",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="983c9f9f-3ec2-358e-a744-694c43484da5",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FormAccess="983c9f9f-3ec2-358e-a744-694c43484da5";

@XendraTrl(Identifier="113ba067-c401-7824-6df8-74d183b5bfdb")
public static String es_PE_TAB_Access_Description="Acceso a Forma";

@XendraTrl(Identifier="113ba067-c401-7824-6df8-74d183b5bfdb")
public static String es_PE_TAB_Access_Help="La pestaña Acceso de Formas define las reglas de acceso para esta forma.";

@XendraTrl(Identifier="113ba067-c401-7824-6df8-74d183b5bfdb")
public static String es_PE_TAB_Access_Name="Acceso";
@XendraTab(Name="Access",
Description="Form Access",Help="The Forms Access Tab defines the access rules for this form",
AD_Window_ID="98a2b09d-25a4-31ca-c67d-29c638b0921e",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="3549f57d-3a7f-5737-2ad4-982095a2b013",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="113ba067-c401-7824-6df8-74d183b5bfdb",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Access="113ba067-c401-7824-6df8-74d183b5bfdb";

@XendraTrl(Identifier="ff6ae0b6-4fa7-62d3-6ae0-7261ab58849f")
public static String es_PE_TABLE_AD_Form_Access_Name="AD_Form_Access";

@XendraTable(Name="AD_Form_Access",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Form_Access",AccessLevel="6",AD_Window_ID="98a2b09d-25a4-31ca-c67d-29c638b0921e",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="ff6ae0b6-4fa7-62d3-6ae0-7261ab58849f",Synchronized="2020-03-03 21:35:03.0")
/** TableName=AD_Form_Access */
public static final String Table_Name="AD_Form_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Form_Access");

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
    Table_ID = MTable.getTable_ID("AD_Form_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Form_Access[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Special Form.
@param AD_Form_ID Special Form */
public void setAD_Form_ID (int AD_Form_ID)
{
if (AD_Form_ID < 1) throw new IllegalArgumentException ("AD_Form_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
}
/** Get Special Form.
@return Special Form */
public int getAD_Form_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="26e8f5bb-5327-84b0-671c-4bb15c2a1e71")
public static String es_PE_FIELD_FormAccess_SpecialForm_Name="Forma Especial";

@XendraTrl(Identifier="26e8f5bb-5327-84b0-671c-4bb15c2a1e71")
public static String es_PE_FIELD_FormAccess_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="26e8f5bb-5327-84b0-671c-4bb15c2a1e71")
public static String es_PE_FIELD_FormAccess_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="983c9f9f-3ec2-358e-a744-694c43484da5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26e8f5bb-5327-84b0-671c-4bb15c2a1e71")
public static final String FIELDNAME_FormAccess_SpecialForm="26e8f5bb-5327-84b0-671c-4bb15c2a1e71";

@XendraTrl(Identifier="0fad6a06-efe3-dce9-8614-bd6c9189ccae")
public static String es_PE_FIELD_Access_SpecialForm_Name="Forma Especial";

@XendraTrl(Identifier="0fad6a06-efe3-dce9-8614-bd6c9189ccae")
public static String es_PE_FIELD_Access_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="0fad6a06-efe3-dce9-8614-bd6c9189ccae")
public static String es_PE_FIELD_Access_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="113ba067-c401-7824-6df8-74d183b5bfdb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fad6a06-efe3-dce9-8614-bd6c9189ccae")
public static final String FIELDNAME_Access_SpecialForm="0fad6a06-efe3-dce9-8614-bd6c9189ccae";

@XendraTrl(Identifier="3549f57d-3a7f-5737-2ad4-982095a2b013")
public static String es_PE_COLUMN_AD_Form_ID_Name="Forma Especial";

@XendraColumn(AD_Element_ID="6e3fcf05-8a76-e0af-25a6-7a4ab20551f4",ColumnName="AD_Form_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3549f57d-3a7f-5737-2ad4-982095a2b013",
Synchronized="2019-08-30 22:20:22.0")
/** Column name AD_Form_ID */
public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7005ace0-6dbd-14c9-a813-a300a41ccbbe")
public static String es_PE_FIELD_FormAccess_Role_Name="Rol";

@XendraTrl(Identifier="7005ace0-6dbd-14c9-a813-a300a41ccbbe")
public static String es_PE_FIELD_FormAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="7005ace0-6dbd-14c9-a813-a300a41ccbbe")
public static String es_PE_FIELD_FormAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="983c9f9f-3ec2-358e-a744-694c43484da5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7005ace0-6dbd-14c9-a813-a300a41ccbbe")
public static final String FIELDNAME_FormAccess_Role="7005ace0-6dbd-14c9-a813-a300a41ccbbe";

@XendraTrl(Identifier="002223c7-bc83-b1c2-27d3-acc33a7f1aa0")
public static String es_PE_FIELD_Access_Role_Name="Rol";

@XendraTrl(Identifier="002223c7-bc83-b1c2-27d3-acc33a7f1aa0")
public static String es_PE_FIELD_Access_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="002223c7-bc83-b1c2-27d3-acc33a7f1aa0")
public static String es_PE_FIELD_Access_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="113ba067-c401-7824-6df8-74d183b5bfdb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="002223c7-bc83-b1c2-27d3-acc33a7f1aa0")
public static final String FIELDNAME_Access_Role="002223c7-bc83-b1c2-27d3-acc33a7f1aa0";

@XendraTrl(Identifier="65abbc2c-49b2-5cfe-6067-82c0cc75550d")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65abbc2c-49b2-5cfe-6067-82c0cc75550d",
Synchronized="2019-08-30 22:20:22.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
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
@XendraTrl(Identifier="1f17a6e5-8f0a-4a17-8bd7-535ee058f88b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f17a6e5-8f0a-4a17-8bd7-535ee058f88b",
Synchronized="2019-08-30 22:20:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Read Write.
@param IsReadWrite Field is read / write */
public void setIsReadWrite (boolean IsReadWrite)
{
set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
}
/** Get Read Write.
@return Field is read / write */
public boolean isReadWrite() 
{
Object oo = get_Value(COLUMNNAME_IsReadWrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c42ccccc-fc20-d15d-fe0b-8a4fff0a3e28")
public static String es_PE_FIELD_FormAccess_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="c42ccccc-fc20-d15d-fe0b-8a4fff0a3e28")
public static String es_PE_FIELD_FormAccess_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="c42ccccc-fc20-d15d-fe0b-8a4fff0a3e28")
public static String es_PE_FIELD_FormAccess_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="983c9f9f-3ec2-358e-a744-694c43484da5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c42ccccc-fc20-d15d-fe0b-8a4fff0a3e28")
public static final String FIELDNAME_FormAccess_ReadWrite="c42ccccc-fc20-d15d-fe0b-8a4fff0a3e28";

@XendraTrl(Identifier="52b59d8b-8299-4603-ce1b-479f21d53a75")
public static String es_PE_FIELD_Access_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="52b59d8b-8299-4603-ce1b-479f21d53a75")
public static String es_PE_FIELD_Access_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="52b59d8b-8299-4603-ce1b-479f21d53a75")
public static String es_PE_FIELD_Access_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="113ba067-c401-7824-6df8-74d183b5bfdb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52b59d8b-8299-4603-ce1b-479f21d53a75")
public static final String FIELDNAME_Access_ReadWrite="52b59d8b-8299-4603-ce1b-479f21d53a75";

@XendraTrl(Identifier="457ebcee-b4ad-d99c-9eca-ab49cd6d78be")
public static String es_PE_COLUMN_IsReadWrite_Name="Lectura Escritura";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="457ebcee-b4ad-d99c-9eca-ab49cd6d78be",
Synchronized="2019-08-30 22:20:22.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
