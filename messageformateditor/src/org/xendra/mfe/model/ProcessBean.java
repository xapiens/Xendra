package org.xendra.mfe.model;

import org.compiere.util.NamePair;

//<process value="Sales Listener" accesslevel="4" frequencytype="O" frequency="1" 
//keeplogdays="7" name="Sales Listener" queuename="/queue/pos" Identifier="8dfdc6f0-c851-7986-0b03-711e561d6d2b"/>
public class ProcessBean {
	String Value;
	String AccessLevel;
	NamePair FrequencyType;
	Integer Frequency;
	Integer KeepLogDays;
	String Name;
	String QueueName;
	String Identifier;
	NamePair AD_Rule_ID;
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public String getAccessLevel() {
		return AccessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		AccessLevel = accessLevel;
	}
	public NamePair getFrequencyType() {
		return FrequencyType;
	}
	public void setFrequencyType(NamePair frequencyType) {
		FrequencyType = frequencyType;
	}
	public Integer getFrequency() {
		return Frequency;
	}
	public void setFrequency(Integer frequency) {
		Frequency = frequency;
	}
	public Integer getKeepLogDays() {
		return KeepLogDays;
	}
	public void setKeepLogDays(Integer keepLogDays) {
		KeepLogDays = keepLogDays;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getQueueName() {
		return QueueName;
	}
	public void setQueueName(String queueName) {
		QueueName = queueName;
	}
	public String getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}
	public NamePair getAD_Rule_ID() {
		return AD_Rule_ID;
	}
	public void setAD_Rule_ID(NamePair aD_Rule_ID) {
		AD_Rule_ID = aD_Rule_ID;
	}		
}
