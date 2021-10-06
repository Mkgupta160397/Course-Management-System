
package login_register_design;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class adminHome extends javax.swing.JFrame {
    
    public static int open =0;

    
    public adminHome() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/index background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -118, 1370, 770));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigator Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36), new java.awt.Color(0, 0, 153))); // NOI18N

        jMenu1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/add new question.png"))); // NOI18N
        jMenu1.setText("Add New Question");
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/Update Question.png"))); // NOI18N
        jMenu3.setText("Update Question   ");
        jMenu3.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/all questions.png"))); // NOI18N
        jMenu4.setText("All Question        ");
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/delete Question.png"))); // NOI18N
        jMenu5.setText("Delete Question    ");
        jMenu5.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/all student result.png"))); // NOI18N
        jMenu6.setText("All Question Result    ");
        jMenu6.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/Logout.png"))); // NOI18N
        jMenu7.setText("Logout      ");
        jMenu7.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/Close.png"))); // NOI18N
        jMenu8.setText("Exit        ");
        jMenu8.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf, "Do ou really want to Logout","Select", JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new LoginInstructor().setVisible(true);
        }
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf, "Do ou really want to Exit Application","Select", JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if(open==0)
        {
            new addNewQuestion().setVisible(true);
            open=1;
        }
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already open ");
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        
         if(open == 0)
        {
            new UpdateQuestion().setVisible(true);
            
            open = 1;
        }
        
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        
        if(open == 0)
        {
            new AllQuestion().setVisible(true);
            
            open = 1;
        }
        
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
         if(open == 0)
        {
            new DeleteQuestion().setVisible(true);
            
            open = 1;
        }
        
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        
         if(open == 0)
        {
            new allStudentResult().setVisible(true);
            
            open = 1;
        }
        
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");
        }
    }//GEN-LAST:event_jMenu6MouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
