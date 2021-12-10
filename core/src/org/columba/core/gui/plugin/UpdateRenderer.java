package org.columba.core.gui.plugin;

import java.awt.Component;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import org.compiere.grid.ed.Calendar;


/**
 * @author frd
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class UpdateRenderer extends DefaultTableCellRenderer { 
	/**
	 *
	 */
	public UpdateRenderer() {
		super();
		setHorizontalAlignment(SwingConstants.CENTER);
		setOpaque(true);
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
	 */
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int rowIndex, int vColIndex) {
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
				rowIndex, vColIndex);
		if (value instanceof PluginNode) {
			PluginNode node = (PluginNode) value;
			if (!node.isCategory()) {
				Timestamp actual = node.getActual();
				Timestamp update = node.getUpdate();
				if (update != null) {
					if (actual == null) {
						setText("not installed");
					} else {
						long different = update.getTime() - actual.getTime();						
						long secondsInMilli = 1000;
						long minutesInMilli = secondsInMilli * 60;
						long hoursInMilli = minutesInMilli * 60;
						long daysInMilli = hoursInMilli * 24;						
						long elapsedDays = different / daysInMilli;
						different = different % daysInMilli;
						long elapsedHours = different / hoursInMilli;
						different = different % hoursInMilli;
						long elapsedMinutes = different / minutesInMilli;
						different = different % minutesInMilli;
						long elapsedSeconds = different / secondsInMilli;
						String timepass = "";
						if (elapsedDays > 0)
							timepass = String.format("%d days, %d hours, %d minutes, %d seconds%n",elapsedDays,elapsedHours,elapsedMinutes,elapsedSeconds);
						else if (elapsedHours > 0)
							timepass = String.format("%d hours, %d minutes, %d seconds%n",elapsedHours,elapsedMinutes,elapsedSeconds);
						else if (elapsedMinutes > 0)
							timepass = String.format("%d minutes, %d seconds%n",elapsedMinutes,elapsedSeconds);
						else if (elapsedSeconds > 0)
							timepass = String.format("%d seconds%n",elapsedSeconds);
						setText(timepass);
					}
				}
			}
		}
		return this;
	}

	//
	//    /* (non-Javadoc)
	// * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
	// */
	//    public Component getTableCellRendererComponent(JTable table, Object value,
	//    		boolean isSelected, boolean hasFocus, int rowIndex, int vColIndex) {
	//    	super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
	//    			rowIndex, vColIndex);
	//
	//    	if (value instanceof PluginNode) {
	//    		PluginNode node = (PluginNode) value;
	//    		HashMap properties = node.getProperties();
	//    		String update = null;
	//    		if (properties != null) {
	//    			update = (String) properties.get("version");
	//    		}
	//    		if (update == null) {
	//    			update = " ";
	//    		}
	//    		setText(update);
	//    	}
	//    	return this;
	//    }
}
