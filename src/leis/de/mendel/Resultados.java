/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leis.de.mendel;

/**
 *
 * @author david; marcos; matheus
 */
public class Resultados extends javax.swing.JFrame {

    /**
     * Creates new form Resultados
     */
    public Resultados() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mendel?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        resultadoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Resultado r");
        resultadoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultadoQuery.getResultList();
        resultadoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Resultado r");
        resultadoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultadoQuery1.getResultList();
        resultadoQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Resultado r");
        resultadoList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultadoQuery2.getResultList();
        resultadoQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Resultado r");
        resultadoList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultadoQuery3.getResultList();
        resultadoQuery4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Resultado r");
        resultadoList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultadoQuery4.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("Resultados feitos:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<leis.de.mendel.Resultado> resultadoList;
    private java.util.List<leis.de.mendel.Resultado> resultadoList1;
    private java.util.List<leis.de.mendel.Resultado> resultadoList2;
    private java.util.List<leis.de.mendel.Resultado> resultadoList3;
    private java.util.List<leis.de.mendel.Resultado> resultadoList4;
    private javax.persistence.Query resultadoQuery;
    private javax.persistence.Query resultadoQuery1;
    private javax.persistence.Query resultadoQuery2;
    private javax.persistence.Query resultadoQuery3;
    private javax.persistence.Query resultadoQuery4;
    // End of variables declaration//GEN-END:variables
}
