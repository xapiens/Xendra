package org.columba.core.gui.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import org.xendra.swing.ProgressCircleUI;

public class ProgressCircle extends JPanel {
	private final JLabel title = new JLabel();
	private Dimension d;
	private JProgressBar progress1 = null;
	private int progress = 0;
	
    public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
        progress1.setStringPainted(true);
		progress1.setValue(progress);
	}
	public ProgressCircle(int width, int height) {
		d = new Dimension(width, height);
		progress1 = new JProgressBar() {
		    @Override 
		    public void updateUI() {
		        super.updateUI();
		        setUI(new ProgressCircleUI(d));
		        setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		    }
		};
    	progress1.setForeground(new Color(0xAAFFAAAA));   
    	JPanel p = new JPanel(new BorderLayout());
        p.add(title, BorderLayout.NORTH);
        p.add(progress1, BorderLayout.SOUTH);
        add(p);
        //setPreferredSize(new Dimension(320, 240));        
        setPreferredSize(new Dimension(width, height));        
    }
	public void setTitle(String newtitle) {
		if (newtitle != null)
			title.setText(newtitle);
		else
			title.setText("");
	}
}