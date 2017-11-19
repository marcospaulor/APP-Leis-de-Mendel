/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leis.de.mendel;

import java.sql.SQLException;
import leis.de.mendel.modelo.ModeloEmail;

/**
 *
 * @author david; marcos; matheus
 */
public class Menu extends javax.swing.JFrame {
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    public void exportarEmail(ModeloEmail model) {

        jTEmailMenu.setText(model.getEmail());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBTeorias = new javax.swing.JButton();
        jBResultados = new javax.swing.JButton();
        jBCalculo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTEmailMenu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBTeorias.setText("<html>\nTeorias <br>\nsobre as <br>\nLeis de Mendel");
        jBTeorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTeoriasActionPerformed(evt);
            }
        });

        jBResultados.setText("<html>\nResultados <br>\nfeitos\n<html>");
        jBResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResultadosActionPerformed(evt);
            }
        });

        jBCalculo.setText("Cálculo");
        jBCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalculoActionPerformed(evt);
            }
        });

        jLabel1.setText("Email Conectado:");

        jTEmailMenu.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBTeorias, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jBResultados))
                .addGap(39, 39, 39)
                .addComponent(jBCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTEmailMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTEmailMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBTeorias, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTeoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTeoriasActionPerformed
        // TODO add your handling code here:
        try {
            Leis leis = new Leis();
            leis.setLocation(400, 100);
            leis.setVisible(true);
        } catch (Exception e) {}
    }//GEN-LAST:event_jBTeoriasActionPerformed

    private void jBCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalculoActionPerformed
        // TODO add your handling code here:
        ModeloEmail model2 = new ModeloEmail();
        model2.setEmail(jTEmailMenu.getText());
        Calcular frm2 ;
        try {
            frm2 = new Calcular();
            frm2.exportarEmail(model2);
            frm2.setVisible(true);
        } catch (SQLException ex) {
            
        }
        
    }//GEN-LAST:event_jBCalculoActionPerformed

    private void jBResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResultadosActionPerformed
        // TODO add your handling code here:
        try {
            Resultados resultados = new Resultados();
            resultados.setLocation(400, 100);
            resultados.setVisible(true);
        } catch (Exception e) {}
    }//GEN-LAST:event_jBResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalculo;
    private javax.swing.JButton jBResultados;
    private javax.swing.JButton jBTeorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTEmailMenu;
    // End of variables declaration//GEN-END:variables
}
