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
/** Generated Model for AD_Record_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Record_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Record_Access_ID id
@param trxName transaction
*/
public X_AD_Record_Access (Properties ctx, int AD_Record_Access_ID, String trxName)
{
super (ctx, AD_Record_Access_ID, trxName);
/** if (AD_Record_Access_ID == 0)
{
setAD_Role_ID (0);
setAD_Table_ID (0);
setIsDependentEntities (false);	
// N
setIsExclude (true);	
// Y
setIsReadOnly (false);	
// N
setRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Record_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=567 */
public static int Table_ID=MTable.getTable_ID("AD_Record_Access");

@XendraTrl(Identifier="7e98202b-8d50-9b43-3f78-df683baac929")
public static String es_PE_TAB_RecordAccess_Description="Mantener el Acceso a Registros";

@XendraTrl(Identifier="7e98202b-8d50-9b43-3f78-df683baac929")
public static String es_PE_TAB_RecordAccess_Name="Acceso a Registros";

@XendraTrl(Identifier="7e98202b-8d50-9b43-3f78-df683baac929")
public static String es_PE_TAB_RecordAccess_Help="Si está enumerado aquí, el acceso del rol can(not) los expedientes de datos de esta tabla, iguala si el papel tiene acceso a la funcionalidad";

@XendraTab(Name="Record Access",Description="Maintain Record Access",
Help="You create Record Access records by enabling 'Personal Lock' for the administrative role and Ctl-Lock (holding the Ctrl key while clicking on the Lock button). <p> If listed here, the Role can(not) access the data records of this table, even if the role has access to the functionality. <br>If you Include Access to a record and select Read Only, you can only read data (otherwise full access). <br>If you Exclude Access to a recorf and select Read Only, you can only read data (otherwise no access). Note that access information is cached and requires re-login or reset of cache.",
AD_Window_ID="c927d42d-2145-4004-dbd3-51f85f9cab5e",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="16a79feb-74c2-451c-7d55-5d7d6a2976dc",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="7e98202b-8d50-9b43-3f78-df683baac929",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RecordAccess="7e98202b-8d50-9b43-3f78-df683baac929";

@XendraTrl(Identifier="95b24743-5740-896a-036d-23df69ee0b26")
public static String es_PE_TABLE_AD_Record_Access_Name="AD_Record_Access";

@XendraTable(Name="AD_Record_Access",Description="",Help="",TableName="AD_Record_Access",
AccessLevel="6",AD_Window_ID="c927d42d-2145-4004-dbd3-51f85f9cab5e",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.request",
Identifier="95b24743-5740-896a-036d-23df69ee0b26",Synchronized="2017-08-16 11:40:54.0")
/** TableName=AD_Record_Access */
public static final String Table_Name="AD_Record_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Record_Access");

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
    Table_ID = MTable.getTable_ID("AD_Record_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Record_Access[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="69e8e8c3-719f-928e-797b-c57dd9b2577e")
public static String es_PE_FIELD_RecordAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="69e8e8c3-719f-928e-797b-c57dd9b2577e")
public static String es_PE_FIELD_RecordAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraTrl(Identifier="69e8e8c3-719f-928e-797b-c57dd9b2577e")
public static String es_PE_FIELD_RecordAccess_Role_Name="Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e98202b-8d50-9b43-3f78-df683baac929",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69e8e8c3-719f-928e-797b-c57dd9b2577e")
public static final String FIELDNAME_RecordAccess_Role="69e8e8c3-719f-928e-797b-c57dd9b2577e";

@XendraTrl(Identifier="16a79feb-74c2-451c-7d55-5d7d6a2976dc")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16a79feb-74c2-451c-7d55-5d7d6a2976dc",
Synchronized="2017-08-05 16:52:45.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Table_ID()));
}

@XendraTrl(Identifier="a378c201-4281-7f0c-74a4-f0469e78620b")
public static String es_PE_FIELD_RecordAccess_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="a378c201-4281-7f0c-74a4-f0469e78620b")
public static String es_PE_FIELD_RecordAccess_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="a378c201-4281-7f0c-74a4-f0469e78620b")
public static String es_PE_FIELD_RecordAccess_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e98202b-8d50-9b43-3f78-df683baac929",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a378c201-4281-7f0c-74a4-f0469e78620b")
public static final String FIELDNAME_RecordAccess_Table="a378c201-4281-7f0c-74a4-f0469e78620b";

