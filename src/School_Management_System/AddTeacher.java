package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.*;
import java.sql.*;
import javax.imageio.ImageIO;

public class AddTeacher extends JFrame implements ActionListener {

    JFrame adminHomePage;

    JTextField tname, tusername, tpass, temail, tfather, tcontact, tqualification, taddress, tgender, tteachingEx, tage, tdob, tans;
    JButton bsubmit, bback;
    JComboBox cb1;
    JLabel imageLabel;
    File selectedFile, defaultImageFile;

    AddTeacher(JFrame adminHomePage) {
        this.adminHomePage = adminHomePage;

        JLabel ltitle, lname, lusername, lpass, lemail, lfather, lcontact, lqualification, laddress, lgender, lteachingEx, lage, ldob, lsec, lans, lpic;

        //============set frame===========
        setTitle("Add Teacher");
        setSize(800, 635);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        defaultImageFile = new File("src\\School_Management_System\\Icons\\AdTeacherImageDifault.jpg");

        imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);
        imageLabel.setBounds(200, 25, 50, 50);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(imageLabel, BorderLayout.CENTER);
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectImage();
            }
        });

        setDefaultImage();

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 26);

        //============set Font Label===========
        ltitle = new JLabel("Add New Teacher Registration");
        ltitle.setBounds(360, 30, 340, 50);
        ltitle.setForeground(Color.white);
        add(ltitle);
        ltitle.setFont(f1);

        //============set Label===========
        JLabel lpropic = new JLabel("Enter Profile Pic.");
        lpropic.setBounds(50, 40, 120, 30);
        lpropic.setForeground(Color.white);
        add(lpropic);

        lname = new JLabel("Name");
        lname.setBounds(50, 100, 100, 30);
        lname.setForeground(Color.white);
        add(lname);

        lusername = new JLabel("Username");
        lusername.setBounds(50, 160, 100, 30);
        lusername.setForeground(Color.white);
        add(lusername);

        lpass = new JLabel("Password");
        lpass.setBounds(50, 220, 100, 30);
        lpass.setForeground(Color.white);
        add(lpass);

        lemail = new JLabel("E-mail");
        lemail.setBounds(50, 280, 100, 30);
        lemail.setForeground(Color.white);
        add(lemail);

        lfather = new JLabel("Father Name");
        lfather.setBounds(50, 340, 100, 30);
        lfather.setForeground(Color.white);
        add(lfather);

        lcontact = new JLabel("Contact");
        lcontact.setBounds(50, 400, 100, 30);
        lcontact.setForeground(Color.white);
        add(lcontact);

        lqualification = new JLabel("Qualification");
        lqualification.setBounds(50, 460, 100, 30);
        lqualification.setForeground(Color.white);
        add(lqualification);
        //----------------------------------------------------------------------

        laddress = new JLabel("Address");
        laddress.setBounds(370, 100, 100, 30);
        laddress.setForeground(Color.white);
        add(laddress);

        lgender = new JLabel("Gender");
        lgender.setBounds(370, 160, 100, 30);
        lgender.setForeground(Color.white);
        add(lgender);

        lteachingEx = new JLabel("Teaching Exp.");
        lteachingEx.setBounds(370, 220, 100, 30);
        lteachingEx.setForeground(Color.white);
        add(lteachingEx);

        lage = new JLabel("Age");
        lage.setBounds(370, 280, 100, 30);
        lage.setForeground(Color.white);
        add(lage);

        ldob = new JLabel("Date Of Birth");
        ldob.setBounds(370, 340, 100, 30);
        ldob.setForeground(Color.white);
        add(ldob);

        lsec = new JLabel("Select Question");
        lsec.setBounds(370, 400, 100, 30);
        lsec.setForeground(Color.white);
        add(lsec);

        lans = new JLabel("Answer");
        lans.setBounds(370, 460, 100, 30);
        lans.setForeground(Color.white);
        add(lans);

        //============set text field============
        tname = new JTextField();
        tname.setBounds(160, 100, 170, 30);
        add(tname);

        tusername = new JTextField();
        tusername.setBounds(160, 160, 170, 30);
        add(tusername);

        tpass = new JTextField();
        tpass.setBounds(160, 220, 170, 30);
        add(tpass);

        temail = new JTextField();
        temail.setBounds(160, 280, 170, 30);
        add(temail);

        tfather = new JTextField();
        tfather.setBounds(160, 340, 170, 30);
        add(tfather);

        tcontact = new JTextField();
        tcontact.setBounds(160, 400, 170, 30);
        add(tcontact);

        tqualification = new JTextField();
        tqualification.setBounds(160, 460, 170, 30);
        add(tqualification);
        //-------------------------------------------------------------

        taddress = new JTextField();
        taddress.setBounds(500, 100, 200, 30);
        add(taddress);

        tgender = new JTextField();
        tgender.setBounds(500, 160, 200, 30);
        add(tgender);

        tteachingEx = new JTextField();
        tteachingEx.setBounds(500, 220, 200, 30);
        add(tteachingEx);

        tage = new JTextField();
        tage.setBounds(500, 280, 200, 30);
        add(tage);

        tdob = new JTextField();
        tdob.setBounds(500, 340, 200, 30);
        add(tdob);

        tans = new JTextField();
        tans.setBounds(500, 460, 200, 30);
        add(tans);

        //============set Button============
        bsubmit = new JButton("Submit");
        bsubmit.setBounds(250, 540, 100, 30);
        add(bsubmit);
        bsubmit.addActionListener(this);

        bback = new JButton("Cancel");
        bback.setBounds(450, 540, 100, 30);
        add(bback);
        bback.addActionListener(this);

        //============set combobox=================== 
        cb1 = new JComboBox();
        cb1.addItem("-select-");
        cb1.addItem("YOUR FATHER NAME");
        cb1.addItem("YOUR MOTHER NAME");
        cb1.addItem("YOUR BROTHER NAME");
        cb1.addItem("YOUR SISTER NAME");
        cb1.setBounds(500, 400, 200, 30);
        cb1.setFont(new Font("Arial", Font.BOLD, 11));
        add(cb1);

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AddTeacher.png");
        lpic = new JLabel(img);
        lpic.setBounds(0, 0, 800, 600);
        add(lpic);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                adminHomePage.setEnabled(true);
                dispose();
            }
        });

        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        bsubmit.setCursor(c);
        bback.setCursor(c);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bsubmit) {
            if (tname.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Teacher Nume.");
            } else if (tusername.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter Username.");
            } else if (tpass.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Create A Password");
            } else if (temail.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter An E-mail");
            } else if (tfather.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter Father Name of Teacher");
            } else if (tcontact.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Contact Number Missing");
            } else if (tqualification.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Provide Qualification of Teacher");
            } else if (taddress.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Teacher Address Missing");
            } else if (tgender.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Enter Gender of Teacher");
            } else if (tteachingEx.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Provide Teaching Experince of Teacher");
            } else if (tage.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Age of Teacher");
            } else if (tdob.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Fill Up Date of Birth");
            } else if (tans.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Type Answer Of Security Question");
            } else if (cb1.getSelectedItem().equals("-select-")) {
                JOptionPane.showMessageDialog(null, "Select A Security Question");
            } else if (tcontact.getText().length() == 10) {
                try {

                    String name = tname.getText();
                    String username = tusername.getText();
                    String password = tpass.getText();
                    String email = temail.getText();
                    String father = tfather.getText();
                    String contact = tcontact.getText();
                    String qualification = tqualification.getText();
                    String address = taddress.getText();
                    String gender = tgender.getText();
                    String teaching = tteachingEx.getText();
                    String age = tage.getText();
                    String dob = tdob.getText();
                    String question = cb1.getSelectedItem().toString();
                    String answer = tans.getText();
                    FileInputStream fis = new FileInputStream(selectedFile);
                    byte[] imageBytes = fis.readAllBytes();
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                    PreparedStatement pst = con.prepareStatement("insert into Teacher2(name,username,email,father,contact,qualification,address,gender,teachingExperience,age,dob,securityquestion,answer,password,image)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");

                    pst.setString(1, name);
                    pst.setString(2, username);
                    pst.setString(3, email);
                    pst.setString(4, father);
                    pst.setString(5, contact);
                    pst.setString(6, qualification);
                    pst.setString(7, address);
                    pst.setString(8, gender);
                    pst.setString(9, teaching);
                    pst.setString(10, age);
                    pst.setString(11, dob);
                    pst.setString(12, question);
                    pst.setString(13, answer);
                    pst.setString(14, password);
                    pst.setBytes(15, imageBytes);
                    
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Teacher Add Successefully....");

                    tname.setText("");
                    tusername.setText("");
                    tpass.setText("");
                    temail.setText("");
                    tfather.setText("");
                    tcontact.setText("");
                    tqualification.setText("");
                    taddress.setText("");
                    tgender.setText("");
                    tteachingEx.setText("");
                    tage.setText("");
                    tdob.setText("");
                    cb1.setSelectedIndex(0);
                    tans.setText("");
                    setDefaultImage();

                    tusername.requestFocus();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter Correct Contact");
            }
        }
        if (ae.getSource() == bback) {
            adminHomePage.setEnabled(true);
            dispose();
        }
    }

    private void selectImage() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            try {
                Image image = ImageIO.read(selectedFile).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(image));
                imageLabel.setText("");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error loading image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void setDefaultImage() {
        try {
            Image image = ImageIO.read(defaultImageFile).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
            imageLabel.setText("");
            selectedFile = defaultImageFile; // Set default image as the selected file
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error loading default image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
