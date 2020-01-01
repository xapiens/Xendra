package org.xendra.ruleeditor.model;

public interface IBasicModelPartial {
	public String getId();
	public String getName();
	public String getDescription();
	public boolean isRule();
	public IBasicModelPartial clone();
}
