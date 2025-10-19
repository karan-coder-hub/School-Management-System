package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class AdminHomePage extends JFrame implements ActionListener {
    JMenuItem addTeacher, upTeacher, viewTeacher, removeTeacher, addStudent, upStudent, viewStudent, removeStudent;
    JMenuItem addClass, upClass, viewClass, addSubject, viewSubject, markd, result, bback;

    AdminHomePage() {
        
        //============set frame===========
        setTitle("Admin Home Page");
        setSize(1530, 810);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 80);
        Font f2 = new Font("Monotype Corsiva", Font.BOLD, 25);

        //============set Font Label===========
        JLabel lsms = new JLabel("School Management System");
        lsms.setBounds(80, 75, 1000, 100);
        lsms.setForeground(Color.white);
        add(lsms);
        lsms.setFont(f1);

        JLabel welcomeAdmin = new JLabel("Welcome Admin");
        welcomeAdmin.setBounds(80, 150, 250, 60);
        welcomeAdmin.setForeground(Color.white);
        add(welcomeAdmin);
        welcomeAdmin.setFont(f2);

        //============set Menubar===========
        JMenuBar menubar = new JMenuBar();

        JMenu teacherPro = new JMenu("                Teachers Profile               ");
        addTeacher = new JMenuItem("Add Teacher Details");
        addTeacher.addActionListener(this);
        teacherPro.add(addTeacher);
        upTeacher = new JMenuItem("Update Teacher Profile");
        upTeacher.addActionListener(this);
        teacherPro.add(upTeacher);
        viewTeacher = new JMenuItem("View Teachers Details");
        viewTeacher.addActionListener(this);
        teacherPro.add(viewTeacher);
        removeTeacher = new JMenuItem("Remove Teacher");
        removeTeacher.addActionListener(this);
        teacherPro.add(removeTeacher);
        menubar.add(teacherPro);

        JMenu studentPro = new JMenu("                    Students Profile                ");
        addStudent = new JMenuItem("Add Student Details");
        addStudent.addActionListener(this);
        studentPro.add(addStudent);
        upStudent = new JMenuItem("Update Student Profile");
        upStudent.addActionListener(this);
        studentPro.add(upStudent);
        viewStudent = new JMenuItem("View Student Profile");
        viewStudent.addActionListener(this);
        studentPro.add(viewStudent);
        removeStudent = new JMenuItem("Remove Student");
        removeStudent.addActionListener(this);
        studentPro.add(removeStudent);
        menubar.add(studentPro);

        JMenu classd = new JMenu("                          Class                        ");
        addClass = new JMenuItem("Add New Class");
        addClass.addActionListener(this);
        classd.add(addClass);
        upClass = new JMenuItem("Update Class Details");
        upClass.addActionListener(this);
        classd.add(upClass);
        viewClass = new JMenuItem("View Class Details");
        viewClass.addActionListener(this);
        classd.add(viewClass);
        menubar.add(classd);

        JMenu subjectd = new JMenu("                   Subject                          ");
        addSubject = new JMenuItem("  Add Subject");
        addSubject.addActionListener(this);
        subjectd.add(addSubject);

        viewSubject = new JMenuItem("  View Subject");
        viewSubject.addActionListener(this);
        subjectd.add(viewSubject);

        menubar.add(subjectd);

        markd = new JMenuItem("                               Marks");
        markd.setBackground(Color.yellow);
        //markd.setForeground(Color.red);
        markd.addActionListener(this);
        menubar.add(markd);

        result = new JMenuItem("                             Result");
        result.setBackground(Color.RED);
        result.setForeground(Color.white);
        result.addActionListener(this);
        menubar.add(result);

        bback = new JMenuItem("                            Logout");
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        bback.addActionListener(this);
        menubar.add(bback);
        bback.addActionListener(this);

        setJMenuBar(menubar);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AdminG.jpg");
        JLabel lpic = new JLabel(img);
        lpic.setBounds(0, 0, 1580, 800);
        add(lpic);
        
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        menubar.setCursor(c);
        bback.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bback) {
            //System.exit(0);
            dispose();
            new Welcome().setVisible(true);
        }
        if (ae.getSource() == addTeacher) {
            this.setEnabled(false);
            new AddTeacher(this).setVisible(true);
        }
        if (ae.getSource() == upTeacher) {
            this.setEnabled(false);
            new UpdateTeacher(this).setVisible(true);
        }
        if (ae.getSource() == viewTeacher) {
            this.setEnabled(false);
            new ViewTeacher(this).setVisible(true);
        }
        if (ae.getSource() == removeTeacher) {
            this.setEnabled(false);
            new RemoveTeacher(this).setVisible(true);
        }
        if (ae.getSource() == addStudent) {
            this.setEnabled(false);
            new AddStudent(this).setVisible(true);
        }
        if (ae.getSource() == viewStudent) {
            this.setEnabled(false);
            new ViewStudent(this).setVisible(true);
        }
        if (ae.getSource() == upStudent) {
            this.setEnabled(false);
            new UpdateStudent(this).setVisible(true);
        }
        if (ae.getSource() == removeStudent) {
            this.setEnabled(false);
            new RemoveStudent(this).setVisible(true);
        }
        if (ae.getSource() == addClass) {
            this.setEnabled(false);
            new AddClass(this).setVisible(true);
        }
        if (ae.getSource() == upClass) {
            this.setEnabled(false);
            new UpdateClass(this).setVisible(true);
        }
        if (ae.getSource() == viewClass) {
            this.setEnabled(false);
            new ViewClass(this).setVisible(true);
        }
        if (ae.getSource() == markd) {
            this.setEnabled(false);
            new AddMarks(this).setVisible(true);
        }
        if (ae.getSource() == addSubject) {
            this.setEnabled(false);
            new AddSubject(this).setVisible(true);
        }
        if (ae.getSource() == viewSubject) {
            this.setEnabled(false);
            new ViewSubject(this).setVisible(true);
        }
        if (ae.getSource() == result) {
            this.setEnabled(false);
            new AddResult(this).setVisible(true);
        }
    }
}
