package org.xendra.modeleditor.model;

import java.sql.Timestamp;
import org.compiere.util.NamePair;

public class ColumnBean {
	Integer AD_Column_ID;
	String name;
	String description;
	String help;
	int version;
	NamePair EntityType;
	String ColumnName;
	NamePair AD_Reference_ID;
	NamePair AD_Reference_Value_ID;
	NamePair AD_Val_Rule_ID;
	int FieldLength;
	String DefaultValue;
	Boolean isKey;
	boolean isParent;
	boolean isMandatory;
	boolean isUpdateable;
	String ReadOnlyLogic;
	boolean isIdentifier;
	int SeqNo;
	boolean isTranslated;
	String Callout;
	String VFormat;
	int ValueMin;
	int ValueMax;
	boolean isSelectionColumn;
	NamePair AD_Process_ID;
	boolean isAlwaysUpdateable;
	String ColumnSQL;
	String FormatPattern;
	boolean isAllowLogging;
	String MandatoryLogic;
	String InfoFactoryClass;
	Timestamp Synchronized;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public NamePair getEntityType() {
		return EntityType;
	}
	public void setEntityType(NamePair entitytype) {
		this.EntityType = entitytype;
	}
	public String getColumnName() {
		return ColumnName;
	}
	public void setColumnName(String columnName) {
		ColumnName = columnName;
	}
	public NamePair getAD_Reference_ID() {
		return AD_Reference_ID;
	}
	public void setAD_Reference_ID(NamePair aD_Reference_ID) {
		AD_Reference_ID = aD_Reference_ID;
	}	
	public NamePair getAD_Reference_Value_ID() {
		return AD_Reference_Value_ID;
	}
	public void setAD_Reference_Value_ID(NamePair aD_Reference_Value_ID) {
		AD_Reference_Value_ID = aD_Reference_Value_ID;
	}
	public NamePair getAD_Val_Rule_ID() {
		return AD_Val_Rule_ID;
	}
	public void setAD_Val_Rule_ID(NamePair aD_Val_Rule_ID) {
		AD_Val_Rule_ID = aD_Val_Rule_ID;
	}
	public int getFieldLength() {
		return FieldLength;
	}
	public void setFieldLength(int fieldLength) {
		FieldLength = fieldLength;
	}
	public String getDefaultValue() {
		return DefaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		DefaultValue = defaultValue;
	}
	public Boolean getIsKey() {
		return isKey;
	}
	public void setIsKey(Boolean isKey) {
		this.isKey = isKey;
	}
	public boolean getIsParent() {
		return isParent;
	}
	public void setIsParent(boolean isParent) {
		this.isParent = isParent;
	}
	public boolean getIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public boolean getIsUpdateable() {
		return isUpdateable;
	}
	public void setIsUpdateable(boolean isUpdateable) {
		this.isUpdateable = isUpdateable;
	}	
	public boolean getIsIdentifier() {
		return isIdentifier;
	}
	public void setIsIdentifier(boolean isIdentifier) {
		this.isIdentifier = isIdentifier;
	}
	public String getReadOnlyLogic() {
		return ReadOnlyLogic;
	}
	public void setReadOnlyLogic(String readOnlyLogic) {
		ReadOnlyLogic = readOnlyLogic;
	}
	public int getSeqNo() {
		return SeqNo;
	}
	public void setSeqNo(int seqNo) {
		SeqNo = seqNo;
	}
	public boolean getIsTranslated() {
		return isTranslated;
	}
	public void setIsTranslated(boolean isTranslated) {
		this.isTranslated = isTranslated;
	}
	public String getCallout() {
		return Callout;
	}
	public void setCallout(String callout) {
		Callout = callout;
	}
	public String getVFormat() {
		return VFormat;
	}
	public void setVFormat(String vFormat) {
		VFormat = vFormat;
	}
	public int getValueMin() {
		return ValueMin;
	}
	public void setValueMin(int valueMin) {
		ValueMin = valueMin;
	}
	public int getValueMax() {
		return ValueMax;
	}
	public void setValueMax(int valueMax) {
		ValueMax = valueMax;
	}
	public boolean getIsSelectionColumn() {
		return isSelectionColumn;
	}
	public void setIsSelectionColumn(boolean isSelectionColumn) {
		this.isSelectionColumn = isSelectionColumn;
	}
	public NamePair getAD_Process_ID() {
		return AD_Process_ID;
	}
	public void setAD_Process_ID(NamePair aD_Process_ID) {
		AD_Process_ID = aD_Process_ID;
	}
	public boolean getIsAlwaysUpdateable() {
		return isAlwaysUpdateable;
	}
	public void setIsAlwaysUpdateable(boolean isAlwaysUpdateable) {
		this.isAlwaysUpdateable = isAlwaysUpdateable;
	}
	public String getColumnSQL() {
		return ColumnSQL;
	}
	public void setColumnSQL(String columnSQL) {
		ColumnSQL = columnSQL;
	}
	public String getFormatPattern() {
		return FormatPattern;
	}
	public void setFormatPattern(String formatPattern) {
		FormatPattern = formatPattern;
	}
	public boolean getIsAllowLogging() {
		return isAllowLogging;
	}
	public void setIsAllowLogging(boolean isAllowogging) {
		this.isAllowLogging = isAllowogging;
	}
	public String getMandatoryLogic() {
		return MandatoryLogic;
	}
	public void setMandatoryLogic(String mandatoryLogic) {
		MandatoryLogic = mandatoryLogic;
	}
	public String getInfoFactoryClass() {
		return InfoFactoryClass;
	}
	public void setInfoFactoryClass(String infoFactoryClass) {
		InfoFactoryClass = infoFactoryClass;
	}
	public Timestamp getSynchronized() {
		return Synchronized;
	}
	public void setSynchronized(Timestamp synchronized1) {
		Synchronized = synchronized1;
	}
	public Integer getAD_Column_ID() {
		return AD_Column_ID;
	}
	public void setAD_Column_ID(Integer aD_Column_ID) {
		AD_Column_ID = aD_Column_ID;
	}	
}
