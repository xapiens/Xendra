package com.dravios.openvpn;

public class OastConnectionStatus {
    private String Message [];
    private String Status [];
    private int status;
    private int Icon [];
    //private Shell controllingShell;
    private boolean autoHide;

    private void initialize () {
        Message = new String [3];
        Status = new String [3];
        Icon = new int [3];
        autoHide = false;
    }

//    public void setControllingShell (Shell shell) {
//        controllingShell = shell;
//    }

    public OastConnectionStatus () {
        initialize ();
    }

    public OastConnectionStatus (int icon1, int icon2, int icon3, String msg1, String msg2, String msg3,
        String status1, String status2, String status3) {
        initialize ();

        setStatusIcon (0, icon1);
        setStatusIcon (1, icon2);
        setStatusIcon (2, icon3);

        setStatusMessage (0, msg1);
        setStatusMessage (1, msg2);
        setStatusMessage (2, msg3);

        setStatusName (0, status1);
        setStatusName (1, status2);
        setStatusName (2, status3);
    }

    public synchronized int getStatusIcon (final int status) {
        if (status < 0 || status > 2)
            return -1;
        return Icon [status];
    }

    public synchronized void setStatusIcon (final int status, final int icon) {
        if (status < 0 || status > 2)
            return;
        Icon [status] = icon;
    }

    public synchronized String getStatusMessage (final int status) {
        if (status < 0 || status > 2)
            return null;
        return Message [status];
    }

    public synchronized void setStatusMessage (final int status, final String message) {
        if (status < 0 || status > 2)
            return;
        Message [status] = message;
    }

    public synchronized String getStatusName (final int status) {
        if (status < 0 || status > 2)
            return null;
        return Status [status];
    }

    public synchronized void setStatusName (final int status, final String nstatus) {
        if (status < 0 || status > 2)
            return;
        Status [status] = nstatus;
    }

    private synchronized void setDisplayingStatus (final int s) {
        if (s < 0 || s > 2)
            return;
//        if (controllingShell == null)
//            return;
//        if (controllingShell.isDisposed ())
//            return;

//        controllingShell.getDisplay().asyncExec (new Runnable () {
//            public void run () {
//                ToolTip tip = new ToolTip (controllingShell, SWT.BALLOON | Icon [s]);
//
//                tip.setAutoHide (autoHide);
//                tip.setMessage (getStatusMessage (s));
//                tip.setText (getStatusName (s));
//                controllingShell.getDisplay ().getSystemTray ().getItem (0).setToolTip (tip);
//                tip.setVisible (true);
//            }
//        });
    }

    public synchronized void displayStatus (final int status) {
        setDisplayingStatus (status);
    }

    public synchronized void displayStatus () {
        setDisplayingStatus (this.status);
    }

    public void setAutoHide (final boolean autoHide) {
        this.autoHide = autoHide;
    }

    public synchronized void setCurrentStatus (final int currStatus) {
        status = currStatus;
    }

    public synchronized int getCurrentStatus () {
        return status;
    }
}
