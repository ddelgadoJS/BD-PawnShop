/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import Connections.OracleConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin MM
 */
public class OraclePujar extends javax.swing.JFrame {

    public static int idSubasta;
    
    public OraclePujar() {
        initComponents();
    }
    
    public OraclePujar(int idSubasta_, String precioActual) {
        initComponents();
        
        idSubasta = idSubasta_;
        LabelMontoACambiar.setText(precioActual);
        float monto = 0;
        
        if ((Integer.valueOf(precioActual)*Float.valueOf(OraclePantallaInicial.porcentajemejora)) > Integer.valueOf(OraclePantallaInicial.incrementominimo)) {
            monto = Integer.valueOf(precioActual)*Float.valueOf(OraclePantallaInicial.porcentajemejora);
        }
        else{
            monto = Integer.valueOf(OraclePantallaInicial.incrementominimo);
        }
        monto += Integer.valueOf(precioActual);
        LabelMontoMinimoPujar.setText(String.valueOf(monto));
        SpinnerPujarPuja.setValue(monto);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelPujar = new javax.swing.JLabel();
        BotonPujarLogOut = new javax.swing.JButton();
        LabelPujarMontoActual = new javax.swing.JLabel();
        LabelPujarPuja = new javax.swing.JLabel();
        LabelMontoACambiar = new javax.swing.JLabel();
        SpinnerPujarPuja = new javax.swing.JSpinner();
        BotonPujarPujar = new javax.swing.JButton();
        LabelPujarPujaMinima = new javax.swing.JLabel();
        LabelMontoMinimoPujar = new javax.swing.JLabel();
        BotonPujarCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oracle");

        LabelPujar.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelPujar.setText("Pujar");

        BotonPujarLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonPujarLogOut.setText("Log Out");
        BotonPujarLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPujarLogOutActionPerformed(evt);
            }
        });

        LabelPujarMontoActual.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelPujarMontoActual.setText("Monto Actual:");

        LabelPujarPuja.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelPujarPuja.setText("Puja:");

        LabelMontoACambiar.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        LabelMontoACambiar.setText("$");

        SpinnerPujarPuja.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        SpinnerPujarPuja.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BotonPujarPujar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonPujarPujar.setText("Pujar");
        BotonPujarPujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPujarPujarActionPerformed(evt);
            }
        });

        LabelPujarPujaMinima.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelPujarPujaMinima.setText("Puja Mínima:");

        LabelMontoMinimoPujar.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        LabelMontoMinimoPujar.setText("$");

        BotonPujarCancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonPujarCancelar.setText("Cancelar");
        BotonPujarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPujarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelPujar)
                        .addGap(261, 261, 261)
                        .addComponent(BotonPujarLogOut))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelPujarMontoActual)
                                    .addComponent(LabelPujarPuja)
                                    .addComponent(LabelPujarPujaMinima))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelMontoACambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerPujarPuja, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelMontoMinimoPujar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonPujarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonPujarPujar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 291, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonPujarLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LabelPujar)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPujarMontoActual)
                    .addComponent(LabelMontoACambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPujarPujaMinima)
                    .addComponent(LabelMontoMinimoPujar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerPujarPuja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPujarPuja))
                .addGap(88, 88, 88)
                .addComponent(BotonPujarPujar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonPujarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPujarLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPujarLogOutActionPerformed
        OraclePantallaInicial frame = new OraclePantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonPujarLogOutActionPerformed

    private void BotonPujarPujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPujarPujarActionPerformed
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        String ALIASCOMPRADORv = OraclePantallaInicial.aliasUsuario;
        String INCREMENTOMINIMOv = OraclePantallaInicial.incrementominimo;
        String PORCENTAJEMEJORAv = OraclePantallaInicial.porcentajemejora;
        String IDSUBASTAv = Integer.toString(idSubasta);
        String MONTOv = SpinnerPujarPuja.getValue().toString();
        
        OracleConnection con_ = new OracleConnection();
        Connection con = con_.CrearConexion();

        // Obtener índice subcategoría.
        
        String query = "PUJAR(INCREMENTOMINIMO=>" + INCREMENTOMINIMOv + ",PORCENTAJEMEJORA=>" + PORCENTAJEMEJORAv + 
            ",ALIASCOMPRADORv=>'" + ALIASCOMPRADORv + "',IDSUBASTAv=>" + IDSUBASTAv + ",MONTOv=>" + MONTOv + ")";
 
        rowsList = con_.EjecutarSP(query, con);
        
        // Close connection.
        try {
            con_.CerrarConexion(con);
        } catch (SQLException ex) {
            Logger.getLogger(OraclePantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Puja realizada con éxito");
        OraclePantallaParticipante frame = new OraclePantallaParticipante();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonPujarPujarActionPerformed

    private void BotonPujarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPujarCancelarActionPerformed
        OraclePantallaParticipante frame = new OraclePantallaParticipante();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonPujarCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(OraclePujar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OraclePujar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OraclePujar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OraclePujar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OraclePujar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPujarCancelar;
    private javax.swing.JButton BotonPujarLogOut;
    private javax.swing.JButton BotonPujarPujar;
    private javax.swing.JLabel LabelMontoACambiar;
    private javax.swing.JLabel LabelMontoMinimoPujar;
    private javax.swing.JLabel LabelPujar;
    private javax.swing.JLabel LabelPujarMontoActual;
    private javax.swing.JLabel LabelPujarPuja;
    private javax.swing.JLabel LabelPujarPujaMinima;
    private javax.swing.JSpinner SpinnerPujarPuja;
    // End of variables declaration//GEN-END:variables
}
