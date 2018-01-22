package org.compiere.grid.ed;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.util.HashMap;

import javax.swing.CodeEditorPane;
import javax.swing.DefaultSyntaxColorizer.RegExpHashMap;
import javax.swing.border.Border;

import org.compiere.model.GridField;
import org.compiere.util.CLogger;
import org.xendra.plaf.XendraPLAF;

public class VScript extends CodeEditorPane implements VEditor {

	/**
	 * 
	 */
	private String m_columnName;
	private boolean isUpdateable;
	private boolean isReadOnly;
	private String m_oldText;
	private boolean m_setting;
	private String m_initialText;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VScript.class);


	public VScript(String columnName, boolean mandatory, boolean readOnly, boolean updateable, int displayLength, int fieldLength) {
		setPreferredSize(new Dimension (500,80));
		//  Create Editor
		setForeground(XendraPLAF.getTextColor_Normal());
		setBackground(XendraPLAF.getFieldBackground_Normal());

		setMandatory(mandatory);
		m_columnName = columnName;

		if (isReadOnly || !isUpdateable)
			setReadWrite(false);
		//addKeyListener(this);

		//	Popup
		//addMouseListener(new VTextLong_mouseAdapter(this));
        final HashMap<String, Color> syntax = new RegExpHashMap();
        syntax.put("package", Color.RED);
        syntax.put("import", Color.RED);
        syntax.put("global", Color.RED);        
        //
        syntax.put("rule", Color.RED);
        syntax.put("eval", Color.RED);
        syntax.put("declare", Color.RED);
        syntax.put("dialect", Color.RED);
        syntax.put("when", Color.RED);
        syntax.put("then", Color.RED);
        syntax.put("end", Color.RED);
        //
        syntax.put("public", Color.BLUE);
        syntax.put("static", Color.BLUE);
        syntax.put("void", Color.MAGENTA);
        syntax.put("main", Color.PINK);
        syntax.put("print(\\w{2})", Color.CYAN);

        //final CodeEditorPane edit = new CodeEditorPane();

        setKeywordColor(syntax);

        HashMap<String, String> help = new HashMap<String, String>();
        help.put("System", "The System class contains several useful class fields and methods. It cannot be instantiated.");
        help.put("out", "The \"standard\" output stream. This stream is already open and ready to accept output data.");
        help.put("err", "The \"standard\" error output stream. This stream is already open and ready to accept output data.");
        setKeywordHelp(help);

        //edit.setText("public static void main(String args[]) {\n  System.out.println(\"this is an example\");\n  //This is a comment\n}");        
        
        setVerticalLineAtPos(80);
		
	}

	public void setName(String columnName) {
		// TODO Auto-generated method stub
		
	}

	public void setField(GridField mField) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReadWrite(boolean rw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isReadWrite() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setMandatory(boolean mandatory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMandatory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBackground(boolean error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(Object value) {
		if (value == null)
			m_oldText = "";
		else
			m_oldText = value.toString();
		if (m_setting)
			return;
		super.setText(m_oldText);		
		m_initialText = m_oldText;
		//	Always position Top 
		setCaretPosition(0);
	}

	@Override
	public String getDisplay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(org.compiere.model.GridField.PROPERTY))
			super.setText((String)evt.getNewValue());				
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addVetoableChangeListener(VetoableChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVetoableChangeListener(VetoableChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListener(ActionListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBorder(Border border) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFont(Font font) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setForeground(Color color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
