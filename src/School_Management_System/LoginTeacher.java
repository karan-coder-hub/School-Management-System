package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

class LoginTeacher extends JFrame implements ActionListener {
    JTextField tuser;
    JPasswordField tpass;
    JButton blogin, bforget, bchange, bexit;
    JLabel show, show2;
    JFrame welcomeFrame;

    LoginTeacher(JFrame welcomeFrame) {
        this.welcomeFrame = welcomeFrame;
        JLabel ltitle, luser, lpass, lpic;

        //============set frame===========
        setTitle("LoginPage");
        setSize(1100, 500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
        setIconImage(icon.getImage());

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 45);

        //============set Font Label===========
        ltitle = new JLabel("Teacher Login Form");
        ltitle.setBounds(625, 50, 350, 50);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        luser = new JLabel("Username");
        luser.setBounds(650, 150, 100, 30);
        luser.setForeground(Color.white);
        add(luser);

        lpass = new JLabel("Password");
        lpass.setBounds(650, 200, 150, 50);
        lpass.setForeground(Color.white);
        add(lpass);

        //============set Button============
        blogin = new JButton("Login");
        blogin.setBounds(650, 300, 100, 30);
        blogin.setBackground(Color.black);
        blogin.setForeground(Color.white);
        add(blogin);
        blogin.addActionListener(this);

        bexit = new JButton("Cancel");
        bexit.setBounds(650, 370, 100, 30);
        bexit.setBackground(Color.black);
        bexit.setForeground(Color.white);
        add(bexit);
        bexit.addActionListener(this);

        bforget = new JButton("Forget Password");
        bforget.setBounds(820, 370, 140, 30);
        bforget.setBackground(Color.black);
        bforget.setForeground(Color.white);
        add(bforget);
        bforget.addActionListener(this);

        bchange = new JButton("Change Password");
        bchange.setBounds(820, 300, 140, 30);
        bchange.setBackground(Color.black);
        bchange.setForeground(Color.white);
        add(bchange);
        bchange.addActionListener(this);

        //============set text field============
        tuser = new JTextField();
        tuser.setBounds(750, 150, 200, 30);
        tuser.setFont(new Font("Monotype",Font.BOLD,18));
        add(tuser);

        //============set password field============
        tpass = new JPasswordField();
        tpass.setBounds(750, 210, 200, 30);
        tpass.setFont(new Font("Monotype",Font.BOLD,18));
        tpass.setEchoChar('•');
        add(tpass);

        //==========password show/hide label=========
        show = new JLabel("Show Password");
        show.setBounds(750, 240, 100, 30);
        show.setForeground(Color.orange);
        add(show);

        show.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show) {
                    tpass.setEchoChar((char) 0);
                    show.setVisible(false);
                    show2.setVisible(true);
                } else {
                    tpass.setEchoChar('•');
                }
            }
        });
        
        show2 = new JLabel("Hide Password");
        show2.setBounds(750, 240, 100, 30);
        show2.setForeground(Color.yellow);
        show2.setVisible(false);
        add(show2);

        show2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == show2) {
                    tpass.setEchoChar('•');
                    show2.setVisible(false);
                    show.setVisible(true);
                } else {
                    tpass.setEchoChar((char) 0);
                }
            }
        });
        
        //============set Image===================
        ImageIcon img = new ImageIcon("D:\\Project School Management System\\SMS\\src\\School_Management_System\\Icons\\loginPage.png");
        lpic = new JLabel(img);
        lpic.setBounds(500, 0, 600, 500);
        add(lpic);
        
        ImageIcon gifIcon = new ImageIcon("C:\\Users\\karan\\Downloads\\login.gif");
        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(0, 0, gifIcon.getIconWidth(), gifIcon.getIconHeight());
        add(gifLabel);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                welcomeFrame.setEnabled(true); // Re-enable parent JFrame
            }
        });
        
        //============set corsor===================
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        blogin.setCursor(c);
        bchange.setCursor(c);
        bforget.setCursor(c);
        bexit.setCursor(c);
        show.setCursor(c);
        show2.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == blogin) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                String username = tuser.getText();
                String password = tpass.getText();
                PreparedStatement pst = con.prepareStatement("select * from Teacher2 where username='" + username + "' and password='" + password + "'");
                ResultSet rest = pst.executeQuery();
                if (rest.next()) {
                    welcomeFrame.setVisible(false);
                    this.setVisible(false);
                    new FacultyHomePage(username).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "You Have Entered Wromg Username and Password......");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (ae.getSource() == bexit) {
            welcomeFrame.setEnabled(true);
            dispose();
        }
        if (ae.getSource() == bforget) {
            welcomeFrame.setEnabled(false);
            new ForgetPasswordTeacher(welcomeFrame).setVisible(true);
            dispose();
        }
        if (ae.getSource() == bchange) {
            welcomeFrame.setEnabled(false);
            new ChangePasswordTeacher(welcomeFrame).setVisible(true);
            dispose();
        }
    }
}
