package org.columba.core.filter;

import java.awt.Color;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class FilterCriteria {
	@XmlAttribute(name = "Type")
	String TypeString = "Subject";
	int Type = 0;
	@XmlAttribute(name = "headerfield")
	//String HeaderfieldString = "Subject";
	String HeaderfieldString;
	@XmlAttribute(name = "criteria")
	String CriteriaString = "contains";
	int Criteria = 0;
	@XmlAttribute(name = "pattern")
	String PatternString = "pattern";
	int Pattern = 0;
	@XmlAttribute
	Integer RGB = null;
	@XmlAttribute
	Integer Account_Uid = null;
	public final static int CONTAINS = 0;
	public final static int CONTAINS_NOT = 1;
	public final static int IS = 2;	
	public final static int IS_NOT = 3;
	public final static int BEGINS_WITH = 4;
	public final static int ENDS_WITH = 5;
	public final static int DATE_BEFORE = 6;
	public final static int DATE_AFTER = 7;
	public final static int SIZE_SMALLER = 8;
	public final static int SIZE_BIGGER = 9;
	public FilterCriteria() {
		
	}
	public FilterCriteria(FilterCriteria c) {
		this.setCriteria(c.getCriteria());
		this.setCriteriaString(c.getCriteriaString());
		this.setTypeString(c.getTypeString());
		this.setHeaderfieldString(c.getHeaderfieldString());
		this.setPattern(c.getPattern());
	}
	public String getHeaderfieldString() {
		return HeaderfieldString;
	}
	public void setHeaderfieldString(String headerfieldString) {
		HeaderfieldString = headerfieldString;
	}
	public String getCriteriaString() {
		return CriteriaString;
	}
	public void setCriteriaString(String criteria) {
		CriteriaString = criteria;
	}
	public int getCriteria() {
		return Criteria;
	}
	public void setCriteria(int criteria) {
		Criteria = criteria;
	}
	public String getTypeString() {
		return TypeString;
	}
	public void setTypeString(String typeString) {
		TypeString = typeString;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public String getPatternString() {
		return PatternString;
	}
	public void setPatternString(String patternString) {
		PatternString = patternString;
	}
	public int getPattern() {
		return Pattern;
	}
	public void setPattern(int pattern) {
		Pattern = pattern;
	}
	public int getRGB() {
		return RGB;
	}
	public void setRGB(int rGB) {
		RGB = rGB;
	}
	public int getAccount_Uid() {
		return Account_Uid;
	}
	public void setAccount_Uid(int account_Uid) {
		Account_Uid = account_Uid;
	}	
}
