package org.xendra.objectview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;

import javax.swing.AbstractCellEditor;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


//import org.apache.xpath.XPathAPI;
import org.compiere.apps.graph.GraphUtil;
import org.compiere.grid.ed.VCellRenderer;
import org.compiere.grid.ed.VDynamicListDialog;
import org.compiere.grid.ed.VEditor;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VPAttributeDialog;
import org.compiere.model.GridField;
import org.compiere.model.ChildLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MAttributeSet;
import org.compiere.model.MColumn;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPAttributeLookup;
import org.compiere.model.MProduct;
import org.compiere.swing.CButton;
import org.compiere.swing.CMenuItem;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.RowBase;
import org.xendra.plaf.XendraPLAF;

/**
 * The table view main class
 *
 * @author Stphane Brunner, Last modified by: $Author: stbrunner $ 
 * @version $Revision: 1.21 $ $Date: 2007/06/16 15:18:06 $.
 * Revision history:
 * $Log: TableView.java,v $
 *
 */
public class ObjectView extends JTable {
    public interface IRowSelectCaller
    {
        void action();
    }
    
    private IObjetViewColumn mCurrentCollumn;
    private Point mLastMouseClickedPosition;

    //private JDialog mDialogSearch;
    //  private JLabel mLabelSearchTest = new JLabel();
    //private JTextField mTextFieldSearchTest = new JTextField();
    //private JPopupMenu mPopupMenu = new JPopupMenu();
    //private JDialog mDialogVisiblity;
    //private JMenuItem mMenuItemHide = new JMenuItem();
    //private JMenuItem mMenuItemSearch = new JMenuItem();
    //private JMenuItem mMenuItemVisiblityProperties = new JMenuItem();
    //private JMenuItem mMenuSave = new JMenuItem();
    //private JButton mButtonVisiblityOK = new JButton();
    //private JRadioButtonMenuItem mRadioButtonMenuItemAutoResizeColumnAll = new JRadioButtonMenuItem();
    //private JRadioButtonMenuItem mRadioButtonMenuItemAutoResizeColumnNext = new JRadioButtonMenuItem();
    //private JRadioButtonMenuItem mRadioButtonMenuItemAutoResizeColumnNone = new JRadioButtonMenuItem();
    //private ButtonGroup mButtonGroupAutoResizeColumn = new ButtonGroup();
    private ResourceBundle mRessource = ResourceBundle.getBundle(getClass().getName());
    private GridLayout mGridLayout = new GridLayout();
    private String mFileName;    
    Thread m_threadProduct = null;

    private IRowSelectCaller mRowSelectCaller=null;
	//private String mTextDescription;
    private static final String CALCTOTALLINES = "calctotallines";
    private Method methodCalculateTotalLines;
    private Object mObject;
	private int pgfh = 0;
    
    protected void paintComponent(Graphics g) {
    	if (pgfh  == 0)
    	{
    		FontMetrics metrics = g.getFontMetrics(getFont());
    		pgfh = metrics.getHeight();    		
    		setRowHeight(pgfh);
    	}    	
    	super.paintComponent(g);
    }	

    
	public void setContext(Object pContainer) {
		mObject = pContainer;
	}
	
	public Object getContext() {
		return mObject;
	}
	
	public void funcCalculateTotalLines(String pCalculateTotalLines) 	{	initializeMethod(CALCTOTALLINES, pCalculateTotalLines); 			}
	private void initializeMethod(String pMethod,String functionname)
	{
		if (functionname == null || functionname.length() == 0)
			return;
		
		try {		
			if (pMethod.compareTo(CALCTOTALLINES) == 0)
			{
				methodCalculateTotalLines = mObject.getClass().getMethod(functionname, null);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}		
	}
    
	private Object invokeMethod(String pMethod, Object[] args)
	{
		Object object = null;
		if (pMethod.length() == 0)
			return object;
		try {
			if (pMethod.compareTo(CALCTOTALLINES) == 0)
			{
				if (methodCalculateTotalLines == null)
					return null;
				object = methodCalculateTotalLines.invoke(mObject, args);
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
	
    // agregamos este metodo para hacer un trigger en caso de actualizacion.
	public void setValueAt(Object aValue, int row, int col)
	{
		super.setValueAt(aValue, row, col);		
		RowBase adapter = (RowBase) ((ObjectViewAdapter) super.getModel()).getNewRow(row);
		// si se cambio algun valor , efectuamos refresh.
		if (adapter != null && adapter.IsChanged())
		{
			invokeMethod(CALCTOTALLINES, null);
			repaint();
		}
	}   //  setValueAt
    
    /**
     * Set a new callback of row select.
     * @param pRowSelectCaller the callback
     */
    public void setRowSelectCaller(IRowSelectCaller pRowSelectCaller)
    {
        mRowSelectCaller=pRowSelectCaller;
    }
    
    
    public void dispose()
    {
        ObjectViewAdapter adapter = (ObjectViewAdapter) super.getModel();
        IObjetViewColumn[] columns = adapter.getModel().getColumns();
        for (int j = 0; j < columns.length; j++) {
            TableColumn viewColumn = getColumnModel().getColumn(j);
            if (viewColumn.getCellEditor() instanceof AttributeEditor )
            {
            	AttributeEditor ae = (AttributeEditor) viewColumn.getCellEditor();
            	if (ae != null)
            		ae.dispose();
            }
        }
    }

    /**
     * Construct.
     * @param pOwner the owner frame to set the dialogues modal.
     * @param pModel the model
     * @deprecated pOwner unsued
     */
    public ObjectView(JFrame pOwner, ObjectViewModel pModel) {
        this(pModel);
    }

    /**
     * Construct.
     */
    public ObjectView() {
        this(new DefaultObjectViewModel());
    }

    /**
     * Construct.
     * @param pModel the model
     */
    public ObjectView(ObjectViewModel pModel) {
        super(getModel(pModel));        
//        getTableHeader().setDefaultRenderer(new ObjectHeaderRenderer());
//        getTableHeader().addMouseListener(new TableMouseListener());   
        setIntercellSpacing(new Dimension(5, 10));
        setRowMargin(4);
        // disable the default behavior to response to the keyboard cowboy usage
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),"KEYENTER");
		getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),	"KEYENTER");        
    }
    
    public boolean isFocusCycleRoot() {
    	return isEditing();
    }

//    /**
//     * Set Visible for menu save.
//     * @param pVisible
//     */
//    public void setVisibleMenuSave(boolean pVisible)
//    {
//	mMenuSave.setVisible(pVisible);
//	mPopupMenu.getComponent(3).setVisible(pVisible);
//    }

//    /**
//     * Set Visible for menu AutoResizeColumn.
//     * @param pVisible
//     */
//    public void setVisibleAutoResizeColumn(boolean pVisible)
//    {
//    	mRadioButtonMenuItemAutoResizeColumnAll.setVisible(pVisible);
//    	mRadioButtonMenuItemAutoResizeColumnNext.setVisible(pVisible);
//    	mRadioButtonMenuItemAutoResizeColumnNone.setVisible(pVisible);
//	mPopupMenu.getComponent(7).setVisible(pVisible);
//    }

 

    /**
     * Contruct adapter from table viw model.
     * @param pModel the table view model to be adapted
     * @return the adapter
     */
    private static ObjectViewAdapter getModel(ObjectViewModel pModel) {
        if (pModel != null) {
            return new ObjectViewAdapter(pModel);
        }
        return null;
    }

    /**
     * Set a new table view model.
     * @param pModel the new model
     */
    public void setModel(ObjectViewModel pModel) {
        super.setModel(getModel(pModel));
    }

