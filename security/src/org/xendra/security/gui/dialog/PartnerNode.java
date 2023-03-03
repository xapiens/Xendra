package org.xendra.security.gui.dialog;

import javax.swing.tree.DefaultMutableTreeNode;

import org.compiere.model.MBPartner;

public class PartnerNode extends DefaultMutableTreeNode {
	MBPartner partner;
	public MBPartner getPartner() {
		return partner;
	}
	public void setPartner(MBPartner partner ) {
		this.partner = partner;
	}

}
