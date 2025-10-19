└── src
    └── School_Management_System
        ├── About.java
        ├── AddClass.java
        ├── AddMarks.java
        ├── AddResult.java
        ├── AddStudent.java
        ├── AddSubject.java
        ├── AddTeacher.java
        ├── AdminHomePage.java
        ├── ChangePasswordAdmin.java
        ├── ChangePasswordStudent.java
        ├── ChangePasswordTeacher.java
        ├── FacultyHomePage.java
        ├── Feedback.java
        ├── ForgetPasswordAdmin.java
        ├── ForgetPasswordStudent.java
        ├── ForgetPasswordTeacher.java
        ├── LoginAdmin.java
        ├── LoginStudent.java
        ├── LoginTeacher.java
        ├── MyProfile.java
        ├── MyProfile2.java
        ├── MyResult.java
        ├── RemoveStudent.java
        ├── RemoveTeacher.java
        ├── StudentHomePage.java
        ├── UpdateClass.java
        ├── UpdateStudent.java
        ├── UpdateTeacher.java
        ├── ViewClass.java
        ├── ViewStudent.java
        ├── ViewSubject.java
        ├── ViewTeacher.java
        └── Welcome.java


/src/School_Management_System/About.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.*;
  4 | import javax.swing.*;
  5 | import java.awt.event.*;
  6 | 
  7 | public class About extends JFrame implements ActionListener {
  8 |     JButton bback;
  9 |     JFrame parentFrame;
 10 | 
 11 |     About(JFrame parentFrame) {
 12 |         this.parentFrame = parentFrame;
 13 |         
 14 |         //============set frame===========
 15 |         setTitle("About School Management System");
 16 |         setSize(600, 511);
 17 |         setLayout(null);
 18 |         setVisible(true);
 19 |         setLocationRelativeTo(null);
 20 |         setResizable(false);
 21 |         setResizable(false);
 22 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 23 |         setIconImage(icon.getImage());
 24 | 
 25 |         //============set textarea===========
 26 |         TextArea ta = new TextArea("""
 27 |                                    
 28 |                                       This is a Project work undertaken in context of partial fulfillment 
 29 |                                       of BCA.I have tried my best to make the complicated process of 
 30 |                                       School Management System as simple as possible using
 31 |                                       Structured & Modular technique & Menu oriented interface. I
 32 |                                       have tried to design the software in such a way that user may not 
 33 |                                       have any difficulty in using this package & further expansion is
 34 |                                       possible without much effort. Even though I cannot claim that 
 35 |                                       this work to be entirely exhaustive, the main purpose of my
 36 |                                       exercise is perform each Student\u2019s activity in computerized 
 37 |                                       way rather than manually which is time consuming.
 38 |                                    
 39 |                                       \tI am confident that this software package
 40 |                                       can be readily used by non-programming personal avoiding
 41 |                                       human handled chance of error. This project is used by
 42 |                                    
 43 |                                       \t1.Administrator (management of the School). 
 44 |                                    
 45 |                                       \t\u2022Administrator can maintain daily updates in the School records. 
 46 |                                    
 47 |                                       \tAdministrator is must be an authorized user.
 48 |                                       He can further change the password. There is the facility for
 49 |                                       password recovery, logout etc.
 50 |                                    
 51 |                                       \tThe main aim of the entire activity
 52 |                                       is to automate the process of activities of School like Classes
 53 |                                       activities, Admission of a New Student, Add Details about New
 54 |                                       Student  and New Teachers, In this Administrator Change details
 55 |                                       of school\u2019s Student and teacher
 56 |                                    
 57 |                                       \tThe limited time and resources have
 58 |                                       restricted us to incorporate, in this project, only a main activities
 59 |                                       that are performed in a School Management System,
 60 |                                       but utmost care has been taken to make the system efficient 
 61 |                                       and user friendly. \u201cSchool System\u201d has been designed to
 62 |                                       computerized the following functions that are performed by
 63 |                                       the system:
 64 |                                    
 65 |                                    
 66 |                                           \u2022\tLogin Students and Teachers
 67 |                                           \u2022       Teacher and Students can Change and Forget our password
 68 |                                           \u2022\tAdmission of New Student
 69 |                                           \u2022\tJoin a new Teacher
 70 |                                           \u2022\tChange the Details related to Students and Teachers 
 71 |                                           \u2022\tFeedback
 72 |                                           \u2022\tAbout of Projrct
 73 |                                    
 74 |                                    
 75 |                                    
 76 |                                           1)\tStatement of   
 77 |                                               \u2022\tTeachers
 78 |                                               \u2022\tStudents
 79 |                                           2)\tTotal number of 
 80 |                                               \u2022\tStudent in the school
 81 |                                               \u2022\tTeachers in the School
 82 |                                    
 83 |                                    
 84 |                                    \t\t\t\t                       Developed By
 85 |                                     \t\t\t\t            Karan Kashyap and Anuj Kumar Saini
 86 |                                    
 87 |                                    
 88 |                                    
 89 |                                    """);
 90 |         ta.setBounds(97, 0, 490, 475);
 91 |         ta.setBackground(Color.black);
 92 |         ta.setForeground(Color.white);
 93 |         ta.setFont(new Font("Arial", Font.BOLD, 13));
 94 |         ta.setEditable(false);
 95 |         add(ta);
 96 | 
 97 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\about2.jpg");
 98 |         JLabel lpic = new JLabel(img);
 99 |         lpic.setBounds(0, 0, 600, 500);
100 |         add(lpic);
101 | 
102 |         bback = new JButton("back");
103 |         bback.setBounds(10, 20, 70, 30);
104 |         bback.setBackground(Color.black);
105 |         bback.setForeground(Color.white);
106 |         add(bback);
107 |         bback.addActionListener(this);
108 |         
109 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
110 |             @Override
111 |             public void windowClosing(java.awt.event.WindowEvent e) {
112 |                 parentFrame.setEnabled(true); // Re-enable parent JFrame
113 |             }
114 |         });
115 | 
116 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
117 |         bback.setCursor(c);
118 |     }
119 | 
120 |     public void actionPerformed(ActionEvent ae) {
121 |         if (ae.getSource() == bback) {
122 |             parentFrame.setEnabled(true);
123 |             dispose();
124 |         }
125 |     }
126 |     
127 | }
128 | 


--------------------------------------------------------------------------------
/src/School_Management_System/AddClass.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | 
  8 | public class AddClass extends JFrame implements ActionListener {
  9 |     JFrame adminHomePage;
 10 |     
 11 |     JTextField tenrolled, tclassTeacher;
 12 |     JButton badd, bback;
 13 |     JComboBox cbstrength, cbsection, cbclass;
 14 | 
 15 |     AddClass(JFrame adminHomePage) {
 16 |         this.adminHomePage = adminHomePage;
 17 |         
 18 |         JLabel ltitle, lclass, lsection, lstrength, lenrolled, lteacher, lpic;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("Add New Class");
 22 |         setSize(700, 450);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 32 | 
 33 |         //============set Font Label===========
 34 |         ltitle = new JLabel("Add New Class");
 35 |         ltitle.setBounds(70, 30, 400, 50);
 36 |         ltitle.setForeground(Color.white);
 37 |         add(ltitle);
 38 |         ltitle.setFont(f1);
 39 | 
 40 |         //============set Label===========
 41 |         lclass = new JLabel("Class Name");
 42 |         lclass.setBounds(50, 160, 100, 30);
 43 |         lclass.setForeground(Color.white);
 44 |         add(lclass);
 45 | 
 46 |         lsection = new JLabel("Section");
 47 |         lsection.setBounds(50, 220, 100, 30);
 48 |         lsection.setForeground(Color.white);
 49 |         add(lsection);
 50 | 
 51 |         lstrength = new JLabel("Student_Strength");
 52 |         lstrength.setBounds(50, 280, 110, 30);
 53 |         lstrength.setForeground(Color.white);
 54 |         add(lstrength);
 55 | 
 56 |         lenrolled = new JLabel("Enrolled_Student");
 57 |         lenrolled.setBounds(50, 350, 100, 30);
 58 |         lenrolled.setForeground(Color.white);
 59 |         add(lenrolled);
 60 | 
 61 |         lteacher = new JLabel("Class_Teacher");
 62 |         lteacher.setBounds(50, 100, 100, 30);
 63 |         lteacher.setForeground(Color.white);
 64 |         add(lteacher);
 65 | 
 66 |         //============set combobox============
 67 |         cbclass = new JComboBox();
 68 |         cbclass.addItem("-select-");
 69 |         cbclass.addItem("1");
 70 |         cbclass.addItem("2");
 71 |         cbclass.addItem("3");
 72 |         cbclass.addItem("4");
 73 |         cbclass.addItem("5");
 74 |         cbclass.addItem("6");
 75 |         cbclass.addItem("7");
 76 |         cbclass.addItem("8");
 77 |         cbclass.addItem("9");
 78 |         cbclass.addItem("10");
 79 |         cbclass.addItem("11");
 80 |         cbclass.addItem("12");
 81 |         cbclass.setBounds(250, 160, 100, 30);
 82 |         cbclass.setFont(new Font("Arial", Font.BOLD, 11));
 83 |         add(cbclass);
 84 | 
 85 |         cbsection = new JComboBox();
 86 |         cbsection.addItem("-select-");
 87 |         cbsection.addItem("A");
 88 |         cbsection.addItem("B");
 89 |         cbsection.addItem("C");
 90 |         cbsection.addItem("D");
 91 |         cbsection.setBounds(250, 220, 100, 30);
 92 |         cbsection.setFont(new Font("Arial", Font.BOLD, 11));
 93 |         add(cbsection);
 94 | 
 95 |         cbstrength = new JComboBox();
 96 |         cbstrength.addItem("-select-");
 97 |         cbstrength.addItem("20");
 98 |         cbstrength.addItem("30");
 99 |         cbstrength.addItem("40");
100 |         cbstrength.addItem("50");
101 |         cbstrength.setBounds(250, 280, 100, 30);
102 |         cbstrength.setFont(new Font("Arial", Font.BOLD, 11));
103 |         add(cbstrength);
104 | 
105 |         //============set TextField============
106 |         tenrolled = new JTextField();
107 |         tenrolled.setBounds(250, 350, 100, 30);
108 |         add(tenrolled);
109 | 
110 |         //============set Button============
111 |         badd = new JButton("Add");
112 |         badd.setBounds(400, 350, 100, 30);
113 |         badd.setBackground(Color.black);
114 |         badd.setForeground(Color.white);
115 |         add(badd);
116 |         badd.addActionListener(this);
117 | 
118 |         bback = new JButton("Cancel");
119 |         bback.setBounds(550, 350, 100, 30);
120 |         bback.setBackground(Color.black);
121 |         bback.setForeground(Color.white);
122 |         add(bback);
123 |         bback.addActionListener(this);
124 | 
125 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
126 |         badd.setCursor(c);
127 |         bback.setCursor(c);
128 | 
129 |         //============set ComboBox===================
130 |         JComboBox<String> comboBox = new JComboBox<>();
131 |         comboBox.setBounds(250, 100, 100, 30);
132 |         add(comboBox);
133 |         comboBox.addActionListener(new ActionListener() {
134 |             public void actionPerformed(ActionEvent e) {
135 | 
136 |                 String selectedItem = (String) comboBox.getSelectedItem();
137 | 
138 |                 tclassTeacher = new JTextField();
139 |                 loadTeacherUsername(selectedItem);
140 |             }
141 |         });
142 |         try {
143 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
144 |             Statement stmt = con.createStatement();
145 |             ResultSet rs = stmt.executeQuery("SELECT username FROM Teacher2");
146 | 
147 |             while (rs.next()) {
148 |                 comboBox.addItem(rs.getString("username"));
149 |             }
150 |             con.close();
151 |         } catch (SQLException e) {
152 |             e.printStackTrace();
153 |         }
154 |         
155 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
156 |             @Override
157 |             public void windowClosing(java.awt.event.WindowEvent e) {
158 |                 adminHomePage.setEnabled(true); 
159 |                 dispose();
160 |             }
161 |         });
162 | 
163 |         //============set Image===================
164 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AddClass.png");
165 |         lpic = new JLabel(img);
166 |         lpic.setBounds(0, 0, 700, 450);
167 |         add(lpic);
168 | 
169 |     }
170 | 
171 |     private void loadTeacherUsername(String username) {
172 | 
173 |         try {
174 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
175 |             PreparedStatement pst = con.prepareStatement("SELECT * FROM Teacher2 WHERE username = ?");
176 |             pst.setString(1, username);
177 |             ResultSet rs = pst.executeQuery();
178 | 
179 |             if (rs.next()) {
180 |                 tclassTeacher.setText(rs.getString("username"));
181 |             }
182 |             con.close();
183 |         } catch (SQLException e) {
184 |             e.printStackTrace();
185 |         }
186 |     }
187 | 
188 |     public void actionPerformed(ActionEvent ae) {
189 |         if (ae.getSource() == badd) {
190 |             addClassData();
191 |         } else if (ae.getSource() == bback) {
192 |             adminHomePage.setEnabled(true);
193 |             dispose();
194 |         }
195 |     }
196 | 
197 |     private void addClassData() {
198 |         if (cbclass.getSelectedItem().equals("-select-")) {
199 |             JOptionPane.showMessageDialog(null, "Select A Class");
200 |         } else if (cbsection.getSelectedItem().equals("-select-")) {
201 |             JOptionPane.showMessageDialog(null, "Please Select Section");
202 |         } else if (cbstrength.getSelectedItem().equals("-select-")) {
203 |             JOptionPane.showMessageDialog(null, "Please Select Strenght");
204 |         } else if (tenrolled.getText().length() == 0) {
205 |             JOptionPane.showMessageDialog(null, "Fill Up Number of Enrolled Students");
206 |         } else if (tclassTeacher.getText().length() == 0) {
207 |             JOptionPane.showMessageDialog(null, "Enter Class Teacher Name");
208 |         } else {
209 |             try {
210 |                 String sclass = cbclass.getSelectedItem().toString();
211 |                 String section = cbsection.getSelectedItem().toString();
212 |                 String question = cbstrength.getSelectedItem().toString();
213 |                 String enrolled = tenrolled.getText();
214 |                 String classTeacher = tclassTeacher.getText();
215 | 
216 |                 Class.forName("com.mysql.cj.jdbc.Driver");
217 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
218 |                 PreparedStatement pst = con.prepareStatement("insert into Class(class, Section, Student_Strength, Enrolled_Students,Class_Teacher)values(?,?,?,?,?);");
219 | 
220 |                 pst.setString(1, sclass);
221 |                 pst.setString(2, section);
222 |                 pst.setString(3, question);
223 |                 pst.setString(4, enrolled);
224 |                 pst.setString(5, classTeacher);
225 | 
226 |                 pst.executeUpdate();
227 | 
228 |                 JOptionPane.showMessageDialog(null, "Class Add Successefully....");
229 | 
230 |                 cbclass.setSelectedIndex(0);
231 |                 cbsection.setSelectedIndex(0);
232 |                 cbstrength.setSelectedIndex(0);
233 |                 tenrolled.setText("");
234 |                 tclassTeacher.setText("");
235 |                 cbclass.requestFocus();
236 |             } catch (Exception ex) {
237 |                 ex.printStackTrace();
238 |             }
239 |         }
240 |     }
241 | }
242 | 


--------------------------------------------------------------------------------
/src/School_Management_System/AddMarks.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import java.sql.Connection;
  6 | import java.sql.DriverManager;
  7 | import java.sql.PreparedStatement;
  8 | import javax.swing.*;
  9 | 
 10 | public class AddMarks extends JFrame implements ActionListener {
 11 |     JFrame adminHomePage;
 12 | 
 13 |     JTextField tname, tclass, tsubject, tmarks, ttrem;
 14 |     JButton bsend, bback;
 15 | 
 16 |     AddMarks(JFrame adminHomePage) {
 17 |         this.adminHomePage = adminHomePage;
 18 |         
 19 |         JLabel ltitle, lname, lclass, lsubject, lmarks, ltrem, lpic;
 20 | 
 21 |         //============set frame===========
 22 |         setTitle("Add Marks Page");
 23 |         setSize(600, 500);
 24 |         setLayout(null);
 25 |         setVisible(true);
 26 |         setLocationRelativeTo(null);
 27 |         setResizable(false);
 28 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 29 |         setIconImage(icon.getImage());
 30 | 
 31 |         //============set Font===========
 32 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 33 |         Font f2 = new Font("Monotype Corsiva", Font.BOLD, 20);
 34 | 
 35 |         //============set Font Label===========
 36 |         ltitle = new JLabel("Add Marks Details");
 37 |         ltitle.setBounds(200, 30, 300, 50);
 38 |         ltitle.setForeground(Color.white);
 39 |         add(ltitle);
 40 |         ltitle.setFont(f1);
 41 | 
 42 |         //============set Label===========
 43 |         lname = new JLabel("Student_Name");
 44 |         lname.setForeground(Color.white);
 45 |         lname.setBounds(140, 100, 140, 30);
 46 |         add(lname);
 47 |         lname.setFont(f2);
 48 | 
 49 |         lclass = new JLabel("Class");
 50 |         lclass.setForeground(Color.white);
 51 |         lclass.setBounds(200, 150, 100, 30);
 52 |         add(lclass);
 53 |         lclass.setFont(f2);
 54 | 
 55 |         lsubject = new JLabel("Subject");
 56 |         lsubject.setForeground(Color.white);
 57 |         lsubject.setBounds(200, 200, 100, 30);
 58 |         add(lsubject);
 59 |         lsubject.setFont(f2);
 60 | 
 61 |         lmarks = new JLabel("Marks");
 62 |         lmarks.setForeground(Color.white);
 63 |         lmarks.setBounds(200, 250, 100, 30);
 64 |         add(lmarks);
 65 |         lmarks.setFont(f2);
 66 | 
 67 |         ltrem = new JLabel("Trem");
 68 |         ltrem.setForeground(Color.white);
 69 |         ltrem.setBounds(200, 300, 100, 30);
 70 |         add(ltrem);
 71 |         ltrem.setFont(f2);
 72 | 
 73 |         //============set text field============
 74 |         tname = new JTextField();
 75 |         tname.setBounds(300, 100, 200, 30);
 76 |         tname.setFont(new Font("Arial", Font.BOLD, 15));
 77 |         add(tname);
 78 | 
 79 |         tclass = new JTextField();
 80 |         tclass.setBounds(300, 150, 200, 30);
 81 |         tclass.setFont(new Font("Arial", Font.BOLD, 15));
 82 |         add(tclass);
 83 | 
 84 |         tsubject = new JTextField();
 85 |         tsubject.setBounds(300, 200, 200, 30);
 86 |         tsubject.setFont(new Font("Arial", Font.BOLD, 15));
 87 |         add(tsubject);
 88 | 
 89 |         tmarks = new JTextField();
 90 |         tmarks.setBounds(300, 250, 200, 30);
 91 |         tmarks.setFont(new Font("Arial", Font.BOLD, 15));
 92 |         add(tmarks);
 93 | 
 94 |         ttrem = new JTextField();
 95 |         ttrem.setBounds(300, 300, 200, 30);
 96 |         ttrem.setFont(new Font("Arial", Font.BOLD, 15));
 97 |         add(ttrem);
 98 | 
 99 |         //============set Button============
100 |         bsend = new JButton("Add Marks");
101 |         bsend.setBounds(370, 375, 120, 30);
102 |         bsend.setBackground(Color.black);
103 |         bsend.setForeground(Color.white);
104 |         add(bsend);
105 |         bsend.addActionListener(this);
106 | 
107 |         bback = new JButton("Cancel");
108 |         bback.setBounds(210, 375, 120, 30);
109 |         bback.setBackground(Color.black);
110 |         bback.setForeground(Color.white);
111 |         add(bback);
112 |         bback.addActionListener(this);
113 | 
114 |         //============set Image===================
115 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\markss.png");
116 |         lpic = new JLabel(img);
117 |         lpic.setBounds(0, 0, 600, 500);
118 |         add(lpic);
119 |         
120 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
121 |             @Override
122 |             public void windowClosing(java.awt.event.WindowEvent e) {
123 |                 adminHomePage.setEnabled(true); 
124 |                 dispose();
125 |             }
126 |         });
127 | 
128 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
129 |         bsend.setCursor(c);
130 |         bback.setCursor(c);
131 |     }
132 | 
133 |     public void actionPerformed(ActionEvent ae) {
134 |         if (ae.getSource() == bsend) {
135 |             if (tname.getText().length() == 0) {
136 |                 JOptionPane.showMessageDialog(null, "Please Enter Student Nume.");
137 |             } else if (tclass.getText().length() == 0) {
138 |                 JOptionPane.showMessageDialog(null, "Please Enter Sabject.");
139 |             } else if (tsubject.getText().length() == 0) {
140 |                 JOptionPane.showMessageDialog(null, "Please Enter Class Number");
141 |             } else if (tmarks.getText().length() == 0) {
142 |                 JOptionPane.showMessageDialog(null, "Please Enter Trem");
143 |             } else if (ttrem.getText().length() == 0) {
144 |                 JOptionPane.showMessageDialog(null, "Please Enter Marks");
145 |             } else {
146 |                 try {
147 | 
148 |                     String name = tname.getText();
149 |                     String clas = tclass.getText();
150 |                     String subject = tsubject.getText();
151 |                     String marks = tmarks.getText();
152 |                     String trem = ttrem.getText();
153 | 
154 |                     Class.forName("com.mysql.cj.jdbc.Driver");
155 |                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
156 |                     PreparedStatement pst = con.prepareStatement("insert into Marks(name,subject,class,marks,term)values(?,?,?,?,?);");
157 | 
158 |                     pst.setString(1, name);
159 |                     pst.setString(2, subject);
160 |                     pst.setString(3, clas);
161 |                     pst.setString(4, marks);
162 |                     pst.setString(5, trem);
163 |                     pst.executeUpdate();
164 | 
165 |                     JOptionPane.showMessageDialog(null, "Marks Add Successefully....👍");
166 | 
167 |                     tname.setText("");
168 |                     tclass.setText("");
169 |                     tsubject.setText("");
170 |                     tmarks.setText("");
171 |                     ttrem.setText("");
172 |                 } catch (Exception ex) {
173 |                     ex.printStackTrace();
174 |                 }
175 |             }
176 |         }
177 |         if (ae.getSource() == bback) {
178 |             adminHomePage.setEnabled(true);
179 |             dispose();
180 |         }
181 |     }
182 | }
183 | 


