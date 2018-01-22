package org.columba.api.plugin;

public class ServletMetadata {
	private String containername;
	private String containercontext;
	private String name;
	private String classname;
	private String mapping;
	public ServletMetadata(String name, String clazz, String mapping) {
		this.name = name;
		this.classname = clazz;
		this.mapping = mapping;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getMapping() {
		return mapping;
	}
	public void setMapping(String mapping) {
		this.mapping = mapping;
	}
	public String getContainername() {
		return containername;
	}
	public void setContainername(String containername) {
		this.containername = containername;
	}
	public String getContainercontext() {
		return containercontext;
	}
	public void setContainercontext(String containercontext) {
		this.containercontext = containercontext;
	}
}
