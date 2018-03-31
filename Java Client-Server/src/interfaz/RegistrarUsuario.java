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
public class RegistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarUsuario() {
        initComponents();
        EntryRegistrarPassword.setEchoChar('•');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EntryRegistrarAlias = new javax.swing.JTextField();
        EntryRegistrarNombre = new javax.swing.JTextField();
        EntryRegistrarApellidos = new javax.swing.JTextField();
        EntryRegistrarDireccion = new javax.swing.JTextField();
        EntryRegistrarCedula = new javax.swing.JTextField();
        EntryRegistrarTelefonoPrincipal = new javax.swing.JTextField();
        EntryRegistrarCorreo = new javax.swing.JTextField();
        SpinnerRegistrarCalificacion = new javax.swing.JSpinner();
        LabelRegistrarCalificacion = new javax.swing.JLabel();
        EntryRegistrarPassword = new javax.swing.JPasswordField();
        LabelRegistrarAlias = new javax.swing.JLabel();
        LabelRegistrarNombre = new javax.swing.JLabel();
        LabelRegistrarApellidos = new javax.swing.JLabel();
        LabelRegistrarDireccion = new javax.swing.JLabel();
        LabelRegistrarCedula = new javax.swing.JLabel();
        LabelRegistrarTelefono = new javax.swing.JLabel();
        LabelRegistrarCorreo = new javax.swing.JLabel();
        LabelRegistrarPassword = new javax.swing.JLabel();
        LabelRegistrarTipoUsuario = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelarRegistro = new javax.swing.JButton();
        BotonAgregarTelefono = new javax.swing.JButton();
        BotonRegistrarLogOut = new javax.swing.JButton();
        ComboBoxRegistrarTipoUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("Registrar Usuario");

