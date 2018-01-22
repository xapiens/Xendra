package org.xendra.core.ui.action;

import java.awt.Frame;
import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.core.resourceloader.ResourceLoader;
import org.xendra.core.resourceloader.IconKeys;

public class InfoProduct extends AbstractColumbaAction{

	/**
	 * @param frameMediator
	 * @param name
	 */
	public InfoProduct(IFrameMediator frameMediator) {
		super(frameMediator, Msg.getMsg(Env.getCtx(), "InfoProduct"));

		putValue(AbstractColumbaAction.LARGE_ICON, ResourceLoader
				.getIcon(IconKeys.PRODUCT));
		putValue(AbstractColumbaAction.SMALL_ICON, ResourceLoader
				.getSmallIcon(IconKeys.PRODUCT));
	}

	public void actionPerformed(ActionEvent e) {
		int WindowNo = 0;
		org.compiere.apps.search.Info.showProduct((Frame) this.frameMediator.getView().getFrame(), WindowNo);
	}
}
