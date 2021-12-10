package org.xendra.swing.panoramic;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JScrollPane;
import org.compiere.grid.ed.VComboBox;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MPeriod;
import org.compiere.model.persistence.X_C_Year;

import net.miginfocom.swing.MigLayout;

public class PanoramicCtrl extends AbstractButton implements ActionListener {
	PanelDraw paneldraw = new PanelDraw(this);
	private Point m_Point;
	private VLookup lookup;
	public PanoramicCtrl() {
		this.setLayout(new MigLayout("fill"));
		lookup = VLookup.create(X_C_Year.Table_Name, X_C_Year.COLUMNNAME_C_Year_ID, 0);
		lookup.addActionListener(this);
		this.add(lookup,"wrap");
		paneldraw.addMouseListener(new MouseHandler(paneldraw));
		JScrollPane sv = new JScrollPane();
		sv.setViewportView(paneldraw);
		this.add(sv);
	}
	public void setPreferredSize(Dimension dim) {
		super.setPreferredSize(dim);
		setBounds(0, 0, dim.width, dim.height);		
	}
	public void setPeriods(MPeriod start, List<MPeriod> periods, int percent) {		
		paneldraw.setPeriods(start, periods, percent);
	}
	public void setPixel(int x, int y, int color) {
		paneldraw.setPixel(x, y, color);
	}
	public void setPoint(Point p) {
		m_Point = p;
		PointEvent pe = new PointEvent(this, 1, "UpdatePoint");
		fireActionPerformed(pe);
	}
	public Point getPoint() {
		return m_Point;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof VComboBox) {
			Integer value = (Integer) lookup.getValue();
			paneldraw.setYear(value);
			paneldraw.revalidate();
			paneldraw.repaint();		

		}
	}
	public void refresh() {		
		revalidate();
		repaint();
	}
}
