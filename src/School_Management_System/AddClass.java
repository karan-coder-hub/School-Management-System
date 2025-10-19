package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class AddClass extends JFrame implements ActionListener {
    JFrame adminHomePage;
    
    JTextField tenrolled, tclassTeacher;
    JButton badd, bback;
    JComboBox cbstrength, cbsection, cbclass;

    AddClass(JFrame adminHomePage) {
        this.adminHomePage = adminHomePage;
        
        JLabel ltitle, lclass, lsection, lstrength, lenrolled, lteacher, lpic;

        //============set frame===========
        setTitle("Add New Class");
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
        ltitle = new JLabel("Add New Class");
        ltitle.setBounds(70, 30, 400, 50);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        lclass = new JLabel("Class Name");
        lclass.setBounds(50, 160, 100, 30);
        lclass.setForeground(Color.white);
        add(lclass);

        lsection = new JLabel("Section");
        lsection.setBounds(50, 220, 100, 30);
        lsection.setForeground(Color.white);
        add(lsection);

        lstrength = new JLabel("Student_Strength");
        lstrength.setBounds(50, 280, 110, 30);
        lstrength.setForeground(Color.white);
        add(lstrength);

        lenrolled = new JLabel("Enrolled_Student");
        lenrolled.setBounds(50, 350, 100, 30);
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
        cbclass.setBounds(250, 160, 100, 30);
        cbclass.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbclass);

        cbsection = new JComboBox();
        cbsection.addItem("-select-");
        cbsection.addItem("A");
        cbsection.addItem("B");
        cbsection.addItem("C");
        cbsection.addItem("D");
        cbsection.setBounds(250, 220, 100, 30);
        cbsection.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbsection);

        cbstrength = new JComboBox();
        cbstrength.addItem("-select-");
        cbstrength.addItem("20");
        cbstrength.addItem("30");
        cbstrength.addItem("40");
        cbstrength.addItem("50");
        cbstrength.setBounds(250, 280, 100, 30);
        cbstrength.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbstrength);

        //============set TextField============
        tenrolled = new JTextField();
        tenrolled.setBounds(250, 350, 100, 30);
        add(tenrolled);

        //============set Button============
        badd = new JButton("Add");
        badd.setBounds(400, 350, 100, 30);
        badd.setBackground(Color.black);
        badd.setForeground(Color.white);
        add(badd);
        badd.addActionListener(this);

        bback = new JButton("Cancel");
        bback.setBounds(550, 350, 100, 30);
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        add(bback);
        bback.addActionListener(this);

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        badd.setCursor(c);
        bback.setCursor(c);

        //============set ComboBox===================
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(250, 100, 100, 30);
        add(comboBox);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String selectedItem = (String) comboBox.getSelectedItem();

                tclassTeacher = new JTextField();
                loadTeacherUsername(selectedItem);
            }
        });
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT username FROM Teacher2");

            while (rs.next()) {
                comboBox.addItem(rs.getString("username"));
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

    private void loadTeacherUsername(String username) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Teacher2 WHERE username = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                tclassTeacher.setText(rs.getString("username"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == badd) {
            addClassData();
        } else if (ae.getSource() == bback) {
            adminHomePage.setEnabled(true);
            dispose();
        }
    }

    private void addClassData() {
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
                String sclass = cbclass.getSelectedItem().toString();
                String section = cbsection.getSelectedItem().toString();
                String question = cbstrength.getSelectedItem().toString();
                String enrolled = tenrolled.getText();
                String classTeacher = tclassTeacher.getText();

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                PreparedStatement pst = con.prepareStatement("insert into Class(class, Section, Student_Strength, Enrolled_Students,Class_Teacher)values(?,?,?,?,?);");

                pst.setString(1, sclass);
                pst.setString(2, section);
                pst.setString(3, question);
                pst.setString(4, enrolled);
                pst.setString(5, classTeacher);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Class Add Successefully....");

                cbclass.setSelectedIndex(0);
                cbsection.setSelectedIndex(0);
                cbstrength.setSelectedIndex(0);
                tenrolled.setText("");
                tclassTeacher.setText("");
                cbclass.requestFocus();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
