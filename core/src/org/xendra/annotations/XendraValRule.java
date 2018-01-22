package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraValRule {
	String Name();
	int AD_Val_Rule_ID();
	String Description();
	String Type();	
	String EntityType();
	String Identifier();
	String Synchronized();
}
