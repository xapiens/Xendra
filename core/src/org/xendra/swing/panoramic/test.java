package org.xendra.swing.panoramic;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.compiere.model.MPeriod;
import org.compiere.model.Query;
import org.compiere.util.Env;

import net.miginfocom.swing.MigLayout;

public class test implements ActionListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test x = new test();
		x.run();
	}
	private void run() {
		JFrame f = new JFrame();
		PanoramicCtrl p = new PanoramicCtrl();
		p.addActionListener(this);
		//p.resetZoom(36, 10);
		List<MPeriod> periods = new Query(Env.getCtx(), MPeriod.Table_Name, "AD_Client_ID = 1000027", null)
			.setOrderBy("startdate").list();
		p.setPeriods(periods.get(0),periods, 10);
		JPanel p2 = new JPanel(new MigLayout());
		p2.add(new JLabel("x"), "wrap");
		p2.add(p);
		f.add(p2);
		f.setSize(new Dimension(300,300));
		f.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().getClass().equals(PanoramicCtrl.class)) {
		}
	}
	
}
