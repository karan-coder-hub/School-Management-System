package School_Management_System;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    JButton bback;
    JFrame parentFrame;

    About(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        
        //============set frame===========
        setTitle("About School Management System");
        setSize(600, 511);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set textarea===========
        TextArea ta = new TextArea("""
                                   
                                      This is a Project work undertaken in context of partial fulfillment 
                                      of BCA.I have tried my best to make the complicated process of 
                                      School Management System as simple as possible using
                                      Structured & Modular technique & Menu oriented interface. I
                                      have tried to design the software in such a way that user may not 
                                      have any difficulty in using this package & further expansion is
                                      possible without much effort. Even though I cannot claim that 
                                      this work to be entirely exhaustive, the main purpose of my
                                      exercise is perform each Student\u2019s activity in computerized 
                                      way rather than manually which is time consuming.
                                   
                                      \tI am confident that this software package
                                      can be readily used by non-programming personal avoiding
                                      human handled chance of error. This project is used by
                                   
                                      \t1.Administrator (management of the School). 
                                   
                                      \t\u2022Administrator can maintain daily updates in the School records. 
                                   
                                      \tAdministrator is must be an authorized user.
                                      He can further change the password. There is the facility for
                                      password recovery, logout etc.
                                   
                                      \tThe main aim of the entire activity
                                      is to automate the process of activities of School like Classes
                                      activities, Admission of a New Student, Add Details about New
                                      Student  and New Teachers, In this Administrator Change details
                                      of school\u2019s Student and teacher
                                   
                                      \tThe limited time and resources have
                                      restricted us to incorporate, in this project, only a main activities
                                      that are performed in a School Management System,
                                      but utmost care has been taken to make the system efficient 
                                      and user friendly. \u201cSchool System\u201d has been designed to
                                      computerized the following functions that are performed by
                                      the system:
                                   
                                   
                                          \u2022\tLogin Students and Teachers
                                          \u2022       Teacher and Students can Change and Forget our password
                                          \u2022\tAdmission of New Student
                                          \u2022\tJoin a new Teacher
                                          \u2022\tChange the Details related to Students and Teachers 
                                          \u2022\tFeedback
                                          \u2022\tAbout of Projrct
                                   
                                   
                                   
                                          1)\tStatement of   
                                              \u2022\tTeachers
                                              \u2022\tStudents
                                          2)\tTotal number of 
                                              \u2022\tStudent in the school
                                              \u2022\tTeachers in the School
                                   
                                   
                                   \t\t\t\t                       Developed By
                                    \t\t\t\t            Karan Kashyap and Anuj Kumar Saini
                                   
                                   
                                   
                                   """);
        ta.setBounds(97, 0, 490, 475);
        ta.setBackground(Color.black);
        ta.setForeground(Color.white);
        ta.setFont(new Font("Arial", Font.BOLD, 13));
        ta.setEditable(false);
        add(ta);

        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\about2.jpg");
        JLabel lpic = new JLabel(img);
        lpic.setBounds(0, 0, 600, 500);
        add(lpic);

        bback = new JButton("back");
        bback.setBounds(10, 20, 70, 30);
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        add(bback);
        bback.addActionListener(this);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                parentFrame.setEnabled(true); // Re-enable parent JFrame
            }
        });

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bback.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bback) {
            parentFrame.setEnabled(true);
            dispose();
        }
    }
    
}