--------------------------------------------------------------------------------
/src/School_Management_System/AddResult.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import javax.swing.*;
  4 | import java.awt.*;
  5 | import java.awt.event.*;
  6 | import java.sql.*;
  7 | import javax.swing.table.DefaultTableModel;
  8 | import javax.swing.JTable;
  9 | 
 10 | public class AddResult extends JFrame implements ActionListener {
 11 |     JFrame adminHomePage;
 12 | 
 13 |     JTable resultsTable;
 14 |     DefaultTableModel tableModel;
 15 |     JTextField studentNameField, rollNoField, mathsField, scienceField, englishField, historyField, geoField, econField;
 16 |     JButton badd, bback;
 17 |     Connection connection;
 18 | 
 19 |     public AddResult(JFrame adminHomePage) {
 20 |         this.adminHomePage = adminHomePage;
 21 |         
 22 |         //======================Set up the frame==============================
 23 |         setTitle("Add Results of Students");
 24 |         setSize(800, 600);
 25 |         setLocationRelativeTo(null);
 26 |         setLayout(new BorderLayout());
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //=====================Initialize the database connection=============
 31 |         try {
 32 |             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
 33 |         } catch (SQLException e) {
 34 |             e.printStackTrace();
 35 |             JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
 36 |         }
 37 | 
 38 |         //================Table for displaying student results================
 39 |         String[] columnNames = {"UserName", "Roll No", "Mathematics", "Science", "English", "History", "Geography", "Economics", "Total Marks", "Percentage", "Grade", "Result"};
 40 |         tableModel = new DefaultTableModel(columnNames, 0);
 41 | 
 42 |         resultsTable = new JTable(tableModel);
 43 |         resultsTable.setBackground(Color.black);
 44 |         resultsTable.setForeground(Color.white);
 45 |         JScrollPane scrollPane = new JScrollPane(resultsTable);
 46 |         add(scrollPane, BorderLayout.CENTER);
 47 | 
 48 |         // Input fields for adding new student
 49 |         JPanel inputPanel = new JPanel();
 50 |         inputPanel.setLayout(new GridLayout(10, 2));
 51 | 
 52 |         inputPanel.add(new JLabel("Student Username:"));
 53 | 
 54 |         JComboBox<String> comboBox = new JComboBox<>();
 55 |         comboBox.setBounds(160, 160, 170, 30);
 56 |         inputPanel.add(comboBox);
 57 | 
 58 |         comboBox.addActionListener(new ActionListener() {
 59 |             public void actionPerformed(ActionEvent e) {
 60 | 
 61 |                 String selectedItem = (String) comboBox.getSelectedItem();
 62 | 
 63 |                 studentNameField = new JTextField();
 64 |                 //add(tusername);
 65 |                 StudentUsername(selectedItem);
 66 |             }
 67 |         });
 68 |         try {
 69 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
 70 |             Statement stmt = con.createStatement();
 71 |             ResultSet rs = stmt.executeQuery("SELECT username FROM Student2");
 72 | 
 73 |             while (rs.next()) {
 74 |                 comboBox.addItem(rs.getString("username"));
 75 |             }
 76 |             con.close();
 77 |         } catch (SQLException e) {
 78 |             e.printStackTrace();
 79 |         }
 80 | 
 81 |         inputPanel.add(new JLabel("Roll No:"));
 82 |         rollNoField = new JTextField();
 83 |         inputPanel.add(rollNoField);
 84 | 
 85 |         inputPanel.add(new JLabel("Mathematics:"));
 86 |         mathsField = new JTextField();
 87 |         inputPanel.add(mathsField);
 88 | 
 89 |         inputPanel.add(new JLabel("Science:"));
 90 |         scienceField = new JTextField();
 91 |         inputPanel.add(scienceField);
 92 | 
 93 |         inputPanel.add(new JLabel("English:"));
 94 |         englishField = new JTextField();
 95 |         inputPanel.add(englishField);
 96 | 
 97 |         inputPanel.add(new JLabel("History:"));
 98 |         historyField = new JTextField();
 99 |         inputPanel.add(historyField);
100 | 
101 |         inputPanel.add(new JLabel("Geography:"));
102 |         geoField = new JTextField();
103 |         inputPanel.add(geoField);
104 | 
105 |         inputPanel.add(new JLabel("Economics:"));
106 |         econField = new JTextField();
107 |         inputPanel.add(econField);
108 | 
109 |         bback = new JButton("Go To Back");
110 |         bback.setBackground(Color.yellow);
111 |         bback.setForeground(Color.red);
112 |         inputPanel.add(bback);
113 |         add(inputPanel, BorderLayout.SOUTH);
114 |         bback.addActionListener((ActionListener) this);
115 | 
116 |         badd = new JButton("Add Result");
117 |         badd.setBackground(Color.black);
118 |         badd.setForeground(Color.white);
119 |         inputPanel.add(badd);
120 |         add(inputPanel, BorderLayout.SOUTH);
121 |         badd.addActionListener((ActionListener) this);
122 | 
123 |         // Load existing results into the table
124 |         loadStudentResults();
125 |         
126 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
127 |             @Override
128 |             public void windowClosing(java.awt.event.WindowEvent e) {
129 |                 adminHomePage.setEnabled(true); 
130 |                 dispose();
131 |             }
132 |         });
133 | 
134 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
135 |         badd.setCursor(c);
136 |         bback.setCursor(c);
137 | 
138 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\loginPage.png");
139 |         JLabel lpic = new JLabel(img);
140 |         lpic.setBounds(0, 0, 600, 500);
141 |         //inputPanel.add(lpic);
142 |     }
143 | 
144 |     public void StudentUsername(String username) {
145 | 
146 |         try {
147 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123"); // Update with your DB credentials
148 |             PreparedStatement pst = con.prepareStatement("SELECT * FROM Student2 WHERE username = ?");
149 |             pst.setString(1, username);
150 |             ResultSet rs = pst.executeQuery();
151 | 
152 |             if (rs.next()) {
153 |                 studentNameField.setText(rs.getString("username"));
154 |             }
155 |             con.close();
156 |         } catch (SQLException e) {
157 |             e.printStackTrace();
158 |         }
159 |     }
160 | 
161 |     public void actionPerformed(ActionEvent e) {
162 |         if (e.getSource() == badd) {
163 |             if (studentNameField.getText().length() == 0) {
164 |                 JOptionPane.showMessageDialog(null, "Please Select Student Username.");
165 |             } else if (rollNoField.getText().length() == 0) {
166 |                 JOptionPane.showMessageDialog(null, "Please Enter Student Roll Number.");
167 |             } else if (mathsField.getText().length() == 0) {
168 |                 JOptionPane.showMessageDialog(null, "Please Enter Marks of Mathimatics");
169 |             } else if (scienceField.getText().length() == 0) {
170 |                 JOptionPane.showMessageDialog(null, "Please Enter Marks of Science Subject");
171 |             } else if (englishField.getText().length() == 0) {
172 |                 JOptionPane.showMessageDialog(null, "Please Enter Marks of English Subject");
173 |             } else if (historyField.getText().length() == 0) {
174 |                 JOptionPane.showMessageDialog(null, "Please Enter Marks of History Subject");
175 |             } else if (geoField.getText().length() == 0) {
176 |                 JOptionPane.showMessageDialog(null, "Please Enter Marks of Geography Subject");
177 |             } else if (econField.getText().length() == 0) {
178 |                 JOptionPane.showMessageDialog(null, "Please Enter Marks of Economics Subject");
179 |             } else {
180 |                 addStudent();
181 |             }
182 |         }
183 |         if (e.getSource() == bback) {
184 |             adminHomePage.setEnabled(true);
185 |             dispose();
186 |         }
187 |     }
188 | 
189 |     private void loadStudentResults() {
190 |         String query = "SELECT student_name, roll_no, mathematics, science, english, history, geography, economics, "
191 |                 + "(mathematics + science + english + history + geography + economics) AS total_marks, "
192 |                 + "((mathematics + science + english + history + geography + economics) / 600) * 100 AS percentage, "
193 |                 + "CASE WHEN ((mathematics + science + english + history + geography + economics) / 600) * 100 >= 60 THEN 'A' "
194 |                 + "WHEN ((mathematics + science + english + history + geography + economics) / 600) * 100 >= 50 THEN 'B' ELSE 'C' END AS grade, "
195 |                 + "CASE WHEN ((mathematics + science + english + history + geography + economics) / 600) * 100 >= 33 THEN 'Pass' ELSE 'Fail' END AS result "
196 |                 + "FROM student_results";
197 | 
198 |         try {
199 |             Statement stmt = connection.createStatement();
200 |             ResultSet rs = stmt.executeQuery(query);
201 |             while (rs.next()) {
202 |                 Object[] row
203 |                         = {
204 |                             rs.getString("student_name"),
205 |                             rs.getInt("roll_no"),
206 |                             rs.getInt("mathematics"),
207 |                             rs.getInt("science"),
208 |                             rs.getInt("english"),
209 |                             rs.getInt("history"),
210 |                             rs.getInt("geography"),
211 |                             rs.getInt("economics"),
212 |                             rs.getInt("total_marks"),
213 |                             rs.getDouble("percentage"),
214 |                             rs.getString("grade"),
215 |                             rs.getString("result")
216 |                         };
217 |                 tableModel.addRow(row);
218 |             }
219 |         } catch (SQLException e) {
220 |             e.printStackTrace();
221 |             JOptionPane.showMessageDialog(this, "Error loading student results: " + e.getMessage());
222 |         }
223 |     }
224 | 
225 |     private void addStudent() {
226 |         String studentName = studentNameField.getText();
227 |         int rollNo = Integer.parseInt(rollNoField.getText());
228 |         int maths = Integer.parseInt(mathsField.getText());
229 |         int science = Integer.parseInt(scienceField.getText());
230 |         int english = Integer.parseInt(englishField.getText());
231 |         int history = Integer.parseInt(historyField.getText());
232 |         int geo = Integer.parseInt(geoField.getText());
233 |         int econ = Integer.parseInt(econField.getText());
234 | 
235 |         int totalMarks = maths + science + english + history + geo + econ;
236 |         double percentage = ((double) totalMarks / 600) * 100;
237 |         String grade = (percentage >= 60) ? "A" : (percentage >= 50) ? "B" : "C";
238 |         String result = (percentage >= 33) ? "Pass" : "Fail";
239 | 
240 |         String q = "INSERT INTO student_results (student_name, roll_no, mathematics, science, english, history, geography, economics, total_marks, percentage, grade, result) "
241 |                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
242 | 
243 |         try {
244 |             PreparedStatement stmt = connection.prepareStatement(q);
245 | 
246 |             stmt.setString(1, studentName);
247 |             stmt.setInt(2, rollNo);
248 |             stmt.setInt(3, maths);
249 |             stmt.setInt(4, science);
250 |             stmt.setInt(5, english);
251 |             stmt.setInt(6, history);
252 |             stmt.setInt(7, geo);
253 |             stmt.setInt(8, econ);
254 |             stmt.setInt(9, totalMarks);
255 |             stmt.setDouble(10, percentage);
256 |             stmt.setString(11, grade);
257 |             stmt.setString(12, result);
258 | 
259 |             stmt.executeUpdate();
260 |             JOptionPane.showMessageDialog(this, "Result added successfully!");
261 | 
262 |             studentNameField.setText("");
263 |             rollNoField.setText("");
264 |             mathsField.setText("");
265 |             scienceField.setText("");
266 |             englishField.setText("");
267 |             historyField.setText("");
268 |             geoField.setText("");
269 |             econField.setText("");
270 | 
271 |             tableModel.setRowCount(0);  
272 |             loadStudentResults();
273 |         } catch (SQLException e) {
274 |             e.printStackTrace();
275 |             JOptionPane.showMessageDialog(this, "Error adding student: " + e.getMessage());
276 |         }
277 |     }
278 | 
279 | }
280 | 


--------------------------------------------------------------------------------
/src/School_Management_System/AddSubject.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import java.sql.Connection;
  6 | import java.sql.DriverManager;
  7 | import java.sql.PreparedStatement;
  8 | import javax.swing.*;
  9 | 
 10 | public class AddSubject extends JFrame implements ActionListener {
 11 | 
 12 |     JFrame adminHomePage;
 13 |     
 14 |     JTextField tsubjectName, tsubjectCode;
 15 |     JButton badd, bback;
 16 | 
 17 |     AddSubject(JFrame adminHomePage) {
 18 |         this.adminHomePage = adminHomePage;
 19 |         
 20 |         JLabel ltitle, lsubjectName, lsubjectCode, lpic;
 21 | 
 22 |         //============set frame===========
 23 |         setTitle("Add Subject Page");
 24 |         setSize(640, 385);
 25 |         setLayout(null);
 26 |         setVisible(true);
 27 |         setLocationRelativeTo(null);
 28 |         setResizable(false);
 29 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 30 |         setIconImage(icon.getImage());
 31 | 
 32 |         //============set Font===========
 33 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 34 |         Font f2 = new Font("Monotype Corsiva", Font.BOLD, 20);
 35 | 
 36 |         //============set Font Label===========
 37 |         ltitle = new JLabel("Add Subject");
 38 |         ltitle.setBounds(30, 32, 540, 100);
 39 |         ltitle.setForeground(Color.white);
 40 |         add(ltitle);
 41 |         ltitle.setFont(f1);
 42 | 
 43 |         //============set Label===========
 44 |         lsubjectName = new JLabel("Subject Name");
 45 |         lsubjectName.setForeground(Color.white);
 46 |         lsubjectName.setBounds(30, 140, 140, 30);
 47 |         add(lsubjectName);
 48 |         lsubjectName.setFont(f2);
 49 | 
 50 |         lsubjectCode = new JLabel("Subject Code");
 51 |         lsubjectCode.setForeground(Color.white);
 52 |         lsubjectCode.setBounds(30, 190, 140, 30);
 53 |         add(lsubjectCode);
 54 |         lsubjectCode.setFont(f2);
 55 | 
 56 |         //============set text field============
 57 |         tsubjectName = new JTextField();
 58 |         tsubjectName.setBounds(160, 140, 150, 30);
 59 |         tsubjectName.setFont(new Font("Arial", Font.BOLD, 15));
 60 |         add(tsubjectName);
 61 | 
 62 |         tsubjectCode = new JTextField();
 63 |         tsubjectCode.setBounds(160, 190, 150, 30);
 64 |         tsubjectCode.setFont(new Font("Arial", Font.BOLD, 15));
 65 |         add(tsubjectCode);
 66 | 
 67 |         //============set Button============
 68 |         bback = new JButton("Back");
 69 |         bback.setBounds(210, 260, 100, 30);
 70 |         bback.setForeground(Color.yellow);
 71 |         bback.setBackground(Color.blue);
 72 |         add(bback);
 73 |         bback.addActionListener(this);
 74 | 
 75 |         badd = new JButton("Add");
 76 |         badd.setBounds(30, 260, 100, 30);
 77 |         badd.setForeground(Color.white);
 78 |         badd.setBackground(Color.black);
 79 |         add(badd);
 80 |         badd.addActionListener(this);
 81 | 
 82 |         //============set Image===================
 83 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\Subject.jpg");
 84 |         lpic = new JLabel(img);
 85 |         lpic.setBounds(0, 0, 640, 360);
 86 |         add(lpic);
 87 |         
 88 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
 89 |             @Override
 90 |             public void windowClosing(java.awt.event.WindowEvent e) {
 91 |                 adminHomePage.setEnabled(true); 
 92 |                 dispose();
 93 |             }
 94 |         });
 95 |         
 96 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
 97 |         badd.setCursor(c);
 98 |         bback.setCursor(c);
 99 |     }
100 | 
101 |     public void actionPerformed(ActionEvent ae) {
102 |         if (ae.getSource() == badd) {
103 |             if (tsubjectName.getText().length() == 0) {
104 |                 JOptionPane.showMessageDialog(null, "Please Enter Subject Nume.");
105 |             } else if (tsubjectCode.getText().length() == 0) {
106 |                 JOptionPane.showMessageDialog(null, "Please Enter Subject Code.");
107 |             } else {
108 |                 try {
109 | 
110 |                     String subjectName = tsubjectName.getText();
111 |                     String subjectCode = tsubjectCode.getText();
112 | 
113 |                     Class.forName("com.mysql.cj.jdbc.Driver");
114 |                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
115 |                     PreparedStatement pst = con.prepareStatement("insert into Subject(subjectCode,subjectName)values(?,?);");
116 | 
117 |                     pst.setString(1, subjectCode);
118 |                     pst.setString(2, subjectName);
119 |                     pst.executeUpdate();
120 | 
121 |                     JOptionPane.showMessageDialog(null, "Subject Add Successefully....👍");
122 | 
123 |                     tsubjectName.setText("");
124 |                     tsubjectCode.setText("");
125 |                 } catch (Exception ex) {
126 |                     ex.printStackTrace();
127 |                 }
128 |             }
129 |         }
130 |         if (ae.getSource() == bback) {
131 |             adminHomePage.setEnabled(true);
132 |             dispose();
133 |         }
134 |     }
135 | 
136 | }
137 | 


--------------------------------------------------------------------------------
/src/School_Management_System/AddTeacher.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import java.io.File;
  6 | import java.io.FileInputStream;
  7 | import java.io.IOException;
  8 | import javax.swing.*;
  9 | import java.sql.*;
 10 | import javax.imageio.ImageIO;
 11 | 
 12 | public class AddTeacher extends JFrame implements ActionListener {
 13 | 
 14 |     JFrame adminHomePage;
 15 | 
 16 |     JTextField tname, tusername, tpass, temail, tfather, tcontact, tqualification, taddress, tgender, tteachingEx, tage, tdob, tans;
 17 |     JButton bsubmit, bback;
 18 |     JComboBox cb1;
 19 |     JLabel imageLabel;
 20 |     File selectedFile, defaultImageFile;
 21 | 
 22 |     AddTeacher(JFrame adminHomePage) {
 23 |         this.adminHomePage = adminHomePage;
 24 | 
 25 |         JLabel ltitle, lname, lusername, lpass, lemail, lfather, lcontact, lqualification, laddress, lgender, lteachingEx, lage, ldob, lsec, lans, lpic;
 26 | 
 27 |         //============set frame===========
 28 |         setTitle("Add Teacher");
 29 |         setSize(800, 635);
 30 |         setLayout(null);
 31 |         setVisible(true);
 32 |         setLocationRelativeTo(null);
 33 |         setResizable(false);
 34 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 35 |         setIconImage(icon.getImage());
 36 | 
 37 |         defaultImageFile = new File("src\\School_Management_System\\Icons\\AdTeacherImageDifault.jpg");
 38 | 
 39 |         imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);
 40 |         imageLabel.setBounds(200, 25, 50, 50);
 41 |         imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
 42 |         add(imageLabel, BorderLayout.CENTER);
 43 |         imageLabel.addMouseListener(new MouseAdapter() {
 44 |             @Override
 45 |             public void mouseClicked(MouseEvent e) {
 46 |                 selectImage();
 47 |             }
 48 |         });
 49 | 
 50 |         setDefaultImage();
 51 | 
 52 |         //============set Font===========
 53 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 26);
 54 | 
 55 |         //============set Font Label===========
 56 |         ltitle = new JLabel("Add New Teacher Registration");
 57 |         ltitle.setBounds(360, 30, 340, 50);
 58 |         ltitle.setForeground(Color.white);
 59 |         add(ltitle);
 60 |         ltitle.setFont(f1);
 61 | 
 62 |         //============set Label===========
 63 |         JLabel lpropic = new JLabel("Enter Profile Pic.");
 64 |         lpropic.setBounds(50, 40, 120, 30);
 65 |         lpropic.setForeground(Color.white);
 66 |         add(lpropic);
 67 | 
 68 |         lname = new JLabel("Name");
 69 |         lname.setBounds(50, 100, 100, 30);
 70 |         lname.setForeground(Color.white);
 71 |         add(lname);
 72 | 
 73 |         lusername = new JLabel("Username");
 74 |         lusername.setBounds(50, 160, 100, 30);
 75 |         lusername.setForeground(Color.white);
 76 |         add(lusername);
 77 | 
 78 |         lpass = new JLabel("Password");
 79 |         lpass.setBounds(50, 220, 100, 30);
 80 |         lpass.setForeground(Color.white);
 81 |         add(lpass);
 82 | 
 83 |         lemail = new JLabel("E-mail");
 84 |         lemail.setBounds(50, 280, 100, 30);
 85 |         lemail.setForeground(Color.white);
 86 |         add(lemail);
 87 | 
 88 |         lfather = new JLabel("Father Name");
 89 |         lfather.setBounds(50, 340, 100, 30);
 90 |         lfather.setForeground(Color.white);
 91 |         add(lfather);
 92 | 
 93 |         lcontact = new JLabel("Contact");
 94 |         lcontact.setBounds(50, 400, 100, 30);
 95 |         lcontact.setForeground(Color.white);
 96 |         add(lcontact);
 97 | 
 98 |         lqualification = new JLabel("Qualification");
 99 |         lqualification.setBounds(50, 460, 100, 30);
