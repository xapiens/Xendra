package org.xendra.pos.cardcomponent;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import org.xendra.Constants;
import org.xendra.common.ICardPanel;
import org.xendra.pos.PosPanel;

public class CardComponentPanel extends JPanel implements ICardPanel, Observer {
	public PosPanel pospanel;
	public CardComponentPanel()
	{
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				selection();
			}
		});	
	}
	public CardComponentPanel(PosPanel pp) {
		pospanel = pp;
	}
	@Override
	public void selection() {		
		
	}

	@Override
	public void Void() {
		// TODO Auto-generated method stub
		
	}
	
	protected BigDecimal getAmt(String key) {
		return getPOSPanel().getAmt(key);
	}
	protected void setAmt(String key, BigDecimal amt) {
		getPOSPanel().setAmt(key, amt);
	}	
	protected PosPanel getPOSPanel()
	{
		return pospanel;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
