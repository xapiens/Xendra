package org.frapuccino.swing;

import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JDialog;

/**
 * <pre>
 * // make sure that the above class is loaded in order to ensure that
// its static block is executed.
public static void main(String[] args){ 
   ActiveWindowTracker.class.getClass(); 
   ......
} 

// to get current/last active window
Window window = ActiveWindowTracker.findActiveWindow(); // guaranteed to return non-null
 * </pre>
 * @author Frederik
 *
 */
public class ActiveWindowTracker {
	static Window activeWindow;

	private static WindowListener windowListener = new WindowAdapter() {
		public void windowDeactivated(WindowEvent we) {
			if (!we.getWindow().isShowing())
				windowHiddenOrClosed(we);
		}

		public void windowClosed(WindowEvent we) {
			windowHiddenOrClosed(we);
		}

		private void windowHiddenOrClosed(WindowEvent we) {
			we.getWindow().removeWindowListener(this);
			activeWindow = null;
		}
	};

	private static PropertyChangeListener propListener = new PropertyChangeListener() {
		public void propertyChange(PropertyChangeEvent evt) {
			if (evt.getNewValue() != null) {
				if (activeWindow != null)
					activeWindow.removeWindowListener(windowListener);
				activeWindow = (Window) evt.getNewValue();
				activeWindow.addWindowListener(windowListener);
			}
		}
	};

	static {
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addPropertyChangeListener("activeWindow", propListener);
	}

	public static Window findActiveWindow() {
		if (activeWindow != null)
			return activeWindow;
		else {
			// Trick to get the shared frame instance.
			JDialog dlg = new JDialog();
			Window owner = new JDialog().getOwner();
			dlg.dispose();
			return owner;
		}
	}
}