100 |         lqualification.setForeground(Color.white);
101 |         add(lqualification);
102 |         //----------------------------------------------------------------------
103 | 
104 |         laddress = new JLabel("Address");
105 |         laddress.setBounds(370, 100, 100, 30);
106 |         laddress.setForeground(Color.white);
107 |         add(laddress);
108 | 
109 |         lgender = new JLabel("Gender");
110 |         lgender.setBounds(370, 160, 100, 30);
111 |         lgender.setForeground(Color.white);
112 |         add(lgender);
113 | 
114 |         lteachingEx = new JLabel("Teaching Exp.");
115 |         lteachingEx.setBounds(370, 220, 100, 30);
116 |         lteachingEx.setForeground(Color.white);
117 |         add(lteachingEx);
118 | 
119 |         lage = new JLabel("Age");
120 |         lage.setBounds(370, 280, 100, 30);
121 |         lage.setForeground(Color.white);
122 |         add(lage);
123 | 
124 |         ldob = new JLabel("Date Of Birth");
125 |         ldob.setBounds(370, 340, 100, 30);
126 |         ldob.setForeground(Color.white);
127 |         add(ldob);
128 | 
129 |         lsec = new JLabel("Select Question");
130 |         lsec.setBounds(370, 400, 100, 30);
131 |         lsec.setForeground(Color.white);
132 |         add(lsec);
133 | 
134 |         lans = new JLabel("Answer");
135 |         lans.setBounds(370, 460, 100, 30);
136 |         lans.setForeground(Color.white);
137 |         add(lans);
138 | 
139 |         //============set text field============
140 |         tname = new JTextField();
141 |         tname.setBounds(160, 100, 170, 30);
142 |         add(tname);
143 | 
144 |         tusername = new JTextField();
145 |         tusername.setBounds(160, 160, 170, 30);
146 |         add(tusername);
147 | 
148 |         tpass = new JTextField();
149 |         tpass.setBounds(160, 220, 170, 30);
150 |         add(tpass);
151 | 
152 |         temail = new JTextField();
153 |         temail.setBounds(160, 280, 170, 30);
154 |         add(temail);
155 | 
156 |         tfather = new JTextField();
157 |         tfather.setBounds(160, 340, 170, 30);
158 |         add(tfather);
159 | 
160 |         tcontact = new JTextField();
161 |         tcontact.setBounds(160, 400, 170, 30);
162 |         add(tcontact);
163 | 
164 |         tqualification = new JTextField();
165 |         tqualification.setBounds(160, 460, 170, 30);
166 |         add(tqualification);
167 |         //-------------------------------------------------------------
168 | 
169 |         taddress = new JTextField();
170 |         taddress.setBounds(500, 100, 200, 30);
171 |         add(taddress);
172 | 
173 |         tgender = new JTextField();
174 |         tgender.setBounds(500, 160, 200, 30);
175 |         add(tgender);
176 | 
177 |         tteachingEx = new JTextField();
178 |         tteachingEx.setBounds(500, 220, 200, 30);
179 |         add(tteachingEx);
180 | 
181 |         tage = new JTextField();
182 |         tage.setBounds(500, 280, 200, 30);
183 |         add(tage);
184 | 
185 |         tdob = new JTextField();
186 |         tdob.setBounds(500, 340, 200, 30);
187 |         add(tdob);
188 | 
189 |         tans = new JTextField();
190 |         tans.setBounds(500, 460, 200, 30);
191 |         add(tans);
192 | 
193 |         //============set Button============
194 |         bsubmit = new JButton("Submit");
195 |         bsubmit.setBounds(250, 540, 100, 30);
196 |         add(bsubmit);
197 |         bsubmit.addActionListener(this);
198 | 
199 |         bback = new JButton("Cancel");
200 |         bback.setBounds(450, 540, 100, 30);
201 |         add(bback);
202 |         bback.addActionListener(this);
203 | 
204 |         //============set combobox=================== 
205 |         cb1 = new JComboBox();
206 |         cb1.addItem("-select-");
207 |         cb1.addItem("YOUR FATHER NAME");
208 |         cb1.addItem("YOUR MOTHER NAME");
209 |         cb1.addItem("YOUR BROTHER NAME");
210 |         cb1.addItem("YOUR SISTER NAME");
211 |         cb1.setBounds(500, 400, 200, 30);
212 |         cb1.setFont(new Font("Arial", Font.BOLD, 11));
213 |         add(cb1);
214 | 
215 |         //============set Image===================
216 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AddTeacher.png");
217 |         lpic = new JLabel(img);
218 |         lpic.setBounds(0, 0, 800, 600);
219 |         add(lpic);
220 | 
221 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
222 |             @Override
223 |             public void windowClosing(java.awt.event.WindowEvent e) {
224 |                 adminHomePage.setEnabled(true);
225 |                 dispose();
226 |             }
227 |         });
228 | 
229 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
230 |         bsubmit.setCursor(c);
231 |         bback.setCursor(c);
232 |     }
233 | 
234 |     public void actionPerformed(ActionEvent ae) {
235 |         if (ae.getSource() == bsubmit) {
236 |             if (tname.getText().length() == 0) {
237 |                 JOptionPane.showMessageDialog(null, "Please Enter Teacher Nume.");
238 |             } else if (tusername.getText().length() == 0) {
239 |                 JOptionPane.showMessageDialog(null, "Enter Username.");
240 |             } else if (tpass.getText().length() == 0) {
241 |                 JOptionPane.showMessageDialog(null, "Please Create A Password");
242 |             } else if (temail.getText().length() == 0) {
243 |                 JOptionPane.showMessageDialog(null, "Enter An E-mail");
244 |             } else if (tfather.getText().length() == 0) {
245 |                 JOptionPane.showMessageDialog(null, "Enter Father Name of Teacher");
246 |             } else if (tcontact.getText().length() == 0) {
247 |                 JOptionPane.showMessageDialog(null, "Contact Number Missing");
248 |             } else if (tqualification.getText().length() == 0) {
249 |                 JOptionPane.showMessageDialog(null, "Please Provide Qualification of Teacher");
250 |             } else if (taddress.getText().length() == 0) {
251 |                 JOptionPane.showMessageDialog(null, "Teacher Address Missing");
252 |             } else if (tgender.getText().length() == 0) {
253 |                 JOptionPane.showMessageDialog(null, "Enter Gender of Teacher");
254 |             } else if (tteachingEx.getText().length() == 0) {
255 |                 JOptionPane.showMessageDialog(null, "Please Provide Teaching Experince of Teacher");
256 |             } else if (tage.getText().length() == 0) {
257 |                 JOptionPane.showMessageDialog(null, "Please Enter Age of Teacher");
258 |             } else if (tdob.getText().length() == 0) {
259 |                 JOptionPane.showMessageDialog(null, "Please Fill Up Date of Birth");
260 |             } else if (tans.getText().length() == 0) {
261 |                 JOptionPane.showMessageDialog(null, "Type Answer Of Security Question");
262 |             } else if (cb1.getSelectedItem().equals("-select-")) {
263 |                 JOptionPane.showMessageDialog(null, "Select A Security Question");
264 |             } else if (tcontact.getText().length() == 10) {
265 |                 try {
266 | 
267 |                     String name = tname.getText();
268 |                     String username = tusername.getText();
269 |                     String password = tpass.getText();
270 |                     String email = temail.getText();
271 |                     String father = tfather.getText();
272 |                     String contact = tcontact.getText();
273 |                     String qualification = tqualification.getText();
274 |                     String address = taddress.getText();
275 |                     String gender = tgender.getText();
276 |                     String teaching = tteachingEx.getText();
277 |                     String age = tage.getText();
278 |                     String dob = tdob.getText();
279 |                     String question = cb1.getSelectedItem().toString();
280 |                     String answer = tans.getText();
281 |                     FileInputStream fis = new FileInputStream(selectedFile);
282 |                     byte[] imageBytes = fis.readAllBytes();
283 |                     
284 |                     Class.forName("com.mysql.cj.jdbc.Driver");
285 |                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
286 |                     PreparedStatement pst = con.prepareStatement("insert into Teacher2(name,username,email,father,contact,qualification,address,gender,teachingExperience,age,dob,securityquestion,answer,password,image)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
287 | 
288 |                     pst.setString(1, name);
289 |                     pst.setString(2, username);
290 |                     pst.setString(3, email);
291 |                     pst.setString(4, father);
292 |                     pst.setString(5, contact);
293 |                     pst.setString(6, qualification);
294 |                     pst.setString(7, address);
295 |                     pst.setString(8, gender);
296 |                     pst.setString(9, teaching);
297 |                     pst.setString(10, age);
298 |                     pst.setString(11, dob);
299 |                     pst.setString(12, question);
300 |                     pst.setString(13, answer);
301 |                     pst.setString(14, password);
302 |                     pst.setBytes(15, imageBytes);
303 |                     
304 |                     pst.executeUpdate();
305 | 
306 |                     JOptionPane.showMessageDialog(null, "Teacher Add Successefully....");
307 | 
308 |                     tname.setText("");
309 |                     tusername.setText("");
310 |                     tpass.setText("");
311 |                     temail.setText("");
312 |                     tfather.setText("");
313 |                     tcontact.setText("");
314 |                     tqualification.setText("");
315 |                     taddress.setText("");
316 |                     tgender.setText("");
317 |                     tteachingEx.setText("");
318 |                     tage.setText("");
319 |                     tdob.setText("");
320 |                     cb1.setSelectedIndex(0);
321 |                     tans.setText("");
322 |                     setDefaultImage();
323 | 
324 |                     tusername.requestFocus();
325 | 
326 |                 } catch (Exception ex) {
327 |                     ex.printStackTrace();
328 |                 }
329 |             } else {
330 |                 JOptionPane.showMessageDialog(null, "Enter Correct Contact");
331 |             }
332 |         }
333 |         if (ae.getSource() == bback) {
334 |             adminHomePage.setEnabled(true);
335 |             dispose();
336 |         }
337 |     }
338 | 
339 |     private void selectImage() {
340 |         JFileChooser fileChooser = new JFileChooser();
341 |         int result = fileChooser.showOpenDialog(this);
342 |         if (result == JFileChooser.APPROVE_OPTION) {
343 |             selectedFile = fileChooser.getSelectedFile();
344 |             try {
345 |                 Image image = ImageIO.read(selectedFile).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
346 |                 imageLabel.setIcon(new ImageIcon(image));
347 |                 imageLabel.setText("");
348 |             } catch (IOException ex) {
349 |                 JOptionPane.showMessageDialog(this, "Error loading image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
350 |             }
351 |         }
352 |     }
353 | 
354 |     private void setDefaultImage() {
355 |         try {
356 |             Image image = ImageIO.read(defaultImageFile).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
357 |             imageLabel.setIcon(new ImageIcon(image));
358 |             imageLabel.setText("");
359 |             selectedFile = defaultImageFile; // Set default image as the selected file
360 |         } catch (IOException ex) {
361 |             JOptionPane.showMessageDialog(this, "Error loading default image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
362 |         }
363 |     }
364 | }
365 | 


--------------------------------------------------------------------------------
/src/School_Management_System/AdminHomePage.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | 
  7 | public class AdminHomePage extends JFrame implements ActionListener {
  8 |     JMenuItem addTeacher, upTeacher, viewTeacher, removeTeacher, addStudent, upStudent, viewStudent, removeStudent;
  9 |     JMenuItem addClass, upClass, viewClass, addSubject, viewSubject, markd, result, bback;
 10 | 
 11 |     AdminHomePage() {
 12 |         
 13 |         //============set frame===========
 14 |         setTitle("Admin Home Page");
 15 |         setSize(1530, 810);
 16 |         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 17 |         setLayout(null);
 18 |         setVisible(true);
 19 |         setLocationRelativeTo(null);
 20 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 21 |         setIconImage(icon.getImage());
 22 | 
 23 |         //============set Font===========
 24 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 80);
 25 |         Font f2 = new Font("Monotype Corsiva", Font.BOLD, 25);
 26 | 
 27 |         //============set Font Label===========
 28 |         JLabel lsms = new JLabel("School Management System");
 29 |         lsms.setBounds(80, 75, 1000, 100);
 30 |         lsms.setForeground(Color.white);
 31 |         add(lsms);
 32 |         lsms.setFont(f1);
 33 | 
 34 |         JLabel welcomeAdmin = new JLabel("Welcome Admin");
 35 |         welcomeAdmin.setBounds(80, 150, 250, 60);
 36 |         welcomeAdmin.setForeground(Color.white);
 37 |         add(welcomeAdmin);
 38 |         welcomeAdmin.setFont(f2);
 39 | 
 40 |         //============set Menubar===========
 41 |         JMenuBar menubar = new JMenuBar();
 42 | 
 43 |         JMenu teacherPro = new JMenu("                Teachers Profile               ");
 44 |         addTeacher = new JMenuItem("Add Teacher Details");
 45 |         addTeacher.addActionListener(this);
 46 |         teacherPro.add(addTeacher);
 47 |         upTeacher = new JMenuItem("Update Teacher Profile");
 48 |         upTeacher.addActionListener(this);
 49 |         teacherPro.add(upTeacher);
 50 |         viewTeacher = new JMenuItem("View Teachers Details");
 51 |         viewTeacher.addActionListener(this);
 52 |         teacherPro.add(viewTeacher);
 53 |         removeTeacher = new JMenuItem("Remove Teacher");
 54 |         removeTeacher.addActionListener(this);
 55 |         teacherPro.add(removeTeacher);
 56 |         menubar.add(teacherPro);
 57 | 
 58 |         JMenu studentPro = new JMenu("                    Students Profile                ");
 59 |         addStudent = new JMenuItem("Add Student Details");
 60 |         addStudent.addActionListener(this);
 61 |         studentPro.add(addStudent);
 62 |         upStudent = new JMenuItem("Update Student Profile");
 63 |         upStudent.addActionListener(this);
 64 |         studentPro.add(upStudent);
 65 |         viewStudent = new JMenuItem("View Student Profile");
 66 |         viewStudent.addActionListener(this);
 67 |         studentPro.add(viewStudent);
 68 |         removeStudent = new JMenuItem("Remove Student");
 69 |         removeStudent.addActionListener(this);
 70 |         studentPro.add(removeStudent);
 71 |         menubar.add(studentPro);
 72 | 
 73 |         JMenu classd = new JMenu("                          Class                        ");
 74 |         addClass = new JMenuItem("Add New Class");
 75 |         addClass.addActionListener(this);
 76 |         classd.add(addClass);
 77 |         upClass = new JMenuItem("Update Class Details");
 78 |         upClass.addActionListener(this);
 79 |         classd.add(upClass);
 80 |         viewClass = new JMenuItem("View Class Details");
 81 |         viewClass.addActionListener(this);
 82 |         classd.add(viewClass);
 83 |         menubar.add(classd);
 84 | 
 85 |         JMenu subjectd = new JMenu("                   Subject                          ");
 86 |         addSubject = new JMenuItem("  Add Subject");
 87 |         addSubject.addActionListener(this);
 88 |         subjectd.add(addSubject);
 89 | 
 90 |         viewSubject = new JMenuItem("  View Subject");
 91 |         viewSubject.addActionListener(this);
 92 |         subjectd.add(viewSubject);
 93 | 
 94 |         menubar.add(subjectd);
 95 | 
 96 |         markd = new JMenuItem("                               Marks");
 97 |         markd.setBackground(Color.yellow);
 98 |         //markd.setForeground(Color.red);
 99 |         markd.addActionListener(this);
100 |         menubar.add(markd);
101 | 
102 |         result = new JMenuItem("                             Result");
103 |         result.setBackground(Color.RED);
104 |         result.setForeground(Color.white);
105 |         result.addActionListener(this);
106 |         menubar.add(result);
107 | 
108 |         bback = new JMenuItem("                            Logout");
109 |         bback.setBackground(Color.black);
110 |         bback.setForeground(Color.white);
111 |         bback.addActionListener(this);
112 |         menubar.add(bback);
113 |         bback.addActionListener(this);
114 | 
115 |         setJMenuBar(menubar);
116 | 
117 |         //============set Image===================
118 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AdminG.jpg");
119 |         JLabel lpic = new JLabel(img);
120 |         lpic.setBounds(0, 0, 1580, 800);
121 |         add(lpic);
122 |         
123 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
124 |         menubar.setCursor(c);
125 |         bback.setCursor(c);
126 |     }
127 | 
128 |     public void actionPerformed(ActionEvent ae) {
129 |         if (ae.getSource() == bback) {
130 |             //System.exit(0);
131 |             dispose();
132 |             new Welcome().setVisible(true);
133 |         }
134 |         if (ae.getSource() == addTeacher) {
135 |             this.setEnabled(false);
136 |             new AddTeacher(this).setVisible(true);
137 |         }
138 |         if (ae.getSource() == upTeacher) {
139 |             this.setEnabled(false);
140 |             new UpdateTeacher(this).setVisible(true);
141 |         }
142 |         if (ae.getSource() == viewTeacher) {
143 |             this.setEnabled(false);
144 |             new ViewTeacher(this).setVisible(true);
145 |         }
146 |         if (ae.getSource() == removeTeacher) {
147 |             this.setEnabled(false);
148 |             new RemoveTeacher(this).setVisible(true);
149 |         }
150 |         if (ae.getSource() == addStudent) {
151 |             this.setEnabled(false);
152 |             new AddStudent(this).setVisible(true);
153 |         }
154 |         if (ae.getSource() == viewStudent) {
155 |             this.setEnabled(false);
156 |             new ViewStudent(this).setVisible(true);
157 |         }
158 |         if (ae.getSource() == upStudent) {
159 |             this.setEnabled(false);
160 |             new UpdateStudent(this).setVisible(true);
161 |         }
162 |         if (ae.getSource() == removeStudent) {
163 |             this.setEnabled(false);
164 |             new RemoveStudent(this).setVisible(true);
165 |         }
166 |         if (ae.getSource() == addClass) {
167 |             this.setEnabled(false);
168 |             new AddClass(this).setVisible(true);
169 |         }
170 |         if (ae.getSource() == upClass) {
171 |             this.setEnabled(false);
172 |             new UpdateClass(this).setVisible(true);
173 |         }
174 |         if (ae.getSource() == viewClass) {
175 |             this.setEnabled(false);
176 |             new ViewClass(this).setVisible(true);
177 |         }
178 |         if (ae.getSource() == markd) {
179 |             this.setEnabled(false);
180 |             new AddMarks(this).setVisible(true);
181 |         }
182 |         if (ae.getSource() == addSubject) {
183 |             this.setEnabled(false);
184 |             new AddSubject(this).setVisible(true);
185 |         }
186 |         if (ae.getSource() == viewSubject) {
187 |             this.setEnabled(false);
188 |             new ViewSubject(this).setVisible(true);
189 |         }
190 |         if (ae.getSource() == result) {
191 |             this.setEnabled(false);
192 |             new AddResult(this).setVisible(true);
193 |         }
194 |     }
195 | }
196 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ChangePasswordAdmin.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | import java.util.logging.Level;
  8 | import java.util.logging.Logger;
  9 | 
 10 | public class ChangePasswordAdmin extends JFrame implements ActionListener {
 11 |     JFrame welcomeFrame;
 12 | 
 13 |     JPasswordField topass, tnpass, tcpass;
 14 |     JTextField tuser;
 15 |     JButton bChangepass, bback;
 16 |     JLabel show, show2,show3,show4,show5,show6;
 17 |     
 18 |     ChangePasswordAdmin(JFrame welcomeFrame) {
 19 |         this.welcomeFrame = welcomeFrame;
 20 |         
 21 |         JLabel ltitle, lpic, luser, lopass, lnpass, lcpass;
 22 | 
 23 |         //============set frame===========
 24 |         setTitle("Change Password");
 25 |         setSize(600, 500);
 26 |         setLayout(null);
 27 |         setVisible(true);
 28 |         setLocationRelativeTo(null);
 29 |         setResizable(false);
 30 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
 31 |         setIconImage(icon.getImage());
 32 | 
 33 |         //============set Font===========
 34 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 35 | 
 36 |         //============set Font Label===========
 37 |         ltitle = new JLabel("Change Admin Password");
 38 |         ltitle.setBounds(90, 30, 400, 50);
 39 |         ltitle.setForeground(Color.PINK);
 40 |         add(ltitle);
 41 |         ltitle.setFont(f1);
 42 | 
 43 |         //============set Label===========
 44 |         luser = new JLabel("Username");
 45 |         luser.setBounds(70, 100, 100, 30);
 46 |         luser.setForeground(Color.white);
 47 |         add(luser);
 48 | 
 49 |         lopass = new JLabel("Old Password");
 50 |         lopass.setBounds(70, 150, 150, 50);
 51 |         lopass.setForeground(Color.white);
 52 |         add(lopass);
 53 | 
 54 |         lnpass = new JLabel("New Password");
 55 |         lnpass.setBounds(70, 210, 150, 50);
 56 |         lnpass.setForeground(Color.white);
 57 |         add(lnpass);
 58 | 
 59 |         lcpass = new JLabel("Confirm Password");
 60 |         lcpass.setBounds(70, 270, 150, 50);
 61 |         lcpass.setForeground(Color.white);
 62 |         add(lcpass);
 63 | 
 64 |         //============set text field============
 65 |         tuser = new JTextField();
 66 |         tuser.setBounds(250, 100, 200, 30);
 67 |         tuser.setFont(new Font("Monotype",Font.BOLD,18));
 68 |         add(tuser);
 69 | 
 70 |         topass = new JPasswordField();
 71 |         topass.setBounds(250, 165, 200, 30);
 72 |         topass.setBackground(Color.orange);
 73 |         topass.setFont(new Font("Monotype",Font.BOLD,18));
 74 |         topass.setEchoChar('•');
 75 |         add(topass);
 76 |         
 77 |         //==========password show/hide label=========
 78 |         show = new JLabel("Show Password");
 79 |         show.setBounds(460, 165, 100, 30);
 80 |         show.setForeground(Color.yellow);
 81 |         add(show);
 82 | 
 83 |         show.addMouseListener(new MouseAdapter() {
 84 |             @Override
 85 |             public void mouseClicked(MouseEvent e) {
 86 |                 if (e.getSource() == show) {
 87 |                     topass.setEchoChar((char) 0);
 88 |                     show.setVisible(false);
 89 |                     show2.setVisible(true);
 90 |                 } else {
 91 |                     topass.setEchoChar('•');
 92 |                 }
 93 |             }
 94 |         });
 95 | 
 96 |         show2 = new JLabel("Hide Password");
 97 |         show2.setBounds(460, 165, 100, 30);
 98 |         show2.setForeground(Color.yellow);
 99 |         show2.setVisible(false);
100 |         add(show2);
101 | 
102 |         show2.addMouseListener(new MouseAdapter() {
103 |             @Override
104 |             public void mouseClicked(MouseEvent e) {
105 |                 if (e.getSource() == show2) {
106 |                     topass.setEchoChar('•');
107 |                     show2.setVisible(false);
108 |                     show.setVisible(true);
109 |                 } else {
110 |                     topass.setEchoChar((char) 0);
111 |                 }
112 |             }
113 |         });
114 | 
115 |         tnpass = new JPasswordField();
116 |         tnpass.setBounds(250, 220, 200, 30);
117 |         tnpass.setBackground(Color.orange);
118 |         tnpass.setFont(new Font("Monotype",Font.BOLD,18));
119 |         tnpass.setEchoChar('•');
120 |         add(tnpass);
121 |         
122 |         //==========password show/hide label=========
123 |         show3 = new JLabel("Show Password");
124 |         show3.setBounds(455, 220, 100, 30);
125 |         show3.setForeground(Color.yellow);
126 |         add(show3);
127 | 
128 |         show3.addMouseListener(new MouseAdapter() {
129 |             @Override
130 |             public void mouseClicked(MouseEvent e) {
131 |                 if (e.getSource() == show3) {
132 |                     tnpass.setEchoChar((char) 0);
133 |                     show3.setVisible(false);
134 |                     show4.setVisible(true);
135 |                 } else {
136 |                     tnpass.setEchoChar('•');
137 |                 }
138 |             }
139 |         });
140 | 
141 |         show4 = new JLabel("Hide Password");
142 |         show4.setBounds(455, 220, 100, 30);
143 |         show4.setForeground(Color.yellow);
144 |         show4.setVisible(false);
145 |         add(show4);
146 | 
147 |         show4.addMouseListener(new MouseAdapter() {
148 |             @Override
149 |             public void mouseClicked(MouseEvent e) {
150 |                 if (e.getSource() == show4) {
151 |                     tnpass.setEchoChar('•');
152 |                     show4.setVisible(false);
153 |                     show3.setVisible(true);
154 |                 } else {
155 |                     tnpass.setEchoChar((char) 0);
156 |                 }
157 |             }
158 |         });
159 | 
160 |         tcpass = new JPasswordField();
161 |         tcpass.setBounds(250, 280, 200, 30);
162 |         tcpass.setBackground(Color.orange);
163 |         tcpass.setFont(new Font("Monotype",Font.BOLD,18));
164 |         tcpass.setEchoChar('•');
165 |         add(tcpass);
166 |       
167 |         //==========password show/hide label=========
168 |         show5 = new JLabel("Show Password");
169 |         show5.setBounds(455, 280, 100, 30);
170 |         show5.setForeground(Color.yellow);
171 |         add(show5);
172 | 
173 |         show5.addMouseListener(new MouseAdapter() {
174 |             @Override
175 |             public void mouseClicked(MouseEvent e) {
176 |                 if (e.getSource() == show5) {
177 |                     tcpass.setEchoChar((char) 0);
178 |                     show5.setVisible(false);
179 |                     show6.setVisible(true);
180 |                 } else {
181 |                     tcpass.setEchoChar('•');
182 |                 }
183 |             }
184 |         });
185 | 
186 |         show6 = new JLabel("Hide Password");
187 |         show6.setBounds(455, 280, 100, 30);
188 |         show6.setForeground(Color.yellow);
189 |         show6.setVisible(false);
190 |         add(show6);
191 | 
192 |         show6.addMouseListener(new MouseAdapter() {
193 |             @Override
194 |             public void mouseClicked(MouseEvent e) {
195 |                 if (e.getSource() == show6) {
196 |                     tcpass.setEchoChar('•');
197 |                     show6.setVisible(false);
198 |                     show5.setVisible(true);
199 |                 } else {
200 |                     tcpass.setEchoChar((char) 0);
201 |                 }
202 |             }
203 |         });
204 | 
205 |         //============set Button============
206 |         bChangepass = new JButton("Change Password");
207 |         bChangepass.setBounds(250, 330, 150, 30);
208 |         bChangepass.setBackground(Color.black);
209 |         bChangepass.setForeground(Color.white);
210 |         add(bChangepass);
211 |         bChangepass.addActionListener(this);
212 | 
213 |         bback = new JButton("Back");
214 |         bback.setBounds(250, 380, 100, 30);
215 |         bback.setBackground(Color.blue);
216 |         bback.setForeground(Color.yellow);
217 |         add(bback);
218 |         bback.addActionListener(this);
219 | 
220 |         //============set Image===================
221 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\chengepass.jpg");
222 |         lpic = new JLabel(img);
223 |         lpic.setBounds(0, 0, 600, 500);
224 |         add(lpic);
225 |         
226 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
227 |             @Override
228 |             public void windowClosing(java.awt.event.WindowEvent e) {
229 |                 welcomeFrame.setEnabled(true); 
230 |             }
231 |         });
232 | 
233 |         //============set corsor===================
234 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
235 |         bChangepass.setCursor(c);
236 |         bback.setCursor(c);
237 |         show.setCursor(c);
238 |         show2.setCursor(c);
239 |         show3.setCursor(c);
240 |         show4.setCursor(c);
241 |         show5.setCursor(c);
242 |         show6.setCursor(c);
243 |     }
244 | 
245 |     public void actionPerformed(ActionEvent ae) {
246 |         if (ae.getSource() == bChangepass) {
247 |             String username = tuser.getText();
248 |             String oldPassword = new String(topass.getPassword());
249 |             String newPassword = new String(tnpass.getPassword());
250 |             String confirmPassword = new String(tcpass.getPassword());
251 | 
252 |             if (newPassword.equals(confirmPassword)) {
253 |                 try {
254 |                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
255 |                     String q = "SELECT * FROM admin WHERE username = ? AND password = ?";
256 |                     PreparedStatement pst = con.prepareStatement(q);
257 |                     pst.setString(1, username);
258 |                     pst.setString(2, oldPassword);
259 |                     ResultSet rs = pst.executeQuery();
260 | 
261 |                     if (rs.next()) {
262 |                         String q2 = "UPDATE admin SET password = ? WHERE username = ?";
263 |                         pst = con.prepareStatement(q2);
264 |                         pst.setString(1, newPassword);
265 |                         pst.setString(2, username);
266 |                         pst.executeUpdate();
267 | 
268 |                         JOptionPane.showMessageDialog(this, "Password changed successfully!");
269 |                     } else {
270 |                         JOptionPane.showMessageDialog(this, "Username/Password is incorrect.");
271 |                     }
272 |                     rs.close();
273 |                     pst.close();
274 |                     con.close();
275 |                 } catch (SQLException ex) {
276 |                     Logger.getLogger(ChangePasswordStudent.class.getName()).log(Level.SEVERE, null, ex);
277 |                     JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
278 |                 }
279 |             } else {
280 |                 JOptionPane.showMessageDialog(this, "New Password and Confirm Password do not match.");
281 |             }
282 |         }
283 | 
284 |         if (ae.getSource() == bback) {
285 |             new LoginAdmin(welcomeFrame).setVisible(true);
286 |             dispose();
287 |         }
288 |     }
289 | }


