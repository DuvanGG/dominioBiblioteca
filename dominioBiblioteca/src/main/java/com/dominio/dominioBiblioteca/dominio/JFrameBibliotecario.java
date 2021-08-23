/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dominioBiblioteca.dominio;

/**
 *
 * @author gcast
 */
public class JFrameBibliotecario extends javax.swing.JFrame {

    /**
     * Creates new form JFrameBibliotecario
     */
    public JFrameBibliotecario() {
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

        jLabelBuscarL = new javax.swing.JLabel();
        jLabelNuevoL = new javax.swing.JLabel();
        jLabelBuscarPersona = new javax.swing.JLabel();
        jComboBoxTipoBusqueda = new javax.swing.JComboBox<>();
        jTextFieldCC = new javax.swing.JTextField();
        jButtonAgregarNuevoL = new javax.swing.JButton();
        jButtonBuscarL = new javax.swing.JButton();
        jButtonBuscarU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBuscarL.setText("Buscar un libro:");

        jLabelNuevoL.setText("Añadir un nuevo libro:");

        jLabelBuscarPersona.setText("Buscar usuarios:");

        jComboBoxTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un criterio de búsqueda", "Título", "Autor", "Tema", "Fecha", "Editorial", "ISBN" }));
        jComboBoxTipoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoBusquedaActionPerformed(evt);
            }
        });

        jTextFieldCC.setText("Ingrese la cédula");
        jTextFieldCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCCActionPerformed(evt);
            }
        });

        jButtonAgregarNuevoL.setText("Proceder");
        jButtonAgregarNuevoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarNuevoLActionPerformed(evt);
            }
        });

        jButtonBuscarL.setText("Buscar");

        jButtonBuscarU.setText("Buscar");
        jButtonBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBuscarPersona)
                    .addComponent(jLabelNuevoL)
                    .addComponent(jLabelBuscarL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCC, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscarU))
                            .addComponent(jButtonAgregarNuevoL))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jButtonBuscarL))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBuscarL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscarL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNuevoL)
                    .addComponent(jButtonAgregarNuevoL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscarPersona)
                    .addComponent(jTextFieldCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarU))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoBusquedaActionPerformed

    private void jTextFieldCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCCActionPerformed

    private void jButtonAgregarNuevoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarNuevoLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarNuevoLActionPerformed

    private void jButtonBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarUActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBibliotecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarNuevoL;
    private javax.swing.JButton jButtonBuscarL;
    private javax.swing.JButton jButtonBuscarU;
    private javax.swing.JComboBox<String> jComboBoxTipoBusqueda;
    private javax.swing.JLabel jLabelBuscarL;
    private javax.swing.JLabel jLabelBuscarPersona;
    private javax.swing.JLabel jLabelNuevoL;
    private javax.swing.JTextField jTextFieldCC;
    // End of variables declaration//GEN-END:variables
}