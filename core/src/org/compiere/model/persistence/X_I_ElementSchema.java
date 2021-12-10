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
/** Generated Model for I_ElementSchema
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_ElementSchema extends PO
{
/** Standard Constructor
@param ctx context
@param I_ElementSchema_ID id
@param trxName transaction
*/
public X_I_ElementSchema (Properties ctx, int I_ElementSchema_ID, String trxName)
{
super (ctx, I_ElementSchema_ID, trxName);
/** if (I_ElementSchema_ID == 0)
{
setI_ElementSchema_ID (0);
setI_IsImported (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_ElementSchema (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000419 */
public static int Table_ID=MTable.getTable_ID("I_ElementSchema");

@XendraTrl(Identifier="40ea9858-6e55-42cb-bc1b-ec048a1c4221")
public static String es_PE_TABLE_I_ElementSchema_Name="Import Element Schema";

@XendraTable(Name="Import Element Schema",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="I_ElementSchema",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.import",Identifier="40ea9858-6e55-42cb-bc1b-ec048a1c4221",
Synchronized="2020-03-03 21:38:06.0")
/** TableName=I_ElementSchema */
public static final String Table_Name="I_ElementSchema";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_ElementSchema");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("I_ElementSchema");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_ElementSchema[").append(get_ID()).append("]");
return sb.toString();
}
/** Set account.
@param account account */
public void setaccount (String account)
{
if (account != null && account.length() > 60)
{
log.warning("Length > 60 - truncated");
account = account.substring(0,59);
}
set_Value (COLUMNNAME_account, account);
}
/** Get account.
@return account */
public String getaccount() 
{
String value = (String)get_Value(COLUMNNAME_account);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e3d30049-bd7b-4025-9a90-1d7d9a38b53a")
public static String es_PE_COLUMN_account_Name="account";

@XendraColumn(AD_Element_ID="15902625-4967-4bc8-a817-d8d0d9193c4d",ColumnName="account",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3d30049-bd7b-4025-9a90-1d7d9a38b53a",
Synchronized="2019-08-30 22:22:47.0")
/** Column name account */
public static final String COLUMNNAME_account = "account";
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID <= 0) set_Value (COLUMNNAME_C_ElementValue_ID, null);
 else 
set_Value (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8043015b-bc0f-471c-87f5-e58204da0640")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Account Element";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8043015b-bc0f-471c-87f5-e58204da0640",
Synchronized="2019-08-30 22:22:47.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Combination.
@param C_ValidCombination_ID Valid Account Combination */
public void setC_ValidCombination_ID (int C_ValidCombination_ID)
{
if (C_ValidCombination_ID <= 0) set_Value (COLUMNNAME_C_ValidCombination_ID, null);
 else 
set_Value (COLUMNNAME_C_ValidCombination_ID, Integer.valueOf(C_ValidCombination_ID));
}
/** Get Combination.
@return Valid Account Combination */
public int getC_ValidCombination_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ValidCombination_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6b692833-f985-40a4-bdfe-ebd2c4ed5dea")
public static String es_PE_COLUMN_C_ValidCombination_ID_Name="Combination";

@XendraColumn(AD_Element_ID="7131fb8b-047a-8274-0958-0f2b91a7fd8a",
ColumnName="C_ValidCombination_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6b692833-f985-40a4-bdfe-ebd2c4ed5dea",Synchronized="2019-08-30 22:22:47.0")
/** Column name C_ValidCombination_ID */
public static final String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
/** Set Element Name.
@param ElementName Name of the Element */
public void setElementName (String ElementName)
{
if (ElementName != null && ElementName.length() > 40)
{
log.warning("Length > 40 - truncated");
ElementName = ElementName.substring(0,39);
}
set_Value (COLUMNNAME_ElementName, ElementName);
}
/** Get Element Name.
@return Name of the Element */
public String getElementName() 
{
String value = (String)get_Value(COLUMNNAME_ElementName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0022779d-fcd0-4098-8818-261a46962ed4")
public static String es_PE_COLUMN_ElementName_Name="Element Name";

@XendraColumn(AD_Element_ID="bca1092d-623c-5d03-b7df-0154e9b8368f",ColumnName="ElementName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0022779d-fcd0-4098-8818-261a46962ed4",
Synchronized="2019-08-30 22:22:47.0")
/** Column name ElementName */
public static final String COLUMNNAME_ElementName = "ElementName";
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
@XendraTrl(Identifier="61e649fb-4412-4c7b-b5f5-f71b5495ea45")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61e649fb-4412-4c7b-b5f5-f71b5495ea45",
Synchronized="2019-08-30 22:22:47.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Element Schema.
@param I_ElementSchema_ID Import Element Schema */
public void setI_ElementSchema_ID (int I_ElementSchema_ID)
{
if (I_ElementSchema_ID < 1) throw new IllegalArgumentException ("I_ElementSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_ElementSchema_ID, Integer.valueOf(I_ElementSchema_ID));
}
/** Get Import Element Schema.
@return Import Element Schema */
public int getI_ElementSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_ElementSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name I_ElementSchema_ID */
public static final String COLUMNNAME_I_ElementSchema_ID = "I_ElementSchema_ID";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d3adc2c3-7738-4604-9126-3b291aeed7b3")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Import Error Message";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3adc2c3-7738-4604-9126-3b291aeed7b3",
Synchronized="2019-08-30 22:22:47.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3772619d-b161-4305-9b30-6adac97ecada")
public static String es_PE_COLUMN_I_IsImported_Name="Imported";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3772619d-b161-4305-9b30-6adac97ecada",
Synchronized="2019-08-30 22:22:47.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
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

@XendraTrl(Identifier="292bc445-bc4a-482d-96c6-696be6107691")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="292bc445-bc4a-482d-96c6-696be6107691",
Synchronized="2019-08-30 22:22:47.0")
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

@XendraTrl(Identifier="75f93564-000f-451f-814e-383e63af9a1e")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75f93564-000f-451f-814e-383e63af9a1e",
Synchronized="2019-08-30 22:22:47.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set SchemaName.
@param SchemaName SchemaName */
public void setSchemaName (String SchemaName)
{
if (SchemaName != null && SchemaName.length() > 50)
{
log.warning("Length > 50 - truncated");
SchemaName = SchemaName.substring(0,49);
}
set_Value (COLUMNNAME_SchemaName, SchemaName);
}
/** Get SchemaName.
@return SchemaName */
public String getSchemaName() 
{
String value = (String)get_Value(COLUMNNAME_SchemaName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3b76deef-166c-4737-985e-464c7db25e96")
public static String es_PE_COLUMN_SchemaName_Name="schemaname";

@XendraColumn(AD_Element_ID="9cb4bfae-d73b-4217-b0eb-d17ab0801319",ColumnName="SchemaName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b76deef-166c-4737-985e-464c7db25e96",
Synchronized="2019-08-30 22:22:47.0")
/** Column name SchemaName */
public static final String COLUMNNAME_SchemaName = "SchemaName";
}
