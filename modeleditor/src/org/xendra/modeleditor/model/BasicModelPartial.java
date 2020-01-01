package org.xendra.modeleditor.model;

import org.xendra.modeleditor.model.BasicModelPartial;
import org.xendra.modeleditor.model.IBasicModelPartial;

public class BasicModelPartial implements IBasicModelPartial {
	protected boolean rule;
	protected String id;
	protected String name;
	protected String description;
	public BasicModelPartial(boolean rule) {
		this.rule = rule;
	}
	public BasicModelPartial(String id, boolean rule) {
		if (id == null)
			throw new IllegalArgumentException("id == null");
		this.rule = rule;
		this.id = id;
	}
	public BasicModelPartial(String id, String name, boolean rule) {
		this(id, rule);
		if (name == null)
			throw new IllegalArgumentException("name == null");
		this.name = name;
	}
	public boolean isRule() { return rule; }
	public String toString() { return name; }
	public String getId() { return id; }
	public String getName() { return name; }
	public String getDescription() { return description; }
	public void setDescription(String description) {
		this.description = description;
	}
	public IBasicModelPartial clone() {
		IBasicModelPartial p = new BasicModelPartial(id, name, rule);
		return p;
	}
}
