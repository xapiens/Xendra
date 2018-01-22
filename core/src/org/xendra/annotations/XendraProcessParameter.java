package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraProcessParameter {
	String Name();
	String ColumnName();
	String Description();
	String Help();
	int SeqNo();
	int AD_Reference_ID();		
	String ReferenceValueID();
	String ValRuleID();	
	int FieldLength();
	boolean IsMandatory();	
	boolean IsRange();
	String DefaultValue();
	String DefaultValue2();
	String vFormat();
	String valueMin();
	String valueMax();
	String DisplayLogic();
	String ReadOnlyLogic();		
	String Identifier();
}
