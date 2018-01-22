package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_BookType implements Reference 
{
 	@XendraRefItem(Name="PLE - Programa Libros Electronicos",
		Value="P",
		Description="",
		Identifier="d685fe51-3405-4952-bb8d-742cb630878d")
	/** PLE - Programa Libros Electronicos = P */
	public static final String PLE_ProgramaLibrosElectronicos = "P";
	@XendraRefItem(Name="Secuencia de Libro ",
		Value="S",
		Description="",
		Identifier="d777ac5c-3b37-4966-92a2-35eefa3534bb")
	/** Secuencia de Libro  = S */
	public static final String SecuenciaDeLibro = "S";
	@XendraRef(Name="Book Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2014-05-08 20:13:34.0",
		Extension="",
		Identifier="173791c5-e791-4998-9e07-d1d0c2fdae24")
	public static final String Identifier = "173791c5-e791-4998-9e07-d1d0c2fdae24";

}
