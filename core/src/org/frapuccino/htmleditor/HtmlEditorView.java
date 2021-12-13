//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.frapuccino.htmleditor;

import java.awt.Cursor;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.html.HTML;

import org.compiere.util.CLogger;
import org.frapuccino.htmleditor.common.ExtendedHTMLDocument;
import org.frapuccino.htmleditor.common.ExtendedHTMLEditorKit;

/**
 *
 * @author karlpeder
 * @author fdietz
 */
public class HtmlEditorView extends JTextPane {

	private static final CLogger LOG = CLogger.getCLogger("org.frapuccino.htmleditor");

	// Members used for html handling:

	/** HTML Document */
	private ExtendedHTMLDocument htmlDoc;

	/** Editor kit */
	private ExtendedHTMLEditorKit htmlKit;

	// Actions for text formatting:

	/** Action used to toggle bold font on/off */
	private StyledEditorKit.BoldAction actionFontBold;

	/** Action used to toggle italic font on/off */
	private StyledEditorKit.ItalicAction actionFontItalic;

	/** Action used to toggle underline font on/off */
	private StyledEditorKit.UnderlineAction actionFontUnderline;

	/** List of formatting supported (list contains HTML.Tag objects) */
	private List supportedFormats;

	/**
	 * Default constructor. Does initial setup such as creating an editor kit
	 *
	 * @param doc
	 *            HTML document
	 */
	public HtmlEditorView() {
		super();

		// set up editor kit and document
		htmlKit = new ExtendedHTMLEditorKit();
		htmlKit.setDefaultCursor(new Cursor(Cursor.TEXT_CURSOR));

		htmlDoc = (ExtendedHTMLDocument) (htmlKit.createDefaultDocument());

		// attach editor kit and document to the text pane
		setEditorKit(htmlKit);
		setDocument(htmlDoc);

		// initialize formatting actions
		actionFontBold = new StyledEditorKit.BoldAction();
		actionFontItalic = new StyledEditorKit.ItalicAction();
		actionFontUnderline = new StyledEditorKit.UnderlineAction();

		// initialize supported formats
		supportedFormats = new ArrayList();
		supportedFormats.add(HTML.Tag.P);
		supportedFormats.add(HTML.Tag.H1);
		supportedFormats.add(HTML.Tag.H2);
		supportedFormats.add(HTML.Tag.H3);
		supportedFormats.add(HTML.Tag.PRE);
		supportedFormats.add(HTML.Tag.ADDRESS);

		setTextAlignment(StyleConstants.ALIGN_LEFT);
	}

	/** Returns the underlying HTML document */
	public ExtendedHTMLDocument getHtmlDoc() {
		return htmlDoc;
	}

	/** Sets the charset to use */
	public void setCharset(Charset charset) {
		if (charset == null) {
			charset = Charset.forName(System.getProperty("file.encoding"));
		}

		setContentType("text/html; charset=\"" + charset.name() + "\"");
	}

	// ***************** Methods for formatting and editing ******

	/**
	 * Toggles bold font on/off.
	 */
	public void toggleBold() {
		/*
		 * When sending null as the event object, the handler finds the text
		 * component to operate on by searching for the last text component
		 * which had focus. This should be alright here
		 */
		actionFontBold.actionPerformed(null);
	}

	/**
	 * Toggles italic font on/off
	 */
	public void toggleItalic() {
		actionFontItalic.actionPerformed(null); // see note for toggleBold
	}

	/**
	 * Toggles underline font on/off
	 */
	public void toggleUnderline() {
		actionFontUnderline.actionPerformed(null); // see not for toggleBold
	}

	/**
	 * Toggles strikeout (aka strike through) on/off
	 */
	public void toggleStrikeout() {
		MutableAttributeSet inputAttr = htmlKit.getInputAttributes();
		boolean isStrike = false;

		if (StyleConstants.isStrikeThrough(inputAttr)) {
			isStrike = true;
		}

		// define attribute set with the strike attribute
		SimpleAttributeSet sas = new SimpleAttributeSet();
		StyleConstants.setStrikeThrough(sas, !isStrike); // ! for toggle

		// set format on current selection and input attributes
		setCharacterFormat(sas);
	}

	/**
	 * Toggles tele typer (aka typewritten) on/off
	 */
	public void toggleTeleTyper() {
		MutableAttributeSet inputAttr = htmlKit.getInputAttributes();

		// Check if current format includes "tele typer"
		// (needs to be done manually, no helper methods exist on
		// StyleConstants)
		boolean isTeleTyper = false;
		Enumeration enumeration = inputAttr.getAttributeNames();

		while (enumeration.hasMoreElements()) {
			Object name = enumeration.nextElement();

			if ((name instanceof HTML.Tag)
					&& (name.toString().equals(HTML.Tag.TT.toString()))) {
				isTeleTyper = true;

				break;
			}
		}

		// define attribute set with the tele typer attribute
		SimpleAttributeSet sas = new SimpleAttributeSet();
		sas.addAttribute(HTML.Tag.TT, new SimpleAttributeSet());

		if (isTeleTyper) {
			// remove formatting from "input attributes" and current selection
			removeCharacterFormat(sas);
		} else {
			// set format on current selection and input attributes
			setCharacterFormat(sas);
		}
	}

