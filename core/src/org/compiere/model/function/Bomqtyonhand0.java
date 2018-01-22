package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Bomqtyonhand0 
{
 
@XendraFunction(Name="bomqtyonhand",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="9bac99b4-42a8-242b-dca1-4d4af9d458d0",
Arguments="product_id numeric, warehouse_id numeric, locator_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "9bac99b4-42a8-242b-dca1-4d4af9d458d0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("myWarehouse_ID numeric;");
	sb.appendln("v_Quantity numeric := 99999; -- unlimited");
	sb.appendln("v_IsBOM CHAR(1);");
	sb.appendln("v_IsStocked CHAR(1);");
	sb.appendln("v_ProductType CHAR(1);");
	sb.appendln("v_ProductQty numeric;");
	sb.appendln("v_StdPrecision int;");
	sb.appendln("bom record;");
	sb.appendln("BEGIN");
	sb.appendln("-- Check Parameters");
	sb.appendln("myWarehouse_ID := Warehouse_ID;");
	sb.appendln("IF (myWarehouse_ID IS NULL) THEN");
	sb.appendln("IF (Locator_ID IS NULL) THEN");
	sb.appendln("RETURN 0;");
	sb.appendln("ELSE");
	sb.appendln("SELECT SUM(M_Warehouse_ID) INTO myWarehouse_ID");
	sb.appendln("FROM M_LOCATOR");
	sb.appendln("WHERE M_Locator_ID=Locator_ID;");
	sb.appendln("END IF;");
	sb.appendln("END IF;");
	sb.appendln("IF (myWarehouse_ID IS NULL) THEN");
	sb.appendln("RETURN 0;");
	sb.appendln("END IF;");
	sb.appendln("-- DBMS_OUTPUT.PUT_LINE('Warehouse=' || myWarehouse_ID);");
	sb.appendln("-- Check, if product exists and if it is stocked");
	sb.appendln("BEGIN");
	sb.appendln("SELECT IsBOM, ProductType, IsStocked");
	sb.appendln("  INTO v_IsBOM, v_ProductType, v_IsStocked");
	sb.appendln("FROM M_PRODUCT");
	sb.appendln("WHERE M_Product_ID=Product_ID;");
	sb.appendln("--");
	sb.appendln("EXCEPTION -- not found");
	sb.appendln("WHEN OTHERS THEN");
	sb.appendln("RETURN 0;");
	sb.appendln("END;");
	sb.appendln("-- Unimited capacity if no item");
	sb.appendln("IF (v_IsBOM='N' AND (v_ProductType<>'I' OR v_IsStocked='N')) THEN");
	sb.appendln("RETURN v_Quantity;");
	sb.appendln("-- Stocked item");
	sb.appendln("ELSIF (v_IsStocked='Y') THEN");
	sb.appendln("-- Get ProductQty");
	sb.appendln("SELECT COALESCE(SUM(QtyOnHand), 0)");
	sb.appendln("  INTO v_ProductQty");
	sb.appendln("FROM M_STORAGE s");
	sb.appendln("WHERE M_Product_ID=Product_ID");
	sb.appendln("  AND EXISTS (SELECT * FROM M_LOCATOR l WHERE s.M_Locator_ID=l.M_Locator_ID");
	sb.appendln("  AND l.M_Warehouse_ID=myWarehouse_ID);");
	sb.appendln("--");
	sb.appendln("-- DBMS_OUTPUT.PUT_LINE('Qty=' || v_ProductQty);");
	sb.appendln("RETURN v_ProductQty;");
	sb.appendln("END IF;");
	sb.appendln("-- Go though BOM");
	sb.appendln("-- DBMS_OUTPUT.PUT_LINE('BOM');");
	sb.appendln("FOR bom IN -- Get BOM Product info");
	sb.appendln("SELECT bl.M_Product_ID AS M_ProductBOM_ID, CASE WHEN bl.IsQtyPercentage = 'N' THEN bl.QtyBOM ELSE bl.QtyBatch / 100 END AS BomQty , p.IsBOM , p.IsStocked, p.ProductType");
	sb.appendln("FROM PP_PRODUCT_BOM b");
	sb.appendln("   INNER JOIN M_PRODUCT p ON (p.M_Product_ID=b.M_Product_ID)");
	sb.appendln("   INNER JOIN PP_PRODUCT_BOMLINE bl ON (bl.PP_Product_BOM_ID=b.PP_Product_BOM_ID)");
	sb.appendln("WHERE b.M_Product_ID = Product_ID");
	sb.appendln("LOOP");
	sb.appendln("-- Stocked Items \"leaf node\"");
	sb.appendln("IF (bom.ProductType = 'I' AND bom.IsStocked = 'Y') THEN");
	sb.appendln("-- Get v_ProductQty");
	sb.appendln("SELECT COALESCE(SUM(QtyOnHand), 0)");
	sb.appendln("  INTO v_ProductQty");
	sb.appendln("FROM M_STORAGE s");
	sb.appendln("WHERE M_Product_ID=bom.M_ProductBOM_ID");
	sb.appendln("  AND EXISTS (SELECT * FROM M_LOCATOR l WHERE s.M_Locator_ID=l.M_Locator_ID");
	sb.appendln("  AND l.M_Warehouse_ID=myWarehouse_ID);");
	sb.appendln("-- Get Rounding Precision");
	sb.appendln("SELECT COALESCE(MAX(u.StdPrecision), 0)");
	sb.appendln("  INTO v_StdPrecision");
	sb.appendln("FROM C_UOM u, M_PRODUCT p");
	sb.appendln("WHERE u.C_UOM_ID=p.C_UOM_ID AND p.M_Product_ID=bom.M_ProductBOM_ID;");
	sb.appendln("-- How much can we make with this product");
	sb.appendln("v_ProductQty := ROUND (v_ProductQty/bom.BOMQty, v_StdPrecision);");
	sb.appendln("-- How much can we make overall");
	sb.appendln("IF (v_ProductQty < v_Quantity) THEN");
	sb.appendln("v_Quantity := v_ProductQty;");
	sb.appendln("END IF;");
	sb.appendln("-- Another BOM");
	sb.appendln("ELSIF (bom.IsBOM = 'Y') THEN");
	sb.appendln("v_ProductQty := Bomqtyonhand (bom.M_ProductBOM_ID, myWarehouse_ID, Locator_ID);");
	sb.appendln("-- How much can we make overall");
	sb.appendln("IF (v_ProductQty < v_Quantity) THEN");
	sb.appendln("v_Quantity := v_ProductQty;");
	sb.appendln("END IF;");
	sb.appendln("END IF;");
	sb.appendln("END LOOP; -- BOM");
	sb.appendln("IF (v_Quantity > 0) THEN");
	sb.appendln("-- Get Rounding Precision for Product");
	sb.appendln("SELECT COALESCE(MAX(u.StdPrecision), 0)");
	sb.appendln("  INTO v_StdPrecision");
	sb.appendln("FROM C_UOM u, M_PRODUCT p");
	sb.appendln("WHERE u.C_UOM_ID=p.C_UOM_ID AND p.M_Product_ID=Product_ID;");
	sb.appendln("--");
	sb.appendln("RETURN ROUND (v_Quantity, v_StdPrecision);");
	sb.appendln("END IF;");
	sb.appendln("RETURN 0;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=9bac99b4-42a8-242b-dca1-4d4af9d458d0");
	return sb.toString();
}
}
