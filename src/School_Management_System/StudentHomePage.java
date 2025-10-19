package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class StudentHomePage extends JFrame implements ActionListener {

    JMenuItem my, studentd, teacherd, result, bback;
    JButton labelUsername;

    StudentHomePage(String username) {

        //============set frame===========
        setTitle("Student Home Page");
        setSize(1530, 810);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 80);
        Font f2 = new Font("Monotype Corsiva", Font.BOLD, 24);

        //============set Font Label===========
        JLabel lsms = new JLabel("School Management System");
        lsms.setBounds(80, 75, 1000, 100);
        lsms.setForeground(Color.CYAN);
        add(lsms);
        lsms.setFont(f1);

        JLabel welcomeAdmin = new JLabel("Welcome Student");
        welcomeAdmin.setBounds(200, 180, 250, 60);
        welcomeAdmin.setForeground(Color.white);
        add(welcomeAdmin);
        welcomeAdmin.setFont(f2);

        labelUsername = new JButton(username);
        labelUsername.setBounds(350, 193, 200, 35);
        labelUsername.setFont(f2);
        labelUsername.setForeground(Color.ORANGE);
        labelUsername.setContentAreaFilled(false);
        labelUsername.setOpaque(false);
        labelUsername.setBorderPainted(false);
        labelUsername.addActionListener(this);
        add(labelUsername);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            PreparedStatement pst = con.prepareStatement("SELECT image FROM Student2 WHERE username = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                InputStream input = rs.getBinaryStream("image");
                byte[] buffer = input.readAllBytes();
                ImageIcon imageIcon = new ImageIcon(buffer);
                Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                JLabel profile = new JLabel();
                profile.setBounds(80, 155, 100, 100);
                profile.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                add(profile);
                profile.setIcon(new ImageIcon(image));
                profile.setText("");
                profile.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        showFullImage(imageIcon);
                    }
                });
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(StudentHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }

        //============set Menubar===========
        JMenuBar menubar = new JMenuBar();

        my = new JMenuItem("                                           My Profile");
        my.setBackground(Color.black);
        my.setForeground(Color.white);
        my.addActionListener(this);
        menubar.add(my);

        JMenu details = new JMenu("                                                Details                                                 ");
        details.setForeground(Color.magenta);
        menubar.add(details);

        studentd = new JMenuItem("Students Details");
        teacherd = new JMenuItem("Teacher Details");

        details.add(studentd);
        details.add(teacherd);
        studentd.addActionListener(this);
        teacherd.addActionListener(this);

        result = new JMenuItem("                                                 Result");
        result.setBackground(Color.red);
        result.setForeground(Color.yellow);
        result.addActionListener(this);
        menubar.add(result);

        bback = new JMenuItem("                                                   Logout");
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        bback.addActionListener(this);
        menubar.add(bback);

        setJMenuBar(menubar);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\StudentHomePage111.jpg");
        JLabel lpic = new JLabel(img);
        lpic.setBounds(0, 0, 1570, 800);
        add(lpic);

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        menubar.setCursor(c);
        labelUsername.setCursor(c);
        bback.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bback) {
            dispose();
            new Welcome().setVisible(true);
        }
        if (ae.getSource() == studentd) {
            this.setEnabled(false);
            new ViewStudent(this).setVisible(true);
        }
        if (ae.getSource() == teacherd) {
            this.setEnabled(false);
            new ViewTeacher(this).setVisible(true);
        }
        if (ae.getSource() == result) {
            this.setEnabled(false);
            String username = labelUsername.getText();
            new MyResult(username, this).setVisible(true);
        }
        if (ae.getSource() == my) {
            this.setEnabled(false);
            String username = labelUsername.getText();
            new MyProfile2(username, this).setVisible(true);
        }
        if (ae.getSource() == labelUsername) {
            this.setEnabled(false);
            String username = labelUsername.getText();
            new MyProfile2(username, this).setVisible(true);
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

//    public static void main(String arg[]) {
//        new StudentHomePage("karan_123").setVisible(true);
//    }
}