--------------------------------------------------------------------------------
/src/School_Management_System/ChangePasswordStudent.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | import java.util.logging.Level;
  8 | import java.util.logging.Logger;
  9 | 
 10 | public class ChangePasswordStudent extends JFrame implements ActionListener {
 11 |     JFrame welcomeFrame;
 12 | 
 13 |     JPasswordField topass, tnpass, tcpass;
 14 |     JTextField tuser;
 15 |     JButton bChangepass, bback;
 16 |     JLabel show, show2, show3, show4, show5, show6;
 17 | 
 18 |     ChangePasswordStudent(JFrame welcomeFrame) {
 19 |         this.welcomeFrame = welcomeFrame;
 20 |         
 21 |         JLabel ltitle, lpic, luser, lopass, lnpass, lcpass;
 22 | 
 23 |         //============set frame===========
 24 |         setTitle("Change Password");
 25 |         setSize(600, 500);
 26 |         setLayout(null);
 27 |         setVisible(true);
 28 |         setLocationRelativeTo(null);
 29 |         setResizable(false);
 30 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 31 |         setIconImage(icon.getImage());
 32 | 
 33 |         //============set Font===========
 34 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 35 | 
 36 |         //============set Font Label===========
 37 |         ltitle = new JLabel("Change Password");
 38 |         ltitle.setBounds(150, 30, 400, 50);
 39 |         ltitle.setForeground(Color.PINK);
 40 |         add(ltitle);
 41 |         ltitle.setFont(f1);
 42 | 
 43 |         //============set Label===========
 44 |         luser = new JLabel("Username");
 45 |         luser.setBounds(70, 100, 100, 30);
 46 |         luser.setForeground(Color.white);
 47 |         add(luser);
 48 | 
 49 |         lopass = new JLabel("Old Password");
 50 |         lopass.setBounds(70, 150, 150, 50);
 51 |         lopass.setForeground(Color.white);
 52 |         add(lopass);
 53 | 
 54 |         lnpass = new JLabel("New Password");
 55 |         lnpass.setBounds(70, 210, 150, 50);
 56 |         lnpass.setForeground(Color.white);
 57 |         add(lnpass);
 58 | 
 59 |         lcpass = new JLabel("Confirm Password");
 60 |         lcpass.setBounds(70, 270, 150, 50);
 61 |         lcpass.setForeground(Color.white);
 62 |         add(lcpass);
 63 | 
 64 |         //============set text field============
 65 |         tuser = new JTextField();
 66 |         tuser.setBounds(250, 100, 200, 30);
 67 |         tuser.setFont(new Font("Monotype", Font.BOLD, 18));
 68 |         add(tuser);
 69 | 
 70 |         topass = new JPasswordField();
 71 |         topass.setBounds(250, 165, 200, 30);
 72 |         topass.setBackground(Color.orange);
 73 |         topass.setFont(new Font("Monotype", Font.BOLD, 18));
 74 |         topass.setEchoChar('•');
 75 |         add(topass);
 76 | 
 77 |         //==========password show/hide label=========
 78 |         show = new JLabel("Show Password");
 79 |         show.setBounds(460, 165, 100, 30);
 80 |         show.setForeground(Color.yellow);
 81 |         add(show);
 82 | 
 83 |         show.addMouseListener(new MouseAdapter() {
 84 |             @Override
 85 |             public void mouseClicked(MouseEvent e) {
 86 |                 if (e.getSource() == show) {
 87 |                     topass.setEchoChar((char) 0);
 88 |                     show.setVisible(false);
 89 |                     show2.setVisible(true);
 90 |                 } else {
 91 |                     topass.setEchoChar('•');
 92 |                 }
 93 |             }
 94 |         });
 95 | 
 96 |         show2 = new JLabel("Hide Password");
 97 |         show2.setBounds(460, 165, 100, 30);
 98 |         show2.setForeground(Color.yellow);
 99 |         show2.setVisible(false);
100 |         add(show2);
101 | 
102 |         show2.addMouseListener(new MouseAdapter() {
103 |             @Override
104 |             public void mouseClicked(MouseEvent e) {
105 |                 if (e.getSource() == show2) {
106 |                     topass.setEchoChar('•');
107 |                     show2.setVisible(false);
108 |                     show.setVisible(true);
109 |                 } else {
110 |                     topass.setEchoChar((char) 0);
111 |                 }
112 |             }
113 |         });
114 | 
115 |         tnpass = new JPasswordField();
116 |         tnpass.setBounds(250, 220, 200, 30);
117 |         tnpass.setBackground(Color.orange);
118 |         tnpass.setFont(new Font("Monotype", Font.BOLD, 18));
119 |         tnpass.setEchoChar('•');
120 |         add(tnpass);
121 | 
122 |         //==========password show/hide label=========
123 |         show3 = new JLabel("Show Password");
124 |         show3.setBounds(455, 220, 100, 30);
125 |         show3.setForeground(Color.yellow);
126 |         add(show3);
127 | 
128 |         show3.addMouseListener(new MouseAdapter() {
129 |             @Override
130 |             public void mouseClicked(MouseEvent e) {
131 |                 if (e.getSource() == show3) {
132 |                     tnpass.setEchoChar((char) 0);
133 |                     show3.setVisible(false);
134 |                     show4.setVisible(true);
135 |                 } else {
136 |                     tnpass.setEchoChar('●');
137 |                 }
138 |             }
139 |         });
140 | 
141 |         show4 = new JLabel("Hide Password");
142 |         show4.setBounds(455, 220, 100, 30);
143 |         show4.setForeground(Color.yellow);
144 |         show4.setVisible(false);
145 |         add(show4);
146 | 
147 |         show4.addMouseListener(new MouseAdapter() {
148 |             @Override
149 |             public void mouseClicked(MouseEvent e) {
150 |                 if (e.getSource() == show4) {
151 |                     tnpass.setEchoChar('•');
152 |                     show4.setVisible(false);
153 |                     show3.setVisible(true);
154 |                 } else {
155 |                     tnpass.setEchoChar((char) 0);
156 |                 }
157 |             }
158 |         });
159 | 
160 |         tcpass = new JPasswordField();
161 |         tcpass.setBounds(250, 280, 200, 30);
162 |         tcpass.setBackground(Color.orange);
163 |         tcpass.setFont(new Font("Monotype", Font.BOLD, 18));
164 |         tcpass.setEchoChar('•');
165 |         add(tcpass);
166 | 
167 |         //==========password show/hide label=========
168 |         show5 = new JLabel("Show Password");
169 |         show5.setBounds(455, 280, 100, 30);
170 |         show5.setForeground(Color.yellow);
171 |         add(show5);
172 | 
173 |         show5.addMouseListener(new MouseAdapter() {
174 |             @Override
175 |             public void mouseClicked(MouseEvent e) {
176 |                 if (e.getSource() == show5) {
177 |                     tcpass.setEchoChar((char) 0);
178 |                     show5.setVisible(false);
179 |                     show6.setVisible(true);
180 |                 } else {
181 |                     tcpass.setEchoChar('•');
182 |                 }
183 |             }
184 |         });
185 | 
186 |         show6 = new JLabel("Hide Password");
187 |         show6.setBounds(455, 280, 100, 30);
188 |         show6.setForeground(Color.yellow);
189 |         show6.setVisible(false);
190 |         add(show6);
191 | 
192 |         show6.addMouseListener(new MouseAdapter() {
193 |             @Override
194 |             public void mouseClicked(MouseEvent e) {
195 |                 if (e.getSource() == show6) {
196 |                     tcpass.setEchoChar('•');
197 |                     show6.setVisible(false);
198 |                     show5.setVisible(true);
199 |                 } else {
200 |                     tcpass.setEchoChar((char) 0);
201 |                 }
202 |             }
203 |         });
204 | 
205 |         //============set Button============
206 |         bChangepass = new JButton("Change Password");
207 |         bChangepass.setBounds(250, 330, 150, 30);
208 |         bChangepass.setBackground(Color.black);
209 |         bChangepass.setForeground(Color.white);
210 |         add(bChangepass);
211 |         bChangepass.addActionListener(this);
212 | 
213 |         bback = new JButton("Back");
214 |         bback.setBounds(250, 380, 100, 30);
215 |         bback.setBackground(Color.blue);
216 |         bback.setForeground(Color.yellow);
217 |         add(bback);
218 |         bback.addActionListener(this);
219 | 
220 |         //============set Image===================
221 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\chengepass.jpg");
222 |         lpic = new JLabel(img);
223 |         lpic.setBounds(0, 0, 600, 500);
224 |         add(lpic);
225 |         
226 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
227 |             @Override
228 |             public void windowClosing(java.awt.event.WindowEvent e) {
229 |                 welcomeFrame.setEnabled(true); 
230 |             }
231 |         });
232 | 
233 |         //============set corsor===================
234 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
235 |         bChangepass.setCursor(c);
236 |         bback.setCursor(c);
237 |         show.setCursor(c);
238 |         show2.setCursor(c);
239 |         show3.setCursor(c);
240 |         show4.setCursor(c);
241 |         show5.setCursor(c);
242 |         show6.setCursor(c);
243 |     }
244 | 
245 |     public void actionPerformed(ActionEvent ae) {
246 |         if (ae.getSource() == bChangepass) {
247 |             String username = tuser.getText();
248 |             String oldPassword = new String(topass.getPassword());
249 |             String newPassword = new String(tnpass.getPassword());
250 |             String confirmPassword = new String(tcpass.getPassword());
251 | 
252 |             if (newPassword.equals(confirmPassword)) {
253 |                 try {
254 |                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
255 |                     String q = "SELECT * FROM Student2 WHERE username = ? AND password = ?";
256 |                     PreparedStatement pst = con.prepareStatement(q);
257 |                     pst.setString(1, username);
258 |                     pst.setString(2, oldPassword);
259 |                     ResultSet rs = pst.executeQuery();
260 | 
261 |                     if (rs.next()) {
262 |                         String q2 = "UPDATE Student2 SET password = ? WHERE username = ?";
263 |                         pst = con.prepareStatement(q2);
264 |                         pst.setString(1, newPassword);
265 |                         pst.setString(2, username);
266 |                         pst.executeUpdate();
267 | 
268 |                         JOptionPane.showMessageDialog(this, "Password changed successfully!");
269 |                     } else {
270 |                         JOptionPane.showMessageDialog(this, "Username/Password is incorrect.");
271 |                     }
272 |                     rs.close();
273 |                     pst.close();
274 |                     con.close();
275 |                 } catch (SQLException ex) {
276 |                     Logger.getLogger(ChangePasswordStudent.class.getName()).log(Level.SEVERE, null, ex);
277 |                     JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
278 |                 }
279 |             } else {
280 |                 JOptionPane.showMessageDialog(this, "New Password and Confirm Password do not match.");
281 |             }
282 |         }
283 |         if (ae.getSource() == bback) {
284 |             new LoginStudent(welcomeFrame).setVisible(true);
285 |             dispose();
286 |         }
287 |     }
288 | 
289 | }
290 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ChangePasswordTeacher.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | import java.util.logging.Level;
  8 | import java.util.logging.Logger;
  9 | 
 10 | public class ChangePasswordTeacher extends JFrame implements ActionListener {
 11 |     JFrame welcomeFrame;
 12 |     
 13 |     JPasswordField topass, tnpass, tcpass;
 14 |     JTextField tuser;
 15 |     JButton bChangepass, bback;
 16 |     JLabel show, show2, show3, show4, show5, show6;
 17 | 
 18 |     ChangePasswordTeacher(JFrame welcomeFrame) {
 19 |         this.welcomeFrame = welcomeFrame;
 20 |         
 21 |         JLabel ltitle, lpic, luser, lopass, lnpass, lcpass;
 22 | 
 23 |         //============set frame===========
 24 |         setTitle("Change Password");
 25 |         setSize(600, 500);
 26 |         setLayout(null);
 27 |         setVisible(true);
 28 |         setLocationRelativeTo(null);
 29 |         setResizable(false);
 30 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
 31 |         setIconImage(icon.getImage());
 32 | 
 33 |         //============set Font===========
 34 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 35 | 
 36 |         //============set Font Label===========
 37 |         ltitle = new JLabel("Change Teacher Password");
 38 |         ltitle.setBounds(90, 30, 400, 50);
 39 |         ltitle.setForeground(Color.PINK);
 40 |         add(ltitle);
 41 |         ltitle.setFont(f1);
 42 | 
 43 |         //============set Label===========
 44 |         luser = new JLabel("User Name");
 45 |         luser.setBounds(70, 100, 100, 30);
 46 |         luser.setForeground(Color.white);
 47 |         add(luser);
 48 | 
 49 |         lopass = new JLabel("Old Password");
 50 |         lopass.setBounds(70, 150, 150, 50);
 51 |         lopass.setForeground(Color.white);
 52 |         add(lopass);
 53 | 
 54 |         lnpass = new JLabel("New Password");
 55 |         lnpass.setBounds(70, 210, 150, 50);
 56 |         lnpass.setForeground(Color.white);
 57 |         add(lnpass);
 58 | 
 59 |         lcpass = new JLabel("Confirm Password");
 60 |         lcpass.setBounds(70, 270, 150, 50);
 61 |         lcpass.setForeground(Color.white);
 62 |         add(lcpass);
 63 | 
 64 |          //============set text field============
 65 |         tuser = new JTextField();
 66 |         tuser.setBounds(250, 100, 200, 30);
 67 |         tuser.setFont(new Font("Monotype",Font.BOLD,18));
 68 |         add(tuser);
 69 | 
 70 |         topass = new JPasswordField();
 71 |         topass.setBounds(250, 165, 200, 30);
 72 |         topass.setBackground(Color.orange);
 73 |         topass.setFont(new Font("Monotype",Font.BOLD,18));
 74 |         topass.setEchoChar('•');
 75 |         add(topass);
 76 |         
 77 |         //==========password show/hide label=========
 78 |         show = new JLabel("Show Password");
 79 |         show.setBounds(460, 165, 100, 30);
 80 |         show.setForeground(Color.yellow);
 81 |         add(show);
 82 | 
 83 |         show.addMouseListener(new MouseAdapter() {
 84 |             @Override
 85 |             public void mouseClicked(MouseEvent e) {
 86 |                 if (e.getSource() == show) {
 87 |                     topass.setEchoChar((char) 0);
 88 |                     show.setVisible(false);
 89 |                     show2.setVisible(true);
 90 |                 } else {
 91 |                     topass.setEchoChar('•');
 92 |                 }
 93 |             }
 94 |         });
 95 | 
 96 |         show2 = new JLabel("Hide Password");
 97 |         show2.setBounds(460, 165, 100, 30);
 98 |         show2.setForeground(Color.yellow);
 99 |         show2.setVisible(false);
100 |         add(show2);
101 | 
102 |         show2.addMouseListener(new MouseAdapter() {
103 |             @Override
104 |             public void mouseClicked(MouseEvent e) {
105 |                 if (e.getSource() == show2) {
106 |                     topass.setEchoChar('•');
107 |                     show2.setVisible(false);
108 |                     show.setVisible(true);
109 |                 } else {
110 |                     topass.setEchoChar((char) 0);
111 |                 }
112 |             }
113 |         });
114 | 
115 |         tnpass = new JPasswordField();
116 |         tnpass.setBounds(250, 220, 200, 30);
117 |         tnpass.setBackground(Color.orange);
118 |         tnpass.setFont(new Font("Monotype",Font.BOLD,18));
119 |         tnpass.setEchoChar('•');
120 |         add(tnpass);
121 |         
122 |         //==========password show/hide label=========
123 |         show3 = new JLabel("Show Password");
124 |         show3.setBounds(455, 220, 100, 30);
125 |         show3.setForeground(Color.yellow);
126 |         add(show3);
127 | 
128 |         show3.addMouseListener(new MouseAdapter() {
129 |             @Override
130 |             public void mouseClicked(MouseEvent e) {
131 |                 if (e.getSource() == show3) {
132 |                     tnpass.setEchoChar((char) 0);
133 |                     show3.setVisible(false);
134 |                     show4.setVisible(true);
135 |                 } else {
136 |                     tnpass.setEchoChar('•');
137 |                 }
138 |             }
139 |         });
140 | 
141 |         show4 = new JLabel("Hide Password");
142 |         show4.setBounds(455, 220, 100, 30);
143 |         show4.setForeground(Color.yellow);
144 |         show4.setVisible(false);
145 |         add(show4);
146 | 
147 |         show4.addMouseListener(new MouseAdapter() {
148 |             @Override
149 |             public void mouseClicked(MouseEvent e) {
150 |                 if (e.getSource() == show4) {
151 |                     tnpass.setEchoChar('•');
152 |                     show4.setVisible(false);
153 |                     show3.setVisible(true);
154 |                 } else {
155 |                     tnpass.setEchoChar((char) 0);
156 |                 }
157 |             }
158 |         });
159 | 
160 |         tcpass = new JPasswordField();
161 |         tcpass.setBounds(250, 280, 200, 30);
162 |         tcpass.setBackground(Color.orange);
163 |         tcpass.setFont(new Font("Monotype",Font.BOLD,18));
164 |         tcpass.setEchoChar('•');
165 |         add(tcpass);
166 |       
167 |         //==========password show/hide label=========
168 |         show5 = new JLabel("Show Password");
169 |         show5.setBounds(455, 280, 100, 30);
170 |         show5.setForeground(Color.yellow);
171 |         add(show5);
172 | 
173 |         show5.addMouseListener(new MouseAdapter() {
174 |             @Override
175 |             public void mouseClicked(MouseEvent e) {
176 |                 if (e.getSource() == show5) {
177 |                     tcpass.setEchoChar((char) 0);
178 |                     show5.setVisible(false);
179 |                     show6.setVisible(true);
180 |                 } else {
181 |                     tcpass.setEchoChar('•');
182 |                 }
183 |             }
184 |         });
185 | 
186 |         show6 = new JLabel("Hide Password");
187 |         show6.setBounds(455, 280, 100, 30);
188 |         show6.setForeground(Color.yellow);
189 |         show6.setVisible(false);
190 |         add(show6);
191 | 
192 |         show6.addMouseListener(new MouseAdapter() {
193 |             @Override
194 |             public void mouseClicked(MouseEvent e) {
195 |                 if (e.getSource() == show6) {
196 |                     tcpass.setEchoChar('•');
197 |                     show6.setVisible(false);
198 |                     show5.setVisible(true);
199 |                 } else {
200 |                     tcpass.setEchoChar((char) 0);
201 |                 }
202 |             }
203 |         });
204 | 
205 |         //============set Button============
206 |         bChangepass = new JButton("Change Password");
207 |         bChangepass.setBounds(250, 330, 150, 30);
208 |         bChangepass.setBackground(Color.black);
209 |         bChangepass.setForeground(Color.white);
210 |         add(bChangepass);
211 |         bChangepass.addActionListener(this);
212 | 
213 |         bback = new JButton("Back");
214 |         bback.setBounds(250, 380, 100, 30);
215 |         bback.setBackground(Color.blue);
216 |         bback.setForeground(Color.yellow);
217 |         add(bback);
218 |         bback.addActionListener(this);
219 | 
220 |         //============set Image===================
221 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\chengepass.jpg");
222 |         lpic = new JLabel(img);
223 |         lpic.setBounds(0, 0, 600, 500);
224 |         add(lpic);
225 |         
226 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
227 |             @Override
228 |             public void windowClosing(java.awt.event.WindowEvent e) {
229 |                 welcomeFrame.setEnabled(true); 
230 |             }
231 |         });
232 | 
233 |         //============set corsor===================
234 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
235 |         bChangepass.setCursor(c);
236 |         bback.setCursor(c);
237 |         show.setCursor(c);
238 |         show2.setCursor(c);
239 |         show3.setCursor(c);
240 |         show4.setCursor(c);
241 |         show5.setCursor(c);
242 |         show6.setCursor(c);
243 |     }
244 | 
245 |     public void actionPerformed(ActionEvent ae) {
246 |         if (ae.getSource() == bChangepass) {
247 |             String username = tuser.getText();
248 |             String oldPassword = new String(topass.getPassword());
249 |             String newPassword = new String(tnpass.getPassword());
250 |             String confirmPassword = new String(tcpass.getPassword());
251 | 
252 |             if (newPassword.equals(confirmPassword)) {
253 |                 try {
254 |                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
255 |                     String q = "SELECT * FROM Teacher2 WHERE username = ? AND password = ?";
256 |                     PreparedStatement pst = con.prepareStatement(q);
257 |                     pst.setString(1, username);
258 |                     pst.setString(2, oldPassword);
259 |                     ResultSet rs = pst.executeQuery();
260 | 
261 |                     if (rs.next()) {
262 |                         String q2 = "UPDATE Teacher2 SET password = ? WHERE username = ?";
263 |                         pst = con.prepareStatement(q2);
264 |                         pst.setString(1, newPassword);
265 |                         pst.setString(2, username);
266 |                         pst.executeUpdate();
267 | 
268 |                         JOptionPane.showMessageDialog(this, "Password changed successfully.......");
269 |                     } else {
270 |                         JOptionPane.showMessageDialog(this, "Username/Password is incorrect.");
271 |                     }
272 |                     rs.close();
273 |                     pst.close();
274 |                     con.close();
275 |                 } catch (SQLException ex) {
276 |                     Logger.getLogger(ChangePasswordStudent.class.getName()).log(Level.SEVERE, null, ex);
277 |                     JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
278 |                 }
279 |             } else {
280 |                 JOptionPane.showMessageDialog(this, "New Password and Confirm Password do not match.");
281 |             }
282 |         }
283 |         if (ae.getSource() == bback) {
284 |             new LoginTeacher(welcomeFrame).setVisible(true);
285 |             dispose();
286 |         }
287 |     }
288 | 
289 | }
290 | 


--------------------------------------------------------------------------------
/src/School_Management_System/FacultyHomePage.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import java.io.IOException;
  6 | import java.io.InputStream;
  7 | import java.sql.Connection;
  8 | import java.sql.DriverManager;
  9 | import java.sql.PreparedStatement;
 10 | import java.sql.ResultSet;
 11 | import java.sql.SQLException;
 12 | import java.util.logging.Level;
 13 | import java.util.logging.Logger;
 14 | import javax.swing.*;
 15 | 
 16 | public class FacultyHomePage extends JFrame implements ActionListener {
 17 |     JButton labelUsername;
 18 |     JMenuItem viewTeacher, upStudent, viewStudent, bback;
 19 |     JMenuItem my, upClass, viewClass, viewSubject, markd, result;
 20 | 
 21 |     FacultyHomePage(String username) {
 22 |         
 23 |         //============set frame===========
 24 |         setTitle("Teacher Home Page");
 25 |         setSize(1530, 810);
 26 |         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 27 |         setLayout(null);
 28 |         setVisible(true);
 29 |         setLocationRelativeTo(null);
 30 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 31 |         setIconImage(icon.getImage());
 32 | 
 33 |         //============set Font===========
 34 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 80);
 35 |         Font f2 = new Font("Monotype Corsiva", Font.BOLD, 25);
 36 | 
 37 |         //============set Font Label===========
 38 |         JLabel lsms = new JLabel("School Management System");
 39 |         lsms.setBounds(80, 75, 1000, 100);
 40 |         lsms.setForeground(Color.blue);
 41 |         add(lsms);
 42 |         lsms.setFont(f1);
 43 | 
 44 |         JLabel welcomeAdmin = new JLabel("Welcome Sir");
 45 |         welcomeAdmin.setBounds(200, 180, 250, 60);
 46 |         welcomeAdmin.setForeground(Color.white);
 47 |         add(welcomeAdmin);
 48 |         welcomeAdmin.setFont(f2);
 49 | 
 50 |         labelUsername = new JButton(username);
 51 |         labelUsername.setBounds(295, 193, 200, 35);
 52 |         labelUsername.setFont(f2);
 53 |         labelUsername.setForeground(Color.ORANGE);
 54 |         labelUsername.setContentAreaFilled(false); 
 55 |         labelUsername.setOpaque(false); 
 56 |         labelUsername.setBorderPainted(false);
 57 |         labelUsername.addActionListener(this);
 58 |         add(labelUsername);
 59 |         
 60 |         try {
 61 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
 62 |             PreparedStatement pst = con.prepareStatement("SELECT image FROM teacher2 WHERE username = ?");
 63 |             pst.setString(1, username);
 64 |             ResultSet rs = pst.executeQuery();
 65 | 
 66 |             if (rs.next()) {
 67 |                 InputStream input = rs.getBinaryStream("image");
 68 |                 byte[] buffer = input.readAllBytes();
 69 |                 ImageIcon imageIcon = new ImageIcon(buffer);
 70 |                 Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
 71 |                 JLabel profile = new JLabel();
 72 |                 profile.setBounds(80, 155, 100, 100);
 73 |                 profile.setBorder(BorderFactory.createLineBorder(Color.WHITE));
 74 |                 add(profile);
 75 |                 profile.setIcon(new ImageIcon(image));
 76 |                 profile.setText("");
 77 |                 profile.addMouseListener(new MouseAdapter() {
 78 |                     @Override
 79 |                     public void mouseClicked(MouseEvent e) {
 80 |                         showFullImage(imageIcon);
 81 |                     }
 82 |                 });
 83 |             }
 84 |             con.close();
 85 |         } catch (SQLException e) {
 86 |             e.printStackTrace();
 87 |         } catch (IOException ex) {
 88 |             Logger.getLogger(StudentHomePage.class.getName()).log(Level.SEVERE, null, ex);
 89 |         }
 90 | 
 91 |         //============set Menubar===========
 92 |         JMenuBar menubar = new JMenuBar();
 93 | 
 94 |         my = new JMenuItem("                 My Profile                ");
 95 |         my.setBackground(Color.BLACK);
 96 |         my.setForeground(Color.white);
 97 |         my.addActionListener(this);
 98 |         menubar.add(my);
 99 | 
100 |         viewTeacher = new JMenuItem("                  All Teachers                 ");
101 |         viewTeacher.setBackground(Color.CYAN);
102 |         viewTeacher.addActionListener(this);
103 |         menubar.add(viewTeacher);
104 | 
105 |         JMenu studentPro = new JMenu("                 Students Profile              ");
106 |         studentPro.setForeground(Color.MAGENTA);
107 | 
108 |         upStudent = new JMenuItem("Update Student Profile");
109 |         upStudent.addActionListener(this);
110 |         studentPro.add(upStudent);
111 |         viewStudent = new JMenuItem("View Student Profile");
112 |         viewStudent.addActionListener(this);
113 |         studentPro.add(viewStudent);
114 | 
115 |         menubar.add(studentPro);
116 | 
117 |         JMenu classd = new JMenu("                       Class                        ");
118 |         classd.setBackground(Color.white);
119 |         classd.setForeground(Color.blue);
120 | 
121 |         upClass = new JMenuItem("Update Class Details");
122 |         upClass.addActionListener(this);
123 |         classd.add(upClass);
124 |         viewClass = new JMenuItem("View Class Details");
125 |         viewClass.addActionListener(this);
126 |         classd.add(viewClass);
127 |         menubar.add(classd);
128 | 
129 |         viewSubject = new JMenuItem("                     Subject                        ");
130 |         viewSubject.setBackground(Color.GRAY);
131 |         viewSubject.setForeground(Color.white);
132 |         viewSubject.addActionListener(this);
133 |         menubar.add(viewSubject);
134 | 
135 |         markd = new JMenuItem("                      Marks                               ");
136 |         markd.setBackground(Color.yellow);
137 |         markd.addActionListener(this);
138 |         menubar.add(markd);
139 | 
140 |         result = new JMenuItem("                      Result                             ");
141 |         result.setBackground(Color.RED);
142 |         result.setForeground(Color.white);
143 |         result.addActionListener(this);
144 |         menubar.add(result);
145 | 
146 |         bback = new JMenuItem("                    Logout              ");
147 |         bback.setBackground(Color.black);
148 |         bback.setForeground(Color.white);
149 |         bback.addActionListener(this);
150 |         menubar.add(bback);
151 | 
152 |         setJMenuBar(menubar);
153 | 
154 |         //============set Image===================
155 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AdminHomePage111.jpg");
156 |         JLabel lpic = new JLabel(img);
157 |         lpic.setBounds(0, 0, 1580, 800);
158 |         add(lpic);
159 | 
160 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
161 |         menubar.setCursor(c);
162 |         labelUsername.setCursor(c);
163 |         bback.setCursor(c);
164 | 
165 |     }
166 | 
167 |     public void actionPerformed(ActionEvent ae) {
168 |         if (ae.getSource() == bback) {
169 |             dispose();
170 |             new Welcome().setVisible(true);
171 |         }
172 |         if (ae.getSource() == viewTeacher) {
173 |             this.setEnabled(false);
174 |             new ViewTeacher(this).setVisible(true);
175 |         }
176 |         if (ae.getSource() == viewStudent) {
177 |             this.setEnabled(false);
178 |             new ViewStudent(this).setVisible(true);
179 |         }
180 |         if (ae.getSource() == upStudent) {
181 |             this.setEnabled(false);
182 |             new UpdateStudent(this).setVisible(true);
183 |         }
184 |         if (ae.getSource() == upClass) {
185 |             this.setEnabled(false);
186 |             new UpdateClass(this).setVisible(true);
187 |         }
188 |         if (ae.getSource() == viewClass) {
189 |             this.setEnabled(false);
190 |             new ViewClass(this).setVisible(true);
191 |         }
192 |         if (ae.getSource() == markd) {
193 |             this.setEnabled(false);
194 |             new AddMarks(this).setVisible(true);
195 |         }
196 |         if (ae.getSource() == viewSubject) {
197 |             this.setEnabled(false);
198 |             new ViewSubject(this).setVisible(true);
199 |         }
200 |         if (ae.getSource() == result) {
201 |             this.setEnabled(false);
202 |             new AddResult(this).setVisible(true);
203 |         }
204 |         if (ae.getSource() == labelUsername) {
205 |             this.setEnabled(false);
206 |             String username = labelUsername.getText();
207 |             new MyProfile(username, this).setVisible(true);
208 |         }
209 |         if (ae.getSource() == my) {
210 |             this.setEnabled(false);
211 |             String username = labelUsername.getText();
212 |             new MyProfile(username, this).setVisible(true);
213 |         }
214 |     }
215 |     
216 |     private void showFullImage(ImageIcon imageIcon) {
217 |         JDialog fullImageFrame = new JDialog(this, "Profile Image", true);
218 |         fullImageFrame.setSize(550, 580);
219 |         fullImageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
220 |         fullImageFrame.setLocationRelativeTo(null);
221 |         fullImageFrame.setResizable(false);
222 |         JLabel lblFullImage = new JLabel();
223 |         lblFullImage.setHorizontalAlignment(JLabel.CENTER);
224 |         Image fullImage = imageIcon.getImage().getScaledInstance(550, 550, Image.SCALE_SMOOTH);
225 |         lblFullImage.setIcon(new ImageIcon(fullImage));
226 |         fullImageFrame.add(lblFullImage);
227 |         fullImageFrame.setVisible(true);
228 |     }
229 |     
230 | }
231 | 


