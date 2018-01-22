package org.xendra.apps.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class toastandroidsample extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    toastandroidsample frame = new toastandroidsample();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public toastandroidsample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JButton btnTestToast = new JButton("Test Toast");
        btnTestToast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ToastMessage toastMessage = new ToastMessage("Sample text to toast ",3000);
                toastMessage.setVisible(true);
            }
        });
        contentPane.add(btnTestToast, BorderLayout.SOUTH);
    }

}

class ToastMessage extends JDialog {

    int miliseconds;
    public ToastMessage(String toastString, int time) {
        this.miliseconds = time;
        setBounds(100, 100, 189, 31);
        setUndecorated(true);
        getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
        getContentPane().add(panel, BorderLayout.CENTER);

        JLabel lblToastString = new JLabel("");
        lblToastString.setText(toastString);
        lblToastString.setFont(new Font("Dialog", Font.BOLD, 12));
        lblToastString.setForeground(Color.WHITE);

        setAlwaysOnTop(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int y = dim.height/2-getSize().height/2;
        int half = y/2;
        setLocation(dim.width/2-getSize().width/2, y+half);
        panel.add(lblToastString);
        setVisible(false);

        if(miliseconds > 10000 && miliseconds < 1000)
            miliseconds = 3000;
        new Thread(){
            public void run() {
                try {
                    Thread.sleep(miliseconds);
                    dispose();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }   
}