    /**
     * Select a new row.
     * @param pRow the row Object
     */
    public void addRowSelection(Object pRow) {
        addRowSelection(pRow, false);
    }

    /**
     * Select a new row.
     * @param pRow the row Object
     * @param pScroll scroll to the new row ?
     */
    public void addRowSelection(Object pRow, boolean pScroll) {
        int index = ((ObjectViewAdapter) super.getModel()).indexOf(pRow);
        addRowSelectionInterval(index, index);
        scrollRectToVisible(this.getCellRect(index, index, true));
    }

    /**
     * Select new rows.
     * @param pRows the rows Objects
     */
    public void addRowSelection(Object[] pRows) {
        for (int i = 0; i < pRows.length; i++) {
            addRowSelection(pRows[i]);
        }
    }

    /**
     * Select new rows.
     * @param pRows the rows Objects
     */
    public void addRowSelection(List pRows) {
        for (Iterator i = pRows.iterator(); i.hasNext();) {
            try {
                addRowSelection(i.next());
            }
            catch (Exception e) {
            }
        }
    }

    public List<IRow> getRows() {
    	List<IRow> result = new ArrayList<IRow>(getRowCount());
    	ObjectViewModel model = getDataModel();
    	for (int j=0; j <  getRowCount() ; j++) {
    		result.add((IRow) model.getRowObject(j));
    	}
        return result;
    }
    /**
     * Auto size the column to fit with his content.
     * @param pColumnIndex visible column index (not table model index)
     */
    public void autoSizeColumn(int pColumnIndex) {
        int width = 0;
        TableColumn column = getColumnModel().getColumn(pColumnIndex);

        for (int i = 0; i < getRowCount(); i++) {
            TableModel model = super.getModel();

            width = Math.max(width,
                    getCellRenderer(i, pColumnIndex).getTableCellRendererComponent(this,
                            model.getValueAt(i, column.getModelIndex()), false, false, i, column.getModelIndex()).getPreferredSize().width + 1);
        }
        sizeColumnsToFit(pColumnIndex, width);
    }

    /**
     * affect ideal column size.
     */
    public void idealColumnSize() 
    {
        for(int colidx=0;colidx<getColumnCount();colidx++)
        {
            TableColumn column = getColumnModel().getColumn(colidx);
            column.setResizable(true);

            int width = column.getMinWidth();
            width = Math.max(width,column.getPreferredWidth());
            for (int rowidx = 0; rowidx < getRowCount(); rowidx++)
            {
                TableModel model = super.getModel();
                width = Math.max(width,getCellRenderer(rowidx, colidx).getTableCellRendererComponent(this, model.getValueAt(rowidx, column.getModelIndex()), false, false, rowidx, column.getModelIndex()).getPreferredSize().width + 1);
            }
            column.setPreferredWidth(width);
        }
    }

    /**
     * Set a column size.
     * @param pColumnIndex visible column index (not table model index)
     * @param pWidth column width
     */
    public void sizeColumnsToFit(int pColumnIndex, int pWidth) {
        TableColumn column = getColumnModel().getColumn(pColumnIndex);

        for (int i = 0; i < getColumnCount(); i++) {
            TableColumn tableColumn = getColumnModel().getColumn(i);
            tableColumn.setPreferredWidth(tableColumn.getWidth());
        }

        pWidth = Math.max(pWidth, column.getMinWidth());
        int diff = column.getWidth() - pWidth;
        column.setPreferredWidth(pWidth);

        // Use the mode to determine how to absorb the changes.
        switch (autoResizeMode) {
            case AUTO_RESIZE_NEXT_COLUMN :
                TableColumn newTableColumn = getColumnModel().getColumn(Math.min(pColumnIndex + 1, getColumnCount() - 1));
                newTableColumn = column == newTableColumn && getColumnCount() > 1 ? getColumnModel().getColumn(
                        getColumnCount() - 2) : newTableColumn;
                // last column ?
                newTableColumn.setPreferredWidth(newTableColumn.getPreferredWidth() + diff);
                break;

            case AUTO_RESIZE_SUBSEQUENT_COLUMNS :
                int cont = getColumnCount() - pColumnIndex;
                if (cont == 1 && getColumnCount() > 1) {
                    // last column
                    column = getColumnModel().getColumn(pColumnIndex - 1);
                    column.setPreferredWidth(column.getPreferredWidth() + diff);
                    break;
                }
                int coldiff = diff / (cont - 1);
                int colrest = diff % (cont - 1);

                for (int i = pColumnIndex + 1; i < getColumnCount(); i++) {
                    column = getColumnModel().getColumn(i);
                    column.setPreferredWidth(column.getPreferredWidth() + coldiff + (colrest > 0 ? 1 : 0));
                    colrest--;
                }
                break;

            case AUTO_RESIZE_LAST_COLUMN :
                column = getColumnModel().getColumn(getColumnCount() - 1);
                column.setPreferredWidth(column.getPreferredWidth() + diff);
                break;

            case AUTO_RESIZE_ALL_COLUMNS :
                coldiff = diff / (getColumnCount() - 1);
                colrest = diff % (getColumnCount() - 1);

                for (int i = 0; i < getColumnCount(); i++) {
                    if (i != pColumnIndex) {
                        column = getColumnModel().getColumn(i);
                        column.setPreferredWidth(column.getPreferredWidth() + coldiff + (colrest > 0 ? 1 : 0));
                        colrest--;
                    }
                }
                break;
        }
    }

    /**
     * Get the selection.
     * @return the row Object to be selected
     */
    public Object getSelectedRowObject() {
        return ((ObjectViewAdapter) super.getModel()).getNewRow(super.getSelectedRow());
    }

    /**
     * Get the selections.
     * @return list of Objects to be selected
     */
    public List getSelectedRowObjects() {
        int[] visibelSelectedRows = super.getSelectedRows();
        List result = new ArrayList(visibelSelectedRows.length);
        ObjectViewAdapter model = (ObjectViewAdapter) super.getModel();
        for (int i = 0; i < visibelSelectedRows.length; i++) {
            result.add(model.getNewRow(visibelSelectedRows[i]));
        }
        return result;
    }

    /**
     * @deprecated use getSelectedRowObject()
     * @return the selected row
     */
    public int getSelectedRow() {
        return super.getSelectedRow();
    }

