package org.xendra.utils;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class certrenderer extends JLabel implements ListCellRenderer<Cert> {
	
	@Override
	public Component getListCellRendererComponent(JList<? extends Cert> list, Cert cert, int index, boolean isSelected, boolean cellHasFocus) {
		String code = cert.getSubjectDN();
		if (isSelected) {
			code = String.format("* %s", code);
		}
		setText(code);
		return this;
	}
}
