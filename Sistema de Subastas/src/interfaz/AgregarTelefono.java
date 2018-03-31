/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import datos.Conexion;
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
public class AgregarTelefono extends javax.swing.JFrame {

    /**
     * Creates new form AgregarTelefono
     */
    public AgregarTelefono() {
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

        LabelAgregarTelefono = new javax.swing.JLabel();
        EntryAgregarNumTel = new javax.swing.JTextField();
        BotonAgregarLogOut = new javax.swing.JButton();
        EntryAgregarDescripcion = new javax.swing.JTextField();
        BotonAgregarAgregar = new javax.swing.JButton();
        BotonAgregarFinalizar = new javax.swing.JButton();
        LabelAgregarNumTelefono = new javax.swing.JLabel();
        LabelAgregarDescripcion = new javax.swing.JLabel();
        EntryAliasUsuario = new javax.swing.JTextField();
        LabelAgregarNumTelefono1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        LabelAgregarTelefono.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelAgregarTelefono.setText("Agregar Nuevo Telefono");

        EntryAgregarNumTel.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        BotonAgregarLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonAgregarLogOut.setText("Log Out");
        BotonAgregarLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarLogOutActionPerformed(evt);
            }
        });

        EntryAgregarDescripcion.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        BotonAgregarAgregar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonAgregarAgregar.setText("Agregar");
        BotonAgregarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarAgregarActionPerformed(evt);
            }
        });

        BotonAgregarFinalizar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonAgregarFinalizar.setText("Finalizar");
        BotonAgregarFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarFinalizarActionPerformed(evt);
            }
        });

        LabelAgregarNumTelefono.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelAgregarNumTelefono.setText("Alias usuario:");

        LabelAgregarDescripcion.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelAgregarDescripcion.setText("Descripción: ");

        EntryAliasUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        EntryAliasUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryAliasUsuarioActionPerformed(evt);
            }
        });

        LabelAgregarNumTelefono1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelAgregarNumTelefono1.setText("Número de Teléfono: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LabelAgregarNumTelefono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAgregarNumTelefono)
                                .addGap(18, 18, 18)
                                .addComponent(EntryAliasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EntryAgregarNumTel, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelAgregarDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EntryAgregarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonAgregarAgregar)
                                .addGap(65, 65, 65)
                                .addComponent(BotonAgregarFinalizar)
                                .addGap(219, 219, 219))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelAgregarTelefono)
                                .addGap(81, 81, 81)
                                .addComponent(BotonAgregarLogOut)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAgregarTelefono)
                    .addComponent(BotonAgregarLogOut))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryAliasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAgregarNumTelefono))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAgregarDescripcion)
                    .addComponent(EntryAgregarNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntryAgregarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAgregarNumTelefono1))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregarAgregar)
                    .addComponent(BotonAgregarFinalizar))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntryAliasUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryAliasUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryAliasUsuarioActionPerformed

    private void BotonAgregarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarAgregarActionPerformed
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        String ALIASv = EntryAliasUsuario.getText();
        String NUMEROv = EntryAgregarNumTel.getText();
        String DESCRIPCIONv = EntryAgregarDescripcion.getText();
        
        Conexion con_ = new Conexion();
        Connection con = con_.CrearConexion();
        String query = "SP_AGREGAR_TEL(ALIASv=>'" + ALIASv + "',NUMEROv=>'" + NUMEROv + "',DESCRIPCIONv=>'" + DESCRIPCIONv + "')";
        rowsList = con_.EjecutarSP(query, con);
        
        if (rowsList.get(0).equals("1")) {
            showMessageDialog(null, "Teléfono agregado.");
        } else if (rowsList.get(0).equals("0")) {
            showMessageDialog(null, "Error: el alias no existe.");
        }
        
        // Close connection.
        try {
            con_.CerrarConexion(con);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PantallaAdmin frame = new PantallaAdmin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAgregarAgregarActionPerformed

    private void BotonAgregarFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarFinalizarActionPerformed
        PantallaAdmin frame = new PantallaAdmin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAgregarFinalizarActionPerformed

    private void BotonAgregarLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarLogOutActionPerformed
        PantallaInicial frame = new PantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAgregarLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTelefono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarAgregar;
    private javax.swing.JButton BotonAgregarFinalizar;
    private javax.swing.JButton BotonAgregarLogOut;
    private javax.swing.JTextField EntryAgregarDescripcion;
    private javax.swing.JTextField EntryAgregarNumTel;
    private javax.swing.JTextField EntryAliasUsuario;
    private javax.swing.JLabel LabelAgregarDescripcion;
    private javax.swing.JLabel LabelAgregarNumTelefono;
    private javax.swing.JLabel LabelAgregarNumTelefono1;
    private javax.swing.JLabel LabelAgregarTelefono;
    // End of variables declaration//GEN-END:variables
}
