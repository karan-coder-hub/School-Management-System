package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class Feedback extends JFrame implements ActionListener {
    JTextField tname, temail, tcontact;
    TextArea tmsg;
    JButton bsend, bback;
    JFrame parentFrame;

    Feedback(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        JLabel ltitle, lname, lemail, lcontact, lmsg, lpic;

        //============set frame===========
        setTitle("Feedback Page");
        setSize(600, 500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
        Font f2 = new Font("Monotype Corsiva", Font.BOLD, 20);

        //============set Font Label===========
        ltitle = new JLabel("Feedback");
        ltitle.setBounds(190, 30, 200, 50);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        lname = new JLabel("Name");
        lname.setForeground(Color.red);
        lname.setBounds(150, 100, 100, 30);
        add(lname);
        lname.setFont(f2);

        lemail = new JLabel("E-mail");
        lemail.setForeground(Color.white);
        lemail.setBounds(150, 150, 100, 30);
        add(lemail);
        lemail.setFont(f2);

        lcontact = new JLabel("Contact");
        lcontact.setForeground(Color.yellow);
        lcontact.setBounds(150, 200, 100, 30);
        add(lcontact);
        lcontact.setFont(f2);

        lmsg = new JLabel("Message");
        lmsg.setForeground(Color.white);
        lmsg.setBounds(150, 250, 100, 30);
        add(lmsg);
        lmsg.setFont(f2);

        //============set text field============
        tname = new JTextField();
        tname.setBounds(300, 100, 200, 30);
        tname.setFont(new Font("Arial", Font.BOLD, 15));
        add(tname);

        temail = new JTextField();
        temail.setBounds(300, 150, 200, 30);
        temail.setFont(new Font("Arial", Font.BOLD, 15));
        add(temail);

        tcontact = new JTextField();
        tcontact.setBounds(300, 200, 200, 30);
        tcontact.setFont(new Font("Arial", Font.BOLD, 15));
        add(tcontact);

        //============set TextArea============
        tmsg = new TextArea("");
        tmsg.setBounds(300, 250, 200, 100);
        tmsg.setFont(new Font("Arial", Font.BOLD, 13));
        // tmsg.setEditable(false);
        add(tmsg);

        //============set Button============
        bsend = new JButton("Send Message");
        bsend.setBounds(300, 360, 120, 30);
        bsend.setBackground(Color.black);
        bsend.setForeground(Color.white);
        add(bsend);
        bsend.addActionListener(this);

        bback = new JButton("Back");
        bback.setBounds(300, 400, 100, 30);
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        add(bback);
        bback.addActionListener(this);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\feedback3.png");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 600, 500);
        add(lpic);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                parentFrame.setEnabled(true); // Re-enable parent JFrame
            }
        });
        
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bback.setCursor(c);
        bsend.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bsend) {
            if (tname.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Nume.");
            } else if (temail.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter An E-mail.");
            } else if (tcontact.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Contact Number");
            } else if (tmsg.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Type Message");
            } else {
                try {

                    String name = tname.getText();
                    String email = temail.getText();
                    String contact = tcontact.getText();
                    String message = tmsg.getText();

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                    PreparedStatement pst = con.prepareStatement("insert into feedback(name,email,contact,message)values(?,?,?,?);");

                    pst.setString(1, name);
                    pst.setString(2, email);
                    pst.setString(3, contact);
                    pst.setString(4, message);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Feedback Sent  Successefully....👍");

                    tname.setText("");
                    temail.setText("");
                    tcontact.setText("");
                    tmsg.setText("");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        if (ae.getSource() == bback) {
            parentFrame.setEnabled(true);
            dispose();
        }
    }

}