    /**
     * @deprecated use getSelectedRowObjects()
     * @return the delected rows 
     */
    public int[] getSelectedRows() {
        return super.getSelectedRows();
    }

//    /**
//     * Init the Menu
//     */
//    private void initMenu() {
//        mRadioButtonMenuItemAutoResizeColumnNext.setSelected(true);
//        mButtonGroupAutoResizeColumn.add(mRadioButtonMenuItemAutoResizeColumnAll);
//        mButtonGroupAutoResizeColumn.add(mRadioButtonMenuItemAutoResizeColumnNext);
//        mButtonGroupAutoResizeColumn.add(mRadioButtonMenuItemAutoResizeColumnNone);
//        setAutoResizeMode(AUTO_RESIZE_NEXT_COLUMN);
//
//        mMenuItemHide.setText(mRessource.getString("menu.hide"));
//        mMenuItemHide.addActionListener(new ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                menuItemHideActionPerformed(pEvent);
//            }
//
//        });
//
//        mMenuItemSearch.setText(mRessource.getString("menu.search"));
//        mMenuItemSearch.addActionListener(new ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                menuItemSearchActionPerformed(pEvent);
//            }
//        });
//
//        mMenuItemVisiblityProperties.setText(mRessource.getString("menu.visiblepro"));
//        mMenuItemVisiblityProperties.addActionListener(new ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                menuItemVisiblityPropertiesActionPerformed(pEvent);
//            }
//        });
//
//        mPopupMenu.setInvoker(this);
//
//        mRadioButtonMenuItemAutoResizeColumnAll.setText(mRessource.getString("menu.autosizeall"));
//        mRadioButtonMenuItemAutoResizeColumnAll.addActionListener(new java.awt.event.ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                radioButtonMenuItemAutoResizeColumnAllActionPerformed(pEvent);
//            }
//        });
//
//        mRadioButtonMenuItemAutoResizeColumnNext.setText(mRessource.getString("menu.autosizenext"));
//        mRadioButtonMenuItemAutoResizeColumnNext.addActionListener(new java.awt.event.ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                radioButtonMenuItemAutoResizeColumnNextActionPerformed(pEvent);
//            }
//        });
//
//        mRadioButtonMenuItemAutoResizeColumnNone.setText(mRessource.getString("menu.autosizenone"));
//        mRadioButtonMenuItemAutoResizeColumnNone.addActionListener(new java.awt.event.ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                radioButtonMenuItemAutoResizeColumnNoneActionPerformed(pEvent);
//            }
//
//        });
//
//        mMenuSave.setText(mRessource.getString("menu.save"));
//        mMenuSave.addActionListener(new ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                menuSaveActionPerformed(pEvent);
//            }
//
//        });
//
//        mPopupMenu.add(mMenuItemHide);
//        mPopupMenu.add(mMenuItemSearch);
//        mPopupMenu.add(mMenuItemVisiblityProperties);
//        mPopupMenu.addSeparator();
//        mPopupMenu.add(mRadioButtonMenuItemAutoResizeColumnAll);
//        mPopupMenu.add(mRadioButtonMenuItemAutoResizeColumnNext);
//        mPopupMenu.add(mRadioButtonMenuItemAutoResizeColumnNone);
//        mPopupMenu.addSeparator();
//        mPopupMenu.add(mMenuSave);
//    }
    /**
     * Is the index made.
     * @return boolean true if the indes is made
     */
    public boolean isMakeIndex() {
        return ((ObjectViewAdapter) super.getModel()).isMakeIndex();
    }

    /**
     * Sets the indes is made
     * @param pMakeIndex the value
     */
    public void setMakeIndex(boolean pMakeIndex) {
        ((ObjectViewAdapter) super.getModel()).setMakeIndex(pMakeIndex);
    }

    /**
     * Gets the model
     * @return the model
     */
    public ObjectViewModel getDataModel() {
        return ((ObjectViewAdapter) super.getModel()).getModel();
    }

    /**
     * @deprecated use getDataModel()
     * @return the model
     */
    public TableModel getModel() {
        return super.getModel();
    }

    /**
     * Gets the selected column
     * @return the selected column
     */
    /*  public TableViewColumn getSelectedColumnObject()  {
     return ((TableViewAdapter)super.getModel()).getColumn(getSelectedColumn());
     }*/

    /**
     * Gets the selected column
     * @return the selected column
     */
    public IObjetViewColumn getSelectedColumnObject() {
        return ((ObjectViewAdapter) super.getModel()).getColumn(getColumnModel().getColumn(super.getSelectedColumn()).getModelIndex());

    }

    /**
     * Gets the selected columns
     * @return the selected columns
     */
    public List getSelectedColumnObjects() {
        List result = new ArrayList();
        int[] indexies = super.getSelectedColumns();
        for (int i = 0; i < indexies.length; i++) {
            result.add(((ObjectViewAdapter) super.getModel()).getColumn(indexies[i]));
        }
        return result;
    }

    /**
     * @deprecated use getSelectedColumnObject()
     * @return the selected column
     */
    public int getSelectedColumn() {
        return super.getSelectedColumn();
    }

    /**
     * @deprecated use getSelectedColumnObjects()
     * @return the delected columns
     */
    public int[] getSelectedColumns() {
        return super.getSelectedColumns();
    }

//    /**
//     * Search
//     * @param pEvent the event
//     */
//    private void buttonSearchActionPerformed(ActionEvent pEvent) {
//        ObjectViewAdapter adapter = (ObjectViewAdapter) super.getModel();
//        List selection = getSelectedRowObjects();
//        if ("".equals(mTextFieldSearchTest.getText())) {
//            adapter.search(mCurrentCollumn, null);
//        }
//        else {
//            adapter.search(mCurrentCollumn, mTextFieldSearchTest.getText());
//        }
//        for (Iterator i = selection.iterator(); i.hasNext();) {
//            addRowSelection(i.next(), true);
//        }
//        if (getSelectedRowObjects().size() == 0 && super.getModel().getRowCount() > 0) {
//            addRowSelectionInterval(0, 0);
//            scrollRectToVisible(this.getCellRect(0, 0, true));
//        }
//
//        getTableHeader().repaint();
//        mDialogSearch.setVisible(false);
//        if (mRowSelectCaller!=null)
//        	mRowSelectCaller.action();
//    }

//    /**
//     * Hide column.
//     * @param pEvent the event
//     */
//    private void menuItemHideActionPerformed(ActionEvent pEvent) {
//        mMenuItemHide.setEnabled(((ObjectViewAdapter) super.getModel()).setVisible(mCurrentCollumn, false));
//        if (mRowSelectCaller!=null)
//        	mRowSelectCaller.action();
//    }
//
//    /**
//     * Search.
//     * @param pEvent the event
//     */
//    private void menuItemSearchActionPerformed(ActionEvent pEvent) {
//        mTextFieldSearchTest.setText(((ObjectViewAdapter) super.getModel()).getSearchText(mCurrentCollumn));
//        mTextFieldSearchTest.selectAll();
//
//        if (mDialogSearch == null) {
//            initDialogSearch();
//        }
//
//        mDialogSearch.pack();
//        mDialogSearch.setLocation(mLastMouseClickedPosition);
//        mDialogSearch.setVisible(true);
//    }

//    /**
//     * Show visible properties panel.
//     * @param pEvent the event
//     */
//    private void menuItemVisiblityPropertiesActionPerformed(ActionEvent pEvent) {
//        final ObjectViewAdapter modelAdapter = (ObjectViewAdapter) super.getModel();
//        IObjetViewColumn[] columns = modelAdapter.getModel().getColumns();
//
//        if (mDialogVisiblity == null) {
//            initDialogVisiblity();
//        }
//
//        mDialogVisiblity.getContentPane().removeAll();
//        mGridLayout.setRows(columns.length + 1);
//
//        for (int i = 0; i < columns.length; i++) {
//            final IObjetViewColumn column = columns[i];
//            final JCheckBox checkBoxColumn = new JCheckBox(column.getName());
//            checkBoxColumn.setSelected(modelAdapter.isVisible(columns[i]));
//            mDialogVisiblity.getContentPane().add(checkBoxColumn, null);
//
//            checkBoxColumn.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent pEvent) {
//                    mMenuItemHide.setEnabled(modelAdapter.setVisible(column, checkBoxColumn.isSelected()));
//                    if (mRowSelectCaller!=null)
//                        mRowSelectCaller.action();
//                }
//
//            });
//        }
//
//        mDialogVisiblity.getContentPane().add(mButtonVisiblityOK, null);
//        mDialogVisiblity.pack();
//        mDialogVisiblity.setLocation(mLastMouseClickedPosition);
//        mDialogVisiblity.setVisible(true);
//    }

//    /**
//     * Hide visible properties panel.
//     * @param pEvent the event
//     */
//    private void buttonVisiblityOKActionPerformed(ActionEvent pEvent) {
//        mDialogVisiblity.setVisible(false);
//        if (mRowSelectCaller!=null)
//            mRowSelectCaller.action();
//    }

