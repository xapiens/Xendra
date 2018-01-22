package org.xendra.apps.form;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.compiere.swing.CLabel;
import org.compiere.grid.ed.VNumber;
import org.xendra.swing.LED;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import org.compiere.grid.ed.VLookup;

public class testform extends JPanel {
	JTabbedPane tabbedPane;
	JPanel panel;
	CLabel lblTest;
	VNumber number;
	LED ldK;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private VLookup lookup;
	private JLabel lblNewLabel_1;
	private VLookup lookup_1;

	/**
	 * Create the panel.
	 */
	public testform() {
		
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(new MigLayout("", "[19px][96px][33px]", "[24px]"));
		
		lblTest = new CLabel();
		lblTest.setText("test");
		panel.add(lblTest, "cell 0 0,alignx left,aligny center");
		
		number = new VNumber();
		panel.add(number, "cell 1 0,alignx left,aligny center");
		
		ldK = new LED();
		ldK.setText("k");
		panel.add(ldK, "cell 2 0,alignx left,aligny top");
		
		panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel, "2, 2");
		
		lblNewLabel_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_1, "4, 2");
		
		lookup = new VLookup();
		panel_1.add(lookup, "2, 4");
		
		lookup_1 = new VLookup();
		panel_1.add(lookup_1, "4, 4");

	}

}
