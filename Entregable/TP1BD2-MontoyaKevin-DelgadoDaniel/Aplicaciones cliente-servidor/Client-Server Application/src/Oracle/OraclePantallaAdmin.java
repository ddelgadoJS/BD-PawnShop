/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

/**
 *
 * @author Kevin MM
 */
public class OraclePantallaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PantallaAdmin
     */
    public OraclePantallaAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAdministrador = new javax.swing.JLabel();
        BotonRegistrarUsuario = new javax.swing.JButton();
        BotonModificarUsuario = new javax.swing.JButton();
        BotonConsultarUsuario = new javax.swing.JButton();
        BotonListarSubastas = new javax.swing.JButton();
        BotonAdminLogOut = new javax.swing.JButton();
        BotonAgregarTelefono = new javax.swing.JButton();
        BotonActualizarParametros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oracle");

        LabelAdministrador.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelAdministrador.setText("Administrador");

        BotonRegistrarUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonRegistrarUsuario.setText("Registrar Usuario");
        BotonRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarUsuarioActionPerformed(evt);
            }
        });

        BotonModificarUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonModificarUsuario.setText("Modificar Usuario");
        BotonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarUsuarioActionPerformed(evt);
            }
        });

        BotonConsultarUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonConsultarUsuario.setText("Consultar Usuario");
        BotonConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarUsuarioActionPerformed(evt);
            }
        });

        BotonListarSubastas.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonListarSubastas.setText("Listar Subastas");
        BotonListarSubastas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarSubastasActionPerformed(evt);
            }
        });

        BotonAdminLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonAdminLogOut.setText("Log Out");
        BotonAdminLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdminLogOutActionPerformed(evt);
            }
        });

        BotonAgregarTelefono.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonAgregarTelefono.setText("Agregar Teléfono");
        BotonAgregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarTelefonoActionPerformed(evt);
            }
        });

        BotonActualizarParametros.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonActualizarParametros.setText("Actualizar Parametros");
        BotonActualizarParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarParametrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(LabelAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(BotonAdminLogOut)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonConsultarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonListarSubastas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAgregarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonActualizarParametros, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(LabelAdministrador))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonAdminLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(BotonRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BotonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonAgregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BotonListarSubastas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonActualizarParametros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarUsuarioActionPerformed
        OracleModificarUsuario frame = new OracleModificarUsuario();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonModificarUsuarioActionPerformed

    private void BotonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarUsuarioActionPerformed
        OracleRegistrarUsuario frame = new OracleRegistrarUsuario();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegistrarUsuarioActionPerformed

    private void BotonListarSubastasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarSubastasActionPerformed
        OracleConsultarSubastas frame = new OracleConsultarSubastas();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListarSubastasActionPerformed

    private void BotonAdminLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdminLogOutActionPerformed
        OraclePantallaInicial frame = new OraclePantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAdminLogOutActionPerformed

    private void BotonAgregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarTelefonoActionPerformed
        OracleAgregarTelefono frame = new OracleAgregarTelefono();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAgregarTelefonoActionPerformed

    private void BotonConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarUsuarioActionPerformed
        OracleConsultarUsuario frame = new OracleConsultarUsuario();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonConsultarUsuarioActionPerformed

    private void BotonActualizarParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarParametrosActionPerformed
        OracleActualizarParametros frame = new OracleActualizarParametros();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonActualizarParametrosActionPerformed

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
            java.util.logging.Logger.getLogger(OraclePantallaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OraclePantallaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OraclePantallaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OraclePantallaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OraclePantallaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizarParametros;
    private javax.swing.JButton BotonAdminLogOut;
    private javax.swing.JButton BotonAgregarTelefono;
    private javax.swing.JButton BotonConsultarUsuario;
    private javax.swing.JButton BotonListarSubastas;
    private javax.swing.JButton BotonModificarUsuario;
    private javax.swing.JButton BotonRegistrarUsuario;
    private javax.swing.JLabel LabelAdministrador;
    // End of variables declaration//GEN-END:variables
}
