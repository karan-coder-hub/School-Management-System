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

public class FacultyHomePage extends JFrame implements ActionListener {
    JButton labelUsername;
    JMenuItem viewTeacher, upStudent, viewStudent, bback;
    JMenuItem my, upClass, viewClass, viewSubject, markd, result;

    FacultyHomePage(String username) {
        
        //============set frame===========
        setTitle("Teacher Home Page");
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
        lsms.setForeground(Color.blue);
        add(lsms);
        lsms.setFont(f1);

        JLabel welcomeAdmin = new JLabel("Welcome Sir");
        welcomeAdmin.setBounds(200, 180, 250, 60);
        welcomeAdmin.setForeground(Color.white);
        add(welcomeAdmin);
        welcomeAdmin.setFont(f2);

        labelUsername = new JButton(username);
        labelUsername.setBounds(295, 193, 200, 35);
        labelUsername.setFont(f2);
        labelUsername.setForeground(Color.ORANGE);
        labelUsername.setContentAreaFilled(false); 
        labelUsername.setOpaque(false); 
        labelUsername.setBorderPainted(false);
        labelUsername.addActionListener(this);
        add(labelUsername);
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
            PreparedStatement pst = con.prepareStatement("SELECT image FROM teacher2 WHERE username = ?");
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

        my = new JMenuItem("                 My Profile                ");
        my.setBackground(Color.BLACK);
        my.setForeground(Color.white);
        my.addActionListener(this);
        menubar.add(my);

        viewTeacher = new JMenuItem("                  All Teachers                 ");
        viewTeacher.setBackground(Color.CYAN);
        viewTeacher.addActionListener(this);
        menubar.add(viewTeacher);

        JMenu studentPro = new JMenu("                 Students Profile              ");
        studentPro.setForeground(Color.MAGENTA);

        upStudent = new JMenuItem("Update Student Profile");
        upStudent.addActionListener(this);
        studentPro.add(upStudent);
        viewStudent = new JMenuItem("View Student Profile");
        viewStudent.addActionListener(this);
        studentPro.add(viewStudent);

        menubar.add(studentPro);

        JMenu classd = new JMenu("                       Class                        ");
        classd.setBackground(Color.white);
        classd.setForeground(Color.blue);

        upClass = new JMenuItem("Update Class Details");
        upClass.addActionListener(this);
        classd.add(upClass);
        viewClass = new JMenuItem("View Class Details");
        viewClass.addActionListener(this);
        classd.add(viewClass);
        menubar.add(classd);

        viewSubject = new JMenuItem("                     Subject                        ");
        viewSubject.setBackground(Color.GRAY);
        viewSubject.setForeground(Color.white);
        viewSubject.addActionListener(this);
        menubar.add(viewSubject);

        markd = new JMenuItem("                      Marks                               ");
        markd.setBackground(Color.yellow);
        markd.addActionListener(this);
        menubar.add(markd);

        result = new JMenuItem("                      Result                             ");
        result.setBackground(Color.RED);
        result.setForeground(Color.white);
        result.addActionListener(this);
        menubar.add(result);

        bback = new JMenuItem("                    Logout              ");
        bback.setBackground(Color.black);
        bback.setForeground(Color.white);
        bback.addActionListener(this);
        menubar.add(bback);

        setJMenuBar(menubar);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AdminHomePage111.jpg");
        JLabel lpic = new JLabel(img);
        lpic.setBounds(0, 0, 1580, 800);
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
        if (ae.getSource() == viewTeacher) {
            this.setEnabled(false);
            new ViewTeacher(this).setVisible(true);
        }
        if (ae.getSource() == viewStudent) {
            this.setEnabled(false);
            new ViewStudent(this).setVisible(true);
        }
        if (ae.getSource() == upStudent) {
            this.setEnabled(false);
            new UpdateStudent(this).setVisible(true);
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
        if (ae.getSource() == viewSubject) {
            this.setEnabled(false);
            new ViewSubject(this).setVisible(true);
        }
        if (ae.getSource() == result) {
            this.setEnabled(false);
            new AddResult(this).setVisible(true);
        }
        if (ae.getSource() == labelUsername) {
            this.setEnabled(false);
            String username = labelUsername.getText();
            new MyProfile(username, this).setVisible(true);
        }
        if (ae.getSource() == my) {
            this.setEnabled(false);
            String username = labelUsername.getText();
            new MyProfile(username, this).setVisible(true);
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
