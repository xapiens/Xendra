package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraTable {
	String AD_Package_ID();
	String AD_Plugin_ID();
	String Name();
	String Description();
	String Help();
	String TableName();
	int IsKey();
	String AccessLevel();
	String AD_Window_ID();
	String AD_Val_Rule_ID();
	int LoadSeq();
	boolean IsSecurityEnabled();
	boolean IsDeleteable();
	boolean IsHighVolume();
	boolean IsView();
	boolean IsChangeLog();	
	String PO_Window_ID();
	String ID();
	String Identifier();	
	String Synchronized();
}
