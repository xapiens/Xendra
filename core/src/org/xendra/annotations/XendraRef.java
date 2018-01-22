package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraRef {
	String Name();
	String AD_Reference_ID();
	String ValidationType();
	String Description();
	String Help();
	String VFormat();
	String EntityType();
	String Synchronized();
	String Extension();
	boolean IsOrderByValue();
	String Identifier();
}
