/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostgreSQL;

import Oracle.*;
import Connections.OracleConnection;
import Connections.PostgreSQLConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Kevin MM
 */
public class PostgreSQLPantallaInicial extends javax.swing.JFrame {

    public static String aliasUsuario = "imattschas2r";
    
    public static String incrementominimo = "5000";
    public static String porcentajemejora = "0.05";
    
    // Set:
    // PantallaInicial.incrementominimo = "X";
    
    public PostgreSQLPantallaInicial() {
        initComponents();
        EntryPassword.setEchoChar('•');
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        LabelTitulo = new javax.swing.JLabel();
        EntryAlias = new javax.swing.JTextField();
        EntryPassword = new javax.swing.JPasswordField();
        BotonLogin = new javax.swing.JButton();
        LabelAlias = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        LabelTitulo.setText("Casa de Subastas el Potro Salvaje");

        EntryAlias.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        EntryAlias.setToolTipText("");
        EntryAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryAliasActionPerformed(evt);
            }
        });

        EntryPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        EntryPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryPasswordActionPerformed(evt);
            }
        });

        BotonLogin.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonLogin.setText("Login");
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        LabelAlias.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelAlias.setText("Alias:");

        LabelPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelPassword.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(LabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelPassword)
                                    .addComponent(LabelAlias))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntryAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EntryPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LabelTitulo)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAlias))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(EntryPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntryAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryAliasActionPerformed

    private void EntryPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryPasswordActionPerformed

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        String USR = EntryAlias.getText(); // User alias.
        String PSS = String.valueOf(EntryPassword.getPassword()); // User password.
        
        // Creating connection.
        PostgreSQLConnection con_ = new PostgreSQLConnection();

        String columnName = "ft_login"; // Name of the returned column.

        rowsList.add(con_.FunctionReturningInt("SELECT public.FT_LOGIN("
                + "ALIASv:='" + USR + "'::TEXT, PASSWORDv:='" + PSS + "'::TEXT)", columnName).get(0).toString()); ;
        
        columnName = "ft_check_admin"; // Name of the returned column.
        rowsList.add(con_.FunctionReturningInt("SELECT public.FT_CHECK_ADMIN("
                + "ALIASv:='" + USR + "'::TEXT)", columnName).get(0).toString());
        
        if (rowsList.get(0).equals("1")) { // Correct alias and password.
            PostgreSQLPantallaInicial.aliasUsuario = USR; // Sets the user alias to be used on other screens.
            
            if (rowsList.get(1).equals("1")) { // Administrador.
                PostgreSQLPantallaAdmin frame = new PostgreSQLPantallaAdmin();
                frame.setVisible(true);
                this.setVisible(false);
            } else if (rowsList.get(1).equals("0")) { // Participante.
                PostgreSQLPantallaParticipante frame = new PostgreSQLPantallaParticipante();
                frame.setVisible(true);
                this.setVisible(false);
            }  
            
        } else if (rowsList.get(0).equals("0")) {
            showMessageDialog(null, "Datos incorrectos.");
        } else {
            showMessageDialog(null, "Unknown error.");
        }
    }//GEN-LAST:event_BotonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(PostgreSQLPantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLPantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLPantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLPantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgreSQLPantallaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLogin;
    private javax.swing.JTextField EntryAlias;
    private javax.swing.JPasswordField EntryPassword;
    private javax.swing.JLabel LabelAlias;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}