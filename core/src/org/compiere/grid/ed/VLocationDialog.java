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
package org.compiere.grid.ed;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.File;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import net.miginfocom.swing.MigLayout;
import org.compiere.apps.*;
import org.compiere.model.MCity;
import org.compiere.model.MCountry;
import org.compiere.model.MLocation;
import org.compiere.model.MRegion;
import org.compiere.model.Query;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.cache.FileBasedLocalCache;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;
import org.xendra.map.FancyWaypointRenderer;
import org.xendra.map.MyWaypoint;
import org.xendra.map.SelectionAdapter;

/**
 *	Dialog to enter Location Info (Address)
 *
 *  @author 	Jorg Janke
 *  @version 	$Id: VLocationDialog.java 5430 2014-08-20 07:01:26Z xapiens $
 *  
 *  @author 	xapiens 
 *  			Added Map location
 */
public class VLocationDialog extends CDialog 
implements ActionListener, PropertyChangeListener, VetoableChangeListener
{
	/**
	 *	Constructor
	 *
	 * @param frame parent
	 * @param title title (field name)
	 * @param location Model Location
	 */
	public VLocationDialog (Frame frame, String title, MLocation location)
	{
		super(frame, title, true);
		try
		{		
			initMap();
			jbInit();						
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			log.log(Level.SEVERE, ex.getMessage());
		}
		m_location = location;
		if (m_location == null)
			m_location = new MLocation (Env.getCtx(), 0, null);
		//	Overwrite title	
		if (m_location.getC_Location_ID() == 0)
			setTitle(Msg.getMsg(Env.getCtx(), "LocationNew"));
		else
			setTitle(Msg.getMsg(Env.getCtx(), "LocationUpdate"));


		//	Current Country
		MCountry.setDisplayLanguage(Env.getAD_Language(Env.getCtx()));
		fCountry = new CComboBox(MCountry.getCountries(Env.getCtx()));
		fCountry.setSelectedItem(m_location.getCountry());
		fCountry.addActionListener(this);
		m_origCountry_ID = m_location.getC_Country_ID();
		//	Current Region
		fRegion = new CComboBox(MRegion.getRegions(Env.getCtx(), m_origCountry_ID));
		if (m_location.getCountry().isHasRegion())
			lRegion.setText(m_location.getCountry().getRegionName());	//	name for region

		initLocation();				
		AEnv.positionCenterWindow(frame, this);
	}	//	VLocationDialog

	private boolean 	m_change = false;
	private MLocation	m_location;
	private int			m_origCountry_ID;
	private int			s_oldCountry_ID = 0;
	private int 		s_oldRegion_ID = 0;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VLocationDialog.class);

	private CPanel panel = new CPanel();
	private CPanel mainPanel = new CPanel();
	private CPanel southPanel = new CPanel();
	private BorderLayout panelLayout = new BorderLayout();
	private GridBagLayout gridBagLayout = new GridBagLayout();
	private ConfirmPanel confirmPanel = new ConfirmPanel(true);
	private BorderLayout southLayout = new BorderLayout();
	//
	private CLabel		lAddress1   = new CLabel(Msg.getMsg(Env.getCtx(), "Address")+ " 1");
	private CLabel		lAddress2   = new CLabel(Msg.getMsg(Env.getCtx(), "Address")+ " 2");
	private CLabel		lAddress3   = new CLabel(Msg.getMsg(Env.getCtx(), "Address")+ " 3");
	private CLabel		lAddress4   = new CLabel(Msg.getMsg(Env.getCtx(), "Address")+ " 4");
	private CLabel		lCity       = new CLabel(Msg.getMsg(Env.getCtx(), "City"));
	private CLabel		lCountry    = new CLabel(Msg.getMsg(Env.getCtx(), "Country"));
	private CLabel		lRegion     = new CLabel(Msg.getMsg(Env.getCtx(), "Region"));
	private CLabel		lPostal     = new CLabel(Msg.getMsg(Env.getCtx(), "Postal"));
	private CLabel		lPostalAdd  = new CLabel(Msg.getMsg(Env.getCtx(), "PostalAdd"));
	private CTextField	fAddress1 = new CTextField(20);		//	length=60
	private CTextField	fAddress2 = new CTextField(20);		//	length=60
	private CTextField	fAddress3 = new CTextField(20);		//	length=60
	private CTextField	fAddress4 = new CTextField(20);		//	length=60
	//private CTextField	fCity  = new CTextField(15);		//	length=60
	private CComboBox   fCity; 
	private CComboBox	fRegion;
	private CComboBox	fCountry;
	private CTextField	fPostal = new CTextField(5);		//	length=10
	private CTextField	fPostalAdd = new CTextField(5);		//	length=10
	//
	private GridBagConstraints gbc = new GridBagConstraints();
	private Insets labelInsets = new Insets(2,15,2,0);		// 	top,left,bottom,right
	private Insets fieldInsets = new Insets(2,5,2,10);
	private JXMapViewer mapViewer;
	private SelectionAdapter sa;
	private WaypointPainter<MyWaypoint> waypointPainter;

	/**
	 *	Static component init
	 *  @throws Exception
	 */
	void jbInit() throws Exception
	{
		panel.setLayout(panelLayout);
		mainPanel.setLayout(gridBagLayout);
		JPanel mapPanel = new JPanel(new MigLayout("fill"));				
		mapPanel.setPreferredSize(new Dimension(300,200));
		mapPanel.add(mapViewer,"grow");
		JSplitPane location = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, mainPanel, mapPanel);

		southPanel.setLayout(southLayout);		
		panelLayout.setHgap(5);
		panelLayout.setVgap(10);
		getContentPane().add(panel);
		panel.add(location, BorderLayout.CENTER);
		panel.add(southPanel, BorderLayout.SOUTH);
		southPanel.add(confirmPanel, BorderLayout.NORTH);
		//
		confirmPanel.addActionListener(this);
	}	//	jbInit

	/**
	 *	Dynanmic Init & fill fields - Called when Country changes!
	 */

	private MRegion[] getregions() 
	{
		String whereClause = "C_Country_ID = ?";
		List<MRegion> listregions = new Query(Env.getCtx(), MRegion.Table_Name , whereClause, null)
		.setParameters(m_location.getC_Country_ID())
		.setOrderBy("Description")
		.list();

		MRegion[] regions = new MRegion[listregions.size()];
		listregions.toArray(regions);
		return regions;
	}
	private MCity[] getCities(MRegion region) 
	{
		if (region == null)
			return null;
		String whereClause = "C_Region_ID = ?";
		List<MCity> listcities = new Query(Env.getCtx(), MCity.Table_Name , whereClause, null)
		.setParameters(region.getC_Region_ID())
		.setOrderBy("Name")
		.list();

		MCity[] cities = new MCity[listcities.size()];
		listcities.toArray(cities);
		return cities;
	}	
	private void initLocation()
	{
		MCountry country = m_location.getCountry();
		log.fine(country.getName() + ", Region=" + country.isHasRegion() + " " + country.getDisplaySequence()
				+ ", C_Location_ID=" + m_location.getC_Location_ID());
		//	new Region
		if (m_location.getC_Country_ID() != s_oldCountry_ID && country.isHasRegion())
		{

			fRegion = new CComboBox(getregions());
			fRegion.addActionListener(this);
			lRegion.setText(country.getRegionName());
			s_oldCountry_ID = m_location.getC_Country_ID();
			//
			if (m_location.getRegion() != null)
			{
				fRegion.setSelectedItem(m_location.getRegion());
			}
			MCity[] cities = getCities(m_location.getRegion());
			if (cities != null)
			{
				fCity = new CComboBox(cities);				
				if (m_location.getCityObject() != null)
				{
					fCity.setSelectedItem(m_location.getCityObject());
				}
			}
			else
			{
				fCity = new CComboBox();
			}
			fCity.addActionListener(this);
		}

		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.gridy = 0;			//	line
		gbc.gridx = 0;
		gbc.gridwidth = 1;
		gbc.insets = fieldInsets;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0;
		gbc.weighty = 0;

		mainPanel.add(Box.createVerticalStrut(5), gbc);    	//	top gap

		int line = 1;
		addLine(line++, lAddress1, fAddress1);
		addLine(line++, lAddress2, fAddress2);
		addLine(line++, lAddress3, fAddress3);
		addLine(line++, lAddress4, fAddress4);

		//  sequence of City Postal Region - @P@ @C@ - @C@, @R@ @P@
		String ds = country.getDisplaySequence();
		if (ds == null || ds.length() == 0)
		{
			log.log(Level.SEVERE, "DisplaySequence empty - " + country);
			ds = "";	//	@C@,  @P@
		}
		StringTokenizer st = new StringTokenizer(ds, "@", false);
		while (st.hasMoreTokens())
		{
			String s = st.nextToken();
			if (s.startsWith("C"))
				addLine(line++, lCity, fCity);
			else if (s.startsWith("P"))
				addLine(line++, lPostal, fPostal);
			else if (s.startsWith("A"))
				addLine(line++, lPostalAdd, fPostalAdd);
			else if (s.startsWith("R") && m_location.getCountry().isHasRegion())
			{
				addLine(line++, lRegion, fRegion);
				//addLine(line++, lCity,fCity);
			}
		}
		//  Country Last
		addLine(line++, lCountry, fCountry);

		//	Fill it
		if (m_location.getC_Location_ID() != 0)
		{
			fAddress1.setText(m_location.getAddress1());
			fAddress2.setText(m_location.getAddress2());
			fAddress3.setText(m_location.getAddress3());
			fAddress4.setText(m_location.getAddress4());
			//fCity.setText(m_location.getCity());
			fPostal.setText(m_location.getPostal());
			fPostalAdd.setText(m_location.getPostal_Add());
			if (m_location.getCountry().isHasRegion())
			{
				lRegion.setText(m_location.getCountry().getRegionName());
				fRegion.setSelectedItem(m_location.getRegion());
				fCity.setSelectedItem(m_location.getCityObject());
			}
			fCountry.setSelectedItem(country);
		}
		//	Update UI		
		defaultMap();
		pack();
	}	//	initLocation

	void defaultMap()  {
		mapViewer.setZoom(9);
		GeoPosition x = mapViewer.getAddressLocation();
		if (x == null) {
			BigDecimal lat = m_location.getCityObject().getLatitude();		
			BigDecimal lon = m_location.getCityObject().getLongitude();
			if (lat != null && lon != null && lat.compareTo(BigDecimal.ZERO) != 0  && lon.compareTo(BigDecimal.ZERO) != 0) {
				x = new GeoPosition(lat.doubleValue(), lon.doubleValue());
			} else {
				x = new GeoPosition(-12.060809058367294, -77.04574584960938);
			}
		}
		mapViewer.setAddressLocation(x);		
	}
	void initMap() {
		// Create a TileFactoryInfo for OpenStreetMap
		TileFactoryInfo info = new OSMTileFactoryInfo();
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);

		// Setup local file cache
		File cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
		tileFactory.setLocalCache(new FileBasedLocalCache(cacheDir, false));

		// Setup JXMapViewer
		mapViewer = new JXMapViewer();
		mapViewer.setTileFactory(tileFactory);

		GeoPosition geodefault = null;

		// set the focus
		// Add interactions
		MouseInputListener mia = new PanMouseInputListener(mapViewer);
		mapViewer.addMouseListener(mia);
		mapViewer.addMouseMotionListener(mia);            

		mapViewer.addMouseListener(new CenterMapListener(mapViewer));
		mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCursor(mapViewer));
		mapViewer.addKeyListener(new PanKeyListener(mapViewer));
		//
		waypointPainter = new WaypointPainter<MyWaypoint>();
		waypointPainter.setRenderer(new FancyWaypointRenderer());					
		mapViewer.setOverlayPainter(waypointPainter);
		
		sa = new SelectionAdapter(mapViewer, this);		
		mapViewer.addMouseListener(sa);		
	}

	//private void updateMap() {
	//}

	private void initCities() {
		if (s_oldRegion_ID != m_location.getC_Region_ID())
		{
			MCity[] cities = getCities(m_location.getRegion());
			if (cities != null && fCity == null)
				fCity = new CComboBox(cities);
			else if (fCity == null)
				fCity = new CComboBox();
			else
			{
				fCity.removeAllItems();
				for (MCity city:cities)
				{
					fCity.addItem(city);
				}
			}
			s_oldRegion_ID = m_location.getC_Region_ID();
		}
	}

	/**
	 *	Add Line to screen
	 *
	 *  @param line line number (zero based)
	 *  @param label label
	 *  @param field field
	 */
	private void addLine(int line, JLabel label, JComponent field)
	{
		gbc.gridy = line;
		//	label
		gbc.insets = labelInsets;
		gbc.gridx = 0;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		mainPanel.add(label, gbc);
		//	Field
		gbc.insets = fieldInsets;
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		mainPanel.add(field, gbc);
	}	//	addLine


	/**
	 *	ActionListener
	 *  @param e ActionEvent
	 */
	public void actionPerformed(ActionEvent e)
	{		
		if (e.getActionCommand().equals(ConfirmPanel.A_OK))
		{
			action_OK();
			m_change = true;
			dispose();
		}
		else if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			m_change = false;
			dispose();
		}

		//	Country Changed - display in new Format
		else if (e.getSource() == fCountry)
		{
			//	Modifier for Mouse selection is 16  - for any key selection 0
			MCountry c = (MCountry)fCountry.getSelectedItem();
			m_location.setCountry(c);
			//	refrseh
			mainPanel.removeAll();
			initLocation();
			fCountry.requestFocus();	//	allows to use Keybord selection
		}
		else if (e.getSource() == fRegion)
		{
			MRegion c = (MRegion) fRegion.getSelectedItem();
			m_location.setRegion(c);
			initCities();
			fRegion.requestFocus();
		}
		else if (e.getSource() == fCity) {			
			MCity city = (MCity) fCity.getSelectedItem();
			if (city != null) {
				m_location.setCity(city);
				// current address
				Double loclatitude = m_location.getLatitude().doubleValue();
				Double loclongitude = m_location.getLongitude().doubleValue();
				Double citlatitude = city.getLatitude().doubleValue();
				Double citlongitude = city.getLongitude().doubleValue();
				GeoPosition geodefault = null;
				if (loclatitude != 0 && loclongitude != 0) {
					geodefault = new GeoPosition(loclatitude, loclongitude);
				} else if (citlatitude != 0 && citlongitude != 0) {
					geodefault = new GeoPosition(citlatitude, citlongitude);
				}
				if (geodefault != null) {
					setGeoPosition(geodefault);
				}
				invalidate();				
			}
		}
	}	//	actionPerformed

	public void setGeoPosition(GeoPosition geodefault) {
		mapViewer.setAddressLocation(geodefault);
		Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList(new MyWaypoint("C", Color.GREEN, geodefault)));
		waypointPainter.setWaypoints(waypoints);
		mapViewer.invalidate();		
		m_location.setLatitude(new BigDecimal(geodefault.getLatitude()));
		m_location.setLongitude(new BigDecimal(geodefault.getLongitude()));
		m_location.save();		
	}

	/**
	 * 	OK - check for changes (save them) & Exit
	 */
	private void action_OK()
	{		
		m_location.setAddress1(fAddress1.getText());
		m_location.setAddress2(fAddress2.getText());
		m_location.setAddress3(fAddress3.getText());
		m_location.setAddress4(fAddress4.getText());
		m_location.setPostal(fPostal.getText());
		m_location.setPostal_Add(fPostalAdd.getText());
		//  Country/Region
		MCountry c = (MCountry)fCountry.getSelectedItem();
		m_location.setCountry(c);
		if (m_location.getCountry().isHasRegion())
		{
			MRegion r = (MRegion)fRegion.getSelectedItem();
			m_location.setRegion(r);
			if (fCity != null)
			{
				MCity city = (MCity) fCity.getSelectedItem();
				if (city != null)
					m_location.setCity(city);
			}
		}	
		else
			m_location.setC_Region_ID(0);
		//	Save chnages
		m_location.save();
	}	//	actionOK

	/**
	 *	Get result
	 *  @return true, if changed
	 */
	public boolean isChanged()
	{
		return m_change;
	}	//	getChange

	/**
	 * 	Get edited Value (MLocation)
	 *	@return location
	 */
	public MLocation getValue()
	{
		return m_location;
	}	//	getValue

	public void propertyChange(PropertyChangeEvent evt) {
	}

	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
	}

	public String getLocationName() {
		String loc = "";
		if (m_location != null)
		loc = m_location.toString();
		return loc;
	}
}	//	VLocationDialog
