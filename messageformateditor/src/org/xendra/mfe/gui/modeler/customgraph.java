package org.xendra.mfe.gui.modeler;

import com.mxgraph.view.mxGraph;

public class customgraph extends mxGraph {
	/**
	 * Allows expanding tables
	 */
	public boolean isCellFoldable(Object cell, boolean collapse)
	{
		return model.isVertex(cell);
	}
}
