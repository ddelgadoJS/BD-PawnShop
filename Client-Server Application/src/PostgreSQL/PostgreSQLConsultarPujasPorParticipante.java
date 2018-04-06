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
import javax.swing.DefaultListModel;

/**
 *
 * @author Kevin MM
 */
public class PostgreSQLConsultarPujasPorParticipante extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarPujasPorParticipante
     */
    public PostgreSQLConsultarPujasPorParticipante() {
        initComponents();
        
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        PostgreSQLConnection con_ = new PostgreSQLConnection();
        String columnName = "ft_select_users"; // Name of the returned column.

        rowsList = con_.FunctionReturningString("SELECT public.FT_SELECT_USERS()", columnName);
        
        // Adds to the combobox all the users.
        for (String user: rowsList) {
            ComboBoxPGPUAlias.addItem(user);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonListarPGPUVolver = new javax.swing.JButton();
        LabelPujasGanadoras = new javax.swing.JLabel();
        BotonListarPGPULogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListListarPGPU = new javax.swing.JList<>();
        ComboBoxPGPUAlias = new javax.swing.JComboBox<>();
        LabelPGPUAlias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PostgreSQL");

        BotonListarPGPUVolver.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonListarPGPUVolver.setText("Volver");
        BotonListarPGPUVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarPGPUVolverActionPerformed(evt);
            }
        });

        LabelPujasGanadoras.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelPujasGanadoras.setText("Pujas Ganadoras");

        BotonListarPGPULogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonListarPGPULogOut.setText("Log Out");
        BotonListarPGPULogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarPGPULogOutActionPerformed(evt);
            }
        });

        ListListarPGPU.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(ListListarPGPU);

        ComboBoxPGPUAlias.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        ComboBoxPGPUAlias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario" }));
        ComboBoxPGPUAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPGPUAliasActionPerformed(evt);
            }
        });

        LabelPGPUAlias.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelPGPUAlias.setText("Alias:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelPGPUAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(ComboBoxPGPUAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(BotonListarPGPUVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelPujasGanadoras)
                        .addGap(145, 145, 145)
                        .addComponent(BotonListarPGPULogOut)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonListarPGPULogOut)
                    .addComponent(LabelPujasGanadoras))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonListarPGPUVolver)
                    .addComponent(LabelPGPUAlias)
                    .addComponent(ComboBoxPGPUAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarPGPUVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarPGPUVolverActionPerformed
        PostgreSQLConsultarUsuarioParticipante frame = new PostgreSQLConsultarUsuarioParticipante();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListarPGPUVolverActionPerformed

    private void BotonListarPGPULogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarPGPULogOutActionPerformed
        PostgreSQLPantallaInicial frame = new PostgreSQLPantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListarPGPULogOutActionPerformed

    private void ComboBoxPGPUAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPGPUAliasActionPerformed
        DefaultListModel model = new DefaultListModel();

        // Agrega al combobox todas las categorías
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.

        String ALIASCOMPRADOR = ComboBoxPGPUAlias.getSelectedItem().toString();

        PostgreSQLConnection con_ = new PostgreSQLConnection();
        String columnName = "pujasganadoras"; // Name of the returned column.
        rowsList = con_.FunctionReturningString("SELECT public.PUJASGANADORAS (ALIASCOMPRADORv:='" + ALIASCOMPRADOR + "'::TEXT)", columnName);

        model.removeAllElements();

        for (String puja: rowsList) {
            model.addElement(puja);
        }

        ListListarPGPU.removeAll();
        ListListarPGPU.setModel(model);
    }//GEN-LAST:event_ComboBoxPGPUAliasActionPerformed

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
            java.util.logging.Logger.getLogger(PostgreSQLConsultarPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLConsultarPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLConsultarPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLConsultarPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgreSQLConsultarPujasPorParticipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonListarPGPULogOut;
    private javax.swing.JButton BotonListarPGPUVolver;
    private javax.swing.JComboBox<String> ComboBoxPGPUAlias;
    private javax.swing.JLabel LabelPGPUAlias;
    private javax.swing.JLabel LabelPujasGanadoras;
    private javax.swing.JList<String> ListListarPGPU;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
