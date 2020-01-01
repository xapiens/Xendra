package org.xendra.modeleditor.model;

import org.xendra.modeleditor.model.IBasicModelPartial;

public interface IBasicModelPartial {
	public String getId();
	public String getName();
	public String getDescription();
	public boolean isRule();
	public IBasicModelPartial clone();
}
