/**
 * This interface provides methods to work with a text.
 * If you want to use FindReplaceDialog, you need to implement this interface.
 * The functions do the same as in the JTextPane class. 
 * @author Dmytro Podalyuk
 */
package org.columba.core.util;

public interface IEditableText extends IViewableText {
	public void setText(String text);
}
