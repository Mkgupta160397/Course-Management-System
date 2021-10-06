package login_register_design;

//import HelpingClasses.BCrypt;
//import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plab = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tFirstName = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        btRegister = new javax.swing.JButton();
        tfMiddlename = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        tfLastname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ulab = new javax.swing.JLabel();
        nlab = new javax.swing.JLabel();
        phonelab = new javax.swing.JLabel();
        mlab = new javax.swing.JLabel();
        alab = new javax.swing.JLabel();
        jLastName = new javax.swing.JTextField();
        tfGender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfcPassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        tfLocation = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        abc = new javax.swing.JCheckBox();
        abc1 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();

        plab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        plab.setForeground(new java.awt.Color(255, 0, 0));
        plab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plabKeyReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tFirstName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tFirstName.setForeground(new java.awt.Color(153, 153, 153));
        tFirstName.setText("First");
        tFirstName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFirstNameFocusLost(evt);
            }
        });
        tFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFirstNameActionPerformed(evt);
            }
        });
        tFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tFirstNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFirstNameKeyReleased(evt);
            }
        });
        jPanel4.add(tFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 182, 40));

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(102, 102, 102));
        tfPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPasswordFocusLost(evt);
            }
        });
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        tfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPasswordKeyReleased(evt);
            }
        });
        jPanel4.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 380, 40));

        btRegister.setBackground(new java.awt.Color(255, 255, 255));
        btRegister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btRegister.setForeground(new java.awt.Color(0, 0, 51));
        btRegister.setText("Register");
        btRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });
        jPanel4.add(btRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 268, 43));

        tfMiddlename.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfMiddlename.setForeground(new java.awt.Color(153, 153, 153));
        tfMiddlename.setText("Enter Phone no");
        tfMiddlename.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfMiddlename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfMiddlenameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfMiddlenameFocusLost(evt);
            }
        });
        tfMiddlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMiddlenameActionPerformed(evt);
            }
        });
        tfMiddlename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMiddlenameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMiddlenameKeyReleased(evt);
            }
        });
        jPanel4.add(tfMiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 374, 40));

        tfAddress.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfAddress.setForeground(new java.awt.Color(153, 153, 153));
        tfAddress.setText("Enter Your Address");
        tfAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAddressFocusLost(evt);
            }
        });
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });
        jPanel4.add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 374, 40));

        tfUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(153, 153, 153));
        tfUsername.setText("Enter Username");
        tfUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUsernameFocusGained(evt);
            }
        });
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUsernameKeyReleased(evt);
            }
        });
        jPanel4.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 378, 40));

        tfLastname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfLastname.setForeground(new java.awt.Color(153, 153, 153));
        tfLastname.setText("Enter Email Address");
        tfLastname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLastnameFocusLost(evt);
            }
        });
        tfLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastnameActionPerformed(evt);
            }
        });
        tfLastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfLastnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfLastnameKeyReleased(evt);
            }
        });
        jPanel4.add(tfLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 374, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("     Email         :");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 46));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("    Address     :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 153, 46));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("    Name        :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 47));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("    Phone No  :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 145, 46));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("     Username  :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 157, 43));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("     Password   :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 161, 43));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 125, 43));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel3.setText("REGISTER A NEW STUDENT");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 550, 57));

        tfCombo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tfCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "BE/Btech", "MCA", "M.Tech", "Ba", "BSc" }));
        tfCombo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfComboActionPerformed(evt);
            }
        });
        jPanel4.add(tfCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 381, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("     Course       :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 154, 43));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Reset");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 95, 47));

        ulab.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        ulab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(ulab, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 170, 50));

        nlab.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        nlab.setForeground(new java.awt.Color(255, 0, 51));
        jPanel4.add(nlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 270, 40));

        phonelab.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        phonelab.setForeground(new java.awt.Color(255, 0, 51));
        jPanel4.add(phonelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 330, 40));

        mlab.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        mlab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(mlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 240, 50));

        alab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        alab.setForeground(new java.awt.Color(255, 0, 0));
        alab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                alabKeyReleased(evt);
            }
        });
        jPanel4.add(alab, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 240, 70));

        jLastName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLastName.setForeground(new java.awt.Color(153, 153, 153));
        jLastName.setText("Last");
        jLastName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        jLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLastNameFocusLost(evt);
            }
        });
        jLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLastNameActionPerformed(evt);
            }
        });
        jLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLastNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLastNameKeyReleased(evt);
            }
        });
        jPanel4.add(jLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 186, 40));

        tfGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tfGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Male", "Female", "Others" }));
        tfGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfGenderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfGenderFocusLost(evt);
            }
        });
        tfGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGenderActionPerformed(evt);
            }
        });
        jPanel4.add(tfGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 160, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Gender  :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Re Password  :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 161, 45));

        tfcPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfcPassword.setForeground(new java.awt.Color(102, 102, 102));
        tfcPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfcPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfcPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfcPasswordFocusLost(evt);
            }
        });
        tfcPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcPasswordActionPerformed(evt);
            }
        });
        tfcPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfcPasswordKeyReleased(evt);
            }
        });
        jPanel4.add(tfcPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 376, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("    Location    :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 153, 44));

        tfLocation.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tfLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Kerala", "Madhya Pradesh", "Maharashtra", "Punjab", "Uttar  Pradesh", "Uttarkhand", "West Bengal" }));
        tfLocation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, new java.awt.Color(255, 255, 255)));
        tfLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLocationActionPerformed(evt);
            }
        });
        jPanel4.add(tfLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packages/1828503.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 146, 120));

        lblPass.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 51, 51));
        lblPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPassKeyReleased(evt);
            }
        });
        jPanel4.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 259, 70));

        abc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        abc.setText("Show Password");
        abc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abcActionPerformed(evt);
            }
        });
        jPanel4.add(abc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 180, 40));

        abc1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        abc1.setText("Show Password");
        abc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abc1ActionPerformed(evt);
            }
        });
        jPanel4.add(abc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 190, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_register_design/icons/add_employee.jpg"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 810, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfComboActionPerformed
        // TODO add your handling code here:
        String selectedValue = tfCombo.getSelectedItem().toString();
        tfCombo.setToolTipText(selectedValue);
    }//GEN-LAST:event_tfComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastnameActionPerformed

    private void tfMiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMiddlenameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfMiddlenameActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        String fname = tFirstName.getText();
        String mname = tfMiddlename.getText();
        String lname = tfLastname.getText();
        String addresse = tfAddress.getText();

        String location = tfLocation.getSelectedItem().toString();
        String username = tfUsername.getText();
        String password = String.valueOf(tfPassword.getPassword());
        String cpassword = String.valueOf(tfcPassword.getPassword());
        //password=BCrypt.hashpw(password, BCrypt.gensalt(10));
        String cours = tfCombo.getSelectedItem().toString();

        String gender = tfGender.getSelectedItem().toString();

        if (fname.equals("")) {
            JOptionPane.showConfirmDialog(null, "Enter Your Name");
        }
        if (mname.equals("")) {
            JOptionPane.showConfirmDialog(null, "Enter Your Mobile Number ");
        }

        if (lname.equals("")) {
            JOptionPane.showConfirmDialog(null, "Enter Your email ");
        }
        if (addresse.equals("")) {
            JOptionPane.showConfirmDialog(null, "Enter Your address ");
        }
        if (username.equals("")) {
            JOptionPane.showConfirmDialog(null, "Enter Your username ");
        }

        if (fname.isEmpty() || mname.isEmpty() || lname.isEmpty() || addresse.isEmpty() || gender.isEmpty() || location.isEmpty() || username.isEmpty() || cours.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Up form Properly.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            userRegister(fname, mname, lname, addresse, gender, location, username, password, cpassword, cours);

            JOptionPane.showMessageDialog(this, "Registration is completed ! please again register ...", "Sccessfl", JOptionPane.INFORMATION_MESSAGE);

        }

        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btRegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfMiddlenameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMiddlenameKeyReleased
        // TODO add your handling code here:
        //String mname=tfMiddlename.getText();
        //if(mname.matches("^[0-9]$") && mname.length()==15)

        //{
        //  tfMiddlename.setBackground(Color.green);
        //}
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(tfMiddlename.getText());
        if (!match.matches()) {
            phonelab.setText("only 10 digit NumberAllowed !!");

        } else {
            phonelab.setText(null);
        }


    }//GEN-LAST:event_tfMiddlenameKeyReleased

    private void tFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFirstNameKeyReleased
        // TODO add your handling code here:
