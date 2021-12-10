package org.xendra.messages;

public class MessageArea {
	String name;
	//String source;
	String parent;
	Integer sequence;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getSource() {
//		return source;
//	}
//	public void setSource(String source) {
//		this.source = source;
//	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}			
}
