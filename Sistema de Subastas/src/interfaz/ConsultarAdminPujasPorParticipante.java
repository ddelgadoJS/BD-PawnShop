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
public class ConsultarAdminPujasPorParticipante extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarAdminPujasPorParticipante
     */
    public ConsultarAdminPujasPorParticipante() {
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

        BotonListarPGPUVolverAdmin = new javax.swing.JButton();
        LabelPujasGanadorasAdmin = new javax.swing.JLabel();
        BotonListarPGPULogOutAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListListarPGPUAdmin = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonListarPGPUVolverAdmin.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonListarPGPUVolverAdmin.setText("Volver");
        BotonListarPGPUVolverAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarPGPUVolverAdminActionPerformed(evt);
            }
        });

        LabelPujasGanadorasAdmin.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        LabelPujasGanadorasAdmin.setText("Pujas Ganadoras");

        BotonListarPGPULogOutAdmin.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonListarPGPULogOutAdmin.setText("Log Out");
        BotonListarPGPULogOutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarPGPULogOutAdminActionPerformed(evt);
            }
        });

        ListListarPGPUAdmin.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        ListListarPGPUAdmin.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListListarPGPUAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonListarPGPUVolverAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelPujasGanadorasAdmin)
                        .addGap(145, 145, 145)
                        .addComponent(BotonListarPGPULogOutAdmin)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonListarPGPULogOutAdmin)
                    .addComponent(LabelPujasGanadorasAdmin))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotonListarPGPUVolverAdmin)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonListarPGPUVolverAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarPGPUVolverAdminActionPerformed
        ConsultarUsuario frame = new ConsultarUsuario();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListarPGPUVolverAdminActionPerformed

    private void BotonListarPGPULogOutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarPGPULogOutAdminActionPerformed
        PantallaInicial frame = new PantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListarPGPULogOutAdminActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarAdminPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarAdminPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarAdminPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarAdminPujasPorParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarAdminPujasPorParticipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonListarPGPULogOutAdmin;
    private javax.swing.JButton BotonListarPGPUVolverAdmin;
    private javax.swing.JLabel LabelPujasGanadorasAdmin;
    private javax.swing.JList<String> ListListarPGPUAdmin;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
