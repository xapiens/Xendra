package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraIndex {
	String Name();
	String Identifier();
	String Column_Names();
	String IsUnique();
	String TableIdentifier();
	String Synchronized();
}
