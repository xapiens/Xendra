package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraElement {
	int AD_Element_ID();
	String ColumnName();
	String EntityType();
	String Name();
	String PrintName();
	String Description();
	String Help();
	String PO_Name();
	String PO_PrintName();
	String PO_Description();
	String PO_Help();
	String Identifier();
	String Synchronized();
}
