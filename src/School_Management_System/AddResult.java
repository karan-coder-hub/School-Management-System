package School_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class AddResult extends JFrame implements ActionListener {
    JFrame adminHomePage;

    JTable resultsTable;
    DefaultTableModel tableModel;
    JTextField studentNameField, rollNoField, mathsField, scienceField, englishField, historyField, geoField, econField;
    JButton badd, bback;
    Connection connection;

    public AddResult(JFrame adminHomePage) {
        this.adminHomePage = adminHomePage;
        
        //======================Set up the frame==============================
        setTitle("Add Results of Students");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //=====================Initialize the database connection=============
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
        }

        //================Table for displaying student results================
        String[] columnNames = {"UserName", "Roll No", "Mathematics", "Science", "English", "History", "Geography", "Economics", "Total Marks", "Percentage", "Grade", "Result"};
        tableModel = new DefaultTableModel(columnNames, 0);

        resultsTable = new JTable(tableModel);
        resultsTable.setBackground(Color.black);
        resultsTable.setForeground(Color.white);
        JScrollPane scrollPane = new JScrollPane(resultsTable);
        add(scrollPane, BorderLayout.CENTER);

        // Input fields for adding new student
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(10, 2));

        inputPanel.add(new JLabel("Student Username:"));

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(160, 160, 170, 30);
        inputPanel.add(comboBox);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String selectedItem = (String) comboBox.getSelectedItem();

                studentNameField = new JTextField();
                //add(tusername);
                StudentUsername(selectedItem);
            }
        });
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT username FROM Student2");

            while (rs.next()) {
                comboBox.addItem(rs.getString("username"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        inputPanel.add(new JLabel("Roll No:"));
        rollNoField = new JTextField();
        inputPanel.add(rollNoField);

        inputPanel.add(new JLabel("Mathematics:"));
        mathsField = new JTextField();
        inputPanel.add(mathsField);

        inputPanel.add(new JLabel("Science:"));
        scienceField = new JTextField();
        inputPanel.add(scienceField);

        inputPanel.add(new JLabel("English:"));
        englishField = new JTextField();
        inputPanel.add(englishField);

        inputPanel.add(new JLabel("History:"));
        historyField = new JTextField();
        inputPanel.add(historyField);

        inputPanel.add(new JLabel("Geography:"));
        geoField = new JTextField();
        inputPanel.add(geoField);

        inputPanel.add(new JLabel("Economics:"));
        econField = new JTextField();
        inputPanel.add(econField);

        bback = new JButton("Go To Back");
        bback.setBackground(Color.yellow);
        bback.setForeground(Color.red);
        inputPanel.add(bback);
        add(inputPanel, BorderLayout.SOUTH);
        bback.addActionListener((ActionListener) this);

        badd = new JButton("Add Result");
        badd.setBackground(Color.black);
        badd.setForeground(Color.white);
        inputPanel.add(badd);
        add(inputPanel, BorderLayout.SOUTH);
        badd.addActionListener((ActionListener) this);

        // Load existing results into the table
        loadStudentResults();
        
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

        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\loginPage.png");
        JLabel lpic = new JLabel(img);
        lpic.setBounds(0, 0, 600, 500);
        //inputPanel.add(lpic);
    }

    public void StudentUsername(String username) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123"); // Update with your DB credentials
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Student2 WHERE username = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                studentNameField.setText(rs.getString("username"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == badd) {
            if (studentNameField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Select Student Username.");
            } else if (rollNoField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Student Roll Number.");
            } else if (mathsField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Marks of Mathimatics");
            } else if (scienceField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Marks of Science Subject");
            } else if (englishField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Marks of English Subject");
            } else if (historyField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Marks of History Subject");
            } else if (geoField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Marks of Geography Subject");
            } else if (econField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Marks of Economics Subject");
            } else {
                addStudent();
            }
        }
        if (e.getSource() == bback) {
            adminHomePage.setEnabled(true);
            dispose();
        }
    }

    private void loadStudentResults() {
        String query = "SELECT student_name, roll_no, mathematics, science, english, history, geography, economics, "
                + "(mathematics + science + english + history + geography + economics) AS total_marks, "
                + "((mathematics + science + english + history + geography + economics) / 600) * 100 AS percentage, "
                + "CASE WHEN ((mathematics + science + english + history + geography + economics) / 600) * 100 >= 60 THEN 'A' "
                + "WHEN ((mathematics + science + english + history + geography + economics) / 600) * 100 >= 50 THEN 'B' ELSE 'C' END AS grade, "
                + "CASE WHEN ((mathematics + science + english + history + geography + economics) / 600) * 100 >= 33 THEN 'Pass' ELSE 'Fail' END AS result "
                + "FROM student_results";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Object[] row
                        = {
                            rs.getString("student_name"),
                            rs.getInt("roll_no"),
                            rs.getInt("mathematics"),
                            rs.getInt("science"),
                            rs.getInt("english"),
                            rs.getInt("history"),
                            rs.getInt("geography"),
                            rs.getInt("economics"),
                            rs.getInt("total_marks"),
                            rs.getDouble("percentage"),
                            rs.getString("grade"),
                            rs.getString("result")
                        };
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading student results: " + e.getMessage());
        }
    }

    private void addStudent() {
        String studentName = studentNameField.getText();
        int rollNo = Integer.parseInt(rollNoField.getText());
        int maths = Integer.parseInt(mathsField.getText());
        int science = Integer.parseInt(scienceField.getText());
        int english = Integer.parseInt(englishField.getText());
        int history = Integer.parseInt(historyField.getText());
        int geo = Integer.parseInt(geoField.getText());
        int econ = Integer.parseInt(econField.getText());

        int totalMarks = maths + science + english + history + geo + econ;
        double percentage = ((double) totalMarks / 600) * 100;
        String grade = (percentage >= 60) ? "A" : (percentage >= 50) ? "B" : "C";
        String result = (percentage >= 33) ? "Pass" : "Fail";

        String q = "INSERT INTO student_results (student_name, roll_no, mathematics, science, english, history, geography, economics, total_marks, percentage, grade, result) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(q);

            stmt.setString(1, studentName);
            stmt.setInt(2, rollNo);
            stmt.setInt(3, maths);
            stmt.setInt(4, science);
            stmt.setInt(5, english);
            stmt.setInt(6, history);
            stmt.setInt(7, geo);
            stmt.setInt(8, econ);
            stmt.setInt(9, totalMarks);
            stmt.setDouble(10, percentage);
            stmt.setString(11, grade);
            stmt.setString(12, result);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Result added successfully!");

            studentNameField.setText("");
            rollNoField.setText("");
            mathsField.setText("");
            scienceField.setText("");
            englishField.setText("");
            historyField.setText("");
            geoField.setText("");
            econField.setText("");

            tableModel.setRowCount(0);  
            loadStudentResults();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding student: " + e.getMessage());
        }
    }

}
