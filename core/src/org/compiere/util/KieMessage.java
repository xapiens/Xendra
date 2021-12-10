package org.compiere.util;

import org.kie.api.builder.Message;
import org.kie.api.builder.Message.Level;

public 	class KieMessage implements Message {
	String msg ="";
	public KieMessage(String msg) {
		this.msg = msg;
	}
	@Override
	public int getColumn() {
		return 0;
	}

	@Override
	public long getId() {
		return 0;
	}

	@Override
	public Level getLevel() {
		return null;
	}

	@Override
	public int getLine() {
		return 0;
	}

	@Override
	public String getPath() {
		return null;
	}

	@Override
	public String getText() {
		return msg;
	}
	
}