//        String PATTERN;
//        PATTERN = "^[a-zA-Z]+ {0,30}$";
//        Pattern patt = Pattern.compile(PATTERN);
//        Matcher match=patt.matcher(tFirstName.getText());
//        if(!match.matches()){
//            nlab.setText("Naming is incorrect");
//            
//        }
//        else{
//            nlab.setText(null);
//        }

        //here code...........
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            nlab.setText(null);
        } else {
            nlab.setText("Only Character is Allow !!");
        }


    }//GEN-LAST:event_tFirstNameKeyReleased

    private void tfLastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLastnameKeyReleased
        // TODO add your handling code here
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(tfLastname.getText());
        if (!match.matches()) {
            mlab.setText("Email is incorrect");

        } else {
            mlab.setText(null);
        }

    }//GEN-LAST:event_tfLastnameKeyReleased

    private void tfLastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLastnameKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfLastnameKeyPressed

    private void tfMiddlenameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMiddlenameKeyPressed
        // TODO add your handling code here:

//        String phoneNumber=tfMiddlename.getText();
//        
//       int  length=phoneNumber.length();
//       char c = evt.getKeyChar();
//       
//       if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
//       {
//           if(length<10)
//           {
//               tfMiddlename.setEditable(true);
//           }else
//           {
//               tfMiddlename.setEditable(false);
//           }
//           
//       }else
//       {
//           if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
//               tfMiddlename.setEditable(true);
//           
//           }else
//           {
//               tfMiddlename.setEditable(false);
//           }
//       }

    }//GEN-LAST:event_tfMiddlenameKeyPressed

    private void tFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFirstNameKeyPressed
        // TODO add your handling code here:
