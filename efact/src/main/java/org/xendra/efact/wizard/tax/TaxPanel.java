package org.xendra.efact.wizard.tax;

import java.awt.BorderLayout;
import java.util.Properties;
import javax.swing.JPanel;
import javax.swing.JTable;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.grid.GridController;
import org.compiere.model.GridTab;
import org.compiere.model.GridWindow;
import org.compiere.model.GridWindowVO;
import org.compiere.model.MQuery;
import org.compiere.model.MWindow;
import org.compiere.util.Env;

public class TaxPanel extends JPanel {
	private GridController m_gridController = null;
	private GridWindow m_mWindow = null;
	private GridTab m_mTab = null;
	private MQuery m_staticQuery = null;
	private int m_WindowNo = 0;
	public void initialize() {
		this.removeAll();
		this.setLayout(new BorderLayout());
		Properties ctx = Env.getCtx();
		m_staticQuery = new MQuery();
		Env.getCtx().setProperty("AD_Client_ID", "1000038");
		m_staticQuery.addRestriction("AD_Client_ID", MQuery.EQUAL, Env.getAD_Client_ID(Env.getCtx()));
		MWindow window = MWindow.getbyIdentifier("738fa9ed-8c68-6bf1-79fe-8963640b6a8b", null);
		if (window == null) {
			
		}
		int AD_Window_ID = window.getAD_Window_ID();
		GridWindowVO wVO = AEnv.getMWindowVO(m_WindowNo, AD_Window_ID, 0);
		if (wVO == null) {
			ADialog.error(m_WindowNo, this, "AccessCannotReport");
		}
		m_mWindow = new GridWindow(wVO);
		m_mTab = m_mWindow.getTab(0);
		m_mWindow.initTab(0);
		//
		m_gridController = new GridController();
		m_gridController.initGrid(m_mTab, true, m_WindowNo, null, null);
		add(m_gridController, BorderLayout.CENTER);
		m_mTab.setQuery(m_staticQuery);
		m_mTab.query(false);
	}
}
