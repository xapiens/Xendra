package org.xendra.common;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.AppsAction;
import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.xendra.swing.g2d.Reflection;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;

public class PushButton extends JPanel implements ActionListener {
	private CLabel amount;
	//private CLabel key = new CLabel();
	//private CLabel dsc = new CLabel();
	private CButton m_button;
	private AppsAction m_appaction;
	private ActionListener m_delegate;
	//private String m_PaymentTerm;
	private String m_typePayAmt = "";
	private int m_PaymentTerm_ID;
	//private boolean m_ispartial = true;
	
	public PushButton (BufferedImage img, String action, KeyStroke accelerator, String text)
	{
		this(img, action, accelerator, text, false); 
	}
	/**
	 * @wbp.parser.constructor
	 */
	public PushButton (BufferedImage img, String action, KeyStroke accelerator, String text, boolean ispartial)
	{					
		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, UIManager.getColor("Panel.background"), UIManager.getColor("controlShadow")));
		addHierarchyBoundsListener(new HierarchyBoundsAdapter() {
			
			public void ancestorResized(HierarchyEvent e) {				
				//e.getComponent().getParent().getWidth();
				//e.getComponent().getHeight();
//				int pwidth = (int) getPreferredSize().getWidth();
//				int pheight = (int) m_button.getPreferredSize().getHeight();
//				Component childs[] = e.getComponent().getParent().getComponents();
//				Dimension dim = new Dimension(pwidth,pheight);
//				for (Component c : childs) {
//					if (c instanceof PushButton)
//					{
//						if ( pheight < c.getPreferredSize().getHeight() || pwidth < c.getPreferredSize().getWidth())
//						{
//							//pwidth = (int) c.getPreferredSize().getWidth();
//							//pheight = (int) c.getPreferredSize().getHeight();
//							dim = new Dimension(c.getPreferredSize());
//						}
//					}
//				}						
//				m_button.setPreferredSize(dim);
//				m_button.invalidate();
//				for (Component c : childs) {
//					if (c instanceof PushButton)
//					{
//						c.setPreferredSize(dim);
//						c.setSize(dim);
//						c.validate();
//					}
//				}						
			}
		});
		if (img != null)
		{
			BufferedImage mask = Reflection.createGradientMask(img.getWidth(), img.getHeight());
			img = Reflection.createReflectedPicture(img, mask);			
		}
	
		if (accelerator != null)
		{	
			String keytext = KeyEvent.getKeyText(accelerator.getKeyCode());
			int w = img.getWidth();
			int h = img.getHeight();
			BufferedImage newimg = new BufferedImage(w,h, BufferedImage.TYPE_INT_ARGB);			
			
			Graphics2D g2d = newimg.createGraphics();
			g2d.drawImage(img, 0, 0, null);
			g2d.setPaint(Color.red);
			g2d.setFont(new Font("Tahoma",0,25));
			FontMetrics fm = g2d.getFontMetrics();
			int x = newimg.getWidth() - fm.stringWidth(keytext) - 5;
			int y = newimg.getHeight() - fm.getHeight() + 20;
			g2d.drawString(keytext, x, y);
			g2d.dispose();
			img = newimg;
			//key.setFont(new java.awt.Font("Tahoma", 0, 25));
			//text += '['+KeyEvent.getKeyText(accelerator.getKeyCode())+']';
			//key.setText(KeyEvent.getKeyText(accelerator.getKeyCode()));
			//key.setHorizontalAlignment(SwingConstants.LEFT);
			//key.setForeground(new Color(255,0,0));
		}
		this.setLayout(new MigLayout());
		m_appaction = new AppsAction(img, action, accelerator, text, new Dimension(100,50));
		m_appaction.setDelegate(this);
		m_button = (CButton) m_appaction.getButton();
		m_button.setVerticalTextPosition(AbstractButton.BOTTOM);
		m_button.setHorizontalTextPosition(AbstractButton.CENTER);
		m_button.setBorderPainted(false);
		m_button.setContentAreaFilled(false);		
		m_button.setFocusPainted(false);
		m_button.setText(text);
		//m_button.invalidate();
		//dsc.setText(text);
		//dsc.setHorizontalAlignment(SwingConstants.RIGHT);
		add(m_button,"spanx 2, wrap");
		if (ispartial)
		{
			setAmount(Env.ZERO);	
			//add(key, "alignx right");
			//add(amount, "alignx left"); //,"alignx left"
			add(amount, "alignx center");
		}
//		else
//		{
//			add(key,"alignx center");
//		}				
		//add(dsc, "alignx right"); //,"alignx right"
		//build();
		validate();
	}			
	public PushButton(AppsAction appsAction) {
		m_appaction = appsAction;
		//Border emptyBorder = BorderFactory.createEmptyBorder();				
		m_button = (CButton) m_appaction.getButton();
		//m_button.setBorder(emptyBorder);
		m_button.setVerticalTextPosition(AbstractButton.BOTTOM);
		m_button.setHorizontalTextPosition(AbstractButton.CENTER);		
		m_button.invalidate();
		setAmount(Env.ZERO);
		add(amount, "gapleft 50, wrap");
		add(amount, "alignx right, wrap");
		add(m_button,"wrap");
		//add(key);
		//build();
	}
	
//	private void build()
//	{
//		if (amount != null)		
//			amount.setVisible(m_ispartial);
//		validate();
//	}

	public void setAmount(CLabel amt)
	{
		amount = amt;
	}
	public void setAmount(BigDecimal Amt)
	{
//		if (amount == null)
//			return;
		if (amount == null)
		{
			amount = new CLabel();
			amount.setHorizontalAlignment(SwingConstants.LEFT);
			amount.setFont(new java.awt.Font("Tahoma", 0, 25));
		}
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		amount.setText(format.format(Amt));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, e.getActionCommand());
		if (m_delegate != null)
			m_delegate.actionPerformed(event);		
	}
	public void setDelegate(ActionListener al) {
		m_delegate = al;		
	}
	public CButton getButton() {
		return m_button;
	}
	public String gettypePayAmt() {
		return m_typePayAmt;
	}
	public void settypePayAmt(String pt) {
		m_typePayAmt = pt;
	}
	public void setC_PaymentTerm_ID(int pt_id) {
		m_PaymentTerm_ID = pt_id;
	}
	public int getC_PaymentTerm_ID() {
		return m_PaymentTerm_ID;
	}
	public void setIsPartial(boolean partial) {
//		m_ispartial = partial;
//		build();
	}
}