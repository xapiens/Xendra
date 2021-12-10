package org.columba.core.gui.processmanager.folder;

import org.compiere.model.persistence.X_M_MaterialProcessorLog;

public class MaterialProcessorLogNode extends ProcessNode {
	String Summary;
	public MaterialProcessorLogNode(X_M_MaterialProcessorLog p) {
		setName(p.getDescription());
		setSummary(p.getSummary());
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}	
}
