package org.columba.api.plugin;

import java.sql.Timestamp;
import java.util.List;

public class ExtensionForm {
	String Name = "";
	String Description = "";
	String Identifier;
	String classname = "";
	String accesslevel = "";
	String EntityType = "";
	boolean isbeta = false;
	Timestamp synchro;
	private List<ExtensionFormTrl> m_formtrl;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getAccesslevel() {
		return accesslevel;
	}
	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}
	public String getEntityType() {
		return EntityType;
	}
	public void setEntityType(String entityType) {
		EntityType = entityType;
	}
	public boolean isIsbeta() {
		return isbeta;
	}
	public void setIsbeta(boolean isbeta) {
		this.isbeta = isbeta;
	}
	public Timestamp getSynchro() {
		return synchro;
	}
	public void setSynchro(Timestamp synchro) {
		this.synchro = synchro;
	}
	public void addTrl(List<ExtensionFormTrl> formtrl) {
		m_formtrl = formtrl;		
	}
	public List<ExtensionFormTrl> getTrl() {
		return m_formtrl;
	}
}
