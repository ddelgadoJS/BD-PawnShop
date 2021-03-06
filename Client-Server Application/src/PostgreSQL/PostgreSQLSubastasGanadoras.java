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
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin MM
 */
public class PostgreSQLSubastasGanadoras extends javax.swing.JFrame {

    /**
     * Creates new form PujasGanadoras
     */
    public PostgreSQLSubastasGanadoras() {
        initComponents();
        
        DefaultListModel model = new DefaultListModel();
        
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        String ALIASv = PostgreSQLPantallaInicial.aliasUsuario;
        
        PostgreSQLConnection con_ = new PostgreSQLConnection();
        String columnName = "ft_get_subastas_ganadoras_usuario"; // Name of the returned column.
        
        // Obtener subastas de usuario.
        String query = "SELECT public.FT_GET_SUBASTAS_GANADORAS_USUARIO(ALIASv:='" + ALIASv + "'::TEXT)";
        rowsList = con_.FunctionReturningString(query, columnName);
        
        for (String subasta: rowsList) {
            String[] parts = subasta.split(",");
            model.addElement(parts[0] + ", Vendedor: " + parts[1] + ", Precio Inicial: " + parts[2] + "\", Precio Final: $" + parts[4] + "\", Fecha final: $" + parts[6] + ", Comentario vendedor: " + parts[7]);
        }
        
        ListSubastasRealizadas.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelSubastasRealizadasComentario = new javax.swing.JLabel();
        EntrySubastasRealizadasComentario = new javax.swing.JTextField();
        LabelSubastasRealizadas = new javax.swing.JLabel();
        BotonSubastasRealizadasLogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListSubastasRealizadas = new javax.swing.JList<>();
        BotonSubastasRealizadasAgregarComentario = new javax.swing.JButton();
        BotonSubastasRealizadasVolver = new javax.swing.JButton();
        LabelSubastasRealizadasCalificacion = new javax.swing.JLabel();
        SpinnerSubastasRealizadasCalificacion = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PostgreSQL");

        LabelSubastasRealizadasComentario.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelSubastasRealizadasComentario.setText("Comentario:");

        EntrySubastasRealizadasComentario.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        LabelSubastasRealizadas.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelSubastasRealizadas.setText("Subastas Ganadas");

        BotonSubastasRealizadasLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonSubastasRealizadasLogOut.setText("Log Out");
        BotonSubastasRealizadasLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubastasRealizadasLogOutActionPerformed(evt);
            }
        });

        ListSubastasRealizadas.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(ListSubastasRealizadas);

        BotonSubastasRealizadasAgregarComentario.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonSubastasRealizadasAgregarComentario.setText("Agregar Comentario");
        BotonSubastasRealizadasAgregarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubastasRealizadasAgregarComentarioActionPerformed(evt);
            }
        });

        BotonSubastasRealizadasVolver.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonSubastasRealizadasVolver.setText("Volver");
        BotonSubastasRealizadasVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubastasRealizadasVolverActionPerformed(evt);
            }
        });

        LabelSubastasRealizadasCalificacion.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelSubastasRealizadasCalificacion.setText("Calificacion:");

        SpinnerSubastasRealizadasCalificacion.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        SpinnerSubastasRealizadasCalificacion.setModel(new javax.swing.SpinnerNumberModel(5, 1, 5, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelSubastasRealizadas)
                        .addGap(152, 152, 152)
                        .addComponent(BotonSubastasRealizadasLogOut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonSubastasRealizadasVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(327, 327, 327)
                                    .addComponent(BotonSubastasRealizadasAgregarComentario))
                                .addComponent(LabelSubastasRealizadasComentario)
                                .addComponent(EntrySubastasRealizadasComentario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelSubastasRealizadasCalificacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerSubastasRealizadasCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSubastasRealizadas)
                    .addComponent(BotonSubastasRealizadasLogOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSubastasRealizadasComentario)
                    .addComponent(EntrySubastasRealizadasComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSubastasRealizadasCalificacion)
                    .addComponent(SpinnerSubastasRealizadasCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(BotonSubastasRealizadasAgregarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSubastasRealizadasVolver)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSubastasRealizadasLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubastasRealizadasLogOutActionPerformed
        PostgreSQLPantallaInicial frame = new PostgreSQLPantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonSubastasRealizadasLogOutActionPerformed

    private void BotonSubastasRealizadasAgregarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubastasRealizadasAgregarComentarioActionPerformed
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        String[] parts = ListSubastasRealizadas.getSelectedValue().split(",");
        
        String IDSUBASTAv = parts[0]; // Gets index of auction.
        String COMENTARIOCOMPRADORv = EntrySubastasRealizadasComentario.getText();
        String CALIFICACIONSUBASTAv = SpinnerSubastasRealizadasCalificacion.getValue().toString();
        
        // Creating connection.
        PostgreSQLConnection con_ = new PostgreSQLConnection();
        String columnName = "ft_agregar_comentario_comprador"; // Name of the returned column.
        
        // The SP owner must be wrote before the SP name.
        rowsList = con_.FunctionReturningInt("SELECT public.FT_AGREGAR_COMENTARIO_COMPRADOR(IDSUBASTAv:=" + IDSUBASTAv + 
                "::INTEGER,CALIFICACIONv:=" + CALIFICACIONSUBASTAv +
                "::SMALLINT,COMENTARIOCOMPRADORv:='" + COMENTARIOCOMPRADORv + "'::TEXT)", columnName);
        
        if (rowsList.get(0).equals("1")) {
            JOptionPane.showMessageDialog(this, "Comentario Agregado");
        } else if (rowsList.get(0).equals("0")) {
            JOptionPane.showMessageDialog(this, "Subasta no encontrada.");
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
        
        JOptionPane.showMessageDialog(this, "Comentario Agregado");
    }//GEN-LAST:event_BotonSubastasRealizadasAgregarComentarioActionPerformed

    private void BotonSubastasRealizadasVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubastasRealizadasVolverActionPerformed
        PostgreSQLPantallaParticipante frame = new PostgreSQLPantallaParticipante();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonSubastasRealizadasVolverActionPerformed

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
            java.util.logging.Logger.getLogger(PostgreSQLSubastasGanadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLSubastasGanadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLSubastasGanadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLSubastasGanadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgreSQLSubastasGanadoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSubastasRealizadasAgregarComentario;
    private javax.swing.JButton BotonSubastasRealizadasLogOut;
    private javax.swing.JButton BotonSubastasRealizadasVolver;
    private javax.swing.JTextField EntrySubastasRealizadasComentario;
    private javax.swing.JLabel LabelSubastasRealizadas;
    private javax.swing.JLabel LabelSubastasRealizadasCalificacion;
    private javax.swing.JLabel LabelSubastasRealizadasComentario;
    private javax.swing.JList<String> ListSubastasRealizadas;
    private javax.swing.JSpinner SpinnerSubastasRealizadasCalificacion;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