    /**
     * Change auto-risize mode.
     * @param pEvent the event
     */
    private void radioButtonMenuItemAutoResizeColumnNoneActionPerformed(ActionEvent pEvent) {
        setAutoResizeMode(AUTO_RESIZE_OFF);
    }

    /**
     * Change auto-risize mode.
     * @param pEvent the event
     */
    private void radioButtonMenuItemAutoResizeColumnNextActionPerformed(ActionEvent pEvent) {
        setAutoResizeMode(AUTO_RESIZE_NEXT_COLUMN);
    }

    /**
     * Change auto-risize mode.
     * @param pEvent the event
     */
    private void radioButtonMenuItemAutoResizeColumnAllActionPerformed(ActionEvent pEvent) {
        setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
    }

    /**
     * Save settings.
     * @param pEvent the event
     */
    private void menuSaveActionPerformed(ActionEvent pEvent) {
    	//String filename = getFileName();
//    	if ( getFileName().length() > 0 )
//    		saveSettings(getFileName());
        //if (mFileName == null) {
        //    mFileName = JOptionPane.showInputDialog(null, mRessource.getString("input.message"), 
        //            mRessource.getString("input.header"), JOptionPane.QUESTION_MESSAGE);
        //}
        //if (mFileName.length() > 0) {
        //    saveSettings(mFileName);
        //}
    }

    public String getFileName()
    {
        if (mFileName == null) {
            mFileName = JOptionPane.showInputDialog(null, mRessource.getString("input.message"), 
                    mRessource.getString("input.header"), JOptionPane.QUESTION_MESSAGE);
        }    	
        if (mFileName != null && mFileName.length() > 0) {
        	return mFileName;
        }
        return "";
    }
    
    public void setFileName(String filename)
    {
    	mFileName = filename; 
//        if (mFileName == null) {
//            mFileName = JOptionPane.showInputDialog(null, mRessource.getString("input.message"), 
//                    mRessource.getString("input.header"), JOptionPane.QUESTION_MESSAGE);
//        }    	
//        if (mFileName != null && mFileName.length() > 0) {
//        	return mFileName;
//        }
//        return "";
    }

    
    /**
     * @return the frame this table is embedded in
     */
    private JFrame getFrame() {
        Container parent = getParent();
        while (!(parent instanceof JFrame)) {
            parent = parent.getParent();
        }
        return (JFrame) parent;
    }

//    /**
//     * init the search dialog
//     */
//    private void initDialogSearch() {
//        mDialogSearch = new JDialog(getFrame());
//
//        mDialogSearch.setVisible(false);
//        mDialogSearch.setTitle(mRessource.getString("search.title"));
//        mDialogSearch.setResizable(false);
//        mDialogSearch.setModal(true);
//
//        Container contentPane = mDialogSearch.getContentPane();
//
//        contentPane.setLayout(new GridBagLayout());
//
//        // creating label
//        JLabel jLabelSearchTest = new JLabel();
//        jLabelSearchTest.setText(mRessource.getString("search.text"));
//        contentPane.add(jLabelSearchTest, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
//                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
//
//        // creating JTextField jTextFieldSearchTest
//        mTextFieldSearchTest.setMinimumSize(new Dimension(100, 21));
//        mTextFieldSearchTest.setPreferredSize(new Dimension(100, 21));
//        contentPane.add(mTextFieldSearchTest, new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
//                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
//
//        // creating Search Button
//        JButton jButtonSearch = new JButton();
//        mDialogSearch.getRootPane().setDefaultButton(jButtonSearch);
//        jButtonSearch.setText(mRessource.getString("search.btn"));
//        jButtonSearch.addActionListener(new ActionListener() {
//            /**
//             * @param pEvent the event
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                buttonSearchActionPerformed(pEvent);
//            }
//
//        });
//        contentPane.add(jButtonSearch, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER,
//                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
//    }

//    /**
//     * Init the dialogue visibility.
//     */
//    private void initDialogVisiblity() {
//        mDialogVisiblity = new javax.swing.JDialog(getFrame());
//
//        mGridLayout.setColumns(1);
//        mDialogVisiblity.setModal(true);
//        mDialogVisiblity.getContentPane().setLayout(mGridLayout);
//        mDialogVisiblity.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
//        mDialogVisiblity.setResizable(false);
//
//        mDialogVisiblity.setTitle(mRessource.getString("visible.title"));
//
//        mButtonVisiblityOK.setText(mRessource.getString("btn.ok"));
//        mButtonVisiblityOK.addActionListener(new ActionListener() {
//            /**
//             * @param pEvent
//             */
//            public void actionPerformed(ActionEvent pEvent) {
//                buttonVisiblityOKActionPerformed(pEvent);
//            }
//        });
//    }

    /*  public void smartScrollToSelectedRow() {
     Component parent = getParent();
     System.out.println("parent = " + parent);
     if (parent instanceof JScrollPane) {
     JViewport viewport = ((JScrollPane)parent).getViewport();
     //viewport.getViewRect();
     System.out.println("ViewRect = " + viewport.getViewRect());
     viewport.setViewPosition(getCellRect(super.getSelectedRow(), 0, true).getLocation());
     
     }
     if (parent instanceof JViewport) {
     JViewport viewport = (JViewport)parent;
     System.out.println("ViewRect = " + viewport.getViewRect());
     viewport.setViewPosition(getCellRect(super.getSelectedRow(), 0, true).getLocation());
     
     }
     }*/
    /**
     * Sets the scroll to the selection.
     */
    protected void scrollToSelection() {
        if (super.getSelectedRow() != -1) {
            Rectangle rect = getVisibleRect();
            Rectangle cRect = getCellRect(super.getSelectedRow(), 0, true);

            rect.y = cRect.y;
            rect.height = cRect.height;
            scrollRectToVisible(rect);
        }
    }
    
    /**
     * The mouse listener
     * @author sbrunner
     * Create on 28 déc. 2009
     */
    class TableMouseListener extends MouseAdapter {
        /**
         * Invoked when the mouse button has been clicked (pressed and released) on a component.
         * @param pEvent the event
         */    	
        public void mouseClicked(MouseEvent pEvent) {
            mLastMouseClickedPosition = pEvent.getPoint();
            Point p = pEvent.getComponent().getLocationOnScreen();
            mLastMouseClickedPosition.x += p.getX();
            mLastMouseClickedPosition.y += p.getY();
            ObjectViewAdapter adapter = (ObjectViewAdapter) ObjectView.super.getModel();
            mCurrentCollumn = adapter.getColumn(getColumnModel().getColumn(columnAtPoint(pEvent.getPoint())).getModelIndex());
            if (pEvent.getComponent().getCursor().getType() == Cursor.E_RESIZE_CURSOR) {
                if (pEvent.getClickCount() == 2) {
                    TableColumnModel model = getColumnModel();
                    JTableHeader header = getTableHeader();
                    int columnIndex = -1;
                    int length = Integer.MAX_VALUE;

                    for (int i = 0; i < model.getColumnCount(); i++) {
                        Rectangle rect = header.getHeaderRect(i);
                        int newLength = Math.abs(rect.x + rect.width - pEvent.getX());
                        if (newLength < length) {
                            columnIndex = i;
                            length = newLength;
                        }
                    }

                    autoSizeColumn(columnIndex);
                }
            }
            else if (pEvent.isMetaDown()) {
//                mMenuItemSearch.setEnabled(mCurrentCollumn.isSearchable());
//                mPopupMenu.pack();
//                mPopupMenu.setLocation(mLastMouseClickedPosition);
//                mPopupMenu.setVisible(true);
            }
            else if (pEvent.isControlDown() && mCurrentCollumn.isSearchable()) {
                //menuItemSearchActionPerformed(null);
            }
            else if (mCurrentCollumn != null && mCurrentCollumn.isSortable()) {
                List selection = getSelectedRowObjects();
                adapter.sort(mCurrentCollumn);
                getTableHeader().repaint();
                addRowSelection(selection);
                if (mRowSelectCaller!=null)
                    mRowSelectCaller.action();
            }            
        }
    }