//        char c= evt.getKeyChar();
//        
//        if(Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
//        {
//            tFirstName.setEditable(true);
//        }
//        else
//        {
//            tFirstName.setEditable(false);
//        }
    }//GEN-LAST:event_tFirstNameKeyPressed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    @SuppressWarnings("empty-statement")
    private void tfPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPasswordKeyReleased


    }//GEN-LAST:event_tfPasswordKeyReleased

    private void alabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alabKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(tFirstName.getText());
        if (!match.matches()) {
            alab.setText("Address is incorrect");

        } else {
            alab.setText(null);
        }
    }//GEN-LAST:event_alabKeyReleased

    private void plabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plabKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(plab.getText());
        if (!match.matches()) {
            plab.setText("Password is incorrect");

        } else {
            plab.setText(null);
        }
    }//GEN-LAST:event_plabKeyReleased

    private void jLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLastNameActionPerformed

    private void tFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFirstNameFocusGained
        // TODO add your handling code here:
        if (tFirstName.getText().equals("First")) {
            tFirstName.setText("");
            tFirstName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tFirstNameFocusGained

    private void tFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFirstNameFocusLost
        // TODO add your handling code here:
        if (tFirstName.getText().equals("")) {
            tFirstName.setText("First");
            tFirstName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_tFirstNameFocusLost

    private void tfMiddlenameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMiddlenameFocusGained
        // TODO add your handling code here:
        if (tfMiddlename.getText().equals("Enter Phone no")) {
            tfMiddlename.setText("");
            tfMiddlename.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfMiddlenameFocusGained

    private void tfMiddlenameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMiddlenameFocusLost
        // TODO add your handling code here:
        if (tfMiddlename.getText().equals("")) {
            tfMiddlename.setText("Enter Phone no");
            tfMiddlename.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_tfMiddlenameFocusLost

    private void jLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLastNameFocusGained
        // TODO add your handling code here:
        if (jLastName.getText().equals("Last")) {
            jLastName.setText("");
            jLastName.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_jLastNameFocusGained

    private void jLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLastNameFocusLost
        // TODO add your handling code here:
        if (jLastName.getText().equals("")) {
            jLastName.setText("Last");
            jLastName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jLastNameFocusLost

    private void tfLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLastnameFocusGained
        // TODO add your handling code here:
        if (tfLastname.getText().equals("Enter Email Address")) {
            tfLastname.setText("");
            tfLastname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfLastnameFocusGained

    private void tfLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLastnameFocusLost
        // TODO add your handling code here:
        if (tfLastname.getText().equals("")) {
            tfLastname.setText("Enter Email Address");
            tfLastname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_tfLastnameFocusLost

    private void tfAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAddressFocusGained
        // TODO add your handling code here:
        if (tfAddress.getText().equals("Enter Your Address")) {
            tfAddress.setText("");
            tfAddress.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfAddressFocusGained

    private void tfAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAddressFocusLost
        // TODO add your handling code here:
        if (tfAddress.getText().equals("")) {
            tfAddress.setText("Enter Your Address");
            tfAddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_tfAddressFocusLost

    private void tfUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusGained
        // TODO add your handling code here:
        if (tfUsername.getText().equals("Enter Username")) {
            tfUsername.setText("");
            tfUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfUsernameFocusGained

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        // TODO add your handling code here:
        if (tfPassword.getText().equals("Enter Password")) {
            tfPassword.setText("");
            tfPassword.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_tfPasswordFocusGained

    private void tfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusLost
        // TODO add your handling code here:
        if (tfPassword.getText().equals("")) {
            tfPassword.setText("Enter Password");
            tfPassword.setForeground(Color.BLACK);
        }


    }//GEN-LAST:event_tfPasswordFocusLost

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfGenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfGenderFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_tfGenderFocusGained

    private void tfGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGenderActionPerformed

    private void tfGenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfGenderFocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_tfGenderFocusLost

    private void tFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFirstNameActionPerformed

    private void tfcPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcPasswordFocusGained
        // TODO add your handling code here:
        if (tfcPassword.getText().equals("Enter Re-Password")) {
            tfcPassword.setText("");
            tfcPassword.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_tfcPasswordFocusGained

    private void tfcPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcPasswordFocusLost
        // TODO add your handling code here:
        if (tfcPassword.getText().equals("")) {
            tfcPassword.setText("Enter Re-Password");
            tfcPassword.setForeground(Color.BLACK);
        }

        String password = String.valueOf(tfPassword.getPassword());
        String cpassword = String.valueOf(tfcPassword.getPassword());

        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");

        if (!password.equals(cpassword)) {
            JOptionPane.showMessageDialog(null, "Password does not match !");
        } else if (password.length() <= 8) {
            JOptionPane.showMessageDialog(null, "Password lenght must have alleast 8 character !!");
        } else if (!specailCharPatten.matcher(password).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one specail character !!");
        } else if (!UpperCasePatten.matcher(password).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one uppercase character !!");
        } else if (!lowerCasePatten.matcher(password).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one lowercase character !!");
        } else if (!digitCasePatten.matcher(password).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one digit character !!");
        }
    }//GEN-LAST:event_tfcPasswordFocusLost

    private void tfcPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcPasswordKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_tfcPasswordKeyReleased

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfcPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcPasswordActionPerformed

    private void tfLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLocationActionPerformed

    private void jLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLastNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLastNameKeyReleased

    private void jLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLastNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            nlab.setText(null);
        } else {
            nlab.setText("Only Character is allowed !!");
        }

    }//GEN-LAST:event_jLastNameKeyPressed

    private void lblPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPassKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_lblPassKeyReleased

    private void tfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordKeyPressed

    private void tfUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_tfUsernameKeyReleased

    private void abcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abcActionPerformed
        // TODO add your handling code here:
        if (abc.isSelected()) {
            tfPassword.setEchoChar((char) 0);
        } else {
            tfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_abcActionPerformed

    private void abc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abc1ActionPerformed
        // TODO add your handling code here:
        if (abc1.isSelected()) {
            tfcPassword.setEchoChar((char) 0);
        } else {
            tfcPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_abc1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox abc;
    private javax.swing.JCheckBox abc1;
    private javax.swing.JLabel alab;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLastName;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel mlab;
    private javax.swing.JLabel nlab;
    private javax.swing.JLabel phonelab;
    private javax.swing.JLabel plab;
    private javax.swing.JTextField tFirstName;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JComboBox<String> tfCombo;
    private javax.swing.JComboBox<String> tfGender;
    private javax.swing.JTextField tfLastname;
    private javax.swing.JComboBox<String> tfLocation;
    private javax.swing.JTextField tfMiddlename;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JPasswordField tfcPassword;
    private javax.swing.JLabel ulab;
    // End of variables declaration//GEN-END:variables

    private void userRegister(String fname, String mname, String lname, String addresse, String gender, String location, String username, String password, String cpassword, String cours) {
        Connection dbconn = DBConnection.connectDB();
        if (dbconn != null) {

            try {
                PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("INSERT INTO users(name,phone,email,address,gender,location,username,password,cpassword, course)  VALUES(?, ?, ? , ? ,?, ?, ?, ?, ?,?)");

                st.setString(1, fname);
                st.setString(2, mname);
                st.setString(3, lname);
                st.setString(4, addresse);
                st.setString(5, gender);
                st.setString(6, location);
                st.setString(7, username);
                st.setString(8, password);
                st.setString(9, cpassword);
                st.setString(10, cours);

                int res = st.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "REGISTRATION SUCCESSFUL!.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("The connection not available");
        }

    }

}
