package org.xendra.security.gui.dialog;

import java.awt.Component;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.util.Env;

public class PartnerCellRenderer extends DefaultTreeCellRenderer {
	ImageIcon localIcon = null;
	public PartnerCellRenderer(boolean b) {
		super();
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, 
			boolean isSelected, boolean expanded, boolean leaf, int row,
			boolean hasFocus ) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded, 
				leaf, row, hasFocus);
		if (value != null ) {
			PartnerNode m = (PartnerNode) value;
			MBPartner p = m.getPartner();
			if (p != null) {
				Boolean hascertificate = false;
				X_C_BPartner_Certificate bpc = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
							.setParameters(p.getC_BPartner_ID()).first();
				if (bpc != null) {
					hascertificate = true;					
				}
				//p.HasCertified();
				setText(String.format("%s %s", p.getValue(), p.getName()));
				ImageIcon localIcon;
				try {
					if (hascertificate) {
						localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "warehouse.png"))));
					}
					else {
						localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
					}
					setIcon(localIcon);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return this;
	}
}
