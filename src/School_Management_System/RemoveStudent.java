package School_Management_System;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.TableColumn;

public class RemoveStudent extends JFrame {

    DefaultTableModel model;
    JTable table;

    public RemoveStudent(JFrame studentHomePage) {
        setTitle("Remove Students Details");
        setSize(1200, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        model = new DefaultTableModel(new String[]{"Name", "Username", "Email", "Father Name", "Contact Number", "Class", "Address", "Gender", "Section", "Age", "DOB", "Profile Pic."}, 0) {
            @Override
            public Class<?> getColumnClass(int column) {
                return column == 11 ? ImageIcon.class : String.class;
            }
        };
        
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        
        JButton deleteButton = new JButton("Remove Student");
        deleteButton.addActionListener(e -> removeTeacher());
        add(deleteButton, BorderLayout.SOUTH);

        loadTableData();

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                studentHomePage.setEnabled(true);
            }
        });

        table.setBackground(Color.black);
        table.setForeground(Color.white);
        table.setRowHeight(50);

        TableColumn image = table.getColumnModel().getColumn(11);
        image.setPreferredWidth(50);
        image.setMinWidth(50);
        image.setMaxWidth(50);
        
        setVisible(true);
    }

    private void loadTableData() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
            String query = "SELECT * FROM student2";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String father = rs.getString("father");
                String contact = rs.getString("contact");
                String qualification = rs.getString("class");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                String teachingExperience = rs.getString("section");
                String age = rs.getString("age");
                String dob = rs.getString("dob");

                byte[] imgBytes = rs.getBytes("image");
                ImageIcon imageIcon = null;
                if (imgBytes != null) {
                    Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    imageIcon = new ImageIcon(img);
                }

                model.addRow(new Object[]{name, username, email, father, contact, qualification, address, gender, teachingExperience, age, dob, imageIcon});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
        }
    }
    
    private void removeTeacher() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String username = model.getValueAt(selectedRow, 1).toString();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                String query = "DELETE FROM student2 WHERE username = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                preparedStatement.executeUpdate();

                model.removeRow(selectedRow);
                preparedStatement.close();
                connection.close();
                JOptionPane.showMessageDialog(this, "Student removed successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error removing student.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a student to remove.");
        }
    }

}
