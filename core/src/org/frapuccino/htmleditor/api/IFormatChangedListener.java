package org.frapuccino.htmleditor.api;

import java.util.EventListener;

import org.frapuccino.htmleditor.event.FormatChangedEvent;

public interface IFormatChangedListener extends EventListener {

	public void formatChanged(FormatChangedEvent event);


}
