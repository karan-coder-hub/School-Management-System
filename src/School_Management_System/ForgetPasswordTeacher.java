package School_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPasswordTeacher extends JFrame implements ActionListener {
    JFrame welcomeFrame;

    JTextField tuser, tysque, tans;
    JPasswordField tupass;
    JButton bverify, bgetpass, bback;

    ForgetPasswordTeacher(JFrame welcomeFrame) {
        this.welcomeFrame = welcomeFrame;
        
        JLabel ltitle, lpic, luser, lysque, lans, lupass;

        //============set frame===========
        setTitle("Forget Password");
        setSize(600, 500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
        setIconImage(icon.getImage());

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 26);

        //============set Font Label===========
        ltitle = new JLabel("Get Your Password Teacher");
        ltitle.setBounds(170, 30, 300, 50);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        luser = new JLabel("User Name");
        luser.setBounds(70, 100, 100, 30);
        luser.setForeground(Color.white);
        add(luser);

        lysque = new JLabel("Your Security Question");
        lysque.setBounds(70, 150, 150, 50);
        lysque.setForeground(Color.white);
        add(lysque);

        lans = new JLabel("Answer");
        lans.setBounds(70, 210, 150, 50);
        lans.setForeground(Color.white);
        add(lans);

        lupass = new JLabel("Your Password");
        lupass.setBounds(70, 315, 150, 50);
        lupass.setForeground(Color.white);
        add(lupass);

        //============set Button============
        bverify = new JButton("Verify");
        bverify.setBounds(380, 100, 70, 30);
        bverify.setBackground(Color.black);
        bverify.setForeground(Color.white);
        add(bverify);
        bverify.addActionListener(this);

        bgetpass = new JButton("Get Password");
        bgetpass.setBounds(250, 280, 130, 30);
        bgetpass.setBackground(Color.black);
        bgetpass.setForeground(Color.white);
        add(bgetpass);
        bgetpass.addActionListener(this);

        bback = new JButton("Back");
        bback.setBounds(250, 380, 100, 30);
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        add(bback);
        bback.addActionListener(this);

        //============set corsor===================
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bverify.setCursor(c);
        bgetpass.setCursor(c);
        bback.setCursor(c);

        //============set text field============
        tuser = new JTextField();
        tuser.setBounds(250, 100, 130, 30);
        add(tuser);

        tysque = new JTextField();
        tysque.setBounds(250, 165, 200, 30);
        add(tysque);
        tysque.setEditable(false);

        tans = new JTextField();
        tans.setBounds(250, 220, 200, 30);
        add(tans);
        tans.setEditable(false);

        //============set Password field============
        tupass = new JPasswordField();
        tupass.setBounds(250, 330, 200, 30);
        add(tupass);
        tupass.setEditable(false);
        if (tupass.getEchoChar() != '\u0000') {
            tupass.setEchoChar('\u0000');
        } else {
            tupass.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
        }
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                welcomeFrame.setEnabled(true); 
            }
        });

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\forgetpass.png");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 600, 500);
        add(lpic);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bverify) {
            String username = tuser.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                PreparedStatement pst = con.prepareStatement("select * from Teacher2 where username='" + username + "';");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    tysque.setText(rs.getString(12));
                    tans.setEditable(true);
                    tans.setText("");
                    tupass.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Username Not Found");
                    tans.setText("");
                    tysque.setText("");
                    tupass.setText("");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (ae.getSource() == bgetpass) {
            if (tans.getText().length() != 0) {
                int check = 0;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                    PreparedStatement p = c.prepareStatement("select * from Teacher2;");
                    ResultSet r = p.executeQuery();
                    while (r.next()) {
                        String answer = r.getString("answer");
                        if (answer.equals(tans.getText())) {
                            check = 1;
                            tupass.setText(r.getString(14));
                            tans.setEditable(false);
                        }
                    }
                    if (check == 0) {
                        JOptionPane.showMessageDialog(null, "Wrong Answer");
                        tans.setText("");
                        tupass.setText("");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter Answer");
            }
        }
        if (ae.getSource() == bback) {
            new LoginTeacher(welcomeFrame).setVisible(true);
            dispose();
        }
    }

}
