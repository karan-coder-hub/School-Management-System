package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Welcome extends JFrame implements ActionListener {

    JMenuItem studentlogin, teacherlogin, adminlogin, feedback, about, exit;

    Welcome() {
        JLabel lpic, lsms, ldevelop, lkrn;
        Font f1, f2;

        //============set frame===========
        setTitle("Welcome Page");
        setSize(1530, 810);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set Font===========
        f1 = new Font("Monotype Corsiva", Font.BOLD, 80);
        f2 = new Font("Monotype Corsiva", Font.BOLD, 20);

        //============set Font Label===========
        lsms = new JLabel("School Management System");
        lsms.setBounds(50, 25, 1000, 100);
        add(lsms);
        lsms.setFont(f1);

        ldevelop = new JLabel("Developed By");
        ldevelop.setBounds(30, 670, 140, 50);
        ldevelop.setForeground(Color.white);
        add(ldevelop);
        ldevelop.setFont(f2);

        lkrn = new JLabel("Karan Kashyap");
        lkrn.setBounds(30, 700, 370, 40);
        lkrn.setForeground(Color.white);
        add(lkrn);
        lkrn.setFont(f2);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\welcomeG.jpg");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 1580, 800);
        add(lpic);

        //============set Menubar===========
        JMenuBar menubar = new JMenuBar();

        JMenu login = new JMenu("                        Login                          ");
        login.setFont(new Font("Arial", Font.BOLD, 15));

        studentlogin = new JMenuItem("Student Login");
        studentlogin.setFont(new Font("Arial", Font.BOLD, 15));
        studentlogin.setBackground(Color.pink);
        login.add(studentlogin);
        studentlogin.addActionListener(this);

        teacherlogin = new JMenuItem("Teacher Login");
        teacherlogin.setFont(new Font("Arial", Font.BOLD, 15));
        teacherlogin.setBackground(Color.pink);
        login.add(teacherlogin);
        teacherlogin.addActionListener(this);

        adminlogin = new JMenuItem("Admin Login");
        adminlogin.setFont(new Font("Arial", Font.BOLD, 15));
        adminlogin.setBackground(Color.pink);
        login.add(adminlogin);
        adminlogin.addActionListener(this);

        menubar.add(login);

        about = new JMenuItem("                        About");
        about.setFont(new Font("Arial", Font.BOLD, 15));
        about.setBackground(Color.yellow);
        menubar.add(about);
        about.addActionListener(this);

        feedback = new JMenuItem("                        Feedback");
        feedback.setFont(new Font("Arial", Font.BOLD, 15));
        feedback.setBackground(Color.orange);
        menubar.add(feedback);
        feedback.addActionListener(this);

        exit = new JMenuItem("                          Exit");
        exit.setFont(new Font("Arial", Font.BOLD, 15));
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        menubar.add(exit);
        exit.addActionListener(this);

        JMenu l = new JMenu("                                                                                                                                               ");
        menubar.add(l);
        setJMenuBar(menubar);

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        exit.setCursor(c);
        login.setCursor(c);
        studentlogin.setCursor(c);
        teacherlogin.setCursor(c);
        adminlogin.setCursor(c);
        feedback.setCursor(c);
        about.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        }
        if (ae.getSource() == studentlogin) {
            this.setEnabled(false);
            new LoginStudent(this).setVisible(true);
        }
        if (ae.getSource() == teacherlogin) {
            this.setEnabled(false);
            new LoginTeacher(this).setVisible(true);
        }
        if (ae.getSource() == adminlogin) {
            this.setEnabled(false);
            new LoginAdmin(this).setVisible(true);
        }
        if (ae.getSource() == feedback) {
            this.setEnabled(false);
            new Feedback(this).setVisible(true);
        }
        if (ae.getSource() == about) {
            this.setEnabled(false);
            new About(this).setVisible(true);
        }
    }

    public static void main(String arg[]) {
        new Welcome().setVisible(true);
    }
}
