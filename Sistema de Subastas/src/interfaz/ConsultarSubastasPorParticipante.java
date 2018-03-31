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
public class ConsultarSubastasPorParticipante extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarSubastasPorParticipante
     */
    public ConsultarSubastasPorParticipante() {
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

        BotonListarSubastasPPVolver = new javax.swing.JButton();
        LabelSubastasPP = new javax.swing.JLabel();
        BotonListarSubastasPPLogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListListarSubastasPP = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonListarSubastasPPVolver.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonListarSubastasPPVolver.setText("Volver");
        BotonListarSubastasPPVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarSubastasPPVolverActionPerformed(evt);
            }
        });

        LabelSubastasPP.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelSubastasPP.setText("Subastas");

        BotonListarSubastasPPLogOut.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonListarSubastasPPLogOut.setText("Log Out");
        BotonListarSubastasPPLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarSubastasPPLogOutActionPerformed(evt);
            }
        });

        ListListarSubastasPP.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        ListListarSubastasPP.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListListarSubastasPP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                        .addComponent(BotonListarSubastasPPVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelSubastasPP)
                .addGap(212, 212, 212)
                .addComponent(BotonListarSubastasPPLogOut)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonListarSubastasPPLogOut)
                    .addComponent(LabelSubastasPP))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotonListarSubastasPPVolver)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarSubastasPPVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarSubastasPPVolverActionPerformed
        ConsultarUsuarioParticipante frame = new ConsultarUsuarioParticipante();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListarSubastasPPVolverActionPerformed

    private void BotonListarSubastasPPLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarSubastasPPLogOutActionPerformed
        PantallaInicial frame = new PantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListarSubastasPPLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarSubastasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarSubastasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarSubastasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarSubastasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarSubastasPorParticipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonListarSubastasPPLogOut;
    private javax.swing.JButton BotonListarSubastasPPVolver;
    private javax.swing.JLabel LabelSubastasPP;
    private javax.swing.JList<String> ListListarSubastasPP;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