--------------------------------------------------------------------------------
/src/School_Management_System/Feedback.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import java.sql.Connection;
  6 | import java.sql.DriverManager;
  7 | import java.sql.PreparedStatement;
  8 | import javax.swing.*;
  9 | 
 10 | public class Feedback extends JFrame implements ActionListener {
 11 |     JTextField tname, temail, tcontact;
 12 |     TextArea tmsg;
 13 |     JButton bsend, bback;
 14 |     JFrame parentFrame;
 15 | 
 16 |     Feedback(JFrame parentFrame) {
 17 |         this.parentFrame = parentFrame;
 18 |         JLabel ltitle, lname, lemail, lcontact, lmsg, lpic;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("Feedback Page");
 22 |         setSize(600, 500);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 32 |         Font f2 = new Font("Monotype Corsiva", Font.BOLD, 20);
 33 | 
 34 |         //============set Font Label===========
 35 |         ltitle = new JLabel("Feedback");
 36 |         ltitle.setBounds(190, 30, 200, 50);
 37 |         ltitle.setForeground(Color.white);
 38 |         add(ltitle);
 39 |         ltitle.setFont(f1);
 40 | 
 41 |         //============set Label===========
 42 |         lname = new JLabel("Name");
 43 |         lname.setForeground(Color.red);
 44 |         lname.setBounds(150, 100, 100, 30);
 45 |         add(lname);
 46 |         lname.setFont(f2);
 47 | 
 48 |         lemail = new JLabel("E-mail");
 49 |         lemail.setForeground(Color.white);
 50 |         lemail.setBounds(150, 150, 100, 30);
 51 |         add(lemail);
 52 |         lemail.setFont(f2);
 53 | 
 54 |         lcontact = new JLabel("Contact");
 55 |         lcontact.setForeground(Color.yellow);
 56 |         lcontact.setBounds(150, 200, 100, 30);
 57 |         add(lcontact);
 58 |         lcontact.setFont(f2);
 59 | 
 60 |         lmsg = new JLabel("Message");
 61 |         lmsg.setForeground(Color.white);
 62 |         lmsg.setBounds(150, 250, 100, 30);
 63 |         add(lmsg);
 64 |         lmsg.setFont(f2);
 65 | 
 66 |         //============set text field============
 67 |         tname = new JTextField();
 68 |         tname.setBounds(300, 100, 200, 30);
 69 |         tname.setFont(new Font("Arial", Font.BOLD, 15));
 70 |         add(tname);
 71 | 
 72 |         temail = new JTextField();
 73 |         temail.setBounds(300, 150, 200, 30);
 74 |         temail.setFont(new Font("Arial", Font.BOLD, 15));
 75 |         add(temail);
 76 | 
 77 |         tcontact = new JTextField();
 78 |         tcontact.setBounds(300, 200, 200, 30);
 79 |         tcontact.setFont(new Font("Arial", Font.BOLD, 15));
 80 |         add(tcontact);
 81 | 
 82 |         //============set TextArea============
 83 |         tmsg = new TextArea("");
 84 |         tmsg.setBounds(300, 250, 200, 100);
 85 |         tmsg.setFont(new Font("Arial", Font.BOLD, 13));
 86 |         // tmsg.setEditable(false);
 87 |         add(tmsg);
 88 | 
 89 |         //============set Button============
 90 |         bsend = new JButton("Send Message");
 91 |         bsend.setBounds(300, 360, 120, 30);
 92 |         bsend.setBackground(Color.black);
 93 |         bsend.setForeground(Color.white);
 94 |         add(bsend);
 95 |         bsend.addActionListener(this);
 96 | 
 97 |         bback = new JButton("Back");
 98 |         bback.setBounds(300, 400, 100, 30);
 99 |         bback.setBackground(Color.black);
100 |         bback.setForeground(Color.white);
101 |         add(bback);
102 |         bback.addActionListener(this);
103 | 
104 |         //============set Image===================
105 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\feedback3.png");
106 |         lpic = new JLabel(img);
107 |         lpic.setBounds(0, 0, 600, 500);
108 |         add(lpic);
109 |         
110 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
111 |             @Override
112 |             public void windowClosing(java.awt.event.WindowEvent e) {
113 |                 parentFrame.setEnabled(true); // Re-enable parent JFrame
114 |             }
115 |         });
116 |         
117 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
118 |         bback.setCursor(c);
119 |         bsend.setCursor(c);
120 |     }
121 | 
122 |     public void actionPerformed(ActionEvent ae) {
123 |         if (ae.getSource() == bsend) {
124 |             if (tname.getText().length() == 0) {
125 |                 JOptionPane.showMessageDialog(null, "Please Enter Your Nume.");
126 |             } else if (temail.getText().length() == 0) {
127 |                 JOptionPane.showMessageDialog(null, "Please Enter An E-mail.");
128 |             } else if (tcontact.getText().length() == 0) {
129 |                 JOptionPane.showMessageDialog(null, "Please Enter Contact Number");
130 |             } else if (tmsg.getText().length() == 0) {
131 |                 JOptionPane.showMessageDialog(null, "Please Type Message");
132 |             } else {
133 |                 try {
134 | 
135 |                     String name = tname.getText();
136 |                     String email = temail.getText();
137 |                     String contact = tcontact.getText();
138 |                     String message = tmsg.getText();
139 | 
140 |                     Class.forName("com.mysql.cj.jdbc.Driver");
141 |                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
142 |                     PreparedStatement pst = con.prepareStatement("insert into feedback(name,email,contact,message)values(?,?,?,?);");
143 | 
144 |                     pst.setString(1, name);
145 |                     pst.setString(2, email);
146 |                     pst.setString(3, contact);
147 |                     pst.setString(4, message);
148 |                     pst.executeUpdate();
149 | 
150 |                     JOptionPane.showMessageDialog(null, "Feedback Sent  Successefully....👍");
151 | 
152 |                     tname.setText("");
153 |                     temail.setText("");
154 |                     tcontact.setText("");
155 |                     tmsg.setText("");
156 |                 } catch (Exception ex) {
157 |                     ex.printStackTrace();
158 |                 }
159 |             }
160 |         }
161 |         if (ae.getSource() == bback) {
162 |             parentFrame.setEnabled(true);
163 |             dispose();
164 |         }
165 |     }
166 | 
167 | }
168 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ForgetPasswordAdmin.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import javax.swing.*;
  4 | import java.awt.*;
  5 | import java.awt.event.*;
  6 | import java.sql.*;
  7 | 
  8 | public class ForgetPasswordAdmin extends JFrame implements ActionListener {
  9 |     JFrame welcomeFrame;
 10 | 
 11 |     JTextField tuser, tysque, tans;
 12 |     JPasswordField tupass;
 13 |     JButton bverify, bgetpass, bback;
 14 | 
 15 |     ForgetPasswordAdmin(JFrame welcomeFrame) {
 16 |         this.welcomeFrame = welcomeFrame;
 17 |         
 18 |         JLabel ltitle, lpic, luser, lysque, lans, lupass;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("Forget Password");
 22 |         setSize(600, 500);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 26);
 32 | 
 33 |         //============set Font Label===========
 34 |         ltitle = new JLabel("Get Your Password Admin");
 35 |         ltitle.setBounds(170, 30, 300, 50);
 36 |         ltitle.setForeground(Color.white);
 37 |         add(ltitle);
 38 |         ltitle.setFont(f1);
 39 | 
 40 |         //============set Label===========
 41 |         luser = new JLabel("Username");
 42 |         luser.setBounds(70, 100, 100, 30);
 43 |         luser.setForeground(Color.white);
 44 |         add(luser);
 45 | 
 46 |         lysque = new JLabel("Your Security Question");
 47 |         lysque.setBounds(70, 150, 150, 50);
 48 |         lysque.setForeground(Color.white);
 49 |         add(lysque);
 50 | 
 51 |         lans = new JLabel("Answer");
 52 |         lans.setBounds(70, 210, 150, 50);
 53 |         lans.setForeground(Color.white);
 54 |         add(lans);
 55 | 
 56 |         lupass = new JLabel("Your Password");
 57 |         lupass.setBounds(70, 315, 150, 50);
 58 |         lupass.setForeground(Color.white);
 59 |         add(lupass);
 60 | 
 61 |         //============set Button============
 62 |         bverify = new JButton("Verify");
 63 |         bverify.setBounds(380, 100, 70, 30);
 64 |         bverify.setBackground(Color.black);
 65 |         bverify.setForeground(Color.white);
 66 |         add(bverify);
 67 |         bverify.addActionListener(this);
 68 | 
 69 |         bgetpass = new JButton("Get Password");
 70 |         bgetpass.setBounds(250, 280, 130, 30);
 71 |         bgetpass.setBackground(Color.black);
 72 |         bgetpass.setForeground(Color.white);
 73 |         add(bgetpass);
 74 |         bgetpass.addActionListener(this);
 75 | 
 76 |         bback = new JButton("Back");
 77 |         bback.setBounds(250, 380, 100, 30);
 78 |         bback.setBackground(Color.black);
 79 |         bback.setForeground(Color.white);
 80 |         add(bback);
 81 |         bback.addActionListener(this);
 82 | 
 83 |         //============set corsor===================
 84 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
 85 |         bverify.setCursor(c);
 86 |         bgetpass.setCursor(c);
 87 |         bback.setCursor(c);
 88 | 
 89 |         //============set text field============
 90 |         tuser = new JTextField();
 91 |         tuser.setBounds(250, 100, 130, 30);
 92 |         add(tuser);
 93 | 
 94 |         tysque = new JTextField();
 95 |         tysque.setBounds(250, 165, 200, 30);
 96 |         add(tysque);
 97 |         tysque.setEditable(false);
 98 | 
 99 |         tans = new JTextField();
100 |         tans.setBounds(250, 220, 200, 30);
101 |         add(tans);
102 |         tans.setEditable(false);
103 | 
104 |         //============set Password field============
105 |         tupass = new JPasswordField();
106 |         tupass.setBounds(250, 330, 200, 30);
107 |         add(tupass);
108 |         tupass.setEditable(false);
109 |         if (tupass.getEchoChar() != '\u0000') {
110 |             tupass.setEchoChar('\u0000');
111 |         } else {
112 |             tupass.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
113 |         }
114 |         
115 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
116 |             @Override
117 |             public void windowClosing(java.awt.event.WindowEvent e) {
118 |                 welcomeFrame.setEnabled(true); 
119 |             }
120 |         });
121 | 
122 |         //============set Image===================
123 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\forgetpass.png");
124 |         lpic = new JLabel(img);
125 |         lpic.setBounds(0, 0, 600, 500);
126 |         add(lpic);
127 |     }
128 | 
129 |     public void actionPerformed(ActionEvent ae) {
130 |         if (ae.getSource() == bverify) {
131 |             String username = tuser.getText();
132 |             try {
133 |                 Class.forName("com.mysql.cj.jdbc.Driver");
134 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
135 |                 PreparedStatement pst = con.prepareStatement("select * from admin where username='" + username + "';");
136 |                 ResultSet rs = pst.executeQuery();
137 |                 if (rs.next()) {
138 |                     tysque.setText(rs.getString(4));
139 |                     tans.setEditable(true);
140 |                     tans.setText("");
141 |                     tupass.setText("");
142 | 
143 |                 } else {
144 |                     JOptionPane.showMessageDialog(null, "Username Not Found");
145 |                     tans.setText("");
146 |                     tysque.setText("");
147 |                     tupass.setText("");
148 |                 }
149 |             } catch (Exception ex) {
150 |                 ex.printStackTrace();
151 |             }
152 |         }
153 |         if (ae.getSource() == bgetpass) {
154 |             if (tans.getText().length() != 0) {
155 |                 int check = 0;
156 |                 try {
157 |                     Class.forName("com.mysql.cj.jdbc.Driver");
158 |                     Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
159 |                     PreparedStatement p = c.prepareStatement("select * from admin;");
160 |                     ResultSet r = p.executeQuery();
161 |                     while (r.next()) {
162 |                         String answer = r.getString("answer");
163 |                         if (answer.equals(tans.getText())) {
164 |                             check = 1;
165 |                             tupass.setText(r.getString(6));
166 |                             tans.setEditable(false);
167 |                         }
168 |                     }
169 |                     if (check == 0) {
170 |                         JOptionPane.showMessageDialog(null, "Wrong Answer");
171 |                         tans.setText("");
172 |                         tupass.setText("");
173 |                     }
174 |                 } catch (Exception ex) {
175 |                     ex.printStackTrace();
176 |                 }
177 |             } else {
178 |                 JOptionPane.showMessageDialog(null, "Please Enter Answer");
179 |             }
180 |         }
181 |         if (ae.getSource() == bback) {
182 |             new LoginAdmin(welcomeFrame).setVisible(true);
183 |             dispose();
184 |         }
185 |     }
186 | 
187 | }
188 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ForgetPasswordStudent.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import javax.swing.*;
  4 | import java.awt.*;
  5 | import java.awt.event.*;
  6 | import java.sql.*;
  7 | 
  8 | public class ForgetPasswordStudent extends JFrame implements ActionListener {
  9 |     JFrame welcomeFrame;
 10 | 
 11 |     JTextField tuser, tysque, tans;
 12 |     JPasswordField tupass;
 13 |     JButton bverify, bgetpass, bback;
 14 | 
 15 |     ForgetPasswordStudent(JFrame welcomeFrame) {
 16 |         this.welcomeFrame = welcomeFrame;
 17 |         
 18 |         JLabel ltitle, lpic, luser, lysque, lans, lupass;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("Forget Password");
 22 |         setSize(600, 500);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 26);
 32 | 
 33 |         //============set Font Label===========
 34 |         ltitle = new JLabel("Get Your Password");
 35 |         ltitle.setBounds(170, 30, 300, 50);
 36 |         ltitle.setForeground(Color.white);
 37 |         add(ltitle);
 38 |         ltitle.setFont(f1);
 39 | 
 40 |         //============set Label===========
 41 |         luser = new JLabel("Username");
 42 |         luser.setBounds(70, 100, 100, 30);
 43 |         luser.setForeground(Color.white);
 44 |         add(luser);
 45 | 
 46 |         lysque = new JLabel("Your Security Question");
 47 |         lysque.setBounds(70, 150, 150, 50);
 48 |         lysque.setForeground(Color.white);
 49 |         add(lysque);
 50 | 
 51 |         lans = new JLabel("Answer");
 52 |         lans.setBounds(70, 210, 150, 50);
 53 |         lans.setForeground(Color.white);
 54 |         add(lans);
 55 | 
 56 |         lupass = new JLabel("Your Password");
 57 |         lupass.setBounds(70, 315, 150, 50);
 58 |         lupass.setForeground(Color.white);
 59 |         add(lupass);
 60 | 
 61 |         //============set Button============
 62 |         bverify = new JButton("Verify");
 63 |         bverify.setBounds(380, 100, 70, 30);
 64 |         bverify.setBackground(Color.black);
 65 |         bverify.setForeground(Color.white);
 66 |         add(bverify);
 67 |         bverify.addActionListener(this);
 68 | 
 69 |         bgetpass = new JButton("Get Password");
 70 |         bgetpass.setBounds(250, 280, 130, 30);
 71 |         bgetpass.setBackground(Color.black);
 72 |         bgetpass.setForeground(Color.white);
 73 |         add(bgetpass);
 74 |         bgetpass.addActionListener(this);
 75 | 
 76 |         bback = new JButton("Back");
 77 |         bback.setBounds(250, 380, 100, 30);
 78 |         bback.setBackground(Color.black);
 79 |         bback.setForeground(Color.white);
 80 |         add(bback);
 81 |         bback.addActionListener(this);
 82 | 
 83 |         //============set corsor===================
 84 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
 85 |         bverify.setCursor(c);
 86 |         bgetpass.setCursor(c);
 87 |         bback.setCursor(c);
 88 | 
 89 |         //============set text field============
 90 |         tuser = new JTextField();
 91 |         tuser.setBounds(250, 100, 130, 30);
 92 |         add(tuser);
 93 | 
 94 |         tysque = new JTextField();
 95 |         tysque.setBounds(250, 165, 200, 30);
 96 |         add(tysque);
 97 |         tysque.setEditable(false);
 98 | 
 99 |         tans = new JTextField();
100 |         tans.setBounds(250, 220, 200, 30);
101 |         add(tans);
102 |         tans.setEditable(false);
103 | 
104 |         //============set Password field============
105 |         tupass = new JPasswordField();
106 |         tupass.setBounds(250, 330, 200, 30);
107 |         add(tupass);
108 |         tupass.setEditable(false);
109 |         if (tupass.getEchoChar() != '\u0000') {
110 |             tupass.setEchoChar('\u0000');
111 |         } else {
112 |             tupass.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
113 |         }
114 |         
115 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
116 |             @Override
117 |             public void windowClosing(java.awt.event.WindowEvent e) {
118 |                 welcomeFrame.setEnabled(true); 
119 |             }
120 |         });
121 | 
122 |         //============set Image===================
123 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\forgetpass.png");
124 |         lpic = new JLabel(img);
125 |         lpic.setBounds(0, 0, 600, 500);
126 |         add(lpic);
127 |     }
128 | 
129 |     public void actionPerformed(ActionEvent ae) {
130 |         if (ae.getSource() == bverify) {
131 |             String username = tuser.getText();
132 |             try {
133 |                 Class.forName("com.mysql.cj.jdbc.Driver");
134 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
135 |                 PreparedStatement pst = con.prepareStatement("select * from Student2 where username='" + username + "';");
136 |                 ResultSet rs = pst.executeQuery();
137 |                 if (rs.next()) {
138 |                     tysque.setText(rs.getString(12));
139 |                     tans.setEditable(true);
140 |                     tans.setText("");
141 |                     tupass.setText("");
142 | 
143 |                 } else {
144 |                     JOptionPane.showMessageDialog(null, "Username Not Found");
145 |                     tans.setText("");
146 |                     tysque.setText("");
147 |                     tupass.setText("");
148 |                 }
149 |             } catch (Exception ex) {
150 |                 ex.printStackTrace();
151 |             }
152 |         }
153 |         if (ae.getSource() == bgetpass) {
154 |             if (tans.getText().length() != 0) {
155 |                 int check = 0;
156 |                 try {
157 |                     Class.forName("com.mysql.cj.jdbc.Driver");
158 |                     Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
159 |                     PreparedStatement p = c.prepareStatement("select * from Student2;");
160 |                     ResultSet r = p.executeQuery();
161 |                     while (r.next()) {
162 |                         String answer = r.getString("answer");
163 |                         if (answer.equals(tans.getText())) {
164 |                             check = 1;
165 |                             tupass.setText(r.getString(14));
166 |                             tans.setEditable(false);
167 |                         }
168 |                     }
169 |                     if (check == 0) {
170 |                         JOptionPane.showMessageDialog(null, "Wrong Answer");
171 |                         tans.setText("");
172 |                         tupass.setText("");
173 |                     }
174 |                 } catch (Exception ex) {
175 |                     ex.printStackTrace();
176 |                 }
177 |             } else {
178 |                 JOptionPane.showMessageDialog(null, "Please Enter Answer");
179 |             }
180 |         }
181 |         if (ae.getSource() == bback) {
182 |             new LoginStudent(welcomeFrame).setVisible(true);
183 |             dispose();
184 |         }
185 |     }
186 | 
187 | }
188 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ForgetPasswordTeacher.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import javax.swing.*;
  4 | import java.awt.*;
  5 | import java.awt.event.*;
  6 | import java.sql.*;
  7 | 
  8 | public class ForgetPasswordTeacher extends JFrame implements ActionListener {
  9 |     JFrame welcomeFrame;
 10 | 
 11 |     JTextField tuser, tysque, tans;
 12 |     JPasswordField tupass;
 13 |     JButton bverify, bgetpass, bback;
 14 | 
 15 |     ForgetPasswordTeacher(JFrame welcomeFrame) {
 16 |         this.welcomeFrame = welcomeFrame;
 17 |         
 18 |         JLabel ltitle, lpic, luser, lysque, lans, lupass;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("Forget Password");
 22 |         setSize(600, 500);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 26);
 32 | 
 33 |         //============set Font Label===========
 34 |         ltitle = new JLabel("Get Your Password Teacher");
 35 |         ltitle.setBounds(170, 30, 300, 50);
 36 |         ltitle.setForeground(Color.white);
 37 |         add(ltitle);
 38 |         ltitle.setFont(f1);
 39 | 
 40 |         //============set Label===========
 41 |         luser = new JLabel("User Name");
 42 |         luser.setBounds(70, 100, 100, 30);
 43 |         luser.setForeground(Color.white);
 44 |         add(luser);
 45 | 
 46 |         lysque = new JLabel("Your Security Question");
 47 |         lysque.setBounds(70, 150, 150, 50);
 48 |         lysque.setForeground(Color.white);
 49 |         add(lysque);
 50 | 
 51 |         lans = new JLabel("Answer");
 52 |         lans.setBounds(70, 210, 150, 50);
 53 |         lans.setForeground(Color.white);
 54 |         add(lans);
 55 | 
 56 |         lupass = new JLabel("Your Password");
 57 |         lupass.setBounds(70, 315, 150, 50);
 58 |         lupass.setForeground(Color.white);
 59 |         add(lupass);
 60 | 
 61 |         //============set Button============
 62 |         bverify = new JButton("Verify");
 63 |         bverify.setBounds(380, 100, 70, 30);
 64 |         bverify.setBackground(Color.black);
 65 |         bverify.setForeground(Color.white);
 66 |         add(bverify);
 67 |         bverify.addActionListener(this);
 68 | 
 69 |         bgetpass = new JButton("Get Password");
 70 |         bgetpass.setBounds(250, 280, 130, 30);
 71 |         bgetpass.setBackground(Color.black);
 72 |         bgetpass.setForeground(Color.white);
 73 |         add(bgetpass);
 74 |         bgetpass.addActionListener(this);
 75 | 
 76 |         bback = new JButton("Back");
 77 |         bback.setBounds(250, 380, 100, 30);
 78 |         bback.setBackground(Color.black);
 79 |         bback.setForeground(Color.white);
 80 |         add(bback);
 81 |         bback.addActionListener(this);
 82 | 
 83 |         //============set corsor===================
 84 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
 85 |         bverify.setCursor(c);
 86 |         bgetpass.setCursor(c);
 87 |         bback.setCursor(c);
 88 | 
 89 |         //============set text field============
 90 |         tuser = new JTextField();
 91 |         tuser.setBounds(250, 100, 130, 30);
 92 |         add(tuser);
 93 | 
 94 |         tysque = new JTextField();
 95 |         tysque.setBounds(250, 165, 200, 30);
 96 |         add(tysque);
 97 |         tysque.setEditable(false);
 98 | 
 99 |         tans = new JTextField();
100 |         tans.setBounds(250, 220, 200, 30);
101 |         add(tans);
102 |         tans.setEditable(false);
103 | 
104 |         //============set Password field============
105 |         tupass = new JPasswordField();
106 |         tupass.setBounds(250, 330, 200, 30);
107 |         add(tupass);
108 |         tupass.setEditable(false);
109 |         if (tupass.getEchoChar() != '\u0000') {
110 |             tupass.setEchoChar('\u0000');
111 |         } else {
112 |             tupass.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
113 |         }
114 |         
115 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
116 |             @Override
117 |             public void windowClosing(java.awt.event.WindowEvent e) {
118 |                 welcomeFrame.setEnabled(true); 
119 |             }
120 |         });
121 | 
122 |         //============set Image===================
123 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\forgetpass.png");
124 |         lpic = new JLabel(img);
125 |         lpic.setBounds(0, 0, 600, 500);
126 |         add(lpic);
127 |     }
128 | 
129 |     public void actionPerformed(ActionEvent ae) {
130 |         if (ae.getSource() == bverify) {
131 |             String username = tuser.getText();
132 |             try {
133 |                 Class.forName("com.mysql.cj.jdbc.Driver");
134 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
135 |                 PreparedStatement pst = con.prepareStatement("select * from Teacher2 where username='" + username + "';");
136 |                 ResultSet rs = pst.executeQuery();
137 |                 if (rs.next()) {
138 |                     tysque.setText(rs.getString(12));
139 |                     tans.setEditable(true);
140 |                     tans.setText("");
141 |                     tupass.setText("");
142 | 
143 |                 } else {
144 |                     JOptionPane.showMessageDialog(null, "Username Not Found");
145 |                     tans.setText("");
146 |                     tysque.setText("");
147 |                     tupass.setText("");
148 |                 }
149 |             } catch (Exception ex) {
150 |                 ex.printStackTrace();
151 |             }
152 |         }
153 |         if (ae.getSource() == bgetpass) {
154 |             if (tans.getText().length() != 0) {
155 |                 int check = 0;
156 |                 try {
157 |                     Class.forName("com.mysql.cj.jdbc.Driver");
158 |                     Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
159 |                     PreparedStatement p = c.prepareStatement("select * from Teacher2;");
160 |                     ResultSet r = p.executeQuery();
161 |                     while (r.next()) {
162 |                         String answer = r.getString("answer");
163 |                         if (answer.equals(tans.getText())) {
164 |                             check = 1;
165 |                             tupass.setText(r.getString(14));
166 |                             tans.setEditable(false);
167 |                         }
168 |                     }
169 |                     if (check == 0) {
170 |                         JOptionPane.showMessageDialog(null, "Wrong Answer");
171 |                         tans.setText("");
172 |                         tupass.setText("");
173 |                     }
174 |                 } catch (Exception ex) {
175 |                     ex.printStackTrace();
176 |                 }
177 |             } else {
178 |                 JOptionPane.showMessageDialog(null, "Please Enter Answer");
179 |             }
180 |         }
181 |         if (ae.getSource() == bback) {
182 |             new LoginTeacher(welcomeFrame).setVisible(true);
183 |             dispose();
184 |         }
185 |     }
186 | 
187 | }
188 | 


--------------------------------------------------------------------------------
/src/School_Management_System/LoginAdmin.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | 
  8 | class LoginAdmin extends JFrame implements ActionListener {
  9 |     JFrame welcomeFrame;
 10 |     
 11 |     JTextField tuser;
 12 |     JPasswordField tpass;
 13 |     JButton blogin, bforget, bchange, bexit;
 14 |     JLabel show, show2;
 15 | 
 16 |     LoginAdmin(JFrame welcomeFrame) {
 17 |         this.welcomeFrame = welcomeFrame;
 18 |         JLabel ltitle, luser, lpass, lpic;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("Login Page");
 22 |         setSize(1100, 500);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 45);
 32 | 
 33 |         //============set Font Label===========
 34 |         ltitle = new JLabel("Admin Login Form");
 35 |         ltitle.setBounds(625, 50, 350, 50);
 36 |         ltitle.setForeground(Color.white);
 37 |         add(ltitle);
 38 |         ltitle.setFont(f1);
 39 | 
 40 |         //============set Label===========
 41 |         luser = new JLabel("User Name");
 42 |         luser.setBounds(650, 150, 100, 30);
 43 |         luser.setForeground(Color.white);
 44 |         add(luser);
 45 | 
 46 |         lpass = new JLabel("Password");
 47 |         lpass.setBounds(650, 200, 150, 50);
 48 |         lpass.setForeground(Color.white);
 49 |         add(lpass);
 50 | 
 51 |         //============set Button============
 52 |         blogin = new JButton("Login");
 53 |         blogin.setBounds(650, 300, 100, 30);
 54 |         blogin.setBackground(Color.black);
 55 |         blogin.setForeground(Color.white);
 56 |         add(blogin);
 57 |         blogin.addActionListener(this);
 58 | 
 59 |         bexit = new JButton("Cancel");
 60 |         bexit.setBounds(650, 370, 100, 30);
 61 |         bexit.setBackground(Color.black);
 62 |         bexit.setForeground(Color.white);
 63 |         add(bexit);
 64 |         bexit.addActionListener(this);
 65 | 
 66 |         bforget = new JButton("Forget Password");
 67 |         bforget.setBounds(820, 370, 140, 30);
 68 |         bforget.setBackground(Color.black);
 69 |         bforget.setForeground(Color.white);
 70 |         add(bforget);
 71 |         bforget.addActionListener(this);
 72 | 
 73 |         bchange = new JButton("Change Password");
 74 |         bchange.setBounds(820, 300, 140, 30);
 75 |         bchange.setBackground(Color.black);
 76 |         bchange.setForeground(Color.white);
 77 |         add(bchange);
 78 |         bchange.addActionListener(this);
 79 | 
 80 |         //============set text field============
 81 |         tuser = new JTextField();
 82 |         tuser.setBounds(750, 150, 200, 30);
 83 |         tuser.setFont(new Font("Monotype", Font.BOLD, 18));
 84 |         add(tuser);
 85 | 
 86 |         //============set password field============
 87 |         tpass = new JPasswordField();
 88 |         tpass.setBounds(750, 210, 200, 30);
 89 |         tpass.setFont(new Font("Monotype", Font.BOLD, 18));
 90 |         tpass.setEchoChar('•');
 91 |         add(tpass);
 92 | 
 93 |         //==========password show/hide label=========
 94 |         show = new JLabel("Show Password");
 95 |         show.setBounds(750, 240, 100, 30);
 96 |         show.setForeground(Color.yellow);
 97 |         add(show);
 98 | 
 99 |         show.addMouseListener(new MouseAdapter() {
100 |             @Override
101 |             public void mouseClicked(MouseEvent e) {
102 |                 if (e.getSource() == show) {
103 |                     tpass.setEchoChar((char) 0);
104 |                     show.setVisible(false);
105 |                     show2.setVisible(true);
106 |                 } else {
107 |                     tpass.setEchoChar('•');
108 |                 }
109 |             }
110 |         });
111 | 
112 |         show2 = new JLabel("Hide Password");
113 |         show2.setBounds(750, 240, 100, 30);
114 |         show2.setForeground(Color.orange);
115 |         show2.setVisible(false);
116 |         add(show2);
117 | 
118 |         show2.addMouseListener(new MouseAdapter() {
119 |             @Override
120 |             public void mouseClicked(MouseEvent e) {
121 |                 if (e.getSource() == show2) {
122 |                     tpass.setEchoChar('•');
123 |                     show2.setVisible(false);
124 |                     show.setVisible(true);
125 |                 } else {
126 |                     tpass.setEchoChar((char) 0);
127 |                 }
128 |             }
129 |         });
130 | 
131 |         //============set Image===================
132 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\loginPage.png");
133 |         lpic = new JLabel(img);
134 |         lpic.setBounds(500, 0, 600, 500);
135 |         add(lpic);
136 |         
137 |         ImageIcon gifIcon = new ImageIcon("C:\\Users\\karan\\Downloads\\login.gif");
138 |         JLabel gifLabel = new JLabel(gifIcon);
139 |         gifLabel.setBounds(0, 0, gifIcon.getIconWidth(), gifIcon.getIconHeight());
140 |         add(gifLabel);
141 |         
142 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
143 |             @Override
144 |             public void windowClosing(java.awt.event.WindowEvent e) {
145 |                 welcomeFrame.setEnabled(true); 
146 |             }
147 |         });
148 |         
149 |         //============set corsor===================
150 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
151 |         blogin.setCursor(c);
152 |         bchange.setCursor(c);
153 |         bforget.setCursor(c);
154 |         bexit.setCursor(c);
155 |         show.setCursor(c);
156 |         show2.setCursor(c);
157 |     }
158 | 
159 |     public void actionPerformed(ActionEvent ae) {
160 |         if (ae.getSource() == blogin) {
161 |             try {
162 |                 Class.forName("com.mysql.cj.jdbc.Driver");
163 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
164 |                 String username = tuser.getText();
165 |                 String password = tpass.getText();
166 |                 PreparedStatement pst = con.prepareStatement("select * from admin where username='" + username + "' and password='" + password + "'");
167 |                 ResultSet rest = pst.executeQuery();
168 |                 if (rest.next()) {
169 |                     welcomeFrame.dispose();
170 |                     this.dispose();
171 |                     new AdminHomePage().setVisible(true);
172 |                 } else {
173 |                     JOptionPane.showMessageDialog(null, "You Have Entered Wromg Username and Password......");
174 |                 }
175 |             } catch (Exception ex) {
176 |                 ex.printStackTrace();
177 |             }
178 |         }
179 | 
180 |         if (ae.getSource() == bexit) {
181 |             welcomeFrame.setEnabled(true);
182 |             dispose();
183 |         }
184 | 
185 |         if (ae.getSource() == bforget) {
186 |             welcomeFrame.setEnabled(false);
187 |             new ForgetPasswordAdmin(welcomeFrame).setVisible(true);
188 |             dispose();
189 |         }
190 | 
191 |         if (ae.getSource() == bchange) {
192 |             welcomeFrame.setEnabled(false);
193 |             new ChangePasswordAdmin(welcomeFrame).setVisible(true);
194 |             dispose();
195 |         }
196 |     }
197 | }
198 | 


