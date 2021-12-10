package org.xendra.common;

import org.xendra.objectview.RowBase;

public interface Point {
	public void AddProductEvent(RowBase row);
	public void activecard(String m_prevcard);
	public void enableEnvironment();
	public void disableEnvironment();
	public void setStatusLine(String msg, boolean error);
	public void resizetocardpanel();
	public void setError(String error);
}
