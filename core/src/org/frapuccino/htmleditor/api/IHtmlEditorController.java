package org.frapuccino.htmleditor.api;

import java.nio.charset.Charset;
import java.util.ResourceBundle;

import javax.swing.JTextPane;
import javax.swing.text.html.HTML;

import org.frapuccino.htmleditor.action.AbstractEditorAction;
import org.frapuccino.htmleditor.action.AbstractSelectableEditorAction;

public interface IHtmlEditorController {

//	public AbstractSelectableEditorAction getBoldFormatAction();
//
//	public AbstractSelectableEditorAction getItalicFormatAction();
//
//	public AbstractSelectableEditorAction getUnderlineFormatAction();
//
//	public AbstractSelectableEditorAction getStrikeoutFormatAction();
//
//	public AbstractSelectableEditorAction getTeletyperFormatAction();
//
//	public AbstractSelectableEditorAction getCenterJustifyAction();
//
//	public AbstractSelectableEditorAction getLeftJustifyAction();
//
//	public AbstractSelectableEditorAction getRightJustifyAction();
//
//	public AbstractEditorAction getInsertBreakAction();

	public void setCharset(Charset charset);

	/**
	 * Adds a listener.
	 */
	public void addFormatChangedListener(IFormatChangedListener listener);

	/**
	 * Removes a previously registered listener.
	 */
	public void removeFormatChangedListener(IFormatChangedListener listener);

	public JTextPane getView();

	//public ResourceBundle getResourceBundle();

	/**
	 * Toggle bold font in the view on/off
	 */
	public void toggleBold();

	/**
	 * Toggle italic font in the view on/off
	 */
	public void toggleItalic();

	/**
	 * Toggle underline font in the view on/off
	 */
	public void toggleUnderline();

	/**
	 * Toggle strikeout font in the view on/off
	 */
	public void toggleStrikeout();

	/**
	 * Toggle teletyper font (type written text) in the view on/off
	 */
	public void toggleTeleTyper();

	public void setLeftJustify();

	public void setCenterJustify();

	public void setRightJustify();

	/**
	 * Sets paragraph format for selected paragraphs or current paragraph if no
	 * text is selected
	 *
	 * @param tag
	 *            Html tag specifying the format to set
	 */
	public void setParagraphFormat(HTML.Tag tag);

	/**
	 * Method for inserting a break (BR) element
	 */
	public void insertBreak();

}
