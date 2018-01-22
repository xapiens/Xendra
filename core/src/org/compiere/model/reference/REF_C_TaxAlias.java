package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_TaxAlias implements Reference 
{
 	@XendraRefItem(Name="SIM",
		Value="SIM",
		Description="Sin Impuesto (Recibos)",
		Identifier="5020d905-335d-76dc-15bd-a3a6bd03598d")
	/** SIM = SIM */
	public static final String SIM = "SIM";
	@XendraRefItem(Name="IGV",
		Value="IGV",
		Description="IGV (Op. Grav.)",
		Identifier="23f14618-6288-92e6-3c08-08cabb53a6c0")
	/** IGV = IGV */
	public static final String IGV = "IGV";
	@XendraRefItem(Name="IGV3",
		Value="IG3",
		Description="IGV (Op. No Grav.)",
		Identifier="cdcedcaf-53a8-54a6-3236-cb08e70bd972")
	/** IGV3 = IG3 */
	public static final String IGV3 = "IG3";
	@XendraRefItem(Name="Not IGV",
		Value="NIG",
		Description="IGV - Exonerada",
		Identifier="7e501d6c-2b07-d913-30f9-d2da8f0e5b72")
	/** Not IGV = NIG */
	public static final String NotIGV = "NIG";
	@XendraRefItem(Name="ISC",
		Value="ISC",
		Description="ISC",
		Identifier="173f4e6a-c7d1-2ad2-87e7-d77f37d8bde8")
	/** ISC = ISC */
	public static final String ISC = "ISC";
	@XendraRefItem(Name="NGR",
		Value="NGR",
		Description="IGV - Inafecta",
		Identifier="ffdcdf25-1d36-9c41-0399-126d67d5273d")
	/** NGR = NGR */
	public static final String NGR = "NGR";
	@XendraRefItem(Name="OTR",
		Value="OTR",
		Description="Otros Impuestos",
		Identifier="a3ea847f-ec87-87a1-cf2e-9e6e5c75c45e")
	/** OTR = OTR */
	public static final String OTR = "OTR";
	@XendraRefItem(Name="DUA-IGV",
		Value="DUA",
		Description="DUA-IGV",
		Identifier="8dbd9b5b-7101-6ede-6b2d-d7018696b09c")
	/** DUA-IGV = DUA */
	public static final String DUA_IGV = "DUA";
	@XendraRefItem(Name="Renta 4ta C",
		Value="R4C",
		Description="Renta 4ta C",
		Identifier="ac35163d-7870-2ee3-4957-7b9645fcfffd")
	/** Renta 4ta C = R4C */
	public static final String Renta4taC = "R4C";
	@XendraRefItem(Name="IGV2",
		Value="IG2",
		Description="IGV (Op. Grav. No Grav.)",
		Identifier="973fa660-16e6-2b16-bd1e-7828ae37194d")
	/** IGV2 = IG2 */
	public static final String IGV2 = "IG2";
	@XendraRef(Name="C_Tax Alias",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="LLL",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="3f37eeba-3f69-8954-9343-e036e7fd4c4d")
	public static final String Identifier = "3f37eeba-3f69-8954-9343-e036e7fd4c4d";

}
