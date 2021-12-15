package org.xendra.transfer.cardcomponent;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import org.xendra.common.ICardPanel;
import org.xendra.transfer.CTransferWarehouse;

public class CardComponentPanel extends JPanel implements ICardPanel, Observer {
	public CTransferWarehouse transferpanel;
	public CardComponentPanel()
	{
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				selection();
			}
		});	
	}
	public CardComponentPanel(CTransferWarehouse pp) {
		transferpanel = pp;
	}
	@Override
	public void selection() {		
		
	}

	@Override
	public void Void() {
		// TODO Auto-generated method stub
		
	}
	protected CTransferWarehouse getPOSPanel()
	{
		return transferpanel;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
	}
}
