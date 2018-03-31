/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Kevin MM
 */
public class ConsultarSubastas extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarSubastas
     */
    public ConsultarSubastas() {
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

        LabelConsultarS = new javax.swing.JLabel();
        BotonConsultarSLogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListConsultaS = new javax.swing.JList<>();
        BotonConsultarSHistorial = new javax.swing.JButton();
        BotonConsultarSVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelConsultarS.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelConsultarS.setText("Consultar Subastas");

        BotonConsultarSLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonConsultarSLogOut.setText("Log Out");
        BotonConsultarSLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarSLogOutActionPerformed(evt);
            }
        });

        ListConsultaS.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        ListConsultaS.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListConsultaS);

        BotonConsultarSHistorial.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonConsultarSHistorial.setText("Listar Subastas");
        BotonConsultarSHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarSHistorialActionPerformed(evt);
            }
        });

        BotonConsultarSVolver.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonConsultarSVolver.setText("Volver");
        BotonConsultarSVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarSVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelConsultarS)
                        .addGap(135, 135, 135)
                        .addComponent(BotonConsultarSLogOut)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BotonConsultarSHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonConsultarSVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(293, 293, 293))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonConsultarSLogOut)
                    .addComponent(LabelConsultarS))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BotonConsultarSHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonConsultarSVolver)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsultarSHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarSHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConsultarSHistorialActionPerformed

    private void BotonConsultarSVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarSVolverActionPerformed
        PantallaAdmin frame = new PantallaAdmin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonConsultarSVolverActionPerformed

    private void BotonConsultarSLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarSLogOutActionPerformed
        PantallaInicial frame = new PantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonConsultarSLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarSubastas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarSHistorial;
    private javax.swing.JButton BotonConsultarSLogOut;
    private javax.swing.JButton BotonConsultarSVolver;
    private javax.swing.JLabel LabelConsultarS;
    private javax.swing.JList<String> ListConsultaS;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
