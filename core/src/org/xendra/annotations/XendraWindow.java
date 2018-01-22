package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraWindow {
	String Name();
	String Description();
	String Help();
	String WindowType();
	String AD_Menu_ID();
	boolean IsSOTrx();
	boolean IsBetaFunctionality();
	String AD_Image_ID();
	String Identifier();
	String Synchronized();
}
