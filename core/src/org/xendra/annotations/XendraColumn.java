package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraColumn {
	String AD_Element_ID();
	String ColumnName();
	int	AD_Reference_ID();
	String AD_Reference_Value_ID();
	String AD_Val_Rule_ID();
	int FieldLength();
	String DefaultValue();
	boolean IsKey();
	boolean IsInternal();
	boolean IsParent();
	boolean IsMandatory();
	boolean IsUpdateable();
	String ReadOnlyLogic();
	boolean IsIdentifier();
	int SeqNo();
	boolean IsTranslated();	
	String Callout();
	String VFormat();
	String ValueMin();
	String ValueMax();
	String Version();
	boolean IsSelectionColumn();
	String AD_Process_ID();
	boolean IsAlwaysUpdateable();
	String ColumnSQL();
	boolean IsAllowLogging();
	String Identifier();
	String Synchronized();
}