	/**
	 *	Get ColorCode for Row.
	 *  <pre>
	 *	If numerical value in compare column is
	 *		negative = -1,
	 *      positive = 1,
	 *      otherwise = 0
	 *  </pre>
	 *  @param row2 
	 *  @return color code
	 */
    public int getColorCode(int row) {
    	return ((ObjectViewAdapter) super.getModel()).getColorCode(row);
    }

    public void configcontrols(int m_WindowNo) {
    	try {
    		//
    		//setSurrendersFocusOnKeystroke(true);	
    		//
    		ObjectViewAdapter adapter = (ObjectViewAdapter) super.getModel();
    		IObjetViewColumn[] columns = adapter.getModel().getColumns();
    		for (int j = 0; j < columns.length; j++) {
    			IObjetViewColumn tableColumn = columns[j];
    			TableColumn viewColumn = getColumnModel().getColumn(j);
    			if (tableColumn.getAD_Column_ID() > 0 )
    			{            	
    				if (tableColumn.getDisplayType() == DisplayType.PAttribute)
    				{
    					Lookup lookup = new MPAttributeLookup (Env.getCtx(), m_WindowNo);        			
    					PAttribute attrib = new PAttribute (false, false, true, m_WindowNo, (MPAttributeLookup) lookup);
    					AttributeEditor editor = new AttributeEditor(m_WindowNo, attrib);
    					viewColumn.setCellEditor((TableCellEditor) editor);
    					AttributeRenderer render = new AttributeRenderer(lookup);             	
    					viewColumn.setCellRenderer(render);             	           			
    				}
    				else if (tableColumn.getDisplayType() == DisplayType.RowChild)
    				{
    					ChildLookup lookup = new ChildLookup(Env.getCtx(), m_WindowNo, tableColumn.getAD_Column_ID());
    					ChildEditor attrib = new ChildEditor(false, false, true, m_WindowNo,tableColumn.getAD_Column_ID(),  lookup);
    					ChildCellEditor editor = new ChildCellEditor(m_WindowNo, attrib);
    					viewColumn.setCellEditor((TableCellEditor) editor);
    					ChildRenderer render = new ChildRenderer(lookup);
    					viewColumn.setCellRenderer(render);
    				}                    		
    				else
    				{
    					MLookup lookup = MLookupFactory.get(Env.getCtx(), m_WindowNo, 0, tableColumn.getAD_Column_ID(), tableColumn.getDisplayType());
    					LookupEditor editor = new LookupEditor(tableColumn.getName(),lookup);
    					viewColumn.setCellEditor(editor);
    					LookupRenderer render = new LookupRenderer(lookup);             	
    					viewColumn.setCellRenderer(render);             	   
    				}

    			}
    			else if (tableColumn.getDisplayType() > 0 )
    			{   
    				VCellRenderer cellrender = new VCellRenderer(tableColumn.getDisplayType());
    				SimpleEditor celleditor = new SimpleEditor(tableColumn.getDisplayType(), tableColumn.isOverWrite() );
    				viewColumn.setCellRenderer(cellrender);
    				viewColumn.setCellEditor(celleditor);
    			}
    		}
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}


class ChildRenderer extends DefaultTableCellRenderer
{
	ChildLookup look;
	public ChildRenderer(ChildLookup lookup) {
		look = lookup;
	}

	public Component getTableCellEditorComponent(JTable table,
			Object value,
			boolean isSelected,
			boolean hasFocus,
			int row,
			int col) {
		return null;
	}
	
	public Component getTableCellRendererComponent (JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int col)
	{
		Component c = null;
		String currentDisplay = "";
		c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
		c.setFont(table.getFont());
		//  Background & Foreground
		Color bg = XendraPLAF.getFieldBackground_Normal();
		Color fg = XendraPLAF.getTextColor_Normal();
		boolean ro = !table.isCellEditable(row, col); 
		if (ro)
		{
			bg = XendraPLAF.getFieldBackground_Inactive();
			if (isSelected && !hasFocus)
				bg = bg.darker();
		}
		if (isSelected)
		{
			//	Windows is white on blue
			bg = table.getSelectionBackground();
			//bg = Color.red;
			fg = table.getSelectionForeground();
			if (hasFocus)
				//bg = GraphUtil.brighter(bg, .9);
				bg = GraphUtil.brighter(bg, 1);
		}
		//  Set Color
		c.setBackground(bg);
		c.setForeground(fg);

		ObjectViewModel adapter = ((ObjectView) table).getDataModel();
		RowBase rowview = (RowBase) adapter.getRowObject(row);
		if (rowview != null && rowview.getChilds().length > 0)
		{
			look.setRowBase(rowview);
			currentDisplay = look.getDisplay(value);
			super.setValue(currentDisplay);
		}						
		return c;
	}
}

class ChildCellEditor extends AbstractCellEditor
implements TableCellEditor {

	ChildEditor attrib;
    public ChildCellEditor(int m_WindowNo, ChildEditor pattrib) {
    	attrib = pattrib;
    }

    public void actionPerformed(ActionEvent e) {
    	//
    }

    public Object getCellEditorValue() {
        return attrib.getValue();
    }

	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		
		ObjectViewModel adapter = ((ObjectView) table).getDataModel();
		RowBase rowview = (RowBase) adapter.getRowObject(row);
		attrib.setRowBase(rowview);
		attrib.setValue(value);
		return attrib;
	}
	
	/**
	 * 	Dispose
	 */	
	public void dispose()
	{
		attrib.dispose();
		attrib = null;
	}
}


class ChildEditor extends JComponent
implements VEditor, ActionListener
{

	private RowBase[] childs;
	private RowBase m_rowbase;
	/**
	 *	Create Product Attribute Set Instance Editor.
	 *  @param mandatory mandatory
	 *  @param isReadOnly read only
	 *  @param isUpdateable updateable
	 * 	@param WindowNo WindowNo
	 * 	@param lookup Model Product Attribute
	 */
	public ChildEditor (boolean mandatory, boolean isReadOnly, boolean isUpdateable,int WindowNo, Integer PropertyID , ChildLookup lookup)
	{
		
		if (PropertyID > 0)
		{
			MColumn column = MColumn.get(Env.getCtx(), PropertyID);
			m_Property = column.getColumnName();
		}
		
		m_WindowNo = WindowNo;
		m_mPAttribute = lookup;
		LookAndFeel.installBorder(this, "TextField.border");
		this.setLayout(new BorderLayout());
		//  Size
		this.setPreferredSize(m_text.getPreferredSize());
		int height = m_text.getPreferredSize().height;

		//	***	Text	***
		m_text.setEditable(false);
		m_text.setFocusable(false);
		m_text.setBorder(null);
		m_text.setHorizontalAlignment(JTextField.LEADING);
		//	Background
		setMandatory(mandatory);
		this.add(m_text, BorderLayout.CENTER);

		//	***	Button	***
		m_button.setIcon(Env.getImageIcon("PAttribute10.gif"));
		m_button.setMargin(new Insets(0, 0, 0, 0));
		m_button.setPreferredSize(new Dimension(height, height));
		m_button.addActionListener(this);
		m_button.setFocusable(true);
		add(m_button, BorderLayout.EAST);

		//	Prefereed Size
		this.setPreferredSize(this.getPreferredSize());		//	causes r/o to be the same length
		//	ReadWrite
		if (isReadOnly || !isUpdateable)
			setReadWrite(false);
		else
			setReadWrite(true);

		//	Popup
		//m_text.addMouseListener(new PAttribute_mouseAdapter(this));
		menuEditor = new CMenuItem(Msg.getMsg(Env.getCtx(), "PAttribute"), Env.getImageIcon("Zoom16.gif"));
		menuEditor.addActionListener(this);
		popupMenu.add(menuEditor);
	}	//	VPAttribute

	public void setRowBase(RowBase rowview) {
		m_rowbase = rowview;
		childs = rowview.getChilds();		
	}

	/**	Data Value				*/
	private Object				m_value = new Object();
	/** The Attribute Instance	*/
	private ChildLookup	m_mPAttribute;
	/** The Text Field          */
	private JTextField			m_text = new JTextField (VLookup.DISPLAY_LENGTH);
	/** The Button              */
	private CButton				m_button = new CButton();
	JPopupMenu          		popupMenu = new JPopupMenu();
	private CMenuItem 			menuEditor;
	private boolean				m_readWrite;
	private boolean				m_mandatory;
	private String 				m_Property = "";
	private int					m_WindowNo;
	/**	Calling Window Info				*/
	private int					m_AD_Column_ID = 0;
	/**	No Instance Key					*/
	private static Integer		NO_INSTANCE = new Integer(0);
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(PAttribute.class);
	private static final long serialVersionUID = 1L;
	/**
	 * 	Dispose resources
	 */
	public void dispose()
	{
		m_text = null;
		m_button = null;
		m_mPAttribute.dispose();
		m_mPAttribute = null;
	}	//	dispose
	/**
	 * 	Set Mandatory
	 * 	@param mandatory mandatory
	 */
	public void setMandatory (boolean mandatory)
	{
		m_mandatory = mandatory;
		m_button.setMandatory(mandatory);
		setBackground (false);
	}	//	setMandatory
	/**
	 * 	Get Mandatory
	 *  @return mandatory
	 */
	public boolean isMandatory()
	{
		return m_mandatory;
	}	//	isMandatory
	/**
	 * 	Set ReadWrite
	 * 	@param rw read rwite
	 */
	public void setReadWrite (boolean rw)
	{
		m_readWrite = rw;
		m_button.setReadWrite(rw);
		setBackground (false);
	}	//	setReadWrite
	/**
	 * 	Is Read Write
	 * 	@return read write
	 */
	public boolean isReadWrite()
	{
		return m_readWrite;
	}	//	isReadWrite
	/**
	 * 	Set Foreground
	 * 	@param color color
	 */
	public void setForeground (Color color)
	{
		m_text.setForeground(color);
	}	//	SetForeground
	/**
	 * 	Set Background
	 * 	@param error Error
	 */
	public void setBackground (boolean error)
	{
		if (error)
			setBackground(XendraPLAF.getFieldBackground_Error());
		else if (!m_readWrite)
			setBackground(XendraPLAF.getFieldBackground_Inactive());
		else if (m_mandatory)
			setBackground(XendraPLAF.getFieldBackground_Mandatory());
		else
			setBackground(XendraPLAF.getInfoBackground());
	}	//	setBackground
	/**
	 * 	Set Background
	 * 	@param color Color
	 */
	public void setBackground (Color color)
	{
		m_text.setBackground(color);
	}	//	setBackground
	/**************************************************************************
	 * 	Set/lookup Value
	 * 	@param value value
	 */
	public void setValue(Object value)
	{
		if (value == null || NO_INSTANCE.equals(value))
		{
			m_text.setText("");
			m_value = value;
			return;
		}

		//	new value
		log.fine("Value=" + value);
		m_value = value;
		m_text.setText(m_mPAttribute.getDisplay(value));	//	loads value
	}	//	setValue
	/**
	 * 	Get Value
	 * 	@return value
	 */
	public Object getValue()
	{
		return m_value;
	}	//	getValue
	/**
	 * 	Get Display Value
	 *	@return info
	 */
	public String getDisplay()
	{
		return m_text.getText();
	}	//	getDisplay
	/**************************************************************************
	 * 	Set Field
	 * 	@param mField MField
	 */
	public void setField(GridField mField)
	{
		//	To determine behavior
		m_AD_Column_ID = mField.getAD_Column_ID();
	}	//	setField
	/**
	 *  Action Listener Interface
	 *  @param listener listener
	 */
	public void addActionListener(ActionListener listener)
	{

	}   //  addActionListener
	/**
	 * 	Action Listener - start dialog
	 * 	@param e Event
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (!m_button.isEnabled ())
			return;
		m_button.setEnabled (false);
		//
		Boolean changed = false;
		Integer oldValue = (Integer)getValue ();

		Integer M_AttributeSetInstance_ID = oldValue;
		
		VDynamicListDialog vad = new VDynamicListDialog (Env.getFrame (this), 
				M_AttributeSetInstance_ID, childs , m_WindowNo);
		if (vad.isChanged())
		{
			
			m_rowbase.setFirstChild(vad.getSelectedChild());
			if (m_Property.length() > 0)
				M_AttributeSetInstance_ID = (Integer) vad.getSelectedChild().getPropertyValue(m_Property);
			changed = true;
		}
		if (changed)
		{
			m_value = new Object();				//	force re-query display
			if (M_AttributeSetInstance_ID == 0)
				setValue(null);
			else
				setValue(new Integer(M_AttributeSetInstance_ID));
			try
			{
				fireVetoableChange("M_AttributeSetInstance_ID", new Object(), getValue());
			}
			catch (PropertyVetoException pve)
			{
				log.log(Level.SEVERE, "", pve);
			}
		}	//	change
		m_button.setEnabled(true);
		requestFocus();
	}	//	actionPerformed
	/**
	 *  Property Change Listener
	 *  @param evt event
	 */
	public void propertyChange (PropertyChangeEvent evt)
	{
		if (evt.getPropertyName().equals(org.compiere.model.GridField.PROPERTY))
			setValue(evt.getNewValue());
	}   //  propertyChange
}	

class AttributeRenderer extends DefaultTableCellRenderer
{
	Lookup m_Lookup;
	Object previousValue;
	
