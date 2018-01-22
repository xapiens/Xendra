package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraField {
	String AD_Column_ID();
	boolean IsCentrallyMaintained();
	String AD_Tab_ID();
	String AD_FieldGroup_ID();
	boolean IsDisplayed();
	String DisplayLogic();
	int DisplayLength();
	boolean IsReadOnly();
	int SeqNo();
	int SortNo();
	boolean IsSameLine();
	boolean IsHeading();
	boolean IsFieldOnly();
	String Included_Tab_ID();
	String Identifier();	
	String Synchronized();
}
