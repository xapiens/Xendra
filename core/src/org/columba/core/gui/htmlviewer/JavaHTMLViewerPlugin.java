package org.columba.core.gui.htmlviewer;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.ElementIterator;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleContext;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTMLDocument.HTMLReader;

import org.columba.core.gui.htmlviewer.api.IHTMLViewerPlugin;
import org.columba.core.io.DiskIO;

public class JavaHTMLViewerPlugin extends JScrollPane implements
		IHTMLViewerPlugin {

	private HTMLEditorKit htmlEditorKit;

	private AsynchronousHTMLDocument doc;

	private JTextPane textPane = new JTextPane();

	public JavaHTMLViewerPlugin() {
		super();

		
		
		setViewportView(textPane);
		// textPane.setMargin(new Insets(5, 5, 5, 5));
		textPane.setEditable(false);

		htmlEditorKit = new HTMLEditorKit();
		textPane.setEditorKit(htmlEditorKit);

		textPane.setContentType("text/html");

		setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	}

	/*
	 * public void view(String htmlSource) {
	 * 
	 * setText(htmlSource);
	 * 
	 * postView(); }
	 */

	private void postView() {
		// setup base url in order to be able to display images
		// in html-component
		URL baseUrl = DiskIO.getResourceURL("org/columba/core/icons/MISC/");

		((HTMLDocument) textPane.getDocument()).setBase(baseUrl);

		// scroll window to the beginning
		textPane.setCaretPosition(0);
	}

	public void view(String text) {
		if (text == null)
			return;

		doc = new AsynchronousHTMLDocument();

		Reader rd = new StringReader(text);
		try {
			htmlEditorKit.read(rd, doc, 0);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textPane.setDocument(doc);

		postView();
	}

	public JComponent getComponent() {
		return textPane;
	}

	/**
	 * Setting HTMLDocument to be an asynchronize model.
	 * <p>
	 * JTextPane therefore uses a background thread to display the message. This
	 * dramatically improves the performance of displaying a message.
	 * <p>
	 * Trick is to overwrite the getAsynchronousLoadPriority() to return a
	 * decent value.
	 * 
	 * @author fdietz
	 */
	
	public class AsynchronousHTMLDocument extends HTMLDocument {

		/**
		 * 
		 */
		public AsynchronousHTMLDocument() {
			super();
			putProperty("IgnoreCharsetDirective", new Boolean(true));
		}
		
		/*Overwrite the method to maintain line breaks when copying 
		 * messages form the MessageViewer.
		 * @author aoki-y
		 * @see javax.swing.text.html.HTMLDocument#getReader(int)
		 */
		public HTMLEditorKit.ParserCallback getReader(int pos) {
			Object desc = getProperty(Document.StreamDescriptionProperty);
			if (desc instanceof URL) { 
			    setBase((URL)desc);
			}
			HTMLReader reader = new MyReader(pos);
			return reader;
		    }
		
		public class MyReader extends HTMLDocument.HTMLReader{
			public MyReader(int pos){super(pos);}
			
			protected void addSpecialElement(HTML.Tag t, MutableAttributeSet a) {
				super.addSpecialElement(t,a);
				if(t==HTML.Tag.BR){
					int size=parseBuffer.size();
					parseBuffer.removeElementAt(size-1);
					char[] c={'\n'};
					parseBuffer.addElement(new ElementSpec(
					a.copyAttributes(), ElementSpec.ContentType,c,0,c.length));	
				}
			}
		}

		/**
		 * From the JDK1.4 reference:
		 * <p>
		 * This may load either synchronously or asynchronously depending upon
		 * the document returned by the EditorKit. If the Document is of type
		 * AbstractDocument and has a value returned by
		 * AbstractDocument.getAsynchronousLoadPriority that is greater than or
		 * equal to zero, the page will be loaded on a separate thread using
		 * that priority.
		 * 
		 * @see javax.swing.text.AbstractDocument#getAsynchronousLoadPriority()
		 */
		public int getAsynchronousLoadPriority() {
			return 10;
		}

		public String getTextWithLineBreaks(int start, int end)
				throws BadLocationException {
			StringBuffer result = new StringBuffer(end - start);
			ElementIterator iter = new ElementIterator(this);

			// First find the beginning element
			for (iter.next(); iter.current() != null; iter.next()) {
				Element e = iter.current();
				if (e.isLeaf()
						&& (e.getStartOffset() >= start || e.getEndOffset() >= start)
						&& e.getStartOffset() <= end) {
					Object a = e.getAttributes().getAttribute(
							StyleContext.NamedStyle.NameAttribute);
					if (a == HTML.Tag.CONTENT) {
						int as = Math.max(e.getStartOffset(), start);
						int ae = Math.min(e.getEndOffset(), end);
						result.append(super.getText(as, ae - as));
					}
					if (a == HTML.Tag.BR) {
						result.append("\n");
					}
				}
			}

			return result.toString();
		}
	}

	public boolean initialized() {
		return true;
	}

	/**
	 * @see javax.swing.text.JTextComponent#getSelectedText()
	 */
	public String getSelectedText() {
		try {
			return doc.getTextWithLineBreaks(textPane.getSelectionStart(),
					textPane.getSelectionEnd());
		} catch (BadLocationException e) {
			return "";
		}
	}

	public JComponent getContainer() {
		return this;
	}

	public String getText() {
		try {
			return doc.getTextWithLineBreaks(0,doc.getLength());
		} catch (BadLocationException e) {
			return "";
		}
	}

	/**
	 * @see org.columba.core.gui.htmlviewer.api.IHTMLViewerPlugin#setCaretPosition(int)
	 */
	public void setCaretPosition(int position) {
		textPane.setCaretPosition(position);
	}

	/**
	 * @see org.columba.core.gui.htmlviewer.api.IHTMLViewerPlugin#moveCaretPosition(int)
	 */
	public void moveCaretPosition(int position) {
		textPane.moveCaretPosition(position);
	}

}