	public AttributeRenderer(Lookup lookup) {
		m_Lookup = lookup;
		
	}

    public Component getTableCellEditorComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int col) {
    	Component c = null;
		String retValue = null;
		c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
		c.setFont(table.getFont());
		//  Background & Foreground
		Color bg = XendraPLAF.getFieldBackground_Normal();
		Color fg = XendraPLAF.getTextColor_Normal();
		boolean ro = !table.isCellEditable(row, col); 
		if (ro)
		{
			bg = XendraPLAF.getFieldBackground_Inactive();
			if (isSelected && !hasFocus)
			bg = bg.darker();
		}	
		if (isSelected)
		{
			//	Windows is white on blue
			bg = table.getSelectionBackground();
			//bg = Color.red;
			fg = table.getSelectionForeground();
			if (hasFocus)
				//bg = GraphUtil.brighter(bg, .9);
				bg = GraphUtil.brighter(bg, 1);
			}
		//  Set Color
		c.setBackground(bg);
		c.setForeground(fg);
		retValue = m_Lookup.getDisplay(value);
		super.setValue(retValue);				
		return c;
	}	
    
    // beta
	public Component getTableCellRendererComponent (JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int col)
	{
		Component c = null;
		Object currentDisplay = null;
		c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
		c.setFont(table.getFont());
		//  Background & Foreground
		Color bg = XendraPLAF.getFieldBackground_Normal();
		Color fg = XendraPLAF.getTextColor_Normal();
		int cCode = ((org.xendra.objectview.ObjectView)table).getColorCode(row);
		boolean ro = !table.isCellEditable(row, col); 
		if (ro)
		{
			bg = XendraPLAF.getFieldBackground_Inactive();
			if (isSelected && !hasFocus)
				bg = bg.darker();
		}
		else
		{
			fg = XendraPLAF.getTextColor_OK();		//	Blue
		}
		if (cCode < 0)
			bg = XendraPLAF.getTextColor_Issue();		//	Red		
		if (isSelected)
		{
			//	Windows is white on blue
			bg = table.getSelectionBackground();
			//bg = Color.red;
			fg = table.getSelectionForeground();
			if (hasFocus)
				//bg = GraphUtil.brighter(bg, .9);
				bg = GraphUtil.brighter(bg, 1);
		}
		//  Set Color
		c.setBackground(bg);
		c.setForeground(fg);

		ObjectViewModel adapter = ((ObjectView) table).getDataModel();
		RowBase rowview = (RowBase) adapter.getRowObject(row);
		IObjetViewColumn[] columns = adapter.getColumns();
		DefaultTableViewColumn dtv = (DefaultTableViewColumn) columns[col];
		currentDisplay = dtv.getDisplay(rowview, col, value);
		if (currentDisplay == null)
		{
			currentDisplay = m_Lookup.getDisplay(value);
			dtv.setDisplay(rowview, col, value, currentDisplay);
		}							
		super.setValue(currentDisplay);				
		return c;
	}
    
    
}

