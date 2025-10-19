package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class AddMarks extends JFrame implements ActionListener {
    JFrame adminHomePage;

    JTextField tname, tclass, tsubject, tmarks, ttrem;
    JButton bsend, bback;

    AddMarks(JFrame adminHomePage) {
        this.adminHomePage = adminHomePage;
        
        JLabel ltitle, lname, lclass, lsubject, lmarks, ltrem, lpic;

        //============set frame===========
        setTitle("Add Marks Page");
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
        ltitle = new JLabel("Add Marks Details");
        ltitle.setBounds(200, 30, 300, 50);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        lname = new JLabel("Student_Name");
        lname.setForeground(Color.white);
        lname.setBounds(140, 100, 140, 30);
        add(lname);
        lname.setFont(f2);

        lclass = new JLabel("Class");
        lclass.setForeground(Color.white);
        lclass.setBounds(200, 150, 100, 30);
        add(lclass);
        lclass.setFont(f2);

        lsubject = new JLabel("Subject");
        lsubject.setForeground(Color.white);
        lsubject.setBounds(200, 200, 100, 30);
        add(lsubject);
        lsubject.setFont(f2);

        lmarks = new JLabel("Marks");
        lmarks.setForeground(Color.white);
        lmarks.setBounds(200, 250, 100, 30);
        add(lmarks);
        lmarks.setFont(f2);

        ltrem = new JLabel("Trem");
        ltrem.setForeground(Color.white);
        ltrem.setBounds(200, 300, 100, 30);
        add(ltrem);
        ltrem.setFont(f2);

        //============set text field============
        tname = new JTextField();
        tname.setBounds(300, 100, 200, 30);
        tname.setFont(new Font("Arial", Font.BOLD, 15));
        add(tname);

        tclass = new JTextField();
        tclass.setBounds(300, 150, 200, 30);
        tclass.setFont(new Font("Arial", Font.BOLD, 15));
        add(tclass);

        tsubject = new JTextField();
        tsubject.setBounds(300, 200, 200, 30);
        tsubject.setFont(new Font("Arial", Font.BOLD, 15));
        add(tsubject);

        tmarks = new JTextField();
        tmarks.setBounds(300, 250, 200, 30);
        tmarks.setFont(new Font("Arial", Font.BOLD, 15));
        add(tmarks);

        ttrem = new JTextField();
        ttrem.setBounds(300, 300, 200, 30);
        ttrem.setFont(new Font("Arial", Font.BOLD, 15));
        add(ttrem);

        //============set Button============
        bsend = new JButton("Add Marks");
        bsend.setBounds(370, 375, 120, 30);
        bsend.setBackground(Color.black);
        bsend.setForeground(Color.white);
        add(bsend);
        bsend.addActionListener(this);

        bback = new JButton("Cancel");
        bback.setBounds(210, 375, 120, 30);
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        add(bback);
        bback.addActionListener(this);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\markss.png");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 600, 500);
        add(lpic);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                adminHomePage.setEnabled(true); 
                dispose();
            }
        });

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bsend.setCursor(c);
        bback.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bsend) {
            if (tname.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Student Nume.");
            } else if (tclass.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Sabject.");
            } else if (tsubject.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Class Number");
            } else if (tmarks.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Trem");
            } else if (ttrem.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Marks");
            } else {
                try {

                    String name = tname.getText();
                    String clas = tclass.getText();
                    String subject = tsubject.getText();
                    String marks = tmarks.getText();
                    String trem = ttrem.getText();

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                    PreparedStatement pst = con.prepareStatement("insert into Marks(name,subject,class,marks,term)values(?,?,?,?,?);");

                    pst.setString(1, name);
                    pst.setString(2, subject);
                    pst.setString(3, clas);
                    pst.setString(4, marks);
                    pst.setString(5, trem);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Marks Add Successefully....👍");

                    tname.setText("");
                    tclass.setText("");
                    tsubject.setText("");
                    tmarks.setText("");
                    ttrem.setText("");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        if (ae.getSource() == bback) {
            adminHomePage.setEnabled(true);
            dispose();
        }
    }
}
