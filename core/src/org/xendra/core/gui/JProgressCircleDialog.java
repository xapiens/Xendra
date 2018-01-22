package org.xendra.core.gui;

import java.awt.FlowLayout;

import javax.swing.JDialog;

import org.columba.core.gui.util.ProgressCircle;

public class JProgressCircleDialog extends JDialog  implements Runnable {
	private static JProgressCircleDialog dialog;
	private ProgressCircle progress;
	private boolean m_initialized;
	
	public static JProgressCircleDialog getInstance() {
		if (dialog == null)
			dialog = new JProgressCircleDialog();
		return dialog;
	}	
	
	public JProgressCircleDialog() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setResizable(false);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		statInit();		
	}
	private void statInit() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		progress = new ProgressCircle(300,200);
		getContentPane().add(progress);
		progress.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		progress.setProgress(0);
	}
	public void setTitle(String title)
	{
		progress.setTitle(title);
										
	}
	public void setProgress(int percent)
	{
		if (!m_initialized)
		{
			pack();
			setVisible(true);
			m_initialized = true;
		}
		if (progress.getProgress() != percent)
		{
			progress.setProgress(percent);			
//			try {
//				Thread.sleep(10);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
			invalidate();
			
			validate();
			repaint();
		}
	}

	@Override
	public void run() {
		while ( true )
		{
			//wheel_on_this_panel.rotate() ;
			repaint() ;

			try
			{
				Thread.sleep( 40 ) ;  //  25 times per second
			}
			catch ( InterruptedException caught_exception )
			{
				// No actions to handle the exception.
			}
		}  		
		//repaint() ;
		//
		//        try
		//        {
		//           Thread.sleep( 40 ) ;  //  25 times per second
		//        }
		//        catch ( InterruptedException caught_exception )
		//        {
		//           // No actions to handle the exception.
		//        }		
	}
}
