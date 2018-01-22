package org.frapuccino.htmleditor;

import java.nio.charset.Charset;
import java.util.ResourceBundle;

import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.EventListenerList;
import javax.swing.text.StyleConstants;
import javax.swing.text.html.HTML;

import org.frapuccino.htmleditor.action.AbstractEditorAction;
import org.frapuccino.htmleditor.action.AbstractSelectableEditorAction;
import org.frapuccino.htmleditor.action.BoldFormatAction;
import org.frapuccino.htmleditor.action.CenterJustifyAction;
import org.frapuccino.htmleditor.action.InsertBreakAction;
import org.frapuccino.htmleditor.action.ItalicFormatAction;
import org.frapuccino.htmleditor.action.LeftJustifyAction;
import org.frapuccino.htmleditor.action.RightJustifyAction;
import org.frapuccino.htmleditor.action.StrikeoutFormatAction;
import org.frapuccino.htmleditor.action.TeletyperFormatAction;
import org.frapuccino.htmleditor.action.UnderlineFormatAction;
import org.frapuccino.htmleditor.api.IFormatChangedListener;
import org.frapuccino.htmleditor.api.IHtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;
import org.frapuccino.htmleditor.event.FormatInfo;

public class HtmlEditorController implements IHtmlEditorController {

	private static final String I18N_PATH = "org.frapuccino.htmleditor.action";

	private EventListenerList listenerList = new EventListenerList();

	private HtmlEditorView view;

	private ResourceBundle bundle;

	public HtmlEditorController() {
		view = new HtmlEditorView();

		view.addCaretListener(new MyCaretListener());

		// default bundle
		bundle = ResourceBundle.getBundle(I18N_PATH);

		setCharset(Charset.defaultCharset());
	}

	public HtmlEditorController(ResourceBundle bundle) {
		this();

		this.bundle = bundle;
	}

	public AbstractSelectableEditorAction getBoldFormatAction() {
		return new BoldFormatAction(this);
	}

	public AbstractSelectableEditorAction getCenterJustifyAction() {
		return new CenterJustifyAction(this);
	}

	public AbstractEditorAction getInsertBreakAction() {
		return new InsertBreakAction(this);
	}

	public AbstractSelectableEditorAction getItalicFormatAction() {
		return new ItalicFormatAction(this);
	}

	public AbstractSelectableEditorAction getLeftJustifyAction() {
		return new LeftJustifyAction(this);
	}

	public AbstractSelectableEditorAction getRightJustifyAction() {
		return new RightJustifyAction(this);
	}

	public AbstractSelectableEditorAction getStrikeoutFormatAction() {
		return new StrikeoutFormatAction(this);
	}

	public AbstractSelectableEditorAction getTeletyperFormatAction() {
		return new TeletyperFormatAction(this);
	}

	public AbstractSelectableEditorAction getUnderlineFormatAction() {
		return new UnderlineFormatAction(this);
	}

	public JTextPane getView() {
		return view;
	}

	public void setCharset(Charset charset) {
		view.setCharset(charset);
	}

	/** ************* Methods for setting html specific formatting ************ */
	/**
	 * Toggle bold font in the view on/off
	 */
	public void toggleBold() {
		view.toggleBold();

		fireFormatChanged();
	}

	/**
	 * Toggle italic font in the view on/off
	 */
	public void toggleItalic() {
		view.toggleItalic();

		fireFormatChanged();
	}

	/**
	 * Toggle underline font in the view on/off
	 */
	public void toggleUnderline() {
		view.toggleUnderline();

		fireFormatChanged();
	}

	/**
	 * Toggle strikeout font in the view on/off
	 */
	public void toggleStrikeout() {
		view.toggleStrikeout();

		fireFormatChanged();
	}

	/**
	 * Toggle teletyper font (type written text) in the view on/off
	 */
	public void toggleTeleTyper() {
		view.toggleTeleTyper();

		fireFormatChanged();
	}

	/**
	 * Sets alignment in the view to left, center or right
	 *
	 * @param align
	 *            One of StyleConstants.ALIGN_LEFT, StyleConstants.ALIGN_CENTER
	 *            or StyleConstants.ALIGN_RIGHT
	 */
	private void setAlignment(int align) {
		view.setTextAlignment(align);

		fireFormatChanged();
	}

	public void setCenterJustify() {
		setAlignment(StyleConstants.ALIGN_CENTER);
	}

	public void setLeftJustify() {
		setAlignment(StyleConstants.ALIGN_LEFT);
	}

	public void setRightJustify() {
		setAlignment(StyleConstants.ALIGN_RIGHT);
	}

	/**
	 * Sets paragraph format for selected paragraphs or current paragraph if no
	 * text is selected
	 *
	 * @param tag
	 *            Html tag specifying the format to set
	 */
	public void setParagraphFormat(HTML.Tag tag) {
		view.setParagraphFormat(tag);

		fireFormatChanged();
	}

	/**
	 * Method for inserting a break (BR) element
	 */
	public void insertBreak() {
		view.insertBreak();

		fireFormatChanged();
	}

	/**
	 * Adds a listener.
	 */
	public void addFormatChangedListener(IFormatChangedListener listener) {
		listenerList.add(IFormatChangedListener.class, listener);
	}

	/**
	 * Removes a previously registered listener.
	 */
	public void removeFormatChangedListener(IFormatChangedListener listener) {
		listenerList.remove(IFormatChangedListener.class, listener);
	}

	/**
	 * Propagates an event to all registered listeners notifying them that this
	 * folder has been renamed.
	 * <p>
	 * Notify observers about format change - this is necessary to update the
	 * state of alignment buttons / menues
	 */
	private void fireFormatChanged() {

		// create format info

		String text = view.getSelectedText();
		boolean textSelected = (text != null) && (text.length() > 0);;
		int pos = view.getCaretPosition();
		FormatInfo info = new FormatInfo(view.getHtmlDoc(), pos, textSelected);

		// fire event

		FormatChangedEvent e = new FormatChangedEvent(this, info);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IFormatChangedListener.class) {
				((IFormatChangedListener) listeners[i + 1]).formatChanged(e);
			}
		}
	}

	public ResourceBundle getResourceBundle() {
		return bundle;
	}

	class MyCaretListener implements CaretListener {

		public void caretUpdate(CaretEvent e) {
			int dot = e.getDot();
			int mark = e.getMark();

			fireFormatChanged();
		}

	}

}
