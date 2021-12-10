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
/** Generated Model for AllDiffDocuments
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AllDiffDocuments extends PO
{
/** Standard Constructor
@param ctx context
@param AllDiffDocuments_ID id
@param trxName transaction
*/
public X_AllDiffDocuments (Properties ctx, int AllDiffDocuments_ID, String trxName)
{
super (ctx, AllDiffDocuments_ID, trxName);
/** if (AllDiffDocuments_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AllDiffDocuments (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000423 */
public static int Table_ID=MTable.getTable_ID("AllDiffDocuments");

@XendraTrl(Identifier="3330021d-f470-4338-a6b4-8d76b0528e24")
public static String es_PE_TAB_Carding3_Name="Carding3";
@XendraTab(Name="Carding3",Description="",
Help="",AD_Window_ID="0f51f211-8fcd-4413-a178-1518fe7f0b0e",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3330021d-f470-4338-a6b4-8d76b0528e24",Synchronized="2019-11-16 11:11:28.0")
public static final String TABNAME_Carding3="3330021d-f470-4338-a6b4-8d76b0528e24";

@XendraTrl(Identifier="95e914dc-ab7a-4a71-afd7-7db996449e60")
public static String es_PE_TABLE_AllDiffDocuments_Name="All Difference Documents";

@XendraTable(Name="All Difference Documents",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="",Description="",Help="",TableName="AllDiffDocuments",AccessLevel="3",
AD_Window_ID="0f51f211-8fcd-4413-a178-1518fe7f0b0e",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,
PO_Window_ID="",ID="org.xendra.material	",Identifier="95e914dc-ab7a-4a71-afd7-7db996449e60",
Synchronized="2020-03-03 21:36:14.0")
/** TableName=AllDiffDocuments */
public static final String Table_Name="AllDiffDocuments";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AllDiffDocuments");

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
    Table_ID = MTable.getTable_ID("AllDiffDocuments");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AllDiffDocuments[").append(get_ID()).append("]");
return sb.toString();
}
@XendraTrl(Identifier="fa3f4e5d-d243-4eb2-875b-f28cb9925609")
public static String es_PE_FIELD_Carding3_Table_Name="Tabla";

@XendraTrl(Identifier="fa3f4e5d-d243-4eb2-875b-f28cb9925609")
public static String es_PE_FIELD_Carding3_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="fa3f4e5d-d243-4eb2-875b-f28cb9925609")
public static String es_PE_FIELD_Carding3_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-28 16:22:41.0",
Identifier="fa3f4e5d-d243-4eb2-875b-f28cb9925609")
public static final String FIELDNAME_Carding3_Table="fa3f4e5d-d243-4eb2-875b-f28cb9925609";

@XendraTrl(Identifier="9102b041-5d5f-4748-82a2-20cfbb5a047b")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9102b041-5d5f-4748-82a2-20cfbb5a047b",
Synchronized="2020-02-13 17:34:59.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

@XendraTrl(Identifier="956f510d-3730-4844-b4ed-c3272782b1f9")
public static String es_PE_FIELD_Carding3_AccountedDebit_Name="Débito Contabilizado";

@XendraTrl(Identifier="956f510d-3730-4844-b4ed-c3272782b1f9")
public static String es_PE_FIELD_Carding3_AccountedDebit_Description="Débito";

@XendraTrl(Identifier="956f510d-3730-4844-b4ed-c3272782b1f9")
public static String es_PE_FIELD_Carding3_AccountedDebit_Help="El total del debito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraField(AD_Column_ID="AmtAcctDr",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:27.0",
Identifier="956f510d-3730-4844-b4ed-c3272782b1f9")
public static final String FIELDNAME_Carding3_AccountedDebit="956f510d-3730-4844-b4ed-c3272782b1f9";

@XendraTrl(Identifier="8df90023-43b3-425e-9f0b-6aa4bb410288")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8df90023-43b3-425e-9f0b-6aa4bb410288",
Synchronized="2020-02-13 17:35:00.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="cba8ac38-145f-46be-b4c5-3f1d4d988455")
public static String es_PE_FIELD_Carding3_Balance_Name="Balance";

@XendraField(AD_Column_ID="Balance",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:27.0",
Identifier="cba8ac38-145f-46be-b4c5-3f1d4d988455")
public static final String FIELDNAME_Carding3_Balance="cba8ac38-145f-46be-b4c5-3f1d4d988455";