        EntryRegistrarAlias.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        EntryRegistrarAlias.setToolTipText("");
        EntryRegistrarAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryRegistrarAliasActionPerformed(evt);
            }
        });

        EntryRegistrarNombre.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        EntryRegistrarApellidos.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        EntryRegistrarDireccion.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        EntryRegistrarCedula.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        EntryRegistrarTelefonoPrincipal.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        EntryRegistrarCorreo.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        SpinnerRegistrarCalificacion.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        SpinnerRegistrarCalificacion.setModel(new javax.swing.SpinnerNumberModel(5, 1, 5, 1));
        SpinnerRegistrarCalificacion.setOpaque(false);

        LabelRegistrarCalificacion.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarCalificacion.setText("Calificación:");

        EntryRegistrarPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        LabelRegistrarAlias.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarAlias.setText("Alias:");

        LabelRegistrarNombre.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarNombre.setText("Nombre:");

        LabelRegistrarApellidos.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarApellidos.setText("Apellidos:");

        LabelRegistrarDireccion.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarDireccion.setText("Direccion:");

        LabelRegistrarCedula.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarCedula.setText("Cedula:");

        LabelRegistrarTelefono.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarTelefono.setText("Telefono Principal:");

        LabelRegistrarCorreo.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarCorreo.setText("Correo:");

        LabelRegistrarPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarPassword.setText("Password:");

        LabelRegistrarTipoUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelRegistrarTipoUsuario.setText("Tipo de Usuario:");

        BotonRegistrar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonCancelarRegistro.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonCancelarRegistro.setText("Cancelar");

        BotonAgregarTelefono.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonAgregarTelefono.setText("Agregar Teléfono");

        BotonRegistrarLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonRegistrarLogOut.setText("Log Out");

        ComboBoxRegistrarTipoUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        ComboBoxRegistrarTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Participante" }));
        ComboBoxRegistrarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRegistrarTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(BotonRegistrarLogOut)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegistrarCedula)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonCancelarRegistro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelRegistrarTelefono)
                                    .addComponent(LabelRegistrarDireccion)
                                    .addComponent(LabelRegistrarApellidos)
                                    .addComponent(LabelRegistrarNombre)
                                    .addComponent(LabelRegistrarAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelRegistrarCalificacion)
                                    .addComponent(LabelRegistrarCorreo)
                                    .addComponent(LabelRegistrarPassword)
                                    .addComponent(LabelRegistrarTipoUsuario))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EntryRegistrarAlias, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                    .addComponent(EntryRegistrarNombre)
                                    .addComponent(EntryRegistrarApellidos)
                                    .addComponent(EntryRegistrarDireccion)
                                    .addComponent(EntryRegistrarCedula)
                                    .addComponent(EntryRegistrarTelefonoPrincipal)
                                    .addComponent(EntryRegistrarCorreo)
                                    .addComponent(EntryRegistrarPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SpinnerRegistrarCalificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxRegistrarTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonAgregarTelefono)))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BotonRegistrarLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryRegistrarAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarAlias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryRegistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryRegistrarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryRegistrarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryRegistrarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryRegistrarTelefonoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarTelefono)
                    .addComponent(BotonAgregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryRegistrarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerRegistrarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegistrarCalificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegistrarPassword)
                    .addComponent(EntryRegistrarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegistrarTipoUsuario)
                    .addComponent(ComboBoxRegistrarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntryRegistrarAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryRegistrarAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryRegistrarAliasActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        String ALIASv = EntryRegistrarAlias.getText();
        String NOMBREv = EntryRegistrarNombre.getText();
        String APELLIDOSv = EntryRegistrarApellidos.getText();
        String DIRECCIONv = EntryRegistrarDireccion.getText();
        String CEDULAv = EntryRegistrarCedula.getText();
        String CORREOv = EntryRegistrarCorreo.getText();
        Integer CALIFICACIONv = (Integer)SpinnerRegistrarCalificacion.getValue();
        String PASSWORDv = String.valueOf(EntryRegistrarPassword.getPassword());
        String NUMEROv = EntryRegistrarTelefonoPrincipal.getText();
        String TIPOUSUARIOv = ComboBoxRegistrarTipoUsuario.getSelectedItem().toString();
        
        Conexion con_ = new Conexion();
        Connection con = con_.CrearConexion();
        String query = "SP_CREAR_USUARIO(ALIASv=>'" + ALIASv + "',NOMBREv=>'" + NOMBREv + "',APELLIDOSv=>'" + APELLIDOSv + "',DIRECCIONv=>'" + DIRECCIONv + "',CEDULAv=>" + CEDULAv + ",CORREOv=>'" + CORREOv + "',CALIFICACIONv=>" + CALIFICACIONv + ",PASSWORDv=>'" + PASSWORDv + "',NUMEROv=>'" + NUMEROv + "',TIPOUSUARIOv=>'" + TIPOUSUARIOv + "')";
        rowsList = con_.EjecutarSP(query, con);
        
        if (rowsList.get(0).equals("1")) {
            showMessageDialog(null, "Usuario creado.");
        } else if (rowsList.get(0).equals("0")) {
            showMessageDialog(null, "Error: otro usuario registrado tiene el alias o la cédula ingresada.");
        }
        
        // Close connection.
        try {
            con_.CerrarConexion(con);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void ComboBoxRegistrarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxRegistrarTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxRegistrarTipoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarTelefono;
    private javax.swing.JButton BotonCancelarRegistro;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonRegistrarLogOut;
    private javax.swing.JComboBox<String> ComboBoxRegistrarTipoUsuario;
    private javax.swing.JTextField EntryRegistrarAlias;
    private javax.swing.JTextField EntryRegistrarApellidos;
    private javax.swing.JTextField EntryRegistrarCedula;
    private javax.swing.JTextField EntryRegistrarCorreo;
    private javax.swing.JTextField EntryRegistrarDireccion;
    private javax.swing.JTextField EntryRegistrarNombre;
    private javax.swing.JPasswordField EntryRegistrarPassword;
    private javax.swing.JTextField EntryRegistrarTelefonoPrincipal;
    private javax.swing.JLabel LabelRegistrarAlias;
    private javax.swing.JLabel LabelRegistrarApellidos;
    private javax.swing.JLabel LabelRegistrarCalificacion;
    private javax.swing.JLabel LabelRegistrarCedula;
    private javax.swing.JLabel LabelRegistrarCorreo;
    private javax.swing.JLabel LabelRegistrarDireccion;
    private javax.swing.JLabel LabelRegistrarNombre;
    private javax.swing.JLabel LabelRegistrarPassword;
    private javax.swing.JLabel LabelRegistrarTelefono;
    private javax.swing.JLabel LabelRegistrarTipoUsuario;
    private javax.swing.JSpinner SpinnerRegistrarCalificacion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
