package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraFunction {
	String Name();
	String Output();
	String Owner();
	String Language();
	String Identifier();
	String Arguments();
	String Extension();	
	String Synchronized();
}
