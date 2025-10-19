package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class UpdateClass extends JFrame implements ActionListener {
    JFrame adminHomePage;
    
    JTextField tenrolled, tclassTeacher;
    JButton bupdate, bback;
    JComboBox cbstrength, cbsection, cbclass;

    UpdateClass(JFrame adminHomePage) {
        this.adminHomePage = adminHomePage;
        
        JLabel ltitle, lclass, lsection, lstrength, lenrolled, lteacher, lpic;

        //============set frame===========
        setTitle("Update Class");
        setSize(700, 450);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);

        //============set Font Label===========
        ltitle = new JLabel("Updare Class");
        ltitle.setBounds(100, 30, 400, 50);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        lclass = new JLabel("Class Name");
        lclass.setBounds(50, 350, 100, 30);
        lclass.setForeground(Color.white);
        add(lclass);

        lsection = new JLabel("Section");
        lsection.setBounds(50, 160, 100, 30);
        lsection.setForeground(Color.white);
        add(lsection);

        lstrength = new JLabel("Student_Strength");
        lstrength.setBounds(50, 220, 110, 30);
        lstrength.setForeground(Color.white);
        add(lstrength);

        lenrolled = new JLabel("Enrolled_Student");
        lenrolled.setBounds(50, 280, 100, 30);
        lenrolled.setForeground(Color.white);
        add(lenrolled);

        lteacher = new JLabel("Class_Teacher");
        lteacher.setBounds(50, 100, 100, 30);
        lteacher.setForeground(Color.white);
        add(lteacher);

        //============set combobox============
        cbclass = new JComboBox();
        cbclass.addItem("-select-");
        cbclass.addItem("1");
        cbclass.addItem("2");
        cbclass.addItem("3");
        cbclass.addItem("4");
        cbclass.addItem("5");
        cbclass.addItem("6");
        cbclass.addItem("7");
        cbclass.addItem("8");
        cbclass.addItem("9");
        cbclass.addItem("10");
        cbclass.addItem("11");
        cbclass.addItem("12");
        cbclass.setBounds(250, 350, 100, 30);
        cbclass.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbclass);

        cbsection = new JComboBox();
        cbsection.addItem("-select-");
        cbsection.addItem("A");
        cbsection.addItem("B");
        cbsection.addItem("C");
        cbsection.addItem("D");
        cbsection.setBounds(250, 160, 100, 30);
        cbsection.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbsection);

        cbstrength = new JComboBox();
        cbstrength.addItem("-select-");
        cbstrength.addItem("20");
        cbstrength.addItem("30");
        cbstrength.addItem("40");
        cbstrength.addItem("50");
        cbstrength.setBounds(250, 220, 100, 30);
        cbstrength.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbstrength);

        //============set TextField============
        tenrolled = new JTextField();
        tenrolled.setBounds(250, 280, 100, 30);
        add(tenrolled);

        //============set Button============
        bupdate = new JButton("Update");
        bupdate.setBounds(400, 350, 100, 30);
        bupdate.setBackground(Color.black);
        bupdate.setForeground(Color.white);
        add(bupdate);
        bupdate.addActionListener(this);

        bback = new JButton("Back");
        bback.setBounds(550, 350, 100, 30);
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        add(bback);
        bback.addActionListener(this);

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bupdate.setCursor(c);
        bback.setCursor(c);

        //============set ComboBox===================
        JComboBox<String> comboBox = new JComboBox<>();
        //comboBox.setBounds(450,250,170,30);
        comboBox.setBounds(250, 100, 100, 30);
        add(comboBox);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String selectedItem = (String) comboBox.getSelectedItem();

                tclassTeacher = new JTextField();
                // tclassTeacher.setBounds(250,350,100,30);
                // add(tclassTeacher);

                loadStudentData(selectedItem);
            }
        });
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Class_Teacher FROM Class");

            while (rs.next()) {
                comboBox.addItem(rs.getString("Class_Teacher"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                adminHomePage.setEnabled(true); 
                dispose();
            }
        });

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AddClass.png");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 700, 450);
        add(lpic);

    }

    private void loadStudentData(String Class_Teacher) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Class WHERE Class_Teacher = ?");
            pst.setString(1, Class_Teacher);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cbclass.setSelectedItem(rs.getString("class"));
                cbsection.setSelectedItem(rs.getString("Section"));
                cbstrength.setSelectedItem(rs.getString("Student_Strength"));
                tenrolled.setText(rs.getString("Enrolled_Student"));
                tclassTeacher.setText(rs.getString("Class_Teacher"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bupdate) {
            updateClassData();
        } else if (ae.getSource() == bback) {
            adminHomePage.setEnabled(true);
            dispose();
        }
    }

    private void updateClassData() {
        if (cbclass.getSelectedItem().equals("-select-")) {
            JOptionPane.showMessageDialog(null, "Select A Class");
        } else if (cbsection.getSelectedItem().equals("-select-")) {
            JOptionPane.showMessageDialog(null, "Please Select Section");
        } else if (cbstrength.getSelectedItem().equals("-select-")) {
            JOptionPane.showMessageDialog(null, "Please Select Strenght");
        } else if (tenrolled.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Fill Up Number of Enrolled Students");
        } else if (tclassTeacher.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter Class Teacher Name");
        } else {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                PreparedStatement pst = con.prepareStatement("UPDATE Class SET class=?, Section=?, Student_Strength=?, Enrolled_Students=? WHERE Class_Teacher=?");

                pst.setString(1, cbclass.getSelectedItem().toString());
                pst.setString(2, cbsection.getSelectedItem().toString());
                pst.setString(3, cbstrength.getSelectedItem().toString());
                pst.setString(4, tenrolled.getText());
                pst.setString(5, tclassTeacher.getText());

                int rowsUpdated = pst.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Class details updated successfully!");
                }
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
