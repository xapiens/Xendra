package org.xendra.common;

import java.awt.Component;
import java.awt.Dimension;

import org.compiere.swing.CPanel;
import org.xendra.common.PushButton;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;


public class ButtonPanel extends CPanel {
	public ButtonPanel() {
		addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				Dimension dim = null;
				for (Component component:getComponents())
				{
					if (component instanceof PushButton)
					{
						if (dim == null)
							dim = component.getPreferredSize();
						else { 
							double preobj = dim.getSize().getHeight()* dim.getSize().getWidth();
							double obj = component.getPreferredSize().getHeight() * component.getPreferredSize().getWidth();
							if (preobj < obj)
								dim = component.getPreferredSize();
						}
						
					}			
				}
				for (Component component:getComponents())
				{
					if (component instanceof PushButton)
					{
						component.setPreferredSize(dim);
					}			
				}				
			}
		});
	}
}
