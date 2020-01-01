package org.xendra.modeleditor.gui.modeleditor;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ResizeListener implements ComponentListener {

	@Override
	public void componentHidden(ComponentEvent arg0) {
		System.out.println("hidden");
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		System.out.println("moved");
	}

	@Override
	public void componentResized(ComponentEvent arg0) {	
		System.out.println("resized");
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		System.out.println("shown");
	}

}
