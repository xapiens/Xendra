package org.xendra.security.gui.action;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CutKeyPairAction extends CutAction {
	
	public CutKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "cut.png"));
		((SecurityEditorFrameController) frameMediator).register(this);		
	}

}
