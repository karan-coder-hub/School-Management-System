package School_Management_System;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.table.TableColumn;

public class ViewTeacher extends JFrame {

    private JTable table;
    private DefaultTableModel model;
    JLabel imageLabel;

    public ViewTeacher(JFrame studentHomePage) {
        setTitle("Teachers Details");
        setSize(1200, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        model = new DefaultTableModel(new String[]{"Name", "Username", "Email", "Father Name", "Contact Number", "Qualification", "Address", "Gender", "Teaching Exp.", "Age", "DOB", "Profile Pic."}, 0) {
            @Override
            public Class<?> getColumnClass(int column) {
                return column == 11 ? ImageIcon.class : String.class;
            }
        };
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        loadTableData();

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String username = model.getValueAt(selectedRow, 1).toString();
                    showDetails(username);
                }
            }
        });

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
    }

    private void loadTableData() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
            String query = "SELECT * FROM teacher2";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String father = rs.getString("father");
                String contact = rs.getString("contact");
                String qualification = rs.getString("qualification");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                String teachingExperience = rs.getString("teachingExperience");
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

    private void showDetails(String username) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
            String query = "SELECT * FROM teacher2 WHERE username = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                String username2 = rs.getString("username");
                String email = rs.getString("email");
                String father = rs.getString("father");
                String contact = rs.getString("contact");
                String qualification = rs.getString("qualification");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                String teachingExperience = rs.getString("teachingExperience");
                String age = rs.getString("age");
                String dob = rs.getString("dob");

                byte[] imgBytes = rs.getBytes("image");

                JDialog detailsFrame = new JDialog(this, "Details", true);
                detailsFrame.setSize(470, 320);
                detailsFrame.setLocationRelativeTo(null);
                detailsFrame.setLayout(null);
                detailsFrame.setResizable(false);

                if (imgBytes != null) {
                    ImageIcon imageIcon = new ImageIcon(imgBytes);
                    Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
                    imageLabel = new JLabel(new ImageIcon(img));
                    imageLabel.setBounds(15, 30, 220, 220);
                    imageLabel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            showFullImage(imageIcon);
                        }
                    });
                    detailsFrame.add(imageLabel);
                }
                JLabel Name = new JLabel("Name:  " + name);
                Name.setBounds(240, 20, 200, 30);
                Name.setForeground(Color.white);
                detailsFrame.add(Name);

                JLabel Username = new JLabel("Username:  " + username2);
                Username.setBounds(240, 40, 200, 30);
                Username.setForeground(Color.white);
                detailsFrame.add(Username);

                JLabel Email = new JLabel("Email:  " + email);
                Email.setBounds(240, 60, 200, 30);
                Email.setForeground(Color.white);
                detailsFrame.add(Email);

                JLabel Father = new JLabel("Father:  " + father);
                Father.setBounds(240, 80, 200, 30);
                Father.setForeground(Color.white);
                detailsFrame.add(Father);

                JLabel Contact = new JLabel("Contact:  " + contact);
                Contact.setBounds(240, 100, 200, 30);
                Contact.setForeground(Color.white);
                detailsFrame.add(Contact);

                JLabel Qualification = new JLabel("Qualification:  " + qualification);
                Qualification.setBounds(240, 120, 200, 30);
                Qualification.setForeground(Color.white);
                detailsFrame.add(Qualification);

                JLabel Address = new JLabel("Address:  " + address);
                Address.setBounds(240, 140, 200, 30);
                Address.setForeground(Color.white);
                detailsFrame.add(Address);

                JLabel Gender = new JLabel("Gender:  " + gender);
                Gender.setBounds(240, 160, 200, 30);
                Gender.setForeground(Color.white);
                detailsFrame.add(Gender);

                JLabel Teaching = new JLabel("Teaching Experience:  " + teachingExperience);
                Teaching.setBounds(240, 180, 200, 30);
                Teaching.setForeground(Color.white);
                detailsFrame.add(Teaching);

                JLabel Age = new JLabel("Age:  " + age);
                Age.setBounds(240, 200, 200, 30);
                Age.setForeground(Color.white);
                detailsFrame.add(Age);

                JLabel DOB = new JLabel("DOB:  " + dob);
                DOB.setBounds(240, 220, 200, 30);
                DOB.setForeground(Color.white);
                detailsFrame.add(DOB);

                ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\newwwwww.jpg");
                JLabel lpic = new JLabel(img);
                lpic.setBounds(0, 0, 480, 330);
                detailsFrame.add(lpic);

                detailsFrame.setVisible(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching details: " + e.getMessage());
        }
    }

    private void showFullImage(ImageIcon imageIcon) {
        JDialog fullImageFrame = new JDialog(this, "Profile Image", true);
        fullImageFrame.setSize(550, 580);
        fullImageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fullImageFrame.setLocationRelativeTo(null);
        fullImageFrame.setResizable(false);
        JLabel lblFullImage = new JLabel();
        lblFullImage.setHorizontalAlignment(JLabel.CENTER);
        Image fullImage = imageIcon.getImage().getScaledInstance(550, 550, Image.SCALE_SMOOTH);
        lblFullImage.setIcon(new ImageIcon(fullImage));
        fullImageFrame.add(lblFullImage);
        fullImageFrame.setVisible(true);
    }
}