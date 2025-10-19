package School_Management_System;

import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class UpdateStudent extends JFrame implements ActionListener {

    JFrame adminHomePage;

    JTextField tname, tusername, tpass, temail, tfather, tcontact, taddress, tgender, tage, tdob, tans;
    JButton bupdate, bback;
    JComboBox cb1, cbsection, cbclass;
    JLabel imageLabel;
    File selectedFile;
    byte[] buffer;

    UpdateStudent(JFrame adminHomePage) {
        this.adminHomePage = adminHomePage;
        JLabel ltitle, lname, lusername, lpass, lemail, lfather, lcontact, lqualification, laddress, lgender, lteachingEx, lage, ldob, lsec, lans, lpic;

        //===========Frame setup===================
        setTitle("Update Student Form");
        setSize(800, 635);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
        setIconImage(icon.getImage());

        imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);
        imageLabel.setBounds(200, 25, 50, 50);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        add(imageLabel, BorderLayout.CENTER);
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectImage();
            }
        });

        //============set Font===========
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 26);

        //============set Font Label===========
        ltitle = new JLabel("Update Student Details");
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

        lqualification = new JLabel("Section");
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

        lteachingEx = new JLabel("Class");
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

        cbsection = new JComboBox();
        cbsection.addItem("-select-");
        cbsection.addItem("A");
        cbsection.addItem("B");
        cbsection.addItem("C");
        cbsection.addItem("D");
        cbsection.setBounds(160, 460, 170, 30);
        cbsection.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbsection);
        //-------------------------------------------------------------

        taddress = new JTextField();
        taddress.setBounds(500, 100, 200, 30);
        add(taddress);

        tgender = new JTextField();
        tgender.setBounds(500, 160, 200, 30);
        add(tgender);

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
        cbclass.setBounds(500, 220, 200, 30);
        cbclass.setFont(new Font("Arial", Font.BOLD, 11));
        add(cbclass);

        tage = new JTextField();
        tage.setBounds(500, 280, 200, 30);
        add(tage);

        tdob = new JTextField();
        tdob.setBounds(500, 340, 200, 30);
        add(tdob);

        tans = new JTextField();
        tans.setBounds(500, 460, 200, 30);
        add(tans);

        bupdate = new JButton("Update");
        bupdate.setBounds(250, 540, 100, 30);
        bupdate.addActionListener(this);
        add(bupdate);

        bback = new JButton("Cancel");
        bback.setBounds(450, 540, 100, 30);
        bback.addActionListener(this);
        add(bback);

        cb1 = new JComboBox();
        cb1.addItem("-select-");
        cb1.addItem("YOUR FATHER NAME");
        cb1.addItem("YOUR MOTHER NAME");
        cb1.addItem("YOUR BROTHER NAME");
        cb1.addItem("YOUR SISTER NAME");
        cb1.setBounds(500, 400, 200, 30);
        add(cb1);

        //============set ComboBox===================
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(160, 160, 170, 30);
        add(comboBox);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String selectedItem = (String) comboBox.getSelectedItem();

                tusername = new JTextField();
                tusername.setBounds(160, 160, 150, 30);
                add(tusername);

                loadStudentData(selectedItem);
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

        //============set Image===================
        ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\JavaRK.png");
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
        bupdate.setCursor(c);
        bback.setCursor(c);
    }

    public void loadStudentData(String username) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123"); // Update with your DB credentials
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Student2 WHERE username = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                tname.setText(rs.getString("name"));
                tusername.setText(rs.getString("username"));
                tpass.setText(rs.getString("password"));
                temail.setText(rs.getString("email"));
                tfather.setText(rs.getString("father"));
                tcontact.setText(rs.getString("contact"));
                cbclass.setSelectedItem(rs.getString("class"));
                taddress.setText(rs.getString("address"));
                tgender.setText(rs.getString("gender"));
                cbsection.setSelectedItem(rs.getString("section"));
                tage.setText(rs.getString("age"));
                tdob.setText(rs.getString("dob"));
                cb1.setSelectedItem(rs.getString("securityquestion"));
                tans.setText(rs.getString("answer"));

                InputStream input = rs.getBinaryStream("image");
                buffer = input.readAllBytes();
                ImageIcon imageIcon = new ImageIcon(buffer);
                Image image = imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(image));
                imageLabel.setText("");
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(UpdateTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bupdate) {
            updateStudentData();
        } else if (ae.getSource() == bback) {
            adminHomePage.setEnabled(true);
            dispose();
        }
    }

    private void updateStudentData() {
        if (tname.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Student Nume.");
        } else if (tusername.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter Username.");
        } else if (tpass.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Create A Password");
        } else if (temail.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter An E-mail");
        } else if (tfather.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter Father Name of Student");
        } else if (tcontact.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Contact Number Missing");
        } else if (cbclass.getSelectedItem().equals("-select-")) {
            JOptionPane.showMessageDialog(null, "Chuse Class");
        } else if (taddress.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Teacher Address Missing");
        } else if (tgender.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter Gender of Teacher");
        } else if (cbsection.getSelectedItem().equals("-select-")) {
            JOptionPane.showMessageDialog(null, "Chuse Section");
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
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
                PreparedStatement pst = con.prepareStatement("UPDATE Student2 SET name=?, password=?, email=?, father=?, contact=?, class=?, address=?, gender=?, section=?, age=?, dob=?, securityquestion=?, answer=?, image=? WHERE username=?");
                pst.setString(1, tname.getText());
                pst.setString(2, tpass.getText());
                pst.setString(3, temail.getText());
                pst.setString(4, tfather.getText());
                pst.setString(5, tcontact.getText());
                pst.setString(6, cbclass.getSelectedItem().toString());
                pst.setString(7, taddress.getText());
                pst.setString(8, tgender.getText());
                pst.setString(9, cbsection.getSelectedItem().toString());
                pst.setString(10, tage.getText());
                pst.setString(11, tdob.getText());
                pst.setString(12, cb1.getSelectedItem().toString());
                pst.setString(13, tans.getText());
                if (selectedFile == null) {
                    pst.setBytes(14, buffer);
                } else {
                    FileInputStream fis = new FileInputStream(selectedFile);
                    byte[] imageBytes = fis.readAllBytes();
                    pst.setBytes(14, imageBytes);
                }
                pst.setString(15, tusername.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Student details updated successfully!");

                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter Correct Contact");
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
}
