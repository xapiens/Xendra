/**
 * This interface provides methods to work with a text.
 * If you want to use FindDialog, you need to implement this interface.
 * The functions do the same as in the JTextPane class. 
 * @author Dmytro Podalyuk
 */

package org.columba.core.util;

public interface IViewableText {
	public void setCaretPosition(int position);
	public void moveCaretPosition(int position);
	public String getText();
	public void grabFocus();
}
