package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangePasswordStudent extends JFrame implements ActionListener {
    JFrame welcomeFrame;

    JPasswordField topass, tnpass, tcpass;
    JTextField tuser;
    JButton bChangepass, bback;
    JLabel show, show2, show3, show4, show5, show6;

    ChangePasswordStudent(JFrame welcomeFrame) {
        this.welcomeFrame = welcomeFrame;
        
        JLabel ltitle, lpic, luser, lopass, lnpass, lcpass;

        //============set frame===========
        setTitle("Change Password");
        setSize(600, 500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);

        //============set Font Label===========
        ltitle = new JLabel("Change Password");
        ltitle.setBounds(150, 30, 400, 50);
        ltitle.setForeground(Color.PINK);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        luser = new JLabel("Username");
        luser.setBounds(70, 100, 100, 30);
        luser.setForeground(Color.white);
        add(luser);

        lopass = new JLabel("Old Password");
        lopass.setBounds(70, 150, 150, 50);
        lopass.setForeground(Color.white);
        add(lopass);

        lnpass = new JLabel("New Password");
        lnpass.setBounds(70, 210, 150, 50);
        lnpass.setForeground(Color.white);
        add(lnpass);

        lcpass = new JLabel("Confirm Password");
        lcpass.setBounds(70, 270, 150, 50);
        lcpass.setForeground(Color.white);
        add(lcpass);

        //============set text field============
        tuser = new JTextField();
        tuser.setBounds(250, 100, 200, 30);
        tuser.setFont(new Font("Monotype", Font.BOLD, 18));
        add(tuser);

        topass = new JPasswordField();
        topass.setBounds(250, 165, 200, 30);
        topass.setBackground(Color.orange);
        topass.setFont(new Font("Monotype", Font.BOLD, 18));
        topass.setEchoChar('•');
        add(topass);

        //==========password show/hide label=========
        show = new JLabel("Show Password");
        show.setBounds(460, 165, 100, 30);
        show.setForeground(Color.yellow);
        add(show);

        show.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show) {
                    topass.setEchoChar((char) 0);
                    show.setVisible(false);
                    show2.setVisible(true);
                } else {
                    topass.setEchoChar('•');
                }
            }
        });

        show2 = new JLabel("Hide Password");
        show2.setBounds(460, 165, 100, 30);
        show2.setForeground(Color.yellow);
        show2.setVisible(false);
        add(show2);

        show2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show2) {
                    topass.setEchoChar('•');
                    show2.setVisible(false);
                    show.setVisible(true);
                } else {
                    topass.setEchoChar((char) 0);
                }
            }
        });

        tnpass = new JPasswordField();
        tnpass.setBounds(250, 220, 200, 30);
        tnpass.setBackground(Color.orange);
        tnpass.setFont(new Font("Monotype", Font.BOLD, 18));
        tnpass.setEchoChar('•');
        add(tnpass);

        //==========password show/hide label=========
        show3 = new JLabel("Show Password");
        show3.setBounds(455, 220, 100, 30);
        show3.setForeground(Color.yellow);
        add(show3);

        show3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show3) {
                    tnpass.setEchoChar((char) 0);
                    show3.setVisible(false);
                    show4.setVisible(true);
                } else {
                    tnpass.setEchoChar('●');
                }
            }
        });

        show4 = new JLabel("Hide Password");
        show4.setBounds(455, 220, 100, 30);
        show4.setForeground(Color.yellow);
        show4.setVisible(false);
        add(show4);

        show4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show4) {
                    tnpass.setEchoChar('•');
                    show4.setVisible(false);
                    show3.setVisible(true);
                } else {
                    tnpass.setEchoChar((char) 0);
                }
            }
        });

        tcpass = new JPasswordField();
        tcpass.setBounds(250, 280, 200, 30);
        tcpass.setBackground(Color.orange);
        tcpass.setFont(new Font("Monotype", Font.BOLD, 18));
        tcpass.setEchoChar('•');
        add(tcpass);

        //==========password show/hide label=========
        show5 = new JLabel("Show Password");
        show5.setBounds(455, 280, 100, 30);
        show5.setForeground(Color.yellow);
        add(show5);

        show5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show5) {
                    tcpass.setEchoChar((char) 0);
                    show5.setVisible(false);
                    show6.setVisible(true);
                } else {
                    tcpass.setEchoChar('•');
                }
            }
        });

        show6 = new JLabel("Hide Password");
        show6.setBounds(455, 280, 100, 30);
        show6.setForeground(Color.yellow);
        show6.setVisible(false);
        add(show6);

        show6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show6) {
                    tcpass.setEchoChar('•');
                    show6.setVisible(false);
                    show5.setVisible(true);
                } else {
                    tcpass.setEchoChar((char) 0);
                }
            }
        });

        //============set Button============
        bChangepass = new JButton("Change Password");
        bChangepass.setBounds(250, 330, 150, 30);
        bChangepass.setBackground(Color.black);
        bChangepass.setForeground(Color.white);
        add(bChangepass);
        bChangepass.addActionListener(this);

        bback = new JButton("Back");
        bback.setBounds(250, 380, 100, 30);
        bback.setBackground(Color.blue);
        bback.setForeground(Color.yellow);
        add(bback);
        bback.addActionListener(this);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\chengepass.jpg");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 600, 500);
        add(lpic);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                welcomeFrame.setEnabled(true); 
            }
        });

        //============set corsor===================
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bChangepass.setCursor(c);
        bback.setCursor(c);
        show.setCursor(c);
        show2.setCursor(c);
        show3.setCursor(c);
        show4.setCursor(c);
        show5.setCursor(c);
        show6.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bChangepass) {
            String username = tuser.getText();
            String oldPassword = new String(topass.getPassword());
            String newPassword = new String(tnpass.getPassword());
            String confirmPassword = new String(tcpass.getPassword());

            if (newPassword.equals(confirmPassword)) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                    String q = "SELECT * FROM Student2 WHERE username = ? AND password = ?";
                    PreparedStatement pst = con.prepareStatement(q);
                    pst.setString(1, username);
                    pst.setString(2, oldPassword);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        String q2 = "UPDATE Student2 SET password = ? WHERE username = ?";
                        pst = con.prepareStatement(q2);
                        pst.setString(1, newPassword);
                        pst.setString(2, username);
                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Password changed successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Username/Password is incorrect.");
                    }
                    rs.close();
                    pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChangePasswordStudent.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "New Password and Confirm Password do not match.");
            }
        }
        if (ae.getSource() == bback) {
            new LoginStudent(welcomeFrame).setVisible(true);
            dispose();
        }
    }

}
