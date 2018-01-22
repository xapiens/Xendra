package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Package_Exp_DB implements Reference 
{
 	@XendraRefItem(Name="DB2",
		Value="DB2",
		Description="DB2 Database",
		Identifier="ae618ed3-c643-0afb-143b-4860be07cc6f")
	/** DB2 = DB2 */
	public static final String DB2 = "DB2";
	@XendraRefItem(Name="Firebird",
		Value="Firebird",
		Description="Firebird Database",
		Identifier="4ea946fb-44fd-70ef-d296-03c2c50eed63")
	/** Firebird = Firebird */
	public static final String Firebird = "Firebird";
	@XendraRefItem(Name="MySQL",
		Value="MySQL",
		Description="MySQL Database",
		Identifier="9841e4f4-9cba-813b-6e9a-6148aa79a433")
	/** MySQL = MySQL */
	public static final String MySQL = "MySQL";
	@XendraRefItem(Name="Oracle",
		Value="Oracle",
		Description="Oracle Database",
		Identifier="8f738497-b2da-495c-6466-82883889d5d6")
	/** Oracle = Oracle */
	public static final String Oracle = "Oracle";
	@XendraRefItem(Name="Postgres",
		Value="Postgres",
		Description="Postgres Database",
		Identifier="d79d9b4f-7aa9-e6b7-483f-6c35475a73ee")
	/** Postgres = Postgres */
	public static final String Postgres = "Postgres";
	@XendraRefItem(Name="SQL Server",
		Value="SQL",
		Description="SQL Server Database",
		Identifier="a0d02e91-afc6-2934-6e97-7102f048f1c2")
	/** SQL Server = SQL */
	public static final String SQLServer = "SQL";
	@XendraRefItem(Name="Sybase",
		Value="Sybase",
		Description="Sybase Database",
		Identifier="6a343fc9-f001-cb8b-e26d-0f873599a7b9")
	/** Sybase = Sybase */
	public static final String Sybase = "Sybase";
	@XendraRefItem(Name="All Database Types",
		Value="ALL",
		Description="Use this when a SQL command syntax is the same between database types",
		Identifier="2145b912-cb00-a286-d770-b60725fa2b12")
	/** All Database Types = ALL */
	public static final String AllDatabaseTypes = "ALL";
	@XendraRef(Name="AD_Package_Exp_DB",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="List of database types",
		Help="This is a list of database types used by the inbound packaging processing to determine if the sql statement is fired.",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a115f218-129f-b75f-b29b-b3c69755db8a")
	public static final String Identifier = "a115f218-129f-b75f-b29b-b3c69755db8a";

}
