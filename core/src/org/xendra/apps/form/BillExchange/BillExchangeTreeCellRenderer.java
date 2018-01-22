//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.
package org.xendra.apps.form.BillExchange;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import org.compiere.model.persistence.X_C_GroupDoc;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;

@SuppressWarnings({"serial","serial"})
public class BillExchangeTreeCellRenderer extends DefaultTreeCellRenderer {

	public BillExchangeTreeCellRenderer() {
		super();
	}

	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean isSelected, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded,
				leaf, row, hasFocus);

		//AddressbookTreeNode folder = (AddressbookTreeNode) value;

		DefaultMutableTreeNode nd = (DefaultMutableTreeNode) value;
		Object xc = nd.getUserObject();
		if (xc instanceof X_C_GroupDoc)
		{
			X_C_GroupDoc group = (X_C_GroupDoc) nd.getUserObject();
			if (!group.isProcessed())
			{
				setIcon(ImageLoader.getSmallIcon(IconKeys.BANK));
			}
		}
		else
		{
			setIcon(ImageLoader.getSmallIcon(IconKeys.INVOICE));
			setOpenIcon(ImageLoader.getSmallIcon(IconKeys.INVOICE));
			setClosedIcon(ImageLoader.getSmallIcon(IconKeys.INVOICE));
		}
		//setText(folder.getName());
		//setIcon(folder.getIcon());

		return this;
	}
}
