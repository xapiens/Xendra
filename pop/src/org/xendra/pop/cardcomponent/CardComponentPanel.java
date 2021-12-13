package org.xendra.pop.cardcomponent;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import org.xendra.common.ICardPanel;
import org.xendra.pop.PopPanel;

public class CardComponentPanel extends JPanel implements ICardPanel, Observer {
	public PopPanel poppanel;
	public CardComponentPanel()
	{
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				selection();
			}
		});	
	}
	public CardComponentPanel(PopPanel pp) {
		poppanel = pp;
	}
	@Override
	public void selection() {		
		
	}

	@Override
	public void Void() {
		// TODO Auto-generated method stub
		
	}
	
	protected BigDecimal getAmt(String key) {
		return getPOPPanel().getAmt(key);
	}
	protected void setAmt(String key, BigDecimal amt) {
		getPOPPanel().setAmt(key, amt);
	}	
	protected PopPanel getPOPPanel()
	{
		return poppanel;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