@XendraTrl(Identifier="c362271a-86ce-4efb-b43a-78a9f2d07c1a")
public static String es_PE_COLUMN_Balance_Name="Balance";

@XendraColumn(AD_Element_ID="f7d6ea1b-5d62-aa23-6c87-29e0d09eca32",ColumnName="Balance",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="SUM(qtysource) OVER (ORDER BY movementdate,CASE WHEN substr(movementtype,2,1) = '+' THEN 0 ELSE 1 END,movementtype) ",
IsAllowLogging=false,Identifier="c362271a-86ce-4efb-b43a-78a9f2d07c1a",
Synchronized="2020-02-13 17:35:00.0")
/** Column name Balance */
public static final String COLUMNNAME_Balance = "Balance";

@XendraTrl(Identifier="020077d9-c8dc-4233-85c1-a8d403f538e9")
public static String es_PE_FIELD_Carding3_Currency_Name="Moneda";

@XendraTrl(Identifier="020077d9-c8dc-4233-85c1-a8d403f538e9")
public static String es_PE_FIELD_Carding3_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="020077d9-c8dc-4233-85c1-a8d403f538e9")
public static String es_PE_FIELD_Carding3_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="020077d9-c8dc-4233-85c1-a8d403f538e9")
public static final String FIELDNAME_Carding3_Currency="020077d9-c8dc-4233-85c1-a8d403f538e9";

@XendraTrl(Identifier="7b62eae4-1612-4c5c-a8b3-0139eb483738")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b62eae4-1612-4c5c-a8b3-0139eb483738",
Synchronized="2020-02-13 17:35:00.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

@XendraTrl(Identifier="0f3a7e1d-f989-4d97-b87a-9e1a33c35693")
public static String es_PE_FIELD_Carding3_Costed_Name="costed";
@XendraField(AD_Column_ID="Costed",
IsCentrallyMaintained=true,AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=10,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2019-11-16 11:11:28.0",Identifier="0f3a7e1d-f989-4d97-b87a-9e1a33c35693")
public static final String FIELDNAME_Carding3_Costed="0f3a7e1d-f989-4d97-b87a-9e1a33c35693";

@XendraTrl(Identifier="56fbaa73-77ac-4fae-8738-8af20e433af6")
public static String es_PE_COLUMN_Costed_Name="Costed";

@XendraColumn(AD_Element_ID="bd05dbe7-6800-386f-308c-fe64e7f794c8",ColumnName="Costed",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56fbaa73-77ac-4fae-8738-8af20e433af6",
Synchronized="2020-02-13 17:35:00.0")
/** Column name Costed */
public static final String COLUMNNAME_Costed = "Costed";

@XendraTrl(Identifier="28ff4f6b-b624-4273-86b7-e572006e9ad9")
public static String es_PE_FIELD_Carding3_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="28ff4f6b-b624-4273-86b7-e572006e9ad9")
public static String es_PE_FIELD_Carding3_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="28ff4f6b-b624-4273-86b7-e572006e9ad9")
public static String es_PE_FIELD_Carding3_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-29 15:21:18.0",
Identifier="28ff4f6b-b624-4273-86b7-e572006e9ad9")
public static final String FIELDNAME_Carding3_DocumentNo="28ff4f6b-b624-4273-86b7-e572006e9ad9";

@XendraTrl(Identifier="43933d64-489c-4ab0-ac6e-fcca68b60940")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43933d64-489c-4ab0-ac6e-fcca68b60940",
Synchronized="2020-02-13 17:35:00.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="11d2181c-3dbe-4b19-b74a-d8a26755b9c6")
public static String es_PE_FIELD_Carding3_LineNo_Name="No. Línea";

@XendraTrl(Identifier="11d2181c-3dbe-4b19-b74a-d8a26755b9c6")
public static String es_PE_FIELD_Carding3_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="11d2181c-3dbe-4b19-b74a-d8a26755b9c6")
public static String es_PE_FIELD_Carding3_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="11d2181c-3dbe-4b19-b74a-d8a26755b9c6")
public static final String FIELDNAME_Carding3_LineNo="11d2181c-3dbe-4b19-b74a-d8a26755b9c6";

@XendraTrl(Identifier="606921d4-724d-45c4-817f-fb7c7b6b8f45")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="606921d4-724d-45c4-817f-fb7c7b6b8f45",
Synchronized="2020-02-13 17:35:00.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="d40223d5-dde5-4a8c-9c7d-f7eb9a9653e6")
public static String es_PE_FIELD_Carding3_LineAmount_Name="Neto de Línea";

