package org.frapuccino.htmleditor.event;

import java.util.EventObject;

public class FormatChangedEvent extends EventObject {

	private FormatInfo info;

	public FormatChangedEvent(Object source, FormatInfo info) {
		super(source);

		this.info = info;
	}

	public FormatInfo getInfo() {
		return info;
	}
}