	/**
	 * Private utility for removing character format from current selection and
	 * from the input attributes, which defines the format of text typed at the
	 * current caret position
	 *
	 * @param attr
	 *            Attributeset containing the format to remove
	 */
	private void removeCharacterFormat(AttributeSet attr) {
		// remove formatting from "input attributes"
		MutableAttributeSet inputAttr = htmlKit.getInputAttributes();
		inputAttr.removeAttributes(attr);

		// remove formatting from current selection if any
		int selStart = getSelectionStart();
		int selEnd = getSelectionEnd();

		for (int i = selStart; i < selEnd; i++) {
			// need to remove formatting char by char to keep
			// other existing formats (bold, italic etc.)
			SimpleAttributeSet currentAttr = new SimpleAttributeSet(htmlDoc
					.getCharacterElement(i).getAttributes());
			currentAttr.removeAttributes(attr);
			htmlDoc.setCharacterAttributes(i, 1, currentAttr, true);
		}
	}

	/**
	 * Private utility for setting character format on current selection and on
	 * the input attributes, which defines the format of text typed at the
	 * current caret position.
	 *
	 * @param attr
	 *            Attributeset containing the format to set
	 */
	private void setCharacterFormat(AttributeSet attr) {
		// get information on current selection
		int selStart = getSelectionStart();
		int selEnd = getSelectionEnd();
		int selLength = selEnd - selStart;

		// set format on current selection if any
		if (selLength != 0) {
			htmlDoc.setCharacterAttributes(selStart, selLength, attr, false);
		}

		// set format on "input attributes", so the following text is same
		// format
		MutableAttributeSet inputAttr = htmlKit.getInputAttributes();
		inputAttr.addAttributes(attr);
	}

	/**
	 * Private utility for setting paragraph format on current selection from an
	 * attribute set
	 *
	 * @param attr
	 *            Attributeset containing the format to set
	 */
	private void setParagraphFormat(AttributeSet attr) {
		// get information on current selection
		int selStart = getSelectionStart();
		int selEnd = getSelectionEnd();
		int selLength = selEnd - selStart;

		// set the format
		htmlDoc.setParagraphAttributes(selStart, selLength, attr, false);
	}

	/**
	 * Sets alignment of the current paragraph to left, center or right.
	 *
	 * @param align
	 *            The alignment; one of: StyleConstants.ALIGN_LEFT,
	 *            StyleConstants.ALIGN_CENTER, StyleConstants.ALIGN_RIGHT
	 */
	public void setTextAlignment(int align) {
		// check if alignment is supported
		boolean supported;

		switch (align) {
		case StyleConstants.ALIGN_LEFT:
			supported = true;

			break;

		case StyleConstants.ALIGN_CENTER:
			supported = true;

			break;

		case StyleConstants.ALIGN_RIGHT:
			supported = true;

			break;

		default:
			supported = false;

			break;
		}

		if (!supported) {
			LOG.severe("Alignment not set - alignment=" + align
					+ " not supported");

			return;
		}

		// define attribute set corresponding to the requested format
		MutableAttributeSet attr = new SimpleAttributeSet();
		StyleConstants.setAlignment(attr, align);

		// set alignment
		setParagraphFormat(attr);
	}

	/**
	 * Sets format of selected paragraphs or current paragraph when no text is
	 * selected. <br>
	 * Formats (tags) supported are defined by the list supportedFormats.
	 *
	 * @param formatTag
	 *            Defines which format to set (H1, P etc.)
	 */
	public void setParagraphFormat(HTML.Tag formatTag) {
		// Is the requested format supported?
		if (formatTag == null) {
			LOG.severe("Format not set - formatTag = null");

			return;
		}

		if (!supportedFormats.contains(formatTag)) {
			LOG.severe("Format not set - <" + formatTag + "> not supported");

			return;
		}

		// define attribute set corresponding to the requested format
		MutableAttributeSet attr = new SimpleAttributeSet();
		attr.addAttribute(StyleConstants.NameAttribute, formatTag);

		// set the format
		setParagraphFormat(attr);
	}

	/**
	 * Method for inserting a line break (br tag)
	 */
	public void insertBreak() {
		try {
			int caretPos = this.getCaretPosition();
			htmlKit.insertHTML(htmlDoc, caretPos, "<br>", 0, 0, HTML.Tag.BR);
			this.setCaretPosition(caretPos + 1);
		} catch (BadLocationException e) {
			LOG.severe("Error inserting br tag: " + e.getMessage());
		} catch (IOException e) {
			LOG.severe("Error inserting br tag: " + e.getMessage());
		}
	}

}
