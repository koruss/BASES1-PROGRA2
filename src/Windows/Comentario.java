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
public class Comentario extends javax.swing.JPanel {

    /**
     * Creates new form Comentario
     */
    public Comentario() {
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

        txtHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHora.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtHora.setText("Nombre");
        add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 80, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 440, 50));

        txtNombre.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtNombre.setText("Nombre");
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