--------------------------------------------------------------------------------
/src/School_Management_System/LoginStudent.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | 
  8 | class LoginStudent extends JFrame implements ActionListener {
  9 | 
 10 |     JTextField tuser;
 11 |     JPasswordField tpass;
 12 |     JButton blogin, bforget, bchange, bexit;
 13 |     JLabel show, show2;
 14 |     JFrame welcomeFrame;
 15 | 
 16 |     LoginStudent(JFrame welcomeFrame) {
 17 |         this.welcomeFrame = welcomeFrame;
 18 |         JLabel ltitle, luser, lpass, lpic;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("LoginPage");
 22 |         setSize(1100, 500);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 45);
 32 | 
 33 |         //============set Font Label===========
 34 |         ltitle = new JLabel("Login Form");
 35 |         ltitle.setBounds(700, 50, 350, 50);
 36 |         ltitle.setForeground(Color.white);
 37 |         add(ltitle);
 38 |         ltitle.setFont(f1);
 39 | 
 40 |         //============set Label===========
 41 |         luser = new JLabel("Username");
 42 |         luser.setBounds(650, 150, 100, 30);
 43 |         luser.setForeground(Color.white);
 44 |         add(luser);
 45 | 
 46 |         lpass = new JLabel("Password");
 47 |         lpass.setBounds(650, 200, 150, 50);
 48 |         lpass.setForeground(Color.white);
 49 |         add(lpass);
 50 | 
 51 |         //============set Button============
 52 |         blogin = new JButton("Login");
 53 |         blogin.setBounds(650, 300, 100, 30);
 54 |         blogin.setBackground(Color.black);
 55 |         blogin.setForeground(Color.white);
 56 |         add(blogin);
 57 |         blogin.addActionListener(this);
 58 | 
 59 |         bexit = new JButton("Cansel");
 60 |         bexit.setBounds(650, 370, 100, 30);
 61 |         bexit.setBackground(Color.black);
 62 |         bexit.setForeground(Color.white);
 63 |         add(bexit);
 64 |         bexit.addActionListener(this);
 65 | 
 66 |         bforget = new JButton("Forget Password");
 67 |         bforget.setBounds(820, 370, 140, 30);
 68 |         bforget.setBackground(Color.black);
 69 |         bforget.setForeground(Color.white);
 70 |         add(bforget);
 71 |         bforget.addActionListener(this);
 72 | 
 73 |         bchange = new JButton("Change Password");
 74 |         bchange.setBounds(820, 300, 140, 30);
 75 |         bchange.setBackground(Color.black);
 76 |         bchange.setForeground(Color.white);
 77 |         add(bchange);
 78 |         bchange.addActionListener(this);
 79 | 
 80 |         //============set text field============
 81 |         tuser = new JTextField();
 82 |         tuser.setBounds(750, 150, 200, 30);
 83 |         tuser.setFont(new Font("Monotype",Font.BOLD,18));
 84 |         add(tuser);
 85 | 
 86 |         //============set password field============
 87 |         tpass = new JPasswordField();
 88 |         tpass.setBounds(750, 210, 200, 30);
 89 |         tpass.setFont(new Font("Monotype",Font.BOLD,18));
 90 |         tpass.setEchoChar('•');
 91 |         add(tpass);
 92 |         
 93 |         //==========password show/hide label=========
 94 |         show = new JLabel("Show Password");
 95 |         show.setBounds(750, 240, 100, 30);
 96 |         show.setForeground(Color.yellow);
 97 |         add(show);
 98 | 
 99 |         show.addMouseListener(new MouseAdapter() {
100 |             @Override
101 |             public void mouseClicked(MouseEvent e) {
102 |                 if (e.getSource() == show) {
103 |                     tpass.setEchoChar((char) 0);
104 |                     show.setVisible(false);
105 |                     show2.setVisible(true);
106 |                 } else {
107 |                     tpass.setEchoChar('•');
108 |                 }
109 |             }
110 |         });
111 | 
112 |         show2 = new JLabel("Hide Password");
113 |         show2.setBounds(750, 240, 100, 30);
114 |         show2.setForeground(Color.yellow);
115 |         show2.setVisible(false);
116 |         add(show2);
117 | 
118 |         show2.addMouseListener(new MouseAdapter() {
119 |             @Override
120 |             public void mouseClicked(MouseEvent e) {
121 |                 if (e.getSource() == show2) {
122 |                     tpass.setEchoChar('•');
123 |                     show2.setVisible(false);
124 |                     show.setVisible(true);
125 |                 } else {
126 |                     tpass.setEchoChar((char) 0);
127 |                 }
128 |             }
129 |         });
130 | 
131 |         //============set Image===================
132 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\loginPage.png");
133 |         lpic = new JLabel(img);
134 |         lpic.setBounds(500, 0, 600, 500);
135 |         add(lpic);
136 |         
137 |         ImageIcon gifIcon = new ImageIcon("C:\\Users\\karan\\Downloads\\login.gif");
138 |         JLabel gifLabel = new JLabel(gifIcon);
139 |         gifLabel.setBounds(0, 0, gifIcon.getIconWidth(), gifIcon.getIconHeight());
140 |         add(gifLabel);
141 |         
142 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
143 |             @Override
144 |             public void windowClosing(java.awt.event.WindowEvent e) {
145 |                 welcomeFrame.setEnabled(true); // Re-enable parent JFrame
146 |             }
147 |         });
148 |         
149 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
150 | 
151 |         blogin.setCursor(c);
152 |         bchange.setCursor(c);
153 |         bforget.setCursor(c);
154 |         bexit.setCursor(c);
155 |         show.setCursor(c);
156 |         show2.setCursor(c);
157 | 
158 |     }
159 | 
160 |     public void actionPerformed(ActionEvent ae) {
161 |         if (ae.getSource() == blogin) {
162 |             try {
163 |                 Class.forName("com.mysql.cj.jdbc.Driver");
164 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
165 |                 String username = tuser.getText();
166 |                 String password = tpass.getText();
167 |                 PreparedStatement pst = con.prepareStatement("select * from Student2 where username='" + username + "' and password='" + password + "'");
168 |                 ResultSet rest = pst.executeQuery();
169 |                 if (rest.next()) {
170 |                     welcomeFrame.setVisible(false);
171 |                     this.setVisible(false);
172 |                     new StudentHomePage(username).setVisible(true);
173 |                 } else {
174 |                     JOptionPane.showMessageDialog(null, "You Have Entered Wromg Username and Password......");
175 |                 }
176 |             } catch (Exception ex) {
177 |                 ex.printStackTrace();
178 |             }
179 |         }
180 |         if (ae.getSource() == bexit) {
181 |             welcomeFrame.setEnabled(true);
182 |             dispose();
183 |         }
184 |         if (ae.getSource() == bforget) {
185 |             welcomeFrame.setEnabled(false);
186 |             new ForgetPasswordStudent(welcomeFrame).setVisible(true);
187 |             dispose();
188 |         }
189 |         if (ae.getSource() == bchange) {
190 |             welcomeFrame.setEnabled(false);
191 |             new ChangePasswordStudent(welcomeFrame).setVisible(true);
192 |             dispose();
193 |         }
194 |     }
195 | }
196 | 


--------------------------------------------------------------------------------
/src/School_Management_System/LoginTeacher.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | 
  8 | class LoginTeacher extends JFrame implements ActionListener {
  9 |     JTextField tuser;
 10 |     JPasswordField tpass;
 11 |     JButton blogin, bforget, bchange, bexit;
 12 |     JLabel show, show2;
 13 |     JFrame welcomeFrame;
 14 | 
 15 |     LoginTeacher(JFrame welcomeFrame) {
 16 |         this.welcomeFrame = welcomeFrame;
 17 |         JLabel ltitle, luser, lpass, lpic;
 18 | 
 19 |         //============set frame===========
 20 |         setTitle("LoginPage");
 21 |         setSize(1100, 500);
 22 |         setLayout(null);
 23 |         setVisible(true);
 24 |         setLocationRelativeTo(null);
 25 |         setResizable(false);
 26 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png"); 
 27 |         setIconImage(icon.getImage());
 28 | 
 29 |         //============set Font===========
 30 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 45);
 31 | 
 32 |         //============set Font Label===========
 33 |         ltitle = new JLabel("Teacher Login Form");
 34 |         ltitle.setBounds(625, 50, 350, 50);
 35 |         ltitle.setForeground(Color.white);
 36 |         add(ltitle);
 37 |         ltitle.setFont(f1);
 38 | 
 39 |         //============set Label===========
 40 |         luser = new JLabel("Username");
 41 |         luser.setBounds(650, 150, 100, 30);
 42 |         luser.setForeground(Color.white);
 43 |         add(luser);
 44 | 
 45 |         lpass = new JLabel("Password");
 46 |         lpass.setBounds(650, 200, 150, 50);
 47 |         lpass.setForeground(Color.white);
 48 |         add(lpass);
 49 | 
 50 |         //============set Button============
 51 |         blogin = new JButton("Login");
 52 |         blogin.setBounds(650, 300, 100, 30);
 53 |         blogin.setBackground(Color.black);
 54 |         blogin.setForeground(Color.white);
 55 |         add(blogin);
 56 |         blogin.addActionListener(this);
 57 | 
 58 |         bexit = new JButton("Cancel");
 59 |         bexit.setBounds(650, 370, 100, 30);
 60 |         bexit.setBackground(Color.black);
 61 |         bexit.setForeground(Color.white);
 62 |         add(bexit);
 63 |         bexit.addActionListener(this);
 64 | 
 65 |         bforget = new JButton("Forget Password");
 66 |         bforget.setBounds(820, 370, 140, 30);
 67 |         bforget.setBackground(Color.black);
 68 |         bforget.setForeground(Color.white);
 69 |         add(bforget);
 70 |         bforget.addActionListener(this);
 71 | 
 72 |         bchange = new JButton("Change Password");
 73 |         bchange.setBounds(820, 300, 140, 30);
 74 |         bchange.setBackground(Color.black);
 75 |         bchange.setForeground(Color.white);
 76 |         add(bchange);
 77 |         bchange.addActionListener(this);
 78 | 
 79 |         //============set text field============
 80 |         tuser = new JTextField();
 81 |         tuser.setBounds(750, 150, 200, 30);
 82 |         tuser.setFont(new Font("Monotype",Font.BOLD,18));
 83 |         add(tuser);
 84 | 
 85 |         //============set password field============
 86 |         tpass = new JPasswordField();
 87 |         tpass.setBounds(750, 210, 200, 30);
 88 |         tpass.setFont(new Font("Monotype",Font.BOLD,18));
 89 |         tpass.setEchoChar('•');
 90 |         add(tpass);
 91 | 
 92 |         //==========password show/hide label=========
 93 |         show = new JLabel("Show Password");
 94 |         show.setBounds(750, 240, 100, 30);
 95 |         show.setForeground(Color.orange);
 96 |         add(show);
 97 | 
 98 |         show.addMouseListener(new MouseAdapter() {
 99 |             @Override
100 |             public void mouseClicked(MouseEvent e) {
101 |                 if (e.getSource() == show) {
102 |                     tpass.setEchoChar((char) 0);
103 |                     show.setVisible(false);
104 |                     show2.setVisible(true);
105 |                 } else {
106 |                     tpass.setEchoChar('•');
107 |                 }
108 |             }
109 |         });
110 |         
111 |         show2 = new JLabel("Hide Password");
112 |         show2.setBounds(750, 240, 100, 30);
113 |         show2.setForeground(Color.yellow);
114 |         show2.setVisible(false);
115 |         add(show2);
116 | 
117 |         show2.addMouseListener(new MouseAdapter() {
118 |             @Override
119 |             public void mouseClicked(MouseEvent e) {
120 |                 if (e.getSource() == show2) {
121 |                     tpass.setEchoChar('•');
122 |                     show2.setVisible(false);
123 |                     show.setVisible(true);
124 |                 } else {
125 |                     tpass.setEchoChar((char) 0);
126 |                 }
127 |             }
128 |         });
129 |         
130 |         //============set Image===================
131 |         ImageIcon img = new ImageIcon("D:\\Project School Management System\\SMS\\src\\School_Management_System\\Icons\\loginPage.png");
132 |         lpic = new JLabel(img);
133 |         lpic.setBounds(500, 0, 600, 500);
134 |         add(lpic);
135 |         
136 |         ImageIcon gifIcon = new ImageIcon("C:\\Users\\karan\\Downloads\\login.gif");
137 |         JLabel gifLabel = new JLabel(gifIcon);
138 |         gifLabel.setBounds(0, 0, gifIcon.getIconWidth(), gifIcon.getIconHeight());
139 |         add(gifLabel);
140 |         
141 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
142 |             @Override
143 |             public void windowClosing(java.awt.event.WindowEvent e) {
144 |                 welcomeFrame.setEnabled(true); // Re-enable parent JFrame
145 |             }
146 |         });
147 |         
148 |         //============set corsor===================
149 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
150 |         blogin.setCursor(c);
151 |         bchange.setCursor(c);
152 |         bforget.setCursor(c);
153 |         bexit.setCursor(c);
154 |         show.setCursor(c);
155 |         show2.setCursor(c);
156 |     }
157 | 
158 |     public void actionPerformed(ActionEvent ae) {
159 |         if (ae.getSource() == blogin) {
160 |             try {
161 |                 Class.forName("com.mysql.cj.jdbc.Driver");
162 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
163 |                 String username = tuser.getText();
164 |                 String password = tpass.getText();
165 |                 PreparedStatement pst = con.prepareStatement("select * from Teacher2 where username='" + username + "' and password='" + password + "'");
166 |                 ResultSet rest = pst.executeQuery();
167 |                 if (rest.next()) {
168 |                     welcomeFrame.setVisible(false);
169 |                     this.setVisible(false);
170 |                     new FacultyHomePage(username).setVisible(true);
171 |                 } else {
172 |                     JOptionPane.showMessageDialog(null, "You Have Entered Wromg Username and Password......");
173 |                 }
174 |             } catch (Exception ex) {
175 |                 ex.printStackTrace();
176 |             }
177 |         }
178 |         if (ae.getSource() == bexit) {
179 |             welcomeFrame.setEnabled(true);
180 |             dispose();
181 |         }
182 |         if (ae.getSource() == bforget) {
183 |             welcomeFrame.setEnabled(false);
184 |             new ForgetPasswordTeacher(welcomeFrame).setVisible(true);
185 |             dispose();
186 |         }
187 |         if (ae.getSource() == bchange) {
188 |             welcomeFrame.setEnabled(false);
189 |             new ChangePasswordTeacher(welcomeFrame).setVisible(true);
190 |             dispose();
191 |         }
192 |     }
193 | }
194 | 


--------------------------------------------------------------------------------
/src/School_Management_System/MyResult.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | 
  8 | public class MyResult extends JFrame implements ActionListener {
  9 | 
 10 |     JLabel studentNameField, rollNoField, mathsField, scienceField, englishField, historyField, geoField, econField, total_marks, percentage, grade, result;
 11 |     JButton bback;
 12 |     JFrame studentHomePage;
 13 | 
 14 |     MyResult(String username, JFrame studentHomePage) {
 15 |         this.studentHomePage = studentHomePage;
 16 |         JLabel lpic, ltitle, lusername, lroll, lmaths, lscience, lenglish, lhistory, lgeo, lecon, ltotal, lpercentage, lgrade, lresult;
 17 |         Font f1;
 18 | 
 19 |         //==================Frame=======================
 20 |         setTitle("Student Result");
 21 |         setSize(736, 733);
 22 |         setLayout(null);
 23 |         setLocationRelativeTo(null);
 24 |         setVisible(true);
 25 |         setResizable(false);
 26 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 27 |         setIconImage(icon.getImage());
 28 | 
 29 |         //============set Font===========
 30 |         f1 = new Font("Monotype Corsiva", Font.BOLD, 26);
 31 | 
 32 |         //============set Font Label===========
 33 |         ltitle = new JLabel("My Result");
 34 |         ltitle.setBounds(300, 8, 200, 30);
 35 |         add(ltitle);
 36 |         ltitle.setFont(f1);
 37 | 
 38 |         JLabel sms = new JLabel("   School Management System");
 39 |         sms.setBounds(200, 75, 340, 50);
 40 |         add(sms);
 41 |         sms.setFont(f1);
 42 | 
 43 |         //============set Label===========
 44 |         lusername = new JLabel("Username:");
 45 |         lusername.setBounds(150, 200, 100, 30);
 46 |         add(lusername);
 47 | 
 48 |         studentNameField = new JLabel(username);
 49 |         studentNameField.setBounds(230, 200, 200, 30);
 50 |         add(studentNameField);
 51 | 
 52 |         lroll = new JLabel("Roll Number:");
 53 |         lroll.setBounds(380, 200, 100, 30);
 54 |         add(lroll);
 55 | 
 56 |         rollNoField = new JLabel("__________");
 57 |         rollNoField.setBounds(480, 200, 100, 30);
 58 |         add(rollNoField);
 59 | 
 60 |         lmaths = new JLabel("Mathematics:");
 61 |         lmaths.setBounds(80, 260, 100, 30);
 62 |         add(lmaths);
 63 | 
 64 |         lscience = new JLabel("Science:");
 65 |         lscience.setBounds(80, 320, 100, 30);
 66 |         add(lscience);
 67 | 
 68 |         mathsField = new JLabel("____");
 69 |         mathsField.setBounds(200, 260, 100, 30);
 70 |         add(mathsField);
 71 | 
 72 |         scienceField = new JLabel("____");
 73 |         scienceField.setBounds(200, 320, 100, 30);
 74 |         add(scienceField);
 75 | 
 76 |         ltotal = new JLabel("History:");
 77 |         ltotal.setBounds(500, 320, 100, 30);
 78 |         add(ltotal);
 79 | 
 80 |         lenglish = new JLabel("English:");
 81 |         lenglish.setBounds(500, 260, 100, 30);
 82 |         add(lenglish);
 83 | 
 84 |         englishField = new JLabel("____");
 85 |         englishField.setBounds(600, 260, 100, 30);
 86 |         add(englishField);
 87 | 
 88 |         historyField = new JLabel("____");
 89 |         historyField.setBounds(600, 320, 100, 30);
 90 |         add(historyField);
 91 | 
 92 |         lgeo = new JLabel("Geography:");
 93 |         lgeo.setBounds(280, 260, 100, 30);
 94 |         add(lgeo);
 95 | 
 96 |         lecon = new JLabel("Economics:");
 97 |         lecon.setBounds(280, 320, 100, 30);
 98 |         add(lecon);
 99 | 
100 |         geoField = new JLabel("____");
101 |         geoField.setBounds(400, 260, 100, 30);
102 |         add(geoField);
103 | 
104 |         econField = new JLabel("____");
105 |         econField.setBounds(400, 320, 100, 30);
106 |         add(econField);
107 | 
108 |         //---------------------------------------------------------------------
109 |         lhistory = new JLabel("Total Marks:");
110 |         lhistory.setBounds(150, 400, 100, 30);
111 |         add(lhistory);
112 | 
113 |         lpercentage = new JLabel("Percentage:");
114 |         lpercentage.setBounds(150, 450, 100, 30);
115 |         add(lpercentage);
116 | 
117 |         total_marks = new JLabel("____");
118 |         total_marks.setBounds(270, 400, 100, 30);
119 |         add(total_marks);
120 | 
121 |         percentage = new JLabel("______%");
122 |         percentage.setBounds(270, 450, 100, 30);
123 |         add(percentage);
124 | 
125 |         lgrade = new JLabel("Grade:");
126 |         lgrade.setBounds(380, 400, 100, 30);
127 |         add(lgrade);
128 | 
129 |         lresult = new JLabel("Result:");
130 |         lresult.setBounds(380, 450, 100, 30);
131 |         add(lresult);
132 | 
133 |         grade = new JLabel("____");
134 |         grade.setBounds(470, 400, 100, 30);
135 |         add(grade);
136 | 
137 |         result = new JLabel("_____");
138 |         result.setBounds(470, 450, 100, 30);
139 |         add(result);
140 | 
141 |         // --------------------- Back Button ---------------------------
142 |         bback = new JButton("Back");
143 |         bback.setBounds(583, 661, 100, 37);
144 |         bback.setBackground(Color.blue);
145 |         bback.setForeground(Color.white);
146 |         bback.addActionListener(this);
147 |         add(bback);
148 | 
149 |         //============set Image===================
150 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\Result12.jpg");
151 |         lpic = new JLabel(img);
152 |         lpic.setBounds(0, 0, 736, 700);
153 |         add(lpic);
154 | 
155 |         loadStudentData(username);
156 |         
157 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
158 |             @Override
159 |             public void windowClosing(java.awt.event.WindowEvent e) {
160 |                 studentHomePage.setEnabled(true);
161 |             }
162 |         });
163 | 
164 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
165 |         bback.setCursor(c);
166 | 
167 |         setResizable(false);
168 |     }
169 | 
170 |     public void loadStudentData(String username) {
171 |         try {
172 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
173 |             PreparedStatement pst = con.prepareStatement("SELECT * FROM student_results WHERE student_name = ?");
174 |             pst.setString(1, username);
175 |             ResultSet rs = pst.executeQuery();
176 | 
177 |             if (rs.next()) {
178 |                 studentNameField.setText(rs.getString("student_name"));
179 |                 rollNoField.setText(rs.getString("roll_no"));
180 |                 mathsField.setText(rs.getString("mathematics"));
181 |                 scienceField.setText(rs.getString("science"));
182 |                 englishField.setText(rs.getString("english"));
183 |                 historyField.setText(rs.getString("history"));
184 |                 geoField.setText(rs.getString("geography"));
185 |                 econField.setText(rs.getString("economics"));
186 |                 total_marks.setText(rs.getString("total_marks"));
187 |                 percentage.setText(rs.getString("percentage"));
188 |                 grade.setText(rs.getString("grade"));
189 |                 result.setText(rs.getString("result"));
190 |             }
191 |             con.close();
192 |         } catch (SQLException e) {
193 |             e.printStackTrace();
194 |         }
195 |     }
196 | 
197 |     public void actionPerformed(ActionEvent ae) {
198 |         if (ae.getSource() == bback) {
199 |             studentHomePage.setEnabled(true);
200 |             dispose();
201 |         }
202 |     }
203 | 
204 | }
205 | 


