/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for S_DocLineOthers
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocLineOthers extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocLineOthers_ID id
@param trxName transaction
*/
public X_S_DocLineOthers (Properties ctx, int S_DocLineOthers_ID, String trxName)
{
super (ctx, S_DocLineOthers_ID, trxName);
/** if (S_DocLineOthers_ID == 0)
{
setS_DocLineOthers_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocLineOthers (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000428 */
public static int Table_ID=MTable.getTable_ID("S_DocLineOthers");

@XendraTrl(Identifier="a977f802-0246-439e-b5c7-ad8af576b3b0")
public static String es_PE_TABLE_S_DocLineOthers_Name="dd";

@XendraTable(Name="Sunat Otros Documento",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocLineOthers",AccessLevel="4",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="a977f802-0246-439e-b5c7-ad8af576b3b0",Synchronized="2022-08-23 18:58:43.0")
/** TableName=S_DocLineOthers */
public static final String Table_Name="S_DocLineOthers";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocLineOthers");

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
    Table_ID = MTable.getTable_ID("S_DocLineOthers");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocLineOthers[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Attribute Name.
@param AttributeName Name of the Attribute */
public void setAttributeName (String AttributeName)
{
if (AttributeName != null && AttributeName.length() > 60)
{
log.warning("Length > 60 - truncated");
AttributeName = AttributeName.substring(0,59);
}
set_Value (COLUMNNAME_AttributeName, AttributeName);
}
/** Get Attribute Name.
@return Name of the Attribute */
public String getAttributeName() 
{
String value = (String)get_Value(COLUMNNAME_AttributeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d671e68b-4fd1-4460-97ae-4a8a60b127da")
public static String es_PE_COLUMN_AttributeName_Name="Attribute Name";

@XendraColumn(AD_Element_ID="8f4d88cb-23d3-78f4-8ce5-981e45136e01",ColumnName="AttributeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d671e68b-4fd1-4460-97ae-4a8a60b127da",
Synchronized="2022-08-23 18:56:54.0")
/** Column name AttributeName */
public static final String COLUMNNAME_AttributeName = "AttributeName";
/** Set Attribute Value.
@param AttributeValue Value of the Attribute */
public void setAttributeValue (String AttributeValue)
{
if (AttributeValue != null && AttributeValue.length() > 40)
{
log.warning("Length > 40 - truncated");
AttributeValue = AttributeValue.substring(0,39);
}
set_Value (COLUMNNAME_AttributeValue, AttributeValue);
}
/** Get Attribute Value.
@return Value of the Attribute */
public String getAttributeValue() 
{
String value = (String)get_Value(COLUMNNAME_AttributeValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cf49a6f9-264a-4d8b-9380-dfab36907717")
public static String es_PE_COLUMN_AttributeValue_Name="Attribute Value";

@XendraColumn(AD_Element_ID="e747c580-b4ad-e317-bd0d-dcb2a80c135e",ColumnName="AttributeValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf49a6f9-264a-4d8b-9380-dfab36907717",
Synchronized="2022-08-23 18:56:54.0")
/** Column name AttributeValue */
public static final String COLUMNNAME_AttributeValue = "AttributeValue";
/** Set aux_cayman_01.
@param aux_cayman_01 aux_cayman_01 */
public void setaux_cayman_01 (String aux_cayman_01)
{
if (aux_cayman_01 != null && aux_cayman_01.length() > 45)
{
log.warning("Length > 45 - truncated");
aux_cayman_01 = aux_cayman_01.substring(0,44);
}
set_Value (COLUMNNAME_aux_cayman_01, aux_cayman_01);
}
/** Get aux_cayman_01.
@return aux_cayman_01 */
public String getaux_cayman_01() 
{
String value = (String)get_Value(COLUMNNAME_aux_cayman_01);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8dcd2c59-d3cd-4235-b223-147546f56992")
public static String es_PE_COLUMN_aux_cayman_01_Name="aux_cayman_01";

@XendraColumn(AD_Element_ID="bd0d2459-aa80-4a6f-9011-4b0675138dfd",ColumnName="aux_cayman_01",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8dcd2c59-d3cd-4235-b223-147546f56992",
Synchronized="2022-05-23 10:39:29.0")
/** Column name aux_cayman_01 */
public static final String COLUMNNAME_aux_cayman_01 = "aux_cayman_01";
/** Set aux_cayman_02.
@param aux_cayman_02 aux_cayman_02 */
public void setaux_cayman_02 (String aux_cayman_02)
{
if (aux_cayman_02 != null && aux_cayman_02.length() > 45)
{
log.warning("Length > 45 - truncated");
aux_cayman_02 = aux_cayman_02.substring(0,44);
}
set_Value (COLUMNNAME_aux_cayman_02, aux_cayman_02);
}
/** Get aux_cayman_02.
@return aux_cayman_02 */
public String getaux_cayman_02() 
{
String value = (String)get_Value(COLUMNNAME_aux_cayman_02);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dd942357-a53b-47f1-9f34-2b8ec092b8a0")
public static String es_PE_COLUMN_aux_cayman_02_Name="aux_cayman_02";

@XendraColumn(AD_Element_ID="d3e2c784-778d-4164-ab12-d7f4d1291f08",ColumnName="aux_cayman_02",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd942357-a53b-47f1-9f34-2b8ec092b8a0",
Synchronized="2022-05-23 10:39:29.0")
/** Column name aux_cayman_02 */
public static final String COLUMNNAME_aux_cayman_02 = "aux_cayman_02";
/** Set chasis.
@param chasis chasis */
public void setchasis (String chasis)
{
if (chasis != null && chasis.length() > 45)
{
log.warning("Length > 45 - truncated");
chasis = chasis.substring(0,44);
}
set_Value (COLUMNNAME_chasis, chasis);
}
/** Get chasis.
@return chasis */
public String getchasis() 
{
String value = (String)get_Value(COLUMNNAME_chasis);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c8331a5d-0164-4fbe-a22e-903c3f0c8841")
public static String es_PE_COLUMN_chasis_Name="chasis";

@XendraColumn(AD_Element_ID="4e2f5d56-af9a-47eb-a6c1-23f79ed7b266",ColumnName="chasis",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8331a5d-0164-4fbe-a22e-903c3f0c8841",
Synchronized="2022-05-23 10:39:29.0")
/** Column name chasis */
public static final String COLUMNNAME_chasis = "chasis";
/** Set color.
@param color color */
public void setcolor (String color)
{
if (color != null && color.length() > 45)
{
log.warning("Length > 45 - truncated");
color = color.substring(0,44);
}
set_Value (COLUMNNAME_color, color);
}
/** Get color.
@return color */
public String getcolor() 
{
String value = (String)get_Value(COLUMNNAME_color);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="06ece08c-ac60-4bfb-bb18-4dfbc0e85c73")
public static String es_PE_COLUMN_color_Name="color";

@XendraColumn(AD_Element_ID="3f5e47dd-40f4-4cc6-85ca-e33fd9e5a198",ColumnName="color",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06ece08c-ac60-4bfb-bb18-4dfbc0e85c73",
Synchronized="2022-05-23 10:39:29.0")
/** Column name color */
public static final String COLUMNNAME_color = "color";
/** Set destino.
@param destino destino */
public void setdestino (String destino)
{
if (destino != null && destino.length() > 200)
{
log.warning("Length > 200 - truncated");
destino = destino.substring(0,199);
}
set_Value (COLUMNNAME_destino, destino);
}
/** Get destino.
@return destino */
public String getdestino() 
{
String value = (String)get_Value(COLUMNNAME_destino);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8983746f-6e77-4b0c-bb3e-8915475baa6d")
public static String es_PE_COLUMN_destino_Name="destino";

@XendraColumn(AD_Element_ID="d2861493-2962-4522-966f-922d0ec6ade6",ColumnName="destino",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8983746f-6e77-4b0c-bb3e-8915475baa6d",
Synchronized="2022-05-23 10:39:29.0")
/** Column name destino */
public static final String COLUMNNAME_destino = "destino";
/** Set fabricacion.
@param fabricacion fabricacion */
public void setfabricacion (String fabricacion)
{
if (fabricacion != null && fabricacion.length() > 45)
{
log.warning("Length > 45 - truncated");
fabricacion = fabricacion.substring(0,44);
}
set_Value (COLUMNNAME_fabricacion, fabricacion);
}
/** Get fabricacion.
@return fabricacion */
public String getfabricacion() 
{
String value = (String)get_Value(COLUMNNAME_fabricacion);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c63b9aa8-d558-49f7-afc6-b966389fdbfe")
public static String es_PE_COLUMN_fabricacion_Name="fabricacion";

@XendraColumn(AD_Element_ID="506f8755-d958-4cbd-a6cd-6106aee47554",ColumnName="fabricacion",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c63b9aa8-d558-49f7-afc6-b966389fdbfe",
Synchronized="2022-05-23 10:39:29.0")
/** Column name fabricacion */
public static final String COLUMNNAME_fabricacion = "fabricacion";
/** Set fecha_hora.
@param fecha_hora fecha_hora */
public void setfecha_hora (String fecha_hora)
{
if (fecha_hora != null && fecha_hora.length() > 45)
{
log.warning("Length > 45 - truncated");
fecha_hora = fecha_hora.substring(0,44);
}
set_Value (COLUMNNAME_fecha_hora, fecha_hora);
}
/** Get fecha_hora.
@return fecha_hora */
public String getfecha_hora() 
{
String value = (String)get_Value(COLUMNNAME_fecha_hora);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4b1f5645-9250-4ba9-989d-5aec0a3d17a7")
public static String es_PE_COLUMN_fecha_hora_Name="fecha_hora";

@XendraColumn(AD_Element_ID="d8fa834b-82e0-4804-850b-99329f70b26f",ColumnName="fecha_hora",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b1f5645-9250-4ba9-989d-5aec0a3d17a7",
Synchronized="2022-05-23 10:39:29.0")
/** Column name fecha_hora */
public static final String COLUMNNAME_fecha_hora = "fecha_hora";
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
@XendraTrl(Identifier="5244113f-c5f8-4f61-ad6b-ac6e97dd3b2b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5244113f-c5f8-4f61-ad6b-ac6e97dd3b2b",
Synchronized="2022-05-23 10:39:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set marca.
@param marca marca */
public void setmarca (String marca)
{
if (marca != null && marca.length() > 45)
{
log.warning("Length > 45 - truncated");
marca = marca.substring(0,44);
}
set_Value (COLUMNNAME_marca, marca);
}
/** Get marca.
@return marca */
public String getmarca() 
{
String value = (String)get_Value(COLUMNNAME_marca);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d0025f64-a2d5-4438-a9bf-c6ced94fc1be")
public static String es_PE_COLUMN_marca_Name="marca";

@XendraColumn(AD_Element_ID="11fa0f1a-4feb-4a15-a7c9-173798a05047",ColumnName="marca",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0025f64-a2d5-4438-a9bf-c6ced94fc1be",
Synchronized="2022-05-23 10:39:29.0")
/** Column name marca */
public static final String COLUMNNAME_marca = "marca";
/** Set modelo.
@param modelo modelo */
public void setmodelo (String modelo)
{
if (modelo != null && modelo.length() > 45)
{
log.warning("Length > 45 - truncated");
modelo = modelo.substring(0,44);
}
set_Value (COLUMNNAME_modelo, modelo);
}
/** Get modelo.
@return modelo */
public String getmodelo() 
{
String value = (String)get_Value(COLUMNNAME_modelo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="08975f68-8bf8-4918-a564-146856bc4e08")
public static String es_PE_COLUMN_modelo_Name="modelo";

@XendraColumn(AD_Element_ID="ffc83ef7-df3c-4bba-be90-eb24fc2ba76c",ColumnName="modelo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08975f68-8bf8-4918-a564-146856bc4e08",
Synchronized="2022-05-23 10:39:29.0")
/** Column name modelo */
public static final String COLUMNNAME_modelo = "modelo";
/** Set modelo_periodo.
@param modelo_periodo modelo_periodo */
public void setmodelo_periodo (String modelo_periodo)
{
if (modelo_periodo != null && modelo_periodo.length() > 45)
{
log.warning("Length > 45 - truncated");
modelo_periodo = modelo_periodo.substring(0,44);
}
set_Value (COLUMNNAME_modelo_periodo, modelo_periodo);
}
/** Get modelo_periodo.
@return modelo_periodo */
public String getmodelo_periodo() 
{
String value = (String)get_Value(COLUMNNAME_modelo_periodo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b1fc881f-b676-4a7b-abec-1b43eac57aff")
public static String es_PE_COLUMN_modelo_periodo_Name="modelo_periodo";

@XendraColumn(AD_Element_ID="18ab4eff-7c00-47bf-86d6-a37b5a276df1",ColumnName="modelo_periodo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1fc881f-b676-4a7b-abec-1b43eac57aff",
Synchronized="2022-05-23 10:39:29.0")
/** Column name modelo_periodo */
public static final String COLUMNNAME_modelo_periodo = "modelo_periodo";
/** Set motor.
@param motor motor */
public void setmotor (String motor)
{
if (motor != null && motor.length() > 45)
{
log.warning("Length > 45 - truncated");
motor = motor.substring(0,44);
}
set_Value (COLUMNNAME_motor, motor);
}
/** Get motor.
@return motor */
public String getmotor() 
{
String value = (String)get_Value(COLUMNNAME_motor);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a94c20a6-5c29-4e3c-9232-63c1ad64a303")
public static String es_PE_COLUMN_motor_Name="motor";

@XendraColumn(AD_Element_ID="c77bdcf8-1671-45ae-abea-1556ba958215",ColumnName="motor",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a94c20a6-5c29-4e3c-9232-63c1ad64a303",
Synchronized="2022-05-23 10:39:29.0")
/** Column name motor */
public static final String COLUMNNAME_motor = "motor";
/** Set nro_dua.
@param nro_dua nro_dua */
public void setnro_dua (String nro_dua)
{
if (nro_dua != null && nro_dua.length() > 45)
{
log.warning("Length > 45 - truncated");
nro_dua = nro_dua.substring(0,44);
}
set_Value (COLUMNNAME_nro_dua, nro_dua);
}
/** Get nro_dua.
@return nro_dua */
public String getnro_dua() 
{
String value = (String)get_Value(COLUMNNAME_nro_dua);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="95e69832-3c72-4b20-8910-40b92a9ae970")
public static String es_PE_COLUMN_nro_dua_Name="nro_dua";

@XendraColumn(AD_Element_ID="3aa20257-e087-4fc7-ad1f-7854faa0a653",ColumnName="nro_dua",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95e69832-3c72-4b20-8910-40b92a9ae970",
Synchronized="2022-05-23 10:39:29.0")
/** Column name nro_dua */
public static final String COLUMNNAME_nro_dua = "nro_dua";
/** Set origen.
@param origen origen */
public void setorigen (String origen)
{
if (origen != null && origen.length() > 45)
{
log.warning("Length > 45 - truncated");
origen = origen.substring(0,44);
}
set_Value (COLUMNNAME_origen, origen);
}
/** Get origen.
@return origen */
public String getorigen() 
{
String value = (String)get_Value(COLUMNNAME_origen);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4169b536-0245-4901-8dcd-c5b89be765cc")
public static String es_PE_COLUMN_origen_Name="origen";

@XendraColumn(AD_Element_ID="a3424444-666f-4106-9a40-7909b5a01266",ColumnName="origen",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4169b536-0245-4901-8dcd-c5b89be765cc",
Synchronized="2022-05-23 10:39:29.0")
/** Column name origen */
public static final String COLUMNNAME_origen = "origen";
/** Set S_DocHeader_ID.
@param S_DocHeader_ID S_DocHeader_ID */
public void setS_DocHeader_ID (int S_DocHeader_ID)
{
if (S_DocHeader_ID <= 0) set_Value (COLUMNNAME_S_DocHeader_ID, null);
 else 
set_Value (COLUMNNAME_S_DocHeader_ID, Integer.valueOf(S_DocHeader_ID));
}
/** Get S_DocHeader_ID.
@return S_DocHeader_ID */
public int getS_DocHeader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocHeader_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ae823899-eb4c-4801-a9c1-c7e07c95e613")
public static String es_PE_COLUMN_S_DocHeader_ID_Name="S_DocHeader_ID";

@XendraColumn(AD_Element_ID="51cdf354-f5f5-4380-86e3-e1607a818626",ColumnName="S_DocHeader_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae823899-eb4c-4801-a9c1-c7e07c95e613",
Synchronized="2022-05-23 10:39:29.0")
/** Column name S_DocHeader_ID */
public static final String COLUMNNAME_S_DocHeader_ID = "S_DocHeader_ID";
/** Set Sunat Linea Documento.
@param S_DocLine_ID Sunat Linea Documento */
public void setS_DocLine_ID (int S_DocLine_ID)
{
if (S_DocLine_ID <= 0) set_Value (COLUMNNAME_S_DocLine_ID, null);
 else 
set_Value (COLUMNNAME_S_DocLine_ID, Integer.valueOf(S_DocLine_ID));
}
/** Get Sunat Linea Documento.
@return Sunat Linea Documento */
public int getS_DocLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="43e91587-2474-41b1-812f-96ae8f77bdf7")
public static String es_PE_COLUMN_S_DocLine_ID_Name="Sunat Linea Documento";

@XendraColumn(AD_Element_ID="e25ddc47-a517-4083-97fc-e8c765916de2",ColumnName="S_DocLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43e91587-2474-41b1-812f-96ae8f77bdf7",
Synchronized="2022-05-23 10:39:29.0")
/** Column name S_DocLine_ID */
public static final String COLUMNNAME_S_DocLine_ID = "S_DocLine_ID";
/** Set Sunat Otros Documento.
@param S_DocLineOthers_ID Sunat Otros Documento */
public void setS_DocLineOthers_ID (int S_DocLineOthers_ID)
{
if (S_DocLineOthers_ID < 1) throw new IllegalArgumentException ("S_DocLineOthers_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocLineOthers_ID, Integer.valueOf(S_DocLineOthers_ID));
}
/** Get Sunat Otros Documento.
@return Sunat Otros Documento */
public int getS_DocLineOthers_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocLineOthers_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocLineOthers_ID */
public static final String COLUMNNAME_S_DocLineOthers_ID = "S_DocLineOthers_ID";
/** Set serie_dua.
@param serie_dua serie_dua */
public void setserie_dua (String serie_dua)
{
if (serie_dua != null && serie_dua.length() > 45)
{
log.warning("Length > 45 - truncated");
serie_dua = serie_dua.substring(0,44);
}
set_Value (COLUMNNAME_serie_dua, serie_dua);
}
/** Get serie_dua.
@return serie_dua */
public String getserie_dua() 
{
String value = (String)get_Value(COLUMNNAME_serie_dua);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5e827225-d1ba-44c0-bb1d-4bb9273d54ec")
public static String es_PE_COLUMN_serie_dua_Name="serie_dua";

@XendraColumn(AD_Element_ID="99206f61-f366-4d92-8935-13c56bb64fee",ColumnName="serie_dua",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e827225-d1ba-44c0-bb1d-4bb9273d54ec",
Synchronized="2022-05-23 10:39:29.0")
/** Column name serie_dua */
public static final String COLUMNNAME_serie_dua = "serie_dua";
}