@XendraTrl(Identifier="5d5b7ee1-6c80-41f9-5ac6-8889c8e2a224")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d5b7ee1-6c80-41f9-5ac6-8889c8e2a224",
Synchronized="2017-08-05 16:52:45.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
@XendraTrl(Identifier="46254a89-2e05-4d8a-a17b-2d0dc0416a53")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="46254a89-2e05-4d8a-a17b-2d0dc0416a53",
Synchronized="2017-08-05 16:52:45.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Dependent Entities.
@param IsDependentEntities Also check access in dependent entities */
public void setIsDependentEntities (boolean IsDependentEntities)
{
set_Value (COLUMNNAME_IsDependentEntities, Boolean.valueOf(IsDependentEntities));
}
/** Get Dependent Entities.
@return Also check access in dependent entities */
public boolean isDependentEntities() 
{
Object oo = get_Value(COLUMNNAME_IsDependentEntities);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5eabba47-4ea3-6f8a-e6a1-f9a78c1cf0d2")
public static String es_PE_FIELD_RecordAccess_DependentEntities_Description="También compruebe el acceso en entidades dependientes";

@XendraTrl(Identifier="5eabba47-4ea3-6f8a-e6a1-f9a78c1cf0d2")
public static String es_PE_FIELD_RecordAccess_DependentEntities_Help="También las entidades dependientes son incluidas. Esté por favor enterado, lo que permite esta regla tiene consecuencias severas y esto se desea solamente en algunas circunstancias.<p>Regla de ejemplo: \"Incluya el término del pago inmediato con las entidades dependientes\"<br>Efecto Primario: los usuarios con este Rol pueden seleccionar solamente el término del pago inmediato<br>Efecto Secundario (Entidades Dependientes): los usuarios con este Rol pueden ver solamente facturas/ordenes con el término del pago inmediato.";

@XendraTrl(Identifier="5eabba47-4ea3-6f8a-e6a1-f9a78c1cf0d2")
public static String es_PE_FIELD_RecordAccess_DependentEntities_Name="Entidades Dependientes";

@XendraField(AD_Column_ID="IsDependentEntities",IsCentrallyMaintained=true,
AD_Tab_ID="7e98202b-8d50-9b43-3f78-df683baac929",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5eabba47-4ea3-6f8a-e6a1-f9a78c1cf0d2")
public static final String FIELDNAME_RecordAccess_DependentEntities="5eabba47-4ea3-6f8a-e6a1-f9a78c1cf0d2";

@XendraTrl(Identifier="6489d622-926b-7030-5213-01acc6955d20")
public static String es_PE_COLUMN_IsDependentEntities_Name="Entidades Dependientes";

@XendraColumn(AD_Element_ID="f7e27218-5f81-f6b9-02fa-ebcb1a9a0b99",
ColumnName="IsDependentEntities",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6489d622-926b-7030-5213-01acc6955d20",Synchronized="2017-08-05 16:52:45.0")
/** Column name IsDependentEntities */
public static final String COLUMNNAME_IsDependentEntities = "IsDependentEntities";
/** Set Exclude.
@param IsExclude Exclude access to the data - if not selected Include access to the data */
public void setIsExclude (boolean IsExclude)
{
set_Value (COLUMNNAME_IsExclude, Boolean.valueOf(IsExclude));
}
/** Get Exclude.
@return Exclude access to the data - if not selected Include access to the data */
public boolean isExclude() 
{
Object oo = get_Value(COLUMNNAME_IsExclude);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1c4b01c3-8aa7-1e90-a6b0-aed478f88172")
public static String es_PE_FIELD_RecordAccess_Exclude_Description="Excluir el acceso a los datos";

@XendraTrl(Identifier="1c4b01c3-8aa7-1e90-a6b0-aed478f88172")
public static String es_PE_FIELD_RecordAccess_Exclude_Help="Si está seleccionado, el Rol no puede tener acceso a los datos especificos. Si no esta seleccionado, el Rol puede tener acceso SOLAMENTE a los datos especificos.";

@XendraTrl(Identifier="1c4b01c3-8aa7-1e90-a6b0-aed478f88172")
public static String es_PE_FIELD_RecordAccess_Exclude_Name="Excluir";

@XendraField(AD_Column_ID="IsExclude",IsCentrallyMaintained=true,
AD_Tab_ID="7e98202b-8d50-9b43-3f78-df683baac929",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c4b01c3-8aa7-1e90-a6b0-aed478f88172")
public static final String FIELDNAME_RecordAccess_Exclude="1c4b01c3-8aa7-1e90-a6b0-aed478f88172";

@XendraTrl(Identifier="f43fe782-a786-3426-80cb-436051c0046b")
public static String es_PE_COLUMN_IsExclude_Name="Excluir";

@XendraColumn(AD_Element_ID="770b492c-be75-a622-6c96-f202d97c4dfd",ColumnName="IsExclude",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f43fe782-a786-3426-80cb-436051c0046b",
Synchronized="2017-08-05 16:52:45.0")
/** Column name IsExclude */
public static final String COLUMNNAME_IsExclude = "IsExclude";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="38bd8065-21b3-12b3-9337-8d2d870dc2e2")
public static String es_PE_FIELD_RecordAccess_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="38bd8065-21b3-12b3-9337-8d2d870dc2e2")
public static String es_PE_FIELD_RecordAccess_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="38bd8065-21b3-12b3-9337-8d2d870dc2e2")
public static String es_PE_FIELD_RecordAccess_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="7e98202b-8d50-9b43-3f78-df683baac929",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38bd8065-21b3-12b3-9337-8d2d870dc2e2")
public static final String FIELDNAME_RecordAccess_ReadOnly="38bd8065-21b3-12b3-9337-8d2d870dc2e2";

@XendraTrl(Identifier="dd049107-6161-9861-2ea2-d7f33c8a7aab")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd049107-6161-9861-2ea2-d7f33c8a7aab",
Synchronized="2017-08-05 16:52:45.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8a6318e9-6c6f-8890-d26f-b03a04964219")
public static String es_PE_FIELD_RecordAccess_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="8a6318e9-6c6f-8890-d26f-b03a04964219")
public static String es_PE_FIELD_RecordAccess_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="8a6318e9-6c6f-8890-d26f-b03a04964219")
public static String es_PE_FIELD_RecordAccess_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e98202b-8d50-9b43-3f78-df683baac929",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a6318e9-6c6f-8890-d26f-b03a04964219")
public static final String FIELDNAME_RecordAccess_RecordID="8a6318e9-6c6f-8890-d26f-b03a04964219";

@XendraTrl(Identifier="dbdabb9e-1bc9-487e-0c16-ce0e4b17896b")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbdabb9e-1bc9-487e-0c16-ce0e4b17896b",
Synchronized="2017-08-05 16:52:45.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
}