--------------------------------------------------------------------------------
/src/School_Management_System/RemoveStudent.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.*;
  4 | import javax.swing.*;
  5 | import javax.swing.table.DefaultTableModel;
  6 | import java.sql.*;
  7 | import javax.swing.table.TableColumn;
  8 | 
  9 | public class RemoveStudent extends JFrame {
 10 | 
 11 |     DefaultTableModel model;
 12 |     JTable table;
 13 | 
 14 |     public RemoveStudent(JFrame studentHomePage) {
 15 |         setTitle("Remove Students Details");
 16 |         setSize(1200, 400);
 17 |         setLayout(new BorderLayout());
 18 |         setLocationRelativeTo(null);
 19 |         setResizable(false);
 20 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 21 |         setIconImage(icon.getImage());
 22 | 
 23 |         model = new DefaultTableModel(new String[]{"Name", "Username", "Email", "Father Name", "Contact Number", "Class", "Address", "Gender", "Section", "Age", "DOB", "Profile Pic."}, 0) {
 24 |             @Override
 25 |             public Class<?> getColumnClass(int column) {
 26 |                 return column == 11 ? ImageIcon.class : String.class;
 27 |             }
 28 |         };
 29 |         
 30 |         table = new JTable(model);
 31 |         JScrollPane scrollPane = new JScrollPane(table);
 32 |         add(scrollPane, BorderLayout.CENTER);
 33 |         
 34 |         JButton deleteButton = new JButton("Remove Student");
 35 |         deleteButton.addActionListener(e -> removeTeacher());
 36 |         add(deleteButton, BorderLayout.SOUTH);
 37 | 
 38 |         loadTableData();
 39 | 
 40 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
 41 |             @Override
 42 |             public void windowClosing(java.awt.event.WindowEvent e) {
 43 |                 studentHomePage.setEnabled(true);
 44 |             }
 45 |         });
 46 | 
 47 |         table.setBackground(Color.black);
 48 |         table.setForeground(Color.white);
 49 |         table.setRowHeight(50);
 50 | 
 51 |         TableColumn image = table.getColumnModel().getColumn(11);
 52 |         image.setPreferredWidth(50);
 53 |         image.setMinWidth(50);
 54 |         image.setMaxWidth(50);
 55 |         
 56 |         setVisible(true);
 57 |     }
 58 | 
 59 |     private void loadTableData() {
 60 |         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
 61 |             String query = "SELECT * FROM student2";
 62 |             PreparedStatement pst = con.prepareStatement(query);
 63 |             ResultSet rs = pst.executeQuery();
 64 | 
 65 |             while (rs.next()) {
 66 |                 String name = rs.getString("name");
 67 |                 String username = rs.getString("username");
 68 |                 String email = rs.getString("email");
 69 |                 String father = rs.getString("father");
 70 |                 String contact = rs.getString("contact");
 71 |                 String qualification = rs.getString("class");
 72 |                 String address = rs.getString("address");
 73 |                 String gender = rs.getString("gender");
 74 |                 String teachingExperience = rs.getString("section");
 75 |                 String age = rs.getString("age");
 76 |                 String dob = rs.getString("dob");
 77 | 
 78 |                 byte[] imgBytes = rs.getBytes("image");
 79 |                 ImageIcon imageIcon = null;
 80 |                 if (imgBytes != null) {
 81 |                     Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
 82 |                     imageIcon = new ImageIcon(img);
 83 |                 }
 84 | 
 85 |                 model.addRow(new Object[]{name, username, email, father, contact, qualification, address, gender, teachingExperience, age, dob, imageIcon});
 86 |             }
 87 |         } catch (SQLException e) {
 88 |             e.printStackTrace();
 89 |             JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
 90 |         }
 91 |     }
 92 |     
 93 |     private void removeTeacher() {
 94 |         int selectedRow = table.getSelectedRow();
 95 |         if (selectedRow != -1) {
 96 |             String username = model.getValueAt(selectedRow, 1).toString();
 97 |             try {
 98 |                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
 99 |                 String query = "DELETE FROM student2 WHERE username = ?";
100 |                 PreparedStatement preparedStatement = connection.prepareStatement(query);
101 |                 preparedStatement.setString(1, username);
102 |                 preparedStatement.executeUpdate();
103 | 
104 |                 model.removeRow(selectedRow);
105 |                 preparedStatement.close();
106 |                 connection.close();
107 |                 JOptionPane.showMessageDialog(this, "Student removed successfully!");
108 |             } catch (SQLException e) {
109 |                 e.printStackTrace();
110 |                 JOptionPane.showMessageDialog(this, "Error removing student.");
111 |             }
112 |         } else {
113 |             JOptionPane.showMessageDialog(this, "Please select a student to remove.");
114 |         }
115 |     }
116 | 
117 | }
118 | 


--------------------------------------------------------------------------------
/src/School_Management_System/RemoveTeacher.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import javax.swing.*;
  4 | import javax.swing.table.DefaultTableModel;
  5 | import java.awt.*;
  6 | import java.sql.*;
  7 | import javax.swing.table.TableColumn;
  8 | 
  9 | public class RemoveTeacher extends JFrame {
 10 | 
 11 |     JTable table;
 12 |     DefaultTableModel model;
 13 | 
 14 |     public RemoveTeacher(JFrame studentHomePage) {
 15 |         setTitle("Teachers Details");
 16 |         setSize(1200, 400);
 17 |         setLayout(new BorderLayout());
 18 |         setLocationRelativeTo(null);
 19 |         setResizable(false);
 20 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 21 |         setIconImage(icon.getImage());
 22 | 
 23 |         model = new DefaultTableModel(new String[]{"Name", "Username", "Email", "Father Name", "Contact Number", "Qualification", "Address", "Gender", "Teaching Exp.", "Age", "DOB", "Profile Pic."}, 0) {
 24 |             @Override
 25 |             public Class<?> getColumnClass(int column) {
 26 |                 return column == 11 ? ImageIcon.class : String.class;
 27 |             }
 28 |         };
 29 |         
 30 |         table = new JTable(model);
 31 |         JScrollPane scrollPane = new JScrollPane(table);
 32 |         add(scrollPane, BorderLayout.CENTER);
 33 |         
 34 |         JButton deleteButton = new JButton("Remove Teacher");
 35 |         deleteButton.addActionListener(e -> removeTeacher());
 36 |         add(deleteButton, BorderLayout.SOUTH);
 37 | 
 38 |         loadTableData();
 39 | 
 40 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
 41 |             @Override
 42 |             public void windowClosing(java.awt.event.WindowEvent e) {
 43 |                 studentHomePage.setEnabled(true);
 44 |             }
 45 |         });
 46 | 
 47 |         table.setBackground(Color.black);
 48 |         table.setForeground(Color.white);
 49 |         table.setRowHeight(50);
 50 | 
 51 |         TableColumn image = table.getColumnModel().getColumn(11);
 52 |         image.setPreferredWidth(50);
 53 |         image.setMinWidth(50);
 54 |         image.setMaxWidth(50);
 55 |         
 56 |         setVisible(true);
 57 |     }
 58 | 
 59 |     private void loadTableData() {
 60 |         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
 61 |             String query = "SELECT * FROM teacher2";
 62 |             PreparedStatement pst = con.prepareStatement(query);
 63 |             ResultSet rs = pst.executeQuery();
 64 | 
 65 |             while (rs.next()) {
 66 |                 String name = rs.getString("name");
 67 |                 String username = rs.getString("username");
 68 |                 String email = rs.getString("email");
 69 |                 String father = rs.getString("father");
 70 |                 String contact = rs.getString("contact");
 71 |                 String qualification = rs.getString("qualification");
 72 |                 String address = rs.getString("address");
 73 |                 String gender = rs.getString("gender");
 74 |                 String teachingExperience = rs.getString("teachingExperience");
 75 |                 String age = rs.getString("age");
 76 |                 String dob = rs.getString("dob");
 77 | 
 78 |                 byte[] imgBytes = rs.getBytes("image");
 79 |                 ImageIcon imageIcon = null;
 80 |                 if (imgBytes != null) {
 81 |                     Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
 82 |                     imageIcon = new ImageIcon(img);
 83 |                 }
 84 | 
 85 |                 model.addRow(new Object[]{name, username, email, father, contact, qualification, address, gender, teachingExperience, age, dob, imageIcon});
 86 |             }
 87 |         } catch (SQLException e) {
 88 |             e.printStackTrace();
 89 |             JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
 90 |         }
 91 |     }
 92 |     
 93 |     private void removeTeacher() {
 94 |         int selectedRow = table.getSelectedRow();
 95 |         if (selectedRow != -1) {
 96 |             String username = model.getValueAt(selectedRow, 1).toString();
 97 |             try {
 98 |                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
 99 |                 String query = "DELETE FROM Teacher2 WHERE username = ?";
100 |                 PreparedStatement preparedStatement = connection.prepareStatement(query);
101 |                 preparedStatement.setString(1, username);
102 |                 preparedStatement.executeUpdate();
103 | 
104 |                 model.removeRow(selectedRow);
105 |                 preparedStatement.close();
106 |                 connection.close();
107 |                 JOptionPane.showMessageDialog(this, "Teacher removed successfully!");
108 |             } catch (SQLException e) {
109 |                 e.printStackTrace();
110 |                 JOptionPane.showMessageDialog(this, "Error removing teacher.");
111 |             }
112 |         } else {
113 |             JOptionPane.showMessageDialog(this, "Please select a teacher to remove.");
114 |         }
115 |     }
116 | }


--------------------------------------------------------------------------------
/src/School_Management_System/StudentHomePage.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import java.io.IOException;
  6 | import java.io.InputStream;
  7 | import java.sql.Connection;
  8 | import java.sql.DriverManager;
  9 | import java.sql.PreparedStatement;
 10 | import java.sql.ResultSet;
 11 | import java.sql.SQLException;
 12 | import java.util.logging.Level;
 13 | import java.util.logging.Logger;
 14 | import javax.swing.*;
 15 | 
 16 | public class StudentHomePage extends JFrame implements ActionListener {
 17 | 
 18 |     JMenuItem my, studentd, teacherd, result, bback;
 19 |     JButton labelUsername;
 20 | 
 21 |     StudentHomePage(String username) {
 22 | 
 23 |         //============set frame===========
 24 |         setTitle("Student Home Page");
 25 |         setSize(1530, 810);
 26 |         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 27 |         setLayout(null);
 28 |         setVisible(true);
 29 |         setLocationRelativeTo(null);
 30 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 31 |         setIconImage(icon.getImage());
 32 | 
 33 |         //============set Font===========
 34 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 80);
 35 |         Font f2 = new Font("Monotype Corsiva", Font.BOLD, 24);
 36 | 
 37 |         //============set Font Label===========
 38 |         JLabel lsms = new JLabel("School Management System");
 39 |         lsms.setBounds(80, 75, 1000, 100);
 40 |         lsms.setForeground(Color.CYAN);
 41 |         add(lsms);
 42 |         lsms.setFont(f1);
 43 | 
 44 |         JLabel welcomeAdmin = new JLabel("Welcome Student");
 45 |         welcomeAdmin.setBounds(200, 180, 250, 60);
 46 |         welcomeAdmin.setForeground(Color.white);
 47 |         add(welcomeAdmin);
 48 |         welcomeAdmin.setFont(f2);
 49 | 
 50 |         labelUsername = new JButton(username);
 51 |         labelUsername.setBounds(350, 193, 200, 35);
 52 |         labelUsername.setFont(f2);
 53 |         labelUsername.setForeground(Color.ORANGE);
 54 |         labelUsername.setContentAreaFilled(false);
 55 |         labelUsername.setOpaque(false);
 56 |         labelUsername.setBorderPainted(false);
 57 |         labelUsername.addActionListener(this);
 58 |         add(labelUsername);
 59 | 
 60 |         try {
 61 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
 62 |             PreparedStatement pst = con.prepareStatement("SELECT image FROM Student2 WHERE username = ?");
 63 |             pst.setString(1, username);
 64 |             ResultSet rs = pst.executeQuery();
 65 | 
 66 |             if (rs.next()) {
 67 |                 InputStream input = rs.getBinaryStream("image");
 68 |                 byte[] buffer = input.readAllBytes();
 69 |                 ImageIcon imageIcon = new ImageIcon(buffer);
 70 |                 Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
 71 |                 JLabel profile = new JLabel();
 72 |                 profile.setBounds(80, 155, 100, 100);
 73 |                 profile.setBorder(BorderFactory.createLineBorder(Color.WHITE));
 74 |                 add(profile);
 75 |                 profile.setIcon(new ImageIcon(image));
 76 |                 profile.setText("");
 77 |                 profile.addMouseListener(new MouseAdapter() {
 78 |                     @Override
 79 |                     public void mouseClicked(MouseEvent e) {
 80 |                         showFullImage(imageIcon);
 81 |                     }
 82 |                 });
 83 |             }
 84 |             con.close();
 85 |         } catch (SQLException e) {
 86 |             e.printStackTrace();
 87 |         } catch (IOException ex) {
 88 |             Logger.getLogger(StudentHomePage.class.getName()).log(Level.SEVERE, null, ex);
 89 |         }
 90 | 
 91 |         //============set Menubar===========
 92 |         JMenuBar menubar = new JMenuBar();
 93 | 
 94 |         my = new JMenuItem("                                           My Profile");
 95 |         my.setBackground(Color.black);
 96 |         my.setForeground(Color.white);
 97 |         my.addActionListener(this);
 98 |         menubar.add(my);
 99 | 
100 |         JMenu details = new JMenu("                                                Details                                                 ");
101 |         details.setForeground(Color.magenta);
102 |         menubar.add(details);
103 | 
104 |         studentd = new JMenuItem("Students Details");
105 |         teacherd = new JMenuItem("Teacher Details");
106 | 
107 |         details.add(studentd);
108 |         details.add(teacherd);
109 |         studentd.addActionListener(this);
110 |         teacherd.addActionListener(this);
111 | 
112 |         result = new JMenuItem("                                                 Result");
113 |         result.setBackground(Color.red);
114 |         result.setForeground(Color.yellow);
115 |         result.addActionListener(this);
116 |         menubar.add(result);
117 | 
118 |         bback = new JMenuItem("                                                   Logout");
119 |         bback.setBackground(Color.black);
120 |         bback.setForeground(Color.white);
121 |         bback.addActionListener(this);
122 |         menubar.add(bback);
123 | 
124 |         setJMenuBar(menubar);
125 | 
126 |         //============set Image===================
127 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\StudentHomePage111.jpg");
128 |         JLabel lpic = new JLabel(img);
129 |         lpic.setBounds(0, 0, 1570, 800);
130 |         add(lpic);
131 | 
132 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
133 |         menubar.setCursor(c);
134 |         labelUsername.setCursor(c);
135 |         bback.setCursor(c);
136 |     }
137 | 
138 |     public void actionPerformed(ActionEvent ae) {
139 |         if (ae.getSource() == bback) {
140 |             dispose();
141 |             new Welcome().setVisible(true);
142 |         }
143 |         if (ae.getSource() == studentd) {
144 |             this.setEnabled(false);
145 |             new ViewStudent(this).setVisible(true);
146 |         }
147 |         if (ae.getSource() == teacherd) {
148 |             this.setEnabled(false);
149 |             new ViewTeacher(this).setVisible(true);
150 |         }
151 |         if (ae.getSource() == result) {
152 |             this.setEnabled(false);
153 |             String username = labelUsername.getText();
154 |             new MyResult(username, this).setVisible(true);
155 |         }
156 |         if (ae.getSource() == my) {
157 |             this.setEnabled(false);
158 |             String username = labelUsername.getText();
159 |             new MyProfile2(username, this).setVisible(true);
160 |         }
161 |         if (ae.getSource() == labelUsername) {
162 |             this.setEnabled(false);
163 |             String username = labelUsername.getText();
164 |             new MyProfile2(username, this).setVisible(true);
165 |         }
166 |     }
167 | 
168 |     private void showFullImage(ImageIcon imageIcon) {
169 |         JDialog fullImageFrame = new JDialog(this, "Profile Image", true);
170 |         fullImageFrame.setSize(550, 580);
171 |         fullImageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
172 |         fullImageFrame.setLocationRelativeTo(null);
173 |         fullImageFrame.setResizable(false);
174 |         JLabel lblFullImage = new JLabel();
175 |         lblFullImage.setHorizontalAlignment(JLabel.CENTER);
176 |         Image fullImage = imageIcon.getImage().getScaledInstance(550, 550, Image.SCALE_SMOOTH);
177 |         lblFullImage.setIcon(new ImageIcon(fullImage));
178 |         fullImageFrame.add(lblFullImage);
179 |         fullImageFrame.setVisible(true);
180 |     }
181 | 
182 | //    public static void main(String arg[]) {
183 | //        new StudentHomePage("karan_123").setVisible(true);
184 | //    }
185 | }
186 | 


--------------------------------------------------------------------------------
/src/School_Management_System/UpdateClass.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | import java.sql.*;
  7 | 
  8 | public class UpdateClass extends JFrame implements ActionListener {
  9 |     JFrame adminHomePage;
 10 |     
 11 |     JTextField tenrolled, tclassTeacher;
 12 |     JButton bupdate, bback;
 13 |     JComboBox cbstrength, cbsection, cbclass;
 14 | 
 15 |     UpdateClass(JFrame adminHomePage) {
 16 |         this.adminHomePage = adminHomePage;
 17 |         
 18 |         JLabel ltitle, lclass, lsection, lstrength, lenrolled, lteacher, lpic;
 19 | 
 20 |         //============set frame===========
 21 |         setTitle("Update Class");
 22 |         setSize(700, 450);
 23 |         setLayout(null);
 24 |         setVisible(true);
 25 |         setLocationRelativeTo(null);
 26 |         setResizable(false);
 27 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 28 |         setIconImage(icon.getImage());
 29 | 
 30 |         //============set Font===========
 31 |         Font f1 = new Font("Monotype Corsiva", Font.BOLD, 40);
 32 | 
 33 |         //============set Font Label===========
 34 |         ltitle = new JLabel("Updare Class");
 35 |         ltitle.setBounds(100, 30, 400, 50);
 36 |         ltitle.setForeground(Color.white);
 37 |         add(ltitle);
 38 |         ltitle.setFont(f1);
 39 | 
 40 |         //============set Label===========
 41 |         lclass = new JLabel("Class Name");
 42 |         lclass.setBounds(50, 350, 100, 30);
 43 |         lclass.setForeground(Color.white);
 44 |         add(lclass);
 45 | 
 46 |         lsection = new JLabel("Section");
 47 |         lsection.setBounds(50, 160, 100, 30);
 48 |         lsection.setForeground(Color.white);
 49 |         add(lsection);
 50 | 
 51 |         lstrength = new JLabel("Student_Strength");
 52 |         lstrength.setBounds(50, 220, 110, 30);
 53 |         lstrength.setForeground(Color.white);
 54 |         add(lstrength);
 55 | 
 56 |         lenrolled = new JLabel("Enrolled_Student");
 57 |         lenrolled.setBounds(50, 280, 100, 30);
 58 |         lenrolled.setForeground(Color.white);
 59 |         add(lenrolled);
 60 | 
 61 |         lteacher = new JLabel("Class_Teacher");
 62 |         lteacher.setBounds(50, 100, 100, 30);
 63 |         lteacher.setForeground(Color.white);
 64 |         add(lteacher);
 65 | 
 66 |         //============set combobox============
 67 |         cbclass = new JComboBox();
 68 |         cbclass.addItem("-select-");
 69 |         cbclass.addItem("1");
 70 |         cbclass.addItem("2");
 71 |         cbclass.addItem("3");
 72 |         cbclass.addItem("4");
 73 |         cbclass.addItem("5");
 74 |         cbclass.addItem("6");
 75 |         cbclass.addItem("7");
 76 |         cbclass.addItem("8");
 77 |         cbclass.addItem("9");
 78 |         cbclass.addItem("10");
 79 |         cbclass.addItem("11");
 80 |         cbclass.addItem("12");
 81 |         cbclass.setBounds(250, 350, 100, 30);
 82 |         cbclass.setFont(new Font("Arial", Font.BOLD, 11));
 83 |         add(cbclass);
 84 | 
 85 |         cbsection = new JComboBox();
 86 |         cbsection.addItem("-select-");
 87 |         cbsection.addItem("A");
 88 |         cbsection.addItem("B");
 89 |         cbsection.addItem("C");
 90 |         cbsection.addItem("D");
 91 |         cbsection.setBounds(250, 160, 100, 30);
 92 |         cbsection.setFont(new Font("Arial", Font.BOLD, 11));
 93 |         add(cbsection);
 94 | 
 95 |         cbstrength = new JComboBox();
 96 |         cbstrength.addItem("-select-");
 97 |         cbstrength.addItem("20");
 98 |         cbstrength.addItem("30");
 99 |         cbstrength.addItem("40");
100 |         cbstrength.addItem("50");
101 |         cbstrength.setBounds(250, 220, 100, 30);
102 |         cbstrength.setFont(new Font("Arial", Font.BOLD, 11));
103 |         add(cbstrength);
104 | 
105 |         //============set TextField============
106 |         tenrolled = new JTextField();
107 |         tenrolled.setBounds(250, 280, 100, 30);
108 |         add(tenrolled);
109 | 
110 |         //============set Button============
111 |         bupdate = new JButton("Update");
112 |         bupdate.setBounds(400, 350, 100, 30);
113 |         bupdate.setBackground(Color.black);
114 |         bupdate.setForeground(Color.white);
115 |         add(bupdate);
116 |         bupdate.addActionListener(this);
117 | 
118 |         bback = new JButton("Back");
119 |         bback.setBounds(550, 350, 100, 30);
120 |         bback.setBackground(Color.black);
121 |         bback.setForeground(Color.white);
122 |         add(bback);
123 |         bback.addActionListener(this);
124 | 
125 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
126 |         bupdate.setCursor(c);
127 |         bback.setCursor(c);
128 | 
129 |         //============set ComboBox===================
130 |         JComboBox<String> comboBox = new JComboBox<>();
131 |         //comboBox.setBounds(450,250,170,30);
132 |         comboBox.setBounds(250, 100, 100, 30);
133 |         add(comboBox);
134 |         comboBox.addActionListener(new ActionListener() {
135 |             public void actionPerformed(ActionEvent e) {
136 | 
137 |                 String selectedItem = (String) comboBox.getSelectedItem();
138 | 
139 |                 tclassTeacher = new JTextField();
140 |                 // tclassTeacher.setBounds(250,350,100,30);
141 |                 // add(tclassTeacher);
142 | 
143 |                 loadStudentData(selectedItem);
144 |             }
145 |         });
146 |         try {
147 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
148 |             Statement stmt = con.createStatement();
149 |             ResultSet rs = stmt.executeQuery("SELECT Class_Teacher FROM Class");
150 | 
151 |             while (rs.next()) {
152 |                 comboBox.addItem(rs.getString("Class_Teacher"));
153 |             }
154 |             con.close();
155 |         } catch (SQLException e) {
156 |             e.printStackTrace();
157 |         }
158 |         
159 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
160 |             @Override
161 |             public void windowClosing(java.awt.event.WindowEvent e) {
162 |                 adminHomePage.setEnabled(true); 
163 |                 dispose();
164 |             }
165 |         });
166 | 
167 |         //============set Image===================
168 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\AddClass.png");
169 |         lpic = new JLabel(img);
170 |         lpic.setBounds(0, 0, 700, 450);
171 |         add(lpic);
172 | 
173 |     }
174 | 
175 |     private void loadStudentData(String Class_Teacher) {
176 | 
177 |         try {
178 |             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
179 |             PreparedStatement pst = con.prepareStatement("SELECT * FROM Class WHERE Class_Teacher = ?");
180 |             pst.setString(1, Class_Teacher);
181 |             ResultSet rs = pst.executeQuery();
182 | 
183 |             if (rs.next()) {
184 |                 cbclass.setSelectedItem(rs.getString("class"));
185 |                 cbsection.setSelectedItem(rs.getString("Section"));
186 |                 cbstrength.setSelectedItem(rs.getString("Student_Strength"));
187 |                 tenrolled.setText(rs.getString("Enrolled_Student"));
188 |                 tclassTeacher.setText(rs.getString("Class_Teacher"));
189 |             }
190 |             con.close();
191 |         } catch (SQLException e) {
192 |             e.printStackTrace();
193 |         }
194 |     }
195 | 
196 |     public void actionPerformed(ActionEvent ae) {
197 |         if (ae.getSource() == bupdate) {
198 |             updateClassData();
199 |         } else if (ae.getSource() == bback) {
200 |             adminHomePage.setEnabled(true);
201 |             dispose();
202 |         }
203 |     }
204 | 
205 |     private void updateClassData() {
206 |         if (cbclass.getSelectedItem().equals("-select-")) {
207 |             JOptionPane.showMessageDialog(null, "Select A Class");
208 |         } else if (cbsection.getSelectedItem().equals("-select-")) {
209 |             JOptionPane.showMessageDialog(null, "Please Select Section");
210 |         } else if (cbstrength.getSelectedItem().equals("-select-")) {
211 |             JOptionPane.showMessageDialog(null, "Please Select Strenght");
212 |         } else if (tenrolled.getText().length() == 0) {
213 |             JOptionPane.showMessageDialog(null, "Fill Up Number of Enrolled Students");
214 |         } else if (tclassTeacher.getText().length() == 0) {
215 |             JOptionPane.showMessageDialog(null, "Enter Class Teacher Name");
216 |         } else {
217 |             try {
218 |                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
219 |                 PreparedStatement pst = con.prepareStatement("UPDATE Class SET class=?, Section=?, Student_Strength=?, Enrolled_Students=? WHERE Class_Teacher=?");
220 | 
221 |                 pst.setString(1, cbclass.getSelectedItem().toString());
222 |                 pst.setString(2, cbsection.getSelectedItem().toString());
223 |                 pst.setString(3, cbstrength.getSelectedItem().toString());
224 |                 pst.setString(4, tenrolled.getText());
225 |                 pst.setString(5, tclassTeacher.getText());
226 | 
227 |                 int rowsUpdated = pst.executeUpdate();
228 | 
229 |                 if (rowsUpdated > 0) {
230 |                     JOptionPane.showMessageDialog(this, "Class details updated successfully!");
231 |                 }
232 |                 con.close();
233 |             } catch (SQLException e) {
234 |                 e.printStackTrace();
235 |             }
236 |         }
237 |     }
238 | }
239 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ViewClass.java:
--------------------------------------------------------------------------------
 1 | package School_Management_System;
 2 | 
 3 | import java.awt.*;
 4 | import javax.swing.*;
 5 | import javax.swing.table.DefaultTableModel;
 6 | import java.sql.*;
 7 | 
 8 | public class ViewClass extends JFrame {
 9 |     DefaultTableModel model;
10 |     JTable table;
11 | 
12 |     ViewClass(JFrame studentHomePage) {
13 |         setTitle("Class Details");
14 |         setSize(700, 350);
15 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
16 |         setIconImage(icon.getImage());
17 | 
18 |         model = new DefaultTableModel();
19 |         table = new JTable(model);
20 |         table.setForeground(Color.white);
21 |         table.setBackground(Color.black);
22 | 
23 |         model.addColumn("Class");
24 |         model.addColumn("Section");
25 |         model.addColumn("Student_Strength");
26 |         model.addColumn("Enrolled_Student");
27 |         model.addColumn("Class_Teacher");
28 | 
29 |         loadData();
30 | 
31 |         JScrollPane scrollPane = new JScrollPane(table);
32 |         add(scrollPane, BorderLayout.CENTER);
33 |         
34 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
35 |             @Override
36 |             public void windowClosing(java.awt.event.WindowEvent e) {
37 |                 studentHomePage.setEnabled(true);
38 |             }
39 |         });
40 | 
41 |         setResizable(false);
42 |         setVisible(true);
43 |         setLocationRelativeTo(null);
44 |     }
45 | 
46 |     private void loadData() {
47 |         try {
48 |             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
49 |             Statement statement = connection.createStatement();
50 |             ResultSet resultSet = statement.executeQuery("SELECT * FROM Class");
51 | 
52 |             while (resultSet.next()) {
53 |                 model.addRow(new Object[]{
54 |                     resultSet.getString("class"),
55 |                     resultSet.getString("Section"),
56 |                     resultSet.getString("Student_Strength"),
57 |                     resultSet.getString("Enrolled_Students"),
58 |                     resultSet.getString("Class_Teacher"),});
59 |             }
60 |             resultSet.close();
61 |             statement.close();
62 |             connection.close();
63 |         } catch (SQLException e) {
64 |             e.printStackTrace();
65 |         }
66 |     }
67 | 
68 | }
69 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ViewStudent.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.*;
  4 | import java.awt.event.MouseAdapter;
  5 | import java.awt.event.MouseEvent;
  6 | import javax.swing.*;
  7 | import javax.swing.table.DefaultTableModel;
  8 | import java.sql.*;
  9 | import javax.swing.table.TableColumn;
 10 | 
 11 | public class ViewStudent extends JFrame {
 12 | 
 13 |     DefaultTableModel model;
 14 |     JTable table;
 15 |     JLabel imageLabel;
 16 | 
 17 |     ViewStudent(JFrame studentHomePage) {
 18 |         
 19 |         setTitle("Student Details");
 20 |         setSize(1200, 400);
 21 |         setLayout(new BorderLayout());
 22 |         setLocationRelativeTo(null);
 23 |         setResizable(false);
 24 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 25 |         setIconImage(icon.getImage());
 26 | 
 27 |         model = new DefaultTableModel(new String[]{"Name", "Username", "Email", "Father Name", "Contact Number", "Class", "Address", "Gender", "Section", "Age", "DOB", "Profile Pic."}, 0) {
 28 |             @Override
 29 |             public Class<?> getColumnClass(int column) {
 30 |                 return column == 11 ? ImageIcon.class : String.class;
 31 |             }
 32 |         };
 33 |         table = new JTable(model);
 34 |         JScrollPane scrollPane = new JScrollPane(table);
 35 |         add(scrollPane, BorderLayout.CENTER);
 36 | 
 37 |         loadTableData();
 38 | 
 39 |         table.addMouseListener(new MouseAdapter() {
 40 |             @Override
 41 |             public void mouseClicked(MouseEvent e) {
 42 |                 int selectedRow = table.getSelectedRow();
 43 |                 if (selectedRow != -1) {
 44 |                     String username = model.getValueAt(selectedRow, 1).toString();
 45 |                     showDetails(username);
 46 |                 }
 47 |             }
 48 |         });
 49 | 
 50 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
 51 |             @Override
 52 |             public void windowClosing(java.awt.event.WindowEvent e) {
 53 |                 studentHomePage.setEnabled(true);
 54 |             }
 55 |         });
 56 | 
 57 |         table.setBackground(Color.black);
 58 |         table.setForeground(Color.white);
 59 |         table.setRowHeight(50);
 60 | 
 61 |         TableColumn image = table.getColumnModel().getColumn(11);
 62 |         image.setPreferredWidth(50);
 63 |         image.setMinWidth(50);
 64 |         image.setMaxWidth(50);
 65 |     }
 66 | 
 67 |     private void loadTableData() {
 68 |         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
 69 |             String query = "SELECT * FROM student2";
 70 |             PreparedStatement pst = con.prepareStatement(query);
 71 |             ResultSet rs = pst.executeQuery();
 72 | 
 73 |             while (rs.next()) {
 74 |                 String name = rs.getString("name");
 75 |                 String username = rs.getString("username");
 76 |                 String email = rs.getString("email");
 77 |                 String father = rs.getString("father");
 78 |                 String contact = rs.getString("contact");
 79 |                 String qualification = rs.getString("class");
 80 |                 String address = rs.getString("address");
 81 |                 String gender = rs.getString("gender");
 82 |                 String teachingExperience = rs.getString("section");
 83 |                 String age = rs.getString("age");
 84 |                 String dob = rs.getString("dob");
 85 | 
 86 |                 byte[] imgBytes = rs.getBytes("image");
 87 |                 ImageIcon imageIcon = null;
 88 |                 if (imgBytes != null) {
 89 |                     Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
 90 |                     imageIcon = new ImageIcon(img);
 91 |                 }
 92 | 
 93 |                 model.addRow(new Object[]{name, username, email, father, contact, qualification, address, gender, teachingExperience, age, dob, imageIcon});
 94 |             }
 95 |         } catch (SQLException e) {
 96 |             e.printStackTrace();
 97 |             JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
 98 |         }
 99 |     }
