package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraTab {
	String Name();
	String Description();
	String Help();
	String AD_Window_ID();
	int SeqNo();
	int TabLevel();
	boolean IsSingleRow();
	boolean IsInfoTab();
	boolean IsTranslationTab();
	boolean IsReadOnly();
	String AD_Column_ID();
	boolean HasTree();
	String WhereClause();
	String OrderByClause();	
	String CommitWarning();
	String AD_Process_ID();
	String AD_ColumnSortOrder_ID();
	String AD_ColumnSortYesNo_ID();
	boolean IsSortTab();
	String Included_Tab_ID();
	String ReadOnlyLogic();
	String DisplayLogic();
	boolean IsInsertRecord();
	boolean IsAdvancedTab();
	String Parent_Column_ID();
	String Identifier();
	String Synchronized();
}
