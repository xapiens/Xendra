package org.xendra.modeleditor.model;

public class ViewBean {
	String Name;
	String Comments;
	String Owner;
	String Definition;
	String Synchronized;
	String Identifier;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public String getDefinition() {
		return Definition;
	}
	public void setDefinition(String definition) {
		Definition = definition;
	}
	public String getSynchronized() {
		return Synchronized;
	}
	public void setSynchronized(String synchronized1) {
		Synchronized = synchronized1;
	}
	public String getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}	
}