100 |     
101 |     private void showDetails(String username) {
102 |         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
103 |             String query = "SELECT * FROM student2 WHERE username = ?";
104 |             PreparedStatement pst = con.prepareStatement(query);
105 |             pst.setString(1, username);
106 |             ResultSet rs = pst.executeQuery();
107 | 
108 |             if (rs.next()) {
109 |                 String name = rs.getString("name");
110 |                 String username2 = rs.getString("username");
111 |                 String email = rs.getString("email");
112 |                 String father = rs.getString("father");
113 |                 String contact = rs.getString("contact");
114 |                 String qualification = rs.getString("class");
115 |                 String address = rs.getString("address");
116 |                 String gender = rs.getString("gender");
117 |                 String teachingExperience = rs.getString("section");
118 |                 String age = rs.getString("age");
119 |                 String dob = rs.getString("dob");
120 | 
121 |                 byte[] imgBytes = rs.getBytes("image");
122 | 
123 |                 JDialog detailsFrame = new JDialog(this, "Details", true);
124 |                 detailsFrame.setSize(470, 320);
125 |                 detailsFrame.setLocationRelativeTo(null);
126 |                 detailsFrame.setLayout(null);
127 |                 detailsFrame.setResizable(false);
128 | 
129 |                 if (imgBytes != null) {
130 |                     ImageIcon imageIcon = new ImageIcon(imgBytes);
131 |                     Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
132 |                     imageLabel = new JLabel(new ImageIcon(img));
133 |                     imageLabel.setBounds(15, 30, 220, 220);
134 |                     imageLabel.addMouseListener(new MouseAdapter() {
135 |                         @Override
136 |                         public void mouseClicked(MouseEvent e) {
137 |                             showFullImage(imageIcon);
138 |                         }
139 |                     });
140 |                     detailsFrame.add(imageLabel);
141 |                 }
142 |                 JLabel Name = new JLabel("Name:  " + name);
143 |                 Name.setBounds(240, 20, 200, 30);
144 |                 Name.setForeground(Color.white);
145 |                 detailsFrame.add(Name);
146 | 
147 |                 JLabel Username = new JLabel("Username:  " + username2);
148 |                 Username.setBounds(240, 40, 200, 30);
149 |                 Username.setForeground(Color.white);
150 |                 detailsFrame.add(Username);
151 | 
152 |                 JLabel Email = new JLabel("Email:  " + email);
153 |                 Email.setBounds(240, 60, 200, 30);
154 |                 Email.setForeground(Color.white);
155 |                 detailsFrame.add(Email);
156 | 
157 |                 JLabel Father = new JLabel("Father:  " + father);
158 |                 Father.setBounds(240, 80, 200, 30);
159 |                 Father.setForeground(Color.white);
160 |                 detailsFrame.add(Father);
161 | 
162 |                 JLabel Contact = new JLabel("Contact:  " + contact);
163 |                 Contact.setBounds(240, 100, 200, 30);
164 |                 Contact.setForeground(Color.white);
165 |                 detailsFrame.add(Contact);
166 | 
167 |                 JLabel Qualification = new JLabel("Class:  " + qualification);
168 |                 Qualification.setBounds(240, 120, 200, 30);
169 |                 Qualification.setForeground(Color.white);
170 |                 detailsFrame.add(Qualification);
171 |                 
172 |                 JLabel Teaching = new JLabel("Section:  " + teachingExperience);
173 |                 Teaching.setBounds(240, 140, 200, 30);
174 |                 Teaching.setForeground(Color.white);
175 |                 detailsFrame.add(Teaching);
176 | 
177 |                 JLabel Address = new JLabel("Address:  " + address);
178 |                 Address.setBounds(240, 160, 200, 30);
179 |                 Address.setForeground(Color.white);
180 |                 detailsFrame.add(Address);
181 | 
182 |                 JLabel Gender = new JLabel("Gender:  " + gender);
183 |                 Gender.setBounds(240, 180, 200, 30);
184 |                 Gender.setForeground(Color.white);
185 |                 detailsFrame.add(Gender);
186 |                 
187 |                 JLabel Age = new JLabel("Age:  " + age);
188 |                 Age.setBounds(240, 200, 200, 30);
189 |                 Age.setForeground(Color.white);
190 |                 detailsFrame.add(Age);
191 | 
192 |                 JLabel DOB = new JLabel("DOB:  " + dob);
193 |                 DOB.setBounds(240, 220, 200, 30);
194 |                 DOB.setForeground(Color.white);
195 |                 detailsFrame.add(DOB);
196 | 
197 |                 ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\newwwwww.jpg");
198 |                 JLabel lpic = new JLabel(img);
199 |                 lpic.setBounds(0, 0, 480, 330);
200 |                 detailsFrame.add(lpic);
201 | 
202 |                 detailsFrame.setVisible(true);
203 |             }
204 |         } catch (SQLException e) {
205 |             e.printStackTrace();
206 |             JOptionPane.showMessageDialog(this, "Error fetching details: " + e.getMessage());
207 |         }
208 |     }
209 | 
210 |     private void showFullImage(ImageIcon imageIcon) {
211 |         JDialog fullImageFrame = new JDialog(this, "Profile Image", true);
212 |         fullImageFrame.setSize(550, 580);
213 |         fullImageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
214 |         fullImageFrame.setLocationRelativeTo(null);
215 |         fullImageFrame.setResizable(false);
216 |         JLabel lblFullImage = new JLabel();
217 |         lblFullImage.setHorizontalAlignment(JLabel.CENTER);
218 |         Image fullImage = imageIcon.getImage().getScaledInstance(550, 550, Image.SCALE_SMOOTH);
219 |         lblFullImage.setIcon(new ImageIcon(fullImage));
220 |         fullImageFrame.add(lblFullImage);
221 |         fullImageFrame.setVisible(true);
222 |     }
223 | 
224 | }
225 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ViewSubject.java:
--------------------------------------------------------------------------------
 1 | package School_Management_System;
 2 | 
 3 | import java.awt.*;
 4 | import javax.swing.*;
 5 | import javax.swing.table.DefaultTableModel;
 6 | import java.sql.*;
 7 | 
 8 | public class ViewSubject extends JFrame {
 9 |     DefaultTableModel model;
10 |     JTable table;
11 | 
12 |     ViewSubject(Frame studentHomePage) {
13 |         setTitle("Class Details");
14 |         setSize(400, 300);
15 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
16 |         setIconImage(icon.getImage());
17 | 
18 |         model = new DefaultTableModel();
19 |         table = new JTable(model);
20 |         table.setForeground(Color.white);
21 |         table.setBackground(Color.black);
22 | 
23 |         model.addColumn("Subject Name");
24 |         model.addColumn("Sabject Code");
25 | 
26 |         loadData();
27 | 
28 |         JScrollPane scrollPane = new JScrollPane(table);
29 |         add(scrollPane, BorderLayout.CENTER);
30 |         
31 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
32 |             @Override
33 |             public void windowClosing(java.awt.event.WindowEvent e) {
34 |                 studentHomePage.setEnabled(true);
35 |             }
36 |         });
37 | 
38 |         setResizable(false);
39 |         setVisible(true);
40 |         setLocationRelativeTo(null);
41 |     }
42 | 
43 |     private void loadData() {
44 |         try {
45 |             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123");
46 |             Statement statement = connection.createStatement();
47 |             ResultSet resultSet = statement.executeQuery("SELECT * FROM Subject");
48 | 
49 |             while (resultSet.next()) {
50 |                 model.addRow(new Object[]{
51 |                     resultSet.getString("subjectCode"),
52 |                     resultSet.getString("subjectName"),});
53 |             }
54 |             resultSet.close();
55 |             statement.close();
56 |             connection.close();
57 |         } catch (SQLException e) {
58 |             e.printStackTrace();
59 |         }
60 |     }
61 | 
62 | }
63 | 


--------------------------------------------------------------------------------
/src/School_Management_System/ViewTeacher.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import javax.swing.*;
  4 | import javax.swing.table.DefaultTableModel;
  5 | import java.awt.*;
  6 | import java.awt.event.MouseAdapter;
  7 | import java.awt.event.MouseEvent;
  8 | import java.sql.*;
  9 | import javax.swing.table.TableColumn;
 10 | 
 11 | public class ViewTeacher extends JFrame {
 12 | 
 13 |     private JTable table;
 14 |     private DefaultTableModel model;
 15 |     JLabel imageLabel;
 16 | 
 17 |     public ViewTeacher(JFrame studentHomePage) {
 18 |         setTitle("Teachers Details");
 19 |         setSize(1200, 400);
 20 |         setLayout(new BorderLayout());
 21 |         setLocationRelativeTo(null);
 22 |         setResizable(false);
 23 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 24 |         setIconImage(icon.getImage());
 25 | 
 26 |         model = new DefaultTableModel(new String[]{"Name", "Username", "Email", "Father Name", "Contact Number", "Qualification", "Address", "Gender", "Teaching Exp.", "Age", "DOB", "Profile Pic."}, 0) {
 27 |             @Override
 28 |             public Class<?> getColumnClass(int column) {
 29 |                 return column == 11 ? ImageIcon.class : String.class;
 30 |             }
 31 |         };
 32 |         table = new JTable(model);
 33 |         JScrollPane scrollPane = new JScrollPane(table);
 34 |         add(scrollPane, BorderLayout.CENTER);
 35 | 
 36 |         loadTableData();
 37 | 
 38 |         table.addMouseListener(new MouseAdapter() {
 39 |             @Override
 40 |             public void mouseClicked(MouseEvent e) {
 41 |                 int selectedRow = table.getSelectedRow();
 42 |                 if (selectedRow != -1) {
 43 |                     String username = model.getValueAt(selectedRow, 1).toString();
 44 |                     showDetails(username);
 45 |                 }
 46 |             }
 47 |         });
 48 | 
 49 |         this.addWindowListener(new java.awt.event.WindowAdapter() {
 50 |             @Override
 51 |             public void windowClosing(java.awt.event.WindowEvent e) {
 52 |                 studentHomePage.setEnabled(true);
 53 |             }
 54 |         });
 55 | 
 56 |         table.setBackground(Color.black);
 57 |         table.setForeground(Color.white);
 58 |         table.setRowHeight(50);
 59 | 
 60 |         TableColumn image = table.getColumnModel().getColumn(11);
 61 |         image.setPreferredWidth(50);
 62 |         image.setMinWidth(50);
 63 |         image.setMaxWidth(50);
 64 |     }
 65 | 
 66 |     private void loadTableData() {
 67 |         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
 68 |             String query = "SELECT * FROM teacher2";
 69 |             PreparedStatement pst = con.prepareStatement(query);
 70 |             ResultSet rs = pst.executeQuery();
 71 | 
 72 |             while (rs.next()) {
 73 |                 String name = rs.getString("name");
 74 |                 String username = rs.getString("username");
 75 |                 String email = rs.getString("email");
 76 |                 String father = rs.getString("father");
 77 |                 String contact = rs.getString("contact");
 78 |                 String qualification = rs.getString("qualification");
 79 |                 String address = rs.getString("address");
 80 |                 String gender = rs.getString("gender");
 81 |                 String teachingExperience = rs.getString("teachingExperience");
 82 |                 String age = rs.getString("age");
 83 |                 String dob = rs.getString("dob");
 84 | 
 85 |                 byte[] imgBytes = rs.getBytes("image");
 86 |                 ImageIcon imageIcon = null;
 87 |                 if (imgBytes != null) {
 88 |                     Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
 89 |                     imageIcon = new ImageIcon(img);
 90 |                 }
 91 | 
 92 |                 model.addRow(new Object[]{name, username, email, father, contact, qualification, address, gender, teachingExperience, age, dob, imageIcon});
 93 |             }
 94 |         } catch (SQLException e) {
 95 |             e.printStackTrace();
 96 |             JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
 97 |         }
 98 |     }
 99 | 
100 |     private void showDetails(String username) {
101 |         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "Karan@123")) {
102 |             String query = "SELECT * FROM teacher2 WHERE username = ?";
103 |             PreparedStatement pst = con.prepareStatement(query);
104 |             pst.setString(1, username);
105 |             ResultSet rs = pst.executeQuery();
106 | 
107 |             if (rs.next()) {
108 |                 String name = rs.getString("name");
109 |                 String username2 = rs.getString("username");
110 |                 String email = rs.getString("email");
111 |                 String father = rs.getString("father");
112 |                 String contact = rs.getString("contact");
113 |                 String qualification = rs.getString("qualification");
114 |                 String address = rs.getString("address");
115 |                 String gender = rs.getString("gender");
116 |                 String teachingExperience = rs.getString("teachingExperience");
117 |                 String age = rs.getString("age");
118 |                 String dob = rs.getString("dob");
119 | 
120 |                 byte[] imgBytes = rs.getBytes("image");
121 | 
122 |                 JDialog detailsFrame = new JDialog(this, "Details", true);
123 |                 detailsFrame.setSize(470, 320);
124 |                 detailsFrame.setLocationRelativeTo(null);
125 |                 detailsFrame.setLayout(null);
126 |                 detailsFrame.setResizable(false);
127 | 
128 |                 if (imgBytes != null) {
129 |                     ImageIcon imageIcon = new ImageIcon(imgBytes);
130 |                     Image img = new ImageIcon(imgBytes).getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
131 |                     imageLabel = new JLabel(new ImageIcon(img));
132 |                     imageLabel.setBounds(15, 30, 220, 220);
133 |                     imageLabel.addMouseListener(new MouseAdapter() {
134 |                         @Override
135 |                         public void mouseClicked(MouseEvent e) {
136 |                             showFullImage(imageIcon);
137 |                         }
138 |                     });
139 |                     detailsFrame.add(imageLabel);
140 |                 }
141 |                 JLabel Name = new JLabel("Name:  " + name);
142 |                 Name.setBounds(240, 20, 200, 30);
143 |                 Name.setForeground(Color.white);
144 |                 detailsFrame.add(Name);
145 | 
146 |                 JLabel Username = new JLabel("Username:  " + username2);
147 |                 Username.setBounds(240, 40, 200, 30);
148 |                 Username.setForeground(Color.white);
149 |                 detailsFrame.add(Username);
150 | 
151 |                 JLabel Email = new JLabel("Email:  " + email);
152 |                 Email.setBounds(240, 60, 200, 30);
153 |                 Email.setForeground(Color.white);
154 |                 detailsFrame.add(Email);
155 | 
156 |                 JLabel Father = new JLabel("Father:  " + father);
157 |                 Father.setBounds(240, 80, 200, 30);
158 |                 Father.setForeground(Color.white);
159 |                 detailsFrame.add(Father);
160 | 
161 |                 JLabel Contact = new JLabel("Contact:  " + contact);
162 |                 Contact.setBounds(240, 100, 200, 30);
163 |                 Contact.setForeground(Color.white);
164 |                 detailsFrame.add(Contact);
165 | 
166 |                 JLabel Qualification = new JLabel("Qualification:  " + qualification);
167 |                 Qualification.setBounds(240, 120, 200, 30);
168 |                 Qualification.setForeground(Color.white);
169 |                 detailsFrame.add(Qualification);
170 | 
171 |                 JLabel Address = new JLabel("Address:  " + address);
172 |                 Address.setBounds(240, 140, 200, 30);
173 |                 Address.setForeground(Color.white);
174 |                 detailsFrame.add(Address);
175 | 
176 |                 JLabel Gender = new JLabel("Gender:  " + gender);
177 |                 Gender.setBounds(240, 160, 200, 30);
178 |                 Gender.setForeground(Color.white);
179 |                 detailsFrame.add(Gender);
180 | 
181 |                 JLabel Teaching = new JLabel("Teaching Experience:  " + teachingExperience);
182 |                 Teaching.setBounds(240, 180, 200, 30);
183 |                 Teaching.setForeground(Color.white);
184 |                 detailsFrame.add(Teaching);
185 | 
186 |                 JLabel Age = new JLabel("Age:  " + age);
187 |                 Age.setBounds(240, 200, 200, 30);
188 |                 Age.setForeground(Color.white);
189 |                 detailsFrame.add(Age);
190 | 
191 |                 JLabel DOB = new JLabel("DOB:  " + dob);
192 |                 DOB.setBounds(240, 220, 200, 30);
193 |                 DOB.setForeground(Color.white);
194 |                 detailsFrame.add(DOB);
195 | 
196 |                 ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\newwwwww.jpg");
197 |                 JLabel lpic = new JLabel(img);
198 |                 lpic.setBounds(0, 0, 480, 330);
199 |                 detailsFrame.add(lpic);
200 | 
201 |                 detailsFrame.setVisible(true);
202 |             }
203 |         } catch (SQLException e) {
204 |             e.printStackTrace();
205 |             JOptionPane.showMessageDialog(this, "Error fetching details: " + e.getMessage());
206 |         }
207 |     }
208 | 
209 |     private void showFullImage(ImageIcon imageIcon) {
210 |         JDialog fullImageFrame = new JDialog(this, "Profile Image", true);
211 |         fullImageFrame.setSize(550, 580);
212 |         fullImageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
213 |         fullImageFrame.setLocationRelativeTo(null);
214 |         fullImageFrame.setResizable(false);
215 |         JLabel lblFullImage = new JLabel();
216 |         lblFullImage.setHorizontalAlignment(JLabel.CENTER);
217 |         Image fullImage = imageIcon.getImage().getScaledInstance(550, 550, Image.SCALE_SMOOTH);
218 |         lblFullImage.setIcon(new ImageIcon(fullImage));
219 |         fullImageFrame.add(lblFullImage);
220 |         fullImageFrame.setVisible(true);
221 |     }
222 | }


--------------------------------------------------------------------------------
/src/School_Management_System/Welcome.java:
--------------------------------------------------------------------------------
  1 | package School_Management_System;
  2 | 
  3 | import java.awt.event.*;
  4 | import java.awt.*;
  5 | import javax.swing.*;
  6 | 
  7 | public class Welcome extends JFrame implements ActionListener {
  8 | 
  9 |     JMenuItem studentlogin, teacherlogin, adminlogin, feedback, about, exit;
 10 | 
 11 |     Welcome() {
 12 |         JLabel lpic, lsms, ldevelop, lkrn;
 13 |         Font f1, f2;
 14 | 
 15 |         //============set frame===========
 16 |         setTitle("Welcome Page");
 17 |         setSize(1530, 810);
 18 |         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 19 |         setLayout(null);
 20 |         setVisible(true);
 21 |         setLocationRelativeTo(null);
 22 |         ImageIcon icon = new ImageIcon("src\\School_Management_System\\Icons\\SMS_Icon.png");
 23 |         setIconImage(icon.getImage());
 24 | 
 25 |         //============set Font===========
 26 |         f1 = new Font("Monotype Corsiva", Font.BOLD, 80);
 27 |         f2 = new Font("Monotype Corsiva", Font.BOLD, 20);
 28 | 
 29 |         //============set Font Label===========
 30 |         lsms = new JLabel("School Management System");
 31 |         lsms.setBounds(50, 25, 1000, 100);
 32 |         add(lsms);
 33 |         lsms.setFont(f1);
 34 | 
 35 |         ldevelop = new JLabel("Developed By");
 36 |         ldevelop.setBounds(30, 670, 140, 50);
 37 |         ldevelop.setForeground(Color.white);
 38 |         add(ldevelop);
 39 |         ldevelop.setFont(f2);
 40 | 
 41 |         lkrn = new JLabel("Karan Kashyap");
 42 |         lkrn.setBounds(30, 700, 370, 40);
 43 |         lkrn.setForeground(Color.white);
 44 |         add(lkrn);
 45 |         lkrn.setFont(f2);
 46 | 
 47 |         //============set Image===================
 48 |         ImageIcon img = new ImageIcon("src\\School_Management_System\\Icons\\welcomeG.jpg");
 49 |         lpic = new JLabel(img);
 50 |         lpic.setBounds(0, 0, 1580, 800);
 51 |         add(lpic);
 52 | 
 53 |         //============set Menubar===========
 54 |         JMenuBar menubar = new JMenuBar();
 55 | 
 56 |         JMenu login = new JMenu("                        Login                          ");
 57 |         login.setFont(new Font("Arial", Font.BOLD, 15));
 58 | 
 59 |         studentlogin = new JMenuItem("Student Login");
 60 |         studentlogin.setFont(new Font("Arial", Font.BOLD, 15));
 61 |         studentlogin.setBackground(Color.pink);
 62 |         login.add(studentlogin);
 63 |         studentlogin.addActionListener(this);
 64 | 
 65 |         teacherlogin = new JMenuItem("Teacher Login");
 66 |         teacherlogin.setFont(new Font("Arial", Font.BOLD, 15));
 67 |         teacherlogin.setBackground(Color.pink);
 68 |         login.add(teacherlogin);
 69 |         teacherlogin.addActionListener(this);
 70 | 
 71 |         adminlogin = new JMenuItem("Admin Login");
 72 |         adminlogin.setFont(new Font("Arial", Font.BOLD, 15));
 73 |         adminlogin.setBackground(Color.pink);
 74 |         login.add(adminlogin);
 75 |         adminlogin.addActionListener(this);
 76 | 
 77 |         menubar.add(login);
 78 | 
 79 |         about = new JMenuItem("                        About");
 80 |         about.setFont(new Font("Arial", Font.BOLD, 15));
 81 |         about.setBackground(Color.yellow);
 82 |         menubar.add(about);
 83 |         about.addActionListener(this);
 84 | 
 85 |         feedback = new JMenuItem("                        Feedback");
 86 |         feedback.setFont(new Font("Arial", Font.BOLD, 15));
 87 |         feedback.setBackground(Color.orange);
 88 |         menubar.add(feedback);
 89 |         feedback.addActionListener(this);
 90 | 
 91 |         exit = new JMenuItem("                          Exit");
 92 |         exit.setFont(new Font("Arial", Font.BOLD, 15));
 93 |         exit.setBackground(Color.black);
 94 |         exit.setForeground(Color.white);
 95 |         menubar.add(exit);
 96 |         exit.addActionListener(this);
 97 | 
 98 |         JMenu l = new JMenu("                                                                                                                                               ");
 99 |         menubar.add(l);
100 |         setJMenuBar(menubar);
101 | 
102 |         Cursor c = new Cursor(Cursor.HAND_CURSOR);
103 |         exit.setCursor(c);
104 |         login.setCursor(c);
105 |         studentlogin.setCursor(c);
106 |         teacherlogin.setCursor(c);
107 |         adminlogin.setCursor(c);
108 |         feedback.setCursor(c);
109 |         about.setCursor(c);
110 |     }
111 | 
112 |     public void actionPerformed(ActionEvent ae) {
113 |         if (ae.getSource() == exit) {
114 |             System.exit(0);
115 |         }
116 |         if (ae.getSource() == studentlogin) {
117 |             this.setEnabled(false);
118 |             new LoginStudent(this).setVisible(true);
119 |         }
120 |         if (ae.getSource() == teacherlogin) {
121 |             this.setEnabled(false);
122 |             new LoginTeacher(this).setVisible(true);
123 |         }
124 |         if (ae.getSource() == adminlogin) {
125 |             this.setEnabled(false);
126 |             new LoginAdmin(this).setVisible(true);
127 |         }
128 |         if (ae.getSource() == feedback) {
129 |             this.setEnabled(false);
130 |             new Feedback(this).setVisible(true);
131 |         }
132 |         if (ae.getSource() == about) {
133 |             this.setEnabled(false);
134 |             new About(this).setVisible(true);
135 |         }
136 |     }
137 | 
138 |     public static void main(String arg[]) {
139 |         new Welcome().setVisible(true);
140 |     }
141 | }
142 | 


--------------------------------------------------------------------------------