class AttributeEditor extends AbstractCellEditor
implements TableCellEditor {

	PAttribute attrib;
    public AttributeEditor(int m_WindowNo, PAttribute pattrib) {
    	//look = new VLookup(name, true, false, true, lookup);    
    	attrib = pattrib;
    	//look.addActionListener(this);
    	//attrib.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
    	//
    	System.out.println("X");
    }

    public Object getCellEditorValue() {
        return attrib.getValue();
    }

	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int col) {
		
		ObjectViewModel adapter = ((ObjectView) table).getDataModel();
		RowBase rowview = (RowBase) adapter.getRowObject(row);
		IObjetViewColumn[] columns = adapter.getColumns();
		DefaultTableViewColumn dtv = (DefaultTableViewColumn) columns[col];
		dtv.setDisplay(rowview, col, value, null);
		attrib.setValue(value);
		return attrib;
	}
	
	/**
	 * 	Dispose
	 */	
	public void dispose()
	{
		attrib.dispose();
		attrib = null;
	}
}

class PAttribute extends JComponent
implements VEditor, ActionListener
{

	/**
	 *	Create Product Attribute Set Instance Editor.
	 *  @param mandatory mandatory
	 *  @param isReadOnly read only
	 *  @param isUpdateable updateable
	 * 	@param WindowNo WindowNo
	 * 	@param lookup Model Product Attribute
	 */
	public PAttribute (boolean mandatory, boolean isReadOnly, boolean isUpdateable, 
			int WindowNo, MPAttributeLookup lookup)
	{
		m_WindowNo = WindowNo;
		m_mPAttribute = lookup;
		m_C_BPartner_ID = Env.getContextAsInt(Env.getCtx(), WindowNo, "C_BPartner_ID");
		LookAndFeel.installBorder(this, "TextField.border");
		this.setLayout(new BorderLayout());
		//  Size
		this.setPreferredSize(m_text.getPreferredSize());
		int height = m_text.getPreferredSize().height;

		//	***	Text	***
		m_text.setEditable(false);
		m_text.setFocusable(false);
		m_text.setBorder(null);
		m_text.setHorizontalAlignment(JTextField.LEADING);
		//	Background
		setMandatory(mandatory);
		this.add(m_text, BorderLayout.CENTER);

		//	***	Button	***
		m_button.setIcon(Env.getImageIcon("PAttribute10.gif"));
		m_button.setMargin(new Insets(0, 0, 0, 0));
		m_button.setPreferredSize(new Dimension(height, height));
		m_button.addActionListener(this);
		m_button.setFocusable(true);
		add(m_button, BorderLayout.EAST);

		//	Prefereed Size
		this.setPreferredSize(this.getPreferredSize());		//	causes r/o to be the same length
		//	ReadWrite
		if (isReadOnly || !isUpdateable)
			setReadWrite(false);
		else
			setReadWrite(true);

		//	Popup
		m_text.addMouseListener(new PAttribute_mouseAdapter(this));
		menuEditor = new CMenuItem(Msg.getMsg(Env.getCtx(), "PAttribute"), Env.getImageIcon("Zoom16.gif"));
		menuEditor.addActionListener(this);
		popupMenu.add(menuEditor);
	}	//	VPAttribute

	/**	Data Value				*/
	private Object				m_value = new Object();
	/** The Attribute Instance	*/
	private MPAttributeLookup	m_mPAttribute;

	/** The Text Field          */
	private JTextField			m_text = new JTextField (VLookup.DISPLAY_LENGTH);
	/** The Button              */
	private CButton				m_button = new CButton();

	JPopupMenu          		popupMenu = new JPopupMenu();
	private CMenuItem 			menuEditor;

	private boolean				m_readWrite;
	private boolean				m_mandatory;
	private int					m_WindowNo;
	private int					m_C_BPartner_ID;

	/**	Calling Window Info				*/
	private int					m_AD_Column_ID = 0;
	/**	No Instance Key					*/
	private static Integer		NO_INSTANCE = new Integer(0);
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(PAttribute.class);

	private static final long serialVersionUID = 1L;
	/**
	 * 	Dispose resources
	 */
	public void dispose()
	{
		m_text = null;
		m_button = null;
		m_mPAttribute.dispose();
		m_mPAttribute = null;
	}	//	dispose

	/**
	 * 	Set Mandatory
	 * 	@param mandatory mandatory
	 */
	public void setMandatory (boolean mandatory)
	{
		m_mandatory = mandatory;
		m_button.setMandatory(mandatory);
		setBackground (false);
	}	//	setMandatory

	/**
	 * 	Get Mandatory
	 *  @return mandatory
	 */
	public boolean isMandatory()
	{
		return m_mandatory;
	}	//	isMandatory

	/**
	 * 	Set ReadWrite
	 * 	@param rw read rwite
	 */
	public void setReadWrite (boolean rw)
	{
		m_readWrite = rw;
		m_button.setReadWrite(rw);
		setBackground (false);
	}	//	setReadWrite

	/**
	 * 	Is Read Write
	 * 	@return read write
	 */
	public boolean isReadWrite()
	{
		return m_readWrite;
	}	//	isReadWrite

	/**
	 * 	Set Foreground
	 * 	@param color color
	 */
	public void setForeground (Color color)
	{
		m_text.setForeground(color);
	}	//	SetForeground

	/**
	 * 	Set Background
	 * 	@param error Error
	 */
	public void setBackground (boolean error)
	{
		if (error)
			setBackground(XendraPLAF.getFieldBackground_Error());
		else if (!m_readWrite)
			setBackground(XendraPLAF.getFieldBackground_Inactive());
		else if (m_mandatory)
			setBackground(XendraPLAF.getFieldBackground_Mandatory());
		else
			setBackground(XendraPLAF.getInfoBackground());
	}	//	setBackground

	/**
	 * 	Set Background
	 * 	@param color Color
	 */
	public void setBackground (Color color)
	{
		m_text.setBackground(color);
	}	//	setBackground


	/**************************************************************************
	 * 	Set/lookup Value
	 * 	@param value value
	 */
	public void setValue(Object value)
	{
		if (value == null || NO_INSTANCE.equals(value))
		{
			m_text.setText("");
			m_value = value;
			return;
		}

		//	The same		
		if (value.equals(m_value))
		{
			return;
		}
		else
		{
			// aca
		}
		//	new value
		log.fine("Value=" + value);
		m_value = value;
		m_text.setText(m_mPAttribute.getDisplay(value));	//	loads value
	}	//	setValue

	/**
	 * 	Get Value
	 * 	@return value
	 */
	public Object getValue()
	{
		return m_value;
	}	//	getValue

	/**
	 * 	Get Display Value
	 *	@return info
	 */
	public String getDisplay()
	{
		return m_text.getText();
	}	//	getDisplay

	/**************************************************************************
	 * 	Set Field
	 * 	@param mField MField
	 */
	public void setField(GridField mField)
	{
		//	To determine behavior
		m_AD_Column_ID = mField.getAD_Column_ID();
	}	//	setField

	/**
	 *  Action Listener Interface
	 *  @param listener listener
	 */
	public void addActionListener(ActionListener listener)
	{

	}   //  addActionListener

	/**
	 * 	Action Listener - start dialog
	 * 	@param e Event
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (!m_button.isEnabled ())
			return;
		m_button.setEnabled (false);
		//
		Integer oldValue = (Integer)getValue ();
		int M_AttributeSetInstance_ID = oldValue == null ? 0 : oldValue.intValue ();
		int M_Product_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, "M_Product_ID");
		int M_ProductBOM_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, "M_ProductBOM_ID");
		int Ref_AttributeSetInstance_ID = Env.getContextAsInt( Env.getCtx(), m_WindowNo, "Ref_AttributeSetInstance_ID");

		log.config("M_Product_ID=" + M_Product_ID + "/" + M_ProductBOM_ID
				+ ",M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID
				+ ",Ref_AttributeSetInstance_ID=" + Ref_AttributeSetInstance_ID
				+ ", AD_Column_ID=" + m_AD_Column_ID);

		//	M_Product.M_AttributeSetInstance_ID = 8418
		boolean productWindow = m_AD_Column_ID == Util.getColumnID(MProduct.Table_ID, "M_AttributeSetInstance_ID");	

		//	Exclude ability to enter ASI
		boolean exclude = true;
		if (M_Product_ID != 0)
		{
			MProduct product = MProduct.get(Env.getCtx(), M_Product_ID, null);
			int M_AttributeSet_ID = product.getM_AttributeSet_ID();
			if (M_AttributeSet_ID != 0)
			{
				MAttributeSet mas = MAttributeSet.get(Env.getCtx(), M_AttributeSet_ID, product.get_TrxName());
				exclude = mas.excludeEntry(m_AD_Column_ID, Env.isSOTrx(Env.getCtx(), m_WindowNo));
			}
		}

		boolean changed = false;
		if (M_ProductBOM_ID != 0)	//	Use BOM Component
			M_Product_ID = M_ProductBOM_ID;
		
		//	
		if (!productWindow && (M_Product_ID == 0 || exclude))
		{
			changed = true;
			m_text.setText(null);
			M_AttributeSetInstance_ID = 0;
		}
		else
		{
			VPAttributeDialog vad = new VPAttributeDialog (Env.getFrame (this), 
					M_AttributeSetInstance_ID, Ref_AttributeSetInstance_ID, M_Product_ID, m_C_BPartner_ID,
					productWindow, m_AD_Column_ID, m_WindowNo);
			if (vad.isChanged())
			{
				m_text.setText(vad.getM_AttributeSetInstanceName());
				M_AttributeSetInstance_ID = vad.getM_AttributeSetInstance_ID();
				Ref_AttributeSetInstance_ID = vad.getRef_AttributeSetInstance_ID();
				changed = true;
			}
		}
		/** Selection
	{
		//	Get Model
		MAttributeSetInstance masi = MAttributeSetInstance.get(Env.getCtx(), M_AttributeSetInstance_ID, M_Product_ID);
		if (masi == null)
		{
			log.log(Level.SEVERE, "No Model for M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID + ", M_Product_ID=" + M_Product_ID);
		}
		else
		{
			Env.setContext(Env.getCtx(), m_WindowNo, "M_AttributeSet_ID", masi.getM_AttributeSet_ID());
			//	Get Attribute Set
			MAttributeSet as = masi.getMAttributeSet();
			//	Product has no Attribute Set
			if (as == null)		
				ADialog.error(m_WindowNo, this, "PAttributeNoAttributeSet");
			//	Product has no Instance Attributes
			else if (!as.isInstanceAttribute())
				ADialog.error(m_WindowNo, this, "PAttributeNoInstanceAttribute");
			else
			{
				int M_Warehouse_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, "M_Warehouse_ID");
				int M_Locator_ID = Env.getContextAsInt (Env.getCtx (), m_WindowNo, "M_Locator_ID");
				String title = "";
				PAttributeInstance pai = new PAttributeInstance (
					Env.getFrame(this), title, 
					M_Warehouse_ID, M_Locator_ID, M_Product_ID, m_C_BPartner_ID);
				if (pai.getM_AttributeSetInstance_ID() != -1)
				{
					m_text.setText(pai.getM_AttributeSetInstanceName());
					M_AttributeSetInstance_ID = pai.getM_AttributeSetInstance_ID();
					changed = true;
				}
			}
		}
	}
		 **/

		//	Set Value
		if (changed)
		{
			log.finest("Changed M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID);
			m_value = new Object();				//	force re-query display
			if (M_AttributeSetInstance_ID == 0)
				setValue(null);
			else
				setValue(new Integer(M_AttributeSetInstance_ID));
			try
			{
				fireVetoableChange("M_AttributeSetInstance_ID", new Object(), getValue());
			}
			catch (PropertyVetoException pve)
			{
				log.log(Level.SEVERE, "", pve);
			}
		}	//	change
		m_button.setEnabled(true);
		requestFocus();
	}	//	actionPerformed

	/**
	 *  Property Change Listener
	 *  @param evt event
	 */
	public void propertyChange (PropertyChangeEvent evt)
	{
		if (evt.getPropertyName().equals(org.compiere.model.GridField.PROPERTY))
			setValue(evt.getNewValue());
	}   //  propertyChange


}	//	VPAttribute

/**
 *	Mouse Listener
 */
class PAttribute_mouseAdapter extends MouseAdapter
{
	/**
	 *	Constructor
	 *  @param adaptee adaptee
	 */
	PAttribute_mouseAdapter(PAttribute adaptee)
	{
		m_adaptee = adaptee;
	}	//	VPAttribute_mouseAdapter

	private PAttribute m_adaptee;

	/**
	 *	Mouse Listener
	 *  @param e event
	 */
	public void mouseClicked(MouseEvent e)
	{
		//	Double Click
		if (e.getClickCount() > 1)
			m_adaptee.actionPerformed(new ActionEvent(e.getSource(), e.getID(), "Mouse"));
		//	popup menu
		if (SwingUtilities.isRightMouseButton(e))
			m_adaptee.popupMenu.show((Component)e.getSource(), e.getX(), e.getY());
	}	//	mouse Clicked

}	//	VPAttribute_mouseAdapter

// Lookup Renderer es para unidad de medida, etc. Lookups 

