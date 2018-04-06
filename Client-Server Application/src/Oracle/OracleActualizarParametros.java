/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin MM
 */
public class OracleActualizarParametros extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarParametros
     */
    public OracleActualizarParametros() {
        initComponents();
        SpinnerParametrosIncremento.setValue(Integer.valueOf(OraclePantallaInicial.incrementominimo));
        SpinnerParametrosPorcentaje.setValue(Float.valueOf(OraclePantallaInicial.porcentajemejora));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonParametrosLogOut = new javax.swing.JButton();
        LabelParametrosPorcentaje = new javax.swing.JLabel();
        BotonParametrosAceptar = new javax.swing.JButton();
        SpinnerParametrosIncremento = new javax.swing.JSpinner();
        SpinnerParametrosPorcentaje = new javax.swing.JSpinner();
        BotonParametrosCancelar = new javax.swing.JButton();
        LabelParametrosIncremento = new javax.swing.JLabel();
        LabelModificarParametros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oracle");

        BotonParametrosLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonParametrosLogOut.setText("Log Out");
        BotonParametrosLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParametrosLogOutActionPerformed(evt);
            }
        });

        LabelParametrosPorcentaje.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelParametrosPorcentaje.setText("Porcentaje:");

        BotonParametrosAceptar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonParametrosAceptar.setText("Aceptar");
        BotonParametrosAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParametrosAceptarActionPerformed(evt);
            }
        });

        SpinnerParametrosIncremento.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N

        SpinnerParametrosPorcentaje.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        SpinnerParametrosPorcentaje.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.99f), Float.valueOf(0.01f), Float.valueOf(0.99f), Float.valueOf(0.01f)));

        BotonParametrosCancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonParametrosCancelar.setText("Cancelar");
        BotonParametrosCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParametrosCancelarActionPerformed(evt);
            }
        });

        LabelParametrosIncremento.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelParametrosIncremento.setText("Incremento:");

        LabelModificarParametros.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelModificarParametros.setText("Modificar Parametros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonParametrosAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonParametrosCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelParametrosIncremento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerParametrosIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelParametrosPorcentaje)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(SpinnerParametrosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelModificarParametros)
                        .addGap(93, 93, 93)))
                .addComponent(BotonParametrosLogOut)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonParametrosLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelModificarParametros))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelParametrosPorcentaje)
                    .addComponent(SpinnerParametrosPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelParametrosIncremento)
                    .addComponent(SpinnerParametrosIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(BotonParametrosCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonParametrosAceptar)
                .addGap(195, 195, 195))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonParametrosLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParametrosLogOutActionPerformed
        OraclePantallaInicial frame = new OraclePantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonParametrosLogOutActionPerformed

    private void BotonParametrosAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParametrosAceptarActionPerformed
        OraclePantallaInicial.incrementominimo = String.valueOf(SpinnerParametrosIncremento.getValue());
        OraclePantallaInicial.porcentajemejora = String.valueOf(SpinnerParametrosPorcentaje.getValue());
        JOptionPane.showMessageDialog(this, "Parametros Actualizados");
        OraclePantallaAdmin frame = new OraclePantallaAdmin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonParametrosAceptarActionPerformed

    private void BotonParametrosCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParametrosCancelarActionPerformed
        OraclePantallaAdmin frame = new OraclePantallaAdmin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonParametrosCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(OracleActualizarParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OracleActualizarParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OracleActualizarParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OracleActualizarParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OracleActualizarParametros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonParametrosAceptar;
    private javax.swing.JButton BotonParametrosCancelar;
    private javax.swing.JButton BotonParametrosLogOut;
    private javax.swing.JLabel LabelModificarParametros;
    private javax.swing.JLabel LabelParametrosIncremento;
    private javax.swing.JLabel LabelParametrosPorcentaje;
    private javax.swing.JSpinner SpinnerParametrosIncremento;
    private javax.swing.JSpinner SpinnerParametrosPorcentaje;
    // End of variables declaration//GEN-END:variables
}
