package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class AddSubject extends JFrame implements ActionListener {

    JFrame adminHomePage;
    
    JTextField tsubjectName, tsubjectCode;
    JButton badd, bback;

    AddSubject(JFrame adminHomePage) {
        this.adminHomePage = adminHomePage;
        
        JLabel ltitle, lsubjectName, lsubjectCode, lpic;

        //============set frame===========
        setTitle("Add Subject Page");
        setSize(640, 385);
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
        ltitle = new JLabel("Add Subject");
        ltitle.setBounds(30, 32, 540, 100);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        lsubjectName = new JLabel("Subject Name");
        lsubjectName.setForeground(Color.white);
        lsubjectName.setBounds(30, 140, 140, 30);
        add(lsubjectName);
        lsubjectName.setFont(f2);

        lsubjectCode = new JLabel("Subject Code");
        lsubjectCode.setForeground(Color.white);
        lsubjectCode.setBounds(30, 190, 140, 30);
        add(lsubjectCode);
        lsubjectCode.setFont(f2);

        //============set text field============
        tsubjectName = new JTextField();
        tsubjectName.setBounds(160, 140, 150, 30);
        tsubjectName.setFont(new Font("Arial", Font.BOLD, 15));
        add(tsubjectName);

        tsubjectCode = new JTextField();
        tsubjectCode.setBounds(160, 190, 150, 30);
        tsubjectCode.setFont(new Font("Arial", Font.BOLD, 15));
        add(tsubjectCode);

        //============set Button============
        bback = new JButton("Back");
        bback.setBounds(210, 260, 100, 30);
        bback.setForeground(Color.yellow);
        bback.setBackground(Color.blue);
        add(bback);
        bback.addActionListener(this);

        badd = new JButton("Add");
        badd.setBounds(30, 260, 100, 30);
        badd.setForeground(Color.white);
        badd.setBackground(Color.black);
        add(badd);
        badd.addActionListener(this);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\Subject.jpg");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 640, 360);
        add(lpic);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                adminHomePage.setEnabled(true); 
                dispose();
            }
        });
        
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        badd.setCursor(c);
        bback.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == badd) {
            if (tsubjectName.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Subject Nume.");
            } else if (tsubjectCode.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Subject Code.");
            } else {
                try {

                    String subjectName = tsubjectName.getText();
                    String subjectCode = tsubjectCode.getText();

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                    PreparedStatement pst = con.prepareStatement("insert into Subject(subjectCode,subjectName)values(?,?);");

                    pst.setString(1, subjectCode);
                    pst.setString(2, subjectName);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Subject Add Successefully....👍");

                    tsubjectName.setText("");
                    tsubjectCode.setText("");
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
