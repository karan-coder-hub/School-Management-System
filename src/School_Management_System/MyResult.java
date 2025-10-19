package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class MyResult extends JFrame implements ActionListener {

    JLabel studentNameField, rollNoField, mathsField, scienceField, englishField, historyField, geoField, econField, total_marks, percentage, grade, result;
    JButton bback;
    JFrame studentHomePage;

    MyResult(String username, JFrame studentHomePage) {
        this.studentHomePage = studentHomePage;
        JLabel lpic, ltitle, lusername, lroll, lmaths, lscience, lenglish, lhistory, lgeo, lecon, ltotal, lpercentage, lgrade, lresult;
        Font f1;

        //==================Frame=======================
        setTitle("Student Result");
        setSize(736, 733);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set Font===========
        f1 = new Font("Monotype Corsiva", Font.BOLD, 26);

        //============set Font Label===========
        ltitle = new JLabel("My Result");
        ltitle.setBounds(300, 8, 200, 30);
        add(ltitle);
        ltitle.setFont(f1);

        JLabel sms = new JLabel("   School Management System");
        sms.setBounds(200, 75, 340, 50);
        add(sms);
        sms.setFont(f1);

        //============set Label===========
        lusername = new JLabel("Username:");
        lusername.setBounds(150, 200, 100, 30);
        add(lusername);

        studentNameField = new JLabel(username);
        studentNameField.setBounds(230, 200, 200, 30);
        add(studentNameField);

        lroll = new JLabel("Roll Number:");
        lroll.setBounds(380, 200, 100, 30);
        add(lroll);

        rollNoField = new JLabel("__________");
        rollNoField.setBounds(480, 200, 100, 30);
        add(rollNoField);

        lmaths = new JLabel("Mathematics:");
        lmaths.setBounds(80, 260, 100, 30);
        add(lmaths);

        lscience = new JLabel("Science:");
        lscience.setBounds(80, 320, 100, 30);
        add(lscience);

        mathsField = new JLabel("____");
        mathsField.setBounds(200, 260, 100, 30);
        add(mathsField);

        scienceField = new JLabel("____");
        scienceField.setBounds(200, 320, 100, 30);
        add(scienceField);

        ltotal = new JLabel("History:");
        ltotal.setBounds(500, 320, 100, 30);
        add(ltotal);

        lenglish = new JLabel("English:");
        lenglish.setBounds(500, 260, 100, 30);
        add(lenglish);

        englishField = new JLabel("____");
        englishField.setBounds(600, 260, 100, 30);
        add(englishField);

        historyField = new JLabel("____");
        historyField.setBounds(600, 320, 100, 30);
        add(historyField);

        lgeo = new JLabel("Geography:");
        lgeo.setBounds(280, 260, 100, 30);
        add(lgeo);

        lecon = new JLabel("Economics:");
        lecon.setBounds(280, 320, 100, 30);
        add(lecon);

        geoField = new JLabel("____");
        geoField.setBounds(400, 260, 100, 30);
        add(geoField);

        econField = new JLabel("____");
        econField.setBounds(400, 320, 100, 30);
        add(econField);

        //---------------------------------------------------------------------
        lhistory = new JLabel("Total Marks:");
        lhistory.setBounds(150, 400, 100, 30);
        add(lhistory);

        lpercentage = new JLabel("Percentage:");
        lpercentage.setBounds(150, 450, 100, 30);
        add(lpercentage);

        total_marks = new JLabel("____");
        total_marks.setBounds(270, 400, 100, 30);
        add(total_marks);

        percentage = new JLabel("______%");
        percentage.setBounds(270, 450, 100, 30);
        add(percentage);

        lgrade = new JLabel("Grade:");
        lgrade.setBounds(380, 400, 100, 30);
        add(lgrade);

        lresult = new JLabel("Result:");
        lresult.setBounds(380, 450, 100, 30);
        add(lresult);

        grade = new JLabel("____");
        grade.setBounds(470, 400, 100, 30);
        add(grade);

        result = new JLabel("_____");
        result.setBounds(470, 450, 100, 30);
        add(result);

        // --------------------- Back Button ---------------------------
        bback = new JButton("Back");
        bback.setBounds(583, 661, 100, 37);
        bback.setBackground(Color.blue);
        bback.setForeground(Color.white);
        bback.addActionListener(this);
        add(bback);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\Result12.jpg");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 736, 700);
        add(lpic);

        loadStudentData(username);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                studentHomePage.setEnabled(true);
            }
        });

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bback.setCursor(c);

        setResizable(false);
    }

    public void loadStudentData(String username) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM student_results WHERE student_name = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                studentNameField.setText(rs.getString("student_name"));
                rollNoField.setText(rs.getString("roll_no"));
                mathsField.setText(rs.getString("mathematics"));
                scienceField.setText(rs.getString("science"));
                englishField.setText(rs.getString("english"));
                historyField.setText(rs.getString("history"));
                geoField.setText(rs.getString("geography"));
                econField.setText(rs.getString("economics"));
                total_marks.setText(rs.getString("total_marks"));
                percentage.setText(rs.getString("percentage"));
                grade.setText(rs.getString("grade"));
                result.setText(rs.getString("result"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bback) {
            studentHomePage.setEnabled(true);
            dispose();
        }
    }

}
