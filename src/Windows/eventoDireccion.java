/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

/**
 *
 * @author kcorr
 */
public class eventoDireccion extends javax.swing.JFrame {

    /**
     * Creates new form eventoDirección
     */
    public eventoDireccion() {
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

        jPanel1 = new javax.swing.JPanel();
        txtComunidad = new javax.swing.JLabel();
        txtPais = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JLabel();
        txtCanton = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtComunidad.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtComunidad.setForeground(new java.awt.Color(255, 255, 255));
        txtComunidad.setText("Comunidad");
        jPanel1.add(txtComunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        txtPais.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(255, 255, 255));
        txtPais.setText("Pais");
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        txtProvincia.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtProvincia.setForeground(new java.awt.Color(255, 255, 255));
        txtProvincia.setText("Provincia");
        jPanel1.add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        txtCanton.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtCanton.setForeground(new java.awt.Color(255, 255, 255));
        txtCanton.setText("Cantón");
        jPanel1.add(txtCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 20));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dirección");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setBackground(new java.awt.Color(40, 40, 40));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 450, 70));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pais");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Provincia");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 166, -1, 10));

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantón");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 20));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comunidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jButton1.setText("Aceptar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 450));

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
            java.util.logging.Logger.getLogger(eventoDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eventoDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eventoDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eventoDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eventoDireccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel txtCanton;
    private javax.swing.JLabel txtComunidad;
    private javax.swing.JLabel txtPais;
    private javax.swing.JLabel txtProvincia;
    // End of variables declaration//GEN-END:variables
}