@XendraTrl(Identifier="d40223d5-dde5-4a8c-9c7d-f7eb9a9653e6")
public static String es_PE_FIELD_Carding3_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="d40223d5-dde5-4a8c-9c7d-f7eb9a9653e6")
public static String es_PE_FIELD_Carding3_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="d40223d5-dde5-4a8c-9c7d-f7eb9a9653e6")
public static final String FIELDNAME_Carding3_LineAmount="d40223d5-dde5-4a8c-9c7d-f7eb9a9653e6";

@XendraTrl(Identifier="cc840f8c-f095-4c83-b739-9d67d6dd347e")
public static String es_PE_COLUMN_LineNetAmt_Name="Line Amount";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc840f8c-f095-4c83-b739-9d67d6dd347e",
Synchronized="2020-02-13 17:35:00.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";

@XendraTrl(Identifier="0e037dfb-f55c-480b-855f-3d9917ce6555")
public static String es_PE_FIELD_Carding3_MovementDate_Name="Fecha de Movimiento";

@XendraTrl(Identifier="0e037dfb-f55c-480b-855f-3d9917ce6555")
public static String es_PE_FIELD_Carding3_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="0e037dfb-f55c-480b-855f-3d9917ce6555")
public static String es_PE_FIELD_Carding3_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="0e037dfb-f55c-480b-855f-3d9917ce6555")
public static final String FIELDNAME_Carding3_MovementDate="0e037dfb-f55c-480b-855f-3d9917ce6555";

@XendraTrl(Identifier="208e020e-7011-4b16-a224-9c83c4fc14d2")
public static String es_PE_COLUMN_MovementDate_Name="Movement Date";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="208e020e-7011-4b16-a224-9c83c4fc14d2",
Synchronized="2020-02-13 17:35:00.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";

@XendraTrl(Identifier="b2e72588-59ac-4a0e-9bc4-b593042f805e")
public static String es_PE_FIELD_Carding3_MovementType_Name="Tipo de Movimiento";

@XendraTrl(Identifier="b2e72588-59ac-4a0e-9bc4-b593042f805e")
public static String es_PE_FIELD_Carding3_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="b2e72588-59ac-4a0e-9bc4-b593042f805e")
public static String es_PE_FIELD_Carding3_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2147483647,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="b2e72588-59ac-4a0e-9bc4-b593042f805e")
public static final String FIELDNAME_Carding3_MovementType="b2e72588-59ac-4a0e-9bc4-b593042f805e";

@XendraTrl(Identifier="0e23c522-be61-48ee-bb7a-0a570dab30ba")
public static String es_PE_COLUMN_MovementType_Name="Movement Type";

@XendraColumn(AD_Element_ID="6deba235-3003-eca1-becf-5fd99b19b2a9",ColumnName="MovementType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e23c522-be61-48ee-bb7a-0a570dab30ba",
Synchronized="2020-02-13 17:35:00.0")
/** Column name MovementType */
public static final String COLUMNNAME_MovementType = "MovementType";

@XendraTrl(Identifier="cfbcdf6a-17a7-4670-8df4-8351b5516ab3")
public static String es_PE_FIELD_Carding3_Product_Name="Producto";

@XendraTrl(Identifier="cfbcdf6a-17a7-4670-8df4-8351b5516ab3")
public static String es_PE_FIELD_Carding3_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="cfbcdf6a-17a7-4670-8df4-8351b5516ab3")
public static String es_PE_FIELD_Carding3_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="cfbcdf6a-17a7-4670-8df4-8351b5516ab3")
public static final String FIELDNAME_Carding3_Product="cfbcdf6a-17a7-4670-8df4-8351b5516ab3";

@XendraTrl(Identifier="4ef0215c-1ccb-400e-8b96-df4a0899f53f")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ef0215c-1ccb-400e-8b96-df4a0899f53f",
Synchronized="2020-02-13 17:35:00.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="bb91eea2-cace-498e-847e-cdeaf5061956")
public static String es_PE_FIELD_Carding3_QtyInput_Name="qtyinput";

@XendraField(AD_Column_ID="QtyInput",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="bb91eea2-cace-498e-847e-cdeaf5061956")
public static final String FIELDNAME_Carding3_QtyInput="bb91eea2-cace-498e-847e-cdeaf5061956";

