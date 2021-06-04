/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordy
 */
public class programJava_2 extends javax.swing.JFrame {

    /**
     * Creates new form programJava_2
     */
    public List<String> nama = new ArrayList<>();
    public List<String> username = new ArrayList<>();
    public List<String> password = new ArrayList<>();
    
    private void updateDataTersimpan() {
        jLabelDataTersimpan.setText("Data Tersimpan = "+nama.size());
    }
    
    public programJava_2() {
        initComponents();
    }
    
    public programJava_2(List<String> nama, List<String> username, List<String> password) {
        initComponents();
        this.nama = nama;
        this.username = username;
        this.password = password;
        updateDataTersimpan();
    }

    private void printInfo() {
        System.out.print("nama : ");
        for(String text : nama) {
            System.out.print(text+" ");
        }
        System.out.println("");
        System.out.print("username : ");
        for(String text : username) {
            System.out.print(text+" ");
        }
        System.out.println("");
        System.out.print("password : ");
        for(String text : password) {
            System.out.print(text+" ");
        }
        System.out.println("");
        System.out.println("");
    }
    
    private boolean isUsername(List<String> us, String text){
       boolean found = false;
       for  (String object : us) {
           if(object.equals(text)) {
               found = true;
           }
       }
       return found;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelNama = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonKeMenuLogin = new javax.swing.JButton();
        jLabelDataTersimpan = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CV Terbaik - Sign Up");
        setLocation(new java.awt.Point(450, 200));
        setResizable(false);

        jLabelNama.setText("Nama Lengkap :");

        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });

        jLabelPassword.setText("Password :");

        jLabelUsername.setText("username :");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonKeMenuLogin.setText("ke Menu Login..");
        jButtonKeMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeMenuLoginActionPerformed(evt);
            }
        });

        jLabelDataTersimpan.setText("Data Tersimpan = 0");

        jButtonReset.setText("Reset data");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel1.setText("Selamat datang di aplikasi pembuat CV ini. SIlahkan mendaftar..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDataTersimpan)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelUsername)
                                .addComponent(jLabelPassword)
                                .addComponent(jLabelNama))
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldUsername)
                                .addComponent(jTextFieldNama)
                                .addComponent(jTextFieldPassword)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jButtonSave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonReset)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonKeMenuLogin))))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDataTersimpan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNama)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonKeMenuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReset))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        String n = jTextFieldNama.getText();
        String u = jTextFieldUsername.getText();
        String p = jTextFieldPassword.getText();
        
        if(n.length() != 0 && u.length() != 0 && p.length() != 0) {
            if(username.isEmpty()) {
               nama.add(n);
                username.add(u);
                password.add(p);
                jTextFieldNama.setText("");
                jTextFieldUsername.setText("");
                jTextFieldPassword.setText("");
                updateDataTersimpan(); 
            } else {
                if(!isUsername(username,u)) {
                    nama.add(n);
                    username.add(u);
                    password.add(p);
                    jTextFieldNama.setText("");
                    jTextFieldUsername.setText("");
                    jTextFieldPassword.setText("");
                    updateDataTersimpan();
                } else {
                    JOptionPane.showMessageDialog(this, "Username telah dipakai!", "Warning", HEIGHT);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lengkapi data terlebih dahulu!", "Warning", HEIGHT);
        }
        printInfo();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        nama.clear();
        username.clear();
        password.clear();
        jTextFieldNama.setText("");
        jTextFieldUsername.setText("");
        jTextFieldPassword.setText("");
        updateDataTersimpan();
        printInfo();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonKeMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeMenuLoginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new programJava(nama,username,password).setVisible(true);
    }//GEN-LAST:event_jButtonKeMenuLoginActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(programJava_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programJava_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programJava_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programJava_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programJava_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonKeMenuLogin;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataTersimpan;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JPasswordField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}