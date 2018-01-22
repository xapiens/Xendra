/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/

package org.xendra.swing;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.compiere.util.Env;

/**
 * Esta classe simula um LED que
 * pode ter 3 cores (RED/GREEN/OFF).<br />
 * <img src="ledimg.jpg" alt="LED" /> 
 */
public class LED extends JLabel{
	
	//constantes
	/**
	 * Constante para mudar LED para desligado
	 */
	public static final int OFF = 0; 
	public static final int RED = 1; 
	public static final int GREEN = 2; 	
	public static final int LIGHTGREEN = 3;
	//atributos
	private int estado;
	private ImageIcon red,green,off,lgreen;
	private boolean blink;
	private Blink b;
	
	//construtor
	/**
	 * Construtor padr‹o. <br />
	 * LED n‹o pisca (<code>blink == false</code>).
	*/
	public LED(){
		super();
		b = new Blink(this,500);
		blink = false;
		estado = OFF;
		
		off 	= Env.getImageIcon("LedDisabled24.png");
		red 	= Env.getImageIcon("LedRed24.png");
		green 	= Env.getImageIcon("LedGreen24.png");
		lgreen  = Env.getImageIcon("LedLightGreen24.png");
		
		this.setIcon(off);
	}

	/**
	 * Construtor alternativo. <br />
	 * LED pisca com freqŸ�ncia definida em <code>time</code> (milisegundos).
	 */
	public LED(int time){
		super();
		b = new Blink(this,time);
		blink = true;
		estado = OFF;
		off 	= Env.getImageIcon("LedDisabled24.png");
		red 	= Env.getImageIcon("LedRed24.png");
		green 	= Env.getImageIcon("LedGreen24.png");
		lgreen  = Env.getImageIcon("LedLightGreen24.png");
		this.setIcon(off);
	}

	/**
	 * Retorna estado atual do LED (ver constantes)
	 * @return int
	 */
	public int getState()
	{
		return estado;
	}
	
	/**
	 * Muda estado do LED
	 * @param estado (ver estados poss’veis nas constantes)
	 */
	public void setState(int estado)
	{
		this.estado = estado;
		repaint();
	}

	/**
	 * Alterar entre LED est‡tico e LED piscante.
	 * @param blinking
	 */
	public void setBlinking(boolean blinking){
		blink = blinking;
		if (blink)
		{
			if (b.isAlive()) return;
			b.start();
		}
		else
		{
			if (b.isAlive()) b.stop();
		}
	}
	
	/**
	 * Ver qual Ž o tipo de LED usado (est‡tico ou piscante).
	 * @return boolean
	 */
	public boolean isBlinking(){
		return blink;
	}
	
	protected void paintComponent (Graphics g)
	{
		super.paintComponent(g);

		switch(estado)
		{
			case OFF:
				if (!blink)	setIcon(off);
				else b.setIcons(off,off);
				break;
			case RED:
				if (!blink) setIcon(red);
				else b.setIcons(red,off);
				break;
			case GREEN:
				if (!blink) setIcon(green);
				else b.setIcons(green,off);
				break;
			case LIGHTGREEN:
				if (!blink) setIcon(lgreen);
				else b.setIcons(lgreen, off);			
				break;
			default: break;
		}
		
	}

	/**
	 * Classe que monitoria a freqŸ�ncia
	 * com que o LED pisca. <br />
	 * S— ter‡ funcionalidade se no LED estiver <code>blink == true</code>.
	 */
	class Blink extends Thread{
		
		private int time;
		private JLabel lbl;
		private ImageIcon normal,faded;
		
		/**
		 * Construtor padr‹o
		 * @param lbl
		 * @param time
		 */
		public Blink(JLabel lbl,int time){
			super();
			this.lbl = lbl;
			this.time = time;
			this.normal = null;
			this.faded = null;
		}
		
		/**
		 * N‹o Ž recomendado mexer nesta fun�‹o. <br />
		 * Uso interno do LED.
		 * @param normal
		 * @param faded
		 */
		public void setIcons(ImageIcon normal,ImageIcon faded)
		{
			this.normal = normal;
			this.faded = faded;
		}
		
		/**
		 * Alterna LED entre 2 tipos de icone para
		 * simular efeito de pisca-pisca.
		 */
		public void run(){
			while(true)
			{
				try
				{
					sleep(time);
					if ( (faded != null) && (normal != null))
					{
						lbl.setIcon(normal);
					}
					sleep(time);
					if ( (faded != null) && (normal != null))
					{
						lbl.setIcon(faded);
					}
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		/**
		 * Retorna tempo (em milisegundos) em que LED
		 * pisca.
		 * @return int
		 */
		public int getTime() {
			return time;
		}
		
		/**
		 * Pode-se alterar a freqŸ�ncia do LED por aqui tambŽm.
		 * @param time
		 */
		public void setTime(int time) {
			this.time = time;
		}
	}
	
}