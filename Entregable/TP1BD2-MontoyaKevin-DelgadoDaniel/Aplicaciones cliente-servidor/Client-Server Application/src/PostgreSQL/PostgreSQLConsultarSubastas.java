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
public class PostgreSQLConsultarSubastas extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarSubastas
     */
    public PostgreSQLConsultarSubastas() {
        initComponents();
        
        // Agrega al combobox todas las categorías
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        OracleConnection con_ = new OracleConnection();
        Connection con = con_.CrearConexion();
        rowsList = con_.EjecutarSP("SP_SELECT_CATEGORIAS", con);
        
        ComboBoxSubastasCategoria.removeAllItems();
        
        for (String user: rowsList) {
            ComboBoxSubastasCategoria.addItem(user);
        }
        
        rowsList = con_.EjecutarSP("SP_SELECT_SUBCATEGORIAS (IDCATEGORIAv=>" + 1 + ")", con);
        
        ComboBoxSubastasSubcategoria.removeAllItems();
        
        for (String user: rowsList) {
            ComboBoxSubastasSubcategoria.addItem(user);
        }
        
        // Close connection.
        try {
            con_.CerrarConexion(con);
        } catch (SQLException ex) {
            Logger.getLogger(OraclePantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
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

        LabelConsultarS = new javax.swing.JLabel();
        BotonConsultarSLogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListConsultaS = new javax.swing.JList<>();
        BotonConsultarSHistorial = new javax.swing.JButton();
        BotonConsultarSVolver = new javax.swing.JButton();
        LabelSubastarCategoria = new javax.swing.JLabel();
        ComboBoxSubastasCategoria = new javax.swing.JComboBox<>();
        ComboBoxSubastasSubcategoria = new javax.swing.JComboBox<>();
        LabelSubastarSubcategoria = new javax.swing.JLabel();
        BotonConsultarVerPuja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PostgreSQL");

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

        LabelSubastarCategoria.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelSubastarCategoria.setText("Categoría:");

        ComboBoxSubastasCategoria.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        ComboBoxSubastasCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));
        ComboBoxSubastasCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSubastasCategoriaActionPerformed(evt);
            }
        });

        ComboBoxSubastasSubcategoria.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        ComboBoxSubastasSubcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subcategoria" }));

        LabelSubastarSubcategoria.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        LabelSubastarSubcategoria.setText("Subcategoría:");

        BotonConsultarVerPuja.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonConsultarVerPuja.setText("Ver Pujas");
        BotonConsultarVerPuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarVerPujaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LabelSubastarSubcategoria)
                                .addGap(34, 34, 34)
                                .addComponent(ComboBoxSubastasSubcategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelSubastarCategoria)
                                .addGap(64, 64, 64)
                                .addComponent(ComboBoxSubastasCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(BotonConsultarSHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonConsultarVerPuja, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BotonConsultarSVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(LabelConsultarS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonConsultarSLogOut)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelConsultarS)
                    .addComponent(BotonConsultarSLogOut))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSubastarCategoria)
                    .addComponent(ComboBoxSubastasCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxSubastasSubcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSubastarSubcategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonConsultarSVolver)
                    .addComponent(BotonConsultarSHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultarVerPuja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsultarSHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarSHistorialActionPerformed
        DefaultListModel model = new DefaultListModel();
        //model.addElement("hola");
        
        // Agrega al combobox todos los alias de los usuarios.
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        String IDCATEGORIAv = Integer.toString(ComboBoxSubastasCategoria.getSelectedIndex() + 1);
        String DESCRIPCIONSUBCATEGORIAv = ComboBoxSubastasSubcategoria.getSelectedItem().toString();
        
        PostgreSQLConnection con_ = new PostgreSQLConnection();
        String columnName = "ft_get_ind_subcategoria"; // Name of the returned column.

        // Obtener índice subcategoría.
        String query = "SELECT public.FT_GET_IND_SUBCATEGORIA(IDCATEGORIAv:=" + IDCATEGORIAv + "::INTEGER,DESCRIPCIONSUBCATEGORIAv=>'" + DESCRIPCIONSUBCATEGORIAv + "'::TEXT)";
        rowsList = con_.FunctionReturningInt(query, columnName);
        String IDSUBCATEGORIAv = rowsList.get(0);
        
        columnName = "ft_listar_subastas";
        query = "SELECT public.FT_LISTAR_SUBASTAS(SUBCATEGORIAv=>" + IDSUBCATEGORIAv + "::INTEGER)";
 
        rowsList = con_.FunctionReturningString(query, columnName);
        
        for (String subasta: rowsList) {
            model.addElement(subasta);
        }
        
        ListConsultaS.setModel(model);
    }//GEN-LAST:event_BotonConsultarSHistorialActionPerformed

    private void BotonConsultarSVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarSVolverActionPerformed
        OraclePantallaAdmin frame = new OraclePantallaAdmin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonConsultarSVolverActionPerformed

    private void BotonConsultarSLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarSLogOutActionPerformed
        OraclePantallaInicial frame = new OraclePantallaInicial();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonConsultarSLogOutActionPerformed

    private void ComboBoxSubastasCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSubastasCategoriaActionPerformed
        // Agrega al combobox todas las categorías
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.

        String indCategoria = Integer.toString(ComboBoxSubastasCategoria.getSelectedIndex() + 1);

        OracleConnection con_ = new OracleConnection();
        Connection con = con_.CrearConexion();
        rowsList = con_.EjecutarSP("SP_SELECT_SUBCATEGORIAS (IDCATEGORIAv=>" + indCategoria + ")", con);

        ComboBoxSubastasSubcategoria.removeAllItems();

        for (String user: rowsList) {
            ComboBoxSubastasSubcategoria.addItem(user);
        }

        // Close connection.
        try {
            con_.CerrarConexion(con);
        } catch (SQLException ex) {
            Logger.getLogger(OraclePantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboBoxSubastasCategoriaActionPerformed

    private void BotonConsultarVerPujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarVerPujaActionPerformed
        DefaultListModel model = new DefaultListModel();
        
        ListConsultaS.getSelectedValue();
        
        String[] parts = ListConsultaS.getSelectedValue().split(",");
        
        String IDSUBASTA = parts[0];
        
        ArrayList<String> rowsList = new ArrayList<>(); // List to store the rows from the query.
        
        PostgreSQLConnection con_ = new PostgreSQLConnection();
        String columnName = "historialpujas"; // Name of the returned column.
        
        rowsList = con_.FunctionReturningString("SELECT public.HISTORIALPUJAS(IDSUBASTAv:=" + IDSUBASTA + "::INTEGER)", columnName);
        
        for (String subasta: rowsList) {
            model.addElement(subasta);
        }
        
        ListConsultaS.removeAll();
        ListConsultaS.setModel(model);
    }//GEN-LAST:event_BotonConsultarVerPujaActionPerformed

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
            java.util.logging.Logger.getLogger(PostgreSQLConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgreSQLConsultarSubastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgreSQLConsultarSubastas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarSHistorial;
    private javax.swing.JButton BotonConsultarSLogOut;
    private javax.swing.JButton BotonConsultarSVolver;
    private javax.swing.JButton BotonConsultarVerPuja;
    private javax.swing.JComboBox<String> ComboBoxSubastasCategoria;
    private javax.swing.JComboBox<String> ComboBoxSubastasSubcategoria;
    private javax.swing.JLabel LabelConsultarS;
    private javax.swing.JLabel LabelSubastarCategoria;
    private javax.swing.JLabel LabelSubastarSubcategoria;
    private javax.swing.JList<String> ListConsultaS;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