@XendraTrl(Identifier="7f69b71b-a8f4-42bf-8f10-3aafcb500dc7")
public static String es_PE_COLUMN_QtyInput_Name="QtyInput";

@XendraColumn(AD_Element_ID="befcd710-705f-469e-8b85-687c9486b239",ColumnName="QtyInput",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f69b71b-a8f4-42bf-8f10-3aafcb500dc7",
Synchronized="2020-02-13 17:35:00.0")
/** Column name QtyInput */
public static final String COLUMNNAME_QtyInput = "QtyInput";

@XendraTrl(Identifier="9f60aab5-7967-4b6d-b1e2-ee1a4c81e922")
public static String es_PE_FIELD_Carding3_QtyOutput_Name="qtyoutput";

@XendraField(AD_Column_ID="QtyOutput",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="9f60aab5-7967-4b6d-b1e2-ee1a4c81e922")
public static final String FIELDNAME_Carding3_QtyOutput="9f60aab5-7967-4b6d-b1e2-ee1a4c81e922";

@XendraTrl(Identifier="e13d44a5-17cc-44ed-87ec-d4e4e812afc9")
public static String es_PE_COLUMN_QtyOutput_Name="QtyOutput";

@XendraColumn(AD_Element_ID="8fffbae2-c184-40da-9299-5753af39ec24",ColumnName="QtyOutput",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e13d44a5-17cc-44ed-87ec-d4e4e812afc9",
Synchronized="2020-02-13 17:35:00.0")
/** Column name QtyOutput */
public static final String COLUMNNAME_QtyOutput = "QtyOutput";

@XendraTrl(Identifier="994ed494-c6dd-4433-af77-1be09a4e8479")
public static String es_PE_FIELD_Carding3_QtySource_Name="qtysource";

@XendraField(AD_Column_ID="QtySource",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-16 11:11:28.0",
Identifier="994ed494-c6dd-4433-af77-1be09a4e8479")
public static final String FIELDNAME_Carding3_QtySource="994ed494-c6dd-4433-af77-1be09a4e8479";

@XendraTrl(Identifier="769701f5-cd4e-49de-a511-96fcb628c355")
public static String es_PE_COLUMN_QtySource_Name="QtySource";

@XendraColumn(AD_Element_ID="7b714dd7-94b2-ea8c-a460-44cf2b400f35",ColumnName="QtySource",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="769701f5-cd4e-49de-a511-96fcb628c355",
Synchronized="2020-02-13 17:35:00.0")
/** Column name QtySource */
public static final String COLUMNNAME_QtySource = "QtySource";

@XendraTrl(Identifier="ae462112-74aa-416b-943c-15cc3561a0c8")
public static String es_PE_FIELD_Carding3_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="ae462112-74aa-416b-943c-15cc3561a0c8")
public static String es_PE_FIELD_Carding3_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="ae462112-74aa-416b-943c-15cc3561a0c8")
public static String es_PE_FIELD_Carding3_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-11-28 16:22:41.0",
Identifier="ae462112-74aa-416b-943c-15cc3561a0c8")
public static final String FIELDNAME_Carding3_RecordID="ae462112-74aa-416b-943c-15cc3561a0c8";

@XendraTrl(Identifier="aa636820-9682-4db0-9a6a-a2591e2c9097")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa636820-9682-4db0-9a6a-a2591e2c9097",
Synchronized="2020-02-13 17:35:00.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";

@XendraTrl(Identifier="22259f05-03fd-4bf1-bc5d-19ac300af146")
public static String es_PE_FIELD_Carding3_Signe_Name="signe";
@XendraField(AD_Column_ID="signe",
IsCentrallyMaintained=true,AD_Tab_ID="3330021d-f470-4338-a6b4-8d76b0528e24",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2147483647,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2019-11-16 11:11:28.0",Identifier="22259f05-03fd-4bf1-bc5d-19ac300af146")
public static final String FIELDNAME_Carding3_Signe="22259f05-03fd-4bf1-bc5d-19ac300af146";

@XendraTrl(Identifier="c78bb27b-54ee-47e5-91c3-067ec099fcfe")
public static String es_PE_COLUMN_signe_Name="signe";

@XendraColumn(AD_Element_ID="437ff56c-78ee-4e80-a969-8f1ef27188d5",ColumnName="signe",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c78bb27b-54ee-47e5-91c3-067ec099fcfe",
Synchronized="2020-02-13 17:35:00.0")
/** Column name signe */
public static final String COLUMNNAME_signe = "signe";
}
