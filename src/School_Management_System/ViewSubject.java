package School_Management_System;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ViewSubject extends JFrame {
    DefaultTableModel model;
    JTable table;

    ViewSubject(Frame studentHomePage) {
        setTitle("Class Details");
        setSize(400, 300);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        model = new DefaultTableModel();
        table = new JTable(model);
        table.setForeground(Color.white);
        table.setBackground(Color.black);

        model.addColumn("Subject Name");
        model.addColumn("Sabject Code");

        loadData();

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                studentHomePage.setEnabled(true);
            }
        });

        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void loadData() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Subject");

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getString("subjectCode"),
                    resultSet.getString("subjectName"),});
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
