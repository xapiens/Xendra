package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.tipoftheday.DTipOfTheDay;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class TipOfTheDayAction extends SecurityColumbaAction  {
	public TipOfTheDayAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "TipOfTheDay"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","TipOfTheDay"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","TipOfTheDay"));
		putValue(Constants.ID, "TipOfTheDay");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
        showTipOfTheDay();
	}
	
    /**
     * Display the tip of the day dialog.
     */
    public void showTipOfTheDay() {
            DTipOfTheDay dTipOfTheDay = new DTipOfTheDay(getFrameMediator().getContainer().getFrame(), 
            				applicationSettings.getShowTipsOnStartUp(), res,
                            applicationSettings.getNextTipIndex());

            dTipOfTheDay.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
            dTipOfTheDay.setVisible(true);

            applicationSettings.setShowTipsOnStartUp(dTipOfTheDay.showTipsOnStartup());
            applicationSettings.setNextTipIndex(dTipOfTheDay.nextTipIndex());
    }
	
}
