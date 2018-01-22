package org.xendra.core.ui.action;

import java.awt.Frame;
import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.core.resourceloader.ResourceLoader;
import org.xendra.core.resourceloader.IconKeys;

public class InfoAccount extends AbstractColumbaAction{

	/**
	 * @param frameMediator
	 * @param name
	 */
	public InfoAccount(IFrameMediator frameMediator) {
		super(frameMediator, Msg.getMsg(Env.getCtx(),"InfoAccount"));

		putValue(AbstractColumbaAction.LARGE_ICON, ResourceLoader
				.getIcon(IconKeys.ACCOUNT));
		putValue(AbstractColumbaAction.SMALL_ICON, ResourceLoader
				.getSmallIcon(IconKeys.ACCOUNT));
	}

	public void actionPerformed(ActionEvent e) {
		new org.compiere.acct.AcctViewer();
	}
}
