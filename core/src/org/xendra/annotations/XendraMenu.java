package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraMenu {
	String AD_Menu_ID();
	String Name();
	String Description();
	boolean IsSummary();
	boolean IsSOTrx();
	boolean IsReadOnly();
	String Parent_ID();
	String level();
	String Identifier();
	String Synchronized();
}
