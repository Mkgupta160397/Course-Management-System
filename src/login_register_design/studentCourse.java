
package login_register_design;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import login_register_design.DBConnection;


public class studentCourse extends javax.swing.JFrame {

    
    public studentCourse() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mName = new javax.swing.JTextField();
        mAge = new javax.swing.JTextField();
        mAddress = new javax.swing.JTextField();
        mEmail = new javax.swing.JTextField();
        mInstitute = new javax.swing.JTextField();
        mStudent = new javax.swing.JTextField();
        mDate = new javax.swing.JTextField();
        mFather = new javax.swing.JTextField();
        mPhone = new javax.swing.JTextField();
        mEducation = new javax.swing.JTextField();
        mAadhar = new javax.swing.JTextField();
        mSubmit = new javax.swing.JButton();
        mCancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        mCourse = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        m = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 100, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Student Course Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 430, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Email id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 100, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 80, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 80, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Education Qualiication ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 170, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Phone ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 130, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("date of birth");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 120, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Father Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 130, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Student id");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 110, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Institute Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 140, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Aadhar no");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 120, 30));

        mName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mName.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 260, 40));

        mAge.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(mAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 260, 40));

        mAddress.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mAddress.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 260, 40));

        mEmail.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mEmail.setCaretColor(new java.awt.Color(0, 51, 204));
        mEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mEmailKeyReleased(evt);
            }
        });
        getContentPane().add(mEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 260, 40));

        mInstitute.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mInstitute.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mInstitute, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 260, 40));

        mStudent.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mStudent.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 260, 40));

        mDate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mDate.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 290, 40));

        mFather.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mFather.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 290, 40));

        mPhone.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mPhone.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 290, 40));

        mEducation.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mEducation.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mEducation, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 290, 40));

        mAadhar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mAadhar.setCaretColor(new java.awt.Color(0, 51, 204));
        getContentPane().add(mAadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 290, 40));

        mSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mSubmit.setText("Submit");
        mSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(mSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 170, 40));

        mCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mCancel.setText("Cancel");
        mCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCancelActionPerformed(evt);
            }
        });
        getContentPane().add(mCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 170, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Course Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 140, 30));

        mCourse.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(mCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 290, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_employee.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 300));
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 406, 230, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSubmitActionPerformed
        // TODO add your handling code here:
        
        String Name=mName.getText();
        String Fname=mFather.getText();
        String Age=mAge.getText();
        String Ddate=mDate.getText();
        String Address=mAddress.getText();
        String Phone=mPhone.getText();
        String Email=mEmail.getText();
        String Education=mEducation.getText();
        String Institute =mInstitute.getText();
        String Aadhar=mAadhar.getText();
        String Studentid =mStudent.getText();;
        String Course=mCourse.getText();
        
        
        
        if( Name.isEmpty() || Fname.isEmpty() ||Age.isEmpty() || Ddate.isEmpty() ||Address.isEmpty()|| Phone.isEmpty()|| Email.isEmpty()  || Education.isEmpty()||Institute.isEmpty()|| Aadhar.isEmpty()|| Studentid.isEmpty()|| Course.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Fill Up form Properly.","Error" ,JOptionPane.ERROR_MESSAGE);
           
        }else
        {
            studentRegister(Name,Fname,Age, Ddate, Address, Phone, Email, Education, Institute, Aadhar, Studentid, Course);
            
            
            
            JOptionPane.showMessageDialog(this, "Registration is completed ! please again register ...","Sccessfl" ,JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_mSubmitActionPerformed

    private void mCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCancelActionPerformed
        // TODO add your handling code here:
        
       
       
        
    }//GEN-LAST:event_mCancelActionPerformed

    private void mEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mEmailKeyReleased
       
       
    
 
     
    
    }//GEN-LAST:event_mEmailKeyReleased

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new studentCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel m;
    private javax.swing.JTextField mAadhar;
    private javax.swing.JTextField mAddress;
    private javax.swing.JTextField mAge;
    private javax.swing.JButton mCancel;
    private javax.swing.JTextField mCourse;
    private javax.swing.JTextField mDate;
    private javax.swing.JTextField mEducation;
    private javax.swing.JTextField mEmail;
    private javax.swing.JTextField mFather;
    private javax.swing.JTextField mInstitute;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField mPhone;
    private javax.swing.JTextField mStudent;
    private javax.swing.JButton mSubmit;
    // End of variables declaration//GEN-END:variables

private void studentRegister(String Name,String Fname,String Age,String  Ddate,String Address,String  Phone, String Email,String Education,String Institute,String Aadhar,String Studentid,String Course) {
        Connection dbconn= DBConnection.connectDB();
        if(dbconn!=null){
            
       
            
        try {
            PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO student(name,fathername,age, date, address, phone, email, education,institute, aadhar,studentid, course)  VALUES(?, ?, ? , ? ,?, ?, ?, ?, ?,?, ?, ?)");
            
    
     
            
            st.setString(1, Name);
            st.setString(2,  Fname);
            st.setString(3,  Age); 
            st.setString(4, Ddate);
            st.setString(5, Address);
            st.setString(6, Phone);
            st.setString(7, Email);
            st.setString(8, Education);
            st.setString(9, Institute);
            st.setString(10, Aadhar);
            st.setString(11, Studentid);
            st.setString(12, Course);
            
           
            int res= st.executeUpdate();
            
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "REGISTRATION SUCCESSFUL!.","Successful" ,JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(studentCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else
    {
        System.out.println("Connection is not available");
    }
    }
    
}
