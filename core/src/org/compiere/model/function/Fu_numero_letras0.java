package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Fu_numero_letras0 
{
 
@XendraFunction(Name="fu_numero_letras",Output="text",Owner="postgres",Language="plpgsql",
Identifier="49bfaa50-4607-ee19-ceb6-0c718feef9ec",Arguments="numero numeric",Extension="",
Synchronized="2017-05-21 21:42:28.0")
	public static final String Identifier = "49bfaa50-4607-ee19-ceb6-0c718feef9ec";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("     lnEntero INTEGER;");
	sb.appendln("     lcRetorno TEXT;");
	sb.appendln("     lnTerna INTEGER;");
	sb.appendln("     lcMiles TEXT;");
	sb.appendln("     lcCadena TEXT;");
	sb.appendln("     lnUnidades INTEGER;");
	sb.appendln("     lnDecenas INTEGER;");
	sb.appendln("     lnCentenas INTEGER;");
	sb.appendln("     lnFraccion INTEGER;");
	sb.appendln("     lnSw INTEGER;");
	sb.appendln("BEGIN");
	sb.appendln("     lnEntero := FLOOR(numero)::INTEGER;--Obtenemos la parte Entera");
	sb.appendln("     lnFraccion := FLOOR(((numero - lnEntero) * 100))::INTEGER;--Obtenemos la Fraccion del Monto");
	sb.appendln("     lcRetorno := '';");
	sb.appendln("     lnTerna := 1;");
	sb.appendln("     IF lnEntero > 0 THEN");
	sb.appendln("     lnSw := LENGTH(lnEntero::TEXT);");
	sb.appendln("     WHILE lnTerna <= lnSw LOOP");
	sb.appendln("        -- Recorro terna por terna");
	sb.appendln("        lcCadena = '';");
	sb.appendln("        lnUnidades = lnEntero % 10;");
	sb.appendln("        lnEntero = CAST(lnEntero/10 AS INTEGER);");
	sb.appendln("        lnDecenas = lnEntero % 10;");
	sb.appendln("        lnEntero = CAST(lnEntero/10 AS INTEGER);");
	sb.appendln("        lnCentenas = lnEntero % 10;");
	sb.appendln("        lnEntero = CAST(lnEntero/10 AS INTEGER);");
	sb.appendln("    -- Analizo las unidades");
	sb.appendln("       SELECT");
	sb.appendln("         CASE /* UNIDADES */");
	sb.appendln("           WHEN lnUnidades = 1 AND lnTerna = 1 THEN 'UNO ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 1 AND lnTerna <> 1 THEN 'UN ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 2 THEN 'DOS ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 3 THEN 'TRES ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 4 THEN 'CUATRO ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 5 THEN 'CINCO ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 6 THEN 'SEIS ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 7 THEN 'SIETE ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 8 THEN 'OCHO ' || lcCadena");
	sb.appendln("           WHEN lnUnidades = 9 THEN 'NUEVE ' || lcCadena");
	sb.appendln("           ELSE lcCadena");
	sb.appendln("          END INTO lcCadena;");
	sb.appendln("          /* UNIDADES */");
	sb.appendln("    -- Analizo las decenas");
	sb.appendln("    SELECT");
	sb.appendln("    CASE /* DECENAS */");
	sb.appendln("      WHEN lnDecenas = 1 THEN");
	sb.appendln("        CASE lnUnidades");
	sb.appendln("          WHEN 0 THEN 'DIEZ '");
	sb.appendln("          WHEN 1 THEN 'ONCE '");
	sb.appendln("          WHEN 2 THEN 'DOCE '");
	sb.appendln("          WHEN 3 THEN 'TRECE '");
	sb.appendln("          WHEN 4 THEN 'CATORCE '");
	sb.appendln("          WHEN 5 THEN 'QUINCE '");
	sb.appendln("          ELSE 'DIECI' || lcCadena");
	sb.appendln("        END");
	sb.appendln("      WHEN lnDecenas = 2 AND lnUnidades = 0 THEN 'VEINTE ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 2 AND lnUnidades <> 0 THEN 'VEINTI' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 3 AND lnUnidades = 0 THEN 'TREINTA ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 3 AND lnUnidades <> 0 THEN 'TREINTA Y ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 4 AND lnUnidades = 0 THEN 'CUARENTA ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 4 AND lnUnidades <> 0 THEN 'CUARENTA Y ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 5 AND lnUnidades = 0 THEN 'CINCUENTA ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 5 AND lnUnidades <> 0 THEN 'CINCUENTA Y ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 6 AND lnUnidades = 0 THEN 'SESENTA ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 6 AND lnUnidades <> 0 THEN 'SESENTA Y ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 7 AND lnUnidades = 0 THEN 'SETENTA ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 7 AND lnUnidades <> 0 THEN 'SETENTA Y ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 8 AND lnUnidades = 0 THEN 'OCHENTA ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 8 AND lnUnidades <> 0 THEN 'OCHENTA Y ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 9 AND lnUnidades = 0 THEN 'NOVENTA ' || lcCadena");
	sb.appendln("      WHEN lnDecenas = 9 AND lnUnidades <> 0 THEN 'NOVENTA Y ' || lcCadena");
	sb.appendln("      ELSE lcCadena");
	sb.appendln("    END INTO lcCadena; /* DECENAS */");
	sb.appendln("    -- Analizo las centenas");
	sb.appendln("    SELECT");
	sb.appendln("    CASE /* CENTENAS */");
	sb.appendln("      WHEN lnCentenas = 1 AND lnUnidades = 0 AND lnDecenas = 0 THEN 'CIEN ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 1 AND NOT(lnUnidades = 0 AND lnDecenas = 0) THEN 'CIENTO ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 2 THEN 'DOSCIENTOS ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 3 THEN 'TRESCIENTOS ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 4 THEN 'CUATROCIENTOS ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 5 THEN 'QUINIENTOS ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 6 THEN 'SEISCIENTOS ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 7 THEN 'SETECIENTOS ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 8 THEN 'OCHOCIENTOS ' || lcCadena");
	sb.appendln("      WHEN lnCentenas = 9 THEN 'NOVECIENTOS ' || lcCadena");
	sb.appendln("      ELSE lcCadena");
	sb.appendln("    END INTO lcCadena;/* CENTENAS */");
	sb.appendln("    -- Analizo la terna");
	sb.appendln("    SELECT");
	sb.appendln("    CASE /* TERNA */");
	sb.appendln("      WHEN lnTerna = 1 THEN lcCadena");
	sb.appendln("      WHEN lnTerna = 2 AND (lnUnidades + lnDecenas + lnCentenas <> 0) THEN lcCadena || ' MIL '");
	sb.appendln("      WHEN lnTerna = 3 AND (lnUnidades + lnDecenas + lnCentenas <> 0) AND");
	sb.appendln("        lnUnidades = 1 AND lnDecenas = 0 AND lnCentenas = 0 THEN lcCadena || ' MILLON '");
	sb.appendln("      WHEN lnTerna = 3 AND (lnUnidades + lnDecenas + lnCentenas <> 0) AND");
	sb.appendln("        NOT (lnUnidades = 1 AND lnDecenas = 0 AND lnCentenas = 0) THEN lcCadena || ' MILLONES '");
	sb.appendln("      WHEN lnTerna = 4 AND (lnUnidades + lnDecenas + lnCentenas <> 0) THEN lcCadena || ' MIL MILLONES '");
	sb.appendln("      ELSE ''");
	sb.appendln("    END INTO lcCadena;/* TERNA */");
	sb.appendln("    --Retornamos los Valores Obtenidos");
	sb.appendln("    lcRetorno = lcCadena  || lcRetorno;");
	sb.appendln("    lnTerna = lnTerna + 1;");
	sb.appendln("    END LOOP;");
	sb.appendln("  END IF;");
	sb.appendln("  IF lnTerna = 1 THEN");
	sb.appendln("    lcRetorno := 'CERO';");
	sb.appendln("  END IF;");
	sb.appendln("  lcRetorno := RTRIM(lcRetorno::TEXT) || ' CON ' || LTRIM(lnFraccion::TEXT) || '/100';");
	sb.appendln("RETURN lcRetorno;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-05-21 21:42:28.0");
	sb.appendln("@Identifier=49bfaa50-4607-ee19-ceb6-0c718feef9ec");
	return sb.toString();
}
}
