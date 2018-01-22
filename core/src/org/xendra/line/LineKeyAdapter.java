/******************************************************************************
 * Copyright (C) 2007-2010 Dravio SAC. All Rights Reserved.           		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/

package org.xendra.line;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

import org.compiere.apps.ADialog;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.VInvoiceRow;
import org.compiere.model.MProduct;
import org.compiere.swing.CLabel;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.ObjectViewModel;

public class LineKeyAdapter extends KeyAdapter {
	private static final String NEWLINE = "newline";
	private static final String NEXTCOLUMN = "nextcolumn";
	private static final String ADDLINEVALIDATION = "addlinevalidation";
	private static final String DELLINEVALIDATION = "dellinevalidation";
	private static final String ADDLINE = "addline";
	private static final String CALCTOTALLINES = "calctotallines";
	private static final String SHOWEXCEPTION = "showexception";
	private static final String INSERT = "insert"; 
	private static final String HOME = "home";
	private Object mObject;
	private String rowClass;
	private String mMethodName;
	private ObjectView view;
	private int SelectedColumn;
	private int SelectedRow;
	//
	private int mIsKey = -1;
	private int mIsDescription = -1;
	private int mNextLine = -1;
	private int mDefault = -1;
	
	private Boolean m_showdialoginfo;
	private int m_WindowNo;
	private String textToFind;
	private CLabel infosearch;
	private FormFrame m_Frame;
	private BigDecimal QtyByDefault;
	private Method methodValidationForAddLine;
	private Method methodValidationForDelLine;
	private Method methodCalculateTotalLines;
	private Method methodShowException;
	private Method methodLineValidation;
	private Method methodValidationInsert;
	private Method methodValidationHome;
	private Method methodAddLine;
	private Method methodNewLine;
	private Method methodNextColumn;
	private boolean _shift;
	
		
	public String getRowClass() {
		return rowClass;
	}

	public void setRowClass(String rowClass) {
		this.rowClass = rowClass;
	}

	public int getSelectedColumn() {
		return SelectedColumn;
	}

	public int getSelectedRow() {
		return SelectedRow;
	}

	public void setSelectedColumn(Integer selcol) {
		SelectedColumn = selcol;
	}

	public void setSelectedRow(Integer selrow) {
		SelectedRow = selrow;
	}
	
	LineKeyAdapter(Object test, String methodname) {
		mObject = test;
		mMethodName = methodname;
	}
	
	public LineKeyAdapter() {
		
	}
		
	public String getTextToFind() {
		return textToFind;
	}

	public void setTextToFind(String textToFind) {
		this.textToFind = textToFind;
	}

	public void setKeys(int pIsKey, 
						 int pIsDescription, 
						 int pNextLine,
						 int pDefault)
	{
		mIsKey = pIsKey;
		mIsDescription = pIsDescription;
		mNextLine = pNextLine;
		mDefault = pDefault;		
	}
	
	public void setContext(FormFrame pFrame,
							Object pContainer, 
							ObjectView pView,
							Boolean pShowDialogInfo,
							int pWindowNo,
							CLabel pInfoSearch,
							BigDecimal pQtyByDefault,
							String ptextToFind)
	{
		m_Frame = pFrame;
		mObject = pContainer;
		view = pView;
		m_showdialoginfo = pShowDialogInfo;
		m_WindowNo = pWindowNo;
		infosearch = pInfoSearch;
		QtyByDefault = pQtyByDefault;
		textToFind = ptextToFind;
	}
	
	public void funcAddLine(String pAddLine)							{	initializeMethod(ADDLINE, pAddLine);											}
	public void funcNextColumn(String pNextColumn) 						{	initializeMethod(NEXTCOLUMN, pNextColumn); 										}
	public void funcNewLine(String pNewLine) 							{	initializeMethod(NEWLINE, pNewLine ); 											}
	public void funcValidationForAddLine(String pValidationForAddLine)  {	initializeMethod(ADDLINEVALIDATION, pValidationForAddLine);}
	public void funcCalculateTotalLines(String pCalculateTotalLines) 	{	initializeMethod(CALCTOTALLINES, pCalculateTotalLines);    }
	public void funcShowException(String pShowException)				{	initializeMethod(SHOWEXCEPTION, pShowException); 		   }
	public void funcValidationForDelLine(String pValidationForDelLine)  {	initializeMethod(DELLINEVALIDATION, pValidationForDelLine);}
	public void funcKeyHome(String pKeyHome)							{	initializeMethod(HOME, pKeyHome);										  }
	public void funcKeyInsert(String pKeyInsert)						{	initializeMethod(INSERT, pKeyInsert);										  }
	private void initializeMethod(String pMethod,String functionname)
	{
		if (functionname == null || functionname.length() == 0)
			return;
		
		try {		
			if (pMethod.compareTo(ADDLINE) == 0)
			{
				Class[] params = new Class[] {Boolean.class, 
											  MProduct.class, 
											  BigDecimal.class, 
											  Integer.class, 
											  Integer.class, 
											  BigDecimal.class,
											  Integer.class,
											  Boolean.class};
				methodAddLine = mObject.getClass().getMethod(functionname, params);
			}
			else if (pMethod.compareTo(NEWLINE) == 0)
			{
				Object row = null;
				try {
					try {
						row = Class.forName(rowClass).newInstance();
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					methodNewLine = mObject.getClass().getMethod(functionname, new Class[] {row.getClass()});
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}				
			}
			else if (pMethod.compareTo(NEXTCOLUMN) == 0)
			{
				methodNextColumn = mObject.getClass().getMethod(functionname, null);
			}			
			else if (pMethod.compareTo(CALCTOTALLINES) == 0)
			{
				methodCalculateTotalLines = mObject.getClass().getMethod(functionname, null);
			}
			else if (pMethod.compareTo(SHOWEXCEPTION) == 0)
			{
				Object row = null;
				try {
					try {
						row = Class.forName(rowClass).newInstance();
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					methodShowException = mObject.getClass().getMethod(functionname, new Class[] {row.getClass()});
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			else if (pMethod.compareTo(ADDLINEVALIDATION) == 0)
			{
				methodValidationForAddLine = mObject.getClass().getMethod(functionname, null);
			}
			else if (pMethod.compareTo(DELLINEVALIDATION) == 0)
			{
				methodValidationForDelLine = mObject.getClass().getMethod(functionname, null);
			}
			else if (pMethod.compareTo(HOME) == 0)
			{
				methodValidationHome = mObject.getClass().getMethod(functionname, null);
			}						
			else if (pMethod.compareTo(INSERT) == 0)
			{
				methodValidationInsert = mObject.getClass().getMethod(functionname, null);
			}						
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}		
	}
	private Object invokeMethod(String pMethod, Object[] args)
	{
		Object object = new Boolean(false);
		if (pMethod.length() == 0)
			return object;
		try {
			if ( pMethod.compareTo(ADDLINE) == 0 )
			{
				if (methodAddLine == null)
					return new Boolean(false);
				object = methodAddLine.invoke(mObject, args);
			}
			else if (pMethod.compareTo(NEWLINE) == 0)
			{
				if (methodNewLine == null)
					return new Boolean(false);
				object = methodNewLine.invoke(mObject, args);
			}			
			else if (pMethod.compareTo(NEXTCOLUMN) == 0)
			{
				if (methodNextColumn == null)
					return new Boolean(false);
				object = methodNextColumn.invoke(mObject, args);
			}
			else if (pMethod.compareTo(CALCTOTALLINES) == 0)
			{
				if (methodCalculateTotalLines == null)
					return new Boolean(false);
				object = methodCalculateTotalLines.invoke(mObject, args);
			}
			else if (pMethod.compareTo(ADDLINEVALIDATION) == 0)
			{
				if (methodValidationForAddLine == null)
					return new Boolean(true);
				object = methodValidationForAddLine.invoke(mObject, args);
			}
			else if (pMethod.compareTo(DELLINEVALIDATION) == 0)
			{
				if (methodValidationForDelLine == null)
					return new Boolean(true);
				object = methodValidationForDelLine.invoke(mObject, args);
			}			
			else if (pMethod.compareTo(INSERT) == 0)
			{
				if (methodValidationInsert == null)
					return new Boolean(true);
				object = methodValidationInsert.invoke(mObject, args);
			}
			else if (pMethod.compareTo(HOME) == 0)
			{
				if (methodValidationHome == null)
					return new Boolean(true);
				object = methodValidationHome.invoke(mObject, args);				
			}
			else if (pMethod.equals(SHOWEXCEPTION))
			{
				if (methodShowException == null)
					return new Boolean(false);
				object = methodShowException.invoke(mObject, args);
			}
			else 
			{
				System.out.println("metodo no deployado "+pMethod);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			//return object;
		}		
		return object;
	}
	
	//public void keyReleased(KeyEvent e)
	//{
	//	System.out.println("released");
	//}
	// este metodo se ejecuta antes del cambio de valor en el objeto.
	public void keyPressed(KeyEvent e) { 
		int key = e.getKeyCode();
		List selection = view.getSelectedRowObjects();
		RowBase row = null;
		if (selection.size() > 0)
		{
			row =  (RowBase) selection.get(0);			        		
			if ( row != null && row.IsChanged() )
			{				
				invokeMethod(CALCTOTALLINES, null);
				row.setIsChanged(false);
			}
			else
			{				
				if (row != null && row.getM_processMsg() != null )
				{
					invokeMethod(SHOWEXCEPTION, new Object[] {row});
//					if (m_showdialoginfo)
//						ADialog.error(m_WindowNo, null, "PosError", Msg.getMsg(Env.getCtx(),row.getM_processMsg()));
//					row.setM_processMsg(null);
				}
			}			        		
		}			        	
		SelectedColumn = view.getSelectedColumn();
		SelectedRow = view.getSelectedRow();
		if ( key == KeyEvent.VK_F11)
			return;
		if ( key == KeyEvent.VK_F5)
			return;
		if ( key == 118 )  // F7
			return;
 		if ( key == 120 ) // F9
			return;
		if ( key == 123 ) // F12
			return;
		if ( key == 109 )
			key = KeyEvent.VK_MINUS;
//		if ( key == 73 && KeyEvent.VK_ALT )
//		{
//			
//		}
		if ( key == KeyEvent.VK_NUMPAD0)
			key = KeyEvent.VK_0;
		else if ( key == KeyEvent.VK_NUMPAD1)
			key = KeyEvent.VK_1;			        	
		else if ( key == KeyEvent.VK_NUMPAD2)
			key = KeyEvent.VK_2;
		else if ( key == KeyEvent.VK_NUMPAD3)
			key = KeyEvent.VK_3;
		else if ( key == KeyEvent.VK_NUMPAD4)
			key = KeyEvent.VK_4;
		else if ( key == KeyEvent.VK_NUMPAD5)
			key = KeyEvent.VK_5;
		else if ( key == KeyEvent.VK_NUMPAD6)
			key = KeyEvent.VK_6;
		else if ( key == KeyEvent.VK_NUMPAD7)
			key = KeyEvent.VK_7;
		else if ( key == KeyEvent.VK_NUMPAD8)
			key = KeyEvent.VK_8;
		else if ( key == KeyEvent.VK_NUMPAD9)
			key = KeyEvent.VK_9;
		else if ( key == KeyEvent.VK_SHIFT )
		{
			_shift = true;
			return;
		}
		else if ( key == KeyEvent.VK_ESCAPE	|| key == KeyEvent.VK_LEFT 
				|| key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_UP 
				|| key == KeyEvent.VK_DOWN )
		{
			super.keyPressed(e);
			return;        			
		}
		String strKey = new Character((char) key).toString();
		if (key == KeyEvent.VK_5 && _shift)
			strKey = "%";
		if (_shift)
			_shift = false;
		if ( key == KeyEvent.VK_BACK_SPACE )
		{
			if ( textToFind != null && textToFind.length() > 0 )
				textToFind = textToFind.substring(0, textToFind.length()-1);			        	
		}					  
		else if ( key == KeyEvent.VK_DELETE)
		{
			if ( ADialog.ask(m_WindowNo, m_Frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
			{
				if ((Boolean) invokeMethod(DELLINEVALIDATION, null))
				{
					invokeMethod(CALCTOTALLINES, null);
					if (view.getRowCount()==0)
						invokeMethod(NEWLINE, new Object[] {row});
				}
			}
			textToFind = "";               		
		}
		else if ( key == KeyEvent.VK_INSERT && SelectedColumn == mIsKey)
    	{
    		invokeMethod(INSERT, null);
    		return;
    	}
		else if ( key == KeyEvent.VK_HOME && SelectedColumn == mIsKey)
    	{
			invokeMethod(HOME, null);
    		return;
    	}			        			
		else if ( key == KeyEvent.VK_ENTER && SelectedColumn == mIsKey )
		{
			//if ( row != null && row.getM_Product_ID() == 0 )
			if ( row != null  )
			{
				if ( view.getCellEditor() != null )
					view.getCellEditor().stopCellEditing();				            	
				checkChanged(selection, row);
				if (textToFind.length() == 0 && SelectedColumn != mNextLine)					
				{
					ADialog.info(m_WindowNo, e.getComponent().getParent(), "QueryEnterNow");						
					return;
				}
				else if ( textToFind.length() != 0 )
				{
					//if (IsPriceListOk())
					if ((Boolean) invokeMethod(ADDLINEVALIDATION, null))
					{
						Object[] params = new Object[] {true, null, QtyByDefault, 0, 0, null, 0, false};
						//AddProduct(true, null, QtyByDefault, 0, 0, null, 0, false);
						invokeMethod(ADDLINE, params);
						if (textToFind != null)
							textToFind = "";		
						selection = view.getSelectedRowObjects();
						row =  (RowBase) selection.get(0);
					}
				}
			}
		}
		else if ( key == KeyEvent.VK_ENTER && SelectedColumn == mNextLine )
		{			        
			if ( view.getCellEditor() != null )
				view.getCellEditor().stopCellEditing();
			checkChanged(selection, row);
			//if (SelectedRow == view.getDataModel().getRowCount()-1 && row.IsAttributeOK()) //&& row.getM_processMsg() == null)
			if (SelectedRow == view.getDataModel().getRowCount()-1) //&& row.getM_processMsg() == null)
				//NewLine(row);
				invokeMethod(NEWLINE, new Object[] {row});
			else
				invokeMethod(NEXTCOLUMN, null);
				//nextcolumn();
		}		
		else if ( key == KeyEvent.VK_ENTER && SelectedColumn == mIsDescription)
		{
			//if ( row != null && row.getM_Product_ID() == 0 )
			if ( row != null )
			{
				if ( view.getCellEditor() != null )
					view.getCellEditor().stopCellEditing();				            	
				checkChanged(selection, row);
				if (textToFind.length() == 0 )					
				{
					ADialog.info(m_WindowNo, e.getComponent().getParent(), "QueryEnterNow");						
					return;
				}
				//if (IsPriceListOk())
				if ((Boolean) invokeMethod(ADDLINEVALIDATION, null))
				{
					Object[] params = new Object[] {false, null, QtyByDefault, 0, 0, null, 0, false};
					//AddProduct(false, null, QtyByDefault, 0, 0, null, 0, false);
					invokeMethod(ADDLINE, params);
						if (textToFind != null)
							textToFind = "";
					selection = view.getSelectedRowObjects();
					row =  (RowBase) selection.get(0);						
				}
			}
			else
				invokeMethod(NEXTCOLUMN, null);
				//nextcolumn();
		}
		else if (SelectedColumn == mIsDescription || SelectedColumn == mIsKey)
		{
			if (textToFind != null)
				textToFind = textToFind + strKey;
		}
		else if ( key == KeyEvent.VK_ENTER)
		{
			if ( view.getCellEditor() != null )
				view.getCellEditor().stopCellEditing();
			//calculateTotalLines();
			checkChanged(selection, row);
			//nextcolumn();
			invokeMethod(NEXTCOLUMN, null);
		}		
		if ( key == KeyEvent.VK_ENTER && SelectedColumn == 0 )
		{
			if ( view.getCellEditor() != null )
				view.getCellEditor().stopCellEditing();			        		
			checkChanged(selection, row);
			ObjectViewModel pos = view.getDataModel();			        					        	
			if (pos.getRowCount()-1 == SelectedRow )
			{
				if (row != null)
					invokeMethod(NEWLINE, new Object[] {row});
					//NewLine(row);	
					
			}	
			else
				//nextcolumn();
				invokeMethod(NEXTCOLUMN, null);
		}			        			
		if (infosearch != null && textToFind != null)
			infosearch.setText(textToFind);
		// 
	}				  

	private void checkChanged(List selection, RowBase row) {
        if (selection.size() > 0)
        {
            row = (RowBase) selection.get(0);			        		
            if ( row.IsChanged() )
            {
            	invokeMethod(CALCTOTALLINES, null);
            	row.setIsChanged(false);
            }
            else
            {
            	if (row.getM_processMsg() != null )
            	{            		
            		invokeMethod(SHOWEXCEPTION, new Object[] {row});
            	}
            }			        		
        }			        				        							
	}	
}
